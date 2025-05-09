package S6;

import android.text.Editable;
import android.text.TextWatcher;
import com.luminary.business.presentation.ui.fragments.cardSecurityVerification.editCardSecurityVerification.EditCardSecurityVerificationFragment;

/* compiled from: TextView.kt */
/* loaded from: classes2.dex */
public final class b implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3379a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditCardSecurityVerificationFragment f3380b;

    public /* synthetic */ b(EditCardSecurityVerificationFragment editCardSecurityVerificationFragment, int i) {
        this.f3379a = i;
        this.f3380b = editCardSecurityVerificationFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.f3379a;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        int i11 = this.f3379a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        switch (this.f3379a) {
            case 0:
                this.f3380b.V0(String.valueOf(charSequence));
                break;
            default:
                EditCardSecurityVerificationFragment editCardSecurityVerificationFragment = this.f3380b;
                editCardSecurityVerificationFragment.U0(String.valueOf(editCardSecurityVerificationFragment.u0().f28624q.getText()), false);
                editCardSecurityVerificationFragment.T0();
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i, int i9, int i10, CharSequence charSequence) {
    }

    private final void d(int i, int i9, int i10, CharSequence charSequence) {
    }
}
