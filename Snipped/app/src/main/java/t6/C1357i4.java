package t6;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: FragmentLoansApplyBindingImpl.java */
/* renamed from: t6.i4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1357i4 extends AbstractC1459w {

    /* renamed from: o, reason: collision with root package name */
    public static final SparseIntArray f29104o;

    /* renamed from: n, reason: collision with root package name */
    public long f29105n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29104o = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.formula, 2);
        sparseIntArray.put(R.id.formula_description, 3);
        sparseIntArray.put(R.id.textView35, 4);
        sparseIntArray.put(R.id.inputLayout, 5);
        sparseIntArray.put(R.id.inputView, 6);
        sparseIntArray.put(R.id.seek_bar_label_2, 7);
        sparseIntArray.put(R.id.seekBar2, 8);
        sparseIntArray.put(R.id.textView37, 9);
        sparseIntArray.put(R.id.confirm_button, 10);
        sparseIntArray.put(R.id.confirm_button_k, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1357i4(F0.c cVar, View view) {
        super(cVar, view, 0);
        Object[] h9 = F0.f.h(view, 12, f29104o);
        this.f29105n = -1L;
        ((ConstraintLayout) h9[0]).setTag(null);
        l(view);
        synchronized (this) {
            this.f29105n = 1L;
        }
        i();
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29105n = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29105n != 0;
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
