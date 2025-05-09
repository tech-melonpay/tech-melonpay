package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import pa.C1124b;

/* compiled from: MetadataRepo.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final J0.b f6590a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f6591b;

    /* renamed from: c, reason: collision with root package name */
    public final a f6592c = new a(1024);

    /* renamed from: d, reason: collision with root package name */
    public final Typeface f6593d;

    /* compiled from: MetadataRepo.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray<a> f6594a;

        /* renamed from: b, reason: collision with root package name */
        public I0.g f6595b;

        public a() {
            this(1);
        }

        public final void a(I0.g gVar, int i, int i9) {
            int a10 = gVar.a(i);
            SparseArray<a> sparseArray = this.f6594a;
            a aVar = sparseArray == null ? null : sparseArray.get(a10);
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(gVar.a(i), aVar);
            }
            if (i9 > i) {
                aVar.a(gVar, i + 1, i9);
            } else {
                aVar.f6595b = gVar;
            }
        }

        public a(int i) {
            this.f6594a = new SparseArray<>(i);
        }
    }

    public h(Typeface typeface, J0.b bVar) {
        int i;
        int i9;
        this.f6593d = typeface;
        this.f6590a = bVar;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i10 = a10 + bVar.f2098a;
            i = bVar.f2099b.getInt(bVar.f2099b.getInt(i10) + i10);
        } else {
            i = 0;
        }
        this.f6591b = new char[i * 2];
        int a11 = bVar.a(6);
        if (a11 != 0) {
            int i11 = a11 + bVar.f2098a;
            i9 = bVar.f2099b.getInt(bVar.f2099b.getInt(i11) + i11);
        } else {
            i9 = 0;
        }
        for (int i12 = 0; i12 < i9; i12++) {
            I0.g gVar = new I0.g(this, i12);
            J0.a c2 = gVar.c();
            int a12 = c2.a(4);
            Character.toChars(a12 != 0 ? c2.f2099b.getInt(a12 + c2.f2098a) : 0, this.f6591b, i12 * 2);
            C1124b.m(gVar.b() > 0, "invalid metadata codepoint length");
            this.f6592c.a(gVar, 0, gVar.b() - 1);
        }
    }
}
