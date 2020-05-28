package com.example.baserecyclerviewadapter.baserecyclerview;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public abstract class BaseViewHolder extends RecyclerView.ViewHolder {

    public ItemViewClickListener mItemViewClickListener;
    public List<?> mData;

    public BaseViewHolder(@NonNull View itemView, ItemViewClickListener itemViewClickListener) {
        super(itemView);
        mItemViewClickListener = itemViewClickListener;
    }

    public abstract void initViewHolder(View v);

    public abstract void onBinViewHolder(List<?> obj, int pos, Context context);

    public abstract void onItemViewClick(View v, int pos);

}
