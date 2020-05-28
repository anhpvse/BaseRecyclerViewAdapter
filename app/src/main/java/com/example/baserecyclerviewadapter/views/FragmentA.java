package com.example.baserecyclerviewadapter.views;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.baserecyclerviewadapter.R;
import com.example.baserecyclerviewadapter.adapter.MyViewHolder;
import com.example.baserecyclerviewadapter.baserecyclerview.CustomRecyclerViewAdapter;
import com.example.baserecyclerviewadapter.baserecyclerview.ItemViewClickListener;
import com.example.baserecyclerviewadapter.models.Items;

import java.util.ArrayList;
import java.util.List;

public class FragmentA extends Fragment implements ItemViewClickListener {

    private RecyclerView mRvCategory;
    private GenericClass mGenericClass;

    @Override

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_a, container, false);

        initView(view);

        return view;
    }

    private void initView(View v) {
        mGenericClass = new GenericClass();
        //init first time

        //Create you are view holder just extend BaseViewHolder
        //param view maybe null on first time init
        MyViewHolder viewHolder = new MyViewHolder(requireActivity().getWindow().getDecorView().getRootView(), this);
        CustomRecyclerViewAdapter mCustomAdapter = new CustomRecyclerViewAdapter(getContext(),
                mGenericClass.getList(), R.layout.recyclerview_list_items, viewHolder);

        mRvCategory = v.findViewById(R.id.rvCategory);
        mRvCategory.setLayoutManager(new LinearLayoutManager(getContext()));

        mRvCategory.setAdapter(mCustomAdapter);

        initDataToRv();
    }

    private void initDataToRv() {
        popData(items());
    }

    private <T> void popData(T t) {
        mGenericClass.getList().clear();
        mGenericClass.pop(t);

    }

    private List<Items> items() {
        List<Items> items = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            items.add(new Items("This is row " + i));
        }
        return items;
    }

    @Override
    public void onItemViewClickListener(int position, List<?> list) {
        System.out.println("onclick " + position);
    }
}