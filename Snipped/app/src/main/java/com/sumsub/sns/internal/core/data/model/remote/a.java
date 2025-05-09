package com.sumsub.sns.internal.core.data.model.remote;

import com.sumsub.sns.internal.core.data.model.remote.h;
import java.util.List;
import java.util.Map;
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
import ra.K;
import ra.a0;
import ra.i0;
import ra.m0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002\u0014!B%\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001c\b\u0001\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0016J.\u0010\u0014\u001a\u00020\u00002\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR4\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0016¨\u0006%"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/remote/a;", "", "", "", "", "Lcom/sumsub/sns/internal/core/data/model/remote/h;", "supportedSources", "<init>", "(Ljava/util/Map;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/util/Map;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/remote/a;Lqa/c;Lpa/f;)V", "()Ljava/util/Map;", "(Ljava/util/Map;)Lcom/sumsub/sns/internal/core/data/model/remote/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "b", "getSupportedSources$annotations", "()V", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class a {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Map<String, List<h>> supportedSources;

    /* renamed from: com.sumsub.sns.internal.core.data.model.remote.a$a, reason: collision with other inner class name */
    public static final class C0212a implements InterfaceC1162A<a> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0212a f15571a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15572b;

        static {
            C0212a c0212a = new C0212a();
            f15571a = c0212a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.remote.EKycConfig", c0212a, 1);
            pluginGeneratedSerialDescriptor.k("supportedSources", true);
            f15572b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a deserialize(InterfaceC1144d interfaceC1144d) {
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
                    obj = c2.D(descriptor, 0, new K(m0.f26414a, new C1169d(h.a.f15620a, 0)), obj);
                    i = 1;
                }
            }
            c2.b(descriptor);
            return new a(i, (Map) obj, i0Var);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            return new InterfaceC1078b[]{C1095a.a(new K(m0.f26414a, new C1169d(h.a.f15620a, 0)))};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15572b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, a aVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            a.a(aVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.model.remote.a$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<a> serializer() {
            return C0212a.f15571a;
        }

        public Companion() {
        }
    }

    public a() {
        this((Map) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public final Map<String, List<h>> a() {
        return this.supportedSources;
    }

    public final Map<String, List<h>> b() {
        return this.supportedSources;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof a) && kotlin.jvm.internal.f.b(this.supportedSources, ((a) other).supportedSources);
    }

    public int hashCode() {
        Map<String, List<h>> map = this.supportedSources;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        return "EKycConfig(supportedSources=" + this.supportedSources + ')';
    }

    public /* synthetic */ a(int i, Map map, i0 i0Var) {
        if ((i & 1) == 0) {
            this.supportedSources = null;
        } else {
            this.supportedSources = map;
        }
    }

    public final a a(Map<String, ? extends List<h>> supportedSources) {
        return new a(supportedSources);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Map<String, ? extends List<h>> map) {
        this.supportedSources = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a a(a aVar, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = aVar.supportedSources;
        }
        return aVar.a(map);
    }

    public static final void a(a self, InterfaceC1143c output, pa.f serialDesc) {
        if (!output.D() && self.supportedSources == null) {
            return;
        }
        output.e(serialDesc, 0, new K(m0.f26414a, new C1169d(h.a.f15620a, 0)), self.supportedSources);
    }

    public /* synthetic */ a(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map);
    }

    public static /* synthetic */ void c() {
    }
}
