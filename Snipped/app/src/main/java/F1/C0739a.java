package f1;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: ProcessLock.kt */
/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0739a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f20602e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20603a;

    /* renamed from: b, reason: collision with root package name */
    public final File f20604b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f20605c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f20606d;

    public C0739a(String str, File file, boolean z10) {
        Lock lock;
        this.f20603a = z10;
        this.f20604b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap hashMap = f20602e;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(str, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f20605c = lock;
    }

    public final void a(boolean z10) {
        this.f20605c.lock();
        if (z10) {
            File file = this.f20604b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f20606d = channel;
            } catch (IOException e10) {
                this.f20606d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f20606d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f20605c.unlock();
    }
}
