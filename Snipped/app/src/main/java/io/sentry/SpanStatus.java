package io.sentry;

import com.google.firebase.messaging.ServiceStarter;
import java.util.Locale;

/* loaded from: classes2.dex */
public enum SpanStatus implements F {
    OK(200, 299),
    CANCELLED(499),
    INTERNAL_ERROR(ServiceStarter.ERROR_UNKNOWN),
    UNKNOWN(ServiceStarter.ERROR_UNKNOWN),
    UNKNOWN_ERROR(ServiceStarter.ERROR_UNKNOWN),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(400),
    ABORTED(409),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(ServiceStarter.ERROR_UNKNOWN),
    UNAUTHENTICATED(401);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    public static final class a implements A<SpanStatus> {
        @Override // io.sentry.A
        public final SpanStatus a(D d10, InterfaceC0859q interfaceC0859q) {
            return SpanStatus.valueOf(d10.r0().toUpperCase(Locale.ROOT));
        }
    }

    SpanStatus(int i) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i;
    }

    public static SpanStatus fromHttpStatusCode(int i) {
        for (SpanStatus spanStatus : values()) {
            if (spanStatus.matches(i)) {
                return spanStatus;
            }
        }
        return null;
    }

    private boolean matches(int i) {
        return i >= this.minHttpStatusCode && i <= this.maxHttpStatusCode;
    }

    @Override // io.sentry.F
    public void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.H(name().toLowerCase(Locale.ROOT));
    }

    public static SpanStatus fromHttpStatusCode(Integer num, SpanStatus spanStatus) {
        SpanStatus fromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : spanStatus;
        return fromHttpStatusCode != null ? fromHttpStatusCode : spanStatus;
    }

    SpanStatus(int i, int i9) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i9;
    }
}
