package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: MapFieldSchemaLite.java */
/* loaded from: classes.dex */
public final class E implements D {
    @Override // com.google.crypto.tink.shaded.protobuf.D
    public final MapFieldLite a(Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapFieldLite mapFieldLite2 = (MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.f10152a) {
                mapFieldLite = mapFieldLite.d();
            }
            mapFieldLite.c();
            if (!mapFieldLite2.isEmpty()) {
                mapFieldLite.putAll(mapFieldLite2);
            }
        }
        return mapFieldLite;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public final Object b(Object obj) {
        ((MapFieldLite) obj).f10152a = false;
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public final void c(Object obj) {
        ((C) obj).getClass();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public final MapFieldLite d() {
        return MapFieldLite.f10151b.d();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public final MapFieldLite e(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public final int f(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        C c2 = (C) obj2;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        Iterator it = mapFieldLite.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        c2.getClass();
        CodedOutputStream.g0(i);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public final boolean g(Object obj) {
        return !((MapFieldLite) obj).f10152a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public final MapFieldLite h(Object obj) {
        return (MapFieldLite) obj;
    }
}
