package com.sumsub.sns.core.presentation.base.adapter;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class b<T> extends RecyclerView.C {
    public b(View view) {
        super(view);
    }

    public final Context a() {
        return this.itemView.getContext();
    }

    public abstract void a(T t3, int i);
}
