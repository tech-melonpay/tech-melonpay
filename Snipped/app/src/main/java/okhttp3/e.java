package okhttp3;

import P9.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import okhttp3.TlsVersion;

/* compiled from: ConnectionSpec.kt */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final e f24506e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f24507f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24508a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24509b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f24510c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f24511d;

    /* compiled from: ConnectionSpec.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f24512a = true;

        /* renamed from: b, reason: collision with root package name */
        public String[] f24513b;

        /* renamed from: c, reason: collision with root package name */
        public String[] f24514c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f24515d;

        public final e a() {
            return new e(this.f24512a, this.f24515d, this.f24513b, this.f24514c);
        }

        public final void b(String... strArr) {
            if (!this.f24512a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            this.f24513b = (String[]) strArr.clone();
        }

        public final void c(d... dVarArr) {
            if (!this.f24512a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(dVarArr.length);
            for (d dVar : dVarArr) {
                arrayList.add(dVar.f24505a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final void d() {
            if (!this.f24512a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.f24515d = true;
        }

        public final void e(String... strArr) {
            if (!this.f24512a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            this.f24514c = (String[]) strArr.clone();
        }

        public final void f(TlsVersion... tlsVersionArr) {
            if (!this.f24512a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(tlsVersionArr.length);
            for (TlsVersion tlsVersion : tlsVersionArr) {
                arrayList.add(tlsVersion.f24432a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            e((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    static {
        d dVar = d.f24502r;
        d dVar2 = d.f24503s;
        d dVar3 = d.f24504t;
        d dVar4 = d.f24496l;
        d dVar5 = d.f24498n;
        d dVar6 = d.f24497m;
        d dVar7 = d.f24499o;
        d dVar8 = d.f24501q;
        d dVar9 = d.f24500p;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, d.f24494j, d.f24495k, d.f24493h, d.i, d.f24491f, d.f24492g, d.f24490e};
        a aVar = new a();
        aVar.c((d[]) Arrays.copyOf(new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9}, 9));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        aVar.f(tlsVersion, tlsVersion2);
        aVar.d();
        aVar.a();
        a aVar2 = new a();
        aVar2.c((d[]) Arrays.copyOf(dVarArr, 16));
        aVar2.f(tlsVersion, tlsVersion2);
        aVar2.d();
        f24506e = aVar2.a();
        a aVar3 = new a();
        aVar3.c((d[]) Arrays.copyOf(dVarArr, 16));
        aVar3.f(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        aVar3.d();
        aVar3.a();
        f24507f = new e(false, false, null, null);
    }

    public e(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f24508a = z10;
        this.f24509b = z11;
        this.f24510c = strArr;
        this.f24511d = strArr2;
    }

    public final List<d> a() {
        String[] strArr = this.f24510c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(d.f24487b.b(str));
        }
        return s.c0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f24508a) {
            return false;
        }
        String[] strArr = this.f24511d;
        if (strArr != null && !wa.b.i(strArr, sSLSocket.getEnabledProtocols(), R9.b.f3317b)) {
            return false;
        }
        String[] strArr2 = this.f24510c;
        return strArr2 == null || wa.b.i(strArr2, sSLSocket.getEnabledCipherSuites(), d.f24488c);
    }

    public final List<TlsVersion> c() {
        String[] strArr = this.f24511d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(TlsVersion.a.a(str));
        }
        return s.c0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        e eVar = (e) obj;
        boolean z10 = eVar.f24508a;
        boolean z11 = this.f24508a;
        if (z11 != z10) {
            return false;
        }
        return !z11 || (Arrays.equals(this.f24510c, eVar.f24510c) && Arrays.equals(this.f24511d, eVar.f24511d) && this.f24509b == eVar.f24509b);
    }

    public final int hashCode() {
        if (!this.f24508a) {
            return 17;
        }
        String[] strArr = this.f24510c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f24511d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f24509b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f24508a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb2 = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb2.append(Objects.toString(a(), "[all enabled]"));
        sb2.append(", tlsVersions=");
        sb2.append(Objects.toString(c(), "[all enabled]"));
        sb2.append(", supportsTlsExtensions=");
        return androidx.camera.core.impl.utils.a.o(sb2, this.f24509b, ')');
    }
}
