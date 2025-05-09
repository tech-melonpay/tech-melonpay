package com.sumsub.sns.internal.core.data.source.applicant.remote.utils;

import Ka.h;
import java.io.File;
import java.io.FileInputStream;
import java.util.regex.Pattern;
import okhttp3.i;
import okhttp3.o;

/* loaded from: classes2.dex */
public final class a extends o {

    /* renamed from: a, reason: collision with root package name */
    public final File f16067a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16068b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0229a f16069c;

    /* renamed from: com.sumsub.sns.internal.core.data.source.applicant.remote.utils.a$a, reason: collision with other inner class name */
    public interface InterfaceC0229a {
        void a();

        void a(int i);
    }

    public a(File file, String str, InterfaceC0229a interfaceC0229a) {
        this.f16067a = file;
        this.f16068b = str;
        this.f16069c = interfaceC0229a;
    }

    @Override // okhttp3.o
    public long contentLength() {
        return this.f16067a.length();
    }

    @Override // okhttp3.o
    public i contentType() {
        Pattern pattern = i.f24542d;
        return i.a.b(this.f16068b + "/*");
    }

    @Override // okhttp3.o
    public void writeTo(h hVar) {
        InterfaceC0229a interfaceC0229a;
        long length = this.f16067a.length();
        byte[] bArr = new byte[102400];
        FileInputStream fileInputStream = new FileInputStream(this.f16067a);
        long j10 = 0;
        int i = 0;
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    fileInputStream.close();
                    return;
                }
                long j11 = 100 * j10;
                int i9 = (int) (j11 / length);
                if (i9 > i + 1) {
                    InterfaceC0229a interfaceC0229a2 = this.f16069c;
                    if (interfaceC0229a2 != null) {
                        interfaceC0229a2.a((int) (j11 / length));
                    }
                    i = i9;
                }
                j10 += read;
                if (j10 == length && (interfaceC0229a = this.f16069c) != null) {
                    interfaceC0229a.a();
                }
                hVar.e0(0, read, bArr);
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        }
    }
}
