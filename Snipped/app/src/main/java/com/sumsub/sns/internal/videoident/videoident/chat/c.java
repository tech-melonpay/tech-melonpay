package com.sumsub.sns.internal.videoident.videoident.chat;

import com.sumsub.sns.internal.videoident.videoident.chat.SNSVideoChatController;
import com.sumsub.sns.internal.videoident.videoident.twilio.CameraCapturerCompat;

/* loaded from: classes2.dex */
public final class c {
    public static final SNSVideoChatController.CameraId b(CameraCapturerCompat.Source source) {
        return source == CameraCapturerCompat.Source.BACK_CAMERA ? SNSVideoChatController.CameraId.BACK : SNSVideoChatController.CameraId.FRONT;
    }
}
