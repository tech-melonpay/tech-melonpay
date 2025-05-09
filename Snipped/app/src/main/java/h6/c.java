package H6;

import ca.InterfaceC0635a;
import com.sumsub.sns.internal.prooface.presentation.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1525a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0635a f1526b;

    public /* synthetic */ c(int i, InterfaceC0635a interfaceC0635a) {
        this.f1525a = i;
        this.f1526b = interfaceC0635a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0635a interfaceC0635a = this.f1526b;
        switch (this.f1525a) {
            case 0:
                interfaceC0635a.invoke();
                break;
            case 1:
                interfaceC0635a.invoke();
                break;
            case 2:
                interfaceC0635a.invoke();
                break;
            case 3:
                interfaceC0635a.invoke();
                break;
            case 4:
                interfaceC0635a.invoke();
                break;
            case 5:
                com.sumsub.sns.internal.fingerprint.tools.threading.a.b(interfaceC0635a);
                break;
            default:
                b.q.a(interfaceC0635a);
                break;
        }
    }
}
