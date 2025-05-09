package com.sumsub.sns.core.presentation.base.adapter.holders;

import O9.p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ca.InterfaceC0646l;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.internal.core.widget.SNSStepState;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class d extends com.sumsub.sns.core.presentation.base.adapter.b<com.sumsub.sns.internal.core.presentation.base.adapter.a> {

    /* renamed from: d, reason: collision with root package name */
    public static final a f14160d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f14161a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f14162b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f14163c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(ViewGroup viewGroup, InterfaceC0646l<? super String, p> interfaceC0646l) {
            return new d(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.sns_layout_moderator_comment_item, viewGroup, false), interfaceC0646l);
        }

        public a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14164a;

        static {
            int[] iArr = new int[SNSStepState.values().length];
            iArr[SNSStepState.APPROVED.ordinal()] = 1;
            iArr[SNSStepState.REJECTED.ordinal()] = 2;
            f14164a = iArr;
        }
    }

    public d(View view, InterfaceC0646l<? super String, p> interfaceC0646l) {
        super(view);
        this.f14161a = (ImageView) view.findViewById(R$id.sns_status_icon);
        TextView textView = (TextView) view.findViewById(R$id.sns_status_comment);
        this.f14162b = textView;
        this.f14163c = (TextView) view.findViewById(R$id.sns_status_title);
        if (textView != null) {
            com.sumsub.sns.core.common.b.a(textView, interfaceC0646l);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    @Override // com.sumsub.sns.core.presentation.base.adapter.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.sumsub.sns.internal.core.presentation.base.adapter.a r4, int r5) {
        /*
            r3 = this;
            boolean r5 = r4 instanceof com.sumsub.sns.internal.core.presentation.base.adapter.f
            if (r5 != 0) goto L5
            return
        L5:
            com.sumsub.sns.internal.core.presentation.base.adapter.f r4 = (com.sumsub.sns.internal.core.presentation.base.adapter.f) r4
            com.sumsub.sns.internal.core.widget.SNSStepState r5 = r4.g()
            android.widget.ImageView r0 = r3.f14161a
            if (r0 == 0) goto L61
            r1 = 1
            if (r5 != 0) goto L14
            r2 = r1
            goto L15
        L14:
            r2 = 0
        L15:
            com.sumsub.sns.internal.core.common.i.a(r0, r2)
            if (r5 == 0) goto L52
            int[] r2 = com.sumsub.sns.core.presentation.base.adapter.holders.d.b.f14164a
            int r5 = r5.ordinal()
            r5 = r2[r5]
            if (r5 == r1) goto L3d
            r1 = 2
            if (r5 == r1) goto L28
            goto L52
        L28:
            com.sumsub.sns.internal.core.common.e0 r5 = com.sumsub.sns.internal.core.common.e0.f15081a
            com.sumsub.sns.core.data.listener.SNSIconHandler r5 = r5.getIconHandler()
            android.content.Context r1 = r0.getContext()
            com.sumsub.sns.core.data.listener.SNSIconHandler$SNSResultIcons r2 = com.sumsub.sns.core.data.listener.SNSIconHandler.SNSResultIcons.FAILURE
            java.lang.String r2 = r2.getImageName()
            android.graphics.drawable.Drawable r5 = r5.onResolveIcon(r1, r2)
            goto L53
        L3d:
            com.sumsub.sns.internal.core.common.e0 r5 = com.sumsub.sns.internal.core.common.e0.f15081a
            com.sumsub.sns.core.data.listener.SNSIconHandler r5 = r5.getIconHandler()
            android.content.Context r1 = r0.getContext()
            com.sumsub.sns.core.data.listener.SNSIconHandler$SNSResultIcons r2 = com.sumsub.sns.core.data.listener.SNSIconHandler.SNSResultIcons.SUCCESS
            java.lang.String r2 = r2.getImageName()
            android.graphics.drawable.Drawable r5 = r5.onResolveIcon(r1, r2)
            goto L53
        L52:
            r5 = 0
        L53:
            r0.setImageDrawable(r5)
            com.sumsub.sns.internal.core.widget.SNSStepState r5 = r4.g()
            if (r5 != 0) goto L5e
            com.sumsub.sns.internal.core.widget.SNSStepState r5 = com.sumsub.sns.internal.core.widget.SNSStepState.INIT
        L5e:
            com.sumsub.sns.core.widget.SNSStepViewExtensionsKt.setSnsStepState(r0, r5)
        L61:
            android.widget.TextView r5 = r3.f14163c
            if (r5 == 0) goto L6c
            java.lang.CharSequence r0 = r4.f()
            com.sumsub.sns.internal.core.common.i.a(r5, r0)
        L6c:
            android.widget.TextView r5 = r3.f14162b
            if (r5 == 0) goto L77
            java.lang.CharSequence r4 = r4.e()
            com.sumsub.sns.internal.core.common.i.a(r5, r4)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.core.presentation.base.adapter.holders.d.a(com.sumsub.sns.internal.core.presentation.base.adapter.a, int):void");
    }
}
