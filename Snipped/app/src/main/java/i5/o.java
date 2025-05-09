package I5;

/* compiled from: SmsDomain.kt */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f1865a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1866b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1867c;

    public o(Integer num, String str, String str2) {
        this.f1865a = num;
        this.f1866b = str;
        this.f1867c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.f.b(this.f1865a, oVar.f1865a) && kotlin.jvm.internal.f.b(this.f1866b, oVar.f1866b) && kotlin.jvm.internal.f.b(this.f1867c, oVar.f1867c);
    }

    public final int hashCode() {
        Integer num = this.f1865a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f1866b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1867c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SmsDomain(clientId=");
        sb2.append(this.f1865a);
        sb2.append(", phone=");
        sb2.append(this.f1866b);
        sb2.append(", message=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f1867c, ")");
    }
}
