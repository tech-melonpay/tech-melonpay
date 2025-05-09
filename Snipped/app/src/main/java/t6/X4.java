package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentNewPaymentBankEmailBindingImpl.java */
/* loaded from: classes2.dex */
public final class X4 extends W4 {

    /* renamed from: F, reason: collision with root package name */
    public static final SparseIntArray f28668F;

    /* renamed from: E, reason: collision with root package name */
    public long f28669E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28668F = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.fromInputLayout, 2);
        sparseIntArray.put(R.id.fromInputView, 3);
        sparseIntArray.put(R.id.img_arrow_from, 4);
        sparseIntArray.put(R.id.image_from, 5);
        sparseIntArray.put(R.id.beneficiaryInputLayout, 6);
        sparseIntArray.put(R.id.beneficiaryInputView, 7);
        sparseIntArray.put(R.id.nameWasAdjusted, 8);
        sparseIntArray.put(R.id.emailInputLayout, 9);
        sparseIntArray.put(R.id.emailInputView, 10);
        sparseIntArray.put(R.id.bankInputLayout, 11);
        sparseIntArray.put(R.id.bankInputView, 12);
        sparseIntArray.put(R.id.amountInputLayout, 13);
        sparseIntArray.put(R.id.amountInputView, 14);
        sparseIntArray.put(R.id.feeInputLayout, 15);
        sparseIntArray.put(R.id.feeInputView, 16);
        sparseIntArray.put(R.id.referenceInputLayout, 17);
        sparseIntArray.put(R.id.referenceInputView, 18);
        sparseIntArray.put(R.id.balance, 19);
        sparseIntArray.put(R.id.button_done, 20);
        sparseIntArray.put(R.id.button_done_k, 21);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X4(F0.c r23, android.view.View r24) {
        /*
            Method dump skipped, instructions count: 193
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.X4.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28669E = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28669E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        return true;
    }
}
