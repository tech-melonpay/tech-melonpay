package com.bumptech.glide.load.engine.bitmap_recycle;

import C.v;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
class PrettyPrintTreeMap<K, V> extends TreeMap<K, V> {
    @Override // java.util.AbstractMap
    public String toString() {
        StringBuilder s10 = v.s("( ");
        for (Map.Entry<K, V> entry : entrySet()) {
            s10.append('{');
            s10.append(entry.getKey());
            s10.append(':');
            s10.append(entry.getValue());
            s10.append("}, ");
        }
        if (!isEmpty()) {
            s10.replace(s10.length() - 2, s10.length(), "");
        }
        s10.append(" )");
        return s10.toString();
    }
}
