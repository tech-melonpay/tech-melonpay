package com.sumsub.sns.core.data.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;

@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/sumsub/sns/core/data/model/SNSCompletionResult;", "", "()V", "AbnormalTermination", "SuccessTermination", "Lcom/sumsub/sns/core/data/model/SNSCompletionResult$AbnormalTermination;", "Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class SNSCompletionResult {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sumsub/sns/core/data/model/SNSCompletionResult$AbnormalTermination;", "Lcom/sumsub/sns/core/data/model/SNSCompletionResult;", "", "exception", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Throwable;", "getException", "()Ljava/lang/Throwable;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class AbnormalTermination extends SNSCompletionResult {
        private final Throwable exception;

        public AbnormalTermination() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AbnormalTermination) && f.b(this.exception, ((AbnormalTermination) other).exception);
        }

        public int hashCode() {
            Throwable th = this.exception;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public String toString() {
            return "AbnormalTermination(exception=" + this.exception + ')';
        }

        public AbnormalTermination(Throwable th) {
            super(null);
            this.exception = th;
        }

        public /* synthetic */ AbnormalTermination(Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;", "Lcom/sumsub/sns/core/data/model/SNSCompletionResult;", "Lcom/sumsub/sns/core/data/model/SNSLivenessReason;", "reason", "<init>", "(Lcom/sumsub/sns/core/data/model/SNSLivenessReason;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sumsub/sns/core/data/model/SNSLivenessReason;", "getReason", "()Lcom/sumsub/sns/core/data/model/SNSLivenessReason;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class SuccessTermination extends SNSCompletionResult {
        private final SNSLivenessReason reason;

        public SuccessTermination() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SuccessTermination) && f.b(this.reason, ((SuccessTermination) other).reason);
        }

        public int hashCode() {
            SNSLivenessReason sNSLivenessReason = this.reason;
            if (sNSLivenessReason == null) {
                return 0;
            }
            return sNSLivenessReason.hashCode();
        }

        public String toString() {
            return "SuccessTermination(reason=" + this.reason + ')';
        }

        public SuccessTermination(SNSLivenessReason sNSLivenessReason) {
            super(null);
            this.reason = sNSLivenessReason;
        }

        public /* synthetic */ SuccessTermination(SNSLivenessReason sNSLivenessReason, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : sNSLivenessReason);
        }
    }

    public /* synthetic */ SNSCompletionResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SNSCompletionResult() {
    }
}
