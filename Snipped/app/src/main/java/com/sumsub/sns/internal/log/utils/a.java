package com.sumsub.sns.internal.log.utils;

import O9.p;
import U4.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;
import java.util.zip.CRC32;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final File f17578a;

    /* renamed from: b, reason: collision with root package name */
    public final Random f17579b;

    public a(File file, Random random) {
        this.f17578a = file;
        this.f17579b = random;
    }

    public final void a(byte[] bArr) {
        if (this.f17578a.exists()) {
            this.f17578a.delete();
        }
        File file = new File(this.f17578a.getAbsoluteFile() + "_random_" + this.f17579b.nextLong() + ".tmp");
        if (this.f17578a.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            a(bArr.length, (OutputStream) fileOutputStream);
            a(bArr, fileOutputStream);
            CRC32 crc32 = new CRC32();
            crc32.update(bArr);
            a(crc32.getValue(), fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.getFD().sync();
            p pVar = p.f3034a;
            b.d(fileOutputStream, null);
            file.renameTo(this.f17578a);
        } finally {
        }
    }

    public final byte[] b() {
        if (!this.f17578a.exists()) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(this.f17578a);
        try {
            byte[] a10 = a(a(fileInputStream), fileInputStream);
            CRC32 crc32 = new CRC32();
            crc32.update(a10);
            if (b(fileInputStream) != crc32.getValue()) {
                b.d(fileInputStream, null);
                return null;
            }
            b.d(fileInputStream, null);
            return a10;
        } finally {
        }
    }

    public final long c(InputStream inputStream) {
        long read = inputStream.read();
        if (read < 0) {
            throw new IOException();
        }
        long read2 = inputStream.read();
        if (read2 < 0) {
            throw new IOException();
        }
        long read3 = inputStream.read();
        if (read3 < 0) {
            throw new IOException();
        }
        long read4 = inputStream.read();
        if (read4 >= 0) {
            return read + (read2 << 8) + (read3 << 16) + (read4 << 24);
        }
        throw new IOException();
    }

    public /* synthetic */ a(File file, Random random, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? new Random() : random);
    }

    public final long b(InputStream inputStream) {
        return c(inputStream) + (c(inputStream) << 32);
    }

    public final void a(byte b9, OutputStream outputStream) {
        outputStream.write(b9);
    }

    public final void a(int i, OutputStream outputStream) {
        a((byte) (i & 255), outputStream);
        a((byte) ((i >> 8) & 255), outputStream);
        a((byte) ((i >> 16) & 255), outputStream);
        a((byte) ((i >> 24) & 255), outputStream);
    }

    public final void a(long j10, OutputStream outputStream) {
        a((byte) (j10 & 255), outputStream);
        a((byte) ((j10 >> 8) & 255), outputStream);
        a((byte) ((j10 >> 16) & 255), outputStream);
        a((byte) ((j10 >> 24) & 255), outputStream);
        a((byte) ((j10 >> 32) & 255), outputStream);
        a((byte) ((j10 >> 40) & 255), outputStream);
        a((byte) ((j10 >> 48) & 255), outputStream);
        a((byte) ((j10 >> 56) & 255), outputStream);
    }

    public final void a(byte[] bArr, OutputStream outputStream) {
        outputStream.write(bArr);
    }

    public final int a(InputStream inputStream) {
        int read = inputStream.read();
        if (read >= 0) {
            int read2 = inputStream.read();
            if (read2 >= 0) {
                int read3 = inputStream.read();
                if (read3 >= 0) {
                    int read4 = inputStream.read();
                    if (read4 >= 0) {
                        return read + (read2 << 8) + (read3 << 16) + (read4 << 24);
                    }
                    throw new IOException();
                }
                throw new IOException();
            }
            throw new IOException();
        }
        throw new IOException();
    }

    public final byte[] a(int i, InputStream inputStream) {
        byte[] bArr = new byte[i];
        int i9 = 0;
        while (i9 < i) {
            int read = inputStream.read(bArr, i9, i - i9);
            if (read > 0) {
                i9 += read;
            } else if (read >= 0) {
                Thread.yield();
            } else {
                throw new IOException();
            }
        }
        return bArr;
    }
}
