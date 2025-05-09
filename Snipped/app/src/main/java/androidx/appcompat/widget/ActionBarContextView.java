package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuPresenter;
import com.luminary.mobile.R;
import g.C0756a;
import k.AbstractC0912a;
import m.AbstractC0999a;
import m.e0;
import y0.C1596C;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0999a {
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f4845j;

    /* renamed from: k, reason: collision with root package name */
    public View f4846k;

    /* renamed from: l, reason: collision with root package name */
    public View f4847l;

    /* renamed from: m, reason: collision with root package name */
    public View f4848m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f4849n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f4850o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f4851p;

    /* renamed from: q, reason: collision with root package name */
    public final int f4852q;

    /* renamed from: r, reason: collision with root package name */
    public final int f4853r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4854s;

    /* renamed from: t, reason: collision with root package name */
    public final int f4855t;

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC0912a f4856a;

        public a(AbstractC0912a abstractC0912a) {
            this.f4856a = abstractC0912a;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f4856a.c();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0756a.f20732d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : U4.b.j(context, resourceId));
        this.f4852q = obtainStyledAttributes.getResourceId(5, 0);
        this.f4853r = obtainStyledAttributes.getResourceId(4, 0);
        this.f23734e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f4855t = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public final void f(AbstractC0912a abstractC0912a) {
        View view = this.f4846k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f4855t, (ViewGroup) this, false);
            this.f4846k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f4846k);
        }
        View findViewById = this.f4846k.findViewById(R.id.action_mode_close_button);
        this.f4847l = findViewById;
        findViewById.setOnClickListener(new a(abstractC0912a));
        f e10 = abstractC0912a.e();
        ActionMenuPresenter actionMenuPresenter = this.f23733d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.b();
            ActionMenuPresenter.a aVar = actionMenuPresenter.f4901u;
            if (aVar != null && aVar.b()) {
                aVar.f4809j.dismiss();
            }
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f23733d = actionMenuPresenter2;
        actionMenuPresenter2.f4893m = true;
        actionMenuPresenter2.f4894n = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        e10.b(this.f23733d, this.f23731b);
        ActionMenuPresenter actionMenuPresenter3 = this.f23733d;
        k kVar = actionMenuPresenter3.f4695h;
        if (kVar == null) {
            k kVar2 = (k) actionMenuPresenter3.f4691d.inflate(actionMenuPresenter3.f4693f, (ViewGroup) this, false);
            actionMenuPresenter3.f4695h = kVar2;
            kVar2.b(actionMenuPresenter3.f4690c);
            actionMenuPresenter3.d(true);
        }
        k kVar3 = actionMenuPresenter3.f4695h;
        if (kVar != kVar3) {
            ((ActionMenuView) kVar3).setPresenter(actionMenuPresenter3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) kVar3;
        this.f23732c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f23732c, layoutParams);
    }

    public final void g() {
        if (this.f4849n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f4849n = linearLayout;
            this.f4850o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f4851p = (TextView) this.f4849n.findViewById(R.id.action_bar_subtitle);
            int i = this.f4852q;
            if (i != 0) {
                this.f4850o.setTextAppearance(getContext(), i);
            }
            int i9 = this.f4853r;
            if (i9 != 0) {
                this.f4851p.setTextAppearance(getContext(), i9);
            }
        }
        this.f4850o.setText(this.i);
        this.f4851p.setText(this.f4845j);
        boolean z10 = !TextUtils.isEmpty(this.i);
        boolean z11 = !TextUtils.isEmpty(this.f4845j);
        this.f4851p.setVisibility(z11 ? 0 : 8);
        this.f4849n.setVisibility((z10 || z11) ? 0 : 8);
        if (this.f4849n.getParent() == null) {
            addView(this.f4849n);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // m.AbstractC0999a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // m.AbstractC0999a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f4845j;
    }

    public CharSequence getTitle() {
        return this.i;
    }

    public final void h() {
        removeAllViews();
        this.f4848m = null;
        this.f23732c = null;
        this.f23733d = null;
        View view = this.f4847l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f23733d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.b();
            ActionMenuPresenter.a aVar = this.f23733d.f4901u;
            if (aVar == null || !aVar.b()) {
                return;
            }
            aVar.f4809j.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i9, int i10, int i11) {
        boolean z11 = e0.f23753a;
        boolean z12 = getLayoutDirection() == 1;
        int paddingRight = z12 ? (i10 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i11 - i9) - getPaddingTop()) - getPaddingBottom();
        View view = this.f4846k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4846k.getLayoutParams();
            int i12 = z12 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i13 = z12 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i14 = z12 ? paddingRight - i12 : paddingRight + i12;
            int d10 = AbstractC0999a.d(i14, paddingTop, paddingTop2, this.f4846k, z12) + i14;
            paddingRight = z12 ? d10 - i13 : d10 + i13;
        }
        LinearLayout linearLayout = this.f4849n;
        if (linearLayout != null && this.f4848m == null && linearLayout.getVisibility() != 8) {
            paddingRight += AbstractC0999a.d(paddingRight, paddingTop, paddingTop2, this.f4849n, z12);
        }
        View view2 = this.f4848m;
        if (view2 != null) {
            AbstractC0999a.d(paddingRight, paddingTop, paddingTop2, view2, z12);
        }
        int paddingLeft = z12 ? getPaddingLeft() : (i10 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f23732c;
        if (actionMenuView != null) {
            AbstractC0999a.d(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z12);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i9) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i9) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int i10 = this.f23734e;
        if (i10 <= 0) {
            i10 = View.MeasureSpec.getSize(i9);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i11 = i10 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
        View view = this.f4846k;
        if (view != null) {
            int c2 = AbstractC0999a.c(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4846k.getLayoutParams();
            paddingLeft = c2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f23732c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = AbstractC0999a.c(this.f23732c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f4849n;
        if (linearLayout != null && this.f4848m == null) {
            if (this.f4854s) {
                this.f4849n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f4849n.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f4849n.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = AbstractC0999a.c(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f4848m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                i11 = Math.min(i14, i11);
            }
            this.f4848m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(i11, i15));
        }
        if (this.f23734e > 0) {
            setMeasuredDimension(size, i10);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // m.AbstractC0999a
    public void setContentHeight(int i) {
        this.f23734e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f4848m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f4848m = view;
        if (view != null && (linearLayout = this.f4849n) != null) {
            removeView(linearLayout);
            this.f4849n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f4845j = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        g();
        C1596C.p(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f4854s) {
            requestLayout();
        }
        this.f4854s = z10;
    }

    @Override // m.AbstractC0999a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
