package androidx.core.view;

import O9.p;
import V9.d;
import android.view.View;
import android.view.ViewGroup;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import ja.j;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import y0.v;

/* compiled from: View.kt */
@d(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {410, 412}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lja/j;", "Landroid/view/View;", "LO9/p;", "<anonymous>", "(Lja/j;)V"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ViewKt$allViews$1 extends RestrictedSuspendLambda implements InterfaceC0650p<j<? super View>, T9.a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public int f6501u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f6502v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ View f6503w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, T9.a<? super ViewKt$allViews$1> aVar) {
        super(2, aVar);
        this.f6503w = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.f6503w, aVar);
        viewKt$allViews$1.f6502v = obj;
        return viewKt$allViews$1;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(j<? super View> jVar, T9.a<? super p> aVar) {
        return ((ViewKt$allViews$1) create(jVar, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.f6501u;
        View view = this.f6503w;
        if (i == 0) {
            b.b(obj);
            j jVar = (j) this.f6502v;
            this.f6502v = jVar;
            this.f6501u = 1;
            jVar.a(view, this);
            return coroutineSingletons;
        }
        if (i == 1) {
            j jVar2 = (j) this.f6502v;
            b.b(obj);
            if (view instanceof ViewGroup) {
                this.f6502v = null;
                this.f6501u = 2;
                jVar2.getClass();
                Object c2 = jVar2.c(new v(new P9.v((ViewGroup) view, 4), new InterfaceC0646l<View, Iterator<? extends View>>() { // from class: androidx.core.view.ViewGroupKt$descendants$1$1
                    @Override // ca.InterfaceC0646l
                    public final Iterator<? extends View> invoke(View view2) {
                        View view3 = view2;
                        ViewGroup viewGroup = view3 instanceof ViewGroup ? (ViewGroup) view3 : null;
                        if (viewGroup != null) {
                            return new P9.v(viewGroup, 4);
                        }
                        return null;
                    }
                }), this);
                if (c2 != coroutineSingletons) {
                    c2 = p.f3034a;
                }
                if (c2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return p.f3034a;
    }
}
