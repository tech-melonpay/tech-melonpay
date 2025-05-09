package t6;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: CellSettingsTabBindingImpl.java */
/* loaded from: classes2.dex */
public final class B1 extends AbstractC1328f {

    /* renamed from: o, reason: collision with root package name */
    public static final SparseIntArray f27641o;

    /* renamed from: n, reason: collision with root package name */
    public long f27642n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27641o = sparseIntArray;
        sparseIntArray.put(R.id.tab_home, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1(F0.c cVar, View view) {
        super(cVar, view, 0);
        Object[] h9 = F0.f.h(view, 2, f27641o);
        this.f27642n = -1L;
        ((ConstraintLayout) h9[0]).setTag(null);
        l(view);
        synchronized (this) {
            this.f27642n = 1L;
        }
        i();
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f27642n = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f27642n != 0;
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
