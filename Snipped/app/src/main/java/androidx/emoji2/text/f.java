package androidx.emoji2.text;

import I0.i;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.emoji2.text.d;
import androidx.emoji2.text.h;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* compiled from: EmojiProcessor.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final d.j f6567a;

    /* renamed from: b, reason: collision with root package name */
    public final h f6568b;

    /* renamed from: c, reason: collision with root package name */
    public final d.e f6569c;

    /* compiled from: EmojiProcessor.java */
    public static class a implements b<i> {

        /* renamed from: a, reason: collision with root package name */
        public i f6570a;

        /* renamed from: b, reason: collision with root package name */
        public final d.j f6571b;

        public a(i iVar, d.j jVar) {
            this.f6570a = iVar;
            this.f6571b = jVar;
        }

        @Override // androidx.emoji2.text.f.b
        public final boolean a(CharSequence charSequence, int i, int i9, I0.g gVar) {
            if ((gVar.f1720c & 4) > 0) {
                return true;
            }
            if (this.f6570a == null) {
                this.f6570a = new i(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            ((d.C0074d) this.f6571b).getClass();
            this.f6570a.setSpan(new I0.h(gVar), i, i9, 33);
            return true;
        }

        @Override // androidx.emoji2.text.f.b
        public final i b() {
            return this.f6570a;
        }
    }

    /* compiled from: EmojiProcessor.java */
    public interface b<T> {
        boolean a(CharSequence charSequence, int i, int i9, I0.g gVar);

        T b();
    }

    /* compiled from: EmojiProcessor.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public int f6573a = 1;

        /* renamed from: b, reason: collision with root package name */
        public final h.a f6574b;

        /* renamed from: c, reason: collision with root package name */
        public h.a f6575c;

        /* renamed from: d, reason: collision with root package name */
        public h.a f6576d;

        /* renamed from: e, reason: collision with root package name */
        public int f6577e;

        /* renamed from: f, reason: collision with root package name */
        public int f6578f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f6579g;

        /* renamed from: h, reason: collision with root package name */
        public final int[] f6580h;

        public d(h.a aVar, boolean z10, int[] iArr) {
            this.f6574b = aVar;
            this.f6575c = aVar;
            this.f6579g = z10;
            this.f6580h = iArr;
        }

        public final void a() {
            this.f6573a = 1;
            this.f6575c = this.f6574b;
            this.f6578f = 0;
        }

        public final boolean b() {
            int[] iArr;
            J0.a c2 = this.f6575c.f6595b.c();
            int a10 = c2.a(6);
            if ((a10 == 0 || c2.f2099b.get(a10 + c2.f2098a) == 0) && this.f6577e != 65039) {
                return this.f6579g && ((iArr = this.f6580h) == null || Arrays.binarySearch(iArr, this.f6575c.f6595b.a(0)) < 0);
            }
            return true;
        }
    }

    public f(h hVar, d.C0074d c0074d, androidx.emoji2.text.b bVar, Set set) {
        this.f6567a = c0074d;
        this.f6568b = hVar;
        this.f6569c = bVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            c(str, 0, str.length(), 1, true, new c(str));
        }
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        I0.e[] eVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (eVarArr = (I0.e[]) editable.getSpans(selectionStart, selectionEnd, I0.e.class)) != null && eVarArr.length > 0) {
            for (I0.e eVar : eVarArr) {
                int spanStart = editable.getSpanStart(eVar);
                int spanEnd = editable.getSpanEnd(eVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i, int i9, I0.g gVar) {
        if ((gVar.f1720c & 3) == 0) {
            d.e eVar = this.f6569c;
            J0.a c2 = gVar.c();
            int a10 = c2.a(8);
            if (a10 != 0) {
                c2.f2099b.getShort(a10 + c2.f2098a);
            }
            androidx.emoji2.text.b bVar = (androidx.emoji2.text.b) eVar;
            bVar.getClass();
            ThreadLocal<StringBuilder> threadLocal = androidx.emoji2.text.b.f6544b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = threadLocal.get();
            sb2.setLength(0);
            while (i < i9) {
                sb2.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = bVar.f6545a;
            String sb3 = sb2.toString();
            int i10 = n0.c.f24070a;
            boolean hasGlyph = textPaint.hasGlyph(sb3);
            int i11 = gVar.f1720c & 4;
            gVar.f1720c = hasGlyph ? i11 | 2 : i11 | 1;
        }
        return (gVar.f1720c & 3) == 2;
    }

    public final <T> T c(CharSequence charSequence, int i, int i9, int i10, boolean z10, b<T> bVar) {
        char c2;
        h.a aVar = null;
        d dVar = new d(this.f6568b.f6592c, false, null);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i11 = 0;
        boolean z11 = true;
        int i12 = i;
        int i13 = i12;
        while (i12 < i9 && i11 < i10 && z11) {
            SparseArray<h.a> sparseArray = dVar.f6575c.f6594a;
            h.a aVar2 = sparseArray == null ? aVar : sparseArray.get(codePointAt);
            if (dVar.f6573a == 2) {
                if (aVar2 != null) {
                    dVar.f6575c = aVar2;
                    dVar.f6578f++;
                } else {
                    if (codePointAt == 65038) {
                        dVar.a();
                    } else if (codePointAt != 65039) {
                        h.a aVar3 = dVar.f6575c;
                        if (aVar3.f6595b != null) {
                            if (dVar.f6578f != 1) {
                                dVar.f6576d = aVar3;
                                dVar.a();
                            } else if (dVar.b()) {
                                dVar.f6576d = dVar.f6575c;
                                dVar.a();
                            } else {
                                dVar.a();
                            }
                            c2 = 3;
                        } else {
                            dVar.a();
                        }
                    }
                    c2 = 1;
                }
                c2 = 2;
            } else if (aVar2 == null) {
                dVar.a();
                c2 = 1;
            } else {
                dVar.f6573a = 2;
                dVar.f6575c = aVar2;
                dVar.f6578f = 1;
                c2 = 2;
            }
            dVar.f6577e = codePointAt;
            if (c2 != 1) {
                if (c2 == 2) {
                    int charCount = Character.charCount(codePointAt) + i12;
                    if (charCount < i9) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i12 = charCount;
                } else if (c2 == 3) {
                    if (z10 || !b(charSequence, i13, i12, dVar.f6576d.f6595b)) {
                        z11 = bVar.a(charSequence, i13, i12, dVar.f6576d.f6595b);
                        i11++;
                    }
                }
                aVar = null;
            } else {
                i12 = Character.charCount(Character.codePointAt(charSequence, i13)) + i13;
                if (i12 < i9) {
                    codePointAt = Character.codePointAt(charSequence, i12);
                }
            }
            i13 = i12;
            aVar = null;
        }
        if (dVar.f6573a == 2 && dVar.f6575c.f6595b != null && ((dVar.f6578f > 1 || dVar.b()) && i11 < i10 && z11 && (z10 || !b(charSequence, i13, i12, dVar.f6575c.f6595b)))) {
            bVar.a(charSequence, i13, i12, dVar.f6575c.f6595b);
        }
        return bVar.b();
    }

    /* compiled from: EmojiProcessor.java */
    public static class c implements b<c> {

        /* renamed from: a, reason: collision with root package name */
        public final String f6572a;

        public c(String str) {
            this.f6572a = str;
        }

        @Override // androidx.emoji2.text.f.b
        public final boolean a(CharSequence charSequence, int i, int i9, I0.g gVar) {
            if (!TextUtils.equals(charSequence.subSequence(i, i9), this.f6572a)) {
                return true;
            }
            gVar.f1720c = (gVar.f1720c & 3) | 4;
            return false;
        }

        @Override // androidx.emoji2.text.f.b
        public final c b() {
            return this;
        }
    }
}
