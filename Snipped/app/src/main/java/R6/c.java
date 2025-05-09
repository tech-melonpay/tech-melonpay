package R6;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.luminary.business.presentation.ui.fragments.cardSecurityVerification.CardSecurityVerificationFragment;
import com.luminary.business.presentation.ui.fragments.cardSecurityVerification.editCardSecurityVerification.EditCardSecurityVerificationFragment;
import t.m0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3263c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3264d;

    public /* synthetic */ c(int i, Object obj, Object obj2, boolean z10) {
        this.f3261a = i;
        this.f3264d = obj;
        this.f3262b = obj2;
        this.f3263c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3261a) {
            case 0:
                CardSecurityVerificationFragment cardSecurityVerificationFragment = (CardSecurityVerificationFragment) this.f3264d;
                if (cardSecurityVerificationFragment.isAdded()) {
                    String str = (String) this.f3262b;
                    if (str != null && str.length() != 0) {
                        if (!this.f3263c) {
                            cardSecurityVerificationFragment.u0().f28623p.setHelperText(str);
                            break;
                        } else {
                            cardSecurityVerificationFragment.u0().f28623p.setErrorWithoutFocus(str);
                            break;
                        }
                    } else {
                        cardSecurityVerificationFragment.u0().f28623p.setError(null);
                        cardSecurityVerificationFragment.u0().f28623p.setHelperText(null);
                        break;
                    }
                }
                break;
            case 1:
                EditCardSecurityVerificationFragment editCardSecurityVerificationFragment = (EditCardSecurityVerificationFragment) this.f3264d;
                if (editCardSecurityVerificationFragment.isAdded()) {
                    String str2 = (String) this.f3262b;
                    if (str2 != null && str2.length() != 0) {
                        if (!this.f3263c) {
                            editCardSecurityVerificationFragment.u0().f28623p.setHelperText(str2);
                            break;
                        } else {
                            editCardSecurityVerificationFragment.u0().f28623p.setErrorWithoutFocus(str2);
                            break;
                        }
                    } else {
                        editCardSecurityVerificationFragment.u0().f28623p.setError(null);
                        editCardSecurityVerificationFragment.u0().f28623p.setHelperText(null);
                        break;
                    }
                }
                break;
            default:
                ((m0) this.f3264d).a((CallbackToFutureAdapter.a) this.f3262b, this.f3263c);
                break;
        }
    }
}
