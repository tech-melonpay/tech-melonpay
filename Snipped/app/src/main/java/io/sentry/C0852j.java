package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Hint.java */
/* renamed from: io.sentry.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0852j {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f22047a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f22048b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public C0843a f22049c = null;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", Boolean.class);
        hashMap.put("char", Character.class);
        hashMap.put("byte", Byte.class);
        hashMap.put("short", Short.class);
        hashMap.put("int", Integer.class);
        hashMap.put("long", Long.class);
        hashMap.put("float", Float.class);
        hashMap.put("double", Double.class);
    }

    public final void a(Object obj, String str) {
        this.f22047a.put(str, obj);
    }
}
