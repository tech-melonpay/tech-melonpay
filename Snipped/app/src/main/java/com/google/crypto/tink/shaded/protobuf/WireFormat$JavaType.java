package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum WireFormat$JavaType {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(ByteString.f10084b),
    ENUM(null),
    MESSAGE(null);


    /* renamed from: a, reason: collision with root package name */
    public final Object f10181a;

    WireFormat$JavaType(Serializable serializable) {
        this.f10181a = serializable;
    }
}
