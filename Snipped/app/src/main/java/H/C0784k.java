package h;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d;

/* compiled from: AppCompatDialogFragment.java */
/* renamed from: h.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0784k extends DialogInterfaceOnCancelListenerC0530d {
    public C0784k() {
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC0783j(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d
    public void setupDialog(Dialog dialog, int i) {
        if (!(dialog instanceof DialogC0783j)) {
            super.setupDialog(dialog, i);
            return;
        }
        DialogC0783j dialogC0783j = (DialogC0783j) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialogC0783j.f().u(1);
    }

    public C0784k(int i) {
        super(i);
    }
}
