package K0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.d;
import java.lang.ref.WeakReference;

/* compiled from: EmojiInputFilter.java */
/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2222a;

    /* renamed from: b, reason: collision with root package name */
    public a f2223b;

    /* compiled from: EmojiInputFilter.java */
    public static class a extends d.f {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f2224a;

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference f2225b;

        public a(TextView textView, d dVar) {
            this.f2224a = new WeakReference(textView);
            this.f2225b = new WeakReference(dVar);
        }

        @Override // androidx.emoji2.text.d.f
        public final void a() {
            InputFilter[] filters;
            int length;
            TextView textView = (TextView) this.f2224a.get();
            InputFilter inputFilter = (InputFilter) this.f2225b.get();
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        androidx.emoji2.text.d a10 = androidx.emoji2.text.d.a();
                        if (text == null) {
                            length = 0;
                        } else {
                            a10.getClass();
                            length = text.length();
                        }
                        CharSequence f10 = a10.f(text, 0, length);
                        if (text == f10) {
                            return;
                        }
                        int selectionStart = Selection.getSelectionStart(f10);
                        int selectionEnd = Selection.getSelectionEnd(f10);
                        textView.setText(f10);
                        if (f10 instanceof Spannable) {
                            Spannable spannable = (Spannable) f10;
                            if (selectionStart >= 0 && selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionStart, selectionEnd);
                                return;
                            } else if (selectionStart >= 0) {
                                Selection.setSelection(spannable, selectionStart);
                                return;
                            } else {
                                if (selectionEnd >= 0) {
                                    Selection.setSelection(spannable, selectionEnd);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public d(TextView textView) {
        this.f2222a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i9, Spanned spanned, int i10, int i11) {
        TextView textView = this.f2222a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b9 = androidx.emoji2.text.d.a().b();
        if (b9 != 0) {
            if (b9 == 1) {
                if ((i11 == 0 && i10 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i9 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i9);
                }
                return androidx.emoji2.text.d.a().f(charSequence, 0, charSequence.length());
            }
            if (b9 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.d a10 = androidx.emoji2.text.d.a();
        if (this.f2223b == null) {
            this.f2223b = new a(textView, this);
        }
        a10.g(this.f2223b);
        return charSequence;
    }
}
