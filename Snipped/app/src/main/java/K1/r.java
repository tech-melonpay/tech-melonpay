package k1;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.luminary.mobile.R;

/* compiled from: GhostViewPort.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class r extends ViewGroup implements InterfaceC0935p {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f22909g = 0;

    /* renamed from: a, reason: collision with root package name */
    public ViewGroup f22910a;

    /* renamed from: b, reason: collision with root package name */
    public View f22911b;

    /* renamed from: c, reason: collision with root package name */
    public final View f22912c;

    /* renamed from: d, reason: collision with root package name */
    public int f22913d;

    /* renamed from: e, reason: collision with root package name */
    public Matrix f22914e;

    /* renamed from: f, reason: collision with root package name */
    public final a f22915f;

    /* compiled from: GhostViewPort.java */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view;
            r rVar = r.this;
            rVar.postInvalidateOnAnimation();
            ViewGroup viewGroup = rVar.f22910a;
            if (viewGroup == null || (view = rVar.f22911b) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            rVar.f22910a.postInvalidateOnAnimation();
            rVar.f22910a = null;
            rVar.f22911b = null;
            return true;
        }
    }

    public r(View view) {
        super(view.getContext());
        this.f22915f = new a();
        this.f22912c = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    @Override // k1.InterfaceC0935p
    public final void b(View view, ViewGroup viewGroup) {
        this.f22910a = viewGroup;
        this.f22911b = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = this.f22912c;
        view.setTag(R.id.ghost_view, this);
        view.getViewTreeObserver().addOnPreDrawListener(this.f22915f);
        P.c(view, 4);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view = this.f22912c;
        view.getViewTreeObserver().removeOnPreDrawListener(this.f22915f);
        P.c(view, 0);
        view.setTag(R.id.ghost_view, null);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C0922c.a(canvas, true);
        canvas.setMatrix(this.f22914e);
        View view = this.f22912c;
        P.c(view, 0);
        view.invalidate();
        P.c(view, 4);
        drawChild(canvas, view, getDrawingTime());
        C0922c.a(canvas, false);
    }

    @Override // android.view.View, k1.InterfaceC0935p
    public final void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f22912c;
        if (((r) view.getTag(R.id.ghost_view)) == this) {
            P.c(view, i == 0 ? 4 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i9, int i10, int i11) {
    }
}
