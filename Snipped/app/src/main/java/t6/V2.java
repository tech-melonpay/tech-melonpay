package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentCardLimitsBindingImpl.java */
/* loaded from: classes2.dex */
public final class V2 extends U2 {

    /* renamed from: J, reason: collision with root package name */
    public static final SparseIntArray f28589J;

    /* renamed from: I, reason: collision with root package name */
    public long f28590I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28589J = sparseIntArray;
        sparseIntArray.put(R.id.cardImageView, 1);
        sparseIntArray.put(R.id.nameTextView, 2);
        sparseIntArray.put(R.id.cardNumberTextView, 3);
        sparseIntArray.put(R.id.onlinePurchasesLinear, 4);
        sparseIntArray.put(R.id.bagImageView, 5);
        sparseIntArray.put(R.id.onlinePurchasesTitleTextView, 6);
        sparseIntArray.put(R.id.purchasesDescriptionTextView, 7);
        sparseIntArray.put(R.id.customSwitch, 8);
        sparseIntArray.put(R.id.purchasesProgressBar, 9);
        sparseIntArray.put(R.id.dailyLimitLayout, 10);
        sparseIntArray.put(R.id.dailyLimitTextView, 11);
        sparseIntArray.put(R.id.pb1, 12);
        sparseIntArray.put(R.id.dailyTextView, 13);
        sparseIntArray.put(R.id.dailyTotalLimitTextView, 14);
        sparseIntArray.put(R.id.monthlyProgressBar, 15);
        sparseIntArray.put(R.id.monthlyLimitLayout, 16);
        sparseIntArray.put(R.id.monthlyLimitTextView, 17);
        sparseIntArray.put(R.id.pb2, 18);
        sparseIntArray.put(R.id.monthlyTextView, 19);
        sparseIntArray.put(R.id.monthlyTotalLimitTextView, 20);
        sparseIntArray.put(R.id.paymentsLinear, 21);
        sparseIntArray.put(R.id.paymentsImageView, 22);
        sparseIntArray.put(R.id.paymentsTitleTextView, 23);
        sparseIntArray.put(R.id.paymentsDescriptionTextView, 24);
        sparseIntArray.put(R.id.paymentsSwitch, 25);
        sparseIntArray.put(R.id.paymentsProgressBar, 26);
        sparseIntArray.put(R.id.paymentsDailyLimitLayout, 27);
        sparseIntArray.put(R.id.paymentsDailyLimitTextView, 28);
        sparseIntArray.put(R.id.pb3, 29);
        sparseIntArray.put(R.id.paymentsDailyTextView, 30);
        sparseIntArray.put(R.id.paymentsDailyTotalLimitTextView, 31);
        sparseIntArray.put(R.id.paymentsMonthlyProgressBar, 32);
        sparseIntArray.put(R.id.paymentsMonthlyLimitLayout, 33);
        sparseIntArray.put(R.id.paymentsMonthlyLimitTextView, 34);
        sparseIntArray.put(R.id.pb4, 35);
        sparseIntArray.put(R.id.paymentsMonthlyTextView, 36);
        sparseIntArray.put(R.id.paymentsMonthlyTotalLimitTextView, 37);
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28590I = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28590I != 0;
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
