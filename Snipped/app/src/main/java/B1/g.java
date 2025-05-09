package B1;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

/* compiled from: SystemIdInfo.java */
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = p.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})})
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @PrimaryKey
    @ColumnInfo(name = "work_spec_id")
    public final String f231a;

    /* renamed from: b, reason: collision with root package name */
    @ColumnInfo(name = "system_id")
    public final int f232b;

    public g(String str, int i) {
        this.f231a = str;
        this.f232b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f232b != gVar.f232b) {
            return false;
        }
        return this.f231a.equals(gVar.f231a);
    }

    public final int hashCode() {
        return (this.f231a.hashCode() * 31) + this.f232b;
    }
}
