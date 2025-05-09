package com.google.firebase.installations;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseInstallations f10300b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10301c;

    public /* synthetic */ a(FirebaseInstallations firebaseInstallations, boolean z10, int i) {
        this.f10299a = i;
        this.f10300b = firebaseInstallations;
        this.f10301c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10299a) {
            case 0:
                this.f10300b.lambda$doRegistrationOrRefresh$2(this.f10301c);
                break;
            default:
                this.f10300b.lambda$getToken$1(this.f10301c);
                break;
        }
    }
}
