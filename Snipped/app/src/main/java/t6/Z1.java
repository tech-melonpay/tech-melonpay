package t6;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: DialogCryptoFilterBindingImpl.java */
/* loaded from: classes2.dex */
public final class Z1 extends AbstractC1459w {

    /* renamed from: o, reason: collision with root package name */
    public static final SparseIntArray f28734o;

    /* renamed from: n, reason: collision with root package name */
    public long f28735n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28734o = sparseIntArray;
        sparseIntArray.put(R.id.title_text, 1);
        sparseIntArray.put(R.id.close, 2);
        sparseIntArray.put(R.id.firstnputLayout, 3);
        sparseIntArray.put(R.id.firstInputView, 4);
        sparseIntArray.put(R.id.ivCurrency, 5);
        sparseIntArray.put(R.id.imageView8, 6);
        sparseIntArray.put(R.id.secondInputLayout, 7);
        sparseIntArray.put(R.id.secondInputView, 8);
        sparseIntArray.put(R.id.imageView1, 9);
        sparseIntArray.put(R.id.button_cancel, 10);
        sparseIntArray.put(R.id.button_accept, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z1(F0.c cVar, View view) {
        super(cVar, view, 0);
        Object[] h9 = F0.f.h(view, 12, f28734o);
        this.f28735n = -1L;
        ((ConstraintLayout) h9[0]).setTag(null);
        l(view);
        synchronized (this) {
            this.f28735n = 1L;
        }
        i();
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28735n = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28735n != 0;
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
