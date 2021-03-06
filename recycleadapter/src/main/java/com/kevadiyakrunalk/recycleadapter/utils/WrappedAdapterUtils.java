package com.kevadiyakrunalk.recycleadapter.utils;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import com.kevadiyakrunalk.recycleadapter.adapter.WrappedAdapter;
import com.kevadiyakrunalk.recycleadapter.adapter.WrapperAdapter;

public class WrappedAdapterUtils {
    private WrappedAdapterUtils() {
    }

    @SuppressWarnings("unchecked")
    public static void invokeOnViewRecycled(@NonNull RecyclerView.Adapter adapter, @NonNull RecyclerView.ViewHolder holder, int viewType) {
        if (adapter instanceof WrapperAdapter) {
            ((WrapperAdapter) adapter).onViewRecycled(holder, viewType);
        } else {
            adapter.onViewRecycled(holder);
        }
    }

    @SuppressWarnings("unchecked")
    public static boolean invokeOnFailedToRecycleView(@NonNull RecyclerView.Adapter adapter, @NonNull RecyclerView.ViewHolder holder, int viewType) {
        if (adapter instanceof WrappedAdapter) {
            return ((WrappedAdapter) adapter).onFailedToRecycleView(holder, viewType);
        } else {
            return adapter.onFailedToRecycleView(holder);
        }
    }

    @SuppressWarnings("unchecked")
    public static void invokeOnViewAttachedToWindow(@NonNull RecyclerView.Adapter adapter, @NonNull RecyclerView.ViewHolder holder, int viewType) {
        if (adapter instanceof WrappedAdapter) {
            ((WrappedAdapter) adapter).onViewAttachedToWindow(holder, viewType);
        } else {
            adapter.onViewAttachedToWindow(holder);
        }
    }

    @SuppressWarnings("unchecked")
    public static void invokeOnViewDetachedFromWindow(RecyclerView.Adapter adapter, RecyclerView.ViewHolder holder, int viewType) {
        if (adapter instanceof WrappedAdapter) {
            ((WrappedAdapter) adapter).onViewDetachedFromWindow(holder, viewType);
        } else {
            adapter.onViewDetachedFromWindow(holder);
        }
    }
}
