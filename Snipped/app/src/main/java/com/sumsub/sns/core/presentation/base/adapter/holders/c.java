package com.sumsub.sns.core.presentation.base.adapter.holders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.widget.SNSImageView;
import com.sumsub.sns.internal.core.common.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class c extends com.sumsub.sns.core.presentation.base.adapter.b<com.sumsub.sns.internal.core.presentation.base.adapter.a> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f14158b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final SNSImageView f14159a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(ViewGroup viewGroup) {
            return new c(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.sns_layout_status_image_item, viewGroup, false));
        }

        public a() {
        }
    }

    public c(View view) {
        super(view);
        this.f14159a = (SNSImageView) view;
    }

    @Override // com.sumsub.sns.core.presentation.base.adapter.b
    public void a(com.sumsub.sns.internal.core.presentation.base.adapter.a aVar, int i) {
        if (aVar instanceof com.sumsub.sns.internal.core.presentation.base.adapter.e) {
            this.f14159a.setImageDrawable(e0.f15081a.getIconHandler().onResolveIcon(this.itemView.getContext(), ((com.sumsub.sns.internal.core.presentation.base.adapter.e) aVar).c()));
        }
    }
}
