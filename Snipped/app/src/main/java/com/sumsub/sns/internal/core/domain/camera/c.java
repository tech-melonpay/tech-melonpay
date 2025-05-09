package com.sumsub.sns.internal.core.domain.camera;

import C.v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f16377a;

    /* renamed from: b, reason: collision with root package name */
    public final float f16378b;

    /* renamed from: c, reason: collision with root package name */
    public final float f16379c;

    public c() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public final float d() {
        return this.f16377a;
    }

    public final float e() {
        return this.f16379c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f.b(Float.valueOf(this.f16377a), Float.valueOf(cVar.f16377a)) && f.b(Float.valueOf(this.f16378b), Float.valueOf(cVar.f16378b)) && f.b(Float.valueOf(this.f16379c), Float.valueOf(cVar.f16379c));
    }

    public final float f() {
        return this.f16378b;
    }

    public int hashCode() {
        return Float.hashCode(this.f16379c) + v.a(Float.hashCode(this.f16377a) * 31, this.f16378b, 31);
    }

    public String toString() {
        return "Exposure(current=" + this.f16377a + ", min=" + this.f16378b + ", max=" + this.f16379c + ')';
    }

    public c(float f10, float f11, float f12) {
        this.f16377a = f10;
        this.f16378b = f11;
        this.f16379c = f12;
    }

    public /* synthetic */ c(float f10, float f11, float f12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f10, (i & 2) != 0 ? 0.0f : f11, (i & 4) != 0 ? 0.0f : f12);
    }
}
