package t;

import android.hardware.camera2.CaptureFailure;
import androidx.camera.core.impl.CameraCaptureFailure;

/* compiled from: Camera2CameraCaptureFailure.java */
/* renamed from: t.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1252d extends CameraCaptureFailure {

    /* renamed from: a, reason: collision with root package name */
    public final CaptureFailure f27201a;

    public C1252d(CameraCaptureFailure.Reason reason, CaptureFailure captureFailure) {
        super(reason);
        this.f27201a = captureFailure;
    }
}
