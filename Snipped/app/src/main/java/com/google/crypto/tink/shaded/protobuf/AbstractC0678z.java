package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C0673u;
import com.google.crypto.tink.shaded.protobuf.h0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ListFieldSchema.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0678z {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10273a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final b f10274b = new b();

    /* compiled from: ListFieldSchema.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$a */
    public static final class a extends AbstractC0678z {

        /* renamed from: c, reason: collision with root package name */
        public static final Class<?> f10275c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        /* JADX WARN: Multi-variable type inference failed */
        public static List d(long j10, int i, Object obj) {
            C0676x c0676x;
            List list = (List) h0.f10236d.i(j10, obj);
            if (list.isEmpty()) {
                List c0676x2 = list instanceof InterfaceC0677y ? new C0676x(i) : ((list instanceof S) && (list instanceof C0673u.c)) ? ((C0673u.c) list).p(i) : new ArrayList(i);
                h0.u(j10, obj, c0676x2);
                return c0676x2;
            }
            if (f10275c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i);
                arrayList.addAll(list);
                h0.u(j10, obj, arrayList);
                c0676x = arrayList;
            } else {
                if (!(list instanceof g0)) {
                    if (!(list instanceof S) || !(list instanceof C0673u.c)) {
                        return list;
                    }
                    C0673u.c cVar = (C0673u.c) list;
                    if (cVar.k0()) {
                        return list;
                    }
                    C0673u.c p10 = cVar.p(list.size() + i);
                    h0.u(j10, obj, p10);
                    return p10;
                }
                C0676x c0676x3 = new C0676x(list.size() + i);
                c0676x3.addAll((g0) list);
                h0.u(j10, obj, c0676x3);
                c0676x = c0676x3;
            }
            return c0676x;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0678z
        public final void a(long j10, Object obj) {
            Object unmodifiableList;
            List list = (List) h0.f10236d.i(j10, obj);
            if (list instanceof InterfaceC0677y) {
                unmodifiableList = ((InterfaceC0677y) list).Y();
            } else {
                if (f10275c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof S) && (list instanceof C0673u.c)) {
                    C0673u.c cVar = (C0673u.c) list;
                    if (cVar.k0()) {
                        cVar.j();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            h0.u(j10, obj, unmodifiableList);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0678z
        public final void b(long j10, Object obj, Object obj2) {
            List list = (List) h0.f10236d.i(j10, obj2);
            List d10 = d(j10, list.size(), obj);
            int size = d10.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                d10.addAll(list);
            }
            if (size > 0) {
                list = d10;
            }
            h0.u(j10, obj, list);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0678z
        public final List c(long j10, Object obj) {
            return d(j10, 10, obj);
        }
    }

    /* compiled from: ListFieldSchema.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$b */
    public static final class b extends AbstractC0678z {
        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0678z
        public final void a(long j10, Object obj) {
            ((C0673u.c) h0.f10236d.i(j10, obj)).j();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0678z
        public final void b(long j10, Object obj, Object obj2) {
            h0.e eVar = h0.f10236d;
            C0673u.c cVar = (C0673u.c) eVar.i(j10, obj);
            C0673u.c cVar2 = (C0673u.c) eVar.i(j10, obj2);
            int size = cVar.size();
            int size2 = cVar2.size();
            if (size > 0 && size2 > 0) {
                if (!cVar.k0()) {
                    cVar = cVar.p(size2 + size);
                }
                cVar.addAll(cVar2);
            }
            if (size > 0) {
                cVar2 = cVar;
            }
            h0.u(j10, obj, cVar2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0678z
        public final List c(long j10, Object obj) {
            C0673u.c cVar = (C0673u.c) h0.f10236d.i(j10, obj);
            if (cVar.k0()) {
                return cVar;
            }
            int size = cVar.size();
            C0673u.c p10 = cVar.p(size == 0 ? 10 : size * 2);
            h0.u(j10, obj, p10);
            return p10;
        }
    }

    public abstract void a(long j10, Object obj);

    public abstract void b(long j10, Object obj, Object obj2);

    public abstract List c(long j10, Object obj);
}
