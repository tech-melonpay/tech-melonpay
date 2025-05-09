package R1;

import android.database.Cursor;
import androidx.lifecycle.AbstractC0557x;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import d1.g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: HttpTransactionDao_Impl.java */
/* loaded from: classes.dex */
public final class b implements R1.a {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f3243a;

    /* renamed from: b, reason: collision with root package name */
    public final R1.d f3244b;

    /* compiled from: HttpTransactionDao_Impl.java */
    public class a implements Callable<List<com.chuckerteam.chucker.internal.data.entity.a>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f3245a;

        public a(RoomSQLiteQuery roomSQLiteQuery) {
            this.f3245a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final List<com.chuckerteam.chucker.internal.data.entity.a> call() {
            Cursor query = DBUtil.query(b.this.f3243a, this.f3245a, false, null);
            try {
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    arrayList.add(new com.chuckerteam.chucker.internal.data.entity.a(query.getLong(0), query.isNull(1) ? null : Long.valueOf(query.getLong(1)), query.isNull(2) ? null : Long.valueOf(query.getLong(2)), query.isNull(3) ? null : query.getString(3), query.isNull(4) ? null : query.getString(4), query.isNull(5) ? null : query.getString(5), query.isNull(6) ? null : query.getString(6), query.isNull(7) ? null : query.getString(7), query.isNull(8) ? null : Integer.valueOf(query.getInt(8)), query.isNull(9) ? null : Long.valueOf(query.getLong(9)), query.isNull(10) ? null : Long.valueOf(query.getLong(10)), query.isNull(11) ? null : query.getString(11), query.getInt(12) != 0, query.isNull(13) ? null : query.getString(13)));
                }
                return arrayList;
            } finally {
                query.close();
            }
        }

