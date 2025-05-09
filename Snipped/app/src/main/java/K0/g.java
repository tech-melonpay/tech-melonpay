package K0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.d;
import java.lang.ref.WeakReference;

/* compiled from: EmojiTextWatcher.java */
/* loaded from: classes.dex */
public final class g implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f2233a;

    /* renamed from: c, reason: collision with root package name */
    public a f2235c;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2234b = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2236d = true;

    /* compiled from: EmojiTextWatcher.java */
    public static class a extends d.f {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f2237a;

        public a(EditText editText) {
            this.f2237a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.d.f
        public final void a() {
            g.a((EditText) this.f2237a.get(), 1);
        }
    }

    public g(EditText editText) {
        this.f2233a = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.d a10 = androidx.emoji2.text.d.a();
            if (editableText == null) {
                length = 0;
            } else {
                a10.getClass();
                length = editableText.length();
            }
            a10.f(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        EditText editText = this.f2233a;
        if (editText.isInEditMode() || !this.f2236d) {
            return;
        }
        if ((this.f2234b || androidx.emoji2.text.d.f6548k != null) && i9 <= i10 && (charSequence instanceof Spannable)) {
            int b9 = androidx.emoji2.text.d.a().b();
            if (b9 != 0) {
                if (b9 == 1) {
                    androidx.emoji2.text.d.a().f((Spannable) charSequence, i, i10 + i);
                    return;
                } else if (b9 != 3) {
                    return;
                }
            }
            androidx.emoji2.text.d a10 = androidx.emoji2.text.d.a();
            if (this.f2235c == null) {
                this.f2235c = new a(editText);
            }
            a10.g(this.f2235c);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
    }
}
