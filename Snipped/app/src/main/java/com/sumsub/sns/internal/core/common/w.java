package com.sumsub.sns.internal.core.common;

import com.sumsub.sns.internal.core.data.source.dynamic.b;
import ka.C0969n;

/* loaded from: classes2.dex */
public final class w {
    public static final CharSequence a(b.c cVar, String... strArr) {
        if (cVar == null) {
            return "";
        }
        for (String str : strArr) {
            String a10 = cVar.a(str);
            if (a10 != null && !C0969n.i0(a10)) {
                return a10;
            }
        }
        return "";
    }
}
