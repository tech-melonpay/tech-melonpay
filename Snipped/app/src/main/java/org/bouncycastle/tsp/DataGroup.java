package org.bouncycastle.tsp;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.bouncycastle.asn1.a;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class DataGroup {
    private List<byte[]> dataObjects;
    private byte[] groupHash;
    private TreeSet<byte[]> hashes;

    public class ByteArrayComparator implements Comparator {
        private ByteArrayComparator() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            int length = bArr.length < bArr2.length ? bArr.length : bArr2.length;
            for (int i = 0; i != length; i++) {
                int i9 = bArr[i] & 255;
                int i10 = bArr2[i] & 255;
                if (i9 != i10) {
                    return i9 - i10;
                }
            }
            return bArr.length - bArr2.length;
        }
    }

    public DataGroup(List<byte[]> list) {
        this.dataObjects = list;
    }

    public static byte[] calcDigest(DigestCalculator digestCalculator, byte[] bArr) {
        try {
            OutputStream outputStream = digestCalculator.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return digestCalculator.getDigest();
        } catch (IOException e10) {
            throw new IllegalStateException(a.b(e10, new StringBuilder("digest calculator failure: ")));
        }
    }

    public byte[] getHash(DigestCalculator digestCalculator) {
        if (this.groupHash == null) {
            TreeSet<byte[]> hashes = getHashes(digestCalculator);
            if (hashes.size() > 1) {
                byte[] bArr = new byte[0];
                Iterator<byte[]> it = hashes.iterator();
                while (it.hasNext()) {
                    bArr = Arrays.concatenate(bArr, it.next());
                }
                this.groupHash = calcDigest(digestCalculator, bArr);
            } else {
                this.groupHash = hashes.first();
            }
        }
        return this.groupHash;
    }

    public TreeSet<byte[]> getHashes(DigestCalculator digestCalculator) {
        return getHashes(digestCalculator, null);
    }

    public DataGroup(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        this.dataObjects = arrayList;
        arrayList.add(bArr);
    }

    private TreeSet<byte[]> getHashes(DigestCalculator digestCalculator, byte[] bArr) {
        if (this.hashes == null) {
            this.hashes = new TreeSet<>(new ByteArrayComparator());
            for (int i = 0; i != this.dataObjects.size(); i++) {
                byte[] bArr2 = this.dataObjects.get(i);
                TreeSet<byte[]> treeSet = this.hashes;
                byte[] calcDigest = calcDigest(digestCalculator, bArr2);
                if (bArr != null) {
                    treeSet.add(calcDigest(digestCalculator, Arrays.concatenate(calcDigest, bArr)));
                } else {
                    treeSet.add(calcDigest);
                }
            }
        }
        return this.hashes;
    }
}
