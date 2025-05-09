package com.sumsub.sns.internal.core.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import ka.C0966k;
import ka.C0969n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import pa.e;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

@InterfaceC1080d(with = Companion.a.class)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\r\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/p;", "Landroid/os/Parcelable;", "<init>", "()V", "Companion", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "Lcom/sumsub/sns/internal/core/data/model/p$a;", "Lcom/sumsub/sns/internal/core/data/model/p$b;", "Lcom/sumsub/sns/internal/core/data/model/p$c;", "Lcom/sumsub/sns/internal/core/data/model/p$d;", "Lcom/sumsub/sns/internal/core/data/model/p$f;", "Lcom/sumsub/sns/internal/core/data/model/p$g;", "Lcom/sumsub/sns/internal/core/data/model/p$h;", "Lcom/sumsub/sns/internal/core/data/model/p$i;", "Lcom/sumsub/sns/internal/core/data/model/p$j;", "Lcom/sumsub/sns/internal/core/data/model/p$k;", "Lcom/sumsub/sns/internal/core/data/model/p$l;", "Lcom/sumsub/sns/internal/core/data/model/p$m;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class p implements Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public static final String f15541a = ":";

    /* renamed from: b, reason: collision with root package name */
    public static final String f15542b = "min_value";

    /* renamed from: c, reason: collision with root package name */
    public static final String f15543c = "android_tetxt_cap_words";

    /* renamed from: d, reason: collision with root package name */
    public static final String f15544d = "email";

    public static final class a extends p {

        /* renamed from: e, reason: collision with root package name */
        public static final a f15545e = new a();
        public static final Parcelable.Creator<a> CREATOR = new C0211a();

        /* renamed from: com.sumsub.sns.internal.core.data.model.p$a$a, reason: collision with other inner class name */
        public static final class C0211a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                parcel.readInt();
                return a.f15545e;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        public a() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public static final class b extends p {

        /* renamed from: e, reason: collision with root package name */
        public static final b f15546e = new b();
        public static final Parcelable.Creator<b> CREATOR = new a();

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                parcel.readInt();
                return b.f15546e;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        public b() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public static final class c extends p {

        /* renamed from: e, reason: collision with root package name */
        public static final c f15547e = new c();
        public static final Parcelable.Creator<c> CREATOR = new a();

        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                parcel.readInt();
                return c.f15547e;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i) {
                return new c[i];
            }
        }

        public c() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public static final class d extends p {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.data.source.applicant.remote.h f15548e;

        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                return new d(com.sumsub.sns.internal.core.data.source.applicant.remote.h.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i) {
                return new d[i];
            }
        }

        public d(com.sumsub.sns.internal.core.data.source.applicant.remote.h hVar) {
            super(null);
            this.f15548e = hVar;
        }

        public final com.sumsub.sns.internal.core.data.source.applicant.remote.h a() {
            return this.f15548e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f15548e.writeToParcel(parcel, i);
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.model.p$e, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: com.sumsub.sns.internal.core.data.model.p$e$a */
        public static final class a implements InterfaceC1078b<p> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f15549a = new a();

            /* renamed from: b, reason: collision with root package name */
            public static final pa.f f15550b = kotlinx.serialization.descriptors.a.a("FieldFormat", e.i.f25738a);

            @Override // na.InterfaceC1081e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(InterfaceC1145e interfaceC1145e, p pVar) {
            }

            @Override // na.InterfaceC1081e, na.InterfaceC1077a
            public pa.f getDescriptor() {
                return f15550b;
            }

            @Override // na.InterfaceC1077a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public p deserialize(InterfaceC1144d interfaceC1144d) {
                return p.INSTANCE.a(interfaceC1144d.p());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p a(String str) {
            if (str == null) {
                return null;
            }
            List r02 = C0969n.r0(str, new String[]{p.f15541a});
            if (r02.size() == 1) {
                String str2 = (String) r02.get(0);
                switch (str2.hashCode()) {
                    case -2000413939:
                        if (str2.equals("numeric")) {
                            return k.f15556e;
                        }
                        return null;
                    case -1626286546:
                        if (str2.equals("alpha_spaces")) {
                            return a.f15545e;
                        }
                        return null;
                    case -59614510:
                        if (str2.equals("validPhone")) {
                            return m.f15558e;
                        }
                        return null;
                    case 96619420:
                        if (str2.equals("email")) {
                            return b.f15546e;
                        }
                        return null;
                    case 572016716:
                        if (str2.equals(p.f15543c)) {
                            return c.f15547e;
                        }
                        return null;
                    default:
                        return null;
                }
            }
            if (r02.size() != 2) {
                return null;
            }
            String str3 = (String) r02.get(0);
            String str4 = (String) r02.get(1);
            switch (str3.hashCode()) {
                case -232128810:
                    if (!str3.equals("max_value")) {
                        return null;
                    }
                    Double R = C0966k.R(str4);
                    return new h(R != null ? R.doubleValue() : Double.MAX_VALUE);
                case -216634360:
                    if (!str3.equals("between")) {
                        return null;
                    }
                    List r03 = C0969n.r0(str4, new String[]{","});
                    Double R2 = C0966k.R((String) r03.get(0));
                    double doubleValue = R2 != null ? R2.doubleValue() : Double.MIN_VALUE;
                    Double R4 = C0966k.R((String) r03.get(1));
                    return new d(new com.sumsub.sns.internal.core.data.source.applicant.remote.h(doubleValue, R4 != null ? R4.doubleValue() : Double.MAX_VALUE));
                case 107876:
                    if (!str3.equals("max")) {
                        return null;
                    }
                    Integer S = C0966k.S(str4);
                    return new g(S != null ? S.intValue() : Integer.MAX_VALUE);
                case 108114:
                    if (!str3.equals("min")) {
                        return null;
                    }
                    Integer S4 = C0966k.S(str4);
                    return new i(S4 != null ? S4.intValue() : Integer.MIN_VALUE);
                case 108392519:
                    if (str3.equals("regex")) {
                        return new l(str4);
                    }
                    return null;
                case 540349764:
                    if (!str3.equals(p.f15542b)) {
                        return null;
                    }
                    Double R10 = C0966k.R(str4);
                    return new j(R10 != null ? R10.doubleValue() : Double.MIN_VALUE);
                default:
                    return null;
            }
        }

        public final InterfaceC1078b<p> serializer() {
            return a.f15549a;
        }

        public Companion() {
        }
    }

    public static final class f extends p {

        /* renamed from: e, reason: collision with root package name */
        public static final f f15551e = new f();
        public static final Parcelable.Creator<f> CREATOR = new a();

        public static final class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f createFromParcel(Parcel parcel) {
                parcel.readInt();
                return f.f15551e;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f[] newArray(int i) {
                return new f[i];
            }
        }

        public f() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public static final class g extends p {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        public final int f15552e;

        public static final class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                return new g(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i) {
                return new g[i];
            }
        }

        public g(int i) {
            super(null);
            this.f15552e = i;
        }

        public final int a() {
            return this.f15552e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f15552e);
        }
    }

    public static final class h extends p {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        public final double f15553e;

        public static final class a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h createFromParcel(Parcel parcel) {
                return new h(parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h[] newArray(int i) {
                return new h[i];
            }
        }

        public h(double d10) {
            super(null);
            this.f15553e = d10;
        }

        public final double a() {
            return this.f15553e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeDouble(this.f15553e);
        }
    }

    public static final class i extends p {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        public final int f15554e;

        public static final class a implements Parcelable.Creator<i> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i createFromParcel(Parcel parcel) {
                return new i(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i[] newArray(int i) {
                return new i[i];
            }
        }

        public i(int i) {
            super(null);
            this.f15554e = i;
        }

        public final int a() {
            return this.f15554e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f15554e);
        }
    }

    public static final class j extends p {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        public final double f15555e;

        public static final class a implements Parcelable.Creator<j> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j createFromParcel(Parcel parcel) {
                return new j(parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j[] newArray(int i) {
                return new j[i];
            }
        }

        public j(double d10) {
            super(null);
            this.f15555e = d10;
        }

        public final double a() {
            return this.f15555e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeDouble(this.f15555e);
        }
    }

    public static final class k extends p {

        /* renamed from: e, reason: collision with root package name */
        public static final k f15556e = new k();
        public static final Parcelable.Creator<k> CREATOR = new a();

        public static final class a implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k createFromParcel(Parcel parcel) {
                parcel.readInt();
                return k.f15556e;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k[] newArray(int i) {
                return new k[i];
            }
        }

        public k() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public static final class l extends p {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        public final String f15557e;

        public static final class a implements Parcelable.Creator<l> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l createFromParcel(Parcel parcel) {
                return new l(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l[] newArray(int i) {
                return new l[i];
            }
        }

        public l(String str) {
            super(null);
            this.f15557e = str;
        }

        public final String a() {
            return this.f15557e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f15557e);
        }
    }

    public static final class m extends p {

        /* renamed from: e, reason: collision with root package name */
        public static final m f15558e = new m();
        public static final Parcelable.Creator<m> CREATOR = new a();

        public static final class a implements Parcelable.Creator<m> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m createFromParcel(Parcel parcel) {
                parcel.readInt();
                return m.f15558e;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m[] newArray(int i) {
                return new m[i];
            }
        }

        public m() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public p() {
    }
}
