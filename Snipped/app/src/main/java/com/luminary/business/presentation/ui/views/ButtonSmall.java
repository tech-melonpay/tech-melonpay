package com.luminary.business.presentation.ui.views;

import F0.d;
import F0.f;
import F8.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import com.luminary.mobile.R;
import k0.C0913a;
import s6.a0;
import t6.AbstractC1360j;

/* compiled from: ButtonSmall.kt */
/* loaded from: classes2.dex */
public final class ButtonSmall extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1360j f13160a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f13161b;

    public ButtonSmall(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(getContext());
        int i = AbstractC1360j.f29110r;
        DataBinderMapperImpl dataBinderMapperImpl = d.f1140a;
        AbstractC1360j abstractC1360j = (AbstractC1360j) f.f(from, R.layout.button_small, this, true, null);
        this.f13160a = abstractC1360j;
        isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.f26776a);
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            int resourceId2 = obtainStyledAttributes.getResourceId(0, -1);
            String string = obtainStyledAttributes.getString(3);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(4);
            obtainStyledAttributes.getColorStateList(5);
            obtainStyledAttributes.getBoolean(2, isEnabled());
            ImageView imageView = abstractC1360j.f29113p;
            if (resourceId != -1) {
                if (resourceId == R.drawable.ic_alphabet_inc || resourceId == R.drawable.ic_alphabet_decr) {
                    ((ConstraintLayout.a) imageView.getLayoutParams()).i = -1;
                } else {
                    ((ConstraintLayout.a) imageView.getLayoutParams()).i = 0;
                }
                setIcon(Integer.valueOf(resourceId));
            }
            if (resourceId2 != -1) {
                setBackground(resourceId2);
            }
            if (string != null) {
                setText(string);
            } else {
                setText("");
            }
            TextView textView = abstractC1360j.f29114q;
            if (colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
            abstractC1360j.f29112o.setEnabled(isEnabled());
            imageView.setEnabled(isEnabled());
            abstractC1360j.f29111n.setEnabled(isEnabled());
            textView.setEnabled(isEnabled());
            obtainStyledAttributes.recycle();
        }
    }

    public final void setBackground(int i) {
        this.f13160a.f29111n.setBackgroundResource(i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        AbstractC1360j abstractC1360j = this.f13160a;
        abstractC1360j.f29112o.setEnabled(z10);
        abstractC1360j.f29113p.setEnabled(z10);
        abstractC1360j.f29111n.setEnabled(z10);
        abstractC1360j.f29114q.setEnabled(z10);
    }

    public final void setIcon(Integer num) {
        Integer num2;
        AbstractC1360j abstractC1360j = this.f13160a;
        if (num == null) {
            o.b(abstractC1360j.f29112o);
            return;
        }
        this.f13161b = num;
        if (num.intValue() == R.drawable.ic_alphabet_inc || ((num2 = this.f13161b) != null && num2.intValue() == R.drawable.ic_alphabet_decr)) {
            ((ConstraintLayout.a) abstractC1360j.f29113p.getLayoutParams()).i = -1;
        } else {
            ((ConstraintLayout.a) abstractC1360j.f29113p.getLayoutParams()).i = 0;
        }
        abstractC1360j.f29112o.setImageResource(num.intValue());
        abstractC1360j.f29113p.setImageResource(num.intValue());
    }

    public final void setIconMargin(int i) {
        ImageView imageView = this.f13160a.f29112o;
        ConstraintLayout.a aVar = (ConstraintLayout.a) imageView.getLayoutParams();
        aVar.setMarginStart((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
        imageView.setLayoutParams(aVar);
    }

    public final void setIsActive(Boolean bool) {
        AbstractC1360j abstractC1360j = this.f13160a;
        if (bool == null) {
            abstractC1360j.f29112o.clearColorFilter();
            abstractC1360j.f29113p.clearColorFilter();
            return;
        }
        if (bool.booleanValue()) {
            abstractC1360j.f29111n.setBackgroundResource(R.drawable.circle_black);
            ImageView imageView = abstractC1360j.f29112o;
            int color = C0913a.getColor(getContext(), R.color.white);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView.setColorFilter(color, mode);
            abstractC1360j.f29113p.setColorFilter(C0913a.getColor(getContext(), R.color.white), mode);
            return;
        }
        abstractC1360j.f29111n.setBackgroundResource(R.drawable.white_circle);
        ImageView imageView2 = abstractC1360j.f29112o;
        int color2 = C0913a.getColor(getContext(), R.color.black);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(color2, mode2);
        abstractC1360j.f29113p.setColorFilter(C0913a.getColor(getContext(), R.color.black), mode2);
    }

    public final void setIsDark(boolean z10) {
        AbstractC1360j abstractC1360j = this.f13160a;
        if (z10) {
            ImageView imageView = abstractC1360j.f29112o;
            int a10 = o.a(R.color.white, this);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView.setColorFilter(a10, mode);
            abstractC1360j.f29113p.setColorFilter(o.a(R.color.white, this), mode);
            abstractC1360j.f29111n.setBackgroundResource(R.drawable.small_btn_bg_dark);
            abstractC1360j.f29114q.setTextColor(o.a(R.color.white, this));
            return;
        }
        ImageView imageView2 = abstractC1360j.f29112o;
        int a11 = o.a(R.color.black, this);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(a11, mode2);
        abstractC1360j.f29113p.setColorFilter(o.a(R.color.black, this), mode2);
        abstractC1360j.f29111n.setBackgroundResource(R.drawable.small_btn_bg);
        abstractC1360j.f29114q.setTextColor(o.a(R.color.black, this));
    }

    public final void setIsEnabled(boolean z10) {
        AbstractC1360j abstractC1360j = this.f13160a;
        abstractC1360j.f29111n.setEnabled(z10);
        abstractC1360j.f29114q.setEnabled(z10);
        abstractC1360j.f29112o.setEnabled(z10);
        abstractC1360j.f29113p.setEnabled(z10);
    }

    public final void setText(CharSequence charSequence) {
        int length = charSequence.length();
        AbstractC1360j abstractC1360j = this.f13160a;
        if (length == 0) {
            o.b(abstractC1360j.f29114q);
            o.b(abstractC1360j.f29112o);
            abstractC1360j.f29113p.setVisibility(0);
        } else {
            abstractC1360j.f29114q.setVisibility(0);
            abstractC1360j.f29112o.setVisibility(0);
            o.b(abstractC1360j.f29113p);
        }
        abstractC1360j.f29114q.setText(charSequence);
    }

    public final void setTextColor(int i) {
        this.f13160a.f29114q.setTextColor(i);
    }

    public final void setTextColorRes(int i) {
        o.h(this.f13160a.f29114q, i);
    }

    public final void setTint(int i) {
        this.f13160a.f29112o.setColorFilter(C0913a.getColor(getContext(), i), PorterDuff.Mode.SRC_IN);
    }
}
