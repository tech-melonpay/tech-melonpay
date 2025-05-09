package t6;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: CellBankAcoountBindingImpl.java */
/* renamed from: t6.C, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1283C extends AbstractC1328f {

    /* renamed from: o, reason: collision with root package name */
    public static final SparseIntArray f27653o;

    /* renamed from: n, reason: collision with root package name */
    public long f27654n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27653o = sparseIntArray;
        sparseIntArray.put(R.id.accountInputLayout, 1);
        sparseIntArray.put(R.id.accountInputView, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1283C(F0.c cVar, View view) {
        super(cVar, view, 0);
        Object[] h9 = F0.f.h(view, 3, f27653o);
        this.f27654n = -1L;
        ((ConstraintLayout) h9[0]).setTag(null);
        l(view);
        synchronized (this) {
            this.f27654n = 1L;
        }
        i();
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f27654n = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f27654n != 0;
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
