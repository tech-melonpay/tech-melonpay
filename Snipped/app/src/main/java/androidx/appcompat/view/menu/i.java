package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import com.luminary.mobile.R;
import l.AbstractC0974d;

/* compiled from: MenuPopupHelper.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4801a;

    /* renamed from: b, reason: collision with root package name */
    public final f f4802b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4803c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4804d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4805e;

    /* renamed from: f, reason: collision with root package name */
    public View f4806f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4808h;
    public j.a i;

    /* renamed from: j, reason: collision with root package name */
    public AbstractC0974d f4809j;

    /* renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f4810k;

    /* renamed from: g, reason: collision with root package name */
    public int f4807g = 8388611;

    /* renamed from: l, reason: collision with root package name */
    public final a f4811l = new a();

    /* compiled from: MenuPopupHelper.java */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            i.this.c();
        }
    }

    public i(int i, int i9, Context context, View view, f fVar, boolean z10) {
        this.f4801a = context;
        this.f4802b = fVar;
        this.f4806f = view;
        this.f4803c = z10;
        this.f4804d = i;
        this.f4805e = i9;
    }

    public final AbstractC0974d a() {
        AbstractC0974d lVar;
        if (this.f4809j == null) {
            Context context = this.f4801a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                lVar = new b(this.f4801a, this.f4806f, this.f4804d, this.f4805e, this.f4803c);
            } else {
                View view = this.f4806f;
                int i = this.f4805e;
                boolean z10 = this.f4803c;
                lVar = new l(this.f4804d, i, this.f4801a, view, this.f4802b, z10);
            }
            lVar.n(this.f4802b);
            lVar.t(this.f4811l);
            lVar.p(this.f4806f);
            lVar.f(this.i);
            lVar.q(this.f4808h);
            lVar.r(this.f4807g);
            this.f4809j = lVar;
        }
        return this.f4809j;
    }

    public final boolean b() {
        AbstractC0974d abstractC0974d = this.f4809j;
        return abstractC0974d != null && abstractC0974d.b();
    }

    public void c() {
        this.f4809j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f4810k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i9, boolean z10, boolean z11) {
        AbstractC0974d a10 = a();
        a10.u(z11);
        if (z10) {
            if ((Gravity.getAbsoluteGravity(this.f4807g, this.f4806f.getLayoutDirection()) & 7) == 5) {
                i -= this.f4806f.getWidth();
            }
            a10.s(i);
            a10.v(i9);
            int i10 = (int) ((this.f4801a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f23457a = new Rect(i - i10, i9 - i10, i + i10, i9 + i10);
        }
        a10.a();
    }
}
