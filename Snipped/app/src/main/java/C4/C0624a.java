package c4;

import kotlin.jvm.internal.f;

/* compiled from: CreateAccountRequestRaw.kt */
/* renamed from: c4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624a {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("token")
    private String f8524a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("network")
    private String f8525b;

    public C0624a(String str, String str2) {
        this.f8524a = str;
        this.f8525b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0624a)) {
            return false;
        }
        C0624a c0624a = (C0624a) obj;
        return f.b(this.f8524a, c0624a.f8524a) && f.b(this.f8525b, c0624a.f8525b);
    }

    public final int hashCode() {
        String str = this.f8524a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f8525b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return s3.b.l("CreateAccountRequestRaw(token=", this.f8524a, ", network=", this.f8525b, ")");
    }
}
