package com.sumsub.sns.core.presentation.base.adapter.holders;

import O9.p;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ca.InterfaceC0646l;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.widget.SNSStepView;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.internal.core.common.i;
import com.sumsub.sns.internal.core.data.model.Document;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.core.presentation.base.adapter.b<com.sumsub.sns.internal.core.presentation.base.adapter.a> {

    /* renamed from: b, reason: collision with root package name */
    public static final C0163a f14155b = new C0163a(null);

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0646l<Document, p> f14156a;

    /* renamed from: com.sumsub.sns.core.presentation.base.adapter.holders.a$a, reason: collision with other inner class name */
    public static final class C0163a {
        public /* synthetic */ C0163a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(ViewGroup viewGroup, InterfaceC0646l<? super Document, p> interfaceC0646l) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.sns_layout_status_document_item, viewGroup, false), interfaceC0646l);
        }

        public C0163a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(View view, InterfaceC0646l<? super Document, p> interfaceC0646l) {
        super(view);
        this.f14156a = interfaceC0646l;
    }

    @Override // com.sumsub.sns.core.presentation.base.adapter.b
    public void a(com.sumsub.sns.internal.core.presentation.base.adapter.a aVar, int i) {
        if (aVar instanceof com.sumsub.sns.internal.core.presentation.base.adapter.c) {
            View view = this.itemView;
            SNSStepView sNSStepView = view instanceof SNSStepView ? (SNSStepView) view : null;
            if (sNSStepView != null) {
                com.sumsub.sns.internal.core.presentation.base.adapter.c cVar = (com.sumsub.sns.internal.core.presentation.base.adapter.c) aVar;
                Spanned a10 = i.a(cVar.i(), sNSStepView.getContext());
                sNSStepView.setTitle(a10);
                if (a10.length() == 0) {
                    sNSStepView.setTitle("   ");
                }
                CharSequence h9 = cVar.h();
                sNSStepView.setSubtitle(h9 != null ? i.a(h9, sNSStepView.getContext()) : null);
                sNSStepView.setIconStart(cVar.a(sNSStepView.getContext()));
                SNSStepViewExtensionsKt.setSnsStepState(sNSStepView, cVar.g());
                sNSStepView.setIconEnd(null);
                if (cVar.k()) {
                    this.itemView.setOnClickListener(new B7.f(13, this, aVar));
                    Context context = sNSStepView.getContext();
                    com.sumsub.sns.core.presentation.helper.a aVar2 = com.sumsub.sns.core.presentation.helper.a.f14273a;
                    Drawable a11 = aVar2.a(context, SNSIconHandler.SNSCommonIcons.MORE.getImageName());
                    if (a11 == null) {
                        a11 = aVar2.a(context, SNSIconHandler.SNSCommonIcons.DISCLOSURE.getImageName());
                    }
                    sNSStepView.setIconEnd(a11);
                }
            }
        }
    }

    public static final void a(a aVar, com.sumsub.sns.internal.core.presentation.base.adapter.a aVar2, View view) {
        InterfaceC0646l<Document, p> interfaceC0646l = aVar.f14156a;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke(((com.sumsub.sns.internal.core.presentation.base.adapter.c) aVar2).j().c());
        }
    }
}
