package com.sumsub.sns.internal.camera.photo.presentation.document;

import C.o;
import com.sumsub.sns.internal.ml.autocapture.SeamlessDocaptureMobileConfig;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class e {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14851a;

        static {
            int[] iArr = new int[SeamlessDocaptureMobileConfig.VideoQuality.values().length];
            iArr[SeamlessDocaptureMobileConfig.VideoQuality.UHD.ordinal()] = 1;
            iArr[SeamlessDocaptureMobileConfig.VideoQuality.FHD.ordinal()] = 2;
            iArr[SeamlessDocaptureMobileConfig.VideoQuality.HD.ordinal()] = 3;
            iArr[SeamlessDocaptureMobileConfig.VideoQuality.SD.ordinal()] = 4;
            f14851a = iArr;
        }
    }

    public static final o b(SeamlessDocaptureMobileConfig.VideoQuality videoQuality) {
        int i = a.f14851a[videoQuality.ordinal()];
        if (i == 1) {
            return o.f563d;
        }
        if (i == 2) {
            return o.f562c;
        }
        if (i == 3) {
            return o.f561b;
        }
        if (i == 4) {
            return o.f560a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
