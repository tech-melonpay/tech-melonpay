package org.bouncycastle.tls;

import C.v;
import java.util.Vector;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.util.Strings;
import org.jmrtd.lds.iso19794.IrisImageInfo;

/* loaded from: classes3.dex */
public final class ProtocolVersion {
    private String name;
    private int version;
    public static final ProtocolVersion SSLv3 = new ProtocolVersion(768, "SSL 3.0");
    public static final ProtocolVersion TLSv10 = new ProtocolVersion(769, "TLS 1.0");
    public static final ProtocolVersion TLSv11 = new ProtocolVersion(770, "TLS 1.1");
    public static final ProtocolVersion TLSv12 = new ProtocolVersion(771, "TLS 1.2");
    public static final ProtocolVersion TLSv13 = new ProtocolVersion(772, "TLS 1.3");
    public static final ProtocolVersion DTLSv10 = new ProtocolVersion(65279, "DTLS 1.0");
    public static final ProtocolVersion DTLSv12 = new ProtocolVersion(65277, "DTLS 1.2");

    private ProtocolVersion(int i, String str) {
        this.version = i & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
        this.name = str;
    }

    private static void checkUint8(int i) {
        if (!TlsUtils.isValidUint8(i)) {
            throw new IllegalArgumentException("'versionOctet' is not a valid octet");
        }
    }

