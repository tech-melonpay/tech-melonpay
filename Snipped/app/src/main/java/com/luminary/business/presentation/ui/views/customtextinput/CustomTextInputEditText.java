package com.luminary.business.presentation.ui.views.customtextinput;

import C.v;
import F8.o;
import O9.f;
import P9.l;
import P9.s;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.camera.core.n;
import com.google.android.material.textfield.TextInputEditText;
import com.luminary.mobile.R;
import ha.C0806e;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import ka.C0966k;
import ka.C0969n;
import ka.C0970o;
import kotlin.text.Regex;
import s6.a0;
import w5.C1572a;
import w8.InterfaceC1576a;

/* compiled from: CustomTextInputEditText.kt */
/* loaded from: classes2.dex */
public class CustomTextInputEditText extends TextInputEditText implements TextWatcher {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f13176n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String[] f13177a;

    /* renamed from: b, reason: collision with root package name */
    public int f13178b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13179c;

    /* renamed from: d, reason: collision with root package name */
    public String f13180d;

    /* renamed from: e, reason: collision with root package name */
    public String f13181e;

    /* renamed from: f, reason: collision with root package name */
    public int f13182f;

    /* renamed from: g, reason: collision with root package name */
    public String f13183g;

    /* renamed from: h, reason: collision with root package name */
    public String f13184h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f13185j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC1576a f13186k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f13187l;

    /* renamed from: m, reason: collision with root package name */
    public final f f13188m;

