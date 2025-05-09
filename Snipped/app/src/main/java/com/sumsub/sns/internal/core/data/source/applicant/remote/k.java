package com.sumsub.sns.internal.core.data.source.applicant.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.core.data.source.applicant.remote.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002\u0016\u0018By\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010B\u008d\u0001\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0082\u0001\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0016\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0017J\u0010\u0010$\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b*\u0010%J \u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b/\u00100J(\u0010\u0016\u001a\u00020.2\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204HÇ\u0001¢\u0006\u0004\b\u0016\u00106R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u00107\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u00107\u0012\u0004\b<\u0010:\u001a\u0004\b;\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u00107\u0012\u0004\b>\u0010:\u001a\u0004\b=\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u00107\u0012\u0004\b@\u0010:\u001a\u0004\b?\u0010\u0017R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010A\u0012\u0004\bC\u0010:\u001a\u0004\bB\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u00107\u0012\u0004\bE\u0010:\u001a\u0004\bD\u0010\u0017R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u00107\u0012\u0004\bG\u0010:\u001a\u0004\bF\u0010\u0017R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u00107\u0012\u0004\bI\u0010:\u001a\u0004\bH\u0010\u0017R(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010J\u0012\u0004\bL\u0010:\u001a\u0004\bK\u0010!¨\u0006N"}, d2 = {"Lcom/sumsub/sns/internal/core/data/source/applicant/remote/k;", "Landroid/os/Parcelable;", "", "id", MessageBundle.TITLE_ENTRY, "desc", "type", "", "required", "format", "placeholder", "condition", "", "Lcom/sumsub/sns/internal/core/data/source/applicant/remote/r;", "options", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lra/i0;)V", "a", "()Ljava/lang/String;", "b", "c", "d", "e", "()Ljava/lang/Boolean;", "f", "g", "h", "i", "()Ljava/util/List;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/sumsub/sns/internal/core/data/source/applicant/remote/k;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "LO9/p;", "writeToParcel", "(Landroid/os/Parcel;I)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "(Lcom/sumsub/sns/internal/core/data/source/applicant/remote/k;Lqa/c;Lpa/f;)V", "Ljava/lang/String;", "p", "getId$annotations", "()V", "x", "getTitle$annotations", "l", "getDesc$annotations", "z", "getType$annotations", "Ljava/lang/Boolean;", "v", "getRequired$annotations", "n", "getFormat$annotations", "t", "getPlaceholder$annotations", "j", "getCondition$annotations", "Ljava/util/List;", "r", "getOptions$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class k implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String desc;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String type;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final Boolean required;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final String format;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final String placeholder;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final String condition;

    /* renamed from: i, reason: from kotlin metadata */
    public final List<r> options;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<k> CREATOR = new c();

    public static final class a implements InterfaceC1162A<k> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16032a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f16033b;

        static {
            a aVar = new a();
            f16032a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.source.applicant.remote.Item", aVar, 9);
            pluginGeneratedSerialDescriptor.k("id", true);
            pluginGeneratedSerialDescriptor.k(MessageBundle.TITLE_ENTRY, true);
            pluginGeneratedSerialDescriptor.k("desc", true);
            pluginGeneratedSerialDescriptor.k("type", true);
            pluginGeneratedSerialDescriptor.k("required", true);
            pluginGeneratedSerialDescriptor.k("format", true);
            pluginGeneratedSerialDescriptor.k("placeholder", true);
            pluginGeneratedSerialDescriptor.k("condition", true);
            pluginGeneratedSerialDescriptor.k("options", true);
            f16033b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            Object obj = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            boolean z10 = true;
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
                        obj4 = c2.D(descriptor, 3, m0.f26414a, obj4);
                        i |= 8;
                        break;
                    case 4:
                        obj5 = c2.D(descriptor, 4, C1172g.f26395a, obj5);
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
                        obj8 = c2.D(descriptor, 7, m0.f26414a, obj8);
                        i |= 128;
                        break;
                    case 8:
                        obj9 = c2.D(descriptor, 8, new C1169d(r.a.f16055a, 0), obj9);
                        i |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(q10);
                }
            }
            c2.b(descriptor);
            return new k(i, (String) obj, (String) obj2, (String) obj3, (String) obj4, (Boolean) obj5, (String) obj6, (String) obj7, (String) obj8, (List) obj9, (ra.i0) null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            m0 m0Var = m0.f26414a;
            return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(C1172g.f26395a), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(new C1169d(r.a.f16055a, 0))};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f16033b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
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

    /* renamed from: com.sumsub.sns.internal.core.data.source.applicant.remote.k$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<k> serializer() {
            return a.f16032a;
        }

        public Companion() {
        }
    }

    public static final class c implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            ArrayList arrayList = null;
            Boolean valueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(r.CREATOR.createFromParcel(parcel));
                }
            }
            return new k(readString, readString2, readString3, readString4, valueOf, readString5, readString6, readString7, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k[] newArray(int i) {
            return new k[i];
        }
    }

    public k() {
        this((String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, 511, (DefaultConstructorMarker) null);
    }

    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: c, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* renamed from: d, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final Boolean getRequired() {
        return this.required;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof k)) {
            return false;
        }
        k kVar = (k) other;
        return kotlin.jvm.internal.f.b(this.id, kVar.id) && kotlin.jvm.internal.f.b(this.title, kVar.title) && kotlin.jvm.internal.f.b(this.desc, kVar.desc) && kotlin.jvm.internal.f.b(this.type, kVar.type) && kotlin.jvm.internal.f.b(this.required, kVar.required) && kotlin.jvm.internal.f.b(this.format, kVar.format) && kotlin.jvm.internal.f.b(this.placeholder, kVar.placeholder) && kotlin.jvm.internal.f.b(this.condition, kVar.condition) && kotlin.jvm.internal.f.b(this.options, kVar.options);
    }

    /* renamed from: f, reason: from getter */
    public final String getFormat() {
        return this.format;
    }

    /* renamed from: g, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: h, reason: from getter */
    public final String getCondition() {
        return this.condition;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.required;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.format;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.placeholder;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.condition;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<r> list = this.options;
        return hashCode8 + (list != null ? list.hashCode() : 0);
    }

    public final List<r> i() {
        return this.options;
    }

    public final String j() {
        return this.condition;
    }

    public final String l() {
        return this.desc;
    }

    public final String n() {
        return this.format;
    }

    public final String p() {
        return this.id;
    }

    public final List<r> r() {
        return this.options;
    }

    public final String t() {
        return this.placeholder;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Item(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", desc=");
        sb2.append(this.desc);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", required=");
        sb2.append(this.required);
        sb2.append(", format=");
        sb2.append(this.format);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", condition=");
        sb2.append(this.condition);
        sb2.append(", options=");
        return C.v.r(sb2, this.options, ')');
    }

    public final Boolean v() {
        return this.required;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.desc);
        parcel.writeString(this.type);
        Boolean bool = this.required;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.format);
        parcel.writeString(this.placeholder);
        parcel.writeString(this.condition);
        List<r> list = this.options;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<r> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public final String x() {
        return this.title;
    }

    public final String z() {
        return this.type;
    }

    public k(int i, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, List list, ra.i0 i0Var) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.desc = null;
        } else {
            this.desc = str3;
        }
        if ((i & 8) == 0) {
            this.type = null;
        } else {
            this.type = str4;
        }
        if ((i & 16) == 0) {
            this.required = null;
        } else {
            this.required = bool;
        }
        if ((i & 32) == 0) {
            this.format = null;
        } else {
            this.format = str5;
        }
        if ((i & 64) == 0) {
            this.placeholder = null;
        } else {
            this.placeholder = str6;
        }
        if ((i & 128) == 0) {
            this.condition = null;
        } else {
            this.condition = str7;
        }
        if ((i & 256) == 0) {
            this.options = EmptyList.f23104a;
        } else {
            this.options = list;
        }
    }

    public final k a(String id, String title, String desc, String type, Boolean required, String format, String placeholder, String condition, List<r> options) {
        return new k(id, title, desc, type, required, format, placeholder, condition, options);
    }

    public static final void a(k self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.id != null) {
            output.e(serialDesc, 0, m0.f26414a, self.id);
        }
        if (output.D() || self.title != null) {
            output.e(serialDesc, 1, m0.f26414a, self.title);
        }
        if (output.D() || self.desc != null) {
            output.e(serialDesc, 2, m0.f26414a, self.desc);
        }
        if (output.D() || self.type != null) {
            output.e(serialDesc, 3, m0.f26414a, self.type);
        }
        if (output.D() || self.required != null) {
            output.e(serialDesc, 4, C1172g.f26395a, self.required);
        }
        if (output.D() || self.format != null) {
            output.e(serialDesc, 5, m0.f26414a, self.format);
        }
        if (output.D() || self.placeholder != null) {
            output.e(serialDesc, 6, m0.f26414a, self.placeholder);
        }
        if (output.D() || self.condition != null) {
            output.e(serialDesc, 7, m0.f26414a, self.condition);
        }
        if (!output.D() && kotlin.jvm.internal.f.b(self.options, EmptyList.f23104a)) {
            return;
        }
        output.e(serialDesc, 8, new C1169d(r.a.f16055a, 0), self.options);
    }

    public k(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, List<r> list) {
        this.id = str;
        this.title = str2;
        this.desc = str3;
        this.type = str4;
        this.required = bool;
        this.format = str5;
        this.placeholder = str6;
        this.condition = str7;
        this.options = list;
    }

    public k(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) == 0 ? str7 : null, (i & 256) != 0 ? EmptyList.f23104a : list);
    }

    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void m() {
    }

    public static /* synthetic */ void o() {
    }

    public static /* synthetic */ void q() {
    }

    public static /* synthetic */ void s() {
    }

    public static /* synthetic */ void u() {
    }

    public static /* synthetic */ void w() {
    }

    public static /* synthetic */ void y() {
    }
}
