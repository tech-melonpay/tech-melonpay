package com.google.android.material.bottomsheet;

import L2.e;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.luminary.mobile.R;
import h.DialogC0783j;
import java.util.WeakHashMap;
import y0.C1596C;
import y0.E;
import y0.H;
import y0.J;
import y0.L;

/* compiled from: BottomSheetDialog.java */
/* loaded from: classes.dex */
public class e extends DialogC0783j {

    /* renamed from: f, reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f9174f;

    /* renamed from: g, reason: collision with root package name */
    public FrameLayout f9175g;

    /* renamed from: h, reason: collision with root package name */
    public CoordinatorLayout f9176h;
    public FrameLayout i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9177j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9178k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9179l;

    /* renamed from: m, reason: collision with root package name */
    public b f9180m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f9181n;

    /* renamed from: o, reason: collision with root package name */
    public L2.e f9182o;

    /* renamed from: p, reason: collision with root package name */
    public final a f9183p;

    /* compiled from: BottomSheetDialog.java */
    public static class b extends BottomSheetBehavior.g {

        /* renamed from: b, reason: collision with root package name */
        public final Boolean f9185b;

        /* renamed from: c, reason: collision with root package name */
        public final J f9186c;

        /* renamed from: d, reason: collision with root package name */
        public Window f9187d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f9188e;

        public b(FrameLayout frameLayout, J j10) {
            ColorStateList c2;
            this.f9186c = j10;
            T2.f materialShapeDrawable = BottomSheetBehavior.from(frameLayout).getMaterialShapeDrawable();
            if (materialShapeDrawable != null) {
                c2 = materialShapeDrawable.f3448a.f3473c;
            } else {
                WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                c2 = C1596C.d.c(frameLayout);
            }
            if (c2 != null) {
                this.f9185b = Boolean.valueOf(D9.b.Y(c2.getDefaultColor()));
                return;
            }
            ColorStateList a10 = F2.a.a(frameLayout.getBackground());
            Integer valueOf = a10 != null ? Integer.valueOf(a10.getDefaultColor()) : null;
            if (valueOf != null) {
                this.f9185b = Boolean.valueOf(D9.b.Y(valueOf.intValue()));
            } else {
                this.f9185b = null;
            }
        }

        public final void a(View view) {
            int top = view.getTop();
            J j10 = this.f9186c;
            if (top < j10.d()) {
                Window window = this.f9187d;
                if (window != null) {
                    Boolean bool = this.f9185b;
                    new L(window, window.getDecorView()).f31039a.d(bool == null ? this.f9188e : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), j10.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f9187d;
                if (window2 != null) {
                    new L(window2, window2.getDecorView()).f31039a.d(this.f9188e);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public final void b(Window window) {
            if (this.f9187d == window) {
                return;
            }
            this.f9187d = window;
            if (window != null) {
                this.f9188e = new L(window, window.getDecorView()).f31039a.b();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public final void onLayout(View view) {
            a(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public final void onSlide(View view, float f10) {
            a(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public final void onStateChanged(View view, int i) {
            a(view);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L1b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130968705(0x7f040081, float:1.7546071E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L18
            int r5 = r5.resourceId
            goto L1b
        L18:
            r5 = 2132083356(0x7f15029c, float:1.9806852E38)
        L1b:
            r3.<init>(r4, r5)
            r3.f9177j = r0
            r3.f9178k = r0
            com.google.android.material.bottomsheet.e$a r4 = new com.google.android.material.bottomsheet.e$a
            r4.<init>()
            r3.f9183p = r4
            h.d r4 = r3.f()
            r4.u(r0)
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            r5 = 2130969074(0x7f0401f2, float:1.754682E38)
            int[] r5 = new int[]{r5}
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5)
            r5 = 0
            boolean r4 = r4.getBoolean(r5, r5)
            r3.f9181n = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.e.<init>(android.content.Context, int):void");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        j();
        super.cancel();
    }

    public final void i() {
        if (this.f9175g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f9175g = frameLayout;
            this.f9176h = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f9175g.findViewById(R.id.design_bottom_sheet);
            this.i = frameLayout2;
            BottomSheetBehavior<FrameLayout> from = BottomSheetBehavior.from(frameLayout2);
            this.f9174f = from;
            from.addBottomSheetCallback(this.f9183p);
            this.f9174f.setHideable(this.f9177j);
            this.f9182o = new L2.e(this.f9174f, this.i);
        }
    }

    public final BottomSheetBehavior<FrameLayout> j() {
        if (this.f9174f == null) {
            i();
        }
        return this.f9174f;
    }

    public final FrameLayout k(View view, int i, ViewGroup.LayoutParams layoutParams) {
        i();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f9175g.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f9181n) {
            FrameLayout frameLayout = this.i;
            com.google.android.material.bottomsheet.a aVar = new com.google.android.material.bottomsheet.a(this);
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            C1596C.d.m(frameLayout, aVar);
        }
        this.i.removeAllViews();
        if (layoutParams == null) {
            this.i.addView(view);
        } else {
            this.i.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new com.google.android.material.bottomsheet.b(this));
        C1596C.o(this.i, new c(this));
        this.i.setOnTouchListener(new d());
        return this.f9175g;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z10 = this.f9181n && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f9175g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f9176h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            H.a(window, !z10);
            b bVar = this.f9180m;
            if (bVar != null) {
                bVar.b(window);
            }
        }
        L2.e eVar = this.f9182o;
        if (eVar == null) {
            return;
        }
        boolean z11 = this.f9177j;
        View view = eVar.f2477c;
        e.a aVar = eVar.f2475a;
        if (z11) {
            if (aVar != null) {
                aVar.b(eVar.f2476b, view, false);
            }
        } else if (aVar != null) {
            aVar.c(view);
        }
    }

    @Override // h.DialogC0783j, c.DialogC0616g, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        e.a aVar;
        b bVar = this.f9180m;
        if (bVar != null) {
            bVar.b(null);
        }
        L2.e eVar = this.f9182o;
        if (eVar == null || (aVar = eVar.f2475a) == null) {
            return;
        }
        aVar.c(eVar.f2477c);
    }

    @Override // c.DialogC0616g, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f9174f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 5) {
            return;
        }
        this.f9174f.setState(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z10) {
        L2.e eVar;
        super.setCancelable(z10);
        if (this.f9177j != z10) {
            this.f9177j = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f9174f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z10);
            }
            if (getWindow() == null || (eVar = this.f9182o) == null) {
                return;
            }
            boolean z11 = this.f9177j;
            View view = eVar.f2477c;
            e.a aVar = eVar.f2475a;
            if (z11) {
                if (aVar != null) {
                    aVar.b(eVar.f2476b, view, false);
                }
            } else if (aVar != null) {
                aVar.c(view);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f9177j) {
            this.f9177j = true;
        }
        this.f9178k = z10;
        this.f9179l = true;
    }

    @Override // h.DialogC0783j, c.DialogC0616g, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(k(null, i, null));
    }

    @Override // h.DialogC0783j, c.DialogC0616g, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(k(view, 0, null));
    }

    @Override // h.DialogC0783j, c.DialogC0616g, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(k(view, 0, layoutParams));
    }

    /* compiled from: BottomSheetDialog.java */
    public class a extends BottomSheetBehavior.g {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public final void onStateChanged(View view, int i) {
            if (i == 5) {
                e.this.cancel();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public final void onSlide(View view, float f10) {
        }
    }
}
