package za;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.d;
import okhttp3.e;

/* compiled from: ConnectionSpecSelector.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List<okhttp3.e> f31350a;

    /* renamed from: b, reason: collision with root package name */
    public int f31351b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31352c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f31353d;

    public b(List<okhttp3.e> list) {
        this.f31350a = list;
    }

    public final okhttp3.e a(SSLSocket sSLSocket) {
        okhttp3.e eVar;
        int i;
        boolean z10;
        int i9 = this.f31351b;
        List<okhttp3.e> list = this.f31350a;
        int size = list.size();
        while (true) {
            if (i9 >= size) {
                eVar = null;
                break;
            }
            eVar = list.get(i9);
            if (eVar.b(sSLSocket)) {
                this.f31351b = i9 + 1;
                break;
            }
            i9++;
        }
        if (eVar == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f31353d + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        int i10 = this.f31351b;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i10 >= size2) {
                z10 = false;
                break;
            }
            if (list.get(i10).b(sSLSocket)) {
                z10 = true;
                break;
            }
            i10++;
        }
        this.f31352c = z10;
        boolean z11 = this.f31353d;
        String[] strArr = eVar.f24510c;
        String[] o10 = strArr != null ? wa.b.o(sSLSocket.getEnabledCipherSuites(), strArr, okhttp3.d.f24488c) : sSLSocket.getEnabledCipherSuites();
        String[] strArr2 = eVar.f24511d;
        String[] o11 = strArr2 != null ? wa.b.o(sSLSocket.getEnabledProtocols(), strArr2, R9.b.f3317b) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        d.a aVar = okhttp3.d.f24488c;
        byte[] bArr = wa.b.f30872a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (aVar.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z11 && i != -1) {
            String str = supportedCipherSuites[i];
            o10 = (String[]) Arrays.copyOf(o10, o10.length + 1);
            o10[o10.length - 1] = str;
        }
        e.a aVar2 = new e.a();
        aVar2.f24512a = eVar.f24508a;
        aVar2.f24513b = strArr;
        aVar2.f24514c = strArr2;
        aVar2.f24515d = eVar.f24509b;
        aVar2.b((String[]) Arrays.copyOf(o10, o10.length));
        aVar2.e((String[]) Arrays.copyOf(o11, o11.length));
        okhttp3.e a10 = aVar2.a();
        if (a10.c() != null) {
            sSLSocket.setEnabledProtocols(a10.f24511d);
        }
        if (a10.a() != null) {
            sSLSocket.setEnabledCipherSuites(a10.f24510c);
        }
        return eVar;
    }
}
