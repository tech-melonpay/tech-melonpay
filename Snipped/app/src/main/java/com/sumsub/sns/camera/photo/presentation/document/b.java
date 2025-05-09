package com.sumsub.sns.camera.photo.presentation.document;

import com.sumsub.sns.camera.photo.presentation.document.SNSFrameViewWithBackground;
import com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class b {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13960a;

        static {
            int[] iArr = new int[SNSPhotoDocumentPickerViewModel.AutoCaptureHint.State.values().length];
            iArr[SNSPhotoDocumentPickerViewModel.AutoCaptureHint.State.DEFAULT.ordinal()] = 1;
            iArr[SNSPhotoDocumentPickerViewModel.AutoCaptureHint.State.INVALID.ordinal()] = 2;
            iArr[SNSPhotoDocumentPickerViewModel.AutoCaptureHint.State.INTERMEDIATE.ordinal()] = 3;
            iArr[SNSPhotoDocumentPickerViewModel.AutoCaptureHint.State.OK.ordinal()] = 4;
            f13960a = iArr;
        }
    }

    public static final SNSFrameViewWithBackground.State b(SNSPhotoDocumentPickerViewModel.AutoCaptureHint.State state) {
        int i = a.f13960a[state.ordinal()];
        if (i == 1) {
            return SNSFrameViewWithBackground.State.DEFAULT;
        }
        if (i == 2) {
            return SNSFrameViewWithBackground.State.RED;
        }
        if (i == 3) {
            return SNSFrameViewWithBackground.State.YELLOW;
        }
        if (i == 4) {
            return SNSFrameViewWithBackground.State.GREEN;
        }
        throw new NoWhenBranchMatchedException();
    }
}
