package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentCardsBindingImpl.java */
/* renamed from: t6.b3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1300b3 extends AbstractC1292a3 {

    /* renamed from: s, reason: collision with root package name */
    public static final SparseIntArray f28818s;

    /* renamed from: r, reason: collision with root package name */
    public long f28819r;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28818s = sparseIntArray;
        sparseIntArray.put(R.id.epoxyRecyclerView, 1);
        sparseIntArray.put(R.id.empty_layout, 2);
        sparseIntArray.put(R.id.emptyTitleTextView, 3);
        sparseIntArray.put(R.id.emptyDescriptionTextView, 4);
        sparseIntArray.put(R.id.addButton, 5);
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28819r = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28819r != 0;
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
