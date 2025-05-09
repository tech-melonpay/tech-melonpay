package Qa;

/* compiled from: Node.java */
/* loaded from: classes3.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public r f3227a = null;

    /* renamed from: b, reason: collision with root package name */
    public r f3228b = null;

    /* renamed from: c, reason: collision with root package name */
    public r f3229c = null;

    /* renamed from: d, reason: collision with root package name */
    public r f3230d = null;

    /* renamed from: e, reason: collision with root package name */
    public r f3231e = null;

    public abstract void a(y yVar);

    public final void b(r rVar) {
        rVar.f();
        rVar.d(this);
        r rVar2 = this.f3229c;
        if (rVar2 == null) {
            this.f3228b = rVar;
            this.f3229c = rVar;
        } else {
            rVar2.f3231e = rVar;
            rVar.f3230d = rVar2;
            this.f3229c = rVar;
        }
    }

    public r c() {
        return this.f3227a;
    }

    public void d(r rVar) {
        this.f3227a = rVar;
    }

    public String e() {
        return "";
    }

    public final void f() {
        r rVar = this.f3230d;
        if (rVar != null) {
            rVar.f3231e = this.f3231e;
        } else {
            r rVar2 = this.f3227a;
            if (rVar2 != null) {
                rVar2.f3228b = this.f3231e;
            }
        }
        r rVar3 = this.f3231e;
        if (rVar3 != null) {
            rVar3.f3230d = rVar;
        } else {
            r rVar4 = this.f3227a;
            if (rVar4 != null) {
                rVar4.f3229c = rVar;
            }
        }
        this.f3227a = null;
        this.f3231e = null;
        this.f3230d = null;
    }

    public final String toString() {
        return getClass().getSimpleName() + "{" + e() + "}";
    }
}
