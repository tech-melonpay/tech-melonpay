package com.google.crypto.tink.shaded.protobuf;

import com.bumptech.glide.load.Key;
import com.google.crypto.tink.shaded.protobuf.AbstractC0661h;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;
import org.bouncycastle.i18n.LocalizedMessage;

/* compiled from: Internal.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0673u {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f10266a = Charset.forName(Key.STRING_CHARSET_NAME);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f10267b;

    /* compiled from: Internal.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.u$a */
    public interface a {
        int getNumber();
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.u$b */
    public interface b {
        boolean a();
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.u$c */
    public interface c<E> extends List<E>, RandomAccess {
        void j();

        boolean k0();

        c<E> p(int i);
    }

    static {
        Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
        byte[] bArr = new byte[0];
        f10267b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new AbstractC0661h.a(bArr, 0, 0, false).g(0);
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static GeneratedMessageLite c(Object obj, Object obj2) {
        GeneratedMessageLite.a e10 = ((I) obj).e();
        I i = (I) obj2;
        if (!e10.f10115a.getClass().isInstance(i)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        e10.i();
        GeneratedMessageLite.a.j(e10.f10116b, (GeneratedMessageLite) ((AbstractC0654a) i));
        return e10.h();
    }
}
