package com.sumsub.sns.core.data.model;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\t\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/sumsub/sns/core/data/model/SNSLivenessReason;", "Ljava/io/Serializable;", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "CancelledByHostApplication", "CompletedUnsuccessfullyAllowContinue", "InitializationError", "NetworkError", "UnknownInternalError", "UserCancelled", "VeritifcationSuccessfully", "Lcom/sumsub/sns/core/data/model/SNSLivenessReason$CancelledByHostApplication;", "Lcom/sumsub/sns/core/data/model/SNSLivenessReason$CompletedUnsuccessfullyAllowContinue;", "Lcom/sumsub/sns/core/data/model/SNSLivenessReason$InitializationError;", "Lcom/sumsub/sns/core/data/model/SNSLivenessReason$NetworkError;", "Lcom/sumsub/sns/core/data/model/SNSLivenessReason$UnknownInternalError;", "Lcom/sumsub/sns/core/data/model/SNSLivenessReason$UserCancelled;", "Lcom/sumsub/sns/core/data/model/SNSLivenessReason$VeritifcationSuccessfully;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class SNSLivenessReason implements Serializable {
    private final String message;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/sumsub/sns/core/data/model/SNSLivenessReason$CancelledByHostApplication;", "Lcom/sumsub/sns/core/data/model/SNSLivenessReason;", "()V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class CancelledByHostApplication extends SNSLivenessReason {
        public static final CancelledByHostApplication INSTANCE = new CancelledByHostApplication();

        private CancelledByHostApplication() {
            super("Canceled by host application", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/sumsub/sns/core/data/model/SNSLivenessReason$CompletedUnsuccessfullyAllowContinue;", "Lcom/sumsub/sns/core/data/model/SNSLivenessReason;", "()V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class CompletedUnsuccessfullyAllowContinue extends SNSLivenessReason {
        public static final CompletedUnsuccessfullyAllowContinue INSTANCE = new CompletedUnsuccessfullyAllowContinue();

        private CompletedUnsuccessfullyAllowContinue() {
            super("Session completed unsuccessfully but allows to continue", null);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/sumsub/sns/core/data/model/SNSLivenessReason$InitializationError;", "Lcom/sumsub/sns/core/data/model/SNSLivenessReason;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class InitializationError extends SNSLivenessReason {
        private final Exception exception;

        public InitializationError(Exception exc) {
            super("Liveness initialization is failed", null);
            this.exception = exc;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InitializationError) && f.b(this.exception, ((InitializationError) other).exception);
        }

        public final Exception getException() {
            return this.exception;
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "InitializationError(exception=" + this.exception + ')';
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/sumsub/sns/core/data/model/SNSLivenessReason$NetworkError;", "Lcom/sumsub/sns/core/data/model/SNSLivenessReason;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class NetworkError extends SNSLivenessReason {
        private final Exception exception;

        public NetworkError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NetworkError) && f.b(this.exception, ((NetworkError) other).exception);
        }

        public final Exception getException() {
            return this.exception;
        }

        public int hashCode() {
            Exception exc = this.exception;
            if (exc == null) {
                return 0;
            }
            return exc.hashCode();
        }

        public String toString() {
            return "NetworkError(exception=" + this.exception + ')';
        }

        public NetworkError(Exception exc) {
            super("Network connectivity issue encountered.", null);
            this.exception = exc;
        }

        public /* synthetic */ NetworkError(Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : exc);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/sumsub/sns/core/data/model/SNSLivenessReason$UnknownInternalError;", "Lcom/sumsub/sns/core/data/model/SNSLivenessReason;", "()V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class UnknownInternalError extends SNSLivenessReason {
        public static final UnknownInternalError INSTANCE = new UnknownInternalError();

        private UnknownInternalError() {
            super("Session failed because of an unhandled internal error.", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/sumsub/sns/core/data/model/SNSLivenessReason$UserCancelled;", "Lcom/sumsub/sns/core/data/model/SNSLivenessReason;", "()V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class UserCancelled extends SNSLivenessReason {
        public static final UserCancelled INSTANCE = new UserCancelled();

        private UserCancelled() {
            super("User cancelled before completing session.", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/sumsub/sns/core/data/model/SNSLivenessReason$VeritifcationSuccessfully;", "Lcom/sumsub/sns/core/data/model/SNSLivenessReason;", "()V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class VeritifcationSuccessfully extends SNSLivenessReason {
        public static final VeritifcationSuccessfully INSTANCE = new VeritifcationSuccessfully();

        private VeritifcationSuccessfully() {
            super("The Liveness session was performed successfully ", null);
        }
    }

    public /* synthetic */ SNSLivenessReason(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getMessage() {
        return this.message;
    }

    private SNSLivenessReason(String str) {
        this.message = str;
    }
}
