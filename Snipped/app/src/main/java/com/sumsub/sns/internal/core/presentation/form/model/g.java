package com.sumsub.sns.internal.core.presentation.form.model;

import com.sumsub.sns.internal.core.data.model.FieldType;
import com.sumsub.sns.internal.core.data.model.p;
import com.sumsub.sns.internal.core.data.source.applicant.remote.k;
import com.sumsub.sns.internal.core.data.source.applicant.remote.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ka.C0969n;

/* loaded from: classes2.dex */
public final class g {
    public static final p a(k kVar) {
        return p.INSTANCE.a(kVar.n());
    }

    public static final int b(k kVar) {
        Integer a10;
        p a11 = p.INSTANCE.a(kVar.n());
        if (a11 == null || (a10 = com.sumsub.sns.internal.core.presentation.util.a.a(a11)) == null) {
            return 1;
        }
        return a10.intValue();
    }

    public static final FieldType c(k kVar) {
        return FieldType.INSTANCE.a(kVar.z());
    }

    public static final FieldError a(k kVar, String str) {
        if (kotlin.jvm.internal.f.b(kVar.v(), Boolean.TRUE) && (str == null || C0969n.i0(str))) {
            return FieldError.REQUIRED;
        }
        if (com.sumsub.sns.internal.core.presentation.util.a.a(a(kVar), str)) {
            return null;
        }
        return FieldError.NOT_VALID;
    }

    public static final FieldError a(k kVar, String str, List<r> list) {
        if (kotlin.jvm.internal.f.b(kVar.v(), Boolean.TRUE) && (str == null || C0969n.i0(str))) {
            return FieldError.REQUIRED;
        }
        if ((!list.isEmpty()) && str != null && !C0969n.i0(str)) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.f.b(((r) it.next()).e(), str)) {
                    }
                }
            }
            return FieldError.NOT_VALID;
        }
        return null;
    }
}
