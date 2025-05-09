package androidx.camera.core;

import androidx.camera.core.impl.ImageReaderProxy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements ImageReaderProxy.OnImageAvailableListener {
    public static String a(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        ImageCapture.lambda$new$0(imageReaderProxy);
    }
}
