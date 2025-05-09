package com.airbnb.epoxy;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.M;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.ModelView;
import com.luminary.mobile.R;
import java.util.List;

@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT, saveViewState = true)
/* loaded from: classes.dex */
public class Carousel extends EpoxyRecyclerView {
    public static final int NO_VALUE_SET = -1;
    private static SnapHelperFactory defaultGlobalSnapHelperFactory = new SnapHelperFactory() { // from class: com.airbnb.epoxy.Carousel.1
        @Override // com.airbnb.epoxy.Carousel.SnapHelperFactory
        public M buildSnapHelper(Context context) {
            return new B();
        }
    };
    private static int defaultSpacingBetweenItemsDp = 8;
    private float numViewsToShowOnScreen;

    public static class Padding {
        public final int bottom;
        public final int itemSpacing;
        public final int left;
        public final PaddingType paddingType;
        public final int right;
        public final int top;

        public enum PaddingType {
            PX,
            DP,
            RESOURCE
        }

        public Padding(int i, int i9) {
            this(i, i, i, i, i9, PaddingType.PX);
        }

        public static Padding dp(int i, int i9) {
            return new Padding(i, i, i, i, i9, PaddingType.DP);
        }

        public static Padding resource(int i, int i9) {
            return new Padding(i, i, i, i, i9, PaddingType.RESOURCE);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Padding padding = (Padding) obj;
            return this.left == padding.left && this.top == padding.top && this.right == padding.right && this.bottom == padding.bottom && this.itemSpacing == padding.itemSpacing;
        }

