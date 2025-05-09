package org.bouncycastle.crypto.util;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.AlphabetMapper;
import org.bouncycastle.tls.CipherSuite;

/* loaded from: classes2.dex */
public class BasicAlphabetMapper implements AlphabetMapper {
    private Map<Integer, Character> charMap;
    private Map<Character, Integer> indexMap;

    public BasicAlphabetMapper(String str) {
        this(str.toCharArray());
    }

    @Override // org.bouncycastle.crypto.AlphabetMapper
    public char[] convertToChars(byte[] bArr) {
        char[] cArr;
        int i = 0;
        if (this.charMap.size() <= 256) {
            cArr = new char[bArr.length];
            while (i != bArr.length) {
                cArr[i] = this.charMap.get(Integer.valueOf(bArr[i] & 255)).charValue();
                i++;
            }
        } else {
            if ((bArr.length & 1) != 0) {
                throw new IllegalArgumentException("two byte radix and input string odd length");
            }
            cArr = new char[bArr.length / 2];
            while (i != bArr.length) {
                cArr[i / 2] = this.charMap.get(Integer.valueOf(((bArr[i] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) | (bArr[i + 1] & 255))).charValue();
                i += 2;
            }
        }
        return cArr;
    }

    @Override // org.bouncycastle.crypto.AlphabetMapper
    public byte[] convertToIndexes(char[] cArr) {
        byte[] bArr;
        int i = 0;
        if (this.indexMap.size() <= 256) {
            bArr = new byte[cArr.length];
            while (i != cArr.length) {
                bArr[i] = this.indexMap.get(Character.valueOf(cArr[i])).byteValue();
                i++;
            }
        } else {
            bArr = new byte[cArr.length * 2];
            while (i != cArr.length) {
                int intValue = this.indexMap.get(Character.valueOf(cArr[i])).intValue();
                int i9 = i * 2;
                bArr[i9] = (byte) ((intValue >> 8) & 255);
                bArr[i9 + 1] = (byte) (intValue & 255);
                i++;
            }
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.AlphabetMapper
    public int getRadix() {
        return this.indexMap.size();
    }

    public BasicAlphabetMapper(char[] cArr) {
        this.indexMap = new HashMap();
        this.charMap = new HashMap();
        for (int i = 0; i != cArr.length; i++) {
            if (this.indexMap.containsKey(Character.valueOf(cArr[i]))) {
                throw new IllegalArgumentException("duplicate key detected in alphabet: " + cArr[i]);
            }
            this.indexMap.put(Character.valueOf(cArr[i]), Integer.valueOf(i));
            this.charMap.put(Integer.valueOf(i), Character.valueOf(cArr[i]));
        }
    }
}
