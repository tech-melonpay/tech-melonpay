package R6;

import android.text.Editable;
import android.text.TextWatcher;
import com.luminary.business.presentation.ui.fragments.cardSecurityVerification.CardSecurityVerificationFragment;

/* compiled from: TextView.kt */
/* loaded from: classes2.dex */
public final class d implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CardSecurityVerificationFragment f3266b;

    public /* synthetic */ d(CardSecurityVerificationFragment cardSecurityVerificationFragment, int i) {
        this.f3265a = i;
        this.f3266b = cardSecurityVerificationFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.f3265a;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        int i11 = this.f3265a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        switch (this.f3265a) {
            case 0:
                this.f3266b.X0(String.valueOf(charSequence));
                break;
            default:
                String valueOf = String.valueOf(charSequence);
                CardSecurityVerificationFragment cardSecurityVerificationFragment = this.f3266b;
                cardSecurityVerificationFragment.W0(valueOf, false);
                cardSecurityVerificationFragment.V0();
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
