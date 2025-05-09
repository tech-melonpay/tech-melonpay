package com.sumsub.sns.core.presentation.base.adapter;

import O9.p;
import android.view.ViewGroup;
import ca.InterfaceC0646l;
import com.sumsub.sns.core.presentation.base.adapter.holders.d;
import com.sumsub.sns.core.presentation.base.adapter.holders.e;
import com.sumsub.sns.core.presentation.base.adapter.holders.f;
import com.sumsub.sns.internal.core.data.model.Document;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes2.dex */
public final class c extends com.sumsub.sns.core.presentation.base.adapter.a<com.sumsub.sns.internal.core.presentation.base.adapter.a, com.sumsub.sns.core.presentation.base.adapter.b<com.sumsub.sns.internal.core.presentation.base.adapter.a>> {

    /* renamed from: b, reason: collision with root package name */
    public final a f14148b;

    public interface a {
        default void a(Document document) {
        }

        default void a(String str) {
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements InterfaceC0646l<Document, p> {
        public b(Object obj) {
            super(1, obj, a.class, "onDocumentClicked", "onDocumentClicked(Lcom/sumsub/sns/internal/core/data/model/Document;)V", 0);
        }

        public final void a(Document document) {
            ((a) this.receiver).a(document);
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ p invoke(Document document) {
            a(document);
            return p.f3034a;
        }
    }

    /* renamed from: com.sumsub.sns.core.presentation.base.adapter.c$c, reason: collision with other inner class name */
    public /* synthetic */ class C0162c extends FunctionReferenceImpl implements InterfaceC0646l<String, p> {
        public C0162c(Object obj) {
            super(1, obj, a.class, "onLinkClicked", "onLinkClicked(Ljava/lang/String;)V", 0);
        }

        public final void a(String str) {
            ((a) this.receiver).a(str);
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ p invoke(String str) {
            a(str);
            return p.f3034a;
        }
    }

    public c(a aVar) {
        this.f14148b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.sumsub.sns.core.presentation.base.adapter.b<com.sumsub.sns.internal.core.presentation.base.adapter.a> onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1:
                return com.sumsub.sns.core.presentation.base.adapter.holders.a.f14155b.a(viewGroup, new b(this.f14148b));
            case 2:
                return d.f14160d.a(viewGroup, new C0162c(this.f14148b));
            case 3:
                return com.sumsub.sns.core.presentation.base.adapter.holders.c.f14158b.a(viewGroup);
            case 4:
                return f.f14167b.a(viewGroup);
            case 5:
                return e.f14165b.a(viewGroup);
            case 6:
                return com.sumsub.sns.core.presentation.base.adapter.holders.b.f14157a.a(viewGroup);
            default:
                throw new IllegalStateException("Cannot create view holder for SNSDocumentListAdapter");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        com.sumsub.sns.internal.core.presentation.base.adapter.a a10 = a(i);
        if (a10 != null) {
            return a10.a();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(com.sumsub.sns.core.presentation.base.adapter.b<com.sumsub.sns.internal.core.presentation.base.adapter.a> bVar, int i) {
        com.sumsub.sns.internal.core.presentation.base.adapter.a a10 = a(i);
        if (a10 != null) {
            bVar.a(a10, getItemCount());
        }
    }
}
