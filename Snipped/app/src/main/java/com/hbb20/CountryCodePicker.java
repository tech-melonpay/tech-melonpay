package com.hbb20;

import C.v;
import H3.h;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import com.luminary.mobile.R;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import io.michaelrocks.libphonenumber.android.Phonemetadata$PhoneNumberDesc;
import io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import k0.C0913a;

/* loaded from: classes.dex */
public class CountryCodePicker extends RelativeLayout {

    /* renamed from: F0, reason: collision with root package name */
    public static final /* synthetic */ int f10528F0 = 0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f10529A;

    /* renamed from: A0, reason: collision with root package name */
    public int f10530A0;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f10531B;

    /* renamed from: B0, reason: collision with root package name */
    public int f10532B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f10533C;

    /* renamed from: C0, reason: collision with root package name */
    public float f10534C0;

    /* renamed from: D, reason: collision with root package name */
    public boolean f10535D;

    /* renamed from: D0, reason: collision with root package name */
    public com.hbb20.b f10536D0;

    /* renamed from: E, reason: collision with root package name */
    public boolean f10537E;

    /* renamed from: E0, reason: collision with root package name */
    public final a f10538E0;

    /* renamed from: F, reason: collision with root package name */
    public boolean f10539F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f10540G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f10541H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f10542I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f10543J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f10544K;

    /* renamed from: L, reason: collision with root package name */
    public final boolean f10545L;

    /* renamed from: M, reason: collision with root package name */
    public final boolean f10546M;

    /* renamed from: N, reason: collision with root package name */
    public final boolean f10547N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f10548O;

    /* renamed from: P, reason: collision with root package name */
    public PhoneNumberType f10549P;

    /* renamed from: Q, reason: collision with root package name */
    public final String f10550Q;
    public int R;
    public int S;
    public Typeface T;
    public int U;
    public ArrayList V;
    public final int W;

    /* renamed from: a, reason: collision with root package name */
    public H3.a f10551a;

    /* renamed from: a0, reason: collision with root package name */
    public String f10552a0;

    /* renamed from: b, reason: collision with root package name */
    public final String f10553b;

    /* renamed from: b0, reason: collision with root package name */
    public int f10554b0;

    /* renamed from: c, reason: collision with root package name */
    public int f10555c;

    /* renamed from: c0, reason: collision with root package name */
    public List<com.hbb20.a> f10556c0;

    /* renamed from: d, reason: collision with root package name */
    public String f10557d;

    /* renamed from: d0, reason: collision with root package name */
    public String f10558d0;

    /* renamed from: e, reason: collision with root package name */
    public final Context f10559e;

    /* renamed from: f, reason: collision with root package name */
    public View f10560f;

    /* renamed from: f0, reason: collision with root package name */
    public String f10561f0;

    /* renamed from: g, reason: collision with root package name */
    public final LayoutInflater f10562g;

    /* renamed from: g0, reason: collision with root package name */
    public Language f10563g0;

    /* renamed from: h, reason: collision with root package name */
    public TextView f10564h;

    /* renamed from: h0, reason: collision with root package name */
    public Language f10565h0;
    public EditText i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f10566i0;

    /* renamed from: j, reason: collision with root package name */
    public RelativeLayout f10567j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f10568j0;

    /* renamed from: k, reason: collision with root package name */
    public final ImageView f10569k;

    /* renamed from: k0, reason: collision with root package name */
    public final boolean f10570k0;

    /* renamed from: l, reason: collision with root package name */
    public ImageView f10571l;

    /* renamed from: l0, reason: collision with root package name */
    public final boolean f10572l0;

    /* renamed from: m, reason: collision with root package name */
    public final LinearLayout f10573m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f10574m0;

    /* renamed from: n, reason: collision with root package name */
    public final LinearLayout f10575n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f10576n0;

    /* renamed from: o, reason: collision with root package name */
    public com.hbb20.a f10577o;

    /* renamed from: o0, reason: collision with root package name */
    public final String f10578o0;

    /* renamed from: p, reason: collision with root package name */
    public com.hbb20.a f10579p;

    /* renamed from: p0, reason: collision with root package name */
    public com.hbb20.f f10580p0;

    /* renamed from: q, reason: collision with root package name */
    public final RelativeLayout f10581q;

    /* renamed from: q0, reason: collision with root package name */
    public H3.g f10582q0;

    /* renamed from: r, reason: collision with root package name */
    public final CountryCodePicker f10583r;

    /* renamed from: r0, reason: collision with root package name */
    public TextWatcher f10584r0;

    /* renamed from: s, reason: collision with root package name */
    public TextGravity f10585s;
    public boolean s0;

    /* renamed from: t, reason: collision with root package name */
    public String f10586t;

    /* renamed from: t0, reason: collision with root package name */
    public String f10587t0;

    /* renamed from: u, reason: collision with root package name */
    public AutoDetectionPref f10588u;

    /* renamed from: u0, reason: collision with root package name */
    public int f10589u0;

    /* renamed from: v, reason: collision with root package name */
    public PhoneNumberUtil f10590v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f10591v0;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f10592w;

    /* renamed from: w0, reason: collision with root package name */
    public int f10593w0;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f10594x;

    /* renamed from: x0, reason: collision with root package name */
    public int f10595x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10596y;

    /* renamed from: y0, reason: collision with root package name */
    public int f10597y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f10598z;

    /* renamed from: z0, reason: collision with root package name */
    public int f10599z0;

    public enum AutoDetectionPref {
        /* JADX INFO: Fake field, exist only in values array */
        SIM_ONLY("1"),
        /* JADX INFO: Fake field, exist only in values array */
        NETWORK_ONLY("2"),
        /* JADX INFO: Fake field, exist only in values array */
        LOCALE_ONLY("3"),
        /* JADX INFO: Fake field, exist only in values array */
        SIM_NETWORK("12"),
        /* JADX INFO: Fake field, exist only in values array */
        NETWORK_SIM("21"),
        /* JADX INFO: Fake field, exist only in values array */
        SIM_LOCALE("13"),
        /* JADX INFO: Fake field, exist only in values array */
        LOCALE_SIM("31"),
        /* JADX INFO: Fake field, exist only in values array */
        NETWORK_LOCALE("23"),
        /* JADX INFO: Fake field, exist only in values array */
        LOCALE_NETWORK("32"),
        SIM_NETWORK_LOCALE("123"),
        /* JADX INFO: Fake field, exist only in values array */
        SIM_LOCALE_NETWORK("132"),
        /* JADX INFO: Fake field, exist only in values array */
        NETWORK_SIM_LOCALE("213"),
        /* JADX INFO: Fake field, exist only in values array */
        NETWORK_LOCALE_SIM("231"),
        /* JADX INFO: Fake field, exist only in values array */
        LOCALE_SIM_NETWORK("312"),
        /* JADX INFO: Fake field, exist only in values array */
        LOCALE_NETWORK_SIM("321");


        /* renamed from: a, reason: collision with root package name */
        public final String f10602a;

