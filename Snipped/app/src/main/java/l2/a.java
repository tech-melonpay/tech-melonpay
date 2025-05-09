package L2;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import c.C0611b;
import com.luminary.mobile.R;

/* compiled from: MaterialBackAnimationHelper.java */
/* loaded from: classes.dex */
public abstract class a<V extends View> {

    /* renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f2467a;

    /* renamed from: b, reason: collision with root package name */
    public final V f2468b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2469c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2470d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2471e;

    /* renamed from: f, reason: collision with root package name */
    public C0611b f2472f;

    public a(V v10) {
        this.f2468b = v10;
        Context context = v10.getContext();
        this.f2467a = k.d(context, R.attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
        this.f2469c = k.c(context, R.attr.motionDurationMedium2, 300);
        this.f2470d = k.c(context, R.attr.motionDurationShort3, 150);
        this.f2471e = k.c(context, R.attr.motionDurationShort2, 100);
    }
}
