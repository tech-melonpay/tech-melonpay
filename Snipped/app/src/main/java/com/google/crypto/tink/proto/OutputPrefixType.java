package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.C0673u;

/* loaded from: classes.dex */
public enum OutputPrefixType implements C0673u.a {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f10078a;

    OutputPrefixType(int i) {
        this.f10078a = i;
    }

    public static OutputPrefixType a(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0673u.a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f10078a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
