package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.Key;
import org.bouncycastle.pqc.jcajce.spec.SABERParameterSpec;

/* loaded from: classes3.dex */
public interface SABERKey extends Key {
    SABERParameterSpec getParameterSpec();
}
