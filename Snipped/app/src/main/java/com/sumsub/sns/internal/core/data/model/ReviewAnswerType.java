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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\b\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/ReviewAnswerType;", "", "", "value", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "b", "Green", "Red", "Unknown", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public enum ReviewAnswerType {
    Green("GREEN"),
    Red("RED"),
    Unknown("UNKNOWN");


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String value;

    public static final class a implements InterfaceC1162A<ReviewAnswerType> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15267a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15268b;

        static {
            EnumDescriptor enumDescriptor = new EnumDescriptor("com.sumsub.sns.internal.core.data.model.ReviewAnswerType", 3);
            enumDescriptor.k("GREEN", false);
            enumDescriptor.k("RED", false);
            enumDescriptor.k("UNKNOWN", false);
            f15268b = enumDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ReviewAnswerType deserialize(InterfaceC1144d interfaceC1144d) {
            return ReviewAnswerType.values()[interfaceC1144d.i(getDescriptor())];
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            return new InterfaceC1078b[0];
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15268b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, ReviewAnswerType reviewAnswerType) {
            interfaceC1145e.l(getDescriptor(), reviewAnswerType.ordinal());
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.model.ReviewAnswerType$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<ReviewAnswerType> serializer() {
            return a.f15267a;
        }

        public Companion() {
        }
    }

    ReviewAnswerType(String str) {
        this.value = str;
    }
}
