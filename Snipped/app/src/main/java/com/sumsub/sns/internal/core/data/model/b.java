package com.sumsub.sns.internal.core.data.model;

import com.google.firebase.analytics.FirebaseAnalytics;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u0000 82\u00020\u0001:\u0002\u0017\u001dBU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBi\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0017\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u001bJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ^\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001cJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010'\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001cR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010)\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010)\u0012\u0004\b0\u0010,\u001a\u0004\b/\u0010\u001cR(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u00101\u0012\u0004\b3\u0010,\u001a\u0004\b2\u0010 R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010)\u0012\u0004\b5\u0010,\u001a\u0004\b4\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010)\u0012\u0004\b7\u0010,\u001a\u0004\b6\u0010\u001c¨\u00069"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/b;", "", "", FirebaseAnalytics.Param.CONTENT, "createdAt", "source", "", "targets", "link", "titleKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/b;Lqa/c;Lpa/f;)V", "other", "", "(Lcom/sumsub/sns/internal/core/data/model/b;)Z", "()Ljava/lang/String;", "b", "c", "d", "()Ljava/util/List;", "e", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/data/model/b;", "toString", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "g", "getContent$annotations", "()V", "i", "getCreatedAt$annotations", "m", "getSource$annotations", "Ljava/util/List;", "o", "getTargets$annotations", "k", "getLink$annotations", "q", "getTitleKey$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class b {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String content;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String createdAt;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String source;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final List<String> targets;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String link;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final String titleKey;

    public static final class a implements InterfaceC1162A<b> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15405a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15406b;

        static {
            a aVar = new a();
            f15405a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.Agreement", aVar, 6);
            pluginGeneratedSerialDescriptor.k(FirebaseAnalytics.Param.CONTENT, true);
            pluginGeneratedSerialDescriptor.k("createdAt", true);
            pluginGeneratedSerialDescriptor.k("source", true);
            pluginGeneratedSerialDescriptor.k("targets", true);
            pluginGeneratedSerialDescriptor.k("link", true);
            pluginGeneratedSerialDescriptor.k("titleKey", true);
            f15406b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b deserialize(InterfaceC1144d interfaceC1144d) {
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
                        obj3 = c2.D(descriptor, 2, m0.f26414a, obj3);
                        i |= 4;
                        break;
                    case 3:
                        obj4 = c2.D(descriptor, 3, new C1169d(m0.f26414a, 0), obj4);
                        i |= 8;
                        break;
                    case 4:
                        obj5 = c2.D(descriptor, 4, m0.f26414a, obj5);
                        i |= 16;
                        break;
                    case 5:
                        obj6 = c2.D(descriptor, 5, m0.f26414a, obj6);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(q10);
                }
            }
            c2.b(descriptor);
            return new b(i, (String) obj, (String) obj2, (String) obj3, (List) obj4, (String) obj5, (String) obj6, (i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            m0 m0Var = m0.f26414a;
            return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(new C1169d(m0Var, 0)), C1095a.a(m0Var), C1095a.a(m0Var)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15406b;
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

    /* renamed from: com.sumsub.sns.internal.core.data.model.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<b> serializer() {
            return a.f15405a;
        }

        public Companion() {
        }
    }

    public b() {
        this((String) null, (String) null, (String) null, (List) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* renamed from: a, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: b, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: c, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final List<String> d() {
        return this.targets;
    }

    /* renamed from: e, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return kotlin.jvm.internal.f.b(this.content, bVar.content) && kotlin.jvm.internal.f.b(this.createdAt, bVar.createdAt) && kotlin.jvm.internal.f.b(this.source, bVar.source) && kotlin.jvm.internal.f.b(this.targets, bVar.targets) && kotlin.jvm.internal.f.b(this.link, bVar.link) && kotlin.jvm.internal.f.b(this.titleKey, bVar.titleKey);
    }

    /* renamed from: f, reason: from getter */
    public final String getTitleKey() {
        return this.titleKey;
    }

    public final String g() {
        return this.content;
    }

    public int hashCode() {
        String str = this.content;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.createdAt;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.source;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.targets;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.link;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.titleKey;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String i() {
        return this.createdAt;
    }

    public final String k() {
        return this.link;
    }

    public final String m() {
        return this.source;
    }

    public final List<String> o() {
        return this.targets;
    }

    public final String q() {
        return this.titleKey;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Agreement(content=");
        sb2.append(this.content);
        sb2.append(", createdAt=");
        sb2.append(this.createdAt);
        sb2.append(", source=");
        sb2.append(this.source);
        sb2.append(", targets=");
        sb2.append(this.targets);
        sb2.append(", link=");
        sb2.append(this.link);
        sb2.append(", titleKey=");
        return C.v.q(sb2, this.titleKey, ')');
    }

    public /* synthetic */ b(int i, String str, String str2, String str3, List list, String str4, String str5, i0 i0Var) {
        if ((i & 1) == 0) {
            this.content = null;
        } else {
            this.content = str;
        }
        if ((i & 2) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = str2;
        }
        if ((i & 4) == 0) {
            this.source = "msdk";
        } else {
            this.source = str3;
        }
        if ((i & 8) == 0) {
            this.targets = null;
        } else {
            this.targets = list;
        }
        if ((i & 16) == 0) {
            this.link = null;
        } else {
            this.link = str4;
        }
        if ((i & 32) == 0) {
            this.titleKey = null;
        } else {
            this.titleKey = str5;
        }
    }

    public final b a(String content, String createdAt, String source, List<String> targets, String link, String titleKey) {
        return new b(content, createdAt, source, targets, link, titleKey);
    }

    public b(String str, String str2, String str3, List<String> list, String str4, String str5) {
        this.content = str;
        this.createdAt = str2;
        this.source = str3;
        this.targets = list;
        this.link = str4;
        this.titleKey = str5;
    }

    public static /* synthetic */ b a(b bVar, String str, String str2, String str3, List list, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.content;
        }
        if ((i & 2) != 0) {
            str2 = bVar.createdAt;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = bVar.source;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            list = bVar.targets;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            str4 = bVar.link;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = bVar.titleKey;
        }
        return bVar.a(str, str6, str7, list2, str8, str5);
    }

    public static final void a(b self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.content != null) {
            output.e(serialDesc, 0, m0.f26414a, self.content);
        }
        if (output.D() || self.createdAt != null) {
            output.e(serialDesc, 1, m0.f26414a, self.createdAt);
        }
        if (output.D() || !kotlin.jvm.internal.f.b(self.source, "msdk")) {
            output.e(serialDesc, 2, m0.f26414a, self.source);
        }
        if (output.D() || self.targets != null) {
            output.e(serialDesc, 3, new C1169d(m0.f26414a, 0), self.targets);
        }
        if (output.D() || self.link != null) {
            output.e(serialDesc, 4, m0.f26414a, self.link);
        }
        if (!output.D() && self.titleKey == null) {
            return;
        }
        output.e(serialDesc, 5, m0.f26414a, self.titleKey);
    }

    public final boolean a(b other) {
        return kotlin.jvm.internal.f.b(other.targets, this.targets) && kotlin.jvm.internal.f.b(other.content, this.content) && kotlin.jvm.internal.f.b(other.link, this.link);
    }

    public /* synthetic */ b(String str, String str2, String str3, List list, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "msdk" : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }

    public static /* synthetic */ void h() {
    }

    public static /* synthetic */ void j() {
    }

    public static /* synthetic */ void l() {
    }

    public static /* synthetic */ void n() {
    }

    public static /* synthetic */ void p() {
    }

    public static /* synthetic */ void r() {
    }
}
