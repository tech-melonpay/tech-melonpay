package U8;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: SpannableBuilder.java */
/* loaded from: classes2.dex */
public final class t implements Appendable, CharSequence {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f3709b = new ArrayDeque(8);

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f3708a = new StringBuilder((CharSequence) "");

    /* compiled from: SpannableBuilder.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f3710a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3711b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3712c;

        /* renamed from: d, reason: collision with root package name */
        public final int f3713d;

        public a(int i, int i9, int i10, Object obj) {
            this.f3710a = obj;
            this.f3711b = i;
            this.f3712c = i9;
            this.f3713d = i10;
        }
    }

    /* compiled from: SpannableBuilder.java */
    public static class b extends SpannableStringBuilder {
    }

    public t() {
        c(0, "");
    }

    public static void d(t tVar, Object obj, int i, int i9) {
        if (obj != null) {
            int length = tVar.f3708a.length();
            if (i9 <= i || i < 0 || i9 > length) {
                return;
            }
            e(tVar, obj, i, i9);
        }
    }

    public static void e(t tVar, Object obj, int i, int i9) {
        if (obj != null) {
            if (!obj.getClass().isArray()) {
                tVar.getClass();
                tVar.f3709b.push(new a(i, i9, 33, obj));
            } else {
                for (Object obj2 : (Object[]) obj) {
                    e(tVar, obj2, i, i9);
                }
            }
        }
    }

    public final void a(char c2) {
        this.f3708a.append(c2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c2) {
        this.f3708a.append(c2);
        return this;
    }

    public final void b(CharSequence charSequence) {
        StringBuilder sb2 = this.f3708a;
        c(sb2.length(), charSequence);
        sb2.append(charSequence);
    }

    public final void c(int i, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z10 = spanned instanceof b;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length > 0) {
                ArrayDeque arrayDeque = this.f3709b;
                if (!z10) {
                    for (int i9 = 0; i9 < length; i9++) {
                        Object obj = spans[i9];
                        arrayDeque.push(new a(spanned.getSpanStart(obj) + i, spanned.getSpanEnd(obj) + i, spanned.getSpanFlags(obj), obj));
                    }
                    return;
                }
                for (int i10 = length - 1; i10 >= 0; i10--) {
                    Object obj2 = spans[i10];
                    arrayDeque.push(new a(spanned.getSpanStart(obj2) + i, spanned.getSpanEnd(obj2) + i, spanned.getSpanFlags(obj2), obj2));
                }
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f3708a.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f3708a.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i9) {
        List<a> unmodifiableList;
        int i10;
        StringBuilder sb2 = this.f3708a;
        int length = sb2.length();
        if (i9 > i && i >= 0 && i9 <= length) {
            ArrayDeque arrayDeque = this.f3709b;
            if (i == 0 && length == i9) {
                ArrayList arrayList = new ArrayList(arrayDeque);
                Collections.reverse(arrayList);
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(0);
                Iterator descendingIterator = arrayDeque.descendingIterator();
                while (descendingIterator.hasNext()) {
                    a aVar = (a) descendingIterator.next();
                    int i11 = aVar.f3711b;
                    if ((i11 >= i && i11 < i9) || (((i10 = aVar.f3712c) <= i9 && i10 > i) || (i11 < i && i10 > i9))) {
                        arrayList2.add(aVar);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList2);
            }
        } else {
            unmodifiableList = Collections.emptyList();
        }
        if (unmodifiableList.isEmpty()) {
            return sb2.subSequence(i, i9);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.subSequence(i, i9));
        int length2 = spannableStringBuilder.length();
        for (a aVar2 : unmodifiableList) {
            int max = Math.max(0, aVar2.f3711b - i);
            spannableStringBuilder.setSpan(aVar2.f3710a, max, Math.min(length2, (aVar2.f3712c - aVar2.f3711b) + max), aVar2.f3713d);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f3708a.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i9) {
        CharSequence subSequence = charSequence.subSequence(i, i9);
        StringBuilder sb2 = this.f3708a;
        c(sb2.length(), subSequence);
        sb2.append(subSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        StringBuilder sb2 = this.f3708a;
        c(sb2.length(), charSequence);
        sb2.append(charSequence);
        return this;
    }
}
