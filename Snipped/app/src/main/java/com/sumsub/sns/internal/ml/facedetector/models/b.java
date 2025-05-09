package com.sumsub.sns.internal.ml.facedetector.models;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: o, reason: collision with root package name */
    public static final a f17727o = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f17728a;

    /* renamed from: b, reason: collision with root package name */
    public final double f17729b;

    /* renamed from: c, reason: collision with root package name */
    public final double f17730c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17731d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17732e;

    /* renamed from: f, reason: collision with root package name */
    public final double f17733f;

    /* renamed from: g, reason: collision with root package name */
    public final double f17734g;

    /* renamed from: h, reason: collision with root package name */
    public final double f17735h;
    public final List<Integer> i;

    /* renamed from: j, reason: collision with root package name */
    public final List<Integer> f17736j;

    /* renamed from: k, reason: collision with root package name */
    public final List<Integer> f17737k;

    /* renamed from: l, reason: collision with root package name */
    public final List<Double> f17738l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f17739m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f17740n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a() {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(8);
            arrayList.add(16);
            arrayList.add(16);
            arrayList.add(16);
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(Double.valueOf(1.0d));
            return new b(4, 0.1484375d, 0.75d, 128, 128, 0.5d, 0.5d, 1.0d, new ArrayList(), new ArrayList(), arrayList, arrayList2, true, false, null);
        }

        public a() {
        }
    }

    public /* synthetic */ b(int i, double d10, double d11, int i9, int i10, double d12, double d13, double d14, List list, List list2, List list3, List list4, boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, d10, d11, i9, i10, d12, d13, d14, list, list2, list3, list4, z10, z11);
    }

    public final double a() {
        return this.f17733f;
    }

    public final double b() {
        return this.f17734g;
    }

    public final List<Double> c() {
        return this.f17738l;
    }

    public final List<Integer> d() {
        return this.f17736j;
    }

    public final List<Integer> e() {
        return this.i;
    }

    public final int f() {
        return this.f17731d;
    }

    public final int g() {
        return this.f17732e;
    }

    public final double h() {
        return this.f17735h;
    }

    public final double i() {
        return this.f17730c;
    }

    public final double j() {
        return this.f17729b;
    }

    public final int k() {
        return this.f17728a;
    }

    public final List<Integer> l() {
        return this.f17737k;
    }

    public final boolean m() {
        return this.f17739m;
    }

    public final boolean n() {
        return this.f17740n;
    }

    public b(int i, double d10, double d11, int i9, int i10, double d12, double d13, double d14, List<Integer> list, List<Integer> list2, List<Integer> list3, List<Double> list4, boolean z10, boolean z11) {
        this.f17728a = i;
        this.f17729b = d10;
        this.f17730c = d11;
        this.f17731d = i9;
        this.f17732e = i10;
        this.f17733f = d12;
        this.f17734g = d13;
        this.f17735h = d14;
        this.i = list;
        this.f17736j = list2;
        this.f17737k = list3;
        this.f17738l = list4;
        this.f17739m = z10;
        this.f17740n = z11;
    }
}
