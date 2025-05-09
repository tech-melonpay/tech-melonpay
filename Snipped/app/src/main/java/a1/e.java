package A1;

import android.app.Notification;
import android.graphics.Typeface;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: SystemForegroundService.java */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f29d;

    public e(SystemForegroundService systemForegroundService, int i, Notification notification) {
        this.f29d = systemForegroundService;
        this.f27b = i;
        this.f28c = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26a) {
            case 0:
                ((SystemForegroundService) this.f29d).f8200d.notify(this.f27b, (Notification) this.f28c);
                break;
            default:
                ((TextView) this.f28c).setTypeface((Typeface) this.f29d, this.f27b);
                break;
        }
    }

    public e(TextView textView, Typeface typeface, int i) {
        this.f28c = textView;
        this.f29d = typeface;
        this.f27b = i;
    }
}
