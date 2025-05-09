package com.google.android.material.bottomsheet;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h.C0784k;

/* compiled from: BottomSheetDialogFragment.java */
/* loaded from: classes.dex */
public class f extends C0784k {
    private boolean waitingForDismissAllowingStateLoss;

    public f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissAfterAnimation() {
        if (this.waitingForDismissAllowingStateLoss) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    private void dismissWithAnimation(BottomSheetBehavior<?> bottomSheetBehavior, boolean z10) {
        this.waitingForDismissAllowingStateLoss = z10;
        if (bottomSheetBehavior.getState() == 5) {
            dismissAfterAnimation();
            return;
        }
        if (getDialog() instanceof e) {
            e eVar = (e) getDialog();
            eVar.f9174f.removeBottomSheetCallback(eVar.f9183p);
        }
        bottomSheetBehavior.addBottomSheetCallback(new a());
        bottomSheetBehavior.setState(5);
    }

    private boolean tryDismissWithAnimation(boolean z10) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof e)) {
            return false;
        }
        ((e) dialog).j().isHideable();
        return false;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d
    public void dismiss() {
        if (tryDismissWithAnimation(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d
    public void dismissAllowingStateLoss() {
        if (tryDismissWithAnimation(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // h.C0784k, androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d
    public Dialog onCreateDialog(Bundle bundle) {
        return new e(getContext(), getTheme());
    }

    @SuppressLint({"ValidFragment"})
    public f(int i) {
        super(i);
    }

    /* compiled from: BottomSheetDialogFragment.java */
    public class a extends BottomSheetBehavior.g {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public final void onStateChanged(View view, int i) {
            if (i == 5) {
                f.this.dismissAfterAnimation();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public final void onSlide(View view, float f10) {
        }
    }
}
