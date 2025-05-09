package v2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ViewOffsetBehavior.java */
/* loaded from: classes.dex */
public class f<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: b, reason: collision with root package name */
    public g f30555b;

    /* renamed from: c, reason: collision with root package name */
    public int f30556c;

    public f() {
        this.f30556c = 0;
    }

    public final int a() {
        g gVar = this.f30555b;
        if (gVar != null) {
            return gVar.f30560d;
        }
        return 0;
    }

    public int b() {
        return a();
    }

    public void c(CoordinatorLayout coordinatorLayout, V v10, int i) {
        coordinatorLayout.onLayoutChild(v10, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v10, int i) {
        c(coordinatorLayout, v10, i);
        if (this.f30555b == null) {
            this.f30555b = new g(v10);
        }
        g gVar = this.f30555b;
        View view = gVar.f30557a;
        gVar.f30558b = view.getTop();
        gVar.f30559c = view.getLeft();
        this.f30555b.a();
        int i9 = this.f30556c;
        if (i9 == 0) {
            return true;
        }
        this.f30555b.b(i9);
        this.f30556c = 0;
        return true;
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30556c = 0;
    }
}
