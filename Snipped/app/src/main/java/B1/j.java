package B1;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: WorkName.java */
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = p.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@Index({"work_spec_id"})}, primaryKeys = {AppMeasurementSdk.ConditionalUserProperty.NAME, "work_spec_id"})
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @ColumnInfo(name = AppMeasurementSdk.ConditionalUserProperty.NAME)
    public final String f236a;

    /* renamed from: b, reason: collision with root package name */
    @ColumnInfo(name = "work_spec_id")
    public final String f237b;

    public j(String str, String str2) {
        this.f236a = str;
        this.f237b = str2;
    }
}
