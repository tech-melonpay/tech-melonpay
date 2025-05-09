package com.sumsub.sns.internal.core.data.source.applicant.remote;

import java.util.List;
import ka.C0969n;

/* loaded from: classes2.dex */
public final class m {
    public static final l a(String str, String str2) {
        List r02 = C0969n.r0(str, new String[]{str2});
        if (r02.size() == 2) {
            return new l((String) r02.get(0), (String) r02.get(1));
        }
        return null;
    }
}
