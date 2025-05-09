package s5;

/* compiled from: AccountRequest.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f26608a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26609b;

    public b(String str, String str2) {
        this.f26608a = str;
        this.f26609b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.f.b(this.f26608a, bVar.f26608a) && kotlin.jvm.internal.f.b(this.f26609b, bVar.f26609b);
    }

    public final int hashCode() {
        return this.f26609b.hashCode() + (this.f26608a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccountRequest(clientId=");
        sb2.append(this.f26608a);
        sb2.append(", accountId=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f26609b, ")");
    }
}
