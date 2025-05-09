package org.bouncycastle.cert.path.validations;

import org.bouncycastle.cert.path.CertPath;

/* loaded from: classes2.dex */
public class CertificatePoliciesValidationBuilder {
    private boolean isAnyPolicyInhibited;
    private boolean isExplicitPolicyRequired;
    private boolean isPolicyMappingInhibited;

    public CertificatePoliciesValidation build(int i) {
        return new CertificatePoliciesValidation(i, this.isExplicitPolicyRequired, this.isAnyPolicyInhibited, this.isPolicyMappingInhibited);
    }

    public void setAnyPolicyInhibited(boolean z10) {
        this.isAnyPolicyInhibited = z10;
    }

    public void setExplicitPolicyRequired(boolean z10) {
        this.isExplicitPolicyRequired = z10;
    }

    public void setPolicyMappingInhibited(boolean z10) {
        this.isPolicyMappingInhibited = z10;
    }

    public CertificatePoliciesValidation build(CertPath certPath) {
        return build(certPath.length());
    }
}
