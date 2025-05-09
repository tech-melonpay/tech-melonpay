package t6;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: FragmentNewPaymentBindingImpl.java */
/* loaded from: classes2.dex */
public final class Y4 extends AbstractC1459w {

    /* renamed from: o, reason: collision with root package name */
    public static final SparseIntArray f28709o;

    /* renamed from: n, reason: collision with root package name */
    public long f28710n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28709o = sparseIntArray;
        sparseIntArray.put(R.id.epoxyRecyclerView, 1);
        sparseIntArray.put(R.id.empty_layout, 2);
        sparseIntArray.put(R.id.empty_text, 3);
        sparseIntArray.put(R.id.button_done, 4);
        sparseIntArray.put(R.id.button_done_k, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y4(F0.c cVar, View view) {
        super(cVar, view, 0);
        Object[] h9 = F0.f.h(view, 6, f28709o);
        this.f28710n = -1L;
        ((ConstraintLayout) h9[0]).setTag(null);
        l(view);
        synchronized (this) {
            this.f28710n = 1L;
        }
        i();
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28710n = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28710n != 0;
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
