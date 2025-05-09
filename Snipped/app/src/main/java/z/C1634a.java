package z;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: R8$$SyntheticClass */
/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1634a implements CallbackToFutureAdapter.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f31200b;

    public /* synthetic */ C1634a(c cVar, int i) {
        this.f31199a = i;
        this.f31200b = cVar;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
    public final Object attachCompleter(final CallbackToFutureAdapter.a aVar) {
        switch (this.f31199a) {
            case 0:
                final c cVar = this.f31200b;
                cVar.getClass();
                final int i = 0;
                cVar.f31207d.execute(new Runnable() { // from class: z.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                cVar.b(aVar);
                                break;
                            default:
                                cVar.b(aVar);
                                break;
                        }
                    }
                });
                return "addCaptureRequestOptions";
            default:
                final c cVar2 = this.f31200b;
                cVar2.getClass();
                final int i9 = 1;
                cVar2.f31207d.execute(new Runnable() { // from class: z.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                cVar2.b(aVar);
                                break;
                            default:
                                cVar2.b(aVar);
                                break;
                        }
                    }
                });
                return "clearCaptureRequestOptions";
        }
    }
}
