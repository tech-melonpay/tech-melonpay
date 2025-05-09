package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: ActivityPasscodeBindingImpl.java */
/* renamed from: t6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1320e extends AbstractC1312d {

    /* renamed from: L, reason: collision with root package name */
    public static final SparseIntArray f28946L;

    /* renamed from: K, reason: collision with root package name */
    public long f28947K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28946L = sparseIntArray;
        sparseIntArray.put(R.id.button_back, 1);
        sparseIntArray.put(R.id.title, 2);
        sparseIntArray.put(R.id.textView_1, 3);
        sparseIntArray.put(R.id.textView_2, 4);
        sparseIntArray.put(R.id.textView_3, 5);
        sparseIntArray.put(R.id.textView_4, 6);
        sparseIntArray.put(R.id.textView_5, 7);
        sparseIntArray.put(R.id.textView_6, 8);
        sparseIntArray.put(R.id.textView_7, 9);
        sparseIntArray.put(R.id.textView_8, 10);
        sparseIntArray.put(R.id.textView_9, 11);
        sparseIntArray.put(R.id.forgot, 12);
        sparseIntArray.put(R.id.textView_0, 13);
        sparseIntArray.put(R.id.bio, 14);
        sparseIntArray.put(R.id.backspace, 15);
        sparseIntArray.put(R.id.logout, 16);
        sparseIntArray.put(R.id.cancel, 17);
        sparseIntArray.put(R.id.linearLayout, 18);
        sparseIntArray.put(R.id.point_1, 19);
        sparseIntArray.put(R.id.point_2, 20);
        sparseIntArray.put(R.id.point_3, 21);
        sparseIntArray.put(R.id.point_4, 22);
        sparseIntArray.put(R.id.point_5, 23);
        sparseIntArray.put(R.id.error_label, 24);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1320e(F0.c r29, android.view.View r30) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1320e.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28947K = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28947K != 0;
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
