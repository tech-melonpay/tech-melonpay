package t6;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: DialogSortSavedBindingImpl.java */
/* renamed from: t6.n2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1395n2 extends AbstractC1459w {

    /* renamed from: o, reason: collision with root package name */
    public static final SparseIntArray f29337o;

    /* renamed from: n, reason: collision with root package name */
    public long f29338n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29337o = sparseIntArray;
        sparseIntArray.put(R.id.title_text, 1);
        sparseIntArray.put(R.id.close, 2);
        sparseIntArray.put(R.id.high_to_low, 3);
        sparseIntArray.put(R.id.high_to_low_imageView, 4);
        sparseIntArray.put(R.id.high_to_low_letters, 5);
        sparseIntArray.put(R.id.high_to_low_title, 6);
        sparseIntArray.put(R.id.high_to_low_description, 7);
        sparseIntArray.put(R.id.low_to_high, 8);
        sparseIntArray.put(R.id.low_to_high_imageView, 9);
        sparseIntArray.put(R.id.low_to_high_letters, 10);
        sparseIntArray.put(R.id.low_to_high_title, 11);
        sparseIntArray.put(R.id.low_to_high_description, 12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1395n2(F0.c cVar, View view) {
        super(cVar, view, 0);
        Object[] h9 = F0.f.h(view, 13, f29337o);
        this.f29338n = -1L;
        ((ConstraintLayout) h9[0]).setTag(null);
        l(view);
        synchronized (this) {
            this.f29338n = 1L;
        }
        i();
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29338n = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29338n != 0;
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
