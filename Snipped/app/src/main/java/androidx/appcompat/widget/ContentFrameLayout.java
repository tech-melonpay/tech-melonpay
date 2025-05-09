package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.f;
import h.C0779f;
import h.LayoutInflaterFactory2C0778e;
import m.InterfaceC0994D;
import y0.E;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f4963a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f4964b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f4965c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f4966d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f4967e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f4968f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f4969g;

    /* renamed from: h, reason: collision with root package name */
    public a f4970h;

    public interface a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4969g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f4967e == null) {
            this.f4967e = new TypedValue();
        }
        return this.f4967e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f4968f == null) {
            this.f4968f = new TypedValue();
        }
        return this.f4968f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f4965c == null) {
            this.f4965c = new TypedValue();
        }
        return this.f4965c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f4966d == null) {
            this.f4966d = new TypedValue();
        }
        return this.f4966d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f4963a == null) {
            this.f4963a = new TypedValue();
        }
        return this.f4963a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f4964b == null) {
            this.f4964b = new TypedValue();
        }
        return this.f4964b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f4970h;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f4970h;
        if (aVar != null) {
            LayoutInflaterFactory2C0778e layoutInflaterFactory2C0778e = ((C0779f) aVar).f20940a;
            InterfaceC0994D interfaceC0994D = layoutInflaterFactory2C0778e.f20898r;
            if (interfaceC0994D != null) {
                interfaceC0994D.i();
            }
            if (layoutInflaterFactory2C0778e.f20903w != null) {
                layoutInflaterFactory2C0778e.f20892l.getDecorView().removeCallbacks(layoutInflaterFactory2C0778e.f20904x);
                if (layoutInflaterFactory2C0778e.f20903w.isShowing()) {
                    try {
                        layoutInflaterFactory2C0778e.f20903w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0778e.f20903w = null;
            }
            E e10 = layoutInflaterFactory2C0778e.f20905y;
            if (e10 != null) {
                e10.b();
            }
            f fVar = layoutInflaterFactory2C0778e.N(0).f20931h;
            if (fVar != null) {
                fVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f4970h = aVar;
    }
}
