package y6;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.luminary.business.presentation.ui.fragments.fee.fee_list.AllFeeFragment;
import io.sentry.U;
import io.sentry.V;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* renamed from: y6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1616b implements BottomNavigationView.b, SwipeRefreshLayout.f, V {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f31119a;

    public /* synthetic */ C1616b(Object obj) {
        this.f31119a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, io.sentry.w] */
    @Override // io.sentry.V
    public void c(U u6) {
        ((Ref$ObjectRef) this.f31119a).f23179a = u6.f21896b;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void e() {
        AllFeeFragment allFeeFragment = (AllFeeFragment) this.f31119a;
        allFeeFragment.f12233q0 = "";
        allFeeFragment.f12234r0 = "";
        allFeeFragment.L0();
        allFeeFragment.o0();
        allFeeFragment.T0().h0();
    }
}
