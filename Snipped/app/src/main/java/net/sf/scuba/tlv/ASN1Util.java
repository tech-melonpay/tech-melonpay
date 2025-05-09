package net.sf.scuba.tlv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.util.Hex;

/* loaded from: classes2.dex */
class ASN1Util implements ASN1Constants {
    private static final Logger LOGGER = Logger.getLogger("net.sf.scuba.tlv");
    private static final String SDF = "yyMMddhhmmss'Z'";

    private ASN1Util() {
    }

    public static Object interpretPrimitiveValue(int i, byte[] bArr) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(SDF);
        if (TLVUtil.getTagClass(i) != 0) {
            return bArr;
        }
        if (i != 12 && i != 30 && i != 19 && i != 20 && i != 22) {
            if (i != 23) {
                switch (i) {
                }
                return bArr;
            }
            try {
                return simpleDateFormat.parse(new String(bArr));
            } catch (ParseException e10) {
                LOGGER.log(Level.WARNING, "Parse exception parsing UTC time", (Throwable) e10);
                return bArr;
            }
        }
        return new String(bArr);
    }

    public static String tagToString(int i) {
        if (TLVUtil.getTagClass(i) != 0) {
            return "'0x" + Hex.intToHexString(i) + "'";
        }
        if (TLVUtil.isPrimitive(i)) {
            int i9 = i & 31;
            if (i9 == 9) {
                return "REAL";
            }
            if (i9 == 12) {
                return "UTF_STRING";
            }
            if (i9 == 30) {
                return "BMP_STRING";
            }
            if (i9 == 19) {
                return "PRINTABLE_STRING";
            }
            if (i9 == 20) {
                return "T61_STRING";
            }
            switch (i9) {
                case 1:
                    return "BOOLEAN";
                case 2:
                    return "INTEGER";
                case 3:
                    return "BIT_STRING";
                case 4:
                    return "OCTET_STRING";
                case 5:
                    return "NULL";
                case 6:
                    return "OBJECT_IDENTIFIER";
                default:
                    switch (i9) {
                        case 22:
                            return "IA5_STRING";
                        case 23:
                            return "UTC_TIME";
                        case 24:
                            return "GENERAL_TIME";
                        default:
                            switch (i9) {
                                case 26:
                                    return "VISIBLE_STRING";
                                case 27:
                                    return "GENERAL_STRING";
                                case 28:
                                    return "UNIVERSAL_STRING";
                            }
                    }
            }
        }
        int i10 = i & 31;
        if (i10 == 10) {
            return "ENUMERATED";
        }
        if (i10 == 16) {
            return "SEQUENCE";
        }
        if (i10 == 17) {
            return "SET";
        }
        return "'0x" + Hex.intToHexString(i) + "'";
    }
}
