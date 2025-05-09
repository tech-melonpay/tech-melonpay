package com.sumsub.sns.core.data.model;

import androidx.annotation.Keep;
import com.sumsub.sns.internal.core.data.serializer.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;
import na.InterfaceC1078b;
import na.InterfaceC1080d;

@InterfaceC1080d(with = b.class)
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/sumsub/sns/core/data/model/FlowActionType;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Companion", "FaceEnrollment", "Other", "Lcom/sumsub/sns/core/data/model/FlowActionType$FaceEnrollment;", "Lcom/sumsub/sns/core/data/model/FlowActionType$Other;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class FlowActionType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String value;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/sumsub/sns/core/data/model/FlowActionType$Companion;", "", "<init>", "()V", "", "value", "Lcom/sumsub/sns/core/data/model/FlowActionType;", "get", "(Ljava/lang/String;)Lcom/sumsub/sns/core/data/model/FlowActionType;", "Lna/b;", "serializer", "()Lna/b;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FlowActionType get(String value) {
            FaceEnrollment faceEnrollment = FaceEnrollment.INSTANCE;
            if (f.b(value, faceEnrollment.getValue())) {
                return faceEnrollment;
            }
            if (value == null) {
                value = "";
            }
            return new Other(value);
        }

        public final InterfaceC1078b<FlowActionType> serializer() {
            return b.f15824a;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/sumsub/sns/core/data/model/FlowActionType$FaceEnrollment;", "Lcom/sumsub/sns/core/data/model/FlowActionType;", "()V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class FaceEnrollment extends FlowActionType {
        public static final FaceEnrollment INSTANCE = new FaceEnrollment();

        private FaceEnrollment() {
            super("faceEnrollment", null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/sumsub/sns/core/data/model/FlowActionType$Other;", "Lcom/sumsub/sns/core/data/model/FlowActionType;", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Other extends FlowActionType {
        private final String value;

        public Other(String str) {
            super(str, null);
            this.value = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Other) && f.b(getValue(), ((Other) other).getValue());
        }

        @Override // com.sumsub.sns.core.data.model.FlowActionType
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return getValue().hashCode();
        }

        public String toString() {
            return "Other(value=" + getValue() + ')';
        }
    }

    public /* synthetic */ FlowActionType(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public String getValue() {
        return this.value;
    }

    private FlowActionType(String str) {
        this.value = str;
    }
}
