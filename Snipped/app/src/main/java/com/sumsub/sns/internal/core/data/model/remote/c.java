package com.sumsub.sns.internal.core.data.model.remote;

import C.v;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.C0967l;
import ka.C0969n;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u0002\u0013\u001cB!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u001aJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ,\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b&\u0010\u0018J \u0010*\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b*\u0010+R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001bR&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u00100\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010\u001d¨\u00064"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/remote/c;", "Landroid/os/Parcelable;", "", "countryCode", "", "masks", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/remote/c;Lqa/c;Lpa/f;)V", "h", "()Lcom/sumsub/sns/internal/core/data/model/remote/c;", "g", "()I", "raw", "(Ljava/lang/String;)Ljava/lang/String;", "()Ljava/lang/String;", "b", "()Ljava/util/List;", "(Ljava/lang/String;Ljava/util/List;)Lcom/sumsub/sns/internal/core/data/model/remote/c;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "c", "getCountryCode$annotations", "()V", "Ljava/util/List;", "e", "getMasks$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class c implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String countryCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final List<String> masks;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<c> CREATOR = new C0214c();

    public static final class a implements InterfaceC1162A<c> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15581a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f15582b;

        static {
            a aVar = new a();
            f15581a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.remote.Mask", aVar, 2);
            pluginGeneratedSerialDescriptor.k("countryCode", true);
            pluginGeneratedSerialDescriptor.k("masks", false);
            f15582b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            i0 i0Var = null;
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
                    obj2 = c2.C(descriptor, 1, new C1169d(m0.f26414a, 0), obj2);
                    i |= 2;
                }
            }
            c2.b(descriptor);
            return new c(i, (String) obj, (List) obj2, i0Var);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            m0 m0Var = m0.f26414a;
            return new InterfaceC1078b[]{C1095a.a(m0Var), new C1169d(m0Var, 0)};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f15582b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, c cVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            c.a(cVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.model.remote.c$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String str, String str2) {
            StringBuilder sb2 = new StringBuilder();
            int length = str2.length();
            for (int i = 0; i < length; i++) {
                char charAt = str2.charAt(i);
                if (Character.isDigit(charAt)) {
                    sb2.append(charAt);
                }
            }
            String sb3 = sb2.toString();
            if (str == null) {
                str = "";
            }
            return C0969n.n0(sb3, str);
        }

        public final InterfaceC1078b<c> serializer() {
            return a.f15581a;
        }

        public Companion() {
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.model.remote.c$c, reason: collision with other inner class name */
    public static final class C0214c implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i) {
            return new c[i];
        }
    }

    public /* synthetic */ c(int i, String str, List list, i0 i0Var) {
        if (2 != (i & 2)) {
            a0.h(i, 2, a.f15581a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.countryCode = null;
        } else {
            this.countryCode = str;
        }
        this.masks = list;
    }

    /* renamed from: a, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final List<String> b() {
        return this.masks;
    }

    public final String c() {
        return this.countryCode;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<String> e() {
        return this.masks;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return kotlin.jvm.internal.f.b(this.countryCode, cVar.countryCode) && kotlin.jvm.internal.f.b(this.masks, cVar.masks);
    }

    public final int g() {
        Object obj;
        Iterator<T> it = this.masks.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int length = ((String) next).length();
                do {
                    Object next2 = it.next();
                    int length2 = ((String) next2).length();
                    if (length < length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            str = "###############";
        }
        StringBuilder sb2 = new StringBuilder();
        int length3 = str.length();
        for (int i = 0; i < length3; i++) {
            char charAt = str.charAt(i);
            if (charAt == '#' || Character.isDigit(charAt)) {
                sb2.append(charAt);
            }
        }
        return (str.length() - sb2.toString().length()) + 17;
    }

    public final c h() {
        List<String> list = this.masks;
        ArrayList arrayList = new ArrayList(P9.n.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C0969n.u0(C0967l.X(C0967l.X(C0967l.X(C0967l.X(C0967l.X(C0967l.X((String) it.next(), "[^0-9]", "#", false), "(", " ", false), ")", " ", false), "-", " ", false), "+", " ", false), "  ", " ", false)).toString());
        }
        return a(this, null, arrayList, 1, null);
    }

    public int hashCode() {
        String str = this.countryCode;
        return this.masks.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Mask(countryCode=");
        sb2.append(this.countryCode);
        sb2.append(", masks=");
        return v.r(sb2, this.masks, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.countryCode);
        parcel.writeStringList(this.masks);
    }

    public c(String str, List<String> list) {
        this.countryCode = str;
        this.masks = list;
    }

    public final c a(String countryCode, List<String> masks) {
        return new c(countryCode, masks);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c a(c cVar, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cVar.countryCode;
        }
        if ((i & 2) != 0) {
            list = cVar.masks;
        }
        return cVar.a(str, list);
    }

    public static final void a(c self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.countryCode != null) {
            output.e(serialDesc, 0, m0.f26414a, self.countryCode);
        }
        output.C(serialDesc, 1, new C1169d(m0.f26414a, 0), self.masks);
    }

    public /* synthetic */ c(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, list);
    }

    public final String a(String raw) {
        return INSTANCE.a(this.countryCode, raw);
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void f() {
    }
}
