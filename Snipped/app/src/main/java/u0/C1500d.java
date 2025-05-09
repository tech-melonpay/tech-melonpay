package u0;

import android.util.Base64;
import java.util.List;

/* compiled from: FontRequest.java */
/* renamed from: u0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1500d {

    /* renamed from: a, reason: collision with root package name */
    public final String f30093a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30094b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30095c;

    /* renamed from: d, reason: collision with root package name */
    public final List<List<byte[]>> f30096d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30097e;

    public C1500d(String str, String str2, String str3, List<List<byte[]>> list) {
        str.getClass();
        this.f30093a = str;
        str2.getClass();
        this.f30094b = str2;
        this.f30095c = str3;
        list.getClass();
        this.f30096d = list;
        this.f30097e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f30093a + ", mProviderPackage: " + this.f30094b + ", mQuery: " + this.f30095c + ", mCertificates:");
        int i = 0;
        while (true) {
            List<List<byte[]>> list = this.f30096d;
            if (i >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List<byte[]> list2 = list.get(i);
            for (int i9 = 0; i9 < list2.size(); i9++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list2.get(i9), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i++;
        }
    }
}
