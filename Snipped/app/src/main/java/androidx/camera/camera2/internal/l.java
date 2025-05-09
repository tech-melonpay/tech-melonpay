package androidx.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.l;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.ExecutionException;
import t.C1271x;

/* compiled from: MeteringRepeatingSession.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public ImmediateSurface f5266a;

    /* renamed from: b, reason: collision with root package name */
    public SessionConfig f5267b;

    /* renamed from: c, reason: collision with root package name */
    public final b f5268c;

    /* renamed from: d, reason: collision with root package name */
    public final Size f5269d;

    /* renamed from: e, reason: collision with root package name */
    public final c f5270e;

    /* compiled from: MeteringRepeatingSession.java */
    public class a implements FutureCallback<Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Surface f5271a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SurfaceTexture f5272b;

        public a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f5271a = surface;
            this.f5272b = surfaceTexture;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onSuccess(Void r12) {
            this.f5271a.release();
            this.f5272b.release();
        }
    }

    /* compiled from: MeteringRepeatingSession.java */
    public static class b implements UseCaseConfig<UseCase> {

        /* renamed from: a, reason: collision with root package name */
        public final MutableOptionsBundle f5273a;

        public b() {
            MutableOptionsBundle create = MutableOptionsBundle.create();
            create.insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, new C1271x());
            this.f5273a = create;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public final UseCaseConfigFactory.CaptureType getCaptureType() {
            return UseCaseConfigFactory.CaptureType.METERING_REPEATING;
        }

        @Override // androidx.camera.core.impl.ReadableConfig
        public final Config getConfig() {
            return this.f5273a;
        }
    }

    /* compiled from: MeteringRepeatingSession.java */
    public interface c {
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ac, code lost:
    
        r12 = (android.util.Size) r0.get(0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l(u.n r12, t.L r13, t.C1259k r14) {
        /*
            r11 = this;
            r11.<init>()
            x.m r0 = new x.m
            r0.<init>()
            androidx.camera.camera2.internal.l$b r1 = new androidx.camera.camera2.internal.l$b
            r1.<init>()
            r11.f5268c = r1
            r11.f5270e = r14
            u.A r12 = r12.b()
            r14 = 34
            android.util.Size[] r12 = r12.a(r14)
            java.lang.String r14 = "MeteringRepeating"
            r1 = 0
            if (r12 != 0) goto L2c
            java.lang.String r12 = "Can not get output size list."
            androidx.camera.core.Logger.e(r14, r12)
            android.util.Size r12 = new android.util.Size
            r12.<init>(r1, r1)
            goto Lb2
        L2c:
            w.B r0 = r0.f30893a
            if (r0 == 0) goto L67
            java.lang.String r0 = "Huawei"
            java.lang.String r2 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L67
            java.lang.String r0 = "mha-l29"
            java.lang.String r2 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L67
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r2 = r12.length
            r3 = r1
        L4b:
            if (r3 >= r2) goto L5f
            r4 = r12[r3]
            androidx.camera.core.impl.utils.CompareSizesByArea r5 = x.m.f30892c
            android.util.Size r6 = x.m.f30891b
            int r5 = r5.compare(r4, r6)
            if (r5 < 0) goto L5c
            r0.add(r4)
        L5c:
            int r3 = r3 + 1
            goto L4b
        L5f:
            android.util.Size[] r12 = new android.util.Size[r1]
            java.lang.Object[] r12 = r0.toArray(r12)
            android.util.Size[] r12 = (android.util.Size[]) r12
        L67:
            java.util.List r0 = java.util.Arrays.asList(r12)
            B9.a r2 = new B9.a
            r3 = 4
            r2.<init>(r3)
            java.util.Collections.sort(r0, r2)
            android.util.Size r13 = r13.e()
            int r2 = r13.getWidth()
            long r2 = (long) r2
            int r13 = r13.getHeight()
            long r4 = (long) r13
            long r2 = r2 * r4
            r4 = 307200(0x4b000, double:1.51777E-318)
            long r2 = java.lang.Math.min(r2, r4)
            int r13 = r12.length
            r4 = 0
            r5 = r1
        L8d:
            if (r5 >= r13) goto Lac
            r6 = r12[r5]
            int r7 = r6.getWidth()
            long r7 = (long) r7
            int r9 = r6.getHeight()
            long r9 = (long) r9
            long r7 = r7 * r9
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 != 0) goto La2
            r12 = r6
            goto Lb2
        La2:
            if (r7 <= 0) goto La8
            if (r4 == 0) goto Lac
            r12 = r4
            goto Lb2
        La8:
            int r5 = r5 + 1
            r4 = r6
            goto L8d
        Lac:
            java.lang.Object r12 = r0.get(r1)
            android.util.Size r12 = (android.util.Size) r12
        Lb2:
            r11.f5269d = r12
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "MeteringSession SurfaceTexture size: "
            r13.<init>(r0)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            androidx.camera.core.Logger.d(r14, r12)
            androidx.camera.core.impl.SessionConfig r12 = r11.a()
            r11.f5267b = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.l.<init>(u.n, t.L, t.k):void");
    }

    public final SessionConfig a() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = this.f5269d;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(this.f5268c, size);
        createFrom.setTemplateType(1);
        ImmediateSurface immediateSurface = new ImmediateSurface(surface);
        this.f5266a = immediateSurface;
        Futures.addCallback(immediateSurface.getTerminationFuture(), new a(surface, surfaceTexture), CameraXExecutors.directExecutor());
        createFrom.addSurface(this.f5266a);
        createFrom.addErrorListener(new SessionConfig.ErrorListener() { // from class: t.a0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
                androidx.camera.camera2.internal.l lVar = androidx.camera.camera2.internal.l.this;
                lVar.f5267b = lVar.a();
                l.c cVar = lVar.f5270e;
                if (cVar != null) {
                    Camera2CameraImpl camera2CameraImpl = ((C1259k) cVar).f27285b;
                    camera2CameraImpl.getClass();
                    try {
                        if (((Boolean) CallbackToFutureAdapter.a(new C1259k(camera2CameraImpl, 3)).f5933b.get()).booleanValue()) {
                            androidx.camera.camera2.internal.l lVar2 = camera2CameraImpl.f5146v;
                            camera2CameraImpl.f5128c.execute(new androidx.camera.camera2.internal.d(camera2CameraImpl, Camera2CameraImpl.h(lVar2), lVar2.f5267b, lVar2.f5268c));
                        }
                    } catch (InterruptedException | ExecutionException e10) {
                        throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e10);
                    }
                }
            }
        });
        return createFrom.build();
    }
}
