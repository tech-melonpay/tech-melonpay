package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: ButtonSmallBindingImpl.java */
/* renamed from: t6.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1368k extends AbstractC1360j {

    /* renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f29161t;

    /* renamed from: s, reason: collision with root package name */
    public long f29162s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29161t = sparseIntArray;
        sparseIntArray.put(R.id.icon, 1);
        sparseIntArray.put(R.id.icon_single, 2);
        sparseIntArray.put(R.id.textView, 3);
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29162s = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29162s != 0;
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
