package com.chuckerteam.chucker.internal.data.room;

import R1.b;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import d1.c;
import d1.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class ChuckerDatabase_Impl extends ChuckerDatabase {

    /* renamed from: b, reason: collision with root package name */
    public volatile b f8622b;

    @Override // com.chuckerteam.chucker.internal.data.room.ChuckerDatabase
    public final R1.a a() {
        b bVar;
        if (this.f8622b != null) {
            return this.f8622b;
        }
        synchronized (this) {
            try {
                if (this.f8622b == null) {
                    this.f8622b = new b(this);
                }
                bVar = this.f8622b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        super.assertNotMainThread();
        c writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `transactions`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "transactions");
    }

    @Override // androidx.room.RoomDatabase
    public final d createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(new d.b(databaseConfiguration.context, databaseConfiguration.name, new RoomOpenHelper(databaseConfiguration, new a(), "ac72c06b37efb89e6417a7707016d4f5", "a70b1841a05694f746087779f5a5c887"), false));
    }

    @Override // androidx.room.RoomDatabase
    public final List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public final Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(R1.a.class, Collections.emptyList());
        return hashMap;
    }

    public class a extends RoomOpenHelper.Delegate {
        public a() {
            super(9);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public final void createAllTables(c cVar) {
            cVar.execSQL("CREATE TABLE IF NOT EXISTS `transactions` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `requestDate` INTEGER, `responseDate` INTEGER, `tookMs` INTEGER, `protocol` TEXT, `method` TEXT, `url` TEXT, `host` TEXT, `path` TEXT, `scheme` TEXT, `responseTlsVersion` TEXT, `responseCipherSuite` TEXT, `requestPayloadSize` INTEGER, `requestContentType` TEXT, `requestHeaders` TEXT, `requestHeadersSize` INTEGER, `requestBody` TEXT, `isRequestBodyEncoded` INTEGER NOT NULL, `responseCode` INTEGER, `responseMessage` TEXT, `error` TEXT, `responsePayloadSize` INTEGER, `responseContentType` TEXT, `responseHeaders` TEXT, `responseHeadersSize` INTEGER, `responseBody` TEXT, `isResponseBodyEncoded` INTEGER NOT NULL, `responseImageData` BLOB, `graphQlDetected` INTEGER NOT NULL, `graphQlOperationName` TEXT)");
            cVar.execSQL(RoomMasterTable.CREATE_QUERY);
            cVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ac72c06b37efb89e6417a7707016d4f5')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public final void dropAllTables(c cVar) {
            cVar.execSQL("DROP TABLE IF EXISTS `transactions`");
            List list = ((RoomDatabase) ChuckerDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.Callback) it.next()).onDestructiveMigration(cVar);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public final void onCreate(c cVar) {
            List list = ((RoomDatabase) ChuckerDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.Callback) it.next()).onCreate(cVar);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public final void onOpen(c cVar) {
            ChuckerDatabase_Impl chuckerDatabase_Impl = ChuckerDatabase_Impl.this;
            ((RoomDatabase) chuckerDatabase_Impl).mDatabase = cVar;
            chuckerDatabase_Impl.internalInitInvalidationTracker(cVar);
            List list = ((RoomDatabase) chuckerDatabase_Impl).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.Callback) it.next()).onOpen(cVar);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public final void onPreMigrate(c cVar) {
            DBUtil.dropFtsSyncTriggers(cVar);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public final RoomOpenHelper.ValidationResult onValidateSchema(c cVar) {
            HashMap hashMap = new HashMap(30);
            hashMap.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            hashMap.put("requestDate", new TableInfo.Column("requestDate", "INTEGER", false, 0, null, 1));
            hashMap.put("responseDate", new TableInfo.Column("responseDate", "INTEGER", false, 0, null, 1));
            hashMap.put("tookMs", new TableInfo.Column("tookMs", "INTEGER", false, 0, null, 1));
            hashMap.put("protocol", new TableInfo.Column("protocol", "TEXT", false, 0, null, 1));
            hashMap.put(FirebaseAnalytics.Param.METHOD, new TableInfo.Column(FirebaseAnalytics.Param.METHOD, "TEXT", false, 0, null, 1));
            hashMap.put(ImagesContract.URL, new TableInfo.Column(ImagesContract.URL, "TEXT", false, 0, null, 1));
            hashMap.put("host", new TableInfo.Column("host", "TEXT", false, 0, null, 1));
            hashMap.put("path", new TableInfo.Column("path", "TEXT", false, 0, null, 1));
            hashMap.put("scheme", new TableInfo.Column("scheme", "TEXT", false, 0, null, 1));
            hashMap.put("responseTlsVersion", new TableInfo.Column("responseTlsVersion", "TEXT", false, 0, null, 1));
            hashMap.put("responseCipherSuite", new TableInfo.Column("responseCipherSuite", "TEXT", false, 0, null, 1));
            hashMap.put("requestPayloadSize", new TableInfo.Column("requestPayloadSize", "INTEGER", false, 0, null, 1));
            hashMap.put("requestContentType", new TableInfo.Column("requestContentType", "TEXT", false, 0, null, 1));
            hashMap.put("requestHeaders", new TableInfo.Column("requestHeaders", "TEXT", false, 0, null, 1));
            hashMap.put("requestHeadersSize", new TableInfo.Column("requestHeadersSize", "INTEGER", false, 0, null, 1));
            hashMap.put("requestBody", new TableInfo.Column("requestBody", "TEXT", false, 0, null, 1));
            hashMap.put("isRequestBodyEncoded", new TableInfo.Column("isRequestBodyEncoded", "INTEGER", true, 0, null, 1));
            hashMap.put("responseCode", new TableInfo.Column("responseCode", "INTEGER", false, 0, null, 1));
            hashMap.put("responseMessage", new TableInfo.Column("responseMessage", "TEXT", false, 0, null, 1));
            hashMap.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, new TableInfo.Column(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "TEXT", false, 0, null, 1));
            hashMap.put("responsePayloadSize", new TableInfo.Column("responsePayloadSize", "INTEGER", false, 0, null, 1));
            hashMap.put("responseContentType", new TableInfo.Column("responseContentType", "TEXT", false, 0, null, 1));
            hashMap.put("responseHeaders", new TableInfo.Column("responseHeaders", "TEXT", false, 0, null, 1));
            hashMap.put("responseHeadersSize", new TableInfo.Column("responseHeadersSize", "INTEGER", false, 0, null, 1));
            hashMap.put("responseBody", new TableInfo.Column("responseBody", "TEXT", false, 0, null, 1));
            hashMap.put("isResponseBodyEncoded", new TableInfo.Column("isResponseBodyEncoded", "INTEGER", true, 0, null, 1));
            hashMap.put("responseImageData", new TableInfo.Column("responseImageData", "BLOB", false, 0, null, 1));
            hashMap.put("graphQlDetected", new TableInfo.Column("graphQlDetected", "INTEGER", true, 0, null, 1));
            hashMap.put("graphQlOperationName", new TableInfo.Column("graphQlOperationName", "TEXT", false, 0, null, 1));
            TableInfo tableInfo = new TableInfo("transactions", hashMap, new HashSet(0), new HashSet(0));
            TableInfo read = TableInfo.read(cVar, "transactions");
            if (tableInfo.equals(read)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "transactions(com.chuckerteam.chucker.internal.data.entity.HttpTransaction).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public final void onPostMigrate(c cVar) {
        }
    }
}
