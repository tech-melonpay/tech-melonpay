package com.sumsub.sns.internal.core.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.sumsub.log.logger.Logger;
import ka.C0969n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.EnumDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import oa.C1095a;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.C1172g;
import ra.InterfaceC1162A;
import ra.O;
import ra.a0;
import ra.i0;
import ra.m0;
import sa.AbstractC1244a;

/* loaded from: classes2.dex */
public abstract class SNSMessage {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0017\u0018\u0000 \u00172\u00020\u0001:\n\u0011\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0013\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0014¨\u0006!"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$Type;", "type", "<init>", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$Type;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$Type;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage;Lqa/c;Lpa/f;)V", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$Type;", "()Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$Type;", "getType$annotations", "()V", "Companion", "b", "c", "d", "e", "Type", "UserVisibilityState", "f", "g", "h", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC1080d
    public static class ClientMessage extends SNSMessage {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final Type type;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$Type;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "b", "USER_VISIBILITY_STATE", "SCREENSHOT_MADE", "COULD_NOT_MAKE_SCREENSHOT", "VERIFY_MOBILE_PHONE_TAN_SUCCESS", "CANCEL_VERIFY_MOBILE_PHONE_TAN", "VERIFY_MOBILE_PHONE_TAN_REQUESTED", "VERIFY_MOBILE_PHONE_TAN_RETRY_CODE", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public enum Type {
            USER_VISIBILITY_STATE("userVisibilityState"),
            SCREENSHOT_MADE("screenshotMade"),
            COULD_NOT_MAKE_SCREENSHOT("couldNotMakeScreenshot"),
            VERIFY_MOBILE_PHONE_TAN_SUCCESS("verifyMobilePhoneTanSuccess"),
            CANCEL_VERIFY_MOBILE_PHONE_TAN("cancelVerifyMobilePhoneTan"),
            VERIFY_MOBILE_PHONE_TAN_REQUESTED("verifyMobilePhoneTanRequested"),
            VERIFY_MOBILE_PHONE_TAN_RETRY_CODE("verifyMobilePhoneTanRetryCode");


            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String value;

            public static final class a implements InterfaceC1162A<Type> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15274a = new a();

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15275b;

                static {
                    EnumDescriptor enumDescriptor = new EnumDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ClientMessage.Type", 7);
                    enumDescriptor.k("userVisibilityState", false);
                    enumDescriptor.k("screenshotMade", false);
                    enumDescriptor.k("couldNotMakeScreenshot", false);
                    enumDescriptor.k("verifyMobilePhoneTanSuccess", false);
                    enumDescriptor.k("cancelVerifyMobilePhoneTan", false);
                    enumDescriptor.k("verifyMobilePhoneTanRequested", false);
                    enumDescriptor.k("verifyMobilePhoneTanRetryCode", false);
                    f15275b = enumDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public Type deserialize(InterfaceC1144d interfaceC1144d) {
                    return Type.values()[interfaceC1144d.i(getDescriptor())];
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{m0.f26414a};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15275b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, Type type) {
                    interfaceC1145e.l(getDescriptor(), type.ordinal());
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ClientMessage$Type$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<Type> serializer() {
                    return a.f15274a;
                }

                public Companion() {
                }
            }

            Type(String str) {
                this.value = str;
            }

            public final String getValue() {
                return this.value;
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0004\u0013\u0015\u0017\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B3\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$UserVisibilityState;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$UserVisibilityState$c;", "payload", "<init>", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$UserVisibilityState$c;)V", "", "seen1", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$Type;", "type", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$Type;Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$UserVisibilityState$c;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$UserVisibilityState;Lqa/c;Lpa/f;)V", "b", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$UserVisibilityState$c;", "c", "()Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$UserVisibilityState$c;", "getPayload$annotations", "()V", "Companion", "Visibility", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final class UserVisibilityState extends ClientMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final c payload;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$UserVisibilityState$Visibility;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "b", "VISIBLE", "HIDDEN", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC1080d
            public enum Visibility {
                VISIBLE("visible"),
                HIDDEN("hidden");


                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String value;

                public static final class a implements InterfaceC1162A<Visibility> {

                    /* renamed from: a, reason: collision with root package name */
                    public static final a f15277a = new a();

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ pa.f f15278b;

                    static {
                        EnumDescriptor enumDescriptor = new EnumDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ClientMessage.UserVisibilityState.Visibility", 2);
                        enumDescriptor.k("visible", false);
                        enumDescriptor.k("hidden", false);
                        f15278b = enumDescriptor;
                    }

                    @Override // na.InterfaceC1077a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Visibility deserialize(InterfaceC1144d interfaceC1144d) {
                        return Visibility.values()[interfaceC1144d.i(getDescriptor())];
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] childSerializers() {
                        return new InterfaceC1078b[]{m0.f26414a};
                    }

                    @Override // na.InterfaceC1081e, na.InterfaceC1077a
                    public pa.f getDescriptor() {
                        return f15278b;
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] typeParametersSerializers() {
                        return a0.f26382b;
                    }

                    @Override // na.InterfaceC1081e
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(InterfaceC1145e interfaceC1145e, Visibility visibility) {
                        interfaceC1145e.l(getDescriptor(), visibility.ordinal());
                    }
                }

                /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ClientMessage$UserVisibilityState$Visibility$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final InterfaceC1078b<Visibility> serializer() {
                        return a.f15277a;
                    }

                    public Companion() {
                    }
                }

                Visibility(String str) {
                    this.value = str;
                }

                public final String getValue() {
                    return this.value;
                }
            }

            public static final class a implements InterfaceC1162A<UserVisibilityState> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15279a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15280b;

                static {
                    a aVar = new a();
                    f15279a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ClientMessage.UserVisibilityState", aVar, 2);
                    pluginGeneratedSerialDescriptor.k("type", false);
                    pluginGeneratedSerialDescriptor.k("payload", false);
                    f15280b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public UserVisibilityState deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    i0 i0Var = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj = null;
                    Object obj2 = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else if (q10 == 0) {
                            obj = c2.C(descriptor, 0, Type.a.f15274a, obj);
                            i |= 1;
                        } else {
                            if (q10 != 1) {
                                throw new UnknownFieldException(q10);
                            }
                            obj2 = c2.C(descriptor, 1, c.a.f15282a, obj2);
                            i |= 2;
                        }
                    }
                    c2.b(descriptor);
                    return new UserVisibilityState(i, (Type) obj, (c) obj2, i0Var);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{Type.a.f15274a, c.a.f15282a};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15280b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, UserVisibilityState userVisibilityState) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    UserVisibilityState.a(userVisibilityState, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ClientMessage$UserVisibilityState$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final UserVisibilityState a() {
                    return new UserVisibilityState(new c(Visibility.HIDDEN.getValue()));
                }

                public final UserVisibilityState b() {
                    return new UserVisibilityState(new c(Visibility.VISIBLE.getValue()));
                }

                public final InterfaceC1078b<UserVisibilityState> serializer() {
                    return a.f15279a;
                }

                public Companion() {
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u0011\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0013J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0013¨\u0006!"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$UserVisibilityState$c;", "", "", "visibilityState", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$UserVisibilityState$c;Lqa/c;Lpa/f;)V", "()Ljava/lang/String;", "(Ljava/lang/String;)Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$UserVisibilityState$c;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "b", "getVisibilityState$annotations", "()V", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC1080d
            public static final /* data */ class c {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final String visibilityState;

                public static final class a implements InterfaceC1162A<c> {

                    /* renamed from: a, reason: collision with root package name */
                    public static final a f15282a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ pa.f f15283b;

                    static {
                        a aVar = new a();
                        f15282a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ClientMessage.UserVisibilityState.Payload", aVar, 1);
                        pluginGeneratedSerialDescriptor.k("visibilityState", false);
                        f15283b = pluginGeneratedSerialDescriptor;
                    }

                    @Override // na.InterfaceC1077a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public c deserialize(InterfaceC1144d interfaceC1144d) {
                        pa.f descriptor = getDescriptor();
                        InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                        i0 i0Var = null;
                        boolean z10 = true;
                        int i = 0;
                        String str = null;
                        while (z10) {
                            int q10 = c2.q(descriptor);
                            if (q10 == -1) {
                                z10 = false;
                            } else {
                                if (q10 != 0) {
                                    throw new UnknownFieldException(q10);
                                }
                                str = c2.y(descriptor, 0);
                                i = 1;
                            }
                        }
                        c2.b(descriptor);
                        return new c(i, str, i0Var);
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] childSerializers() {
                        return new InterfaceC1078b[]{m0.f26414a};
                    }

                    @Override // na.InterfaceC1081e, na.InterfaceC1077a
                    public pa.f getDescriptor() {
                        return f15283b;
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] typeParametersSerializers() {
                        return a0.f26382b;
                    }

                    @Override // na.InterfaceC1081e
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(InterfaceC1145e interfaceC1145e, c cVar) {
                        pa.f descriptor = getDescriptor();
                        InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                        c.a(cVar, c2, descriptor);
                        c2.b(descriptor);
                    }
                }

                /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ClientMessage$UserVisibilityState$c$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final InterfaceC1078b<c> serializer() {
                        return a.f15282a;
                    }

                    public Companion() {
                    }
                }

                public /* synthetic */ c(int i, String str, i0 i0Var) {
                    if (1 == (i & 1)) {
                        this.visibilityState = str;
                    } else {
                        a0.h(i, 1, a.f15282a.getDescriptor());
                        throw null;
                    }
                }

                /* renamed from: a, reason: from getter */
                public final String getVisibilityState() {
                    return this.visibilityState;
                }

                public final String b() {
                    return this.visibilityState;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof c) && kotlin.jvm.internal.f.b(this.visibilityState, ((c) other).visibilityState);
                }

                public int hashCode() {
                    return this.visibilityState.hashCode();
                }

                public String toString() {
                    return C.v.q(new StringBuilder("Payload(visibilityState="), this.visibilityState, ')');
                }

                public c(String str) {
                    this.visibilityState = str;
                }

                public final c a(String visibilityState) {
                    return new c(visibilityState);
                }

                public static /* synthetic */ c a(c cVar, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = cVar.visibilityState;
                    }
                    return cVar.a(str);
                }

                public static final void a(c self, InterfaceC1143c output, pa.f serialDesc) {
                    output.x(serialDesc, 0, self.visibilityState);
                }

                public static /* synthetic */ void c() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ UserVisibilityState(int i, Type type, c cVar, i0 i0Var) {
                super(i, type, i0Var);
                if (3 != (i & 3)) {
                    a0.h(i, 3, a.f15279a.getDescriptor());
                    throw null;
                }
                this.payload = cVar;
            }

            public static final void a(UserVisibilityState self, InterfaceC1143c output, pa.f serialDesc) {
                ClientMessage.a(self, output, serialDesc);
                output.C(serialDesc, 1, c.a.f15282a, self.payload);
            }

            /* renamed from: c, reason: from getter */
            public final c getPayload() {
                return this.payload;
            }

            public UserVisibilityState(c cVar) {
                super(Type.USER_VISIBILITY_STATE);
                this.payload = cVar;
            }

            public static /* synthetic */ void d() {
            }
        }

        public static final class a implements InterfaceC1162A<ClientMessage> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f15284a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ pa.f f15285b;

            static {
                a aVar = new a();
                f15284a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ClientMessage", aVar, 1);
                pluginGeneratedSerialDescriptor.k("type", false);
                f15285b = pluginGeneratedSerialDescriptor;
            }

            @Override // na.InterfaceC1077a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ClientMessage deserialize(InterfaceC1144d interfaceC1144d) {
                pa.f descriptor = getDescriptor();
                InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                i0 i0Var = null;
                boolean z10 = true;
                int i = 0;
                Object obj = null;
                while (z10) {
                    int q10 = c2.q(descriptor);
                    if (q10 == -1) {
                        z10 = false;
                    } else {
                        if (q10 != 0) {
                            throw new UnknownFieldException(q10);
                        }
                        obj = c2.C(descriptor, 0, Type.a.f15274a, obj);
                        i = 1;
                    }
                }
                c2.b(descriptor);
                return new ClientMessage(i, (Type) obj, i0Var);
            }

            @Override // ra.InterfaceC1162A
            public InterfaceC1078b<?>[] childSerializers() {
                return new InterfaceC1078b[]{Type.a.f15274a};
            }

            @Override // na.InterfaceC1081e, na.InterfaceC1077a
            public pa.f getDescriptor() {
                return f15285b;
            }

            @Override // ra.InterfaceC1162A
            public InterfaceC1078b<?>[] typeParametersSerializers() {
                return a0.f26382b;
            }

            @Override // na.InterfaceC1081e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(InterfaceC1145e interfaceC1145e, ClientMessage clientMessage) {
                pa.f descriptor = getDescriptor();
                InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                ClientMessage.a(clientMessage, c2, descriptor);
                c2.b(descriptor);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0011\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$b;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage;", "<init>", "()V", "", "seen1", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$Type;", "type", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$Type;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$b;Lqa/c;Lpa/f;)V", "Companion", "b", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final class b extends ClientMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public static final class a implements InterfaceC1162A<b> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15286a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15287b;

                static {
                    a aVar = new a();
                    f15286a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ClientMessage.CancelVerifyMobilePhoneTan", aVar, 1);
                    pluginGeneratedSerialDescriptor.k("type", false);
                    f15287b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public b deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    i0 i0Var = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else {
                            if (q10 != 0) {
                                throw new UnknownFieldException(q10);
                            }
                            obj = c2.C(descriptor, 0, Type.a.f15274a, obj);
                            i = 1;
                        }
                    }
                    c2.b(descriptor);
                    return new b(i, (Type) obj, i0Var);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{Type.a.f15274a};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15287b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, b bVar) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    b.a(bVar, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ClientMessage$b$b, reason: collision with other inner class name and from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<b> serializer() {
                    return a.f15286a;
                }

                public Companion() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ b(int i, Type type, i0 i0Var) {
                super(i, type, i0Var);
                if (1 == (i & 1)) {
                } else {
                    a0.h(i, 1, a.f15286a.getDescriptor());
                    throw null;
                }
            }

            public static final void a(b self, InterfaceC1143c output, pa.f serialDesc) {
                ClientMessage.a(self, output, serialDesc);
            }

            public b() {
                super(Type.CANCEL_VERIFY_MOBILE_PHONE_TAN);
            }
        }

        /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ClientMessage$c, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC1078b<ClientMessage> serializer() {
                return a.f15284a;
            }

            public Companion() {
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0011\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$d;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage;", "<init>", "()V", "", "seen1", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$Type;", "type", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$Type;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$d;Lqa/c;Lpa/f;)V", "Companion", "b", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final class d extends ClientMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public static final class a implements InterfaceC1162A<d> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15288a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15289b;

                static {
                    a aVar = new a();
                    f15288a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ClientMessage.CouldNotMakeScreenshot", aVar, 1);
                    pluginGeneratedSerialDescriptor.k("type", false);
                    f15289b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public d deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    i0 i0Var = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else {
                            if (q10 != 0) {
                                throw new UnknownFieldException(q10);
                            }
                            obj = c2.C(descriptor, 0, Type.a.f15274a, obj);
                            i = 1;
                        }
                    }
                    c2.b(descriptor);
                    return new d(i, (Type) obj, i0Var);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{Type.a.f15274a};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15289b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, d dVar) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    d.a(dVar, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ClientMessage$d$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<d> serializer() {
                    return a.f15288a;
                }

                public Companion() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ d(int i, Type type, i0 i0Var) {
                super(i, type, i0Var);
                if (1 == (i & 1)) {
                } else {
                    a0.h(i, 1, a.f15288a.getDescriptor());
                    throw null;
                }
            }

            public static final void a(d self, InterfaceC1143c output, pa.f serialDesc) {
                ClientMessage.a(self, output, serialDesc);
            }

            public d() {
                super(Type.COULD_NOT_MAKE_SCREENSHOT);
            }
        }

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0003\u0013\"\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B3\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$e;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$e$c;", "payload", "<init>", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$e$c;)V", "", "seen1", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$Type;", "type", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$Type;Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$e$c;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$e;Lqa/c;Lpa/f;)V", "c", "()Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$e$c;", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$e$c;)Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$e;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$e$c;", "d", "getPayload$annotations", "()V", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final /* data */ class e extends ClientMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final c payload;

            public static final class a implements InterfaceC1162A<e> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15291a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15292b;

                static {
                    a aVar = new a();
                    f15291a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ClientMessage.ScreenshotMade", aVar, 2);
                    pluginGeneratedSerialDescriptor.k("type", false);
                    pluginGeneratedSerialDescriptor.k("payload", false);
                    f15292b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public e deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    i0 i0Var = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj = null;
                    Object obj2 = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else if (q10 == 0) {
                            obj = c2.C(descriptor, 0, Type.a.f15274a, obj);
                            i |= 1;
                        } else {
                            if (q10 != 1) {
                                throw new UnknownFieldException(q10);
                            }
                            obj2 = c2.C(descriptor, 1, c.a.f15294a, obj2);
                            i |= 2;
                        }
                    }
                    c2.b(descriptor);
                    return new e(i, (Type) obj, (c) obj2, i0Var);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{Type.a.f15274a, c.a.f15294a};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15292b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, e eVar) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    e.a(eVar, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ClientMessage$e$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<e> serializer() {
                    return a.f15291a;
                }

                public Companion() {
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u0011\u001dB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0013J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0013¨\u0006!"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$e$c;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$e$c;Lqa/c;Lpa/f;)V", "()Ljava/lang/String;", "(Ljava/lang/String;)Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$e$c;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "b", "getName$annotations", "()V", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC1080d
            public static final /* data */ class c {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final String name;

                public static final class a implements InterfaceC1162A<c> {

                    /* renamed from: a, reason: collision with root package name */
                    public static final a f15294a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ pa.f f15295b;

                    static {
                        a aVar = new a();
                        f15294a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ClientMessage.ScreenshotMade.Payload", aVar, 1);
                        pluginGeneratedSerialDescriptor.k("imageId", true);
                        f15295b = pluginGeneratedSerialDescriptor;
                    }

                    @Override // na.InterfaceC1077a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public c deserialize(InterfaceC1144d interfaceC1144d) {
                        pa.f descriptor = getDescriptor();
                        InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                        i0 i0Var = null;
                        boolean z10 = true;
                        int i = 0;
                        Object obj = null;
                        while (z10) {
                            int q10 = c2.q(descriptor);
                            if (q10 == -1) {
                                z10 = false;
                            } else {
                                if (q10 != 0) {
                                    throw new UnknownFieldException(q10);
                                }
                                obj = c2.D(descriptor, 0, m0.f26414a, obj);
                                i = 1;
                            }
                        }
                        c2.b(descriptor);
                        return new c(i, (String) obj, i0Var);
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] childSerializers() {
                        return new InterfaceC1078b[]{C1095a.a(m0.f26414a)};
                    }

                    @Override // na.InterfaceC1081e, na.InterfaceC1077a
                    public pa.f getDescriptor() {
                        return f15295b;
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] typeParametersSerializers() {
                        return a0.f26382b;
                    }

                    @Override // na.InterfaceC1081e
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(InterfaceC1145e interfaceC1145e, c cVar) {
                        pa.f descriptor = getDescriptor();
                        InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                        c.a(cVar, c2, descriptor);
                        c2.b(descriptor);
                    }
                }

                /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ClientMessage$e$c$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final InterfaceC1078b<c> serializer() {
                        return a.f15294a;
                    }

                    public Companion() {
                    }
                }

                public c() {
                    this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                /* renamed from: a, reason: from getter */
                public final String getName() {
                    return this.name;
                }

                public final String b() {
                    return this.name;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof c) && kotlin.jvm.internal.f.b(this.name, ((c) other).name);
                }

                public int hashCode() {
                    String str = this.name;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                public String toString() {
                    return C.v.q(new StringBuilder("Payload(name="), this.name, ')');
                }

                public /* synthetic */ c(int i, String str, i0 i0Var) {
                    if ((i & 1) == 0) {
                        this.name = null;
                    } else {
                        this.name = str;
                    }
                }

                public final c a(String name) {
                    return new c(name);
                }

                public c(String str) {
                    this.name = str;
                }

                public static /* synthetic */ c a(c cVar, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = cVar.name;
                    }
                    return cVar.a(str);
                }

                public static final void a(c self, InterfaceC1143c output, pa.f serialDesc) {
                    if (!output.D() && self.name == null) {
                        return;
                    }
                    output.e(serialDesc, 0, m0.f26414a, self.name);
                }

                public /* synthetic */ c(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str);
                }

                public static /* synthetic */ void c() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ e(int i, Type type, c cVar, i0 i0Var) {
                super(i, type, i0Var);
                if (3 != (i & 3)) {
                    a0.h(i, 3, a.f15291a.getDescriptor());
                    throw null;
                }
                this.payload = cVar;
            }

            public final e a(c payload) {
                return new e(payload);
            }

            /* renamed from: c, reason: from getter */
            public final c getPayload() {
                return this.payload;
            }

            public final c d() {
                return this.payload;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof e) && kotlin.jvm.internal.f.b(this.payload, ((e) other).payload);
            }

            public int hashCode() {
                return this.payload.hashCode();
            }

            public String toString() {
                return "ScreenshotMade(payload=" + this.payload + ')';
            }

            public e(c cVar) {
                super(Type.SCREENSHOT_MADE);
                this.payload = cVar;
            }

            public static /* synthetic */ e a(e eVar, c cVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    cVar = eVar.payload;
                }
                return eVar.a(cVar);
            }

            public static final void a(e self, InterfaceC1143c output, pa.f serialDesc) {
                ClientMessage.a(self, output, serialDesc);
                output.C(serialDesc, 1, c.a.f15294a, self.payload);
            }

            public static /* synthetic */ void e() {
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0011\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$f;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage;", "<init>", "()V", "", "seen1", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$Type;", "type", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$Type;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$f;Lqa/c;Lpa/f;)V", "Companion", "b", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final class f extends ClientMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public static final class a implements InterfaceC1162A<f> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15296a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15297b;

                static {
                    a aVar = new a();
                    f15296a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ClientMessage.VerifyMobilePhoneTanRequested", aVar, 1);
                    pluginGeneratedSerialDescriptor.k("type", false);
                    f15297b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public f deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    i0 i0Var = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else {
                            if (q10 != 0) {
                                throw new UnknownFieldException(q10);
                            }
                            obj = c2.C(descriptor, 0, Type.a.f15274a, obj);
                            i = 1;
                        }
                    }
                    c2.b(descriptor);
                    return new f(i, (Type) obj, i0Var);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{Type.a.f15274a};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15297b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, f fVar) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    f.a(fVar, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ClientMessage$f$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<f> serializer() {
                    return a.f15296a;
                }

                public Companion() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ f(int i, Type type, i0 i0Var) {
                super(i, type, i0Var);
                if (1 == (i & 1)) {
                } else {
                    a0.h(i, 1, a.f15296a.getDescriptor());
                    throw null;
                }
            }

            public static final void a(f self, InterfaceC1143c output, pa.f serialDesc) {
                ClientMessage.a(self, output, serialDesc);
            }

            public f() {
                super(Type.VERIFY_MOBILE_PHONE_TAN_REQUESTED);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0011\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$g;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage;", "<init>", "()V", "", "seen1", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$Type;", "type", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$Type;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$g;Lqa/c;Lpa/f;)V", "Companion", "b", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final class g extends ClientMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public static final class a implements InterfaceC1162A<g> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15298a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15299b;

                static {
                    a aVar = new a();
                    f15298a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ClientMessage.VerifyMobilePhoneTanRetryCode", aVar, 1);
                    pluginGeneratedSerialDescriptor.k("type", false);
                    f15299b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public g deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    i0 i0Var = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else {
                            if (q10 != 0) {
                                throw new UnknownFieldException(q10);
                            }
                            obj = c2.C(descriptor, 0, Type.a.f15274a, obj);
                            i = 1;
                        }
                    }
                    c2.b(descriptor);
                    return new g(i, (Type) obj, i0Var);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{Type.a.f15274a};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15299b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, g gVar) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    g.a(gVar, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ClientMessage$g$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<g> serializer() {
                    return a.f15298a;
                }

                public Companion() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ g(int i, Type type, i0 i0Var) {
                super(i, type, i0Var);
                if (1 == (i & 1)) {
                } else {
                    a0.h(i, 1, a.f15298a.getDescriptor());
                    throw null;
                }
            }

            public static final void a(g self, InterfaceC1143c output, pa.f serialDesc) {
                ClientMessage.a(self, output, serialDesc);
            }

            public g() {
                super(Type.VERIFY_MOBILE_PHONE_TAN_RETRY_CODE);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0011\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$h;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage;", "<init>", "()V", "", "seen1", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$Type;", "type", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$Type;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage$h;Lqa/c;Lpa/f;)V", "Companion", "b", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final class h extends ClientMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public static final class a implements InterfaceC1162A<h> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15300a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15301b;

                static {
                    a aVar = new a();
                    f15300a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ClientMessage.VerifyMobilePhoneTanSuccess", aVar, 1);
                    pluginGeneratedSerialDescriptor.k("type", false);
                    f15301b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public h deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    i0 i0Var = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else {
                            if (q10 != 0) {
                                throw new UnknownFieldException(q10);
                            }
                            obj = c2.C(descriptor, 0, Type.a.f15274a, obj);
                            i = 1;
                        }
                    }
                    c2.b(descriptor);
                    return new h(i, (Type) obj, i0Var);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{Type.a.f15274a};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15301b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, h hVar) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    h.a(hVar, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ClientMessage$h$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<h> serializer() {
                    return a.f15300a;
                }

                public Companion() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ h(int i, Type type, i0 i0Var) {
                super(i, type, i0Var);
                if (1 == (i & 1)) {
                } else {
                    a0.h(i, 1, a.f15300a.getDescriptor());
                    throw null;
                }
            }

            public static final void a(h self, InterfaceC1143c output, pa.f serialDesc) {
                ClientMessage.a(self, output, serialDesc);
            }

            public h() {
                super(Type.VERIFY_MOBILE_PHONE_TAN_SUCCESS);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ ClientMessage(int r3, com.sumsub.sns.internal.core.data.model.SNSMessage.ClientMessage.Type r4, ra.i0 r5) {
            /*
                r2 = this;
                r5 = r3 & 1
                r0 = 0
                r1 = 1
                if (r1 != r5) goto Lc
                r2.<init>(r0)
                r2.type = r4
                return
            Lc:
                com.sumsub.sns.internal.core.data.model.SNSMessage$ClientMessage$a r4 = com.sumsub.sns.internal.core.data.model.SNSMessage.ClientMessage.a.f15284a
                pa.f r4 = r4.getDescriptor()
                ra.a0.h(r3, r1, r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.model.SNSMessage.ClientMessage.<init>(int, com.sumsub.sns.internal.core.data.model.SNSMessage$ClientMessage$Type, ra.i0):void");
        }

        public static final void a(ClientMessage self, InterfaceC1143c output, pa.f serialDesc) {
            output.C(serialDesc, 0, Type.a.f15274a, self.type);
        }

        public ClientMessage(Type type) {
            super(null);
            this.type = type;
        }

        /* renamed from: a, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        public static /* synthetic */ void b() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0017\u0018\u0000 \u00172\u00020\u0001:\u0016\u0011\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0013\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0014¨\u0006-"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;", "type", "<init>", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage;Lqa/c;Lpa/f;)V", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;", "()Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;", "getType$annotations", "()V", "Companion", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "ScreenShotPayload", "p", "Type", "q", "r", "s", "t", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC1080d
    public static class ServerMessage extends SNSMessage {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final Type type;

        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u0000 82\u00020\u0001:\u0003\u000f\u00119BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBW\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010JL\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J(\u0010\u000f\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(HÇ\u0001¢\u0006\u0004\b\u000f\u0010*R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010\u0010\"\u0004\b\u0013\u0010-R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010+\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010\u0010\"\u0004\b\u0012\u0010-R*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010+\u0012\u0004\b3\u0010/\u001a\u0004\b2\u0010\u0010\"\u0004\b\u000f\u0010-R*\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010+\u0012\u0004\b5\u0010/\u001a\u0004\b4\u0010\u0010\"\u0004\b\u0011\u0010-R*\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010+\u0012\u0004\b7\u0010/\u001a\u0004\b6\u0010\u0010\"\u0004\b\u0014\u0010-¨\u0006:"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$ScreenShotPayload;", "Landroid/os/Parcelable;", "", "type", "idDocSubType", "country", "idDocSetType", "variant", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lra/i0;)V", "a", "()Ljava/lang/String;", "b", "c", "d", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$ScreenShotPayload;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "LO9/p;", "writeToParcel", "(Landroid/os/Parcel;I)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$ScreenShotPayload;Lqa/c;Lpa/f;)V", "Ljava/lang/String;", "l", "(Ljava/lang/String;)V", "getType$annotations", "()V", "j", "getIdDocSubType$annotations", "f", "getCountry$annotations", "h", "getIdDocSetType$annotations", "n", "getVariant$annotations", "Companion", "Variant", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final /* data */ class ScreenShotPayload implements Parcelable {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            public String type;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            public String idDocSubType;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            public String country;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            public String idDocSetType;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            public String variant;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<ScreenShotPayload> CREATOR = new c();

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$ScreenShotPayload$Variant;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "b", "SCREENSHOT", "UPLOAD", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC1080d
            public enum Variant {
                SCREENSHOT("SCREENSHOT"),
                UPLOAD("UPLOAD");


                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String value;

                public static final class a implements InterfaceC1162A<Variant> {

                    /* renamed from: a, reason: collision with root package name */
                    public static final a f15308a = new a();

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ pa.f f15309b;

                    static {
                        EnumDescriptor enumDescriptor = new EnumDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.ScreenShotPayload.Variant", 2);
                        enumDescriptor.k("SCREENSHOT", false);
                        enumDescriptor.k("UPLOAD", false);
                        f15309b = enumDescriptor;
                    }

                    @Override // na.InterfaceC1077a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Variant deserialize(InterfaceC1144d interfaceC1144d) {
                        return Variant.values()[interfaceC1144d.i(getDescriptor())];
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] childSerializers() {
                        return new InterfaceC1078b[]{m0.f26414a};
                    }

                    @Override // na.InterfaceC1081e, na.InterfaceC1077a
                    public pa.f getDescriptor() {
                        return f15309b;
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] typeParametersSerializers() {
                        return a0.f26382b;
                    }

                    @Override // na.InterfaceC1081e
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(InterfaceC1145e interfaceC1145e, Variant variant) {
                        interfaceC1145e.l(getDescriptor(), variant.ordinal());
                    }
                }

                /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$ScreenShotPayload$Variant$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final InterfaceC1078b<Variant> serializer() {
                        return a.f15308a;
                    }

                    public Companion() {
                    }
                }

                Variant(String str) {
                    this.value = str;
                }

                public final String getValue() {
                    return this.value;
                }
            }

            public static final class a implements InterfaceC1162A<ScreenShotPayload> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15310a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15311b;

                static {
                    a aVar = new a();
                    f15310a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.ScreenShotPayload", aVar, 5);
                    pluginGeneratedSerialDescriptor.k("type", true);
                    pluginGeneratedSerialDescriptor.k("idDocSubType", true);
                    pluginGeneratedSerialDescriptor.k("country", true);
                    pluginGeneratedSerialDescriptor.k("idDocSetType", true);
                    pluginGeneratedSerialDescriptor.k("variant", true);
                    f15311b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public ScreenShotPayload deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    Object obj = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else if (q10 == 0) {
                            obj = c2.D(descriptor, 0, m0.f26414a, obj);
                            i |= 1;
                        } else if (q10 == 1) {
                            obj2 = c2.D(descriptor, 1, m0.f26414a, obj2);
                            i |= 2;
                        } else if (q10 == 2) {
                            obj3 = c2.D(descriptor, 2, m0.f26414a, obj3);
                            i |= 4;
                        } else if (q10 == 3) {
                            obj4 = c2.D(descriptor, 3, m0.f26414a, obj4);
                            i |= 8;
                        } else {
                            if (q10 != 4) {
                                throw new UnknownFieldException(q10);
                            }
                            obj5 = c2.D(descriptor, 4, m0.f26414a, obj5);
                            i |= 16;
                        }
                    }
                    c2.b(descriptor);
                    return new ScreenShotPayload(i, (String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (i0) null);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    m0 m0Var = m0.f26414a;
                    return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var)};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15311b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, ScreenShotPayload screenShotPayload) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    ScreenShotPayload.a(screenShotPayload, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$ScreenShotPayload$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<ScreenShotPayload> serializer() {
                    return a.f15310a;
                }

                public Companion() {
                }
            }

            public static final class c implements Parcelable.Creator<ScreenShotPayload> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ScreenShotPayload createFromParcel(Parcel parcel) {
                    return new ScreenShotPayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ScreenShotPayload[] newArray(int i) {
                    return new ScreenShotPayload[i];
                }
            }

            public ScreenShotPayload() {
                this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
            }

            /* renamed from: a, reason: from getter */
            public final String getType() {
                return this.type;
            }

            /* renamed from: b, reason: from getter */
            public final String getIdDocSubType() {
                return this.idDocSubType;
            }

            /* renamed from: c, reason: from getter */
            public final String getCountry() {
                return this.country;
            }

            /* renamed from: d, reason: from getter */
            public final String getIdDocSetType() {
                return this.idDocSetType;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            /* renamed from: e, reason: from getter */
            public final String getVariant() {
                return this.variant;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ScreenShotPayload)) {
                    return false;
                }
                ScreenShotPayload screenShotPayload = (ScreenShotPayload) other;
                return kotlin.jvm.internal.f.b(this.type, screenShotPayload.type) && kotlin.jvm.internal.f.b(this.idDocSubType, screenShotPayload.idDocSubType) && kotlin.jvm.internal.f.b(this.country, screenShotPayload.country) && kotlin.jvm.internal.f.b(this.idDocSetType, screenShotPayload.idDocSetType) && kotlin.jvm.internal.f.b(this.variant, screenShotPayload.variant);
            }

            public final String f() {
                return this.country;
            }

            public final String h() {
                return this.idDocSetType;
            }

            public int hashCode() {
                String str = this.type;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.idDocSubType;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.country;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.idDocSetType;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.variant;
                return hashCode4 + (str5 != null ? str5.hashCode() : 0);
            }

            public final String j() {
                return this.idDocSubType;
            }

            public final String l() {
                return this.type;
            }

            public final String n() {
                return this.variant;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("ScreenShotPayload(type=");
                sb2.append(this.type);
                sb2.append(", idDocSubType=");
                sb2.append(this.idDocSubType);
                sb2.append(", country=");
                sb2.append(this.country);
                sb2.append(", idDocSetType=");
                sb2.append(this.idDocSetType);
                sb2.append(", variant=");
                return C.v.q(sb2, this.variant, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                parcel.writeString(this.type);
                parcel.writeString(this.idDocSubType);
                parcel.writeString(this.country);
                parcel.writeString(this.idDocSetType);
                parcel.writeString(this.variant);
            }

            public /* synthetic */ ScreenShotPayload(int i, String str, String str2, String str3, String str4, String str5, i0 i0Var) {
                if ((i & 1) == 0) {
                    this.type = "";
                } else {
                    this.type = str;
                }
                if ((i & 2) == 0) {
                    this.idDocSubType = "";
                } else {
                    this.idDocSubType = str2;
                }
                if ((i & 4) == 0) {
                    this.country = "";
                } else {
                    this.country = str3;
                }
                if ((i & 8) == 0) {
                    this.idDocSetType = "";
                } else {
                    this.idDocSetType = str4;
                }
                if ((i & 16) == 0) {
                    this.variant = "";
                } else {
                    this.variant = str5;
                }
            }

            public final ScreenShotPayload a(String type, String idDocSubType, String country, String idDocSetType, String variant) {
                return new ScreenShotPayload(type, idDocSubType, country, idDocSetType, variant);
            }

            public final void b(String str) {
                this.idDocSetType = str;
            }

            public final void c(String str) {
                this.idDocSubType = str;
            }

            public final void d(String str) {
                this.type = str;
            }

            public final void e(String str) {
                this.variant = str;
            }

            public ScreenShotPayload(String str, String str2, String str3, String str4, String str5) {
                this.type = str;
                this.idDocSubType = str2;
                this.country = str3;
                this.idDocSetType = str4;
                this.variant = str5;
            }

            public static /* synthetic */ ScreenShotPayload a(ScreenShotPayload screenShotPayload, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = screenShotPayload.type;
                }
                if ((i & 2) != 0) {
                    str2 = screenShotPayload.idDocSubType;
                }
                String str6 = str2;
                if ((i & 4) != 0) {
                    str3 = screenShotPayload.country;
                }
                String str7 = str3;
                if ((i & 8) != 0) {
                    str4 = screenShotPayload.idDocSetType;
                }
                String str8 = str4;
                if ((i & 16) != 0) {
                    str5 = screenShotPayload.variant;
                }
                return screenShotPayload.a(str, str6, str7, str8, str5);
            }

            public static final void a(ScreenShotPayload self, InterfaceC1143c output, pa.f serialDesc) {
                if (output.D() || !kotlin.jvm.internal.f.b(self.type, "")) {
                    output.e(serialDesc, 0, m0.f26414a, self.type);
                }
                if (output.D() || !kotlin.jvm.internal.f.b(self.idDocSubType, "")) {
                    output.e(serialDesc, 1, m0.f26414a, self.idDocSubType);
                }
                if (output.D() || !kotlin.jvm.internal.f.b(self.country, "")) {
                    output.e(serialDesc, 2, m0.f26414a, self.country);
                }
                if (output.D() || !kotlin.jvm.internal.f.b(self.idDocSetType, "")) {
                    output.e(serialDesc, 3, m0.f26414a, self.idDocSetType);
                }
                if (!output.D() && kotlin.jvm.internal.f.b(self.variant, "")) {
                    return;
                }
                output.e(serialDesc, 4, m0.f26414a, self.variant);
            }

            public /* synthetic */ ScreenShotPayload(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
            }

            public final void a(String str) {
                this.country = str;
            }

            public static /* synthetic */ void g() {
            }

            public static /* synthetic */ void i() {
            }

            public static /* synthetic */ void k() {
            }

            public static /* synthetic */ void m() {
            }

            public static /* synthetic */ void o() {
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0087\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;", "", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "b", "MODERATOR_NAME", "COMPLETED", "READY_FOR_SCREENSHOT", "MAKE_SCREENSHOT", "CANCEL_SCREENSHOT", "UPDATE_REQUIRED_ID_DOCS", "STEP_CHANGE", "VERIFY_MOBILE_PHONE_TAN", "CANCEL_VERIFY_MOBILE_PHONE_TAN", "APPLICANT_STATUS_CHANGE", "APPLICANT_ACTION_STATUS_CHANGE", "APPLICANT_LEVEL_CHANGE", "ADDED_ID_DOC", "WELCOME", "APPLICANT_IMAGE_REVIEWED", "APPLICANT_QUEUE_STATUS", "UNKNOWN", "EMPTY", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public enum Type {
            MODERATOR_NAME("moderatorName"),
            COMPLETED("completed"),
            READY_FOR_SCREENSHOT("readyForScreenshot"),
            MAKE_SCREENSHOT("makeScreenshot"),
            CANCEL_SCREENSHOT("cancelScreenshot"),
            UPDATE_REQUIRED_ID_DOCS("updateRequiredIdDocs"),
            STEP_CHANGE("stepChange"),
            VERIFY_MOBILE_PHONE_TAN("verifyMobilePhoneTan"),
            CANCEL_VERIFY_MOBILE_PHONE_TAN("cancelVerifyMobilePhoneTan"),
            APPLICANT_STATUS_CHANGE("applicantStatusChange"),
            APPLICANT_ACTION_STATUS_CHANGE("applicantActionStatusChange"),
            APPLICANT_LEVEL_CHANGE("applicantLevelChange"),
            ADDED_ID_DOC("addedIdDoc"),
            WELCOME("welcome"),
            APPLICANT_IMAGE_REVIEWED("applicantImageReviewed"),
            APPLICANT_QUEUE_STATUS("applicantQueueStatus"),
            UNKNOWN("unknown"),
            EMPTY("empty");


            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String type;

            public static final class a implements InterfaceC1162A<Type> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15312a = new a();

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15313b;

                static {
                    EnumDescriptor enumDescriptor = new EnumDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.Type", 18);
                    enumDescriptor.k("moderatorName", false);
                    enumDescriptor.k("completed", false);
                    enumDescriptor.k("readyForScreenshot", false);
                    enumDescriptor.k("makeScreenshot", false);
                    enumDescriptor.k("cancelScreenshot", false);
                    enumDescriptor.k("updateRequiredIdDocs", false);
                    enumDescriptor.k("stepChange", false);
                    enumDescriptor.k("verifyMobilePhoneTan", false);
                    enumDescriptor.k("cancelVerifyMobilePhoneTan", false);
                    enumDescriptor.k("applicantStatusChange", false);
                    enumDescriptor.k("applicantActionStatusChange", false);
                    enumDescriptor.k("applicantLevelChange", false);
                    enumDescriptor.k("addedIdDoc", false);
                    enumDescriptor.k("welcome", false);
                    enumDescriptor.k("applicantImageReviewed", false);
                    enumDescriptor.k("applicantQueueStatus", false);
                    enumDescriptor.k("unknown", false);
                    enumDescriptor.k("empty", false);
                    f15313b = enumDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public Type deserialize(InterfaceC1144d interfaceC1144d) {
                    return Type.values()[interfaceC1144d.i(getDescriptor())];
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{m0.f26414a};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15313b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, Type type) {
                    interfaceC1145e.l(getDescriptor(), type.ordinal());
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$Type$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<Type> serializer() {
                    return a.f15312a;
                }

                public Companion() {
                }
            }

            Type(String str) {
                this.type = str;
            }

            public final String getType() {
                return this.type;
            }
        }

        public static final class a implements InterfaceC1162A<ServerMessage> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f15314a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ pa.f f15315b;

            static {
                a aVar = new a();
                f15314a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage", aVar, 1);
                pluginGeneratedSerialDescriptor.k("type", false);
                f15315b = pluginGeneratedSerialDescriptor;
            }

            @Override // na.InterfaceC1077a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ServerMessage deserialize(InterfaceC1144d interfaceC1144d) {
                pa.f descriptor = getDescriptor();
                InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                i0 i0Var = null;
                boolean z10 = true;
                int i = 0;
                Object obj = null;
                while (z10) {
                    int q10 = c2.q(descriptor);
                    if (q10 == -1) {
                        z10 = false;
                    } else {
                        if (q10 != 0) {
                            throw new UnknownFieldException(q10);
                        }
                        obj = c2.C(descriptor, 0, Type.a.f15312a, obj);
                        i = 1;
                    }
                }
                c2.b(descriptor);
                return new ServerMessage(i, (Type) obj, i0Var);
            }

            @Override // ra.InterfaceC1162A
            public InterfaceC1078b<?>[] childSerializers() {
                return new InterfaceC1078b[]{Type.a.f15312a};
            }

            @Override // na.InterfaceC1081e, na.InterfaceC1077a
            public pa.f getDescriptor() {
                return f15315b;
            }

            @Override // ra.InterfaceC1162A
            public InterfaceC1078b<?>[] typeParametersSerializers() {
                return a0.f26382b;
            }

            @Override // na.InterfaceC1081e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(InterfaceC1145e interfaceC1145e, ServerMessage serverMessage) {
                pa.f descriptor = getDescriptor();
                InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                ServerMessage.a(serverMessage, c2, descriptor);
                c2.b(descriptor);
            }
        }

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0003\u0013\"\u0015B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006&"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$b;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$b$c;", "payload", "<init>", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$b$c;)V", "", "seen1", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;", "type", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$b$c;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$b;Lqa/c;Lpa/f;)V", "c", "()Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$b$c;", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$b$c;)Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$b$c;", "d", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final /* data */ class b extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final c payload;

            public static final class a implements InterfaceC1162A<b> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15317a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15318b;

                static {
                    a aVar = new a();
                    f15317a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.AddedIdDoc", aVar, 2);
                    pluginGeneratedSerialDescriptor.k("type", false);
                    pluginGeneratedSerialDescriptor.k("payload", true);
                    f15318b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public b deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    i0 i0Var = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj = null;
                    Object obj2 = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else if (q10 == 0) {
                            obj = c2.C(descriptor, 0, Type.a.f15312a, obj);
                            i |= 1;
                        } else {
                            if (q10 != 1) {
                                throw new UnknownFieldException(q10);
                            }
                            obj2 = c2.D(descriptor, 1, c.a.f15321a, obj2);
                            i |= 2;
                        }
                    }
                    c2.b(descriptor);
                    return new b(i, (Type) obj, (c) obj2, i0Var);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{Type.a.f15312a, C1095a.a(c.a.f15321a)};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15318b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, b bVar) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    b.a(bVar, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$b$b, reason: collision with other inner class name and from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<b> serializer() {
                    return a.f15317a;
                }

                public Companion() {
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002\u0012\u0015B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0014R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006%"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$b$c;", "", "", "imageId", "sessionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$b$c;Lqa/c;Lpa/f;)V", "()Ljava/lang/String;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$b$c;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "getImageId$annotations", "()V", "e", "getSessionId$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC1080d
            public static final /* data */ class c {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final String imageId;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final String sessionId;

                public static final class a implements InterfaceC1162A<c> {

                    /* renamed from: a, reason: collision with root package name */
                    public static final a f15321a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ pa.f f15322b;

                    static {
                        a aVar = new a();
                        f15321a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.AddedIdDoc.Payload", aVar, 2);
                        pluginGeneratedSerialDescriptor.k("imageId", true);
                        pluginGeneratedSerialDescriptor.k("sessionId", true);
                        f15322b = pluginGeneratedSerialDescriptor;
                    }

                    @Override // na.InterfaceC1077a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public c deserialize(InterfaceC1144d interfaceC1144d) {
                        pa.f descriptor = getDescriptor();
                        InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                        i0 i0Var = null;
                        boolean z10 = true;
                        int i = 0;
                        Object obj = null;
                        Object obj2 = null;
                        while (z10) {
                            int q10 = c2.q(descriptor);
                            if (q10 == -1) {
                                z10 = false;
                            } else if (q10 == 0) {
                                obj = c2.D(descriptor, 0, m0.f26414a, obj);
                                i |= 1;
                            } else {
                                if (q10 != 1) {
                                    throw new UnknownFieldException(q10);
                                }
                                obj2 = c2.D(descriptor, 1, m0.f26414a, obj2);
                                i |= 2;
                            }
                        }
                        c2.b(descriptor);
                        return new c(i, (String) obj, (String) obj2, i0Var);
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] childSerializers() {
                        m0 m0Var = m0.f26414a;
                        return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(m0Var)};
                    }

                    @Override // na.InterfaceC1081e, na.InterfaceC1077a
                    public pa.f getDescriptor() {
                        return f15322b;
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] typeParametersSerializers() {
                        return a0.f26382b;
                    }

                    @Override // na.InterfaceC1081e
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(InterfaceC1145e interfaceC1145e, c cVar) {
                        pa.f descriptor = getDescriptor();
                        InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                        c.a(cVar, c2, descriptor);
                        c2.b(descriptor);
                    }
                }

                /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$b$c$b, reason: collision with other inner class name and from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final InterfaceC1078b<c> serializer() {
                        return a.f15321a;
                    }

                    public Companion() {
                    }
                }

                public c() {
                    this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                /* renamed from: a, reason: from getter */
                public final String getImageId() {
                    return this.imageId;
                }

                /* renamed from: b, reason: from getter */
                public final String getSessionId() {
                    return this.sessionId;
                }

                public final String c() {
                    return this.imageId;
                }

                public final String e() {
                    return this.sessionId;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof c)) {
                        return false;
                    }
                    c cVar = (c) other;
                    return kotlin.jvm.internal.f.b(this.imageId, cVar.imageId) && kotlin.jvm.internal.f.b(this.sessionId, cVar.sessionId);
                }

                public int hashCode() {
                    String str = this.imageId;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.sessionId;
                    return hashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Payload(imageId=");
                    sb2.append(this.imageId);
                    sb2.append(", sessionId=");
                    return C.v.q(sb2, this.sessionId, ')');
                }

                public /* synthetic */ c(int i, String str, String str2, i0 i0Var) {
                    if ((i & 1) == 0) {
                        this.imageId = null;
                    } else {
                        this.imageId = str;
                    }
                    if ((i & 2) == 0) {
                        this.sessionId = null;
                    } else {
                        this.sessionId = str2;
                    }
                }

                public final c a(String imageId, String sessionId) {
                    return new c(imageId, sessionId);
                }

                public c(String str, String str2) {
                    this.imageId = str;
                    this.sessionId = str2;
                }

                public static /* synthetic */ c a(c cVar, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = cVar.imageId;
                    }
                    if ((i & 2) != 0) {
                        str2 = cVar.sessionId;
                    }
                    return cVar.a(str, str2);
                }

                public static final void a(c self, InterfaceC1143c output, pa.f serialDesc) {
                    if (output.D() || self.imageId != null) {
                        output.e(serialDesc, 0, m0.f26414a, self.imageId);
                    }
                    if (!output.D() && self.sessionId == null) {
                        return;
                    }
                    output.e(serialDesc, 1, m0.f26414a, self.sessionId);
                }

                public /* synthetic */ c(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
                }

                public static /* synthetic */ void d() {
                }

                public static /* synthetic */ void f() {
                }
            }

            public b() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final b a(c payload) {
                return new b(payload);
            }

            /* renamed from: c, reason: from getter */
            public final c getPayload() {
                return this.payload;
            }

            public final c d() {
                return this.payload;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof b) && kotlin.jvm.internal.f.b(this.payload, ((b) other).payload);
            }

            public int hashCode() {
                c cVar = this.payload;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            public String toString() {
                return "AddedIdDoc(payload=" + this.payload + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ b(int i, Type type, c cVar, i0 i0Var) {
                super(i, type, i0Var);
                if (1 != (i & 1)) {
                    a0.h(i, 1, a.f15317a.getDescriptor());
                    throw null;
                }
                if ((i & 2) == 0) {
                    this.payload = null;
                } else {
                    this.payload = cVar;
                }
            }

            public static /* synthetic */ b a(b bVar, c cVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    cVar = bVar.payload;
                }
                return bVar.a(cVar);
            }

            public /* synthetic */ b(c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : cVar);
            }

            public static final void a(b self, InterfaceC1143c output, pa.f serialDesc) {
                ServerMessage.a(self, output, serialDesc);
                if (!output.D() && self.payload == null) {
                    return;
                }
                output.e(serialDesc, 1, c.a.f15321a, self.payload);
            }

            public b(c cVar) {
                super(Type.ADDED_ID_DOC);
                this.payload = cVar;
            }
        }

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0003\u0013\"\u0015B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006&"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$c;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$c$c;", "payload", "<init>", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$c$c;)V", "", "seen1", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;", "type", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$c$c;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$c;Lqa/c;Lpa/f;)V", "c", "()Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$c$c;", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$c$c;)Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$c;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$c$c;", "d", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final /* data */ class c extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final C0204c payload;

            public static final class a implements InterfaceC1162A<c> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15324a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15325b;

                static {
                    a aVar = new a();
                    f15324a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.ApplicantActionStatusChange", aVar, 2);
                    pluginGeneratedSerialDescriptor.k("type", false);
                    pluginGeneratedSerialDescriptor.k("payload", true);
                    f15325b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public c deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    i0 i0Var = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj = null;
                    Object obj2 = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else if (q10 == 0) {
                            obj = c2.C(descriptor, 0, Type.a.f15312a, obj);
                            i |= 1;
                        } else {
                            if (q10 != 1) {
                                throw new UnknownFieldException(q10);
                            }
                            obj2 = c2.D(descriptor, 1, C0204c.a.f15329a, obj2);
                            i |= 2;
                        }
                    }
                    c2.b(descriptor);
                    return new c(i, (Type) obj, (C0204c) obj2, i0Var);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{Type.a.f15312a, C1095a.a(C0204c.a.f15329a)};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15325b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, c cVar) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    c.a(cVar, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$c$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<c> serializer() {
                    return a.f15324a;
                }

                public Companion() {
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002\u0013\u0016B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J4\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0015R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010 \u0012\u0004\b'\u0010#\u001a\u0004\b&\u0010\u0015¨\u0006)"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$c$c;", "", "", "sessionId", "status", "newToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$c$c;Lqa/c;Lpa/f;)V", "()Ljava/lang/String;", "b", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$c$c;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "getSessionId$annotations", "()V", "h", "getStatus$annotations", "d", "getNewToken$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC1080d
            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$c$c, reason: collision with other inner class name */
            public static final /* data */ class C0204c {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final String sessionId;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final String status;

                /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                public final String newToken;

                /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$c$c$a */
                public static final class a implements InterfaceC1162A<C0204c> {

                    /* renamed from: a, reason: collision with root package name */
                    public static final a f15329a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ pa.f f15330b;

                    static {
                        a aVar = new a();
                        f15329a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.ApplicantActionStatusChange.Payload", aVar, 3);
                        pluginGeneratedSerialDescriptor.k("sessionId", true);
                        pluginGeneratedSerialDescriptor.k("status", true);
                        pluginGeneratedSerialDescriptor.k("newToken", true);
                        f15330b = pluginGeneratedSerialDescriptor;
                    }

                    @Override // na.InterfaceC1077a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public C0204c deserialize(InterfaceC1144d interfaceC1144d) {
                        pa.f descriptor = getDescriptor();
                        InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                        Object obj = null;
                        boolean z10 = true;
                        int i = 0;
                        Object obj2 = null;
                        Object obj3 = null;
                        while (z10) {
                            int q10 = c2.q(descriptor);
                            if (q10 == -1) {
                                z10 = false;
                            } else if (q10 == 0) {
                                obj = c2.D(descriptor, 0, m0.f26414a, obj);
                                i |= 1;
                            } else if (q10 == 1) {
                                obj2 = c2.D(descriptor, 1, m0.f26414a, obj2);
                                i |= 2;
                            } else {
                                if (q10 != 2) {
                                    throw new UnknownFieldException(q10);
                                }
                                obj3 = c2.D(descriptor, 2, m0.f26414a, obj3);
                                i |= 4;
                            }
                        }
                        c2.b(descriptor);
                        return new C0204c(i, (String) obj, (String) obj2, (String) obj3, (i0) null);
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] childSerializers() {
                        m0 m0Var = m0.f26414a;
                        return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var)};
                    }

                    @Override // na.InterfaceC1081e, na.InterfaceC1077a
                    public pa.f getDescriptor() {
                        return f15330b;
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] typeParametersSerializers() {
                        return a0.f26382b;
                    }

                    @Override // na.InterfaceC1081e
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(InterfaceC1145e interfaceC1145e, C0204c c0204c) {
                        pa.f descriptor = getDescriptor();
                        InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                        C0204c.a(c0204c, c2, descriptor);
                        c2.b(descriptor);
                    }
                }

                /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$c$c$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final InterfaceC1078b<C0204c> serializer() {
                        return a.f15329a;
                    }

                    public Companion() {
                    }
                }

                public C0204c() {
                    this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
                }

                /* renamed from: a, reason: from getter */
                public final String getSessionId() {
                    return this.sessionId;
                }

                /* renamed from: b, reason: from getter */
                public final String getStatus() {
                    return this.status;
                }

                /* renamed from: c, reason: from getter */
                public final String getNewToken() {
                    return this.newToken;
                }

                public final String d() {
                    return this.newToken;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof C0204c)) {
                        return false;
                    }
                    C0204c c0204c = (C0204c) other;
                    return kotlin.jvm.internal.f.b(this.sessionId, c0204c.sessionId) && kotlin.jvm.internal.f.b(this.status, c0204c.status) && kotlin.jvm.internal.f.b(this.newToken, c0204c.newToken);
                }

                public final String f() {
                    return this.sessionId;
                }

                public final String h() {
                    return this.status;
                }

                public int hashCode() {
                    String str = this.sessionId;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.status;
                    int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.newToken;
                    return hashCode2 + (str3 != null ? str3.hashCode() : 0);
                }

                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Payload(sessionId=");
                    sb2.append(this.sessionId);
                    sb2.append(", status=");
                    sb2.append(this.status);
                    sb2.append(", newToken=");
                    return C.v.q(sb2, this.newToken, ')');
                }

                public /* synthetic */ C0204c(int i, String str, String str2, String str3, i0 i0Var) {
                    if ((i & 1) == 0) {
                        this.sessionId = null;
                    } else {
                        this.sessionId = str;
                    }
                    if ((i & 2) == 0) {
                        this.status = null;
                    } else {
                        this.status = str2;
                    }
                    if ((i & 4) == 0) {
                        this.newToken = null;
                    } else {
                        this.newToken = str3;
                    }
                }

                public final C0204c a(String sessionId, String status, String newToken) {
                    return new C0204c(sessionId, status, newToken);
                }

                public C0204c(String str, String str2, String str3) {
                    this.sessionId = str;
                    this.status = str2;
                    this.newToken = str3;
                }

                public static /* synthetic */ C0204c a(C0204c c0204c, String str, String str2, String str3, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = c0204c.sessionId;
                    }
                    if ((i & 2) != 0) {
                        str2 = c0204c.status;
                    }
                    if ((i & 4) != 0) {
                        str3 = c0204c.newToken;
                    }
                    return c0204c.a(str, str2, str3);
                }

                public static final void a(C0204c self, InterfaceC1143c output, pa.f serialDesc) {
                    if (output.D() || self.sessionId != null) {
                        output.e(serialDesc, 0, m0.f26414a, self.sessionId);
                    }
                    if (output.D() || self.status != null) {
                        output.e(serialDesc, 1, m0.f26414a, self.status);
                    }
                    if (!output.D() && self.newToken == null) {
                        return;
                    }
                    output.e(serialDesc, 2, m0.f26414a, self.newToken);
                }

                public /* synthetic */ C0204c(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
                }

                public static /* synthetic */ void e() {
                }

                public static /* synthetic */ void g() {
                }

                public static /* synthetic */ void i() {
                }
            }

            public c() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final c a(C0204c payload) {
                return new c(payload);
            }

            /* renamed from: c, reason: from getter */
            public final C0204c getPayload() {
                return this.payload;
            }

            public final C0204c d() {
                return this.payload;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof c) && kotlin.jvm.internal.f.b(this.payload, ((c) other).payload);
            }

            public int hashCode() {
                C0204c c0204c = this.payload;
                if (c0204c == null) {
                    return 0;
                }
                return c0204c.hashCode();
            }

            public String toString() {
                return "ApplicantActionStatusChange(payload=" + this.payload + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ c(int i, Type type, C0204c c0204c, i0 i0Var) {
                super(i, type, i0Var);
                if (1 != (i & 1)) {
                    a0.h(i, 1, a.f15324a.getDescriptor());
                    throw null;
                }
                if ((i & 2) == 0) {
                    this.payload = null;
                } else {
                    this.payload = c0204c;
                }
            }

            public static /* synthetic */ c a(c cVar, C0204c c0204c, int i, Object obj) {
                if ((i & 1) != 0) {
                    c0204c = cVar.payload;
                }
                return cVar.a(c0204c);
            }

            public /* synthetic */ c(C0204c c0204c, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : c0204c);
            }

            public static final void a(c self, InterfaceC1143c output, pa.f serialDesc) {
                ServerMessage.a(self, output, serialDesc);
                if (!output.D() && self.payload == null) {
                    return;
                }
                output.e(serialDesc, 1, C0204c.a.f15329a, self.payload);
            }

            public c(C0204c c0204c) {
                super(Type.APPLICANT_ACTION_STATUS_CHANGE);
                this.payload = c0204c;
            }
        }

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0003\u0013\"\u0015B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006&"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$d;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$d$c;", "payload", "<init>", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$d$c;)V", "", "seen1", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;", "type", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$d$c;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$d;Lqa/c;Lpa/f;)V", "c", "()Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$d$c;", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$d$c;)Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$d;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$d$c;", "d", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final /* data */ class d extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final c payload;

            public static final class a implements InterfaceC1162A<d> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15332a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15333b;

                static {
                    a aVar = new a();
                    f15332a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.ApplicantImageReviewed", aVar, 2);
                    pluginGeneratedSerialDescriptor.k("type", false);
                    pluginGeneratedSerialDescriptor.k("payload", true);
                    f15333b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public d deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    i0 i0Var = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj = null;
                    Object obj2 = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else if (q10 == 0) {
                            obj = c2.C(descriptor, 0, Type.a.f15312a, obj);
                            i |= 1;
                        } else {
                            if (q10 != 1) {
                                throw new UnknownFieldException(q10);
                            }
                            obj2 = c2.D(descriptor, 1, c.a.f15336a, obj2);
                            i |= 2;
                        }
                    }
                    c2.b(descriptor);
                    return new d(i, (Type) obj, (c) obj2, i0Var);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{Type.a.f15312a, C1095a.a(c.a.f15336a)};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15333b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, d dVar) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    d.a(dVar, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$d$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<d> serializer() {
                    return a.f15332a;
                }

                public Companion() {
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002\u0012\u0015B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0014R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006%"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$d$c;", "", "", "newToken", "sessionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$d$c;Lqa/c;Lpa/f;)V", "()Ljava/lang/String;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$d$c;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "getNewToken$annotations", "()V", "e", "getSessionId$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC1080d
            public static final /* data */ class c {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final String newToken;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final String sessionId;

                public static final class a implements InterfaceC1162A<c> {

                    /* renamed from: a, reason: collision with root package name */
                    public static final a f15336a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ pa.f f15337b;

                    static {
                        a aVar = new a();
                        f15336a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.ApplicantImageReviewed.Payload", aVar, 2);
                        pluginGeneratedSerialDescriptor.k("newToken", true);
                        pluginGeneratedSerialDescriptor.k("sessionId", true);
                        f15337b = pluginGeneratedSerialDescriptor;
                    }

                    @Override // na.InterfaceC1077a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public c deserialize(InterfaceC1144d interfaceC1144d) {
                        pa.f descriptor = getDescriptor();
                        InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                        i0 i0Var = null;
                        boolean z10 = true;
                        int i = 0;
                        Object obj = null;
                        Object obj2 = null;
                        while (z10) {
                            int q10 = c2.q(descriptor);
                            if (q10 == -1) {
                                z10 = false;
                            } else if (q10 == 0) {
                                obj = c2.D(descriptor, 0, m0.f26414a, obj);
                                i |= 1;
                            } else {
                                if (q10 != 1) {
                                    throw new UnknownFieldException(q10);
                                }
                                obj2 = c2.D(descriptor, 1, m0.f26414a, obj2);
                                i |= 2;
                            }
                        }
                        c2.b(descriptor);
                        return new c(i, (String) obj, (String) obj2, i0Var);
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] childSerializers() {
                        m0 m0Var = m0.f26414a;
                        return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(m0Var)};
                    }

                    @Override // na.InterfaceC1081e, na.InterfaceC1077a
                    public pa.f getDescriptor() {
                        return f15337b;
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] typeParametersSerializers() {
                        return a0.f26382b;
                    }

                    @Override // na.InterfaceC1081e
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(InterfaceC1145e interfaceC1145e, c cVar) {
                        pa.f descriptor = getDescriptor();
                        InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                        c.a(cVar, c2, descriptor);
                        c2.b(descriptor);
                    }
                }

                /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$d$c$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final InterfaceC1078b<c> serializer() {
                        return a.f15336a;
                    }

                    public Companion() {
                    }
                }

                public c() {
                    this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                /* renamed from: a, reason: from getter */
                public final String getNewToken() {
                    return this.newToken;
                }

                /* renamed from: b, reason: from getter */
                public final String getSessionId() {
                    return this.sessionId;
                }

                public final String c() {
                    return this.newToken;
                }

                public final String e() {
                    return this.sessionId;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof c)) {
                        return false;
                    }
                    c cVar = (c) other;
                    return kotlin.jvm.internal.f.b(this.newToken, cVar.newToken) && kotlin.jvm.internal.f.b(this.sessionId, cVar.sessionId);
                }

                public int hashCode() {
                    String str = this.newToken;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.sessionId;
                    return hashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Payload(newToken=");
                    sb2.append(this.newToken);
                    sb2.append(", sessionId=");
                    return C.v.q(sb2, this.sessionId, ')');
                }

                public /* synthetic */ c(int i, String str, String str2, i0 i0Var) {
                    if ((i & 1) == 0) {
                        this.newToken = null;
                    } else {
                        this.newToken = str;
                    }
                    if ((i & 2) == 0) {
                        this.sessionId = null;
                    } else {
                        this.sessionId = str2;
                    }
                }

                public final c a(String newToken, String sessionId) {
                    return new c(newToken, sessionId);
                }

                public c(String str, String str2) {
                    this.newToken = str;
                    this.sessionId = str2;
                }

                public static /* synthetic */ c a(c cVar, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = cVar.newToken;
                    }
                    if ((i & 2) != 0) {
                        str2 = cVar.sessionId;
                    }
                    return cVar.a(str, str2);
                }

                public static final void a(c self, InterfaceC1143c output, pa.f serialDesc) {
                    if (output.D() || self.newToken != null) {
                        output.e(serialDesc, 0, m0.f26414a, self.newToken);
                    }
                    if (!output.D() && self.sessionId == null) {
                        return;
                    }
                    output.e(serialDesc, 1, m0.f26414a, self.sessionId);
                }

                public /* synthetic */ c(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
                }

                public static /* synthetic */ void d() {
                }

                public static /* synthetic */ void f() {
                }
            }

            public d() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final d a(c payload) {
                return new d(payload);
            }

            /* renamed from: c, reason: from getter */
            public final c getPayload() {
                return this.payload;
            }

            public final c d() {
                return this.payload;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof d) && kotlin.jvm.internal.f.b(this.payload, ((d) other).payload);
            }

            public int hashCode() {
                c cVar = this.payload;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            public String toString() {
                return "ApplicantImageReviewed(payload=" + this.payload + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ d(int i, Type type, c cVar, i0 i0Var) {
                super(i, type, i0Var);
                if (1 != (i & 1)) {
                    a0.h(i, 1, a.f15332a.getDescriptor());
                    throw null;
                }
                if ((i & 2) == 0) {
                    this.payload = null;
                } else {
                    this.payload = cVar;
                }
            }

            public static /* synthetic */ d a(d dVar, c cVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    cVar = dVar.payload;
                }
                return dVar.a(cVar);
            }

            public /* synthetic */ d(c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : cVar);
            }

            public static final void a(d self, InterfaceC1143c output, pa.f serialDesc) {
                ServerMessage.a(self, output, serialDesc);
                if (!output.D() && self.payload == null) {
                    return;
                }
                output.e(serialDesc, 1, c.a.f15336a, self.payload);
            }

            public d(c cVar) {
                super(Type.APPLICANT_IMAGE_REVIEWED);
                this.payload = cVar;
            }
        }

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0003\u0013\"\u0015B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006&"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$e;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$e$c;", "payload", "<init>", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$e$c;)V", "", "seen1", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;", "type", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$e$c;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$e;Lqa/c;Lpa/f;)V", "c", "()Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$e$c;", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$e$c;)Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$e;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$e$c;", "d", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final /* data */ class e extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final c payload;

            public static final class a implements InterfaceC1162A<e> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15339a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15340b;

                static {
                    a aVar = new a();
                    f15339a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.ApplicantLevelChange", aVar, 2);
                    pluginGeneratedSerialDescriptor.k("type", false);
                    pluginGeneratedSerialDescriptor.k("payload", true);
                    f15340b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public e deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    i0 i0Var = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj = null;
                    Object obj2 = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else if (q10 == 0) {
                            obj = c2.C(descriptor, 0, Type.a.f15312a, obj);
                            i |= 1;
                        } else {
                            if (q10 != 1) {
                                throw new UnknownFieldException(q10);
                            }
                            obj2 = c2.D(descriptor, 1, c.a.f15343a, obj2);
                            i |= 2;
                        }
                    }
                    c2.b(descriptor);
                    return new e(i, (Type) obj, (c) obj2, i0Var);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{Type.a.f15312a, C1095a.a(c.a.f15343a)};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15340b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, e eVar) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    e.a(eVar, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$e$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<e> serializer() {
                    return a.f15339a;
                }

                public Companion() {
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002\u0012\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0014R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006%"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$e$c;", "", "", "levelName", "newToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$e$c;Lqa/c;Lpa/f;)V", "()Ljava/lang/String;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$e$c;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "getLevelName$annotations", "()V", "e", "getNewToken$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC1080d
            public static final /* data */ class c {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final String levelName;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final String newToken;

                public static final class a implements InterfaceC1162A<c> {

                    /* renamed from: a, reason: collision with root package name */
                    public static final a f15343a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ pa.f f15344b;

                    static {
                        a aVar = new a();
                        f15343a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.ApplicantLevelChange.Payload", aVar, 2);
                        pluginGeneratedSerialDescriptor.k("levelName", true);
                        pluginGeneratedSerialDescriptor.k("newToken", false);
                        f15344b = pluginGeneratedSerialDescriptor;
                    }

                    @Override // na.InterfaceC1077a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public c deserialize(InterfaceC1144d interfaceC1144d) {
                        pa.f descriptor = getDescriptor();
                        InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                        i0 i0Var = null;
                        boolean z10 = true;
                        int i = 0;
                        Object obj = null;
                        Object obj2 = null;
                        while (z10) {
                            int q10 = c2.q(descriptor);
                            if (q10 == -1) {
                                z10 = false;
                            } else if (q10 == 0) {
                                obj = c2.D(descriptor, 0, m0.f26414a, obj);
                                i |= 1;
                            } else {
                                if (q10 != 1) {
                                    throw new UnknownFieldException(q10);
                                }
                                obj2 = c2.D(descriptor, 1, m0.f26414a, obj2);
                                i |= 2;
                            }
                        }
                        c2.b(descriptor);
                        return new c(i, (String) obj, (String) obj2, i0Var);
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] childSerializers() {
                        m0 m0Var = m0.f26414a;
                        return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(m0Var)};
                    }

                    @Override // na.InterfaceC1081e, na.InterfaceC1077a
                    public pa.f getDescriptor() {
                        return f15344b;
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] typeParametersSerializers() {
                        return a0.f26382b;
                    }

                    @Override // na.InterfaceC1081e
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(InterfaceC1145e interfaceC1145e, c cVar) {
                        pa.f descriptor = getDescriptor();
                        InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                        c.a(cVar, c2, descriptor);
                        c2.b(descriptor);
                    }
                }

                /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$e$c$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final InterfaceC1078b<c> serializer() {
                        return a.f15343a;
                    }

                    public Companion() {
                    }
                }

                public /* synthetic */ c(int i, String str, String str2, i0 i0Var) {
                    if (2 != (i & 2)) {
                        a0.h(i, 2, a.f15343a.getDescriptor());
                        throw null;
                    }
                    if ((i & 1) == 0) {
                        this.levelName = null;
                    } else {
                        this.levelName = str;
                    }
                    this.newToken = str2;
                }

                /* renamed from: a, reason: from getter */
                public final String getLevelName() {
                    return this.levelName;
                }

                /* renamed from: b, reason: from getter */
                public final String getNewToken() {
                    return this.newToken;
                }

                public final String c() {
                    return this.levelName;
                }

                public final String e() {
                    return this.newToken;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof c)) {
                        return false;
                    }
                    c cVar = (c) other;
                    return kotlin.jvm.internal.f.b(this.levelName, cVar.levelName) && kotlin.jvm.internal.f.b(this.newToken, cVar.newToken);
                }

                public int hashCode() {
                    String str = this.levelName;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.newToken;
                    return hashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Payload(levelName=");
                    sb2.append(this.levelName);
                    sb2.append(", newToken=");
                    return C.v.q(sb2, this.newToken, ')');
                }

                public c(String str, String str2) {
                    this.levelName = str;
                    this.newToken = str2;
                }

                public final c a(String levelName, String newToken) {
                    return new c(levelName, newToken);
                }

                public static /* synthetic */ c a(c cVar, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = cVar.levelName;
                    }
                    if ((i & 2) != 0) {
                        str2 = cVar.newToken;
                    }
                    return cVar.a(str, str2);
                }

                public static final void a(c self, InterfaceC1143c output, pa.f serialDesc) {
                    if (output.D() || self.levelName != null) {
                        output.e(serialDesc, 0, m0.f26414a, self.levelName);
                    }
                    output.e(serialDesc, 1, m0.f26414a, self.newToken);
                }

                public /* synthetic */ c(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, str2);
                }

                public static /* synthetic */ void d() {
                }

                public static /* synthetic */ void f() {
                }
            }

            public e() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final e a(c payload) {
                return new e(payload);
            }

            /* renamed from: c, reason: from getter */
            public final c getPayload() {
                return this.payload;
            }

            public final c d() {
                return this.payload;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof e) && kotlin.jvm.internal.f.b(this.payload, ((e) other).payload);
            }

            public int hashCode() {
                c cVar = this.payload;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            public String toString() {
                return "ApplicantLevelChange(payload=" + this.payload + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ e(int i, Type type, c cVar, i0 i0Var) {
                super(i, type, i0Var);
                if (1 != (i & 1)) {
                    a0.h(i, 1, a.f15339a.getDescriptor());
                    throw null;
                }
                if ((i & 2) == 0) {
                    this.payload = null;
                } else {
                    this.payload = cVar;
                }
            }

            public static /* synthetic */ e a(e eVar, c cVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    cVar = eVar.payload;
                }
                return eVar.a(cVar);
            }

            public /* synthetic */ e(c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : cVar);
            }

            public static final void a(e self, InterfaceC1143c output, pa.f serialDesc) {
                ServerMessage.a(self, output, serialDesc);
                if (!output.D() && self.payload == null) {
                    return;
                }
                output.e(serialDesc, 1, c.a.f15343a, self.payload);
            }

            public e(c cVar) {
                super(Type.APPLICANT_LEVEL_CHANGE);
                this.payload = cVar;
            }
        }

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0003\u0013\"\u0015B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006&"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$f;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$f$c;", "payload", "<init>", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$f$c;)V", "", "seen1", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;", "type", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$f$c;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$f;Lqa/c;Lpa/f;)V", "c", "()Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$f$c;", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$f$c;)Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$f;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$f$c;", "d", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final /* data */ class f extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final c payload;

            public static final class a implements InterfaceC1162A<f> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15346a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15347b;

                static {
                    a aVar = new a();
                    f15346a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.ApplicantQueueStatus", aVar, 2);
                    pluginGeneratedSerialDescriptor.k("type", false);
                    pluginGeneratedSerialDescriptor.k("payload", true);
                    f15347b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public f deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    i0 i0Var = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj = null;
                    Object obj2 = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else if (q10 == 0) {
                            obj = c2.C(descriptor, 0, Type.a.f15312a, obj);
                            i |= 1;
                        } else {
                            if (q10 != 1) {
                                throw new UnknownFieldException(q10);
                            }
                            obj2 = c2.D(descriptor, 1, c.a.f15350a, obj2);
                            i |= 2;
                        }
                    }
                    c2.b(descriptor);
                    return new f(i, (Type) obj, (c) obj2, i0Var);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{Type.a.f15312a, C1095a.a(c.a.f15350a)};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15347b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, f fVar) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    f.a(fVar, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$f$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<f> serializer() {
                    return a.f15346a;
                }

                public Companion() {
                }
            }

            @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002\u0012\u0015B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0014R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0014¨\u0006'"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$f$c;", "", "", "waitTimeSec", "queuePlace", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/Long;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$f$c;Lqa/c;Lpa/f;)V", "()Ljava/lang/Long;", "b", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$f$c;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "e", "getWaitTimeSec$annotations", "()V", "c", "getQueuePlace$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC1080d
            public static final /* data */ class c {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final Long waitTimeSec;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final Long queuePlace;

                public static final class a implements InterfaceC1162A<c> {

                    /* renamed from: a, reason: collision with root package name */
                    public static final a f15350a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ pa.f f15351b;

                    static {
                        a aVar = new a();
                        f15350a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.ApplicantQueueStatus.Payload", aVar, 2);
                        pluginGeneratedSerialDescriptor.k("waitTimeSec", true);
                        pluginGeneratedSerialDescriptor.k("queuePlace", true);
                        f15351b = pluginGeneratedSerialDescriptor;
                    }

                    @Override // na.InterfaceC1077a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public c deserialize(InterfaceC1144d interfaceC1144d) {
                        pa.f descriptor = getDescriptor();
                        InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                        i0 i0Var = null;
                        boolean z10 = true;
                        int i = 0;
                        Object obj = null;
                        Object obj2 = null;
                        while (z10) {
                            int q10 = c2.q(descriptor);
                            if (q10 == -1) {
                                z10 = false;
                            } else if (q10 == 0) {
                                obj = c2.D(descriptor, 0, O.f26364a, obj);
                                i |= 1;
                            } else {
                                if (q10 != 1) {
                                    throw new UnknownFieldException(q10);
                                }
                                obj2 = c2.D(descriptor, 1, O.f26364a, obj2);
                                i |= 2;
                            }
                        }
                        c2.b(descriptor);
                        return new c(i, (Long) obj, (Long) obj2, i0Var);
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] childSerializers() {
                        O o10 = O.f26364a;
                        return new InterfaceC1078b[]{C1095a.a(o10), C1095a.a(o10)};
                    }

                    @Override // na.InterfaceC1081e, na.InterfaceC1077a
                    public pa.f getDescriptor() {
                        return f15351b;
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] typeParametersSerializers() {
                        return a0.f26382b;
                    }

                    @Override // na.InterfaceC1081e
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(InterfaceC1145e interfaceC1145e, c cVar) {
                        pa.f descriptor = getDescriptor();
                        InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                        c.a(cVar, c2, descriptor);
                        c2.b(descriptor);
                    }
                }

                /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$f$c$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final InterfaceC1078b<c> serializer() {
                        return a.f15350a;
                    }

                    public Companion() {
                    }
                }

                public c() {
                    this((Long) null, (Long) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                /* renamed from: a, reason: from getter */
                public final Long getWaitTimeSec() {
                    return this.waitTimeSec;
                }

                /* renamed from: b, reason: from getter */
                public final Long getQueuePlace() {
                    return this.queuePlace;
                }

                public final Long c() {
                    return this.queuePlace;
                }

                public final Long e() {
                    return this.waitTimeSec;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof c)) {
                        return false;
                    }
                    c cVar = (c) other;
                    return kotlin.jvm.internal.f.b(this.waitTimeSec, cVar.waitTimeSec) && kotlin.jvm.internal.f.b(this.queuePlace, cVar.queuePlace);
                }

                public int hashCode() {
                    Long l10 = this.waitTimeSec;
                    int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
                    Long l11 = this.queuePlace;
                    return hashCode + (l11 != null ? l11.hashCode() : 0);
                }

                public String toString() {
                    return "Payload(waitTimeSec=" + this.waitTimeSec + ", queuePlace=" + this.queuePlace + ')';
                }

                public /* synthetic */ c(int i, Long l10, Long l11, i0 i0Var) {
                    if ((i & 1) == 0) {
                        this.waitTimeSec = null;
                    } else {
                        this.waitTimeSec = l10;
                    }
                    if ((i & 2) == 0) {
                        this.queuePlace = null;
                    } else {
                        this.queuePlace = l11;
                    }
                }

                public final c a(Long waitTimeSec, Long queuePlace) {
                    return new c(waitTimeSec, queuePlace);
                }

                public c(Long l10, Long l11) {
                    this.waitTimeSec = l10;
                    this.queuePlace = l11;
                }

                public static /* synthetic */ c a(c cVar, Long l10, Long l11, int i, Object obj) {
                    if ((i & 1) != 0) {
                        l10 = cVar.waitTimeSec;
                    }
                    if ((i & 2) != 0) {
                        l11 = cVar.queuePlace;
                    }
                    return cVar.a(l10, l11);
                }

                public static final void a(c self, InterfaceC1143c output, pa.f serialDesc) {
                    if (output.D() || self.waitTimeSec != null) {
                        output.e(serialDesc, 0, O.f26364a, self.waitTimeSec);
                    }
                    if (!output.D() && self.queuePlace == null) {
                        return;
                    }
                    output.e(serialDesc, 1, O.f26364a, self.queuePlace);
                }

                public /* synthetic */ c(Long l10, Long l11, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : l10, (i & 2) != 0 ? null : l11);
                }

                public static /* synthetic */ void d() {
                }

                public static /* synthetic */ void f() {
                }
            }

            public f() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final f a(c payload) {
                return new f(payload);
            }

            /* renamed from: c, reason: from getter */
            public final c getPayload() {
                return this.payload;
            }

            public final c d() {
                return this.payload;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof f) && kotlin.jvm.internal.f.b(this.payload, ((f) other).payload);
            }

            public int hashCode() {
                c cVar = this.payload;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            public String toString() {
                return "ApplicantQueueStatus(payload=" + this.payload + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ f(int i, Type type, c cVar, i0 i0Var) {
                super(i, type, i0Var);
                if (1 != (i & 1)) {
                    a0.h(i, 1, a.f15346a.getDescriptor());
                    throw null;
                }
                if ((i & 2) == 0) {
                    this.payload = null;
                } else {
                    this.payload = cVar;
                }
            }

            public static /* synthetic */ f a(f fVar, c cVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    cVar = fVar.payload;
                }
                return fVar.a(cVar);
            }

            public /* synthetic */ f(c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : cVar);
            }

            public static final void a(f self, InterfaceC1143c output, pa.f serialDesc) {
                ServerMessage.a(self, output, serialDesc);
                if (!output.D() && self.payload == null) {
                    return;
                }
                output.e(serialDesc, 1, c.a.f15350a, self.payload);
            }

            public f(c cVar) {
                super(Type.APPLICANT_QUEUE_STATUS);
                this.payload = cVar;
            }
        }

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0003\u0013\"\u0015B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006&"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$g;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$g$c;", "payload", "<init>", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$g$c;)V", "", "seen1", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;", "type", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$g$c;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$g;Lqa/c;Lpa/f;)V", "c", "()Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$g$c;", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$g$c;)Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$g;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$g$c;", "d", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final /* data */ class g extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final c payload;

            public static final class a implements InterfaceC1162A<g> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15353a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15354b;

                static {
                    a aVar = new a();
                    f15353a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.ApplicantStatusChange", aVar, 2);
                    pluginGeneratedSerialDescriptor.k("type", false);
                    pluginGeneratedSerialDescriptor.k("payload", true);
                    f15354b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public g deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    i0 i0Var = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj = null;
                    Object obj2 = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else if (q10 == 0) {
                            obj = c2.C(descriptor, 0, Type.a.f15312a, obj);
                            i |= 1;
                        } else {
                            if (q10 != 1) {
                                throw new UnknownFieldException(q10);
                            }
                            obj2 = c2.D(descriptor, 1, c.a.f15358a, obj2);
                            i |= 2;
                        }
                    }
                    c2.b(descriptor);
                    return new g(i, (Type) obj, (c) obj2, i0Var);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{Type.a.f15312a, C1095a.a(c.a.f15358a)};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15354b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, g gVar) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    g.a(gVar, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$g$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<g> serializer() {
                    return a.f15353a;
                }

                public Companion() {
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002\u0013\u0016B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J4\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0015R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010 \u0012\u0004\b'\u0010#\u001a\u0004\b&\u0010\u0015¨\u0006)"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$g$c;", "", "", "sessionId", "status", "newToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$g$c;Lqa/c;Lpa/f;)V", "()Ljava/lang/String;", "b", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$g$c;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "getSessionId$annotations", "()V", "h", "getStatus$annotations", "d", "getNewToken$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC1080d
            public static final /* data */ class c {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final String sessionId;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final String status;

                /* renamed from: c, reason: collision with root package name and from kotlin metadata */
                public final String newToken;

                public static final class a implements InterfaceC1162A<c> {

                    /* renamed from: a, reason: collision with root package name */
                    public static final a f15358a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ pa.f f15359b;

                    static {
                        a aVar = new a();
                        f15358a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.ApplicantStatusChange.Payload", aVar, 3);
                        pluginGeneratedSerialDescriptor.k("sessionId", true);
                        pluginGeneratedSerialDescriptor.k("status", true);
                        pluginGeneratedSerialDescriptor.k("newToken", true);
                        f15359b = pluginGeneratedSerialDescriptor;
                    }

                    @Override // na.InterfaceC1077a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public c deserialize(InterfaceC1144d interfaceC1144d) {
                        pa.f descriptor = getDescriptor();
                        InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                        Object obj = null;
                        boolean z10 = true;
                        int i = 0;
                        Object obj2 = null;
                        Object obj3 = null;
                        while (z10) {
                            int q10 = c2.q(descriptor);
                            if (q10 == -1) {
                                z10 = false;
                            } else if (q10 == 0) {
                                obj = c2.D(descriptor, 0, m0.f26414a, obj);
                                i |= 1;
                            } else if (q10 == 1) {
                                obj2 = c2.D(descriptor, 1, m0.f26414a, obj2);
                                i |= 2;
                            } else {
                                if (q10 != 2) {
                                    throw new UnknownFieldException(q10);
                                }
                                obj3 = c2.D(descriptor, 2, m0.f26414a, obj3);
                                i |= 4;
                            }
                        }
                        c2.b(descriptor);
                        return new c(i, (String) obj, (String) obj2, (String) obj3, (i0) null);
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] childSerializers() {
                        m0 m0Var = m0.f26414a;
                        return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var)};
                    }

                    @Override // na.InterfaceC1081e, na.InterfaceC1077a
                    public pa.f getDescriptor() {
                        return f15359b;
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] typeParametersSerializers() {
                        return a0.f26382b;
                    }

                    @Override // na.InterfaceC1081e
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(InterfaceC1145e interfaceC1145e, c cVar) {
                        pa.f descriptor = getDescriptor();
                        InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                        c.a(cVar, c2, descriptor);
                        c2.b(descriptor);
                    }
                }

                /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$g$c$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final InterfaceC1078b<c> serializer() {
                        return a.f15358a;
                    }

                    public Companion() {
                    }
                }

                public c() {
                    this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
                }

                /* renamed from: a, reason: from getter */
                public final String getSessionId() {
                    return this.sessionId;
                }

                /* renamed from: b, reason: from getter */
                public final String getStatus() {
                    return this.status;
                }

                /* renamed from: c, reason: from getter */
                public final String getNewToken() {
                    return this.newToken;
                }

                public final String d() {
                    return this.newToken;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof c)) {
                        return false;
                    }
                    c cVar = (c) other;
                    return kotlin.jvm.internal.f.b(this.sessionId, cVar.sessionId) && kotlin.jvm.internal.f.b(this.status, cVar.status) && kotlin.jvm.internal.f.b(this.newToken, cVar.newToken);
                }

                public final String f() {
                    return this.sessionId;
                }

                public final String h() {
                    return this.status;
                }

                public int hashCode() {
                    String str = this.sessionId;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.status;
                    int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.newToken;
                    return hashCode2 + (str3 != null ? str3.hashCode() : 0);
                }

                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Payload(sessionId=");
                    sb2.append(this.sessionId);
                    sb2.append(", status=");
                    sb2.append(this.status);
                    sb2.append(", newToken=");
                    return C.v.q(sb2, this.newToken, ')');
                }

                public /* synthetic */ c(int i, String str, String str2, String str3, i0 i0Var) {
                    if ((i & 1) == 0) {
                        this.sessionId = null;
                    } else {
                        this.sessionId = str;
                    }
                    if ((i & 2) == 0) {
                        this.status = null;
                    } else {
                        this.status = str2;
                    }
                    if ((i & 4) == 0) {
                        this.newToken = null;
                    } else {
                        this.newToken = str3;
                    }
                }

                public final c a(String sessionId, String status, String newToken) {
                    return new c(sessionId, status, newToken);
                }

                public c(String str, String str2, String str3) {
                    this.sessionId = str;
                    this.status = str2;
                    this.newToken = str3;
                }

                public static /* synthetic */ c a(c cVar, String str, String str2, String str3, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = cVar.sessionId;
                    }
                    if ((i & 2) != 0) {
                        str2 = cVar.status;
                    }
                    if ((i & 4) != 0) {
                        str3 = cVar.newToken;
                    }
                    return cVar.a(str, str2, str3);
                }

                public static final void a(c self, InterfaceC1143c output, pa.f serialDesc) {
                    if (output.D() || self.sessionId != null) {
                        output.e(serialDesc, 0, m0.f26414a, self.sessionId);
                    }
                    if (output.D() || self.status != null) {
                        output.e(serialDesc, 1, m0.f26414a, self.status);
                    }
                    if (!output.D() && self.newToken == null) {
                        return;
                    }
                    output.e(serialDesc, 2, m0.f26414a, self.newToken);
                }

                public /* synthetic */ c(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
                }

                public static /* synthetic */ void e() {
                }

                public static /* synthetic */ void g() {
                }

                public static /* synthetic */ void i() {
                }
            }

            public g() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final g a(c payload) {
                return new g(payload);
            }

            /* renamed from: c, reason: from getter */
            public final c getPayload() {
                return this.payload;
            }

            public final c d() {
                return this.payload;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof g) && kotlin.jvm.internal.f.b(this.payload, ((g) other).payload);
            }

            public int hashCode() {
                c cVar = this.payload;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            public String toString() {
                return "ApplicantStatusChange(payload=" + this.payload + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ g(int i, Type type, c cVar, i0 i0Var) {
                super(i, type, i0Var);
                if (1 != (i & 1)) {
                    a0.h(i, 1, a.f15353a.getDescriptor());
                    throw null;
                }
                if ((i & 2) == 0) {
                    this.payload = null;
                } else {
                    this.payload = cVar;
                }
            }

            public static /* synthetic */ g a(g gVar, c cVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    cVar = gVar.payload;
                }
                return gVar.a(cVar);
            }

            public /* synthetic */ g(c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : cVar);
            }

            public static final void a(g self, InterfaceC1143c output, pa.f serialDesc) {
                ServerMessage.a(self, output, serialDesc);
                if (!output.D() && self.payload == null) {
                    return;
                }
                output.e(serialDesc, 1, c.a.f15358a, self.payload);
            }

            public g(c cVar) {
                super(Type.APPLICANT_STATUS_CHANGE);
                this.payload = cVar;
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0011\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$h;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage;", "<init>", "()V", "", "seen1", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;", "type", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$h;Lqa/c;Lpa/f;)V", "Companion", "b", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final class h extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public static final class a implements InterfaceC1162A<h> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15360a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15361b;

                static {
                    a aVar = new a();
                    f15360a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.CancelScreenshot", aVar, 1);
                    pluginGeneratedSerialDescriptor.k("type", false);
                    f15361b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public h deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    i0 i0Var = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else {
                            if (q10 != 0) {
                                throw new UnknownFieldException(q10);
                            }
                            obj = c2.C(descriptor, 0, Type.a.f15312a, obj);
                            i = 1;
                        }
                    }
                    c2.b(descriptor);
                    return new h(i, (Type) obj, i0Var);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{Type.a.f15312a};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15361b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, h hVar) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    h.a(hVar, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$h$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<h> serializer() {
                    return a.f15360a;
                }

                public Companion() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ h(int i, Type type, i0 i0Var) {
                super(i, type, i0Var);
                if (1 == (i & 1)) {
                } else {
                    a0.h(i, 1, a.f15360a.getDescriptor());
                    throw null;
                }
            }

            public static final void a(h self, InterfaceC1143c output, pa.f serialDesc) {
                ServerMessage.a(self, output, serialDesc);
            }

            public h() {
                super(Type.CANCEL_SCREENSHOT);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0011\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$i;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage;", "<init>", "()V", "", "seen1", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;", "type", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$i;Lqa/c;Lpa/f;)V", "Companion", "b", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final class i extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public static final class a implements InterfaceC1162A<i> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15362a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15363b;

                static {
                    a aVar = new a();
                    f15362a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.CancelVerifyMobilePhoneTan", aVar, 1);
                    pluginGeneratedSerialDescriptor.k("type", false);
                    f15363b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public i deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    i0 i0Var = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else {
                            if (q10 != 0) {
                                throw new UnknownFieldException(q10);
                            }
                            obj = c2.C(descriptor, 0, Type.a.f15312a, obj);
                            i = 1;
                        }
                    }
                    c2.b(descriptor);
                    return new i(i, (Type) obj, i0Var);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{Type.a.f15312a};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15363b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, i iVar) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    i.a(iVar, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$i$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<i> serializer() {
                    return a.f15362a;
                }

                public Companion() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ i(int i, Type type, i0 i0Var) {
                super(i, type, i0Var);
                if (1 == (i & 1)) {
                } else {
                    a0.h(i, 1, a.f15362a.getDescriptor());
                    throw null;
                }
            }

            public static final void a(i self, InterfaceC1143c output, pa.f serialDesc) {
                ServerMessage.a(self, output, serialDesc);
            }

            public i() {
                super(Type.CANCEL_VERIFY_MOBILE_PHONE_TAN);
            }
        }

        /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$j, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ServerMessage a(AbstractC1244a abstractC1244a, String str) {
                ServerMessage fVar;
                n.c cVar;
                try {
                    if (C0969n.i0(str)) {
                        return new l();
                    }
                    v vVar = (v) abstractC1244a.c(j3.e.B(abstractC1244a.f27066b, kotlin.jvm.internal.h.d(v.class)), str);
                    String type = vVar.getType();
                    if (kotlin.jvm.internal.f.b(type, Type.CANCEL_VERIFY_MOBILE_PHONE_TAN.getType())) {
                        return new i();
                    }
                    if (kotlin.jvm.internal.f.b(type, Type.VERIFY_MOBILE_PHONE_TAN.getType())) {
                        return new s();
                    }
                    if (kotlin.jvm.internal.f.b(type, Type.STEP_CHANGE.getType())) {
                        JsonElement payload = vVar.getPayload();
                        fVar = new p(payload != null ? (p.c) abstractC1244a.d(p.c.INSTANCE.serializer(), payload) : null);
                    } else if (kotlin.jvm.internal.f.b(type, Type.COMPLETED.getType())) {
                        JsonElement payload2 = vVar.getPayload();
                        fVar = new k(payload2 != null ? (k.c) abstractC1244a.d(k.c.INSTANCE.serializer(), payload2) : null);
                    } else {
                        if (kotlin.jvm.internal.f.b(type, Type.MODERATOR_NAME.getType())) {
                            JsonElement payload3 = vVar.getPayload();
                            if (payload3 != null && (cVar = (n.c) abstractC1244a.d(n.c.INSTANCE.serializer(), payload3)) != null) {
                                fVar = new n(cVar);
                            }
                            return new q(vVar.getType());
                        }
                        if (kotlin.jvm.internal.f.b(type, Type.READY_FOR_SCREENSHOT.getType())) {
                            JsonElement payload4 = vVar.getPayload();
                            fVar = new o(payload4 != null ? (ScreenShotPayload) abstractC1244a.d(ScreenShotPayload.INSTANCE.serializer(), payload4) : null);
                        } else if (kotlin.jvm.internal.f.b(type, Type.MAKE_SCREENSHOT.getType())) {
                            JsonElement payload5 = vVar.getPayload();
                            fVar = new m(payload5 != null ? (ScreenShotPayload) abstractC1244a.d(ScreenShotPayload.INSTANCE.serializer(), payload5) : null);
                        } else {
                            if (kotlin.jvm.internal.f.b(type, Type.CANCEL_SCREENSHOT.getType())) {
                                return new h();
                            }
                            if (kotlin.jvm.internal.f.b(type, Type.UPDATE_REQUIRED_ID_DOCS.getType())) {
                                return new r();
                            }
                            if (kotlin.jvm.internal.f.b(type, Type.APPLICANT_LEVEL_CHANGE.getType())) {
                                JsonElement payload6 = vVar.getPayload();
                                fVar = new e(payload6 != null ? (e.c) abstractC1244a.d(e.c.INSTANCE.serializer(), payload6) : null);
                            } else if (kotlin.jvm.internal.f.b(type, Type.APPLICANT_STATUS_CHANGE.getType())) {
                                JsonElement payload7 = vVar.getPayload();
                                fVar = new g(payload7 != null ? (g.c) abstractC1244a.d(g.c.INSTANCE.serializer(), payload7) : null);
                            } else if (kotlin.jvm.internal.f.b(type, Type.APPLICANT_ACTION_STATUS_CHANGE.getType())) {
                                JsonElement payload8 = vVar.getPayload();
                                fVar = new c(payload8 != null ? (c.C0204c) abstractC1244a.d(c.C0204c.INSTANCE.serializer(), payload8) : null);
                            } else {
                                if (kotlin.jvm.internal.f.b(type, Type.WELCOME.getType())) {
                                    return new t();
                                }
                                if (kotlin.jvm.internal.f.b(type, Type.ADDED_ID_DOC.getType())) {
                                    JsonElement payload9 = vVar.getPayload();
                                    fVar = new b(payload9 != null ? (b.c) abstractC1244a.d(b.c.INSTANCE.serializer(), payload9) : null);
                                } else if (kotlin.jvm.internal.f.b(type, Type.APPLICANT_IMAGE_REVIEWED.getType())) {
                                    JsonElement payload10 = vVar.getPayload();
                                    fVar = new d(payload10 != null ? (d.c) abstractC1244a.d(d.c.INSTANCE.serializer(), payload10) : null);
                                } else {
                                    if (!kotlin.jvm.internal.f.b(type, Type.APPLICANT_QUEUE_STATUS.getType())) {
                                        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "unknown message: ".concat(str), null, 4, null);
                                        return new q(vVar.getType());
                                    }
                                    JsonElement payload11 = vVar.getPayload();
                                    fVar = new f(payload11 != null ? (f.c) abstractC1244a.d(f.c.INSTANCE.serializer(), payload11) : null);
                                }
                            }
                        }
                    }
                    return fVar;
                } catch (Exception e10) {
                    com.sumsub.sns.internal.log.b.b(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Can't parse server message=" + str, e10);
                    return new q(null);
                }
            }

            public final InterfaceC1078b<ServerMessage> serializer() {
                return a.f15314a;
            }

            public Companion() {
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0003\u0013\u0015\u0017B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$k;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$k$c;", "payload", "<init>", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$k$c;)V", "", "seen1", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;", "type", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$k$c;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$k;Lqa/c;Lpa/f;)V", "b", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$k$c;", "c", "()Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$k$c;", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final class k extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final c payload;

            public static final class a implements InterfaceC1162A<k> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15365a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15366b;

                static {
                    a aVar = new a();
                    f15365a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.Completed", aVar, 2);
                    pluginGeneratedSerialDescriptor.k("type", false);
                    pluginGeneratedSerialDescriptor.k("payload", true);
                    f15366b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public k deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    i0 i0Var = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj = null;
                    Object obj2 = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else if (q10 == 0) {
                            obj = c2.C(descriptor, 0, Type.a.f15312a, obj);
                            i |= 1;
                        } else {
                            if (q10 != 1) {
                                throw new UnknownFieldException(q10);
                            }
                            obj2 = c2.D(descriptor, 1, c.a.f15368a, obj2);
                            i |= 2;
                        }
                    }
                    c2.b(descriptor);
                    return new k(i, (Type) obj, (c) obj2, i0Var);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{Type.a.f15312a, C1095a.a(c.a.f15368a)};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15366b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, k kVar) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    k.a(kVar, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$k$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<k> serializer() {
                    return a.f15365a;
                }

                public Companion() {
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\u0011\u001eB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0013J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0013¨\u0006\""}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$k$c;", "", "", "applicantCompleted", "<init>", "(Ljava/lang/Boolean;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$k$c;Lqa/c;Lpa/f;)V", "()Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$k$c;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "b", "getApplicantCompleted$annotations", "()V", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC1080d
            public static final /* data */ class c {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final Boolean applicantCompleted;

                public static final class a implements InterfaceC1162A<c> {

                    /* renamed from: a, reason: collision with root package name */
                    public static final a f15368a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ pa.f f15369b;

                    static {
                        a aVar = new a();
                        f15368a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.Completed.Payload", aVar, 1);
                        pluginGeneratedSerialDescriptor.k("applicantCompleted", true);
                        f15369b = pluginGeneratedSerialDescriptor;
                    }

                    @Override // na.InterfaceC1077a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public c deserialize(InterfaceC1144d interfaceC1144d) {
                        pa.f descriptor = getDescriptor();
                        InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                        i0 i0Var = null;
                        boolean z10 = true;
                        int i = 0;
                        Object obj = null;
                        while (z10) {
                            int q10 = c2.q(descriptor);
                            if (q10 == -1) {
                                z10 = false;
                            } else {
                                if (q10 != 0) {
                                    throw new UnknownFieldException(q10);
                                }
                                obj = c2.D(descriptor, 0, C1172g.f26395a, obj);
                                i = 1;
                            }
                        }
                        c2.b(descriptor);
                        return new c(i, (Boolean) obj, i0Var);
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] childSerializers() {
                        return new InterfaceC1078b[]{C1095a.a(C1172g.f26395a)};
                    }

                    @Override // na.InterfaceC1081e, na.InterfaceC1077a
                    public pa.f getDescriptor() {
                        return f15369b;
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] typeParametersSerializers() {
                        return a0.f26382b;
                    }

                    @Override // na.InterfaceC1081e
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(InterfaceC1145e interfaceC1145e, c cVar) {
                        pa.f descriptor = getDescriptor();
                        InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                        c.a(cVar, c2, descriptor);
                        c2.b(descriptor);
                    }
                }

                /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$k$c$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final InterfaceC1078b<c> serializer() {
                        return a.f15368a;
                    }

                    public Companion() {
                    }
                }

                public c() {
                    this((Boolean) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                /* renamed from: a, reason: from getter */
                public final Boolean getApplicantCompleted() {
                    return this.applicantCompleted;
                }

                public final Boolean b() {
                    return this.applicantCompleted;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof c) && kotlin.jvm.internal.f.b(this.applicantCompleted, ((c) other).applicantCompleted);
                }

                public int hashCode() {
                    Boolean bool = this.applicantCompleted;
                    if (bool == null) {
                        return 0;
                    }
                    return bool.hashCode();
                }

                public String toString() {
                    return "Payload(applicantCompleted=" + this.applicantCompleted + ')';
                }

                public /* synthetic */ c(int i, Boolean bool, i0 i0Var) {
                    if ((i & 1) == 0) {
                        this.applicantCompleted = null;
                    } else {
                        this.applicantCompleted = bool;
                    }
                }

                public final c a(Boolean applicantCompleted) {
                    return new c(applicantCompleted);
                }

                public c(Boolean bool) {
                    this.applicantCompleted = bool;
                }

                public static /* synthetic */ c a(c cVar, Boolean bool, int i, Object obj) {
                    if ((i & 1) != 0) {
                        bool = cVar.applicantCompleted;
                    }
                    return cVar.a(bool);
                }

                public static final void a(c self, InterfaceC1143c output, pa.f serialDesc) {
                    if (!output.D() && self.applicantCompleted == null) {
                        return;
                    }
                    output.e(serialDesc, 0, C1172g.f26395a, self.applicantCompleted);
                }

                public /* synthetic */ c(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : bool);
                }

                public static /* synthetic */ void c() {
                }
            }

            public k() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static final void a(k self, InterfaceC1143c output, pa.f serialDesc) {
                ServerMessage.a(self, output, serialDesc);
                if (!output.D() && self.payload == null) {
                    return;
                }
                output.e(serialDesc, 1, c.a.f15368a, self.payload);
            }

            /* renamed from: c, reason: from getter */
            public final c getPayload() {
                return this.payload;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ k(int i, Type type, c cVar, i0 i0Var) {
                super(i, type, i0Var);
                if (1 != (i & 1)) {
                    a0.h(i, 1, a.f15365a.getDescriptor());
                    throw null;
                }
                if ((i & 2) == 0) {
                    this.payload = null;
                } else {
                    this.payload = cVar;
                }
            }

            public /* synthetic */ k(c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : cVar);
            }

            public k(c cVar) {
                super(Type.COMPLETED);
                this.payload = cVar;
            }
        }

        public static final class l extends ServerMessage {
            public l() {
                super(Type.EMPTY);
            }
        }

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002\u0013\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006&"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$m;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$ScreenShotPayload;", "payload", "<init>", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$ScreenShotPayload;)V", "", "seen1", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;", "type", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$ScreenShotPayload;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$m;Lqa/c;Lpa/f;)V", "c", "()Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$ScreenShotPayload;", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$ScreenShotPayload;)Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$m;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$ScreenShotPayload;", "d", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final /* data */ class m extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final ScreenShotPayload payload;

            public static final class a implements InterfaceC1162A<m> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15371a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15372b;

                static {
                    a aVar = new a();
                    f15371a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.MakeScreenshot", aVar, 2);
                    pluginGeneratedSerialDescriptor.k("type", false);
                    pluginGeneratedSerialDescriptor.k("payload", true);
                    f15372b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public m deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    i0 i0Var = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj = null;
                    Object obj2 = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else if (q10 == 0) {
                            obj = c2.C(descriptor, 0, Type.a.f15312a, obj);
                            i |= 1;
                        } else {
                            if (q10 != 1) {
                                throw new UnknownFieldException(q10);
                            }
                            obj2 = c2.D(descriptor, 1, ScreenShotPayload.a.f15310a, obj2);
                            i |= 2;
                        }
                    }
                    c2.b(descriptor);
                    return new m(i, (Type) obj, (ScreenShotPayload) obj2, i0Var);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{Type.a.f15312a, C1095a.a(ScreenShotPayload.a.f15310a)};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15372b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, m mVar) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    m.a(mVar, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$m$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<m> serializer() {
                    return a.f15371a;
                }

                public Companion() {
                }
            }

            public m() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final m a(ScreenShotPayload payload) {
                return new m(payload);
            }

            /* renamed from: c, reason: from getter */
            public final ScreenShotPayload getPayload() {
                return this.payload;
            }

            public final ScreenShotPayload d() {
                return this.payload;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof m) && kotlin.jvm.internal.f.b(this.payload, ((m) other).payload);
            }

            public int hashCode() {
                ScreenShotPayload screenShotPayload = this.payload;
                if (screenShotPayload == null) {
                    return 0;
                }
                return screenShotPayload.hashCode();
            }

            public String toString() {
                return "MakeScreenshot(payload=" + this.payload + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ m(int i, Type type, ScreenShotPayload screenShotPayload, i0 i0Var) {
                super(i, type, i0Var);
                if (1 != (i & 1)) {
                    a0.h(i, 1, a.f15371a.getDescriptor());
                    throw null;
                }
                if ((i & 2) == 0) {
                    this.payload = null;
                } else {
                    this.payload = screenShotPayload;
                }
            }

            public static /* synthetic */ m a(m mVar, ScreenShotPayload screenShotPayload, int i, Object obj) {
                if ((i & 1) != 0) {
                    screenShotPayload = mVar.payload;
                }
                return mVar.a(screenShotPayload);
            }

            public /* synthetic */ m(ScreenShotPayload screenShotPayload, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : screenShotPayload);
            }

            public static final void a(m self, InterfaceC1143c output, pa.f serialDesc) {
                ServerMessage.a(self, output, serialDesc);
                if (!output.D() && self.payload == null) {
                    return;
                }
                output.e(serialDesc, 1, ScreenShotPayload.a.f15310a, self.payload);
            }

            public m(ScreenShotPayload screenShotPayload) {
                super(Type.MAKE_SCREENSHOT);
                this.payload = screenShotPayload;
            }
        }

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0003\u0013\"\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006&"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$n;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$n$c;", "payload", "<init>", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$n$c;)V", "", "seen1", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;", "type", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$n$c;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$n;Lqa/c;Lpa/f;)V", "c", "()Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$n$c;", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$n$c;)Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$n;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$n$c;", "d", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final /* data */ class n extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final c payload;

            public static final class a implements InterfaceC1162A<n> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15374a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15375b;

                static {
                    a aVar = new a();
                    f15374a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.ModeratorName", aVar, 2);
                    pluginGeneratedSerialDescriptor.k("type", false);
                    pluginGeneratedSerialDescriptor.k("payload", false);
                    f15375b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public n deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    i0 i0Var = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj = null;
                    Object obj2 = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else if (q10 == 0) {
                            obj = c2.C(descriptor, 0, Type.a.f15312a, obj);
                            i |= 1;
                        } else {
                            if (q10 != 1) {
                                throw new UnknownFieldException(q10);
                            }
                            obj2 = c2.C(descriptor, 1, c.a.f15377a, obj2);
                            i |= 2;
                        }
                    }
                    c2.b(descriptor);
                    return new n(i, (Type) obj, (c) obj2, i0Var);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{Type.a.f15312a, c.a.f15377a};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15375b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, n nVar) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    n.a(nVar, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$n$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<n> serializer() {
                    return a.f15374a;
                }

                public Companion() {
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u0011\u001dB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0013J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0013¨\u0006!"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$n$c;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$n$c;Lqa/c;Lpa/f;)V", "()Ljava/lang/String;", "(Ljava/lang/String;)Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$n$c;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "b", "getName$annotations", "()V", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC1080d
            public static final /* data */ class c {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final String name;

                public static final class a implements InterfaceC1162A<c> {

                    /* renamed from: a, reason: collision with root package name */
                    public static final a f15377a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ pa.f f15378b;

                    static {
                        a aVar = new a();
                        f15377a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.ModeratorName.Payload", aVar, 1);
                        pluginGeneratedSerialDescriptor.k(AppMeasurementSdk.ConditionalUserProperty.NAME, true);
                        f15378b = pluginGeneratedSerialDescriptor;
                    }

                    @Override // na.InterfaceC1077a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public c deserialize(InterfaceC1144d interfaceC1144d) {
                        pa.f descriptor = getDescriptor();
                        InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                        i0 i0Var = null;
                        boolean z10 = true;
                        int i = 0;
                        Object obj = null;
                        while (z10) {
                            int q10 = c2.q(descriptor);
                            if (q10 == -1) {
                                z10 = false;
                            } else {
                                if (q10 != 0) {
                                    throw new UnknownFieldException(q10);
                                }
                                obj = c2.D(descriptor, 0, m0.f26414a, obj);
                                i = 1;
                            }
                        }
                        c2.b(descriptor);
                        return new c(i, (String) obj, i0Var);
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] childSerializers() {
                        return new InterfaceC1078b[]{C1095a.a(m0.f26414a)};
                    }

                    @Override // na.InterfaceC1081e, na.InterfaceC1077a
                    public pa.f getDescriptor() {
                        return f15378b;
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] typeParametersSerializers() {
                        return a0.f26382b;
                    }

                    @Override // na.InterfaceC1081e
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(InterfaceC1145e interfaceC1145e, c cVar) {
                        pa.f descriptor = getDescriptor();
                        InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                        c.a(cVar, c2, descriptor);
                        c2.b(descriptor);
                    }
                }

                /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$n$c$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final InterfaceC1078b<c> serializer() {
                        return a.f15377a;
                    }

                    public Companion() {
                    }
                }

                public c() {
                    this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                /* renamed from: a, reason: from getter */
                public final String getName() {
                    return this.name;
                }

                public final String b() {
                    return this.name;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof c) && kotlin.jvm.internal.f.b(this.name, ((c) other).name);
                }

                public int hashCode() {
                    String str = this.name;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                public String toString() {
                    return C.v.q(new StringBuilder("Payload(name="), this.name, ')');
                }

                public /* synthetic */ c(int i, String str, i0 i0Var) {
                    if ((i & 1) == 0) {
                        this.name = null;
                    } else {
                        this.name = str;
                    }
                }

                public final c a(String name) {
                    return new c(name);
                }

                public c(String str) {
                    this.name = str;
                }

                public static /* synthetic */ c a(c cVar, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = cVar.name;
                    }
                    return cVar.a(str);
                }

                public static final void a(c self, InterfaceC1143c output, pa.f serialDesc) {
                    if (!output.D() && self.name == null) {
                        return;
                    }
                    output.e(serialDesc, 0, m0.f26414a, self.name);
                }

                public /* synthetic */ c(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str);
                }

                public static /* synthetic */ void c() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ n(int i, Type type, c cVar, i0 i0Var) {
                super(i, type, i0Var);
                if (3 != (i & 3)) {
                    a0.h(i, 3, a.f15374a.getDescriptor());
                    throw null;
                }
                this.payload = cVar;
            }

            public final n a(c payload) {
                return new n(payload);
            }

            /* renamed from: c, reason: from getter */
            public final c getPayload() {
                return this.payload;
            }

            public final c d() {
                return this.payload;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof n) && kotlin.jvm.internal.f.b(this.payload, ((n) other).payload);
            }

            public int hashCode() {
                return this.payload.hashCode();
            }

            public String toString() {
                return "ModeratorName(payload=" + this.payload + ')';
            }

            public n(c cVar) {
                super(Type.MODERATOR_NAME);
                this.payload = cVar;
            }

            public static /* synthetic */ n a(n nVar, c cVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    cVar = nVar.payload;
                }
                return nVar.a(cVar);
            }

            public static final void a(n self, InterfaceC1143c output, pa.f serialDesc) {
                ServerMessage.a(self, output, serialDesc);
                output.C(serialDesc, 1, c.a.f15377a, self.payload);
            }
        }

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002\u0013\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006&"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$o;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$ScreenShotPayload;", "payload", "<init>", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$ScreenShotPayload;)V", "", "seen1", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;", "type", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$ScreenShotPayload;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$o;Lqa/c;Lpa/f;)V", "c", "()Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$ScreenShotPayload;", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$ScreenShotPayload;)Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$o;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$ScreenShotPayload;", "d", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final /* data */ class o extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final ScreenShotPayload payload;

            public static final class a implements InterfaceC1162A<o> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15380a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15381b;

                static {
                    a aVar = new a();
                    f15380a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.ReadyForScreenshot", aVar, 2);
                    pluginGeneratedSerialDescriptor.k("type", false);
                    pluginGeneratedSerialDescriptor.k("payload", true);
                    f15381b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public o deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    i0 i0Var = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj = null;
                    Object obj2 = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else if (q10 == 0) {
                            obj = c2.C(descriptor, 0, Type.a.f15312a, obj);
                            i |= 1;
                        } else {
                            if (q10 != 1) {
                                throw new UnknownFieldException(q10);
                            }
                            obj2 = c2.D(descriptor, 1, ScreenShotPayload.a.f15310a, obj2);
                            i |= 2;
                        }
                    }
                    c2.b(descriptor);
                    return new o(i, (Type) obj, (ScreenShotPayload) obj2, i0Var);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{Type.a.f15312a, C1095a.a(ScreenShotPayload.a.f15310a)};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15381b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, o oVar) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    o.a(oVar, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$o$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<o> serializer() {
                    return a.f15380a;
                }

                public Companion() {
                }
            }

            public o() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final o a(ScreenShotPayload payload) {
                return new o(payload);
            }

            /* renamed from: c, reason: from getter */
            public final ScreenShotPayload getPayload() {
                return this.payload;
            }

            public final ScreenShotPayload d() {
                return this.payload;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof o) && kotlin.jvm.internal.f.b(this.payload, ((o) other).payload);
            }

            public int hashCode() {
                ScreenShotPayload screenShotPayload = this.payload;
                if (screenShotPayload == null) {
                    return 0;
                }
                return screenShotPayload.hashCode();
            }

            public String toString() {
                return "ReadyForScreenshot(payload=" + this.payload + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ o(int i, Type type, ScreenShotPayload screenShotPayload, i0 i0Var) {
                super(i, type, i0Var);
                if (1 != (i & 1)) {
                    a0.h(i, 1, a.f15380a.getDescriptor());
                    throw null;
                }
                if ((i & 2) == 0) {
                    this.payload = null;
                } else {
                    this.payload = screenShotPayload;
                }
            }

            public static /* synthetic */ o a(o oVar, ScreenShotPayload screenShotPayload, int i, Object obj) {
                if ((i & 1) != 0) {
                    screenShotPayload = oVar.payload;
                }
                return oVar.a(screenShotPayload);
            }

            public /* synthetic */ o(ScreenShotPayload screenShotPayload, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : screenShotPayload);
            }

            public static final void a(o self, InterfaceC1143c output, pa.f serialDesc) {
                ServerMessage.a(self, output, serialDesc);
                if (!output.D() && self.payload == null) {
                    return;
                }
                output.e(serialDesc, 1, ScreenShotPayload.a.f15310a, self.payload);
            }

            public o(ScreenShotPayload screenShotPayload) {
                super(Type.READY_FOR_SCREENSHOT);
                this.payload = screenShotPayload;
            }
        }

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0003\u0013\"\u0015B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006&"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$p;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$p$c;", "payload", "<init>", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$p$c;)V", "", "seen1", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;", "type", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$p$c;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$p;Lqa/c;Lpa/f;)V", "c", "()Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$p$c;", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$p$c;)Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$p;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$p$c;", "d", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final /* data */ class p extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final c payload;

            public static final class a implements InterfaceC1162A<p> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15383a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15384b;

                static {
                    a aVar = new a();
                    f15383a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.StepChange", aVar, 2);
                    pluginGeneratedSerialDescriptor.k("type", false);
                    pluginGeneratedSerialDescriptor.k("payload", true);
                    f15384b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public p deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    i0 i0Var = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj = null;
                    Object obj2 = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else if (q10 == 0) {
                            obj = c2.C(descriptor, 0, Type.a.f15312a, obj);
                            i |= 1;
                        } else {
                            if (q10 != 1) {
                                throw new UnknownFieldException(q10);
                            }
                            obj2 = c2.D(descriptor, 1, c.a.f15386a, obj2);
                            i |= 2;
                        }
                    }
                    c2.b(descriptor);
                    return new p(i, (Type) obj, (c) obj2, i0Var);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{Type.a.f15312a, C1095a.a(c.a.f15386a)};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15384b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, p pVar) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    p.a(pVar, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$p$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<p> serializer() {
                    return a.f15383a;
                }

                public Companion() {
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u0011\u001dB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0013J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0013¨\u0006!"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$p$c;", "", "", "idDocSetType", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$p$c;Lqa/c;Lpa/f;)V", "()Ljava/lang/String;", "(Ljava/lang/String;)Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$p$c;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "b", "getIdDocSetType$annotations", "()V", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
            @InterfaceC1080d
            public static final /* data */ class c {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final String idDocSetType;

                public static final class a implements InterfaceC1162A<c> {

                    /* renamed from: a, reason: collision with root package name */
                    public static final a f15386a;

                    /* renamed from: b, reason: collision with root package name */
                    public static final /* synthetic */ pa.f f15387b;

                    static {
                        a aVar = new a();
                        f15386a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.StepChange.Payload", aVar, 1);
                        pluginGeneratedSerialDescriptor.k("idDocSetType", true);
                        f15387b = pluginGeneratedSerialDescriptor;
                    }

                    @Override // na.InterfaceC1077a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public c deserialize(InterfaceC1144d interfaceC1144d) {
                        pa.f descriptor = getDescriptor();
                        InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                        i0 i0Var = null;
                        boolean z10 = true;
                        int i = 0;
                        Object obj = null;
                        while (z10) {
                            int q10 = c2.q(descriptor);
                            if (q10 == -1) {
                                z10 = false;
                            } else {
                                if (q10 != 0) {
                                    throw new UnknownFieldException(q10);
                                }
                                obj = c2.D(descriptor, 0, m0.f26414a, obj);
                                i = 1;
                            }
                        }
                        c2.b(descriptor);
                        return new c(i, (String) obj, i0Var);
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] childSerializers() {
                        return new InterfaceC1078b[]{C1095a.a(m0.f26414a)};
                    }

                    @Override // na.InterfaceC1081e, na.InterfaceC1077a
                    public pa.f getDescriptor() {
                        return f15387b;
                    }

                    @Override // ra.InterfaceC1162A
                    public InterfaceC1078b<?>[] typeParametersSerializers() {
                        return a0.f26382b;
                    }

                    @Override // na.InterfaceC1081e
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void serialize(InterfaceC1145e interfaceC1145e, c cVar) {
                        pa.f descriptor = getDescriptor();
                        InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                        c.a(cVar, c2, descriptor);
                        c2.b(descriptor);
                    }
                }

                /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$p$c$b, reason: from kotlin metadata */
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final InterfaceC1078b<c> serializer() {
                        return a.f15386a;
                    }

                    public Companion() {
                    }
                }

                public c() {
                    this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                /* renamed from: a, reason: from getter */
                public final String getIdDocSetType() {
                    return this.idDocSetType;
                }

                public final String b() {
                    return this.idDocSetType;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof c) && kotlin.jvm.internal.f.b(this.idDocSetType, ((c) other).idDocSetType);
                }

                public int hashCode() {
                    String str = this.idDocSetType;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                public String toString() {
                    return C.v.q(new StringBuilder("Payload(idDocSetType="), this.idDocSetType, ')');
                }

                public /* synthetic */ c(int i, String str, i0 i0Var) {
                    if ((i & 1) == 0) {
                        this.idDocSetType = null;
                    } else {
                        this.idDocSetType = str;
                    }
                }

                public final c a(String idDocSetType) {
                    return new c(idDocSetType);
                }

                public c(String str) {
                    this.idDocSetType = str;
                }

                public static /* synthetic */ c a(c cVar, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = cVar.idDocSetType;
                    }
                    return cVar.a(str);
                }

                public static final void a(c self, InterfaceC1143c output, pa.f serialDesc) {
                    if (!output.D() && self.idDocSetType == null) {
                        return;
                    }
                    output.e(serialDesc, 0, m0.f26414a, self.idDocSetType);
                }

                public /* synthetic */ c(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str);
                }

                public static /* synthetic */ void c() {
                }
            }

            public p() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final p a(c payload) {
                return new p(payload);
            }

            /* renamed from: c, reason: from getter */
            public final c getPayload() {
                return this.payload;
            }

            public final c d() {
                return this.payload;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof p) && kotlin.jvm.internal.f.b(this.payload, ((p) other).payload);
            }

            public int hashCode() {
                c cVar = this.payload;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            public String toString() {
                return "StepChange(payload=" + this.payload + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ p(int i, Type type, c cVar, i0 i0Var) {
                super(i, type, i0Var);
                if (1 != (i & 1)) {
                    a0.h(i, 1, a.f15383a.getDescriptor());
                    throw null;
                }
                if ((i & 2) == 0) {
                    this.payload = null;
                } else {
                    this.payload = cVar;
                }
            }

            public static /* synthetic */ p a(p pVar, c cVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    cVar = pVar.payload;
                }
                return pVar.a(cVar);
            }

            public /* synthetic */ p(c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : cVar);
            }

            public static final void a(p self, InterfaceC1143c output, pa.f serialDesc) {
                ServerMessage.a(self, output, serialDesc);
                if (!output.D() && self.payload == null) {
                    return;
                }
                output.e(serialDesc, 1, c.a.f15386a, self.payload);
            }

            public p(c cVar) {
                super(Type.STEP_CHANGE);
                this.payload = cVar;
            }
        }

        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\u0013 B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0016¨\u0006$"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$q;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage;", "", "messageType", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;", "type", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;Ljava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$q;Lqa/c;Lpa/f;)V", "c", "()Ljava/lang/String;", "(Ljava/lang/String;)Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$q;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "d", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final /* data */ class q extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            public final String messageType;

            public static final class a implements InterfaceC1162A<q> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15389a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15390b;

                static {
                    a aVar = new a();
                    f15389a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.Unknown", aVar, 2);
                    pluginGeneratedSerialDescriptor.k("type", false);
                    pluginGeneratedSerialDescriptor.k("messageType", true);
                    f15390b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public q deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    i0 i0Var = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj = null;
                    Object obj2 = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else if (q10 == 0) {
                            obj = c2.C(descriptor, 0, Type.a.f15312a, obj);
                            i |= 1;
                        } else {
                            if (q10 != 1) {
                                throw new UnknownFieldException(q10);
                            }
                            obj2 = c2.D(descriptor, 1, m0.f26414a, obj2);
                            i |= 2;
                        }
                    }
                    c2.b(descriptor);
                    return new q(i, (Type) obj, (String) obj2, i0Var);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{Type.a.f15312a, C1095a.a(m0.f26414a)};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15390b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, q qVar) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    q.a(qVar, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$q$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<q> serializer() {
                    return a.f15389a;
                }

                public Companion() {
                }
            }

            public q() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final q a(String messageType) {
                return new q(messageType);
            }

            /* renamed from: c, reason: from getter */
            public final String getMessageType() {
                return this.messageType;
            }

            public final String d() {
                return this.messageType;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof q) && kotlin.jvm.internal.f.b(this.messageType, ((q) other).messageType);
            }

            public int hashCode() {
                String str = this.messageType;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return C.v.q(new StringBuilder("Unknown(messageType="), this.messageType, ')');
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ q(int i, Type type, String str, i0 i0Var) {
                super(i, type, i0Var);
                if (1 != (i & 1)) {
                    a0.h(i, 1, a.f15389a.getDescriptor());
                    throw null;
                }
                if ((i & 2) == 0) {
                    this.messageType = null;
                } else {
                    this.messageType = str;
                }
            }

            public static /* synthetic */ q a(q qVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = qVar.messageType;
                }
                return qVar.a(str);
            }

            public /* synthetic */ q(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            public static final void a(q self, InterfaceC1143c output, pa.f serialDesc) {
                ServerMessage.a(self, output, serialDesc);
                if (!output.D() && self.messageType == null) {
                    return;
                }
                output.e(serialDesc, 1, m0.f26414a, self.messageType);
            }

            public q(String str) {
                super(Type.UNKNOWN);
                this.messageType = str;
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0011\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$r;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage;", "<init>", "()V", "", "seen1", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;", "type", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$r;Lqa/c;Lpa/f;)V", "Companion", "b", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final class r extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public static final class a implements InterfaceC1162A<r> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15391a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15392b;

                static {
                    a aVar = new a();
                    f15391a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.UpdateRequiredIdDocs", aVar, 1);
                    pluginGeneratedSerialDescriptor.k("type", false);
                    f15392b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public r deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    i0 i0Var = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else {
                            if (q10 != 0) {
                                throw new UnknownFieldException(q10);
                            }
                            obj = c2.C(descriptor, 0, Type.a.f15312a, obj);
                            i = 1;
                        }
                    }
                    c2.b(descriptor);
                    return new r(i, (Type) obj, i0Var);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{Type.a.f15312a};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15392b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, r rVar) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    r.a(rVar, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$r$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<r> serializer() {
                    return a.f15391a;
                }

                public Companion() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ r(int i, Type type, i0 i0Var) {
                super(i, type, i0Var);
                if (1 == (i & 1)) {
                } else {
                    a0.h(i, 1, a.f15391a.getDescriptor());
                    throw null;
                }
            }

            public static final void a(r self, InterfaceC1143c output, pa.f serialDesc) {
                ServerMessage.a(self, output, serialDesc);
            }

            public r() {
                super(Type.UPDATE_REQUIRED_ID_DOCS);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0011\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$s;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage;", "<init>", "()V", "", "seen1", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;", "type", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$s;Lqa/c;Lpa/f;)V", "Companion", "b", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final class s extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public static final class a implements InterfaceC1162A<s> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15393a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15394b;

                static {
                    a aVar = new a();
                    f15393a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.VerifyMobilePhoneTan", aVar, 1);
                    pluginGeneratedSerialDescriptor.k("type", false);
                    f15394b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public s deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    i0 i0Var = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else {
                            if (q10 != 0) {
                                throw new UnknownFieldException(q10);
                            }
                            obj = c2.C(descriptor, 0, Type.a.f15312a, obj);
                            i = 1;
                        }
                    }
                    c2.b(descriptor);
                    return new s(i, (Type) obj, i0Var);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{Type.a.f15312a};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15394b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, s sVar) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    s.a(sVar, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$s$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<s> serializer() {
                    return a.f15393a;
                }

                public Companion() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ s(int i, Type type, i0 i0Var) {
                super(i, type, i0Var);
                if (1 == (i & 1)) {
                } else {
                    a0.h(i, 1, a.f15393a.getDescriptor());
                    throw null;
                }
            }

            public static final void a(s self, InterfaceC1143c output, pa.f serialDesc) {
                ServerMessage.a(self, output, serialDesc);
            }

            public s() {
                super(Type.VERIFY_MOBILE_PHONE_TAN);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0011\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$t;", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage;", "<init>", "()V", "", "seen1", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;", "type", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$Type;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$t;Lqa/c;Lpa/f;)V", "Companion", "b", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC1080d
        public static final class t extends ServerMessage {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public static final class a implements InterfaceC1162A<t> {

                /* renamed from: a, reason: collision with root package name */
                public static final a f15395a;

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ pa.f f15396b;

                static {
                    a aVar = new a();
                    f15395a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.Welcome", aVar, 1);
                    pluginGeneratedSerialDescriptor.k("type", false);
                    f15396b = pluginGeneratedSerialDescriptor;
                }

                @Override // na.InterfaceC1077a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public t deserialize(InterfaceC1144d interfaceC1144d) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                    i0 i0Var = null;
                    boolean z10 = true;
                    int i = 0;
                    Object obj = null;
                    while (z10) {
                        int q10 = c2.q(descriptor);
                        if (q10 == -1) {
                            z10 = false;
                        } else {
                            if (q10 != 0) {
                                throw new UnknownFieldException(q10);
                            }
                            obj = c2.C(descriptor, 0, Type.a.f15312a, obj);
                            i = 1;
                        }
                    }
                    c2.b(descriptor);
                    return new t(i, (Type) obj, i0Var);
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] childSerializers() {
                    return new InterfaceC1078b[]{Type.a.f15312a};
                }

                @Override // na.InterfaceC1081e, na.InterfaceC1077a
                public pa.f getDescriptor() {
                    return f15396b;
                }

                @Override // ra.InterfaceC1162A
                public InterfaceC1078b<?>[] typeParametersSerializers() {
                    return a0.f26382b;
                }

                @Override // na.InterfaceC1081e
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void serialize(InterfaceC1145e interfaceC1145e, t tVar) {
                    pa.f descriptor = getDescriptor();
                    InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                    t.a(tVar, c2, descriptor);
                    c2.b(descriptor);
                }
            }

            /* renamed from: com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$t$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InterfaceC1078b<t> serializer() {
                    return a.f15395a;
                }

                public Companion() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ t(int i, Type type, i0 i0Var) {
                super(i, type, i0Var);
                if (1 == (i & 1)) {
                } else {
                    a0.h(i, 1, a.f15395a.getDescriptor());
                    throw null;
                }
            }

            public static final void a(t self, InterfaceC1143c output, pa.f serialDesc) {
                ServerMessage.a(self, output, serialDesc);
            }

            public t() {
                super(Type.WELCOME);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ ServerMessage(int r3, com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.Type r4, ra.i0 r5) {
            /*
                r2 = this;
                r5 = r3 & 1
                r0 = 0
                r1 = 1
                if (r1 != r5) goto Lc
                r2.<init>(r0)
                r2.type = r4
                return
            Lc:
                com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$a r4 = com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.a.f15314a
                pa.f r4 = r4.getDescriptor()
                ra.a0.h(r3, r1, r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.model.SNSMessage.ServerMessage.<init>(int, com.sumsub.sns.internal.core.data.model.SNSMessage$ServerMessage$Type, ra.i0):void");
        }

        public static final void a(ServerMessage self, InterfaceC1143c output, pa.f serialDesc) {
            output.C(serialDesc, 0, Type.a.f15312a, self.type);
        }

        public ServerMessage(Type type) {
            super(null);
            this.type = type;
        }

        /* renamed from: a, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        public static /* synthetic */ void b() {
        }
    }

    public /* synthetic */ SNSMessage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public SNSMessage() {
    }
}
