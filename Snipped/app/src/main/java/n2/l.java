package N2;

import N2.b;
import N2.k;
import android.animation.Animator;
import java.util.ArrayList;

/* compiled from: IndeterminateAnimatorDelegate.java */
/* loaded from: classes.dex */
public abstract class l<T extends Animator> {

    /* renamed from: a, reason: collision with root package name */
    public m f2811a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2812b = new ArrayList();

    public l(int i) {
        for (int i9 = 0; i9 < i; i9++) {
            this.f2812b.add(new k.a());
        }
    }

    public static float b(int i, int i9, int i10) {
        return (i - i9) / i10;
    }

    public abstract void a();

    public abstract void c();

    public abstract void d(b.c cVar);

    public abstract void e();

    public abstract void f();

    public abstract void g();
}
