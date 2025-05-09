package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import m3.C1026a;
import n3.C1063a;
import n3.C1064b;
import n3.p;
import r3.C1149a;

/* compiled from: Gson.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal<Map<TypeToken<?>, r<?>>> f10332a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f10333b;

    /* renamed from: c, reason: collision with root package name */
    public final C1026a f10334c;

    /* renamed from: d, reason: collision with root package name */
    public final n3.d f10335d;

    /* renamed from: e, reason: collision with root package name */
    public final List<s> f10336e;

    /* renamed from: f, reason: collision with root package name */
    public final m3.g f10337f;

    /* renamed from: g, reason: collision with root package name */
    public final b f10338g;

    /* renamed from: h, reason: collision with root package name */
    public final Map<Type, i<?>> f10339h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f10340j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f10341k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f10342l;

    /* renamed from: m, reason: collision with root package name */
    public final c f10343m;

    /* renamed from: n, reason: collision with root package name */
    public final Strictness f10344n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f10345o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f10346p;

    /* renamed from: q, reason: collision with root package name */
    public final String f10347q;

    /* renamed from: r, reason: collision with root package name */
    public final int f10348r;

    /* renamed from: s, reason: collision with root package name */
    public final int f10349s;

    /* renamed from: t, reason: collision with root package name */
    public final LongSerializationPolicy f10350t;

    /* renamed from: u, reason: collision with root package name */
    public final List<s> f10351u;

    /* renamed from: v, reason: collision with root package name */
    public final List<s> f10352v;

    /* renamed from: w, reason: collision with root package name */
    public final q f10353w;

    /* renamed from: x, reason: collision with root package name */
    public final q f10354x;

    /* renamed from: y, reason: collision with root package name */
    public final List<ReflectionAccessFilter> f10355y;

    /* renamed from: z, reason: collision with root package name */
    public static final c f10331z = c.f10320d;

    /* renamed from: A, reason: collision with root package name */
    public static final b f10328A = FieldNamingPolicy.f10304a;

    /* renamed from: B, reason: collision with root package name */
    public static final q f10329B = ToNumberPolicy.f10317a;

    /* renamed from: C, reason: collision with root package name */
    public static final q f10330C = ToNumberPolicy.f10318b;

    /* compiled from: Gson.java */
    public static class a<T> extends n3.m<T> {

        /* renamed from: a, reason: collision with root package name */
        public r<T> f10356a = null;

        @Override // com.google.gson.r
        public final T a(C1149a c1149a) {
            r<T> rVar = this.f10356a;
            if (rVar != null) {
                return rVar.a(c1149a);
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, T t3) {
            r<T> rVar = this.f10356a;
            if (rVar == null) {
                throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
            }
            rVar.b(bVar, t3);
        }

        @Override // n3.m
        public final r<T> c() {
            r<T> rVar = this.f10356a;
            if (rVar != null) {
                return rVar;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    public g() {
        this(m3.g.f23902f, f10328A, Collections.emptyMap(), false, false, false, true, f10331z, null, false, true, LongSerializationPolicy.f10306a, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), f10329B, f10330C, Collections.emptyList());
    }

    public static void a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(Class cls, String str) {
        Object c2 = c(str, TypeToken.get(cls));
        if (cls == Integer.TYPE) {
            cls = Integer.class;
        } else if (cls == Float.TYPE) {
            cls = Float.class;
        } else if (cls == Byte.TYPE) {
            cls = Byte.class;
        } else if (cls == Double.TYPE) {
            cls = Double.class;
        } else if (cls == Long.TYPE) {
            cls = Long.class;
        } else if (cls == Character.TYPE) {
            cls = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = Short.class;
        } else if (cls == Void.TYPE) {
            cls = Void.class;
        }
        return cls.cast(c2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> T c(java.lang.String r6, com.google.gson.reflect.TypeToken<T> r7) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.io.StringReader r1 = new java.io.StringReader
            r1.<init>(r6)
            r3.a r6 = new r3.a
            r6.<init>(r1)
            com.google.gson.Strictness r1 = com.google.gson.Strictness.f10314b
            com.google.gson.Strictness r2 = r5.f10344n
            if (r2 != 0) goto L16
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            r6.f26150b = r3
            java.lang.String r4 = "AssertionError (GSON 2.11.0): "
            if (r2 == 0) goto L20
            r6.f26150b = r2
            goto L26
        L20:
            if (r3 != r1) goto L26
            com.google.gson.Strictness r1 = com.google.gson.Strictness.f10313a
            r6.f26150b = r1
        L26:
            r6.k0()     // Catch: java.lang.Throwable -> L36 java.lang.AssertionError -> L38 java.io.IOException -> L3a java.lang.IllegalStateException -> L3c java.io.EOFException -> L62
            r1 = 0
            com.google.gson.r r7 = r5.d(r7)     // Catch: java.lang.Throwable -> L36 java.lang.AssertionError -> L38 java.io.IOException -> L3a java.lang.IllegalStateException -> L3c java.io.EOFException -> L3e
            java.lang.Object r0 = r7.a(r6)     // Catch: java.lang.Throwable -> L36 java.lang.AssertionError -> L38 java.io.IOException -> L3a java.lang.IllegalStateException -> L3c java.io.EOFException -> L3e
        L32:
            r6.p0(r3)
            goto L67
        L36:
            r7 = move-exception
            goto L91
        L38:
            r7 = move-exception
            goto L40
        L3a:
            r7 = move-exception
            goto L56
        L3c:
            r7 = move-exception
            goto L5c
        L3e:
            r7 = move-exception
            goto L64
        L40:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L36
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = r7.getMessage()     // Catch: java.lang.Throwable -> L36
            r1.append(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L36
            r0.<init>(r1, r7)     // Catch: java.lang.Throwable -> L36
            throw r0     // Catch: java.lang.Throwable -> L36
        L56:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> L36
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L36
            throw r0     // Catch: java.lang.Throwable -> L36
        L5c:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> L36
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L36
            throw r0     // Catch: java.lang.Throwable -> L36
        L62:
            r7 = move-exception
            r1 = 1
        L64:
            if (r1 == 0) goto L8b
            goto L32
        L67:
            if (r0 == 0) goto L8a
            com.google.gson.stream.JsonToken r6 = r6.k0()     // Catch: java.io.IOException -> L7a com.google.gson.stream.MalformedJsonException -> L7c
            com.google.gson.stream.JsonToken r7 = com.google.gson.stream.JsonToken.f10418j     // Catch: java.io.IOException -> L7a com.google.gson.stream.MalformedJsonException -> L7c
            if (r6 != r7) goto L72
            goto L8a
        L72:
            com.google.gson.JsonSyntaxException r6 = new com.google.gson.JsonSyntaxException     // Catch: java.io.IOException -> L7a com.google.gson.stream.MalformedJsonException -> L7c
            java.lang.String r7 = "JSON document was not fully consumed."
            r6.<init>(r7)     // Catch: java.io.IOException -> L7a com.google.gson.stream.MalformedJsonException -> L7c
            throw r6     // Catch: java.io.IOException -> L7a com.google.gson.stream.MalformedJsonException -> L7c
        L7a:
            r6 = move-exception
            goto L7e
        L7c:
            r6 = move-exception
            goto L84
        L7e:
            com.google.gson.JsonIOException r7 = new com.google.gson.JsonIOException
            r7.<init>(r6)
            throw r7
        L84:
            com.google.gson.JsonSyntaxException r7 = new com.google.gson.JsonSyntaxException
            r7.<init>(r6)
            throw r7
        L8a:
            return r0
        L8b:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> L36
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L36
            throw r0     // Catch: java.lang.Throwable -> L36
        L91:
            r6.p0(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.g.c(java.lang.String, com.google.gson.reflect.TypeToken):java.lang.Object");
    }

    public final <T> r<T> d(TypeToken<T> typeToken) {
        boolean z10;
        Objects.requireNonNull(typeToken, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f10333b;
        r<T> rVar = (r) concurrentHashMap.get(typeToken);
        if (rVar != null) {
            return rVar;
        }
        ThreadLocal<Map<TypeToken<?>, r<?>>> threadLocal = this.f10332a;
        Map<TypeToken<?>, r<?>> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<>();
            threadLocal.set(map);
            z10 = true;
        } else {
            r<T> rVar2 = (r) map.get(typeToken);
            if (rVar2 != null) {
                return rVar2;
            }
            z10 = false;
        }
        try {
            a aVar = new a();
            map.put(typeToken, aVar);
            Iterator<s> it = this.f10336e.iterator();
            r<T> rVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                rVar3 = it.next().a(this, typeToken);
                if (rVar3 != null) {
                    if (aVar.f10356a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    aVar.f10356a = rVar3;
                    map.put(typeToken, rVar3);
                }
            }
            if (z10) {
                threadLocal.remove();
            }
            if (rVar3 != null) {
                if (z10) {
                    concurrentHashMap.putAll(map);
                }
                return rVar3;
            }
            throw new IllegalArgumentException("GSON (2.11.0) cannot handle " + typeToken);
        } catch (Throwable th) {
            if (z10) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0056, code lost:
    
        if (r3 == r6) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r3 == r6) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> com.google.gson.r<T> e(com.google.gson.s r6, com.google.gson.reflect.TypeToken<T> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "skipPast must not be null"
            java.util.Objects.requireNonNull(r6, r0)
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r7, r0)
            n3.d r0 = r5.f10335d
            r0.getClass()
            n3.d$a r1 = n3.d.f24109c
            if (r6 != r1) goto L14
            goto L58
        L14:
            java.lang.Class r1 = r7.getRawType()
            java.util.concurrent.ConcurrentHashMap r2 = r0.f24112b
            java.lang.Object r3 = r2.get(r1)
            com.google.gson.s r3 = (com.google.gson.s) r3
            if (r3 == 0) goto L25
            if (r3 != r6) goto L59
            goto L58
        L25:
            java.lang.Class<l3.a> r3 = l3.InterfaceC0983a.class
            java.lang.annotation.Annotation r3 = r1.getAnnotation(r3)
            l3.a r3 = (l3.InterfaceC0983a) r3
            if (r3 != 0) goto L30
            goto L59
        L30:
            java.lang.Class r3 = r3.value()
            java.lang.Class<com.google.gson.s> r4 = com.google.gson.s.class
            boolean r4 = r4.isAssignableFrom(r3)
            if (r4 != 0) goto L3d
            goto L59
        L3d:
            com.google.gson.reflect.TypeToken r3 = com.google.gson.reflect.TypeToken.get(r3)
            m3.a r4 = r0.f24111a
            m3.i r3 = r4.b(r3)
            java.lang.Object r3 = r3.a()
            com.google.gson.s r3 = (com.google.gson.s) r3
            java.lang.Object r1 = r2.putIfAbsent(r1, r3)
            com.google.gson.s r1 = (com.google.gson.s) r1
            if (r1 == 0) goto L56
            r3 = r1
        L56:
            if (r3 != r6) goto L59
        L58:
            r6 = r0
        L59:
            java.util.List<com.google.gson.s> r0 = r5.f10336e
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L60:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L79
            java.lang.Object r2 = r0.next()
            com.google.gson.s r2 = (com.google.gson.s) r2
            if (r1 != 0) goto L72
            if (r2 != r6) goto L60
            r1 = 1
            goto L60
        L72:
            com.google.gson.r r2 = r2.a(r5, r7)
            if (r2 == 0) goto L60
            return r2
        L79:
            if (r1 != 0) goto L80
            com.google.gson.r r6 = r5.d(r7)
            return r6
        L80:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GSON cannot serialize or deserialize "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.g.e(com.google.gson.s, com.google.gson.reflect.TypeToken):com.google.gson.r");
    }

    public final r3.b f(Writer writer) {
        if (this.f10341k) {
            writer.write(")]}'\n");
        }
        r3.b bVar = new r3.b(writer);
        bVar.H(this.f10343m);
        bVar.i = this.f10342l;
        Strictness strictness = this.f10344n;
        if (strictness == null) {
            strictness = Strictness.f10314b;
        }
        bVar.M(strictness);
        bVar.f26175k = this.i;
        return bVar;
    }

    public final String g(l lVar) {
        StringWriter stringWriter = new StringWriter();
        try {
            i(lVar, f(stringWriter));
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public final String h(Object obj) {
        if (obj == null) {
            return g(m.f10407a);
        }
        Class cls = obj.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            j(obj, cls, f(stringWriter));
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public final void i(l lVar, r3.b bVar) {
        Strictness strictness = bVar.f26173h;
        boolean z10 = bVar.i;
        boolean z11 = bVar.f26175k;
        bVar.i = this.f10342l;
        bVar.f26175k = this.i;
        Strictness strictness2 = this.f10344n;
        if (strictness2 != null) {
            bVar.f26173h = strictness2;
        } else if (strictness == Strictness.f10314b) {
            bVar.f26173h = Strictness.f10313a;
        }
        try {
            try {
                n3.p.f24174B.getClass();
                p.t.d(lVar, bVar);
                bVar.M(strictness);
                bVar.i = z10;
                bVar.f26175k = z11;
            } catch (IOException e10) {
                throw new JsonIOException(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e11.getMessage(), e11);
            }
        } catch (Throwable th) {
            bVar.M(strictness);
            bVar.i = z10;
            bVar.f26175k = z11;
            throw th;
        }
    }

    public final void j(Object obj, Class cls, r3.b bVar) {
        r d10 = d(TypeToken.get((Type) cls));
        Strictness strictness = bVar.f26173h;
        Strictness strictness2 = this.f10344n;
        if (strictness2 != null) {
            bVar.f26173h = strictness2;
        } else if (strictness == Strictness.f10314b) {
            bVar.f26173h = Strictness.f10313a;
        }
        boolean z10 = bVar.i;
        boolean z11 = bVar.f26175k;
        bVar.i = this.f10342l;
        bVar.f26175k = this.i;
        try {
            try {
                try {
                    d10.b(bVar, obj);
                } catch (AssertionError e10) {
                    throw new AssertionError("AssertionError (GSON 2.11.0): " + e10.getMessage(), e10);
                }
            } catch (IOException e11) {
                throw new JsonIOException(e11);
            }
        } finally {
            bVar.M(strictness);
            bVar.i = z10;
            bVar.f26175k = z11;
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.i + ",factories:" + this.f10336e + ",instanceCreators:" + this.f10334c + "}";
    }

    public g(m3.g gVar, b bVar, Map<Type, i<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, c cVar, Strictness strictness, boolean z14, boolean z15, LongSerializationPolicy longSerializationPolicy, String str, int i, int i9, List<s> list, List<s> list2, List<s> list3, q qVar, q qVar2, List<ReflectionAccessFilter> list4) {
        n3.h hVar;
        r eVar;
        r dVar;
        r dVar2;
        n3.h hVar2;
        this.f10332a = new ThreadLocal<>();
        this.f10333b = new ConcurrentHashMap();
        this.f10337f = gVar;
        this.f10338g = bVar;
        this.f10339h = map;
        C1026a c1026a = new C1026a(map, z15, list4);
        this.f10334c = c1026a;
        this.i = z10;
        this.f10340j = z11;
        this.f10341k = z12;
        this.f10342l = z13;
        this.f10343m = cVar;
        this.f10344n = strictness;
        this.f10345o = z14;
        this.f10346p = z15;
        this.f10350t = longSerializationPolicy;
        this.f10347q = str;
        this.f10348r = i;
        this.f10349s = i9;
        this.f10351u = list;
        this.f10352v = list2;
        this.f10353w = qVar;
        this.f10354x = qVar2;
        this.f10355y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(n3.p.f24175C);
        if (qVar == ToNumberPolicy.f10317a) {
            hVar = n3.j.f24133c;
        } else {
            hVar = new n3.h(qVar, 1);
        }
        arrayList.add(hVar);
        arrayList.add(gVar);
        arrayList.addAll(list3);
        arrayList.add(n3.p.f24193r);
        arrayList.add(n3.p.f24183g);
        arrayList.add(n3.p.f24180d);
        arrayList.add(n3.p.f24181e);
        arrayList.add(n3.p.f24182f);
        if (longSerializationPolicy == LongSerializationPolicy.f10306a) {
            eVar = n3.p.f24186k;
        } else {
            eVar = new e();
        }
        arrayList.add(new n3.r(Long.TYPE, Long.class, eVar));
        Class cls = Double.TYPE;
        if (z14) {
            dVar = n3.p.f24188m;
        } else {
            dVar = new d(0);
        }
        arrayList.add(new n3.r(cls, Double.class, dVar));
        Class cls2 = Float.TYPE;
        if (z14) {
            dVar2 = n3.p.f24187l;
        } else {
            dVar2 = new d(1);
        }
        arrayList.add(new n3.r(cls2, Float.class, dVar2));
        if (qVar2 == ToNumberPolicy.f10318b) {
            hVar2 = n3.i.f24131b;
        } else {
            hVar2 = new n3.h(new n3.i(qVar2), 0);
        }
        arrayList.add(hVar2);
        arrayList.add(n3.p.f24184h);
        arrayList.add(n3.p.i);
        arrayList.add(new n3.q(AtomicLong.class, new f(new f(eVar, 0), 2), 1));
        arrayList.add(new n3.q(AtomicLongArray.class, new f(new f(eVar, 1), 2), 1));
        arrayList.add(n3.p.f24185j);
        arrayList.add(n3.p.f24189n);
        arrayList.add(n3.p.f24194s);
        arrayList.add(n3.p.f24195t);
        arrayList.add(new n3.q(BigDecimal.class, n3.p.f24190o, 1));
        arrayList.add(new n3.q(BigInteger.class, n3.p.f24191p, 1));
        arrayList.add(new n3.q(LazilyParsedNumber.class, n3.p.f24192q, 1));
        arrayList.add(n3.p.f24196u);
        arrayList.add(n3.p.f24197v);
        arrayList.add(n3.p.f24199x);
        arrayList.add(n3.p.f24200y);
        arrayList.add(n3.p.f24173A);
        arrayList.add(n3.p.f24198w);
        arrayList.add(n3.p.f24178b);
        arrayList.add(n3.c.f24104c);
        arrayList.add(n3.p.f24201z);
        if (q3.d.f25861a) {
            arrayList.add(q3.d.f25865e);
            arrayList.add(q3.d.f25864d);
            arrayList.add(q3.d.f25866f);
        }
        arrayList.add(C1063a.f24098c);
        arrayList.add(n3.p.f24177a);
        arrayList.add(new C1064b(c1026a));
        arrayList.add(new n3.g(c1026a, z11));
        n3.d dVar3 = new n3.d(c1026a);
        this.f10335d = dVar3;
        arrayList.add(dVar3);
        arrayList.add(n3.p.f24176D);
        arrayList.add(new n3.k(c1026a, bVar, gVar, dVar3, list4));
        this.f10336e = Collections.unmodifiableList(arrayList);
    }
}
