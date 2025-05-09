package com.sumsub.sns.presentation.screen.preview.photo;

import O9.p;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ca.InterfaceC0650p;
import com.sumsub.sns.R$layout;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class c extends RecyclerView.Adapter<d> {

    /* renamed from: a, reason: collision with root package name */
    public List<b> f20027a = EmptyList.f23104a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0650p<? super Integer, ? super b, p> f20028b;

    public final List<b> a() {
        return this.f20027a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f20027a.size();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void a(List<b> list) {
        this.f20027a = list;
        notifyDataSetChanged();
    }

    public final void a(InterfaceC0650p<? super Integer, ? super b, p> interfaceC0650p) {
        this.f20028b = interfaceC0650p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public d onCreateViewHolder(ViewGroup viewGroup, int i) {
        d dVar = new d(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.sns_carousel_photo_item, viewGroup, false));
        dVar.a(this.f20028b);
        return dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(d dVar, int i) {
        dVar.a(i, this.f20027a.get(i));
    }
}
