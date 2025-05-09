package j0;

import android.os.Bundle;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public r f22377a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f22378b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f22379c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22380d = false;

    public void a(Bundle bundle) {
        if (this.f22380d) {
            bundle.putCharSequence("android.summaryText", this.f22379c);
        }
        CharSequence charSequence = this.f22378b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", d());
    }

    public abstract void b(x xVar);

    public void c(Bundle bundle) {
        bundle.remove("android.summaryText");
        bundle.remove("android.title.big");
        bundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
    }

    public abstract String d();

    public void e(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.f22379c = bundle.getCharSequence("android.summaryText");
            this.f22380d = true;
        }
        this.f22378b = bundle.getCharSequence("android.title.big");
    }

    public final void f(r rVar) {
        if (this.f22377a != rVar) {
            this.f22377a = rVar;
            if (rVar != null) {
                rVar.e(this);
            }
        }
    }
}
