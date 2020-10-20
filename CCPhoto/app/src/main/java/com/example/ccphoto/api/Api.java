package com.example.ccphoto.api;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;

import com.example.ccphoto.activity.LoginActivity;
import com.example.ccphoto.util.StringUtils;

import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Api {
    private static OkHttpClient client;
    private static String requestUrl;
    private static HashMap<String, Object> mparams;
    public static Api api = new Api();

    public static Api config(String url, HashMap<String, Object> params) {
        client = new OkHttpClient.Builder().build();
        requestUrl = ApiConfig.BASE_Url + url;
        mparams = params;
        return api;
    }

    public void postRequest(Context context, final CCCallBack callBack) {
        SharedPreferences sp = context.getSharedPreferences("sp_cc", Context.MODE_PRIVATE);
        String token = sp.getString("token", "");
        JSONObject jsonObject = new JSONObject(mparams);
        String jsonStr = jsonObject.toString();
        RequestBody requestBodyJson = RequestBody.create(MediaType.parse("application/json;charset=utf-8"), jsonStr);

        Request request = new Request.Builder()
                .url(requestUrl)
                .addHeader("contentType", "application/json;charset=utf-8")
                .addHeader("token", token)
                .post(requestBodyJson)
                .build();

        final Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                Log.e("onFailed", e.getMessage());
                callBack.onFailure(e);
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                final String result = response.body().string();
                callBack.onSuccess(result);
            }
        });
    }



    public void getRequest(Context context, final CCCallBack callBack) {
        SharedPreferences sp = context.getSharedPreferences("sp_cc", Context.MODE_PRIVATE);
        String token = sp.getString("token", "");
        String url = appendGetUrl(requestUrl, mparams);

        Request request = new Request.Builder()
                .url(url)
                .addHeader("token", token)
                .get()
                .build();
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                Log.e("onFailed", e.getMessage());
                callBack.onFailure(e);
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                final String result = response.body().string();
                try {
                    JSONObject jsonObject = new JSONObject(result);
                    String code = jsonObject.getString("code");
                    if (code.equals("401")) {
                        Intent in = new Intent(context, LoginActivity.class);
                        context.startActivity(in);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                callBack.onSuccess(result);
            }
        });
    }

    private String appendGetUrl(String url, Map<String, Object> map) {
        if (map != null && !map.isEmpty()) {
            StringBuffer buffer = new StringBuffer();
            Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = iterator.next();
                if (StringUtils.isEmpty(buffer.toString())) {
                    buffer.append("?");
                } else {
                    buffer.append("&");
                }
                buffer.append(entry.getKey()).append("=").append(entry.getValue());
            }
            url += buffer.toString();
        }
        return url;
    }
}
