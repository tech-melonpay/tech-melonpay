package com.google.android.material.timepicker;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9987b;

    public /* synthetic */ e(Object obj, int i) {
        this.f9986a = i;
        this.f9987b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9986a) {
            case 0:
                j jVar = ((f) this.f9987b).f9997n0;
                if (jVar instanceof m) {
                    ((m) jVar).b();
                    break;
                }
                break;
            default:
                ((h) this.f9987b).a();
                break;
        }
    }
}
