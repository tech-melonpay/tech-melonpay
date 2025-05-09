package W2;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import u2.C1512a;

/* compiled from: ElasticTabIndicatorInterpolator.java */
/* loaded from: classes.dex */
public final class a extends com.google.android.material.tabs.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3804a;

    public /* synthetic */ a(int i) {
        this.f3804a = i;
    }

    @Override // com.google.android.material.tabs.a
    public final void b(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        float cos;
        float f11;
        switch (this.f3804a) {
            case 0:
                RectF a10 = com.google.android.material.tabs.a.a(tabLayout, view);
                RectF a11 = com.google.android.material.tabs.a.a(tabLayout, view2);
                if (a10.left < a11.left) {
                    double d10 = (f10 * 3.141592653589793d) / 2.0d;
                    f11 = (float) (1.0d - Math.cos(d10));
                    cos = (float) Math.sin(d10);
                } else {
                    double d11 = (f10 * 3.141592653589793d) / 2.0d;
                    float sin = (float) Math.sin(d11);
                    cos = (float) (1.0d - Math.cos(d11));
                    f11 = sin;
                }
                drawable.setBounds(C1512a.c((int) a10.left, f11, (int) a11.left), drawable.getBounds().top, C1512a.c((int) a10.right, cos, (int) a11.right), drawable.getBounds().bottom);
                break;
            default:
                if (f10 >= 0.5f) {
                    view = view2;
                }
                RectF a12 = com.google.android.material.tabs.a.a(tabLayout, view);
                float b9 = f10 < 0.5f ? C1512a.b(1.0f, 0.0f, 0.0f, 0.5f, f10) : C1512a.b(0.0f, 1.0f, 0.5f, 1.0f, f10);
                drawable.setBounds((int) a12.left, drawable.getBounds().top, (int) a12.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (b9 * 255.0f));
                break;
        }
    }
}
