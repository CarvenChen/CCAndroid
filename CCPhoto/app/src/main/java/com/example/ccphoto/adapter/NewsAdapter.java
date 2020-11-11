package com.example.ccphoto.adapter;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ccphoto.entity.NewsEntity;
import com.example.ccphoto.listener.OnItemClickListener;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter {

    private Context mContext;
    private List<NewsEntity> datas;
    private OnItemClickListener mOnItemClickListener;

    public void setOnItemClickListener(OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }

    public void setDatas(List<NewsEntity> datas) {
        this.datas = datas;
    }

    public NewsAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public NewsAdapter(Context mContext, List<NewsEntity> datas) {
        this.mContext = mContext;
        this.datas = datas;

    }

//    @Override
//    public int getItemViewType(int position) {
//        return super.getItemViewType(position);
//    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
