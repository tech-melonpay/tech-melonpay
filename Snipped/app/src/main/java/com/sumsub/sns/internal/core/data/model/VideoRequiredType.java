package com.sumsub.sns.internal.core.data.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.internal.EnumDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.InterfaceC1162A;
import ra.a0;
import ra.m0;

@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/VideoRequiredType;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "b", "Liveness", "Enabled", "Disabled", "PhotoRequired", "DocCapture", "PassiveLiveness", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
@InterfaceC1080d
/* loaded from: classes2.dex */
public enum VideoRequiredType {
    Liveness("liveness"),
    Enabled("enabled"),
    Disabled("disabled"),
    PhotoRequired("photoRequired"),
    DocCapture("docapture"),
    PassiveLiveness("passiveLiveness");


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String value;

    public static final class a implements InterfaceC1162A<VideoRequiredType> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15397a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15398b;

        static {
            EnumDescriptor enumDescriptor = new EnumDescriptor("com.sumsub.sns.internal.core.data.model.VideoRequiredType", 6);
            enumDescriptor.k("liveness", false);
            enumDescriptor.k("enabled", false);
            enumDescriptor.k("disabled", false);
            enumDescriptor.k("photoRequired", false);
            enumDescriptor.k("docapture", false);
            enumDescriptor.k("passiveLiveness", false);
            f15398b = enumDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public VideoRequiredType deserialize(InterfaceC1144d interfaceC1144d) {
            return VideoRequiredType.values()[interfaceC1144d.i(getDescriptor())];
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            return new InterfaceC1078b[]{m0.f26414a};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15398b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, VideoRequiredType videoRequiredType) {
            interfaceC1145e.l(getDescriptor(), videoRequiredType.ordinal());
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.model.VideoRequiredType$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<VideoRequiredType> serializer() {
            return a.f15397a;
        }

        public Companion() {
        }
    }

    VideoRequiredType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
