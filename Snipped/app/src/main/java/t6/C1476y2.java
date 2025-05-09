package t6;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: FragmentAccountCardsBindingImpl.java */
/* renamed from: t6.y2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1476y2 extends AbstractC1328f {

    /* renamed from: o, reason: collision with root package name */
    public static final SparseIntArray f29842o;

    /* renamed from: n, reason: collision with root package name */
    public long f29843n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29842o = sparseIntArray;
        sparseIntArray.put(R.id.epoxyRecyclerView, 1);
        sparseIntArray.put(R.id.empty_layout, 2);
        sparseIntArray.put(R.id.empty_text, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1476y2(F0.c cVar, View view) {
        super(cVar, view, 0);
        Object[] h9 = F0.f.h(view, 4, f29842o);
        this.f29843n = -1L;
        ((ConstraintLayout) h9[0]).setTag(null);
        l(view);
        synchronized (this) {
            this.f29843n = 1L;
        }
        i();
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29843n = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29843n != 0;
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
