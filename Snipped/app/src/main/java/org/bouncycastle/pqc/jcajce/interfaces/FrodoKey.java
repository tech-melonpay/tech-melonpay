package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.Key;
import org.bouncycastle.pqc.jcajce.spec.FrodoParameterSpec;

/* loaded from: classes3.dex */
public interface FrodoKey extends Key {
    FrodoParameterSpec getParameterSpec();
}
