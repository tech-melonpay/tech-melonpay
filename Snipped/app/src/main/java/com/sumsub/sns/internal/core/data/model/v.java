package com.sumsub.sns.internal.core.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import oa.C1095a;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.InterfaceC1162A;
import ra.a0;
import ra.i0;
import ra.m0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0013\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B3\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0002\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R(\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010\u0015\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0013\u0010\u0018R*\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u0013\u0010\u001c\"\u0004\b\u0013\u0010\u001d¨\u0006 "}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/v;", "", "<init>", "()V", "", "seen1", "", "type", "Lkotlinx/serialization/json/JsonElement;", "payload", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonElement;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/v;Lqa/c;Lpa/f;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "getType$annotations", "b", "Lkotlinx/serialization/json/JsonElement;", "()Lkotlinx/serialization/json/JsonElement;", "(Lkotlinx/serialization/json/JsonElement;)V", "getPayload$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public String type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public JsonElement payload;

    public static final class a implements InterfaceC1162A<v> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15803a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15804b;

        static {
            a aVar = new a();
            f15803a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.SNSMessageModel", aVar, 2);
            pluginGeneratedSerialDescriptor.k("type", true);
            pluginGeneratedSerialDescriptor.k("payload", true);
            f15804b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            i0 i0Var = null;
            boolean z10 = true;
            int i = 0;
            String str = null;
            Object obj = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                if (q10 == -1) {
                    z10 = false;
                } else if (q10 == 0) {
                    str = c2.y(descriptor, 0);
                    i |= 1;
                } else {
                    if (q10 != 1) {
                        throw new UnknownFieldException(q10);
                    }
                    obj = c2.D(descriptor, 1, JsonElementSerializer.f23368a, obj);
                    i |= 2;
                }
            }
            c2.b(descriptor);
            return new v(i, str, (JsonElement) obj, i0Var);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            return new InterfaceC1078b[]{m0.f26414a, C1095a.a(JsonElementSerializer.f23368a)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15804b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, v vVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            v.a(vVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.model.v$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<v> serializer() {
            return a.f15803a;
        }

        public Companion() {
        }
    }

    public v() {
        this.type = "";
    }

    public static final void a(v self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || !kotlin.jvm.internal.f.b(self.type, "")) {
            output.x(serialDesc, 0, self.type);
        }
        if (!output.D() && self.payload == null) {
            return;
        }
        output.e(serialDesc, 1, JsonElementSerializer.f23368a, self.payload);
    }

    /* renamed from: c, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public /* synthetic */ v(int i, String str, JsonElement jsonElement, i0 i0Var) {
        this.type = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.payload = null;
        } else {
            this.payload = jsonElement;
        }
    }

    public final void a(String str) {
        this.type = str;
    }

    /* renamed from: a, reason: from getter */
    public final JsonElement getPayload() {
        return this.payload;
    }

    public final void a(JsonElement jsonElement) {
        this.payload = jsonElement;
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d() {
    }
}
