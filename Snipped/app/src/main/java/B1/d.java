package B1;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/* compiled from: Preference.java */
@Entity
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @PrimaryKey
    @ColumnInfo(name = "key")
    public final String f225a;

    /* renamed from: b, reason: collision with root package name */
    @ColumnInfo(name = "long_value")
    public final Long f226b;

    public d(String str, long j10) {
        this.f225a = str;
        this.f226b = Long.valueOf(j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f225a.equals(dVar.f225a)) {
            return false;
        }
        Long l10 = dVar.f226b;
        Long l11 = this.f226b;
        return l11 != null ? l11.equals(l10) : l10 == null;
    }

    public final int hashCode() {
        int hashCode = this.f225a.hashCode() * 31;
        Long l10 = this.f226b;
        return hashCode + (l10 != null ? l10.hashCode() : 0);
    }
}
