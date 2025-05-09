package t6;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: CellExchangesTabBindingImpl.java */
/* renamed from: t6.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1401o0 extends AbstractC1459w {

    /* renamed from: o, reason: collision with root package name */
    public static final SparseIntArray f29390o;

    /* renamed from: n, reason: collision with root package name */
    public long f29391n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29390o = sparseIntArray;
        sparseIntArray.put(R.id.tab_exchanges, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1401o0(F0.c cVar, View view) {
        super(cVar, view, 0);
        Object[] h9 = F0.f.h(view, 2, f29390o);
        this.f29391n = -1L;
        ((ConstraintLayout) h9[0]).setTag(null);
        l(view);
        synchronized (this) {
            this.f29391n = 1L;
        }
        i();
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29391n = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29391n != 0;
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
