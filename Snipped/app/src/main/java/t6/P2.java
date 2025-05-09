package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentBuyCryptoExternalDetailsBindingImpl.java */
/* loaded from: classes2.dex */
public final class P2 extends O2 {

    /* renamed from: H, reason: collision with root package name */
    public static final SparseIntArray f28317H;

    /* renamed from: G, reason: collision with root package name */
    public long f28318G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28317H = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.constraintLayout6, 2);
        sparseIntArray.put(R.id.ic_currency, 3);
        sparseIntArray.put(R.id.title, 4);
        sparseIntArray.put(R.id.amount, 5);
        sparseIntArray.put(R.id.countryInputLayout, 6);
        sparseIntArray.put(R.id.countryInputView, 7);
        sparseIntArray.put(R.id.imageView6, 8);
        sparseIntArray.put(R.id.clDetails, 9);
        sparseIntArray.put(R.id.ivCopy, 10);
        sparseIntArray.put(R.id.payment_type, 11);
        sparseIntArray.put(R.id.first_label, 12);
        sparseIntArray.put(R.id.second_label, 13);
        sparseIntArray.put(R.id.third_label, 14);
        sparseIntArray.put(R.id.first_value, 15);
        sparseIntArray.put(R.id.second_value, 16);
        sparseIntArray.put(R.id.third_value, 17);
        sparseIntArray.put(R.id.fourth_label, 18);
        sparseIntArray.put(R.id.fourth_value, 19);
        sparseIntArray.put(R.id.fifth_label, 20);
        sparseIntArray.put(R.id.fifth_value, 21);
        sparseIntArray.put(R.id.button_continue, 22);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public P2(F0.c r25, android.view.View r26) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.P2.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28318G = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28318G != 0;
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
