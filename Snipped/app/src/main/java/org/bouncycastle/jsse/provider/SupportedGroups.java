package org.bouncycastle.jsse.provider;

import java.util.Vector;
import java.util.logging.Logger;
import org.bouncycastle.tls.NamedGroup;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: classes.dex */
abstract class SupportedGroups {
    private static final Logger LOG = Logger.getLogger(SupportedGroups.class.getName());
    private static final String PROPERTY_NAMED_GROUPS = "jdk.tls.namedGroups";
    private static final int[] defaultClientNamedGroups;
    private static final boolean provDisableChar2;
    private static final int[] provJdkTlsNamedGroups;

    static {
        boolean z10 = PropertyUtils.getBooleanSystemProperty("org.bouncycastle.jsse.ec.disableChar2", false) || PropertyUtils.getBooleanSystemProperty("org.bouncycastle.ec.disable_f2m", false);
        provDisableChar2 = z10;
        provJdkTlsNamedGroups = getJdkTlsNamedGroups(z10);
        defaultClientNamedGroups = new int[]{29, 23, 24, 25, 256, NamedGroup.ffdhe3072, NamedGroup.ffdhe4096};
    }

    public static Vector getClientSupportedGroups(TlsCrypto tlsCrypto, boolean z10, Vector vector) {
        int[] iArr = provJdkTlsNamedGroups;
        if (iArr == null) {
            iArr = defaultClientNamedGroups;
        }
        boolean contains = vector.contains(1);
        boolean contains2 = vector.contains(2);
        boolean contains3 = vector.contains(3);
        Vector vector2 = new Vector();
        for (int i : iArr) {
            if (((contains && NamedGroup.refersToASpecificFiniteField(i)) || ((contains2 && NamedGroup.refersToASpecificCurve(i)) || (contains3 && NamedGroup.refersToAnECDSACurve(i)))) && ((!z10 || FipsUtils.isFipsNamedGroup(i)) && tlsCrypto.hasNamedGroup(i))) {
                vector2.addElement(Integer.valueOf(i));
            }
        }
        return vector2;
    }

    private static int getDefaultDH(int i) {
        if (i <= 2048) {
            return 256;
        }
        if (i <= 3072) {
            return NamedGroup.ffdhe3072;
        }
        if (i <= 4096) {
            return NamedGroup.ffdhe4096;
        }
        if (i <= 6144) {
            return NamedGroup.ffdhe6144;
        }
        if (i <= 8192) {
            return NamedGroup.ffdhe8192;
        }
        return -1;
    }

    private static int getDefaultECDH(int i) {
        if (i <= 256) {
            return 23;
        }
        if (i <= 384) {
            return 24;
        }
        return i <= 521 ? 25 : -1;
    }

    private static int[] getJdkTlsNamedGroups(boolean z10) {
        Logger logger;
        StringBuilder sb2;
        String[] stringArraySystemProperty = PropertyUtils.getStringArraySystemProperty(PROPERTY_NAMED_GROUPS);
        if (stringArraySystemProperty == null) {
            return null;
        }
        int length = stringArraySystemProperty.length;
        int[] iArr = new int[length];
        int i = 0;
        for (String str : stringArraySystemProperty) {
            int byName = NamedGroup.getByName(Strings.toLowerCase(str));
            if (byName < 0) {
                logger = LOG;
                sb2 = new StringBuilder("'jdk.tls.namedGroups' contains unrecognised NamedGroup: ");
            } else if (z10 && NamedGroup.isChar2Curve(byName)) {
                logger = LOG;
                sb2 = new StringBuilder("'jdk.tls.namedGroups' contains disabled characteristic-2 curve: ");
            } else {
                iArr[i] = byName;
                i++;
            }
            sb2.append(str);
            logger.warning(sb2.toString());
        }
        if (i < length) {
            iArr = Arrays.copyOf(iArr, i);
        }
        if (iArr.length < 1) {
            LOG.severe("'jdk.tls.namedGroups' contained no usable NamedGroup values");
        }
        return iArr;
    }

