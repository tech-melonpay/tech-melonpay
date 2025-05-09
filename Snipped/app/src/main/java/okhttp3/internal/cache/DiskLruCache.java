package okhttp3.internal.cache;

import C.v;
import Ca.k;
import Ka.d;
import Ka.e;
import Ka.h;
import Ka.s;
import Ka.t;
import Ka.w;
import Ka.y;
import O9.p;
import ca.InterfaceC0646l;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ka.C0969n;
import kotlin.jvm.internal.f;
import kotlin.text.Regex;
import okhttp3.internal.cache.DiskLruCache;
import ya.c;

/* compiled from: DiskLruCache.kt */
/* loaded from: classes2.dex */
public final class DiskLruCache implements Closeable, Flushable {

    /* renamed from: t, reason: collision with root package name */
    public static final Regex f24547t = new Regex("[a-z0-9_-]{1,120}");

    /* renamed from: u, reason: collision with root package name */
    public static final String f24548u = "CLEAN";

    /* renamed from: v, reason: collision with root package name */
    public static final String f24549v = "DIRTY";

    /* renamed from: w, reason: collision with root package name */
    public static final String f24550w = "REMOVE";

    /* renamed from: x, reason: collision with root package name */
    public static final String f24551x = "READ";

    /* renamed from: b, reason: collision with root package name */
    public final File f24553b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24554c;

    /* renamed from: d, reason: collision with root package name */
    public final File f24555d;

    /* renamed from: e, reason: collision with root package name */
    public final File f24556e;

    /* renamed from: f, reason: collision with root package name */
    public final File f24557f;

    /* renamed from: g, reason: collision with root package name */
    public long f24558g;

    /* renamed from: h, reason: collision with root package name */
    public h f24559h;

    /* renamed from: j, reason: collision with root package name */
    public int f24560j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f24561k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f24562l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f24563m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f24564n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f24565o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f24566p;

    /* renamed from: q, reason: collision with root package name */
    public long f24567q;

    /* renamed from: r, reason: collision with root package name */
    public final c f24568r;

    /* renamed from: a, reason: collision with root package name */
    public final Da.a f24552a = Da.a.f984a;
    public final LinkedHashMap<String, a> i = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: s, reason: collision with root package name */
    public final k f24569s = new k(this, androidx.camera.core.impl.utils.a.n(new StringBuilder(), wa.b.f30878g, " Cache"), 1);

    /* compiled from: DiskLruCache.kt */
    public final class Editor {

        /* renamed from: a, reason: collision with root package name */
        public final a f24570a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f24571b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f24572c;

        public Editor(a aVar) {
            boolean[] zArr;
            this.f24570a = aVar;
            if (aVar.f24580e) {
                zArr = null;
            } else {
                DiskLruCache.this.getClass();
                zArr = new boolean[2];
            }
            this.f24571b = zArr;
        }

