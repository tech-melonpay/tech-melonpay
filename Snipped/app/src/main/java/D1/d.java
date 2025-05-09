package d1;

import C.v;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import ka.C0967l;

/* compiled from: SupportSQLiteOpenHelper.kt */
/* loaded from: classes.dex */
public interface d extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f20404a;

        /* renamed from: b, reason: collision with root package name */
        public final String f20405b;

        /* renamed from: c, reason: collision with root package name */
        public final a f20406c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f20407d;

        public b(Context context, String str, a aVar, boolean z10) {
            this.f20404a = context;
            this.f20405b = str;
            this.f20406c = aVar;
            this.f20407d = z10;
        }
    }

    /* compiled from: SupportSQLiteOpenHelper.kt */
    public interface c {
        d create(b bVar);
    }

    String getDatabaseName();

    d1.c getReadableDatabase();

    d1.c getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z10);

    /* compiled from: SupportSQLiteOpenHelper.kt */
    public static abstract class a {
        public static final C0391a Companion = new C0391a();
        private static final String TAG = "SupportSQLite";
        public final int version;

        /* compiled from: SupportSQLiteOpenHelper.kt */
        /* renamed from: d1.d$a$a, reason: collision with other inner class name */
        public static final class C0391a {
        }

        public a(int i) {
            this.version = i;
        }

        private final void deleteDatabaseFile(String str) {
            if (C0967l.U(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i = 0;
            boolean z10 = false;
            while (i <= length) {
                boolean z11 = kotlin.jvm.internal.f.c(str.charAt(!z10 ? i : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i++;
                } else {
                    z10 = true;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() == 0) {
                return;
            }
            Log.w(TAG, "deleting the database file: " + str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e10) {
                Log.w(TAG, "delete failed: ", e10);
            }
        }

        public void onCorruption(d1.c cVar) {
            Log.e(TAG, "Corruption reported by sqlite on database: " + cVar + ".path");
            if (!cVar.isOpen()) {
                String path = cVar.getPath();
                if (path != null) {
                    deleteDatabaseFile(path);
                    return;
                }
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = cVar.getAttachedDbs();
                } finally {
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            deleteDatabaseFile((String) ((Pair) it.next()).second);
                        }
                    } else {
                        String path2 = cVar.getPath();
                        if (path2 != null) {
                            deleteDatabaseFile(path2);
                        }
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                cVar.close();
            } catch (IOException unused2) {
            }
            if (list != null) {
                return;
            }
        }

        public abstract void onCreate(d1.c cVar);

        public void onDowngrade(d1.c cVar, int i, int i9) {
            throw new SQLiteException(v.k(i, i9, "Can't downgrade database from version ", " to "));
        }

        public abstract void onUpgrade(d1.c cVar, int i, int i9);

        public void onConfigure(d1.c cVar) {
        }

        public void onOpen(d1.c cVar) {
        }
    }
}
