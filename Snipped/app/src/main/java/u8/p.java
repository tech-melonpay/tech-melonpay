package U8;

import C.N;
import java.util.HashMap;

/* compiled from: Prop.java */
/* loaded from: classes2.dex */
public final class p<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f3704a;

    public p(String str) {
        this.f3704a = str;
    }

    public final T a(r rVar) {
        T t3 = (T) ((HashMap) ((N) rVar).f535b).get(this);
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException(this.f3704a);
    }

    public final void b(r rVar, T t3) {
        HashMap hashMap = (HashMap) ((N) rVar).f535b;
        if (t3 == null) {
            hashMap.remove(this);
        } else {
            hashMap.put(this, t3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        return this.f3704a.equals(((p) obj).f3704a);
    }

    public final int hashCode() {
        return this.f3704a.hashCode();
    }

    public final String toString() {
        return androidx.camera.core.impl.utils.a.n(new StringBuilder("Prop{name='"), this.f3704a, "'}");
    }
}
