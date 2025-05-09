package t6;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import com.luminary.mobile.R;

/* compiled from: ViewToolbarTestBindingImpl.java */
/* loaded from: classes2.dex */
public final class R6 extends AbstractC1328f {

    /* renamed from: o, reason: collision with root package name */
    public static final SparseIntArray f28418o;

    /* renamed from: n, reason: collision with root package name */
    public long f28419n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28418o = sparseIntArray;
        sparseIntArray.put(R.id.button2, 1);
        sparseIntArray.put(R.id.button3, 2);
        sparseIntArray.put(R.id.button4, 3);
        sparseIntArray.put(R.id.button5, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R6(F0.c cVar, View view) {
        super(cVar, view, 0);
        Object[] h9 = F0.f.h(view, 5, f28418o);
        this.f28419n = -1L;
        ((LinearLayout) h9[0]).setTag(null);
        l(view);
        synchronized (this) {
            this.f28419n = 1L;
        }
        i();
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28419n = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28419n != 0;
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
