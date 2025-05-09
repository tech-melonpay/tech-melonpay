package com.sumsub.sentry;

import com.sumsub.sentry.d0;
import com.sumsub.sentry.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import oa.C1095a;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.InterfaceC1162A;

@InterfaceC1080d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0013\u0019B\"\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007B6\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\nø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R+\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0015\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Lcom/sumsub/sentry/w;", "", "Lcom/sumsub/sentry/d0;", "eventId", "Lcom/sumsub/sentry/s;", "sdkVersion", "<init>", "(Ljava/lang/String;Lcom/sumsub/sentry/s;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/sumsub/sentry/s;Lra/i0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sentry/w;Lqa/c;Lpa/f;)V", "Ljava/lang/String;", "()Ljava/lang/String;", "getEventId-Chs0R2U$annotations", "()V", "b", "Lcom/sumsub/sentry/s;", "c", "()Lcom/sumsub/sentry/s;", "getSdkVersion$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class w {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String eventId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final s sdkVersion;

    public static final class a implements InterfaceC1162A<w> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13803a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f13804b;

        static {
            a aVar = new a();
            f13803a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sentry.SentryEnvelopeHeader", aVar, 2);
            pluginGeneratedSerialDescriptor.k("event_id", true);
            pluginGeneratedSerialDescriptor.k("sdk", true);
            f13804b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public w deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            boolean z10 = true;
            int i = 0;
            Object obj = null;
            Object obj2 = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                if (q10 == -1) {
                    z10 = false;
                } else if (q10 == 0) {
                    obj = c2.D(descriptor, 0, d0.a.f13609a, obj);
                    i |= 1;
                } else {
                    if (q10 != 1) {
                        throw new UnknownFieldException(q10);
                    }
                    obj2 = c2.D(descriptor, 1, s.a.f13780a, obj2);
                    i |= 2;
                }
            }
            c2.b(descriptor);
            d0 d0Var = (d0) obj;
            return new w(i, d0Var != null ? d0Var.b() : null, (s) obj2, null, null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            return new InterfaceC1078b[]{C1095a.a(d0.a.f13609a), C1095a.a(s.a.f13780a)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f13804b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, w wVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            w.a(wVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sentry.w$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<w> serializer() {
            return a.f13803a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ w(int i, String str, s sVar, ra.i0 i0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, sVar, i0Var);
    }

    public static final void a(w self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.eventId != null) {
            d0.a aVar = d0.a.f13609a;
            String str = self.eventId;
            output.e(serialDesc, 0, aVar, str != null ? d0.a(str) : null);
        }
        if (!output.D() && self.sdkVersion == null) {
            return;
        }
        output.e(serialDesc, 1, s.a.f13780a, self.sdkVersion);
    }

    /* renamed from: c, reason: from getter */
    public final s getSdkVersion() {
        return this.sdkVersion;
    }

    public /* synthetic */ w(String str, s sVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, sVar);
    }

    /* renamed from: a, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    public w(int i, String str, s sVar, ra.i0 i0Var) {
        if ((i & 1) == 0) {
            this.eventId = null;
        } else {
            this.eventId = str;
        }
        if ((i & 2) == 0) {
            this.sdkVersion = null;
        } else {
            this.sdkVersion = sVar;
        }
    }

    public w(String str, s sVar) {
        this.eventId = str;
        this.sdkVersion = sVar;
    }

    public /* synthetic */ w(String str, s sVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : sVar, null);
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d() {
    }
}
