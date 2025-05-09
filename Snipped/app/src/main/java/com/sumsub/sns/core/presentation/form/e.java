package com.sumsub.sns.core.presentation.form;

import com.sumsub.sns.internal.core.presentation.form.FieldId;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;

/* loaded from: classes2.dex */
public final class e {
    public static final FieldId b(FormItem formItem) {
        String e10 = formItem.e();
        if (e10 == null) {
            e10 = "";
        }
        String p10 = formItem.d().p();
        return new FieldId(e10, p10 != null ? p10 : "");
    }
}
