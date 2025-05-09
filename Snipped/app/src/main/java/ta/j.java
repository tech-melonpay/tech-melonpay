package ta;

import kotlinx.serialization.descriptors.b;

/* compiled from: JsonPath.kt */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f29990a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f29991b;

    /* renamed from: c, reason: collision with root package name */
    public int f29992c;

    /* compiled from: JsonPath.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29993a = new a();
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder("$");
        int i = this.f29992c + 1;
        for (int i9 = 0; i9 < i; i9++) {
            Object obj = this.f29990a[i9];
            if (obj instanceof pa.f) {
                pa.f fVar = (pa.f) obj;
                if (!kotlin.jvm.internal.f.b(fVar.e(), b.C0424b.f23310a)) {
                    int i10 = this.f29991b[i9];
                    if (i10 >= 0) {
                        sb2.append(".");
                        sb2.append(fVar.g(i10));
                    }
                } else if (this.f29991b[i9] != -1) {
                    sb2.append("[");
                    sb2.append(this.f29991b[i9]);
                    sb2.append("]");
                }
            } else if (obj != a.f29993a) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        return sb2.toString();
    }

    public final String toString() {
        return a();
    }
}
