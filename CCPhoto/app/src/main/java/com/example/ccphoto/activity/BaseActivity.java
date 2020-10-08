package com.example.ccphoto.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public abstract class BaseActivity extends AppCompatActivity {

    public Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mContext = this;
        setContentView(initLayout());
        initView();
        initData();
    }

    protected abstract int initLayout();
    protected abstract void initView();
    protected abstract void initData();


    public void showToast(String msg) {
        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
    }

    public void showToastSync(String msg) {
        Looper.prepare();
        Toast.makeText(this.mContext, msg, Toast.LENGTH_SHORT).show();
        Looper.loop();
    }

    public void navigateTo(Class cls) {
        Intent in = new Intent(this.mContext, cls);
        startActivity(in);
    }

    public void navigatorToWithFlag(Class cls, int flag) {
        Intent in = new Intent(this.mContext, cls);
        in.setFlags(flag);
        startActivity(in);
    }

    protected void saveStringToSP(String key, String val) {
        SharedPreferences sp = getSharedPreferences("sp_cc", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(key, val);
        editor.commit();
    }

    protected String getStringFromSP(String key) {
        SharedPreferences sp = getSharedPreferences("sp_cc", MODE_PRIVATE);
        return sp.getString(key, "");
    }
}