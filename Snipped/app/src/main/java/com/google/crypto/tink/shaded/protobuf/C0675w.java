package com.google.crypto.tink.shaded.protobuf;

/* compiled from: LazyFieldLite.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0675w {

    /* renamed from: a, reason: collision with root package name */
    public volatile I f10270a;

    /* renamed from: b, reason: collision with root package name */
    public volatile ByteString f10271b;

    static {
        C0666m.a();
    }

    public final I a(I i) {
        if (this.f10270a == null) {
            synchronized (this) {
                if (this.f10270a == null) {
                    try {
                        this.f10270a = i;
                        this.f10271b = ByteString.f10084b;
                    } catch (InvalidProtocolBufferException unused) {
                        this.f10270a = i;
                        this.f10271b = ByteString.f10084b;
                    }
                }
            }
        }
        return this.f10270a;
    }

    public final ByteString b() {
        if (this.f10271b != null) {
            return this.f10271b;
        }
        synchronized (this) {
            try {
                if (this.f10271b != null) {
                    return this.f10271b;
                }
                if (this.f10270a == null) {
                    this.f10271b = ByteString.f10084b;
                } else {
                    this.f10271b = this.f10270a.c();
                }
                return this.f10271b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0675w)) {
            return false;
        }
        C0675w c0675w = (C0675w) obj;
        I i = this.f10270a;
        I i9 = c0675w.f10270a;
        return (i == null && i9 == null) ? b().equals(c0675w.b()) : (i == null || i9 == null) ? i != null ? i.equals(c0675w.a(i.b())) : a(i9.b()).equals(i9) : i.equals(i9);
    }

    public int hashCode() {
        return 1;
    }
}
