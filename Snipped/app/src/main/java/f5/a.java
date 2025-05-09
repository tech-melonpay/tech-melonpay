package F5;

import C.v;
import kotlin.jvm.internal.f;

/* compiled from: DownloadStatementsRequest.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1164a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1165b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1166c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1167d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1168e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1169f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1170g;

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f1164a = str;
        this.f1165b = str2;
        this.f1166c = str3;
        this.f1167d = str4;
        this.f1168e = str5;
        this.f1169f = str6;
        this.f1170g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f1164a, aVar.f1164a) && f.b(this.f1165b, aVar.f1165b) && f.b(this.f1166c, aVar.f1166c) && f.b(this.f1167d, aVar.f1167d) && f.b(this.f1168e, aVar.f1168e) && f.b(this.f1169f, aVar.f1169f) && f.b(this.f1170g, aVar.f1170g);
    }

    public final int hashCode() {
        int c2 = v.c(this.f1164a.hashCode() * 31, 31, this.f1165b);
        String str = this.f1166c;
        int hashCode = (c2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1167d;
        int c10 = v.c(v.c((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f1168e), 31, this.f1169f);
        String str3 = this.f1170g;
        return c10 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DownloadStatementsRequest(companyId=");
        sb2.append(this.f1164a);
        sb2.append(", bankAccountId=");
        sb2.append(this.f1165b);
        sb2.append(", createdFrom=");
        sb2.append(this.f1166c);
        sb2.append(", createdTo=");
        sb2.append(this.f1167d);
        sb2.append(", filePath=");
        sb2.append(this.f1168e);
        sb2.append(", type=");
        sb2.append(this.f1169f);
        sb2.append(", clientTimezone=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f1170g, ")");
    }
}
