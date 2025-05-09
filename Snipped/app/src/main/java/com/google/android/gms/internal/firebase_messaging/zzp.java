package com.google.android.gms.internal.firebase_messaging;

import java.io.OutputStream;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* loaded from: classes.dex */
final class zzp extends OutputStream {
    private long zza = 0;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.zza++;
    }

    public final long zza() {
        return this.zza;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.zza += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i9) {
        int length;
        int i10;
        if (i >= 0 && i <= (length = bArr.length) && i9 >= 0 && (i10 = i + i9) <= length && i10 >= 0) {
            this.zza += i9;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
