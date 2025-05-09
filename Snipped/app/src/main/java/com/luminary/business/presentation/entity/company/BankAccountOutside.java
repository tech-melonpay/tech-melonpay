package com.luminary.business.presentation.entity.company;

import java.io.Serializable;
import kotlin.jvm.internal.f;
import s3.b;

/* compiled from: BankAccountOutside.kt */
/* loaded from: classes2.dex */
public final class BankAccountOutside implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public String f11188a;

    /* renamed from: b, reason: collision with root package name */
    public String f11189b;

    /* renamed from: c, reason: collision with root package name */
    public String f11190c;

    /* renamed from: d, reason: collision with root package name */
    public String f11191d;

    public BankAccountOutside(String str, String str2, String str3, String str4) {
        this.f11188a = str;
        this.f11189b = str2;
        this.f11190c = str3;
        this.f11191d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankAccountOutside)) {
            return false;
        }
        BankAccountOutside bankAccountOutside = (BankAccountOutside) obj;
        return f.b(this.f11188a, bankAccountOutside.f11188a) && f.b(this.f11189b, bankAccountOutside.f11189b) && f.b(this.f11190c, bankAccountOutside.f11190c) && f.b(this.f11191d, bankAccountOutside.f11191d);
    }

    public final int hashCode() {
        String str = this.f11188a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f11189b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11190c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f11191d;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f11188a;
        String str2 = this.f11189b;
        return b.o(b.p("BankAccountOutside(name=", str, ", country=", str2, ", countryFull="), this.f11190c, ", info=", this.f11191d, ")");
    }
}
