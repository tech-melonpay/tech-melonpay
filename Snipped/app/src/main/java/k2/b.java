package k2;

import android.content.Context;

/* compiled from: AutoValue_CreationContext.java */
/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22924a;

    /* renamed from: b, reason: collision with root package name */
    public final r2.a f22925b;

    /* renamed from: c, reason: collision with root package name */
    public final r2.a f22926c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22927d;

    public b(Context context, r2.a aVar, r2.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f22924a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f22925b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f22926c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f22927d = str;
    }

    @Override // k2.f
    public final Context a() {
        return this.f22924a;
    }

    @Override // k2.f
    public final String b() {
        return this.f22927d;
    }

    @Override // k2.f
    public final r2.a c() {
        return this.f22926c;
    }

    @Override // k2.f
    public final r2.a d() {
        return this.f22925b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f22924a.equals(fVar.a()) && this.f22925b.equals(fVar.d()) && this.f22926c.equals(fVar.c()) && this.f22927d.equals(fVar.b());
    }

    public final int hashCode() {
        return ((((((this.f22924a.hashCode() ^ 1000003) * 1000003) ^ this.f22925b.hashCode()) * 1000003) ^ this.f22926c.hashCode()) * 1000003) ^ this.f22927d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f22924a);
        sb2.append(", wallClock=");
        sb2.append(this.f22925b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f22926c);
        sb2.append(", backendName=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f22927d, "}");
    }
}
