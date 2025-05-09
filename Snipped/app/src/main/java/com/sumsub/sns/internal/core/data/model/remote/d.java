package com.sumsub.sns.internal.core.data.model.remote;

import C.v;
import com.sumsub.sns.internal.core.data.model.remote.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
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
import ra.a0;
import ra.i0;
import ra.m0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002\u0016\u0019B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nBQ\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJB\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010%\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u0018R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010-\u0012\u0004\b/\u0010(\u001a\u0004\b.\u0010\u001c¨\u00061"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/remote/d;", "", "", "id", "email", "phone", "", "Lcom/sumsub/sns/internal/core/data/model/remote/e;", "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/remote/d;Lqa/c;Lpa/f;)V", "()Ljava/lang/String;", "b", "c", "d", "()Ljava/util/List;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/sumsub/sns/internal/core/data/model/remote/d;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "g", "getId$annotations", "()V", "e", "getEmail$annotations", "k", "getPhone$annotations", "Ljava/util/List;", "i", "getMetadata$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class d {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String email;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String phone;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final List<e> metadata;

    public static final class a implements InterfaceC1162A<d> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15587a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15588b;

        static {
            a aVar = new a();
            f15587a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.remote.Metadata", aVar, 4);
            pluginGeneratedSerialDescriptor.k("id", false);
            pluginGeneratedSerialDescriptor.k("email", true);
            pluginGeneratedSerialDescriptor.k("phone", true);
            pluginGeneratedSerialDescriptor.k("metadata", true);
            f15588b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            Object obj = null;
            boolean z10 = true;
            int i = 0;
            Object obj2 = null;
            Object obj3 = null;
            String str = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                if (q10 == -1) {
                    z10 = false;
                } else if (q10 == 0) {
                    str = c2.y(descriptor, 0);
                    i |= 1;
                } else if (q10 == 1) {
                    obj = c2.D(descriptor, 1, m0.f26414a, obj);
                    i |= 2;
                } else if (q10 == 2) {
                    obj2 = c2.D(descriptor, 2, m0.f26414a, obj2);
                    i |= 4;
                } else {
                    if (q10 != 3) {
                        throw new UnknownFieldException(q10);
                    }
                    obj3 = c2.C(descriptor, 3, new C1169d(e.a.f15591a, 0), obj3);
                    i |= 8;
                }
            }
            c2.b(descriptor);
            return new d(i, str, (String) obj, (String) obj2, (List) obj3, (i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            m0 m0Var = m0.f26414a;
            return new InterfaceC1078b[]{m0Var, C1095a.a(m0Var), C1095a.a(m0Var), new C1169d(e.a.f15591a, 0)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15588b;
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

    /* renamed from: com.sumsub.sns.internal.core.data.model.remote.d$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<d> serializer() {
            return a.f15587a;
        }

        public Companion() {
        }
    }

    public d(int i, String str, String str2, String str3, List list, i0 i0Var) {
        if (1 != (i & 1)) {
            a0.h(i, 1, a.f15587a.getDescriptor());
            throw null;
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.email = null;
        } else {
            this.email = str2;
        }
        if ((i & 4) == 0) {
            this.phone = null;
        } else {
            this.phone = str3;
        }
        if ((i & 8) == 0) {
            this.metadata = EmptyList.f23104a;
        } else {
            this.metadata = list;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: b, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: c, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public final List<e> d() {
        return this.metadata;
    }

    public final String e() {
        return this.email;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof d)) {
            return false;
        }
        d dVar = (d) other;
        return kotlin.jvm.internal.f.b(this.id, dVar.id) && kotlin.jvm.internal.f.b(this.email, dVar.email) && kotlin.jvm.internal.f.b(this.phone, dVar.phone) && kotlin.jvm.internal.f.b(this.metadata, dVar.metadata);
    }

    public final String g() {
        return this.id;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.email;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phone;
        return this.metadata.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final List<e> i() {
        return this.metadata;
    }

    public final String k() {
        return this.phone;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Metadata(id=");
        sb2.append(this.id);
        sb2.append(", email=");
        sb2.append(this.email);
        sb2.append(", phone=");
        sb2.append(this.phone);
        sb2.append(", metadata=");
        return v.r(sb2, this.metadata, ')');
    }

    public final d a(String id, String email, String phone, List<e> metadata) {
        return new d(id, email, phone, metadata);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ d a(d dVar, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dVar.id;
        }
        if ((i & 2) != 0) {
            str2 = dVar.email;
        }
        if ((i & 4) != 0) {
            str3 = dVar.phone;
        }
        if ((i & 8) != 0) {
            list = dVar.metadata;
        }
        return dVar.a(str, str2, str3, list);
    }

    public static final void a(d self, InterfaceC1143c output, pa.f serialDesc) {
        output.x(serialDesc, 0, self.id);
        if (output.D() || self.email != null) {
            output.e(serialDesc, 1, m0.f26414a, self.email);
        }
        if (output.D() || self.phone != null) {
            output.e(serialDesc, 2, m0.f26414a, self.phone);
        }
        if (!output.D() && kotlin.jvm.internal.f.b(self.metadata, EmptyList.f23104a)) {
            return;
        }
        output.C(serialDesc, 3, new C1169d(e.a.f15591a, 0), self.metadata);
    }

    public d(String str, String str2, String str3, List<e> list) {
        this.id = str;
        this.email = str2;
        this.phone = str3;
        this.metadata = list;
    }

    public d(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? EmptyList.f23104a : list);
    }

    public static /* synthetic */ void f() {
    }

    public static /* synthetic */ void h() {
    }

    public static /* synthetic */ void j() {
    }

    public static /* synthetic */ void l() {
    }
}