        AutoDetectionPref(String str) {
            this.f10602a = str;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PhoneNumberType {

        /* renamed from: a, reason: collision with root package name */
        public static final PhoneNumberType f10608a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PhoneNumberType[] f10609b;

        static {
            PhoneNumberType phoneNumberType = new PhoneNumberType("MOBILE", 0);
            f10608a = phoneNumberType;
            f10609b = new PhoneNumberType[]{phoneNumberType, new PhoneNumberType("FIXED_LINE", 1), new PhoneNumberType("FIXED_LINE_OR_MOBILE", 2), new PhoneNumberType("TOLL_FREE", 3), new PhoneNumberType("PREMIUM_RATE", 4), new PhoneNumberType("SHARED_COST", 5), new PhoneNumberType("VOIP", 6), new PhoneNumberType("PERSONAL_NUMBER", 7), new PhoneNumberType("PAGER", 8), new PhoneNumberType("UAN", 9), new PhoneNumberType("VOICEMAIL", 10), new PhoneNumberType("UNKNOWN", 11)};
        }

        public PhoneNumberType() {
            throw null;
        }

        public static PhoneNumberType valueOf(String str) {
            return (PhoneNumberType) Enum.valueOf(PhoneNumberType.class, str);
        }

        public static PhoneNumberType[] values() {
            return (PhoneNumberType[]) f10609b.clone();
        }
    }

    public enum TextGravity {
        /* JADX INFO: Fake field, exist only in values array */
        LEFT(-1),
        /* JADX INFO: Fake field, exist only in values array */
        CENTER(0),
        /* JADX INFO: Fake field, exist only in values array */
        RIGHT(1);


        /* renamed from: a, reason: collision with root package name */
        public final int f10611a;

        TextGravity(int i) {
            this.f10611a = i;
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = CountryCodePicker.f10528F0;
            CountryCodePicker countryCodePicker = CountryCodePicker.this;
            countryCodePicker.getClass();
            if (countryCodePicker.f10568j0) {
                if (countryCodePicker.f10545L) {
                    countryCodePicker.e(countryCodePicker.getSelectedCountryNameCode());
                } else {
                    countryCodePicker.e(null);
                }
            }
        }
    }

    public interface c {
    }

    public interface d {
    }

    public interface e {
    }

    public interface f {
    }

    public interface g {
        void a();
    }

    public CountryCodePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z10;
        String str;
        this.f10551a = new D9.b();
        this.f10553b = "CCP_PREF_FILE";
        this.f10586t = "";
        AutoDetectionPref autoDetectionPref = AutoDetectionPref.SIM_NETWORK_LOCALE;
        this.f10588u = autoDetectionPref;
        this.f10592w = true;
        this.f10594x = true;
        this.f10596y = true;
        this.f10598z = true;
        this.f10529A = true;
        this.f10531B = false;
        this.f10533C = true;
        this.f10535D = true;
        this.f10537E = true;
        this.f10539F = true;
        this.f10540G = true;
        this.f10541H = false;
        this.f10542I = false;
        this.f10543J = true;
        this.f10544K = true;
        this.f10545L = false;
        this.f10546M = false;
        this.f10547N = false;
        this.f10548O = true;
        this.f10549P = PhoneNumberType.f10608a;
        this.f10550Q = "ccp_last_selection";
        this.R = -99;
        this.S = -99;
        this.W = 0;
        this.f10554b0 = 0;
        Language language = Language.ENGLISH;
        this.f10563g0 = language;
        this.f10565h0 = language;
        this.f10566i0 = true;
        this.f10568j0 = true;
        this.f10570k0 = false;
        this.f10572l0 = false;
        this.f10574m0 = true;
        this.f10576n0 = false;
        this.f10578o0 = "notSet";
        this.f10587t0 = null;
        this.f10589u0 = 0;
        this.f10591v0 = false;
        this.f10593w0 = 0;
        this.f10532B0 = 0;
        this.f10538E0 = new a();
        this.f10559e = context;
        this.f10562g = LayoutInflater.from(context);
        if (attributeSet != null) {
            this.f10578o0 = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_width");
        }
        removeAllViewsInLayout();
        if (attributeSet == null || (str = this.f10578o0) == null || !(str.equals("-1") || this.f10578o0.equals("-1") || this.f10578o0.equals("fill_parent") || this.f10578o0.equals("match_parent"))) {
            this.f10560f = this.f10562g.inflate(R.layout.layout_code_picker, (ViewGroup) this, true);
        } else {
            this.f10560f = this.f10562g.inflate(R.layout.layout_full_width_code_picker, (ViewGroup) this, true);
        }
        this.f10564h = (TextView) this.f10560f.findViewById(R.id.textView_selectedCountry);
        this.f10567j = (RelativeLayout) this.f10560f.findViewById(R.id.countryCodeHolder);
        this.f10569k = (ImageView) this.f10560f.findViewById(R.id.imageView_arrow);
        this.f10571l = (ImageView) this.f10560f.findViewById(R.id.image_flag);
        this.f10575n = (LinearLayout) this.f10560f.findViewById(R.id.linear_flag_holder);
        this.f10573m = (LinearLayout) this.f10560f.findViewById(R.id.linear_flag_border);
        this.f10581q = (RelativeLayout) this.f10560f.findViewById(R.id.rlClickConsumer);
        this.f10583r = this;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h.f1483a, 0, 0);
            try {
                try {
                    this.f10594x = obtainStyledAttributes.getBoolean(44, true);
                    this.f10574m0 = obtainStyledAttributes.getBoolean(23, true);
                    boolean z11 = obtainStyledAttributes.getBoolean(45, true);
                    this.f10596y = z11;
                    this.f10598z = obtainStyledAttributes.getBoolean(15, z11);
                    this.f10544K = obtainStyledAttributes.getBoolean(14, true);
                    this.f10535D = obtainStyledAttributes.getBoolean(16, true);
                    this.f10546M = obtainStyledAttributes.getBoolean(49, false);
                    this.f10547N = obtainStyledAttributes.getBoolean(48, false);
                    this.f10537E = obtainStyledAttributes.getBoolean(13, true);
                    this.f10545L = obtainStyledAttributes.getBoolean(7, false);
                    this.f10539F = obtainStyledAttributes.getBoolean(9, true);
                    this.f10531B = obtainStyledAttributes.getBoolean(43, false);
                    this.f10533C = obtainStyledAttributes.getBoolean(12, true);
                    this.f10554b0 = obtainStyledAttributes.getColor(4, 0);
                    this.f10593w0 = obtainStyledAttributes.getColor(6, 0);
                    this.f10532B0 = obtainStyledAttributes.getResourceId(5, 0);
                    this.f10570k0 = obtainStyledAttributes.getBoolean(22, false);
                    this.f10543J = obtainStyledAttributes.getBoolean(18, true);
                    this.f10542I = obtainStyledAttributes.getBoolean(38, false);
                    this.f10576n0 = obtainStyledAttributes.getBoolean(34, false);
                    this.f10548O = obtainStyledAttributes.getBoolean(36, true);
                    int dimension = (int) obtainStyledAttributes.getDimension(37, context.getResources().getDimension(R.dimen.ccp_padding));
                    this.f10581q.setPadding(dimension, dimension, dimension, dimension);
                    this.f10549P = PhoneNumberType.values()[obtainStyledAttributes.getInt(35, 0)];
                    String string = obtainStyledAttributes.getString(40);
                    this.f10550Q = string;
                    if (string == null) {
                        this.f10550Q = "CCP_last_selection";
                    }
                    String valueOf = String.valueOf(obtainStyledAttributes.getInt(26, 123));
                    AutoDetectionPref[] values = AutoDetectionPref.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        AutoDetectionPref autoDetectionPref2 = values[i];
                        if (autoDetectionPref2.f10602a.equals(valueOf)) {
                            autoDetectionPref = autoDetectionPref2;
                            break;
                        }
                        i++;
                    }
                    this.f10588u = autoDetectionPref;
                    this.f10572l0 = obtainStyledAttributes.getBoolean(21, false);
                    if (obtainStyledAttributes.getBoolean(41, true)) {
                        this.f10569k.setVisibility(0);
                    } else {
                        this.f10569k.setVisibility(8);
                    }
                    this.f10541H = obtainStyledAttributes.getBoolean(11, false);
                    this.f10592w = obtainStyledAttributes.getBoolean(39, true);
                    h();
                    j(obtainStyledAttributes.getBoolean(42, true));
                    setDialogKeyboardAutoPopup(obtainStyledAttributes.getBoolean(8, true));
                    int i9 = obtainStyledAttributes.getInt(29, 9);
                    this.f10563g0 = i9 < Language.values().length ? Language.values()[i9] : language;
                    m();
                    this.f10558d0 = obtainStyledAttributes.getString(28);
                    this.f10561f0 = obtainStyledAttributes.getString(32);
                    if (!isInEditMode()) {
                        g();
                    }
                    this.f10552a0 = obtainStyledAttributes.getString(27);
                    if (!isInEditMode()) {
                        i();
                    }
                    if (obtainStyledAttributes.hasValue(46)) {
                        this.W = obtainStyledAttributes.getInt(46, 0);
                    }
                    int i10 = this.W;
                    if (i10 == -1) {
                        this.f10564h.setGravity(3);
                    } else if (i10 == 0) {
                        this.f10564h.setGravity(17);
                    } else {
                        this.f10564h.setGravity(5);
                    }
                    String string2 = obtainStyledAttributes.getString(30);
                    this.f10557d = string2;
                    if (string2 == null || string2.length() == 0) {
                        z10 = false;
                    } else {
                        if (isInEditMode()) {
                            if (com.hbb20.a.f(this.f10557d) != null) {
                                setDefaultCountry(com.hbb20.a.f(this.f10557d));
                                setSelectedCountry(this.f10579p);
                                z10 = true;
                            }
                            z10 = false;
                        } else {
                            if (com.hbb20.a.g(getContext(), getLanguageToApply(), this.f10557d) != null) {
                                setDefaultCountry(com.hbb20.a.g(getContext(), getLanguageToApply(), this.f10557d));
                                setSelectedCountry(this.f10579p);
                                z10 = true;
                            }
                            z10 = false;
                        }
                        if (!z10) {
                            setDefaultCountry(com.hbb20.a.f("IN"));
                            setSelectedCountry(this.f10579p);
                            z10 = true;
                        }
                    }
                    int integer = obtainStyledAttributes.getInteger(31, -1);
                    if (!z10 && integer != -1) {
                        if (isInEditMode()) {
                            com.hbb20.a e10 = com.hbb20.a.e(integer + "");
                            if (e10 == null) {
                                e10 = com.hbb20.a.e("91");
                            }
                            setDefaultCountry(e10);
                            setSelectedCountry(e10);
                        } else {
                            if (integer != -1 && com.hbb20.a.c(getContext(), getLanguageToApply(), this.V, integer) == null) {
                                integer = 91;
                            }
                            setDefaultCountryUsingPhoneCode(integer);
                            setSelectedCountry(this.f10579p);
                        }
                    }
                    if (getDefaultCountry() == null) {
                        setDefaultCountry(com.hbb20.a.f("IN"));
                        if (getSelectedCountry() == null) {
                            setSelectedCountry(this.f10579p);
                        }
                    }
                    if (this.f10572l0 && !isInEditMode()) {
                        setAutoDetectedCountry(true);
                    }
                    if (this.f10542I && !isInEditMode()) {
                        f();
                    }
                    setArrowColor(obtainStyledAttributes.getColor(19, -99));
                    int color = isInEditMode() ? obtainStyledAttributes.getColor(25, -99) : obtainStyledAttributes.getColor(25, context.getResources().getColor(R.color.defaultContentColor));
                    if (color != -99) {
                        setContentColor(color);
                    }
                    int color2 = isInEditMode() ? obtainStyledAttributes.getColor(33, 0) : obtainStyledAttributes.getColor(33, context.getResources().getColor(R.color.defaultBorderFlagColor));
                    if (color2 != 0) {
                        setFlagBorderColor(color2);
                    }
                    setDialogBackgroundColor(obtainStyledAttributes.getColor(2, 0));
                    setDialogBackground(obtainStyledAttributes.getResourceId(1, 0));
                    setDialogTextColor(obtainStyledAttributes.getColor(17, 0));
                    setDialogSearchEditTextTintColor(obtainStyledAttributes.getColor(10, 0));
                    setDialogCornerRaius(obtainStyledAttributes.getDimension(3, 0.0f));
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(47, 0);
                    if (dimensionPixelSize > 0) {
                        this.f10564h.setTextSize(0, dimensionPixelSize);
                        setFlagSize(dimensionPixelSize);
                        setArrowSize(dimensionPixelSize);
                    }
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(20, 0);
                    if (dimensionPixelSize2 > 0) {
                        setArrowSize(dimensionPixelSize2);
                    }
                    this.f10540G = obtainStyledAttributes.getBoolean(0, true);
                    setCcpClickable(obtainStyledAttributes.getBoolean(24, true));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f10581q.setOnClickListener(this.f10538E0);
    }

