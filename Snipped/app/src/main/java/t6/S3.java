package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentExchangesBindingImpl.java */
/* loaded from: classes2.dex */
public final class S3 extends R3 {

    /* renamed from: s, reason: collision with root package name */
    public static final SparseIntArray f28486s;

    /* renamed from: r, reason: collision with root package name */
    public long f28487r;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28486s = sparseIntArray;
        sparseIntArray.put(R.id.epoxyRecyclerView, 1);
        sparseIntArray.put(R.id.view4, 2);
        sparseIntArray.put(R.id.empty_layout, 3);
        sparseIntArray.put(R.id.empty_text, 4);
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28487r = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28487r != 0;
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
