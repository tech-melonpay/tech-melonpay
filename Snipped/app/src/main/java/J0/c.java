package J0;

import java.nio.ByteBuffer;

/* compiled from: Table.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f2098a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f2099b;

    /* renamed from: c, reason: collision with root package name */
    public int f2100c;

    /* renamed from: d, reason: collision with root package name */
    public int f2101d;

    public c() {
        if (D9.b.f982a == null) {
            D9.b.f982a = new D9.b();
        }
    }

    public final int a(int i) {
        if (i < this.f2101d) {
            return this.f2099b.getShort(this.f2100c + i);
        }
        return 0;
    }
}
