package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC0654a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0654a.AbstractC0109a;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

/* compiled from: AbstractMessageLite.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0654a<MessageType extends AbstractC0654a<MessageType, BuilderType>, BuilderType extends AbstractC0109a<MessageType, BuilderType>> implements I {
    protected int memoizedHashCode = 0;

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0109a<MessageType extends AbstractC0654a<MessageType, BuilderType>, BuilderType extends AbstractC0109a<MessageType, BuilderType>> implements J, Cloneable {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final ByteString c() {
        try {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
            int d10 = generatedMessageLite.d();
            ByteString byteString = ByteString.f10084b;
            byte[] bArr = new byte[d10];
            Logger logger = CodedOutputStream.f10090b;
            CodedOutputStream.a aVar = new CodedOutputStream.a(bArr, d10);
            generatedMessageLite.a(aVar);
            if (aVar.D0() == 0) {
                return new ByteString.LiteralByteString(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(h("ByteString"), e10);
        }
    }

    public int g() {
        throw new UnsupportedOperationException();
    }

    public final String h(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public void i(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final byte[] toByteArray() {
        try {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
            int d10 = generatedMessageLite.d();
            byte[] bArr = new byte[d10];
            Logger logger = CodedOutputStream.f10090b;
            CodedOutputStream.a aVar = new CodedOutputStream.a(bArr, d10);
            generatedMessageLite.a(aVar);
            if (aVar.D0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(h("byte array"), e10);
        }
    }
}
