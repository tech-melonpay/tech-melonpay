package I0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import pa.C1124b;

/* compiled from: SpannableBuilder.java */
/* loaded from: classes.dex */
public final class f extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final Class<?> f1713a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1714b;

    /* compiled from: SpannableBuilder.java */
    public static class a implements TextWatcher, SpanWatcher {

        /* renamed from: a, reason: collision with root package name */
        public final Object f1715a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicInteger f1716b = new AtomicInteger(0);

        public a(Object obj) {
            this.f1715a = obj;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f1715a).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            ((TextWatcher) this.f1715a).beforeTextChanged(charSequence, i, i9, i10);
        }

        @Override // android.text.SpanWatcher
        public final void onSpanAdded(Spannable spannable, Object obj, int i, int i9) {
            if (this.f1716b.get() <= 0 || !(obj instanceof e)) {
                ((SpanWatcher) this.f1715a).onSpanAdded(spannable, obj, i, i9);
            }
        }

        @Override // android.text.SpanWatcher
        public final void onSpanChanged(Spannable spannable, Object obj, int i, int i9, int i10, int i11) {
            int i12;
            int i13;
            if (this.f1716b.get() <= 0 || !(obj instanceof e)) {
                if (Build.VERSION.SDK_INT < 28) {
                    if (i > i9) {
                        i = 0;
                    }
                    if (i10 > i11) {
                        i12 = i;
                        i13 = 0;
                        ((SpanWatcher) this.f1715a).onSpanChanged(spannable, obj, i12, i9, i13, i11);
                    }
                }
                i12 = i;
                i13 = i10;
                ((SpanWatcher) this.f1715a).onSpanChanged(spannable, obj, i12, i9, i13, i11);
            }
        }

        @Override // android.text.SpanWatcher
        public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i9) {
            if (this.f1716b.get() <= 0 || !(obj instanceof e)) {
                ((SpanWatcher) this.f1715a).onSpanRemoved(spannable, obj, i, i9);
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            ((TextWatcher) this.f1715a).onTextChanged(charSequence, i, i9, i10);
        }
    }

    public f(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        this.f1714b = new ArrayList();
        C1124b.p(cls, "watcherClass cannot be null");
        this.f1713a = cls;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1714b;
            if (i >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i)).f1716b.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1714b;
            if (i >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    public final a c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1714b;
            if (i >= arrayList.size()) {
                return null;
            }
            a aVar = (a) arrayList.get(i);
            if (aVar.f1715a == obj) {
                return aVar;
            }
            i++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            if (this.f1713a == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable delete(int i, int i9) {
        super.delete(i, i9);
        return this;
    }

    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1714b;
            if (i >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i)).f1716b.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        a c2;
        if (d(obj) && (c2 = c(obj)) != null) {
            obj = c2;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        a c2;
        if (d(obj) && (c2 = c(obj)) != null) {
            obj = c2;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        a c2;
        if (d(obj) && (c2 = c(obj)) != null) {
            obj = c2;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public final <T> T[] getSpans(int i, int i9, Class<T> cls) {
        if (this.f1713a != cls) {
            return (T[]) super.getSpans(i, i9, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i, i9, a.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            tArr[i10] = aVarArr[i10].f1715a;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i9, Class cls) {
        if (cls == null || this.f1713a == cls) {
            cls = a.class;
        }
        return super.nextSpanTransition(i, i9, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        a aVar;
        if (d(obj)) {
            aVar = c(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f1714b.remove(aVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i9, CharSequence charSequence) {
        replace(i, i9, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i9, int i10) {
        if (d(obj)) {
            a aVar = new a(obj);
            this.f1714b.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i, i9, i10);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public final CharSequence subSequence(int i, int i9) {
        return new f(this.f1713a, this, i, i9);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder delete(int i, int i9) {
        super.delete(i, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i9, CharSequence charSequence, int i10, int i11) {
        replace(i, i9, charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i, CharSequence charSequence, int i9, int i10) {
        super.insert(i, charSequence, i9, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i, int i9, CharSequence charSequence) {
        a();
        super.replace(i, i9, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i9, int i10) {
        super.insert(i, charSequence, i9, i10);
        return this;
    }

    public f(Class<?> cls, CharSequence charSequence, int i, int i9) {
        super(charSequence, i, i9);
        this.f1714b = new ArrayList();
        C1124b.p(cls, "watcherClass cannot be null");
        this.f1713a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i, int i9, CharSequence charSequence, int i10, int i11) {
        a();
        super.replace(i, i9, charSequence, i10, i11);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i9) {
        super.append(charSequence, i, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i9) {
        super.append(charSequence, i, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i9) {
        super.append(charSequence, i, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
