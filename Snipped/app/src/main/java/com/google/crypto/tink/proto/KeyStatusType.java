package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.C0673u;

/* loaded from: classes.dex */
public enum KeyStatusType implements C0673u.a {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f10070a;

    KeyStatusType(int i) {
        this.f10070a = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0673u.a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f10070a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
