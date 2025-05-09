package t6;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: CellNewCryptoAddressBindingImpl.java */
/* renamed from: t6.b1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1298b1 extends AbstractC1328f {

    /* renamed from: o, reason: collision with root package name */
    public static final SparseIntArray f28814o;

    /* renamed from: n, reason: collision with root package name */
    public long f28815n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28814o = sparseIntArray;
        sparseIntArray.put(R.id.cryptoInputLayout, 1);
        sparseIntArray.put(R.id.cryptoInputView, 2);
        sparseIntArray.put(R.id.imageView6, 3);
        sparseIntArray.put(R.id.networkInputLayout, 4);
        sparseIntArray.put(R.id.networkInputView, 5);
        sparseIntArray.put(R.id.imageView7, 6);
        sparseIntArray.put(R.id.addressInputLayout, 7);
        sparseIntArray.put(R.id.addressInputView, 8);
        sparseIntArray.put(R.id.confirm_button, 9);
        sparseIntArray.put(R.id.confirm_button_k, 10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1298b1(F0.c cVar, View view) {
        super(cVar, view, 0);
        Object[] h9 = F0.f.h(view, 11, f28814o);
        this.f28815n = -1L;
        ((ConstraintLayout) h9[0]).setTag(null);
        l(view);
        synchronized (this) {
            this.f28815n = 1L;
        }
        i();
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28815n = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28815n != 0;
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
