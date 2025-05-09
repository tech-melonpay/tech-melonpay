package org.bouncycastle.asn1.util;

import C.v;
import androidx.camera.core.impl.utils.a;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1ApplicationSpecific;
import org.bouncycastle.asn1.ASN1BMPString;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1External;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1GraphicString;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1NumericString;
import org.bouncycastle.asn1.ASN1ObjectDescriptor;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1PrintableString;
import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1T61String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.ASN1VideotexString;
import org.bouncycastle.asn1.ASN1VisibleString;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DLBitString;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes2.dex */
public class ASN1Dump {
    private static final int SAMPLE_SIZE = 32;
    private static final String TAB = "    ";

    public static void _dumpAsString(String str, boolean z10, ASN1Primitive aSN1Primitive, StringBuffer stringBuffer) {
        StringBuilder s10;
        ASN1Primitive externalContent;
        String string;
        BigInteger value;
        String dumpBinaryDataAsString;
        String id;
        StringBuilder r8;
        int length;
        String lineSeparator = Strings.lineSeparator();
        if (aSN1Primitive instanceof ASN1Null) {
            stringBuffer.append(str);
            stringBuffer.append("NULL");
            stringBuffer.append(lineSeparator);
            return;
        }
        int i = 0;
        if (aSN1Primitive instanceof ASN1Sequence) {
            stringBuffer.append(str);
            stringBuffer.append(aSN1Primitive instanceof BERSequence ? "BER Sequence" : aSN1Primitive instanceof DERSequence ? "DER Sequence" : "Sequence");
            stringBuffer.append(lineSeparator);
            ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1Primitive;
            String n10 = v.n(str, TAB);
            int size = aSN1Sequence.size();
            while (i < size) {
                _dumpAsString(n10, z10, aSN1Sequence.getObjectAt(i).toASN1Primitive(), stringBuffer);
                i++;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1Set) {
            stringBuffer.append(str);
            stringBuffer.append(aSN1Primitive instanceof BERSet ? "BER Set" : aSN1Primitive instanceof DERSet ? "DER Set" : "Set");
            stringBuffer.append(lineSeparator);
            ASN1Set aSN1Set = (ASN1Set) aSN1Primitive;
            String n11 = v.n(str, TAB);
            int size2 = aSN1Set.size();
            while (i < size2) {
                _dumpAsString(n11, z10, aSN1Set.getObjectAt(i).toASN1Primitive(), stringBuffer);
                i++;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1ApplicationSpecific) {
            externalContent = ((ASN1ApplicationSpecific) aSN1Primitive).getTaggedObject();
        } else {
            if (!(aSN1Primitive instanceof ASN1TaggedObject)) {
                if (aSN1Primitive instanceof ASN1OctetString) {
                    ASN1OctetString aSN1OctetString = (ASN1OctetString) aSN1Primitive;
                    if (aSN1Primitive instanceof BEROctetString) {
                        r8 = a.r(str, "BER Constructed Octet String[");
                        length = aSN1OctetString.getOctets().length;
                    } else {
                        r8 = a.r(str, "DER Octet String[");
                        length = aSN1OctetString.getOctets().length;
                    }
                    r8.append(length);
                    r8.append("] ");
                    stringBuffer.append(r8.toString());
                    if (z10) {
                        dumpBinaryDataAsString = dumpBinaryDataAsString(str, aSN1OctetString.getOctets());
                        stringBuffer.append(dumpBinaryDataAsString);
                        return;
                    }
                    stringBuffer.append(lineSeparator);
                    return;
                }
                if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
                    s10 = a.r(str, "ObjectIdentifier(");
                    id = ((ASN1ObjectIdentifier) aSN1Primitive).getId();
                } else {
                    if (!(aSN1Primitive instanceof ASN1RelativeOID)) {
                        if (aSN1Primitive instanceof ASN1Boolean) {
                            s10 = a.r(str, "Boolean(");
                            s10.append(((ASN1Boolean) aSN1Primitive).isTrue());
                        } else {
                            if (!(aSN1Primitive instanceof ASN1Integer)) {
                                if (aSN1Primitive instanceof ASN1BitString) {
                                    ASN1BitString aSN1BitString = (ASN1BitString) aSN1Primitive;
                                    byte[] bytes = aSN1BitString.getBytes();
                                    int padBits = aSN1BitString.getPadBits();
                                    StringBuilder r10 = a.r(str, aSN1BitString instanceof DERBitString ? "DER Bit String[" : aSN1BitString instanceof DLBitString ? "DL Bit String[" : "BER Bit String[");
                                    r10.append(bytes.length);
                                    r10.append(", ");
                                    r10.append(padBits);
                                    r10.append("] ");
                                    stringBuffer.append(r10.toString());
                                    if (z10) {
                                        dumpBinaryDataAsString = dumpBinaryDataAsString(str, bytes);
                                        stringBuffer.append(dumpBinaryDataAsString);
                                        return;
                                    }
                                    stringBuffer.append(lineSeparator);
                                    return;
                                }
                                if (aSN1Primitive instanceof ASN1IA5String) {
                                    s10 = a.r(str, "IA5String(");
                                    string = ((ASN1IA5String) aSN1Primitive).getString();
                                } else if (aSN1Primitive instanceof ASN1UTF8String) {
                                    s10 = a.r(str, "UTF8String(");
                                    string = ((ASN1UTF8String) aSN1Primitive).getString();
                                } else if (aSN1Primitive instanceof ASN1NumericString) {
                                    s10 = a.r(str, "NumericString(");
                                    string = ((ASN1NumericString) aSN1Primitive).getString();
                                } else if (aSN1Primitive instanceof ASN1PrintableString) {
                                    s10 = a.r(str, "PrintableString(");
                                    string = ((ASN1PrintableString) aSN1Primitive).getString();
                                } else if (aSN1Primitive instanceof ASN1VisibleString) {
                                    s10 = a.r(str, "VisibleString(");
                                    string = ((ASN1VisibleString) aSN1Primitive).getString();
                                } else if (aSN1Primitive instanceof ASN1BMPString) {
                                    s10 = a.r(str, "BMPString(");
                                    string = ((ASN1BMPString) aSN1Primitive).getString();
                                } else if (aSN1Primitive instanceof ASN1T61String) {
                                    s10 = a.r(str, "T61String(");
                                    string = ((ASN1T61String) aSN1Primitive).getString();
                                } else if (aSN1Primitive instanceof ASN1GraphicString) {
                                    s10 = a.r(str, "GraphicString(");
                                    string = ((ASN1GraphicString) aSN1Primitive).getString();
                                } else if (aSN1Primitive instanceof ASN1VideotexString) {
                                    s10 = a.r(str, "VideotexString(");
                                    string = ((ASN1VideotexString) aSN1Primitive).getString();
                                } else if (aSN1Primitive instanceof ASN1UTCTime) {
                                    s10 = a.r(str, "UTCTime(");
                                    string = ((ASN1UTCTime) aSN1Primitive).getTime();
                                } else if (aSN1Primitive instanceof ASN1GeneralizedTime) {
                                    s10 = a.r(str, "GeneralizedTime(");
                                    string = ((ASN1GeneralizedTime) aSN1Primitive).getTime();
                                } else if (aSN1Primitive instanceof ASN1Enumerated) {
                                    s10 = a.r(str, "DER Enumerated(");
                                    value = ((ASN1Enumerated) aSN1Primitive).getValue();
                                } else if (aSN1Primitive instanceof ASN1ObjectDescriptor) {
                                    s10 = a.r(str, "ObjectDescriptor(");
                                    string = ((ASN1ObjectDescriptor) aSN1Primitive).getBaseGraphicString().getString();
                                } else {
                                    if (!(aSN1Primitive instanceof ASN1External)) {
                                        s10 = v.s(str);
                                        s10.append(aSN1Primitive.toString());
                                        s10.append(lineSeparator);
                                        dumpBinaryDataAsString = s10.toString();
                                        stringBuffer.append(dumpBinaryDataAsString);
                                        return;
                                    }
                                    ASN1External aSN1External = (ASN1External) aSN1Primitive;
                                    stringBuffer.append(str + "External " + lineSeparator);
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(str);
                                    sb2.append(TAB);
                                    str = sb2.toString();
                                    if (aSN1External.getDirectReference() != null) {
                                        StringBuilder r11 = a.r(str, "Direct Reference: ");
                                        r11.append(aSN1External.getDirectReference().getId());
                                        r11.append(lineSeparator);
                                        stringBuffer.append(r11.toString());
                                    }
                                    if (aSN1External.getIndirectReference() != null) {
                                        StringBuilder r12 = a.r(str, "Indirect Reference: ");
                                        r12.append(aSN1External.getIndirectReference().toString());
                                        r12.append(lineSeparator);
                                        stringBuffer.append(r12.toString());
                                    }
                                    if (aSN1External.getDataValueDescriptor() != null) {
                                        _dumpAsString(str, z10, aSN1External.getDataValueDescriptor(), stringBuffer);
                                    }
                                    StringBuilder r13 = a.r(str, "Encoding: ");
                                    r13.append(aSN1External.getEncoding());
                                    r13.append(lineSeparator);
                                    stringBuffer.append(r13.toString());
                                    externalContent = aSN1External.getExternalContent();
                                }
                                s10.append(string);
                                s10.append(") ");
                                s10.append(lineSeparator);
                                dumpBinaryDataAsString = s10.toString();
                                stringBuffer.append(dumpBinaryDataAsString);
                                return;
                            }
                            s10 = a.r(str, "Integer(");
                            value = ((ASN1Integer) aSN1Primitive).getValue();
                            s10.append(value);
                        }
                        s10.append(")");
                        s10.append(lineSeparator);
                        dumpBinaryDataAsString = s10.toString();
                        stringBuffer.append(dumpBinaryDataAsString);
                        return;
                    }
                    s10 = a.r(str, "RelativeOID(");
                    id = ((ASN1RelativeOID) aSN1Primitive).getId();
                }
                s10.append(id);
                s10.append(")");
                s10.append(lineSeparator);
                dumpBinaryDataAsString = s10.toString();
                stringBuffer.append(dumpBinaryDataAsString);
                return;
            }
            stringBuffer.append(str);
            stringBuffer.append(aSN1Primitive instanceof BERTaggedObject ? "BER Tagged " : aSN1Primitive instanceof DERTaggedObject ? "DER Tagged " : "Tagged ");
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
            stringBuffer.append(ASN1Util.getTagText(aSN1TaggedObject));
            if (!aSN1TaggedObject.isExplicit()) {
                stringBuffer.append(" IMPLICIT ");
            }
            stringBuffer.append(lineSeparator);
            str = str + TAB;
            externalContent = aSN1TaggedObject.getBaseObject().toASN1Primitive();
        }
        _dumpAsString(str, z10, externalContent, stringBuffer);
    }

    private static String calculateAscString(byte[] bArr, int i, int i9) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = i; i10 != i + i9; i10++) {
            byte b9 = bArr[i10];
            if (b9 >= 32 && b9 <= 126) {
                stringBuffer.append((char) b9);
            }
        }
        return stringBuffer.toString();
    }

    public static String dumpAsString(Object obj) {
        return dumpAsString(obj, false);
    }

    private static String dumpBinaryDataAsString(String str, byte[] bArr) {
        String calculateAscString;
        String lineSeparator = Strings.lineSeparator();
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = str + TAB;
        stringBuffer.append(lineSeparator);
        for (int i = 0; i < bArr.length; i += 32) {
            int length = bArr.length - i;
            stringBuffer.append(str2);
            if (length > 32) {
                stringBuffer.append(Strings.fromByteArray(Hex.encode(bArr, i, 32)));
                stringBuffer.append(TAB);
                calculateAscString = calculateAscString(bArr, i, 32);
            } else {
                stringBuffer.append(Strings.fromByteArray(Hex.encode(bArr, i, bArr.length - i)));
                for (int length2 = bArr.length - i; length2 != 32; length2++) {
                    stringBuffer.append("  ");
                }
                stringBuffer.append(TAB);
                calculateAscString = calculateAscString(bArr, i, bArr.length - i);
            }
            stringBuffer.append(calculateAscString);
            stringBuffer.append(lineSeparator);
        }
        return stringBuffer.toString();
    }

    public static String dumpAsString(Object obj, boolean z10) {
        ASN1Primitive aSN1Primitive;
        if (obj instanceof ASN1Primitive) {
            aSN1Primitive = (ASN1Primitive) obj;
        } else {
            if (!(obj instanceof ASN1Encodable)) {
                return "unknown object type " + obj.toString();
            }
            aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
        }
        StringBuffer stringBuffer = new StringBuffer();
        _dumpAsString("", z10, aSN1Primitive, stringBuffer);
        return stringBuffer.toString();
    }
}
