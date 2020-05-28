package com.example.baserecyclerviewadapter.baserecyclerview;

import android.content.Context;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BaseItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private RecyclerView.ViewHolder mViewHolder;

    public BaseItemViewHolder(View itemView, RecyclerView.ViewHolder viewHolder) {
        super(itemView);
        if (viewHolder instanceof BaseViewHolder) {
            itemView.setOnClickListener(this);
        }
    }

    public void onBindViewHolder(Context context, RecyclerView.ViewHolder viewHolder, List<?> obj, int pos) {
        if (viewHolder instanceof BaseViewHolder) {
            mViewHolder = viewHolder;
            ((BaseViewHolder) viewHolder).mData = obj;
            ((BaseViewHolder) viewHolder).initViewHolder(itemView);
            ((BaseViewHolder) viewHolder).onBinViewHolder(obj, pos, context);
        }
    }

    @Override
    public void onClick(View v) {
        if (mViewHolder instanceof BaseViewHolder) {
            ((BaseViewHolder) mViewHolder).onItemViewClick(v, getAdapterPosition());
        }
    }
}