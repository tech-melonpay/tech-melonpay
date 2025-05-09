package com.hbb20;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import java.lang.reflect.Field;

/* compiled from: CountryCodeDialog.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f10630a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f10631b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f10632c;

    /* renamed from: d, reason: collision with root package name */
    public static Dialog f10633d;

    /* renamed from: e, reason: collision with root package name */
    public static Context f10634e;

    static {
        Field field;
        Field field2;
        Field field3;
        boolean z10 = true;
        try {
            field2 = TextView.class.getDeclaredField("mCursorDrawableRes");
            try {
                field2.setAccessible(true);
                field = TextView.class.getDeclaredField("mEditor");
                try {
                    field.setAccessible(true);
                    field3 = field.getType().getDeclaredField("mCursorDrawable");
                    try {
                        field3.setAccessible(true);
                        z10 = false;
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    field3 = null;
                }
            } catch (Exception unused3) {
                field = null;
                field3 = null;
            }
        } catch (Exception unused4) {
            field = null;
            field2 = null;
            field3 = null;
        }
        if (z10) {
            f10630a = null;
            f10631b = null;
            f10632c = null;
        } else {
            f10630a = field;
            f10631b = field3;
            f10632c = field2;
        }
    }

    public static void a(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus == null) {
                currentFocus = new View(activity);
            }
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }
}
