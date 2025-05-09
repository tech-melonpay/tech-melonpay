package com.sumsub.sns.internal.core.data.source.applicant.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.core.data.source.applicant.remote.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import oa.C1095a;
import org.bouncycastle.i18n.MessageBundle;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.C1169d;
import ra.C1172g;
import ra.InterfaceC1162A;
import ra.m0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002\u0015\u0017Bm\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fB\u0081\u0001\b\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJv\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0015\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0016J\u0010\u0010\"\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b(\u0010#J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J(\u0010\u0015\u001a\u00020,2\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202HÇ\u0001¢\u0006\u0004\b\u0015\u00104R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u00105\u0012\u0004\b:\u00108\u001a\u0004\b9\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u00105\u0012\u0004\b<\u00108\u001a\u0004\b;\u0010\u0016R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010=\u0012\u0004\b?\u00108\u001a\u0004\b>\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u00105\u0012\u0004\bA\u00108\u001a\u0004\b@\u0010\u0016R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u00105\u0012\u0004\bC\u00108\u001a\u0004\bB\u0010\u0016R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u00105\u0012\u0004\bE\u00108\u001a\u0004\bD\u0010\u0016R(\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010F\u0012\u0004\bH\u00108\u001a\u0004\bG\u0010\u001f¨\u0006J"}, d2 = {"Lcom/sumsub/sns/internal/core/data/source/applicant/remote/w;", "Landroid/os/Parcelable;", "", "internalId", "id", "clientId", "", "modifiable", "createdAt", MessageBundle.TITLE_ENTRY, "desc", "", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/c0;", "sections", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lra/i0;)V", "a", "()Ljava/lang/String;", "b", "c", "d", "()Ljava/lang/Boolean;", "e", "f", "g", "h", "()Ljava/util/List;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/sumsub/sns/internal/core/data/source/applicant/remote/w;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "LO9/p;", "writeToParcel", "(Landroid/os/Parcel;I)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "(Lcom/sumsub/sns/internal/core/data/source/applicant/remote/w;Lqa/c;Lpa/f;)V", "Ljava/lang/String;", "q", "getInternalId$annotations", "()V", "o", "getId$annotations", "i", "getClientId$annotations", "Ljava/lang/Boolean;", "s", "getModifiable$annotations", "k", "getCreatedAt$annotations", "w", "getTitle$annotations", "m", "getDesc$annotations", "Ljava/util/List;", "u", "getSections$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class w implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String internalId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String clientId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final Boolean modifiable;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String createdAt;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final String title;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final String desc;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final List<c0> sections;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<w> CREATOR = new c();

    public static final class a implements InterfaceC1162A<w> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16084a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f16085b;

        static {
            a aVar = new a();
            f16084a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.source.applicant.remote.QuestionnaireResponse", aVar, 8);
            pluginGeneratedSerialDescriptor.k("_id", true);
            pluginGeneratedSerialDescriptor.k("id", true);
            pluginGeneratedSerialDescriptor.k("clientId", true);
            pluginGeneratedSerialDescriptor.k("modifiable", true);
            pluginGeneratedSerialDescriptor.k("createdAt", true);
            pluginGeneratedSerialDescriptor.k(MessageBundle.TITLE_ENTRY, true);
            pluginGeneratedSerialDescriptor.k("desc", true);
            pluginGeneratedSerialDescriptor.k("sections", true);
            f16085b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public w deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            Object obj = null;
            boolean z10 = true;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            int i = 0;
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
                        obj4 = c2.D(descriptor, 3, C1172g.f26395a, obj4);
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
                    case 6:
                        obj7 = c2.D(descriptor, 6, m0.f26414a, obj7);
                        i |= 64;
                        break;
                    case 7:
                        obj8 = c2.D(descriptor, 7, new C1169d(c0.a.f15935a, 0), obj8);
                        i |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(q10);
                }
            }
            c2.b(descriptor);
            return new w(i, (String) obj, (String) obj2, (String) obj3, (Boolean) obj4, (String) obj5, (String) obj6, (String) obj7, (List) obj8, (ra.i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            m0 m0Var = m0.f26414a;
            return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(C1172g.f26395a), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(new C1169d(c0.a.f15935a, 0))};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f16085b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, w wVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            w.a(wVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.source.applicant.remote.w$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<w> serializer() {
            return a.f16084a;
        }

        public Companion() {
        }
    }

    public static final class c implements Parcelable.Creator<w> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            ArrayList arrayList = null;
            Boolean valueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(c0.CREATOR.createFromParcel(parcel));
                }
            }
            return new w(readString, readString2, readString3, valueOf, readString4, readString5, readString6, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w[] newArray(int i) {
            return new w[i];
        }
    }

    public w() {
        this((String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, 255, (DefaultConstructorMarker) null);
    }

    /* renamed from: a, reason: from getter */
    public final String getInternalId() {
        return this.internalId;
    }

    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* renamed from: d, reason: from getter */
    public final Boolean getModifiable() {
        return this.modifiable;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof w)) {
            return false;
        }
        w wVar = (w) other;
        return kotlin.jvm.internal.f.b(this.internalId, wVar.internalId) && kotlin.jvm.internal.f.b(this.id, wVar.id) && kotlin.jvm.internal.f.b(this.clientId, wVar.clientId) && kotlin.jvm.internal.f.b(this.modifiable, wVar.modifiable) && kotlin.jvm.internal.f.b(this.createdAt, wVar.createdAt) && kotlin.jvm.internal.f.b(this.title, wVar.title) && kotlin.jvm.internal.f.b(this.desc, wVar.desc) && kotlin.jvm.internal.f.b(this.sections, wVar.sections);
    }

    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: g, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    public final List<c0> h() {
        return this.sections;
    }

    public int hashCode() {
        String str = this.internalId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clientId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.modifiable;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.createdAt;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.title;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.desc;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<c0> list = this.sections;
        return hashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final String i() {
        return this.clientId;
    }

    public final String k() {
        return this.createdAt;
    }

    public final String m() {
        return this.desc;
    }

    public final String o() {
        return this.id;
    }

    public final String q() {
        return this.internalId;
    }

    public final Boolean s() {
        return this.modifiable;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("QuestionnaireResponse(internalId=");
        sb2.append(this.internalId);
        sb2.append(", id=");
        sb2.append(this.id);
        sb2.append(", clientId=");
        sb2.append(this.clientId);
        sb2.append(", modifiable=");
        sb2.append(this.modifiable);
        sb2.append(", createdAt=");
        sb2.append(this.createdAt);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", desc=");
        sb2.append(this.desc);
        sb2.append(", sections=");
        return C.v.r(sb2, this.sections, ')');
    }

    public final List<c0> u() {
        return this.sections;
    }

    public final String w() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.internalId);
        parcel.writeString(this.id);
        parcel.writeString(this.clientId);
        Boolean bool = this.modifiable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.createdAt);
        parcel.writeString(this.title);
        parcel.writeString(this.desc);
        List<c0> list = this.sections;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<c0> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ w(int i, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, List list, ra.i0 i0Var) {
        if ((i & 1) == 0) {
            this.internalId = null;
        } else {
            this.internalId = str;
        }
        if ((i & 2) == 0) {
            this.id = null;
        } else {
            this.id = str2;
        }
        if ((i & 4) == 0) {
            this.clientId = null;
        } else {
            this.clientId = str3;
        }
        if ((i & 8) == 0) {
            this.modifiable = null;
        } else {
            this.modifiable = bool;
        }
        if ((i & 16) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = str4;
        }
        if ((i & 32) == 0) {
            this.title = null;
        } else {
            this.title = str5;
        }
        if ((i & 64) == 0) {
            this.desc = null;
        } else {
            this.desc = str6;
        }
        if ((i & 128) == 0) {
            this.sections = null;
        } else {
            this.sections = list;
        }
    }

    public final w a(String internalId, String id, String clientId, Boolean modifiable, String createdAt, String title, String desc, List<c0> sections) {
        return new w(internalId, id, clientId, modifiable, createdAt, title, desc, sections);
    }

    public w(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, List<c0> list) {
        this.internalId = str;
        this.id = str2;
        this.clientId = str3;
        this.modifiable = bool;
        this.createdAt = str4;
        this.title = str5;
        this.desc = str6;
        this.sections = list;
    }

    public static final void a(w self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.internalId != null) {
            output.e(serialDesc, 0, m0.f26414a, self.internalId);
        }
        if (output.D() || self.id != null) {
            output.e(serialDesc, 1, m0.f26414a, self.id);
        }
        if (output.D() || self.clientId != null) {
            output.e(serialDesc, 2, m0.f26414a, self.clientId);
        }
        if (output.D() || self.modifiable != null) {
            output.e(serialDesc, 3, C1172g.f26395a, self.modifiable);
        }
        if (output.D() || self.createdAt != null) {
            output.e(serialDesc, 4, m0.f26414a, self.createdAt);
        }
        if (output.D() || self.title != null) {
            output.e(serialDesc, 5, m0.f26414a, self.title);
        }
        if (output.D() || self.desc != null) {
            output.e(serialDesc, 6, m0.f26414a, self.desc);
        }
        if (!output.D() && self.sections == null) {
            return;
        }
        output.e(serialDesc, 7, new C1169d(c0.a.f15935a, 0), self.sections);
    }

    public /* synthetic */ w(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) == 0 ? list : null);
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

    public static /* synthetic */ void t() {
    }

    public static /* synthetic */ void v() {
    }

    public static /* synthetic */ void x() {
    }
}
