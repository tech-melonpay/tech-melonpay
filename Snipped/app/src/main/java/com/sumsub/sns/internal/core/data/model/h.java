package com.sumsub.sns.internal.core.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import ca.InterfaceC0635a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.sumsub.sns.internal.core.data.model.FieldName;
import com.sumsub.sns.internal.core.data.model.p;
import ia.InterfaceC0835c;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import oa.C1095a;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.C1169d;
import ra.C1172g;
import ra.InterfaceC1162A;
import ra.a0;
import ra.i0;
import ra.m0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00162\u00020\u0001:\u0004\u0014\u0012\u0017\u0018B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013\u0082\u0001\u0003\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/h;", "", "<init>", "()V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/h;Lqa/c;Lpa/f;)V", "", "c", "()Ljava/lang/String;", "b", "formItemId", "Companion", "d", "e", "Lcom/sumsub/sns/internal/core/data/model/h$c;", "Lcom/sumsub/sns/internal/core/data/model/h$d;", "Lcom/sumsub/sns/internal/core/data/model/h$e;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public static final O9.f<InterfaceC1078b<Object>> f15489a = kotlin.a.b(LazyThreadSafetyMode.f23086b, a.f15490a);

    public static final class a extends Lambda implements InterfaceC0635a<InterfaceC1078b<Object>> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15490a = new a();

        public a() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1078b<Object> invoke() {
            return new kotlinx.serialization.c("com.sumsub.sns.internal.core.data.model.ApplicantDataField", kotlin.jvm.internal.h.a(h.class), new InterfaceC0835c[]{kotlin.jvm.internal.h.a(c.class), kotlin.jvm.internal.h.a(d.class)}, new InterfaceC1078b[]{c.a.f15494a, d.a.f15503a}, new Annotation[0]);
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.model.h$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ O9.f a() {
            return h.f15489a;
        }

        public final InterfaceC1078b<h> serializer() {
            return (InterfaceC1078b) a().getValue();
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u0000 62\u00020\u00012\u00020\u0002:\u0002\u0015*B%\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB?\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ4\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ \u0010(\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b(\u0010)R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010+\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u00102\u0012\u0004\b4\u0010.\u001a\u0004\b3\u0010\u001bR\u0014\u00105\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0018¨\u00067"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/h$c;", "Lcom/sumsub/sns/internal/core/data/model/h;", "Landroid/os/Parcelable;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "displayName", "", "isRequired", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/h$c;Lqa/c;Lpa/f;)V", "d", "()Ljava/lang/String;", "e", "f", "()Ljava/lang/Boolean;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/sumsub/sns/internal/core/data/model/h$c;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/lang/String;", "i", "getName$annotations", "()V", "c", "g", "getDisplayName$annotations", "Ljava/lang/Boolean;", "k", "isRequired$annotations", "formItemId", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC1080d
    public static final /* data */ class c extends h implements Parcelable {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final String name;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final String displayName;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final Boolean isRequired;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<c> CREATOR = new C0207c();

        public static final class a implements InterfaceC1162A<c> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f15494a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ pa.f f15495b;

            static {
                a aVar = new a();
                f15494a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.ApplicantDataField.CustomField", aVar, 3);
                pluginGeneratedSerialDescriptor.k(AppMeasurementSdk.ConditionalUserProperty.NAME, false);
                pluginGeneratedSerialDescriptor.k("displayName", false);
                pluginGeneratedSerialDescriptor.k("required", false);
                f15495b = pluginGeneratedSerialDescriptor;
            }

            @Override // na.InterfaceC1077a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c deserialize(InterfaceC1144d interfaceC1144d) {
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
                        obj3 = c2.D(descriptor, 2, C1172g.f26395a, obj3);
                        i |= 4;
                    }
                }
                c2.b(descriptor);
                return new c(i, (String) obj, (String) obj2, (Boolean) obj3, null);
            }

            @Override // ra.InterfaceC1162A
            public InterfaceC1078b<?>[] childSerializers() {
                m0 m0Var = m0.f26414a;
                return new InterfaceC1078b[]{C1095a.a(m0Var), C1095a.a(m0Var), C1095a.a(C1172g.f26395a)};
            }

            @Override // na.InterfaceC1081e, na.InterfaceC1077a
            public pa.f getDescriptor() {
                return f15495b;
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

        /* renamed from: com.sumsub.sns.internal.core.data.model.h$c$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC1078b<c> serializer() {
                return a.f15494a;
            }

            public Companion() {
            }
        }

        /* renamed from: com.sumsub.sns.internal.core.data.model.h$c$c, reason: collision with other inner class name */
        public static final class C0207c implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                Boolean valueOf;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new c(readString, readString2, valueOf);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i) {
                return new c[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(int i, String str, String str2, Boolean bool, i0 i0Var) {
            super(i, i0Var);
            if (7 != (i & 7)) {
                a0.h(i, 7, a.f15494a.getDescriptor());
                throw null;
            }
            this.name = str;
            this.displayName = str2;
            this.isRequired = bool;
        }

        public final c a(String name, String displayName, Boolean isRequired) {
            return new c(name, displayName, isRequired);
        }

        @Override // com.sumsub.sns.internal.core.data.model.h
        public String b() {
            String str = this.name;
            return str == null ? "" : str;
        }

        /* renamed from: d, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: e, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return kotlin.jvm.internal.f.b(this.name, cVar.name) && kotlin.jvm.internal.f.b(this.displayName, cVar.displayName) && kotlin.jvm.internal.f.b(this.isRequired, cVar.isRequired);
        }

        /* renamed from: f, reason: from getter */
        public final Boolean getIsRequired() {
            return this.isRequired;
        }

        public final String g() {
            return this.displayName;
        }

        public int hashCode() {
            String str = this.name;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.displayName;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.isRequired;
            return hashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final String i() {
            return this.name;
        }

        public final Boolean k() {
            return this.isRequired;
        }

        public String toString() {
            return "CustomField(name=" + this.name + ", displayName=" + this.displayName + ", isRequired=" + this.isRequired + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            int i;
            parcel.writeString(this.name);
            parcel.writeString(this.displayName);
            Boolean bool = this.isRequired;
            if (bool == null) {
                i = 0;
            } else {
                parcel.writeInt(1);
                i = bool.booleanValue();
            }
            parcel.writeInt(i);
        }

        public c(String str, String str2, Boolean bool) {
            super(null);
            this.name = str;
            this.displayName = str2;
            this.isRequired = bool;
        }

        public static /* synthetic */ c a(c cVar, String str, String str2, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.name;
            }
            if ((i & 2) != 0) {
                str2 = cVar.displayName;
            }
            if ((i & 4) != 0) {
                bool = cVar.isRequired;
            }
            return cVar.a(str, str2, bool);
        }

        public static final void a(c self, InterfaceC1143c output, pa.f serialDesc) {
            h.a(self, output, serialDesc);
            m0 m0Var = m0.f26414a;
            output.e(serialDesc, 0, m0Var, self.name);
            output.e(serialDesc, 1, m0Var, self.displayName);
            output.e(serialDesc, 2, C1172g.f26395a, self.isRequired);
        }

        public static /* synthetic */ void h() {
        }

        public static /* synthetic */ void j() {
        }

        public static /* synthetic */ void l() {
        }
    }

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 Z2\u00020\u00012\u00020\u0002:\u0002%;B[\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011Bs\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010\u0018Jh\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b.\u0010)J \u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b3\u00104J(\u0010%\u001a\u0002022\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208HÇ\u0001¢\u0006\u0004\b%\u0010:R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b>\u0010?\u001a\u0004\b=\u0010\u001aR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010@\u0012\u0004\bB\u0010?\u001a\u0004\bA\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010C\u0012\u0004\bE\u0010?\u001a\u0004\bD\u0010\u001eR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010F\u0012\u0004\bH\u0010?\u001a\u0004\bG\u0010\u0018R(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010I\u0012\u0004\bK\u0010?\u001a\u0004\bJ\u0010!R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010L\u0012\u0004\bN\u0010?\u001a\u0004\bM\u0010#R\"\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010F\u0012\u0004\bP\u0010?\u001a\u0004\bO\u0010\u0018R\u0011\u0010R\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bQ\u0010\u001cR\u0011\u0010T\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bS\u0010\u001cR\u0011\u0010V\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bU\u0010\u001cR\u0011\u0010X\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bW\u0010\u001cR\u0014\u0010Y\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0018¨\u0006["}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/h$d;", "Lcom/sumsub/sns/internal/core/data/model/h;", "Landroid/os/Parcelable;", "Lcom/sumsub/sns/internal/core/data/model/FieldName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "isRequired", "Lcom/sumsub/sns/internal/core/data/model/FieldType;", "type", "", "mask", "", "masks", "Lcom/sumsub/sns/internal/core/data/model/p;", "format", "placeholder", "<init>", "(Lcom/sumsub/sns/internal/core/data/model/FieldName;ZLcom/sumsub/sns/internal/core/data/model/FieldType;Ljava/lang/String;Ljava/util/List;Lcom/sumsub/sns/internal/core/data/model/p;Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILcom/sumsub/sns/internal/core/data/model/FieldName;ZLcom/sumsub/sns/internal/core/data/model/FieldType;Ljava/lang/String;Ljava/util/List;Lcom/sumsub/sns/internal/core/data/model/p;Ljava/lang/String;Lra/i0;)V", "c", "()Ljava/lang/String;", "d", "()Lcom/sumsub/sns/internal/core/data/model/FieldName;", "e", "()Z", "f", "()Lcom/sumsub/sns/internal/core/data/model/FieldType;", "g", "h", "()Ljava/util/List;", "i", "()Lcom/sumsub/sns/internal/core/data/model/p;", "j", "a", "(Lcom/sumsub/sns/internal/core/data/model/FieldName;ZLcom/sumsub/sns/internal/core/data/model/FieldType;Ljava/lang/String;Ljava/util/List;Lcom/sumsub/sns/internal/core/data/model/p;Ljava/lang/String;)Lcom/sumsub/sns/internal/core/data/model/h$d;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "LO9/p;", "writeToParcel", "(Landroid/os/Parcel;I)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "(Lcom/sumsub/sns/internal/core/data/model/h$d;Lqa/c;Lpa/f;)V", "b", "Lcom/sumsub/sns/internal/core/data/model/FieldName;", "q", "getName$annotations", "()V", "Z", "A", "isRequired$annotations", "Lcom/sumsub/sns/internal/core/data/model/FieldType;", "u", "getType$annotations", "Ljava/lang/String;", "m", "getMask$annotations", "Ljava/util/List;", "o", "getMasks$annotations", "Lcom/sumsub/sns/internal/core/data/model/p;", "k", "getFormat$annotations", "s", "getPlaceholder$annotations", "x", "isCoreRelated", "w", "isAddressRelated", "z", "isInfoRelated", "y", "isDateRelated", "formItemId", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC1080d
    public static final /* data */ class d extends h implements Parcelable {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final FieldName name;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final boolean isRequired;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final FieldType type;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final String mask;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final List<String> masks;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        public final p format;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        public final String placeholder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<d> CREATOR = new c();

        public static final class a implements InterfaceC1162A<d> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f15503a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ pa.f f15504b;

            static {
                a aVar = new a();
                f15503a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.model.ApplicantDataField.Field", aVar, 7);
                pluginGeneratedSerialDescriptor.k(AppMeasurementSdk.ConditionalUserProperty.NAME, false);
                pluginGeneratedSerialDescriptor.k("required", false);
                pluginGeneratedSerialDescriptor.k("type", true);
                pluginGeneratedSerialDescriptor.k("mask", true);
                pluginGeneratedSerialDescriptor.k("masks", true);
                pluginGeneratedSerialDescriptor.k("format", true);
                pluginGeneratedSerialDescriptor.k("placeholder", true);
                f15504b = pluginGeneratedSerialDescriptor;
            }

            @Override // na.InterfaceC1077a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d deserialize(InterfaceC1144d interfaceC1144d) {
                pa.f descriptor = getDescriptor();
                InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
                Object obj = null;
                boolean z10 = true;
                int i = 0;
                boolean z11 = false;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                while (z10) {
                    int q10 = c2.q(descriptor);
                    switch (q10) {
                        case -1:
                            z10 = false;
                            break;
                        case 0:
                            obj = c2.D(descriptor, 0, FieldName.Companion.C0200a.f15259a, obj);
                            i |= 1;
                            break;
                        case 1:
                            z11 = c2.w(descriptor, 1);
                            i |= 2;
                            break;
                        case 2:
                            obj2 = c2.D(descriptor, 2, new EnumSerializer("com.sumsub.sns.internal.core.data.model.FieldType", FieldType.values()), obj2);
                            i |= 4;
                            break;
                        case 3:
                            obj3 = c2.D(descriptor, 3, m0.f26414a, obj3);
                            i |= 8;
                            break;
                        case 4:
                            obj4 = c2.D(descriptor, 4, new C1169d(m0.f26414a, 0), obj4);
                            i |= 16;
                            break;
                        case 5:
                            obj5 = c2.D(descriptor, 5, p.Companion.a.f15549a, obj5);
                            i |= 32;
                            break;
                        case 6:
                            obj6 = c2.D(descriptor, 6, m0.f26414a, obj6);
                            i |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(q10);
                    }
                }
                c2.b(descriptor);
                return new d(i, (FieldName) obj, z11, (FieldType) obj2, (String) obj3, (List) obj4, (p) obj5, (String) obj6, (i0) null);
            }

            @Override // ra.InterfaceC1162A
            public InterfaceC1078b<?>[] childSerializers() {
                InterfaceC1078b<?> a10 = C1095a.a(FieldName.Companion.C0200a.f15259a);
                InterfaceC1078b<?> a11 = C1095a.a(new EnumSerializer("com.sumsub.sns.internal.core.data.model.FieldType", FieldType.values()));
                m0 m0Var = m0.f26414a;
                return new InterfaceC1078b[]{a10, C1172g.f26395a, a11, C1095a.a(m0Var), C1095a.a(new C1169d(m0Var, 0)), C1095a.a(p.Companion.a.f15549a), C1095a.a(m0Var)};
            }

            @Override // na.InterfaceC1081e, na.InterfaceC1077a
            public pa.f getDescriptor() {
                return f15504b;
            }

            @Override // ra.InterfaceC1162A
            public InterfaceC1078b<?>[] typeParametersSerializers() {
                return a0.f26382b;
            }

            @Override // na.InterfaceC1081e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(InterfaceC1145e interfaceC1145e, d dVar) {
                pa.f descriptor = getDescriptor();
                InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
                d.a(dVar, c2, descriptor);
                c2.b(descriptor);
            }
        }

        /* renamed from: com.sumsub.sns.internal.core.data.model.h$d$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC1078b<d> serializer() {
                return a.f15503a;
            }

            public Companion() {
            }
        }

        public static final class c implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                return new d(parcel.readInt() == 0 ? null : FieldName.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : FieldType.valueOf(parcel.readString()), parcel.readString(), parcel.createStringArrayList(), (p) parcel.readParcelable(d.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i) {
                return new d[i];
            }
        }

        /* renamed from: com.sumsub.sns.internal.core.data.model.h$d$d, reason: collision with other inner class name */
        public /* synthetic */ class C0208d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f15505a;

            static {
                int[] iArr = new int[FieldName.values().length];
                iArr[FieldName.country.ordinal()] = 1;
                iArr[FieldName.street.ordinal()] = 2;
                iArr[FieldName.subStreet.ordinal()] = 3;
                iArr[FieldName.buildingNumber.ordinal()] = 4;
                iArr[FieldName.flatNumber.ordinal()] = 5;
                iArr[FieldName.town.ordinal()] = 6;
                iArr[FieldName.state.ordinal()] = 7;
                iArr[FieldName.postCode.ordinal()] = 8;
                f15505a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(int i, FieldName fieldName, boolean z10, FieldType fieldType, String str, List list, p pVar, String str2, i0 i0Var) {
            super(i, i0Var);
            if (3 != (i & 3)) {
                a0.h(i, 3, a.f15503a.getDescriptor());
                throw null;
            }
            this.name = fieldName;
            this.isRequired = z10;
            if ((i & 4) == 0) {
                this.type = null;
            } else {
                this.type = fieldType;
            }
            if ((i & 8) == 0) {
                this.mask = null;
            } else {
                this.mask = str;
            }
            if ((i & 16) == 0) {
                this.masks = null;
            } else {
                this.masks = list;
            }
            if ((i & 32) == 0) {
                this.format = null;
            } else {
                this.format = pVar;
            }
            if ((i & 64) == 0) {
                this.placeholder = null;
            } else {
                this.placeholder = str2;
            }
        }

        /* renamed from: A, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        public final d a(FieldName name, boolean isRequired, FieldType type, String mask, List<String> masks, p format, String placeholder) {
            return new d(name, isRequired, type, mask, masks, format, placeholder);
        }

        @Override // com.sumsub.sns.internal.core.data.model.h
        public String b() {
            String value;
            FieldName fieldName = this.name;
            return (fieldName == null || (value = fieldName.getValue()) == null) ? "" : value;
        }

        @Override // com.sumsub.sns.internal.core.data.model.h
        public String c() {
            return com.sumsub.sns.internal.core.common.i.a(this) + ", name=" + this.name + ", type=" + this.type;
        }

        /* renamed from: d, reason: from getter */
        public final FieldName getName() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.isRequired;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return this.name == dVar.name && this.isRequired == dVar.isRequired && this.type == dVar.type && kotlin.jvm.internal.f.b(this.mask, dVar.mask) && kotlin.jvm.internal.f.b(this.masks, dVar.masks) && kotlin.jvm.internal.f.b(this.format, dVar.format) && kotlin.jvm.internal.f.b(this.placeholder, dVar.placeholder);
        }

        /* renamed from: f, reason: from getter */
        public final FieldType getType() {
            return this.type;
        }

        /* renamed from: g, reason: from getter */
        public final String getMask() {
            return this.mask;
        }

        public final List<String> h() {
            return this.masks;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            FieldName fieldName = this.name;
            int hashCode = (fieldName == null ? 0 : fieldName.hashCode()) * 31;
            boolean z10 = this.isRequired;
            int i = z10;
            if (z10 != 0) {
                i = 1;
            }
            int i9 = (hashCode + i) * 31;
            FieldType fieldType = this.type;
            int hashCode2 = (i9 + (fieldType == null ? 0 : fieldType.hashCode())) * 31;
            String str = this.mask;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            List<String> list = this.masks;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            p pVar = this.format;
            int hashCode5 = (hashCode4 + (pVar == null ? 0 : pVar.hashCode())) * 31;
            String str2 = this.placeholder;
            return hashCode5 + (str2 != null ? str2.hashCode() : 0);
        }

        /* renamed from: i, reason: from getter */
        public final p getFormat() {
            return this.format;
        }

        /* renamed from: j, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final p k() {
            return this.format;
        }

        public final String m() {
            return this.mask;
        }

        public final List<String> o() {
            return this.masks;
        }

        public final FieldName q() {
            return this.name;
        }

        public final String s() {
            return this.placeholder;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Field(name=");
            sb2.append(this.name);
            sb2.append(", isRequired=");
            sb2.append(this.isRequired);
            sb2.append(", type=");
            sb2.append(this.type);
            sb2.append(", mask=");
            sb2.append(this.mask);
            sb2.append(", masks=");
            sb2.append(this.masks);
            sb2.append(", format=");
            sb2.append(this.format);
            sb2.append(", placeholder=");
            return C.v.q(sb2, this.placeholder, ')');
        }

        public final FieldType u() {
            return this.type;
        }

        public final boolean w() {
            FieldName fieldName = this.name;
            switch (fieldName == null ? -1 : C0208d.f15505a[fieldName.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return true;
                default:
                    return false;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            FieldName fieldName = this.name;
            if (fieldName == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(fieldName.name());
            }
            parcel.writeInt(this.isRequired ? 1 : 0);
            FieldType fieldType = this.type;
            if (fieldType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(fieldType.name());
            }
            parcel.writeString(this.mask);
            parcel.writeStringList(this.masks);
            parcel.writeParcelable(this.format, flags);
            parcel.writeString(this.placeholder);
        }

        public final boolean x() {
            String value;
            FieldName fieldName = this.name;
            if (fieldName == null || (value = fieldName.getValue()) == null) {
                return false;
            }
            return i.a(value);
        }

        public final boolean y() {
            FieldName fieldName = this.name;
            return fieldName == FieldName.dob || fieldName == FieldName.issuedDate || this.type == FieldType.date;
        }

        public final boolean z() {
            return (x() || w()) ? false : true;
        }

        public /* synthetic */ d(FieldName fieldName, boolean z10, FieldType fieldType, String str, List list, p pVar, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(fieldName, z10, (i & 4) != 0 ? null : fieldType, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : pVar, (i & 64) != 0 ? null : str2);
        }

        public static /* synthetic */ d a(d dVar, FieldName fieldName, boolean z10, FieldType fieldType, String str, List list, p pVar, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                fieldName = dVar.name;
            }
            if ((i & 2) != 0) {
                z10 = dVar.isRequired;
            }
            boolean z11 = z10;
            if ((i & 4) != 0) {
                fieldType = dVar.type;
            }
            FieldType fieldType2 = fieldType;
            if ((i & 8) != 0) {
                str = dVar.mask;
            }
            String str3 = str;
            if ((i & 16) != 0) {
                list = dVar.masks;
            }
            List list2 = list;
            if ((i & 32) != 0) {
                pVar = dVar.format;
            }
            p pVar2 = pVar;
            if ((i & 64) != 0) {
                str2 = dVar.placeholder;
            }
            return dVar.a(fieldName, z11, fieldType2, str3, list2, pVar2, str2);
        }

        public d(FieldName fieldName, boolean z10, FieldType fieldType, String str, List<String> list, p pVar, String str2) {
            super(null);
            this.name = fieldName;
            this.isRequired = z10;
            this.type = fieldType;
            this.mask = str;
            this.masks = list;
            this.format = pVar;
            this.placeholder = str2;
        }

        public static final void a(d self, InterfaceC1143c output, pa.f serialDesc) {
            h.a(self, output, serialDesc);
            output.e(serialDesc, 0, FieldName.Companion.C0200a.f15259a, self.name);
            output.v(serialDesc, 1, self.isRequired);
            if (output.D() || self.type != null) {
                output.e(serialDesc, 2, new EnumSerializer("com.sumsub.sns.internal.core.data.model.FieldType", FieldType.values()), self.type);
            }
            if (output.D() || self.mask != null) {
                output.e(serialDesc, 3, m0.f26414a, self.mask);
            }
            if (output.D() || self.masks != null) {
                output.e(serialDesc, 4, new C1169d(m0.f26414a, 0), self.masks);
            }
            if (output.D() || self.format != null) {
                output.e(serialDesc, 5, p.Companion.a.f15549a, self.format);
            }
            if (!output.D() && self.placeholder == null) {
                return;
            }
            output.e(serialDesc, 6, m0.f26414a, self.placeholder);
        }

        public static /* synthetic */ void B() {
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
    }

    public static abstract class e extends h {

        public static final class a extends e {

            /* renamed from: b, reason: collision with root package name */
            public final String f15506b;

            /* renamed from: c, reason: collision with root package name */
            public final int f15507c;

            /* renamed from: d, reason: collision with root package name */
            public final List<C0209a> f15508d;

            /* renamed from: com.sumsub.sns.internal.core.data.model.h$e$a$a, reason: collision with other inner class name */
            public static final class C0209a {

                /* renamed from: a, reason: collision with root package name */
                public final String f15509a;

                /* renamed from: b, reason: collision with root package name */
                public final String f15510b;

                public C0209a(String str, String str2) {
                    this.f15509a = str;
                    this.f15510b = str2;
                }

                public final String c() {
                    return this.f15509a;
                }

                public final String d() {
                    return this.f15510b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0209a)) {
                        return false;
                    }
                    C0209a c0209a = (C0209a) obj;
                    return kotlin.jvm.internal.f.b(this.f15509a, c0209a.f15509a) && kotlin.jvm.internal.f.b(this.f15510b, c0209a.f15510b);
                }

                public int hashCode() {
                    return this.f15510b.hashCode() + (this.f15509a.hashCode() * 31);
                }

                public String toString() {
                    StringBuilder sb2 = new StringBuilder("DropDownItem(id=");
                    sb2.append(this.f15509a);
                    sb2.append(", label=");
                    return C.v.q(sb2, this.f15510b, ')');
                }
            }

            public a(String str, int i, List<C0209a> list) {
                super(null);
                this.f15506b = str;
                this.f15507c = i;
                this.f15508d = list;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return kotlin.jvm.internal.f.b(this.f15506b, aVar.f15506b) && this.f15507c == aVar.f15507c && kotlin.jvm.internal.f.b(this.f15508d, aVar.f15508d);
            }

            public final int g() {
                return this.f15507c;
            }

            public final List<C0209a> h() {
                return this.f15508d;
            }

            public int hashCode() {
                String str = this.f15506b;
                return this.f15508d.hashCode() + C.v.b(this.f15507c, (str == null ? 0 : str.hashCode()) * 31, 31);
            }

            public final String i() {
                return this.f15506b;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Dropdown(label=");
                sb2.append(this.f15506b);
                sb2.append(", currentSelectedItem=");
                sb2.append(this.f15507c);
                sb2.append(", items=");
                return C.v.r(sb2, this.f15508d, ')');
            }
        }

        public static final class b extends e {

            /* renamed from: b, reason: collision with root package name */
            public final CharSequence f15511b;

            public b(CharSequence charSequence) {
                super(null);
                this.f15511b = charSequence;
            }

            public final CharSequence e() {
                return this.f15511b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && kotlin.jvm.internal.f.b(this.f15511b, ((b) obj).f15511b);
            }

            public int hashCode() {
                return this.f15511b.hashCode();
            }

            public String toString() {
                return com.google.android.gms.measurement.internal.a.j(new StringBuilder("Text(text="), this.f15511b, ')');
            }
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.sumsub.sns.internal.core.data.model.h
        public String b() {
            return c();
        }

        public e() {
            super(null);
        }
    }

    public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final void a(h self, InterfaceC1143c output, pa.f serialDesc) {
    }

    public abstract String b();

    public String c() {
        return com.sumsub.sns.internal.core.common.i.a(this);
    }

    public h() {
    }

    public /* synthetic */ h(int i, i0 i0Var) {
    }
}
