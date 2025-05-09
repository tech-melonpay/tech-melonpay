package U8;

import U8.j;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MarkwonSpansFactoryImpl.java */
/* loaded from: classes2.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class<? extends Qa.r>, s> f3694a;

    /* compiled from: MarkwonSpansFactoryImpl.java */
    public static class a implements j.a {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f3695a = new HashMap(3);

        public final a a(Class cls, s sVar) {
            this.f3695a.put(cls, sVar);
            return this;
        }
    }

    public k(Map<Class<? extends Qa.r>, s> map) {
        this.f3694a = map;
    }

    public final <N extends Qa.r> s a(Class<N> cls) {
        return this.f3694a.get(cls);
    }
}
