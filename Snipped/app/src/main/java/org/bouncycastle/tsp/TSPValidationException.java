package org.bouncycastle.tsp;

/* loaded from: classes3.dex */
public class TSPValidationException extends TSPException {
    private int failureCode;

    public TSPValidationException(String str) {
        super(str);
        this.failureCode = -1;
    }

    public int getFailureCode() {
        return this.failureCode;
    }

    public TSPValidationException(String str, int i) {
        super(str);
        this.failureCode = i;
    }
}
