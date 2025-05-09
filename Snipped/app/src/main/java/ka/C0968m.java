package ka;

import ca.InterfaceC0650p;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineContextKt;

/* compiled from: R8$$SyntheticClass */
/* renamed from: ka.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0968m implements InterfaceC0650p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23081b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23082c;

    public /* synthetic */ C0968m(boolean z10, int i, Object obj) {
        this.f23080a = i;
        this.f23082c = obj;
        this.f23081b = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0650p
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d foldCopies$lambda$1;
        switch (this.f23080a) {
            case 0:
                int h02 = C0969n.h0((CharSequence) obj, (char[]) this.f23082c, ((Integer) obj2).intValue(), this.f23081b);
                if (h02 < 0) {
                    return null;
                }
                return new Pair(Integer.valueOf(h02), 1);
            case 1:
                Pair b02 = C0969n.b0((CharSequence) obj, (List) this.f23082c, ((Integer) obj2).intValue(), this.f23081b);
                if (b02 == null) {
                    return null;
                }
                return new Pair(b02.f23089a, Integer.valueOf(((String) b02.f23090b).length()));
            default:
                foldCopies$lambda$1 = CoroutineContextKt.foldCopies$lambda$1((Ref$ObjectRef) this.f23082c, this.f23081b, (kotlin.coroutines.d) obj, (d.b) obj2);
                return foldCopies$lambda$1;
        }
    }
}
