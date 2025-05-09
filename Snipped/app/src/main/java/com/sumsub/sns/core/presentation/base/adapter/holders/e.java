package com.sumsub.sns.core.presentation.base.adapter.holders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.internal.core.presentation.base.adapter.g;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class e extends com.sumsub.sns.core.presentation.base.adapter.b<com.sumsub.sns.internal.core.presentation.base.adapter.a> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f14165b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final TextView f14166a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(ViewGroup viewGroup) {
            return new e(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.sns_layout_status_text_item, viewGroup, false));
        }

        public a() {
        }
    }

    public e(View view) {
        super(view);
        this.f14166a = (TextView) view;
    }

    @Override // com.sumsub.sns.core.presentation.base.adapter.b
    public void a(com.sumsub.sns.internal.core.presentation.base.adapter.a aVar, int i) {
        if (aVar instanceof g) {
            this.f14166a.setText(((g) aVar).c());
        }
    }
}
