package org.ejbca.cvc.example;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class FileHelper {
    private FileHelper() {
    }

    public static byte[] loadFile(String str) {
        return loadFile(new File(str));
    }

    public static void writeFile(File file, byte[] bArr) {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), 1000);
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedOutputStream.write(bArr);
            bufferedOutputStream.close();
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                bufferedOutputStream2.close();
            }
            throw th;
        }
    }

    public static byte[] loadFile(File file) {
        FileInputStream fileInputStream = null;
        try {
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            FileInputStream fileInputStream2 = new FileInputStream(file);
            boolean z10 = true;
            int i = 0;
            while (z10) {
                try {
                    int read = fileInputStream2.read(bArr, i, length - i);
                    i += read;
                    z10 = read > 0 && i != length;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e10) {
                            System.out.println("loadFile - error when closing: " + e10);
                        }
                    }
                    throw th;
                }
            }
            try {
                fileInputStream2.close();
            } catch (IOException e11) {
                System.out.println("loadFile - error when closing: " + e11);
            }
            return bArr;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
