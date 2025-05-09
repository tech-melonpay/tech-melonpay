package F8;

import O9.p;
import androidx.lifecycle.C0558y;
import ca.InterfaceC0646l;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: FragmentExt.kt */
/* loaded from: classes2.dex */
public final class h implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f1268b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0558y f1269c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f1270d;

    public /* synthetic */ h(Ref$ObjectRef ref$ObjectRef, C0558y c0558y, Ref$ObjectRef ref$ObjectRef2, int i) {
        this.f1267a = i;
        this.f1268b = ref$ObjectRef;
        this.f1269c = c0558y;
        this.f1270d = ref$ObjectRef2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        switch (this.f1267a) {
            case 0:
                this.f1268b.f23179a = obj;
                this.f1269c.setValue(new Pair(obj, this.f1270d.f23179a));
                break;
            default:
                this.f1268b.f23179a = obj;
                this.f1269c.setValue(new Pair(this.f1270d.f23179a, obj));
                break;
        }
        return p.f3034a;
    }
}
