package Y8;

import Y8.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: HtmlTagImpl.java */
/* loaded from: classes2.dex */
public abstract class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f4136a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4137b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f4138c;

    /* renamed from: d, reason: collision with root package name */
    public int f4139d = -1;

    /* compiled from: HtmlTagImpl.java */
    public static class b extends f implements e.b {
        public b() {
            throw null;
        }

        @Override // Y8.e
        public final e.a b() {
            throw new ClassCastException("Cannot cast Inline instance to Block");
        }

        @Override // Y8.e
        public final boolean c() {
            return false;
        }

        public final String toString() {
            return "InlineImpl{name='" + this.f4136a + "', start=" + this.f4137b + ", end=" + this.f4139d + ", attributes=" + this.f4138c + '}';
        }
    }

    public f(Map map, String str, int i) {
        this.f4136a = str;
        this.f4137b = i;
        this.f4138c = map;
    }

    @Override // Y8.e
    public Map<String, String> d() {
        return this.f4138c;
    }

    @Override // Y8.e
    public final int f() {
        return this.f4139d;
    }

    @Override // Y8.e
    public final boolean isClosed() {
        return this.f4139d > -1;
    }

    @Override // Y8.e
    public final String name() {
        return this.f4136a;
    }

    @Override // Y8.e
    public final int start() {
        return this.f4137b;
    }

    /* compiled from: HtmlTagImpl.java */
    public static class a extends f implements e.a {

        /* renamed from: e, reason: collision with root package name */
        public final a f4140e;

        /* renamed from: f, reason: collision with root package name */
        public ArrayList f4141f;

        public a(String str, int i, Map<String, String> map, a aVar) {
            super(map, str, i);
            this.f4140e = aVar;
        }

        @Override // Y8.e.a
        public final a a() {
            return this.f4140e;
        }

        @Override // Y8.e
        public final boolean c() {
            return true;
        }

        @Override // Y8.f, Y8.e
        public final Map<String, String> d() {
            return this.f4138c;
        }

        @Override // Y8.e.a
        public final List<e.a> e() {
            ArrayList arrayList = this.f4141f;
            return arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        }

        public final void g(int i) {
            if (isClosed()) {
                return;
            }
            this.f4139d = i;
            ArrayList arrayList = this.f4141f;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).g(i);
                }
            }
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BlockImpl{name='");
            sb2.append(this.f4136a);
            sb2.append("', start=");
            sb2.append(this.f4137b);
            sb2.append(", end=");
            sb2.append(this.f4139d);
            sb2.append(", attributes=");
            sb2.append(this.f4138c);
            sb2.append(", parent=");
            a aVar = this.f4140e;
            sb2.append(aVar != null ? aVar.f4136a : null);
            sb2.append(", children=");
            sb2.append(this.f4141f);
            sb2.append('}');
            return sb2.toString();
        }

        @Override // Y8.e
        public final e.a b() {
            return this;
        }
    }
}
