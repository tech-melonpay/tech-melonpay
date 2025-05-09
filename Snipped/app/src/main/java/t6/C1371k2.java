package t6;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: DialogRatesBindingImpl.java */
/* renamed from: t6.k2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1371k2 extends AbstractC1328f {

    /* renamed from: o, reason: collision with root package name */
    public static final SparseIntArray f29183o;

    /* renamed from: n, reason: collision with root package name */
    public long f29184n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29183o = sparseIntArray;
        sparseIntArray.put(R.id.tvTitle, 1);
        sparseIntArray.put(R.id.tvDescription, 2);
        sparseIntArray.put(R.id.close, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1371k2(F0.c cVar, View view) {
        super(cVar, view, 0);
        Object[] h9 = F0.f.h(view, 4, f29183o);
        this.f29184n = -1L;
        ((ConstraintLayout) h9[0]).setTag(null);
        l(view);
        synchronized (this) {
            this.f29184n = 1L;
        }
        i();
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29184n = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29184n != 0;
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