    /* compiled from: View.kt */
    public static final class b implements View.OnLayoutChangeListener {
        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            view.removeOnLayoutChangeListener(this);
            int i16 = CustomTextInputEditText.f13176n;
            CustomTextInputEditText customTextInputEditText = CustomTextInputEditText.this;
            customTextInputEditText.d();
            customTextInputEditText.e();
            ViewParent parent = customTextInputEditText.getParent().getParent();
            customTextInputEditText.f13186k = parent instanceof CustomTextInputLayout ? (CustomTextInputLayout) parent : null;
            customTextInputEditText.addTextChangedListener(customTextInputEditText.new a());
            if (customTextInputEditText.f13178b == 7) {
                Editable text = customTextInputEditText.getText();
                if (text == null || text.length() == 0) {
                    customTextInputEditText.b("");
                }
            }
        }
    }

    public CustomTextInputEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13177a = new String[]{"redmi", "xiaomi", "poco", "pocophone"};
        this.f13178b = 2;
        this.f13180d = "";
        this.f13181e = "";
        this.f13182f = 2;
        this.f13183g = "";
        this.f13184h = "";
        this.i = -1.0f;
        this.f13185j = -1.0f;
        this.f13188m = org.koin.java.a.a(K5.a.class);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.f26778c);
        this.f13178b = obtainStyledAttributes.getInt(4, 2);
        String string = obtainStyledAttributes.getString(0);
        this.f13180d = string == null ? "" : string;
        this.f13179c = obtainStyledAttributes.getInt(3, 0);
        float dimension = obtainStyledAttributes.getDimension(5, -1.0f);
        this.i = dimension;
        this.f13185j = dimension;
        this.f13187l = obtainStyledAttributes.getBoolean(6, false);
        float dimension2 = obtainStyledAttributes.getDimension(2, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(1, 0.0f);
        if (dimension2 != 0.0f) {
            o.f(this, (int) dimension2, 0, 0, 0, 14);
        }
        if (dimension3 != 0.0f) {
            o.f(this, 0, 0, (int) dimension3, 0, 11);
        }
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new b());
            return;
        }
        d();
        e();
        ViewParent parent = getParent().getParent();
        this.f13186k = parent instanceof CustomTextInputLayout ? (CustomTextInputLayout) parent : null;
        addTextChangedListener(new a());
        if (this.f13178b == 7) {
            Editable text = getText();
            if (text == null || text.length() == 0) {
                b("");
            }
        }
    }

    private final K5.a getCryptoPrefsManager() {
        return (K5.a) this.f13188m.getValue();
    }

    public final void a(int i, boolean z10) {
        if (i != -1) {
            setTextAppearance(i);
        }
        if (z10) {
            setSelection(getEditableText().length());
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        Character y02;
        int i = this.f13178b;
        if ((i == 12 || i == 3) && !kotlin.jvm.internal.f.b(editable.toString(), this.f13184h)) {
            removeTextChangedListener(this);
            int i9 = this.f13178b;
            if (i9 == 3) {
                StringBuilder sb2 = new StringBuilder();
                int length = editable.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = editable.charAt(i10);
                    if (Character.isDigit(charAt)) {
                        sb2.append(charAt);
                    }
                }
                String obj = sb2.toString();
                if (obj.length() >= 7) {
                    StringBuilder sb3 = new StringBuilder(obj);
                    sb3.insert(3, '-');
                    StringBuilder sb4 = new StringBuilder(sb3.toString());
                    sb4.insert(7, '-');
                    obj = sb4.toString();
                } else if (obj.length() > 3) {
                    StringBuilder sb5 = new StringBuilder(obj);
                    sb5.insert(3, '-');
                    obj = sb5.toString();
                }
                setText(obj);
                Editable text = getText();
                setSelection(text != null ? text.length() : 0);
            } else if (i9 == 12) {
                boolean z10 = this.f13184h.length() > editable.length() && (y02 = C0970o.y0(this.f13184h.toString())) != null && y02.charValue() == '/';
                String obj2 = C0969n.u0(new Regex("[/]").c(editable, "")).toString();
                if (z10) {
                    obj2 = C0970o.x0(obj2);
                }
                if (obj2.length() > 8) {
                    obj2 = obj2.substring(0, new C0806e(0, 7, 1).f21227b + 1);
                }
                ArrayList arrayList = new ArrayList(C0970o.v0(2, new Regex("[/]").c(obj2, "")));
                String str2 = "01/";
                if (arrayList.size() > 0) {
                    str = (String) arrayList.get(0);
                    if (str.length() == 2) {
                        str = Integer.parseInt(str) > 31 ? "31/" : Integer.parseInt(str) < 1 ? "01/" : str.concat("/");
                    }
                } else {
                    str = "";
                }
                if (arrayList.size() > 1) {
                    String str3 = (String) arrayList.get(1);
                    if (str3.length() != 2) {
                        str2 = str3;
                    } else if (Integer.parseInt(str3) > 12) {
                        str2 = "12/";
                    } else if (Integer.parseInt(str3) >= 1) {
                        str2 = str3.concat("/");
                    }
                    str = v.n(str, str2);
                }
                String str4 = arrayList.size() > 2 ? (String) arrayList.get(2) : "";
                if (arrayList.size() > 3) {
                    str4 = str4 + arrayList.get(3);
                }
                if (str4.length() == 4) {
                    if (Integer.parseInt(str4) > 2022) {
                        str4 = "2000";
                    } else if (Integer.parseInt(str4) < 1900) {
                        str4 = "1900";
                    }
                }
                String n10 = v.n(str, str4);
                this.f13184h = n10;
                setText(n10);
                Editable text2 = getText();
                setSelection(text2 != null ? text2.length() : 0);
            }
            addTextChangedListener(this);
        }
    }

    public final void b(CharSequence charSequence) {
        String n10;
        String obj = C0969n.u0(new Regex(n.a("[", this.f13180d, ", ]")).c(charSequence, "")).toString();
        List r02 = C0969n.r0(obj, new String[]{"."});
        Double R = C0966k.R(obj);
        double doubleValue = R != null ? R.doubleValue() : 0.0d;
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
        Character y02 = C0970o.y0(obj);
        if (y02 != null && y02.charValue() == '.') {
            decimalFormat.applyPattern(this.f13180d + " #,###");
            n10 = v.n(decimalFormat.format(Math.abs(doubleValue)), ".");
        } else if (r02.size() == 1) {
            decimalFormat.applyPattern(this.f13180d + " #,###");
            n10 = decimalFormat.format(Math.abs(doubleValue));
        } else {
            int length = ((String) r02.get(1)).length();
            decimalFormat.applyPattern(this.f13180d + " #,###.");
            n10 = v.n(decimalFormat.format(Integer.valueOf(Math.abs((int) doubleValue))), length >= this.f13182f ? ((String) r02.get(1)).substring(0, this.f13182f) : (String) r02.get(1));
        }
        if (this.f13187l && doubleValue < 0.0d) {
            n10 = s3.b.j("-", n10);
        }
        float f10 = this.i;
        CharSequence g10 = f10 == -1.0f ? n10 : Ja.a.g(n10, f10);
        this.f13184h = n10;
        setText(g10);
    }

    public final void c(String str, String str2) {
        this.f13180d = str;
        int i = this.f13178b;
        if (i != 7) {
            if (i != 8) {
                return;
            }
            addTextChangedListener(this);
            setText("0");
            return;
        }
        addTextChangedListener(this);
        if (str2 == null) {
            str2 = "0";
        }
        setText(str2);
    }

    public final void d() {
        int i = this.f13178b;
        if (i == 0) {
            if (l.n(this.f13177a, Build.BRAND.toLowerCase(Locale.ROOT))) {
                setInputType(getInputType() | 524288);
            }
            return;
        }
        switch (i) {
            case 2:
                setInputType(1);
                break;
            case 3:
                addTextChangedListener(this);
                break;
            case 4:
                setInputType(3);
                addTextChangedListener(this);
                break;
            case 5:
                setInputType(2);
                break;
            case 6:
                setInputType(1);
                break;
            case 7:
                setInputType(8194);
                addTextChangedListener(this);
                break;
            case 8:
                setInputType(8194);
                break;
            case 9:
                setInputType(8194);
                addTextChangedListener(this);
                break;
            case 10:
                setInputType(2);
                break;
            case 11:
                setInputType(4098);
                break;
            case 12:
                setInputType(2);
                addTextChangedListener(this);
                break;
        }
    }

    public final void e() {
        if (getEditableText().length() <= 0) {
            int i = this.f13178b;
            if (i == 7) {
                return;
            }
            if (i == 1) {
                a(R.style.TextEmptyHint, true);
            }
            a(R.style.TextEmptyHint, false);
            return;
        }
        int i9 = this.f13178b;
        if (i9 == 1) {
            a(R.style.EditTextPassword, true);
            return;
        }
        if (i9 == 11) {
            a(R.style.TextAppearanceInputEditTextLoans, true);
            return;
        }
        if (i9 == 13) {
            a(R.style.TextAppearanceInputEditTextAccount, false);
            return;
        }
        if (i9 == 7) {
            a(R.style.TextValueWithoutTextSize, true);
        } else if (i9 != 8) {
            a(R.style.TextValue, false);
        } else {
            a(R.style.TextValue, true);
        }
    }

    public final boolean f() {
        switch (this.f13178b) {
            case 0:
                return s3.b.w("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+", C0969n.u0(String.valueOf(getText())).toString());
            case 1:
                return s3.b.w("^[+]?[0-9]{8,15}$", C0969n.u0(String.valueOf(getText())).toString());
            case 2:
                return s3.b.w("^(?=.*[0-9])(?=.*[A-Z])(?=\\S+$).{4,}$", C0969n.u0(String.valueOf(getText())).toString());
            case 3:
                return s3.b.w("^[0-9]{8,15}$", C0969n.u0(String.valueOf(getText())).toString());
            case 4:
                return s3.b.w("^[0-9]{6}$", C0969n.u0(String.valueOf(getText())).toString());
            case 5:
                return s3.b.w("^[0-9]{8}$", C0969n.u0(String.valueOf(getText())).toString());
            case 6:
            default:
                Editable text = getText();
                if (text == null || text.length() <= 0) {
                    return false;
                }
                break;
            case 7:
                Double R = C0966k.R(D9.b.r0(String.valueOf(getText())));
                if ((R != null ? R.doubleValue() : 0.0d) <= 0.0d) {
                    return false;
                }
                break;
            case 8:
                Double R2 = C0966k.R(D9.b.r0(String.valueOf(getText())));
                if ((R2 != null ? R2.doubleValue() : 0.0d) <= 0.0d) {
                    return false;
                }
                break;
            case 9:
                Double R4 = C0966k.R(D9.b.r0(String.valueOf(getText())));
                if ((R4 != null ? R4.doubleValue() : 0.0d) <= 0.0d) {
                    return false;
                }
                break;
            case 10:
                return s3.b.w("^[0-9]{11}$", C0969n.u0(String.valueOf(getText())).toString());
        }
        return true;
    }

    public final String[] getBrandsNeedingWorkaround() {
        return this.f13177a;
    }

    public final String getCurrencyName() {
        return this.f13181e;
    }

    public final String getDecStyle() {
        return this.f13183g;
    }

    public final float getTextSizeAfterDot() {
        return this.i;
    }

    public final float getXmlValuetextSizeAfterDot() {
        return this.f13185j;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i, Rect rect) {
        if (Integer.valueOf(getInputType()).equals(33) || Integer.valueOf(getInputType()).equals(209)) {
            if (l.n(this.f13177a, Build.BRAND.toLowerCase(Locale.ROOT))) {
                setCursorVisible(false);
            }
        }
        super.onFocusChanged(z10, i, rect);
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        String n10;
        String n11;
        int i11 = this.f13179c;
        if (i11 > 0 && charSequence.length() > i11) {
            setText(charSequence.toString().substring(0, i11));
            setSelection(String.valueOf(getText()).length());
            InterfaceC1576a interfaceC1576a = this.f13186k;
            if (interfaceC1576a != null) {
                interfaceC1576a.a(i11);
                return;
            }
            return;
        }
        InterfaceC1576a interfaceC1576a2 = this.f13186k;
        if (interfaceC1576a2 != null) {
            interfaceC1576a2.b();
        }
        int i12 = this.f13178b;
        if ((i12 == 7 || i12 == 8 || i12 == 4 || i12 == 9 || i12 == 6 || i12 == 5 || i12 == 10) && (!kotlin.jvm.internal.f.b(charSequence.toString(), this.f13184h))) {
            removeTextChangedListener(this);
            int i13 = this.f13178b;
            if (i13 == 3) {
                StringBuilder sb2 = new StringBuilder();
                int length = charSequence.length();
                for (int i14 = 0; i14 < length; i14++) {
                    char charAt = charSequence.charAt(i14);
                    if (Character.isDigit(charAt) || charAt == '-') {
                        sb2.append(charAt);
                    }
                }
                setText(sb2);
                setSelection(sb2.length());
            } else if (i13 == 4) {
                String obj = C0969n.u0(new Regex("[-]").c(charSequence, "")).toString();
                if (obj.length() > 6) {
                    obj = obj.substring(0, new C0806e(0, 5, 1).f21227b + 1);
                }
                String P4 = s.P(C0970o.v0(2, obj), "-", null, null, null, 62);
                this.f13184h = P4;
                setText(P4);
                setSelection(P4.length());
            } else if (i13 == 5) {
                String obj2 = charSequence.toString();
                if (charSequence.length() > 8) {
                    obj2 = charSequence.subSequence(0, new C0806e(0, 7, 1).f21227b + 1).toString();
                }
                this.f13184h = obj2;
                setText(obj2);
                setSelection(obj2.length());
            } else if (i13 == 9) {
                List r02 = C0969n.r0(charSequence, new String[]{"."});
                Double R = C0966k.R(charSequence.toString());
                double doubleValue = R != null ? R.doubleValue() : 0.0d;
                DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
                Character y02 = C0970o.y0(charSequence);
                if (y02 != null && y02.charValue() == '.') {
                    decimalFormat.applyPattern("###");
                    n11 = v.n(decimalFormat.format(Math.abs(doubleValue)), ".");
                } else if (r02.size() == 1) {
                    decimalFormat.applyPattern("###");
                    n11 = decimalFormat.format(Math.abs(doubleValue));
                } else {
                    int length2 = ((String) r02.get(1)).length();
                    decimalFormat.applyPattern("###.");
                    n11 = v.n(decimalFormat.format(Integer.valueOf(Math.abs((int) doubleValue))), length2 >= 2 ? ((String) r02.get(1)).substring(0, 2) : (String) r02.get(1));
                }
                Double R2 = C0966k.R(n11);
                if ((R2 != null ? R2.doubleValue() : 0.0d) > 100.0d) {
                    n11 = "100";
                }
                this.f13184h = n11;
                setText(n11);
                setSelection(n11.length());
            } else if (i13 == 7) {
                b(charSequence);
            } else if (i13 == 8) {
                String obj3 = C0969n.u0(new Regex(n.a("[", this.f13180d, ",.]")).c(charSequence, "")).toString();
                if (obj3.length() > 0) {
                    if (obj3.length() == 0) {
                        throw new NoSuchElementException("Char sequence is empty.");
                    }
                    if (obj3.charAt(0) == '0') {
                        obj3 = C0969n.n0(obj3, "0");
                    }
                }
                Long T = C0966k.T(obj3);
                if (T != null) {
                    if (T.longValue() > 2000000000) {
                        T = 2000000000L;
                    }
                    DecimalFormat decimalFormat2 = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
                    decimalFormat2.applyPattern(this.f13180d + " #,###");
                    n10 = decimalFormat2.format(Math.abs(T.longValue()));
                } else {
                    n10 = v.n(this.f13180d, " 0");
                }
                this.f13184h = n10;
                setText(n10);
                setSelection(n10.length());
            } else if (i13 == 10 && C0969n.s0(charSequence, "0") && charSequence.length() > 1) {
                CharSequence subSequence = C0969n.s0(charSequence, "0") ? charSequence.subSequence("0".length(), charSequence.length()) : charSequence.subSequence(0, charSequence.length());
                setText(subSequence);
                setSelection(subSequence.length());
            }
            addTextChangedListener(this);
        }
    }

    public final void setCurrency(String str) {
        c(str, null);
    }

    public final void setCurrencyName(String str) {
        this.f13181e = str;
    }

    public final void setCurrencyNameToInput(String str) {
        String str2;
        Integer num;
        int i = 2;
        if (str == null) {
            this.f13182f = 2;
            this.f13181e = "";
            return;
        }
        this.f13181e = str;
        C1572a Q4 = getCryptoPrefsManager().Q(this.f13181e);
        if (Q4 != null && (num = Q4.f30832g) != null) {
            i = num.intValue();
        }
        this.f13182f = i;
        if (Q4 == null || (str2 = Q4.f30831f) == null) {
            str2 = "Lower";
        }
        this.f13183g = str2;
        this.i = kotlin.jvm.internal.f.b(str2, "Upper") ? -1.0f : this.f13185j;
        b("");
    }

    public final void setDecStyle(String str) {
        this.f13183g = str;
    }

    public final void setMask(int i) {
        if (i < 0 || i >= 10) {
            return;
        }
        this.f13178b = i;
        d();
    }

    public final void setTextSizeAfterDot(float f10) {
        this.i = f10;
    }

    public final void setXmlValuetextSizeAfterDot(float f10) {
        this.f13185j = f10;
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            int i = CustomTextInputEditText.f13176n;
            CustomTextInputEditText.this.e();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
    }
}
