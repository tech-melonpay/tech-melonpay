package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentCryptoExchangeBindingImpl.java */
/* loaded from: classes2.dex */
public final class F3 extends E3 {

    /* renamed from: H, reason: collision with root package name */
    public static final SparseIntArray f27863H;

    /* renamed from: G, reason: collision with root package name */
    public long f27864G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27863H = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.tab_home, 2);
        sparseIntArray.put(R.id.clCurrency, 3);
        sparseIntArray.put(R.id.fromInputLayout, 4);
        sparseIntArray.put(R.id.fromInputView, 5);
        sparseIntArray.put(R.id.tvBalance, 6);
        sparseIntArray.put(R.id.tvError, 7);
        sparseIntArray.put(R.id.img_arrow_from, 8);
        sparseIntArray.put(R.id.image_from, 9);
        sparseIntArray.put(R.id.view3, 10);
        sparseIntArray.put(R.id.constraintLayout3, 11);
        sparseIntArray.put(R.id.currency_rate, 12);
        sparseIntArray.put(R.id.constraintLayout4, 13);
        sparseIntArray.put(R.id.fee, 14);
        sparseIntArray.put(R.id.toInputLayout, 15);
        sparseIntArray.put(R.id.toInputView, 16);
        sparseIntArray.put(R.id.img_arrow_to, 17);
        sparseIntArray.put(R.id.image_to, 18);
        sparseIntArray.put(R.id.to_account_amount, 19);
        sparseIntArray.put(R.id.to_account_amount_dot, 20);
        sparseIntArray.put(R.id.tvRatesAreIndicative, 21);
        sparseIntArray.put(R.id.button_done, 22);
        sparseIntArray.put(R.id.button_done_k, 23);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public F3(F0.c r25, android.view.View r26) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.F3.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f27864G = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f27864G != 0;
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
