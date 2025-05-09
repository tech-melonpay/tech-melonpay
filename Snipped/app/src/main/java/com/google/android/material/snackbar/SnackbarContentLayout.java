package com.google.android.material.snackbar;

import L2.k;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.luminary.mobile.R;
import java.util.WeakHashMap;
import u2.C1512a;
import y0.C1596C;
import y0.E;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements V2.c {

    /* renamed from: a, reason: collision with root package name */
    public TextView f9780a;

    /* renamed from: b, reason: collision with root package name */
    public Button f9781b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeInterpolator f9782c;

    /* renamed from: d, reason: collision with root package name */
    public int f9783d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9782c = k.d(context, R.attr.motionEasingEmphasizedInterpolator, C1512a.f30142b);
    }

    public final boolean a(int i, int i9, int i10) {
        boolean z10;
        if (i != getOrientation()) {
            setOrientation(i);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f9780a.getPaddingTop() == i9 && this.f9780a.getPaddingBottom() == i10) {
            return z10;
        }
        TextView textView = this.f9780a;
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i9, textView.getPaddingEnd(), i10);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i9, textView.getPaddingRight(), i10);
        return true;
    }

    public Button getActionView() {
        return this.f9781b;
    }

    public TextView getMessageView() {
        return this.f9780a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f9780a = (TextView) findViewById(R.id.snackbar_text);
        this.f9781b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i9) {
        super.onMeasure(i, i9);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f9780a.getLayout();
        boolean z10 = layout != null && layout.getLineCount() > 1;
        if (!z10 || this.f9783d <= 0 || this.f9781b.getMeasuredWidth() <= this.f9783d) {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i9);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f9783d = i;
    }
}
