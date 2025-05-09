package com.sumsub.sns.internal.core.data.source.applicant.remote;

import android.os.Parcel;
import android.os.Parcelable;
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
import ra.m0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002\u0013\u0016B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0015J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010%\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b%\u0010&R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0015R(\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010+\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010\u0017¨\u0006/"}, d2 = {"Lcom/sumsub/sns/internal/core/data/source/applicant/remote/v;", "Landroid/os/Parcelable;", "", "value", "", "values", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/source/applicant/remote/v;Lqa/c;Lpa/f;)V", "()Ljava/lang/String;", "b", "()Ljava/util/List;", "(Ljava/lang/String;Ljava/util/List;)Lcom/sumsub/sns/internal/core/data/source/applicant/remote/v;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "c", "getValue$annotations", "()V", "Ljava/util/List;", "e", "getValues$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class v implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final List<String> values;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<v> CREATOR = new c();

    public static final class a implements InterfaceC1162A<v> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16074a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f16075b;

        static {
            a aVar = new a();
            f16074a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.source.applicant.remote.QuestionnaireItem", aVar, 2);
            pluginGeneratedSerialDescriptor.k("value", true);
            pluginGeneratedSerialDescriptor.k("values", true);
            f16075b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v deserialize(InterfaceC1144d interfaceC1144d) {
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
                    obj2 = c2.D(descriptor, 1, new C1169d(m0.f26414a, 0), obj2);
                    i |= 2;
                }
            }
            c2.b(descriptor);
            return new v(i, (String) obj, (List) obj2, i0Var);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            m0 m0Var = m0.f26414a;
            return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(new C1169d(m0Var, 0))};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f16075b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
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

    /* renamed from: com.sumsub.sns.internal.core.data.source.applicant.remote.v$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<v> serializer() {
            return a.f16074a;
        }

        public Companion() {
        }
    }

    public static final class c implements Parcelable.Creator<v> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v createFromParcel(Parcel parcel) {
            return new v(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v[] newArray(int i) {
            return new v[i];
        }
    }

    public v() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final List<String> b() {
        return this.values;
    }

    public final String c() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<String> e() {
        return this.values;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof v)) {
            return false;
        }
        v vVar = (v) other;
        return kotlin.jvm.internal.f.b(this.value, vVar.value) && kotlin.jvm.internal.f.b(this.values, vVar.values);
    }

    public int hashCode() {
        String str = this.value;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.values;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("QuestionnaireItem(value=");
        sb2.append(this.value);
        sb2.append(", values=");
        return C.v.r(sb2, this.values, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.value);
        parcel.writeStringList(this.values);
    }

    public /* synthetic */ v(int i, String str, List list, ra.i0 i0Var) {
        if ((i & 1) == 0) {
            this.value = null;
        } else {
            this.value = str;
        }
        if ((i & 2) == 0) {
            this.values = null;
        } else {
            this.values = list;
        }
    }

    public final v a(String value, List<String> values) {
        return new v(value, values);
    }

    public v(String str, List<String> list) {
        this.value = str;
        this.values = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ v a(v vVar, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vVar.value;
        }
        if ((i & 2) != 0) {
            list = vVar.values;
        }
        return vVar.a(str, list);
    }

    public static final void a(v self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.value != null) {
            output.e(serialDesc, 0, m0.f26414a, self.value);
        }
        if (!output.D() && self.values == null) {
            return;
        }
        output.e(serialDesc, 1, new C1169d(m0.f26414a, 0), self.values);
    }

    public /* synthetic */ v(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void f() {
    }
}
