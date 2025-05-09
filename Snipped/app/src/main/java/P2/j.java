package p2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import j2.AbstractC0888g;
import j2.AbstractC0892k;
import j2.C0884c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import q2.InterfaceC1129a;
import s2.C1203a;

/* compiled from: SQLiteEventStore.java */
/* loaded from: classes.dex */
public final class j implements InterfaceC1102c, InterfaceC1129a {

    /* renamed from: e, reason: collision with root package name */
    public static final g2.b f25601e = new g2.b("proto");

    /* renamed from: a, reason: collision with root package name */
    public final l f25602a;

    /* renamed from: b, reason: collision with root package name */
    public final r2.a f25603b;

    /* renamed from: c, reason: collision with root package name */
    public final r2.a f25604c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1103d f25605d;

    /* compiled from: SQLiteEventStore.java */
    public interface a<T, U> {
        U apply(T t3);
    }

    /* compiled from: SQLiteEventStore.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f25606a;

        /* renamed from: b, reason: collision with root package name */
        public final String f25607b;

        public b(String str, String str2) {
            this.f25606a = str;
            this.f25607b = str2;
        }
    }

    public j(r2.a aVar, r2.a aVar2, AbstractC1103d abstractC1103d, l lVar) {
        this.f25602a = lVar;
        this.f25603b = aVar;
        this.f25604c = aVar2;
        this.f25605d = abstractC1103d;
    }

    public static <T> T A(Cursor cursor, a<Cursor, T> aVar) {
        try {
            return aVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long j(SQLiteDatabase sQLiteDatabase, AbstractC0892k abstractC0892k) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(abstractC0892k.b(), String.valueOf(C1203a.a(abstractC0892k.d()))));
        if (abstractC0892k.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(abstractC0892k.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) A(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new org.bouncycastle.asn1.a());
    }

    public static String y(Iterable<h> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<h> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().b());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    @Override // p2.InterfaceC1102c
    public final long B(AbstractC0892k abstractC0892k) {
        Cursor rawQuery = i().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{abstractC0892k.b(), String.valueOf(C1203a.a(abstractC0892k.d()))});
        try {
            Cursor cursor = rawQuery;
            Long valueOf = cursor.moveToNext() ? Long.valueOf(cursor.getLong(0)) : 0L;
            rawQuery.close();
            return valueOf.longValue();
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // p2.InterfaceC1102c
    public final boolean K(AbstractC0892k abstractC0892k) {
        Boolean bool;
        SQLiteDatabase i = i();
        i.beginTransaction();
        try {
            Long j10 = j(i, abstractC0892k);
            if (j10 == null) {
                bool = Boolean.FALSE;
            } else {
                Cursor rawQuery = i().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{j10.toString()});
                try {
                    Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                    rawQuery.close();
                    bool = valueOf;
                } catch (Throwable th) {
                    rawQuery.close();
                    throw th;
                }
            }
            i.setTransactionSuccessful();
            i.endTransaction();
            return bool.booleanValue();
        } catch (Throwable th2) {
            i.endTransaction();
            throw th2;
        }
    }

    @Override // p2.InterfaceC1102c
    public final C1101b b0(AbstractC0892k abstractC0892k, AbstractC0888g abstractC0888g) {
        Priority d10 = abstractC0892k.d();
        String g10 = abstractC0888g.g();
        String b9 = abstractC0892k.b();
        Log.d("TransportRuntime.".concat("SQLiteEventStore"), "Storing event with priority=" + d10 + ", name=" + g10 + " for destination " + b9);
        long longValue = ((Long) p(new M.b(this, abstractC0892k, abstractC0888g, 7))).longValue();
        if (longValue < 1) {
            return null;
        }
        return new C1101b(longValue, abstractC0892k, abstractC0888g);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f25602a.close();
    }

    @Override // q2.InterfaceC1129a
    public final <T> T d(InterfaceC1129a.InterfaceC0457a<T> interfaceC0457a) {
        SQLiteDatabase i = i();
        r2.a aVar = this.f25604c;
        long a10 = aVar.a();
        while (true) {
            try {
                i.beginTransaction();
                try {
                    T execute = interfaceC0457a.execute();
                    i.setTransactionSuccessful();
                    return execute;
                } finally {
                    i.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.a() >= this.f25605d.a() + a10) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // p2.InterfaceC1102c
    public final int e() {
        long a10 = this.f25603b.a() - this.f25605d.b();
        SQLiteDatabase i = i();
        i.beginTransaction();
        try {
            int delete = i.delete("events", "timestamp_ms < ?", new String[]{String.valueOf(a10)});
            i.setTransactionSuccessful();
            return delete;
        } finally {
            i.endTransaction();
        }
    }

    @Override // p2.InterfaceC1102c
    public final void f(Iterable<h> iterable) {
        if (iterable.iterator().hasNext()) {
            i().compileStatement("DELETE FROM events WHERE _id in " + y(iterable)).execute();
        }
    }

    @Override // p2.InterfaceC1102c
    public final void f0(Iterable<h> iterable) {
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + y(iterable);
            SQLiteDatabase i = i();
            i.beginTransaction();
            try {
                i.compileStatement(str).execute();
                i.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                i.setTransactionSuccessful();
            } finally {
                i.endTransaction();
            }
        }
    }

    @Override // p2.InterfaceC1102c
    public final Iterable<h> g(AbstractC0892k abstractC0892k) {
        return (Iterable) p(new B.e(7, this, abstractC0892k));
    }

    public final SQLiteDatabase i() {
        l lVar = this.f25602a;
        Objects.requireNonNull(lVar);
        r2.a aVar = this.f25604c;
        long a10 = aVar.a();
        while (true) {
            try {
                return lVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.a() >= this.f25605d.a() + a10) {
                    throw new SynchronizationException("Timed out while trying to open db.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final <T> T p(a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase i = i();
        i.beginTransaction();
        try {
            T apply = aVar.apply(i);
            i.setTransactionSuccessful();
            return apply;
        } finally {
            i.endTransaction();
        }
    }

    @Override // p2.InterfaceC1102c
    public final Iterable<AbstractC0892k> t() {
        SQLiteDatabase i = i();
        i.beginTransaction();
        try {
            Cursor rawQuery = i.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
            try {
                Cursor cursor = rawQuery;
                ArrayList arrayList = new ArrayList();
                while (cursor.moveToNext()) {
                    C0884c.a a10 = AbstractC0892k.a();
                    a10.b(cursor.getString(1));
                    a10.c(C1203a.b(cursor.getInt(2)));
                    String string = cursor.getString(3);
                    a10.f22430b = string == null ? null : Base64.decode(string, 0);
                    arrayList.add(a10.a());
                }
                rawQuery.close();
                i.setTransactionSuccessful();
                return arrayList;
            } catch (Throwable th) {
                rawQuery.close();
                throw th;
            }
        } finally {
            i.endTransaction();
        }
    }

    @Override // p2.InterfaceC1102c
    public final void u(long j10, AbstractC0892k abstractC0892k) {
        p(new i(j10, abstractC0892k));
    }
}
