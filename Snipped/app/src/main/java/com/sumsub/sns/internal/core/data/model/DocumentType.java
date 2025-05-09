package com.sumsub.sns.internal.core.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.core.common.x0;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.a;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import pa.e;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

@InterfaceC1080d(with = Companion.C0199a.class)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u001f\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0003\t@AB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\rJ#\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\t\u0010\u000fJ#\u0010\t\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u0010J\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0011J\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"J#\u0010\t\u001a\u00020\b2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020#H\u0002¢\u0006\u0004\b\t\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0011R\u0011\u0010*\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010,\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0011\u0010.\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b-\u0010)R\u0011\u00100\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b/\u0010)R\u0011\u00102\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b1\u0010)R\u0011\u00104\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b3\u0010)R\u0011\u00106\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b5\u0010)R\u0011\u00108\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b7\u0010)R\u0011\u0010:\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b9\u0010)R\u0011\u0010<\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b;\u0010)R\u0011\u0010>\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b=\u0010\u0011¨\u0006B"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/DocumentType;", "Landroid/os/Parcelable;", "", "value", "<init>", "(Ljava/lang/String;)V", "Lcom/sumsub/sns/internal/core/common/x0;", "repository", "", "a", "(Lcom/sumsub/sns/internal/core/common/x0;)Ljava/lang/CharSequence;", "Lcom/sumsub/sns/internal/core/data/source/dynamic/b$c;", "strings", "(Lcom/sumsub/sns/internal/core/data/source/dynamic/b$c;)Ljava/lang/CharSequence;", "scene", "(Lcom/sumsub/sns/internal/core/common/x0;Ljava/lang/String;)Ljava/lang/CharSequence;", "(Lcom/sumsub/sns/internal/core/data/source/dynamic/b$c;Ljava/lang/String;)Ljava/lang/CharSequence;", "()Ljava/lang/String;", "(Ljava/lang/String;)Lcom/sumsub/sns/internal/core/data/model/DocumentType;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "LO9/p;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "map", "(Ljava/util/Map;)Ljava/lang/CharSequence;", "Ljava/lang/String;", "c", "e", "()Z", "isEKyc", "g", "isIdentity", "k", "isSelfie", "h", "isPOA", "d", "isApplicantData", "i", "isPhoneVerification", "f", "isEmailVerification", "j", "isQuestionnaireVerification", "m", "isVideoIdent", "l", "isSupported", "b", "iconName", "Companion", "DocSetType", "IdentityDocItemType", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class DocumentType implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public static final String f15246b = "IDENTITY";

    /* renamed from: c, reason: collision with root package name */
    public static final String f15247c = "SELFIE";

    /* renamed from: d, reason: collision with root package name */
    public static final String f15248d = "PROOF_OF_RESIDENCE";

    /* renamed from: e, reason: collision with root package name */
    public static final String f15249e = "APPLICANT_DATA";

    /* renamed from: f, reason: collision with root package name */
    public static final String f15250f = "INVESTABILITY";

    /* renamed from: g, reason: collision with root package name */
    public static final String f15251g = "EMAIL_VERIFICATION";

    /* renamed from: h, reason: collision with root package name */
    public static final String f15252h = "PHONE_VERIFICATION";
    public static final String i = "QUESTIONNAIRE";

    /* renamed from: j, reason: collision with root package name */
    public static final String f15253j = "TYPE_UNKNOWN";

    /* renamed from: k, reason: collision with root package name */
    public static final String f15254k = "VIDEO_IDENT";

    /* renamed from: l, reason: collision with root package name */
    public static final String f15255l = "E_KYC";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<DocumentType> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/DocumentType$DocSetType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", DocumentType.f15246b, "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum DocSetType {
        IDENTITY(DocumentType.f15246b);

        private final String value;

        DocSetType(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/sumsub/sns/internal/core/data/model/DocumentType$IdentityDocItemType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PASSPORT", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum IdentityDocItemType {
        PASSPORT("PASSPORT");

        private final String value;

        IdentityDocItemType(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.model.DocumentType$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: com.sumsub.sns.internal.core.data.model.DocumentType$a$a, reason: collision with other inner class name */
        public static final class C0199a implements InterfaceC1078b<DocumentType> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0199a f15257a = new C0199a();

            /* renamed from: b, reason: collision with root package name */
            public static final pa.f f15258b = a.a("DocumentType", e.i.f25738a);

            @Override // na.InterfaceC1081e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(InterfaceC1145e interfaceC1145e, DocumentType documentType) {
                interfaceC1145e.F(documentType.c());
            }

            @Override // na.InterfaceC1081e, na.InterfaceC1077a
            public pa.f getDescriptor() {
                return f15258b;
            }

            @Override // na.InterfaceC1077a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public DocumentType deserialize(InterfaceC1144d interfaceC1144d) {
                return DocumentType.INSTANCE.a(interfaceC1144d.p());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DocumentType a(String str) {
            if ((str != null && str.startsWith(DocumentType.f15247c)) || ((str != null && str.startsWith(DocumentType.f15246b)) || ((str != null && str.startsWith(DocumentType.f15249e)) || ((str != null && str.startsWith(DocumentType.f15248d)) || ((str != null && str.startsWith(DocumentType.f15250f)) || ((str != null && str.startsWith(DocumentType.f15251g)) || ((str != null && str.startsWith(DocumentType.f15252h)) || (str != null && str.startsWith(DocumentType.i))))))))) {
                return new DocumentType(str);
            }
            if (str != null) {
                return new DocumentType(str);
            }
            throw new IllegalArgumentException("Null document type");
        }

        public final InterfaceC1078b<DocumentType> serializer() {
            return C0199a.f15257a;
        }

        public Companion() {
        }
    }

    public static final class b implements Parcelable.Creator<DocumentType> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DocumentType createFromParcel(Parcel parcel) {
            return new DocumentType(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DocumentType[] newArray(int i) {
            return new DocumentType[i];
        }
    }

    public DocumentType(String str) {
        this.value = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final String b() {
        return "DocType/" + this.value;
    }

    public final String c() {
        return this.value;
    }

    public final boolean d() {
        return this.value.startsWith(f15249e);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.value.startsWith(f15255l);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DocumentType) && kotlin.jvm.internal.f.b(this.value, ((DocumentType) other).value);
    }

    public final boolean f() {
        return this.value.startsWith(f15251g);
    }

    public final boolean g() {
        return this.value.startsWith(f15246b);
    }

    public final boolean h() {
        return this.value.startsWith(f15248d);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public final boolean i() {
        return this.value.startsWith(f15252h);
    }

    public final boolean j() {
        return this.value.startsWith(i);
    }

    public final boolean k() {
        return this.value.startsWith(f15247c);
    }

    public final boolean l() {
        return g() || k() || h() || d() || i() || f() || j() || e();
    }

    public final boolean m() {
        return this.value.startsWith(f15254k);
    }

    public String toString() {
        return C.v.q(new StringBuilder("DocumentType(value="), this.value, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.value);
    }

    public final DocumentType a(String value) {
        return new DocumentType(value);
    }

    public static /* synthetic */ DocumentType a(DocumentType documentType, String str, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = documentType.value;
        }
        return documentType.a(str);
    }

    public final CharSequence a(x0 repository) {
        return a(repository.a());
    }

    public final CharSequence a(b.c strings) {
        if (strings == null) {
            return "";
        }
        return a(strings.d());
    }

    public final CharSequence a(Map<String, String> map) {
        String str = map.get(String.format("sns_step_%s_title", Arrays.copyOf(new Object[]{this.value}, 1)));
        if (str == null || str.length() == 0) {
            if (g()) {
                str = map.get(String.format("sns_step_%s_title", Arrays.copyOf(new Object[]{f15246b}, 1)));
            } else if (k()) {
                str = map.get(String.format("sns_step_%s_title", Arrays.copyOf(new Object[]{f15247c}, 1)));
            } else {
                str = d() ? map.get(String.format("sns_step_%s_title", Arrays.copyOf(new Object[]{f15249e}, 1))) : this.value;
            }
        }
        return str != null ? str : this.value;
    }

    public static /* synthetic */ CharSequence a(DocumentType documentType, x0 x0Var, String str, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            str = null;
        }
        return documentType.a(x0Var, str);
    }

    public final CharSequence a(x0 repository, String scene) {
        String format;
        String format2;
        String format3;
        if (scene != null) {
            format = String.format("sns_step_%s_%s_prompt", Arrays.copyOf(new Object[]{this.value, scene}, 2));
            format2 = String.format("sns_step_%s_prompt", Arrays.copyOf(new Object[]{this.value}, 1));
            format3 = String.format("sns_step_%s_prompt", Arrays.copyOf(new Object[]{"defaults"}, 1));
        } else {
            format = String.format("sns_step_%s_prompt", Arrays.copyOf(new Object[]{this.value}, 1));
            format2 = String.format("sns_step_%s_prompt", Arrays.copyOf(new Object[]{this.value}, 1));
            format3 = String.format("sns_step_%s_prompt", Arrays.copyOf(new Object[]{"defaults"}, 1));
        }
        CharSequence a10 = com.sumsub.sns.internal.core.common.i.a(repository, format, format2, format3);
        if (a10.length() <= 0) {
            a10 = null;
        }
        return a10 == null ? this.value : a10;
    }

    public static /* synthetic */ CharSequence a(DocumentType documentType, b.c cVar, String str, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            str = null;
        }
        return documentType.a(cVar, str);
    }

    public final CharSequence a(b.c strings, String scene) {
        String format;
        String format2;
        String format3;
        if (strings == null) {
            return "";
        }
        if (scene != null) {
            format = String.format("sns_step_%s_%s_prompt", Arrays.copyOf(new Object[]{this.value, scene}, 2));
            format2 = String.format("sns_step_%s_prompt", Arrays.copyOf(new Object[]{this.value}, 1));
            format3 = String.format("sns_step_%s_prompt", Arrays.copyOf(new Object[]{"defaults"}, 1));
        } else {
            format = String.format("sns_step_%s_prompt", Arrays.copyOf(new Object[]{this.value}, 1));
            format2 = String.format("sns_step_%s_prompt", Arrays.copyOf(new Object[]{this.value}, 1));
            format3 = String.format("sns_step_%s_prompt", Arrays.copyOf(new Object[]{"defaults"}, 1));
        }
        String a10 = strings.a(format, format2, format3);
        if (a10.length() <= 0) {
            a10 = null;
        }
        return a10 != null ? a10 : this.value;
    }
}
