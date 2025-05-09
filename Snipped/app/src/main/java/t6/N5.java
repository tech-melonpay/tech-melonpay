package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentSellExternalAccountSelectBindingImpl.java */
/* loaded from: classes2.dex */
public final class N5 extends M5 {

    /* renamed from: I, reason: collision with root package name */
    public static final SparseIntArray f28220I;

    /* renamed from: H, reason: collision with root package name */
    public long f28221H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28220I = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.tab_home, 2);
        sparseIntArray.put(R.id.viewFlipper, 3);
        sparseIntArray.put(R.id.epoxyRecyclerView, 4);
        sparseIntArray.put(R.id.countryInputLayout, 5);
        sparseIntArray.put(R.id.countryInputView, 6);
        sparseIntArray.put(R.id.imageView6, 7);
        sparseIntArray.put(R.id.clDetails, 8);
        sparseIntArray.put(R.id.beneficiaryInputLayout, 9);
        sparseIntArray.put(R.id.beneficiaryInputView, 10);
        sparseIntArray.put(R.id.ibanInputLayout, 11);
        sparseIntArray.put(R.id.ibanInputView, 12);
        sparseIntArray.put(R.id.swiftInputLayout, 13);
        sparseIntArray.put(R.id.swiftInputView, 14);
        sparseIntArray.put(R.id.sortCodeInputLayout, 15);
        sparseIntArray.put(R.id.sortCodeInputView, 16);
        sparseIntArray.put(R.id.accountNumberInputLayout, 17);
        sparseIntArray.put(R.id.accountNumberInputView, 18);
        sparseIntArray.put(R.id.bankNameInputLayout, 19);
        sparseIntArray.put(R.id.bankNameInputView, 20);
        sparseIntArray.put(R.id.bankAddressInputLayout, 21);
        sparseIntArray.put(R.id.bankAddressInputView, 22);
        sparseIntArray.put(R.id.button_done, 23);
        sparseIntArray.put(R.id.button_done_k, 24);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public N5(F0.c r26, android.view.View r27) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.N5.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28221H = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28221H != 0;
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
