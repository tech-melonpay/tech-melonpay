package j2;

import java.util.Arrays;

/* compiled from: EncodedPayload.java */
/* renamed from: j2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0887f {

    /* renamed from: a, reason: collision with root package name */
    public final g2.b f22438a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f22439b;

    public C0887f(g2.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f22438a = bVar;
        this.f22439b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0887f)) {
            return false;
        }
        C0887f c0887f = (C0887f) obj;
        if (this.f22438a.equals(c0887f.f22438a)) {
            return Arrays.equals(this.f22439b, c0887f.f22439b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f22438a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f22439b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f22438a + ", bytes=[...]}";
    }
}
