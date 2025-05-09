package com.sumsub.sns.internal.core.presentation.base.adapter;

import com.sumsub.sns.internal.core.widget.SNSStepState;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class f extends a {

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f16457b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f16458c;

    /* renamed from: d, reason: collision with root package name */
    public final SNSStepState f16459d;

    public f() {
        this(null, null, null, 7, null);
    }

    public final CharSequence e() {
        return this.f16458c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.f.b(this.f16457b, fVar.f16457b) && kotlin.jvm.internal.f.b(this.f16458c, fVar.f16458c) && this.f16459d == fVar.f16459d;
    }

    public final CharSequence f() {
        return this.f16457b;
    }

    public final SNSStepState g() {
        return this.f16459d;
    }

    public int hashCode() {
        CharSequence charSequence = this.f16457b;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f16458c;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        SNSStepState sNSStepState = this.f16459d;
        return hashCode2 + (sNSStepState != null ? sNSStepState.hashCode() : 0);
    }

    public String toString() {
        return "SNSModeratorCommentViewItem(moderationTitle=" + ((Object) this.f16457b) + ", moderationComment=" + ((Object) this.f16458c) + ", state=" + this.f16459d + ')';
    }

    public /* synthetic */ f(CharSequence charSequence, CharSequence charSequence2, SNSStepState sNSStepState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : charSequence2, (i & 4) != 0 ? null : sNSStepState);
    }

    public f(CharSequence charSequence, CharSequence charSequence2, SNSStepState sNSStepState) {
        super(2);
        this.f16457b = charSequence;
        this.f16458c = charSequence2;
        this.f16459d = sNSStepState;
    }
}
