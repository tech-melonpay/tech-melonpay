package com.sumsub.sns.internal.ff.model;

import C.v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import pa.f;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.C1169d;
import ra.InterfaceC1162A;
import ra.a0;
import ra.i0;
import ra.m0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002\u0012\u001fB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B-\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0014J \u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0014¨\u0006#"}, d2 = {"Lcom/sumsub/sns/internal/ff/model/a;", "", "", "", "requestedFlags", "<init>", "(Ljava/util/List;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/util/List;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/ff/model/a;Lqa/c;Lpa/f;)V", "()Ljava/util/List;", "(Ljava/util/List;)Lcom/sumsub/sns/internal/ff/model/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "b", "getRequestedFlags$annotations", "()V", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class a {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final List<String> requestedFlags;

    /* renamed from: com.sumsub.sns.internal.ff.model.a$a, reason: collision with other inner class name */
    public static final class C0252a implements InterfaceC1162A<a> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0252a f16969a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ f f16970b;

        static {
            C0252a c0252a = new C0252a();
            f16969a = c0252a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.ff.model.FeatureFlagsRequest", c0252a, 1);
            pluginGeneratedSerialDescriptor.k("requestedFlags", false);
            f16970b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a deserialize(InterfaceC1144d interfaceC1144d) {
            f descriptor = getDescriptor();
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
                    obj = c2.C(descriptor, 0, new C1169d(m0.f26414a, 0), obj);
                    i = 1;
                }
            }
            c2.b(descriptor);
            return new a(i, (List) obj, i0Var);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            return new InterfaceC1078b[]{new C1169d(m0.f26414a, 0)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public f getDescriptor() {
            return f16970b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, a aVar) {
            f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            a.a(aVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.internal.ff.model.a$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<a> serializer() {
            return C0252a.f16969a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ a(int i, List list, i0 i0Var) {
        if (1 == (i & 1)) {
            this.requestedFlags = list;
        } else {
            a0.h(i, 1, C0252a.f16969a.getDescriptor());
            throw null;
        }
    }

    public final List<String> a() {
        return this.requestedFlags;
    }

    public final List<String> b() {
        return this.requestedFlags;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof a) && kotlin.jvm.internal.f.b(this.requestedFlags, ((a) other).requestedFlags);
    }

    public int hashCode() {
        return this.requestedFlags.hashCode();
    }

    public String toString() {
        return v.r(new StringBuilder("FeatureFlagsRequest(requestedFlags="), this.requestedFlags, ')');
    }

    public a(List<String> list) {
        this.requestedFlags = list;
    }

    public final a a(List<String> requestedFlags) {
        return new a(requestedFlags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a a(a aVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = aVar.requestedFlags;
        }
        return aVar.a(list);
    }

    public static final void a(a self, InterfaceC1143c output, f serialDesc) {
        output.C(serialDesc, 0, new C1169d(m0.f26414a, 0), self.requestedFlags);
    }

    public static /* synthetic */ void c() {
    }
}
