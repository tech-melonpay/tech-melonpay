package com.sumsub.sentry;

import com.google.firebase.messaging.ServiceStarter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.internal.EnumDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.InterfaceC1162A;

@InterfaceC1080d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0081\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\r\u000eB\u0011\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007j\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lcom/sumsub/sentry/SpanStatus;", "", "", "httpStatusCode", "", "matches", "minHttpStatusCode", "I", "maxHttpStatusCode", "<init>", "(Ljava/lang/String;II)V", "(Ljava/lang/String;III)V", "Companion", "a", "b", "OK", "CANCELLED", "INTERNAL_ERROR", "UNKNOWN", "UNKNOWN_ERROR", "INVALID_ARGUMENT", "DEADLINE_EXCEEDED", "NOT_FOUND", "ALREADY_EXISTS", "PERMISSION_DENIED", "RESOURCE_EXHAUSTED", "FAILED_PRECONDITION", "ABORTED", "OUT_OF_RANGE", "UNIMPLEMENTED", "UNAVAILABLE", "DATA_LOSS", "UNAUTHENTICATED", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public enum SpanStatus {
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


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    public static final class a implements InterfaceC1162A<SpanStatus> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13538a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f13539b;

        static {
            EnumDescriptor enumDescriptor = new EnumDescriptor("com.sumsub.sentry.SpanStatus", 18);
            enumDescriptor.k("ok", false);
            enumDescriptor.k("cancelled", false);
            enumDescriptor.k("internal_error", false);
            enumDescriptor.k("unknown", false);
            enumDescriptor.k("unknown_error", false);
            enumDescriptor.k("invalid_argument", false);
            enumDescriptor.k("deadline_exceeded", false);
            enumDescriptor.k("not_found", false);
            enumDescriptor.k("already_exists", false);
            enumDescriptor.k("permission_denied", false);
            enumDescriptor.k("resource_exhausted", false);
            enumDescriptor.k("failed_precondition", false);
            enumDescriptor.k("aborted", false);
            enumDescriptor.k("out_of_range", false);
            enumDescriptor.k("unimplemented", false);
            enumDescriptor.k("unavailable", false);
            enumDescriptor.k("data_loss", false);
            enumDescriptor.k("unauthenticated", false);
            f13539b = enumDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SpanStatus deserialize(InterfaceC1144d interfaceC1144d) {
            return SpanStatus.values()[interfaceC1144d.i(getDescriptor())];
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            return new InterfaceC1078b[0];
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f13539b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, SpanStatus spanStatus) {
            interfaceC1145e.l(getDescriptor(), spanStatus.ordinal());
        }
    }

    /* renamed from: com.sumsub.sentry.SpanStatus$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<SpanStatus> serializer() {
            return a.f13538a;
        }

        public Companion() {
        }
    }

    SpanStatus(int i) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean matches(int httpStatusCode) {
        return httpStatusCode <= this.maxHttpStatusCode && this.minHttpStatusCode <= httpStatusCode;
    }

    SpanStatus(int i, int i9) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i9;
    }
}
