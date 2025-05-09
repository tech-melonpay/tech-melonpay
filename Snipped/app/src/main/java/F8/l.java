package F8;

import android.os.SystemClock;
import android.view.View;
import ca.InterfaceC0646l;
import kotlin.jvm.internal.Ref$LongRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$LongRef f1273b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f1274c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1275d;

    public /* synthetic */ l(Ref$LongRef ref$LongRef, long j10, Object obj, int i) {
        this.f1272a = i;
        this.f1273b = ref$LongRef;
        this.f1274c = j10;
        this.f1275d = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1272a) {
            case 0:
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Ref$LongRef ref$LongRef = this.f1273b;
                if (elapsedRealtime - ref$LongRef.f23178a >= this.f1274c) {
                    ref$LongRef.f23178a = SystemClock.elapsedRealtime();
                    ((View.OnClickListener) this.f1275d).onClick(view);
                    break;
                }
                break;
            default:
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                Ref$LongRef ref$LongRef2 = this.f1273b;
                if (elapsedRealtime2 - ref$LongRef2.f23178a >= this.f1274c) {
                    ref$LongRef2.f23178a = SystemClock.elapsedRealtime();
                    ((InterfaceC0646l) this.f1275d).invoke(view);
                    break;
                }
                break;
        }
    }
}
