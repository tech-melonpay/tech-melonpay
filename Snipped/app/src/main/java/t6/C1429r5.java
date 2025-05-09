package t6;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: FragmentPassCodeBindingImpl.java */
/* renamed from: t6.r5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1429r5 extends AbstractC1328f {

    /* renamed from: o, reason: collision with root package name */
    public static final SparseIntArray f29539o;

    /* renamed from: n, reason: collision with root package name */
    public long f29540n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29539o = sparseIntArray;
        sparseIntArray.put(R.id.textView_1, 1);
        sparseIntArray.put(R.id.textView_2, 2);
        sparseIntArray.put(R.id.textView_3, 3);
        sparseIntArray.put(R.id.textView_4, 4);
        sparseIntArray.put(R.id.textView_5, 5);
        sparseIntArray.put(R.id.textView_6, 6);
        sparseIntArray.put(R.id.textView_7, 7);
        sparseIntArray.put(R.id.textView_8, 8);
        sparseIntArray.put(R.id.textView_9, 9);
        sparseIntArray.put(R.id.forgot, 10);
        sparseIntArray.put(R.id.textView_0, 11);
        sparseIntArray.put(R.id.bio, 12);
        sparseIntArray.put(R.id.backspace, 13);
        sparseIntArray.put(R.id.logout, 14);
        sparseIntArray.put(R.id.linearLayout, 15);
        sparseIntArray.put(R.id.point_1, 16);
        sparseIntArray.put(R.id.point_2, 17);
        sparseIntArray.put(R.id.point_3, 18);
        sparseIntArray.put(R.id.point_4, 19);
        sparseIntArray.put(R.id.point_5, 20);
        sparseIntArray.put(R.id.error_label, 21);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1429r5(F0.c cVar, View view) {
        super(cVar, view, 0);
        Object[] h9 = F0.f.h(view, 22, f29539o);
        this.f29540n = -1L;
        ((ConstraintLayout) h9[0]).setTag(null);
        l(view);
        synchronized (this) {
            this.f29540n = 1L;
        }
        i();
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29540n = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29540n != 0;
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
