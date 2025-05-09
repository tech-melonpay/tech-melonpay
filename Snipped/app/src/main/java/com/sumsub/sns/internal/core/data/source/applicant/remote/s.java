package com.sumsub.sns.internal.core.data.source.applicant.remote;

import android.os.Parcel;
import android.os.Parcelable;
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
import ra.H;
import ra.InterfaceC1162A;

@InterfaceC1080d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002\u0010%B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rHÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0012J\u001c\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010\"\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0012¨\u0006)"}, d2 = {"Lcom/sumsub/sns/internal/core/data/source/applicant/remote/s;", "Landroid/os/Parcelable;", "", "codeLength", "<init>", "(Ljava/lang/Integer;)V", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/Integer;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/source/applicant/remote/s;Lqa/c;Lpa/f;)V", "()Ljava/lang/Integer;", "(Ljava/lang/Integer;)Lcom/sumsub/sns/internal/core/data/source/applicant/remote/s;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "b", "getCodeLength$annotations", "()V", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class s implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Integer codeLength;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<s> CREATOR = new c();

    public static final class a implements InterfaceC1162A<s> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16058a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f16059b;

        static {
            a aVar = new a();
            f16058a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.source.applicant.remote.OtpConfirmation", aVar, 1);
            pluginGeneratedSerialDescriptor.k("codeLength", true);
            f16059b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            ra.i0 i0Var = null;
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
                    obj = c2.D(descriptor, 0, H.f26353a, obj);
                    i = 1;
                }
            }
            c2.b(descriptor);
            return new s(i, (Integer) obj, i0Var);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            return new InterfaceC1078b[]{C1095a.a(H.f26353a)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f16059b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, s sVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            s.a(sVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.source.applicant.remote.s$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<s> serializer() {
            return a.f16058a;
        }

        public Companion() {
        }
    }

    public static final class c implements Parcelable.Creator<s> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s createFromParcel(Parcel parcel) {
            return new s(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s[] newArray(int i) {
            return new s[i];
        }
    }

    public s() {
        this((Integer) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* renamed from: a, reason: from getter */
    public final Integer getCodeLength() {
        return this.codeLength;
    }

    public final Integer b() {
        return this.codeLength;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof s) && kotlin.jvm.internal.f.b(this.codeLength, ((s) other).codeLength);
    }

    public int hashCode() {
        Integer num = this.codeLength;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return "OtpConfirmation(codeLength=" + this.codeLength + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        int intValue;
        Integer num = this.codeLength;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }

    public /* synthetic */ s(int i, Integer num, ra.i0 i0Var) {
        if ((i & 1) == 0) {
            this.codeLength = null;
        } else {
            this.codeLength = num;
        }
    }

    public final s a(Integer codeLength) {
        return new s(codeLength);
    }

    public s(Integer num) {
        this.codeLength = num;
    }

    public static /* synthetic */ s a(s sVar, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = sVar.codeLength;
        }
        return sVar.a(num);
    }

    public static final void a(s self, InterfaceC1143c output, pa.f serialDesc) {
        if (!output.D() && self.codeLength == null) {
            return;
        }
        output.e(serialDesc, 0, H.f26353a, self.codeLength);
    }

    public /* synthetic */ s(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }

    public static /* synthetic */ void c() {
    }
}
