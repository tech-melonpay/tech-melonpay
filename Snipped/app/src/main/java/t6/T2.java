package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentCardDetailsBindingImpl.java */
/* loaded from: classes2.dex */
public final class T2 extends S2 {

    /* renamed from: K, reason: collision with root package name */
    public static final SparseIntArray f28503K;

    /* renamed from: J, reason: collision with root package name */
    public long f28504J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28503K = sparseIntArray;
        sparseIntArray.put(R.id.tvTitleEmptyCard, 1);
        sparseIntArray.put(R.id.textView3, 2);
        sparseIntArray.put(R.id.button_accept, 3);
        sparseIntArray.put(R.id.button_transactions, 4);
        sparseIntArray.put(R.id.viewPager, 5);
        sparseIntArray.put(R.id.dots_indicator, 6);
        sparseIntArray.put(R.id.btnUnfreeze, 7);
        sparseIntArray.put(R.id.view2, 8);
        sparseIntArray.put(R.id.tvLimits, 9);
        sparseIntArray.put(R.id.tab_limits, 10);
        sparseIntArray.put(R.id.ivShopping, 11);
        sparseIntArray.put(R.id.pb1, 12);
        sparseIntArray.put(R.id.tvShoppingPercent, 13);
        sparseIntArray.put(R.id.ivContactless, 14);
        sparseIntArray.put(R.id.pb2, 15);
        sparseIntArray.put(R.id.tvContactlessPercent, 16);
        sparseIntArray.put(R.id.tvChangeLimits, 17);
        sparseIntArray.put(R.id.view1, 18);
        sparseIntArray.put(R.id.clTransaction, 19);
        sparseIntArray.put(R.id.tvTransactionTitle, 20);
        sparseIntArray.put(R.id.tvTransactionDescription, 21);
        sparseIntArray.put(R.id.cl3ds, 22);
        sparseIntArray.put(R.id.tv3dsTitle, 23);
        sparseIntArray.put(R.id.tv3dsDescription, 24);
        sparseIntArray.put(R.id.clChangeName, 25);
        sparseIntArray.put(R.id.tvChangeNameTitle, 26);
        sparseIntArray.put(R.id.tvChangeNameDescription, 27);
        sparseIntArray.put(R.id.clFreeze, 28);
        sparseIntArray.put(R.id.tvFreezeTitle, 29);
        sparseIntArray.put(R.id.tvFreezeDescription, 30);
        sparseIntArray.put(R.id.clClose, 31);
        sparseIntArray.put(R.id.tvCloseTitle, 32);
        sparseIntArray.put(R.id.tvCloseDescription, 33);
        sparseIntArray.put(R.id.bgEnabled, 34);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T2(F0.c r27, android.view.View r28) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.T2.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28504J = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28504J != 0;
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
