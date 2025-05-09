package com.sumsub.sns.core.presentation.form.viewadapter;

import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;

/* loaded from: classes2.dex */
public abstract class k<T extends FormItem, V extends SNSApplicantDataBaseFieldView> extends com.sumsub.sns.core.presentation.base.adapter.b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final V f14235a;

    public k(V v10) {
        super(v10);
        this.f14235a = v10;
    }

    public abstract void a(V v10, T t3, int i);

    public final V b() {
        return this.f14235a;
    }

    @Override // com.sumsub.sns.core.presentation.base.adapter.b
    public final void a(T t3, int i) {
        a(this.f14235a, t3, i);
    }

    public void c() {
    }
}
