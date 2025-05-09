package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentNewPaymentUkBindingImpl.java */
/* renamed from: t6.m5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1390m5 extends AbstractC1382l5 {

    /* renamed from: G, reason: collision with root package name */
    public static final SparseIntArray f29323G;

    /* renamed from: F, reason: collision with root package name */
    public long f29324F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29323G = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.tab_home, 2);
        sparseIntArray.put(R.id.fromInputLayout, 3);
        sparseIntArray.put(R.id.fromInputView, 4);
        sparseIntArray.put(R.id.img_arrow_from, 5);
        sparseIntArray.put(R.id.image_from, 6);
        sparseIntArray.put(R.id.beneficiaryInputLayout, 7);
        sparseIntArray.put(R.id.beneficiaryInputView, 8);
        sparseIntArray.put(R.id.sortCodeInputLayout, 9);
        sparseIntArray.put(R.id.sortCodeInputView, 10);
        sparseIntArray.put(R.id.accountNumberInputLayout, 11);
        sparseIntArray.put(R.id.accountNumberInputView, 12);
        sparseIntArray.put(R.id.referenceInputLayout, 13);
        sparseIntArray.put(R.id.referenceInputView, 14);
        sparseIntArray.put(R.id.amountInputLayout, 15);
        sparseIntArray.put(R.id.amountInputView, 16);
        sparseIntArray.put(R.id.balance, 17);
        sparseIntArray.put(R.id.balanceD, 18);
        sparseIntArray.put(R.id.button_done, 19);
        sparseIntArray.put(R.id.button_done_k, 20);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1390m5(F0.c r24, android.view.View r25) {
        /*
            Method dump skipped, instructions count: 189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1390m5.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29324F = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29324F != 0;
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
