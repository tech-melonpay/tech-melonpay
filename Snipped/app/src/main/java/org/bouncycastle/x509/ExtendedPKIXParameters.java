package org.bouncycastle.x509;

import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CertSelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;

/* loaded from: classes3.dex */
public class ExtendedPKIXParameters extends PKIXParameters {
    public static final int CHAIN_VALIDITY_MODEL = 1;
    public static final int PKIX_VALIDITY_MODEL = 0;
    private boolean additionalLocationsEnabled;
    private List additionalStores;
    private Set attrCertCheckers;
    private Set necessaryACAttributes;
    private Set prohibitedACAttributes;
    private Selector selector;
    private List stores;
    private Set trustedACIssuers;
    private boolean useDeltas;
    private int validityModel;

    public ExtendedPKIXParameters(Set set) {
        super((Set<TrustAnchor>) set);
        this.validityModel = 0;
        this.useDeltas = false;
        this.stores = new ArrayList();
        this.additionalStores = new ArrayList();
        this.trustedACIssuers = new HashSet();
        this.necessaryACAttributes = new HashSet();
        this.prohibitedACAttributes = new HashSet();
        this.attrCertCheckers = new HashSet();
    }

    public static ExtendedPKIXParameters getInstance(PKIXParameters pKIXParameters) {
        try {
            ExtendedPKIXParameters extendedPKIXParameters = new ExtendedPKIXParameters(pKIXParameters.getTrustAnchors());
            extendedPKIXParameters.setParams(pKIXParameters);
            return extendedPKIXParameters;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage());
        }
    }

    public void addAddionalStore(Store store) {
        addAdditionalStore(store);
    }

    public void addAdditionalStore(Store store) {
        if (store != null) {
            this.additionalStores.add(store);
        }
    }

    public void addStore(Store store) {
        if (store != null) {
            this.stores.add(store);
        }
    }

    @Override // java.security.cert.PKIXParameters, java.security.cert.CertPathParameters
    public Object clone() {
        try {
            ExtendedPKIXParameters extendedPKIXParameters = new ExtendedPKIXParameters(getTrustAnchors());
            extendedPKIXParameters.setParams(this);
            return extendedPKIXParameters;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage());
        }
    }

    public List getAdditionalStores() {
        return Collections.unmodifiableList(this.additionalStores);
    }

    public Set getAttrCertCheckers() {
        return Collections.unmodifiableSet(this.attrCertCheckers);
    }

    public Set getNecessaryACAttributes() {
        return Collections.unmodifiableSet(this.necessaryACAttributes);
    }

    public Set getProhibitedACAttributes() {
        return Collections.unmodifiableSet(this.prohibitedACAttributes);
    }

    public List getStores() {
        return Collections.unmodifiableList(new ArrayList(this.stores));
    }

    public Selector getTargetConstraints() {
        Selector selector = this.selector;
        if (selector != null) {
            return (Selector) selector.clone();
        }
        return null;
    }

    public Set getTrustedACIssuers() {
        return Collections.unmodifiableSet(this.trustedACIssuers);
    }

    public int getValidityModel() {
        return this.validityModel;
    }

    public boolean isAdditionalLocationsEnabled() {
        return this.additionalLocationsEnabled;
    }

    public boolean isUseDeltasEnabled() {
        return this.useDeltas;
    }

    public void setAdditionalLocationsEnabled(boolean z10) {
        this.additionalLocationsEnabled = z10;
    }

    public void setAttrCertCheckers(Set set) {
        if (set == null) {
            this.attrCertCheckers.clear();
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof PKIXAttrCertChecker)) {
                throw new ClassCastException("All elements of set must be of type " + PKIXAttrCertChecker.class.getName() + ".");
            }
        }
        this.attrCertCheckers.clear();
        this.attrCertCheckers.addAll(set);
    }

    @Override // java.security.cert.PKIXParameters
    public void setCertStores(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                addCertStore((CertStore) it.next());
            }
        }
    }

    public void setNecessaryACAttributes(Set set) {
        if (set == null) {
            this.necessaryACAttributes.clear();
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof String)) {
                throw new ClassCastException("All elements of set must be of type String.");
            }
        }
        this.necessaryACAttributes.clear();
        this.necessaryACAttributes.addAll(set);
    }

    public void setParams(PKIXParameters pKIXParameters) {
        setDate(pKIXParameters.getDate());
        setCertPathCheckers(pKIXParameters.getCertPathCheckers());
        setCertStores(pKIXParameters.getCertStores());
        setAnyPolicyInhibited(pKIXParameters.isAnyPolicyInhibited());
        setExplicitPolicyRequired(pKIXParameters.isExplicitPolicyRequired());
        setPolicyMappingInhibited(pKIXParameters.isPolicyMappingInhibited());
        setRevocationEnabled(pKIXParameters.isRevocationEnabled());
        setInitialPolicies(pKIXParameters.getInitialPolicies());
        setPolicyQualifiersRejected(pKIXParameters.getPolicyQualifiersRejected());
        setSigProvider(pKIXParameters.getSigProvider());
        setTargetCertConstraints(pKIXParameters.getTargetCertConstraints());
        try {
            setTrustAnchors(pKIXParameters.getTrustAnchors());
            if (pKIXParameters instanceof ExtendedPKIXParameters) {
                ExtendedPKIXParameters extendedPKIXParameters = (ExtendedPKIXParameters) pKIXParameters;
                this.validityModel = extendedPKIXParameters.validityModel;
                this.useDeltas = extendedPKIXParameters.useDeltas;
                this.additionalLocationsEnabled = extendedPKIXParameters.additionalLocationsEnabled;
                Selector selector = extendedPKIXParameters.selector;
                this.selector = selector == null ? null : (Selector) selector.clone();
                this.stores = new ArrayList(extendedPKIXParameters.stores);
                this.additionalStores = new ArrayList(extendedPKIXParameters.additionalStores);
                this.trustedACIssuers = new HashSet(extendedPKIXParameters.trustedACIssuers);
                this.prohibitedACAttributes = new HashSet(extendedPKIXParameters.prohibitedACAttributes);
                this.necessaryACAttributes = new HashSet(extendedPKIXParameters.necessaryACAttributes);
                this.attrCertCheckers = new HashSet(extendedPKIXParameters.attrCertCheckers);
            }
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage());
        }
    }

    public void setProhibitedACAttributes(Set set) {
        if (set == null) {
            this.prohibitedACAttributes.clear();
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof String)) {
                throw new ClassCastException("All elements of set must be of type String.");
            }
        }
        this.prohibitedACAttributes.clear();
        this.prohibitedACAttributes.addAll(set);
    }

    public void setStores(List list) {
        if (list == null) {
            this.stores = new ArrayList();
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof Store)) {
                throw new ClassCastException("All elements of list must be of type org.bouncycastle.util.Store.");
            }
        }
        this.stores = new ArrayList(list);
    }

    @Override // java.security.cert.PKIXParameters
    public void setTargetCertConstraints(CertSelector certSelector) {
        super.setTargetCertConstraints(certSelector);
        this.selector = certSelector != null ? X509CertStoreSelector.getInstance((X509CertSelector) certSelector) : null;
    }

    public void setTargetConstraints(Selector selector) {
        this.selector = selector != null ? (Selector) selector.clone() : null;
    }

    public void setTrustedACIssuers(Set set) {
        if (set == null) {
            this.trustedACIssuers.clear();
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof TrustAnchor)) {
                throw new ClassCastException("All elements of set must be of type " + TrustAnchor.class.getName() + ".");
            }
        }
        this.trustedACIssuers.clear();
        this.trustedACIssuers.addAll(set);
    }

    public void setUseDeltasEnabled(boolean z10) {
        this.useDeltas = z10;
    }

    public void setValidityModel(int i) {
        this.validityModel = i;
    }
}