    public static boolean contains(ProtocolVersion[] protocolVersionArr, ProtocolVersion protocolVersion) {
        if (protocolVersionArr != null && protocolVersion != null) {
            for (ProtocolVersion protocolVersion2 : protocolVersionArr) {
                if (protocolVersion.equals(protocolVersion2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ProtocolVersion get(int i, int i9) {
        String str;
        if (i != 3) {
            if (i == 254) {
                switch (i9) {
                    case 253:
                        return DTLSv12;
                    case IrisImageInfo.IMAGE_QUAL_UNDEF /* 254 */:
                        throw new IllegalArgumentException("{0xFE, 0xFE} is a reserved protocol version");
                    case 255:
                        return DTLSv10;
                    default:
                        str = "DTLS";
                        break;
                }
            } else {
                str = "UNKNOWN";
            }
        } else {
            if (i9 == 0) {
                return SSLv3;
            }
            if (i9 == 1) {
                return TLSv10;
            }
            if (i9 == 2) {
                return TLSv11;
            }
            if (i9 == 3) {
                return TLSv12;
            }
            if (i9 == 4) {
                return TLSv13;
            }
            str = "TLS";
        }
        return getUnknownVersion(i, i9, str);
    }

    public static ProtocolVersion getEarliestDTLS(ProtocolVersion[] protocolVersionArr) {
        ProtocolVersion protocolVersion = null;
        if (protocolVersionArr != null) {
            for (ProtocolVersion protocolVersion2 : protocolVersionArr) {
                if (protocolVersion2 != null && protocolVersion2.isDTLS() && (protocolVersion == null || protocolVersion2.getMinorVersion() > protocolVersion.getMinorVersion())) {
                    protocolVersion = protocolVersion2;
                }
            }
        }
        return protocolVersion;
    }

    public static ProtocolVersion getEarliestTLS(ProtocolVersion[] protocolVersionArr) {
        ProtocolVersion protocolVersion = null;
        if (protocolVersionArr != null) {
            for (ProtocolVersion protocolVersion2 : protocolVersionArr) {
                if (protocolVersion2 != null && protocolVersion2.isTLS() && (protocolVersion == null || protocolVersion2.getMinorVersion() < protocolVersion.getMinorVersion())) {
                    protocolVersion = protocolVersion2;
                }
            }
        }
        return protocolVersion;
    }

    public static ProtocolVersion getLatestDTLS(ProtocolVersion[] protocolVersionArr) {
        ProtocolVersion protocolVersion = null;
        if (protocolVersionArr != null) {
            for (ProtocolVersion protocolVersion2 : protocolVersionArr) {
                if (protocolVersion2 != null && protocolVersion2.isDTLS() && (protocolVersion == null || protocolVersion2.getMinorVersion() < protocolVersion.getMinorVersion())) {
                    protocolVersion = protocolVersion2;
                }
            }
        }
        return protocolVersion;
    }

    public static ProtocolVersion getLatestTLS(ProtocolVersion[] protocolVersionArr) {
        ProtocolVersion protocolVersion = null;
        if (protocolVersionArr != null) {
            for (ProtocolVersion protocolVersion2 : protocolVersionArr) {
                if (protocolVersion2 != null && protocolVersion2.isTLS() && (protocolVersion == null || protocolVersion2.getMinorVersion() > protocolVersion.getMinorVersion())) {
                    protocolVersion = protocolVersion2;
                }
            }
        }
        return protocolVersion;
    }

    private static ProtocolVersion getUnknownVersion(int i, int i9, String str) {
        checkUint8(i);
        checkUint8(i9);
        int i10 = (i << 8) | i9;
        return new ProtocolVersion(i10, v.p(str, " 0x", Strings.toUpperCase(Integer.toHexString(65536 | i10).substring(1))));
    }

    public ProtocolVersion[] downTo(ProtocolVersion protocolVersion) {
        if (!isEqualOrLaterVersionOf(protocolVersion)) {
            throw new IllegalArgumentException("'min' must be an equal or earlier version of this one");
        }
        Vector vector = new Vector();
        vector.addElement(this);
        ProtocolVersion protocolVersion2 = this;
        while (!protocolVersion2.equals(protocolVersion)) {
            protocolVersion2 = protocolVersion2.getPreviousVersion();
            vector.addElement(protocolVersion2);
        }
        ProtocolVersion[] protocolVersionArr = new ProtocolVersion[vector.size()];
        for (int i = 0; i < vector.size(); i++) {
            protocolVersionArr[i] = (ProtocolVersion) vector.elementAt(i);
        }
        return protocolVersionArr;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ProtocolVersion) && equals((ProtocolVersion) obj));
    }

    public ProtocolVersion getEquivalentTLSVersion() {
        int majorVersion = getMajorVersion();
        if (majorVersion == 3) {
            return this;
        }
        if (majorVersion != 254) {
            return null;
        }
        int minorVersion = getMinorVersion();
        if (minorVersion == 253) {
            return TLSv12;
        }
        if (minorVersion != 255) {
            return null;
        }
        return TLSv11;
    }

    public int getFullVersion() {
        return this.version;
    }

    public int getMajorVersion() {
        return this.version >> 8;
    }

    public int getMinorVersion() {
        return this.version & 255;
    }

    public String getName() {
        return this.name;
    }

    public ProtocolVersion getNextVersion() {
        int i;
        int majorVersion = getMajorVersion();
        int minorVersion = getMinorVersion();
        if (majorVersion != 3) {
            if (majorVersion != 254 || minorVersion == 0) {
                return null;
            }
            if (minorVersion == 255) {
                return DTLSv12;
            }
            i = minorVersion - 1;
        } else {
            if (minorVersion == 255) {
                return null;
            }
            i = minorVersion + 1;
        }
        return get(majorVersion, i);
    }

    public ProtocolVersion getPreviousVersion() {
        int i;
        int majorVersion = getMajorVersion();
        int minorVersion = getMinorVersion();
        if (majorVersion != 3) {
            if (majorVersion != 254) {
                return null;
            }
            if (minorVersion == 253) {
                return DTLSv10;
            }
            if (minorVersion == 255) {
                return null;
            }
            i = minorVersion + 1;
        } else {
            if (minorVersion == 0) {
                return null;
            }
            i = minorVersion - 1;
        }
        return get(majorVersion, i);
    }

    public int hashCode() {
        return this.version;
    }

    public boolean isDTLS() {
        return getMajorVersion() == 254;
    }

    public boolean isEarlierVersionOf(ProtocolVersion protocolVersion) {
        if (protocolVersion == null || getMajorVersion() != protocolVersion.getMajorVersion()) {
            return false;
        }
        int minorVersion = getMinorVersion() - protocolVersion.getMinorVersion();
        if (isDTLS()) {
            if (minorVersion <= 0) {
                return false;
            }
        } else if (minorVersion >= 0) {
            return false;
        }
        return true;
    }

    public boolean isEqualOrEarlierVersionOf(ProtocolVersion protocolVersion) {
        if (protocolVersion == null || getMajorVersion() != protocolVersion.getMajorVersion()) {
            return false;
        }
        int minorVersion = getMinorVersion() - protocolVersion.getMinorVersion();
        if (isDTLS()) {
            if (minorVersion < 0) {
                return false;
            }
        } else if (minorVersion > 0) {
            return false;
        }
        return true;
    }

    public boolean isEqualOrLaterVersionOf(ProtocolVersion protocolVersion) {
        if (protocolVersion == null || getMajorVersion() != protocolVersion.getMajorVersion()) {
            return false;
        }
        int minorVersion = getMinorVersion() - protocolVersion.getMinorVersion();
        if (isDTLS()) {
            if (minorVersion > 0) {
                return false;
            }
        } else if (minorVersion < 0) {
            return false;
        }
        return true;
    }

    public boolean isLaterVersionOf(ProtocolVersion protocolVersion) {
        if (protocolVersion == null || getMajorVersion() != protocolVersion.getMajorVersion()) {
            return false;
        }
        int minorVersion = getMinorVersion() - protocolVersion.getMinorVersion();
        if (isDTLS()) {
            if (minorVersion >= 0) {
                return false;
            }
        } else if (minorVersion <= 0) {
            return false;
        }
        return true;
    }

    public boolean isTLS() {
        return getMajorVersion() == 3;
    }

    public ProtocolVersion[] only() {
        return new ProtocolVersion[]{this};
    }

    public String toString() {
        return this.name;
    }

    public boolean equals(ProtocolVersion protocolVersion) {
        return protocolVersion != null && this.version == protocolVersion.version;
    }
}
