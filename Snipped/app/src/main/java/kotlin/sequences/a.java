package kotlin.sequences;

import P9.m;
import ca.InterfaceC0646l;
import ja.e;
import ja.h;
import ja.l;
import ja.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.f;

/* compiled from: _Sequences.kt */
/* loaded from: classes2.dex */
public class a extends l {
    public static <T> boolean f(h<? extends T> hVar, T t3) {
        int i = 0;
        for (T t10 : hVar) {
            if (i < 0) {
                m.t();
                throw null;
            }
            if (f.b(t3, t10)) {
                return i >= 0;
            }
            i++;
        }
        return false;
    }

    public static e g(h hVar, InterfaceC0646l interfaceC0646l) {
        return new e(hVar, true, interfaceC0646l);
    }

    public static <T> T h(h<? extends T> hVar) {
        Iterator<? extends T> it = hVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static ja.f i(h hVar, InterfaceC0646l interfaceC0646l) {
        return new ja.f(hVar, interfaceC0646l, SequencesKt___SequencesKt$flatMap$2.f23199a);
    }

    public static e j(h hVar, InterfaceC0646l interfaceC0646l) {
        return new e(new o(hVar, interfaceC0646l), false, new Z3.a(13));
    }

    public static <T> List<T> k(h<? extends T> hVar) {
        Iterator<? extends T> it = hVar.iterator();
        if (!it.hasNext()) {
            return EmptyList.f23104a;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
