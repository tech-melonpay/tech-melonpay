package com.sumsub.sns.internal.core.data.model.remote;

import C.v;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002\u0015\u0018B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tBQ\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ>\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010$\u0012\u0004\b+\u0010'\u001a\u0004\b*\u0010\u0017R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010,\u0012\u0004\b.\u0010'\u001a\u0004\b-\u0010\u001b¨\u00060"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/remote/b;", "", "", "imageId", "country", "idDocType", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/remote/b;Lqa/c;Lpa/f;)V", "()Ljava/lang/String;", "b", "c", "d", "()Ljava/util/List;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/sumsub/sns/internal/core/data/model/remote/b;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "k", "getImageId$annotations", "()V", "e", "getCountry$annotations", "i", "getIdDocType$annotations", "Ljava/util/List;", "g", "getData$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class b {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String imageId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String country;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String idDocType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final List<String> data;

    public static final class a implements InterfaceC1162A<b> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15577a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15578b;

        static {
            a aVar = new a();
            f15577a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.remote.MRTDData", aVar, 4);
            pluginGeneratedSerialDescriptor.k("imageId", false);
            pluginGeneratedSerialDescriptor.k("country", false);
            pluginGeneratedSerialDescriptor.k("idDocType", false);
            pluginGeneratedSerialDescriptor.k(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, false);
            f15578b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            Object obj = null;
            boolean z10 = true;
            int i = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                if (q10 == -1) {
                    z10 = false;
                } else if (q10 == 0) {
                    str = c2.y(descriptor, 0);
                    i |= 1;
                } else if (q10 == 1) {
                    str2 = c2.y(descriptor, 1);
                    i |= 2;
                } else if (q10 == 2) {
                    str3 = c2.y(descriptor, 2);
                    i |= 4;
                } else {
                    if (q10 != 3) {
                        throw new UnknownFieldException(q10);
                    }
                    obj = c2.C(descriptor, 3, new C1169d(m0.f26414a, 0), obj);
                    i |= 8;
                }
            }
            c2.b(descriptor);
            return new b(i, str, str2, str3, (List) obj, null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            m0 m0Var = m0.f26414a;
            return new InterfaceC1078b[]{m0Var, m0Var, m0Var, new C1169d(m0Var, 0)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15578b;
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

    /* renamed from: com.sumsub.sns.internal.core.data.model.remote.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<b> serializer() {
            return a.f15577a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ b(int i, String str, String str2, String str3, List list, i0 i0Var) {
        if (15 != (i & 15)) {
            a0.h(i, 15, a.f15577a.getDescriptor());
            throw null;
        }
        this.imageId = str;
        this.country = str2;
        this.idDocType = str3;
        this.data = list;
    }

    /* renamed from: a, reason: from getter */
    public final String getImageId() {
        return this.imageId;
    }

    /* renamed from: b, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* renamed from: c, reason: from getter */
    public final String getIdDocType() {
        return this.idDocType;
    }

    public final List<String> d() {
        return this.data;
    }

    public final String e() {
        return this.country;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return kotlin.jvm.internal.f.b(this.imageId, bVar.imageId) && kotlin.jvm.internal.f.b(this.country, bVar.country) && kotlin.jvm.internal.f.b(this.idDocType, bVar.idDocType) && kotlin.jvm.internal.f.b(this.data, bVar.data);
    }

    public final List<String> g() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode() + v.c(v.c(this.imageId.hashCode() * 31, 31, this.country), 31, this.idDocType);
    }

    public final String i() {
        return this.idDocType;
    }

    public final String k() {
        return this.imageId;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MRTDData(imageId=");
        sb2.append(this.imageId);
        sb2.append(", country=");
        sb2.append(this.country);
        sb2.append(", idDocType=");
        sb2.append(this.idDocType);
        sb2.append(", data=");
        return v.r(sb2, this.data, ')');
    }

    public b(String str, String str2, String str3, List<String> list) {
        this.imageId = str;
        this.country = str2;
        this.idDocType = str3;
        this.data = list;
    }

    public final b a(String imageId, String country, String idDocType, List<String> data) {
        return new b(imageId, country, idDocType, data);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b a(b bVar, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.imageId;
        }
        if ((i & 2) != 0) {
            str2 = bVar.country;
        }
        if ((i & 4) != 0) {
            str3 = bVar.idDocType;
        }
        if ((i & 8) != 0) {
            list = bVar.data;
        }
        return bVar.a(str, str2, str3, list);
    }

    public static final void a(b self, InterfaceC1143c output, pa.f serialDesc) {
        output.x(serialDesc, 0, self.imageId);
        output.x(serialDesc, 1, self.country);
        output.x(serialDesc, 2, self.idDocType);
        output.C(serialDesc, 3, new C1169d(m0.f26414a, 0), self.data);
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
