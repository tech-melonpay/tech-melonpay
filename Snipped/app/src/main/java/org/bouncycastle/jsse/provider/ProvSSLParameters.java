package org.bouncycastle.jsse.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCApplicationProtocolSelector;
import org.bouncycastle.jsse.BCSNIMatcher;
import org.bouncycastle.jsse.BCSNIServerName;
import org.bouncycastle.jsse.java.security.BCAlgorithmConstraints;

/* loaded from: classes.dex */
final class ProvSSLParameters {
    private static final BCAlgorithmConstraints DEFAULT_ALGORITHM_CONSTRAINTS = ProvAlgorithmConstraints.DEFAULT;
    private String[] cipherSuites;
    private final ProvSSLContextSpi context;
    private String endpointIdentificationAlgorithm;
    private BCApplicationProtocolSelector<SSLEngine> engineAPSelector;
    private String[] protocols;
    private List<BCSNIMatcher> sniMatchers;
    private List<BCSNIServerName> sniServerNames;
    private BCApplicationProtocolSelector<SSLSocket> socketAPSelector;
    private boolean needClientAuth = false;
    private boolean wantClientAuth = false;
    private BCAlgorithmConstraints algorithmConstraints = DEFAULT_ALGORITHM_CONSTRAINTS;
    private boolean useCipherSuitesOrder = true;
    private String[] applicationProtocols = new String[0];

    public ProvSSLParameters(ProvSSLContextSpi provSSLContextSpi, String[] strArr, String[] strArr2) {
        this.context = provSSLContextSpi;
        this.cipherSuites = strArr;
        this.protocols = strArr2;
    }

    private static <T> List<T> copyList(Collection<T> collection) {
        if (collection == null) {
            return null;
        }
        return collection.isEmpty() ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(collection));
    }

    public ProvSSLParameters copy() {
        ProvSSLParameters provSSLParameters = new ProvSSLParameters(this.context, this.cipherSuites, this.protocols);
        provSSLParameters.needClientAuth = this.needClientAuth;
        provSSLParameters.wantClientAuth = this.wantClientAuth;
        provSSLParameters.algorithmConstraints = this.algorithmConstraints;
        provSSLParameters.endpointIdentificationAlgorithm = this.endpointIdentificationAlgorithm;
        provSSLParameters.useCipherSuitesOrder = this.useCipherSuitesOrder;
        provSSLParameters.sniMatchers = this.sniMatchers;
        provSSLParameters.sniServerNames = this.sniServerNames;
        provSSLParameters.applicationProtocols = this.applicationProtocols;
        provSSLParameters.engineAPSelector = this.engineAPSelector;
        provSSLParameters.socketAPSelector = this.socketAPSelector;
        return provSSLParameters;
    }

    public ProvSSLParameters copyForConnection() {
        ProvSSLParameters copy = copy();
        if (DEFAULT_ALGORITHM_CONSTRAINTS != copy.algorithmConstraints) {
            copy.algorithmConstraints = new ProvAlgorithmConstraints(copy.algorithmConstraints, true);
        }
        return copy;
    }

    public BCAlgorithmConstraints getAlgorithmConstraints() {
        return this.algorithmConstraints;
    }

    public String[] getApplicationProtocols() {
        return (String[]) this.applicationProtocols.clone();
    }

    public String[] getCipherSuites() {
        return (String[]) this.cipherSuites.clone();
    }

    public String[] getCipherSuitesArray() {
        return this.cipherSuites;
    }

    public String getEndpointIdentificationAlgorithm() {
        return this.endpointIdentificationAlgorithm;
    }

    public BCApplicationProtocolSelector<SSLEngine> getEngineAPSelector() {
        return this.engineAPSelector;
    }

    public boolean getNeedClientAuth() {
        return this.needClientAuth;
    }

    public String[] getProtocols() {
        return (String[]) this.protocols.clone();
    }

    public String[] getProtocolsArray() {
        return this.protocols;
    }

    public Collection<BCSNIMatcher> getSNIMatchers() {
        return copyList(this.sniMatchers);
    }

    public List<BCSNIServerName> getServerNames() {
        return copyList(this.sniServerNames);
    }

    public BCApplicationProtocolSelector<SSLSocket> getSocketAPSelector() {
        return this.socketAPSelector;
    }

    public boolean getUseCipherSuitesOrder() {
        return this.useCipherSuitesOrder;
    }

    public boolean getWantClientAuth() {
        return this.wantClientAuth;
    }

    public void setAlgorithmConstraints(BCAlgorithmConstraints bCAlgorithmConstraints) {
        this.algorithmConstraints = bCAlgorithmConstraints;
    }

    public void setApplicationProtocols(String[] strArr) {
        this.applicationProtocols = (String[]) strArr.clone();
    }

    public void setCipherSuites(String[] strArr) {
        this.cipherSuites = this.context.getSupportedCipherSuites(strArr);
    }

    public void setEndpointIdentificationAlgorithm(String str) {
        this.endpointIdentificationAlgorithm = str;
    }

    public void setEngineAPSelector(BCApplicationProtocolSelector<SSLEngine> bCApplicationProtocolSelector) {
        this.engineAPSelector = bCApplicationProtocolSelector;
    }

    public void setNeedClientAuth(boolean z10) {
        this.needClientAuth = z10;
        this.wantClientAuth = false;
    }

    public void setProtocols(String[] strArr) {
        if (!this.context.isSupportedProtocols(strArr)) {
            throw new IllegalArgumentException("'protocols' cannot be null, or contain unsupported protocols");
        }
        this.protocols = (String[]) strArr.clone();
    }

    public void setProtocolsArray(String[] strArr) {
        this.protocols = strArr;
    }

    public void setSNIMatchers(Collection<BCSNIMatcher> collection) {
        this.sniMatchers = copyList(collection);
    }

    public void setServerNames(List<BCSNIServerName> list) {
        this.sniServerNames = copyList(list);
    }

    public void setSocketAPSelector(BCApplicationProtocolSelector<SSLSocket> bCApplicationProtocolSelector) {
        this.socketAPSelector = bCApplicationProtocolSelector;
    }

    public void setUseCipherSuitesOrder(boolean z10) {
        this.useCipherSuitesOrder = z10;
    }

    public void setWantClientAuth(boolean z10) {
        this.needClientAuth = false;
        this.wantClientAuth = z10;
    }
}
