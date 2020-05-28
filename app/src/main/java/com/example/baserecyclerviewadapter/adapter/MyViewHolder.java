package com.example.baserecyclerviewadapter.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.baserecyclerviewadapter.R;
import com.example.baserecyclerviewadapter.baserecyclerview.BaseViewHolder;
import com.example.baserecyclerviewadapter.baserecyclerview.ItemViewClickListener;
import com.example.baserecyclerviewadapter.models.Items;

import java.util.List;

public class MyViewHolder extends BaseViewHolder {
    private TextView mTvItem;

    public MyViewHolder(@NonNull View itemView, ItemViewClickListener itemViewClickListener) {
        super(itemView, itemViewClickListener);
    }


    @Override
    public void initViewHolder(View v) {
        mTvItem = v.findViewById(R.id.tvItems);
    }

    @Override
    public void onBinViewHolder(List<?> obj, int pos, Context context) {
        String subName = "";
        if (mData.get(pos) instanceof Items) {
            subName = ((List<Items>) mData).get(pos).getText();
        }
        mTvItem.setText(subName);
    }

    @Override
    public void onItemViewClick(View v, int pos) {
        if (mItemViewClickListener != null)
            mItemViewClickListener.onItemViewClickListener(pos, mData);
    }

}
