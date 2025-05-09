package com.sumsub.sns.internal.core.data.source.applicant.remote;

import android.os.Parcel;
import android.os.Parcelable;
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
import ra.InterfaceC1162A;
import ra.m0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002\u0013\u0016B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010%\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0015R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0015R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010'\u0012\u0004\b.\u0010*\u001a\u0004\b-\u0010\u0015¨\u00060"}, d2 = {"Lcom/sumsub/sns/internal/core/data/source/applicant/remote/a0;", "Landroid/os/Parcelable;", "", "targetType", "identifierType", "identifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/source/applicant/remote/a0;Lqa/c;Lpa/f;)V", "()Ljava/lang/String;", "b", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/data/source/applicant/remote/a0;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "h", "getTargetType$annotations", "()V", "f", "getIdentifierType$annotations", "d", "getIdentifier$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class a0 implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String targetType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String identifierType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String identifier;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<a0> CREATOR = new c();

    public static final class a implements InterfaceC1162A<a0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15912a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15913b;

        static {
            a aVar = new a();
            f15912a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.source.applicant.remote.RequestCode", aVar, 3);
            pluginGeneratedSerialDescriptor.k("targetType", false);
            pluginGeneratedSerialDescriptor.k("identifierType", false);
            pluginGeneratedSerialDescriptor.k("identifier", false);
            f15913b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a0 deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            int i = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            boolean z10 = true;
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
                } else {
                    if (q10 != 2) {
                        throw new UnknownFieldException(q10);
                    }
                    str3 = c2.y(descriptor, 2);
                    i |= 4;
                }
            }
            c2.b(descriptor);
            return new a0(i, str, str2, str3, null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            m0 m0Var = m0.f26414a;
            return new InterfaceC1078b[]{m0Var, m0Var, m0Var};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15913b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, a0 a0Var) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            a0.a(a0Var, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.source.applicant.remote.a0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<a0> serializer() {
            return a.f15912a;
        }

        public Companion() {
        }
    }

    public static final class c implements Parcelable.Creator<a0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a0 createFromParcel(Parcel parcel) {
            return new a0(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a0[] newArray(int i) {
            return new a0[i];
        }
    }

    public /* synthetic */ a0(int i, String str, String str2, String str3, ra.i0 i0Var) {
        if (7 != (i & 7)) {
            ra.a0.h(i, 7, a.f15912a.getDescriptor());
            throw null;
        }
        this.targetType = str;
        this.identifierType = str2;
        this.identifier = str3;
    }

    /* renamed from: a, reason: from getter */
    public final String getTargetType() {
        return this.targetType;
    }

    /* renamed from: b, reason: from getter */
    public final String getIdentifierType() {
        return this.identifierType;
    }

    /* renamed from: c, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    public final String d() {
        return this.identifier;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) other;
        return kotlin.jvm.internal.f.b(this.targetType, a0Var.targetType) && kotlin.jvm.internal.f.b(this.identifierType, a0Var.identifierType) && kotlin.jvm.internal.f.b(this.identifier, a0Var.identifier);
    }

    public final String f() {
        return this.identifierType;
    }

    public final String h() {
        return this.targetType;
    }

    public int hashCode() {
        return this.identifier.hashCode() + C.v.c(this.targetType.hashCode() * 31, 31, this.identifierType);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RequestCode(targetType=");
        sb2.append(this.targetType);
        sb2.append(", identifierType=");
        sb2.append(this.identifierType);
        sb2.append(", identifier=");
        return C.v.q(sb2, this.identifier, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.targetType);
        parcel.writeString(this.identifierType);
        parcel.writeString(this.identifier);
    }

    public a0(String str, String str2, String str3) {
        this.targetType = str;
        this.identifierType = str2;
        this.identifier = str3;
    }

    public final a0 a(String targetType, String identifierType, String identifier) {
        return new a0(targetType, identifierType, identifier);
    }

    public static /* synthetic */ a0 a(a0 a0Var, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = a0Var.targetType;
        }
        if ((i & 2) != 0) {
            str2 = a0Var.identifierType;
        }
        if ((i & 4) != 0) {
            str3 = a0Var.identifier;
        }
        return a0Var.a(str, str2, str3);
    }

    public static final void a(a0 self, InterfaceC1143c output, pa.f serialDesc) {
        output.x(serialDesc, 0, self.targetType);
        output.x(serialDesc, 1, self.identifierType);
        output.x(serialDesc, 2, self.identifier);
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void i() {
    }
}
