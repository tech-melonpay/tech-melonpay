package t;

import androidx.camera.core.impl.UseCaseConfigFactory;

/* compiled from: TemplateTypeUtil.java */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f27283a;

    static {
        int[] iArr = new int[UseCaseConfigFactory.CaptureType.values().length];
        f27283a = iArr;
        try {
            iArr[UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f27283a[UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f27283a[UseCaseConfigFactory.CaptureType.STREAM_SHARING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f27283a[UseCaseConfigFactory.CaptureType.PREVIEW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f27283a[UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
