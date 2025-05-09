package com.sumsub.sns.core.presentation.form;

import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import java.util.List;

/* loaded from: classes2.dex */
public interface c {
    void a(FormItem formItem);

    void a(FormItem formItem, String str);

    default void a(FormItem formItem, List<String> list) {
    }

    void c(FormItem formItem);

    default void c(FormItem formItem, String str) {
    }

    default void a(FormItem formItem, boolean z10, boolean z11) {
    }

    default void b(FormItem formItem, String str) {
    }
}
