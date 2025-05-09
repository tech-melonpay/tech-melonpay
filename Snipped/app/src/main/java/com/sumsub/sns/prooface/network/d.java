package com.sumsub.sns.prooface.network;

import P9.w;
import ha.C0805d;
import ha.h;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f20283a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static AtomicLong f20284b = new AtomicLong(0);

    public final int a(long j10, long j11) {
        long j12 = j10 * j11;
        long j13 = (j12 * j12) + j12;
        long j14 = (j13 << 32) | (j13 >>> 32);
        long j15 = (j14 * j14) + j11 + j12;
        long j16 = (j15 >>> 32) | (j15 << 32);
        return (int) (((j16 * j16) + j12) >>> 32);
    }

    public final byte[] a(byte[] bArr, int i, int i9, byte b9, long j10) {
        int i10 = i9 - 1;
        for (int i11 = 0; i11 <= i10; i11++) {
            int abs = Math.abs(a(i11, j10));
            if (i11 < i10) {
                int i12 = i + i11;
                byte b10 = bArr[i12];
                int i13 = (abs % (i9 - i11)) + i11 + i;
                bArr[i12] = bArr[i13];
                bArr[i13] = b10;
            }
            int i14 = i + i11;
            bArr[i14] = (byte) (com.google.android.gms.measurement.internal.a.u(b9, i11, abs, 1) ^ bArr[i14]);
        }
        return bArr;
    }

    public final byte[] a(long j10) {
        f20284b = new AtomicLong(j10);
        Integer[] numArr = new Integer[15];
        int i = 0;
        for (int i9 = 0; i9 < 15; i9++) {
            numArr[i9] = Integer.valueOf(f20283a.a());
        }
        int intValue = numArr[0].intValue();
        Iterator<Integer> it = h.V(1, 5).iterator();
        while (((C0805d) it).f21231c) {
            int a10 = ((w) it).a() * 3;
            if (numArr[a10].intValue() > intValue) {
                intValue = numArr[a10].intValue();
                i = a10;
            }
        }
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.putInt(numArr[i].intValue());
        allocate.putInt(numArr[i + 1].intValue());
        allocate.putInt(numArr[i + 2].intValue());
        return allocate.array();
    }

    public final int a(int i) {
        long j10;
        long j11;
        AtomicLong atomicLong = f20284b;
        do {
            j10 = atomicLong.get();
            j11 = ((25214903917L * j10) + 11) & 281474976710655L;
        } while (!atomicLong.compareAndSet(j10, j11));
        return (int) (j11 >>> (48 - i));
    }

    public final int a() {
        return a(32);
    }
}
