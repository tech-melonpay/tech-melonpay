package com.sumsub.sns.internal.core.presentation.helper;

import C.v;
import com.sumsub.sns.internal.core.data.model.ApplicantStatus;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.data.model.g;
import java.util.List;
import kotlin.jvm.internal.f;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ApplicantStatus f16586a;

    /* renamed from: b, reason: collision with root package name */
    public final g f16587b;

    /* renamed from: c, reason: collision with root package name */
    public final List<Document> f16588c;

    public b(ApplicantStatus applicantStatus, g gVar, List<Document> list) {
        this.f16586a = applicantStatus;
        this.f16587b = gVar;
        this.f16588c = list;
    }

    public final g d() {
        return this.f16587b;
    }

    public final List<Document> e() {
        return this.f16588c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f16586a == bVar.f16586a && f.b(this.f16587b, bVar.f16587b) && f.b(this.f16588c, bVar.f16588c);
    }

    public final ApplicantStatus f() {
        return this.f16586a;
    }

    public int hashCode() {
        return this.f16588c.hashCode() + ((this.f16587b.hashCode() + (this.f16586a.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DocumentItemsParams(status=");
        sb2.append(this.f16586a);
        sb2.append(", applicant=");
        sb2.append(this.f16587b);
        sb2.append(", documents=");
        return v.r(sb2, this.f16588c, ')');
    }
}
