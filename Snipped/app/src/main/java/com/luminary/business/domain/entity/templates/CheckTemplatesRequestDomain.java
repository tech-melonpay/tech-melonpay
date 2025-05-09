package com.luminary.business.domain.entity.templates;

import C.v;
import androidx.camera.core.impl.utils.a;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: CheckTemplatesRequestDomain.kt */
/* loaded from: classes.dex */
public final class CheckTemplatesRequestDomain implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f11137a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11138b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11139c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11140d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11141e;

    public CheckTemplatesRequestDomain(String str, String str2, String str3, String str4, String str5) {
        this.f11137a = str;
        this.f11138b = str2;
        this.f11139c = str3;
        this.f11140d = str4;
        this.f11141e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckTemplatesRequestDomain)) {
            return false;
        }
        CheckTemplatesRequestDomain checkTemplatesRequestDomain = (CheckTemplatesRequestDomain) obj;
        return f.b(this.f11137a, checkTemplatesRequestDomain.f11137a) && f.b(this.f11138b, checkTemplatesRequestDomain.f11138b) && f.b(this.f11139c, checkTemplatesRequestDomain.f11139c) && f.b(this.f11140d, checkTemplatesRequestDomain.f11140d) && f.b(this.f11141e, checkTemplatesRequestDomain.f11141e);
    }

    public final int hashCode() {
        int c2 = v.c(this.f11137a.hashCode() * 31, 31, this.f11138b);
        String str = this.f11139c;
        int hashCode = (c2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11140d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11141e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheckTemplatesRequestDomain(clientId=");
        sb2.append(this.f11137a);
        sb2.append(", paymentMethod=");
        sb2.append(this.f11138b);
        sb2.append(", name=");
        sb2.append(this.f11139c);
        sb2.append(", email=");
        sb2.append(this.f11140d);
        sb2.append(", toAccount=");
        return a.n(sb2, this.f11141e, ")");
    }
}
