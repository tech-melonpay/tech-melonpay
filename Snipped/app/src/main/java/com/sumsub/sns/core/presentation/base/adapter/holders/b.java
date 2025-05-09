package com.sumsub.sns.core.presentation.base.adapter.holders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.widget.SNSModeratorCommentView;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class b extends com.sumsub.sns.core.presentation.base.adapter.b<com.sumsub.sns.internal.core.presentation.base.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14157a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(ViewGroup viewGroup) {
            return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.sns_layout_status_documents_moderator_comment_item, viewGroup, false));
        }

        public a() {
        }
    }

    public b(View view) {
        super(view);
    }

    @Override // com.sumsub.sns.core.presentation.base.adapter.b
    public void a(com.sumsub.sns.internal.core.presentation.base.adapter.a aVar, int i) {
        View view = this.itemView;
        if ((aVar instanceof com.sumsub.sns.internal.core.presentation.base.adapter.d) && (view instanceof SNSModeratorCommentView)) {
            SNSModeratorCommentView sNSModeratorCommentView = (SNSModeratorCommentView) view;
            CharSequence c2 = ((com.sumsub.sns.internal.core.presentation.base.adapter.d) aVar).c();
            sNSModeratorCommentView.setSubtitle(c2 != null ? i.a(c2, sNSModeratorCommentView.getContext()) : null);
            sNSModeratorCommentView.setIconStart(e0.f15081a.getIconHandler().onResolveIcon(sNSModeratorCommentView.getContext(), SNSIconHandler.SNSCommonIcons.NOTIFY.getImageName()));
        }
    }
}
