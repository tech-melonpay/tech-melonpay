package com.google.crypto.tink.shaded.protobuf;

/* compiled from: RawMessageInfo.java */
/* loaded from: classes.dex */
public final class V implements G {

    /* renamed from: a, reason: collision with root package name */
    public final I f10165a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10166b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f10167c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10168d;

    public V(GeneratedMessageLite generatedMessageLite, String str, Object[] objArr) {
        this.f10165a = generatedMessageLite;
        this.f10166b = str;
        this.f10167c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f10168d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i9 = 1;
        int i10 = 13;
        while (true) {
            int i11 = i9 + 1;
            char charAt2 = str.charAt(i9);
            if (charAt2 < 55296) {
                this.f10168d = i | (charAt2 << i10);
                return;
            } else {
                i |= (charAt2 & 8191) << i10;
                i10 += 13;
                i9 = i11;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.G
    public final boolean a() {
        return (this.f10168d & 2) == 2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.G
    public final I b() {
        return this.f10165a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.G
    public final ProtoSyntax c() {
        return (this.f10168d & 1) == 1 ? ProtoSyntax.f10155a : ProtoSyntax.f10156b;
    }

    public final Object[] d() {
        return this.f10167c;
    }

    public final String e() {
        return this.f10166b;
    }
}
