package d9;

/* compiled from: ImageSize.java */
/* renamed from: d9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0699b {

    /* renamed from: a, reason: collision with root package name */
    public final a f20483a;

    /* renamed from: b, reason: collision with root package name */
    public final a f20484b;

    /* compiled from: ImageSize.java */
    /* renamed from: d9.b$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final float f20485a;

        /* renamed from: b, reason: collision with root package name */
        public final String f20486b;

        public a(String str, float f10) {
            this.f20485a = f10;
            this.f20486b = str;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Dimension{value=");
            sb2.append(this.f20485a);
            sb2.append(", unit='");
            return androidx.camera.core.impl.utils.a.n(sb2, this.f20486b, "'}");
        }
    }

    public C0699b(a aVar, a aVar2) {
        this.f20483a = aVar;
        this.f20484b = aVar2;
    }

    public final String toString() {
        return "ImageSize{width=" + this.f20483a + ", height=" + this.f20484b + '}';
    }
}
