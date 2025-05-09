package Z8;

import java.util.Map;

/* compiled from: Attribute.java */
/* loaded from: classes2.dex */
public final class a implements Map.Entry<String, String>, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public String f4234a;

    /* renamed from: b, reason: collision with root package name */
    public String f4235b;

    /* renamed from: c, reason: collision with root package name */
    public b f4236c;

    public final Object clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        String str = aVar.f4234a;
        String str2 = this.f4234a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = this.f4235b;
        String str4 = aVar.f4235b;
        return str3 != null ? str3.equals(str4) : str4 == null;
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.f4234a;
    }

    @Override // java.util.Map.Entry
    public final String getValue() {
        return this.f4235b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.f4234a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f4235b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final String setValue(String str) {
        String str2;
        String str3 = str;
        b bVar = this.f4236c;
        String str4 = this.f4234a;
        int a10 = bVar.a(str4);
        String str5 = "";
        if (a10 != -1 && (str2 = bVar.f4240c[a10]) != null) {
            str5 = str2;
        }
        int a11 = bVar.a(str4);
        if (a11 != -1) {
            bVar.f4240c[a11] = str3;
        }
        this.f4235b = str3;
        return str5;
    }
}
