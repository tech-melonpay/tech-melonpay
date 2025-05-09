package s5;

/* compiled from: KYCTokenDomain.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f26634a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26635b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26636c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26637d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26638e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f26634a = str;
        this.f26635b = str2;
        this.f26636c = str3;
        this.f26637d = str4;
        this.f26638e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.f.b(this.f26634a, iVar.f26634a) && kotlin.jvm.internal.f.b(this.f26635b, iVar.f26635b) && kotlin.jvm.internal.f.b(this.f26636c, iVar.f26636c) && kotlin.jvm.internal.f.b(this.f26637d, iVar.f26637d) && kotlin.jvm.internal.f.b(this.f26638e, iVar.f26638e);
    }

    public final int hashCode() {
        String str = this.f26634a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26635b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26636c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26637d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f26638e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("KYCTokenDomain(token=");
        sb2.append(this.f26634a);
        sb2.append(", applicantId=");
        sb2.append(this.f26635b);
        sb2.append(", applicationId=");
        sb2.append(this.f26636c);
        sb2.append(", referrer=");
        sb2.append(this.f26637d);
        sb2.append(", crossDeviceUrl=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f26638e, ")");
    }
}
