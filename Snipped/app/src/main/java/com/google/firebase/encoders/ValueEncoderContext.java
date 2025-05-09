package com.google.firebase.encoders;

/* loaded from: classes.dex */
public interface ValueEncoderContext {
    ValueEncoderContext add(double d10);

    ValueEncoderContext add(float f10);

    ValueEncoderContext add(int i);

    ValueEncoderContext add(long j10);

    ValueEncoderContext add(String str);

    ValueEncoderContext add(boolean z10);

    ValueEncoderContext add(byte[] bArr);
}
