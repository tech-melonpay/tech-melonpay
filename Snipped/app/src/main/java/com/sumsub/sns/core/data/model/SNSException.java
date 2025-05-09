package com.sumsub.sns.core.data.model;

import C.v;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;

@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0006\u0007\bB\u0013\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/sumsub/sns/core/data/model/SNSException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "wrap", "", "(Ljava/lang/Throwable;)V", "Api", "Network", "Unknown", "Lcom/sumsub/sns/core/data/model/SNSException$Api;", "Lcom/sumsub/sns/core/data/model/SNSException$Network;", "Lcom/sumsub/sns/core/data/model/SNSException$Unknown;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class SNSException extends Exception {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/sumsub/sns/core/data/model/SNSException$Api;", "Lcom/sumsub/sns/core/data/model/SNSException;", "", "description", "", "code", "correlationId", "errorCode", "errorName", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "Ljava/lang/Integer;", "getCode", "()Ljava/lang/Integer;", "getCorrelationId", "getErrorCode", "getErrorName", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Api extends SNSException {
        private final Integer code;
        private final String correlationId;
        private final String description;
        private final Integer errorCode;
        private final String errorName;

        public Api(String str, Integer num, String str2, Integer num2, String str3) {
            super(new Exception(str), null);
            this.description = str;
            this.code = num;
            this.correlationId = str2;
            this.errorCode = num2;
            this.errorName = str3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Api)) {
                return false;
            }
            Api api = (Api) other;
            return f.b(this.description, api.description) && f.b(this.code, api.code) && f.b(this.correlationId, api.correlationId) && f.b(this.errorCode, api.errorCode) && f.b(this.errorName, api.errorName);
        }

        public final Integer getCode() {
            return this.code;
        }

        public final String getDescription() {
            return this.description;
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public int hashCode() {
            String str = this.description;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.code;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.correlationId;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num2 = this.errorCode;
            int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str3 = this.errorName;
            return hashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // java.lang.Throwable
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Api(description=");
            sb2.append(this.description);
            sb2.append(", code=");
            sb2.append(this.code);
            sb2.append(", correlationId=");
            sb2.append(this.correlationId);
            sb2.append(", errorCode=");
            sb2.append(this.errorCode);
            sb2.append(", errorName=");
            return v.q(sb2, this.errorName, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sumsub/sns/core/data/model/SNSException$Network;", "Lcom/sumsub/sns/core/data/model/SNSException;", "wrap", "", "(Ljava/lang/Throwable;)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Network extends SNSException {
        public Network(Throwable th) {
            super(th, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sumsub/sns/core/data/model/SNSException$Unknown;", "Lcom/sumsub/sns/core/data/model/SNSException;", "wrap", "", "(Ljava/lang/Throwable;)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Unknown extends SNSException {
        public Unknown() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Unknown(Throwable th) {
            super(th, null);
        }

        public /* synthetic */ Unknown(Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }
    }

    public /* synthetic */ SNSException(Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(th);
    }

    private SNSException(Throwable th) {
        super(th);
    }

    public /* synthetic */ SNSException(Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : th, null);
    }
}
