package org.bouncycastle.pqc.asn1;

import C.v;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.pqc.crypto.gmss.GMSSLeaf;
import org.bouncycastle.pqc.crypto.gmss.GMSSParameters;
import org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc;
import org.bouncycastle.pqc.crypto.gmss.GMSSRootSig;
import org.bouncycastle.pqc.crypto.gmss.Treehash;

/* loaded from: classes3.dex */
public class GMSSPrivateKey extends ASN1Object {
    private ASN1Primitive primitive;

    private GMSSPrivateKey(ASN1Sequence aSN1Sequence) {
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(0);
        int[] iArr = new int[aSN1Sequence2.size()];
        for (int i = 0; i < aSN1Sequence2.size(); i++) {
            iArr[i] = checkBigIntegerInIntRange(aSN1Sequence2.getObjectAt(i));
        }
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        int size = aSN1Sequence3.size();
        byte[][] bArr = new byte[size][];
        for (int i9 = 0; i9 < size; i9++) {
            bArr[i9] = ((DEROctetString) aSN1Sequence3.getObjectAt(i9)).getOctets();
        }
        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(2);
        int size2 = aSN1Sequence4.size();
        byte[][] bArr2 = new byte[size2][];
        for (int i10 = 0; i10 < size2; i10++) {
            bArr2[i10] = ((DEROctetString) aSN1Sequence4.getObjectAt(i10)).getOctets();
        }
        ASN1Sequence aSN1Sequence5 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        int size3 = aSN1Sequence5.size();
        byte[][][] bArr3 = new byte[size3][][];
        for (int i11 = 0; i11 < size3; i11++) {
            ASN1Sequence aSN1Sequence6 = (ASN1Sequence) aSN1Sequence5.getObjectAt(i11);
            bArr3[i11] = new byte[aSN1Sequence6.size()][];
            int i12 = 0;
            while (true) {
                byte[][] bArr4 = bArr3[i11];
                if (i12 < bArr4.length) {
                    bArr4[i12] = ((DEROctetString) aSN1Sequence6.getObjectAt(i12)).getOctets();
                    i12++;
                }
            }
        }
        ASN1Sequence aSN1Sequence7 = (ASN1Sequence) aSN1Sequence.getObjectAt(4);
        int size4 = aSN1Sequence7.size();
        byte[][][] bArr5 = new byte[size4][][];
        for (int i13 = 0; i13 < size4; i13++) {
            ASN1Sequence aSN1Sequence8 = (ASN1Sequence) aSN1Sequence7.getObjectAt(i13);
            bArr5[i13] = new byte[aSN1Sequence8.size()][];
            int i14 = 0;
            while (true) {
                byte[][] bArr6 = bArr5[i13];
                if (i14 < bArr6.length) {
                    bArr6[i14] = ((DEROctetString) aSN1Sequence8.getObjectAt(i14)).getOctets();
                    i14++;
                }
            }
        }
        Treehash[][] treehashArr = new Treehash[((ASN1Sequence) aSN1Sequence.getObjectAt(5)).size()][];
    }

    private static int checkBigIntegerInIntRange(ASN1Encodable aSN1Encodable) {
        return ((ASN1Integer) aSN1Encodable).intValueExact();
    }

