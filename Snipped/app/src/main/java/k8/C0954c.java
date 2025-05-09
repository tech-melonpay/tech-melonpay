package k8;

import B6.g;
import O9.p;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.ui.fragments.plans.SelectPlansFragment;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.mobile.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f;

/* compiled from: R8$$SyntheticClass */
/* renamed from: k8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0954c implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectPlansFragment f23051b;

    public /* synthetic */ C0954c(SelectPlansFragment selectPlansFragment, int i) {
        this.f23050a = i;
        this.f23051b = selectPlansFragment;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        Object obj2;
        switch (this.f23050a) {
            case 0:
                SelectPlansFragment selectPlansFragment = this.f23051b;
                selectPlansFragment.u0().f28013n.setModels(selectPlansFragment.T0((List) obj));
                break;
            case 1:
                SelectPlansFragment selectPlansFragment2 = this.f23051b;
                selectPlansFragment2.getClass();
                BottomDialogType.a aVar = BottomDialogType.f13289k;
                selectPlansFragment2.requireContext();
                aVar.getClass();
                BottomDialogType d10 = BottomDialogType.a.d();
                d10.f13295a = selectPlansFragment2.getString(R.string.you_have_activated_your_new_plan);
                d10.f13297c = selectPlansFragment2.getString(R.string.done);
                selectPlansFragment2.w0().c(d10, new g(13), null);
                break;
            case 2:
                int intValue = ((Integer) obj).intValue();
                SelectPlansFragment selectPlansFragment3 = this.f23051b;
                List<C5.a> value = ((C0953b) selectPlansFragment3.f12965p0.getValue()).f23048W0.getValue();
                if (value != null) {
                    Iterator<T> it = value.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            Integer num = ((C5.a) obj2).f664a;
                            if (num != null && num.intValue() == intValue) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    C5.a aVar2 = (C5.a) obj2;
                    if (aVar2 != null) {
                        if (!f.b(aVar2.i, Boolean.TRUE)) {
                            BottomDialogType.f13289k.getClass();
                            BottomDialogType c2 = BottomDialogType.a.c();
                            c2.f13297c = selectPlansFragment3.getString(R.string.confirm);
                            c2.f13299e = selectPlansFragment3.getString(R.string.back);
                            C5.b bVar = aVar2.f666c;
                            c2.f13295a = selectPlansFragment3.getString(R.string.activate_q, bVar != null ? bVar.f673a : null);
                            c2.f13296b = selectPlansFragment3.getString(R.string.please_confirm_your_upgrade_to_bank_app_business_plus_for_12_a_month, bVar != null ? bVar.f673a : null, bVar != null ? bVar.f674b : null);
                            selectPlansFragment3.w0().c(c2, new A7.c(19, aVar2, selectPlansFragment3), null);
                        }
                    }
                }
                break;
            default:
                ((Integer) obj).intValue();
                this.f23051b.getClass();
                break;
        }
        return p.f3034a;
    }
}
