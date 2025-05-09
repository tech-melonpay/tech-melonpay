package t;

import t.C1257i;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements C1257i.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27291b;

    public /* synthetic */ l0(Object obj, int i) {
        this.f27290a = i;
        this.f27291b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    @Override // t.C1257i.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(android.hardware.camera2.TotalCaptureResult r4) {
        /*
            r3 = this;
            int r0 = r3.f27290a
            switch(r0) {
                case 0: goto L43;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f27291b
            z.c r0 = (z.c) r0
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.lang.Void> r1 = r0.f31210g
            r2 = 0
            if (r1 == 0) goto L3b
            android.hardware.camera2.CaptureRequest r4 = r4.getRequest()
            java.lang.Object r4 = r4.getTag()
            boolean r1 = r4 instanceof androidx.camera.core.impl.TagBundle
            if (r1 == 0) goto L3b
            androidx.camera.core.impl.TagBundle r4 = (androidx.camera.core.impl.TagBundle) r4
            java.lang.String r1 = "Camera2CameraControl"
            java.lang.Object r4 = r4.getTag(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L3b
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.lang.Void> r1 = r0.f31210g
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L3b
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.lang.Void> r4 = r0.f31210g
            r0.f31210g = r2
            goto L3c
        L3b:
            r4 = r2
        L3c:
            if (r4 == 0) goto L41
            r4.b(r2)
        L41:
            r4 = 0
            return r4
        L43:
            java.lang.Object r0 = r3.f27291b
            t.m0 r0 = (t.m0) r0
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.lang.Void> r1 = r0.f27302f
            r2 = 0
            if (r1 == 0) goto L70
            android.hardware.camera2.CaptureRequest r4 = r4.getRequest()
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Object r4 = r4.get(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L63
            int r4 = r4.intValue()
            r1 = 2
            if (r4 != r1) goto L63
            r4 = 1
            goto L64
        L63:
            r4 = r2
        L64:
            boolean r1 = r0.f27303g
            if (r4 != r1) goto L70
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.lang.Void> r4 = r0.f27302f
            r1 = 0
            r4.b(r1)
            r0.f27302f = r1
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t.l0.a(android.hardware.camera2.TotalCaptureResult):boolean");
    }
}
