package com.sumsub.sns.internal.core.data.source.applicant.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ImagesContract;
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
import ra.m0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002\u0013\u0016B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J4\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010%\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b%\u0010&R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0015R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010'\u0012\u0004\b.\u0010*\u001a\u0004\b-\u0010\u0015¨\u00060"}, d2 = {"Lcom/sumsub/sns/internal/core/data/source/applicant/remote/i;", "Landroid/os/Parcelable;", "", "mobileToken", ImagesContract.URL, "hash", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/source/applicant/remote/i;Lqa/c;Lpa/f;)V", "()Ljava/lang/String;", "b", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/data/source/applicant/remote/i;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "f", "getMobileToken$annotations", "()V", "h", "getUrl$annotations", "d", "getHash$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class i implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String mobileToken;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String url;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String hash;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<i> CREATOR = new c();

    public static final class a implements InterfaceC1162A<i> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16016a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f16017b;

        static {
            a aVar = new a();
            f16016a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.source.applicant.remote.EidConfirmation", aVar, 3);
            pluginGeneratedSerialDescriptor.k("mobileToken", true);
            pluginGeneratedSerialDescriptor.k(ImagesContract.URL, true);
            pluginGeneratedSerialDescriptor.k("hash", true);
            f16017b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i deserialize(InterfaceC1144d interfaceC1144d) {
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
                    obj2 = c2.D(descriptor, 1, m0.f26414a, obj2);
                    i |= 2;
                } else {
                    if (q10 != 2) {
                        throw new UnknownFieldException(q10);
                    }
                    obj3 = c2.D(descriptor, 2, m0.f26414a, obj3);
                    i |= 4;
                }
            }
            c2.b(descriptor);
            return new i(i, (String) obj, (String) obj2, (String) obj3, (ra.i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            m0 m0Var = m0.f26414a;
            return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f16017b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, i iVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            i.a(iVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.source.applicant.remote.i$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<i> serializer() {
            return a.f16016a;
        }

        public Companion() {
        }
    }

    public static final class c implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i createFromParcel(Parcel parcel) {
            return new i(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i[] newArray(int i) {
            return new i[i];
        }
    }

    public i() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: a, reason: from getter */
    public final String getMobileToken() {
        return this.mobileToken;
    }

    /* renamed from: b, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: c, reason: from getter */
    public final String getHash() {
        return this.hash;
    }

    public final String d() {
        return this.hash;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof i)) {
            return false;
        }
        i iVar = (i) other;
        return kotlin.jvm.internal.f.b(this.mobileToken, iVar.mobileToken) && kotlin.jvm.internal.f.b(this.url, iVar.url) && kotlin.jvm.internal.f.b(this.hash, iVar.hash);
    }

    public final String f() {
        return this.mobileToken;
    }

    public final String h() {
        return this.url;
    }

    public int hashCode() {
        String str = this.mobileToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hash;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EidConfirmation(mobileToken=");
        sb2.append(this.mobileToken);
        sb2.append(", url=");
        sb2.append(this.url);
        sb2.append(", hash=");
        return C.v.q(sb2, this.hash, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.mobileToken);
        parcel.writeString(this.url);
        parcel.writeString(this.hash);
    }

    public /* synthetic */ i(int i, String str, String str2, String str3, ra.i0 i0Var) {
        if ((i & 1) == 0) {
            this.mobileToken = null;
        } else {
            this.mobileToken = str;
        }
        if ((i & 2) == 0) {
            this.url = null;
        } else {
            this.url = str2;
        }
        if ((i & 4) == 0) {
            this.hash = null;
        } else {
            this.hash = str3;
        }
    }

    public final i a(String mobileToken, String url, String hash) {
        return new i(mobileToken, url, hash);
    }

    public i(String str, String str2, String str3) {
        this.mobileToken = str;
        this.url = str2;
        this.hash = str3;
    }

    public static /* synthetic */ i a(i iVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iVar.mobileToken;
        }
        if ((i & 2) != 0) {
            str2 = iVar.url;
        }
        if ((i & 4) != 0) {
            str3 = iVar.hash;
        }
        return iVar.a(str, str2, str3);
    }

    public static final void a(i self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.mobileToken != null) {
            output.e(serialDesc, 0, m0.f26414a, self.mobileToken);
        }
        if (output.D() || self.url != null) {
            output.e(serialDesc, 1, m0.f26414a, self.url);
        }
        if (!output.D() && self.hash == null) {
            return;
        }
        output.e(serialDesc, 2, m0.f26414a, self.hash);
    }

    public /* synthetic */ i(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void i() {
    }
}
