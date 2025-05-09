package com.sumsub.sns.internal.core.domain;

import a3.InterfaceFutureC0509a;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.p;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.DeferrableSurfaces;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import ca.InterfaceC0646l;
import com.google.android.gms.tasks.OnSuccessListener;
import io.sentry.AbstractC0846d;
import io.sentry.InterfaceC0859q;
import io.sentry.SentryLevel;
import java.io.File;
import java.io.FilenameFilter;
import java.util.List;
import pa.C1124b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements OnSuccessListener, CallbackToFutureAdapter.b, AsyncFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f16397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16398b;
    public final /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f16399j;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f16397a = obj;
        this.f16398b = obj2;
        this.i = obj3;
        this.f16399j = obj4;
    }

    public void a() {
        File file = (File) this.f16399j;
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        String str = (String) this.f16398b;
        InterfaceC0859q interfaceC0859q = (InterfaceC0859q) this.f16397a;
        interfaceC0859q.h(sentryLevel, "Started processing cached files from %s", str);
        final AbstractC0846d abstractC0846d = (AbstractC0846d) this.i;
        InterfaceC0859q interfaceC0859q2 = abstractC0846d.f21977a;
        try {
            interfaceC0859q2.h(sentryLevel, "Processing dir. %s", file.getAbsolutePath());
            if (!file.exists()) {
                interfaceC0859q2.h(SentryLevel.WARNING, "Directory '%s' doesn't exist. No cached events to send.", file.getAbsolutePath());
            } else if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    interfaceC0859q2.h(SentryLevel.ERROR, "Cache dir %s is null.", file.getAbsolutePath());
                } else {
                    File[] listFiles2 = file.listFiles(new FilenameFilter() { // from class: io.sentry.c
                        @Override // java.io.FilenameFilter
                        public final boolean accept(File file2, String str2) {
                            return AbstractC0846d.this.b(str2);
                        }
                    });
                    interfaceC0859q2.h(sentryLevel, "Processing %d items from cache dir %s", Integer.valueOf(listFiles2 != null ? listFiles2.length : 0), file.getAbsolutePath());
                    for (File file2 : listFiles) {
                        if (file2.isFile()) {
                            interfaceC0859q2.h(SentryLevel.DEBUG, "Processing file: %s", file2.getAbsolutePath());
                            abstractC0846d.c(file2, J9.b.a(new AbstractC0846d.a(abstractC0846d.f21978b, interfaceC0859q2)));
                        } else {
                            interfaceC0859q2.h(SentryLevel.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                        }
                    }
                }
            } else {
                interfaceC0859q2.h(SentryLevel.ERROR, "Cache dir %s is not a directory.", file.getAbsolutePath());
            }
        } catch (Throwable th) {
            interfaceC0859q2.d(SentryLevel.ERROR, th, "Failed processing '%s'", file.getAbsolutePath());
        }
        interfaceC0859q.h(SentryLevel.DEBUG, "Finished processing cached files from %s", str);
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public InterfaceFutureC0509a apply(Object obj) {
        InterfaceFutureC0509a g10;
        g10 = super/*androidx.camera.camera2.internal.p*/.g((CameraDevice) this.f16398b, (v.l) this.i, (List) this.f16399j);
        return g10;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
    public Object attachCompleter(CallbackToFutureAdapter.a aVar) {
        String str;
        p pVar = (p) this.f16397a;
        List<DeferrableSurface> list = (List) this.f16398b;
        u.o oVar = (u.o) this.i;
        v.l lVar = (v.l) this.f16399j;
        synchronized (pVar.f5278a) {
            synchronized (pVar.f5278a) {
                pVar.s();
                DeferrableSurfaces.incrementAll(list);
                pVar.f5287k = list;
            }
            C1124b.q(pVar.i == null, "The openCaptureSessionCompleter can only set once!");
            pVar.i = aVar;
            oVar.f30062a.a(lVar);
            str = "openCaptureSession[session=" + pVar + "]";
        }
        return str;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        j.a((InterfaceC0646l) this.f16397a, (Bitmap) this.f16398b, (j) this.i, (RectF) this.f16399j, (List) obj);
    }
}
