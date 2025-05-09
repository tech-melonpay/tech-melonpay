package org.bouncycastle.cms;

import org.bouncycastle.asn1.cms.RecipientInfo;
import org.bouncycastle.operator.GenericKey;

/* loaded from: classes2.dex */
public interface RecipientInfoGenerator {
    RecipientInfo generate(GenericKey genericKey);
}
