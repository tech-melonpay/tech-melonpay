package com.sumsub.sns.internal.core.data.source.applicant.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.videoident.presentation.LanguageSelectionFragment;
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
import ra.O;
import ra.m0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u0002\u0014\u0017B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB?\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J4\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010'\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b'\u0010(R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010-\u0012\u0004\b1\u0010,\u001a\u0004\b0\u0010\u0018¨\u00063"}, d2 = {"Lcom/sumsub/sns/internal/core/data/source/applicant/remote/n;", "Landroid/os/Parcelable;", "", "language", "", "queuePlace", "waitTimeSec", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/source/applicant/remote/n;Lqa/c;Lpa/f;)V", "()Ljava/lang/String;", "b", "()Ljava/lang/Long;", "c", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/sumsub/sns/internal/core/data/source/applicant/remote/n;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "d", "getLanguage$annotations", "()V", "Ljava/lang/Long;", "f", "getQueuePlace$annotations", "h", "getWaitTimeSec$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class n implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String language;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Long queuePlace;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Long waitTimeSec;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<n> CREATOR = new c();

    public static final class a implements InterfaceC1162A<n> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16039a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f16040b;

        static {
            a aVar = new a();
            f16039a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.source.applicant.remote.LanguageInfo", aVar, 3);
            pluginGeneratedSerialDescriptor.k(LanguageSelectionFragment.RESULT_KEY_SELECTED_LANGUAGE, true);
            pluginGeneratedSerialDescriptor.k("queuePlace", true);
            pluginGeneratedSerialDescriptor.k("waitTimeSec", true);
            f16040b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            Object obj = null;
            boolean z10 = true;
            int i = 0;
            Object obj2 = null;
            Object obj3 = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                if (q10 == -1) {
                    z10 = false;
                } else if (q10 == 0) {
                    obj = c2.D(descriptor, 0, m0.f26414a, obj);
                    i |= 1;
                } else if (q10 == 1) {
                    obj2 = c2.D(descriptor, 1, O.f26364a, obj2);
                    i |= 2;
                } else {
                    if (q10 != 2) {
                        throw new UnknownFieldException(q10);
                    }
                    obj3 = c2.D(descriptor, 2, O.f26364a, obj3);
                    i |= 4;
                }
            }
            c2.b(descriptor);
            return new n(i, (String) obj, (Long) obj2, (Long) obj3, (ra.i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            InterfaceC1078b<?> a10 = C1095a.a(m0.f26414a);
            O o10 = O.f26364a;
            return new InterfaceC1078b[]{a10, C1095a.a(o10), C1095a.a(o10)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f16040b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, n nVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            n.a(nVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.source.applicant.remote.n$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<n> serializer() {
            return a.f16039a;
        }

        public Companion() {
        }
    }

    public static final class c implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n createFromParcel(Parcel parcel) {
            return new n(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n[] newArray(int i) {
            return new n[i];
        }
    }

    public n() {
        this((String) null, (Long) null, (Long) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: a, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: b, reason: from getter */
    public final Long getQueuePlace() {
        return this.queuePlace;
    }

    /* renamed from: c, reason: from getter */
    public final Long getWaitTimeSec() {
        return this.waitTimeSec;
    }

    public final String d() {
        return this.language;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof n)) {
            return false;
        }
        n nVar = (n) other;
        return kotlin.jvm.internal.f.b(this.language, nVar.language) && kotlin.jvm.internal.f.b(this.queuePlace, nVar.queuePlace) && kotlin.jvm.internal.f.b(this.waitTimeSec, nVar.waitTimeSec);
    }

    public final Long f() {
        return this.queuePlace;
    }

    public final Long h() {
        return this.waitTimeSec;
    }

    public int hashCode() {
        String str = this.language;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.queuePlace;
        int hashCode2 = (hashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.waitTimeSec;
        return hashCode2 + (l11 != null ? l11.hashCode() : 0);
    }

    public String toString() {
        return "LanguageInfo(language=" + this.language + ", queuePlace=" + this.queuePlace + ", waitTimeSec=" + this.waitTimeSec + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.language);
        Long l10 = this.queuePlace;
        if (l10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l10.longValue());
        }
        Long l11 = this.waitTimeSec;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l11.longValue());
        }
    }

    public /* synthetic */ n(int i, String str, Long l10, Long l11, ra.i0 i0Var) {
        this.language = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.queuePlace = 0L;
        } else {
            this.queuePlace = l10;
        }
        if ((i & 4) == 0) {
            this.waitTimeSec = 0L;
        } else {
            this.waitTimeSec = l11;
        }
    }

    public final n a(String language, Long queuePlace, Long waitTimeSec) {
        return new n(language, queuePlace, waitTimeSec);
    }

    public static /* synthetic */ n a(n nVar, String str, Long l10, Long l11, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nVar.language;
        }
        if ((i & 2) != 0) {
            l10 = nVar.queuePlace;
        }
        if ((i & 4) != 0) {
            l11 = nVar.waitTimeSec;
        }
        return nVar.a(str, l10, l11);
    }

    public static final void a(n self, InterfaceC1143c output, pa.f serialDesc) {
        Long l10;
        Long l11;
        if (output.D() || self.language != null) {
            output.e(serialDesc, 0, m0.f26414a, self.language);
        }
        if (output.D() || (l11 = self.queuePlace) == null || l11.longValue() != 0) {
            output.e(serialDesc, 1, O.f26364a, self.queuePlace);
        }
        if (output.D() || (l10 = self.waitTimeSec) == null || l10.longValue() != 0) {
            output.e(serialDesc, 2, O.f26364a, self.waitTimeSec);
        }
    }

    public n(String str, Long l10, Long l11) {
        this.language = str;
        this.queuePlace = l10;
        this.waitTimeSec = l11;
    }

    public /* synthetic */ n(String str, Long l10, Long l11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0L : l10, (i & 4) != 0 ? 0L : l11);
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void i() {
    }
}
