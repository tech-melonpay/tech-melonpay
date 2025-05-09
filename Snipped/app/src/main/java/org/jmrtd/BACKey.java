package org.jmrtd;

import java.security.GeneralSecurityException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import s3.b;

/* loaded from: classes3.dex */
public class BACKey implements BACKeySpec {
    private static final String SDF = "yyMMdd";
    private static final long serialVersionUID = -1059774581180524710L;
    private String dateOfBirth;
    private String dateOfExpiry;
    private String documentNumber;

    public BACKey() {
    }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        BACKey bACKey = (BACKey) obj;
        return this.documentNumber.equals(bACKey.documentNumber) && this.dateOfBirth.equals(bACKey.dateOfBirth) && this.dateOfExpiry.equals(bACKey.dateOfExpiry);
    }

    @Override // org.jmrtd.AccessKeySpec
    public String getAlgorithm() {
        return "BAC";
    }

    @Override // org.jmrtd.BACKeySpec
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    @Override // org.jmrtd.BACKeySpec
    public String getDateOfExpiry() {
        return this.dateOfExpiry;
    }

    @Override // org.jmrtd.BACKeySpec
    public String getDocumentNumber() {
        return this.documentNumber;
    }

    @Override // org.jmrtd.AccessKeySpec
    public byte[] getKey() {
        try {
            return Util.computeKeySeed(this.documentNumber, this.dateOfBirth, this.dateOfExpiry, McElieceCCA2KeyGenParameterSpec.SHA1, true);
        } catch (GeneralSecurityException e10) {
            throw new IllegalArgumentException("Unexpected exception", e10);
        }
    }

    public int hashCode() {
        String str = this.documentNumber;
        int hashCode = (305 + (str == null ? 0 : str.hashCode())) * 61;
        String str2 = this.dateOfBirth;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 61;
        String str3 = this.dateOfExpiry;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public void setDateOfBirth(String str) {
        this.dateOfBirth = str;
    }

    public void setDateOfExpiry(String str) {
        this.dateOfExpiry = str;
    }

    public void setDocumentNumber(String str) {
        this.documentNumber = str;
    }

    public String toString() {
        return this.documentNumber + ", " + this.dateOfBirth + ", " + this.dateOfExpiry;
    }

    public BACKey(String str, Date date, Date date2) {
        this(str, toString(date), toString(date2));
    }

    private static synchronized String toString(Date date) {
        String format;
        synchronized (BACKey.class) {
            format = new SimpleDateFormat(SDF).format(date);
        }
        return format;
    }

    public BACKey(String str, String str2, String str3) {
        if (str == null) {
            throw new IllegalArgumentException("Illegal document number");
        }
        if (str2 != null && str2.length() == 6) {
            if (str3 != null && str3.length() == 6) {
                StringBuilder sb2 = new StringBuilder(str);
                while (sb2.length() < 9) {
                    sb2.append('<');
                }
                this.documentNumber = sb2.toString().trim();
                this.dateOfBirth = str2;
                this.dateOfExpiry = str3;
                return;
            }
            throw new IllegalArgumentException(b.j("Illegal date: ", str3));
        }
        throw new IllegalArgumentException(b.j("Illegal date: ", str2));
    }
}
