package com.google.android.gms.internal.firebase_messaging;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* loaded from: classes.dex */
public final class zzl {
    private static final OutputStream zza = new zzj();

    public static InputStream zza(InputStream inputStream, long j10) {
        return new zzk(inputStream, 1048577L);
    }

    public static byte[] zzb(InputStream inputStream) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i = 8192;
        int i9 = 0;
        while (i9 < 2147483639) {
            int min = Math.min(i, 2147483639 - i9);
            byte[] bArr = new byte[min];
            arrayDeque.add(bArr);
            int i10 = 0;
            while (i10 < min) {
                int read = inputStream.read(bArr, i10, min - i10);
                if (read == -1) {
                    return zzc(arrayDeque, i9);
                }
                i10 += read;
                i9 += read;
            }
            long j10 = i;
            long j11 = j10 + j10;
            i = j11 > 2147483647L ? Integer.MAX_VALUE : j11 < -2147483648L ? Integer.MIN_VALUE : (int) j11;
        }
        if (inputStream.read() == -1) {
            return zzc(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] zzc(Queue<byte[]> queue, int i) {
        byte[] bArr = new byte[i];
        int i9 = i;
        while (i9 > 0) {
            byte[] remove = queue.remove();
            int min = Math.min(i9, remove.length);
            System.arraycopy(remove, 0, bArr, i - i9, min);
            i9 -= min;
        }
        return bArr;
    }
}
