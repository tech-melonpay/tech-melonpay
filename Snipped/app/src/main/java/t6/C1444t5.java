package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentPaymentsBindingImpl.java */
/* renamed from: t6.t5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1444t5 extends AbstractC1437s5 {

    /* renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f29619t;

    /* renamed from: s, reason: collision with root package name */
    public long f29620s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29619t = sparseIntArray;
        sparseIntArray.put(R.id.epoxyRecyclerView, 1);
        sparseIntArray.put(R.id.view4, 2);
        sparseIntArray.put(R.id.empty_layout, 3);
        sparseIntArray.put(R.id.empty_text, 4);
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29620s = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29620s != 0;
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
