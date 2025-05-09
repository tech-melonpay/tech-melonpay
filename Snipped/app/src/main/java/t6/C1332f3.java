package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentCompanyListBindingImpl.java */
/* renamed from: t6.f3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1332f3 extends AbstractC1324e3 {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f28993u;

    /* renamed from: t, reason: collision with root package name */
    public long f28994t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28993u = sparseIntArray;
        sparseIntArray.put(R.id.epoxyRecyclerView, 1);
        sparseIntArray.put(R.id.title_text, 2);
        sparseIntArray.put(R.id.subtitle_text, 3);
        sparseIntArray.put(R.id.button_back, 4);
        sparseIntArray.put(R.id.button_add_new, 5);
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28994t = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28994t != 0;
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
