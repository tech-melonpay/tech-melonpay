package com.sumsub.sns.camera.photo.presentation.document;

import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.l;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionCountryFieldView;
import com.sumsub.sns.internal.core.domain.h;
import h.AbstractC0777d;
import io.sentry.C0855m;
import io.sentry.InterfaceC0858p;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m0.f;
import p2.i;
import t.C1257i;
import t.X;
import u9.m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13962b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13963c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f13961a = i;
        this.f13962b = obj;
        this.f13963c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f13963c;
        Object obj2 = this.f13962b;
        switch (this.f13961a) {
            case 0:
                a.a((a) obj2, (a.d) obj);
                return;
            case 1:
                SNSApplicantDataSelectionCountryFieldView.m65picker$lambda3((SNSApplicantDataSelectionCountryFieldView) obj2, (Context) obj);
                return;
            case 2:
                Runnable runnable = (Runnable) obj;
                AbstractC0777d.c cVar = (AbstractC0777d.c) obj2;
                cVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    cVar.a();
                }
            case 3:
                ((InterfaceC0858p) obj2).a(((SentryOptions) obj).getFlushTimeoutMillis());
                return;
            case 4:
                ((f.c) obj2).c((Typeface) obj);
                return;
            case 5:
                int i = JobInfoSchedulerService.f8961a;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                return;
            case 6:
                C1257i.a aVar = ((C1257i) obj2).f27265w;
                CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) obj;
                aVar.f27266a.remove(cameraCaptureCallback);
                aVar.f27267b.remove(cameraCaptureCallback);
                return;
            case 7:
                C1257i c1257i = (C1257i) obj2;
                Futures.propagate(CallbackToFutureAdapter.a(new i(c1257i, c1257i.j())), (CallbackToFutureAdapter.a) obj);
                return;
            case 8:
                ((CameraCaptureCallback) obj2).onCaptureCompleted((CameraCaptureResult) obj);
                return;
            case 9:
                ((CameraCaptureCallback) obj2).onCaptureFailed((CameraCaptureFailure) obj);
                return;
            case 10:
                C1257i.b bVar = (C1257i.b) obj2;
                bVar.getClass();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = bVar.f27268a;
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    C1257i.c cVar2 = (C1257i.c) it.next();
                    if (cVar2.a((TotalCaptureResult) obj)) {
                        hashSet.add(cVar2);
                    }
                }
                if (hashSet.isEmpty()) {
                    return;
                }
                hashSet2.removeAll(hashSet);
                return;
            case 11:
                ((SessionConfig.ErrorListener) obj2).onError((SessionConfig) obj, SessionConfig.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET);
                return;
            case 12:
                Camera2CameraImpl camera2CameraImpl = (Camera2CameraImpl) obj2;
                l lVar = camera2CameraImpl.f5146v;
                CallbackToFutureAdapter.a aVar2 = (CallbackToFutureAdapter.a) obj;
                if (lVar == null) {
                    aVar2.b(Boolean.FALSE);
                    return;
                } else {
                    aVar2.b(Boolean.valueOf(camera2CameraImpl.f5126a.isUseCaseAttached(Camera2CameraImpl.h(lVar))));
                    return;
                }
            case 13:
                ((Surface) obj2).release();
                ((SurfaceTexture) obj).release();
                return;
            case 14:
                List list = (List) obj;
                Camera2CameraImpl camera2CameraImpl2 = (Camera2CameraImpl) obj2;
                C1257i c1257i2 = camera2CameraImpl2.f5133h;
                try {
                    camera2CameraImpl2.u(list);
                    return;
                } finally {
                    c1257i2.b();
                }
            case 15:
                Camera2CameraImpl camera2CameraImpl3 = (Camera2CameraImpl) obj2;
                camera2CameraImpl3.getClass();
                StringBuilder sb2 = new StringBuilder("Use case ");
                String str = (String) obj;
                sb2.append(str);
                sb2.append(" INACTIVE");
                camera2CameraImpl3.e(sb2.toString(), null);
                camera2CameraImpl3.f5126a.setUseCaseInactive(str);
                camera2CameraImpl3.x();
                return;
            case 16:
                ((X) obj2).b((CallbackToFutureAdapter.a) obj);
                return;
            case 17:
                ((m) obj2).i((InterfaceC0858p) obj);
                return;
            default:
                try {
                    ((h) obj2).a();
                    return;
                } catch (Throwable th) {
                    ((SentryAndroidOptions) obj).getLogger().f(SentryLevel.ERROR, "Failed trying to send cached events.", th);
                    return;
                }
        }
    }

    public /* synthetic */ c(SentryOptions sentryOptions) {
        this.f13961a = 3;
        this.f13962b = C0855m.f22069a;
        this.f13963c = sentryOptions;
    }

    public /* synthetic */ c(m mVar) {
        this.f13961a = 17;
        C0855m c0855m = C0855m.f22069a;
        this.f13962b = mVar;
        this.f13963c = c0855m;
    }
}
