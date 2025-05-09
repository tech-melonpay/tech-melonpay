package org.jmrtd;

import net.sf.scuba.smartcards.CardServiceException;
import s3.b;

/* loaded from: classes3.dex */
public class CardServiceProtocolException extends CardServiceException {
    private static final long serialVersionUID = 8527846223511524125L;
    private int step;

    public CardServiceProtocolException(String str, int i) {
        super(str);
        this.step = i;
    }

    @Override // net.sf.scuba.smartcards.CardServiceException, java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.getMessage());
        sb2.append(" (step: ");
        return b.m(sb2, this.step, ")");
    }

    public int getStep() {
        return this.step;
    }

    public CardServiceProtocolException(String str, int i, Throwable th) {
        super(str, th);
        this.step = i;
    }

    public CardServiceProtocolException(String str, int i, int i9) {
        super(str, i9);
        this.step = i;
    }

    public CardServiceProtocolException(String str, int i, Throwable th, int i9) {
        super(str, th, i9);
        this.step = i;
    }
}
