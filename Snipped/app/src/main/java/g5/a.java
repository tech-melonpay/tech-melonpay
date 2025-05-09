package G5;

import C.v;
import kotlin.jvm.internal.f;

/* compiled from: SystemVariablesRaw.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1320a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1321b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1322c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1323d;

    public a() {
        this(0);
    }

    public static a a(a aVar, String str, String str2, String str3, String str4, int i) {
        if ((i & 1) != 0) {
            str = aVar.f1320a;
        }
        if ((i & 2) != 0) {
            str2 = aVar.f1321b;
        }
        if ((i & 4) != 0) {
            str3 = aVar.f1322c;
        }
        if ((i & 8) != 0) {
            str4 = aVar.f1323d;
        }
        return new a(str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f1320a, aVar.f1320a) && f.b(this.f1321b, aVar.f1321b) && f.b(this.f1322c, aVar.f1322c) && f.b(this.f1323d, aVar.f1323d);
    }

    public final int hashCode() {
        return this.f1323d.hashCode() + v.c(v.c(this.f1320a.hashCode() * 31, 31, this.f1321b), 31, this.f1322c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SystemVariables(supportEmail=");
        sb2.append(this.f1320a);
        sb2.append(", cookiePolicy=");
        sb2.append(this.f1321b);
        sb2.append(", privacyPolicy=");
        sb2.append(this.f1322c);
        sb2.append(", termsConditions=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f1323d, ")");
    }

    public /* synthetic */ a(int i) {
        this("", "", "", "");
    }

    public a(String str, String str2, String str3, String str4) {
        this.f1320a = str;
        this.f1321b = str2;
        this.f1322c = str3;
        this.f1323d = str4;
    }
}