        public final void finalize() {
            this.f3245a.release();
        }
    }

    /* compiled from: HttpTransactionDao_Impl.java */
    /* renamed from: R1.b$b, reason: collision with other inner class name */
    public class CallableC0041b implements Callable<HttpTransaction> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f3247a;

        public CallableC0041b(RoomSQLiteQuery roomSQLiteQuery) {
            this.f3247a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final HttpTransaction call() {
            HttpTransaction httpTransaction;
            String string;
            int i;
            String string2;
            int i9;
            Long valueOf;
            int i10;
            String string3;
            int i11;
            int i12;
            boolean z10;
            Integer valueOf2;
            int i13;
            String string4;
            int i14;
            String string5;
            int i15;
            Long valueOf3;
            int i16;
            String string6;
            int i17;
            String string7;
            int i18;
            Long valueOf4;
            int i19;
            String string8;
            int i20;
            int i21;
            boolean z11;
            byte[] blob;
            int i22;
            Cursor query = DBUtil.query(b.this.f3243a, this.f3247a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "requestDate");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "responseDate");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "tookMs");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "protocol");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, FirebaseAnalytics.Param.METHOD);
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, ImagesContract.URL);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "host");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "path");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "scheme");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "responseTlsVersion");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "responseCipherSuite");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "requestPayloadSize");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "requestContentType");
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "requestHeaders");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "requestHeadersSize");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "requestBody");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "isRequestBodyEncoded");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "responseCode");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "responseMessage");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "responsePayloadSize");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "responseContentType");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "responseHeaders");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "responseHeadersSize");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "responseBody");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "isResponseBodyEncoded");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "responseImageData");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "graphQlDetected");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "graphQlOperationName");
                if (query.moveToFirst()) {
                    long j10 = query.getLong(columnIndexOrThrow);
                    Long valueOf5 = query.isNull(columnIndexOrThrow2) ? null : Long.valueOf(query.getLong(columnIndexOrThrow2));
                    Long valueOf6 = query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3));
                    Long valueOf7 = query.isNull(columnIndexOrThrow4) ? null : Long.valueOf(query.getLong(columnIndexOrThrow4));
                    String string9 = query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5);
                    String string10 = query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6);
                    String string11 = query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7);
                    String string12 = query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8);
                    String string13 = query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9);
                    String string14 = query.isNull(columnIndexOrThrow10) ? null : query.getString(columnIndexOrThrow10);
                    String string15 = query.isNull(columnIndexOrThrow11) ? null : query.getString(columnIndexOrThrow11);
                    String string16 = query.isNull(columnIndexOrThrow12) ? null : query.getString(columnIndexOrThrow12);
                    Long valueOf8 = query.isNull(columnIndexOrThrow13) ? null : Long.valueOf(query.getLong(columnIndexOrThrow13));
                    if (query.isNull(columnIndexOrThrow14)) {
                        i = columnIndexOrThrow15;
                        string = null;
                    } else {
                        string = query.getString(columnIndexOrThrow14);
                        i = columnIndexOrThrow15;
                    }
                    if (query.isNull(i)) {
                        i9 = columnIndexOrThrow16;
                        string2 = null;
                    } else {
                        string2 = query.getString(i);
                        i9 = columnIndexOrThrow16;
                    }
                    if (query.isNull(i9)) {
                        i10 = columnIndexOrThrow17;
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(query.getLong(i9));
                        i10 = columnIndexOrThrow17;
                    }
                    if (query.isNull(i10)) {
                        i11 = columnIndexOrThrow18;
                        string3 = null;
                    } else {
                        string3 = query.getString(i10);
                        i11 = columnIndexOrThrow18;
                    }
                    if (query.getInt(i11) != 0) {
                        z10 = true;
                        i12 = columnIndexOrThrow19;
                    } else {
                        i12 = columnIndexOrThrow19;
                        z10 = false;
                    }
                    if (query.isNull(i12)) {
                        i13 = columnIndexOrThrow20;
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf(query.getInt(i12));
                        i13 = columnIndexOrThrow20;
                    }
                    if (query.isNull(i13)) {
                        i14 = columnIndexOrThrow21;
                        string4 = null;
                    } else {
                        string4 = query.getString(i13);
                        i14 = columnIndexOrThrow21;
                    }
                    if (query.isNull(i14)) {
                        i15 = columnIndexOrThrow22;
                        string5 = null;
                    } else {
                        string5 = query.getString(i14);
                        i15 = columnIndexOrThrow22;
                    }
                    if (query.isNull(i15)) {
                        i16 = columnIndexOrThrow23;
                        valueOf3 = null;
                    } else {
                        valueOf3 = Long.valueOf(query.getLong(i15));
                        i16 = columnIndexOrThrow23;
                    }
                    if (query.isNull(i16)) {
                        i17 = columnIndexOrThrow24;
                        string6 = null;
                    } else {
                        string6 = query.getString(i16);
                        i17 = columnIndexOrThrow24;
                    }
                    if (query.isNull(i17)) {
                        i18 = columnIndexOrThrow25;
                        string7 = null;
                    } else {
                        string7 = query.getString(i17);
                        i18 = columnIndexOrThrow25;
                    }
                    if (query.isNull(i18)) {
                        i19 = columnIndexOrThrow26;
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(query.getLong(i18));
                        i19 = columnIndexOrThrow26;
                    }
                    if (query.isNull(i19)) {
                        i20 = columnIndexOrThrow27;
                        string8 = null;
                    } else {
                        string8 = query.getString(i19);
                        i20 = columnIndexOrThrow27;
                    }
                    if (query.getInt(i20) != 0) {
                        z11 = true;
                        i21 = columnIndexOrThrow28;
                    } else {
                        i21 = columnIndexOrThrow28;
                        z11 = false;
                    }
                    if (query.isNull(i21)) {
                        i22 = columnIndexOrThrow29;
                        blob = null;
                    } else {
                        blob = query.getBlob(i21);
                        i22 = columnIndexOrThrow29;
                    }
                    httpTransaction = new HttpTransaction(j10, valueOf5, valueOf6, valueOf7, string9, string10, string11, string12, string13, string14, string15, string16, valueOf8, string, string2, valueOf, string3, z10, valueOf2, string4, string5, valueOf3, string6, string7, valueOf4, string8, z11, blob, query.getInt(i22) != 0, query.isNull(columnIndexOrThrow30) ? null : query.getString(columnIndexOrThrow30));
                } else {
                    httpTransaction = null;
                }
                return httpTransaction;
            } finally {
                query.close();
            }
        }

        public final void finalize() {
            this.f3247a.release();
        }
    }

    /* compiled from: HttpTransactionDao_Impl.java */
    public class c implements Callable<List<HttpTransaction>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f3249a;

        public c(RoomSQLiteQuery roomSQLiteQuery) {
            this.f3249a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final List<HttpTransaction> call() {
            RoomSQLiteQuery roomSQLiteQuery;
            Long valueOf;
            int i;
            String string;
            int i9;
            RoomDatabase roomDatabase = b.this.f3243a;
            RoomSQLiteQuery roomSQLiteQuery2 = this.f3249a;
            Cursor query = DBUtil.query(roomDatabase, roomSQLiteQuery2, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "requestDate");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "responseDate");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "tookMs");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "protocol");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, FirebaseAnalytics.Param.METHOD);
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, ImagesContract.URL);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "host");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "path");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "scheme");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "responseTlsVersion");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "responseCipherSuite");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "requestPayloadSize");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "requestContentType");
                roomSQLiteQuery = roomSQLiteQuery2;
                try {
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "requestHeaders");
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "requestHeadersSize");
                    int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "requestBody");
                    int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "isRequestBodyEncoded");
                    int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "responseCode");
                    int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "responseMessage");
                    int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                    int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "responsePayloadSize");
                    int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "responseContentType");
                    int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "responseHeaders");
                    int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "responseHeadersSize");
                    int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "responseBody");
                    int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "isResponseBodyEncoded");
                    int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "responseImageData");
                    int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "graphQlDetected");
                    int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "graphQlOperationName");
                    int i10 = columnIndexOrThrow14;
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        long j10 = query.getLong(columnIndexOrThrow);
                        Long valueOf2 = query.isNull(columnIndexOrThrow2) ? null : Long.valueOf(query.getLong(columnIndexOrThrow2));
                        Long valueOf3 = query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3));
                        Long valueOf4 = query.isNull(columnIndexOrThrow4) ? null : Long.valueOf(query.getLong(columnIndexOrThrow4));
                        String string2 = query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5);
                        String string3 = query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6);
                        String string4 = query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7);
                        String string5 = query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8);
                        String string6 = query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9);
                        String string7 = query.isNull(columnIndexOrThrow10) ? null : query.getString(columnIndexOrThrow10);
                        String string8 = query.isNull(columnIndexOrThrow11) ? null : query.getString(columnIndexOrThrow11);
                        String string9 = query.isNull(columnIndexOrThrow12) ? null : query.getString(columnIndexOrThrow12);
                        if (query.isNull(columnIndexOrThrow13)) {
                            i = i10;
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(query.getLong(columnIndexOrThrow13));
                            i = i10;
                        }
                        String string10 = query.isNull(i) ? null : query.getString(i);
                        int i11 = columnIndexOrThrow15;
                        int i12 = columnIndexOrThrow;
                        String string11 = query.isNull(i11) ? null : query.getString(i11);
                        int i13 = columnIndexOrThrow16;
                        Long valueOf5 = query.isNull(i13) ? null : Long.valueOf(query.getLong(i13));
                        int i14 = columnIndexOrThrow17;
                        String string12 = query.isNull(i14) ? null : query.getString(i14);
                        int i15 = columnIndexOrThrow18;
                        boolean z10 = query.getInt(i15) != 0;
                        int i16 = columnIndexOrThrow19;
                        Integer valueOf6 = query.isNull(i16) ? null : Integer.valueOf(query.getInt(i16));
                        int i17 = columnIndexOrThrow20;
                        String string13 = query.isNull(i17) ? null : query.getString(i17);
                        int i18 = columnIndexOrThrow21;
                        String string14 = query.isNull(i18) ? null : query.getString(i18);
                        int i19 = columnIndexOrThrow22;
                        Long valueOf7 = query.isNull(i19) ? null : Long.valueOf(query.getLong(i19));
                        int i20 = columnIndexOrThrow23;
                        String string15 = query.isNull(i20) ? null : query.getString(i20);
                        int i21 = columnIndexOrThrow24;
                        String string16 = query.isNull(i21) ? null : query.getString(i21);
                        int i22 = columnIndexOrThrow25;
                        Long valueOf8 = query.isNull(i22) ? null : Long.valueOf(query.getLong(i22));
                        int i23 = columnIndexOrThrow26;
                        String string17 = query.isNull(i23) ? null : query.getString(i23);
                        int i24 = columnIndexOrThrow27;
                        boolean z11 = query.getInt(i24) != 0;
                        int i25 = columnIndexOrThrow28;
                        byte[] blob = query.isNull(i25) ? null : query.getBlob(i25);
                        int i26 = columnIndexOrThrow29;
                        boolean z12 = query.getInt(i26) != 0;
                        int i27 = columnIndexOrThrow30;
                        if (query.isNull(i27)) {
                            i9 = i27;
                            string = null;
                        } else {
                            string = query.getString(i27);
                            i9 = i27;
                        }
                        arrayList.add(new HttpTransaction(j10, valueOf2, valueOf3, valueOf4, string2, string3, string4, string5, string6, string7, string8, string9, valueOf, string10, string11, valueOf5, string12, z10, valueOf6, string13, string14, valueOf7, string15, string16, valueOf8, string17, z11, blob, z12, string));
                        columnIndexOrThrow = i12;
                        columnIndexOrThrow15 = i11;
                        columnIndexOrThrow16 = i13;
                        columnIndexOrThrow17 = i14;
                        columnIndexOrThrow18 = i15;
                        columnIndexOrThrow19 = i16;
                        columnIndexOrThrow20 = i17;
                        columnIndexOrThrow21 = i18;
                        columnIndexOrThrow22 = i19;
                        columnIndexOrThrow23 = i20;
                        columnIndexOrThrow24 = i21;
                        columnIndexOrThrow25 = i22;
                        columnIndexOrThrow26 = i23;
                        columnIndexOrThrow27 = i24;
                        columnIndexOrThrow28 = i25;
                        columnIndexOrThrow29 = i26;
                        columnIndexOrThrow30 = i9;
                        i10 = i;
                    }
                    query.close();
                    roomSQLiteQuery.release();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    query.close();
                    roomSQLiteQuery.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                roomSQLiteQuery = roomSQLiteQuery2;
            }
        }
    }

    /* compiled from: HttpTransactionDao_Impl.java */
    public class d implements Callable<Integer> {
        public d() {
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() {
            b bVar = b.this;
            R1.d dVar = bVar.f3244b;
            RoomDatabase roomDatabase = bVar.f3243a;
            g acquire = dVar.acquire();
            try {
                roomDatabase.beginTransaction();
                try {
                    Integer valueOf = Integer.valueOf(acquire.executeUpdateDelete());
                    roomDatabase.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    roomDatabase.endTransaction();
                }
            } finally {
                dVar.release(acquire);
            }
        }
    }

    /* compiled from: HttpTransactionDao_Impl.java */
    public class e implements Callable<List<com.chuckerteam.chucker.internal.data.entity.a>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f3252a;

        public e(RoomSQLiteQuery roomSQLiteQuery) {
            this.f3252a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final List<com.chuckerteam.chucker.internal.data.entity.a> call() {
            Cursor query = DBUtil.query(b.this.f3243a, this.f3252a, false, null);
            try {
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    arrayList.add(new com.chuckerteam.chucker.internal.data.entity.a(query.getLong(0), query.isNull(1) ? null : Long.valueOf(query.getLong(1)), query.isNull(2) ? null : Long.valueOf(query.getLong(2)), query.isNull(3) ? null : query.getString(3), query.isNull(4) ? null : query.getString(4), query.isNull(5) ? null : query.getString(5), query.isNull(6) ? null : query.getString(6), query.isNull(7) ? null : query.getString(7), query.isNull(8) ? null : Integer.valueOf(query.getInt(8)), query.isNull(9) ? null : Long.valueOf(query.getLong(9)), query.isNull(10) ? null : Long.valueOf(query.getLong(10)), query.isNull(11) ? null : query.getString(11), query.getInt(12) != 0, query.isNull(13) ? null : query.getString(13)));
                }
                return arrayList;
            } finally {
                query.close();
            }
        }

        public final void finalize() {
            this.f3252a.release();
        }
    }

    public b(ChuckerDatabase chuckerDatabase) {
        this.f3243a = chuckerDatabase;
        new B1.e(chuckerDatabase, 1);
        new R1.c(chuckerDatabase);
        this.f3244b = new R1.d(chuckerDatabase, 0);
        new R1.d(chuckerDatabase, 1);
    }

    @Override // R1.a
    public final AbstractC0557x<List<com.chuckerteam.chucker.internal.data.entity.a>> a(String str, String str2, String str3) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, requestDate, tookMs, protocol, method, host, path, scheme, responseCode, requestPayloadSize, responsePayloadSize, error, graphQLDetected, graphQlOperationName FROM transactions WHERE responseCode LIKE ? AND (path LIKE ? OR graphQlOperationName LIKE ?) ORDER BY requestDate DESC", 3);
        acquire.bindString(1, str);
        acquire.bindString(2, str2);
        acquire.bindString(3, str3);
        return this.f3243a.getInvalidationTracker().createLiveData(new String[]{"transactions"}, false, new a(acquire));
    }

    @Override // R1.a
    public final Object b(T9.a<? super List<HttpTransaction>> aVar) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM transactions", 0);
        return CoroutinesRoom.execute(this.f3243a, false, DBUtil.createCancellationSignal(), new c(acquire), aVar);
    }

    @Override // R1.a
    public final AbstractC0557x<HttpTransaction> c(long j10) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM transactions WHERE id = ?", 1);
        acquire.bindLong(1, j10);
        return this.f3243a.getInvalidationTracker().createLiveData(new String[]{"transactions"}, false, new CallableC0041b(acquire));
    }

    @Override // R1.a
    public final AbstractC0557x<List<com.chuckerteam.chucker.internal.data.entity.a>> d() {
        return this.f3243a.getInvalidationTracker().createLiveData(new String[]{"transactions"}, false, new e(RoomSQLiteQuery.acquire("SELECT id, requestDate, tookMs, protocol, method, host, path, scheme, responseCode, requestPayloadSize, responsePayloadSize, error, graphQLDetected, graphQlOperationName FROM transactions ORDER BY requestDate DESC", 0)));
    }

    @Override // R1.a
    public final Object e(T9.a<? super Integer> aVar) {
        return CoroutinesRoom.execute(this.f3243a, true, new d(), aVar);
    }
}
