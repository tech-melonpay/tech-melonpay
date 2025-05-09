package org.bouncycastle.crypto;

import java.io.InputStream;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes2.dex */
public interface KeyParser {
    AsymmetricKeyParameter readKey(InputStream inputStream);
}
