package com.sumsub.sns.internal.nfc;

import C.v;
import P9.m;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jmrtd.PassportService;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17774a;

    /* renamed from: b, reason: collision with root package name */
    public final List<Short> f17775b;

    public b() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public final List<Short> c() {
        return this.f17775b;
    }

    public final boolean d() {
        return this.f17774a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f17774a == bVar.f17774a && kotlin.jvm.internal.f.b(this.f17775b, bVar.f17775b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public int hashCode() {
        boolean z10 = this.f17774a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return this.f17775b.hashCode() + (r02 * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NfcConfig(usePace=");
        sb2.append(this.f17774a);
        sb2.append(", files=");
        return v.r(sb2, this.f17775b, ')');
    }

    public b(boolean z10, List<Short> list) {
        this.f17774a = z10;
        this.f17775b = list;
    }

    public /* synthetic */ b(boolean z10, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z10, (i & 2) != 0 ? m.q(Short.valueOf(PassportService.EF_COM), 285, Short.valueOf(PassportService.EF_DG1), Short.valueOf(PassportService.EF_DG2)) : list);
    }
}
