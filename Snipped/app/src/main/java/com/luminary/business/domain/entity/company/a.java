package com.luminary.business.domain.entity.company;

import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f;

/* compiled from: AddContractorsRequestDomain.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List<CorporateDetailsDomain.a.b> f10952a;

    /* renamed from: b, reason: collision with root package name */
    public final List<CorporateDetailsDomain.a.b> f10953b;

    public a(ArrayList arrayList, ArrayList arrayList2) {
        this.f10952a = arrayList;
        this.f10953b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f10952a, aVar.f10952a) && f.b(this.f10953b, aVar.f10953b);
    }

    public final int hashCode() {
        return this.f10953b.hashCode() + (this.f10952a.hashCode() * 31);
    }

    public final String toString() {
        return "AddContractorsRequestDomain(contractorsIncoming=" + this.f10952a + ", contractorsOutgoing=" + this.f10953b + ")";
    }
}
