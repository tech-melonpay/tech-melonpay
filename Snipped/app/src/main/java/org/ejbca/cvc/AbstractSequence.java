package org.ejbca.cvc;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.ejbca.cvc.exception.ConstructionException;

/* loaded from: classes3.dex */
public abstract class AbstractSequence extends CVCObject {
    private static final long serialVersionUID = 1;
    private final List<CVCTagEnum> allowedFields;
    private final Map<CVCTagEnum, CVCObject> subfields;

    public AbstractSequence(CVCTagEnum cVCTagEnum) {
        super(cVCTagEnum);
        this.subfields = new HashMap();
        this.allowedFields = Arrays.asList(getAllowedFields());
    }

    public void addSubfield(CVCObject cVCObject) {
        addSubfield(cVCObject, false);
    }

    @Override // org.ejbca.cvc.CVCObject
    public int encode(DataOutputStream dataOutputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);
        Iterator<CVCObject> it = getEncodableFields().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().encode(dataOutputStream2);
        }
        dataOutputStream2.close();
        int value = getTag().getValue();
        int size = dataOutputStream.size();
        dataOutputStream.write(CVCObject.toByteArray(Integer.valueOf(value)));
        dataOutputStream.write(CVCObject.encodeLength(i));
        dataOutputStream.write(byteArrayOutputStream.toByteArray());
        return dataOutputStream.size() - size;
    }

    public abstract CVCTagEnum[] getAllowedFields();

    @Override // org.ejbca.cvc.CVCObject
    public String getAsText(String str) {
        return getAsText(str, true);
    }

    public byte[] getDEREncoded() {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th2) {
            byteArrayOutputStream = null;
            th = th2;
        }
        try {
            encode(new DataOutputStream(byteArrayOutputStream));
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th3) {
            th = th3;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            throw th;
        }
    }

    public List<CVCObject> getEncodableFields() {
        return getOrderedSubfields();
    }

    public CVCObject getOptionalSubfield(CVCTagEnum cVCTagEnum) {
        return this.subfields.get(cVCTagEnum);
    }

    public List<CVCObject> getOrderedSubfields() {
        ArrayList arrayList = new ArrayList();
        Iterator<CVCTagEnum> it = this.allowedFields.iterator();
        while (it.hasNext()) {
            CVCObject cVCObject = this.subfields.get(it.next());
            if (cVCObject != null) {
                arrayList.add(cVCObject);
            }
        }
        return arrayList;
    }

    public CVCObject getSubfield(CVCTagEnum cVCTagEnum) {
        CVCObject cVCObject = this.subfields.get(cVCTagEnum);
        if (cVCObject != null) {
            return cVCObject;
        }
        throw new NoSuchFieldException("Could not find subfield " + cVCTagEnum);
    }

    public Collection<CVCObject> getSubfields() {
        return this.subfields.values();
    }

    public void addSubfield(CVCObject cVCObject, boolean z10) {
        if (cVCObject != null) {
            if (!this.allowedFields.contains(cVCObject.getTag())) {
                throw new ConstructionException("Field " + cVCObject.getTag() + " not allowed in " + getClass().getName());
            }
            if (!this.subfields.containsKey(cVCObject.getTag()) || z10) {
                cVCObject.setParent(this);
                this.subfields.put(cVCObject.getTag(), cVCObject);
            } else {
                throw new ConstructionException("Field " + cVCObject.getTag() + " has already been added to " + getClass().getName());
            }
        }
    }

    @Override // org.ejbca.cvc.CVCObject
    public String getAsText(String str, boolean z10) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.getAsText(str, z10));
        for (CVCObject cVCObject : getOrderedSubfields()) {
            stringBuffer.append(CVCObject.NEWLINE);
            stringBuffer.append(cVCObject.getAsText(str + "   ", z10));
        }
        return stringBuffer.toString();
    }
}
