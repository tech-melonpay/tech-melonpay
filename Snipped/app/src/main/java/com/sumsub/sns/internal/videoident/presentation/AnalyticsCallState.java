package com.sumsub.sns.internal.videoident.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/sumsub/sns/internal/videoident/presentation/AnalyticsCallState;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "PREPARING", "CONNECTING", "CONNECTION_FAILED", "WAITING_FOR_OPERATOR", "IN_PROGRESS", "RECONNECTING", "CONNECTION_LOST", "COMPLETED", "UNKNOWN", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public enum AnalyticsCallState {
    PREPARING("preparing"),
    CONNECTING("connecting"),
    CONNECTION_FAILED("connectionFailed"),
    WAITING_FOR_OPERATOR("waitingForOperator"),
    IN_PROGRESS("inProgress"),
    RECONNECTING("reconnecting"),
    CONNECTION_LOST("сonnectionLost"),
    COMPLETED("completed"),
    UNKNOWN("unknown");


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String value;

    /* renamed from: com.sumsub.sns.internal.videoident.presentation.AnalyticsCallState$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AnalyticsCallState a(String str) {
            for (AnalyticsCallState analyticsCallState : AnalyticsCallState.values()) {
                if (kotlin.jvm.internal.f.b(analyticsCallState.getValue(), str)) {
                    return analyticsCallState;
                }
            }
            return null;
        }

        public Companion() {
        }
    }

    AnalyticsCallState(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
