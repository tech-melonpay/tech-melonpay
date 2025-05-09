package com.sumsub.sns.internal.core.domain.camera;

import O9.p;
import androidx.camera.core.ImageProxy;
import com.sumsub.sns.internal.core.domain.camera.CameraX;
import java.io.File;

/* loaded from: classes2.dex */
public interface a {
    default void a(CameraX.c cVar) {
    }

    default void a(File file) {
    }

    default Object a(ImageProxy imageProxy, c cVar, T9.a<? super p> aVar) {
        return a(this, imageProxy, cVar, aVar);
    }

    static /* synthetic */ Object a(a aVar, ImageProxy imageProxy, c cVar, T9.a aVar2) {
        return p.f3034a;
    }

    default void c() {
    }

    default void b(File file) {
    }

    default void onError(Exception exc) {
    }
}