    private ASN1Primitive encode(int[] iArr, byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, byte[][][] bArr5, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, GMSSLeaf[] gMSSLeafArr, GMSSLeaf[] gMSSLeafArr2, GMSSLeaf[] gMSSLeafArr3, int[] iArr2, byte[][] bArr6, GMSSRootCalc[] gMSSRootCalcArr, byte[][] bArr7, GMSSRootSig[] gMSSRootSigArr, GMSSParameters gMSSParameters, AlgorithmIdentifier[] algorithmIdentifierArr) {
        Treehash[][] treehashArr3 = treehashArr;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        for (int i : iArr) {
            aSN1EncodableVector2.add(new ASN1Integer(i));
        }
        ASN1EncodableVector u6 = v.u(aSN1EncodableVector2, aSN1EncodableVector);
        for (byte[] bArr8 : bArr) {
            u6.add(new DEROctetString(bArr8));
        }
        ASN1EncodableVector u10 = v.u(u6, aSN1EncodableVector);
        for (byte[] bArr9 : bArr2) {
            u10.add(new DEROctetString(bArr9));
        }
        ASN1EncodableVector u11 = v.u(u10, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        for (int i9 = 0; i9 < bArr3.length; i9++) {
            for (int i10 = 0; i10 < bArr3[i9].length; i10++) {
                u11.add(new DEROctetString(bArr3[i9][i10]));
            }
            u11 = v.u(u11, aSN1EncodableVector3);
        }
        ASN1EncodableVector u12 = v.u(aSN1EncodableVector3, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
        for (int i11 = 0; i11 < bArr4.length; i11++) {
            for (int i12 = 0; i12 < bArr4[i11].length; i12++) {
                u12.add(new DEROctetString(bArr4[i11][i12]));
            }
            u12 = v.u(u12, aSN1EncodableVector4);
        }
        ASN1EncodableVector u13 = v.u(aSN1EncodableVector4, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector5 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector6 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector7 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector8 = new ASN1EncodableVector();
        int i13 = 0;
        while (i13 < treehashArr3.length) {
            int i14 = 0;
            while (i14 < treehashArr3[i13].length) {
                aSN1EncodableVector6.add(new DERSequence(algorithmIdentifierArr[0]));
                int i15 = treehashArr3[i13][i14].getStatInt()[1];
                aSN1EncodableVector7.add(new DEROctetString(treehashArr3[i13][i14].getStatByte()[0]));
                aSN1EncodableVector7.add(new DEROctetString(treehashArr3[i13][i14].getStatByte()[1]));
                aSN1EncodableVector7.add(new DEROctetString(treehashArr3[i13][i14].getStatByte()[2]));
                for (int i16 = 0; i16 < i15; i16++) {
                    aSN1EncodableVector7.add(new DEROctetString(treehashArr3[i13][i14].getStatByte()[i16 + 3]));
                }
                aSN1EncodableVector7 = v.u(aSN1EncodableVector7, aSN1EncodableVector6);
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr3[i13][i14].getStatInt()[0]));
                aSN1EncodableVector8.add(new ASN1Integer(i15));
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr3[i13][i14].getStatInt()[2]));
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr3[i13][i14].getStatInt()[3]));
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr3[i13][i14].getStatInt()[4]));
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr3[i13][i14].getStatInt()[5]));
                int i17 = 0;
                while (i17 < i15) {
                    aSN1EncodableVector8.add(new ASN1Integer(treehashArr3[i13][i14].getStatInt()[i17 + 6]));
                    i17++;
                    treehashArr3 = treehashArr;
                }
                aSN1EncodableVector8 = v.u(aSN1EncodableVector8, aSN1EncodableVector6);
                aSN1EncodableVector6 = v.u(aSN1EncodableVector6, aSN1EncodableVector5);
                i14++;
                treehashArr3 = treehashArr;
            }
            aSN1EncodableVector5 = v.u(aSN1EncodableVector5, u13);
            i13++;
            treehashArr3 = treehashArr;
        }
        ASN1EncodableVector u14 = v.u(u13, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector9 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector10 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector11 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector12 = new ASN1EncodableVector();
        for (int i18 = 0; i18 < treehashArr2.length; i18++) {
            for (int i19 = 0; i19 < treehashArr2[i18].length; i19++) {
                aSN1EncodableVector10.add(new DERSequence(algorithmIdentifierArr[0]));
                int i20 = treehashArr2[i18][i19].getStatInt()[1];
                aSN1EncodableVector11.add(new DEROctetString(treehashArr2[i18][i19].getStatByte()[0]));
                aSN1EncodableVector11.add(new DEROctetString(treehashArr2[i18][i19].getStatByte()[1]));
                aSN1EncodableVector11.add(new DEROctetString(treehashArr2[i18][i19].getStatByte()[2]));
                for (int i21 = 0; i21 < i20; i21++) {
                    aSN1EncodableVector11.add(new DEROctetString(treehashArr2[i18][i19].getStatByte()[i21 + 3]));
                }
                aSN1EncodableVector11 = v.u(aSN1EncodableVector11, aSN1EncodableVector10);
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr2[i18][i19].getStatInt()[0]));
                aSN1EncodableVector12.add(new ASN1Integer(i20));
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr2[i18][i19].getStatInt()[2]));
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr2[i18][i19].getStatInt()[3]));
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr2[i18][i19].getStatInt()[4]));
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr2[i18][i19].getStatInt()[5]));
                for (int i22 = 0; i22 < i20; i22++) {
                    aSN1EncodableVector12.add(new ASN1Integer(treehashArr2[i18][i19].getStatInt()[i22 + 6]));
                }
                aSN1EncodableVector12 = v.u(aSN1EncodableVector12, aSN1EncodableVector10);
                aSN1EncodableVector10 = v.u(aSN1EncodableVector10, aSN1EncodableVector9);
            }
            u14.add(new DERSequence(new DERSequence(aSN1EncodableVector9)));
            aSN1EncodableVector9 = new ASN1EncodableVector();
        }
        ASN1EncodableVector u15 = v.u(u14, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector13 = new ASN1EncodableVector();
        for (int i23 = 0; i23 < bArr5.length; i23++) {
            for (int i24 = 0; i24 < bArr5[i23].length; i24++) {
                u15.add(new DEROctetString(bArr5[i23][i24]));
            }
            u15 = v.u(u15, aSN1EncodableVector13);
        }
        ASN1EncodableVector u16 = v.u(aSN1EncodableVector13, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector14 = new ASN1EncodableVector();
        for (int i25 = 0; i25 < vectorArr.length; i25++) {
            for (int i26 = 0; i26 < vectorArr[i25].size(); i26++) {
                u16.add(new DEROctetString((byte[]) vectorArr[i25].elementAt(i26)));
            }
            u16 = v.u(u16, aSN1EncodableVector14);
        }
        ASN1EncodableVector u17 = v.u(aSN1EncodableVector14, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector15 = new ASN1EncodableVector();
        for (int i27 = 0; i27 < vectorArr2.length; i27++) {
            for (int i28 = 0; i28 < vectorArr2[i27].size(); i28++) {
                u17.add(new DEROctetString((byte[]) vectorArr2[i27].elementAt(i28)));
            }
            u17 = v.u(u17, aSN1EncodableVector15);
        }
        ASN1EncodableVector u18 = v.u(aSN1EncodableVector15, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector16 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector17 = new ASN1EncodableVector();
        for (int i29 = 0; i29 < vectorArr3.length; i29++) {
            for (int i30 = 0; i30 < vectorArr3[i29].length; i30++) {
                for (int i31 = 0; i31 < vectorArr3[i29][i30].size(); i31++) {
                    u18.add(new DEROctetString((byte[]) vectorArr3[i29][i30].elementAt(i31)));
                }
                u18 = v.u(u18, aSN1EncodableVector16);
            }
            aSN1EncodableVector16 = v.u(aSN1EncodableVector16, aSN1EncodableVector17);
        }
        ASN1EncodableVector u19 = v.u(aSN1EncodableVector17, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector18 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector19 = new ASN1EncodableVector();
        for (int i32 = 0; i32 < vectorArr4.length; i32++) {
            for (int i33 = 0; i33 < vectorArr4[i32].length; i33++) {
                for (int i34 = 0; i34 < vectorArr4[i32][i33].size(); i34++) {
                    u19.add(new DEROctetString((byte[]) vectorArr4[i32][i33].elementAt(i34)));
                }
                u19 = v.u(u19, aSN1EncodableVector18);
            }
            aSN1EncodableVector18 = v.u(aSN1EncodableVector18, aSN1EncodableVector19);
        }
        ASN1EncodableVector u20 = v.u(aSN1EncodableVector19, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector20 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector21 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector22 = new ASN1EncodableVector();
        for (int i35 = 0; i35 < gMSSLeafArr.length; i35++) {
            aSN1EncodableVector20.add(new DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte = gMSSLeafArr[i35].getStatByte();
            aSN1EncodableVector21.add(new DEROctetString(statByte[0]));
            aSN1EncodableVector21.add(new DEROctetString(statByte[1]));
            aSN1EncodableVector21.add(new DEROctetString(statByte[2]));
            aSN1EncodableVector21.add(new DEROctetString(statByte[3]));
            aSN1EncodableVector20.add(new DERSequence(aSN1EncodableVector21));
            aSN1EncodableVector21 = new ASN1EncodableVector();
            int[] statInt = gMSSLeafArr[i35].getStatInt();
            aSN1EncodableVector22.add(new ASN1Integer(statInt[0]));
            aSN1EncodableVector22.add(new ASN1Integer(statInt[1]));
            aSN1EncodableVector22.add(new ASN1Integer(statInt[2]));
            aSN1EncodableVector22.add(new ASN1Integer(statInt[3]));
            aSN1EncodableVector20.add(new DERSequence(aSN1EncodableVector22));
            aSN1EncodableVector22 = new ASN1EncodableVector();
            aSN1EncodableVector20 = v.u(aSN1EncodableVector20, u20);
        }
        ASN1EncodableVector u21 = v.u(u20, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector23 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector24 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector25 = new ASN1EncodableVector();
        for (int i36 = 0; i36 < gMSSLeafArr2.length; i36++) {
            aSN1EncodableVector23.add(new DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte2 = gMSSLeafArr2[i36].getStatByte();
            aSN1EncodableVector24.add(new DEROctetString(statByte2[0]));
            aSN1EncodableVector24.add(new DEROctetString(statByte2[1]));
            aSN1EncodableVector24.add(new DEROctetString(statByte2[2]));
            aSN1EncodableVector24.add(new DEROctetString(statByte2[3]));
            aSN1EncodableVector23.add(new DERSequence(aSN1EncodableVector24));
            aSN1EncodableVector24 = new ASN1EncodableVector();
            int[] statInt2 = gMSSLeafArr2[i36].getStatInt();
            aSN1EncodableVector25.add(new ASN1Integer(statInt2[0]));
            aSN1EncodableVector25.add(new ASN1Integer(statInt2[1]));
            aSN1EncodableVector25.add(new ASN1Integer(statInt2[2]));
            aSN1EncodableVector25.add(new ASN1Integer(statInt2[3]));
            aSN1EncodableVector23.add(new DERSequence(aSN1EncodableVector25));
            aSN1EncodableVector25 = new ASN1EncodableVector();
            aSN1EncodableVector23 = v.u(aSN1EncodableVector23, u21);
        }
        ASN1EncodableVector u22 = v.u(u21, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector26 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector27 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector28 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector29 = aSN1EncodableVector;
        for (int i37 = 0; i37 < gMSSLeafArr3.length; i37++) {
            aSN1EncodableVector26.add(new DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte3 = gMSSLeafArr3[i37].getStatByte();
            aSN1EncodableVector27.add(new DEROctetString(statByte3[0]));
            aSN1EncodableVector27.add(new DEROctetString(statByte3[1]));
            aSN1EncodableVector27.add(new DEROctetString(statByte3[2]));
            aSN1EncodableVector27.add(new DEROctetString(statByte3[3]));
            aSN1EncodableVector26.add(new DERSequence(aSN1EncodableVector27));
            aSN1EncodableVector27 = new ASN1EncodableVector();
            int[] statInt3 = gMSSLeafArr3[i37].getStatInt();
            aSN1EncodableVector28.add(new ASN1Integer(statInt3[0]));
            aSN1EncodableVector28.add(new ASN1Integer(statInt3[1]));
            aSN1EncodableVector28.add(new ASN1Integer(statInt3[2]));
            aSN1EncodableVector28.add(new ASN1Integer(statInt3[3]));
            aSN1EncodableVector26.add(new DERSequence(aSN1EncodableVector28));
            aSN1EncodableVector28 = new ASN1EncodableVector();
            aSN1EncodableVector26 = v.u(aSN1EncodableVector26, u22);
        }
        ASN1EncodableVector u23 = v.u(u22, aSN1EncodableVector29);
        for (int i38 : iArr2) {
            u23.add(new ASN1Integer(i38));
        }
        ASN1EncodableVector u24 = v.u(u23, aSN1EncodableVector29);
        for (byte[] bArr10 : bArr6) {
            u24.add(new DEROctetString(bArr10));
        }
        ASN1EncodableVector u25 = v.u(u24, aSN1EncodableVector29);
        ASN1EncodableVector aSN1EncodableVector30 = new ASN1EncodableVector();
        new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector31 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector32 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector33 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector34 = new ASN1EncodableVector();
        int i39 = 0;
        while (i39 < gMSSRootCalcArr.length) {
            aSN1EncodableVector30.add(new DERSequence(algorithmIdentifierArr[0]));
            new ASN1EncodableVector();
            int i40 = gMSSRootCalcArr[i39].getStatInt()[0];
            int i41 = gMSSRootCalcArr[i39].getStatInt()[7];
            aSN1EncodableVector31.add(new DEROctetString(gMSSRootCalcArr[i39].getStatByte()[0]));
            int i42 = 0;
            while (i42 < i40) {
                i42++;
                aSN1EncodableVector31.add(new DEROctetString(gMSSRootCalcArr[i39].getStatByte()[i42]));
            }
            for (int i43 = 0; i43 < i41; i43++) {
                aSN1EncodableVector31.add(new DEROctetString(gMSSRootCalcArr[i39].getStatByte()[i40 + 1 + i43]));
            }
            ASN1EncodableVector u26 = v.u(aSN1EncodableVector31, aSN1EncodableVector30);
            aSN1EncodableVector32.add(new ASN1Integer(i40));
            aSN1EncodableVector32.add(new ASN1Integer(gMSSRootCalcArr[i39].getStatInt()[1]));
            aSN1EncodableVector32.add(new ASN1Integer(gMSSRootCalcArr[i39].getStatInt()[2]));
            aSN1EncodableVector32.add(new ASN1Integer(gMSSRootCalcArr[i39].getStatInt()[3]));
            aSN1EncodableVector32.add(new ASN1Integer(gMSSRootCalcArr[i39].getStatInt()[4]));
            aSN1EncodableVector32.add(new ASN1Integer(gMSSRootCalcArr[i39].getStatInt()[5]));
            aSN1EncodableVector32.add(new ASN1Integer(gMSSRootCalcArr[i39].getStatInt()[6]));
            aSN1EncodableVector32.add(new ASN1Integer(i41));
            for (int i44 = 0; i44 < i40; i44++) {
                aSN1EncodableVector32.add(new ASN1Integer(gMSSRootCalcArr[i39].getStatInt()[i44 + 8]));
            }
            for (int i45 = 0; i45 < i41; i45++) {
                aSN1EncodableVector32.add(new ASN1Integer(gMSSRootCalcArr[i39].getStatInt()[i40 + 8 + i45]));
            }
            ASN1EncodableVector u27 = v.u(aSN1EncodableVector32, aSN1EncodableVector30);
            ASN1EncodableVector aSN1EncodableVector35 = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector36 = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector37 = new ASN1EncodableVector();
            if (gMSSRootCalcArr[i39].getTreehash() != null) {
                int i46 = 0;
                while (i46 < gMSSRootCalcArr[i39].getTreehash().length) {
                    aSN1EncodableVector35.add(new DERSequence(algorithmIdentifierArr[0]));
                    int i47 = gMSSRootCalcArr[i39].getTreehash()[i46].getStatInt()[1];
                    ASN1EncodableVector aSN1EncodableVector38 = u26;
                    aSN1EncodableVector36.add(new DEROctetString(gMSSRootCalcArr[i39].getTreehash()[i46].getStatByte()[0]));
                    aSN1EncodableVector36.add(new DEROctetString(gMSSRootCalcArr[i39].getTreehash()[i46].getStatByte()[1]));
                    aSN1EncodableVector36.add(new DEROctetString(gMSSRootCalcArr[i39].getTreehash()[i46].getStatByte()[2]));
                    int i48 = 0;
                    while (i48 < i47) {
                        aSN1EncodableVector36.add(new DEROctetString(gMSSRootCalcArr[i39].getTreehash()[i46].getStatByte()[i48 + 3]));
                        i48++;
                        u27 = u27;
                    }
                    ASN1EncodableVector aSN1EncodableVector39 = u27;
                    aSN1EncodableVector36 = v.u(aSN1EncodableVector36, aSN1EncodableVector35);
                    ASN1EncodableVector aSN1EncodableVector40 = aSN1EncodableVector29;
                    aSN1EncodableVector37.add(new ASN1Integer(gMSSRootCalcArr[i39].getTreehash()[i46].getStatInt()[0]));
                    aSN1EncodableVector37.add(new ASN1Integer(i47));
                    aSN1EncodableVector37.add(new ASN1Integer(gMSSRootCalcArr[i39].getTreehash()[i46].getStatInt()[2]));
                    aSN1EncodableVector37.add(new ASN1Integer(gMSSRootCalcArr[i39].getTreehash()[i46].getStatInt()[3]));
                    aSN1EncodableVector37.add(new ASN1Integer(gMSSRootCalcArr[i39].getTreehash()[i46].getStatInt()[4]));
                    aSN1EncodableVector37.add(new ASN1Integer(gMSSRootCalcArr[i39].getTreehash()[i46].getStatInt()[5]));
                    int i49 = 0;
                    while (i49 < i47) {
                        aSN1EncodableVector37.add(new ASN1Integer(gMSSRootCalcArr[i39].getTreehash()[i46].getStatInt()[i49 + 6]));
                        i49++;
                        i47 = i47;
                        aSN1EncodableVector40 = aSN1EncodableVector40;
                    }
                    aSN1EncodableVector37 = v.u(aSN1EncodableVector37, aSN1EncodableVector35);
                    aSN1EncodableVector35 = v.u(aSN1EncodableVector35, aSN1EncodableVector33);
                    i46++;
                    u26 = aSN1EncodableVector38;
                    u27 = aSN1EncodableVector39;
                    aSN1EncodableVector29 = aSN1EncodableVector40;
                }
            }
            ASN1EncodableVector aSN1EncodableVector41 = u26;
            ASN1EncodableVector aSN1EncodableVector42 = u27;
            ASN1EncodableVector aSN1EncodableVector43 = aSN1EncodableVector29;
            aSN1EncodableVector33 = v.u(aSN1EncodableVector33, aSN1EncodableVector30);
            ASN1EncodableVector aSN1EncodableVector44 = new ASN1EncodableVector();
            if (gMSSRootCalcArr[i39].getRetain() != null) {
                for (int i50 = 0; i50 < gMSSRootCalcArr[i39].getRetain().length; i50++) {
                    for (int i51 = 0; i51 < gMSSRootCalcArr[i39].getRetain()[i50].size(); i51++) {
                        aSN1EncodableVector44.add(new DEROctetString((byte[]) gMSSRootCalcArr[i39].getRetain()[i50].elementAt(i51)));
                    }
                    aSN1EncodableVector44 = v.u(aSN1EncodableVector44, aSN1EncodableVector34);
                }
            }
            aSN1EncodableVector34 = v.u(aSN1EncodableVector34, aSN1EncodableVector30);
            aSN1EncodableVector30 = v.u(aSN1EncodableVector30, u25);
            i39++;
            aSN1EncodableVector31 = aSN1EncodableVector41;
            aSN1EncodableVector32 = aSN1EncodableVector42;
            aSN1EncodableVector29 = aSN1EncodableVector43;
        }
        ASN1EncodableVector aSN1EncodableVector45 = aSN1EncodableVector29;
        ASN1EncodableVector u28 = v.u(u25, aSN1EncodableVector45);
        for (byte[] bArr11 : bArr7) {
            u28.add(new DEROctetString(bArr11));
        }
        ASN1EncodableVector u29 = v.u(u28, aSN1EncodableVector45);
        ASN1EncodableVector aSN1EncodableVector46 = new ASN1EncodableVector();
        new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector47 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector48 = new ASN1EncodableVector();
        for (int i52 = 0; i52 < gMSSRootSigArr.length; i52++) {
            aSN1EncodableVector46.add(new DERSequence(algorithmIdentifierArr[0]));
            new ASN1EncodableVector();
            aSN1EncodableVector47.add(new DEROctetString(gMSSRootSigArr[i52].getStatByte()[0]));
            aSN1EncodableVector47.add(new DEROctetString(gMSSRootSigArr[i52].getStatByte()[1]));
            aSN1EncodableVector47.add(new DEROctetString(gMSSRootSigArr[i52].getStatByte()[2]));
            aSN1EncodableVector47.add(new DEROctetString(gMSSRootSigArr[i52].getStatByte()[3]));
            aSN1EncodableVector47.add(new DEROctetString(gMSSRootSigArr[i52].getStatByte()[4]));
            aSN1EncodableVector46.add(new DERSequence(aSN1EncodableVector47));
            aSN1EncodableVector47 = new ASN1EncodableVector();
            aSN1EncodableVector48.add(new ASN1Integer(gMSSRootSigArr[i52].getStatInt()[0]));
            aSN1EncodableVector48.add(new ASN1Integer(gMSSRootSigArr[i52].getStatInt()[1]));
            aSN1EncodableVector48.add(new ASN1Integer(gMSSRootSigArr[i52].getStatInt()[2]));
            aSN1EncodableVector48.add(new ASN1Integer(gMSSRootSigArr[i52].getStatInt()[3]));
            aSN1EncodableVector48.add(new ASN1Integer(gMSSRootSigArr[i52].getStatInt()[4]));
            aSN1EncodableVector48.add(new ASN1Integer(gMSSRootSigArr[i52].getStatInt()[5]));
            aSN1EncodableVector48.add(new ASN1Integer(gMSSRootSigArr[i52].getStatInt()[6]));
            aSN1EncodableVector48.add(new ASN1Integer(gMSSRootSigArr[i52].getStatInt()[7]));
            aSN1EncodableVector48.add(new ASN1Integer(gMSSRootSigArr[i52].getStatInt()[8]));
            aSN1EncodableVector46.add(new DERSequence(aSN1EncodableVector48));
            aSN1EncodableVector48 = new ASN1EncodableVector();
            aSN1EncodableVector46 = v.u(aSN1EncodableVector46, u29);
        }
        ASN1EncodableVector u30 = v.u(u29, aSN1EncodableVector45);
        ASN1EncodableVector aSN1EncodableVector49 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector50 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector51 = new ASN1EncodableVector();
        for (int i53 = 0; i53 < gMSSParameters.getHeightOfTrees().length; i53++) {
            aSN1EncodableVector49.add(new ASN1Integer(gMSSParameters.getHeightOfTrees()[i53]));
            aSN1EncodableVector50.add(new ASN1Integer(gMSSParameters.getWinternitzParameter()[i53]));
            aSN1EncodableVector51.add(new ASN1Integer(gMSSParameters.getK()[i53]));
        }
        u30.add(new ASN1Integer(gMSSParameters.getNumOfLayers()));
        u30.add(new DERSequence(aSN1EncodableVector49));
        u30.add(new DERSequence(aSN1EncodableVector50));
        u30.add(new DERSequence(aSN1EncodableVector51));
        ASN1EncodableVector u31 = v.u(u30, aSN1EncodableVector45);
        for (AlgorithmIdentifier algorithmIdentifier : algorithmIdentifierArr) {
            u31.add(algorithmIdentifier);
        }
        aSN1EncodableVector45.add(new DERSequence(u31));
        return new DERSequence(aSN1EncodableVector45);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.primitive;
    }

    public GMSSPrivateKey(int[] iArr, byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, byte[][][] bArr5, GMSSLeaf[] gMSSLeafArr, GMSSLeaf[] gMSSLeafArr2, GMSSLeaf[] gMSSLeafArr3, int[] iArr2, byte[][] bArr6, GMSSRootCalc[] gMSSRootCalcArr, byte[][] bArr7, GMSSRootSig[] gMSSRootSigArr, GMSSParameters gMSSParameters, AlgorithmIdentifier algorithmIdentifier) {
        this.primitive = encode(iArr, bArr, bArr2, bArr3, bArr4, bArr5, treehashArr, treehashArr2, vectorArr, vectorArr2, vectorArr3, vectorArr4, gMSSLeafArr, gMSSLeafArr2, gMSSLeafArr3, iArr2, bArr6, gMSSRootCalcArr, bArr7, gMSSRootSigArr, gMSSParameters, new AlgorithmIdentifier[]{algorithmIdentifier});
    }
}
