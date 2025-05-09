package G0;

import android.text.Spanned;
import android.text.TextWatcher;
import android.widget.TextView;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText;
import com.luminary.mobile.R;

/* compiled from: TextViewBindingAdapter.java */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: TextViewBindingAdapter.java */
    public interface a {
        void a();
    }

    /* compiled from: TextViewBindingAdapter.java */
    public interface b {
        void a();
    }

    /* compiled from: TextViewBindingAdapter.java */
    /* renamed from: G0.c$c, reason: collision with other inner class name */
    public interface InterfaceC0016c {
        void a(CharSequence charSequence);
    }

    public static void a(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence == null && text.length() == 0) {
                return;
            }
            if (!(charSequence instanceof Spanned)) {
                if ((charSequence == null) == (text == null)) {
                    if (charSequence == null) {
                        return;
                    }
                    int length = charSequence.length();
                    if (length == text.length()) {
                        for (int i = 0; i < length; i++) {
                            if (charSequence.charAt(i) == text.charAt(i)) {
                            }
                        }
                        return;
                    }
                }
            } else if (charSequence.equals(text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    public static void b(CustomTextInputEditText customTextInputEditText, InterfaceC0016c interfaceC0016c) {
        TextWatcher bVar = interfaceC0016c == null ? null : new G0.b(interfaceC0016c);
        int i = G0.a.f1305a;
        Object tag = customTextInputEditText.getTag(R.id.textWatcher);
        customTextInputEditText.setTag(R.id.textWatcher, bVar);
        TextWatcher textWatcher = (TextWatcher) tag;
        if (textWatcher != null) {
            customTextInputEditText.removeTextChangedListener(textWatcher);
        }
        if (bVar != null) {
            customTextInputEditText.addTextChangedListener(bVar);
        }
    }
}
