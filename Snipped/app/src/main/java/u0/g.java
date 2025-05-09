package U0;

/* compiled from: NavArgument.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final k<Object> f3597a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3598b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3599c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3600d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3601e;

    public g(k kVar, boolean z10, Object obj, boolean z11) {
        if (!kVar.f3619a && z10) {
            throw new IllegalArgumentException(kVar.b().concat(" does not allow nullable values").toString());
        }
        if (!z10 && z11 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + kVar.b() + " has null value but is not nullable.").toString());
        }
        this.f3597a = kVar;
        this.f3598b = z10;
        this.f3601e = obj;
        this.f3599c = z11;
        this.f3600d = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.f.b(g.class, obj.getClass())) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f3598b != gVar.f3598b || this.f3599c != gVar.f3599c || !kotlin.jvm.internal.f.b(this.f3597a, gVar.f3597a)) {
            return false;
        }
        Object obj2 = gVar.f3601e;
        Object obj3 = this.f3601e;
        return obj3 != null ? kotlin.jvm.internal.f.b(obj3, obj2) : obj2 == null;
    }

    public final int hashCode() {
        int hashCode = ((((this.f3597a.hashCode() * 31) + (this.f3598b ? 1 : 0)) * 31) + (this.f3599c ? 1 : 0)) * 31;
        Object obj = this.f3601e;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g.class.getSimpleName());
        sb2.append(" Type: " + this.f3597a);
        sb2.append(" Nullable: " + this.f3598b);
        if (this.f3599c) {
            sb2.append(" DefaultValue: " + this.f3601e);
        }
        return sb2.toString();
    }
}
