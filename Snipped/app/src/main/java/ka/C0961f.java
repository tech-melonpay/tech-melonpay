package ka;

import P9.AbstractC0499a;
import P9.AbstractC0500b;
import ha.C0806e;
import ja.o;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;

/* compiled from: Regex.kt */
/* renamed from: ka.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0961f implements InterfaceC0960e {

    /* renamed from: a, reason: collision with root package name */
    public final Matcher f23074a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f23075b;

    /* renamed from: c, reason: collision with root package name */
    public a f23076c;

    /* compiled from: Regex.kt */
    /* renamed from: ka.f$a */
    public static final class a extends AbstractC0500b<String> {
        public a() {
        }

        @Override // P9.AbstractC0499a
        public final int a() {
            return C0961f.this.f23074a.groupCount() + 1;
        }

        @Override // P9.AbstractC0499a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return super.contains((String) obj);
            }
            return false;
        }

        @Override // java.util.List
        public final Object get(int i) {
            String group = C0961f.this.f23074a.group(i);
            return group == null ? "" : group;
        }

        @Override // P9.AbstractC0500b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return super.indexOf((String) obj);
            }
            return -1;
        }

        @Override // P9.AbstractC0500b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return super.lastIndexOf((String) obj);
            }
            return -1;
        }
    }

    /* compiled from: Regex.kt */
    /* renamed from: ka.f$b */
    public static final class b extends AbstractC0499a<C0959d> {
        public b() {
        }

        @Override // P9.AbstractC0499a
        public final int a() {
            return C0961f.this.f23074a.groupCount() + 1;
        }

        @Override // P9.AbstractC0499a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null || (obj instanceof C0959d)) {
                return super.contains((C0959d) obj);
            }
            return false;
        }

        @Override // P9.AbstractC0499a, java.util.Collection
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<C0959d> iterator() {
            return new o.a(new ja.o(new P9.k(new C0806e(0, size() - 1, 1), 1), new C7.a(this, 22)));
        }
    }

    public C0961f(Matcher matcher, CharSequence charSequence) {
        this.f23074a = matcher;
        this.f23075b = charSequence;
        new b();
    }

    @Override // ka.InterfaceC0960e
    public final List<String> a() {
        if (this.f23076c == null) {
            this.f23076c = new a();
        }
        return this.f23076c;
    }

    @Override // ka.InterfaceC0960e
    public final C0806e b() {
        Matcher matcher = this.f23074a;
        return ha.h.V(matcher.start(), matcher.end());
    }

    @Override // ka.InterfaceC0960e
    public final C0961f next() {
        Matcher matcher = this.f23074a;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f23075b;
        if (end > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        if (matcher2.find(end)) {
            return new C0961f(matcher2, charSequence);
        }
        return null;
    }
}
