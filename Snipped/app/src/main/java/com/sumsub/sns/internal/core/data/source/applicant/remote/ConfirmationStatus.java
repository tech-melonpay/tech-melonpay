package com.sumsub.sns.internal.core.data.source.applicant.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import kotlinx.serialization.internal.EnumDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.InterfaceC1162A;

@InterfaceC1080d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/sumsub/sns/internal/core/data/source/applicant/remote/ConfirmationStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "b", DebugCoroutineInfoImplKt.CREATED, "CONFIRMED", "RETRY", "REJECTED", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public enum ConfirmationStatus {
    CREATED,
    CONFIRMED,
    RETRY,
    REJECTED;


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static final class a implements InterfaceC1162A<ConfirmationStatus> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15896a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15897b;

        static {
            EnumDescriptor enumDescriptor = new EnumDescriptor("com.sumsub.sns.internal.core.data.source.applicant.remote.ConfirmationStatus", 4);
            enumDescriptor.k("created", false);
            enumDescriptor.k("confirmed", false);
            enumDescriptor.k("retry", false);
            enumDescriptor.k("rejected", false);
            f15897b = enumDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConfirmationStatus deserialize(InterfaceC1144d interfaceC1144d) {
            return ConfirmationStatus.values()[interfaceC1144d.i(getDescriptor())];
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            return new InterfaceC1078b[0];
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15897b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, ConfirmationStatus confirmationStatus) {
            interfaceC1145e.l(getDescriptor(), confirmationStatus.ordinal());
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.source.applicant.remote.ConfirmationStatus$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<ConfirmationStatus> serializer() {
            return a.f15896a;
        }

        public Companion() {
        }
    }
}
