package org.bouncycastle.cert.dane;

import org.bouncycastle.util.Selector;

/* loaded from: classes2.dex */
public class DANEEntrySelector implements Selector {
    private final String domainName;

    public DANEEntrySelector(String str) {
        this.domainName = str;
    }

    public String getDomainName() {
        return this.domainName;
    }

    @Override // org.bouncycastle.util.Selector
    public boolean match(Object obj) {
        return ((DANEEntry) obj).getDomainName().equals(this.domainName);
    }

    @Override // org.bouncycastle.util.Selector
    public Object clone() {
        return this;
    }
}
