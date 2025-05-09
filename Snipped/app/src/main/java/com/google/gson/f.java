package com.google.gson;

import com.google.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import r3.C1149a;

/* compiled from: Gson.java */
/* loaded from: classes.dex */
public final class f extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f10327b;

    public /* synthetic */ f(r rVar, int i) {
        this.f10326a = i;
        this.f10327b = rVar;
    }

    @Override // com.google.gson.r
    public final Object a(C1149a c1149a) {
        switch (this.f10326a) {
            case 0:
                return new AtomicLong(((Number) this.f10327b.a(c1149a)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                c1149a.d();
                while (c1149a.G()) {
                    arrayList.add(Long.valueOf(((Number) this.f10327b.a(c1149a)).longValue()));
                }
                c1149a.y();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            default:
                if (c1149a.k0() != JsonToken.i) {
                    return this.f10327b.a(c1149a);
                }
                c1149a.Y();
                return null;
        }
    }

    @Override // com.google.gson.r
    public final void b(r3.b bVar, Object obj) {
        switch (this.f10326a) {
            case 0:
                this.f10327b.b(bVar, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                bVar.i();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    this.f10327b.b(bVar, Long.valueOf(atomicLongArray.get(i)));
                }
                bVar.y();
                break;
            default:
                if (obj == null) {
                    bVar.E();
                    break;
                } else {
                    this.f10327b.b(bVar, obj);
                    break;
                }
        }
    }
}
