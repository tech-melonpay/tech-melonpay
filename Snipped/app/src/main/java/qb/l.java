package qb;

import java.lang.reflect.Array;
import java.util.Iterator;

/* compiled from: ParameterHandler.java */
/* loaded from: classes3.dex */
public final class l extends m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25972a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f25973b;

    public /* synthetic */ l(m mVar, int i) {
        this.f25972a = i;
        this.f25973b = mVar;
    }

    @Override // qb.m
    public final void a(o oVar, Object obj) {
        switch (this.f25972a) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.f25973b.a(oVar, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        this.f25973b.a(oVar, Array.get(obj, i));
                    }
                    break;
                }
                break;
        }
    }
}
