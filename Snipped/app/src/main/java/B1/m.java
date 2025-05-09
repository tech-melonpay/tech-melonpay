package B1;

import androidx.room.Entity;
import androidx.room.ForeignKey;

/* compiled from: WorkProgress.java */
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = p.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})})
/* loaded from: classes.dex */
public final class m {
}
