package I0;

import java.nio.ByteBuffer;

/* compiled from: TypefaceEmojiRasterizer.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<J0.a> f1717d = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    public final int f1718a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.emoji2.text.h f1719b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f1720c = 0;

    public g(androidx.emoji2.text.h hVar, int i) {
        this.f1719b = hVar;
        this.f1718a = i;
    }

    public final int a(int i) {
        J0.a c2 = c();
        int a10 = c2.a(16);
        if (a10 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = c2.f2099b;
        int i9 = a10 + c2.f2098a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i9) + i9 + 4);
    }

    public final int b() {
        J0.a c2 = c();
        int a10 = c2.a(16);
        if (a10 == 0) {
            return 0;
        }
        int i = a10 + c2.f2098a;
        return c2.f2099b.getInt(c2.f2099b.getInt(i) + i);
    }

    public final J0.a c() {
        ThreadLocal<J0.a> threadLocal = f1717d;
        J0.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new J0.a();
            threadLocal.set(aVar);
        }
        J0.b bVar = this.f1719b.f6590a;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i = a10 + bVar.f2098a;
            int i9 = (this.f1718a * 4) + bVar.f2099b.getInt(i) + i + 4;
            int i10 = bVar.f2099b.getInt(i9) + i9;
            ByteBuffer byteBuffer = bVar.f2099b;
            aVar.f2099b = byteBuffer;
            if (byteBuffer != null) {
                aVar.f2098a = i10;
                int i11 = i10 - byteBuffer.getInt(i10);
                aVar.f2100c = i11;
                aVar.f2101d = aVar.f2099b.getShort(i11);
            } else {
                aVar.f2098a = 0;
                aVar.f2100c = 0;
                aVar.f2101d = 0;
            }
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        J0.a c2 = c();
        int a10 = c2.a(4);
        sb2.append(Integer.toHexString(a10 != 0 ? c2.f2099b.getInt(a10 + c2.f2098a) : 0));
        sb2.append(", codepoints:");
        int b9 = b();
        for (int i = 0; i < b9; i++) {
            sb2.append(Integer.toHexString(a(i)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
