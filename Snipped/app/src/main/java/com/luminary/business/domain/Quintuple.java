package com.luminary.business.domain;

import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: Quintuple.kt */
/* loaded from: classes.dex */
public final class Quintuple<A, B, C, D, E> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final A f10687a;

    /* renamed from: b, reason: collision with root package name */
    public final B f10688b;

    /* renamed from: c, reason: collision with root package name */
    public final C f10689c;

    /* renamed from: d, reason: collision with root package name */
    public final D f10690d;

    /* renamed from: e, reason: collision with root package name */
    public final E f10691e;

    /* JADX WARN: Multi-variable type inference failed */
    public Quintuple(String str, Integer num, String str2, Integer num2, String str3) {
        this.f10687a = num;
        this.f10688b = str;
        this.f10689c = str2;
        this.f10690d = str3;
        this.f10691e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Quintuple)) {
            return false;
        }
        Quintuple quintuple = (Quintuple) obj;
        return f.b(this.f10687a, quintuple.f10687a) && f.b(this.f10688b, quintuple.f10688b) && f.b(this.f10689c, quintuple.f10689c) && f.b(this.f10690d, quintuple.f10690d) && f.b(this.f10691e, quintuple.f10691e);
    }

    public final int hashCode() {
        A a10 = this.f10687a;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b9 = this.f10688b;
        int hashCode2 = (hashCode + (b9 == null ? 0 : b9.hashCode())) * 31;
        C c2 = this.f10689c;
        int hashCode3 = (hashCode2 + (c2 == null ? 0 : c2.hashCode())) * 31;
        D d10 = this.f10690d;
        int hashCode4 = (hashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
        E e10 = this.f10691e;
        return hashCode4 + (e10 != null ? e10.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f10687a + ", " + this.f10688b + ", " + this.f10689c + ", " + this.f10690d + ", " + this.f10691e + ")";
    }
}
