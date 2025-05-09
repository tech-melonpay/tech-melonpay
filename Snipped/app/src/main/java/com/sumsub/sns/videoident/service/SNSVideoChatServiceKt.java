package com.sumsub.sns.videoident.service;

import com.sumsub.sns.internal.core.data.source.dynamic.b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\u0005"}, d2 = {"Lcom/sumsub/sns/videoident/service/NotificationState;", "Lcom/sumsub/sns/internal/core/data/source/dynamic/b$c;", "strings", "", "getMessage", "idensic-mobile-sdk-aar_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSVideoChatServiceKt {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NotificationState.values().length];
            iArr[NotificationState.CALL.ordinal()] = 1;
            iArr[NotificationState.WAITING.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getMessage(NotificationState notificationState, b.c cVar) {
        int i = WhenMappings.$EnumSwitchMapping$0[notificationState.ordinal()];
        if (i == 1) {
            String a10 = cVar.a("sns_videoident_notification_expertJoined");
            return a10 == null ? "Operator connected" : a10;
        }
        if (i != 2) {
            return "";
        }
        String a11 = cVar.a("sns_videoident_notification_waitingForExpert");
        return a11 == null ? "Waiting for operator" : a11;
    }
}
