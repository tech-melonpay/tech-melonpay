package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import f0.C0736d;
import java.util.HashMap;

/* loaded from: classes.dex */
public class Barrier extends a {
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f6232j;

    /* renamed from: k, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.a f6233k;

    public Barrier(Context context) {
        super(context);
        this.f6320a = new int[32];
        this.f6326g = null;
        this.f6327h = new HashMap<>();
        this.f6322c = context;
        h(null);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f6233k.f6069v0;
    }

    public int getMargin() {
        return this.f6233k.f6070w0;
    }

    public int getType() {
        return this.i;
    }

    @Override // androidx.constraintlayout.widget.a
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.f6233k = new androidx.constraintlayout.core.widgets.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0736d.f20591b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f6233k.f6069v0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f6233k.f6070w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f6323d = this.f6233k;
        k();
    }

    @Override // androidx.constraintlayout.widget.a
    public final void i(ConstraintWidget constraintWidget, boolean z10) {
        int i = this.i;
        this.f6232j = i;
        if (z10) {
            if (i == 5) {
                this.f6232j = 1;
            } else if (i == 6) {
                this.f6232j = 0;
            }
        } else if (i == 5) {
            this.f6232j = 0;
        } else if (i == 6) {
            this.f6232j = 1;
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            ((androidx.constraintlayout.core.widgets.a) constraintWidget).f6068u0 = this.f6232j;
        }
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f6233k.f6069v0 = z10;
    }

    public void setDpMargin(int i) {
        this.f6233k.f6070w0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f6233k.f6070w0 = i;
    }

    public void setType(int i) {
        this.i = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
