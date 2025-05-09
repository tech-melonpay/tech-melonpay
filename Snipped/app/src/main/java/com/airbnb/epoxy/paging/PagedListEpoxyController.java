package com.airbnb.epoxy.paging;

import O9.p;
import android.os.Handler;
import androidx.paging.e;
import androidx.recyclerview.widget.q;
import ca.InterfaceC0635a;
import ca.InterfaceC0650p;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;

/* compiled from: PagedListEpoxyController.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 %*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001%B+\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0004¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\n2\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u001a\u001a\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\n2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001e¢\u0006\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/airbnb/epoxy/paging/PagedListEpoxyController;", "T", "Lcom/airbnb/epoxy/EpoxyController;", "Landroid/os/Handler;", "modelBuildingHandler", "diffingHandler", "Landroidx/recyclerview/widget/q$e;", "itemDiffCallback", "<init>", "(Landroid/os/Handler;Landroid/os/Handler;Landroid/support/v7/util/DiffUtil$ItemCallback;)V", "LO9/p;", "buildModels", "()V", "", "Lcom/airbnb/epoxy/EpoxyModel;", "models", "addModels", "(Ljava/util/List;)V", "", "currentPosition", "item", "buildItemModel", "(ILjava/lang/Object;)Lcom/airbnb/epoxy/EpoxyModel;", "Lcom/airbnb/epoxy/EpoxyViewHolder;", "holder", "boundModel", "position", "previouslyBoundModel", "onModelBound", "(Lcom/airbnb/epoxy/EpoxyViewHolder;Lcom/airbnb/epoxy/EpoxyModel;ILcom/airbnb/epoxy/EpoxyModel;)V", "Landroidx/paging/e;", "newList", "submitList", "(Landroidx/paging/e;)V", "Lcom/airbnb/epoxy/paging/PagedListModelCache;", "modelCache", "Lcom/airbnb/epoxy/paging/PagedListModelCache;", "Companion", "epoxy-paging_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public abstract class PagedListEpoxyController<T> extends EpoxyController {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final q.e<Object> DEFAULT_ITEM_DIFF_CALLBACK = new q.e<Object>() { // from class: com.airbnb.epoxy.paging.PagedListEpoxyController$Companion$DEFAULT_ITEM_DIFF_CALLBACK$1
        @Override // androidx.recyclerview.widget.q.e
        public boolean areContentsTheSame(Object oldItem, Object newItem) {
            return f.b(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.q.e
        public boolean areItemsTheSame(Object oldItem, Object newItem) {
            return f.b(oldItem, newItem);
        }
    };
    private final PagedListModelCache<T> modelCache;

    /* compiled from: PagedListEpoxyController.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/airbnb/epoxy/paging/PagedListEpoxyController$Companion;", "", "<init>", "()V", "Landroidx/recyclerview/widget/q$e;", "DEFAULT_ITEM_DIFF_CALLBACK", "Landroidx/recyclerview/widget/q$e;", "getDEFAULT_ITEM_DIFF_CALLBACK", "()Landroid/support/v7/util/DiffUtil$ItemCallback;", "epoxy-paging_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public final q.e<Object> getDEFAULT_ITEM_DIFF_CALLBACK() {
            return PagedListEpoxyController.DEFAULT_ITEM_DIFF_CALLBACK;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PagedListEpoxyController() {
        this(null, null, null, 7, null);
    }

    public void addModels(List<? extends EpoxyModel<?>> models) {
        super.add(models);
    }

    public abstract EpoxyModel<?> buildItemModel(int currentPosition, T item);

    @Override // com.airbnb.epoxy.EpoxyController
    public final void buildModels() {
        addModels(this.modelCache.getModels());
    }

    @Override // com.airbnb.epoxy.EpoxyController
    public void onModelBound(EpoxyViewHolder holder, EpoxyModel<?> boundModel, int position, EpoxyModel<?> previouslyBoundModel) {
        this.modelCache.loadAround(position);
    }

    public final void submitList(e<T> newList) {
        this.modelCache.submitList(newList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PagedListEpoxyController(android.os.Handler r1, android.os.Handler r2, androidx.recyclerview.widget.q.e r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 1
            if (r5 == 0) goto L6
            android.os.Handler r1 = com.airbnb.epoxy.EpoxyController.defaultModelBuildingHandler
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            android.os.Handler r2 = com.airbnb.epoxy.EpoxyController.defaultDiffingHandler
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L1d
            androidx.recyclerview.widget.q$e<java.lang.Object> r3 = com.airbnb.epoxy.paging.PagedListEpoxyController.DEFAULT_ITEM_DIFF_CALLBACK
            if (r3 == 0) goto L15
            goto L1d
        L15:
            kotlin.TypeCastException r1 = new kotlin.TypeCastException
            java.lang.String r2 = "null cannot be cast to non-null type android.support.v7.util.DiffUtil.ItemCallback<T>"
            r1.<init>(r2)
            throw r1
        L1d:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.paging.PagedListEpoxyController.<init>(android.os.Handler, android.os.Handler, androidx.recyclerview.widget.q$e, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public PagedListEpoxyController(Handler handler, Handler handler2, q.e<T> eVar) {
        super(handler, handler2);
        this.modelCache = new PagedListModelCache<>(new InterfaceC0650p<Integer, T, EpoxyModel<?>>() { // from class: com.airbnb.epoxy.paging.PagedListEpoxyController$modelCache$1
            {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0650p
            public /* bridge */ /* synthetic */ EpoxyModel<?> invoke(Integer num, Object obj) {
                return invoke(num.intValue(), (int) obj);
            }

            public final EpoxyModel<?> invoke(int i, T t3) {
                return PagedListEpoxyController.this.buildItemModel(i, t3);
            }
        }, new InterfaceC0635a<p>() { // from class: com.airbnb.epoxy.paging.PagedListEpoxyController$modelCache$2
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f3034a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                PagedListEpoxyController.this.requestModelBuild();
            }
        }, eVar, null, handler, 8, null);
    }
}
