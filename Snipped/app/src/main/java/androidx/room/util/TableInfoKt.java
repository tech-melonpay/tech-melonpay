package androidx.room.util;

import P9.i;
import P9.q;
import P9.s;
import U4.b;
import android.database.Cursor;
import androidx.room.util.TableInfo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import d1.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.f;

/* compiled from: TableInfo.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\n\u001a)\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ld1/c;", "database", "", "tableName", "Landroidx/room/util/TableInfo;", "readTableInfo", "(Ld1/c;Ljava/lang/String;)Landroidx/room/util/TableInfo;", "", "Landroidx/room/util/TableInfo$ForeignKey;", "readForeignKeys", "(Ld1/c;Ljava/lang/String;)Ljava/util/Set;", "Landroid/database/Cursor;", "cursor", "", "Landroidx/room/util/TableInfo$ForeignKeyWithSequence;", "readForeignKeyFieldMappings", "(Landroid/database/Cursor;)Ljava/util/List;", "", "Landroidx/room/util/TableInfo$Column;", "readColumns", "(Ld1/c;Ljava/lang/String;)Ljava/util/Map;", "Landroidx/room/util/TableInfo$Index;", "readIndices", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "unique", "readIndex", "(Ld1/c;Ljava/lang/String;Z)Landroidx/room/util/TableInfo$Index;", "room-runtime_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TableInfoKt {
    private static final Map<String, TableInfo.Column> readColumns(c cVar, String str) {
        Cursor query = cVar.query("PRAGMA table_info(`" + str + "`)");
        try {
            Cursor cursor = query;
            if (cursor.getColumnCount() <= 0) {
                Map<String, TableInfo.Column> p10 = a.p();
                b.d(query, null);
                return p10;
            }
            int columnIndex = cursor.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
            int columnIndex2 = cursor.getColumnIndex("type");
            int columnIndex3 = cursor.getColumnIndex("notnull");
            int columnIndex4 = cursor.getColumnIndex("pk");
            int columnIndex5 = cursor.getColumnIndex("dflt_value");
            MapBuilder mapBuilder = new MapBuilder();
            while (cursor.moveToNext()) {
                String string = cursor.getString(columnIndex);
                mapBuilder.put(string, new TableInfo.Column(string, cursor.getString(columnIndex2), cursor.getInt(columnIndex3) != 0, cursor.getInt(columnIndex4), cursor.getString(columnIndex5), 2));
            }
            MapBuilder c2 = mapBuilder.c();
            b.d(query, null);
            return c2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.d(query, th);
                throw th2;
            }
        }
    }

    private static final List<TableInfo.ForeignKeyWithSequence> readForeignKeyFieldMappings(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex(Constants.MessagePayloadKeys.FROM);
        int columnIndex4 = cursor.getColumnIndex("to");
        ListBuilder j10 = i.j();
        while (cursor.moveToNext()) {
            j10.add(new TableInfo.ForeignKeyWithSequence(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        ListBuilder a10 = i.a(j10);
        if (!(a10 instanceof Collection)) {
            List<TableInfo.ForeignKeyWithSequence> e02 = s.e0(a10);
            q.C(e02);
            return e02;
        }
        if (a10.a() <= 1) {
            return s.c0(a10);
        }
        Object[] array = a10.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return Arrays.asList(array);
    }

    private static final Set<TableInfo.ForeignKey> readForeignKeys(c cVar, String str) {
        Cursor query = cVar.query("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            Cursor cursor = query;
            int columnIndex = cursor.getColumnIndex("id");
            int columnIndex2 = cursor.getColumnIndex("seq");
            int columnIndex3 = cursor.getColumnIndex("table");
            int columnIndex4 = cursor.getColumnIndex("on_delete");
            int columnIndex5 = cursor.getColumnIndex("on_update");
            List<TableInfo.ForeignKeyWithSequence> readForeignKeyFieldMappings = readForeignKeyFieldMappings(cursor);
            cursor.moveToPosition(-1);
            SetBuilder setBuilder = new SetBuilder();
            while (cursor.moveToNext()) {
                if (cursor.getInt(columnIndex2) == 0) {
                    int i = cursor.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : readForeignKeyFieldMappings) {
                        if (((TableInfo.ForeignKeyWithSequence) obj).getId() == i) {
                            arrayList3.add(obj);
                        }
                    }
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        TableInfo.ForeignKeyWithSequence foreignKeyWithSequence = (TableInfo.ForeignKeyWithSequence) it.next();
                        arrayList.add(foreignKeyWithSequence.getFrom());
                        arrayList2.add(foreignKeyWithSequence.getTo());
                    }
                    setBuilder.add(new TableInfo.ForeignKey(cursor.getString(columnIndex3), cursor.getString(columnIndex4), cursor.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            SetBuilder b9 = i.b(setBuilder);
            b.d(query, null);
            return b9;
        } finally {
        }
    }

    private static final TableInfo.Index readIndex(c cVar, String str, boolean z10) {
        Cursor query = cVar.query("PRAGMA index_xinfo(`" + str + "`)");
        try {
            Cursor cursor = query;
            int columnIndex = cursor.getColumnIndex("seqno");
            int columnIndex2 = cursor.getColumnIndex("cid");
            int columnIndex3 = cursor.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
            int columnIndex4 = cursor.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursor.moveToNext()) {
                    if (cursor.getInt(columnIndex2) >= 0) {
                        int i = cursor.getInt(columnIndex);
                        String string = cursor.getString(columnIndex3);
                        String str2 = cursor.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        treeMap.put(Integer.valueOf(i), string);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                TableInfo.Index index = new TableInfo.Index(str, z10, s.c0(treeMap.values()), s.c0(treeMap2.values()));
                b.d(query, null);
                return index;
            }
            b.d(query, null);
            return null;
        } finally {
        }
    }

    private static final Set<TableInfo.Index> readIndices(c cVar, String str) {
        Cursor query = cVar.query("PRAGMA index_list(`" + str + "`)");
        try {
            Cursor cursor = query;
            int columnIndex = cursor.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
            int columnIndex2 = cursor.getColumnIndex("origin");
            int columnIndex3 = cursor.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                SetBuilder setBuilder = new SetBuilder();
                while (cursor.moveToNext()) {
                    if (f.b("c", cursor.getString(columnIndex2))) {
                        String string = cursor.getString(columnIndex);
                        boolean z10 = true;
                        if (cursor.getInt(columnIndex3) != 1) {
                            z10 = false;
                        }
                        TableInfo.Index readIndex = readIndex(cVar, string, z10);
                        if (readIndex == null) {
                            b.d(query, null);
                            return null;
                        }
                        setBuilder.add(readIndex);
                    }
                }
                SetBuilder b9 = i.b(setBuilder);
                b.d(query, null);
                return b9;
            }
            b.d(query, null);
            return null;
        } finally {
        }
    }

    public static final TableInfo readTableInfo(c cVar, String str) {
        return new TableInfo(str, readColumns(cVar, str), readForeignKeys(cVar, str), readIndices(cVar, str));
    }
}
