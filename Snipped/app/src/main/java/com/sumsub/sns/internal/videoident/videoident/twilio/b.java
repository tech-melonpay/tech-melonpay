package com.sumsub.sns.internal.videoident.videoident.twilio;

import com.twilio.video.TwilioException;

/* loaded from: classes2.dex */
public final class b {
    public static final String a(TwilioException twilioException) {
        return "code=" + twilioException.getCode() + ", expl=" + twilioException.getExplanation();
    }
}
