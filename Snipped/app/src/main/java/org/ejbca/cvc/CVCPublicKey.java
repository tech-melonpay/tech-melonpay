package org.ejbca.cvc;

import java.io.IOException;
import java.security.PublicKey;

/* loaded from: classes3.dex */
public abstract class CVCPublicKey extends AbstractSequence implements PublicKey {
    private static final long serialVersionUID = 5330644668163139836L;

    public CVCPublicKey() {
        super(CVCTagEnum.PUBLIC_KEY);
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return getDEREncoded();
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public OIDField getObjectIdentifier() {
        return (OIDField) getSubfield(CVCTagEnum.OID);
    }

    public void setObjectIdentifier(OIDField oIDField) {
        addSubfield(oIDField, true);
    }
}
