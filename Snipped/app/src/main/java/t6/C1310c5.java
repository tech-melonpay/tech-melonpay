package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentNewPaymentEuropeanBindingImpl.java */
/* renamed from: t6.c5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1310c5 extends AbstractC1302b5 {

    /* renamed from: D, reason: collision with root package name */
    public static final SparseIntArray f28876D;

    /* renamed from: C, reason: collision with root package name */
    public long f28877C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28876D = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.tab_home, 2);
        sparseIntArray.put(R.id.fromInputLayout, 3);
        sparseIntArray.put(R.id.fromInputView, 4);
        sparseIntArray.put(R.id.img_arrow_from, 5);
        sparseIntArray.put(R.id.image_from, 6);
        sparseIntArray.put(R.id.beneficiaryInputLayout, 7);
        sparseIntArray.put(R.id.beneficiaryInputView, 8);
        sparseIntArray.put(R.id.ibanInputLayout, 9);
        sparseIntArray.put(R.id.ibanInputView, 10);
        sparseIntArray.put(R.id.swiftInputLayout, 11);
        sparseIntArray.put(R.id.swiftInputView, 12);
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
    public C1310c5(F0.c r21, android.view.View r22) {
        /*
            Method dump skipped, instructions count: 183
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1310c5.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28877C = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28877C != 0;
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
