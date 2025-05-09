package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.PrintWriter;

/* compiled from: FragmentHostCallback.kt */
/* loaded from: classes.dex */
public abstract class l<H> extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f6868a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f6869b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f6870c;

    /* renamed from: d, reason: collision with root package name */
    public final p f6871d;

    public l(ActivityC0533g activityC0533g) {
        Handler handler = new Handler();
        this.f6868a = activityC0533g;
        this.f6869b = activityC0533g;
        this.f6870c = handler;
        this.f6871d = new p();
    }

    public abstract void d(PrintWriter printWriter, String[] strArr);

    public abstract ActivityC0533g e();

    public abstract LayoutInflater f();

    public abstract boolean g(String str);

    public abstract void h();
}
