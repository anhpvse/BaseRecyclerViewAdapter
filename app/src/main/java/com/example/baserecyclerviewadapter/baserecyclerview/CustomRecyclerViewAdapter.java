package com.example.baserecyclerviewadapter.baserecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<?> itemObjects;
    private Context mContext;
    private int mLayout;
    private RecyclerView.ViewHolder mViewHolder;

    public CustomRecyclerViewAdapter(Context context, List<?> itemObjects, int layout, RecyclerView.ViewHolder viewHolder) {
        this.mContext = context;
        this.itemObjects = itemObjects;
        this.mLayout = layout;
        this.mViewHolder = viewHolder;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(mLayout, parent, false);
        return new BaseItemViewHolder(view, mViewHolder);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((BaseItemViewHolder) holder).onBindViewHolder(mContext, mViewHolder, itemObjects, position);
    }

    @Override
    public int getItemCount() {
        return itemObjects.size();
    }
}
