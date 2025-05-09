package t1;

import androidx.lifecycle.C0559z;
import s1.InterfaceC1199i;

/* compiled from: OperationImpl.java */
/* renamed from: t1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1278c implements InterfaceC1199i {

    /* renamed from: c, reason: collision with root package name */
    public final C0559z<InterfaceC1199i.a> f27407c = new C0559z<>();

    /* renamed from: d, reason: collision with root package name */
    public final androidx.work.impl.utils.futures.a<InterfaceC1199i.a.c> f27408d = new androidx.work.impl.utils.futures.a<>();

    public C1278c() {
        a(InterfaceC1199i.f26515b);
    }

    public final void a(InterfaceC1199i.a aVar) {
        this.f27407c.postValue(aVar);
        boolean z10 = aVar instanceof InterfaceC1199i.a.c;
        androidx.work.impl.utils.futures.a<InterfaceC1199i.a.c> aVar2 = this.f27408d;
        if (z10) {
            aVar2.i((InterfaceC1199i.a.c) aVar);
        } else if (aVar instanceof InterfaceC1199i.a.C0470a) {
            aVar2.j(((InterfaceC1199i.a.C0470a) aVar).f26516a);
        }
    }
}