        public final void a() {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                try {
                    if (!(!this.f24572c)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (f.b(this.f24570a.f24582g, this)) {
                        diskLruCache.i(this, false);
                    }
                    this.f24572c = true;
                    p pVar = p.f3034a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                try {
                    if (!(!this.f24572c)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (f.b(this.f24570a.f24582g, this)) {
                        diskLruCache.i(this, true);
                    }
                    this.f24572c = true;
                    p pVar = p.f3034a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() {
            a aVar = this.f24570a;
            if (f.b(aVar.f24582g, this)) {
                DiskLruCache diskLruCache = DiskLruCache.this;
                if (diskLruCache.f24562l) {
                    diskLruCache.i(this, false);
                } else {
                    aVar.f24581f = true;
                }
            }
        }

        public final w d(int i) {
            final DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                try {
                    if (!(!this.f24572c)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (!f.b(this.f24570a.f24582g, this)) {
                        return new e();
                    }
                    a aVar = this.f24570a;
                    if (!aVar.f24580e) {
                        this.f24571b[i] = true;
                    }
                    try {
                        return new xa.e(diskLruCache.f24552a.f((File) aVar.f24579d.get(i)), new InterfaceC0646l<IOException, p>() { // from class: okhttp3.internal.cache.DiskLruCache$Editor$newSink$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // ca.InterfaceC0646l
                            public final p invoke(IOException iOException) {
                                DiskLruCache diskLruCache2 = DiskLruCache.this;
                                DiskLruCache.Editor editor = this;
                                synchronized (diskLruCache2) {
                                    editor.c();
                                }
                                return p.f3034a;
                            }
                        });
                    } catch (FileNotFoundException unused) {
                        return new e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f24576a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f24577b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f24578c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f24579d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f24580e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f24581f;

        /* renamed from: g, reason: collision with root package name */
        public Editor f24582g;

        /* renamed from: h, reason: collision with root package name */
        public int f24583h;
        public long i;

        public a(String str) {
            this.f24576a = str;
            DiskLruCache.this.getClass();
            this.f24577b = new long[2];
            this.f24578c = new ArrayList();
            this.f24579d = new ArrayList();
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i = 0; i < 2; i++) {
                sb2.append(i);
                this.f24578c.add(new File(DiskLruCache.this.f24553b, sb2.toString()));
                sb2.append(".tmp");
                this.f24579d.add(new File(DiskLruCache.this.f24553b, sb2.toString()));
                sb2.setLength(length);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v7, types: [okhttp3.internal.cache.a] */
        public final b a() {
            byte[] bArr = wa.b.f30872a;
            if (!this.f24580e) {
                return null;
            }
            DiskLruCache diskLruCache = DiskLruCache.this;
            if (!diskLruCache.f24562l && (this.f24582g != null || this.f24581f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                try {
                    d h9 = diskLruCache.f24552a.h((File) this.f24578c.get(i));
                    if (!diskLruCache.f24562l) {
                        this.f24583h++;
                        h9 = new okhttp3.internal.cache.a(h9, diskLruCache, this);
                    }
                    arrayList.add(h9);
                } catch (FileNotFoundException unused) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        wa.b.c((y) it.next());
                    }
                    try {
                        diskLruCache.H(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
            return DiskLruCache.this.new b(this.f24576a, this.i, arrayList);
        }
    }

    /* compiled from: DiskLruCache.kt */
    public final class b implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        public final String f24585a;

        /* renamed from: b, reason: collision with root package name */
        public final long f24586b;

        /* renamed from: c, reason: collision with root package name */
        public final List<y> f24587c;

        public b(String str, long j10, ArrayList arrayList) {
            this.f24585a = str;
            this.f24586b = j10;
            this.f24587c = arrayList;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Iterator<y> it = this.f24587c.iterator();
            while (it.hasNext()) {
                wa.b.c(it.next());
            }
        }
    }

    public DiskLruCache(File file, long j10, ya.d dVar) {
        this.f24553b = file;
        this.f24554c = j10;
        this.f24568r = dVar.f();
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.f24555d = new File(file, "journal");
        this.f24556e = new File(file, "journal.tmp");
        this.f24557f = new File(file, "journal.bkp");
    }

    public static void N(String str) {
        if (!f24547t.b(str)) {
            throw new IllegalArgumentException(v.o("keys must match regex [a-z0-9_-]{1,120}: \"", str, '\"').toString());
        }
    }

    public final boolean A() {
        int i = this.f24560j;
        return i >= 2000 && i >= this.i.size();
    }

    public final void C() {
        File file = this.f24556e;
        Da.a aVar = this.f24552a;
        aVar.b(file);
        Iterator<a> it = this.i.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            int i = 0;
            if (next.f24582g == null) {
                while (i < 2) {
                    this.f24558g += next.f24577b[i];
                    i++;
                }
            } else {
                next.f24582g = null;
                while (i < 2) {
                    aVar.b((File) next.f24578c.get(i));
                    aVar.b((File) next.f24579d.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void D() {
        File file = this.f24555d;
        Da.a aVar = this.f24552a;
        t tVar = new t(aVar.h(file));
        try {
            String x9 = tVar.x(Long.MAX_VALUE);
            String x10 = tVar.x(Long.MAX_VALUE);
            String x11 = tVar.x(Long.MAX_VALUE);
            String x12 = tVar.x(Long.MAX_VALUE);
            String x13 = tVar.x(Long.MAX_VALUE);
            if (!f.b("libcore.io.DiskLruCache", x9) || !f.b("1", x10) || !f.b(String.valueOf(201105), x11) || !f.b(String.valueOf(2), x12) || x13.length() > 0) {
                throw new IOException("unexpected journal header: [" + x9 + ", " + x10 + ", " + x12 + ", " + x13 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    E(tVar.x(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.f24560j = i - this.i.size();
                    if (tVar.r()) {
                        this.f24559h = new s(new xa.e(aVar.a(file), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
                    } else {
                        G();
                    }
                    p pVar = p.f3034a;
                    U4.b.d(tVar, null);
                    return;
                }
            }
        } finally {
        }
    }

    public final void E(String str) {
        String substring;
        int f02 = C0969n.f0(str, ' ', 0, false, 6);
        if (f02 == -1) {
            throw new IOException(s3.b.j("unexpected journal line: ", str));
        }
        int i = f02 + 1;
        int f03 = C0969n.f0(str, ' ', i, false, 4);
        LinkedHashMap<String, a> linkedHashMap = this.i;
        if (f03 == -1) {
            substring = str.substring(i);
            String str2 = f24550w;
            if (f02 == str2.length() && str.startsWith(str2)) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, f03);
        }
        a aVar = linkedHashMap.get(substring);
        if (aVar == null) {
            aVar = new a(substring);
            linkedHashMap.put(substring, aVar);
        }
        if (f03 != -1) {
            String str3 = f24548u;
            if (f02 == str3.length() && str.startsWith(str3)) {
                List q02 = C0969n.q0(str.substring(f03 + 1), new char[]{' '});
                aVar.f24580e = true;
                aVar.f24582g = null;
                int size = q02.size();
                DiskLruCache.this.getClass();
                if (size != 2) {
                    throw new IOException("unexpected journal line: " + q02);
                }
                try {
                    int size2 = q02.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        aVar.f24577b[i9] = Long.parseLong((String) q02.get(i9));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + q02);
                }
            }
        }
        if (f03 == -1) {
            String str4 = f24549v;
            if (f02 == str4.length() && str.startsWith(str4)) {
                aVar.f24582g = new Editor(aVar);
                return;
            }
        }
        if (f03 == -1) {
            String str5 = f24551x;
            if (f02 == str5.length() && str.startsWith(str5)) {
                return;
            }
        }
        throw new IOException(s3.b.j("unexpected journal line: ", str));
    }

    public final synchronized void G() {
        try {
            h hVar = this.f24559h;
            if (hVar != null) {
                hVar.close();
            }
            s sVar = new s(this.f24552a.f(this.f24556e));
            try {
                sVar.F("libcore.io.DiskLruCache");
                sVar.s(10);
                sVar.F("1");
                sVar.s(10);
                sVar.j0(201105);
                sVar.s(10);
                sVar.j0(2);
                sVar.s(10);
                sVar.s(10);
                Iterator<a> it = this.i.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    a next = it.next();
                    if (next.f24582g != null) {
                        sVar.F(f24549v);
                        sVar.s(32);
                        sVar.F(next.f24576a);
                        sVar.s(10);
                    } else {
                        sVar.F(f24548u);
                        sVar.s(32);
                        sVar.F(next.f24576a);
                        for (long j10 : next.f24577b) {
                            sVar.s(32);
                            sVar.j0(j10);
                        }
                        sVar.s(10);
                    }
                }
                p pVar = p.f3034a;
                U4.b.d(sVar, null);
                if (this.f24552a.d(this.f24555d)) {
                    this.f24552a.e(this.f24555d, this.f24557f);
                }
                this.f24552a.e(this.f24556e, this.f24555d);
                this.f24552a.b(this.f24557f);
                this.f24559h = new s(new xa.e(this.f24552a.a(this.f24555d), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
                this.f24561k = false;
                this.f24566p = false;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void H(a aVar) {
        h hVar;
        boolean z10 = this.f24562l;
        String str = aVar.f24576a;
        if (!z10) {
            if (aVar.f24583h > 0 && (hVar = this.f24559h) != null) {
                hVar.F(f24549v);
                hVar.s(32);
                hVar.F(str);
                hVar.s(10);
                hVar.flush();
            }
            if (aVar.f24583h > 0 || aVar.f24582g != null) {
                aVar.f24581f = true;
                return;
            }
        }
        Editor editor = aVar.f24582g;
        if (editor != null) {
            editor.c();
        }
        for (int i = 0; i < 2; i++) {
            this.f24552a.b((File) aVar.f24578c.get(i));
            long j10 = this.f24558g;
            long[] jArr = aVar.f24577b;
            this.f24558g = j10 - jArr[i];
            jArr[i] = 0;
        }
        this.f24560j++;
        h hVar2 = this.f24559h;
        if (hVar2 != null) {
            hVar2.F(f24550w);
            hVar2.s(32);
            hVar2.F(str);
            hVar2.s(10);
        }
        this.i.remove(str);
        if (A()) {
            this.f24568r.c(this.f24569s, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        H(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M() {
        /*
            r4 = this;
        L0:
            long r0 = r4.f24558g
            long r2 = r4.f24554c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$a> r0 = r4.i
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            okhttp3.internal.cache.DiskLruCache$a r1 = (okhttp3.internal.cache.DiskLruCache.a) r1
            boolean r2 = r1.f24581f
            if (r2 != 0) goto L12
            r4.H(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.f24565o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.M():void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f24563m && !this.f24564n) {
                for (a aVar : (a[]) this.i.values().toArray(new a[0])) {
                    Editor editor = aVar.f24582g;
                    if (editor != null && editor != null) {
                        editor.c();
                    }
                }
                M();
                this.f24559h.close();
                this.f24559h = null;
                this.f24564n = true;
                return;
            }
            this.f24564n = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d() {
        if (!(!this.f24564n)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f24563m) {
            d();
            M();
            this.f24559h.flush();
        }
    }

    public final synchronized void i(Editor editor, boolean z10) {
        a aVar = editor.f24570a;
        if (!f.b(aVar.f24582g, editor)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (z10 && !aVar.f24580e) {
            for (int i = 0; i < 2; i++) {
                if (!editor.f24571b[i]) {
                    editor.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!this.f24552a.d((File) aVar.f24579d.get(i))) {
                    editor.a();
                    return;
                }
            }
        }
        for (int i9 = 0; i9 < 2; i9++) {
            File file = (File) aVar.f24579d.get(i9);
            if (!z10 || aVar.f24581f) {
                this.f24552a.b(file);
            } else if (this.f24552a.d(file)) {
                File file2 = (File) aVar.f24578c.get(i9);
                this.f24552a.e(file, file2);
                long j10 = aVar.f24577b[i9];
                long g10 = this.f24552a.g(file2);
                aVar.f24577b[i9] = g10;
                this.f24558g = (this.f24558g - j10) + g10;
            }
        }
        aVar.f24582g = null;
        if (aVar.f24581f) {
            H(aVar);
            return;
        }
        this.f24560j++;
        h hVar = this.f24559h;
        if (!aVar.f24580e && !z10) {
            this.i.remove(aVar.f24576a);
            hVar.F(f24550w).s(32);
            hVar.F(aVar.f24576a);
            hVar.s(10);
            hVar.flush();
            if (this.f24558g <= this.f24554c || A()) {
                this.f24568r.c(this.f24569s, 0L);
            }
        }
        aVar.f24580e = true;
        hVar.F(f24548u).s(32);
        hVar.F(aVar.f24576a);
        for (long j11 : aVar.f24577b) {
            hVar.s(32).j0(j11);
        }
        hVar.s(10);
        if (z10) {
            long j12 = this.f24567q;
            this.f24567q = 1 + j12;
            aVar.i = j12;
        }
        hVar.flush();
        if (this.f24558g <= this.f24554c) {
        }
        this.f24568r.c(this.f24569s, 0L);
    }

    public final synchronized Editor j(String str, long j10) {
        try {
            y();
            d();
            N(str);
            a aVar = this.i.get(str);
            if (j10 != -1 && (aVar == null || aVar.i != j10)) {
                return null;
            }
            if ((aVar != null ? aVar.f24582g : null) != null) {
                return null;
            }
            if (aVar != null && aVar.f24583h != 0) {
                return null;
            }
            if (!this.f24565o && !this.f24566p) {
                h hVar = this.f24559h;
                hVar.F(f24549v).s(32).F(str).s(10);
                hVar.flush();
                if (this.f24561k) {
                    return null;
                }
                if (aVar == null) {
                    aVar = new a(str);
                    this.i.put(str, aVar);
                }
                Editor editor = new Editor(aVar);
                aVar.f24582g = editor;
                return editor;
            }
            this.f24568r.c(this.f24569s, 0L);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized b p(String str) {
        y();
        d();
        N(str);
        a aVar = this.i.get(str);
        if (aVar == null) {
            return null;
        }
        b a10 = aVar.a();
        if (a10 == null) {
            return null;
        }
        this.f24560j++;
        this.f24559h.F(f24551x).s(32).F(str).s(10);
        if (A()) {
            this.f24568r.c(this.f24569s, 0L);
        }
        return a10;
    }

    public final synchronized void y() {
        boolean z10;
        try {
            byte[] bArr = wa.b.f30872a;
            if (this.f24563m) {
                return;
            }
            if (this.f24552a.d(this.f24557f)) {
                if (this.f24552a.d(this.f24555d)) {
                    this.f24552a.b(this.f24557f);
                } else {
                    this.f24552a.e(this.f24557f, this.f24555d);
                }
            }
            Da.a aVar = this.f24552a;
            File file = this.f24557f;
            Ka.c f10 = aVar.f(file);
            try {
                try {
                    aVar.b(file);
                    U4.b.d(f10, null);
                    z10 = true;
                } catch (IOException unused) {
                    p pVar = p.f3034a;
                    U4.b.d(f10, null);
                    aVar.b(file);
                    z10 = false;
                }
                this.f24562l = z10;
                if (this.f24552a.d(this.f24555d)) {
                    try {
                        D();
                        C();
                        this.f24563m = true;
                        return;
                    } catch (IOException e10) {
                        Ea.h hVar = Ea.h.f1121a;
                        Ea.h hVar2 = Ea.h.f1121a;
                        String str = "DiskLruCache " + this.f24553b + " is corrupt: " + e10.getMessage() + ", removing";
                        hVar2.getClass();
                        Ea.h.i(5, str, e10);
                        try {
                            close();
                            this.f24552a.c(this.f24553b);
                            this.f24564n = false;
                        } catch (Throwable th) {
                            this.f24564n = false;
                            throw th;
                        }
                    }
                }
                G();
                this.f24563m = true;
            } finally {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
