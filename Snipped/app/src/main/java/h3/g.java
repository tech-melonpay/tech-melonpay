package H3;

import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: InternationalPhoneTextWatcher.java */
/* loaded from: classes.dex */
public final class g implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1476a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1477b;

    /* renamed from: c, reason: collision with root package name */
    public S8.a f1478c;

    /* renamed from: d, reason: collision with root package name */
    public Editable f1479d;

    /* renamed from: e, reason: collision with root package name */
    public int f1480e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1481f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1482g;

    public final String a(CharSequence charSequence) {
        this.f1478c.f();
        String str = "+" + this.f1480e;
        boolean z10 = this.f1482g;
        if (z10 || (charSequence.length() > 0 && charSequence.charAt(0) != '0')) {
            charSequence = str + ((Object) charSequence);
        }
        int length = charSequence.length();
        char c2 = 0;
        String str2 = "";
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (PhoneNumberUtils.isNonSeparator(charAt)) {
                if (c2 != 0) {
                    str2 = this.f1478c.i(c2);
                }
                c2 = charAt;
            }
        }
        if (c2 != 0) {
            str2 = this.f1478c.i(c2);
        }
        String trim = str2.trim();
        if (z10 || charSequence.length() == 0 || charSequence.charAt(0) != '0') {
            trim = trim.length() > str.length() ? trim.charAt(str.length()) == ' ' ? trim.substring(str.length() + 1) : trim.substring(str.length()) : "";
        }
        return TextUtils.isEmpty(trim) ? "" : trim;
    }

    @Override // android.text.TextWatcher
    public final synchronized void afterTextChanged(Editable editable) {
        if (this.f1477b) {
            this.f1477b = editable.length() != 0;
            return;
        }
        if (this.f1476a) {
            return;
        }
        int selectionEnd = Selection.getSelectionEnd(editable);
        boolean z10 = selectionEnd == editable.length();
        String a10 = a(editable);
        if (!a10.equals(editable.toString())) {
            if (!z10) {
                int i = 0;
                for (int i9 = 0; i9 < editable.length() && i9 < selectionEnd; i9++) {
                    if (PhoneNumberUtils.isNonSeparator(editable.charAt(i9))) {
                        i++;
                    }
                }
                selectionEnd = 0;
                int i10 = 0;
                while (true) {
                    if (selectionEnd >= a10.length()) {
                        selectionEnd = 0;
                        break;
                    } else {
                        if (i10 == i) {
                            break;
                        }
                        if (PhoneNumberUtils.isNonSeparator(a10.charAt(selectionEnd))) {
                            i10++;
                        }
                        selectionEnd++;
                    }
                }
            } else {
                selectionEnd = a10.length();
            }
        }
        if (!z10) {
            while (true) {
                int i11 = selectionEnd - 1;
                if (i11 > 0 && !PhoneNumberUtils.isNonSeparator(a10.charAt(i11))) {
                    selectionEnd--;
                }
            }
        }
        try {
            this.f1476a = true;
            editable.replace(0, editable.length(), a10, 0, a10.length());
            this.f1476a = false;
            this.f1479d = editable;
            Selection.setSelection(editable, selectionEnd);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        if (this.f1476a || this.f1477b || i9 <= 0) {
            return;
        }
        for (int i11 = i; i11 < i + i9; i11++) {
            if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i11))) {
                if (this.f1481f) {
                    return;
                }
                this.f1477b = true;
                this.f1478c.f();
                return;
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        if (this.f1476a || this.f1477b || i10 <= 0) {
            return;
        }
        for (int i11 = i; i11 < i + i10; i11++) {
            if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i11))) {
                this.f1477b = true;
                this.f1478c.f();
                return;
            }
        }
    }
}
