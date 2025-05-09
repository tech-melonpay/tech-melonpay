package com.sumsub.sns.videoident.presentation;

import B7.f;
import O9.p;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ca.InterfaceC0646l;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.sns.R$id;
import com.sumsub.sns.internal.core.common.i;
import com.sumsub.sns.internal.videoident.presentation.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import org.bouncycastle.i18n.MessageBundle;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\t\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R6\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/sumsub/sns/videoident/presentation/LanguageItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/sumsub/sns/videoident/presentation/LanguageItemAdapter$LanguageItemViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/sumsub/sns/videoident/presentation/LanguageItemAdapter$LanguageItemViewHolder;", "getItemCount", "()I", "holder", "position", "LO9/p;", "onBindViewHolder", "(Lcom/sumsub/sns/videoident/presentation/LanguageItemAdapter$LanguageItemViewHolder;I)V", "Lkotlin/Function1;", "Lcom/sumsub/sns/internal/videoident/presentation/a$c$b;", "selectionCallback", "Lca/l;", "getSelectionCallback", "()Lca/l;", "setSelectionCallback", "(Lca/l;)V", "", "value", FirebaseAnalytics.Param.ITEMS, "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "LanguageItemViewHolder", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class LanguageItemAdapter extends RecyclerView.Adapter<LanguageItemViewHolder> {
    private List<a.c.b> items = EmptyList.f23104a;
    private InterfaceC0646l<? super a.c.b, p> selectionCallback;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/sumsub/sns/videoident/presentation/LanguageItemAdapter$LanguageItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/sumsub/sns/videoident/presentation/LanguageItemAdapter;Landroid/view/View;)V", "Lcom/sumsub/sns/internal/videoident/presentation/a$c$b;", "item", "LO9/p;", "bind", "(Lcom/sumsub/sns/internal/videoident/presentation/a$c$b;)V", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", MessageBundle.TITLE_ENTRY, "getStatus", "status", "getTime", "time", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public final class LanguageItemViewHolder extends RecyclerView.C {
        public LanguageItemViewHolder(View view) {
            super(view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: bind$lambda-0, reason: not valid java name */
        public static final void m76bind$lambda0(LanguageItemAdapter languageItemAdapter, a.c.b bVar, View view) {
            InterfaceC0646l<a.c.b, p> selectionCallback = languageItemAdapter.getSelectionCallback();
            if (selectionCallback != null) {
                selectionCallback.invoke(bVar);
            }
        }

        private final TextView getStatus() {
            return (TextView) this.itemView.findViewById(R$id.sns_status);
        }

        private final TextView getTime() {
            return (TextView) this.itemView.findViewById(R$id.sns_time);
        }

        private final TextView getTitle() {
            return (TextView) this.itemView.findViewById(R$id.sns_item_title);
        }

        public final void bind(a.c.b item) {
            TextView title = getTitle();
            if (title != null) {
                i.a(title, item.k());
            }
            TextView status = getStatus();
            if (status != null) {
                i.a(status, item.i());
            }
            TextView time = getTime();
            if (time != null) {
                i.a(time, item.j());
            }
            View view = this.itemView;
            Boolean h9 = item.h();
            view.setSelected(h9 != null ? h9.booleanValue() : false);
            this.itemView.setOnClickListener(new f(19, LanguageItemAdapter.this, item));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    public final List<a.c.b> getItems() {
        return this.items;
    }

    public final InterfaceC0646l<a.c.b, p> getSelectionCallback() {
        return this.selectionCallback;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setItems(List<a.c.b> list) {
        this.items = list;
        notifyDataSetChanged();
    }

    public final void setSelectionCallback(InterfaceC0646l<? super a.c.b, p> interfaceC0646l) {
        this.selectionCallback = interfaceC0646l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(LanguageItemViewHolder holder, int position) {
        holder.bind(this.items.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public LanguageItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        SNSVideoIdentLanguageItemView sNSVideoIdentLanguageItemView = new SNSVideoIdentLanguageItemView(parent.getContext(), null, 0, 0, 14, null);
        sNSVideoIdentLanguageItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new LanguageItemViewHolder(sNSVideoIdentLanguageItemView);
    }
}
