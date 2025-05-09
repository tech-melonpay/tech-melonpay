package X2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.C1023z;
import u2.C1512a;
import u2.C1513b;
import y0.C1596C;
import y0.E;

/* compiled from: IndicatorViewController.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f3983A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f3984B;

    /* renamed from: a, reason: collision with root package name */
    public final int f3985a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3986b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3987c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f3988d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f3989e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f3990f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f3991g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f3992h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f3993j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f3994k;

    /* renamed from: l, reason: collision with root package name */
    public Animator f3995l;

    /* renamed from: m, reason: collision with root package name */
    public final float f3996m;

    /* renamed from: n, reason: collision with root package name */
    public int f3997n;

    /* renamed from: o, reason: collision with root package name */
    public int f3998o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f3999p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4000q;

    /* renamed from: r, reason: collision with root package name */
    public C1023z f4001r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f4002s;

    /* renamed from: t, reason: collision with root package name */
    public int f4003t;

    /* renamed from: u, reason: collision with root package name */
    public int f4004u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f4005v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f4006w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4007x;

    /* renamed from: y, reason: collision with root package name */
    public C1023z f4008y;

    /* renamed from: z, reason: collision with root package name */
    public int f4009z;

    /* compiled from: IndicatorViewController.java */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f4010a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextView f4011b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f4012c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TextView f4013d;

        public a(int i, TextView textView, int i9, TextView textView2) {
            this.f4010a = i;
            this.f4011b = textView;
            this.f4012c = i9;
            this.f4013d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C1023z c1023z;
            int i = this.f4010a;
            k kVar = k.this;
            kVar.f3997n = i;
            kVar.f3995l = null;
            TextView textView = this.f4011b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f4012c == 1 && (c1023z = kVar.f4001r) != null) {
                    c1023z.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f4013d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                textView2.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f4013d;
            if (textView != null) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
        }
    }

    public k(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f3991g = context;
        this.f3992h = textInputLayout;
        this.f3996m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f3985a = L2.k.c(context, R.attr.motionDurationShort4, 217);
        this.f3986b = L2.k.c(context, R.attr.motionDurationMedium4, 167);
        this.f3987c = L2.k.c(context, R.attr.motionDurationShort4, 167);
        this.f3988d = L2.k.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, C1512a.f30144d);
        LinearInterpolator linearInterpolator = C1512a.f30141a;
        this.f3989e = L2.k.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f3990f = L2.k.d(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(TextView textView, int i) {
        if (this.i == null && this.f3994k == null) {
            Context context = this.f3991g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.f3992h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f3994k = new FrameLayout(context);
            this.i.addView(this.f3994k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f3994k.setVisibility(0);
            this.f3994k.addView(textView);
        } else {
            this.i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f3993j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.f3992h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f3991g;
                boolean e10 = P2.c.e(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                int paddingStart = editText.getPaddingStart();
                if (e10) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (e10) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (e10) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        Animator animator = this.f3995l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z10, TextView textView, int i, int i9, int i10) {
        if (textView == null || !z10) {
            return;
        }
        if (i == i10 || i == i9) {
            boolean z11 = i10 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z11 ? 1.0f : 0.0f);
            int i11 = this.f3987c;
            ofFloat.setDuration(z11 ? this.f3986b : i11);
            ofFloat.setInterpolator(z11 ? this.f3989e : this.f3990f);
            if (i == i10 && i9 != 0) {
                ofFloat.setStartDelay(i11);
            }
            arrayList.add(ofFloat);
            if (i10 != i || i9 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f3996m, 0.0f);
            ofFloat2.setDuration(this.f3985a);
            ofFloat2.setInterpolator(this.f3988d);
            ofFloat2.setStartDelay(i11);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f4001r;
        }
        if (i != 2) {
            return null;
        }
        return this.f4008y;
    }

    public final void f() {
        this.f3999p = null;
        c();
        if (this.f3997n == 1) {
            if (!this.f4007x || TextUtils.isEmpty(this.f4006w)) {
                this.f3998o = 0;
            } else {
                this.f3998o = 2;
            }
        }
        i(this.f3997n, this.f3998o, h(this.f4001r, ""));
    }

    public final void g(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f3994k) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i9 = this.f3993j - 1;
        this.f3993j = i9;
        LinearLayout linearLayout2 = this.i;
        if (i9 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(TextView textView, CharSequence charSequence) {
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        TextInputLayout textInputLayout = this.f3992h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f3998o == this.f3997n && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public final void i(int i, int i9, boolean z10) {
        TextView e10;
        TextView e11;
        if (i == i9) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f3995l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f4007x, this.f4008y, 2, i, i9);
            d(arrayList, this.f4000q, this.f4001r, 1, i, i9);
            C1513b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i9, e(i), i, e(i9)));
            animatorSet.start();
        } else if (i != i9) {
            if (i9 != 0 && (e11 = e(i9)) != null) {
                e11.setVisibility(0);
                e11.setAlpha(1.0f);
            }
            if (i != 0 && (e10 = e(i)) != null) {
                e10.setVisibility(4);
                if (i == 1) {
                    e10.setText((CharSequence) null);
                }
            }
            this.f3997n = i9;
        }
        TextInputLayout textInputLayout = this.f3992h;
        textInputLayout.updateEditTextBackground();
        textInputLayout.updateLabelState(z10);
        textInputLayout.updateTextInputBoxState();
    }
}
