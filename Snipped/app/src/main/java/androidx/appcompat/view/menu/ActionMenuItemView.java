package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import g.C0756a;
import m.C1023z;
import m.I;
import m.c0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C1023z implements k.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: a, reason: collision with root package name */
    public h f4659a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f4660b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f4661c;

    /* renamed from: d, reason: collision with root package name */
    public f.b f4662d;

    /* renamed from: e, reason: collision with root package name */
    public a f4663e;

    /* renamed from: f, reason: collision with root package name */
    public b f4664f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4665g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4666h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4667j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4668k;

    public class a extends I {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // m.I
        public final l.f b() {
            ActionMenuPresenter.a aVar;
            b bVar = ActionMenuItemView.this.f4664f;
            if (bVar == null || (aVar = ActionMenuPresenter.this.f4901u) == null) {
                return null;
            }
            return aVar.a();
        }

        @Override // m.I
        public final boolean c() {
            l.f b9;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            f.b bVar = actionMenuItemView.f4662d;
            return bVar != null && bVar.a(actionMenuItemView.f4659a) && (b9 = b()) != null && b9.b();
        }
    }

    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f4665g = c();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0756a.f20731c, 0, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f4668k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f4667j = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean b() {
        return (TextUtils.isEmpty(getText()) ^ true) && this.f4659a.getIcon() == null;
    }

    public final boolean c() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void d(h hVar) {
        this.f4659a = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.getTitleCondensed());
        setId(hVar.f4775a);
        setVisibility(hVar.isVisible() ? 0 : 8);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.f4663e == null) {
            this.f4663e = new a();
        }
    }

    public final void e() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f4660b);
        if (this.f4661c != null && ((this.f4659a.f4798y & 4) != 4 || (!this.f4665g && !this.f4666h))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f4660b : null);
        CharSequence charSequence = this.f4659a.f4790q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z12 ? null : this.f4659a.f4779e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f4659a.f4791r;
        if (TextUtils.isEmpty(charSequence2)) {
            c0.a(this, z12 ? null : this.f4659a.f4779e);
        } else {
            c0.a(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f4659a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f.b bVar = this.f4662d;
        if (bVar != null) {
            bVar.a(this.f4659a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4665g = c();
        e();
    }

    @Override // m.C1023z, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i9) {
        int i10;
        boolean z10 = !TextUtils.isEmpty(getText());
        if (z10 && (i10 = this.f4667j) >= 0) {
            super.setPadding(i10, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i9);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i11 = this.i;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i11) : i11;
        if (mode != 1073741824 && i11 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i9);
        }
        if (z10 || this.f4661c == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f4661c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f4659a.hasSubMenu() && (aVar = this.f4663e) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f4666h != z10) {
            this.f4666h = z10;
            h hVar = this.f4659a;
            if (hVar != null) {
                f fVar = hVar.f4787n;
                fVar.f4755k = true;
                fVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4661c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f4668k;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        e();
    }

    public void setItemInvoker(f.b bVar) {
        this.f4662d = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i9, int i10, int i11) {
        this.f4667j = i;
        super.setPadding(i, i9, i10, i11);
    }

    public void setPopupCallback(b bVar) {
        this.f4664f = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f4660b = charSequence;
        e();
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }
}
