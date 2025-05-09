package S1;

import O9.p;
import androidx.lifecycle.C0558y;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f3349b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3350c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0558y f3351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0650p f3352e;

    public /* synthetic */ h(Executor executor, Ref$ObjectRef ref$ObjectRef, InterfaceC0650p interfaceC0650p, C0558y c0558y) {
        this.f3348a = 2;
        this.f3350c = executor;
        this.f3349b = ref$ObjectRef;
        this.f3352e = interfaceC0650p;
        this.f3351d = c0558y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        switch (this.f3348a) {
            case 0:
                this.f3349b.f23179a = obj;
                T t3 = ((Ref$ObjectRef) this.f3350c).f23179a;
                C0558y c0558y = this.f3351d;
                if (obj == 0 && c0558y.getValue() != 0) {
                    c0558y.setValue(null);
                } else if (obj != 0 && t3 != 0) {
                    c0558y.setValue(this.f3352e.invoke(obj, t3));
                }
                break;
            case 1:
                this.f3349b.f23179a = obj;
                T t10 = ((Ref$ObjectRef) this.f3350c).f23179a;
                C0558y c0558y2 = this.f3351d;
                if (obj == 0 && c0558y2.getValue() != 0) {
                    c0558y2.setValue(null);
                } else if (t10 != 0 && obj != 0) {
                    c0558y2.setValue(this.f3352e.invoke(t10, obj));
                }
                break;
            default:
                ((Executor) this.f3350c).execute(new M.g(this.f3349b, this.f3352e, obj, this.f3351d, 1));
                break;
        }
        return p.f3034a;
    }

    public /* synthetic */ h(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, C0558y c0558y, InterfaceC0650p interfaceC0650p, int i) {
        this.f3348a = i;
        this.f3349b = ref$ObjectRef;
        this.f3350c = ref$ObjectRef2;
        this.f3351d = c0558y;
        this.f3352e = interfaceC0650p;
    }
}
