package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: JsonArray.java */
/* loaded from: classes.dex */
public final class j extends l implements Iterable<l> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<l> f10406a = new ArrayList<>();

    @Override // com.google.gson.l
    public final String a() {
        ArrayList<l> arrayList = this.f10406a;
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0).a();
        }
        throw new IllegalStateException(com.google.android.gms.measurement.internal.a.g(size, "Array must have size 1, but has size "));
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof j) && ((j) obj).f10406a.equals(this.f10406a));
    }

    public final int hashCode() {
        return this.f10406a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<l> iterator() {
        return this.f10406a.iterator();
    }
}
