package com.mymoney.haiyangtan.coordinatorlayoutexample;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.List;

/**
 * Created by haiyang.tan on 2017/7/19.
 */

public class MyAdapter<MyViewHolder> extends RecyclerView.Adapter{

    private List<Class> mDatas;
    private Context mContext;

    public MyAdapter(List<Class> data, Context context) {
        mDatas = data;
        mContext = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_recycyler, parent, false);
        return new MyAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        ((MyAdapter.MyViewHolder)holder).mButton.setText(String.valueOf(position));
        ((MyAdapter.MyViewHolder)holder).mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, mDatas.get(position));
                mContext.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        public Button mButton;

        public MyViewHolder(View itemView) {
            super(itemView);
            mButton = (Button) itemView.findViewById(R.id.layout_btn);
        }
    }
}