        public int hashCode() {
            return (((((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom) * 31) + this.itemSpacing;
        }

        public Padding(int i, int i9, int i10, int i11, int i12) {
            this(i, i9, i10, i11, i12, PaddingType.PX);
        }

        public static Padding dp(int i, int i9, int i10, int i11, int i12) {
            return new Padding(i, i9, i10, i11, i12, PaddingType.DP);
        }

        public static Padding resource(int i, int i9, int i10, int i11, int i12) {
            return new Padding(i, i9, i10, i11, i12, PaddingType.RESOURCE);
        }

        private Padding(int i, int i9, int i10, int i11, int i12, PaddingType paddingType) {
            this.left = i;
            this.top = i9;
            this.right = i10;
            this.bottom = i11;
            this.itemSpacing = i12;
            this.paddingType = paddingType;
        }
    }

    public static abstract class SnapHelperFactory {
        public abstract M buildSnapHelper(Context context);
    }

    public Carousel(Context context) {
        super(context);
    }

    private int getSpaceForChildren(boolean z10) {
        if (z10) {
            return (getTotalWidthPx(this) - getPaddingLeft()) - (getClipToPadding() ? getPaddingRight() : 0);
        }
        return (getTotalHeightPx(this) - getPaddingTop()) - (getClipToPadding() ? getPaddingBottom() : 0);
    }

    private static int getTotalHeightPx(View view) {
        return view.getHeight() > 0 ? view.getHeight() : view.getMeasuredHeight() > 0 ? view.getMeasuredHeight() : view.getContext().getResources().getDisplayMetrics().heightPixels;
    }

    private static int getTotalWidthPx(View view) {
        return view.getWidth() > 0 ? view.getWidth() : view.getMeasuredWidth() > 0 ? view.getMeasuredWidth() : view.getContext().getResources().getDisplayMetrics().widthPixels;
    }

    public static void setDefaultGlobalSnapHelperFactory(SnapHelperFactory snapHelperFactory) {
        defaultGlobalSnapHelperFactory = snapHelperFactory;
    }

    public static void setDefaultItemSpacingDp(int i) {
        defaultSpacingBetweenItemsDp = i;
    }

    @Override // com.airbnb.epoxy.EpoxyRecyclerView
    @OnViewRecycled
    public void clear() {
        super.clear();
    }

    public int getDefaultSpacingBetweenItemsDp() {
        return defaultSpacingBetweenItemsDp;
    }

    public float getNumViewsToShowOnScreen() {
        return this.numViewsToShowOnScreen;
    }

    public SnapHelperFactory getSnapHelperFactory() {
        return defaultGlobalSnapHelperFactory;
    }

    @Override // com.airbnb.epoxy.EpoxyRecyclerView
    public void init() {
        super.init();
        int defaultSpacingBetweenItemsDp2 = getDefaultSpacingBetweenItemsDp();
        if (defaultSpacingBetweenItemsDp2 >= 0) {
            setItemSpacingDp(defaultSpacingBetweenItemsDp2);
            if (getPaddingLeft() == 0 && getPaddingRight() == 0 && getPaddingTop() == 0 && getPaddingBottom() == 0) {
                setPaddingDp(defaultSpacingBetweenItemsDp2);
            }
        }
        SnapHelperFactory snapHelperFactory = getSnapHelperFactory();
        if (snapHelperFactory != null) {
            snapHelperFactory.buildSnapHelper(getContext()).a(this);
        }
        setRemoveAdapterWhenDetachedFromWindow(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onChildAttachedToWindow(View view) {
        if (this.numViewsToShowOnScreen > 0.0f) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            view.setTag(R.id.epoxy_recycler_view_child_initial_size_id, Integer.valueOf(layoutParams.width));
            int pxBetweenItems = getSpacingDecorator().getPxBetweenItems();
            int i = pxBetweenItems > 0 ? (int) (pxBetweenItems * this.numViewsToShowOnScreen) : 0;
            boolean canScrollHorizontally = getLayoutManager().canScrollHorizontally();
            int spaceForChildren = (int) ((getSpaceForChildren(canScrollHorizontally) - i) / this.numViewsToShowOnScreen);
            if (canScrollHorizontally) {
                layoutParams.width = spaceForChildren;
            } else {
                layoutParams.height = spaceForChildren;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onChildDetachedFromWindow(View view) {
        Object tag = view.getTag(R.id.epoxy_recycler_view_child_initial_size_id);
        if (tag instanceof Integer) {
            view.getLayoutParams().width = ((Integer) tag).intValue();
            view.setTag(R.id.epoxy_recycler_view_child_initial_size_id, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    @ModelProp
    public void setHasFixedSize(boolean z10) {
        super.setHasFixedSize(z10);
    }

    @ModelProp(group = "prefetch")
    public void setInitialPrefetchItemCount(int i) {
        if (i < 0) {
            throw new IllegalStateException("numItemsToPrefetch must be greater than 0");
        }
        if (i == 0) {
            i = 2;
        }
        RecyclerView.n layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            ((LinearLayoutManager) layoutManager).setInitialPrefetchItemCount(i);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyRecyclerView
    @ModelProp
    public void setModels(List<? extends EpoxyModel<?>> list) {
        super.setModels(list);
    }

    @ModelProp(group = "prefetch")
    public void setNumViewsToShowOnScreen(float f10) {
        this.numViewsToShowOnScreen = f10;
        setInitialPrefetchItemCount((int) Math.ceil(f10));
    }

    @ModelProp(group = "padding")
    public void setPadding(Padding padding) {
        if (padding == null) {
            setPaddingDp(0);
            return;
        }
        Padding.PaddingType paddingType = padding.paddingType;
        if (paddingType == Padding.PaddingType.PX) {
            setPadding(padding.left, padding.top, padding.right, padding.bottom);
            setItemSpacingPx(padding.itemSpacing);
        } else if (paddingType == Padding.PaddingType.DP) {
            setPadding(dpToPx(padding.left), dpToPx(padding.top), dpToPx(padding.right), dpToPx(padding.bottom));
            setItemSpacingPx(dpToPx(padding.itemSpacing));
        } else if (paddingType == Padding.PaddingType.RESOURCE) {
            setPadding(resToPx(padding.left), resToPx(padding.top), resToPx(padding.right), resToPx(padding.bottom));
            setItemSpacingPx(resToPx(padding.itemSpacing));
        }
    }

    @ModelProp(defaultValue = "NO_VALUE_SET", group = "padding")
    public void setPaddingDp(int i) {
        if (i == -1) {
            i = getDefaultSpacingBetweenItemsDp();
        }
        int dpToPx = dpToPx(i);
        setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
        setItemSpacingPx(dpToPx);
    }

    @ModelProp(group = "padding")
    public void setPaddingRes(int i) {
        int resToPx = resToPx(i);
        setPadding(resToPx, resToPx, resToPx, resToPx);
        setItemSpacingPx(resToPx);
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
