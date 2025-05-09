package org.bouncycastle.jsse;

import java.util.List;

/* loaded from: classes.dex */
public interface BCApplicationProtocolSelector<T> {
    String select(T t3, List<String> list);
}
