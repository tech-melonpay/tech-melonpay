package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.measurement.internal.a;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
/* loaded from: classes.dex */
public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    private static final int zab(int i, int i9, int i10, int i11) {
        if (i == 0) {
            return i9;
        }
        if (i == 1) {
            return i10;
        }
        if (i == 2) {
            return i11;
        }
        throw new IllegalStateException(a.g(i, "Unknown color scheme: "));
    }

    public final void zaa(Resources resources, int i, int i9) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i10 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i10);
        setMinWidth(i10);
        int i11 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_dark;
        int i12 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_light;
        int zab = zab(i9, i11, i12, i12);
        int i13 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_dark;
        int i14 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_light;
        int zab2 = zab(i9, i13, i14, i14);
        if (i == 0 || i == 1) {
            zab = zab2;
        } else if (i != 2) {
            throw new IllegalStateException(a.g(i, "Unknown button size: "));
        }
        Drawable drawable = resources.getDrawable(zab);
        drawable.setTintList(resources.getColorStateList(com.google.android.gms.base.R.color.common_google_signin_btn_tint));
        drawable.setTintMode(PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawable);
        int i15 = com.google.android.gms.base.R.color.common_google_signin_btn_text_dark;
        int i16 = com.google.android.gms.base.R.color.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zab(i9, i15, i16, i16))));
        if (i == 0) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text_long));
        } else {
            if (i != 2) {
                throw new IllegalStateException(a.g(i, "Unknown button size: "));
            }
            setText((CharSequence) null);
        }
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
