package Ia;

/* compiled from: WebSocketExtensions.kt */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1990a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f1991b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1992c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f1993d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1994e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1995f;

    public g() {
        this(false, null, false, null, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f1990a == gVar.f1990a && kotlin.jvm.internal.f.b(this.f1991b, gVar.f1991b) && this.f1992c == gVar.f1992c && kotlin.jvm.internal.f.b(this.f1993d, gVar.f1993d) && this.f1994e == gVar.f1994e && this.f1995f == gVar.f1995f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z10 = this.f1990a;
        int i = z10;
        if (z10 != 0) {
            i = 1;
        }
        int i9 = i * 31;
        Integer num = this.f1991b;
        int hashCode = (i9 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z11 = this.f1992c;
        int i10 = z11;
        if (z11 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        Integer num2 = this.f1993d;
        int hashCode2 = (i11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z12 = this.f1994e;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        int i13 = (hashCode2 + i12) * 31;
        boolean z13 = this.f1995f;
        return i13 + (z13 ? 1 : z13 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb2.append(this.f1990a);
        sb2.append(", clientMaxWindowBits=");
        sb2.append(this.f1991b);
        sb2.append(", clientNoContextTakeover=");
        sb2.append(this.f1992c);
        sb2.append(", serverMaxWindowBits=");
        sb2.append(this.f1993d);
        sb2.append(", serverNoContextTakeover=");
        sb2.append(this.f1994e);
        sb2.append(", unknownValues=");
        return androidx.camera.core.impl.utils.a.o(sb2, this.f1995f, ')');
    }

    public g(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13) {
        this.f1990a = z10;
        this.f1991b = num;
        this.f1992c = z11;
        this.f1993d = num2;
        this.f1994e = z12;
        this.f1995f = z13;
    }
}
