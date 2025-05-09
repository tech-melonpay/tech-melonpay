package com.sumsub.sns.internal.core.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.internal.EnumDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.InterfaceC1162A;
import ra.a0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\b\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/ReviewRejectType;", "", "", "value", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "b", "External", "Final", "Retry", "Unknown", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public enum ReviewRejectType {
    External("EXTERNAL"),
    Final("FINAL"),
    Retry("RETRY"),
    Unknown("UNKNOWN");


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String value;

    public static final class a implements InterfaceC1162A<ReviewRejectType> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15269a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15270b;

        static {
            EnumDescriptor enumDescriptor = new EnumDescriptor("com.sumsub.sns.internal.core.data.model.ReviewRejectType", 4);
            enumDescriptor.k("EXTERNAL", false);
            enumDescriptor.k("FINAL", false);
            enumDescriptor.k("RETRY", false);
            enumDescriptor.k("UNKNOWN", false);
            f15270b = enumDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ReviewRejectType deserialize(InterfaceC1144d interfaceC1144d) {
            return ReviewRejectType.values()[interfaceC1144d.i(getDescriptor())];
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            return new InterfaceC1078b[0];
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15270b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, ReviewRejectType reviewRejectType) {
            interfaceC1145e.l(getDescriptor(), reviewRejectType.ordinal());
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.model.ReviewRejectType$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<ReviewRejectType> serializer() {
            return a.f15269a;
        }

        public Companion() {
        }
    }

    ReviewRejectType(String str) {
        this.value = str;
    }
}
