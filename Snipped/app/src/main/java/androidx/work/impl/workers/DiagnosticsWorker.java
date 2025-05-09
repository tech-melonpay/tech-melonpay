package androidx.work.impl.workers;

import B1.g;
import B1.h;
import B1.i;
import B1.k;
import B1.l;
import B1.p;
import B1.q;
import B1.r;
import B1.t;
import B1.u;
import B1.v;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import s1.AbstractC1197g;
import s1.C1192b;
import s3.b;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: g, reason: collision with root package name */
    public static final String f8250g = AbstractC1197g.e("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String i(k kVar, t tVar, h hVar, ArrayList arrayList) {
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            g a10 = ((i) hVar).a(pVar.f243a);
            Integer valueOf = a10 != null ? Integer.valueOf(a10.f232b) : null;
            String str = pVar.f243a;
            l lVar = (l) kVar;
            lVar.getClass();
            RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT name FROM workname WHERE work_spec_id=?", 1);
            if (str == null) {
                acquire.bindNull(1);
            } else {
                acquire.bindString(1, str);
            }
            RoomDatabase roomDatabase = lVar.f238a;
            roomDatabase.assertNotSuspendingTransaction();
            Cursor query = DBUtil.query(roomDatabase, acquire, false, null);
            try {
                ArrayList arrayList2 = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    arrayList2.add(query.getString(0));
                }
                query.close();
                acquire.release();
                ArrayList a11 = ((u) tVar).a(pVar.f243a);
                String join = TextUtils.join(",", arrayList2);
                String join2 = TextUtils.join(",", a11);
                String str2 = pVar.f243a;
                String str3 = pVar.f245c;
                String name = pVar.f244b.name();
                StringBuilder p10 = b.p("\n", str2, "\t ", str3, "\t ");
                p10.append(valueOf);
                p10.append("\t ");
                p10.append(name);
                p10.append("\t ");
                sb2.append(b.o(p10, join, "\t ", join2, "\t"));
            } catch (Throwable th) {
                query.close();
                acquire.release();
                throw th;
            }
        }
        return sb2.toString();
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a.c h() {
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
        h hVar;
        k kVar;
        t tVar;
        int i;
        WorkDatabase workDatabase = t1.k.b(this.f8085a).f27440c;
        q f10 = workDatabase.f();
        k d10 = workDatabase.d();
        t g10 = workDatabase.g();
        h c2 = workDatabase.c();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        r rVar = (r) f10;
        rVar.getClass();
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        acquire.bindLong(1, currentTimeMillis);
        RoomDatabase roomDatabase = rVar.f262a;
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
                c1192b.f26502f = query.getLong(columnIndexOrThrow6);
                c1192b.f26503g = query.getLong(columnIndexOrThrow7);
                c1192b.f26504h = v.a(query.getBlob(columnIndexOrThrow8));
                p pVar = new p(string, string2);
                pVar.f244b = v.e(query.getInt(columnIndexOrThrow10));
                pVar.f246d = query.getString(columnIndexOrThrow12);
                pVar.f247e = androidx.work.b.a(query.getBlob(columnIndexOrThrow13));
                int i14 = i9;
                pVar.f248f = androidx.work.b.a(query.getBlob(i14));
                int i15 = columnIndexOrThrow10;
                i9 = i14;
                int i16 = columnIndexOrThrow15;
                pVar.f249g = query.getLong(i16);
                int i17 = columnIndexOrThrow12;
                int i18 = columnIndexOrThrow16;
                pVar.f250h = query.getLong(i18);
                int i19 = columnIndexOrThrow13;
                int i20 = columnIndexOrThrow17;
                pVar.i = query.getLong(i20);
                int i21 = columnIndexOrThrow18;
                pVar.f252k = query.getInt(i21);
                int i22 = columnIndexOrThrow19;
                pVar.f253l = v.b(query.getInt(i22));
                columnIndexOrThrow17 = i20;
                int i23 = columnIndexOrThrow20;
                pVar.f254m = query.getLong(i23);
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
                pVar.f259r = v.d(query.getInt(i28));
                pVar.f251j = c1192b;
                arrayList.add(pVar);
                columnIndexOrThrow25 = i28;
                columnIndexOrThrow10 = i15;
                columnIndexOrThrow12 = i17;
                columnIndexOrThrow23 = i26;
                columnIndexOrThrow11 = i11;
                columnIndexOrThrow2 = i13;
                columnIndexOrThrow = i12;
                columnIndexOrThrow24 = i27;
                columnIndexOrThrow15 = i16;
                columnIndexOrThrow9 = i10;
                columnIndexOrThrow20 = i23;
                columnIndexOrThrow13 = i19;
                columnIndexOrThrow16 = i18;
                columnIndexOrThrow18 = i21;
                columnIndexOrThrow19 = i22;
            }
            query.close();
            roomSQLiteQuery.release();
            ArrayList d11 = rVar.d();
            ArrayList b9 = rVar.b();
            boolean isEmpty = arrayList.isEmpty();
            String str = f8250g;
            if (isEmpty) {
                hVar = c2;
                kVar = d10;
                tVar = g10;
                i = 0;
            } else {
                i = 0;
                AbstractC1197g.c().d(str, "Recently completed work:\n\n", new Throwable[0]);
                hVar = c2;
                kVar = d10;
                tVar = g10;
                AbstractC1197g.c().d(str, i(kVar, tVar, hVar, arrayList), new Throwable[0]);
            }
            if (!d11.isEmpty()) {
                AbstractC1197g.c().d(str, "Running work:\n\n", new Throwable[i]);
                AbstractC1197g.c().d(str, i(kVar, tVar, hVar, d11), new Throwable[i]);
            }
            if (!b9.isEmpty()) {
                AbstractC1197g.c().d(str, "Enqueued work:\n\n", new Throwable[i]);
                AbstractC1197g.c().d(str, i(kVar, tVar, hVar, b9), new Throwable[i]);
            }
            return new ListenableWorker.a.c();
        } catch (Throwable th2) {
            th = th2;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }
}
