package org.ejbca.cvc;

import C.v;

/* loaded from: classes3.dex */
public abstract class ReferenceField extends AbstractDataField {
    private static final long serialVersionUID = 1;
    private String country;
    private String mnemonic;
    private String sequence;

    public ReferenceField(CVCTagEnum cVCTagEnum, String str, String str2, String str3) {
        super(cVCTagEnum);
        this.country = null;
        this.mnemonic = null;
        this.sequence = null;
        if (str.length() != 2) {
            throw new IllegalArgumentException("Country code length must be 2, was " + str.length());
        }
        if (!isValidCountry(str)) {
            throw new IllegalArgumentException("Unknown country code: ".concat(str));
        }
        if (str2.length() == 0) {
            throw new IllegalArgumentException("Holder mnemonic too short, must have at least one character");
        }
        if (str2.length() > 9) {
            throw new IllegalArgumentException("Holder mnemonic too long, max=9, was " + str2.length());
        }
        if (str3.length() != 5) {
            throw new IllegalArgumentException("Sequence number must have length 5, was " + str3.length());
        }
        for (int i = 0; i < str3.length(); i++) {
            if (!Character.isLetterOrDigit(str3.charAt(i))) {
                throw new IllegalArgumentException("Sequence number can only contain alphanumerics: ".concat(str3));
            }
        }
        this.country = str;
        this.mnemonic = str2;
        this.sequence = str3;
    }

    private boolean isValidCountry(String str) {
        return okChar(str.charAt(0)) && okChar(str.charAt(1));
    }

    private boolean okChar(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    public String getConcatenated() {
        return this.country + this.mnemonic + this.sequence;
    }

    public String getCountry() {
        return this.country;
    }

    @Override // org.ejbca.cvc.AbstractDataField
    public byte[] getEncoded() {
        return getConcatenated().getBytes();
    }

    public String getMnemonic() {
        return this.mnemonic;
    }

    public String getSequence() {
        return this.sequence;
    }

    @Override // org.ejbca.cvc.AbstractDataField
    public String valueAsText() {
        return this.country + "/" + this.mnemonic + "/" + this.sequence;
    }

    public ReferenceField(CVCTagEnum cVCTagEnum, byte[] bArr) {
        super(cVCTagEnum);
        this.country = null;
        this.mnemonic = null;
        this.sequence = null;
        String str = new String(bArr);
        this.country = str.substring(0, 2);
        this.mnemonic = v.j(5, 2, str);
        this.sequence = str.substring(str.length() - 5);
    }
}
