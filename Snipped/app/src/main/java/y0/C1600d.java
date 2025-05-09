package y0;

import android.content.Context;
import android.view.VelocityTracker;
import androidx.core.widget.NestedScrollView;

/* compiled from: DifferentialMotionFlingController.java */
/* renamed from: y0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1600d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31063a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1601e f31064b;

    /* renamed from: c, reason: collision with root package name */
    public final b f31065c;

    /* renamed from: d, reason: collision with root package name */
    public final a f31066d;

    /* renamed from: e, reason: collision with root package name */
    public VelocityTracker f31067e;

    /* renamed from: f, reason: collision with root package name */
    public float f31068f;

    /* renamed from: g, reason: collision with root package name */
    public int f31069g;

    /* renamed from: h, reason: collision with root package name */
    public int f31070h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f31071j;

    /* compiled from: DifferentialMotionFlingController.java */
    /* renamed from: y0.d$a */
    public interface a {
    }

    /* compiled from: DifferentialMotionFlingController.java */
    /* renamed from: y0.d$b */
    public interface b {
    }

    public C1600d(Context context, NestedScrollView.c cVar) {
        s3.b bVar = new s3.b(23);
        s3.b bVar2 = new s3.b(24);
        this.f31069g = -1;
        this.f31070h = -1;
        this.i = -1;
        this.f31071j = new int[]{Integer.MAX_VALUE, 0};
        this.f31063a = context;
        this.f31064b = cVar;
        this.f31065c = bVar;
        this.f31066d = bVar2;
    }
}
