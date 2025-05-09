package Z0;

import android.content.Intent;
import android.content.IntentSender;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.activity.ComponentActivity;
import androidx.activity.result.a;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import e.InterfaceC0702a;
import f.AbstractC0728a;
import pa.C1124b;
import q.g;
import t.C1257i;
import t.O;
import t.P;
import u.f;
import u.o;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4158a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4159b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4160c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4161d;

    public /* synthetic */ a(Object obj, int i, Object obj2, int i9) {
        this.f4158a = i9;
        this.f4160c = obj;
        this.f4159b = i;
        this.f4161d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [t.N, t.i$c] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4158a) {
            case 0:
                ((androidx.profileinstaller.b) this.f4160c).f7381b.b(this.f4159b, this.f4161d);
                return;
            case 1:
                T t3 = ((AbstractC0728a.C0395a) this.f4161d).f20573a;
                ComponentActivity.g gVar = (ComponentActivity.g) this.f4160c;
                String str = (String) gVar.f4582a.get(Integer.valueOf(this.f4159b));
                if (str == null) {
                    return;
                }
                a.C0060a c0060a = (a.C0060a) gVar.f4586e.get(str);
                if ((c0060a != null ? c0060a.f4589a : null) == null) {
                    gVar.f4588g.remove(str);
                    gVar.f4587f.put(str, t3);
                    return;
                } else {
                    InterfaceC0702a<O> interfaceC0702a = c0060a.f4589a;
                    if (gVar.f4585d.remove(str)) {
                        interfaceC0702a.a(t3);
                        return;
                    }
                    return;
                }
            case 2:
                ((ComponentActivity.g) this.f4160c).a(this.f4159b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f4161d));
                return;
            case 3:
                ((g) this.f4160c).s0(this.f4159b, (CharSequence) this.f4161d);
                return;
            case 4:
                O o10 = (O) this.f4160c;
                boolean z10 = o10.f27147d;
                final CallbackToFutureAdapter.a<Integer> aVar = (CallbackToFutureAdapter.a) this.f4161d;
                if (!z10) {
                    P p10 = o10.f27145b;
                    synchronized (p10.f27150a) {
                        p10.f27152c = 0;
                    }
                    s3.b.v("Camera is not active.", aVar);
                    return;
                }
                o10.a();
                C1124b.q(o10.f27148e == null, "mRunningCompleter should be null when starting set a new exposure compensation value");
                C1124b.q(o10.f27149f == null, "mRunningCaptureResultListener should be null when starting set a new exposure compensation value");
                final int i = this.f4159b;
                ?? r12 = new C1257i.c() { // from class: t.N
                    @Override // t.C1257i.c
                    public final boolean a(TotalCaptureResult totalCaptureResult) {
                        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                        Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
                        int i9 = i;
                        CallbackToFutureAdapter.a aVar2 = aVar;
                        if (num != null && num2 != null) {
                            int intValue = num.intValue();
                            if ((intValue == 2 || intValue == 3 || intValue == 4) && num2.intValue() == i9) {
                                aVar2.b(Integer.valueOf(i9));
                                return true;
                            }
                        } else if (num2 != null && num2.intValue() == i9) {
                            aVar2.b(Integer.valueOf(i9));
                            return true;
                        }
                        return false;
                    }
                };
                o10.f27149f = r12;
                o10.f27148e = aVar;
                C1257i c1257i = o10.f27144a;
                c1257i.a(r12);
                c1257i.j();
                return;
            case 5:
                ((f.b) this.f4160c).f30038a.onCaptureSequenceAborted((CameraCaptureSession) this.f4161d, this.f4159b);
                return;
            default:
                ((o.b) this.f4160c).f30063a.onError((CameraDevice) this.f4161d, this.f4159b);
                return;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, int i, int i9) {
        this.f4158a = i9;
        this.f4160c = obj;
        this.f4161d = obj2;
        this.f4159b = i;
    }
}
