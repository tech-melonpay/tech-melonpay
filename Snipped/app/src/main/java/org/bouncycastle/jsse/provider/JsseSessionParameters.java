package org.bouncycastle.jsse.provider;

/* loaded from: classes.dex */
class JsseSessionParameters {
    private final String identificationProtocol;

    public JsseSessionParameters(String str) {
        this.identificationProtocol = str;
    }

    public String getIdentificationProtocol() {
        return this.identificationProtocol;
    }
}
