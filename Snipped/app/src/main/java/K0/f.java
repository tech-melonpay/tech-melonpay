package K0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import pa.C1124b;

/* compiled from: EmojiTextViewHelper.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final b f2228a;

    /* compiled from: EmojiTextViewHelper.java */
    public static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f2229a;

        /* renamed from: b, reason: collision with root package name */
        public final d f2230b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2231c = true;

        public a(TextView textView) {
            this.f2229a = textView;
            this.f2230b = new d(textView);
        }

        @Override // K0.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f2231c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i = 0; i < inputFilterArr.length; i++) {
                    InputFilter inputFilter = inputFilterArr[i];
                    if (inputFilter instanceof d) {
                        sparseArray.put(i, inputFilter);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i9 = 0;
                for (int i10 = 0; i10 < length; i10++) {
                    if (sparseArray.indexOfKey(i10) < 0) {
                        inputFilterArr2[i9] = inputFilterArr[i10];
                        i9++;
                    }
                }
                return inputFilterArr2;
            }
            int length2 = inputFilterArr.length;
            int i11 = 0;
            while (true) {
                d dVar = this.f2230b;
                if (i11 >= length2) {
                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = dVar;
                    return inputFilterArr3;
                }
                if (inputFilterArr[i11] == dVar) {
                    return inputFilterArr;
                }
                i11++;
            }
        }

        @Override // K0.f.b
        public final void b(boolean z10) {
            if (z10) {
                d();
            }
        }

        @Override // K0.f.b
        public final void c(boolean z10) {
            this.f2231c = z10;
            d();
            TextView textView = this.f2229a;
            textView.setFilters(a(textView.getFilters()));
        }

        public final void d() {
            TextView textView = this.f2229a;
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (this.f2231c) {
                if (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                    transformationMethod = new h(transformationMethod);
                }
            } else if (transformationMethod instanceof h) {
                transformationMethod = ((h) transformationMethod).f2238a;
            }
            textView.setTransformationMethod(transformationMethod);
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public void b(boolean z10) {
            throw null;
        }

        public void c(boolean z10) {
            throw null;
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    public static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final a f2232a;

        public c(TextView textView) {
            this.f2232a = new a(textView);
        }

        @Override // K0.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            return (androidx.emoji2.text.d.f6548k != null) ^ true ? inputFilterArr : this.f2232a.a(inputFilterArr);
        }

        @Override // K0.f.b
        public final void b(boolean z10) {
            if (!(androidx.emoji2.text.d.f6548k != null)) {
                return;
            }
            this.f2232a.b(z10);
        }

        @Override // K0.f.b
        public final void c(boolean z10) {
            boolean z11 = !(androidx.emoji2.text.d.f6548k != null);
            a aVar = this.f2232a;
            if (z11) {
                aVar.f2231c = z10;
            } else {
                aVar.c(z10);
            }
        }
    }

    public f(TextView textView) {
        C1124b.p(textView, "textView cannot be null");
        this.f2228a = new c(textView);
    }
}
