package com.sumsub.sentry;

import com.sumsub.sentry.f;
import com.sumsub.sentry.r;
import java.util.ArrayList;
import java.util.List;
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
import ra.C1169d;
import ra.InterfaceC1162A;

@InterfaceC1080d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0014\u001bB#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u0014\u0010\u001d¨\u0006 "}, d2 = {"Lcom/sumsub/sentry/g;", "", "Lcom/sumsub/sentry/r;", "sdkInfo", "", "Lcom/sumsub/sentry/f;", "images", "<init>", "(Lcom/sumsub/sentry/r;Ljava/util/List;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sentry/r;Ljava/util/List;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sentry/g;Lqa/c;Lpa/f;)V", "Lcom/sumsub/sentry/r;", "c", "()Lcom/sumsub/sentry/r;", "getSdkInfo$annotations", "()V", "b", "Ljava/util/List;", "()Ljava/util/List;", "getImages$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final r sdkInfo;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final List<f> images;

    public static final class a implements InterfaceC1162A<g> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13638a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f13639b;

        static {
            a aVar = new a();
            f13638a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sentry.DebugMeta", aVar, 2);
            pluginGeneratedSerialDescriptor.k("sdk_info", true);
            pluginGeneratedSerialDescriptor.k("images", true);
            f13639b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            ra.i0 i0Var = null;
            boolean z10 = true;
            int i = 0;
            Object obj = null;
            Object obj2 = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                if (q10 == -1) {
                    z10 = false;
                } else if (q10 == 0) {
                    obj = c2.D(descriptor, 0, r.a.f13774a, obj);
                    i |= 1;
                } else {
                    if (q10 != 1) {
                        throw new UnknownFieldException(q10);
                    }
                    obj2 = c2.C(descriptor, 1, new C1169d(f.a.f13628a, 0), obj2);
                    i |= 2;
                }
            }
            c2.b(descriptor);
            return new g(i, (r) obj, (List) obj2, i0Var);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            return new InterfaceC1078b[]{C1095a.a(r.a.f13774a), new C1169d(f.a.f13628a, 0)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f13639b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
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

    /* renamed from: com.sumsub.sentry.g$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<g> serializer() {
            return a.f13638a;
        }

        public Companion() {
        }
    }

    public g() {
        this((r) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static final void a(g self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.sdkInfo != null) {
            output.e(serialDesc, 0, r.a.f13774a, self.sdkInfo);
        }
        if (!output.D() && kotlin.jvm.internal.f.b(self.images, new ArrayList())) {
            return;
        }
        output.C(serialDesc, 1, new C1169d(f.a.f13628a, 0), self.images);
    }

    /* renamed from: c, reason: from getter */
    public final r getSdkInfo() {
        return this.sdkInfo;
    }

    public /* synthetic */ g(int i, r rVar, List list, ra.i0 i0Var) {
        this.sdkInfo = (i & 1) == 0 ? null : rVar;
        if ((i & 2) == 0) {
            this.images = new ArrayList();
        } else {
            this.images = list;
        }
    }

    public final List<f> a() {
        return this.images;
    }

    public g(r rVar, List<f> list) {
        this.sdkInfo = rVar;
        this.images = list;
    }

    public /* synthetic */ g(r rVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rVar, (i & 2) != 0 ? new ArrayList() : list);
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d() {
    }
}
