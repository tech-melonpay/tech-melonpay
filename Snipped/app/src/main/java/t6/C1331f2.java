package t6;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: DialogInvoiceBindingImpl.java */
/* renamed from: t6.f2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1331f2 extends AbstractC1459w {

    /* renamed from: o, reason: collision with root package name */
    public static final SparseIntArray f28991o;

    /* renamed from: n, reason: collision with root package name */
    public long f28992n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28991o = sparseIntArray;
        sparseIntArray.put(R.id.title_text, 1);
        sparseIntArray.put(R.id.close, 2);
        sparseIntArray.put(R.id.imageView15, 3);
        sparseIntArray.put(R.id.button_download, 4);
        sparseIntArray.put(R.id.button_delete, 5);
        sparseIntArray.put(R.id.button_edit, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1331f2(F0.c cVar, View view) {
        super(cVar, view, 0);
        Object[] h9 = F0.f.h(view, 7, f28991o);
        this.f28992n = -1L;
        ((ConstraintLayout) h9[0]).setTag(null);
        l(view);
        synchronized (this) {
            this.f28992n = 1L;
        }
        i();
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28992n = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28992n != 0;
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
