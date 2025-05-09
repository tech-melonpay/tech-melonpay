package I0;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: UnprecomputeTextOnModificationSpannable.java */
/* loaded from: classes.dex */
public final class i implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1722a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f1723b;

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    public static class a {
        public boolean a(Spannable spannable) {
            return spannable instanceof v0.c;
        }
    }

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    public static class b extends a {
        @Override // I0.i.a
        public final boolean a(Spannable spannable) {
            return C1.i.y(spannable) || (spannable instanceof v0.c);
        }
    }

    public i(Spannable spannable) {
        this.f1723b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f1723b;
        if (!this.f1722a) {
            if ((Build.VERSION.SDK_INT < 28 ? new a() : new b()).a(spannable)) {
                this.f1723b = new SpannableString(spannable);
            }
        }
        this.f1722a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f1723b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f1723b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f1723b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f1723b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f1723b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f1723b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i, int i9, Class<T> cls) {
        return (T[]) this.f1723b.getSpans(i, i9, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f1723b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i9, Class cls) {
        return this.f1723b.nextSpanTransition(i, i9, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f1723b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i9, int i10) {
        a();
        this.f1723b.setSpan(obj, i, i9, i10);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i9) {
        return this.f1723b.subSequence(i, i9);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f1723b.toString();
    }
}
