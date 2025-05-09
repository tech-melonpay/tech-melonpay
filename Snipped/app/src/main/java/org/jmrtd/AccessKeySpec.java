package org.jmrtd;

import java.io.Serializable;
import java.security.spec.KeySpec;

/* loaded from: classes3.dex */
public interface AccessKeySpec extends Serializable, KeySpec {
    String getAlgorithm();

    byte[] getKey();
}
