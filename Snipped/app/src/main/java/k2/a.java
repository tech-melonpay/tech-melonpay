package k2;

import j2.AbstractC0888g;
import java.util.Arrays;

/* compiled from: AutoValue_BackendRequest.java */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public final Iterable<AbstractC0888g> f22922a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f22923b;

    public a() {
        throw null;
    }

    public a(Iterable iterable, byte[] bArr) {
        this.f22922a = iterable;
        this.f22923b = bArr;
    }

    @Override // k2.e
    public final Iterable<AbstractC0888g> a() {
        return this.f22922a;
    }

    @Override // k2.e
    public final byte[] b() {
        return this.f22923b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f22922a.equals(eVar.a())) {
            if (Arrays.equals(this.f22923b, eVar instanceof a ? ((a) eVar).f22923b : eVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f22922a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f22923b);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.f22922a + ", extras=" + Arrays.toString(this.f22923b) + "}";
    }
}
