package com.airbnb.epoxy;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;

/* compiled from: EpoxyVisibilityTracker.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\n\b\u0016\u0018\u0000 N2\u00020\u0001:\u0003NOPB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0003J!\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J'\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\u001a\u0010\"J/\u0010#\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010\bJ\u0017\u0010'\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010\bR\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020,0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u000602R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u000605R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010;\u001a\b\u0012\u0002\b\u0003\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\"\u0010B\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010A\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010H\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M¨\u0006Q"}, d2 = {"Lcom/airbnb/epoxy/EpoxyVisibilityTracker;", "", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "LO9/p;", "attach", "(Landroidx/recyclerview/widget/RecyclerView;)V", "detach", "clearVisibilityStates", "requestVisibilityCheck", "", "debug", "", "checkItemAnimator", "processChangeEvent", "(Ljava/lang/String;Z)V", "Landroid/view/View;", "detachedView", "processChangeEventWithDetachedView", "(Landroid/view/View;Ljava/lang/String;)V", "processNewAdapterIfNecessary", "child", "detachEvent", "eventOriginForDebug", "processChild", "(Landroid/view/View;ZLjava/lang/String;)V", "Lcom/airbnb/epoxy/ModelGroupHolder;", "epoxyHolder", "processModelGroupChildren", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/airbnb/epoxy/ModelGroupHolder;ZLjava/lang/String;)V", "Lcom/airbnb/epoxy/EpoxyViewHolder;", "viewHolder", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ZLjava/lang/String;Lcom/airbnb/epoxy/EpoxyViewHolder;)V", "processVisibilityEvents", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/airbnb/epoxy/EpoxyViewHolder;ZLjava/lang/String;)Z", "childRecyclerView", "processChildRecyclerViewAttached", "processChildRecyclerViewDetached", "Landroidx/recyclerview/widget/RecyclerView$k$a;", "itemAnimatorFinishedListener", "Landroidx/recyclerview/widget/RecyclerView$k$a;", "Landroid/util/SparseArray;", "Lcom/airbnb/epoxy/EpoxyVisibilityItem;", "visibilityIdToItemMap", "Landroid/util/SparseArray;", "", "visibilityIdToItems", "Ljava/util/List;", "Lcom/airbnb/epoxy/EpoxyVisibilityTracker$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/airbnb/epoxy/EpoxyVisibilityTracker$Listener;", "Lcom/airbnb/epoxy/EpoxyVisibilityTracker$DataObserver;", "observer", "Lcom/airbnb/epoxy/EpoxyVisibilityTracker$DataObserver;", "attachedRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "lastAdapterSeen", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "", "nestedTrackers", "Ljava/util/Map;", "visibleDataChanged", "Z", "onChangedEnabled", "getOnChangedEnabled", "()Z", "setOnChangedEnabled", "(Z)V", "", "partialImpressionThresholdPercentage", "Ljava/lang/Integer;", "getPartialImpressionThresholdPercentage", "()Ljava/lang/Integer;", "setPartialImpressionThresholdPercentage", "(Ljava/lang/Integer;)V", "Companion", "DataObserver", "Listener", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class EpoxyVisibilityTracker {
    public static final boolean DEBUG_LOG = false;
    private static final String TAG = "EpoxyVisibilityTracker";
    private RecyclerView attachedRecyclerView;
    private RecyclerView.Adapter<?> lastAdapterSeen;
    private Integer partialImpressionThresholdPercentage;
    private boolean visibleDataChanged;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int TAG_ID = R.id.epoxy_visibility_tracker;
    private final RecyclerView.k.a itemAnimatorFinishedListener = new RecyclerView.k.a() { // from class: com.airbnb.epoxy.a
        @Override // androidx.recyclerview.widget.RecyclerView.k.a
        public final void a() {
            EpoxyVisibilityTracker.this.processChangeEvent("ItemAnimatorFinishedListener.onAnimationsFinished", false);
        }
    };
    private final SparseArray<EpoxyVisibilityItem> visibilityIdToItemMap = new SparseArray<>();
    private final List<EpoxyVisibilityItem> visibilityIdToItems = new ArrayList();
    private final Listener listener = new Listener();
    private final DataObserver observer = new DataObserver();
    private final Map<RecyclerView, EpoxyVisibilityTracker> nestedTrackers = new HashMap();
    private boolean onChangedEnabled = true;

    /* compiled from: EpoxyVisibilityTracker.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/airbnb/epoxy/EpoxyVisibilityTracker$Companion;", "", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lcom/airbnb/epoxy/EpoxyVisibilityTracker;", "getTracker", "(Landroidx/recyclerview/widget/RecyclerView;)Lcom/airbnb/epoxy/EpoxyVisibilityTracker;", "tracker", "LO9/p;", "setTracker", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/airbnb/epoxy/EpoxyVisibilityTracker;)V", "", "DEBUG_LOG", "Z", "", "TAG", "Ljava/lang/String;", "", "TAG_ID", "I", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EpoxyVisibilityTracker getTracker(RecyclerView recyclerView) {
            return (EpoxyVisibilityTracker) recyclerView.getTag(EpoxyVisibilityTracker.TAG_ID);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setTracker(RecyclerView recyclerView, EpoxyVisibilityTracker tracker) {
            recyclerView.setTag(EpoxyVisibilityTracker.TAG_ID, tracker);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: EpoxyVisibilityTracker.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\tJ\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\tJ'\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/airbnb/epoxy/EpoxyVisibilityTracker$DataObserver;", "Landroidx/recyclerview/widget/RecyclerView$h;", "<init>", "(Lcom/airbnb/epoxy/EpoxyVisibilityTracker;)V", "", "fromPosition", "toPosition", "LO9/p;", "onItemMoved", "(II)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "notEpoxyManaged", "(Landroidx/recyclerview/widget/RecyclerView;)Z", "onChanged", "()V", "positionStart", "itemCount", "onItemRangeInserted", "onItemRangeRemoved", "onItemRangeMoved", "(III)V", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
    public final class DataObserver extends RecyclerView.h {
        public DataObserver() {
        }

        private final boolean notEpoxyManaged(RecyclerView recyclerView) {
            return recyclerView == null || !(recyclerView.getAdapter() instanceof BaseEpoxyAdapter);
        }

        private final void onItemMoved(int fromPosition, int toPosition) {
            if (notEpoxyManaged(EpoxyVisibilityTracker.this.attachedRecyclerView)) {
                return;
            }
            for (EpoxyVisibilityItem epoxyVisibilityItem : EpoxyVisibilityTracker.this.visibilityIdToItems) {
                int adapterPosition = epoxyVisibilityItem.getAdapterPosition();
                if (adapterPosition == fromPosition) {
                    epoxyVisibilityItem.shiftBy(toPosition - fromPosition);
                    EpoxyVisibilityTracker.this.visibleDataChanged = true;
                } else if (fromPosition < toPosition) {
                    if (fromPosition + 1 <= adapterPosition && adapterPosition <= toPosition) {
                        epoxyVisibilityItem.shiftBy(-1);
                        EpoxyVisibilityTracker.this.visibleDataChanged = true;
                    }
                } else if (fromPosition > toPosition && toPosition <= adapterPosition && adapterPosition < fromPosition) {
                    epoxyVisibilityItem.shiftBy(1);
                    EpoxyVisibilityTracker.this.visibleDataChanged = true;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onChanged() {
            if (notEpoxyManaged(EpoxyVisibilityTracker.this.attachedRecyclerView)) {
                return;
            }
            EpoxyVisibilityTracker.this.visibilityIdToItemMap.clear();
            EpoxyVisibilityTracker.this.visibilityIdToItems.clear();
            EpoxyVisibilityTracker.this.visibleDataChanged = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onItemRangeInserted(int positionStart, int itemCount) {
            if (notEpoxyManaged(EpoxyVisibilityTracker.this.attachedRecyclerView)) {
                return;
            }
            for (EpoxyVisibilityItem epoxyVisibilityItem : EpoxyVisibilityTracker.this.visibilityIdToItems) {
                if (epoxyVisibilityItem.getAdapterPosition() >= positionStart) {
                    EpoxyVisibilityTracker.this.visibleDataChanged = true;
                    epoxyVisibilityItem.shiftBy(itemCount);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
            if (notEpoxyManaged(EpoxyVisibilityTracker.this.attachedRecyclerView)) {
                return;
            }
            for (int i = 0; i < itemCount; i++) {
                onItemMoved(fromPosition + i, toPosition + i);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onItemRangeRemoved(int positionStart, int itemCount) {
            if (notEpoxyManaged(EpoxyVisibilityTracker.this.attachedRecyclerView)) {
                return;
            }
            for (EpoxyVisibilityItem epoxyVisibilityItem : EpoxyVisibilityTracker.this.visibilityIdToItems) {
                if (epoxyVisibilityItem.getAdapterPosition() >= positionStart) {
                    EpoxyVisibilityTracker.this.visibleDataChanged = true;
                    epoxyVisibilityItem.shiftBy(-itemCount);
                }
            }
        }
    }

    /* compiled from: EpoxyVisibilityTracker.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005JW\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/airbnb/epoxy/EpoxyVisibilityTracker$Listener;", "Landroidx/recyclerview/widget/RecyclerView$s;", "Landroid/view/View$OnLayoutChangeListener;", "Landroidx/recyclerview/widget/RecyclerView$p;", "<init>", "(Lcom/airbnb/epoxy/EpoxyVisibilityTracker;)V", "Landroid/view/View;", "recyclerView", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "LO9/p;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "dy", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "child", "onChildViewAttachedToWindow", "(Landroid/view/View;)V", "onChildViewDetachedFromWindow", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
    public final class Listener extends RecyclerView.s implements View.OnLayoutChangeListener, RecyclerView.p {
        public Listener() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void onChildViewAttachedToWindow(View child) {
            if (child instanceof RecyclerView) {
                EpoxyVisibilityTracker.this.processChildRecyclerViewAttached((RecyclerView) child);
            }
            EpoxyVisibilityTracker.this.processChild(child, false, "onChildViewAttachedToWindow");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void onChildViewDetachedFromWindow(View child) {
            if (child instanceof RecyclerView) {
                EpoxyVisibilityTracker.this.processChildRecyclerViewDetached((RecyclerView) child);
            }
            if (!EpoxyVisibilityTracker.this.visibleDataChanged) {
                EpoxyVisibilityTracker.this.processChild(child, true, "onChildViewDetachedFromWindow");
            } else {
                EpoxyVisibilityTracker.this.processChangeEventWithDetachedView(child, "onChildViewDetachedFromWindow");
                EpoxyVisibilityTracker.this.visibleDataChanged = false;
            }
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View recyclerView, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            EpoxyVisibilityTracker.processChangeEvent$default(EpoxyVisibilityTracker.this, "onLayoutChange", false, 2, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            EpoxyVisibilityTracker.processChangeEvent$default(EpoxyVisibilityTracker.this, "onScrolled", false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processChangeEvent(String debug, boolean checkItemAnimator) {
        RecyclerView recyclerView = this.attachedRecyclerView;
        if (recyclerView == null) {
            return;
        }
        RecyclerView.k itemAnimator = recyclerView.getItemAnimator();
        if (!checkItemAnimator || itemAnimator == null) {
            processChangeEventWithDetachedView(null, debug);
            return;
        }
        RecyclerView.k.a aVar = this.itemAnimatorFinishedListener;
        boolean f10 = itemAnimator.f();
        if (aVar != null) {
            if (f10) {
                itemAnimator.f7492b.add(aVar);
            } else {
                aVar.a();
            }
        }
        if (f10) {
            processChangeEventWithDetachedView(null, debug);
        }
    }

    public static /* synthetic */ void processChangeEvent$default(EpoxyVisibilityTracker epoxyVisibilityTracker, String str, boolean z10, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processChangeEvent");
        }
        if ((i & 2) != 0) {
            z10 = true;
        }
        epoxyVisibilityTracker.processChangeEvent(str, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processChangeEventWithDetachedView(View detachedView, String debug) {
        RecyclerView recyclerView = this.attachedRecyclerView;
        if (recyclerView == null) {
            return;
        }
        processNewAdapterIfNecessary();
        if (detachedView != null) {
            processChild(detachedView, true, debug);
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null && childAt != detachedView) {
                processChild(childAt, false, debug);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processChild(View child, boolean detachEvent, String eventOriginForDebug) {
        RecyclerView recyclerView = this.attachedRecyclerView;
        if (recyclerView == null) {
            return;
        }
        RecyclerView.C childViewHolder = (child.getParent() == null || child.getParent() == recyclerView) ? recyclerView.getChildViewHolder(child) : null;
        if (childViewHolder instanceof EpoxyViewHolder) {
            EpoxyViewHolder epoxyViewHolder = (EpoxyViewHolder) childViewHolder;
            EpoxyHolder holder = epoxyViewHolder.getHolder();
            processChild(recyclerView, child, detachEvent, eventOriginForDebug, epoxyViewHolder);
            if (holder instanceof ModelGroupHolder) {
                processModelGroupChildren(recyclerView, (ModelGroupHolder) holder, detachEvent, eventOriginForDebug);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processChildRecyclerViewAttached(RecyclerView childRecyclerView) {
        EpoxyVisibilityTracker tracker = INSTANCE.getTracker(childRecyclerView);
        if (tracker == null) {
            tracker = new EpoxyVisibilityTracker();
            tracker.partialImpressionThresholdPercentage = this.partialImpressionThresholdPercentage;
            tracker.attach(childRecyclerView);
        }
        this.nestedTrackers.put(childRecyclerView, tracker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processChildRecyclerViewDetached(RecyclerView childRecyclerView) {
        this.nestedTrackers.remove(childRecyclerView);
    }

    private final void processModelGroupChildren(RecyclerView recyclerView, ModelGroupHolder epoxyHolder, boolean detachEvent, String eventOriginForDebug) {
        Iterator<EpoxyViewHolder> it = epoxyHolder.getViewHolders().iterator();
        while (it.hasNext()) {
            EpoxyViewHolder next = it.next();
            View view = next.itemView;
            if (view instanceof RecyclerView) {
                if (detachEvent) {
                    processChildRecyclerViewDetached((RecyclerView) view);
                } else {
                    processChildRecyclerViewAttached((RecyclerView) view);
                }
            }
            processChild(recyclerView, next.itemView, detachEvent, eventOriginForDebug, next);
        }
    }

    private final void processNewAdapterIfNecessary() {
        RecyclerView.Adapter<?> adapter;
        RecyclerView recyclerView = this.attachedRecyclerView;
        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null || f.b(this.lastAdapterSeen, adapter)) {
            return;
        }
        RecyclerView.Adapter<?> adapter2 = this.lastAdapterSeen;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.observer);
        }
        adapter.registerAdapterDataObserver(this.observer);
        this.lastAdapterSeen = adapter;
    }

    private final boolean processVisibilityEvents(RecyclerView recyclerView, EpoxyViewHolder epoxyHolder, boolean detachEvent, String eventOriginForDebug) {
        View view = epoxyHolder.itemView;
        int identityHashCode = System.identityHashCode(view);
        EpoxyVisibilityItem epoxyVisibilityItem = this.visibilityIdToItemMap.get(identityHashCode);
        if (epoxyVisibilityItem == null) {
            epoxyVisibilityItem = new EpoxyVisibilityItem(Integer.valueOf(epoxyHolder.getAdapterPosition()));
            this.visibilityIdToItemMap.put(identityHashCode, epoxyVisibilityItem);
            this.visibilityIdToItems.add(epoxyVisibilityItem);
        } else if (epoxyHolder.getAdapterPosition() != -1) {
            EpoxyVisibilityItem epoxyVisibilityItem2 = epoxyVisibilityItem;
            if (epoxyVisibilityItem2.getAdapterPosition() != epoxyHolder.getAdapterPosition()) {
                epoxyVisibilityItem2.reset(epoxyHolder.getAdapterPosition());
            }
        }
        EpoxyVisibilityItem epoxyVisibilityItem3 = epoxyVisibilityItem;
        if (!epoxyVisibilityItem3.update(view, recyclerView, detachEvent)) {
            return false;
        }
        epoxyVisibilityItem3.handleVisible(epoxyHolder, detachEvent);
        Integer num = this.partialImpressionThresholdPercentage;
        if (num != null) {
            epoxyVisibilityItem3.handlePartialImpressionVisible(epoxyHolder, detachEvent, num.intValue());
        }
        epoxyVisibilityItem3.handleFocus(epoxyHolder, detachEvent);
        epoxyVisibilityItem3.handleFullImpressionVisible(epoxyHolder, detachEvent);
        return epoxyVisibilityItem3.handleChanged(epoxyHolder, this.onChangedEnabled);
    }

    public void attach(RecyclerView recyclerView) {
        this.attachedRecyclerView = recyclerView;
        recyclerView.addOnScrollListener(this.listener);
        recyclerView.addOnLayoutChangeListener(this.listener);
        recyclerView.addOnChildAttachStateChangeListener(this.listener);
        INSTANCE.setTracker(recyclerView, this);
    }

    public final void clearVisibilityStates() {
        this.visibilityIdToItemMap.clear();
        this.visibilityIdToItems.clear();
    }

    public void detach(RecyclerView recyclerView) {
        recyclerView.removeOnScrollListener(this.listener);
        recyclerView.removeOnLayoutChangeListener(this.listener);
        recyclerView.removeOnChildAttachStateChangeListener(this.listener);
        INSTANCE.setTracker(recyclerView, null);
        this.attachedRecyclerView = null;
    }

    public final boolean getOnChangedEnabled() {
        return this.onChangedEnabled;
    }

    public final Integer getPartialImpressionThresholdPercentage() {
        return this.partialImpressionThresholdPercentage;
    }

    public final void requestVisibilityCheck() {
        processChangeEvent$default(this, "requestVisibilityCheck", false, 2, null);
    }

    public final void setOnChangedEnabled(boolean z10) {
        this.onChangedEnabled = z10;
    }

    public final void setPartialImpressionThresholdPercentage(Integer num) {
        this.partialImpressionThresholdPercentage = num;
    }

    private final void processChild(RecyclerView recyclerView, View child, boolean detachEvent, String eventOriginForDebug, EpoxyViewHolder viewHolder) {
        EpoxyVisibilityTracker epoxyVisibilityTracker;
        if (processVisibilityEvents(recyclerView, viewHolder, detachEvent, eventOriginForDebug) && (child instanceof RecyclerView) && (epoxyVisibilityTracker = this.nestedTrackers.get(child)) != null) {
            processChangeEvent$default(epoxyVisibilityTracker, "parent", false, 2, null);
        }
    }
}
