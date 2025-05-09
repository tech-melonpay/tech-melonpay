package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;

/* compiled from: ByteString.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0660g extends ByteString.a {

    /* renamed from: a, reason: collision with root package name */
    public int f10218a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f10219b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ByteString f10220c;

    public C0660g(ByteString byteString) {
        this.f10220c = byteString;
        this.f10219b = byteString.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10218a < this.f10219b;
    }
}
