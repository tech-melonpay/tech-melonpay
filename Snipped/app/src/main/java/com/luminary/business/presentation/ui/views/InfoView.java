package com.luminary.business.presentation.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.luminary.mobile.R;
import s6.a0;

/* compiled from: InfoView.kt */
/* loaded from: classes2.dex */
public final class InfoView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f13172a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f13173b;

    public InfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.info_layout, this);
        ImageView imageView = (ImageView) findViewById(R.id.infoIcon);
        this.f13172a = imageView;
        TextView textView = (TextView) findViewById(R.id.infoTextView);
        this.f13173b = textView;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.f26780e);
            String string = obtainStyledAttributes.getString(1);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            textView.setText(string == null ? "" : string);
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void setInfoIcon(int i) {
        this.f13172a.setImageResource(i);
    }

    public final void setInfoText(String str) {
        if (str == null) {
            str = "";
        }
        this.f13173b.setText(str);
    }
}
