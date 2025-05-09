package org.ejbca.cvc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.ejbca.cvc.exception.ConstructionException;

/* loaded from: classes3.dex */
public abstract class AbstractArray extends AbstractSequence {
    private static final long serialVersionUID = 1;
    private final CVCTagEnum allowedField;
    private final List<CVCObject> subfields;

    public AbstractArray(CVCTagEnum cVCTagEnum) {
        super(cVCTagEnum);
        this.subfields = new ArrayList();
        this.allowedField = getAllowedField();
    }

    @Override // org.ejbca.cvc.AbstractSequence
    public void addSubfield(CVCObject cVCObject) {
        if (cVCObject != null) {
            if (this.allowedField == cVCObject.getTag()) {
                cVCObject.setParent(this);
                this.subfields.add(cVCObject);
            } else {
                throw new ConstructionException("Field " + cVCObject.getTag() + " not allowed in " + getClass().getName());
            }
        }
    }

    public abstract CVCTagEnum getAllowedField();

    @Override // org.ejbca.cvc.AbstractSequence
    public final CVCTagEnum[] getAllowedFields() {
        return new CVCTagEnum[]{getAllowedField()};
    }

    @Override // org.ejbca.cvc.AbstractSequence
    public final CVCObject getOptionalSubfield(CVCTagEnum cVCTagEnum) {
        throw new IllegalStateException("Not applicable to AbstractArray");
    }

    @Override // org.ejbca.cvc.AbstractSequence
    public List<CVCObject> getOrderedSubfields() {
        return new ArrayList(this.subfields);
    }

    @Override // org.ejbca.cvc.AbstractSequence
    public final CVCObject getSubfield(CVCTagEnum cVCTagEnum) {
        throw new IllegalStateException("Not applicable to AbstractArray");
    }

    @Override // org.ejbca.cvc.AbstractSequence
    public Collection<CVCObject> getSubfields() {
        return new ArrayList(this.subfields);
    }
}
