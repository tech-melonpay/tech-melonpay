package r4;

/* compiled from: SmsCodeRaw.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("client_id")
    private final Integer f26260a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("phone")
    private final String f26261b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("message")
    private final String f26262c;

    public final Integer a() {
        return this.f26260a;
    }

    public final String b() {
        return this.f26262c;
    }

    public final String c() {
        return this.f26261b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.f.b(this.f26260a, gVar.f26260a) && kotlin.jvm.internal.f.b(this.f26261b, gVar.f26261b) && kotlin.jvm.internal.f.b(this.f26262c, gVar.f26262c);
    }

    public final int hashCode() {
        Integer num = this.f26260a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f26261b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f26262c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.f26260a;
        String str = this.f26261b;
        String str2 = this.f26262c;
        StringBuilder sb2 = new StringBuilder("SmsCodeRaw(clientId=");
        sb2.append(num);
        sb2.append(", phone=");
        sb2.append(str);
        sb2.append(", message=");
        return androidx.camera.core.impl.utils.a.n(sb2, str2, ")");
    }
}
