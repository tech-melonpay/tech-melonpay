package androidx.sqlite.db.framework;

import O9.f;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import ca.InterfaceC0635a;
import d1.c;
import d1.d;
import f1.C0739a;
import java.io.File;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: FrameworkSQLiteOpenHelper.kt */
/* loaded from: classes.dex */
public final class FrameworkSQLiteOpenHelper implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7875a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7876b;

    /* renamed from: c, reason: collision with root package name */
    public final d.a f7877c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7878d;

    /* renamed from: e, reason: collision with root package name */
    public final f<OpenHelper> f7879e = kotlin.a.a(new InterfaceC0635a<OpenHelper>() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$lazyDelegate$1
        {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        public final FrameworkSQLiteOpenHelper.OpenHelper invoke() {
            FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper = FrameworkSQLiteOpenHelper.this;
            String str = frameworkSQLiteOpenHelper.f7876b;
            d.a aVar = frameworkSQLiteOpenHelper.f7877c;
            String str2 = frameworkSQLiteOpenHelper.f7876b;
            Context context = frameworkSQLiteOpenHelper.f7875a;
            FrameworkSQLiteOpenHelper.OpenHelper openHelper = (str == null || !frameworkSQLiteOpenHelper.f7878d) ? new FrameworkSQLiteOpenHelper.OpenHelper(context, str2, new FrameworkSQLiteOpenHelper.a(), aVar) : new FrameworkSQLiteOpenHelper.OpenHelper(context, new File(context.getNoBackupFilesDir(), str2).getAbsolutePath(), new FrameworkSQLiteOpenHelper.a(), aVar);
            openHelper.setWriteAheadLoggingEnabled(frameworkSQLiteOpenHelper.f7880f);
            return openHelper;
        }
    });

    /* renamed from: f, reason: collision with root package name */
    public boolean f7880f;

    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    public static final class OpenHelper extends SQLiteOpenHelper {

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int f7881h = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Context f7882a;

        /* renamed from: b, reason: collision with root package name */
        public final a f7883b;

        /* renamed from: c, reason: collision with root package name */
        public final d.a f7884c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f7885d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f7886e;

        /* renamed from: f, reason: collision with root package name */
        public final C0739a f7887f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f7888g;

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0})
        public static final class CallbackException extends RuntimeException {

            /* renamed from: a, reason: collision with root package name */
            public final CallbackName f7889a;

            /* renamed from: b, reason: collision with root package name */
            public final Throwable f7890b;

            public CallbackException(CallbackName callbackName, Throwable th) {
                super(th);
                this.f7889a = callbackName;
                this.f7890b = th;
            }

            @Override // java.lang.Throwable
            public final Throwable getCause() {
                return this.f7890b;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0})
        public static final class CallbackName {

            /* renamed from: a, reason: collision with root package name */
            public static final CallbackName f7891a;

            /* renamed from: b, reason: collision with root package name */
            public static final CallbackName f7892b;

            /* renamed from: c, reason: collision with root package name */
            public static final CallbackName f7893c;

            /* renamed from: d, reason: collision with root package name */
            public static final CallbackName f7894d;

            /* renamed from: e, reason: collision with root package name */
            public static final CallbackName f7895e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ CallbackName[] f7896f;

            static {
                CallbackName callbackName = new CallbackName("ON_CONFIGURE", 0);
                f7891a = callbackName;
                CallbackName callbackName2 = new CallbackName("ON_CREATE", 1);
                f7892b = callbackName2;
                CallbackName callbackName3 = new CallbackName("ON_UPGRADE", 2);
                f7893c = callbackName3;
                CallbackName callbackName4 = new CallbackName("ON_DOWNGRADE", 3);
                f7894d = callbackName4;
                CallbackName callbackName5 = new CallbackName("ON_OPEN", 4);
                f7895e = callbackName5;
                f7896f = new CallbackName[]{callbackName, callbackName2, callbackName3, callbackName4, callbackName5};
            }

            public CallbackName() {
                throw null;
            }

            public static CallbackName valueOf(String str) {
                return (CallbackName) Enum.valueOf(CallbackName.class, str);
            }

            public static CallbackName[] values() {
                return (CallbackName[]) f7896f.clone();
            }
        }

        public OpenHelper(Context context, String str, final a aVar, final d.a aVar2) {
            super(context, str, null, aVar2.version, new DatabaseErrorHandler() { // from class: e1.b
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    int i = FrameworkSQLiteOpenHelper.OpenHelper.f7881h;
                    FrameworkSQLiteOpenHelper.a aVar3 = aVar;
                    FrameworkSQLiteDatabase frameworkSQLiteDatabase = aVar3.f7897a;
                    if (frameworkSQLiteDatabase == null || !kotlin.jvm.internal.f.b(frameworkSQLiteDatabase.f7872a, sQLiteDatabase)) {
                        frameworkSQLiteDatabase = new FrameworkSQLiteDatabase(sQLiteDatabase);
                        aVar3.f7897a = frameworkSQLiteDatabase;
                    }
                    d.a.this.onCorruption(frameworkSQLiteDatabase);
                }
            });
            this.f7882a = context;
            this.f7883b = aVar;
            this.f7884c = aVar2;
            this.f7885d = false;
            this.f7887f = new C0739a(str == null ? UUID.randomUUID().toString() : str, context.getCacheDir(), false);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() {
            C0739a c0739a = this.f7887f;
            try {
                c0739a.a(c0739a.f20603a);
                super.close();
                this.f7883b.f7897a = null;
                this.f7888g = false;
            } finally {
                c0739a.b();
            }
        }

        public final c d(boolean z10) {
            C0739a c0739a = this.f7887f;
            try {
                c0739a.a((this.f7888g || getDatabaseName() == null) ? false : true);
                this.f7886e = false;
                SQLiteDatabase j10 = j(z10);
                if (!this.f7886e) {
                    FrameworkSQLiteDatabase i = i(j10);
                    c0739a.b();
                    return i;
                }
                close();
                c d10 = d(z10);
                c0739a.b();
                return d10;
            } catch (Throwable th) {
                c0739a.b();
                throw th;
            }
        }

        public final FrameworkSQLiteDatabase i(SQLiteDatabase sQLiteDatabase) {
            a aVar = this.f7883b;
            FrameworkSQLiteDatabase frameworkSQLiteDatabase = aVar.f7897a;
            if (frameworkSQLiteDatabase != null && kotlin.jvm.internal.f.b(frameworkSQLiteDatabase.f7872a, sQLiteDatabase)) {
                return frameworkSQLiteDatabase;
            }
            FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = new FrameworkSQLiteDatabase(sQLiteDatabase);
            aVar.f7897a = frameworkSQLiteDatabase2;
            return frameworkSQLiteDatabase2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v12, types: [android.database.sqlite.SQLiteDatabase] */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v16 */
        /* JADX WARN: Type inference failed for: r6v17 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v9, types: [android.database.sqlite.SQLiteDatabase] */
        public final SQLiteDatabase j(boolean z10) {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z11 = this.f7888g;
            Context context = this.f7882a;
            if (databaseName != null && !z11 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                z10 = z10 != 0 ? getWritableDatabase() : getReadableDatabase();
                return z10;
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    z10 = z10 != 0 ? getWritableDatabase() : getReadableDatabase();
                    return z10;
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof CallbackException) {
                        CallbackException callbackException = th;
                        int ordinal = callbackException.f7889a.ordinal();
                        Throwable th2 = callbackException.f7890b;
                        if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                            throw th2;
                        }
                        if (!(th2 instanceof SQLiteException)) {
                            throw th2;
                        }
                    } else {
                        if (!(th instanceof SQLiteException)) {
                            throw th;
                        }
                        if (databaseName == null || !this.f7885d) {
                            throw th;
                        }
                    }
                    context.deleteDatabase(databaseName);
                    try {
                        return z10 != 0 ? getWritableDatabase() : getReadableDatabase();
                    } catch (CallbackException e10) {
                        throw e10.f7890b;
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            boolean z10 = this.f7886e;
            d.a aVar = this.f7884c;
            if (!z10 && aVar.version != sQLiteDatabase.getVersion()) {
                sQLiteDatabase.setMaxSqlCacheSize(1);
            }
            try {
                aVar.onConfigure(i(sQLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.f7891a, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                this.f7884c.onCreate(i(sQLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.f7892b, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i9) {
            this.f7886e = true;
            try {
                this.f7884c.onDowngrade(i(sQLiteDatabase), i, i9);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.f7894d, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f7886e) {
                try {
                    this.f7884c.onOpen(i(sQLiteDatabase));
                } catch (Throwable th) {
                    throw new CallbackException(CallbackName.f7895e, th);
                }
            }
            this.f7888g = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i9) {
            this.f7886e = true;
            try {
                this.f7884c.onUpgrade(i(sQLiteDatabase), i, i9);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.f7893c, th);
            }
        }
    }

    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public FrameworkSQLiteDatabase f7897a = null;
    }

    public FrameworkSQLiteOpenHelper(Context context, String str, d.a aVar, boolean z10) {
        this.f7875a = context;
        this.f7876b = str;
        this.f7877c = aVar;
        this.f7878d = z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f<OpenHelper> fVar = this.f7879e;
        if (fVar.c()) {
            fVar.getValue().close();
        }
    }

    @Override // d1.d
    public final String getDatabaseName() {
        return this.f7876b;
    }

    @Override // d1.d
    public final c getReadableDatabase() {
        return this.f7879e.getValue().d(false);
    }

    @Override // d1.d
    public final c getWritableDatabase() {
        return this.f7879e.getValue().d(true);
    }

    @Override // d1.d
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        f<OpenHelper> fVar = this.f7879e;
        if (fVar.c()) {
            fVar.getValue().setWriteAheadLoggingEnabled(z10);
        }
        this.f7880f = z10;
    }
}
