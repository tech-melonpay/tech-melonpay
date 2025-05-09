package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: Action.java */
/* loaded from: classes2.dex */
public abstract class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Picasso f13395a;

    /* renamed from: b, reason: collision with root package name */
    public final k f13396b;

    /* renamed from: c, reason: collision with root package name */
    public final C0140a f13397c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13398d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13399e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13400f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13401g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f13402h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f13403j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13404k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13405l;

    /* compiled from: Action.java */
    /* renamed from: com.squareup.picasso.a$a, reason: collision with other inner class name */
    public static class C0140a<M> extends WeakReference<M> {

        /* renamed from: a, reason: collision with root package name */
        public final a f13406a;

        public C0140a(a aVar, M m2, ReferenceQueue<? super M> referenceQueue) {
            super(m2, referenceQueue);
            this.f13406a = aVar;
        }
    }

    public a(Picasso picasso, Object obj, k kVar, String str) {
        this.f13395a = picasso;
        this.f13396b = kVar;
        this.f13397c = obj == null ? null : new C0140a(this, obj, picasso.f13380j);
        this.f13399e = 0;
        this.f13400f = 0;
        this.f13398d = false;
        this.f13401g = 0;
        this.f13402h = null;
        this.i = str;
        this.f13403j = this;
    }

    public void a() {
        this.f13405l = true;
    }

    public abstract void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    public abstract void c();

    public final T d() {
        C0140a c0140a = this.f13397c;
        if (c0140a == null) {
            return null;
        }
        return (T) c0140a.get();
    }
}
