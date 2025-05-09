package com.sumsub.sns.core.presentation.form.viewadapter;

import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import java.util.List;

/* loaded from: classes2.dex */
public final class c implements com.sumsub.sns.core.presentation.form.c {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.core.presentation.form.c f14209a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14210b;

    public c(com.sumsub.sns.core.presentation.form.c cVar) {
        this.f14209a = cVar;
    }

    public final com.sumsub.sns.core.presentation.form.c a() {
        return this.f14209a;
    }

    @Override // com.sumsub.sns.core.presentation.form.c
    public void b(FormItem formItem, String str) {
        if (this.f14210b) {
            return;
        }
        this.f14209a.b(formItem, str);
    }

    @Override // com.sumsub.sns.core.presentation.form.c
    public void c(FormItem formItem) {
        if (this.f14210b) {
            return;
        }
        this.f14209a.c(formItem);
    }

    public final void a(boolean z10) {
        this.f14210b = z10;
    }

    @Override // com.sumsub.sns.core.presentation.form.c
    public void a(FormItem formItem) {
        if (this.f14210b) {
            return;
        }
        this.f14209a.a(formItem);
    }

    @Override // com.sumsub.sns.core.presentation.form.c
    public void c(FormItem formItem, String str) {
        if (this.f14210b) {
            return;
        }
        this.f14209a.c(formItem, str);
    }

    @Override // com.sumsub.sns.core.presentation.form.c
    public void a(FormItem formItem, String str) {
        if (this.f14210b) {
            return;
        }
        this.f14209a.a(formItem, str);
    }

    @Override // com.sumsub.sns.core.presentation.form.c
    public void a(FormItem formItem, boolean z10, boolean z11) {
        if (this.f14210b) {
            return;
        }
        this.f14209a.a(formItem, z10, z11);
    }

    @Override // com.sumsub.sns.core.presentation.form.c
    public void a(FormItem formItem, List<String> list) {
        if (this.f14210b) {
            return;
        }
        this.f14209a.a(formItem, list);
    }
}
