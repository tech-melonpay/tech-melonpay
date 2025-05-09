package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.room.migration.Migration;

/* compiled from: WorkDatabaseMigrations.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0087a f8142a = new C0087a(1, 2);

    /* renamed from: b, reason: collision with root package name */
    public static final b f8143b = new b(3, 4);

    /* renamed from: c, reason: collision with root package name */
    public static final c f8144c = new c(4, 5);

    /* renamed from: d, reason: collision with root package name */
    public static final d f8145d = new d(6, 7);

    /* renamed from: e, reason: collision with root package name */
    public static final e f8146e = new e(7, 8);

    /* renamed from: f, reason: collision with root package name */
    public static final f f8147f = new f(8, 9);

    /* renamed from: g, reason: collision with root package name */
    public static final g f8148g = new g(11, 12);

    /* compiled from: WorkDatabaseMigrations.java */
    /* renamed from: androidx.work.impl.a$a, reason: collision with other inner class name */
    public class C0087a extends Migration {
        @Override // androidx.room.migration.Migration
        public final void migrate(d1.c cVar) {
            cVar.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            cVar.execSQL("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            cVar.execSQL("DROP TABLE IF EXISTS alarmInfo");
            cVar.execSQL("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    public class b extends Migration {
        @Override // androidx.room.migration.Migration
        public final void migrate(d1.c cVar) {
            cVar.execSQL("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    public class c extends Migration {
        @Override // androidx.room.migration.Migration
        public final void migrate(d1.c cVar) {
            cVar.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            cVar.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    public class d extends Migration {
        @Override // androidx.room.migration.Migration
        public final void migrate(d1.c cVar) {
            cVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    public class e extends Migration {
        @Override // androidx.room.migration.Migration
        public final void migrate(d1.c cVar) {
            cVar.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    public class f extends Migration {
        @Override // androidx.room.migration.Migration
        public final void migrate(d1.c cVar) {
            cVar.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    public class g extends Migration {
        @Override // androidx.room.migration.Migration
        public final void migrate(d1.c cVar) {
            cVar.execSQL("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    public static class h extends Migration {

        /* renamed from: a, reason: collision with root package name */
        public final Context f8149a;

        public h(Context context, int i, int i9) {
            super(i, i9);
            this.f8149a = context;
        }

        @Override // androidx.room.migration.Migration
        public final void migrate(d1.c cVar) {
            if (this.endVersion >= 10) {
                cVar.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f8149a.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    public static class i extends Migration {

        /* renamed from: a, reason: collision with root package name */
        public final Context f8150a;

        public i(Context context) {
            super(9, 10);
            this.f8150a = context;
        }

        @Override // androidx.room.migration.Migration
        public final void migrate(d1.c cVar) {
            cVar.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            Context context = this.f8150a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
            if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                cVar.beginTransaction();
                try {
                    cVar.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                    cVar.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j11)});
                    sharedPreferences.edit().clear().apply();
                    cVar.setTransactionSuccessful();
                } finally {
                }
            }
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i9 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                cVar.beginTransaction();
                try {
                    cVar.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                    cVar.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i9)});
                    sharedPreferences2.edit().clear().apply();
                    cVar.setTransactionSuccessful();
                } finally {
                }
            }
        }
    }
}