    public static int getServerDefaultDH(boolean z10, int i) {
        int[] iArr = provJdkTlsNamedGroups;
        if (iArr == null) {
            return z10 ? FipsUtils.getFipsDefaultDH(i) : getDefaultDH(i);
        }
        for (int i9 : iArr) {
            if (NamedGroup.getFiniteFieldBits(i9) >= i && (!z10 || FipsUtils.isFipsNamedGroup(i9))) {
                return i9;
            }
        }
        return -1;
    }

    public static int getServerDefaultECDH(boolean z10, int i) {
        int[] iArr = provJdkTlsNamedGroups;
        if (iArr == null) {
            return z10 ? FipsUtils.getFipsDefaultECDH(i) : getDefaultECDH(i);
        }
        for (int i9 : iArr) {
            if (NamedGroup.getCurveBits(i9) >= i && (!z10 || FipsUtils.isFipsNamedGroup(i9))) {
                return i9;
            }
        }
        return -1;
    }

    public static int getServerMaximumNegotiableCurveBits(boolean z10, int[] iArr) {
        int[] iArr2 = provJdkTlsNamedGroups;
        int i = 0;
        if (iArr == null) {
            if (iArr2 == null) {
                return z10 ? FipsUtils.getFipsMaximumCurveBits() : provDisableChar2 ? NamedGroup.getMaximumPrimeCurveBits() : NamedGroup.getMaximumCurveBits();
            }
            int i9 = 0;
            while (i < iArr2.length) {
                int i10 = iArr2[i];
                if (!z10 || FipsUtils.isFipsNamedGroup(i10)) {
                    i9 = Math.max(i9, NamedGroup.getCurveBits(i10));
                }
                i++;
            }
            return i9;
        }
        int i11 = 0;
        while (i < iArr.length) {
            int i12 = iArr[i];
            if ((!provDisableChar2 || !NamedGroup.isChar2Curve(i12)) && ((iArr2 == null || Arrays.contains(iArr2, i12)) && (!z10 || FipsUtils.isFipsNamedGroup(i12)))) {
                i11 = Math.max(i11, NamedGroup.getCurveBits(i12));
            }
            i++;
        }
        return i11;
    }

    public static int getServerMaximumNegotiableFiniteFieldBits(boolean z10, int[] iArr) {
        int[] iArr2 = provJdkTlsNamedGroups;
        int i = 0;
        if (iArr == null) {
            if (iArr2 == null) {
                return z10 ? FipsUtils.getFipsMaximumFiniteFieldBits() : NamedGroup.getMaximumFiniteFieldBits();
            }
            int i9 = 0;
            while (i < iArr2.length) {
                int i10 = iArr2[i];
                if (!z10 || FipsUtils.isFipsNamedGroup(i10)) {
                    i9 = Math.max(i9, NamedGroup.getFiniteFieldBits(i10));
                }
                i++;
            }
            return i9;
        }
        int i11 = 0;
        while (i < iArr.length) {
            int i12 = iArr[i];
            if ((iArr2 == null || Arrays.contains(iArr2, i12)) && (!z10 || FipsUtils.isFipsNamedGroup(i12))) {
                i11 = Math.max(i11, NamedGroup.getFiniteFieldBits(i12));
            }
            i++;
        }
        return i11;
    }

    public static int getServerSelectedCurve(TlsCrypto tlsCrypto, boolean z10, int i, int[] iArr) {
        int[] iArr2 = provJdkTlsNamedGroups;
        for (int i9 : iArr) {
            if (!(provDisableChar2 && NamedGroup.isChar2Curve(i9)) && ((iArr2 == null || Arrays.contains(iArr2, i9)) && NamedGroup.getCurveBits(i9) >= i && ((!z10 || FipsUtils.isFipsNamedGroup(i9)) && tlsCrypto.hasNamedGroup(i9)))) {
                return i9;
            }
        }
        return -1;
    }

    public static int getServerSelectedFiniteField(TlsCrypto tlsCrypto, boolean z10, int i, int[] iArr) {
        int[] iArr2 = provJdkTlsNamedGroups;
        for (int i9 : iArr) {
            if ((iArr2 == null || Arrays.contains(iArr2, i9)) && NamedGroup.getFiniteFieldBits(i9) >= i && ((!z10 || FipsUtils.isFipsNamedGroup(i9)) && tlsCrypto.hasNamedGroup(i9))) {
                return i9;
            }
        }
        return -1;
    }
}
