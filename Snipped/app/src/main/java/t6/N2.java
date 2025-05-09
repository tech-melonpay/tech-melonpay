package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentBusinessActivityBindingImpl.java */
/* loaded from: classes2.dex */
public final class N2 extends M2 {

    /* renamed from: E, reason: collision with root package name */
    public static final SparseIntArray f28214E;

    /* renamed from: D, reason: collision with root package name */
    public long f28215D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28214E = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.tvFiatCurrency, 2);
        sparseIntArray.put(R.id.averageSinglePaymentInputLayout, 3);
        sparseIntArray.put(R.id.averageSinglePaymentInputView, 4);
        sparseIntArray.put(R.id.plannedMonthTurnoverInputLayout, 5);
        sparseIntArray.put(R.id.plannedMonthTurnoverInputView, 6);
        sparseIntArray.put(R.id.numberOfIncomingPaymentsInputLayout, 7);
        sparseIntArray.put(R.id.numberOfIncomingPaymentsInputView, 8);
        sparseIntArray.put(R.id.numberOfOutgoingPaymentsInputLayout, 9);
        sparseIntArray.put(R.id.numberOfOutgoingPaymentsInputView, 10);
        sparseIntArray.put(R.id.incomingPaymentsInputLayout, 11);
        sparseIntArray.put(R.id.incomingPaymentsInputView, 12);
        sparseIntArray.put(R.id.incomingTagGroup, 13);
        sparseIntArray.put(R.id.outgoingPaymentsInputLayout, 14);
        sparseIntArray.put(R.id.outgoingPaymentsInputView, 15);
        sparseIntArray.put(R.id.outgoingTagGroup, 16);
        sparseIntArray.put(R.id.currencyInputLayout, 17);
        sparseIntArray.put(R.id.currencyInputView, 18);
        sparseIntArray.put(R.id.currencyTagGroup, 19);
        sparseIntArray.put(R.id.tvBusinessInformation, 20);
        sparseIntArray.put(R.id.tvRequireLicense, 21);
        sparseIntArray.put(R.id.rgCurrency, 22);
        sparseIntArray.put(R.id.rbYes, 23);
        sparseIntArray.put(R.id.rbNo, 24);
        sparseIntArray.put(R.id.banks_list, 25);
        sparseIntArray.put(R.id.layoutAddBank, 26);
        sparseIntArray.put(R.id.button_done, 27);
        sparseIntArray.put(R.id.button_done_k, 28);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public N2(F0.c r22, android.view.View r23) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.N2.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28215D = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28215D != 0;
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
