package Ca;

import Ca.d;
import java.io.IOException;
import kotlin.jvm.internal.Ref$ObjectRef;
import ya.AbstractC1633a;

/* compiled from: TaskQueue.kt */
/* loaded from: classes2.dex */
public final class g extends AbstractC1633a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d.c f780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f781f = false;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f782g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, d.c cVar, r rVar) {
        super(str, true);
        this.f780e = cVar;
        this.f782g = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [Ca.r, T] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // ya.AbstractC1633a
    public final long a() {
        ?? r42;
        long a10;
        n[] nVarArr;
        int i = 0;
        d.c cVar = this.f780e;
        boolean z10 = this.f781f;
        r rVar = this.f782g;
        cVar.getClass();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        d dVar = d.this;
        synchronized (dVar.f753y) {
            synchronized (dVar) {
                try {
                    r rVar2 = dVar.f747s;
                    if (z10) {
                        r42 = rVar;
                    } else {
                        r rVar3 = new r();
                        for (int i9 = 0; i9 < 10; i9++) {
                            if (((1 << i9) & rVar2.f852a) != 0) {
                                rVar3.b(i9, rVar2.f853b[i9]);
                            }
                        }
                        for (int i10 = 0; i10 < 10; i10++) {
                            if (((1 << i10) & rVar.f852a) != 0) {
                                rVar3.b(i10, rVar.f853b[i10]);
                            }
                        }
                        r42 = rVar3;
                    }
                    ref$ObjectRef.f23179a = r42;
                    a10 = r42.a() - rVar2.a();
                    if (a10 != 0 && !dVar.f732c.isEmpty()) {
                        nVarArr = (n[]) dVar.f732c.values().toArray(new n[0]);
                        dVar.f747s = (r) ref$ObjectRef.f23179a;
                        dVar.f739k.c(new e(dVar.f733d + " onSettings", dVar, ref$ObjectRef, i), 0L);
                        O9.p pVar = O9.p.f3034a;
                    }
                    nVarArr = null;
                    dVar.f747s = (r) ref$ObjectRef.f23179a;
                    dVar.f739k.c(new e(dVar.f733d + " onSettings", dVar, ref$ObjectRef, i), 0L);
                    O9.p pVar2 = O9.p.f3034a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                dVar.f753y.d((r) ref$ObjectRef.f23179a);
            } catch (IOException e10) {
                dVar.i(e10);
            }
            O9.p pVar3 = O9.p.f3034a;
        }
        if (nVarArr == null) {
            return -1L;
        }
        int length = nVarArr.length;
        while (i < length) {
            n nVar = nVarArr[i];
            synchronized (nVar) {
                nVar.f819f += a10;
                if (a10 > 0) {
                    nVar.notifyAll();
                }
                O9.p pVar4 = O9.p.f3034a;
            }
            i++;
        }
        return -1L;
    }
}
