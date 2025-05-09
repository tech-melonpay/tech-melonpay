package org.ejbca.cvc;

/* loaded from: classes3.dex */
public class CVCDiscretionaryDataTemplate extends AbstractSequence {
    private static CVCTagEnum[] allowedFields = {CVCTagEnum.OID, CVCTagEnum.ARBITRARY_DATA};
    private static final long serialVersionUID = 1;

    public CVCDiscretionaryDataTemplate() {
        super(CVCTagEnum.DISCRETIONARY_DATA_TEMPLATE);
    }

    @Override // org.ejbca.cvc.AbstractSequence
    public CVCTagEnum[] getAllowedFields() {
        return allowedFields;
    }

    public byte[] getExtensionData() {
        return ((ByteField) getSubfield(CVCTagEnum.ARBITRARY_DATA)).getData();
    }

    public String getObjectIdentifier() {
        return ((OIDField) getSubfield(CVCTagEnum.OID)).getValue();
    }

    public CVCDiscretionaryDataTemplate(OIDField oIDField, ByteField byteField) {
        this();
        addSubfield(oIDField);
        addSubfield(byteField);
    }

    public CVCDiscretionaryDataTemplate(String str, byte[] bArr) {
        this(new OIDField(str), new ByteField(CVCTagEnum.ARBITRARY_DATA, bArr));
    }
}
