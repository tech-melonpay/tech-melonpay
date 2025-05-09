package com.google.gson;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: GsonBuilder.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final m3.g f10357a;

    /* renamed from: b, reason: collision with root package name */
    public final LongSerializationPolicy f10358b;

    /* renamed from: c, reason: collision with root package name */
    public final b f10359c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f10360d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f10361e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f10362f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10363g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10364h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f10365j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f10366k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f10367l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10368m;

    /* renamed from: n, reason: collision with root package name */
    public c f10369n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f10370o;

    /* renamed from: p, reason: collision with root package name */
    public Strictness f10371p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f10372q;

    /* renamed from: r, reason: collision with root package name */
    public final q f10373r;

    /* renamed from: s, reason: collision with root package name */
    public final q f10374s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayDeque<ReflectionAccessFilter> f10375t;

    public h() {
        this.f10357a = m3.g.f23902f;
        this.f10358b = LongSerializationPolicy.f10306a;
        this.f10359c = FieldNamingPolicy.f10304a;
        this.f10360d = new HashMap();
        this.f10361e = new ArrayList();
        this.f10362f = new ArrayList();
        this.f10363g = false;
        c cVar = g.f10331z;
        this.f10364h = null;
        this.i = 2;
        this.f10365j = 2;
        this.f10366k = false;
        this.f10367l = false;
        this.f10368m = true;
        this.f10369n = g.f10331z;
        this.f10370o = false;
        this.f10371p = null;
        this.f10372q = true;
        this.f10373r = g.f10329B;
        this.f10374s = g.f10330C;
        this.f10375t = new ArrayDeque<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.gson.g a() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.h.a():com.google.gson.g");
    }

    public h(g gVar) {
        this.f10357a = m3.g.f23902f;
        this.f10358b = LongSerializationPolicy.f10306a;
        this.f10359c = FieldNamingPolicy.f10304a;
        HashMap hashMap = new HashMap();
        this.f10360d = hashMap;
        ArrayList arrayList = new ArrayList();
        this.f10361e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f10362f = arrayList2;
        this.f10363g = false;
        c cVar = g.f10331z;
        this.f10364h = null;
        this.i = 2;
        this.f10365j = 2;
        this.f10366k = false;
        this.f10367l = false;
        this.f10368m = true;
        this.f10369n = g.f10331z;
        this.f10370o = false;
        this.f10371p = null;
        this.f10372q = true;
        this.f10373r = g.f10329B;
        this.f10374s = g.f10330C;
        ArrayDeque<ReflectionAccessFilter> arrayDeque = new ArrayDeque<>();
        this.f10375t = arrayDeque;
        this.f10357a = gVar.f10337f;
        this.f10359c = gVar.f10338g;
        hashMap.putAll(gVar.f10339h);
        this.f10363g = gVar.i;
        this.f10366k = gVar.f10340j;
        this.f10370o = gVar.f10341k;
        this.f10368m = gVar.f10342l;
        this.f10369n = gVar.f10343m;
        this.f10371p = gVar.f10344n;
        this.f10367l = gVar.f10345o;
        this.f10358b = gVar.f10350t;
        this.f10364h = gVar.f10347q;
        this.i = gVar.f10348r;
        this.f10365j = gVar.f10349s;
        arrayList.addAll(gVar.f10351u);
        arrayList2.addAll(gVar.f10352v);
        this.f10372q = gVar.f10346p;
        this.f10373r = gVar.f10353w;
        this.f10374s = gVar.f10354x;
        arrayDeque.addAll(gVar.f10355y);
    }
}
