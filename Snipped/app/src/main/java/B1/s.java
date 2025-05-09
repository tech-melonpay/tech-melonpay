package B1;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;

/* compiled from: WorkTag.java */
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = p.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@Index({"work_spec_id"})}, primaryKeys = {"tag", "work_spec_id"})
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @ColumnInfo(name = "tag")
    public final String f270a;

    /* renamed from: b, reason: collision with root package name */
    @ColumnInfo(name = "work_spec_id")
    public final String f271b;

    public s(String str, String str2) {
        this.f270a = str;
        this.f271b = str2;
    }
}
