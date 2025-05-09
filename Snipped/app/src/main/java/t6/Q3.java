package t6;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: FragmentExchangeBindingImpl.java */
/* loaded from: classes2.dex */
public final class Q3 extends AbstractC1459w {

    /* renamed from: o, reason: collision with root package name */
    public static final SparseIntArray f28390o;

    /* renamed from: n, reason: collision with root package name */
    public long f28391n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28390o = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.fromInputLayout, 2);
        sparseIntArray.put(R.id.fromInputView, 3);
        sparseIntArray.put(R.id.img_arrow_from, 4);
        sparseIntArray.put(R.id.image_from, 5);
        sparseIntArray.put(R.id.view3, 6);
        sparseIntArray.put(R.id.constraintLayout3, 7);
        sparseIntArray.put(R.id.currency_rate, 8);
        sparseIntArray.put(R.id.toInputLayout, 9);
        sparseIntArray.put(R.id.toInputView, 10);
        sparseIntArray.put(R.id.img_arrow_to, 11);
        sparseIntArray.put(R.id.image_to, 12);
        sparseIntArray.put(R.id.from_account_amount, 13);
        sparseIntArray.put(R.id.from_account_amount_dot, 14);
        sparseIntArray.put(R.id.to_account_amount, 15);
        sparseIntArray.put(R.id.to_account_amount_dot, 16);
        sparseIntArray.put(R.id.button_done, 17);
        sparseIntArray.put(R.id.button_done_k, 18);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q3(F0.c cVar, View view) {
        super(cVar, view, 0);
        Object[] h9 = F0.f.h(view, 19, f28390o);
        this.f28391n = -1L;
        ((ConstraintLayout) h9[0]).setTag(null);
        l(view);
        synchronized (this) {
            this.f28391n = 1L;
        }
        i();
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28391n = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28391n != 0;
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
