package ja;

import ca.InterfaceC0646l;
import java.util.Iterator;

/* compiled from: Sequences.kt */
/* loaded from: classes2.dex */
public class l extends k {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    public static final class a<T> implements h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f22585a;

        public a(Iterator it) {
            this.f22585a = it;
        }

        @Override // ja.h
        public final Iterator<T> iterator() {
            return this.f22585a;
        }
    }

    public static <T> h<T> b(Iterator<? extends T> it) {
        a aVar = new a(it);
        return aVar instanceof C0911a ? aVar : new C0911a(aVar);
    }

    public static final f c(h hVar) {
        Z3.a aVar = new Z3.a(11);
        if (!(hVar instanceof o)) {
            return new f(hVar, new Z3.a(12), aVar);
        }
        o oVar = (o) hVar;
        return new f(oVar.f22594a, oVar.f22595b, aVar);
    }

    public static h d(InterfaceC0646l interfaceC0646l, Object obj) {
        return obj == null ? d.f22561a : new g(new g8.g(obj, 8), interfaceC0646l);
    }

    public static <T> h<T> e(T... tArr) {
        return tArr.length == 0 ? d.f22561a : new P9.k(tArr, 0);
    }
}
