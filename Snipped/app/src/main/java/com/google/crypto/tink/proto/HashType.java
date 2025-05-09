package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.C0673u;

/* loaded from: classes.dex */
public enum HashType implements C0673u.a {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f10055a;

    HashType(int i) {
        this.f10055a = i;
    }

    public static HashType a(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i != 4) {
            return null;
        }
        return SHA512;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0673u.a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f10055a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
