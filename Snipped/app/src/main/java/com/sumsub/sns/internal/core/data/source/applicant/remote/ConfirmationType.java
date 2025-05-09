package com.sumsub.sns.internal.core.data.source.applicant.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.internal.EnumDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.InterfaceC1162A;

@InterfaceC1080d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/sumsub/sns/internal/core/data/source/applicant/remote/ConfirmationType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "b", "OTP", "OAUTH", "EID", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public enum ConfirmationType {
    OTP,
    OAUTH,
    EID;


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static final class a implements InterfaceC1162A<ConfirmationType> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15898a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15899b;

        static {
            EnumDescriptor enumDescriptor = new EnumDescriptor("com.sumsub.sns.internal.core.data.source.applicant.remote.ConfirmationType", 3);
            enumDescriptor.k("otp", false);
            enumDescriptor.k("oAuth", false);
            enumDescriptor.k("eID", false);
            f15899b = enumDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConfirmationType deserialize(InterfaceC1144d interfaceC1144d) {
            return ConfirmationType.values()[interfaceC1144d.i(getDescriptor())];
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            return new InterfaceC1078b[0];
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15899b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, ConfirmationType confirmationType) {
            interfaceC1145e.l(getDescriptor(), confirmationType.ordinal());
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.source.applicant.remote.ConfirmationType$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<ConfirmationType> serializer() {
            return a.f15898a;
        }

        public Companion() {
        }
    }
}
