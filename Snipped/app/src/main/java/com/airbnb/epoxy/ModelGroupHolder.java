package com.airbnb.epoxy;

import P9.s;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ModelGroupHolder.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 C2\u00020\u0001:\u0001CB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001a\u001a\u00020\u00062\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00172\f\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\t2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0014¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00128\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u00105\u001a\u0002048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b9\u0010.\u001a\u0004\b7\u00108R$\u0010;\u001a\u00020\t2\u0006\u0010:\u001a\u00020\t8\u0006@BX\u0086.¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010<R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lcom/airbnb/epoxy/ModelGroupHolder;", "Lcom/airbnb/epoxy/EpoxyHolder;", "Landroid/view/ViewParent;", "modelGroupParent", "<init>", "(Landroid/view/ViewParent;)V", "", "usingStubs", "()Z", "Landroid/view/ViewGroup;", "outermostRoot", "findChildContainer", "(Landroid/view/ViewGroup;)Landroid/view/ViewGroup;", "viewGroup", "", "Lcom/airbnb/epoxy/ViewStubData;", "createViewStubData", "(Landroid/view/ViewGroup;)Ljava/util/List;", "Ljava/util/ArrayList;", "stubs", "LO9/p;", "collectViewStubs", "(Landroid/view/ViewGroup;Ljava/util/ArrayList;)V", "Lcom/airbnb/epoxy/EpoxyModel;", "model1", "model2", "areSameViewType", "(Lcom/airbnb/epoxy/EpoxyModel;Lcom/airbnb/epoxy/EpoxyModel;)Z", "parent", "model", "Lcom/airbnb/epoxy/EpoxyViewHolder;", "getViewHolder", "(Landroid/view/ViewGroup;Lcom/airbnb/epoxy/EpoxyModel;)Lcom/airbnb/epoxy/EpoxyViewHolder;", "", "modelPosition", "removeAndRecycleView", "(I)V", "Landroid/view/View;", "itemView", "bindView", "(Landroid/view/View;)V", "Lcom/airbnb/epoxy/EpoxyModelGroup;", "group", "bindGroupIfNeeded", "(Lcom/airbnb/epoxy/EpoxyModelGroup;)V", "unbindGroup", "()V", "Landroid/view/ViewParent;", "viewHolders", "Ljava/util/ArrayList;", "getViewHolders", "()Ljava/util/ArrayList;", "Landroidx/recyclerview/widget/RecyclerView$t;", "viewPool", "Landroidx/recyclerview/widget/RecyclerView$t;", "getViewPool", "()Landroidx/recyclerview/widget/RecyclerView$t;", "getViewPool$annotations", "<set-?>", "rootView", "Landroid/view/ViewGroup;", "getRootView", "()Landroid/view/ViewGroup;", "childContainer", "Ljava/util/List;", "boundGroup", "Lcom/airbnb/epoxy/EpoxyModelGroup;", "Companion", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ModelGroupHolder extends EpoxyHolder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final HelperAdapter HELPER_ADAPTER = new HelperAdapter();
    private EpoxyModelGroup boundGroup;
    private ViewGroup childContainer;
    private final ViewParent modelGroupParent;
    private ViewGroup rootView;
    private List<ViewStubData> stubs;
    private final ArrayList<EpoxyViewHolder> viewHolders = new ArrayList<>(4);
    private final RecyclerView.t viewPool;

    /* compiled from: ModelGroupHolder.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/airbnb/epoxy/ModelGroupHolder$Companion;", "", "<init>", "()V", "Landroid/view/ViewParent;", Promotion.ACTION_VIEW, "Landroidx/recyclerview/widget/RecyclerView$t;", "findViewPool", "(Landroid/view/ViewParent;)Landroidx/recyclerview/widget/RecyclerView$t;", "Lcom/airbnb/epoxy/HelperAdapter;", "HELPER_ADAPTER", "Lcom/airbnb/epoxy/HelperAdapter;", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final RecyclerView.t findViewPool(ViewParent view) {
            RecyclerView.t tVar = null;
            while (tVar == null) {
                if (view instanceof RecyclerView) {
                    tVar = ((RecyclerView) view).getRecycledViewPool();
                } else {
                    ViewParent parent = view.getParent();
                    tVar = parent != null ? findViewPool(parent) : new LocalGroupRecycledViewPool();
                }
            }
            return tVar;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ModelGroupHolder(ViewParent viewParent) {
        this.modelGroupParent = viewParent;
        this.viewPool = INSTANCE.findViewPool(viewParent);
    }

    private final boolean areSameViewType(EpoxyModel<?> model1, EpoxyModel<?> model2) {
        return ViewTypeManager.getViewType(model1) == ViewTypeManager.getViewType(model2);
    }

    private final void collectViewStubs(ViewGroup viewGroup, ArrayList<ViewStubData> stubs) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                collectViewStubs((ViewGroup) childAt, stubs);
            } else if (childAt instanceof ViewStub) {
                stubs.add(new ViewStubData(viewGroup, (ViewStub) childAt, i));
            }
        }
    }

    private final List<ViewStubData> createViewStubData(ViewGroup viewGroup) {
        ArrayList<ViewStubData> arrayList = new ArrayList<>(4);
        collectViewStubs(viewGroup, arrayList);
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No view stubs found. If viewgroup is not empty it must contain ViewStubs.");
        }
        return arrayList;
    }

    private final ViewGroup findChildContainer(ViewGroup outermostRoot) {
        View findViewById = outermostRoot.findViewById(R.id.epoxy_model_group_child_container);
        ViewGroup viewGroup = findViewById instanceof ViewGroup ? (ViewGroup) findViewById : null;
        return viewGroup == null ? outermostRoot : viewGroup;
    }

    private final EpoxyViewHolder getViewHolder(ViewGroup parent, EpoxyModel<?> model) {
        int viewType = ViewTypeManager.getViewType(model);
        RecyclerView.C recycledView = this.viewPool.getRecycledView(viewType);
        EpoxyViewHolder epoxyViewHolder = recycledView instanceof EpoxyViewHolder ? (EpoxyViewHolder) recycledView : null;
        return epoxyViewHolder == null ? HELPER_ADAPTER.createViewHolder(this.modelGroupParent, model, parent, viewType) : epoxyViewHolder;
    }

    private final void removeAndRecycleView(int modelPosition) {
        if (usingStubs()) {
            List<ViewStubData> list = this.stubs;
            (list != null ? list : null).get(modelPosition).resetStub();
        } else {
            ViewGroup viewGroup = this.childContainer;
            (viewGroup != null ? viewGroup : null).removeViewAt(modelPosition);
        }
        EpoxyViewHolder remove = this.viewHolders.remove(modelPosition);
        remove.unbind();
        this.viewPool.putRecycledView(remove);
    }

    private final boolean usingStubs() {
        List<ViewStubData> list = this.stubs;
        if (list == null) {
            list = null;
        }
        return !list.isEmpty();
    }

    public final void bindGroupIfNeeded(EpoxyModelGroup group) {
        ViewGroup viewGroup;
        List<EpoxyModel<?>> list;
        int size;
        int size2;
        EpoxyModelGroup epoxyModelGroup = this.boundGroup;
        if (epoxyModelGroup == group) {
            return;
        }
        if (epoxyModelGroup != null && epoxyModelGroup.models.size() > group.models.size() && (size2 = group.models.size()) <= epoxyModelGroup.models.size() - 1) {
            while (true) {
                removeAndRecycleView(size);
                if (size == size2) {
                    break;
                } else {
                    size--;
                }
            }
        }
        this.boundGroup = group;
        List<EpoxyModel<?>> list2 = group.models;
        int size3 = list2.size();
        if (usingStubs()) {
            List<ViewStubData> list3 = this.stubs;
            if (list3 == null) {
                list3 = null;
            }
            if (list3.size() < size3) {
                StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("Insufficient view stubs for EpoxyModelGroup. ", size3, " models were provided but only ");
                List<ViewStubData> list4 = this.stubs;
                l10.append((list4 != null ? list4 : null).size());
                l10.append(" view stubs exist.");
                throw new IllegalStateException(l10.toString());
            }
        }
        this.viewHolders.ensureCapacity(size3);
        for (int i = 0; i < size3; i++) {
            EpoxyModel<?> epoxyModel = list2.get(i);
            EpoxyModel<?> epoxyModel2 = (epoxyModelGroup == null || (list = epoxyModelGroup.models) == null) ? null : (EpoxyModel) s.M(i, list);
            List<ViewStubData> list5 = this.stubs;
            if (list5 == null) {
                list5 = null;
            }
            ViewStubData viewStubData = (ViewStubData) s.M(i, list5);
            if ((viewStubData == null || (viewGroup = viewStubData.getViewGroup()) == null) && (viewGroup = this.childContainer) == null) {
                viewGroup = null;
            }
            if (epoxyModel2 != null) {
                if (!areSameViewType(epoxyModel2, epoxyModel)) {
                    removeAndRecycleView(i);
                }
            }
            EpoxyViewHolder viewHolder = getViewHolder(viewGroup, epoxyModel);
            if (viewStubData == null) {
                ViewGroup viewGroup2 = this.childContainer;
                if (viewGroup2 == null) {
                    viewGroup2 = null;
                }
                viewGroup2.addView(viewHolder.itemView, i);
            } else {
                viewStubData.setView(viewHolder.itemView, group.useViewStubLayoutParams(epoxyModel, i));
            }
            this.viewHolders.add(i, viewHolder);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyHolder
    public void bindView(View itemView) {
        List<ViewStubData> list;
        if (!(itemView instanceof ViewGroup)) {
            throw new IllegalStateException("The layout provided to EpoxyModelGroup must be a ViewGroup");
        }
        this.rootView = (ViewGroup) itemView;
        ViewGroup findChildContainer = findChildContainer(getRootView());
        this.childContainer = findChildContainer;
        if (findChildContainer == null) {
            findChildContainer = null;
        }
        if (findChildContainer.getChildCount() != 0) {
            ViewGroup viewGroup = this.childContainer;
            list = createViewStubData(viewGroup != null ? viewGroup : null);
        } else {
            list = EmptyList.f23104a;
        }
        this.stubs = list;
    }

    public final ViewGroup getRootView() {
        ViewGroup viewGroup = this.rootView;
        if (viewGroup != null) {
            return viewGroup;
        }
        return null;
    }

    public final ArrayList<EpoxyViewHolder> getViewHolders() {
        return this.viewHolders;
    }

    public final RecyclerView.t getViewPool() {
        return this.viewPool;
    }

    public final void unbindGroup() {
        if (this.boundGroup == null) {
            throw new IllegalStateException("Group is not bound");
        }
        int size = this.viewHolders.size();
        for (int i = 0; i < size; i++) {
            removeAndRecycleView(this.viewHolders.size() - 1);
        }
        this.boundGroup = null;
    }

    public static /* synthetic */ void getViewPool$annotations() {
    }
}
