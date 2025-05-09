package t5;

import C.v;

/* compiled from: CardAndVaultRequestDomain.kt */
/* renamed from: t5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1280a {

    /* renamed from: a, reason: collision with root package name */
    public final int f27518a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27519b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27520c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27521d;

    /* renamed from: e, reason: collision with root package name */
    public final String f27522e;

    /* renamed from: f, reason: collision with root package name */
    public final String f27523f;

    /* renamed from: g, reason: collision with root package name */
    public final String f27524g;

    public C1280a(int i, int i9, String str, String str2, String str3, String str4, String str5) {
        this.f27518a = i;
        this.f27519b = i9;
        this.f27520c = str;
        this.f27521d = str2;
        this.f27522e = str3;
        this.f27523f = str4;
        this.f27524g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1280a)) {
            return false;
        }
        C1280a c1280a = (C1280a) obj;
        return this.f27518a == c1280a.f27518a && this.f27519b == c1280a.f27519b && kotlin.jvm.internal.f.b(this.f27520c, c1280a.f27520c) && kotlin.jvm.internal.f.b(this.f27521d, c1280a.f27521d) && kotlin.jvm.internal.f.b(this.f27522e, c1280a.f27522e) && kotlin.jvm.internal.f.b(this.f27523f, c1280a.f27523f) && kotlin.jvm.internal.f.b(this.f27524g, c1280a.f27524g);
    }

    public final int hashCode() {
        return this.f27524g.hashCode() + v.c(v.c(v.c(v.c(v.b(this.f27519b, Integer.hashCode(this.f27518a) * 31, 31), 31, this.f27520c), 31, this.f27521d), 31, this.f27522e), 31, this.f27523f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CardAndVaultRequestDomain(cardProgramId=");
        sb2.append(this.f27518a);
        sb2.append(", bankAccountId=");
        sb2.append(this.f27519b);
        sb2.append(", email=");
        sb2.append(this.f27520c);
        sb2.append(", phone=");
        sb2.append(this.f27521d);
        sb2.append(", password=");
        sb2.append(this.f27522e);
        sb2.append(", vaultPrettyName=");
        sb2.append(this.f27523f);
        sb2.append(", cardPrettyName=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f27524g, ")");
    }
}
