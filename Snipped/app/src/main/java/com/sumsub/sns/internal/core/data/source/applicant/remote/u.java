package com.sumsub.sns.internal.core.data.source.applicant.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.core.data.source.applicant.remote.x;
import java.util.LinkedHashMap;
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
import ra.InterfaceC1162A;
import ra.K;
import ra.m0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002\u0014\u0017B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB?\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010&\u001a\u00020\u00132\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b&\u0010'R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u0016R4\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010,\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010\u0018\"\u0004\b\u0014\u0010.¨\u00061"}, d2 = {"Lcom/sumsub/sns/internal/core/data/source/applicant/remote/u;", "Landroid/os/Parcelable;", "", "id", "", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/x;", "sections", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/source/applicant/remote/u;Lqa/c;Lpa/f;)V", "()Ljava/lang/String;", "b", "()Ljava/util/Map;", "(Ljava/lang/String;Ljava/util/Map;)Lcom/sumsub/sns/internal/core/data/source/applicant/remote/u;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "c", "getId$annotations", "()V", "Ljava/util/Map;", "e", "(Ljava/util/Map;)V", "getSections$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class u implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Map<String, x> sections;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<u> CREATOR = new c();

    public static final class a implements InterfaceC1162A<u> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16065a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f16066b;

        static {
            a aVar = new a();
            f16065a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.source.applicant.remote.Questionnaire", aVar, 2);
            pluginGeneratedSerialDescriptor.k("id", true);
            pluginGeneratedSerialDescriptor.k("sections", true);
            f16066b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u deserialize(InterfaceC1144d interfaceC1144d) {
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
                    obj = c2.D(descriptor, 0, m0.f26414a, obj);
                    i |= 1;
                } else {
                    if (q10 != 1) {
                        throw new UnknownFieldException(q10);
                    }
                    obj2 = c2.C(descriptor, 1, new K(m0.f26414a, x.a.f16087a), obj2);
                    i |= 2;
                }
            }
            c2.b(descriptor);
            return new u(i, (String) obj, (Map) obj2, i0Var);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            m0 m0Var = m0.f26414a;
            return new InterfaceC1078b[]{C1095a.a(m0Var), new K(m0Var, x.a.f16087a)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f16066b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, u uVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            u.a(uVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.source.applicant.remote.u$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<u> serializer() {
            return a.f16065a;
        }

        public Companion() {
        }
    }

    public static final class c implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), x.CREATOR.createFromParcel(parcel));
            }
            return new u(readString, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u[] newArray(int i) {
            return new u[i];
        }
    }

    public u() {
        this((String) null, (Map) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final Map<String, x> b() {
        return this.sections;
    }

    public final String c() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Map<String, x> e() {
        return this.sections;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof u)) {
            return false;
        }
        u uVar = (u) other;
        return kotlin.jvm.internal.f.b(this.id, uVar.id) && kotlin.jvm.internal.f.b(this.sections, uVar.sections);
    }

    public int hashCode() {
        String str = this.id;
        return this.sections.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "Questionnaire(id=" + this.id + ", sections=" + this.sections + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.id);
        Map<String, x> map = this.sections;
        parcel.writeInt(map.size());
        for (Map.Entry<String, x> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ u(int i, String str, Map map, ra.i0 i0Var) {
        this.id = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.sections = new LinkedHashMap();
        } else {
            this.sections = map;
        }
    }

    public final u a(String id, Map<String, x> sections) {
        return new u(id, sections);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ u a(u uVar, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uVar.id;
        }
        if ((i & 2) != 0) {
            map = uVar.sections;
        }
        return uVar.a(str, map);
    }

    public static final void a(u self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.id != null) {
            output.e(serialDesc, 0, m0.f26414a, self.id);
        }
        if (!output.D() && kotlin.jvm.internal.f.b(self.sections, new LinkedHashMap())) {
            return;
        }
        output.C(serialDesc, 1, new K(m0.f26414a, x.a.f16087a), self.sections);
    }

    public u(String str, Map<String, x> map) {
        this.id = str;
        this.sections = map;
    }

    public final void a(Map<String, x> map) {
        this.sections = map;
    }

    public /* synthetic */ u(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new LinkedHashMap() : map);
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void f() {
    }
}
