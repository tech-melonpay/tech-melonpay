package com.airbnb.epoxy;

import O9.p;
import android.view.View;
import android.view.ViewGroup;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.EpoxyModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import ja.d;
import ja.h;
import ja.l;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.f;

/* compiled from: WrappedEpoxyModelClickListener.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0001*\u0004\b\u0001\u0010\u00032\u00020\u00042\u00020\u0005:\u0001.B\u001f\b\u0016\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0016\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\n¢\u0006\u0004\b\b\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u0018*\u00020\u0017H\u0080\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\"\u0010#\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010%\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0'*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001e\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0'*\u00020\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/airbnb/epoxy/WrappedEpoxyModelClickListener;", "Lcom/airbnb/epoxy/EpoxyModel;", "T", "V", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnLongClickListener;", "Lcom/airbnb/epoxy/OnModelClickListener;", "clickListener", "<init>", "(Lcom/airbnb/epoxy/OnModelClickListener;)V", "Lcom/airbnb/epoxy/OnModelLongClickListener;", "(Lcom/airbnb/epoxy/OnModelLongClickListener;)V", "Landroid/view/View;", Promotion.ACTION_VIEW, "Lcom/airbnb/epoxy/WrappedEpoxyModelClickListener$ClickedModelInfo;", "getClickedModelInfo", "(Landroid/view/View;)Lcom/airbnb/epoxy/WrappedEpoxyModelClickListener$ClickedModelInfo;", "LO9/p;", "onClick", "(Landroid/view/View;)V", "", "onLongClick", "(Landroid/view/View;)Z", "Landroid/view/ViewGroup;", "", "iterator$epoxy_adapter_release", "(Landroid/view/ViewGroup;)Ljava/util/Iterator;", "iterator", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "originalClickListener", "Lcom/airbnb/epoxy/OnModelClickListener;", "originalLongClickListener", "Lcom/airbnb/epoxy/OnModelLongClickListener;", "Lja/h;", "getAllViewsInHierarchy", "(Landroid/view/View;)Lja/h;", "allViewsInHierarchy", "getChildren$epoxy_adapter_release", "(Landroid/view/ViewGroup;)Lja/h;", "children", "ClickedModelInfo", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WrappedEpoxyModelClickListener<T extends EpoxyModel<?>, V> implements View.OnClickListener, View.OnLongClickListener {
    private final OnModelClickListener<T, V> originalClickListener;
    private final OnModelLongClickListener<T, V> originalLongClickListener;

    /* compiled from: WrappedEpoxyModelClickListener.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B!\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/airbnb/epoxy/WrappedEpoxyModelClickListener$ClickedModelInfo;", "", "model", "Lcom/airbnb/epoxy/EpoxyModel;", "adapterPosition", "", "boundObject", "(Lcom/airbnb/epoxy/EpoxyModel;ILjava/lang/Object;)V", "getAdapterPosition", "()I", "getBoundObject", "()Ljava/lang/Object;", "getModel", "()Lcom/airbnb/epoxy/EpoxyModel;", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ClickedModelInfo {
        private final int adapterPosition;
        private final Object boundObject;
        private final EpoxyModel<?> model;

        public ClickedModelInfo(EpoxyModel<?> epoxyModel, int i, Object obj) {
            this.model = epoxyModel;
            this.adapterPosition = i;
            this.boundObject = obj;
        }

        public final int getAdapterPosition() {
            return this.adapterPosition;
        }

        public final Object getBoundObject() {
            return this.boundObject;
        }

        public final EpoxyModel<?> getModel() {
            return this.model;
        }
    }

    public WrappedEpoxyModelClickListener(OnModelClickListener<T, V> onModelClickListener) {
        if (onModelClickListener == null) {
            throw new IllegalArgumentException("Click listener cannot be null".toString());
        }
        this.originalClickListener = onModelClickListener;
        this.originalLongClickListener = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h<View> getAllViewsInHierarchy(View view) {
        return view instanceof ViewGroup ? l.c(l.e(kotlin.sequences.a.i(getChildren$epoxy_adapter_release((ViewGroup) view), new InterfaceC0646l<View, h<? extends View>>(this) { // from class: com.airbnb.epoxy.WrappedEpoxyModelClickListener$allViewsInHierarchy$1
            final /* synthetic */ WrappedEpoxyModelClickListener<T, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // ca.InterfaceC0646l
            public final h<View> invoke(View view2) {
                return l.c(l.e(l.e(view2), view2 instanceof ViewGroup ? this.this$0.getAllViewsInHierarchy(view2) : d.f22561a));
            }
        }), l.e(view))) : l.e(view);
    }

    private final ClickedModelInfo getClickedModelInfo(View view) {
        EpoxyViewHolder epoxyHolderForChildView = ListenersUtils.getEpoxyHolderForChildView(view);
        if (epoxyHolderForChildView == null) {
            throw new IllegalStateException("Could not find RecyclerView holder for clicked view".toString());
        }
        int adapterPosition = epoxyHolderForChildView.getAdapterPosition();
        Object obj = null;
        if (adapterPosition == -1) {
            return null;
        }
        Object objectToBind = epoxyHolderForChildView.objectToBind();
        if (objectToBind instanceof ModelGroupHolder) {
            Iterator<T> it = ((ModelGroupHolder) objectToBind).getViewHolders().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (kotlin.sequences.a.f(getAllViewsInHierarchy(((EpoxyViewHolder) next).itemView), view)) {
                    obj = next;
                    break;
                }
            }
            EpoxyViewHolder epoxyViewHolder = (EpoxyViewHolder) obj;
            if (epoxyViewHolder != null) {
                epoxyHolderForChildView = epoxyViewHolder;
            }
        }
        return new ClickedModelInfo(epoxyHolderForChildView.getModel(), adapterPosition, epoxyHolderForChildView.objectToBind());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WrappedEpoxyModelClickListener)) {
            return false;
        }
        OnModelClickListener<T, V> onModelClickListener = this.originalClickListener;
        if (onModelClickListener == null ? ((WrappedEpoxyModelClickListener) other).originalClickListener != null : !f.b(onModelClickListener, ((WrappedEpoxyModelClickListener) other).originalClickListener)) {
            return false;
        }
        OnModelLongClickListener<T, V> onModelLongClickListener = this.originalLongClickListener;
        return onModelLongClickListener != null ? f.b(onModelLongClickListener, ((WrappedEpoxyModelClickListener) other).originalLongClickListener) : ((WrappedEpoxyModelClickListener) other).originalLongClickListener == null;
    }

    public final h<View> getChildren$epoxy_adapter_release(final ViewGroup viewGroup) {
        return new h<View>(this) { // from class: com.airbnb.epoxy.WrappedEpoxyModelClickListener$children$1
            final /* synthetic */ WrappedEpoxyModelClickListener<T, V> this$0;

            {
                this.this$0 = this;
            }

            @Override // ja.h
            public Iterator<View> iterator() {
                return this.this$0.iterator$epoxy_adapter_release(viewGroup);
            }
        };
    }

    public int hashCode() {
        OnModelClickListener<T, V> onModelClickListener = this.originalClickListener;
        int hashCode = (onModelClickListener != null ? onModelClickListener.hashCode() : 0) * 31;
        OnModelLongClickListener<T, V> onModelLongClickListener = this.originalLongClickListener;
        return hashCode + (onModelLongClickListener != null ? onModelLongClickListener.hashCode() : 0);
    }

    public final Iterator<View> iterator$epoxy_adapter_release(ViewGroup viewGroup) {
        return new WrappedEpoxyModelClickListener$iterator$1(viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        p pVar;
        ClickedModelInfo clickedModelInfo = getClickedModelInfo(view);
        if (clickedModelInfo == null) {
            return;
        }
        OnModelClickListener<T, V> onModelClickListener = this.originalClickListener;
        if (onModelClickListener != 0) {
            onModelClickListener.onClick(clickedModelInfo.getModel(), clickedModelInfo.getBoundObject(), view, clickedModelInfo.getAdapterPosition());
            pVar = p.f3034a;
        } else {
            pVar = null;
        }
        if (pVar == null) {
            throw new IllegalStateException("Original click listener is null".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        ClickedModelInfo clickedModelInfo = getClickedModelInfo(view);
        if (clickedModelInfo == null) {
            return false;
        }
        OnModelLongClickListener<T, V> onModelLongClickListener = this.originalLongClickListener;
        if (onModelLongClickListener != 0) {
            return onModelLongClickListener.onLongClick(clickedModelInfo.getModel(), clickedModelInfo.getBoundObject(), view, clickedModelInfo.getAdapterPosition());
        }
        throw new IllegalStateException("Original long click listener is null".toString());
    }

    public WrappedEpoxyModelClickListener(OnModelLongClickListener<T, V> onModelLongClickListener) {
        if (onModelLongClickListener != null) {
            this.originalLongClickListener = onModelLongClickListener;
            this.originalClickListener = null;
            return;
        }
        throw new IllegalArgumentException("Click listener cannot be null".toString());
    }
}
