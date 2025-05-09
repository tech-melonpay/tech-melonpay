package P6;

import C.v;
import D7.e;
import F8.o;
import M6.l;
import M6.m;
import M6.w;
import O9.p;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.fragments.auth.register.validation.ValidationFragment;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.mobile.R;
import ka.C0967l;
import ka.C0970o;
import kotlin.jvm.internal.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ValidationFragment f3074b;

    public /* synthetic */ a(ValidationFragment validationFragment, int i) {
        this.f3073a = i;
        this.f3074b = validationFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f3073a) {
            case 0:
                this.f3074b.W0();
                break;
            case 1:
                NavController g10 = U4.b.g(this.f3074b);
                g10.i(R.id.action_validationFragment_to_countrySelectFragment, v.h(g10, "isCountryCode", true, "fieldName", ""));
                break;
            case 2:
                this.f3074b.V0();
                break;
            case 3:
                this.f3074b.w0().dismiss();
                break;
            case 4:
                this.f3074b.V0();
                break;
            case 5:
                ValidationFragment validationFragment = this.f3074b;
                U4.b.g(validationFragment).j(new d(validationFragment.T0().f3077a, C0967l.X(String.valueOf(validationFragment.u0().f29624q.getText()), "+", "", false), String.valueOf(validationFragment.u0().f29627t.getText()), validationFragment.T0().f3080d, validationFragment.T0().f3081e, validationFragment.T0().f3082f));
                break;
            case 6:
                ValidationFragment validationFragment2 = this.f3074b;
                int ordinal = validationFragment2.f11704p0.ordinal();
                if (ordinal == 0) {
                    w U02 = validationFragment2.U0();
                    l lVar = new l(U02, 1);
                    U02.f420L0 = lVar;
                    lVar.invoke();
                    validationFragment2.u0().f29629v.setVisibility(0);
                } else if (ordinal == 1) {
                    String str = validationFragment2.T0().f3078b;
                    String q02 = D9.b.q0(String.valueOf(validationFragment2.u0().f29627t.getText()));
                    String X = C0967l.X(String.valueOf(validationFragment2.u0().f29624q.getText()), "+", "", false);
                    String n10 = v.n(validationFragment2.T0().f3078b, validationFragment2.T0().f3079c);
                    if (f.b(n10, X + q02)) {
                        validationFragment2.u0().f29629v.setVisibility(0);
                        w U03 = validationFragment2.U0();
                        m mVar = new m(U03, X, q02, 0);
                        U03.f421M0 = mVar;
                        mVar.invoke();
                        validationFragment2.f11709v0 = false;
                        o.b(validationFragment2.u0().f29631x);
                    } else {
                        BottomDialogType.f13289k.getClass();
                        BottomDialogType c2 = BottomDialogType.a.c();
                        c2.f13297c = validationFragment2.getString(R.string.continue_btn);
                        c2.f13298d = Integer.valueOf(R.drawable.button_bg);
                        c2.f13299e = validationFragment2.getString(R.string.cancel);
                        c2.f13296b = validationFragment2.getString(R.string.phone_number_has_been_changed, n10, v.n(str, q02));
                        c2.f13295a = validationFragment2.getString(R.string.phone_number_change);
                        c2.f13301g = BottomDialogType.Type.HELP;
                        c2.f13302h = Float.valueOf(28.0f);
                        validationFragment2.w0().c(c2, new e(X, q02, 2, validationFragment2), new a(validationFragment2, 3));
                    }
                    break;
                }
                break;
            case 7:
                ValidationFragment validationFragment3 = this.f3074b;
                final String z02 = C0970o.z0(5, String.valueOf(validationFragment3.u0().f29628u.getText()));
                int ordinal2 = validationFragment3.f11704p0.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        if (validationFragment3.U0().f2702c1.A()) {
                            U4.b.g(validationFragment3).j(new d(validationFragment3.T0().f3077a, C0967l.X(String.valueOf(validationFragment3.u0().f29624q.getText()), "+", "", false), String.valueOf(validationFragment3.u0().f29627t.getText()), validationFragment3.T0().f3080d, validationFragment3.T0().f3081e, validationFragment3.T0().f3082f));
                        } else {
                            final w U04 = validationFragment3.U0();
                            final int i = 0;
                            InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: M6.r
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i) {
                                        case 0:
                                            w wVar = U04;
                                            wVar.l();
                                            wVar.f2698Y0.a(new n(wVar, 1), z02);
                                            break;
                                        default:
                                            w wVar2 = U04;
                                            wVar2.l();
                                            wVar2.f2697X0.a(new n(wVar2, 0), z02);
                                            break;
                                    }
                                    return O9.p.f3034a;
                                }
                            };
                            U04.f422O0 = interfaceC0635a;
                            interfaceC0635a.invoke();
                        }
                    }
                } else if (validationFragment3.U0().f2702c1.e()) {
                    validationFragment3.V0();
                } else {
                    final w U05 = validationFragment3.U0();
                    final int i9 = 1;
                    InterfaceC0635a<p> interfaceC0635a2 = new InterfaceC0635a() { // from class: M6.r
                        @Override // ca.InterfaceC0635a
                        public final Object invoke() {
                            switch (i9) {
                                case 0:
                                    w wVar = U05;
                                    wVar.l();
                                    wVar.f2698Y0.a(new n(wVar, 1), z02);
                                    break;
                                default:
                                    w wVar2 = U05;
                                    wVar2.l();
                                    wVar2.f2697X0.a(new n(wVar2, 0), z02);
                                    break;
                            }
                            return O9.p.f3034a;
                        }
                    };
                    U05.N0 = interfaceC0635a2;
                    interfaceC0635a2.invoke();
                }
                break;
            default:
                this.f3074b.u0().f29621n.callOnClick();
                break;
        }
        return p.f3034a;
    }
}
