package androidx.room.util;

import O9.p;
import P9.i;
import U4.b;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.os.CancellationSignal;
import androidx.camera.core.impl.utils.a;
import androidx.room.RoomDatabase;
import com.google.android.gms.actions.SearchIntents;
import d1.c;
import d1.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;

/* compiled from: DBUtil.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0007\u0010\u000b\u001a\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/room/RoomDatabase;", "db", "Ld1/f;", "sqLiteQuery", "", "maybeCopy", "Landroid/database/Cursor;", SearchIntents.EXTRA_QUERY, "(Landroidx/room/RoomDatabase;Ld1/f;Z)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "signal", "(Landroidx/room/RoomDatabase;Ld1/f;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;", "Ld1/c;", "LO9/p;", "dropFtsSyncTriggers", "(Ld1/c;)V", "", "tableName", "foreignKeyCheck", "(Ld1/c;Ljava/lang/String;)V", "Ljava/io/File;", "databaseFile", "", "readVersion", "(Ljava/io/File;)I", "createCancellationSignal", "()Landroid/os/CancellationSignal;", "cursor", "processForeignKeyCheckFailure", "(Landroid/database/Cursor;)Ljava/lang/String;", "room-runtime_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DBUtil {
    public static final CancellationSignal createCancellationSignal() {
        return new CancellationSignal();
    }

    public static final void dropFtsSyncTriggers(c cVar) {
        ListBuilder j10 = i.j();
        Cursor query = cVar.query("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        try {
            Cursor cursor = query;
            while (cursor.moveToNext()) {
                j10.add(cursor.getString(0));
            }
            p pVar = p.f3034a;
            b.d(query, null);
            ListIterator listIterator = i.a(j10).listIterator(0);
            while (true) {
                ListBuilder.a aVar = (ListBuilder.a) listIterator;
                if (!aVar.hasNext()) {
                    return;
                }
                String str = (String) aVar.next();
                if (str.startsWith("room_fts_content_sync_")) {
                    cVar.execSQL("DROP TRIGGER IF EXISTS ".concat(str));
                }
            }
        } finally {
        }
    }

    public static final void foreignKeyCheck(c cVar, String str) {
        Cursor query = cVar.query("PRAGMA foreign_key_check(`" + str + "`)");
        try {
            Cursor cursor = query;
            if (cursor.getCount() > 0) {
                throw new SQLiteConstraintException(processForeignKeyCheckFailure(cursor));
            }
            p pVar = p.f3034a;
            b.d(query, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.d(query, th);
                throw th2;
            }
        }
    }

    private static final String processForeignKeyCheckFailure(Cursor cursor) {
        StringBuilder sb2 = new StringBuilder();
        int count = cursor.getCount();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            if (cursor.isFirst()) {
                sb2.append("Foreign key violation(s) detected in '");
                sb2.append(cursor.getString(0));
                sb2.append("'.\n");
            }
            String string = cursor.getString(3);
            if (!linkedHashMap.containsKey(string)) {
                linkedHashMap.put(string, cursor.getString(2));
            }
        }
        sb2.append("Number of different violations discovered: ");
        sb2.append(linkedHashMap.keySet().size());
        sb2.append("\nNumber of rows in violation: ");
        sb2.append(count);
        sb2.append("\nViolation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            a.u(sb2, "\tParent Table = ", (String) entry.getValue(), ", Foreign Key Constraint Index = ", (String) entry.getKey());
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public static final Cursor query(RoomDatabase roomDatabase, f fVar, boolean z10) {
        return query(roomDatabase, fVar, z10, null);
    }

    public static final int readVersion(File file) {
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            allocate.rewind();
            int i = allocate.getInt();
            b.d(channel, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.d(channel, th);
                throw th2;
            }
        }
    }

    public static final Cursor query(RoomDatabase roomDatabase, f fVar, boolean z10, CancellationSignal cancellationSignal) {
        Cursor query = roomDatabase.query(fVar, cancellationSignal);
        if (!z10 || !(query instanceof AbstractWindowedCursor)) {
            return query;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) query;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? CursorUtil.copyAndClose(query) : query;
    }
}
