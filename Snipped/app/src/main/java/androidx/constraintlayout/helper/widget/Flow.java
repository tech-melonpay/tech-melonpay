package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.core.widgets.h;
import f0.AbstractC0738f;
import f0.C0736d;

/* loaded from: classes.dex */
public class Flow extends AbstractC0738f {

    /* renamed from: k, reason: collision with root package name */
    public e f6201k;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // f0.AbstractC0738f, androidx.constraintlayout.widget.a
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.f6201k = new e();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0736d.f20591b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f6201k.f6160X0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    e eVar = this.f6201k;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    eVar.f6195u0 = dimensionPixelSize;
                    eVar.f6196v0 = dimensionPixelSize;
                    eVar.f6197w0 = dimensionPixelSize;
                    eVar.f6198x0 = dimensionPixelSize;
                } else if (index == 18) {
                    e eVar2 = this.f6201k;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    eVar2.f6197w0 = dimensionPixelSize2;
                    eVar2.f6199y0 = dimensionPixelSize2;
                    eVar2.f6200z0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f6201k.f6198x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f6201k.f6199y0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f6201k.f6195u0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f6201k.f6200z0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f6201k.f6196v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f6201k.f6158V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f6201k.f6143F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f6201k.f6144G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f6201k.f6145H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f6201k.f6147J0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f6201k.f6146I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f6201k.f6148K0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f6201k.f6149L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f6201k.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f6201k.f6152P0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f6201k.f6151O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f6201k.f6153Q0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f6201k.f6150M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f6201k.f6156T0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f6201k.f6157U0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f6201k.f6154R0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f6201k.f6155S0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f6201k.f6159W0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f6323d = this.f6201k;
        k();
    }

    @Override // androidx.constraintlayout.widget.a
    public final void i(ConstraintWidget constraintWidget, boolean z10) {
        e eVar = this.f6201k;
        int i = eVar.f6197w0;
        if (i > 0 || eVar.f6198x0 > 0) {
            if (z10) {
                eVar.f6199y0 = eVar.f6198x0;
                eVar.f6200z0 = i;
            } else {
                eVar.f6199y0 = i;
                eVar.f6200z0 = eVar.f6198x0;
            }
        }
    }

    @Override // f0.AbstractC0738f
    public final void l(h hVar, int i, int i9) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i9);
        int size2 = View.MeasureSpec.getSize(i9);
        if (hVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            hVar.T(mode, size, mode2, size2);
            setMeasuredDimension(hVar.f6191B0, hVar.f6192C0);
        }
    }

    @Override // androidx.constraintlayout.widget.a, android.view.View
    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i, int i9) {
        l(this.f6201k, i, i9);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f6201k.N0 = f10;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f6201k.f6145H0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f6201k.f6151O0 = f10;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f6201k.f6146I0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f6201k.f6156T0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f6201k.f6149L0 = f10;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f6201k.f6154R0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f6201k.f6143F0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f6201k.f6152P0 = f10;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f6201k.f6147J0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f6201k.f6153Q0 = f10;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f6201k.f6148K0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f6201k.f6159W0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f6201k.f6160X0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        e eVar = this.f6201k;
        eVar.f6195u0 = i;
        eVar.f6196v0 = i;
        eVar.f6197w0 = i;
        eVar.f6198x0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f6201k.f6196v0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f6201k.f6199y0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f6201k.f6200z0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f6201k.f6195u0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f6201k.f6157U0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f6201k.f6150M0 = f10;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f6201k.f6155S0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f6201k.f6144G0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f6201k.f6158V0 = i;
        requestLayout();
    }
}
