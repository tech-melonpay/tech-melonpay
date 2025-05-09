package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;

/* compiled from: JsonObject.java */
/* loaded from: classes.dex */
public final class n extends l {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedTreeMap<String, l> f10408a = new LinkedTreeMap<>(false);

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof n) && ((n) obj).f10408a.equals(this.f10408a));
    }

    public final int hashCode() {
        return this.f10408a.hashCode();
    }
}
