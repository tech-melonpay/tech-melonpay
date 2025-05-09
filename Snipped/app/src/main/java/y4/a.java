package Y4;

import android.util.SparseIntArray;
import com.luminary.mobile.R;
import t6.E2;

/* compiled from: ButtonSmallSignerBindingImpl.java */
/* loaded from: classes.dex */
public final class a extends E2 {

    /* renamed from: p, reason: collision with root package name */
    public static final SparseIntArray f4101p;

    /* renamed from: o, reason: collision with root package name */
    public long f4102o;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4101p = sparseIntArray;
        sparseIntArray.put(R.id.textView, 1);
        sparseIntArray.put(R.id.icon, 2);
        sparseIntArray.put(R.id.icon_single, 3);
        sparseIntArray.put(R.id.inactive_view, 4);
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f4102o = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f4102o != 0;
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
