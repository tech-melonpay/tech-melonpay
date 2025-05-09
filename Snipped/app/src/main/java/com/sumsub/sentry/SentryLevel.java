package com.sumsub.sentry;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.internal.EnumDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.InterfaceC1162A;

@InterfaceC1080d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/sumsub/sentry/SentryLevel;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "b", "DEBUG", "INFO", "WARNING", "ERROR", "FATAL", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public enum SentryLevel {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static final class a implements InterfaceC1162A<SentryLevel> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13536a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f13537b;

        static {
            EnumDescriptor enumDescriptor = new EnumDescriptor("com.sumsub.sentry.SentryLevel", 5);
            enumDescriptor.k("debug", false);
            enumDescriptor.k("info", false);
            enumDescriptor.k("warning", false);
            enumDescriptor.k(Constants.IPC_BUNDLE_KEY_SEND_ERROR, false);
            enumDescriptor.k("fatal", false);
            f13537b = enumDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SentryLevel deserialize(InterfaceC1144d interfaceC1144d) {
            return SentryLevel.values()[interfaceC1144d.i(getDescriptor())];
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            return new InterfaceC1078b[0];
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f13537b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, SentryLevel sentryLevel) {
            interfaceC1145e.l(getDescriptor(), sentryLevel.ordinal());
        }
    }

    /* renamed from: com.sumsub.sentry.SentryLevel$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<SentryLevel> serializer() {
            return a.f13536a;
        }

        public Companion() {
        }
    }
}
