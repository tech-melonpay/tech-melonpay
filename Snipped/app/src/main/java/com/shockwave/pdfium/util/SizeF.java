package com.shockwave.pdfium.util;

/* loaded from: classes2.dex */
public class SizeF {

    /* renamed from: a, reason: collision with root package name */
    public final float f13357a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13358b;

    public SizeF(float f10, float f11) {
        this.f13357a = f10;
        this.f13358b = f11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeF)) {
            return false;
        }
        SizeF sizeF = (SizeF) obj;
        return this.f13357a == sizeF.f13357a && this.f13358b == sizeF.f13358b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f13357a) ^ Float.floatToIntBits(this.f13358b);
    }

    public final String toString() {
        return this.f13357a + "x" + this.f13358b;
    }
}
