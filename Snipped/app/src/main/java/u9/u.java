package u9;

import android.content.Context;
import com.bumptech.glide.load.Key;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.UUID;

/* compiled from: Installation.java */
/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static String f30469a;

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f30470b = Charset.forName(Key.STRING_CHARSET_NAME);

    public static synchronized String a(Context context) {
        synchronized (u.class) {
            try {
                if (f30469a == null) {
                    File file = new File(context.getFilesDir(), "INSTALLATION");
                    try {
                        if (!file.exists()) {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                String uuid = UUID.randomUUID().toString();
                                fileOutputStream.write(uuid.getBytes(f30470b));
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                f30469a = uuid;
                                return uuid;
                            } finally {
                            }
                        }
                        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                        try {
                            byte[] bArr = new byte[(int) randomAccessFile.length()];
                            randomAccessFile.readFully(bArr);
                            String str = new String(bArr, f30470b);
                            randomAccessFile.close();
                            f30469a = str;
                        } finally {
                        }
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                return f30469a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
