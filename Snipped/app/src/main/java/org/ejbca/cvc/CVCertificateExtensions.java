package org.ejbca.cvc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class CVCertificateExtensions extends AbstractArray {
    private static final long serialVersionUID = 1;

    public CVCertificateExtensions() {
        super(CVCTagEnum.CERTIFICATE_EXTENSIONS);
    }

    @Override // org.ejbca.cvc.AbstractArray
    public CVCTagEnum getAllowedField() {
        return CVCTagEnum.DISCRETIONARY_DATA_TEMPLATE;
    }

    public List<CVCDiscretionaryDataTemplate> getExtensions() {
        ArrayList arrayList = new ArrayList();
        Iterator<CVCObject> it = getEncodableFields().iterator();
        while (it.hasNext()) {
            arrayList.add((CVCDiscretionaryDataTemplate) it.next());
        }
        return arrayList;
    }

    public CVCertificateExtensions(Collection<CVCDiscretionaryDataTemplate> collection) {
        this();
        Iterator<CVCDiscretionaryDataTemplate> it = collection.iterator();
        while (it.hasNext()) {
            addSubfield(it.next());
        }
    }
}
