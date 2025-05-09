package org.bouncycastle.est;

/* loaded from: classes2.dex */
public interface ESTSourceConnectionListener<T, I> {
    ESTRequest onConnection(Source<T> source, ESTRequest eSTRequest);
}
