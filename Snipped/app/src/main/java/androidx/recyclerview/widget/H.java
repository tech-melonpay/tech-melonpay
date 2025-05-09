package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper.java */
/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView.n f7423a;

    /* renamed from: b, reason: collision with root package name */
    public int f7424b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f7425c = new Rect();

    public H(RecyclerView.n nVar) {
        this.f7423a = nVar;
    }

    public static H a(RecyclerView.n nVar, int i) {
        if (i == 0) {
            return new F(nVar);
        }
        if (i == 1) {
            return new G(nVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public final int m() {
        if (Integer.MIN_VALUE == this.f7424b) {
            return 0;
        }
        return l() - this.f7424b;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i);
}
