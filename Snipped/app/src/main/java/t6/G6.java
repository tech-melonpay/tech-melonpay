package t6;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: ItemLineStatisticBindingImpl.java */
/* loaded from: classes2.dex */
public final class G6 extends AbstractC1459w {

    /* renamed from: o, reason: collision with root package name */
    public static final SparseIntArray f27915o;

    /* renamed from: n, reason: collision with root package name */
    public long f27916n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27915o = sparseIntArray;
        sparseIntArray.put(R.id.fullLine, 1);
        sparseIntArray.put(R.id.currentLine, 2);
        sparseIntArray.put(R.id.shortText, 3);
        sparseIntArray.put(R.id.longText, 4);
        sparseIntArray.put(R.id.titleTextView, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G6(F0.c cVar, View view) {
        super(cVar, view, 0);
        Object[] h9 = F0.f.h(view, 6, f27915o);
        this.f27916n = -1L;
        ((ConstraintLayout) h9[0]).setTag(null);
        l(view);
        synchronized (this) {
            this.f27916n = 1L;
        }
        i();
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f27916n = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f27916n != 0;
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
