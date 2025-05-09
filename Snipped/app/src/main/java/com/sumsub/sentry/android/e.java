package com.sumsub.sentry.android;

import android.content.Context;
import com.bumptech.glide.load.Key;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static String f13571b;

    /* renamed from: a, reason: collision with root package name */
    public static final e f13570a = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f13572d = Charset.forName(Key.STRING_CHARSET_NAME);

    public final synchronized String a(Context context) {
        try {
            if (f13571b == null) {
                File file = new File(context.getFilesDir(), "SNS_INSTALLATION");
                try {
                    if (!file.exists()) {
                        String b9 = b(file);
                        f13571b = b9;
                        return b9;
                    }
                    f13571b = a(file);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            return f13571b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final String b(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            String uuid = UUID.randomUUID().toString();
            fileOutputStream.write(uuid.getBytes(f13572d));
            fileOutputStream.flush();
            U4.b.d(fileOutputStream, null);
            return uuid;
        } finally {
        }
    }

    public final String a(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            String str = new String(bArr, f13572d);
            U4.b.d(randomAccessFile, null);
            return str;
        } finally {
        }
    }
}
