package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0674v extends C0675w {

    /* compiled from: LazyField.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.v$a */
    public static class a<K> implements Map.Entry<K, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Map.Entry<K, C0674v> f10268a;

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f10268a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            C0674v value = this.f10268a.getValue();
            if (value == null) {
                return null;
            }
            return value.a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof I)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            C0674v value = this.f10268a.getValue();
            I i = value.f10270a;
            value.f10271b = null;
            value.f10270a = (I) obj;
            return i;
        }
    }

    /* compiled from: LazyField.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.v$b */
    public static class b<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<Map.Entry<K, Object>> f10269a;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f10269a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f10269a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f10269a.next();
            if (!(next.getValue() instanceof C0674v)) {
                return next;
            }
            a aVar = new a();
            aVar.f10268a = next;
            return aVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f10269a.remove();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0675w
    public final boolean equals(Object obj) {
        return a(null).equals(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0675w
    public final int hashCode() {
        return a(null).hashCode();
    }

    public final String toString() {
        return a(null).toString();
    }
}
