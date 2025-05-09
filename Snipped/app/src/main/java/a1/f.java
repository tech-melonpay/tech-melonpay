package A1;

import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.datepicker.MaterialCalendar;

/* compiled from: SystemForegroundService.java */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32c;

    public /* synthetic */ f(int i, int i9, Object obj) {
        this.f30a = i9;
        this.f32c = obj;
        this.f31b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30a) {
            case 0:
                ((SystemForegroundService) this.f32c).f8200d.cancel(this.f31b);
                break;
            default:
                ((MaterialCalendar) this.f32c).f9389o0.smoothScrollToPosition(this.f31b);
                break;
        }
    }
}
