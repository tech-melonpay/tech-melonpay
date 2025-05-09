package com.sumsub.sns.internal.core.data.model.remote;

import C.v;
import com.sumsub.sns.internal.core.data.model.IdentitySide;
import com.sumsub.sns.internal.core.data.model.remote.e;
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
import ra.a0;
import ra.i0;
import ra.m0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002\u0014\u0016Bm\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eB\u0081\u0001\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015Jv\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0015J\u0010\u0010 \u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J(\u0010\u0014\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)HÇ\u0001¢\u0006\u0004\b\u0014\u0010,R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010\u0015R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u00103\u0012\u0004\b5\u00100\u001a\u0004\b4\u0010\u0018R(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u00106\u0012\u0004\b8\u00100\u001a\u0004\b7\u0010\u001aR(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u00106\u0012\u0004\b:\u00100\u001a\u0004\b9\u0010\u001aR(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u00106\u0012\u0004\b<\u00100\u001a\u0004\b;\u0010\u001aR*\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010-\u0012\u0004\b?\u00100\u001a\u0004\b=\u0010\u0015\"\u0004\b\u0014\u0010>R\u0011\u0010B\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010D\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bC\u0010A¨\u0006F"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/remote/k;", "", "", "idDocType", "country", "Lcom/sumsub/sns/internal/core/data/model/IdentitySide;", "idDocSubType", "", "warnings", "errors", "Lcom/sumsub/sns/internal/core/data/model/remote/e;", "metadata", "imageId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/IdentitySide;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/IdentitySide;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lra/i0;)V", "a", "()Ljava/lang/String;", "b", "c", "()Lcom/sumsub/sns/internal/core/data/model/IdentitySide;", "d", "()Ljava/util/List;", "e", "f", "g", "(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/data/model/IdentitySide;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/data/model/remote/k;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "(Lcom/sumsub/sns/internal/core/data/model/remote/k;Lqa/c;Lpa/f;)V", "Ljava/lang/String;", "o", "getIdDocType$annotations", "()V", "h", "getCountry$annotations", "Lcom/sumsub/sns/internal/core/data/model/IdentitySide;", "m", "getIdDocSubType$annotations", "Ljava/util/List;", "u", "getWarnings$annotations", "j", "getErrors$annotations", "s", "getMetadata$annotations", "q", "(Ljava/lang/String;)V", "getImageId$annotations", "w", "()Z", "isFatal", "l", "hasErrors", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class k {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String idDocType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String country;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final IdentitySide idDocSubType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final List<String> warnings;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final List<String> errors;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final List<e> metadata;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public String imageId;

    public static final class a implements InterfaceC1162A<k> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15647a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15648b;

        static {
            a aVar = new a();
            f15647a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.remote.RemoteIdDoc", aVar, 7);
            pluginGeneratedSerialDescriptor.k("idDocType", true);
            pluginGeneratedSerialDescriptor.k("country", true);
            pluginGeneratedSerialDescriptor.k("idDocSubType", true);
            pluginGeneratedSerialDescriptor.k("warnings", true);
            pluginGeneratedSerialDescriptor.k("errors", true);
            pluginGeneratedSerialDescriptor.k("metadata", true);
            pluginGeneratedSerialDescriptor.k("imageId", true);
            f15648b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            Object obj = null;
            boolean z10 = true;
            int i = 0;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                switch (q10) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        obj = c2.D(descriptor, 0, m0.f26414a, obj);
                        i |= 1;
                        break;
                    case 1:
                        obj2 = c2.D(descriptor, 1, m0.f26414a, obj2);
                        i |= 2;
                        break;
                    case 2:
                        obj3 = c2.D(descriptor, 2, IdentitySide.a.f15261a, obj3);
                        i |= 4;
                        break;
                    case 3:
                        obj4 = c2.D(descriptor, 3, new C1169d(m0.f26414a, 0), obj4);
                        i |= 8;
                        break;
                    case 4:
                        obj5 = c2.D(descriptor, 4, new C1169d(m0.f26414a, 0), obj5);
                        i |= 16;
                        break;
                    case 5:
                        obj6 = c2.D(descriptor, 5, new C1169d(e.a.f15591a, 0), obj6);
                        i |= 32;
                        break;
                    case 6:
                        obj7 = c2.D(descriptor, 6, m0.f26414a, obj7);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(q10);
                }
            }
            c2.b(descriptor);
            return new k(i, (String) obj, (String) obj2, (IdentitySide) obj3, (List) obj4, (List) obj5, (List) obj6, (String) obj7, (i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            m0 m0Var = m0.f26414a;
            return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(IdentitySide.a.f15261a), C1095a.a(new C1169d(m0Var, 0)), C1095a.a(new C1169d(m0Var, 0)), C1095a.a(new C1169d(e.a.f15591a, 0)), C1095a.a(m0Var)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15648b;
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

    /* renamed from: com.sumsub.sns.internal.core.data.model.remote.k$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<k> serializer() {
            return a.f15647a;
        }

        public Companion() {
        }
    }

    public k() {
        this((String) null, (String) null, (IdentitySide) null, (List) null, (List) null, (List) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* renamed from: a, reason: from getter */
    public final String getIdDocType() {
        return this.idDocType;
    }

    /* renamed from: b, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* renamed from: c, reason: from getter */
    public final IdentitySide getIdDocSubType() {
        return this.idDocSubType;
    }

    public final List<String> d() {
        return this.warnings;
    }

    public final List<String> e() {
        return this.errors;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof k)) {
            return false;
        }
        k kVar = (k) other;
        return kotlin.jvm.internal.f.b(this.idDocType, kVar.idDocType) && kotlin.jvm.internal.f.b(this.country, kVar.country) && this.idDocSubType == kVar.idDocSubType && kotlin.jvm.internal.f.b(this.warnings, kVar.warnings) && kotlin.jvm.internal.f.b(this.errors, kVar.errors) && kotlin.jvm.internal.f.b(this.metadata, kVar.metadata) && kotlin.jvm.internal.f.b(this.imageId, kVar.imageId);
    }

    public final List<e> f() {
        return this.metadata;
    }

    /* renamed from: g, reason: from getter */
    public final String getImageId() {
        return this.imageId;
    }

    public final String h() {
        return this.country;
    }

    public int hashCode() {
        String str = this.idDocType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.country;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        IdentitySide identitySide = this.idDocSubType;
        int hashCode3 = (hashCode2 + (identitySide == null ? 0 : identitySide.hashCode())) * 31;
        List<String> list = this.warnings;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.errors;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<e> list3 = this.metadata;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str3 = this.imageId;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final List<String> j() {
        return this.errors;
    }

    public final boolean l() {
        List<String> list = this.errors;
        boolean z10 = list == null || list.isEmpty();
        List<String> list2 = this.warnings;
        return !(z10 & (list2 == null || list2.isEmpty()));
    }

    public final IdentitySide m() {
        return this.idDocSubType;
    }

    public final String o() {
        return this.idDocType;
    }

    public final String q() {
        return this.imageId;
    }

    public final List<e> s() {
        return this.metadata;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RemoteIdDoc(idDocType=");
        sb2.append(this.idDocType);
        sb2.append(", country=");
        sb2.append(this.country);
        sb2.append(", idDocSubType=");
        sb2.append(this.idDocSubType);
        sb2.append(", warnings=");
        sb2.append(this.warnings);
        sb2.append(", errors=");
        sb2.append(this.errors);
        sb2.append(", metadata=");
        sb2.append(this.metadata);
        sb2.append(", imageId=");
        return v.q(sb2, this.imageId, ')');
    }

    public final List<String> u() {
        return this.warnings;
    }

    public final boolean w() {
        List<String> list = this.errors;
        return !(list == null || list.isEmpty());
    }

    public /* synthetic */ k(int i, String str, String str2, IdentitySide identitySide, List list, List list2, List list3, String str3, i0 i0Var) {
        if ((i & 1) == 0) {
            this.idDocType = null;
        } else {
            this.idDocType = str;
        }
        if ((i & 2) == 0) {
            this.country = null;
        } else {
            this.country = str2;
        }
        if ((i & 4) == 0) {
            this.idDocSubType = null;
        } else {
            this.idDocSubType = identitySide;
        }
        if ((i & 8) == 0) {
            this.warnings = null;
        } else {
            this.warnings = list;
        }
        if ((i & 16) == 0) {
            this.errors = null;
        } else {
            this.errors = list2;
        }
        if ((i & 32) == 0) {
            this.metadata = null;
        } else {
            this.metadata = list3;
        }
        if ((i & 64) == 0) {
            this.imageId = null;
        } else {
            this.imageId = str3;
        }
    }

    public final k a(String idDocType, String country, IdentitySide idDocSubType, List<String> warnings, List<String> errors, List<e> metadata, String imageId) {
        return new k(idDocType, country, idDocSubType, warnings, errors, metadata, imageId);
    }

    public k(String str, String str2, IdentitySide identitySide, List<String> list, List<String> list2, List<e> list3, String str3) {
        this.idDocType = str;
        this.country = str2;
        this.idDocSubType = identitySide;
        this.warnings = list;
        this.errors = list2;
        this.metadata = list3;
        this.imageId = str3;
    }

    public static /* synthetic */ k a(k kVar, String str, String str2, IdentitySide identitySide, List list, List list2, List list3, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kVar.idDocType;
        }
        if ((i & 2) != 0) {
            str2 = kVar.country;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            identitySide = kVar.idDocSubType;
        }
        IdentitySide identitySide2 = identitySide;
        if ((i & 8) != 0) {
            list = kVar.warnings;
        }
        List list4 = list;
        if ((i & 16) != 0) {
            list2 = kVar.errors;
        }
        List list5 = list2;
        if ((i & 32) != 0) {
            list3 = kVar.metadata;
        }
        List list6 = list3;
        if ((i & 64) != 0) {
            str3 = kVar.imageId;
        }
        return kVar.a(str, str4, identitySide2, list4, list5, list6, str3);
    }

    public static final void a(k self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.idDocType != null) {
            output.e(serialDesc, 0, m0.f26414a, self.idDocType);
        }
        if (output.D() || self.country != null) {
            output.e(serialDesc, 1, m0.f26414a, self.country);
        }
        if (output.D() || self.idDocSubType != null) {
            output.e(serialDesc, 2, IdentitySide.a.f15261a, self.idDocSubType);
        }
        if (output.D() || self.warnings != null) {
            output.e(serialDesc, 3, new C1169d(m0.f26414a, 0), self.warnings);
        }
        if (output.D() || self.errors != null) {
            output.e(serialDesc, 4, new C1169d(m0.f26414a, 0), self.errors);
        }
        if (output.D() || self.metadata != null) {
            output.e(serialDesc, 5, new C1169d(e.a.f15591a, 0), self.metadata);
        }
        if (!output.D() && self.imageId == null) {
            return;
        }
        output.e(serialDesc, 6, m0.f26414a, self.imageId);
    }

    public final void a(String str) {
        this.imageId = str;
    }

    public /* synthetic */ k(String str, String str2, IdentitySide identitySide, List list, List list2, List list3, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : identitySide, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? null : str3);
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void n() {
    }

    public static /* synthetic */ void p() {
    }

    public static /* synthetic */ void r() {
    }

    public static /* synthetic */ void t() {
    }

    public static /* synthetic */ void v() {
    }
}
