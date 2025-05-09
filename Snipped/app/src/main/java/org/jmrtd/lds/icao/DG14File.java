package org.jmrtd.lds.icao;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DLSet;
import org.jmrtd.lds.ActiveAuthenticationInfo;
import org.jmrtd.lds.ChipAuthenticationInfo;
import org.jmrtd.lds.ChipAuthenticationPublicKeyInfo;
import org.jmrtd.lds.DataGroup;
import org.jmrtd.lds.SecurityInfo;
import org.jmrtd.lds.TerminalAuthenticationInfo;

/* loaded from: classes3.dex */
public class DG14File extends DataGroup {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -3536507558193769953L;
    private Set<SecurityInfo> securityInfos;

    public DG14File(Collection<SecurityInfo> collection) {
        super(110);
        if (collection == null) {
            throw new IllegalArgumentException("Null securityInfos");
        }
        this.securityInfos = new HashSet(collection);
    }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        DG14File dG14File = (DG14File) obj;
        Set<SecurityInfo> set = this.securityInfos;
        if (set == null) {
            return dG14File.securityInfos == null;
        }
        Set<SecurityInfo> set2 = dG14File.securityInfos;
        return set2 == null ? set == null : set.equals(set2);
    }

    @Deprecated
    public List<ActiveAuthenticationInfo> getActiveAuthenticationInfos() {
        ArrayList arrayList = new ArrayList();
        for (SecurityInfo securityInfo : this.securityInfos) {
            if (securityInfo instanceof ActiveAuthenticationInfo) {
                arrayList.add((ActiveAuthenticationInfo) securityInfo);
            }
        }
        return arrayList;
    }

    @Deprecated
    public List<ChipAuthenticationInfo> getChipAuthenticationInfos() {
        ArrayList arrayList = new ArrayList();
        for (SecurityInfo securityInfo : this.securityInfos) {
            if (securityInfo instanceof ChipAuthenticationInfo) {
                ChipAuthenticationInfo chipAuthenticationInfo = (ChipAuthenticationInfo) securityInfo;
                arrayList.add(chipAuthenticationInfo);
                if (chipAuthenticationInfo.getKeyId() == null) {
                    break;
                }
            }
        }
        return arrayList;
    }

    @Deprecated
    public List<ChipAuthenticationPublicKeyInfo> getChipAuthenticationPublicKeyInfos() {
        ArrayList arrayList = new ArrayList();
        for (SecurityInfo securityInfo : this.securityInfos) {
            if (securityInfo instanceof ChipAuthenticationPublicKeyInfo) {
                arrayList.add((ChipAuthenticationPublicKeyInfo) securityInfo);
            }
        }
        return arrayList;
    }

    public Collection<SecurityInfo> getSecurityInfos() {
        return this.securityInfos;
    }

    @Deprecated
    public List<TerminalAuthenticationInfo> getTerminalAuthenticationInfos() {
        ArrayList arrayList = new ArrayList();
        for (SecurityInfo securityInfo : this.securityInfos) {
            if (securityInfo instanceof TerminalAuthenticationInfo) {
                arrayList.add((TerminalAuthenticationInfo) securityInfo);
            }
        }
        return arrayList;
    }

    public int hashCode() {
        return (this.securityInfos.hashCode() * 5) + 41;
    }

    @Override // org.jmrtd.lds.AbstractTaggedLDSFile
    public void readContent(InputStream inputStream) {
        this.securityInfos = new HashSet();
        ASN1Set aSN1Set = (ASN1Set) new ASN1InputStream(inputStream).readObject();
        for (int i = 0; i < aSN1Set.size(); i++) {
            try {
                SecurityInfo securityInfo = SecurityInfo.getInstance(aSN1Set.getObjectAt(i).toASN1Primitive());
                if (securityInfo == null) {
                    LOGGER.warning("Skipping this unsupported SecurityInfo");
                } else {
                    this.securityInfos.add(securityInfo);
                }
            } catch (Exception e10) {
                LOGGER.log(Level.WARNING, "Skipping Security Info", (Throwable) e10);
            }
        }
    }

    @Override // org.jmrtd.lds.DataGroup, org.jmrtd.lds.AbstractTaggedLDSFile
    public String toString() {
        return "DG14File [" + this.securityInfos.toString() + "]";
    }

    @Override // org.jmrtd.lds.AbstractTaggedLDSFile
    public void writeContent(OutputStream outputStream) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        for (SecurityInfo securityInfo : this.securityInfos) {
            if (securityInfo != null) {
                aSN1EncodableVector.add(securityInfo.getDERObject());
            }
        }
        outputStream.write(new DLSet(aSN1EncodableVector).getEncoded(ASN1Encoding.DER));
    }

    public DG14File(InputStream inputStream) {
        super(110, inputStream);
    }
}
