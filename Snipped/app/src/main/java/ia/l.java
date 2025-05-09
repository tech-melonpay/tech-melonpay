package ia;

import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KVariance;

/* compiled from: KTypeProjection.kt */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f21515c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final KVariance f21516a;

    /* renamed from: b, reason: collision with root package name */
    public final k f21517b;

    /* compiled from: KTypeProjection.kt */
    public static final class a {
        public static l a(kotlin.jvm.internal.k kVar) {
            return new l(KVariance.f23196a, kVar);
        }
    }

    /* compiled from: KTypeProjection.kt */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21518a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                KVariance kVariance = KVariance.f23196a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KVariance kVariance2 = KVariance.f23196a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KVariance kVariance3 = KVariance.f23196a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21518a = iArr;
        }
    }

    static {
        new l(null, null);
    }

    public l(KVariance kVariance, kotlin.jvm.internal.k kVar) {
        String str;
        this.f21516a = kVariance;
        this.f21517b = kVar;
        if ((kVariance == null) == (kVar == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f21516a == lVar.f21516a && kotlin.jvm.internal.f.b(this.f21517b, lVar.f21517b);
    }

    public final int hashCode() {
        KVariance kVariance = this.f21516a;
        int hashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        k kVar = this.f21517b;
        return hashCode + (kVar != null ? kVar.hashCode() : 0);
    }

    public final String toString() {
        KVariance kVariance = this.f21516a;
        int i = kVariance == null ? -1 : b.f21518a[kVariance.ordinal()];
        if (i == -1) {
            return "*";
        }
        k kVar = this.f21517b;
        if (i == 1) {
            return String.valueOf(kVar);
        }
        if (i == 2) {
            return "in " + kVar;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + kVar;
    }
}
