package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentSellCryptoExternalInfoBindingImpl.java */
/* loaded from: classes2.dex */
public final class L5 extends K5 {

    /* renamed from: D, reason: collision with root package name */
    public static final SparseIntArray f28110D;

    /* renamed from: C, reason: collision with root package name */
    public long f28111C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28110D = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.tvYouSell, 2);
        sparseIntArray.put(R.id.constraintLayout6, 3);
        sparseIntArray.put(R.id.ic_currency, 4);
        sparseIntArray.put(R.id.title, 5);
        sparseIntArray.put(R.id.description, 6);
        sparseIntArray.put(R.id.amount, 7);
        sparseIntArray.put(R.id.constraintLayout7, 8);
        sparseIntArray.put(R.id.tvFromAddress, 9);
        sparseIntArray.put(R.id.tvAddress, 10);
        sparseIntArray.put(R.id.tvYouReceive, 11);
        sparseIntArray.put(R.id.constraintLayout8, 12);
        sparseIntArray.put(R.id.ic_account, 13);
        sparseIntArray.put(R.id.account_title, 14);
        sparseIntArray.put(R.id.account_description, 15);
        sparseIntArray.put(R.id.account_amount, 16);
        sparseIntArray.put(R.id.layoutAddAccount, 17);
        sparseIntArray.put(R.id.tvSelectAccount, 18);
        sparseIntArray.put(R.id.constraintLayout10, 19);
        sparseIntArray.put(R.id.tvToAccount, 20);
        sparseIntArray.put(R.id.to_account_title, 21);
        sparseIntArray.put(R.id.to_account_description, 22);
        sparseIntArray.put(R.id.button_done, 23);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public L5(F0.c r21, android.view.View r22) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.L5.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28111C = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28111C != 0;
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
