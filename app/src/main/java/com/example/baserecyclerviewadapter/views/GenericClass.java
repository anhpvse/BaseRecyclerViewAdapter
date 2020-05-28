package com.example.baserecyclerviewadapter.views;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericClass<T> {
    public List<T> list = new ArrayList<>();

    public GenericClass() {

    }

    public void pop(T t) {
        list.addAll((Collection<? extends T>) t);
    }

    public List<T> getList() {
        return list;
    }
}