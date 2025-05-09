package com.sumsub.sns.core.data.model;

import C.v;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import pa.f;
import qa.InterfaceC1143c;
import ra.i0;
import ra.m0;

@InterfaceC1080d
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J(\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006("}, d2 = {"Lcom/sumsub/sns/core/data/model/SNSDocumentDefinition;", "", "", "idDocType", "country", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "write$Self", "(Lcom/sumsub/sns/core/data/model/SNSDocumentDefinition;Lqa/c;Lpa/f;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/sumsub/sns/core/data/model/SNSDocumentDefinition;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdDocType", "getIdDocType$annotations", "()V", "getCountry", "getCountry$annotations", "Companion", "$serializer", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class SNSDocumentDefinition {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String country;
    private final String idDocType;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sumsub/sns/core/data/model/SNSDocumentDefinition$Companion;", "", "<init>", "()V", "Lna/b;", "Lcom/sumsub/sns/core/data/model/SNSDocumentDefinition;", "serializer", "()Lna/b;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<SNSDocumentDefinition> serializer() {
            return SNSDocumentDefinition$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SNSDocumentDefinition() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ SNSDocumentDefinition copy$default(SNSDocumentDefinition sNSDocumentDefinition, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sNSDocumentDefinition.idDocType;
        }
        if ((i & 2) != 0) {
            str2 = sNSDocumentDefinition.country;
        }
        return sNSDocumentDefinition.copy(str, str2);
    }

    public static final void write$Self(SNSDocumentDefinition self, InterfaceC1143c output, f serialDesc) {
        if (output.D() || self.idDocType != null) {
            output.e(serialDesc, 0, m0.f26414a, self.idDocType);
        }
        if (!output.D() && self.country == null) {
            return;
        }
        output.e(serialDesc, 1, m0.f26414a, self.country);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIdDocType() {
        return this.idDocType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    public final SNSDocumentDefinition copy(String idDocType, String country) {
        return new SNSDocumentDefinition(idDocType, country);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SNSDocumentDefinition)) {
            return false;
        }
        SNSDocumentDefinition sNSDocumentDefinition = (SNSDocumentDefinition) other;
        return kotlin.jvm.internal.f.b(this.idDocType, sNSDocumentDefinition.idDocType) && kotlin.jvm.internal.f.b(this.country, sNSDocumentDefinition.country);
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getIdDocType() {
        return this.idDocType;
    }

    public int hashCode() {
        String str = this.idDocType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.country;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SNSDocumentDefinition(idDocType=");
        sb2.append(this.idDocType);
        sb2.append(", country=");
        return v.q(sb2, this.country, ')');
    }

    public /* synthetic */ SNSDocumentDefinition(int i, String str, String str2, i0 i0Var) {
        if ((i & 1) == 0) {
            this.idDocType = null;
        } else {
            this.idDocType = str;
        }
        if ((i & 2) == 0) {
            this.country = null;
        } else {
            this.country = str2;
        }
    }

    public SNSDocumentDefinition(String str, String str2) {
        this.idDocType = str;
        this.country = str2;
    }

    public /* synthetic */ SNSDocumentDefinition(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ void getCountry$annotations() {
    }

    public static /* synthetic */ void getIdDocType$annotations() {
    }
}
