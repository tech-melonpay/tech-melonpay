package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentNewHomeBindingImpl.java */
/* loaded from: classes2.dex */
public final class R4 extends Q4 {

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f28414v;

    /* renamed from: u, reason: collision with root package name */
    public long f28415u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28414v = sparseIntArray;
        sparseIntArray.put(R.id.viewFlipper, 1);
        sparseIntArray.put(R.id.epoxyFiatRecyclerView, 2);
        sparseIntArray.put(R.id.epoxyCryptoRecyclerView, 3);
        sparseIntArray.put(R.id.view4, 4);
        sparseIntArray.put(R.id.empty_layout, 5);
        sparseIntArray.put(R.id.empty_text, 6);
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28415u = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28415u != 0;
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
