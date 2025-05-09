package B1;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;

/* compiled from: Dependency.java */
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = p.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"}), @ForeignKey(childColumns = {"prerequisite_id"}, entity = p.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@Index({"work_spec_id"}), @Index({"prerequisite_id"})}, primaryKeys = {"work_spec_id", "prerequisite_id"})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @ColumnInfo(name = "work_spec_id")
    public final String f221a;

    /* renamed from: b, reason: collision with root package name */
    @ColumnInfo(name = "prerequisite_id")
    public final String f222b;

    public a(String str, String str2) {
        this.f221a = str;
        this.f222b = str2;
    }
}
