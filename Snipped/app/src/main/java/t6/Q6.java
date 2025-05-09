package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: ViewToolbarContentBindingImpl.java */
/* loaded from: classes2.dex */
public final class Q6 extends P6 {

    /* renamed from: E, reason: collision with root package name */
    public static final SparseIntArray f28400E;

    /* renamed from: D, reason: collision with root package name */
    public long f28401D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28400E = sparseIntArray;
        sparseIntArray.put(R.id.button_next, 1);
        sparseIntArray.put(R.id.title_layout, 2);
        sparseIntArray.put(R.id.title_label, 3);
        sparseIntArray.put(R.id.editImageView, 4);
        sparseIntArray.put(R.id.title_label_secondary, 5);
        sparseIntArray.put(R.id.emptyView, 6);
        sparseIntArray.put(R.id.ivBadge, 7);
        sparseIntArray.put(R.id.subtitle_title, 8);
        sparseIntArray.put(R.id.subtitle, 9);
        sparseIntArray.put(R.id.button_big, 10);
        sparseIntArray.put(R.id.button_middle, 11);
        sparseIntArray.put(R.id.button_right, 12);
        sparseIntArray.put(R.id.search, 13);
        sparseIntArray.put(R.id.close_search, 14);
        sparseIntArray.put(R.id.right_icon, 15);
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28401D = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28401D != 0;
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
