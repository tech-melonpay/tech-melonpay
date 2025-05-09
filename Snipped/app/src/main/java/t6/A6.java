package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentVerifyTransactionBindingImpl.java */
/* loaded from: classes2.dex */
public final class A6 extends z6 {

    /* renamed from: A, reason: collision with root package name */
    public static final SparseIntArray f27628A;

    /* renamed from: z, reason: collision with root package name */
    public long f27629z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27628A = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.metaConstrainLayout, 2);
        sparseIntArray.put(R.id.ivCopy, 3);
        sparseIntArray.put(R.id.ivQrCode, 4);
        sparseIntArray.put(R.id.textView29, 5);
        sparseIntArray.put(R.id.label_1st, 6);
        sparseIntArray.put(R.id.label_2nd, 7);
        sparseIntArray.put(R.id.label_3rd, 8);
        sparseIntArray.put(R.id.label_4rd, 9);
        sparseIntArray.put(R.id.value_1st, 10);
        sparseIntArray.put(R.id.value_2nd, 11);
        sparseIntArray.put(R.id.value_3rd, 12);
        sparseIntArray.put(R.id.value_4rd, 13);
        sparseIntArray.put(R.id.hashInputLayout, 14);
        sparseIntArray.put(R.id.hashInputView, 15);
        sparseIntArray.put(R.id.uploadInputLayout, 16);
        sparseIntArray.put(R.id.uploadInputView, 17);
        sparseIntArray.put(R.id.memorandumOfArticlesIcon, 18);
        sparseIntArray.put(R.id.memorandumOfArticlesDelete, 19);
        sparseIntArray.put(R.id.errorText, 20);
        sparseIntArray.put(R.id.button_done, 21);
        sparseIntArray.put(R.id.button_done_k, 22);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public A6(F0.c r19, android.view.View r20) {
        /*
            Method dump skipped, instructions count: 192
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.A6.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f27629z = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f27629z != 0;
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
