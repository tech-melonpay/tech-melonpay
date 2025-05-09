package com.luminary.business.domain;

import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: Quadruple.kt */
/* loaded from: classes.dex */
public final class Quadruple<A, B, C, D> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final A f10683a;

    /* renamed from: b, reason: collision with root package name */
    public final B f10684b;

    /* renamed from: c, reason: collision with root package name */
    public final C f10685c;

    /* renamed from: d, reason: collision with root package name */
    public final D f10686d;

    /* JADX WARN: Multi-variable type inference failed */
    public Quadruple(String str, String str2, String str3, String str4) {
        this.f10683a = str;
        this.f10684b = str2;
        this.f10685c = str3;
        this.f10686d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Quadruple)) {
            return false;
        }
        Quadruple quadruple = (Quadruple) obj;
        return f.b(this.f10683a, quadruple.f10683a) && f.b(this.f10684b, quadruple.f10684b) && f.b(this.f10685c, quadruple.f10685c) && f.b(this.f10686d, quadruple.f10686d);
    }

    public final int hashCode() {
        A a10 = this.f10683a;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b9 = this.f10684b;
        int hashCode2 = (hashCode + (b9 == null ? 0 : b9.hashCode())) * 31;
        C c2 = this.f10685c;
        int hashCode3 = (hashCode2 + (c2 == null ? 0 : c2.hashCode())) * 31;
        D d10 = this.f10686d;
        return hashCode3 + (d10 != null ? d10.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f10683a + ", " + this.f10684b + ", " + this.f10685c + ", " + this.f10686d + ")";
    }
}
