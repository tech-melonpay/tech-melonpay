package B1;

import android.os.Build;
import androidx.room.TypeConverter;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;

/* compiled from: WorkTypeConverters.java */
/* loaded from: classes.dex */
public final class v {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.room.TypeConverter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static s1.C1193c a(byte[] r7) {
        /*
            s1.c r0 = new s1.c
            r0.<init>()
            if (r7 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            int r7 = r2.readInt()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
        L17:
            if (r7 <= 0) goto L36
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            s1.c$a r5 = new s1.c$a     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.util.HashSet r3 = r0.f26505a     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r3.add(r5)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            int r7 = r7 + (-1)
            goto L17
        L32:
            r7 = move-exception
            goto L60
        L34:
            r7 = move-exception
            goto L4f
        L36:
            r2.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r7 = move-exception
            r7.printStackTrace()
        L3e:
            r1.close()     // Catch: java.io.IOException -> L42
            goto L5f
        L42:
            r7 = move-exception
            r7.printStackTrace()
            goto L5f
        L47:
            r0 = move-exception
            r2 = r7
            r7 = r0
            goto L60
        L4b:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L4f:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L5c
            r2.close()     // Catch: java.io.IOException -> L58
            goto L5c
        L58:
            r7 = move-exception
            r7.printStackTrace()
        L5c:
            r1.close()     // Catch: java.io.IOException -> L42
        L5f:
            return r0
        L60:
            if (r2 == 0) goto L6a
            r2.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r0 = move-exception
            r0.printStackTrace()
        L6a:
            r1.close()     // Catch: java.io.IOException -> L6e
            goto L72
        L6e:
            r0 = move-exception
            r0.printStackTrace()
        L72:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.v.a(byte[]):s1.c");
    }

    @TypeConverter
    public static BackoffPolicy b(int i) {
        if (i == 0) {
            return BackoffPolicy.f8067a;
        }
        if (i == 1) {
            return BackoffPolicy.f8068b;
        }
        throw new IllegalArgumentException(s3.b.i("Could not convert ", i, " to BackoffPolicy"));
    }

    @TypeConverter
    public static NetworkType c(int i) {
        if (i == 0) {
            return NetworkType.f8092a;
        }
        if (i == 1) {
            return NetworkType.f8093b;
        }
        if (i == 2) {
            return NetworkType.f8094c;
        }
        if (i == 3) {
            return NetworkType.f8095d;
        }
        if (i == 4) {
            return NetworkType.f8096e;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(s3.b.i("Could not convert ", i, " to NetworkType"));
        }
        return NetworkType.f8097f;
    }

    @TypeConverter
    public static OutOfQuotaPolicy d(int i) {
        if (i == 0) {
            return OutOfQuotaPolicy.f8099a;
        }
        if (i == 1) {
            return OutOfQuotaPolicy.f8100b;
        }
        throw new IllegalArgumentException(s3.b.i("Could not convert ", i, " to OutOfQuotaPolicy"));
    }

    @TypeConverter
    public static WorkInfo$State e(int i) {
        if (i == 0) {
            return WorkInfo$State.f8102a;
        }
        if (i == 1) {
            return WorkInfo$State.f8103b;
        }
        if (i == 2) {
            return WorkInfo$State.f8104c;
        }
        if (i == 3) {
            return WorkInfo$State.f8105d;
        }
        if (i == 4) {
            return WorkInfo$State.f8106e;
        }
        if (i == 5) {
            return WorkInfo$State.f8107f;
        }
        throw new IllegalArgumentException(s3.b.i("Could not convert ", i, " to State"));
    }

    @TypeConverter
    public static int f(WorkInfo$State workInfo$State) {
        int ordinal = workInfo$State.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + workInfo$State + " to int");
                    }
                }
            }
        }
        return i;
    }
}
