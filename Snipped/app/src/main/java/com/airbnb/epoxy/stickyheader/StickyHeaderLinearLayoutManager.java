package com.airbnb.epoxy.stickyheader;

import C.v;
import O9.p;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.camera.core.impl.utils.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ca.InterfaceC0635a;
import com.airbnb.epoxy.BaseEpoxyAdapter;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.analytics.FirebaseAnalytics;
import ha.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;

/* compiled from: StickyHeaderLinearLayoutManager.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002vwB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0012\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f2\f\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\n\u0010\u001c\u001a\u00060\u001bR\u00020\n2\u0006\u0010\u0017\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\n\u0010\u001c\u001a\u00060\u001bR\u00020\n2\u0006\u0010\u0017\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\u001fJ#\u0010\"\u001a\u00020\f2\n\u0010\u001c\u001a\u00060\u001bR\u00020\n2\u0006\u0010\u0017\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u001dH\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u001dH\u0016¢\u0006\u0004\b,\u0010+J\u0017\u0010-\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u001dH\u0016¢\u0006\u0004\b-\u0010+J\u0017\u0010.\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u001dH\u0016¢\u0006\u0004\b.\u0010+J\u0017\u0010/\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u001dH\u0016¢\u0006\u0004\b/\u0010+J\u0017\u00100\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u001dH\u0016¢\u0006\u0004\b0\u0010+J\u0019\u00103\u001a\u0004\u0018\u0001022\u0006\u00101\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u00104J5\u00108\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\u00042\n\u0010\u001c\u001a\u00060\u001bR\u00020\n2\u0006\u0010\u0017\u001a\u00020\u001dH\u0016¢\u0006\u0004\b8\u00109J\u0015\u0010<\u001a\u00020\f2\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\u00020\f2\u0006\u0010>\u001a\u00020:¢\u0006\u0004\b?\u0010=J\u0015\u0010A\u001a\u00020\u00062\u0006\u0010@\u001a\u000205¢\u0006\u0004\bA\u0010BJ\u001d\u0010C\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000fH\u0002¢\u0006\u0004\bC\u0010DJ'\u0010(\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010FJ#\u0010J\u001a\u00028\u0000\"\u0004\b\u0000\u0010G2\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000HH\u0002¢\u0006\u0004\bJ\u0010KJ#\u0010M\u001a\u00020\f2\n\u0010\u001c\u001a\u00060\u001bR\u00020\n2\u0006\u0010L\u001a\u00020\u0006H\u0002¢\u0006\u0004\bM\u0010NJ#\u0010O\u001a\u00020\f2\n\u0010\u001c\u001a\u00060\u001bR\u00020\n2\u0006\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\bO\u0010PJ+\u0010R\u001a\u00020\f2\n\u0010\u001c\u001a\u00060\u001bR\u00020\n2\u0006\u0010Q\u001a\u0002052\u0006\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\f2\u0006\u0010Q\u001a\u000205H\u0002¢\u0006\u0004\bT\u0010UJ\u001d\u0010V\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0018\u00010\u001bR\u00020\nH\u0002¢\u0006\u0004\bV\u0010WJ\u001f\u0010Z\u001a\u00020\u00062\u0006\u0010@\u001a\u0002052\u0006\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020\u00062\u0006\u0010@\u001a\u000205H\u0002¢\u0006\u0004\b\\\u0010BJ!\u0010_\u001a\u00020:2\u0006\u0010]\u001a\u0002052\b\u0010^\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\b_\u0010`J!\u0010a\u001a\u00020:2\u0006\u0010]\u001a\u0002052\b\u0010^\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\ba\u0010`J\u0017\u0010b\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\bb\u0010cJ\u0017\u0010d\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\bd\u0010cJ\u0017\u0010e\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\be\u0010cJ\u001f\u0010f\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0004H\u0002¢\u0006\u0004\bf\u0010)R\u0018\u0010h\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010>\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010jR\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010jR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00040k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010o\u001a\u00060nR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010Q\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010qR\u0016\u0010r\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010sR\u0016\u0010u\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010s¨\u0006x"}, d2 = {"Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "context", "", "orientation", "", "reverseLayout", "<init>", "(Landroid/content/Context;IZ)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "LO9/p;", "onAttachedToWindow", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "oldAdapter", "newAdapter", "onAdapterChanged", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "dy", "Landroidx/recyclerview/widget/RecyclerView$u;", "recycler", "Landroidx/recyclerview/widget/RecyclerView$y;", "scrollVerticallyBy", "(ILandroidx/recyclerview/widget/RecyclerView$u;Landroidx/recyclerview/widget/RecyclerView$y;)I", "dx", "scrollHorizontallyBy", "onLayoutChildren", "(Landroidx/recyclerview/widget/RecyclerView$u;Landroidx/recyclerview/widget/RecyclerView$y;)V", "position", "scrollToPosition", "(I)V", "offset", "scrollToPositionWithOffset", "(II)V", "computeVerticalScrollExtent", "(Landroidx/recyclerview/widget/RecyclerView$y;)I", "computeVerticalScrollOffset", "computeVerticalScrollRange", "computeHorizontalScrollExtent", "computeHorizontalScrollOffset", "computeHorizontalScrollRange", "targetPosition", "Landroid/graphics/PointF;", "computeScrollVectorForPosition", "(I)Landroid/graphics/PointF;", "Landroid/view/View;", "focused", "focusDirection", "onFocusSearchFailed", "(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$u;Landroidx/recyclerview/widget/RecyclerView$y;)Landroid/view/View;", "", "translationY", "setStickyHeaderTranslationY", "(F)V", "translationX", "setStickyHeaderTranslationX", Promotion.ACTION_VIEW, "isStickyHeader", "(Landroid/view/View;)Z", "setAdapter", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "adjustForStickyHeader", "(IIZ)V", "T", "Lkotlin/Function0;", "operation", "restoreView", "(Lca/a;)Ljava/lang/Object;", "layout", "updateStickyHeader", "(Landroidx/recyclerview/widget/RecyclerView$u;Z)V", "createStickyHeader", "(Landroidx/recyclerview/widget/RecyclerView$u;I)V", "stickyHeader", "bindStickyHeader", "(Landroidx/recyclerview/widget/RecyclerView$u;Landroid/view/View;I)V", "measureAndLayout", "(Landroid/view/View;)V", "scrapStickyHeader", "(Landroidx/recyclerview/widget/RecyclerView$u;)V", "Landroidx/recyclerview/widget/RecyclerView$o;", "params", "isViewValidAnchor", "(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$o;)Z", "isViewOnBoundary", "headerView", "nextHeaderView", "getY", "(Landroid/view/View;Landroid/view/View;)F", "getX", "findHeaderIndex", "(I)I", "findHeaderIndexOrBefore", "findHeaderIndexOrNext", "setScrollState", "Lcom/airbnb/epoxy/BaseEpoxyAdapter;", "adapter", "Lcom/airbnb/epoxy/BaseEpoxyAdapter;", "F", "", "headerPositions", "Ljava/util/List;", "Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$HeaderPositionsAdapterDataObserver;", "headerPositionsObserver", "Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$HeaderPositionsAdapterDataObserver;", "Landroid/view/View;", "stickyHeaderPosition", "I", "scrollPosition", "scrollOffset", "HeaderPositionsAdapterDataObserver", "SavedState", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class StickyHeaderLinearLayoutManager extends LinearLayoutManager {
    private BaseEpoxyAdapter adapter;
    private final List<Integer> headerPositions;
    private final HeaderPositionsAdapterDataObserver headerPositionsObserver;
    private int scrollOffset;
    private int scrollPosition;
    private View stickyHeader;
    private int stickyHeaderPosition;
    private float translationX;
    private float translationY;

    /* compiled from: StickyHeaderLinearLayoutManager.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$HeaderPositionsAdapterDataObserver;", "Landroidx/recyclerview/widget/RecyclerView$h;", "<init>", "(Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;)V", "", FirebaseAnalytics.Param.INDEX, "LO9/p;", "sortHeaderAtIndex", "(I)V", "onChanged", "()V", "positionStart", "itemCount", "onItemRangeInserted", "(II)V", "onItemRangeRemoved", "fromPosition", "toPosition", "onItemRangeMoved", "(III)V", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
    public final class HeaderPositionsAdapterDataObserver extends RecyclerView.h {
        public HeaderPositionsAdapterDataObserver() {
        }

        private final void sortHeaderAtIndex(int index) {
            int intValue = ((Number) StickyHeaderLinearLayoutManager.this.headerPositions.remove(index)).intValue();
            int findHeaderIndexOrNext = StickyHeaderLinearLayoutManager.this.findHeaderIndexOrNext(intValue);
            if (findHeaderIndexOrNext != -1) {
                StickyHeaderLinearLayoutManager.this.headerPositions.add(findHeaderIndexOrNext, Integer.valueOf(intValue));
            } else {
                StickyHeaderLinearLayoutManager.this.headerPositions.add(Integer.valueOf(intValue));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onChanged() {
            StickyHeaderLinearLayoutManager.this.headerPositions.clear();
            BaseEpoxyAdapter baseEpoxyAdapter = StickyHeaderLinearLayoutManager.this.adapter;
            int itemCount = baseEpoxyAdapter != null ? baseEpoxyAdapter.getItemCount() : 0;
            for (int i = 0; i < itemCount; i++) {
                BaseEpoxyAdapter baseEpoxyAdapter2 = StickyHeaderLinearLayoutManager.this.adapter;
                if (baseEpoxyAdapter2 != null && baseEpoxyAdapter2.isStickyHeader(i)) {
                    StickyHeaderLinearLayoutManager.this.headerPositions.add(Integer.valueOf(i));
                }
            }
            if (StickyHeaderLinearLayoutManager.this.stickyHeader == null || StickyHeaderLinearLayoutManager.this.headerPositions.contains(Integer.valueOf(StickyHeaderLinearLayoutManager.this.stickyHeaderPosition))) {
                return;
            }
            StickyHeaderLinearLayoutManager.this.scrapStickyHeader(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onItemRangeInserted(int positionStart, int itemCount) {
            int size = StickyHeaderLinearLayoutManager.this.headerPositions.size();
            if (size > 0) {
                for (int findHeaderIndexOrNext = StickyHeaderLinearLayoutManager.this.findHeaderIndexOrNext(positionStart); findHeaderIndexOrNext != -1 && findHeaderIndexOrNext < size; findHeaderIndexOrNext++) {
                    StickyHeaderLinearLayoutManager.this.headerPositions.set(findHeaderIndexOrNext, Integer.valueOf(((Number) StickyHeaderLinearLayoutManager.this.headerPositions.get(findHeaderIndexOrNext)).intValue() + itemCount));
                }
            }
            int i = itemCount + positionStart;
            while (positionStart < i) {
                BaseEpoxyAdapter baseEpoxyAdapter = StickyHeaderLinearLayoutManager.this.adapter;
                if (baseEpoxyAdapter != null && baseEpoxyAdapter.isStickyHeader(positionStart)) {
                    int findHeaderIndexOrNext2 = StickyHeaderLinearLayoutManager.this.findHeaderIndexOrNext(positionStart);
                    if (findHeaderIndexOrNext2 != -1) {
                        StickyHeaderLinearLayoutManager.this.headerPositions.add(findHeaderIndexOrNext2, Integer.valueOf(positionStart));
                    } else {
                        StickyHeaderLinearLayoutManager.this.headerPositions.add(Integer.valueOf(positionStart));
                    }
                }
                positionStart++;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
            int size = StickyHeaderLinearLayoutManager.this.headerPositions.size();
            if (size > 0) {
                if (fromPosition < toPosition) {
                    for (int findHeaderIndexOrNext = StickyHeaderLinearLayoutManager.this.findHeaderIndexOrNext(fromPosition); findHeaderIndexOrNext != -1 && findHeaderIndexOrNext < size; findHeaderIndexOrNext++) {
                        int intValue = ((Number) StickyHeaderLinearLayoutManager.this.headerPositions.get(findHeaderIndexOrNext)).intValue();
                        if (intValue >= fromPosition && intValue < fromPosition + itemCount) {
                            StickyHeaderLinearLayoutManager.this.headerPositions.set(findHeaderIndexOrNext, Integer.valueOf(intValue - (toPosition - fromPosition)));
                            sortHeaderAtIndex(findHeaderIndexOrNext);
                        } else {
                            if (intValue < fromPosition + itemCount || intValue > toPosition) {
                                return;
                            }
                            StickyHeaderLinearLayoutManager.this.headerPositions.set(findHeaderIndexOrNext, Integer.valueOf(intValue - itemCount));
                            sortHeaderAtIndex(findHeaderIndexOrNext);
                        }
                    }
                    return;
                }
                for (int findHeaderIndexOrNext2 = StickyHeaderLinearLayoutManager.this.findHeaderIndexOrNext(toPosition); findHeaderIndexOrNext2 != -1 && findHeaderIndexOrNext2 < size; findHeaderIndexOrNext2++) {
                    int intValue2 = ((Number) StickyHeaderLinearLayoutManager.this.headerPositions.get(findHeaderIndexOrNext2)).intValue();
                    if (intValue2 >= fromPosition && intValue2 < fromPosition + itemCount) {
                        StickyHeaderLinearLayoutManager.this.headerPositions.set(findHeaderIndexOrNext2, Integer.valueOf((toPosition - fromPosition) + intValue2));
                        sortHeaderAtIndex(findHeaderIndexOrNext2);
                    } else {
                        if (toPosition > intValue2 || intValue2 > fromPosition) {
                            return;
                        }
                        StickyHeaderLinearLayoutManager.this.headerPositions.set(findHeaderIndexOrNext2, Integer.valueOf(intValue2 + itemCount));
                        sortHeaderAtIndex(findHeaderIndexOrNext2);
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onItemRangeRemoved(int positionStart, int itemCount) {
            int size = StickyHeaderLinearLayoutManager.this.headerPositions.size();
            if (size > 0) {
                int i = positionStart + itemCount;
                int i9 = i - 1;
                if (positionStart <= i9) {
                    while (true) {
                        int findHeaderIndex = StickyHeaderLinearLayoutManager.this.findHeaderIndex(i9);
                        if (findHeaderIndex != -1) {
                            StickyHeaderLinearLayoutManager.this.headerPositions.remove(findHeaderIndex);
                            size--;
                        }
                        if (i9 == positionStart) {
                            break;
                        } else {
                            i9--;
                        }
                    }
                }
                if (StickyHeaderLinearLayoutManager.this.stickyHeader != null && !StickyHeaderLinearLayoutManager.this.headerPositions.contains(Integer.valueOf(StickyHeaderLinearLayoutManager.this.stickyHeaderPosition))) {
                    StickyHeaderLinearLayoutManager.this.scrapStickyHeader(null);
                }
                for (int findHeaderIndexOrNext = StickyHeaderLinearLayoutManager.this.findHeaderIndexOrNext(i); findHeaderIndexOrNext != -1 && findHeaderIndexOrNext < size; findHeaderIndexOrNext++) {
                    StickyHeaderLinearLayoutManager.this.headerPositions.set(findHeaderIndexOrNext, Integer.valueOf(((Number) StickyHeaderLinearLayoutManager.this.headerPositions.get(findHeaderIndexOrNext)).intValue() - itemCount));
                }
            }
        }
    }

    /* compiled from: StickyHeaderLinearLayoutManager.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bJ \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u001f\u001a\u0004\b \u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;", "Landroid/os/Parcelable;", "superState", "", "scrollPosition", "scrollOffset", "<init>", "(Landroid/os/Parcelable;II)V", "component1", "()Landroid/os/Parcelable;", "component2", "()I", "component3", "copy", "(Landroid/os/Parcelable;II)Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "LO9/p;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Landroid/os/Parcelable;", "getSuperState", "I", "getScrollPosition", "getScrollOffset", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        private final int scrollOffset;
        private final int scrollPosition;
        private final Parcelable superState;

        /* compiled from: StickyHeaderLinearLayoutManager.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable, int i, int i9) {
            this.superState = parcelable;
            this.scrollPosition = i;
            this.scrollOffset = i9;
        }

        public static /* synthetic */ SavedState copy$default(SavedState savedState, Parcelable parcelable, int i, int i9, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                parcelable = savedState.superState;
            }
            if ((i10 & 2) != 0) {
                i = savedState.scrollPosition;
            }
            if ((i10 & 4) != 0) {
                i9 = savedState.scrollOffset;
            }
            return savedState.copy(parcelable, i, i9);
        }

        /* renamed from: component1, reason: from getter */
        public final Parcelable getSuperState() {
            return this.superState;
        }

        /* renamed from: component2, reason: from getter */
        public final int getScrollPosition() {
            return this.scrollPosition;
        }

        /* renamed from: component3, reason: from getter */
        public final int getScrollOffset() {
            return this.scrollOffset;
        }

        public final SavedState copy(Parcelable superState, int scrollPosition, int scrollOffset) {
            return new SavedState(superState, scrollPosition, scrollOffset);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SavedState)) {
                return false;
            }
            SavedState savedState = (SavedState) other;
            return f.b(this.superState, savedState.superState) && this.scrollPosition == savedState.scrollPosition && this.scrollOffset == savedState.scrollOffset;
        }

        public final int getScrollOffset() {
            return this.scrollOffset;
        }

        public final int getScrollPosition() {
            return this.scrollPosition;
        }

        public final Parcelable getSuperState() {
            return this.superState;
        }

        public int hashCode() {
            return Integer.hashCode(this.scrollOffset) + v.b(this.scrollPosition, this.superState.hashCode() * 31, 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("SavedState(superState=");
            sb2.append(this.superState);
            sb2.append(", scrollPosition=");
            sb2.append(this.scrollPosition);
            sb2.append(", scrollOffset=");
            return a.m(sb2, this.scrollOffset, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeParcelable(this.superState, flags);
            parcel.writeInt(this.scrollPosition);
            parcel.writeInt(this.scrollOffset);
        }
    }

    public StickyHeaderLinearLayoutManager(Context context) {
        this(context, 0, false, 6, null);
    }

    private final void bindStickyHeader(RecyclerView.u recycler, final View stickyHeader, int position) {
        recycler.b(position, stickyHeader);
        this.stickyHeaderPosition = position;
        measureAndLayout(stickyHeader);
        if (this.scrollPosition != -1) {
            stickyHeader.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$bindStickyHeader$1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    int i;
                    int i9;
                    int i10;
                    stickyHeader.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    i = this.scrollPosition;
                    if (i != -1) {
                        StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = this;
                        i9 = stickyHeaderLinearLayoutManager.scrollPosition;
                        i10 = this.scrollOffset;
                        stickyHeaderLinearLayoutManager.scrollToPositionWithOffset(i9, i10);
                        this.setScrollState(-1, Integer.MIN_VALUE);
                    }
                }
            });
        }
    }

    private final void createStickyHeader(RecyclerView.u recycler, int position) {
        View e10 = recycler.e(position);
        BaseEpoxyAdapter baseEpoxyAdapter = this.adapter;
        if (baseEpoxyAdapter != null) {
            baseEpoxyAdapter.setupStickyHeaderView(e10);
        }
        addView(e10);
        measureAndLayout(e10);
        ignoreView(e10);
        this.stickyHeader = e10;
        this.stickyHeaderPosition = position;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int findHeaderIndex(int position) {
        int size = this.headerPositions.size() - 1;
        int i = 0;
        while (i <= size) {
            int i9 = (i + size) / 2;
            if (this.headerPositions.get(i9).intValue() > position) {
                size = i9 - 1;
            } else {
                if (this.headerPositions.get(i9).intValue() >= position) {
                    return i9;
                }
                i = i9 + 1;
            }
        }
        return -1;
    }

    private final int findHeaderIndexOrBefore(int position) {
        int size = this.headerPositions.size() - 1;
        int i = 0;
        while (i <= size) {
            int i9 = (i + size) / 2;
            if (this.headerPositions.get(i9).intValue() <= position) {
                if (i9 < this.headerPositions.size() - 1) {
                    int i10 = i9 + 1;
                    if (this.headerPositions.get(i10).intValue() <= position) {
                        i = i10;
                    }
                }
                return i9;
            }
            size = i9 - 1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int findHeaderIndexOrNext(int position) {
        int size = this.headerPositions.size() - 1;
        int i = 0;
        while (i <= size) {
            int i9 = (i + size) / 2;
            if (i9 > 0) {
                int i10 = i9 - 1;
                if (this.headerPositions.get(i10).intValue() >= position) {
                    size = i10;
                }
            }
            if (this.headerPositions.get(i9).intValue() >= position) {
                return i9;
            }
            i = i9 + 1;
        }
        return -1;
    }

    private final float getX(View headerView, View nextHeaderView) {
        if (getOrientation() != 0) {
            return this.translationX;
        }
        float f10 = this.translationX;
        if (getReverseLayout()) {
            f10 += getWidth() - headerView.getWidth();
        }
        if (nextHeaderView == null) {
            return f10;
        }
        ViewGroup.LayoutParams layoutParams = nextHeaderView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = nextHeaderView.getLayoutParams();
        return getReverseLayout() ? h.O(nextHeaderView.getRight() + ((layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null) != null ? r3.rightMargin : 0), f10) : h.Q((nextHeaderView.getLeft() - i) - headerView.getWidth(), f10);
    }

    private final float getY(View headerView, View nextHeaderView) {
        if (getOrientation() != 1) {
            return this.translationY;
        }
        float f10 = this.translationY;
        if (getReverseLayout()) {
            f10 += getHeight() - headerView.getHeight();
        }
        if (nextHeaderView == null) {
            return f10;
        }
        ViewGroup.LayoutParams layoutParams = nextHeaderView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = nextHeaderView.getLayoutParams();
        return getReverseLayout() ? h.O(nextHeaderView.getBottom() + i, f10) : h.Q((nextHeaderView.getTop() - ((layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null) != null ? r3.topMargin : 0)) - headerView.getHeight(), f10);
    }

    private final boolean isViewOnBoundary(View view) {
        if (getOrientation() == 1) {
            if (!getReverseLayout()) {
                if (view.getTranslationY() + view.getTop() >= this.translationY) {
                    return false;
                }
            } else if (view.getBottom() - view.getTranslationY() <= getHeight() + this.translationY) {
                return false;
            }
        } else if (!getReverseLayout()) {
            if (view.getTranslationX() + view.getLeft() >= this.translationX) {
                return false;
            }
        } else if (view.getRight() - view.getTranslationX() <= getWidth() + this.translationX) {
            return false;
        }
        return true;
    }

    private final boolean isViewValidAnchor(View view, RecyclerView.o params) {
        if (params.f7506a.isRemoved() || params.f7506a.isInvalid()) {
            return false;
        }
        if (getOrientation() == 1) {
            if (getReverseLayout()) {
                if (view.getTranslationY() + view.getTop() > getHeight() + this.translationY) {
                    return false;
                }
            } else if (view.getBottom() - view.getTranslationY() < this.translationY) {
                return false;
            }
        } else if (getReverseLayout()) {
            if (view.getTranslationX() + view.getLeft() > getWidth() + this.translationX) {
                return false;
            }
        } else if (view.getRight() - view.getTranslationX() < this.translationX) {
            return false;
        }
        return true;
    }

    private final void measureAndLayout(View stickyHeader) {
        measureChildWithMargins(stickyHeader, 0, 0);
        if (getOrientation() == 1) {
            stickyHeader.layout(getPaddingLeft(), 0, getWidth() - getPaddingRight(), stickyHeader.getMeasuredHeight());
        } else {
            stickyHeader.layout(0, getPaddingTop(), stickyHeader.getMeasuredWidth(), getHeight() - getPaddingBottom());
        }
    }

    private final <T> T restoreView(InterfaceC0635a<? extends T> operation) {
        View view = this.stickyHeader;
        if (view != null) {
            detachView(view);
        }
        T invoke = operation.invoke();
        View view2 = this.stickyHeader;
        if (view2 != null) {
            attachView(view2);
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrapStickyHeader(RecyclerView.u recycler) {
        View view = this.stickyHeader;
        if (view == null) {
            return;
        }
        this.stickyHeader = null;
        this.stickyHeaderPosition = -1;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        BaseEpoxyAdapter baseEpoxyAdapter = this.adapter;
        if (baseEpoxyAdapter != null) {
            baseEpoxyAdapter.teardownStickyHeaderView(view);
        }
        stopIgnoringView(view);
        removeView(view);
        if (recycler != null) {
            recycler.j(view);
        }
    }

    private final void setAdapter(RecyclerView.Adapter<?> newAdapter) {
        BaseEpoxyAdapter baseEpoxyAdapter = this.adapter;
        if (baseEpoxyAdapter != null) {
            baseEpoxyAdapter.unregisterAdapterDataObserver(this.headerPositionsObserver);
        }
        if (!(newAdapter instanceof BaseEpoxyAdapter)) {
            this.adapter = null;
            this.headerPositions.clear();
            return;
        }
        BaseEpoxyAdapter baseEpoxyAdapter2 = (BaseEpoxyAdapter) newAdapter;
        this.adapter = baseEpoxyAdapter2;
        if (baseEpoxyAdapter2 != null) {
            baseEpoxyAdapter2.registerAdapterDataObserver(this.headerPositionsObserver);
        }
        this.headerPositionsObserver.onChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScrollState(int position, int offset) {
        this.scrollPosition = position;
        this.scrollOffset = offset;
    }

    private final void updateStickyHeader(RecyclerView.u recycler, boolean layout) {
        View view;
        View view2;
        int i;
        View childAt;
        BaseEpoxyAdapter baseEpoxyAdapter;
        int size = this.headerPositions.size();
        int childCount = getChildCount();
        if (size > 0 && childCount > 0) {
            int i9 = 0;
            while (true) {
                view = null;
                if (i9 >= childCount) {
                    view2 = null;
                    i = -1;
                    i9 = -1;
                    break;
                } else {
                    view2 = getChildAt(i9);
                    RecyclerView.o oVar = (RecyclerView.o) view2.getLayoutParams();
                    if (isViewValidAnchor(view2, oVar)) {
                        i = oVar.f7506a.getBindingAdapterPosition();
                        break;
                    }
                    i9++;
                }
            }
            if (view2 != null && i != -1) {
                int findHeaderIndexOrBefore = findHeaderIndexOrBefore(i);
                int intValue = findHeaderIndexOrBefore != -1 ? this.headerPositions.get(findHeaderIndexOrBefore).intValue() : -1;
                int i10 = findHeaderIndexOrBefore + 1;
                int intValue2 = size > i10 ? this.headerPositions.get(i10).intValue() : -1;
                if (intValue != -1 && ((intValue != i || isViewOnBoundary(view2)) && intValue2 != intValue + 1)) {
                    View view3 = this.stickyHeader;
                    if (view3 != null && ((baseEpoxyAdapter = this.adapter) == null || getItemViewType(view3) != baseEpoxyAdapter.getItemViewType(intValue))) {
                        scrapStickyHeader(recycler);
                    }
                    if (this.stickyHeader == null) {
                        createStickyHeader(recycler, intValue);
                    }
                    if (layout || getPosition(this.stickyHeader) != intValue) {
                        bindStickyHeader(recycler, this.stickyHeader, intValue);
                    }
                    View view4 = this.stickyHeader;
                    if (view4 != null) {
                        if (intValue2 != -1 && (childAt = getChildAt((intValue2 - i) + i9)) != this.stickyHeader) {
                            view = childAt;
                        }
                        view4.setTranslationX(getX(view4, view));
                        view4.setTranslationY(getY(view4, view));
                        return;
                    }
                    return;
                }
            }
        }
        if (this.stickyHeader != null) {
            scrapStickyHeader(recycler);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public int computeHorizontalScrollExtent(final RecyclerView.y state) {
        return ((Number) restoreView(new InterfaceC0635a<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeHorizontalScrollExtent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final Integer invoke() {
                int computeHorizontalScrollExtent;
                computeHorizontalScrollExtent = super/*androidx.recyclerview.widget.LinearLayoutManager*/.computeHorizontalScrollExtent(state);
                return Integer.valueOf(computeHorizontalScrollExtent);
            }
        })).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public int computeHorizontalScrollOffset(final RecyclerView.y state) {
        return ((Number) restoreView(new InterfaceC0635a<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeHorizontalScrollOffset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final Integer invoke() {
                int computeHorizontalScrollOffset;
                computeHorizontalScrollOffset = super/*androidx.recyclerview.widget.LinearLayoutManager*/.computeHorizontalScrollOffset(state);
                return Integer.valueOf(computeHorizontalScrollOffset);
            }
        })).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public int computeHorizontalScrollRange(final RecyclerView.y state) {
        return ((Number) restoreView(new InterfaceC0635a<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeHorizontalScrollRange$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final Integer invoke() {
                int computeHorizontalScrollRange;
                computeHorizontalScrollRange = super/*androidx.recyclerview.widget.LinearLayoutManager*/.computeHorizontalScrollRange(state);
                return Integer.valueOf(computeHorizontalScrollRange);
            }
        })).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.x.b
    public PointF computeScrollVectorForPosition(final int targetPosition) {
        return (PointF) restoreView(new InterfaceC0635a<PointF>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeScrollVectorForPosition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final PointF invoke() {
                PointF computeScrollVectorForPosition;
                computeScrollVectorForPosition = super/*androidx.recyclerview.widget.LinearLayoutManager*/.computeScrollVectorForPosition(targetPosition);
                return computeScrollVectorForPosition;
            }
        });
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public int computeVerticalScrollExtent(final RecyclerView.y state) {
        return ((Number) restoreView(new InterfaceC0635a<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeVerticalScrollExtent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final Integer invoke() {
                int computeVerticalScrollExtent;
                computeVerticalScrollExtent = super/*androidx.recyclerview.widget.LinearLayoutManager*/.computeVerticalScrollExtent(state);
                return Integer.valueOf(computeVerticalScrollExtent);
            }
        })).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public int computeVerticalScrollOffset(final RecyclerView.y state) {
        return ((Number) restoreView(new InterfaceC0635a<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeVerticalScrollOffset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final Integer invoke() {
                int computeVerticalScrollOffset;
                computeVerticalScrollOffset = super/*androidx.recyclerview.widget.LinearLayoutManager*/.computeVerticalScrollOffset(state);
                return Integer.valueOf(computeVerticalScrollOffset);
            }
        })).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public int computeVerticalScrollRange(final RecyclerView.y state) {
        return ((Number) restoreView(new InterfaceC0635a<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeVerticalScrollRange$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final Integer invoke() {
                int computeVerticalScrollRange;
                computeVerticalScrollRange = super/*androidx.recyclerview.widget.LinearLayoutManager*/.computeVerticalScrollRange(state);
                return Integer.valueOf(computeVerticalScrollRange);
            }
        })).intValue();
    }

    public final boolean isStickyHeader(View view) {
        return view == this.stickyHeader;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onAdapterChanged(RecyclerView.Adapter<?> oldAdapter, RecyclerView.Adapter<?> newAdapter) {
        super.onAdapterChanged(oldAdapter, newAdapter);
        setAdapter(newAdapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        setAdapter(recyclerView.getAdapter());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public View onFocusSearchFailed(final View focused, final int focusDirection, final RecyclerView.u recycler, final RecyclerView.y state) {
        return (View) restoreView(new InterfaceC0635a<View>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$onFocusSearchFailed$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final View invoke() {
                View onFocusSearchFailed;
                onFocusSearchFailed = super/*androidx.recyclerview.widget.LinearLayoutManager*/.onFocusSearchFailed(focused, focusDirection, recycler, state);
                return onFocusSearchFailed;
            }
        });
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public void onLayoutChildren(final RecyclerView.u recycler, final RecyclerView.y state) {
        restoreView(new InterfaceC0635a<p>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$onLayoutChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                super/*androidx.recyclerview.widget.LinearLayoutManager*/.onLayoutChildren(recycler, state);
            }
        });
        if (state.f7544g) {
            return;
        }
        updateStickyHeader(recycler, true);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public void onRestoreInstanceState(Parcelable state) {
        SavedState savedState = (SavedState) state;
        this.scrollPosition = savedState.getScrollPosition();
        this.scrollOffset = savedState.getScrollOffset();
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState != null) {
            return new SavedState(onSaveInstanceState, this.scrollPosition, this.scrollOffset);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public int scrollHorizontallyBy(final int dx, final RecyclerView.u recycler, final RecyclerView.y state) {
        int intValue = ((Number) restoreView(new InterfaceC0635a<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$scrollHorizontallyBy$scrolled$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final Integer invoke() {
                int scrollHorizontallyBy;
                scrollHorizontallyBy = super/*androidx.recyclerview.widget.LinearLayoutManager*/.scrollHorizontallyBy(dx, recycler, state);
                return Integer.valueOf(scrollHorizontallyBy);
            }
        })).intValue();
        if (intValue != 0) {
            updateStickyHeader(recycler, false);
        }
        return intValue;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public void scrollToPosition(int position) {
        scrollToPositionWithOffset(position, Integer.MIN_VALUE);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void scrollToPositionWithOffset(int position, int offset) {
        scrollToPositionWithOffset(position, offset, true);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public int scrollVerticallyBy(final int dy, final RecyclerView.u recycler, final RecyclerView.y state) {
        int intValue = ((Number) restoreView(new InterfaceC0635a<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$scrollVerticallyBy$scrolled$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final Integer invoke() {
                int scrollVerticallyBy;
                scrollVerticallyBy = super/*androidx.recyclerview.widget.LinearLayoutManager*/.scrollVerticallyBy(dy, recycler, state);
                return Integer.valueOf(scrollVerticallyBy);
            }
        })).intValue();
        if (intValue != 0) {
            updateStickyHeader(recycler, false);
        }
        return intValue;
    }

    public final void setStickyHeaderTranslationX(float translationX) {
        this.translationX = translationX;
        requestLayout();
    }

    public final void setStickyHeaderTranslationY(float translationY) {
        this.translationY = translationY;
        requestLayout();
    }

    public StickyHeaderLinearLayoutManager(Context context, int i) {
        this(context, i, false, 4, null);
    }

    private final void scrollToPositionWithOffset(int position, int offset, boolean adjustForStickyHeader) {
        setScrollState(-1, Integer.MIN_VALUE);
        if (!adjustForStickyHeader) {
            super.scrollToPositionWithOffset(position, offset);
            return;
        }
        int findHeaderIndexOrBefore = findHeaderIndexOrBefore(position);
        if (findHeaderIndexOrBefore == -1 || findHeaderIndex(position) != -1) {
            super.scrollToPositionWithOffset(position, offset);
            return;
        }
        int i = position - 1;
        if (findHeaderIndex(i) != -1) {
            super.scrollToPositionWithOffset(i, offset);
            return;
        }
        if (this.stickyHeader == null || findHeaderIndexOrBefore != findHeaderIndex(this.stickyHeaderPosition)) {
            setScrollState(position, offset);
            super.scrollToPositionWithOffset(position, offset);
        } else {
            if (offset == Integer.MIN_VALUE) {
                offset = 0;
            }
            super.scrollToPositionWithOffset(position, this.stickyHeader.getHeight() + offset);
        }
    }

    public /* synthetic */ StickyHeaderLinearLayoutManager(Context context, int i, boolean z10, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i9 & 2) != 0 ? 1 : i, (i9 & 4) != 0 ? false : z10);
    }

    public StickyHeaderLinearLayoutManager(Context context, int i, boolean z10) {
        super(context, i, z10);
        this.headerPositions = new ArrayList();
        this.headerPositionsObserver = new HeaderPositionsAdapterDataObserver();
        this.stickyHeaderPosition = -1;
        this.scrollPosition = -1;
    }
}
