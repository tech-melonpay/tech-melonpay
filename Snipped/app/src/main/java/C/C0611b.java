package c;

import android.window.BackEvent;

/* compiled from: BackEventCompat.kt */
/* renamed from: c.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0611b {

    /* renamed from: a, reason: collision with root package name */
    public final float f8488a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8489b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8490c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8491d;

    public C0611b(BackEvent backEvent) {
        C0610a c0610a = C0610a.f8487a;
        float d10 = c0610a.d(backEvent);
        float e10 = c0610a.e(backEvent);
        float b9 = c0610a.b(backEvent);
        int c2 = c0610a.c(backEvent);
        this.f8488a = d10;
        this.f8489b = e10;
        this.f8490c = b9;
        this.f8491d = c2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackEventCompat{touchX=");
        sb2.append(this.f8488a);
        sb2.append(", touchY=");
        sb2.append(this.f8489b);
        sb2.append(", progress=");
        sb2.append(this.f8490c);
        sb2.append(", swipeEdge=");
        return androidx.camera.core.impl.utils.a.m(sb2, this.f8491d, '}');
    }
}
