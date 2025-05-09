package P6;

import D8.a;
import M6.m;
import M6.w;
import O9.p;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.ui.fragments.auth.register.validation.ValidationFragment;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.mobile.R;
import ka.C0967l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f;
import y8.DialogC1630k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3075a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ValidationFragment f3076b;

    public /* synthetic */ b(ValidationFragment validationFragment, int i) {
        this.f3075a = i;
        this.f3076b = validationFragment;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        switch (this.f3075a) {
            case 0:
                String str = (String) obj;
                ValidationFragment validationFragment = this.f3076b;
                w U02 = validationFragment.U0();
                String str2 = validationFragment.T0().f3080d.f11364e;
                if (str2 == null) {
                    str2 = "";
                }
                m mVar = new m(U02, str2, str, 1);
                U02.f2690C1 = mVar;
                mVar.invoke();
                return p.f3034a;
            case 1:
                this.f3076b.getClass();
                return p.f3034a;
            case 2:
                ValidationFragment validationFragment2 = this.f3076b;
                DialogC1630k dialogC1630k = validationFragment2.f11708u0;
                if (dialogC1630k == null) {
                    dialogC1630k = null;
                }
                dialogC1630k.dismiss();
                BottomDialogType.a aVar = BottomDialogType.f13289k;
                validationFragment2.requireContext();
                aVar.getClass();
                BottomDialogType d10 = BottomDialogType.a.d();
                d10.f13295a = validationFragment2.getString(R.string.referral_code_confirmed);
                d10.f13301g = BottomDialogType.Type.OK;
                d10.f13297c = validationFragment2.getString(R.string.done);
                a.C0010a.a(validationFragment2.w0(), d10, new a(validationFragment2, 2), 4);
                return p.f3034a;
            case 3:
                ValidationFragment validationFragment3 = this.f3076b;
                int ordinal = validationFragment3.f11704p0.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        U4.b.g(validationFragment3).j(new d(validationFragment3.T0().f3077a, C0967l.X(String.valueOf(validationFragment3.u0().f29624q.getText()), "+", "", false), String.valueOf(validationFragment3.u0().f29627t.getText()), validationFragment3.T0().f3080d, validationFragment3.T0().f3081e, validationFragment3.T0().f3082f));
                    } else if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (f.b(validationFragment3.T0().f3080d.f11365f, "PARTNER") && f.b(validationFragment3.T0().f3080d.f11364e, "CODE")) {
                    DialogC1630k dialogC1630k2 = new DialogC1630k(validationFragment3.requireContext());
                    validationFragment3.f11708u0 = dialogC1630k2;
                    dialogC1630k2.show();
                    DialogC1630k dialogC1630k3 = validationFragment3.f11708u0;
                    (dialogC1630k3 == null ? null : dialogC1630k3).f31149r = new b(validationFragment3, 0);
                    if (dialogC1630k3 == null) {
                        dialogC1630k3 = null;
                    }
                    dialogC1630k3.f31150s = new a(validationFragment3, 4);
                } else {
                    validationFragment3.V0();
                }
                return p.f3034a;
            case 4:
                ValidationFragment validationFragment4 = this.f3076b;
                if (ValidationFragment.a.f11719a[validationFragment4.f11704p0.ordinal()] == 1) {
                    validationFragment4.V0();
                }
                return p.f3034a;
            default:
                ValidationFragment validationFragment5 = this.f3076b;
                validationFragment5.u0().f29628u.setText(R.string.empty);
                int ordinal2 = validationFragment5.f11704p0.ordinal();
                if (ordinal2 == 0) {
                    validationFragment5.f11706r0 = 30;
                    validationFragment5.W0();
                } else if (ordinal2 == 1) {
                    validationFragment5.f11706r0 = 60;
                    validationFragment5.W0();
                }
                return p.f3034a;
        }
    }
}
