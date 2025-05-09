package com.sumsub.sns.internal.core.presentation.form.model;

import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class e {
    public static final FormItem a(FormItem formItem, CharSequence charSequence) {
        FormItem.k a10;
        FormItem.i a11;
        FormItem.g a12;
        if (formItem instanceof FormItem.d) {
            return FormItem.d.a((FormItem.d) formItem, null, null, false, null, charSequence, 15, null);
        }
        if (formItem instanceof FormItem.e) {
            return FormItem.e.a((FormItem.e) formItem, null, null, null, charSequence, 7, null);
        }
        if (formItem instanceof FormItem.j) {
            return FormItem.j.a((FormItem.j) formItem, null, null, null, charSequence, false, 23, null);
        }
        if (formItem instanceof FormItem.m) {
            return FormItem.m.a((FormItem.m) formItem, null, null, null, charSequence, 7, null);
        }
        if (formItem instanceof FormItem.p) {
            return FormItem.p.a((FormItem.p) formItem, null, null, null, false, charSequence, null, 47, null);
        }
        if (formItem instanceof FormItem.q) {
            return FormItem.q.a((FormItem.q) formItem, null, null, null, charSequence, 7, null);
        }
        if (formItem instanceof FormItem.a) {
            return FormItem.a.a((FormItem.a) formItem, null, null, null, charSequence, 7, null);
        }
        if (formItem instanceof FormItem.g) {
            a12 = r1.a((r18 & 1) != 0 ? r1.d() : null, (r18 & 2) != 0 ? r1.e() : null, (r18 & 4) != 0 ? r1.f() : null, (r18 & 8) != 0 ? r1.f16506n : null, (r18 & 16) != 0 ? r1.b() : charSequence, (r18 & 32) != 0 ? r1.f16508p : null, (r18 & 64) != 0 ? r1.f16509q : null, (r18 & 128) != 0 ? ((FormItem.g) formItem).f16510r : null);
            return a12;
        }
        if (formItem instanceof FormItem.i) {
            a11 = r1.a((r20 & 1) != 0 ? r1.d() : null, (r20 & 2) != 0 ? r1.e() : null, (r20 & 4) != 0 ? r1.g() : null, (r20 & 8) != 0 ? r1.f16516n : null, (r20 & 16) != 0 ? r1.b() : charSequence, (r20 & 32) != 0 ? r1.i() : false, (r20 & 64) != 0 ? r1.f16519q : null, (r20 & 128) != 0 ? r1.f16520r : null, (r20 & 256) != 0 ? ((FormItem.i) formItem).f16521s : null);
            return a11;
        }
        if (formItem instanceof FormItem.k) {
            a10 = r1.a((r18 & 1) != 0 ? r1.e() : null, (r18 & 2) != 0 ? r1.d() : null, (r18 & 4) != 0 ? r1.f16529m : null, (r18 & 8) != 0 ? r1.f16530n : null, (r18 & 16) != 0 ? r1.f16531o : null, (r18 & 32) != 0 ? r1.f16532p : false, (r18 & 64) != 0 ? r1.f() : null, (r18 & 128) != 0 ? ((FormItem.k) formItem).b() : charSequence);
            return a10;
        }
        if (formItem instanceof FormItem.n) {
            return FormItem.n.a((FormItem.n) formItem, null, null, null, false, charSequence, 15, null);
        }
        if (formItem instanceof FormItem.c) {
            return FormItem.c.a((FormItem.c) formItem, null, null, null, null, false, charSequence, 31, null);
        }
        if ((formItem instanceof FormItem.f) || (formItem instanceof FormItem.h) || (formItem instanceof FormItem.l) || (formItem instanceof FormItem.o) || (formItem instanceof FormItem.r)) {
            return formItem;
        }
        throw new NoWhenBranchMatchedException();
    }
}
