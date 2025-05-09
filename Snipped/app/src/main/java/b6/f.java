package B6;

import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.base.BaseFragment;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f405a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f406b;

    public /* synthetic */ f(BaseFragment baseFragment, int i) {
        this.f405a = i;
        this.f406b = baseFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f405a) {
            case 0:
                return new gb.a(new ArrayList(new P9.g(new Object[]{this.f406b.requireContext()}, false)));
            default:
                return Boolean.valueOf(this.f406b.C0());
        }
    }
}
