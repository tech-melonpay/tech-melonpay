package com.luminary.business.presentation.ui.fragments.company.list;

import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import kotlin.jvm.internal.f;

/* compiled from: CompanyItems.kt */
/* loaded from: classes2.dex */
public abstract class a {

    /* compiled from: CompanyItems.kt */
    /* renamed from: com.luminary.business.presentation.ui.fragments.company.list.a$a, reason: collision with other inner class name */
    public static final class C0118a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final CorporateDetailsDomain f11902a;

        public C0118a(CorporateDetailsDomain corporateDetailsDomain) {
            this.f11902a = corporateDetailsDomain;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0118a) && f.b(this.f11902a, ((C0118a) obj).f11902a);
        }

        public final int hashCode() {
            return this.f11902a.hashCode();
        }

        public final String toString() {
            return "Display(item=" + this.f11902a + ")";
        }
    }

    /* compiled from: CompanyItems.kt */
    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final CorporateDetailsDomain.StatusIdentification f11903a;

        public b(CorporateDetailsDomain.StatusIdentification statusIdentification) {
            this.f11903a = statusIdentification;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f11903a == ((b) obj).f11903a;
        }

        public final int hashCode() {
            return this.f11903a.hashCode();
        }

        public final String toString() {
            return "Header(item=" + this.f11903a + ")";
        }
    }
}
