package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentNewInvoicesBindingImpl.java */
/* loaded from: classes2.dex */
public final class T4 extends S4 {

    /* renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f28515t;

    /* renamed from: s, reason: collision with root package name */
    public long f28516s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28515t = sparseIntArray;
        sparseIntArray.put(R.id.epoxyRecyclerView, 1);
        sparseIntArray.put(R.id.view4, 2);
        sparseIntArray.put(R.id.empty_layout, 3);
        sparseIntArray.put(R.id.empty_text, 4);
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28516s = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28516s != 0;
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
