package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentTfaCheckBindingImpl.java */
/* renamed from: t6.k6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1375k6 extends AbstractC1367j6 {

    /* renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f29197t;

    /* renamed from: s, reason: collision with root package name */
    public long f29198s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29197t = sparseIntArray;
        sparseIntArray.put(R.id.codeTextView, 1);
        sparseIntArray.put(R.id.button_done, 2);
        sparseIntArray.put(R.id.button_done_k, 3);
        sparseIntArray.put(R.id.resendButton, 4);
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29198s = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29198s != 0;
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
