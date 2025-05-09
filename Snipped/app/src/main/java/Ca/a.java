package Ca;

import okio.ByteString;

/* compiled from: Header.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final ByteString f698d = ByteString.a.c(com.sumsub.sns.internal.core.data.model.p.f15541a);

    /* renamed from: e, reason: collision with root package name */
    public static final ByteString f699e = ByteString.a.c(":status");

    /* renamed from: f, reason: collision with root package name */
    public static final ByteString f700f = ByteString.a.c(":method");

    /* renamed from: g, reason: collision with root package name */
    public static final ByteString f701g = ByteString.a.c(":path");

    /* renamed from: h, reason: collision with root package name */
    public static final ByteString f702h = ByteString.a.c(":scheme");
    public static final ByteString i = ByteString.a.c(":authority");

    /* renamed from: a, reason: collision with root package name */
    public final ByteString f703a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteString f704b;

    /* renamed from: c, reason: collision with root package name */
    public final int f705c;

    public a(ByteString byteString, ByteString byteString2) {
        this.f703a = byteString;
        this.f704b = byteString2;
        this.f705c = byteString2.d() + byteString.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.f.b(this.f703a, aVar.f703a) && kotlin.jvm.internal.f.b(this.f704b, aVar.f704b);
    }

    public final int hashCode() {
        return this.f704b.hashCode() + (this.f703a.hashCode() * 31);
    }

    public final String toString() {
        return this.f703a.k() + ": " + this.f704b.k();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            okio.ByteString r0 = new okio.ByteString
            java.nio.charset.Charset r1 = ka.C0956a.f23054b
            byte[] r1 = r3.getBytes(r1)
            r0.<init>(r1)
            r0.f24699c = r3
            okio.ByteString r3 = new okio.ByteString
            java.nio.charset.Charset r1 = ka.C0956a.f23054b
            byte[] r1 = r4.getBytes(r1)
            r3.<init>(r1)
            r3.f24699c = r4
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ca.a.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(okio.ByteString r3, java.lang.String r4) {
        /*
            r2 = this;
            okio.ByteString r0 = new okio.ByteString
            java.nio.charset.Charset r1 = ka.C0956a.f23054b
            byte[] r1 = r4.getBytes(r1)
            r0.<init>(r1)
            r0.f24699c = r4
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ca.a.<init>(okio.ByteString, java.lang.String):void");
    }
}
