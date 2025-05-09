package B1;

import B1.p;
import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.work.WorkInfo$State;
import java.util.ArrayList;
import s1.C1192b;

/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f262a;

    /* renamed from: b, reason: collision with root package name */
    public final a f263b;

    /* renamed from: c, reason: collision with root package name */
    public final b f264c;

    /* renamed from: d, reason: collision with root package name */
    public final c f265d;

    /* renamed from: e, reason: collision with root package name */
    public final d f266e;

    /* renamed from: f, reason: collision with root package name */
    public final e f267f;

    /* renamed from: g, reason: collision with root package name */
    public final f f268g;

    /* renamed from: h, reason: collision with root package name */
    public final g f269h;
    public final h i;

    /* compiled from: WorkSpecDao_Impl.java */
    public class a extends EntityInsertionAdapter<p> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01cd  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01d3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x01ad -> B:58:0x01c7). Please report as a decompilation issue!!! */
        @Override // androidx.room.EntityInsertionAdapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void bind(d1.g r17, B1.p r18) {
            /*
                Method dump skipped, instructions count: 523
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: B1.r.a.bind(d1.g, java.lang.Object):void");
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    public class b extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    public class c extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    public class d extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    public class e extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    public class f extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    public class g extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    public class h extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    public class i extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public r(RoomDatabase roomDatabase) {
        this.f262a = roomDatabase;
        this.f263b = new a(roomDatabase);
        this.f264c = new b(roomDatabase);
        this.f265d = new c(roomDatabase);
        this.f266e = new d(roomDatabase);
        this.f267f = new e(roomDatabase);
        this.f268g = new f(roomDatabase);
        this.f269h = new g(roomDatabase);
        this.i = new h(roomDatabase);
        new i(roomDatabase);
    }

    public final void a(String str) {
        RoomDatabase roomDatabase = this.f262a;
        roomDatabase.assertNotSuspendingTransaction();
        b bVar = this.f264c;
        d1.g acquire = bVar.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        roomDatabase.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
            bVar.release(acquire);
        }
    }

    public final ArrayList b() {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        acquire.bindLong(1, 200);
        RoomDatabase roomDatabase = this.f262a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(roomDatabase, acquire, false, null);
        try {
            columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
            columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
            columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
            columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
            columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
            columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
            columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
            columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
            columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "id");
            columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "state");
            columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "input");
            columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "output");
            roomSQLiteQuery = acquire;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = acquire;
        }
        try {
            int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "period_start_time");
            int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
            int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
            int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
            int i9 = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                String string = query.getString(columnIndexOrThrow9);
                int i10 = columnIndexOrThrow9;
                String string2 = query.getString(columnIndexOrThrow11);
                int i11 = columnIndexOrThrow11;
                C1192b c1192b = new C1192b();
                int i12 = columnIndexOrThrow;
                c1192b.f26497a = v.c(query.getInt(columnIndexOrThrow));
                c1192b.f26498b = query.getInt(columnIndexOrThrow2) != 0;
                c1192b.f26499c = query.getInt(columnIndexOrThrow3) != 0;
                c1192b.f26500d = query.getInt(columnIndexOrThrow4) != 0;
                c1192b.f26501e = query.getInt(columnIndexOrThrow5) != 0;
                int i13 = columnIndexOrThrow2;
                int i14 = columnIndexOrThrow3;
                c1192b.f26502f = query.getLong(columnIndexOrThrow6);
                c1192b.f26503g = query.getLong(columnIndexOrThrow7);
                c1192b.f26504h = v.a(query.getBlob(columnIndexOrThrow8));
                p pVar = new p(string, string2);
                pVar.f244b = v.e(query.getInt(columnIndexOrThrow10));
                pVar.f246d = query.getString(columnIndexOrThrow12);
                pVar.f247e = androidx.work.b.a(query.getBlob(columnIndexOrThrow13));
                int i15 = i9;
                pVar.f248f = androidx.work.b.a(query.getBlob(i15));
                int i16 = columnIndexOrThrow12;
                int i17 = columnIndexOrThrow15;
                pVar.f249g = query.getLong(i17);
                i9 = i15;
                int i18 = columnIndexOrThrow13;
                int i19 = columnIndexOrThrow16;
                pVar.f250h = query.getLong(i19);
                columnIndexOrThrow16 = i19;
                int i20 = columnIndexOrThrow17;
                pVar.i = query.getLong(i20);
                int i21 = columnIndexOrThrow18;
                pVar.f252k = query.getInt(i21);
                int i22 = columnIndexOrThrow19;
                columnIndexOrThrow18 = i21;
                pVar.f253l = v.b(query.getInt(i22));
                columnIndexOrThrow17 = i20;
                int i23 = columnIndexOrThrow20;
                pVar.f254m = query.getLong(i23);
                columnIndexOrThrow20 = i23;
                int i24 = columnIndexOrThrow21;
                pVar.f255n = query.getLong(i24);
                columnIndexOrThrow21 = i24;
                int i25 = columnIndexOrThrow22;
                pVar.f256o = query.getLong(i25);
                columnIndexOrThrow22 = i25;
                int i26 = columnIndexOrThrow23;
                pVar.f257p = query.getLong(i26);
                int i27 = columnIndexOrThrow24;
                pVar.f258q = query.getInt(i27) != 0;
                int i28 = columnIndexOrThrow25;
                columnIndexOrThrow24 = i27;
                pVar.f259r = v.d(query.getInt(i28));
                pVar.f251j = c1192b;
                arrayList.add(pVar);
                columnIndexOrThrow25 = i28;
                columnIndexOrThrow23 = i26;
                columnIndexOrThrow12 = i16;
                columnIndexOrThrow2 = i13;
                columnIndexOrThrow9 = i10;
                columnIndexOrThrow11 = i11;
                columnIndexOrThrow = i12;
                columnIndexOrThrow15 = i17;
                columnIndexOrThrow3 = i14;
                columnIndexOrThrow19 = i22;
                columnIndexOrThrow13 = i18;
            }
            query.close();
            roomSQLiteQuery.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public final ArrayList c(int i9) {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        acquire.bindLong(1, i9);
        RoomDatabase roomDatabase = this.f262a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(roomDatabase, acquire, false, null);
        try {
            columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
            columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
            columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
            columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
            columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
            columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
            columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
            columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
            columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "id");
            columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "state");
            columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "input");
            columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "output");
            roomSQLiteQuery = acquire;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = acquire;
        }
        try {
            int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "period_start_time");
            int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
            int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
            int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
            int i10 = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                String string = query.getString(columnIndexOrThrow9);
                int i11 = columnIndexOrThrow9;
                String string2 = query.getString(columnIndexOrThrow11);
                int i12 = columnIndexOrThrow11;
                C1192b c1192b = new C1192b();
                int i13 = columnIndexOrThrow;
                c1192b.f26497a = v.c(query.getInt(columnIndexOrThrow));
                c1192b.f26498b = query.getInt(columnIndexOrThrow2) != 0;
                c1192b.f26499c = query.getInt(columnIndexOrThrow3) != 0;
                c1192b.f26500d = query.getInt(columnIndexOrThrow4) != 0;
                c1192b.f26501e = query.getInt(columnIndexOrThrow5) != 0;
                int i14 = columnIndexOrThrow2;
                int i15 = columnIndexOrThrow3;
                c1192b.f26502f = query.getLong(columnIndexOrThrow6);
                c1192b.f26503g = query.getLong(columnIndexOrThrow7);
                c1192b.f26504h = v.a(query.getBlob(columnIndexOrThrow8));
                p pVar = new p(string, string2);
                pVar.f244b = v.e(query.getInt(columnIndexOrThrow10));
                pVar.f246d = query.getString(columnIndexOrThrow12);
                pVar.f247e = androidx.work.b.a(query.getBlob(columnIndexOrThrow13));
                int i16 = i10;
                pVar.f248f = androidx.work.b.a(query.getBlob(i16));
                int i17 = columnIndexOrThrow12;
                int i18 = columnIndexOrThrow15;
                pVar.f249g = query.getLong(i18);
                i10 = i16;
                int i19 = columnIndexOrThrow13;
                int i20 = columnIndexOrThrow16;
                pVar.f250h = query.getLong(i20);
                columnIndexOrThrow16 = i20;
                int i21 = columnIndexOrThrow17;
                pVar.i = query.getLong(i21);
                int i22 = columnIndexOrThrow18;
                pVar.f252k = query.getInt(i22);
                int i23 = columnIndexOrThrow19;
                columnIndexOrThrow18 = i22;
                pVar.f253l = v.b(query.getInt(i23));
                columnIndexOrThrow17 = i21;
                int i24 = columnIndexOrThrow20;
                pVar.f254m = query.getLong(i24);
                columnIndexOrThrow20 = i24;
                int i25 = columnIndexOrThrow21;
                pVar.f255n = query.getLong(i25);
                columnIndexOrThrow21 = i25;
                int i26 = columnIndexOrThrow22;
                pVar.f256o = query.getLong(i26);
                columnIndexOrThrow22 = i26;
                int i27 = columnIndexOrThrow23;
                pVar.f257p = query.getLong(i27);
                int i28 = columnIndexOrThrow24;
                pVar.f258q = query.getInt(i28) != 0;
                int i29 = columnIndexOrThrow25;
                columnIndexOrThrow24 = i28;
                pVar.f259r = v.d(query.getInt(i29));
                pVar.f251j = c1192b;
                arrayList.add(pVar);
                columnIndexOrThrow25 = i29;
                columnIndexOrThrow23 = i27;
                columnIndexOrThrow12 = i17;
                columnIndexOrThrow2 = i14;
                columnIndexOrThrow9 = i11;
                columnIndexOrThrow11 = i12;
                columnIndexOrThrow = i13;
                columnIndexOrThrow15 = i18;
                columnIndexOrThrow3 = i15;
                columnIndexOrThrow19 = i23;
                columnIndexOrThrow13 = i19;
            }
            query.close();
            roomSQLiteQuery.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public final ArrayList d() {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        RoomDatabase roomDatabase = this.f262a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(roomDatabase, acquire, false, null);
        try {
            columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
            columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
            columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
            columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
            columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
            columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
            columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
            columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
            columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "id");
            columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "state");
            columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "input");
            columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "output");
            roomSQLiteQuery = acquire;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = acquire;
        }
        try {
            int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "period_start_time");
            int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
            int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
            int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
            int i9 = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                String string = query.getString(columnIndexOrThrow9);
                int i10 = columnIndexOrThrow9;
                String string2 = query.getString(columnIndexOrThrow11);
                int i11 = columnIndexOrThrow11;
                C1192b c1192b = new C1192b();
                int i12 = columnIndexOrThrow;
                c1192b.f26497a = v.c(query.getInt(columnIndexOrThrow));
                c1192b.f26498b = query.getInt(columnIndexOrThrow2) != 0;
                c1192b.f26499c = query.getInt(columnIndexOrThrow3) != 0;
                c1192b.f26500d = query.getInt(columnIndexOrThrow4) != 0;
                c1192b.f26501e = query.getInt(columnIndexOrThrow5) != 0;
                int i13 = columnIndexOrThrow2;
                int i14 = columnIndexOrThrow3;
                c1192b.f26502f = query.getLong(columnIndexOrThrow6);
                c1192b.f26503g = query.getLong(columnIndexOrThrow7);
                c1192b.f26504h = v.a(query.getBlob(columnIndexOrThrow8));
                p pVar = new p(string, string2);
                pVar.f244b = v.e(query.getInt(columnIndexOrThrow10));
                pVar.f246d = query.getString(columnIndexOrThrow12);
                pVar.f247e = androidx.work.b.a(query.getBlob(columnIndexOrThrow13));
                int i15 = i9;
                pVar.f248f = androidx.work.b.a(query.getBlob(i15));
                int i16 = columnIndexOrThrow13;
                int i17 = columnIndexOrThrow15;
                pVar.f249g = query.getLong(i17);
                int i18 = columnIndexOrThrow4;
                int i19 = columnIndexOrThrow16;
                pVar.f250h = query.getLong(i19);
                int i20 = columnIndexOrThrow17;
                pVar.i = query.getLong(i20);
                int i21 = columnIndexOrThrow18;
                pVar.f252k = query.getInt(i21);
                int i22 = columnIndexOrThrow19;
                pVar.f253l = v.b(query.getInt(i22));
                int i23 = columnIndexOrThrow20;
                pVar.f254m = query.getLong(i23);
                int i24 = columnIndexOrThrow21;
                pVar.f255n = query.getLong(i24);
                int i25 = columnIndexOrThrow22;
                pVar.f256o = query.getLong(i25);
                int i26 = columnIndexOrThrow23;
                pVar.f257p = query.getLong(i26);
                int i27 = columnIndexOrThrow24;
                pVar.f258q = query.getInt(i27) != 0;
                int i28 = columnIndexOrThrow25;
                pVar.f259r = v.d(query.getInt(i28));
                pVar.f251j = c1192b;
                arrayList.add(pVar);
                i9 = i15;
                columnIndexOrThrow2 = i13;
                columnIndexOrThrow15 = i17;
                columnIndexOrThrow16 = i19;
                columnIndexOrThrow20 = i23;
                columnIndexOrThrow21 = i24;
                columnIndexOrThrow24 = i27;
                columnIndexOrThrow11 = i11;
                columnIndexOrThrow = i12;
                columnIndexOrThrow25 = i28;
                columnIndexOrThrow23 = i26;
                columnIndexOrThrow13 = i16;
                columnIndexOrThrow9 = i10;
                columnIndexOrThrow3 = i14;
                columnIndexOrThrow22 = i25;
                columnIndexOrThrow4 = i18;
                columnIndexOrThrow17 = i20;
                columnIndexOrThrow18 = i21;
                columnIndexOrThrow19 = i22;
            }
            query.close();
            roomSQLiteQuery.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public final ArrayList e() {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        RoomDatabase roomDatabase = this.f262a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(roomDatabase, acquire, false, null);
        try {
            columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
            columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
            columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
            columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
            columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
            columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
            columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
            columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
            columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "id");
            columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "state");
            columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "input");
            columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "output");
            roomSQLiteQuery = acquire;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = acquire;
        }
        try {
            int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "period_start_time");
            int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
            int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
            int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
            int i9 = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                String string = query.getString(columnIndexOrThrow9);
                int i10 = columnIndexOrThrow9;
                String string2 = query.getString(columnIndexOrThrow11);
                int i11 = columnIndexOrThrow11;
                C1192b c1192b = new C1192b();
                int i12 = columnIndexOrThrow;
                c1192b.f26497a = v.c(query.getInt(columnIndexOrThrow));
                c1192b.f26498b = query.getInt(columnIndexOrThrow2) != 0;
                c1192b.f26499c = query.getInt(columnIndexOrThrow3) != 0;
                c1192b.f26500d = query.getInt(columnIndexOrThrow4) != 0;
                c1192b.f26501e = query.getInt(columnIndexOrThrow5) != 0;
                int i13 = columnIndexOrThrow2;
                int i14 = columnIndexOrThrow3;
                c1192b.f26502f = query.getLong(columnIndexOrThrow6);
                c1192b.f26503g = query.getLong(columnIndexOrThrow7);
                c1192b.f26504h = v.a(query.getBlob(columnIndexOrThrow8));
                p pVar = new p(string, string2);
                pVar.f244b = v.e(query.getInt(columnIndexOrThrow10));
                pVar.f246d = query.getString(columnIndexOrThrow12);
                pVar.f247e = androidx.work.b.a(query.getBlob(columnIndexOrThrow13));
                int i15 = i9;
                pVar.f248f = androidx.work.b.a(query.getBlob(i15));
                int i16 = columnIndexOrThrow13;
                int i17 = columnIndexOrThrow15;
                pVar.f249g = query.getLong(i17);
                int i18 = columnIndexOrThrow4;
                int i19 = columnIndexOrThrow16;
                pVar.f250h = query.getLong(i19);
                int i20 = columnIndexOrThrow17;
                pVar.i = query.getLong(i20);
                int i21 = columnIndexOrThrow18;
                pVar.f252k = query.getInt(i21);
                int i22 = columnIndexOrThrow19;
                pVar.f253l = v.b(query.getInt(i22));
                int i23 = columnIndexOrThrow20;
                pVar.f254m = query.getLong(i23);
                int i24 = columnIndexOrThrow21;
                pVar.f255n = query.getLong(i24);
                int i25 = columnIndexOrThrow22;
                pVar.f256o = query.getLong(i25);
                int i26 = columnIndexOrThrow23;
                pVar.f257p = query.getLong(i26);
                int i27 = columnIndexOrThrow24;
                pVar.f258q = query.getInt(i27) != 0;
                int i28 = columnIndexOrThrow25;
                pVar.f259r = v.d(query.getInt(i28));
                pVar.f251j = c1192b;
                arrayList.add(pVar);
                i9 = i15;
                columnIndexOrThrow2 = i13;
                columnIndexOrThrow15 = i17;
                columnIndexOrThrow16 = i19;
                columnIndexOrThrow20 = i23;
                columnIndexOrThrow21 = i24;
                columnIndexOrThrow24 = i27;
                columnIndexOrThrow11 = i11;
                columnIndexOrThrow = i12;
                columnIndexOrThrow25 = i28;
                columnIndexOrThrow23 = i26;
                columnIndexOrThrow13 = i16;
                columnIndexOrThrow9 = i10;
                columnIndexOrThrow3 = i14;
                columnIndexOrThrow22 = i25;
                columnIndexOrThrow4 = i18;
                columnIndexOrThrow17 = i20;
                columnIndexOrThrow18 = i21;
                columnIndexOrThrow19 = i22;
            }
            query.close();
            roomSQLiteQuery.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public final WorkInfo$State f(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f262a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(roomDatabase, acquire, false, null);
        try {
            return query.moveToFirst() ? v.e(query.getInt(0)) : null;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public final ArrayList g(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f262a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(roomDatabase, acquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(query.getString(0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public final p h(String str) {
        RoomSQLiteQuery roomSQLiteQuery;
        p pVar;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f262a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(roomDatabase, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "state");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "output");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "period_start_time");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                if (query.moveToFirst()) {
                    String string = query.getString(columnIndexOrThrow9);
                    String string2 = query.getString(columnIndexOrThrow11);
                    C1192b c1192b = new C1192b();
                    c1192b.f26497a = v.c(query.getInt(columnIndexOrThrow));
                    c1192b.f26498b = query.getInt(columnIndexOrThrow2) != 0;
                    c1192b.f26499c = query.getInt(columnIndexOrThrow3) != 0;
                    c1192b.f26500d = query.getInt(columnIndexOrThrow4) != 0;
                    c1192b.f26501e = query.getInt(columnIndexOrThrow5) != 0;
                    c1192b.f26502f = query.getLong(columnIndexOrThrow6);
                    c1192b.f26503g = query.getLong(columnIndexOrThrow7);
                    c1192b.f26504h = v.a(query.getBlob(columnIndexOrThrow8));
                    p pVar2 = new p(string, string2);
                    pVar2.f244b = v.e(query.getInt(columnIndexOrThrow10));
                    pVar2.f246d = query.getString(columnIndexOrThrow12);
                    pVar2.f247e = androidx.work.b.a(query.getBlob(columnIndexOrThrow13));
                    pVar2.f248f = androidx.work.b.a(query.getBlob(columnIndexOrThrow14));
                    pVar2.f249g = query.getLong(columnIndexOrThrow15);
                    pVar2.f250h = query.getLong(columnIndexOrThrow16);
                    pVar2.i = query.getLong(columnIndexOrThrow17);
                    pVar2.f252k = query.getInt(columnIndexOrThrow18);
                    pVar2.f253l = v.b(query.getInt(columnIndexOrThrow19));
                    pVar2.f254m = query.getLong(columnIndexOrThrow20);
                    pVar2.f255n = query.getLong(columnIndexOrThrow21);
                    pVar2.f256o = query.getLong(columnIndexOrThrow22);
                    pVar2.f257p = query.getLong(columnIndexOrThrow23);
                    pVar2.f258q = query.getInt(columnIndexOrThrow24) != 0;
                    pVar2.f259r = v.d(query.getInt(columnIndexOrThrow25));
                    pVar2.f251j = c1192b;
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
                query.close();
                roomSQLiteQuery.release();
                return pVar;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
        }
    }

    public final ArrayList i(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f262a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(roomDatabase, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                p.a aVar = new p.a();
                aVar.f260a = query.getString(columnIndexOrThrow);
                aVar.f261b = v.e(query.getInt(columnIndexOrThrow2));
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public final int j(String str, long j10) {
        RoomDatabase roomDatabase = this.f262a;
        roomDatabase.assertNotSuspendingTransaction();
        g gVar = this.f269h;
        d1.g acquire = gVar.acquire();
        acquire.bindLong(1, j10);
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        roomDatabase.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            roomDatabase.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            roomDatabase.endTransaction();
            gVar.release(acquire);
        }
    }

    public final void k(String str, androidx.work.b bVar) {
        RoomDatabase roomDatabase = this.f262a;
        roomDatabase.assertNotSuspendingTransaction();
        c cVar = this.f265d;
        d1.g acquire = cVar.acquire();
        byte[] b9 = androidx.work.b.b(bVar);
        if (b9 == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindBlob(1, b9);
        }
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        roomDatabase.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
            cVar.release(acquire);
        }
    }

    public final void l(String str, long j10) {
        RoomDatabase roomDatabase = this.f262a;
        roomDatabase.assertNotSuspendingTransaction();
        d dVar = this.f266e;
        d1.g acquire = dVar.acquire();
        acquire.bindLong(1, j10);
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        roomDatabase.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
            dVar.release(acquire);
        }
    }

    public final int m(WorkInfo$State workInfo$State, String... strArr) {
        RoomDatabase roomDatabase = this.f262a;
        roomDatabase.assertNotSuspendingTransaction();
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("UPDATE workspec SET state=");
        newStringBuilder.append("?");
        newStringBuilder.append(" WHERE id IN (");
        StringUtil.appendPlaceholders(newStringBuilder, strArr.length);
        newStringBuilder.append(")");
        d1.g compileStatement = roomDatabase.compileStatement(newStringBuilder.toString());
        compileStatement.bindLong(1, v.f(workInfo$State));
        int i9 = 2;
        for (String str : strArr) {
            if (str == null) {
                compileStatement.bindNull(i9);
            } else {
                compileStatement.bindString(i9, str);
            }
            i9++;
        }
        roomDatabase.beginTransaction();
        try {
            int executeUpdateDelete = compileStatement.executeUpdateDelete();
            roomDatabase.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            roomDatabase.endTransaction();
        }
    }
}
