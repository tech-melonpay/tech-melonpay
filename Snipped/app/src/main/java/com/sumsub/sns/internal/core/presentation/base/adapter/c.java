package com.sumsub.sns.internal.core.presentation.base.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.presentation.base.adapter.SNSDocumentViewTypeInfo;
import com.sumsub.sns.internal.core.widget.SNSStepState;

/* loaded from: classes2.dex */
public final class c extends a {

    /* renamed from: b, reason: collision with root package name */
    public final SNSStepState f16450b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f16451c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f16452d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16453e;

    /* renamed from: f, reason: collision with root package name */
    public final SNSDocumentViewTypeInfo f16454f;

    public c(SNSStepState sNSStepState, CharSequence charSequence, CharSequence charSequence2, boolean z10, SNSDocumentViewTypeInfo sNSDocumentViewTypeInfo) {
        super(1);
        this.f16450b = sNSStepState;
        this.f16451c = charSequence;
        this.f16452d = charSequence2;
        this.f16453e = z10;
        this.f16454f = sNSDocumentViewTypeInfo;
    }

    public final Drawable a(Context context) {
        return this.f16454f.d() == SNSDocumentViewTypeInfo.Type.VIDEO_IDENTIFICATION ? e0.f15081a.getIconHandler().onResolveIcon(context, new DocumentType(DocumentType.f15254k).b()) : e0.f15081a.getIconHandler().onResolveIcon(context, this.f16454f.c().getType().b());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f16450b == cVar.f16450b && kotlin.jvm.internal.f.b(this.f16451c, cVar.f16451c) && kotlin.jvm.internal.f.b(this.f16452d, cVar.f16452d) && this.f16453e == cVar.f16453e && kotlin.jvm.internal.f.b(this.f16454f, cVar.f16454f);
    }

    public final SNSStepState g() {
        return this.f16450b;
    }

    public final CharSequence h() {
        return this.f16452d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = (this.f16451c.hashCode() + (this.f16450b.hashCode() * 31)) * 31;
        CharSequence charSequence = this.f16452d;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        boolean z10 = this.f16453e;
        int i = z10;
        if (z10 != 0) {
            i = 1;
        }
        return this.f16454f.hashCode() + ((hashCode2 + i) * 31);
    }

    public final CharSequence i() {
        return this.f16451c;
    }

    public final SNSDocumentViewTypeInfo j() {
        return this.f16454f;
    }

    public final boolean k() {
        return this.f16453e;
    }

    public String toString() {
        return "SNSDocumentViewItem(state=" + this.f16450b + ", title=" + ((Object) this.f16451c) + ", subtitle=" + ((Object) this.f16452d) + ", isClickable=" + this.f16453e + ", typeInfo=" + this.f16454f + ')';
    }
}
