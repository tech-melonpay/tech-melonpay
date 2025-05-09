package X2;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.luminary.mobile.R;
import java.util.WeakHashMap;
import u2.C1512a;
import y0.C1596C;
import y0.E;
import z0.C1638d;

/* compiled from: DropdownMenuEndIconDelegate.java */
/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: e, reason: collision with root package name */
    public final int f3966e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3967f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f3968g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f3969h;
    public final J7.b i;

    /* renamed from: j, reason: collision with root package name */
    public final a f3970j;

    /* renamed from: k, reason: collision with root package name */
    public final A0.b f3971k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3972l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3973m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3974n;

    /* renamed from: o, reason: collision with root package name */
    public long f3975o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f3976p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f3977q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f3978r;

    public h(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.i = new J7.b(this, 5);
        this.f3970j = new a(this, 1);
        this.f3971k = new A0.b(this, 18);
        this.f3975o = Long.MAX_VALUE;
        this.f3967f = L2.k.c(aVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f3966e = L2.k.c(aVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f3968g = L2.k.d(aVar.getContext(), R.attr.motionEasingLinearInterpolator, C1512a.f30141a);
    }

    @Override // X2.i
    public final void a() {
        if (this.f3976p.isTouchExplorationEnabled() && U4.b.q(this.f3969h) && !this.f3982d.hasFocus()) {
            this.f3969h.dismissDropDown();
        }
        this.f3969h.post(new B2.d(this, 15));
    }

    @Override // X2.i
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // X2.i
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // X2.i
    public final View.OnFocusChangeListener e() {
        return this.f3970j;
    }

    @Override // X2.i
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // X2.i
    public final A0.b h() {
        return this.f3971k;
    }

    @Override // X2.i
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // X2.i
    public final boolean j() {
        return this.f3972l;
    }

    @Override // X2.i
    public final boolean l() {
        return this.f3974n;
    }

    @Override // X2.i
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f3969h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new com.sumsub.sns.core.widget.applicantData.b(this, 2));
        this.f3969h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: X2.g
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                h hVar = h.this;
                hVar.f3973m = true;
                hVar.f3975o = System.currentTimeMillis();
                hVar.t(false);
            }
        });
        this.f3969h.setThreshold(0);
        TextInputLayout textInputLayout = this.f3979a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!U4.b.q(editText) && this.f3976p.isTouchExplorationEnabled()) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            this.f3982d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // X2.i
    public final void n(C1638d c1638d) {
        if (!U4.b.q(this.f3969h)) {
            c1638d.h(Spinner.class.getName());
        }
        AccessibilityNodeInfo accessibilityNodeInfo = c1638d.f31219a;
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // X2.i
    @SuppressLint({"WrongConstant"})
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f3976p.isEnabled() || U4.b.q(this.f3969h)) {
            return;
        }
        boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f3974n && !this.f3969h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z10) {
            u();
            this.f3973m = true;
            this.f3975o = System.currentTimeMillis();
        }
    }

    @Override // X2.i
    public final void r() {
        int i = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f3968g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f3967f);
        ofFloat.addUpdateListener(new A2.a(this, i));
        this.f3978r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f3966e);
        ofFloat2.addUpdateListener(new A2.a(this, i));
        this.f3977q = ofFloat2;
        ofFloat2.addListener(new N2.o(this, i));
        this.f3976p = (AccessibilityManager) this.f3981c.getSystemService("accessibility");
    }

    @Override // X2.i
    @SuppressLint({"ClickableViewAccessibility"})
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f3969h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f3969h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z10) {
        if (this.f3974n != z10) {
            this.f3974n = z10;
            this.f3978r.cancel();
            this.f3977q.start();
        }
    }

    public final void u() {
        if (this.f3969h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f3975o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f3973m = false;
        }
        if (this.f3973m) {
            this.f3973m = false;
            return;
        }
        t(!this.f3974n);
        if (!this.f3974n) {
            this.f3969h.dismissDropDown();
        } else {
            this.f3969h.requestFocus();
            this.f3969h.showDropDown();
        }
    }
}
