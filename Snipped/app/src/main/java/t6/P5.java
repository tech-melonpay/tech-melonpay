package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentServerErrorBindingImpl.java */
/* loaded from: classes2.dex */
public final class P5 extends O5 {

    /* renamed from: s, reason: collision with root package name */
    public static final SparseIntArray f28323s;

    /* renamed from: r, reason: collision with root package name */
    public long f28324r;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28323s = sparseIntArray;
        sparseIntArray.put(R.id.bgView, 1);
        sparseIntArray.put(R.id.ivAnimation, 2);
        sparseIntArray.put(R.id.tvTitle, 3);
        sparseIntArray.put(R.id.tvDescription, 4);
        sparseIntArray.put(R.id.button_done, 5);
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28324r = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28324r != 0;
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
