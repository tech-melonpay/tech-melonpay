package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* compiled from: ProfileVerifier.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Z.a<c> f7391a = new Z.a<>();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f7392b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static c f7393c = null;

    /* compiled from: ProfileVerifier.java */
    public static class a {
        public static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* compiled from: ProfileVerifier.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f7394a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7395b;

        /* renamed from: c, reason: collision with root package name */
        public final long f7396c;

        /* renamed from: d, reason: collision with root package name */
        public final long f7397d;

        public b(int i, int i9, long j10, long j11) {
            this.f7394a = i;
            this.f7395b = i9;
            this.f7396c = j10;
            this.f7397d = j11;
        }

        public static b a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public final void b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f7394a);
                dataOutputStream.writeInt(this.f7395b);
                dataOutputStream.writeLong(this.f7396c);
                dataOutputStream.writeLong(this.f7397d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f7395b == bVar.f7395b && this.f7396c == bVar.f7396c && this.f7394a == bVar.f7394a && this.f7397d == bVar.f7397d;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f7395b), Long.valueOf(this.f7396c), Integer.valueOf(this.f7394a), Long.valueOf(this.f7397d));
        }
    }

    /* compiled from: ProfileVerifier.java */
    public static class c {
    }

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static c b() {
        c cVar = new c();
        f7393c = cVar;
        f7391a.i(cVar);
        return f7393c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:23|(1:89)(1:27)|28|(1:88)(1:32)|33|34|35|(2:75|76)(1:37)|38|(8:45|(1:49)|(1:68)(1:56)|57|(2:64|65)|61|62|63)|(1:72)(1:(1:74))|(1:49)|(1:51)|68|57|(1:59)|64|65|61|62|63) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.e.c(android.content.Context, boolean):void");
    }
}
