package R0;

import androidx.lifecycle.Q;
import androidx.lifecycle.T;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import ia.InterfaceC0835c;

/* compiled from: ViewModelProviderImpl.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final W f3240a;

    /* renamed from: b, reason: collision with root package name */
    public final T f3241b;

    /* renamed from: c, reason: collision with root package name */
    public final a f3242c;

    public e(W w2, T t3, a aVar) {
        this.f3240a = w2;
        this.f3241b = t3;
        this.f3242c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Q> T a(InterfaceC0835c<T> interfaceC0835c, String str) {
        T t3;
        W w2 = this.f3240a;
        T t10 = (T) w2.f7060a.get(str);
        boolean f10 = interfaceC0835c.f(t10);
        T t11 = this.f3241b;
        if (f10) {
            if (t11 instanceof V) {
                ((V) t11).onRequery(t10);
            }
            return t10;
        }
        c cVar = new c(this.f3242c);
        cVar.b(S0.c.f3333a, str);
        try {
            try {
                t3 = (T) t11.a(interfaceC0835c, cVar);
            } catch (AbstractMethodError unused) {
                t3 = (T) t11.create(((kotlin.jvm.internal.a) interfaceC0835c).g(), cVar);
            }
        } catch (AbstractMethodError unused2) {
            t3 = (T) t11.create(((kotlin.jvm.internal.a) interfaceC0835c).g());
        }
        Q q10 = (Q) w2.f7060a.put(str, t3);
        if (q10 != null) {
            q10.clear$lifecycle_viewmodel_release();
        }
        return t3;
    }
}
