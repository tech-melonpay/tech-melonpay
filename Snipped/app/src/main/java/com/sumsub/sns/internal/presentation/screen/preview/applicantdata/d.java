package com.sumsub.sns.internal.presentation.screen.preview.applicantdata;

import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.g;
import java.util.Iterator;
import kotlin.jvm.internal.f;

/* loaded from: classes2.dex */
public final class d {
    public static final g.c.a b(g gVar, DocumentType documentType) {
        Object obj;
        Iterator<T> it = gVar.I().g().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (f.b(((g.c.a) obj).m(), documentType)) {
                break;
            }
        }
        return (g.c.a) obj;
    }
}
