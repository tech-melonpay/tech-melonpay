package org.bouncycastle.asn1.util;

import java.io.FileInputStream;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Primitive;

/* loaded from: classes2.dex */
public class Dump {
    public static void main(String[] strArr) {
        FileInputStream fileInputStream = new FileInputStream(strArr[0]);
        try {
            ASN1InputStream aSN1InputStream = new ASN1InputStream(fileInputStream);
            while (true) {
                ASN1Primitive readObject = aSN1InputStream.readObject();
                if (readObject == null) {
                    return;
                } else {
                    System.out.println(ASN1Dump.dumpAsString(readObject));
                }
            }
        } finally {
            fileInputStream.close();
        }
    }
}
