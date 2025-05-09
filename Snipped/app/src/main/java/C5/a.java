package C5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.f;

/* compiled from: PlanDomain.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f664a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f665b;

    /* renamed from: c, reason: collision with root package name */
    public final b f666c;

    /* renamed from: d, reason: collision with root package name */
    public final b f667d;

    /* renamed from: e, reason: collision with root package name */
    public final List<b> f668e;

    /* renamed from: f, reason: collision with root package name */
    public final String f669f;

    /* renamed from: g, reason: collision with root package name */
    public final Date f670g;

    /* renamed from: h, reason: collision with root package name */
    public final Date f671h;
    public final Boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Date f672j;

    public a(Integer num, Boolean bool, b bVar, b bVar2, ArrayList arrayList, String str, Date date, Date date2, Boolean bool2, Date date3) {
        this.f664a = num;
        this.f665b = bool;
        this.f666c = bVar;
        this.f667d = bVar2;
        this.f668e = arrayList;
        this.f669f = str;
        this.f670g = date;
        this.f671h = date2;
        this.i = bool2;
        this.f672j = date3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f664a, aVar.f664a) && f.b(this.f665b, aVar.f665b) && f.b(this.f666c, aVar.f666c) && f.b(this.f667d, aVar.f667d) && f.b(this.f668e, aVar.f668e) && f.b(this.f669f, aVar.f669f) && f.b(this.f670g, aVar.f670g) && f.b(this.f671h, aVar.f671h) && f.b(this.i, aVar.i) && f.b(this.f672j, aVar.f672j);
    }

    public final int hashCode() {
        Integer num = this.f664a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.f665b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        b bVar = this.f666c;
        int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.f667d;
        int hashCode4 = (hashCode3 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        List<b> list = this.f668e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f669f;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Date date = this.f670g;
        int hashCode7 = (hashCode6 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f671h;
        int hashCode8 = (hashCode7 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Boolean bool2 = this.i;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Date date3 = this.f672j;
        return hashCode9 + (date3 != null ? date3.hashCode() : 0);
    }

    public final String toString() {
        return "PlanDomain(id=" + this.f664a + ", isDefault=" + this.f665b + ", prettyName=" + this.f666c + ", description=" + this.f667d + ", content=" + this.f668e + ", partnerId=" + this.f669f + ", createdAt=" + this.f670g + ", updatedAt=" + this.f671h + ", yourActive=" + this.i + ", canBeActivatedAt=" + this.f672j + ")";
    }
}
