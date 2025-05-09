package com.shockwave.pdfium.util;

/* loaded from: classes2.dex */
public class Size {

    /* renamed from: a, reason: collision with root package name */
    public final int f13355a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13356b;

    public Size(int i, int i9) {
        this.f13355a = i;
        this.f13356b = i9;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return this.f13355a == size.f13355a && this.f13356b == size.f13356b;
    }

    public final int hashCode() {
        int i = this.f13355a;
        return ((i >>> 16) | (i << 16)) ^ this.f13356b;
    }

    public final String toString() {
        return this.f13355a + "x" + this.f13356b;
    }
}
