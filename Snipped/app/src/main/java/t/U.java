package t;

import androidx.camera.core.FocusMeteringResult;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.ScheduledFuture;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class U implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27162b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f27163c;

    public /* synthetic */ U(long j10, int i, Object obj) {
        this.f27161a = i;
        this.f27162b = obj;
        this.f27163c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27161a) {
            case 0:
                X x9 = (X) this.f27162b;
                x9.getClass();
                x9.f27168b.execute(new U(this.f27163c, 3, x9));
                break;
            case 1:
                X x10 = (X) this.f27162b;
                x10.getClass();
                x10.f27168b.execute(new U(this.f27163c, 2, x10));
                break;
            case 2:
                X x11 = (X) this.f27162b;
                if (this.f27163c == x11.f27176k) {
                    x11.b(null);
                    break;
                }
                break;
            case 3:
                X x12 = (X) this.f27162b;
                if (this.f27163c == x12.f27176k) {
                    x12.f27178m = false;
                    ScheduledFuture<?> scheduledFuture = x12.f27175j;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                        x12.f27175j = null;
                    }
                    CallbackToFutureAdapter.a<FocusMeteringResult> aVar = x12.f27185t;
                    if (aVar != null) {
                        aVar.b(FocusMeteringResult.create(false));
                        x12.f27185t = null;
                        break;
                    }
                }
                break;
            default:
                com.google.android.material.datepicker.b bVar = (com.google.android.material.datepicker.b) this.f27162b;
                bVar.getClass();
                bVar.f9420a.setError(String.format(bVar.f9424e, com.google.android.material.datepicker.d.b(this.f27163c).replace(' ', (char) 160)));
                bVar.a();
                break;
        }
    }
}
