package org.bouncycastle.util.encoders;

import C.v;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.bouncycastle.util.Strings;

/* loaded from: classes3.dex */
public class Hex {
    private static final HexEncoder encoder = new HexEncoder();

    public static int decode(String str, OutputStream outputStream) {
        return encoder.decode(str, outputStream);
    }

    public static byte[] decodeStrict(String str) {
        try {
            return encoder.decodeStrict(str, 0, str.length());
        } catch (Exception e10) {
            throw new DecoderException(v.l(e10, new StringBuilder("exception decoding Hex string: ")), e10);
        }
    }

    public static int encode(byte[] bArr, int i, int i9, OutputStream outputStream) {
        return encoder.encode(bArr, i, i9, outputStream);
    }

    public static String toHexString(byte[] bArr) {
        return toHexString(bArr, 0, bArr.length);
    }

    public static byte[] decode(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new DecoderException(v.l(e10, new StringBuilder("exception decoding Hex string: ")), e10);
        }
    }

    public static int encode(byte[] bArr, OutputStream outputStream) {
        return encoder.encode(bArr, 0, bArr.length, outputStream);
    }

    public static String toHexString(byte[] bArr, int i, int i9) {
        return Strings.fromByteArray(encode(bArr, i, i9));
    }

    public static byte[] encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    public static byte[] encode(byte[] bArr, int i, int i9) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.encode(bArr, i, i9, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new EncoderException(v.l(e10, new StringBuilder("exception encoding Hex string: ")), e10);
        }
    }

    public static byte[] decodeStrict(String str, int i, int i9) {
        try {
            return encoder.decodeStrict(str, i, i9);
        } catch (Exception e10) {
            throw new DecoderException(v.l(e10, new StringBuilder("exception decoding Hex string: ")), e10);
        }
    }

    public static byte[] decode(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.decode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new DecoderException(v.l(e10, new StringBuilder("exception decoding Hex data: ")), e10);
        }
    }
}