    public static boolean b(com.hbb20.a aVar, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((com.hbb20.a) it.next()).f10619a.equalsIgnoreCase(aVar.f10619a)) {
                return true;
            }
        }
        return false;
    }

    private Language getCCPLanguageFromLocale() {
        String str;
        String str2;
        Locale locale = this.f10559e.getResources().getConfiguration().locale;
        for (Language language : Language.values()) {
            if (language.f10605a.equalsIgnoreCase(locale.getLanguage()) && ((str = language.f10606b) == null || str.equalsIgnoreCase(locale.getCountry()) || (str2 = language.f10607c) == null || str2.equalsIgnoreCase(locale.getScript()))) {
                return language;
            }
        }
        return null;
    }

    private View.OnClickListener getCountryCodeHolderClickListener() {
        return this.f10538E0;
    }

    private TextWatcher getCountryDetectorTextWatcher() {
        if (this.i != null && this.f10584r0 == null) {
            this.f10584r0 = new b();
        }
        return this.f10584r0;
    }

    private com.hbb20.a getDefaultCountry() {
        return this.f10579p;
    }

    private Phonenumber$PhoneNumber getEnteredPhoneNumber() {
        EditText editText = this.i;
        return getPhoneUtil().r(editText != null ? PhoneNumberUtil.p(editText.getText().toString()) : "", getSelectedCountryNameCode());
    }

    private View getHolderView() {
        return this.f10560f;
    }

    private PhoneNumberUtil getPhoneUtil() {
        if (this.f10590v == null) {
            this.f10590v = PhoneNumberUtil.a(this.f10559e);
        }
        return this.f10590v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.hbb20.a getSelectedCountry() {
        if (this.f10577o == null) {
            setSelectedCountry(getDefaultCountry());
        }
        return this.f10577o;
    }

    private PhoneNumberUtil.PhoneNumberType getSelectedHintNumberType() {
        int ordinal = this.f10549P.ordinal();
        PhoneNumberUtil.PhoneNumberType phoneNumberType = PhoneNumberUtil.PhoneNumberType.f21572b;
        switch (ordinal) {
            case 0:
                return phoneNumberType;
            case 1:
                return PhoneNumberUtil.PhoneNumberType.f21571a;
            case 2:
                return PhoneNumberUtil.PhoneNumberType.f21573c;
            case 3:
                return PhoneNumberUtil.PhoneNumberType.f21574d;
            case 4:
                return PhoneNumberUtil.PhoneNumberType.f21575e;
            case 5:
                return PhoneNumberUtil.PhoneNumberType.f21576f;
            case 6:
                return PhoneNumberUtil.PhoneNumberType.f21577g;
            case 7:
                return PhoneNumberUtil.PhoneNumberType.f21578h;
            case 8:
                return PhoneNumberUtil.PhoneNumberType.i;
            case 9:
                return PhoneNumberUtil.PhoneNumberType.f21579j;
            case 10:
                return PhoneNumberUtil.PhoneNumberType.f21580k;
            case 11:
                return PhoneNumberUtil.PhoneNumberType.f21581l;
            default:
                return phoneNumberType;
        }
    }

    private LayoutInflater getmInflater() {
        return this.f10562g;
    }

    private void setCustomDefaultLanguage(Language language) {
        this.f10563g0 = language;
        m();
        if (this.f10577o != null) {
            com.hbb20.a g10 = com.hbb20.a.g(this.f10559e, getLanguageToApply(), this.f10577o.f10619a);
            if (g10 != null) {
                setSelectedCountry(g10);
            }
        }
    }

    private void setDefaultCountry(com.hbb20.a aVar) {
        this.f10579p = aVar;
    }

    private void setHolder(RelativeLayout relativeLayout) {
        this.f10567j = relativeLayout;
    }

    private void setHolderView(View view) {
        this.f10560f = view;
    }

    public final boolean c(String str) {
        Context context = this.f10559e;
        g();
        List<com.hbb20.a> list = this.f10556c0;
        Iterator<com.hbb20.a> it = ((list == null || list.size() <= 0) ? com.hbb20.a.k(context, getLanguageToApply()) : getCustomMasterCountriesList()).iterator();
        while (it.hasNext()) {
            if (it.next().f10619a.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        if (getEditText_registeredCarrierNumber() == null || getEditText_registeredCarrierNumber().getText().length() == 0) {
            if (getEditText_registeredCarrierNumber() == null) {
                Toast.makeText(this.f10559e, "No editText for Carrier number found.", 0).show();
            }
            return false;
        }
        return getPhoneUtil().k(getPhoneUtil().r("+" + this.f10577o.f10620b + getEditText_registeredCarrierNumber().getText().toString(), this.f10577o.f10619a));
    }

    public final void e(String str) {
        CountryCodePicker countryCodePicker = this.f10583r;
        Field field = com.hbb20.e.f10630a;
        com.hbb20.e.f10634e = countryCodePicker.getContext();
        com.hbb20.e.f10633d = new Dialog(com.hbb20.e.f10634e);
        countryCodePicker.g();
        countryCodePicker.i();
        Context context = com.hbb20.e.f10634e;
        countryCodePicker.g();
        List<com.hbb20.a> list = countryCodePicker.f10556c0;
        List<com.hbb20.a> k3 = (list == null || list.size() <= 0) ? com.hbb20.a.k(context, countryCodePicker.getLanguageToApply()) : countryCodePicker.getCustomMasterCountriesList();
        com.hbb20.e.f10633d.requestWindowFeature(1);
        com.hbb20.e.f10633d.getWindow().setContentView(R.layout.layout_picker_dialog);
        com.hbb20.e.f10633d.getWindow().setBackgroundDrawable(C0913a.getDrawable(com.hbb20.e.f10634e, android.R.color.transparent));
        RecyclerView recyclerView = (RecyclerView) com.hbb20.e.f10633d.findViewById(R.id.recycler_countryDialog);
        TextView textView = (TextView) com.hbb20.e.f10633d.findViewById(R.id.textView_title);
        RelativeLayout relativeLayout = (RelativeLayout) com.hbb20.e.f10633d.findViewById(R.id.rl_query_holder);
        ImageView imageView = (ImageView) com.hbb20.e.f10633d.findViewById(R.id.img_clear_query);
        EditText editText = (EditText) com.hbb20.e.f10633d.findViewById(R.id.editText_search);
        TextView textView2 = (TextView) com.hbb20.e.f10633d.findViewById(R.id.textView_noresult);
        CardView cardView = (CardView) com.hbb20.e.f10633d.findViewById(R.id.cardViewRoot);
        ImageView imageView2 = (ImageView) com.hbb20.e.f10633d.findViewById(R.id.img_dismiss);
        if (countryCodePicker.f10540G && countryCodePicker.f10566i0) {
            editText.requestFocus();
            com.hbb20.e.f10633d.getWindow().setSoftInputMode(5);
        } else {
            com.hbb20.e.f10633d.getWindow().setSoftInputMode(2);
        }
        try {
            if (countryCodePicker.getDialogTypeFace() != null) {
                if (countryCodePicker.getDialogTypeFaceStyle() != -99) {
                    textView2.setTypeface(countryCodePicker.getDialogTypeFace(), countryCodePicker.getDialogTypeFaceStyle());
                    editText.setTypeface(countryCodePicker.getDialogTypeFace(), countryCodePicker.getDialogTypeFaceStyle());
                    textView.setTypeface(countryCodePicker.getDialogTypeFace(), countryCodePicker.getDialogTypeFaceStyle());
                } else {
                    textView2.setTypeface(countryCodePicker.getDialogTypeFace());
                    editText.setTypeface(countryCodePicker.getDialogTypeFace());
                    textView.setTypeface(countryCodePicker.getDialogTypeFace());
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (countryCodePicker.getDialogBackgroundColor() != 0) {
            cardView.setCardBackgroundColor(countryCodePicker.getDialogBackgroundColor());
        }
        if (countryCodePicker.getDialogBackgroundResId() != 0) {
            cardView.setBackgroundResource(countryCodePicker.getDialogBackgroundResId());
        }
        cardView.setRadius(countryCodePicker.getDialogCornerRadius());
        int i = 0;
        if (countryCodePicker.f10541H) {
            imageView2.setVisibility(0);
            imageView2.setOnClickListener(new H3.f());
        } else {
            imageView2.setVisibility(8);
        }
        if (!countryCodePicker.getCcpDialogShowTitle()) {
            textView.setVisibility(8);
        }
        if (countryCodePicker.getDialogTextColor() != 0) {
            int dialogTextColor = countryCodePicker.getDialogTextColor();
            imageView.setColorFilter(dialogTextColor);
            imageView2.setColorFilter(dialogTextColor);
            textView.setTextColor(dialogTextColor);
            textView2.setTextColor(dialogTextColor);
            editText.setTextColor(dialogTextColor);
            editText.setHintTextColor(Color.argb(100, Color.red(dialogTextColor), Color.green(dialogTextColor), Color.blue(dialogTextColor)));
        }
        if (countryCodePicker.getDialogSearchEditTextTintColor() != 0) {
            editText.setBackgroundTintList(ColorStateList.valueOf(countryCodePicker.getDialogSearchEditTextTintColor()));
            int dialogSearchEditTextTintColor = countryCodePicker.getDialogSearchEditTextTintColor();
            Field field2 = com.hbb20.e.f10631b;
            if (field2 != null) {
                try {
                    Drawable drawable = editText.getContext().getDrawable(com.hbb20.e.f10632c.getInt(editText));
                    drawable.setColorFilter(dialogSearchEditTextTintColor, PorterDuff.Mode.SRC_IN);
                    field2.set(com.hbb20.e.f10630a.get(editText), new Drawable[]{drawable, drawable});
                } catch (Exception unused) {
                }
            }
        }
        textView.setText(countryCodePicker.getDialogTitle());
        editText.setHint(countryCodePicker.getSearchHintText());
        textView2.setText(countryCodePicker.getNoResultACK());
        if (!countryCodePicker.f10540G) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) recyclerView.getLayoutParams();
            layoutParams.height = -2;
            recyclerView.setLayoutParams(layoutParams);
        }
        Context context2 = com.hbb20.e.f10634e;
        Dialog dialog = com.hbb20.e.f10633d;
        H3.e eVar = new H3.e();
        eVar.f1461d = null;
        eVar.f1469m = 0;
        eVar.f1467k = context2;
        eVar.f1462e = k3;
        eVar.f1464g = countryCodePicker;
        eVar.f1466j = dialog;
        eVar.f1463f = textView2;
        eVar.i = editText;
        eVar.f1468l = imageView;
        eVar.f1465h = LayoutInflater.from(context2);
        eVar.f1461d = eVar.d("");
        if (countryCodePicker.f10540G) {
            imageView.setVisibility(8);
            editText.addTextChangedListener(new A8.c(eVar, 1));
            editText.setOnEditorActionListener(new H3.c(eVar));
            imageView.setOnClickListener(new H3.b(eVar));
        } else {
            relativeLayout.setVisibility(8);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(com.hbb20.e.f10634e));
        recyclerView.setAdapter(eVar);
        FastScroller fastScroller = (FastScroller) com.hbb20.e.f10633d.findViewById(R.id.fastscroll);
        fastScroller.setRecyclerView(recyclerView);
        if (countryCodePicker.f10533C) {
            if (countryCodePicker.getFastScrollerBubbleColor() != 0) {
                fastScroller.setBubbleColor(countryCodePicker.getFastScrollerBubbleColor());
            }
            if (countryCodePicker.getFastScrollerHandleColor() != 0) {
                fastScroller.setHandleColor(countryCodePicker.getFastScrollerHandleColor());
            }
            if (countryCodePicker.getFastScrollerBubbleTextAppearance() != 0) {
                try {
                    fastScroller.setBubbleTextAppearance(countryCodePicker.getFastScrollerBubbleTextAppearance());
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        } else {
            fastScroller.setVisibility(8);
        }
        com.hbb20.e.f10633d.setOnDismissListener(new com.hbb20.c(countryCodePicker));
        com.hbb20.e.f10633d.setOnCancelListener(new com.hbb20.d(countryCodePicker));
        if (str != null) {
            ArrayList arrayList = countryCodePicker.V;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((com.hbb20.a) it.next()).f10619a.equalsIgnoreCase(str)) {
                        break;
                    }
                }
            }
            ArrayList arrayList2 = countryCodePicker.V;
            int size = (arrayList2 == null || arrayList2.size() <= 0) ? 0 : countryCodePicker.V.size() + 1;
            while (true) {
                if (i >= k3.size()) {
                    break;
                }
                if (k3.get(i).f10619a.equalsIgnoreCase(str)) {
                    recyclerView.scrollToPosition(i + size);
                    break;
                }
                i++;
            }
        }
        com.hbb20.e.f10633d.show();
        countryCodePicker.getDialogEventsListener();
    }

    public final void f() {
        String string = this.f10559e.getSharedPreferences(this.f10553b, 0).getString(this.f10550Q, null);
        if (string != null) {
            setCountryForNameCode(string);
        }
    }

    public final void g() {
        String str = this.f10558d0;
        if (str == null || str.length() == 0) {
            String str2 = this.f10561f0;
            if (str2 == null || str2.length() == 0) {
                this.f10556c0 = null;
            } else {
                this.f10561f0 = this.f10561f0.toLowerCase();
                ArrayList<com.hbb20.a> k3 = com.hbb20.a.k(this.f10559e, getLanguageToApply());
                ArrayList arrayList = new ArrayList();
                for (com.hbb20.a aVar : k3) {
                    if (!this.f10561f0.contains(aVar.f10619a.toLowerCase())) {
                        arrayList.add(aVar);
                    }
                }
                if (arrayList.size() > 0) {
                    this.f10556c0 = arrayList;
                } else {
                    this.f10556c0 = null;
                }
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (String str3 : this.f10558d0.split(",")) {
                com.hbb20.a g10 = com.hbb20.a.g(getContext(), getLanguageToApply(), str3);
                if (g10 != null && !b(g10, arrayList2)) {
                    arrayList2.add(g10);
                }
            }
            if (arrayList2.size() == 0) {
                this.f10556c0 = null;
            } else {
                this.f10556c0 = arrayList2;
            }
        }
        List<com.hbb20.a> list = this.f10556c0;
        if (list != null) {
            Iterator<com.hbb20.a> it = list.iterator();
            while (it.hasNext()) {
                it.next().n();
            }
        }
    }

    public boolean getCcpDialogRippleEnable() {
        return this.f10539F;
    }

    public boolean getCcpDialogShowFlag() {
        return this.f10537E;
    }

    public boolean getCcpDialogShowNameCode() {
        return this.f10544K;
    }

    public boolean getCcpDialogShowTitle() {
        return this.f10535D;
    }

    public int getContentColor() {
        return this.R;
    }

    public TextGravity getCurrentTextGravity() {
        return this.f10585s;
    }

    public Language getCustomDefaultLanguage() {
        return this.f10563g0;
    }

    public List<com.hbb20.a> getCustomMasterCountriesList() {
        return this.f10556c0;
    }

    public String getCustomMasterCountriesParam() {
        return this.f10558d0;
    }

    public String getDefaultCountryCode() {
        return this.f10579p.f10620b;
    }

    public int getDefaultCountryCodeAsInt() {
        try {
            return Integer.parseInt(getDefaultCountryCode());
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public String getDefaultCountryCodeWithPlus() {
        return "+" + getDefaultCountryCode();
    }

    public String getDefaultCountryName() {
        com.hbb20.a defaultCountry = getDefaultCountry();
        return defaultCountry == null ? "" : defaultCountry.f10621c;
    }

    public String getDefaultCountryNameCode() {
        com.hbb20.a defaultCountry = getDefaultCountry();
        return defaultCountry == null ? "" : defaultCountry.f10619a.toUpperCase(Locale.US);
    }

    public int getDialogBackgroundColor() {
        return this.f10597y0;
    }

    public int getDialogBackgroundResId() {
        return this.f10595x0;
    }

    public float getDialogCornerRadius() {
        return this.f10534C0;
    }

    public d getDialogEventsListener() {
        return null;
    }

    public int getDialogSearchEditTextTintColor() {
        return this.f10530A0;
    }

    public int getDialogTextColor() {
        return this.f10599z0;
    }

    public String getDialogTitle() {
        String str;
        Language languageToApply = getLanguageToApply();
        Language language = com.hbb20.a.f10615f;
        if (language == null || language != languageToApply || (str = com.hbb20.a.f10616g) == null || str.length() == 0) {
            com.hbb20.a.m(this.f10559e, languageToApply);
        }
        return com.hbb20.a.f10616g;
    }

    public Typeface getDialogTypeFace() {
        return this.T;
    }

    public int getDialogTypeFaceStyle() {
        return this.U;
    }

    public EditText getEditText_registeredCarrierNumber() {
        return this.i;
    }

    public int getFastScrollerBubbleColor() {
        return this.f10554b0;
    }

    public int getFastScrollerBubbleTextAppearance() {
        return this.f10532B0;
    }

    public int getFastScrollerHandleColor() {
        return this.f10593w0;
    }

    public String getFormattedFullNumber() {
        try {
            return "+" + getPhoneUtil().c(getEnteredPhoneNumber(), PhoneNumberUtil.PhoneNumberFormat.f21567b).substring(1);
        } catch (NumberParseException unused) {
            Log.e("CCP", "getFullNumber: Could not parse number");
            return getFullNumberWithPlus();
        }
    }

    public String getFullNumber() {
        try {
            return getPhoneUtil().c(getEnteredPhoneNumber(), PhoneNumberUtil.PhoneNumberFormat.f21566a).substring(1);
        } catch (NumberParseException unused) {
            Log.e("CCP", "getFullNumber: Could not parse number");
            return getSelectedCountryCode() + PhoneNumberUtil.p(this.i.getText().toString());
        }
    }

    public String getFullNumberWithPlus() {
        return "+" + getFullNumber();
    }

    public RelativeLayout getHolder() {
        return this.f10567j;
    }

    public ImageView getImageViewFlag() {
        return this.f10571l;
    }

    public Language getLanguageToApply() {
        if (this.f10565h0 == null) {
            m();
        }
        return this.f10565h0;
    }

    public String getNoResultACK() {
        String str;
        Language languageToApply = getLanguageToApply();
        Language language = com.hbb20.a.f10615f;
        if (language == null || language != languageToApply || (str = com.hbb20.a.i) == null || str.length() == 0) {
            com.hbb20.a.m(this.f10559e, languageToApply);
        }
        return com.hbb20.a.i;
    }

    public String getSearchHintText() {
        String str;
        Language languageToApply = getLanguageToApply();
        Language language = com.hbb20.a.f10615f;
        if (language == null || language != languageToApply || (str = com.hbb20.a.f10617h) == null || str.length() == 0) {
            com.hbb20.a.m(this.f10559e, languageToApply);
        }
        return com.hbb20.a.f10617h;
    }

    public String getSelectedCountryCode() {
        return getSelectedCountry().f10620b;
    }

    public int getSelectedCountryCodeAsInt() {
        try {
            return Integer.parseInt(getSelectedCountryCode());
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public String getSelectedCountryCodeWithPlus() {
        return "+" + getSelectedCountryCode();
    }

    public String getSelectedCountryEnglishName() {
        return getSelectedCountry().f10622d;
    }

    public int getSelectedCountryFlagResourceId() {
        return getSelectedCountry().f10623e;
    }

    public String getSelectedCountryName() {
        return getSelectedCountry().f10621c;
    }

    public String getSelectedCountryNameCode() {
        return getSelectedCountry().f10619a.toUpperCase(Locale.US);
    }

    public TextView getTextView_selectedCountry() {
        return this.f10564h;
    }

    public final void h() {
        if (this.f10592w) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f10581q.setBackgroundResource(i);
            } else {
                this.f10581q.setBackgroundResource(typedValue.data);
            }
        }
    }

    public final void i() {
        com.hbb20.a g10;
        String str = this.f10552a0;
        if (str == null || str.length() == 0) {
            this.V = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (String str2 : this.f10552a0.split(",")) {
                Context context = getContext();
                List<com.hbb20.a> list = this.f10556c0;
                Language languageToApply = getLanguageToApply();
                if (list != null && list.size() != 0) {
                    Iterator<com.hbb20.a> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            g10 = it.next();
                            if (g10.f10619a.equalsIgnoreCase(str2)) {
                                break;
                            }
                        } else {
                            g10 = null;
                            break;
                        }
                    }
                } else {
                    g10 = com.hbb20.a.g(context, languageToApply, str2);
                }
                if (g10 != null && !b(g10, arrayList)) {
                    arrayList.add(g10);
                }
            }
            if (arrayList.size() == 0) {
                this.V = null;
            } else {
                this.V = arrayList;
            }
        }
        ArrayList arrayList2 = this.V;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((com.hbb20.a) it2.next()).n();
            }
        }
    }

    public final void j(boolean z10) {
        this.f10529A = z10;
        if (!z10) {
            this.f10575n.setVisibility(8);
        } else if (this.f10546M) {
            this.f10575n.setVisibility(8);
        } else {
            this.f10575n.setVisibility(0);
        }
        if (isInEditMode()) {
            return;
        }
        setSelectedCountry(this.f10577o);
    }

    public final void k() {
        EditText editText = this.i;
        if (editText == null || this.f10577o == null) {
            if (editText == null) {
                Log.v("CCP", "updateFormattingTextWatcher: EditText not registered " + this.f10550Q);
                return;
            } else {
                Log.v("CCP", "updateFormattingTextWatcher: selected country is null " + this.f10550Q);
                return;
            }
        }
        String p10 = PhoneNumberUtil.p(getEditText_registeredCarrierNumber().getText().toString());
        H3.g gVar = this.f10582q0;
        if (gVar != null) {
            this.i.removeTextChangedListener(gVar);
        }
        TextWatcher textWatcher = this.f10584r0;
        if (textWatcher != null) {
            this.i.removeTextChangedListener(textWatcher);
        }
        if (this.f10574m0) {
            String selectedCountryNameCode = getSelectedCountryNameCode();
            int selectedCountryCodeAsInt = getSelectedCountryCodeAsInt();
            boolean z10 = this.f10548O;
            H3.g gVar2 = new H3.g();
            gVar2.f1476a = false;
            gVar2.f1479d = null;
            gVar2.f1481f = false;
            if (selectedCountryNameCode == null || selectedCountryNameCode.length() == 0) {
                throw new IllegalArgumentException();
            }
            PhoneNumberUtil a10 = PhoneNumberUtil.a(this.f10559e);
            gVar2.f1480e = selectedCountryCodeAsInt;
            S8.a aVar = new S8.a(a10, selectedCountryNameCode);
            gVar2.f1478c = aVar;
            aVar.f();
            Editable editable = gVar2.f1479d;
            if (editable != null) {
                gVar2.f1481f = true;
                String p11 = PhoneNumberUtil.p(editable);
                Editable editable2 = gVar2.f1479d;
                editable2.replace(0, editable2.length(), p11, 0, p11.length());
                gVar2.f1481f = false;
            }
            gVar2.f1482g = z10;
            this.f10582q0 = gVar2;
            this.i.addTextChangedListener(gVar2);
        }
        if (this.f10543J) {
            TextWatcher countryDetectorTextWatcher = getCountryDetectorTextWatcher();
            this.f10584r0 = countryDetectorTextWatcher;
            this.i.addTextChangedListener(countryDetectorTextWatcher);
        }
        this.i.setText("");
        this.i.setText(p10);
        EditText editText2 = this.i;
        editText2.setSelection(editText2.getText().length());
    }

    public final void l() {
        if (this.i == null || !this.f10576n0) {
            return;
        }
        PhoneNumberUtil phoneUtil = getPhoneUtil();
        String selectedCountryNameCode = getSelectedCountryNameCode();
        PhoneNumberUtil.PhoneNumberType selectedHintNumberType = getSelectedHintNumberType();
        boolean l10 = phoneUtil.l(selectedCountryNameCode);
        Logger logger = PhoneNumberUtil.f21543h;
        Phonenumber$PhoneNumber phonenumber$PhoneNumber = null;
        if (l10) {
            Phonemetadata$PhoneNumberDesc g10 = PhoneNumberUtil.g(phoneUtil.e(selectedCountryNameCode), selectedHintNumberType);
            try {
                if (g10.f21648e) {
                    phonenumber$PhoneNumber = phoneUtil.r(g10.f21649f, selectedCountryNameCode);
                }
            } catch (NumberParseException e10) {
                logger.log(Level.SEVERE, e10.toString());
            }
        } else {
            logger.log(Level.WARNING, "Invalid or unknown region code provided: " + selectedCountryNameCode);
        }
        String str = "";
        if (phonenumber$PhoneNumber != null) {
            str = PhoneNumberUtils.formatNumber(getSelectedCountryCodeWithPlus() + (phonenumber$PhoneNumber.f21651b + ""), getSelectedCountryNameCode());
            if (str != null) {
                str = str.substring(getSelectedCountryCodeWithPlus().length()).trim();
            }
        }
        if (str == null) {
            str = this.f10586t;
        }
        this.i.setHint(str);
    }

    public final void m() {
        boolean isInEditMode = isInEditMode();
        Language language = Language.ENGLISH;
        if (isInEditMode) {
            Language language2 = this.f10563g0;
            if (language2 != null) {
                this.f10565h0 = language2;
                return;
            } else {
                this.f10565h0 = language;
                return;
            }
        }
        if (!this.f10570k0) {
            if (getCustomDefaultLanguage() != null) {
                this.f10565h0 = this.f10563g0;
                return;
            } else {
                this.f10565h0 = language;
                return;
            }
        }
        Language cCPLanguageFromLocale = getCCPLanguageFromLocale();
        if (cCPLanguageFromLocale != null) {
            this.f10565h0 = cCPLanguageFromLocale;
        } else if (getCustomDefaultLanguage() != null) {
            this.f10565h0 = getCustomDefaultLanguage();
        } else {
            this.f10565h0 = language;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Dialog dialog = com.hbb20.e.f10633d;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.hbb20.e.f10633d = null;
        com.hbb20.e.f10634e = null;
        super.onDetachedFromWindow();
    }

    public void setArrowColor(int i) {
        this.S = i;
        if (i != -99) {
            this.f10569k.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            return;
        }
        int i9 = this.R;
        if (i9 != -99) {
            this.f10569k.setColorFilter(i9, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setArrowSize(int i) {
        if (i > 0) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f10569k.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            this.f10569k.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b5 A[Catch: Exception -> 0x00b9, LOOP:0: B:2:0x0003->B:9:0x00b5, LOOP_END, TryCatch #3 {Exception -> 0x00b9, blocks: (B:3:0x0003, B:5:0x000d, B:9:0x00b5, B:45:0x0052, B:33:0x0080, B:57:0x00ae, B:14:0x00bf, B:21:0x0056, B:24:0x0062, B:26:0x0068, B:29:0x006f, B:35:0x001f, B:37:0x002f, B:39:0x0035, B:42:0x003c, B:47:0x0084, B:49:0x0090, B:51:0x0096, B:54:0x009d), top: B:2:0x0003, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setAutoDetectedCountry(boolean r8) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hbb20.CountryCodePicker.setAutoDetectedCountry(boolean):void");
    }

    public void setCcpClickable(boolean z10) {
        this.f10568j0 = z10;
        if (z10) {
            this.f10581q.setOnClickListener(this.f10538E0);
            this.f10581q.setClickable(true);
            this.f10581q.setEnabled(true);
        } else {
            this.f10581q.setOnClickListener(null);
            this.f10581q.setClickable(false);
            this.f10581q.setEnabled(false);
        }
    }

    public void setCcpDialogRippleEnable(boolean z10) {
        this.f10539F = z10;
    }

    public void setCcpDialogShowFlag(boolean z10) {
        this.f10537E = z10;
    }

    public void setCcpDialogShowNameCode(boolean z10) {
        this.f10544K = z10;
    }

    public void setCcpDialogShowPhoneCode(boolean z10) {
        this.f10598z = z10;
    }

    public void setCcpDialogShowTitle(boolean z10) {
        this.f10535D = z10;
    }

    public void setContentColor(int i) {
        this.R = i;
        this.f10564h.setTextColor(i);
        if (this.S == -99) {
            this.f10569k.setColorFilter(this.R, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setCountryAutoDetectionPref(AutoDetectionPref autoDetectionPref) {
        this.f10588u = autoDetectionPref;
    }

    public void setCountryForNameCode(String str) {
        com.hbb20.a g10 = com.hbb20.a.g(getContext(), getLanguageToApply(), str);
        if (g10 != null) {
            setSelectedCountry(g10);
            return;
        }
        if (this.f10579p == null) {
            this.f10579p = com.hbb20.a.c(getContext(), getLanguageToApply(), this.V, this.f10555c);
        }
        setSelectedCountry(this.f10579p);
    }

    public void setCountryForPhoneCode(int i) {
        com.hbb20.a c2 = com.hbb20.a.c(getContext(), getLanguageToApply(), this.V, i);
        if (c2 != null) {
            setSelectedCountry(c2);
            return;
        }
        if (this.f10579p == null) {
            this.f10579p = com.hbb20.a.c(getContext(), getLanguageToApply(), this.V, this.f10555c);
        }
        setSelectedCountry(this.f10579p);
    }

    public void setCountryPreference(String str) {
        this.f10552a0 = str;
    }

    public void setCurrentTextGravity(TextGravity textGravity) {
        this.f10585s = textGravity;
        int i = textGravity.f10611a;
        if (i == -1) {
            this.f10564h.setGravity(3);
        } else if (i == 0) {
            this.f10564h.setGravity(17);
        } else {
            this.f10564h.setGravity(5);
        }
    }

    public void setCustomMasterCountries(String str) {
        this.f10558d0 = str;
    }

    public void setCustomMasterCountriesList(List<com.hbb20.a> list) {
        this.f10556c0 = list;
    }

    public void setDefaultCountryUsingNameCode(String str) {
        com.hbb20.a g10 = com.hbb20.a.g(getContext(), getLanguageToApply(), str);
        if (g10 == null) {
            return;
        }
        this.f10557d = g10.f10619a;
        setDefaultCountry(g10);
    }

    @Deprecated
    public void setDefaultCountryUsingPhoneCode(int i) {
        com.hbb20.a c2 = com.hbb20.a.c(getContext(), getLanguageToApply(), this.V, i);
        if (c2 == null) {
            return;
        }
        this.f10555c = i;
        setDefaultCountry(c2);
    }

    public void setDetectCountryWithAreaCode(boolean z10) {
        this.f10543J = z10;
        k();
    }

    public void setDialogBackground(int i) {
        this.f10595x0 = i;
    }

    public void setDialogBackgroundColor(int i) {
        this.f10597y0 = i;
    }

    public void setDialogCornerRaius(float f10) {
        this.f10534C0 = f10;
    }

    public void setDialogKeyboardAutoPopup(boolean z10) {
        this.f10566i0 = z10;
    }

    public void setDialogSearchEditTextTintColor(int i) {
        this.f10530A0 = i;
    }

    public void setDialogTextColor(int i) {
        this.f10599z0 = i;
    }

    public void setDialogTypeFace(Typeface typeface) {
        try {
            this.T = typeface;
            this.U = -99;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void setEditText_registeredCarrierNumber(EditText editText) {
        this.i = editText;
        if (editText.getHint() != null) {
            this.f10586t = this.i.getHint().toString();
        }
        try {
            this.i.removeTextChangedListener(this.f10580p0);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        d();
        com.hbb20.f fVar = new com.hbb20.f(this);
        this.f10580p0 = fVar;
        this.i.addTextChangedListener(fVar);
        k();
        l();
    }

    public void setExcludedCountries(String str) {
        this.f10561f0 = str;
        g();
    }

    public void setFastScrollerBubbleColor(int i) {
        this.f10554b0 = i;
    }

    public void setFastScrollerBubbleTextAppearance(int i) {
        this.f10532B0 = i;
    }

    public void setFastScrollerHandleColor(int i) {
        this.f10593w0 = i;
    }

    public void setFlagBorderColor(int i) {
        this.f10573m.setBackgroundColor(i);
    }

    public void setFlagSize(int i) {
        this.f10571l.getLayoutParams().height = i;
        this.f10571l.requestLayout();
    }

    public void setFullNumber(String str) {
        int indexOf;
        com.hbb20.b bVar;
        Context context = getContext();
        Language languageToApply = getLanguageToApply();
        ArrayList arrayList = this.V;
        com.hbb20.a aVar = null;
        if (str != null) {
            String trim = str.trim();
            if (trim.length() != 0) {
                int i = trim.charAt(0) == '+' ? 1 : 0;
                int i9 = i;
                while (true) {
                    if (i9 > trim.length()) {
                        break;
                    }
                    String substring = trim.substring(i, i9);
                    try {
                        bVar = com.hbb20.b.b(Integer.parseInt(substring));
                    } catch (Exception unused) {
                        bVar = null;
                    }
                    if (bVar != null) {
                        int length = substring.length() + i;
                        int length2 = trim.length();
                        int i10 = bVar.f10626b + length;
                        aVar = length2 >= i10 ? bVar.a(context, languageToApply, trim.substring(length, i10)) : com.hbb20.a.g(context, languageToApply, bVar.f10625a);
                    } else {
                        com.hbb20.a d10 = com.hbb20.a.d(context, languageToApply, arrayList, substring);
                        if (d10 != null) {
                            aVar = d10;
                            break;
                        }
                        i9++;
                    }
                }
            }
        }
        if (aVar == null) {
            aVar = getDefaultCountry();
        }
        setSelectedCountry(aVar);
        if (aVar != null && str != null && !str.isEmpty() && (indexOf = str.indexOf(aVar.f10620b)) != -1) {
            str = str.substring(aVar.f10620b.length() + indexOf);
        }
        if (getEditText_registeredCarrierNumber() == null) {
            Log.w("CCP", "EditText for carrier number is not registered. Register it using registerCarrierNumberEditText() before getFullNumber() or setFullNumber().");
        } else {
            getEditText_registeredCarrierNumber().setText(str);
            k();
        }
    }

    public void setHintExampleNumberEnabled(boolean z10) {
        this.f10576n0 = z10;
        l();
    }

    public void setHintExampleNumberType(PhoneNumberType phoneNumberType) {
        this.f10549P = phoneNumberType;
        l();
    }

    public void setImageViewFlag(ImageView imageView) {
        this.f10571l = imageView;
    }

    public void setInternationalFormattingOnly(boolean z10) {
        this.f10548O = z10;
        if (this.i != null) {
            k();
        }
    }

    public void setLanguageToApply(Language language) {
        this.f10565h0 = language;
    }

    public void setNumberAutoFormattingEnabled(boolean z10) {
        this.f10574m0 = z10;
        if (this.i != null) {
            k();
        }
    }

    public void setPhoneNumberValidityChangeListener(g gVar) {
        if (this.i == null || gVar == null) {
            return;
        }
        d();
        gVar.a();
    }

    public void setSearchAllowed(boolean z10) {
        this.f10540G = z10;
    }

    public void setSelectedCountry(com.hbb20.a aVar) {
        String str;
        if (this.f10551a != null) {
            String str2 = null;
            if (aVar == null) {
                str = null;
            } else {
                str = aVar.f10621c + " phone code is +" + aVar.f10620b;
            }
            if (str != null) {
                TextView textView = this.f10564h;
                ((D9.b) this.f10551a).getClass();
                if (aVar != null) {
                    str2 = aVar.f10621c + " phone code is +" + aVar.f10620b;
                }
                textView.setContentDescription(str2);
            }
        }
        this.s0 = false;
        String str3 = "";
        this.f10587t0 = "";
        if (aVar == null && (aVar = com.hbb20.a.c(getContext(), getLanguageToApply(), this.V, this.f10555c)) == null) {
            return;
        }
        this.f10577o = aVar;
        if (this.f10529A && this.f10546M) {
            str3 = isInEditMode() ? this.f10547N ? "🏁\u200b " : com.hbb20.a.h(aVar).concat("\u200b ") : com.hbb20.a.h(aVar).concat("  ");
        }
        if (this.f10531B) {
            StringBuilder s10 = v.s(str3);
            s10.append(aVar.f10621c);
            str3 = s10.toString();
        }
        if (this.f10594x) {
            if (this.f10531B) {
                StringBuilder r8 = androidx.camera.core.impl.utils.a.r(str3, " (");
                r8.append(aVar.f10619a.toUpperCase(Locale.US));
                r8.append(")");
                str3 = r8.toString();
            } else {
                StringBuilder r10 = androidx.camera.core.impl.utils.a.r(str3, " ");
                r10.append(aVar.f10619a.toUpperCase(Locale.US));
                str3 = r10.toString();
            }
        }
        if (this.f10596y) {
            if (str3.length() > 0) {
                str3 = str3.concat("  ");
            }
            StringBuilder r11 = androidx.camera.core.impl.utils.a.r(str3, "+");
            r11.append(aVar.f10620b);
            str3 = r11.toString();
        }
        this.f10564h.setText(str3);
        if (!this.f10529A && str3.length() == 0) {
            StringBuilder r12 = androidx.camera.core.impl.utils.a.r(str3, "+");
            r12.append(aVar.f10620b);
            this.f10564h.setText(r12.toString());
        }
        ImageView imageView = this.f10571l;
        if (aVar.f10623e == -99) {
            aVar.f10623e = com.hbb20.a.i(aVar);
        }
        imageView.setImageResource(aVar.f10623e);
        k();
        l();
        EditText editText = this.i;
        this.s0 = true;
        if (this.f10591v0) {
            try {
                editText.setSelection(this.f10589u0);
                this.f10591v0 = false;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        this.f10536D0 = com.hbb20.b.b(getSelectedCountryCodeAsInt());
    }

    public void setShowFastScroller(boolean z10) {
        this.f10533C = z10;
    }

    public void setShowPhoneCode(boolean z10) {
        this.f10596y = z10;
        setSelectedCountry(this.f10577o);
    }

    public void setTalkBackTextProvider(H3.a aVar) {
        this.f10551a = aVar;
        setSelectedCountry(this.f10577o);
    }

    public void setTextSize(int i) {
        if (i > 0) {
            this.f10564h.setTextSize(0, i);
            setArrowSize(i);
            setFlagSize(i);
        }
    }

    public void setTextView_selectedCountry(TextView textView) {
        this.f10564h = textView;
    }

    public void setTypeFace(Typeface typeface) {
        try {
            this.f10564h.setTypeface(typeface);
            setDialogTypeFace(typeface);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public enum Language {
        /* JADX INFO: Fake field, exist only in values array */
        AFRIKAANS("af"),
        /* JADX INFO: Fake field, exist only in values array */
        ARABIC("ar"),
        /* JADX INFO: Fake field, exist only in values array */
        BASQUE("eu"),
        /* JADX INFO: Fake field, exist only in values array */
        BENGALI("bn"),
        /* JADX INFO: Fake field, exist only in values array */
        EF5("CN", "Hans"),
        /* JADX INFO: Fake field, exist only in values array */
        EF6("TW", "Hant"),
        /* JADX INFO: Fake field, exist only in values array */
        CZECH("cs"),
        /* JADX INFO: Fake field, exist only in values array */
        DANISH("da"),
        /* JADX INFO: Fake field, exist only in values array */
        DUTCH("nl"),
        ENGLISH("en"),
        /* JADX INFO: Fake field, exist only in values array */
        FARSI("fa"),
        /* JADX INFO: Fake field, exist only in values array */
        FRENCH("fr"),
        /* JADX INFO: Fake field, exist only in values array */
        GERMAN("de"),
        /* JADX INFO: Fake field, exist only in values array */
        GREEK("el"),
        /* JADX INFO: Fake field, exist only in values array */
        GUJARATI("gu"),
        /* JADX INFO: Fake field, exist only in values array */
        HEBREW("iw"),
        /* JADX INFO: Fake field, exist only in values array */
        HINDI("hi"),
        /* JADX INFO: Fake field, exist only in values array */
        HUNGARIAN("hu"),
        /* JADX INFO: Fake field, exist only in values array */
        INDONESIA("in"),
        /* JADX INFO: Fake field, exist only in values array */
        ITALIAN("it"),
        /* JADX INFO: Fake field, exist only in values array */
        JAPANESE("ja"),
        /* JADX INFO: Fake field, exist only in values array */
        KAZAKH("kk"),
        /* JADX INFO: Fake field, exist only in values array */
        KOREAN("ko"),
        /* JADX INFO: Fake field, exist only in values array */
        MARATHI("mr"),
        /* JADX INFO: Fake field, exist only in values array */
        POLISH("pl"),
        /* JADX INFO: Fake field, exist only in values array */
        PORTUGUESE("pt"),
        /* JADX INFO: Fake field, exist only in values array */
        PUNJABI("pa"),
        /* JADX INFO: Fake field, exist only in values array */
        RUSSIAN("ru"),
        /* JADX INFO: Fake field, exist only in values array */
        SERBIAN("sr"),
        /* JADX INFO: Fake field, exist only in values array */
        SLOVAK("sk"),
        /* JADX INFO: Fake field, exist only in values array */
        SLOVENIAN("si"),
        /* JADX INFO: Fake field, exist only in values array */
        SPANISH("es"),
        /* JADX INFO: Fake field, exist only in values array */
        SWEDISH("sv"),
        /* JADX INFO: Fake field, exist only in values array */
        TAGALOG("tl"),
        /* JADX INFO: Fake field, exist only in values array */
        THAI("th"),
        /* JADX INFO: Fake field, exist only in values array */
        TURKISH("tr"),
        /* JADX INFO: Fake field, exist only in values array */
        UKRAINIAN("uk"),
        /* JADX INFO: Fake field, exist only in values array */
        URDU("ur"),
        /* JADX INFO: Fake field, exist only in values array */
        UZBEK("uz"),
        /* JADX INFO: Fake field, exist only in values array */
        VIETNAMESE("vi");


        /* renamed from: a, reason: collision with root package name */
        public final String f10605a;

        /* renamed from: b, reason: collision with root package name */
        public final String f10606b;

        /* renamed from: c, reason: collision with root package name */
        public final String f10607c;

        Language(String str, String str2) {
            this.f10605a = "zh";
            this.f10606b = str;
            this.f10607c = str2;
        }

        Language(String str) {
            this.f10605a = str;
        }
    }

    public class b implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        public String f10613a = null;

        public b() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            CountryCodePicker countryCodePicker = CountryCodePicker.this;
            com.hbb20.a selectedCountry = countryCodePicker.getSelectedCountry();
            if (selectedCountry != null) {
                String str = this.f10613a;
                if ((str == null || !str.equals(charSequence.toString())) && countryCodePicker.s0) {
                    if (countryCodePicker.f10536D0 != null) {
                        String obj = countryCodePicker.getEditText_registeredCarrierNumber().getText().toString();
                        if (obj.length() >= countryCodePicker.f10536D0.f10626b) {
                            String p10 = PhoneNumberUtil.p(obj);
                            int length = p10.length();
                            int i11 = countryCodePicker.f10536D0.f10626b;
                            if (length >= i11) {
                                String substring = p10.substring(0, i11);
                                if (!substring.equals(countryCodePicker.f10587t0)) {
                                    com.hbb20.a a10 = countryCodePicker.f10536D0.a(countryCodePicker.f10559e, countryCodePicker.getLanguageToApply(), substring);
                                    if (!a10.equals(selectedCountry)) {
                                        countryCodePicker.f10591v0 = true;
                                        countryCodePicker.f10589u0 = Selection.getSelectionEnd(charSequence);
                                        countryCodePicker.setSelectedCountry(a10);
                                    }
                                    countryCodePicker.f10587t0 = substring;
                                }
                            }
                        }
                    }
                    this.f10613a = charSequence.toString();
                }
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    public void setAutoDetectionFailureListener(e eVar) {
    }

    public void setCustomDialogTextProvider(c cVar) {
    }

    public void setDialogEventsListener(d dVar) {
    }

    public void setOnCountryChangeListener(f fVar) {
    }
}
