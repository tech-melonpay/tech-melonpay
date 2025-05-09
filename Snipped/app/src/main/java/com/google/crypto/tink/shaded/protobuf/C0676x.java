package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C0673u;
import com.google.crypto.tink.shaded.protobuf.Utf8;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0676x extends AbstractC0656c<String> implements InterfaceC0677y, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10272b;

    static {
        new C0676x(10).f10203a = false;
    }

    public C0676x(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0677y
    public final List<?> A() {
        return Collections.unmodifiableList(this.f10272b);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0677y
    public final void V(ByteString byteString) {
        a();
        this.f10272b.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0677y
    public final InterfaceC0677y Y() {
        return this.f10203a ? new g0(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a();
        this.f10272b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(this.f10272b.size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f10272b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0677y
    public final Object d0(int i) {
        return this.f10272b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.f10272b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            byteString.getClass();
            str = byteString.size() == 0 ? "" : byteString.m(C0673u.f10266a);
            if (byteString.g()) {
                arrayList.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, C0673u.f10266a);
            Utf8.b bVar = Utf8.f10164a;
            if (Utf8.f10164a.c(0, bArr.length, bArr)) {
                arrayList.set(i, str);
            }
        }
        return str;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0673u.c
    public final C0673u.c p(int i) {
        ArrayList arrayList = this.f10272b;
        if (i < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new C0676x((ArrayList<Object>) arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object remove = this.f10272b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof ByteString)) {
            return new String((byte[]) remove, C0673u.f10266a);
        }
        ByteString byteString = (ByteString) remove;
        byteString.getClass();
        return byteString.size() == 0 ? "" : byteString.m(C0673u.f10266a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.f10272b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof ByteString)) {
            return new String((byte[]) obj2, C0673u.f10266a);
        }
        ByteString byteString = (ByteString) obj2;
        byteString.getClass();
        return byteString.size() == 0 ? "" : byteString.m(C0673u.f10266a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10272b.size();
    }

    public C0676x(ArrayList<Object> arrayList) {
        this.f10272b = arrayList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0656c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        a();
        if (collection instanceof InterfaceC0677y) {
            collection = ((InterfaceC0677y) collection).A();
        }
        boolean addAll = this.f10272b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
