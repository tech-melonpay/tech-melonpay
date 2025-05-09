package androidx.recyclerview.widget;

import a1.C0507a;
import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.C0563a;
import androidx.recyclerview.widget.C0569g;
import androidx.recyclerview.widget.C0578p;
import androidx.recyclerview.widget.J;
import androidx.recyclerview.widget.O;
import androidx.recyclerview.widget.P;
import androidx.recyclerview.widget.t;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import pa.C1124b;
import y0.C1596C;
import y0.C1597a;
import y0.C1608l;
import y0.InterfaceC1607k;
import z0.C1638d;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, InterfaceC1607k {
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static boolean sDebugAssertionsEnabled = false;
    static final z sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    static boolean sVerboseLoggingEnabled = false;
    J mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    Adapter mAdapter;
    C0563a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private i mChildDrawingOrderCallback;
    C0569g mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private j mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    androidx.recyclerview.widget.t mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private r mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    k mItemAnimator;
    private k.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<m> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    n mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final w mObserver;
    private List<p> mOnChildAttachStateListeners;
    private q mOnFlingListener;
    private final ArrayList<r> mOnItemTouchListeners;
    final List<C> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    t.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final u mRecycler;
    v mRecyclerListener;
    final List<v> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private s mScrollListener;
    private List<s> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C1608l mScrollingChildHelper;
    final y mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final B mViewFlinger;
    private final P.b mViewInfoProcessCallback;
    final P mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    public static abstract class A {
    }

    public class B implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public int f7478a;

        /* renamed from: b, reason: collision with root package name */
        public int f7479b;

        /* renamed from: c, reason: collision with root package name */
        public OverScroller f7480c;

        /* renamed from: d, reason: collision with root package name */
        public Interpolator f7481d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f7482e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f7483f;

        public B() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f7481d = interpolator;
            this.f7482e = false;
            this.f7483f = false;
            this.f7480c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final void a(int i, int i9) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.setScrollState(2);
            this.f7479b = 0;
            this.f7478a = 0;
            Interpolator interpolator = this.f7481d;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f7481d = interpolator2;
                this.f7480c = new OverScroller(recyclerView.getContext(), interpolator2);
            }
            this.f7480c.fling(0, 0, i, i9, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            b();
        }

        public final void b() {
            if (this.f7482e) {
                this.f7483f = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
            recyclerView.postOnAnimation(this);
        }

        public final void c(int i, int i9, Interpolator interpolator, int i10) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i10 == Integer.MIN_VALUE) {
                int abs = Math.abs(i);
                int abs2 = Math.abs(i9);
                boolean z10 = abs > abs2;
                int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z10) {
                    abs = abs2;
                }
                i10 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), RecyclerView.MAX_SCROLL_DURATION);
            }
            int i11 = i10;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f7481d != interpolator) {
                this.f7481d = interpolator;
                this.f7480c = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.f7479b = 0;
            this.f7478a = 0;
            recyclerView.setScrollState(2);
            this.f7480c.startScroll(0, 0, i, i9, i11);
            b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int i9;
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                recyclerView.removeCallbacks(this);
                this.f7480c.abortAnimation();
                return;
            }
            this.f7483f = false;
            this.f7482e = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f7480c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.f7478a;
                int i13 = currY - this.f7479b;
                this.f7478a = currX;
                this.f7479b = currY;
                int consumeFlingInHorizontalStretch = recyclerView.consumeFlingInHorizontalStretch(i12);
                int consumeFlingInVerticalStretch = recyclerView.consumeFlingInVerticalStretch(i13);
                int[] iArr = recyclerView.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView.dispatchNestedPreScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr, null, 1)) {
                    int[] iArr2 = recyclerView.mReusableIntPair;
                    consumeFlingInHorizontalStretch -= iArr2[0];
                    consumeFlingInVerticalStretch -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.considerReleasingGlowsOnScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch);
                }
                if (recyclerView.mAdapter != null) {
                    int[] iArr3 = recyclerView.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView.scrollStep(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr3);
                    int[] iArr4 = recyclerView.mReusableIntPair;
                    int i14 = iArr4[0];
                    int i15 = iArr4[1];
                    int i16 = consumeFlingInHorizontalStretch - i14;
                    int i17 = consumeFlingInVerticalStretch - i15;
                    x xVar = recyclerView.mLayout.mSmoothScroller;
                    if (xVar != null && !xVar.f7526d && xVar.f7527e) {
                        int b9 = recyclerView.mState.b();
                        if (b9 == 0) {
                            xVar.d();
                        } else if (xVar.f7523a >= b9) {
                            xVar.f7523a = b9 - 1;
                            xVar.b(i14, i15);
                        } else {
                            xVar.b(i14, i15);
                        }
                    }
                    i10 = i15;
                    i11 = i14;
                    i = i16;
                    i9 = i17;
                } else {
                    i = consumeFlingInHorizontalStretch;
                    i9 = consumeFlingInVerticalStretch;
                    i10 = 0;
                    i11 = 0;
                }
                if (!recyclerView.mItemDecorations.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr5 = recyclerView.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView.dispatchNestedScroll(i11, i10, i, i9, null, 1, iArr5);
                int[] iArr6 = recyclerView.mReusableIntPair;
                int i18 = i - iArr6[0];
                int i19 = i9 - iArr6[1];
                if (i11 != 0 || i10 != 0) {
                    recyclerView.dispatchOnScrolled(i11, i10);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i18 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i19 != 0));
                x xVar2 = recyclerView.mLayout.mSmoothScroller;
                if ((xVar2 == null || !xVar2.f7526d) && z10) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i20 = i18 < 0 ? -currVelocity : i18 > 0 ? currVelocity : 0;
                        if (i19 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i19 <= 0) {
                            currVelocity = 0;
                        }
                        recyclerView.absorbGlows(i20, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        t.b bVar = recyclerView.mPrefetchRegistry;
                        int[] iArr7 = bVar.f7765c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        bVar.f7766d = 0;
                    }
                } else {
                    b();
                    androidx.recyclerview.widget.t tVar = recyclerView.mGapWorker;
                    if (tVar != null) {
                        tVar.a(recyclerView, i11, i10);
                    }
                }
            }
            x xVar3 = recyclerView.mLayout.mSmoothScroller;
            if (xVar3 != null && xVar3.f7526d) {
                xVar3.b(0, 0);
            }
            this.f7482e = false;
            if (!this.f7483f) {
                recyclerView.setScrollState(0);
                recyclerView.stopNestedScroll(1);
            } else {
                recyclerView.removeCallbacks(this);
                WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
                recyclerView.postOnAnimation(this);
            }
        }
    }

    public static abstract class C {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        Adapter<? extends C> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        C mShadowedHolder = null;
        C mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        u mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public C(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
                if (view.hasTransientState()) {
                    return true;
                }
            }
            return false;
        }

        public void flagRemovedAndOffsetPosition(int i, int i9, boolean z10) {
            addFlags(8);
            offsetPosition(i9, z10);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final Adapter<? extends C> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
                if (!view.hasTransientState()) {
                    return true;
                }
            }
            return false;
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i, boolean z10) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z10) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((o) this.itemView.getLayoutParams()).f7508c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                View view = this.itemView;
                WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
                this.mWasImportantForAccessibilityBeforeHidden = view.getImportantForAccessibility();
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            if (RecyclerView.sDebugAssertionsEnabled && isTmpDetached()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i, int i9) {
            this.mFlags = (i & i9) | (this.mFlags & (~i9));
        }

        public final void setIsRecyclable(boolean z10) {
            int i = this.mIsRecyclableCount;
            int i9 = z10 ? i - 1 : i + 1;
            this.mIsRecyclableCount = i9;
            if (i9 < 0) {
                this.mIsRecyclableCount = 0;
                if (RecyclerView.sDebugAssertionsEnabled) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z10 && i9 == 1) {
                this.mFlags |= 16;
            } else if (z10 && i9 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "setIsRecyclable val:" + z10 + com.sumsub.sns.internal.core.data.model.p.f15541a + this);
            }
        }

        public void setScrapContainer(u uVar, boolean z10) {
            this.mScrapContainer = uVar;
            this.mInChangeScrap = z10;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder r8 = androidx.camera.core.impl.utils.a.r(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            r8.append(Integer.toHexString(hashCode()));
            r8.append(" position=");
            r8.append(this.mPosition);
            r8.append(" id=");
            r8.append(this.mItemId);
            r8.append(", oldPos=");
            r8.append(this.mOldPosition);
            r8.append(", pLpos:");
            r8.append(this.mPreLayoutPosition);
            StringBuilder sb2 = new StringBuilder(r8.toString());
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public void unScrap() {
            this.mScrapContainer.o(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public Parcelable f7485c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7485c = parcel.readParcelable(classLoader == null ? n.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f7485c, 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    public class RunnableC0560a implements Runnable {
        public RunnableC0560a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            if (!recyclerView.mIsAttached) {
                recyclerView.requestLayout();
            } else if (recyclerView.mLayoutSuppressed) {
                recyclerView.mLayoutWasDefered = true;
            } else {
                recyclerView.consumePendingUpdateOperations();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b, reason: case insensitive filesystem */
    public class RunnableC0561b implements Runnable {
        public RunnableC0561b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView;
            RecyclerView recyclerView2 = RecyclerView.this;
            k kVar = recyclerView2.mItemAnimator;
            if (kVar != null) {
                C0578p c0578p = (C0578p) kVar;
                ArrayList<C> arrayList = c0578p.f7676h;
                boolean z10 = !arrayList.isEmpty();
                ArrayList<C0578p.b> arrayList2 = c0578p.f7677j;
                boolean z11 = !arrayList2.isEmpty();
                ArrayList<C0578p.a> arrayList3 = c0578p.f7678k;
                boolean z12 = !arrayList3.isEmpty();
                ArrayList<C> arrayList4 = c0578p.i;
                boolean z13 = !arrayList4.isEmpty();
                if (z10 || z11 || z13 || z12) {
                    Iterator<C> it = arrayList.iterator();
                    while (it.hasNext()) {
                        C next = it.next();
                        View view = next.itemView;
                        ViewPropertyAnimator animate = view.animate();
                        c0578p.f7684q.add(next);
                        animate.setDuration(c0578p.f7494d).alpha(RecyclerView.DECELERATION_RATE).setListener(new C0573k(view, animate, c0578p, next)).start();
                        recyclerView2 = recyclerView2;
                    }
                    recyclerView = recyclerView2;
                    arrayList.clear();
                    if (z11) {
                        ArrayList<C0578p.b> arrayList5 = new ArrayList<>();
                        arrayList5.addAll(arrayList2);
                        c0578p.f7680m.add(arrayList5);
                        arrayList2.clear();
                        RunnableC0570h runnableC0570h = new RunnableC0570h(c0578p, arrayList5);
                        if (z10) {
                            View view2 = arrayList5.get(0).f7692a.itemView;
                            long j10 = c0578p.f7494d;
                            WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
                            view2.postOnAnimationDelayed(runnableC0570h, j10);
                        } else {
                            runnableC0570h.run();
                        }
                    }
                    if (z12) {
                        ArrayList<C0578p.a> arrayList6 = new ArrayList<>();
                        arrayList6.addAll(arrayList3);
                        c0578p.f7681n.add(arrayList6);
                        arrayList3.clear();
                        RunnableC0571i runnableC0571i = new RunnableC0571i(c0578p, arrayList6);
                        if (z10) {
                            View view3 = arrayList6.get(0).f7686a.itemView;
                            long j11 = c0578p.f7494d;
                            WeakHashMap<View, y0.E> weakHashMap2 = C1596C.f30963a;
                            view3.postOnAnimationDelayed(runnableC0571i, j11);
                        } else {
                            runnableC0571i.run();
                        }
                    }
                    if (z13) {
                        ArrayList<C> arrayList7 = new ArrayList<>();
                        arrayList7.addAll(arrayList4);
                        c0578p.f7679l.add(arrayList7);
                        arrayList4.clear();
                        RunnableC0572j runnableC0572j = new RunnableC0572j(c0578p, arrayList7);
                        if (z10 || z11 || z12) {
                            long max = Math.max(z11 ? c0578p.f7495e : 0L, z12 ? c0578p.f7496f : 0L) + (z10 ? c0578p.f7494d : 0L);
                            View view4 = arrayList7.get(0).itemView;
                            WeakHashMap<View, y0.E> weakHashMap3 = C1596C.f30963a;
                            view4.postOnAnimationDelayed(runnableC0572j, max);
                        } else {
                            runnableC0572j.run();
                        }
                    }
                    recyclerView.mPostedAnimatorRunner = false;
                }
            }
            recyclerView = recyclerView2;
            recyclerView.mPostedAnimatorRunner = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c, reason: case insensitive filesystem */
    public class InterpolatorC0562c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class d implements P.b {
        public d() {
        }
    }

    public class e implements C0569g.b {
        public e() {
        }

        public final void a(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                recyclerView.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeViewAt(i);
        }
    }

    public class f implements C0563a.InterfaceC0082a {
        public f() {
        }

        public final void a(C0563a.b bVar) {
            int i = bVar.f7608a;
            RecyclerView recyclerView = RecyclerView.this;
            if (i == 1) {
                recyclerView.mLayout.onItemsAdded(recyclerView, bVar.f7609b, bVar.f7611d);
                return;
            }
            if (i == 2) {
                recyclerView.mLayout.onItemsRemoved(recyclerView, bVar.f7609b, bVar.f7611d);
            } else if (i == 4) {
                recyclerView.mLayout.onItemsUpdated(recyclerView, bVar.f7609b, bVar.f7611d, bVar.f7610c);
            } else {
                if (i != 8) {
                    return;
                }
                recyclerView.mLayout.onItemsMoved(recyclerView, bVar.f7609b, bVar.f7611d, 1);
            }
        }

        public final C b(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            C findViewHolderForPosition = recyclerView.findViewHolderForPosition(i, true);
            if (findViewHolderForPosition == null) {
                return null;
            }
            if (!recyclerView.mChildHelper.k(findViewHolderForPosition.itemView)) {
                return findViewHolderForPosition;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "assuming view holder cannot be find because it is hidden");
            }
            return null;
        }
    }

    public static class g extends Observable<h> {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((h) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public final void c(int i, int i9) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((h) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i, i9, 1);
            }
        }

        public final void d(int i, int i9, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((h) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i, i9, obj);
            }
        }

        public final void e(int i, int i9) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((h) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i, i9);
            }
        }

        public final void f(int i, int i9) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((h) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i, i9);
            }
        }

        public final void g() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((h) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    public static abstract class h {
        public void onItemRangeChanged(int i, int i9) {
        }

        public void onItemRangeChanged(int i, int i9, Object obj) {
            onItemRangeChanged(i, i9);
        }

        public void onChanged() {
        }

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeInserted(int i, int i9) {
        }

        public void onItemRangeRemoved(int i, int i9) {
        }

        public void onItemRangeMoved(int i, int i9, int i10) {
        }
    }

    public interface i {
    }

    public static class j {
    }

    public static abstract class k {

        /* renamed from: a, reason: collision with root package name */
        public b f7491a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<a> f7492b;

        /* renamed from: c, reason: collision with root package name */
        public long f7493c;

        /* renamed from: d, reason: collision with root package name */
        public long f7494d;

        /* renamed from: e, reason: collision with root package name */
        public long f7495e;

        /* renamed from: f, reason: collision with root package name */
        public long f7496f;

        public interface a {
            void a();
        }

        public interface b {
        }

        public static class c {

            /* renamed from: a, reason: collision with root package name */
            public int f7497a;

            /* renamed from: b, reason: collision with root package name */
            public int f7498b;

            public final void a(C c2) {
                View view = c2.itemView;
                this.f7497a = view.getLeft();
                this.f7498b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static void b(C c2) {
            int i = c2.mFlags;
            if (!c2.isInvalid() && (i & 4) == 0) {
                c2.getOldPosition();
                c2.getAbsoluteAdapterPosition();
            }
        }

        public abstract boolean a(C c2, C c10, c cVar, c cVar2);

        public final void c(C c2) {
            b bVar = this.f7491a;
            if (bVar != null) {
                l lVar = (l) bVar;
                lVar.getClass();
                c2.setIsRecyclable(true);
                if (c2.mShadowedHolder != null && c2.mShadowingHolder == null) {
                    c2.mShadowedHolder = null;
                }
                c2.mShadowingHolder = null;
                if (c2.shouldBeKeptAsChild()) {
                    return;
                }
                View view = c2.itemView;
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.removeAnimatingView(view) || !c2.isTmpDetached()) {
                    return;
                }
                recyclerView.removeDetachedView(c2.itemView, false);
            }
        }

        public abstract void d(C c2);

        public abstract void e();

        public abstract boolean f();
    }

    public class l implements k.b {
        public l() {
        }
    }

    public static abstract class m {
        @Deprecated
        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, y yVar) {
            getItemOffsets(rect, ((o) view.getLayoutParams()).f7506a.getLayoutPosition(), recyclerView);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, y yVar) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, y yVar) {
            onDrawOver(canvas, recyclerView);
        }
    }

    public static abstract class n {
        boolean mAutoMeasure;
        C0569g mChildHelper;
        private int mHeight;
        private int mHeightMode;
        O mHorizontalBoundCheck;
        private final O.b mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;
        x mSmoothScroller;
        O mVerticalBoundCheck;
        private final O.b mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        public class a implements O.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.O.b
            public final int a(View view) {
                return n.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((o) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.O.b
            public final int b() {
                return n.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.O.b
            public final int c() {
                n nVar = n.this;
                return nVar.getWidth() - nVar.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.O.b
            public final View d(int i) {
                return n.this.getChildAt(i);
            }

            @Override // androidx.recyclerview.widget.O.b
            public final int e(View view) {
                return n.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((o) view.getLayoutParams())).rightMargin;
            }
        }

        public class b implements O.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.O.b
            public final int a(View view) {
                return n.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((o) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.O.b
            public final int b() {
                return n.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.O.b
            public final int c() {
                n nVar = n.this;
                return nVar.getHeight() - nVar.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.O.b
            public final View d(int i) {
                return n.this.getChildAt(i);
            }

            @Override // androidx.recyclerview.widget.O.b
            public final int e(View view) {
                return n.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((o) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
        }

        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public int f7502a;

            /* renamed from: b, reason: collision with root package name */
            public int f7503b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f7504c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f7505d;
        }

        public n() {
            a aVar = new a();
            this.mHorizontalBoundCheckCallback = aVar;
            b bVar = new b();
            this.mVerticalBoundCheckCallback = bVar;
            this.mHorizontalBoundCheck = new O(aVar);
            this.mVerticalBoundCheck = new O(bVar);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        private void addViewInt(View view, int i, boolean z10) {
            C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z10 || childViewHolderInt.isRemoved()) {
                androidx.collection.g<C, P.a> gVar = this.mRecyclerView.mViewInfoStore.f7470a;
                P.a aVar = gVar.get(childViewHolderInt);
                if (aVar == null) {
                    aVar = P.a.a();
                    gVar.put(childViewHolderInt, aVar);
                }
                aVar.f7473a |= 1;
            } else {
                this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
            }
            o oVar = (o) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.b(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int j10 = this.mChildHelper.j(view);
                if (i == -1) {
                    i = this.mChildHelper.e();
                }
                if (j10 == -1) {
                    StringBuilder sb2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb2.append(this.mRecyclerView.indexOfChild(view));
                    throw new IllegalStateException(androidx.camera.core.impl.utils.a.h(this.mRecyclerView, sb2));
                }
                if (j10 != i) {
                    this.mRecyclerView.mLayout.moveView(j10, i);
                }
            } else {
                this.mChildHelper.a(view, i, false);
                oVar.f7508c = true;
                x xVar = this.mSmoothScroller;
                if (xVar != null && xVar.f7527e && xVar.f7524b.getChildLayoutPosition(view) == xVar.f7523a) {
                    xVar.f7528f = view;
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d(RecyclerView.TAG, "smooth scroll target view has been attached");
                    }
                }
            }
            if (oVar.f7509d) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "consuming pending invalidate on child " + oVar.f7506a);
                }
                childViewHolderInt.itemView.invalidate();
                oVar.f7509d = false;
            }
        }

        public static int chooseSize(int i, int i9, int i10) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i9, i10) : size : Math.min(size, Math.max(i9, i10));
        }

        private void detachViewInternal(int i, View view) {
            this.mChildHelper.c(i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
        
            if (r3 >= 0) goto L5;
         */
        @java.lang.Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L10
                if (r3 < 0) goto Le
            Lc:
                r2 = r0
                goto L1e
            Le:
                r3 = r2
                goto L1e
            L10:
                if (r3 < 0) goto L13
                goto Lc
            L13:
                r4 = -1
                if (r3 != r4) goto L18
                r3 = r1
                goto Lc
            L18:
                r4 = -2
                if (r3 != r4) goto Le
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1
            L1e:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.n.getChildMeasureSpec(int, int, int, boolean):int");
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width2 = rect.width() + left;
            int height2 = rect.height() + top;
            int i = left - paddingLeft;
            int min = Math.min(0, i);
            int i9 = top - paddingTop;
            int min2 = Math.min(0, i9);
            int i10 = width2 - width;
            int max = Math.max(0, i10);
            int max2 = Math.max(0, height2 - height);
            if (getLayoutDirection() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i10);
            }
            if (min2 == 0) {
                min2 = Math.min(i9, max2);
            }
            return new int[]{max, min2};
        }

        public static d getProperties(Context context, AttributeSet attributeSet, int i, int i9) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0507a.f4247a, i, i9);
            dVar.f7502a = obtainStyledAttributes.getInt(0, 1);
            dVar.f7503b = obtainStyledAttributes.getInt(10, 1);
            dVar.f7504c = obtainStyledAttributes.getBoolean(9, false);
            dVar.f7505d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i, int i9) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i < width && rect.right - i > paddingLeft && rect.top - i9 < height && rect.bottom - i9 > paddingTop;
        }

        private static boolean isMeasurementUpToDate(int i, int i9, int i10) {
            int mode = View.MeasureSpec.getMode(i9);
            int size = View.MeasureSpec.getSize(i9);
            if (i10 > 0 && i != i10) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        private void scrapOrRecycleView(u uVar, int i, View view) {
            C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "ignoring view " + childViewHolderInt);
                    return;
                }
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i);
                uVar.k(childViewHolderInt);
            } else {
                detachViewAt(i);
                uVar.l(view);
                this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(View view, int i, o oVar) {
            C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                androidx.collection.g<C, P.a> gVar = this.mRecyclerView.mViewInfoStore.f7470a;
                P.a aVar = gVar.get(childViewHolderInt);
                if (aVar == null) {
                    aVar = P.a.a();
                    gVar.put(childViewHolderInt, aVar);
                }
                aVar.f7473a |= 1;
            } else {
                this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
            }
            this.mChildHelper.b(view, i, oVar, childViewHolderInt.isRemoved());
        }

        public void calculateItemDecorationsForChild(View view, Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(o oVar) {
            return oVar != null;
        }

        public int computeHorizontalScrollExtent(y yVar) {
            return 0;
        }

        public int computeHorizontalScrollOffset(y yVar) {
            return 0;
        }

        public int computeHorizontalScrollRange(y yVar) {
            return 0;
        }

        public int computeVerticalScrollExtent(y yVar) {
            return 0;
        }

        public int computeVerticalScrollOffset(y yVar) {
            return 0;
        }

        public int computeVerticalScrollRange(y yVar) {
            return 0;
        }

        public void detachAndScrapAttachedViews(u uVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(uVar, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(View view, u uVar) {
            scrapOrRecycleView(uVar, this.mChildHelper.j(view), view);
        }

        public void detachAndScrapViewAt(int i, u uVar) {
            scrapOrRecycleView(uVar, i, getChildAt(i));
        }

        public void detachView(View view) {
            int j10 = this.mChildHelper.j(view);
            if (j10 >= 0) {
                detachViewInternal(j10, view);
            }
        }

        public void detachViewAt(int i) {
            detachViewInternal(i, getChildAt(i));
        }

        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        public void dispatchDetachedFromWindow(RecyclerView recyclerView, u uVar) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, uVar);
        }

        @SuppressLint({"UnknownNullness"})
        public void endAnimation(View view) {
            k kVar = this.mRecyclerView.mItemAnimator;
            if (kVar != null) {
                kVar.d(RecyclerView.getChildViewHolderInt(view));
            }
        }

        public View findContainingItemView(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.k(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        public View findViewByPosition(int i) {
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                C childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.f7544g || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public abstract o generateDefaultLayoutParams();

        @SuppressLint({"UnknownNullness"})
        public o generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof o ? new o((o) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new o((ViewGroup.MarginLayoutParams) layoutParams) : new o(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(View view) {
            return ((o) view.getLayoutParams()).f7507b.bottom;
        }

        public View getChildAt(int i) {
            C0569g c0569g = this.mChildHelper;
            if (c0569g != null) {
                return c0569g.d(i);
            }
            return null;
        }

        public int getChildCount() {
            C0569g c0569g = this.mChildHelper;
            if (c0569g != null) {
                return c0569g.e();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(u uVar, y yVar) {
            return -1;
        }

        public int getDecoratedBottom(View view) {
            return getBottomDecorationHeight(view) + view.getBottom();
        }

        public void getDecoratedBoundsWithMargins(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(View view) {
            Rect rect = ((o) view.getLayoutParams()).f7507b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(View view) {
            Rect rect = ((o) view.getLayoutParams()).f7507b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(View view) {
            return getRightDecorationWidth(view) + view.getRight();
        }

        public int getDecoratedTop(View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.k(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLayoutDirection() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
            return recyclerView.getLayoutDirection();
        }

        public int getLeftDecorationWidth(View view) {
            return ((o) view.getLayoutParams()).f7507b.left;
        }

        public int getMinimumHeight() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
            return recyclerView.getMinimumHeight();
        }

        public int getMinimumWidth() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
            return recyclerView.getMinimumWidth();
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
            return recyclerView.getPaddingEnd();
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
            return recyclerView.getPaddingStart();
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(View view) {
            return ((o) view.getLayoutParams()).f7506a.getLayoutPosition();
        }

        public int getRightDecorationWidth(View view) {
            return ((o) view.getLayoutParams()).f7507b.right;
        }

        public int getRowCountForAccessibility(u uVar, y yVar) {
            return -1;
        }

        public int getSelectionModeForAccessibility(u uVar, y yVar) {
            return 0;
        }

        public int getTopDecorationHeight(View view) {
            return ((o) view.getLayoutParams()).f7507b.top;
        }

        public void getTransformedBoundingBox(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((o) view.getLayoutParams()).f7507b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.h(this.mRecyclerView, new StringBuilder("View should be fully attached to be ignored")));
            }
            C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.d(childViewHolderInt);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(u uVar, y yVar) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            x xVar = this.mSmoothScroller;
            return xVar != null && xVar.f7527e;
        }

        public boolean isViewPartiallyVisible(View view, boolean z10, boolean z11) {
            boolean z12 = this.mHorizontalBoundCheck.b(view) && this.mVerticalBoundCheck.b(view);
            return z10 ? z12 : !z12;
        }

        public void layoutDecorated(View view, int i, int i9, int i10, int i11) {
            Rect rect = ((o) view.getLayoutParams()).f7507b;
            view.layout(i + rect.left, i9 + rect.top, i10 - rect.right, i11 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(View view, int i, int i9, int i10, int i11) {
            o oVar = (o) view.getLayoutParams();
            Rect rect = oVar.f7507b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) oVar).leftMargin, i9 + rect.top + ((ViewGroup.MarginLayoutParams) oVar).topMargin, (i10 - rect.right) - ((ViewGroup.MarginLayoutParams) oVar).rightMargin, (i11 - rect.bottom) - ((ViewGroup.MarginLayoutParams) oVar).bottomMargin);
        }

        public void measureChild(View view, int i, int i9) {
            o oVar = (o) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i10 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
            int i11 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i9;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i10, ((ViewGroup.MarginLayoutParams) oVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i11, ((ViewGroup.MarginLayoutParams) oVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, oVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(View view, int i, int i9) {
            o oVar = (o) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i10 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
            int i11 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i9;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) oVar).leftMargin + ((ViewGroup.MarginLayoutParams) oVar).rightMargin + i10, ((ViewGroup.MarginLayoutParams) oVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) oVar).topMargin + ((ViewGroup.MarginLayoutParams) oVar).bottomMargin + i11, ((ViewGroup.MarginLayoutParams) oVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, oVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i, int i9) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                detachViewAt(i);
                attachView(childAt, i9);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.mRecyclerView.toString());
            }
        }

        public void offsetChildrenHorizontal(int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        public void offsetChildrenVertical(int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i9) {
            return false;
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public View onFocusSearchFailed(View view, int i, u uVar, y yVar) {
            return null;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(C1638d c1638d) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, c1638d);
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view, C1638d c1638d) {
            C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.mChildHelper.k(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, c1638d);
        }

        public View onInterceptFocusSearch(View view, int i) {
            return null;
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i, int i9) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutChildren(u uVar, y yVar) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void onMeasure(u uVar, y yVar, int i, int i9) {
            this.mRecyclerView.defaultOnMeasure(i, i9);
        }

        @Deprecated
        public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onSmoothScrollerStopped(x xVar) {
            if (this.mSmoothScroller == xVar) {
                this.mSmoothScroller = null;
            }
        }

        public boolean performAccessibilityAction(int i, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }

        public boolean performAccessibilityActionForItem(u uVar, y yVar, View view, int i, Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
                recyclerView.postOnAnimation(runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.l(childCount);
            }
        }

        public void removeAndRecycleAllViews(u uVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, uVar);
                }
            }
        }

        public void removeAndRecycleScrapInt(u uVar) {
            ArrayList<C> arrayList;
            int size = uVar.f7514a.size();
            int i = size - 1;
            while (true) {
                arrayList = uVar.f7514a;
                if (i < 0) {
                    break;
                }
                View view = arrayList.get(i).itemView;
                C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(view, false);
                    }
                    k kVar = this.mRecyclerView.mItemAnimator;
                    if (kVar != null) {
                        kVar.d(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    C childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.mScrapContainer = null;
                    childViewHolderInt2.mInChangeScrap = false;
                    childViewHolderInt2.clearReturnedFromScrapFlag();
                    uVar.k(childViewHolderInt2);
                }
                i--;
            }
            arrayList.clear();
            ArrayList<C> arrayList2 = uVar.f7515b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(View view, u uVar) {
            removeView(view);
            uVar.j(view);
        }

        public void removeAndRecycleViewAt(int i, u uVar) {
            View childAt = getChildAt(i);
            removeViewAt(i);
            uVar.j(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        @SuppressLint({"UnknownNullness"})
        public void removeView(View view) {
            C0569g c0569g = this.mChildHelper;
            C0569g.b bVar = c0569g.f7640a;
            int i = c0569g.f7643d;
            if (i == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                c0569g.f7643d = 1;
                c0569g.f7644e = view;
                int indexOfChild = RecyclerView.this.indexOfChild(view);
                if (indexOfChild >= 0) {
                    if (c0569g.f7641b.f(indexOfChild)) {
                        c0569g.m(view);
                    }
                    ((e) bVar).a(indexOfChild);
                }
                c0569g.f7643d = 0;
                c0569g.f7644e = null;
            } catch (Throwable th) {
                c0569g.f7643d = 0;
                c0569g.f7644e = null;
                throw th;
            }
        }

        public void removeViewAt(int i) {
            if (getChildAt(i) != null) {
                this.mChildHelper.l(i);
            }
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z10, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollHorizontallyBy(int i, u uVar, y yVar) {
            return 0;
        }

        public void scrollToPosition(int i) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.e(RecyclerView.TAG, "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollVerticallyBy(int i, u uVar, y yVar) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z10) {
            this.mAutoMeasure = z10;
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z10) {
            if (z10 != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z10;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.p();
                }
            }
        }

        public void setMeasureSpecs(int i, int i9) {
            this.mWidth = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i9);
            int mode2 = View.MeasureSpec.getMode(i9);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(Rect rect, int i, int i9) {
            setMeasuredDimension(chooseSize(i, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i9, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
        }

        public void setMeasuredDimensionFromChildren(int i, int i9) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i, i9);
                return;
            }
            int i10 = Integer.MIN_VALUE;
            int i11 = Integer.MAX_VALUE;
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i15 = rect.left;
                if (i15 < i13) {
                    i13 = i15;
                }
                int i16 = rect.right;
                if (i16 > i10) {
                    i10 = i16;
                }
                int i17 = rect.top;
                if (i17 < i11) {
                    i11 = i17;
                }
                int i18 = rect.bottom;
                if (i18 > i12) {
                    i12 = i18;
                }
            }
            this.mRecyclerView.mTempRect.set(i13, i11, i10, i12);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i, i9);
        }

        public void setMeasurementCacheEnabled(boolean z10) {
            this.mMeasurementCacheEnabled = z10;
        }

        public void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        public boolean shouldMeasureChild(View view, int i, int i9, o oVar) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) oVar).width) && isMeasurementUpToDate(view.getHeight(), i9, ((ViewGroup.MarginLayoutParams) oVar).height)) ? false : true;
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        public boolean shouldReMeasureChild(View view, int i, int i9, o oVar) {
            return (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) oVar).width) && isMeasurementUpToDate(view.getMeasuredHeight(), i9, ((ViewGroup.MarginLayoutParams) oVar).height)) ? false : true;
        }

        @SuppressLint({"UnknownNullness"})
        public void smoothScrollToPosition(RecyclerView recyclerView, y yVar, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        @SuppressLint({"UnknownNullness"})
        public void startSmoothScroll(x xVar) {
            x xVar2 = this.mSmoothScroller;
            if (xVar2 != null && xVar != xVar2 && xVar2.f7527e) {
                xVar2.d();
            }
            this.mSmoothScroller = xVar;
            RecyclerView recyclerView = this.mRecyclerView;
            xVar.getClass();
            B b9 = recyclerView.mViewFlinger;
            RecyclerView.this.removeCallbacks(b9);
            b9.f7480c.abortAnimation();
            if (xVar.f7530h) {
                Log.w(RecyclerView.TAG, "An instance of " + xVar.getClass().getSimpleName() + " was started more than once. Each instance of" + xVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            xVar.f7524b = recyclerView;
            xVar.f7525c = this;
            int i = xVar.f7523a;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.f7538a = i;
            xVar.f7527e = true;
            xVar.f7526d = true;
            xVar.f7528f = recyclerView.mLayout.findViewByPosition(i);
            xVar.f7524b.mViewFlinger.b();
            xVar.f7530h = true;
        }

        public void stopIgnoringView(View view) {
            C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        public void stopSmoothScroller() {
            x xVar = this.mSmoothScroller;
            if (xVar != null) {
                xVar.d();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view, int i) {
            addViewInt(view, i, true);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view, int i) {
            addViewInt(view, i, false);
        }

        @SuppressLint({"UnknownNullness"})
        public void onDetachedFromWindow(RecyclerView recyclerView, u uVar) {
            onDetachedFromWindow(recyclerView);
        }

        public void onInitializeAccessibilityEvent(u uVar, y yVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            Adapter adapter = this.mRecyclerView.mAdapter;
            if (adapter != null) {
                accessibilityEvent.setItemCount(adapter.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(u uVar, y yVar, C1638d c1638d) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                c1638d.a(8192);
                c1638d.l(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                c1638d.a(4096);
                c1638d.l(true);
            }
            c1638d.i(C1638d.e.a(getRowCountForAccessibility(uVar, yVar), getColumnCountForAccessibility(uVar, yVar), getSelectionModeForAccessibility(uVar, yVar), isLayoutHierarchical(uVar, yVar)));
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i, int i9, Object obj) {
            onItemsUpdated(recyclerView, i, i9);
        }

        public boolean onRequestChildFocus(RecyclerView recyclerView, y yVar, View view, View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public boolean performAccessibilityAction(u uVar, y yVar, int i, Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            int i9;
            int i10;
            if (this.mRecyclerView == null) {
                return false;
            }
            int height = getHeight();
            int width = getWidth();
            Rect rect = new Rect();
            if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
                height = rect.height();
                width = rect.width();
            }
            if (i == 4096) {
                paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                    i9 = paddingTop;
                    i10 = paddingLeft;
                }
                i9 = paddingTop;
                i10 = 0;
            } else if (i != 8192) {
                i10 = 0;
                i9 = 0;
            } else {
                paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                    i9 = paddingTop;
                    i10 = paddingLeft;
                }
                i9 = paddingTop;
                i10 = 0;
            }
            if (i9 == 0 && i10 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i10, i9, null, Integer.MIN_VALUE, true);
            return true;
        }

        public boolean performAccessibilityActionForItem(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
            int i = childRectangleOnScreenScrollAmount[0];
            int i9 = childRectangleOnScreenScrollAmount[1];
            if ((z11 && !isFocusedChildVisibleAfterScrolling(recyclerView, i, i9)) || (i == 0 && i9 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i, i9);
            } else {
                recyclerView.smoothScrollBy(i, i9);
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
        
            if (r5 == 1073741824) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1d
                if (r7 < 0) goto L12
            L10:
                r5 = r3
                goto L30
            L12:
                if (r7 != r1) goto L1a
                if (r5 == r2) goto L22
                if (r5 == 0) goto L1a
                if (r5 == r3) goto L22
            L1a:
                r5 = r6
                r7 = r5
                goto L30
            L1d:
                if (r7 < 0) goto L20
                goto L10
            L20:
                if (r7 != r1) goto L24
            L22:
                r7 = r4
                goto L30
            L24:
                if (r7 != r0) goto L1a
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2b
                goto L2e
            L2b:
                r7 = r4
                r5 = r6
                goto L30
            L2e:
                r7 = r4
                r5 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.n.getChildMeasureSpec(int, int, int, int, boolean):int");
        }

        public void onInitializeAccessibilityNodeInfoForItem(u uVar, y yVar, View view, C1638d c1638d) {
        }

        @SuppressLint({"UnknownNullness"})
        public o generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new o(context, attributeSet);
        }

        public void setMeasuredDimension(int i, int i9) {
            this.mRecyclerView.setMeasuredDimension(i, i9);
        }

        public void attachView(View view, int i) {
            attachView(view, i, (o) view.getLayoutParams());
        }

        public void attachView(View view) {
            attachView(view, -1);
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        public void onItemsChanged(RecyclerView recyclerView) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutCompleted(y yVar) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public void onScrollStateChanged(int i) {
        }

        @SuppressLint({"UnknownNullness"})
        public void collectInitialPrefetchPositions(int i, c cVar) {
        }

        public void onAdapterChanged(Adapter adapter, Adapter adapter2) {
        }

        public void onItemsAdded(RecyclerView recyclerView, int i, int i9) {
        }

        public void onItemsRemoved(RecyclerView recyclerView, int i, int i9) {
        }

        @SuppressLint({"UnknownNullness"})
        public void collectAdjacentPrefetchPositions(int i, int i9, y yVar, c cVar) {
        }

        public void onItemsMoved(RecyclerView recyclerView, int i, int i9, int i10) {
        }
    }

    public interface p {
        void onChildViewAttachedToWindow(View view);

        void onChildViewDetachedFromWindow(View view);
    }

    public static abstract class q {
    }

    public interface r {
        void a(MotionEvent motionEvent);

        boolean b(MotionEvent motionEvent);

        void c(boolean z10);
    }

    public static class t {
        private static final int DEFAULT_MAX_SCRAP = 5;
        SparseArray<a> mScrap = new SparseArray<>();
        int mAttachCountForClearing = 0;
        Set<Adapter<?>> mAttachedAdaptersForPoolingContainer = Collections.newSetFromMap(new IdentityHashMap());

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final ArrayList<C> f7510a = new ArrayList<>();

            /* renamed from: b, reason: collision with root package name */
            public int f7511b = 5;

            /* renamed from: c, reason: collision with root package name */
            public long f7512c = 0;

            /* renamed from: d, reason: collision with root package name */
            public long f7513d = 0;
        }

        private a getScrapDataForType(int i) {
            a aVar = this.mScrap.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.mScrap.put(i, aVar2);
            return aVar2;
        }

        public void attach() {
            this.mAttachCountForClearing++;
        }

        public void attachForPoolingContainer(Adapter<?> adapter) {
            this.mAttachedAdaptersForPoolingContainer.add(adapter);
        }

        public void clear() {
            for (int i = 0; i < this.mScrap.size(); i++) {
                a valueAt = this.mScrap.valueAt(i);
                Iterator<C> it = valueAt.f7510a.iterator();
                while (it.hasNext()) {
                    D9.b.j(it.next().itemView);
                }
                valueAt.f7510a.clear();
            }
        }

        public void detach() {
            this.mAttachCountForClearing--;
        }

        public void detachForPoolingContainer(Adapter<?> adapter, boolean z10) {
            this.mAttachedAdaptersForPoolingContainer.remove(adapter);
            if (this.mAttachedAdaptersForPoolingContainer.size() != 0 || z10) {
                return;
            }
            for (int i = 0; i < this.mScrap.size(); i++) {
                SparseArray<a> sparseArray = this.mScrap;
                ArrayList<C> arrayList = sparseArray.get(sparseArray.keyAt(i)).f7510a;
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    D9.b.j(arrayList.get(i9).itemView);
                }
            }
        }

        public void factorInBindTime(int i, long j10) {
            a scrapDataForType = getScrapDataForType(i);
            scrapDataForType.f7513d = runningAverage(scrapDataForType.f7513d, j10);
        }

        public void factorInCreateTime(int i, long j10) {
            a scrapDataForType = getScrapDataForType(i);
            scrapDataForType.f7512c = runningAverage(scrapDataForType.f7512c, j10);
        }

        public C getRecycledView(int i) {
            a aVar = this.mScrap.get(i);
            if (aVar == null) {
                return null;
            }
            ArrayList<C> arrayList = aVar.f7510a;
            if (arrayList.isEmpty()) {
                return null;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public int getRecycledViewCount(int i) {
            return getScrapDataForType(i).f7510a.size();
        }

        public void onAdapterChanged(Adapter<?> adapter, Adapter<?> adapter2, boolean z10) {
            if (adapter != null) {
                detach();
            }
            if (!z10 && this.mAttachCountForClearing == 0) {
                clear();
            }
            if (adapter2 != null) {
                attach();
            }
        }

        public void putRecycledView(C c2) {
            int itemViewType = c2.getItemViewType();
            ArrayList<C> arrayList = getScrapDataForType(itemViewType).f7510a;
            if (this.mScrap.get(itemViewType).f7511b <= arrayList.size()) {
                D9.b.j(c2.itemView);
            } else {
                if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(c2)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                c2.resetInternal();
                arrayList.add(c2);
            }
        }

        public long runningAverage(long j10, long j11) {
            if (j10 == 0) {
                return j11;
            }
            return (j11 / 4) + ((j10 / 4) * 3);
        }

        public void setMaxRecycledViews(int i, int i9) {
            a scrapDataForType = getScrapDataForType(i);
            scrapDataForType.f7511b = i9;
            ArrayList<C> arrayList = scrapDataForType.f7510a;
            while (arrayList.size() > i9) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        public int size() {
            int i = 0;
            for (int i9 = 0; i9 < this.mScrap.size(); i9++) {
                ArrayList<C> arrayList = this.mScrap.valueAt(i9).f7510a;
                if (arrayList != null) {
                    i = arrayList.size() + i;
                }
            }
            return i;
        }

        public boolean willBindInTime(int i, long j10, long j11) {
            long j12 = getScrapDataForType(i).f7513d;
            return j12 == 0 || j10 + j12 < j11;
        }

        public boolean willCreateInTime(int i, long j10, long j11) {
            long j12 = getScrapDataForType(i).f7512c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    public final class u {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList<C> f7514a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<C> f7515b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList<C> f7516c;

        /* renamed from: d, reason: collision with root package name */
        public final List<C> f7517d;

        /* renamed from: e, reason: collision with root package name */
        public int f7518e;

        /* renamed from: f, reason: collision with root package name */
        public int f7519f;

        /* renamed from: g, reason: collision with root package name */
        public t f7520g;

        public u() {
            ArrayList<C> arrayList = new ArrayList<>();
            this.f7514a = arrayList;
            this.f7515b = null;
            this.f7516c = new ArrayList<>();
            this.f7517d = Collections.unmodifiableList(arrayList);
            this.f7518e = 2;
            this.f7519f = 2;
        }

        public static void f(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    f((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        public final void a(C c2, boolean z10) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(c2);
            View view = c2.itemView;
            RecyclerView recyclerView = RecyclerView.this;
            J j10 = recyclerView.mAccessibilityDelegate;
            if (j10 != null) {
                J.a aVar = j10.f7430e;
                C1596C.o(view, aVar instanceof J.a ? (C1597a) aVar.f7432e.remove(view) : null);
            }
            if (z10) {
                v vVar = recyclerView.mRecyclerListener;
                if (vVar != null) {
                    vVar.a();
                }
                int size = recyclerView.mRecyclerListeners.size();
                for (int i = 0; i < size; i++) {
                    recyclerView.mRecyclerListeners.get(i).a();
                }
                Adapter adapter = recyclerView.mAdapter;
                if (adapter != null) {
                    adapter.onViewRecycled(c2);
                }
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.d(c2);
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d(RecyclerView.TAG, "dispatchViewRecycled: " + c2);
                }
            }
            c2.mBindingAdapter = null;
            c2.mOwnerRecyclerView = null;
            d().putRecycledView(c2);
        }

        public final void b(int i, View view) {
            o oVar;
            C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            RecyclerView recyclerView = RecyclerView.this;
            if (childViewHolderInt == null) {
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.h(recyclerView, new StringBuilder("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter")));
            }
            int f10 = recyclerView.mAdapterHelper.f(i, 0);
            if (f10 < 0 || f10 >= recyclerView.mAdapter.getItemCount()) {
                StringBuilder q10 = androidx.camera.core.impl.utils.a.q(i, f10, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                q10.append(recyclerView.mState.b());
                q10.append(recyclerView.exceptionLabel());
                throw new IndexOutOfBoundsException(q10.toString());
            }
            m(childViewHolderInt, f10, i, RecyclerView.FOREVER_NS);
            ViewGroup.LayoutParams layoutParams = childViewHolderInt.itemView.getLayoutParams();
            if (layoutParams == null) {
                oVar = (o) recyclerView.generateDefaultLayoutParams();
                childViewHolderInt.itemView.setLayoutParams(oVar);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                oVar = (o) layoutParams;
            } else {
                oVar = (o) recyclerView.generateLayoutParams(layoutParams);
                childViewHolderInt.itemView.setLayoutParams(oVar);
            }
            oVar.f7508c = true;
            oVar.f7506a = childViewHolderInt;
            oVar.f7509d = childViewHolderInt.itemView.getParent() == null;
        }

        public final int c(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i >= 0 && i < recyclerView.mState.b()) {
                return !recyclerView.mState.f7544g ? i : recyclerView.mAdapterHelper.f(i, 0);
            }
            StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("invalid position ", i, ". State item count is ");
            l10.append(recyclerView.mState.b());
            l10.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(l10.toString());
        }

        public final t d() {
            if (this.f7520g == null) {
                this.f7520g = new t();
                g();
            }
            return this.f7520g;
        }

        public final View e(int i) {
            return n(i, RecyclerView.FOREVER_NS).itemView;
        }

        public final void g() {
            if (this.f7520g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.f7520g.attachForPoolingContainer(recyclerView.mAdapter);
            }
        }

        public final void h() {
            ArrayList<C> arrayList = this.f7516c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                i(size);
            }
            arrayList.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                t.b bVar = RecyclerView.this.mPrefetchRegistry;
                int[] iArr = bVar.f7765c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f7766d = 0;
            }
        }

        public final void i(int i) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "Recycling cached view at index " + i);
            }
            ArrayList<C> arrayList = this.f7516c;
            C c2 = arrayList.get(i);
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d(RecyclerView.TAG, "CachedViewHolder to be recycled: " + c2);
            }
            a(c2, true);
            arrayList.remove(i);
        }

        public final void j(View view) {
            C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean isTmpDetached = childViewHolderInt.isTmpDetached();
            RecyclerView recyclerView = RecyclerView.this;
            if (isTmpDetached) {
                recyclerView.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            k(childViewHolderInt);
            if (recyclerView.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            recyclerView.mItemAnimator.d(childViewHolderInt);
        }

        /* JADX WARN: Code restructure failed: missing block: B:68:0x00d4, code lost:
        
            r4 = r4 - 1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void k(androidx.recyclerview.widget.RecyclerView.C r12) {
            /*
                Method dump skipped, instructions count: 341
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.k(androidx.recyclerview.widget.RecyclerView$C):void");
        }

        public final void l(View view) {
            C childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean hasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
            RecyclerView recyclerView = RecyclerView.this;
            if (!hasAnyOfTheFlags && childViewHolderInt.isUpdated() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f7515b == null) {
                    this.f7515b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f7515b.add(childViewHolderInt);
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !recyclerView.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.h(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
            childViewHolderInt.setScrapContainer(this, false);
            this.f7514a.add(childViewHolderInt);
        }

        public final boolean m(C c2, int i, int i9, long j10) {
            c2.mBindingAdapter = null;
            RecyclerView recyclerView = RecyclerView.this;
            c2.mOwnerRecyclerView = recyclerView;
            int itemViewType = c2.getItemViewType();
            long nanoTime = recyclerView.getNanoTime();
            boolean z10 = false;
            if (j10 != RecyclerView.FOREVER_NS && !this.f7520g.willBindInTime(itemViewType, nanoTime, j10)) {
                return false;
            }
            if (c2.isTmpDetached()) {
                recyclerView.attachViewToParent(c2.itemView, recyclerView.getChildCount(), c2.itemView.getLayoutParams());
                z10 = true;
            }
            recyclerView.mAdapter.bindViewHolder(c2, i);
            if (z10) {
                recyclerView.detachViewFromParent(c2.itemView);
            }
            this.f7520g.factorInBindTime(c2.getItemViewType(), recyclerView.getNanoTime() - nanoTime);
            if (recyclerView.isAccessibilityEnabled()) {
                View view = c2.itemView;
                WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                J j11 = recyclerView.mAccessibilityDelegate;
                if (j11 != null) {
                    J.a aVar = j11.f7430e;
                    if (aVar instanceof J.a) {
                        aVar.getClass();
                        View.AccessibilityDelegate d10 = C1596C.d(view);
                        C1597a c1597a = d10 != null ? d10 instanceof C1597a.C0481a ? ((C1597a.C0481a) d10).f31048a : new C1597a(d10) : null;
                        if (c1597a != null && c1597a != aVar) {
                            aVar.f7432e.put(view, c1597a);
                        }
                    }
                    C1596C.o(view, aVar);
                }
            }
            if (recyclerView.mState.f7544g) {
                c2.mPreLayoutPosition = i9;
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x01df, code lost:
        
            if (r7.mState.f7544g == false) goto L121;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x021c, code lost:
        
            r5.addFlags(4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0224, code lost:
        
            if (r5.isScrap() == false) goto L124;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0226, code lost:
        
            r7.removeDetachedView(r5.itemView, false);
            r5.unScrap();
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0238, code lost:
        
            k(r5);
            r5 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0233, code lost:
        
            if (r5.wasReturnedFromScrap() == false) goto L127;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0235, code lost:
        
            r5.clearReturnedFromScrapFlag();
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0200, code lost:
        
            if (r7.mAdapter.getItemViewType(r5.mPosition) != r5.getItemViewType()) goto L121;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0219, code lost:
        
            if (r5.getItemId() != r7.mAdapter.getItemId(r5.mPosition)) goto L121;
         */
        /* JADX WARN: Removed duplicated region for block: B:205:0x03cd  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:214:0x043f  */
        /* JADX WARN: Removed duplicated region for block: B:217:0x0463 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:221:0x044b  */
        /* JADX WARN: Removed duplicated region for block: B:241:0x0087  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.recyclerview.widget.RecyclerView.C n(int r23, long r24) {
            /*
                Method dump skipped, instructions count: 1165
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.n(int, long):androidx.recyclerview.widget.RecyclerView$C");
        }

        public final void o(C c2) {
            if (c2.mInChangeScrap) {
                this.f7515b.remove(c2);
            } else {
                this.f7514a.remove(c2);
            }
            c2.mScrapContainer = null;
            c2.mInChangeScrap = false;
            c2.clearReturnedFromScrapFlag();
        }

        public final void p() {
            n nVar = RecyclerView.this.mLayout;
            this.f7519f = this.f7518e + (nVar != null ? nVar.mPrefetchMaxCountObserved : 0);
            ArrayList<C> arrayList = this.f7516c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f7519f; size--) {
                i(size);
            }
        }
    }

    public interface v {
        void a();
    }

    public class w extends h {
        public w() {
        }

        public final void a() {
            boolean z10 = RecyclerView.POST_UPDATES_ON_ANIMATION;
            RecyclerView recyclerView = RecyclerView.this;
            if (!z10 || !recyclerView.mHasFixedSize || !recyclerView.mIsAttached) {
                recyclerView.mAdapterUpdateDuringMeasure = true;
                recyclerView.requestLayout();
            } else {
                Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
                WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
                recyclerView.postOnAnimation(runnable);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onChanged() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            recyclerView.mState.f7543f = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (recyclerView.mAdapterHelper.g()) {
                return;
            }
            recyclerView.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onItemRangeChanged(int i, int i9, Object obj) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            C0563a c0563a = recyclerView.mAdapterHelper;
            if (i9 < 1) {
                c0563a.getClass();
                return;
            }
            ArrayList<C0563a.b> arrayList = c0563a.f7603b;
            arrayList.add(c0563a.h(4, i, i9, obj));
            c0563a.f7607f |= 4;
            if (arrayList.size() == 1) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onItemRangeInserted(int i, int i9) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            C0563a c0563a = recyclerView.mAdapterHelper;
            if (i9 < 1) {
                c0563a.getClass();
                return;
            }
            ArrayList<C0563a.b> arrayList = c0563a.f7603b;
            arrayList.add(c0563a.h(1, i, i9, null));
            c0563a.f7607f |= 1;
            if (arrayList.size() == 1) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onItemRangeMoved(int i, int i9, int i10) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            C0563a c0563a = recyclerView.mAdapterHelper;
            c0563a.getClass();
            if (i == i9) {
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
            }
            ArrayList<C0563a.b> arrayList = c0563a.f7603b;
            arrayList.add(c0563a.h(8, i, i9, null));
            c0563a.f7607f |= 8;
            if (arrayList.size() == 1) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onItemRangeRemoved(int i, int i9) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            C0563a c0563a = recyclerView.mAdapterHelper;
            if (i9 < 1) {
                c0563a.getClass();
                return;
            }
            ArrayList<C0563a.b> arrayList = c0563a.f7603b;
            arrayList.add(c0563a.h(2, i, i9, null));
            c0563a.f7607f |= 2;
            if (arrayList.size() == 1) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onStateRestorationPolicyChanged() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState == null || (adapter = recyclerView.mAdapter) == null || !adapter.canRestoreState()) {
                return;
            }
            recyclerView.requestLayout();
        }
    }

    public static abstract class x {

        /* renamed from: a, reason: collision with root package name */
        public int f7523a = -1;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView f7524b;

        /* renamed from: c, reason: collision with root package name */
        public n f7525c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f7526d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f7527e;

        /* renamed from: f, reason: collision with root package name */
        public View f7528f;

        /* renamed from: g, reason: collision with root package name */
        public final a f7529g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f7530h;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public int f7531a;

            /* renamed from: b, reason: collision with root package name */
            public int f7532b;

            /* renamed from: c, reason: collision with root package name */
            public int f7533c;

            /* renamed from: d, reason: collision with root package name */
            public int f7534d;

            /* renamed from: e, reason: collision with root package name */
            public Interpolator f7535e;

            /* renamed from: f, reason: collision with root package name */
            public boolean f7536f;

            /* renamed from: g, reason: collision with root package name */
            public int f7537g;

            public final void a(RecyclerView recyclerView) {
                int i = this.f7534d;
                if (i >= 0) {
                    this.f7534d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f7536f = false;
                    return;
                }
                if (!this.f7536f) {
                    this.f7537g = 0;
                    return;
                }
                Interpolator interpolator = this.f7535e;
                if (interpolator != null && this.f7533c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                int i9 = this.f7533c;
                if (i9 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                recyclerView.mViewFlinger.c(this.f7531a, this.f7532b, interpolator, i9);
                int i10 = this.f7537g + 1;
                this.f7537g = i10;
                if (i10 > 10) {
                    Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f7536f = false;
            }
        }

        public interface b {
            PointF computeScrollVectorForPosition(int i);
        }

        public x() {
            a aVar = new a();
            aVar.f7534d = -1;
            aVar.f7536f = false;
            aVar.f7537g = 0;
            aVar.f7531a = 0;
            aVar.f7532b = 0;
            aVar.f7533c = Integer.MIN_VALUE;
            aVar.f7535e = null;
            this.f7529g = aVar;
        }

        public PointF a(int i) {
            Object obj = this.f7525c;
            if (obj instanceof b) {
                return ((b) obj).computeScrollVectorForPosition(i);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public final void b(int i, int i9) {
            PointF a10;
            RecyclerView recyclerView = this.f7524b;
            if (this.f7523a == -1 || recyclerView == null) {
                d();
            }
            if (this.f7526d && this.f7528f == null && this.f7525c != null && (a10 = a(this.f7523a)) != null) {
                float f10 = a10.x;
                if (f10 != RecyclerView.DECELERATION_RATE || a10.y != RecyclerView.DECELERATION_RATE) {
                    recyclerView.scrollStep((int) Math.signum(f10), (int) Math.signum(a10.y), null);
                }
            }
            this.f7526d = false;
            View view = this.f7528f;
            a aVar = this.f7529g;
            if (view != null) {
                if (this.f7524b.getChildLayoutPosition(view) == this.f7523a) {
                    View view2 = this.f7528f;
                    y yVar = recyclerView.mState;
                    c(view2, aVar);
                    aVar.a(recyclerView);
                    d();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f7528f = null;
                }
            }
            if (this.f7527e) {
                y yVar2 = recyclerView.mState;
                androidx.recyclerview.widget.A a11 = (androidx.recyclerview.widget.A) this;
                if (a11.f7524b.mLayout.getChildCount() == 0) {
                    a11.d();
                } else {
                    int i10 = a11.f7406o;
                    int i11 = i10 - i;
                    if (i10 * i11 <= 0) {
                        i11 = 0;
                    }
                    a11.f7406o = i11;
                    int i12 = a11.f7407p;
                    int i13 = i12 - i9;
                    if (i12 * i13 <= 0) {
                        i13 = 0;
                    }
                    a11.f7407p = i13;
                    if (i11 == 0 && i13 == 0) {
                        PointF a12 = a11.a(a11.f7523a);
                        if (a12 != null) {
                            if (a12.x != RecyclerView.DECELERATION_RATE || a12.y != RecyclerView.DECELERATION_RATE) {
                                float f11 = a12.y;
                                float sqrt = (float) Math.sqrt((f11 * f11) + (r9 * r9));
                                float f12 = a12.x / sqrt;
                                a12.x = f12;
                                float f13 = a12.y / sqrt;
                                a12.y = f13;
                                a11.f7402k = a12;
                                a11.f7406o = (int) (f12 * 10000.0f);
                                a11.f7407p = (int) (f13 * 10000.0f);
                                int i14 = a11.i(ModuleDescriptor.MODULE_VERSION);
                                int i15 = (int) (a11.f7406o * 1.2f);
                                int i16 = (int) (a11.f7407p * 1.2f);
                                LinearInterpolator linearInterpolator = a11.i;
                                aVar.f7531a = i15;
                                aVar.f7532b = i16;
                                aVar.f7533c = (int) (i14 * 1.2f);
                                aVar.f7535e = linearInterpolator;
                                aVar.f7536f = true;
                            }
                        }
                        aVar.f7534d = a11.f7523a;
                        a11.d();
                    }
                }
                boolean z10 = aVar.f7534d >= 0;
                aVar.a(recyclerView);
                if (z10 && this.f7527e) {
                    this.f7526d = true;
                    recyclerView.mViewFlinger.b();
                }
            }
        }

        public abstract void c(View view, a aVar);

        public final void d() {
            if (this.f7527e) {
                this.f7527e = false;
                androidx.recyclerview.widget.A a10 = (androidx.recyclerview.widget.A) this;
                a10.f7407p = 0;
                a10.f7406o = 0;
                a10.f7402k = null;
                this.f7524b.mState.f7538a = -1;
                this.f7528f = null;
                this.f7523a = -1;
                this.f7526d = false;
                this.f7525c.onSmoothScrollerStopped(this);
                this.f7525c = null;
                this.f7524b = null;
            }
        }
    }

    public static class y {

        /* renamed from: a, reason: collision with root package name */
        public int f7538a;

        /* renamed from: b, reason: collision with root package name */
        public int f7539b;

        /* renamed from: c, reason: collision with root package name */
        public int f7540c;

        /* renamed from: d, reason: collision with root package name */
        public int f7541d;

        /* renamed from: e, reason: collision with root package name */
        public int f7542e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f7543f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f7544g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f7545h;
        public boolean i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f7546j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f7547k;

        /* renamed from: l, reason: collision with root package name */
        public int f7548l;

        /* renamed from: m, reason: collision with root package name */
        public long f7549m;

        /* renamed from: n, reason: collision with root package name */
        public int f7550n;

        public final void a(int i) {
            if ((this.f7541d & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f7541d));
        }

        public final int b() {
            return this.f7544g ? this.f7539b - this.f7540c : this.f7542e;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("State{mTargetPosition=");
            sb2.append(this.f7538a);
            sb2.append(", mData=null, mItemCount=");
            sb2.append(this.f7542e);
            sb2.append(", mIsMeasuring=");
            sb2.append(this.i);
            sb2.append(", mPreviousLayoutItemCount=");
            sb2.append(this.f7539b);
            sb2.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb2.append(this.f7540c);
            sb2.append(", mStructureChanged=");
            sb2.append(this.f7543f);
            sb2.append(", mInPreLayout=");
            sb2.append(this.f7544g);
            sb2.append(", mRunSimpleAnimations=");
            sb2.append(this.f7546j);
            sb2.append(", mRunPredictiveAnimations=");
            return androidx.camera.core.impl.utils.a.o(sb2, this.f7547k, '}');
        }
    }

    public static class z extends j {
    }

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new InterpolatorC0562c();
        sDefaultEdgeEffectFactory = new z();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(C c2) {
        View view = c2.itemView;
        boolean z10 = view.getParent() == this;
        this.mRecycler.o(getChildViewHolder(view));
        if (c2.isTmpDetached()) {
            this.mChildHelper.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z10) {
            this.mChildHelper.a(view, -1, true);
            return;
        }
        C0569g c0569g = this.mChildHelper;
        int indexOfChild = RecyclerView.this.indexOfChild(view);
        if (indexOfChild >= 0) {
            c0569g.f7641b.h(indexOfChild);
            c0569g.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    private void animateChange(C c2, C c10, k.c cVar, k.c cVar2, boolean z10, boolean z11) {
        c2.setIsRecyclable(false);
        if (z10) {
            addAnimatingView(c2);
        }
        if (c2 != c10) {
            if (z11) {
                addAnimatingView(c10);
            }
            c2.mShadowedHolder = c10;
            addAnimatingView(c2);
            this.mRecycler.o(c2);
            c10.setIsRecyclable(false);
            c10.mShadowingHolder = c2;
        }
        if (this.mItemAnimator.a(c2, c10, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(C c2) {
        WeakReference<RecyclerView> weakReference = c2.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == c2.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            c2.mNestedRecyclerView = null;
        }
    }

    private int consumeFlingInStretch(int i9, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i10) {
        if (i9 > 0 && edgeEffect != null && B0.b.a(edgeEffect) != DECELERATION_RATE) {
            int round = Math.round(B0.b.b(edgeEffect, ((-i9) * FLING_DESTRETCH_FACTOR) / i10, 0.5f) * ((-i10) / FLING_DESTRETCH_FACTOR));
            if (round != i9) {
                edgeEffect.finish();
            }
            return i9 - round;
        }
        if (i9 >= 0 || edgeEffect2 == null || B0.b.a(edgeEffect2) == DECELERATION_RATE) {
            return i9;
        }
        float f10 = i10;
        int round2 = Math.round(B0.b.b(edgeEffect2, (i9 * FLING_DESTRETCH_FACTOR) / f10, 0.5f) * (f10 / FLING_DESTRETCH_FACTOR));
        if (round2 != i9) {
            edgeEffect2.finish();
        }
        return i9 - round2;
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i9, int i10) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(n.class);
                try {
                    constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i9), Integer.valueOf(i10)};
                } catch (NoSuchMethodException e10) {
                    objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((n) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e16);
            }
        }
    }

    private boolean didChildRangeChange(int i9, int i10) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i9 && iArr[1] == i10) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i9 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i9 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        obtain.setContentChangeTypes(i9);
        sendAccessibilityEventUnchecked(obtain);
    }

    private void dispatchLayoutStep1() {
        P.a aVar;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.i = false;
        startInterceptRequestLayout();
        P p10 = this.mViewInfoStore;
        p10.f7470a.clear();
        p10.f7471b.clear();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        y yVar = this.mState;
        yVar.f7545h = yVar.f7546j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        yVar.f7544g = yVar.f7547k;
        yVar.f7542e = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f7546j) {
            int e10 = this.mChildHelper.e();
            for (int i9 = 0; i9 < e10; i9++) {
                C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i9));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    k kVar = this.mItemAnimator;
                    k.b(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    kVar.getClass();
                    k.c cVar = new k.c();
                    cVar.a(childViewHolderInt);
                    androidx.collection.g<C, P.a> gVar = this.mViewInfoStore.f7470a;
                    P.a aVar2 = gVar.get(childViewHolderInt);
                    if (aVar2 == null) {
                        aVar2 = P.a.a();
                        gVar.put(childViewHolderInt, aVar2);
                    }
                    aVar2.f7474b = cVar;
                    aVar2.f7473a |= 4;
                    if (this.mState.f7545h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.f7471b.put(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f7547k) {
            saveOldPositions();
            y yVar2 = this.mState;
            boolean z10 = yVar2.f7543f;
            yVar2.f7543f = false;
            this.mLayout.onLayoutChildren(this.mRecycler, yVar2);
            this.mState.f7543f = z10;
            for (int i10 = 0; i10 < this.mChildHelper.e(); i10++) {
                C childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.d(i10));
                if (!childViewHolderInt2.shouldIgnore() && ((aVar = this.mViewInfoStore.f7470a.get(childViewHolderInt2)) == null || (aVar.f7473a & 4) == 0)) {
                    k.b(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    k kVar2 = this.mItemAnimator;
                    childViewHolderInt2.getUnmodifiedPayloads();
                    kVar2.getClass();
                    k.c cVar2 = new k.c();
                    cVar2.a(childViewHolderInt2);
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, cVar2);
                    } else {
                        androidx.collection.g<C, P.a> gVar2 = this.mViewInfoStore.f7470a;
                        P.a aVar3 = gVar2.get(childViewHolderInt2);
                        if (aVar3 == null) {
                            aVar3 = P.a.a();
                            gVar2.put(childViewHolderInt2, aVar3);
                        }
                        aVar3.f7473a |= 2;
                        aVar3.f7474b = cVar2;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f7541d = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.c();
        this.mState.f7542e = this.mAdapter.getItemCount();
        this.mState.f7540c = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f7485c;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        y yVar = this.mState;
        yVar.f7544g = false;
        this.mLayout.onLayoutChildren(this.mRecycler, yVar);
        y yVar2 = this.mState;
        yVar2.f7543f = false;
        yVar2.f7546j = yVar2.f7546j && this.mItemAnimator != null;
        yVar2.f7541d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        y yVar = this.mState;
        yVar.f7541d = 1;
        if (yVar.f7546j) {
            for (int e10 = this.mChildHelper.e() - 1; e10 >= 0; e10--) {
                C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(e10));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    this.mItemAnimator.getClass();
                    k.c cVar = new k.c();
                    cVar.a(childViewHolderInt);
                    C c2 = this.mViewInfoStore.f7471b.get(changedHolderKey);
                    if (c2 == null || c2.shouldIgnore()) {
                        this.mViewInfoStore.a(childViewHolderInt, cVar);
                    } else {
                        P.a aVar = this.mViewInfoStore.f7470a.get(c2);
                        boolean z10 = (aVar == null || (aVar.f7473a & 1) == 0) ? false : true;
                        P.a aVar2 = this.mViewInfoStore.f7470a.get(childViewHolderInt);
                        boolean z11 = (aVar2 == null || (aVar2.f7473a & 1) == 0) ? false : true;
                        if (z10 && c2 == childViewHolderInt) {
                            this.mViewInfoStore.a(childViewHolderInt, cVar);
                        } else {
                            k.c b9 = this.mViewInfoStore.b(c2, 4);
                            this.mViewInfoStore.a(childViewHolderInt, cVar);
                            k.c b10 = this.mViewInfoStore.b(childViewHolderInt, 8);
                            if (b9 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, c2);
                            } else {
                                animateChange(c2, childViewHolderInt, b9, b10, z10, z11);
                            }
                        }
                    }
                }
            }
            P p10 = this.mViewInfoStore;
            P.b bVar = this.mViewInfoProcessCallback;
            androidx.collection.g<C, P.a> gVar = p10.f7470a;
            for (int size = gVar.size() - 1; size >= 0; size--) {
                C keyAt = gVar.keyAt(size);
                P.a removeAt = gVar.removeAt(size);
                int i9 = removeAt.f7473a;
                if ((i9 & 3) == 3) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.mLayout.removeAndRecycleView(keyAt.itemView, recyclerView.mRecycler);
                } else if ((i9 & 1) != 0) {
                    k.c cVar2 = removeAt.f7474b;
                    if (cVar2 == null) {
                        RecyclerView recyclerView2 = RecyclerView.this;
                        recyclerView2.mLayout.removeAndRecycleView(keyAt.itemView, recyclerView2.mRecycler);
                    } else {
                        k.c cVar3 = removeAt.f7475c;
                        RecyclerView recyclerView3 = RecyclerView.this;
                        recyclerView3.mRecycler.o(keyAt);
                        recyclerView3.animateDisappearance(keyAt, cVar2, cVar3);
                    }
                } else if ((i9 & 14) == 14) {
                    RecyclerView.this.animateAppearance(keyAt, removeAt.f7474b, removeAt.f7475c);
                } else if ((i9 & 12) == 12) {
                    k.c cVar4 = removeAt.f7474b;
                    k.c cVar5 = removeAt.f7475c;
                    d dVar = (d) bVar;
                    dVar.getClass();
                    keyAt.setIsRecyclable(false);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    if (!recyclerView4.mDataSetHasChangedAfterLayout) {
                        L l10 = (L) recyclerView4.mItemAnimator;
                        l10.getClass();
                        int i10 = cVar4.f7497a;
                        int i11 = cVar5.f7497a;
                        if (i10 == i11 && cVar4.f7498b == cVar5.f7498b) {
                            l10.c(keyAt);
                        } else if (l10.g(keyAt, i10, cVar4.f7498b, i11, cVar5.f7498b)) {
                            recyclerView4.postAnimationRunner();
                        }
                    } else if (recyclerView4.mItemAnimator.a(keyAt, keyAt, cVar4, cVar5)) {
                        recyclerView4.postAnimationRunner();
                    }
                } else if ((i9 & 4) != 0) {
                    k.c cVar6 = removeAt.f7474b;
                    RecyclerView recyclerView5 = RecyclerView.this;
                    recyclerView5.mRecycler.o(keyAt);
                    recyclerView5.animateDisappearance(keyAt, cVar6, null);
                } else if ((i9 & 8) != 0) {
                    RecyclerView.this.animateAppearance(keyAt, removeAt.f7474b, removeAt.f7475c);
                }
                removeAt.f7473a = 0;
                removeAt.f7474b = null;
                removeAt.f7475c = null;
                P.a.f7472d.release(removeAt);
            }
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        y yVar2 = this.mState;
        yVar2.f7539b = yVar2.f7542e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        yVar2.f7546j = false;
        yVar2.f7547k = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList<C> arrayList = this.mRecycler.f7515b;
        if (arrayList != null) {
            arrayList.clear();
        }
        n nVar = this.mLayout;
        if (nVar.mPrefetchMaxObservedInInitialPrefetch) {
            nVar.mPrefetchMaxCountObserved = 0;
            nVar.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.p();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        P p11 = this.mViewInfoStore;
        p11.f7470a.clear();
        p11.f7471b.clear();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        r rVar = this.mInterceptingOnItemTouchListener;
        if (rVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        rVar.a(motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i9 = 0; i9 < size; i9++) {
            r rVar = this.mOnItemTouchListeners.get(i9);
            if (rVar.b(motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = rVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int e10 = this.mChildHelper.e();
        if (e10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i9 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < e10; i11++) {
            C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i11));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i9) {
                    i9 = layoutPosition;
                }
                if (layoutPosition > i10) {
                    i10 = layoutPosition;
                }
            }
        }
        iArr[0] = i9;
        iArr[1] = i10;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i9));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        C findViewHolderForAdapterPosition;
        y yVar = this.mState;
        int i9 = yVar.f7548l;
        if (i9 == -1) {
            i9 = 0;
        }
        int b9 = yVar.b();
        for (int i10 = i9; i10 < b9; i10++) {
            C findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i10);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        int min = Math.min(b9, i9);
        do {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
        } while (!findViewHolderForAdapterPosition.itemView.hasFocusable());
        return findViewHolderForAdapterPosition.itemView;
    }

    public static C getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((o) view.getLayoutParams()).f7506a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        o oVar = (o) view.getLayoutParams();
        Rect rect2 = oVar.f7507b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) oVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) oVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) oVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) oVar).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private C1608l getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C1608l(this);
        }
        return this.mScrollingChildHelper;
    }

    private float getSplineFlingDistance(int i9) {
        double log = Math.log((Math.abs(i9) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float f10 = DECELERATION_RATE;
        return (float) (Math.exp((f10 / (f10 - 1.0d)) * log) * this.mPhysicalCoef * SCROLL_FRICTION);
    }

    private void handleMissingPreInfoForChangeError(long j10, C c2, C c10) {
        int e10 = this.mChildHelper.e();
        for (int i9 = 0; i9 < e10; i9++) {
            C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i9));
            if (childViewHolderInt != c2 && getChangedHolderKey(childViewHolderInt) == j10) {
                Adapter adapter = this.mAdapter;
                if (adapter == null || !adapter.hasStableIds()) {
                    StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb2.append(childViewHolderInt);
                    sb2.append(" \n View Holder 2:");
                    sb2.append(c2);
                    throw new IllegalStateException(androidx.camera.core.impl.utils.a.h(this, sb2));
                }
                StringBuilder sb3 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb3.append(childViewHolderInt);
                sb3.append(" \n View Holder 2:");
                sb3.append(c2);
                throw new IllegalStateException(androidx.camera.core.impl.utils.a.h(this, sb3));
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + c10 + " cannot be found but it is necessary for " + c2 + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int e10 = this.mChildHelper.e();
        for (int i9 = 0; i9 < e10; i9++) {
            C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i9));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
        if (C1596C.g.a(this) == 0) {
            C1596C.g.b(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C0569g(new e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i9) {
        int i10;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c2 = 65535;
        int i11 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i12 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i13 = rect2.left;
        if ((i12 < i13 || rect.right <= i13) && rect.right < rect2.right) {
            i10 = 1;
        } else {
            int i14 = rect.right;
            int i15 = rect2.right;
            i10 = ((i14 > i15 || i12 >= i15) && i12 > i13) ? -1 : 0;
        }
        int i16 = rect.top;
        int i17 = rect2.top;
        if ((i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom) {
            c2 = 1;
        } else {
            int i18 = rect.bottom;
            int i19 = rect2.bottom;
            if ((i18 <= i19 && i16 < i19) || i16 <= i17) {
                c2 = 0;
            }
        }
        if (i9 == 1) {
            return c2 < 0 || (c2 == 0 && i10 * i11 < 0);
        }
        if (i9 == 2) {
            return c2 > 0 || (c2 == 0 && i10 * i11 > 0);
        }
        if (i9 == 17) {
            return i10 < 0;
        }
        if (i9 == 33) {
            return c2 < 0;
        }
        if (i9 == 66) {
            return i10 > 0;
        }
        if (i9 == 130) {
            return c2 > 0;
        }
        StringBuilder sb2 = new StringBuilder("Invalid direction: ");
        sb2.append(i9);
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.h(this, sb2));
    }

    private void nestedScrollByInternal(int i9, int i10, MotionEvent motionEvent, int i11) {
        n nVar = this.mLayout;
        if (nVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean canScrollHorizontally = nVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        int i12 = canScrollVertically ? (canScrollHorizontally ? 1 : 0) | 2 : canScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int releaseHorizontalGlow = i9 - releaseHorizontalGlow(i9, height);
        int releaseVerticalGlow = i10 - releaseVerticalGlow(i10, width);
        startNestedScroll(i12, i11);
        if (dispatchNestedPreScroll(canScrollHorizontally ? releaseHorizontalGlow : 0, canScrollVertically ? releaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, i11)) {
            int[] iArr2 = this.mReusableIntPair;
            releaseHorizontalGlow -= iArr2[0];
            releaseVerticalGlow -= iArr2[1];
        }
        scrollByInternal(canScrollHorizontally ? releaseHorizontalGlow : 0, canScrollVertically ? releaseVerticalGlow : 0, motionEvent, i11);
        androidx.recyclerview.widget.t tVar = this.mGapWorker;
        if (tVar != null && (releaseHorizontalGlow != 0 || releaseVerticalGlow != 0)) {
            tVar.a(this, releaseHorizontalGlow, releaseVerticalGlow);
        }
        stopNestedScroll(i11);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i9 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i9);
            int x9 = (int) (motionEvent.getX(i9) + 0.5f);
            this.mLastTouchX = x9;
            this.mInitialTouchX = x9;
            int y10 = (int) (motionEvent.getY(i9) + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z10;
        boolean z11 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            C0563a c0563a = this.mAdapterHelper;
            c0563a.l(c0563a.f7603b);
            c0563a.l(c0563a.f7604c);
            c0563a.f7607f = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.j();
        } else {
            this.mAdapterHelper.c();
        }
        boolean z12 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f7546j = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z10 = this.mDataSetHasChangedAfterLayout) || z12 || this.mLayout.mRequestedSimpleAnimations) && (!z10 || this.mAdapter.hasStableIds());
        y yVar = this.mState;
        if (yVar.f7546j && z12 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z11 = true;
        }
        yVar.f7547k = z11;
    }

    private void pullGlows(float f10, float f11, float f12, float f13) {
        boolean z10 = true;
        if (f11 < DECELERATION_RATE) {
            ensureLeftGlow();
            B0.b.b(this.mLeftGlow, (-f11) / getWidth(), 1.0f - (f12 / getHeight()));
        } else if (f11 > DECELERATION_RATE) {
            ensureRightGlow();
            B0.b.b(this.mRightGlow, f11 / getWidth(), f12 / getHeight());
        } else {
            z10 = false;
        }
        if (f13 < DECELERATION_RATE) {
            ensureTopGlow();
            B0.b.b(this.mTopGlow, (-f13) / getHeight(), f10 / getWidth());
        } else if (f13 > DECELERATION_RATE) {
            ensureBottomGlow();
            B0.b.b(this.mBottomGlow, f13 / getHeight(), 1.0f - (f10 / getWidth()));
        } else if (!z10 && f11 == DECELERATION_RATE && f13 == DECELERATION_RATE) {
            return;
        }
        WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
        postInvalidateOnAnimation();
    }

    private void recoverFocusFromState() {
        View findViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.k(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.e() == 0) {
                requestFocus();
                return;
            }
        }
        View view = null;
        C findViewHolderForItemId = (this.mState.f7549m == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f7549m);
        if (findViewHolderForItemId != null && !this.mChildHelper.k(findViewHolderForItemId.itemView) && findViewHolderForItemId.itemView.hasFocusable()) {
            view = findViewHolderForItemId.itemView;
        } else if (this.mChildHelper.e() > 0) {
            view = findNextViewToFocus();
        }
        if (view != null) {
            int i9 = this.mState.f7550n;
            if (i9 != -1 && (findViewById = view.findViewById(i9)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean z10;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.mLeftGlow.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.mBottomGlow.isFinished();
        }
        if (z10) {
            WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
            postInvalidateOnAnimation();
        }
    }

    private int releaseHorizontalGlow(int i9, float f10) {
        float height = f10 / getHeight();
        float width = i9 / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f11 = DECELERATION_RATE;
        if (edgeEffect == null || B0.b.a(edgeEffect) == DECELERATION_RATE) {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && B0.b.a(edgeEffect2) != DECELERATION_RATE) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float b9 = B0.b.b(this.mRightGlow, width, height);
                    if (B0.b.a(this.mRightGlow) == DECELERATION_RATE) {
                        this.mRightGlow.onRelease();
                    }
                    f11 = b9;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f12 = -B0.b.b(this.mLeftGlow, -width, 1.0f - height);
                if (B0.b.a(this.mLeftGlow) == DECELERATION_RATE) {
                    this.mLeftGlow.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    private int releaseVerticalGlow(int i9, float f10) {
        float width = f10 / getWidth();
        float height = i9 / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f11 = DECELERATION_RATE;
        if (edgeEffect == null || B0.b.a(edgeEffect) == DECELERATION_RATE) {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && B0.b.a(edgeEffect2) != DECELERATION_RATE) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float b9 = B0.b.b(this.mBottomGlow, height, 1.0f - width);
                    if (B0.b.a(this.mBottomGlow) == DECELERATION_RATE) {
                        this.mBottomGlow.onRelease();
                    }
                    f11 = b9;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f12 = -B0.b.b(this.mTopGlow, -height, width);
                if (B0.b.a(this.mTopGlow) == DECELERATION_RATE) {
                    this.mTopGlow.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof o) {
            o oVar = (o) layoutParams;
            if (!oVar.f7508c) {
                Rect rect = this.mTempRect;
                int i9 = rect.left;
                Rect rect2 = oVar.f7507b;
                rect.left = i9 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        y yVar = this.mState;
        yVar.f7549m = -1L;
        yVar.f7548l = -1;
        yVar.f7550n = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        C findContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (findContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f7549m = this.mAdapter.hasStableIds() ? findContainingViewHolder.getItemId() : -1L;
        this.mState.f7548l = this.mDataSetHasChangedAfterLayout ? -1 : findContainingViewHolder.isRemoved() ? findContainingViewHolder.mOldPosition : findContainingViewHolder.getAbsoluteAdapterPosition();
        this.mState.f7550n = getDeepestFocusedViewWithId(findContainingViewHolder.itemView);
    }

    private void setAdapterInternal(Adapter<?> adapter, boolean z10, boolean z11) {
        Adapter adapter2 = this.mAdapter;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z10 || z11) {
            removeAndRecycleViews();
        }
        C0563a c0563a = this.mAdapterHelper;
        c0563a.l(c0563a.f7603b);
        c0563a.l(c0563a.f7604c);
        c0563a.f7607f = 0;
        Adapter<?> adapter3 = this.mAdapter;
        this.mAdapter = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mObserver);
            adapter.onAttachedToRecyclerView(this);
        }
        n nVar = this.mLayout;
        if (nVar != null) {
            nVar.onAdapterChanged(adapter3, this.mAdapter);
        }
        u uVar = this.mRecycler;
        Adapter<?> adapter4 = this.mAdapter;
        uVar.f7514a.clear();
        uVar.h();
        t tVar = uVar.f7520g;
        if (tVar != null) {
            tVar.detachForPoolingContainer(adapter3, true);
        }
        uVar.d().onAdapterChanged(adapter3, adapter4, z10);
        uVar.g();
        this.mState.f7543f = true;
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        sDebugAssertionsEnabled = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        sVerboseLoggingEnabled = z10;
    }

    private boolean shouldAbsorb(EdgeEffect edgeEffect, int i9, int i10) {
        if (i9 > 0) {
            return true;
        }
        return getSplineFlingDistance(-i9) < B0.b.a(edgeEffect) * ((float) i10);
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || B0.b.a(edgeEffect) == DECELERATION_RATE || canScrollHorizontally(-1)) {
            z10 = false;
        } else {
            B0.b.b(this.mLeftGlow, DECELERATION_RATE, 1.0f - (motionEvent.getY() / getHeight()));
            z10 = true;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && B0.b.a(edgeEffect2) != DECELERATION_RATE && !canScrollHorizontally(1)) {
            B0.b.b(this.mRightGlow, DECELERATION_RATE, motionEvent.getY() / getHeight());
            z10 = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && B0.b.a(edgeEffect3) != DECELERATION_RATE && !canScrollVertically(-1)) {
            B0.b.b(this.mTopGlow, DECELERATION_RATE, motionEvent.getX() / getWidth());
            z10 = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || B0.b.a(edgeEffect4) == DECELERATION_RATE || canScrollVertically(1)) {
            return z10;
        }
        B0.b.b(this.mBottomGlow, DECELERATION_RATE, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void stopScrollersInternal() {
        B b9 = this.mViewFlinger;
        RecyclerView.this.removeCallbacks(b9);
        b9.f7480c.abortAnimation();
        n nVar = this.mLayout;
        if (nVar != null) {
            nVar.stopSmoothScroller();
        }
    }

    public void absorbGlows(int i9, int i10) {
        if (i9 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i9);
            }
        } else if (i9 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i9);
            }
        }
        if (i10 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i10);
            }
        }
        if (i9 == 0 && i10 == 0) {
            return;
        }
        WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i9, int i10) {
        n nVar = this.mLayout;
        if (nVar == null || !nVar.onAddFocusables(this, arrayList, i9, i10)) {
            super.addFocusables(arrayList, i9, i10);
        }
    }

    public void addItemDecoration(m mVar, int i9) {
        n nVar = this.mLayout;
        if (nVar != null) {
            nVar.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i9 < 0) {
            this.mItemDecorations.add(mVar);
        } else {
            this.mItemDecorations.add(i9, mVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(p pVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(pVar);
    }

    public void addOnItemTouchListener(r rVar) {
        this.mOnItemTouchListeners.add(rVar);
    }

    public void addOnScrollListener(s sVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(sVar);
    }

    public void addRecyclerListener(v vVar) {
        C1124b.m(vVar != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(vVar);
    }

    public void animateAppearance(C c2, k.c cVar, k.c cVar2) {
        int i9;
        int i10;
        c2.setIsRecyclable(false);
        L l10 = (L) this.mItemAnimator;
        l10.getClass();
        if (cVar == null || ((i9 = cVar.f7497a) == (i10 = cVar2.f7497a) && cVar.f7498b == cVar2.f7498b)) {
            C0578p c0578p = (C0578p) l10;
            c0578p.l(c2);
            c2.itemView.setAlpha(DECELERATION_RATE);
            c0578p.i.add(c2);
        } else if (!l10.g(c2, i9, cVar.f7498b, i10, cVar2.f7498b)) {
            return;
        }
        postAnimationRunner();
    }

    public void animateDisappearance(C c2, k.c cVar, k.c cVar2) {
        addAnimatingView(c2);
        c2.setIsRecyclable(false);
        L l10 = (L) this.mItemAnimator;
        l10.getClass();
        int i9 = cVar.f7497a;
        int i10 = cVar.f7498b;
        View view = c2.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f7497a;
        int top = cVar2 == null ? view.getTop() : cVar2.f7498b;
        if (c2.isRemoved() || (i9 == left && i10 == top)) {
            C0578p c0578p = (C0578p) l10;
            c0578p.l(c2);
            c0578p.f7676h.add(c2);
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            if (!l10.g(c2, i9, i10, left, top)) {
                return;
            }
        }
        postAnimationRunner();
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str != null) {
            throw new IllegalStateException(androidx.camera.core.impl.utils.a.h(this, C.v.s(str)));
        }
        throw new IllegalStateException(androidx.camera.core.impl.utils.a.h(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(androidx.camera.core.impl.utils.a.h(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(androidx.camera.core.impl.utils.a.h(this, new StringBuilder(""))));
        }
    }

    public boolean canReuseUpdatedViewHolder(C c2) {
        k kVar = this.mItemAnimator;
        if (kVar != null) {
            List<Object> unmodifiedPayloads = c2.getUnmodifiedPayloads();
            C0578p c0578p = (C0578p) kVar;
            c0578p.getClass();
            if (unmodifiedPayloads.isEmpty() && c0578p.f7433g && !c2.isInvalid()) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof o) && this.mLayout.checkLayoutParams((o) layoutParams);
    }

    public void clearOldPositions() {
        int h9 = this.mChildHelper.h();
        for (int i9 = 0; i9 < h9; i9++) {
            C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i9));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        u uVar = this.mRecycler;
        ArrayList<C> arrayList = uVar.f7516c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).clearOldPosition();
        }
        ArrayList<C> arrayList2 = uVar.f7514a;
        int size2 = arrayList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList2.get(i11).clearOldPosition();
        }
        ArrayList<C> arrayList3 = uVar.f7515b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                uVar.f7515b.get(i12).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<p> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<s> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        n nVar = this.mLayout;
        if (nVar != null && nVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        n nVar = this.mLayout;
        if (nVar != null && nVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        n nVar = this.mLayout;
        if (nVar != null && nVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        n nVar = this.mLayout;
        if (nVar != null && nVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        n nVar = this.mLayout;
        if (nVar != null && nVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        n nVar = this.mLayout;
        if (nVar != null && nVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i9, int i10) {
        boolean z10;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i9 <= 0) {
            z10 = false;
        } else {
            this.mLeftGlow.onRelease();
            z10 = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i9 < 0) {
            this.mRightGlow.onRelease();
            z10 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i10 > 0) {
            this.mTopGlow.onRelease();
            z10 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i10 < 0) {
            this.mBottomGlow.onRelease();
            z10 |= this.mBottomGlow.isFinished();
        }
        if (z10) {
            WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
            postInvalidateOnAnimation();
        }
    }

    public int consumeFlingInHorizontalStretch(int i9) {
        return consumeFlingInStretch(i9, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i9) {
        return consumeFlingInStretch(i9, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            int i9 = t0.j.f27405a;
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            Trace.endSection();
            return;
        }
        if (this.mAdapterHelper.g()) {
            C0563a c0563a = this.mAdapterHelper;
            int i10 = c0563a.f7607f;
            if ((i10 & 4) == 0 || (i10 & 11) != 0) {
                if (c0563a.g()) {
                    int i11 = t0.j.f27405a;
                    Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i12 = t0.j.f27405a;
            Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.j();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.b();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            Trace.endSection();
        }
    }

    public void defaultOnMeasure(int i9, int i10) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
        setMeasuredDimension(n.chooseSize(i9, paddingRight, getMinimumWidth()), n.chooseSize(i10, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void dispatchChildAttached(View view) {
        C childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewAttachedToWindow(childViewHolderInt);
        }
        List<p> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewAttachedToWindow(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        C childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<p> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewDetachedFromWindow(view);
            }
        }
    }

    public void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        this.mState.i = false;
        boolean z10 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f7541d == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else {
            C0563a c0563a = this.mAdapterHelper;
            if ((c0563a.f7604c.isEmpty() || c0563a.f7603b.isEmpty()) && !z10 && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep2();
            }
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i9, int i10, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i9, i10, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i9, int i10, int i11, int i12, int[] iArr) {
        return getScrollingChildHelper().e(i9, i10, i11, i12, iArr, 0, null);
    }

    public void dispatchOnScrollStateChanged(int i9) {
        n nVar = this.mLayout;
        if (nVar != null) {
            nVar.onScrollStateChanged(i9);
        }
        onScrollStateChanged(i9);
        s sVar = this.mScrollListener;
        if (sVar != null) {
            sVar.onScrollStateChanged(this, i9);
        }
        List<s> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i9);
            }
        }
    }

    public void dispatchOnScrolled(int i9, int i10) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i9, scrollY - i10);
        onScrolled(i9, i10);
        s sVar = this.mScrollListener;
        if (sVar != null) {
            sVar.onScrolled(this, i9, i10);
        }
        List<s> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i9, i10);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i9;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            C c2 = this.mPendingAccessibilityImportanceChange.get(size);
            if (c2.itemView.getParent() == this && !c2.shouldIgnore() && (i9 = c2.mPendingAccessibilityState) != -1) {
                View view = c2.itemView;
                WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
                view.setImportantForAccessibility(i9);
                c2.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.mItemDecorations.get(i9).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, DECELERATION_RATE);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            z10 |= edgeEffect8 != null && edgeEffect8.draw(canvas);
            canvas.restoreToCount(save4);
        }
        if ((z10 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.f()) && !z10) {
            return;
        }
        WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        ((z) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mBottomGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        ((z) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mLeftGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        ((z) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mRightGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        ((z) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mTopGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void fillRemainingScrollValues(y yVar) {
        if (getScrollState() != 2) {
            yVar.getClass();
            return;
        }
        OverScroller overScroller = this.mViewFlinger.f7480c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        yVar.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View findChildViewUnder(float f10, float f11) {
        for (int e10 = this.mChildHelper.e() - 1; e10 >= 0; e10--) {
            View d10 = this.mChildHelper.d(e10);
            float translationX = d10.getTranslationX();
            float translationY = d10.getTranslationY();
            if (f10 >= d10.getLeft() + translationX && f10 <= d10.getRight() + translationX && f11 >= d10.getTop() + translationY && f11 <= d10.getBottom() + translationY) {
                return d10;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View findContainingItemView(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findContainingItemView(android.view.View):android.view.View");
    }

    public C findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public C findViewHolderForAdapterPosition(int i9) {
        C c2 = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int h9 = this.mChildHelper.h();
        for (int i10 = 0; i10 < h9; i10++) {
            C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i9) {
                if (!this.mChildHelper.k(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                c2 = childViewHolderInt;
            }
        }
        return c2;
    }

    public C findViewHolderForItemId(long j10) {
        Adapter adapter = this.mAdapter;
        C c2 = null;
        if (adapter != null && adapter.hasStableIds()) {
            int h9 = this.mChildHelper.h();
            for (int i9 = 0; i9 < h9; i9++) {
                C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i9));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j10) {
                    if (!this.mChildHelper.k(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    c2 = childViewHolderInt;
                }
            }
        }
        return c2;
    }

    public C findViewHolderForLayoutPosition(int i9) {
        return findViewHolderForPosition(i9, false);
    }

    @Deprecated
    public C findViewHolderForPosition(int i9) {
        return findViewHolderForPosition(i9, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean fling(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.fling(int, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i9) {
        View view2;
        boolean z10;
        View onInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i9);
        if (onInterceptFocusSearch != null) {
            return onInterceptFocusSearch;
        }
        boolean z11 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z11 && (i9 == 2 || i9 == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i10 = i9 == 2 ? 130 : 33;
                z10 = focusFinder.findNextFocus(this, view, i10) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i9 = i10;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.mLayout.canScrollHorizontally()) {
                int i11 = (this.mLayout.getLayoutDirection() == 1) ^ (i9 == 2) ? 66 : 17;
                boolean z12 = focusFinder.findNextFocus(this, view, i11) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i9 = i11;
                }
                z10 = z12;
            }
            if (z10) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i9, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i9);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i9);
            if (findNextFocus == null && z11) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.onFocusSearchFailed(view, i9, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return isPreferredNextFocus(view, view2, i9) ? view2 : super.focusSearch(view, i9);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i9);
        }
        requestChildOnScreen(view2, null);
        return view;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        n nVar = this.mLayout;
        if (nVar != null) {
            return nVar.generateDefaultLayoutParams();
        }
        throw new IllegalStateException(androidx.camera.core.impl.utils.a.h(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        n nVar = this.mLayout;
        if (nVar != null) {
            return nVar.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(androidx.camera.core.impl.utils.a.h(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public Adapter getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(C c2) {
        if (c2.hasAnyOfTheFlags(524) || !c2.isBound()) {
            return -1;
        }
        C0563a c0563a = this.mAdapterHelper;
        int i9 = c2.mPosition;
        ArrayList<C0563a.b> arrayList = c0563a.f7603b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0563a.b bVar = arrayList.get(i10);
            int i11 = bVar.f7608a;
            if (i11 != 1) {
                if (i11 == 2) {
                    int i12 = bVar.f7609b;
                    if (i12 <= i9) {
                        int i13 = bVar.f7611d;
                        if (i12 + i13 > i9) {
                            return -1;
                        }
                        i9 -= i13;
                    } else {
                        continue;
                    }
                } else if (i11 == 8) {
                    int i14 = bVar.f7609b;
                    if (i14 == i9) {
                        i9 = bVar.f7611d;
                    } else {
                        if (i14 < i9) {
                            i9--;
                        }
                        if (bVar.f7611d <= i9) {
                            i9++;
                        }
                    }
                }
            } else if (bVar.f7609b <= i9) {
                i9 += bVar.f7611d;
            }
        }
        return i9;
    }

    @Override // android.view.View
    public int getBaseline() {
        n nVar = this.mLayout;
        return nVar != null ? nVar.getBaseline() : super.getBaseline();
    }

    public long getChangedHolderKey(C c2) {
        return this.mAdapter.hasStableIds() ? c2.getItemId() : c2.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        C childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i9, int i10) {
        return super.getChildDrawingOrder(i9, i10);
    }

    public long getChildItemId(View view) {
        C childViewHolderInt;
        Adapter adapter = this.mAdapter;
        if (adapter == null || !adapter.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        C childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public C getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public J getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public j getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public k getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        o oVar = (o) view.getLayoutParams();
        boolean z10 = oVar.f7508c;
        Rect rect = oVar.f7507b;
        if (!z10) {
            return rect;
        }
        if (this.mState.f7544g && (oVar.f7506a.isUpdated() || oVar.f7506a.isInvalid())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i9).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i10 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i10 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        oVar.f7508c = false;
        return rect;
    }

    public m getItemDecorationAt(int i9) {
        int itemDecorationCount = getItemDecorationCount();
        if (i9 >= 0 && i9 < itemDecorationCount) {
            return this.mItemDecorations.get(i9);
        }
        throw new IndexOutOfBoundsException(i9 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public n getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public q getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public t getRecycledViewPool() {
        return this.mRecycler.d();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().g(0);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.g();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new C0563a(new f());
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.h(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new androidx.recyclerview.widget.s(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.luminary.mobile.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.luminary.mobile.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.luminary.mobile.R.dimen.fastscroll_margin));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        n nVar = this.mLayout;
        if (nVar != null) {
            nVar.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        k kVar = this.mItemAnimator;
        return kVar != null && kVar.f();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f31083d;
    }

    public void jumpToPositionForSmoothScroller(int i9) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i9);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int h9 = this.mChildHelper.h();
        for (int i9 = 0; i9 < h9; i9++) {
            ((o) this.mChildHelper.g(i9).getLayoutParams()).f7508c = true;
        }
        ArrayList<C> arrayList = this.mRecycler.f7516c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = (o) arrayList.get(i10).itemView.getLayoutParams();
            if (oVar != null) {
                oVar.f7508c = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int h9 = this.mChildHelper.h();
        for (int i9 = 0; i9 < h9; i9++) {
            C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i9));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        u uVar = this.mRecycler;
        ArrayList<C> arrayList = uVar.f7516c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C c2 = arrayList.get(i10);
            if (c2 != null) {
                c2.addFlags(6);
                c2.addChangePayload(null);
            }
        }
        Adapter adapter = RecyclerView.this.mAdapter;
        if (adapter == null || !adapter.hasStableIds()) {
            uVar.h();
        }
    }

    public void nestedScrollBy(int i9, int i10) {
        nestedScrollByInternal(i9, i10, null, 1);
    }

    public void offsetChildrenHorizontal(int i9) {
        int e10 = this.mChildHelper.e();
        for (int i10 = 0; i10 < e10; i10++) {
            this.mChildHelper.d(i10).offsetLeftAndRight(i9);
        }
    }

    public void offsetChildrenVertical(int i9) {
        int e10 = this.mChildHelper.e();
        for (int i10 = 0; i10 < e10; i10++) {
            this.mChildHelper.d(i10).offsetTopAndBottom(i9);
        }
    }

    public void offsetPositionRecordsForInsert(int i9, int i10) {
        int h9 = this.mChildHelper.h();
        for (int i11 = 0; i11 < h9; i11++) {
            C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i11));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i9) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert attached child " + i11 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition + i10));
                }
                childViewHolderInt.offsetPosition(i10, false);
                this.mState.f7543f = true;
            }
        }
        ArrayList<C> arrayList = this.mRecycler.f7516c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            C c2 = arrayList.get(i12);
            if (c2 != null && c2.mPosition >= i9) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert cached " + i12 + " holder " + c2 + " now at position " + (c2.mPosition + i10));
                }
                c2.offsetPosition(i10, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int h9 = this.mChildHelper.h();
        int i18 = -1;
        if (i9 < i10) {
            i12 = i9;
            i11 = i10;
            i13 = -1;
        } else {
            i11 = i9;
            i12 = i10;
            i13 = 1;
        }
        for (int i19 = 0; i19 < h9; i19++) {
            C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i19));
            if (childViewHolderInt != null && (i17 = childViewHolderInt.mPosition) >= i12 && i17 <= i11) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove attached child " + i19 + " holder " + childViewHolderInt);
                }
                if (childViewHolderInt.mPosition == i9) {
                    childViewHolderInt.offsetPosition(i10 - i9, false);
                } else {
                    childViewHolderInt.offsetPosition(i13, false);
                }
                this.mState.f7543f = true;
            }
        }
        u uVar = this.mRecycler;
        uVar.getClass();
        if (i9 < i10) {
            i15 = i9;
            i14 = i10;
        } else {
            i14 = i9;
            i18 = 1;
            i15 = i10;
        }
        ArrayList<C> arrayList = uVar.f7516c;
        int size = arrayList.size();
        for (int i20 = 0; i20 < size; i20++) {
            C c2 = arrayList.get(i20);
            if (c2 != null && (i16 = c2.mPosition) >= i15 && i16 <= i14) {
                if (i16 == i9) {
                    c2.offsetPosition(i10 - i9, false);
                } else {
                    c2.offsetPosition(i18, false);
                }
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove cached child " + i20 + " holder " + c2);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i9, int i10, boolean z10) {
        int i11 = i9 + i10;
        int h9 = this.mChildHelper.h();
        for (int i12 = 0; i12 < h9; i12++) {
            C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i12));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i13 = childViewHolderInt.mPosition;
                if (i13 >= i11) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i12 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition - i10));
                    }
                    childViewHolderInt.offsetPosition(-i10, z10);
                    this.mState.f7543f = true;
                } else if (i13 >= i9) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i12 + " holder " + childViewHolderInt + " now REMOVED");
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i9 - 1, -i10, z10);
                    this.mState.f7543f = true;
                }
            }
        }
        u uVar = this.mRecycler;
        ArrayList<C> arrayList = uVar.f7516c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C c2 = arrayList.get(size);
            if (c2 != null) {
                int i14 = c2.mPosition;
                if (i14 >= i11) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove cached " + size + " holder " + c2 + " now at position " + (c2.mPosition - i10));
                    }
                    c2.offsetPosition(-i10, z10);
                } else if (i14 >= i9) {
                    c2.addFlags(8);
                    uVar.i(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.mLayoutOrScrollCounter = r0
            r1 = 1
            r5.mIsAttached = r1
            boolean r2 = r5.mFirstLayoutComplete
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.mFirstLayoutComplete = r1
            androidx.recyclerview.widget.RecyclerView$u r1 = r5.mRecycler
            r1.g()
            androidx.recyclerview.widget.RecyclerView$n r1 = r5.mLayout
            if (r1 == 0) goto L23
            r1.dispatchAttachedToWindow(r5)
        L23:
            r5.mPostedAnimatorRunner = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L80
            java.lang.ThreadLocal<androidx.recyclerview.widget.t> r0 = androidx.recyclerview.widget.t.f7757e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.t r1 = (androidx.recyclerview.widget.t) r1
            r5.mGapWorker = r1
            if (r1 != 0) goto L63
            androidx.recyclerview.widget.t r1 = new androidx.recyclerview.widget.t
            r1.<init>()
            r5.mGapWorker = r1
            java.util.WeakHashMap<android.view.View, y0.E> r1 = y0.C1596C.f30963a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L55
            if (r1 == 0) goto L55
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L55
            goto L57
        L55:
            r1 = 1114636288(0x42700000, float:60.0)
        L57:
            androidx.recyclerview.widget.t r2 = r5.mGapWorker
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f7761c = r3
            r0.set(r2)
        L63:
            androidx.recyclerview.widget.t r0 = r5.mGapWorker
            r0.getClass()
            boolean r1 = androidx.recyclerview.widget.RecyclerView.sDebugAssertionsEnabled
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r0.f7759a
            if (r1 == 0) goto L7d
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L75
            goto L7d
        L75:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RecyclerView already present in worker list!"
            r0.<init>(r1)
            throw r0
        L7d:
            r0.add(r5)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.t tVar;
        super.onDetachedFromWindow();
        k kVar = this.mItemAnimator;
        if (kVar != null) {
            kVar.e();
        }
        stopScroll();
        int i9 = 0;
        this.mIsAttached = false;
        n nVar = this.mLayout;
        if (nVar != null) {
            nVar.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (P.a.f7472d.acquire() != null) {
        }
        u uVar = this.mRecycler;
        int i10 = 0;
        while (true) {
            ArrayList<C> arrayList = uVar.f7516c;
            if (i10 >= arrayList.size()) {
                break;
            }
            D9.b.j(arrayList.get(i10).itemView);
            i10++;
        }
        Adapter<?> adapter = RecyclerView.this.mAdapter;
        t tVar2 = uVar.f7520g;
        if (tVar2 != null) {
            tVar2.detachForPoolingContainer(adapter, false);
        }
        while (i9 < getChildCount()) {
            int i11 = i9 + 1;
            View childAt = getChildAt(i9);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            D0.b bVar = (D0.b) childAt.getTag(com.luminary.mobile.R.id.pooling_container_listener_holder_tag);
            if (bVar == null) {
                bVar = new D0.b();
                childAt.setTag(com.luminary.mobile.R.id.pooling_container_listener_holder_tag, bVar);
            }
            ArrayList<D0.a> arrayList2 = bVar.f857a;
            for (int p10 = P9.m.p(arrayList2); -1 < p10; p10--) {
                arrayList2.get(p10).a();
            }
            i9 = i11;
        }
        if (!ALLOW_THREAD_GAP_WORK || (tVar = this.mGapWorker) == null) {
            return;
        }
        boolean remove = tVar.f7759a.remove(this);
        if (sDebugAssertionsEnabled && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.mItemDecorations.get(i9).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$n r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$n r0 = r5.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$n r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$n r3 = r5.mLayout
            boolean r3 = r3.canScrollVertically()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$n r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6c:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.nestedScrollByInternal(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:
    
        if (r0 != false) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13 = t0.j.f27405a;
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        n nVar = this.mLayout;
        if (nVar == null) {
            defaultOnMeasure(i9, i10);
            return;
        }
        boolean z10 = false;
        if (nVar.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i9);
            int mode2 = View.MeasureSpec.getMode(i10);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i9, i10);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z10;
            if (z10 || this.mAdapter == null) {
                return;
            }
            if (this.mState.f7541d == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i9, i10);
            this.mState.i = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i9, i10);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.i = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i9, i10);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i9, i10);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            y yVar = this.mState;
            if (yVar.f7547k) {
                yVar.f7544g = true;
            } else {
                this.mAdapterHelper.c();
                this.mState.f7544g = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f7547k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        Adapter adapter = this.mAdapter;
        if (adapter != null) {
            this.mState.f7542e = adapter.getItemCount();
        } else {
            this.mState.f7542e = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i9, i10);
        stopInterceptRequestLayout(false);
        this.mState.f7544g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i9, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i9, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.f6536a);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.f7485c = savedState2.f7485c;
        } else {
            n nVar = this.mLayout;
            if (nVar != null) {
                savedState.f7485c = nVar.onSaveInstanceState();
            } else {
                savedState.f7485c = null;
            }
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (i9 == i11 && i10 == i12) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
        postOnAnimation(runnable);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z10) {
        this.mDispatchItemsChangedEvent = z10 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(C c2, k.c cVar) {
        c2.setFlags(0, 8192);
        if (this.mState.f7545h && c2.isUpdated() && !c2.isRemoved() && !c2.shouldIgnore()) {
            this.mViewInfoStore.f7471b.put(getChangedHolderKey(c2), c2);
        }
        androidx.collection.g<C, P.a> gVar = this.mViewInfoStore.f7470a;
        P.a aVar = gVar.get(c2);
        if (aVar == null) {
            aVar = P.a.a();
            gVar.put(c2, aVar);
        }
        aVar.f7474b = cVar;
        aVar.f7473a |= 4;
    }

    public void removeAndRecycleViews() {
        k kVar = this.mItemAnimator;
        if (kVar != null) {
            kVar.e();
        }
        n nVar = this.mLayout;
        if (nVar != null) {
            nVar.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        u uVar = this.mRecycler;
        uVar.f7514a.clear();
        uVar.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean removeAnimatingView(android.view.View r8) {
        /*
            r7 = this;
            r7.startInterceptRequestLayout()
            androidx.recyclerview.widget.g r0 = r7.mChildHelper
            androidx.recyclerview.widget.g$a r1 = r0.f7641b
            androidx.recyclerview.widget.g$b r2 = r0.f7640a
            int r3 = r0.f7643d
            r4 = 1
            r5 = 0
            if (r3 != r4) goto L1d
            android.view.View r0 = r0.f7644e
            if (r0 != r8) goto L15
        L13:
            r4 = r5
            goto L4b
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r8.<init>(r0)
            throw r8
        L1d:
            r6 = 2
            if (r3 == r6) goto L83
            r0.f7643d = r6     // Catch: java.lang.Throwable -> L34
            r3 = r2
            androidx.recyclerview.widget.RecyclerView$e r3 = (androidx.recyclerview.widget.RecyclerView.e) r3     // Catch: java.lang.Throwable -> L34
            androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this     // Catch: java.lang.Throwable -> L34
            int r3 = r3.indexOfChild(r8)     // Catch: java.lang.Throwable -> L34
            r6 = -1
            if (r3 != r6) goto L36
            r0.m(r8)     // Catch: java.lang.Throwable -> L34
        L31:
            r0.f7643d = r5
            goto L4b
        L34:
            r8 = move-exception
            goto L80
        L36:
            boolean r6 = r1.d(r3)     // Catch: java.lang.Throwable -> L34
            if (r6 == 0) goto L48
            r1.f(r3)     // Catch: java.lang.Throwable -> L34
            r0.m(r8)     // Catch: java.lang.Throwable -> L34
            androidx.recyclerview.widget.RecyclerView$e r2 = (androidx.recyclerview.widget.RecyclerView.e) r2     // Catch: java.lang.Throwable -> L34
            r2.a(r3)     // Catch: java.lang.Throwable -> L34
            goto L31
        L48:
            r0.f7643d = r5
            goto L13
        L4b:
            if (r4 == 0) goto L7a
            androidx.recyclerview.widget.RecyclerView$C r0 = getChildViewHolderInt(r8)
            androidx.recyclerview.widget.RecyclerView$u r1 = r7.mRecycler
            r1.o(r0)
            androidx.recyclerview.widget.RecyclerView$u r1 = r7.mRecycler
            r1.k(r0)
            boolean r0 = androidx.recyclerview.widget.RecyclerView.sVerboseLoggingEnabled
            if (r0 == 0) goto L7a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "after removing animated view: "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = ", "
            r0.append(r8)
            r0.append(r7)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "RecyclerView"
            android.util.Log.d(r0, r8)
        L7a:
            r8 = r4 ^ 1
            r7.stopInterceptRequestLayout(r8)
            return r4
        L80:
            r0.f7643d = r5
            throw r8
        L83:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.removeAnimatingView(android.view.View):boolean");
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z10) {
        C childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.h(this, sb2));
            }
        } else if (sDebugAssertionsEnabled) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.h(this, sb3));
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z10);
    }

    public void removeItemDecoration(m mVar) {
        n nVar = this.mLayout;
        if (nVar != null) {
            nVar.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(mVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i9) {
        int itemDecorationCount = getItemDecorationCount();
        if (i9 >= 0 && i9 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i9));
            return;
        }
        throw new IndexOutOfBoundsException(i9 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(p pVar) {
        List<p> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(pVar);
    }

    public void removeOnItemTouchListener(r rVar) {
        this.mOnItemTouchListeners.remove(rVar);
        if (this.mInterceptingOnItemTouchListener == rVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(s sVar) {
        List<s> list = this.mScrollListeners;
        if (list != null) {
            list.remove(sVar);
        }
    }

    public void removeRecyclerListener(v vVar) {
        this.mRecyclerListeners.remove(vVar);
    }

    public void repositionShadowingViews() {
        C c2;
        int e10 = this.mChildHelper.e();
        for (int i9 = 0; i9 < e10; i9++) {
            View d10 = this.mChildHelper.d(i9);
            C childViewHolder = getChildViewHolder(d10);
            if (childViewHolder != null && (c2 = childViewHolder.mShadowingHolder) != null) {
                View view = c2.itemView;
                int left = d10.getLeft();
                int top = d10.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.mOnItemTouchListeners.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.mOnItemTouchListeners.get(i9).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int h9 = this.mChildHelper.h();
        for (int i9 = 0; i9 < h9; i9++) {
            C childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i9));
            if (sDebugAssertionsEnabled && childViewHolderInt.mPosition == -1 && !childViewHolderInt.isRemoved()) {
                throw new IllegalStateException(androidx.camera.core.impl.utils.a.h(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
            }
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i9, int i10) {
        n nVar = this.mLayout;
        if (nVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean canScrollHorizontally = nVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (canScrollHorizontally || canScrollVertically) {
            if (!canScrollHorizontally) {
                i9 = 0;
            }
            if (!canScrollVertically) {
                i10 = 0;
            }
            scrollByInternal(i9, i10, null, 0);
        }
    }

    public boolean scrollByInternal(int i9, int i10, MotionEvent motionEvent, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i9, i10, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i16 = iArr2[0];
            int i17 = iArr2[1];
            i12 = i17;
            i13 = i16;
            i14 = i9 - i16;
            i15 = i10 - i17;
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i13, i12, i14, i15, this.mScrollOffset, i11, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i18 = iArr4[0];
        int i19 = i14 - i18;
        int i20 = iArr4[1];
        int i21 = i15 - i20;
        boolean z10 = (i18 == 0 && i20 == 0) ? false : true;
        int i22 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i23 = iArr5[0];
        this.mLastTouchX = i22 - i23;
        int i24 = this.mLastTouchY;
        int i25 = iArr5[1];
        this.mLastTouchY = i24 - i25;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i23;
        iArr6[1] = iArr6[1] + i25;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                pullGlows(motionEvent.getX(), i19, motionEvent.getY(), i21);
            }
            considerReleasingGlowsOnScroll(i9, i10);
        }
        if (i13 != 0 || i12 != 0) {
            dispatchOnScrolled(i13, i12);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i13 == 0 && i12 == 0) ? false : true;
    }

    public void scrollStep(int i9, int i10, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i11 = t0.j.f27405a;
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int scrollHorizontallyBy = i9 != 0 ? this.mLayout.scrollHorizontallyBy(i9, this.mRecycler, this.mState) : 0;
        int scrollVerticallyBy = i10 != 0 ? this.mLayout.scrollVerticallyBy(i10, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = scrollHorizontallyBy;
            iArr[1] = scrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i9, int i10) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i9) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        n nVar = this.mLayout;
        if (nVar == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            nVar.scrollToPosition(i9);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(J j10) {
        this.mAccessibilityDelegate = j10;
        C1596C.o(this, j10);
    }

    public void setAdapter(Adapter adapter) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(i iVar) {
        if (iVar == this.mChildDrawingOrderCallback) {
            return;
        }
        setChildrenDrawingOrderEnabled(iVar != null);
    }

    public boolean setChildImportantForAccessibilityInternal(C c2, int i9) {
        if (isComputingLayout()) {
            c2.mPendingAccessibilityState = i9;
            this.mPendingAccessibilityImportanceChange.add(c2);
            return false;
        }
        View view = c2.itemView;
        WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
        view.setImportantForAccessibility(i9);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z10;
        super.setClipToPadding(z10);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(j jVar) {
        jVar.getClass();
        this.mEdgeEffectFactory = jVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z10) {
        this.mHasFixedSize = z10;
    }

    public void setItemAnimator(k kVar) {
        k kVar2 = this.mItemAnimator;
        if (kVar2 != null) {
            kVar2.e();
            this.mItemAnimator.f7491a = null;
        }
        this.mItemAnimator = kVar;
        if (kVar != null) {
            kVar.f7491a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i9) {
        u uVar = this.mRecycler;
        uVar.f7518e = i9;
        uVar.p();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(n nVar) {
        C0569g.b bVar;
        if (nVar == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            k kVar = this.mItemAnimator;
            if (kVar != null) {
                kVar.e();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            u uVar = this.mRecycler;
            uVar.f7514a.clear();
            uVar.h();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            u uVar2 = this.mRecycler;
            uVar2.f7514a.clear();
            uVar2.h();
        }
        C0569g c0569g = this.mChildHelper;
        c0569g.f7641b.g();
        ArrayList arrayList = c0569g.f7642c;
        int size = arrayList.size();
        while (true) {
            size--;
            bVar = c0569g.f7640a;
            if (size < 0) {
                break;
            }
            View view = (View) arrayList.get(size);
            e eVar = (e) bVar;
            eVar.getClass();
            C childViewHolderInt = getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
            arrayList.remove(size);
        }
        RecyclerView recyclerView = RecyclerView.this;
        int childCount = recyclerView.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = recyclerView.getChildAt(i9);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.mLayout = nVar;
        if (nVar != null) {
            if (nVar.mRecyclerView != null) {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(nVar);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.h(nVar.mRecyclerView, sb2));
            }
            nVar.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.p();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        C1608l scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f31083d) {
            WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
            C1596C.d.q(scrollingChildHelper.f31082c);
        }
        scrollingChildHelper.f31083d = z10;
    }

    public void setOnFlingListener(q qVar) {
        this.mOnFlingListener = qVar;
    }

    @Deprecated
    public void setOnScrollListener(s sVar) {
        this.mScrollListener = sVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.mPreserveFocusAfterLayout = z10;
    }

    public void setRecycledViewPool(t tVar) {
        u uVar = this.mRecycler;
        RecyclerView recyclerView = RecyclerView.this;
        Adapter<?> adapter = recyclerView.mAdapter;
        t tVar2 = uVar.f7520g;
        if (tVar2 != null) {
            tVar2.detachForPoolingContainer(adapter, false);
        }
        t tVar3 = uVar.f7520g;
        if (tVar3 != null) {
            tVar3.detach();
        }
        uVar.f7520g = tVar;
        if (tVar != null && recyclerView.getAdapter() != null) {
            uVar.f7520g.attach();
        }
        uVar.g();
    }

    @Deprecated
    public void setRecyclerListener(v vVar) {
        this.mRecyclerListener = vVar;
    }

    public void setScrollState(int i9) {
        if (i9 == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("setting scroll state to ", i9, " from ");
            l10.append(this.mScrollState);
            Log.d(TAG, l10.toString(), new Exception());
        }
        this.mScrollState = i9;
        if (i9 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i9);
    }

    public void setScrollingTouchSlop(int i9) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i9 != 0) {
            if (i9 == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i9 + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(A a10) {
        this.mRecycler.getClass();
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    public void smoothScrollBy(int i9, int i10) {
        smoothScrollBy(i9, i10, null);
    }

    public void smoothScrollToPosition(int i9) {
        if (this.mLayoutSuppressed) {
            return;
        }
        n nVar = this.mLayout;
        if (nVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            nVar.smoothScrollToPosition(this, this.mState, i9);
        }
    }

    public void startInterceptRequestLayout() {
        int i9 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i9;
        if (i9 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i9) {
        return getScrollingChildHelper().h(i9, 0);
    }

    public void stopInterceptRequestLayout(boolean z10) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (sDebugAssertionsEnabled) {
                throw new IllegalStateException(androidx.camera.core.impl.utils.a.h(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z10 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z10 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, DECELERATION_RATE, DECELERATION_RATE, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(Adapter adapter, boolean z10) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, true, z10);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i9, int i10, Object obj) {
        int i11;
        int i12;
        int h9 = this.mChildHelper.h();
        int i13 = i10 + i9;
        for (int i14 = 0; i14 < h9; i14++) {
            View g10 = this.mChildHelper.g(i14);
            C childViewHolderInt = getChildViewHolderInt(g10);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i12 = childViewHolderInt.mPosition) >= i9 && i12 < i13) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((o) g10.getLayoutParams()).f7508c = true;
            }
        }
        u uVar = this.mRecycler;
        ArrayList<C> arrayList = uVar.f7516c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C c2 = arrayList.get(size);
            if (c2 != null && (i11 = c2.mPosition) >= i9 && i11 < i13) {
                c2.addFlags(2);
                uVar.i(size);
            }
        }
    }

    public static abstract class Adapter<VH extends C> {
        private final g mObservable = new g();
        private boolean mHasStableIds = false;
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.f7476a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class StateRestorationPolicy {

            /* renamed from: a, reason: collision with root package name */
            public static final StateRestorationPolicy f7476a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ StateRestorationPolicy[] f7477b;

            static {
                StateRestorationPolicy stateRestorationPolicy = new StateRestorationPolicy("ALLOW", 0);
                f7476a = stateRestorationPolicy;
                f7477b = new StateRestorationPolicy[]{stateRestorationPolicy, new StateRestorationPolicy("PREVENT_WHEN_EMPTY", 1), new StateRestorationPolicy("PREVENT", 2)};
            }

            public StateRestorationPolicy() {
                throw null;
            }

            public static StateRestorationPolicy valueOf(String str) {
                return (StateRestorationPolicy) Enum.valueOf(StateRestorationPolicy.class, str);
            }

            public static StateRestorationPolicy[] values() {
                return (StateRestorationPolicy[]) f7477b.clone();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(VH vh, int i) {
            boolean z10 = vh.mBindingAdapter == null;
            if (z10) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                int i9 = t0.j.f27405a;
                Trace.beginSection(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh.mBindingAdapter = this;
            if (RecyclerView.sDebugAssertionsEnabled) {
                if (vh.itemView.getParent() == null) {
                    View view = vh.itemView;
                    WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
                    if (view.isAttachedToWindow() != vh.isTmpDetached()) {
                        throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + vh.isTmpDetached() + ", attached to window: " + vh.itemView.isAttachedToWindow() + ", holder: " + vh);
                    }
                }
                if (vh.itemView.getParent() == null) {
                    View view2 = vh.itemView;
                    WeakHashMap<View, y0.E> weakHashMap2 = C1596C.f30963a;
                    if (view2.isAttachedToWindow()) {
                        throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + vh);
                    }
                }
            }
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z10) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof o) {
                    ((o) layoutParams).f7508c = true;
                }
                int i10 = t0.j.f27405a;
                Trace.endSection();
            }
        }

        public boolean canRestoreState() {
            int ordinal = this.mStateRestorationPolicy.ordinal();
            return ordinal != 1 ? ordinal != 2 : getItemCount() > 0;
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            try {
                int i9 = t0.j.f27405a;
                Trace.beginSection(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                onCreateViewHolder.mItemViewType = i;
                Trace.endSection();
                return onCreateViewHolder;
            } catch (Throwable th) {
                int i10 = t0.j.f27405a;
                Trace.endSection();
                throw th;
            }
        }

        public int findRelativeAdapterPositionIn(Adapter<? extends C> adapter, C c2, int i) {
            if (adapter == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1L;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.d(i, 1, null);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.e(i, 1);
        }

        public final void notifyItemMoved(int i, int i9) {
            this.mObservable.c(i, i9);
        }

        public final void notifyItemRangeChanged(int i, int i9) {
            this.mObservable.d(i, i9, null);
        }

        public final void notifyItemRangeInserted(int i, int i9) {
            this.mObservable.e(i, i9);
        }

        public final void notifyItemRangeRemoved(int i, int i9) {
            this.mObservable.f(i, i9);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.f(i, 1);
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void registerAdapterDataObserver(h hVar) {
            this.mObservable.registerObserver(hVar);
        }

        public void setHasStableIds(boolean z10) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z10;
        }

        public void setStateRestorationPolicy(StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.g();
        }

        public void unregisterAdapterDataObserver(h hVar) {
            this.mObservable.unregisterObserver(hVar);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.d(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i9, Object obj) {
            this.mObservable.d(i, i9, obj);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.luminary.mobile.R.attr.recyclerViewStyle);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.recyclerview.widget.RecyclerView.C findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.g r0 = r5.mChildHelper
            int r0 = r0.h()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.g r3 = r5.mChildHelper
            android.view.View r3 = r3.g(r2)
            androidx.recyclerview.widget.RecyclerView$C r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.g r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.k(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.RecyclerView$C");
    }

    public void onExitLayoutOrScroll(boolean z10) {
        int i9 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i9;
        if (i9 < 1) {
            if (sDebugAssertionsEnabled && i9 < 0) {
                throw new IllegalStateException(androidx.camera.core.impl.utils.a.h(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.mLayoutOrScrollCounter = 0;
            if (z10) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i9, int i10, Interpolator interpolator) {
        smoothScrollBy(i9, i10, interpolator, Integer.MIN_VALUE);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.mObserver = new w();
        this.mRecycler = new u();
        this.mViewInfoStore = new P();
        this.mUpdateChildViewsRunnable = new RunnableC0560a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        C0578p c0578p = new C0578p();
        c0578p.f7491a = null;
        c0578p.f7492b = new ArrayList<>();
        c0578p.f7493c = 120L;
        c0578p.f7494d = 120L;
        c0578p.f7495e = 250L;
        c0578p.f7496f = 250L;
        c0578p.f7433g = true;
        c0578p.f7676h = new ArrayList<>();
        c0578p.i = new ArrayList<>();
        c0578p.f7677j = new ArrayList<>();
        c0578p.f7678k = new ArrayList<>();
        c0578p.f7679l = new ArrayList<>();
        c0578p.f7680m = new ArrayList<>();
        c0578p.f7681n = new ArrayList<>();
        c0578p.f7682o = new ArrayList<>();
        c0578p.f7683p = new ArrayList<>();
        c0578p.f7684q = new ArrayList<>();
        c0578p.f7685r = new ArrayList<>();
        this.mItemAnimator = c0578p;
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new B();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new t.b() : null;
        y yVar = new y();
        yVar.f7538a = -1;
        yVar.f7539b = 0;
        yVar.f7540c = 0;
        yVar.f7541d = 1;
        yVar.f7542e = 0;
        yVar.f7543f = false;
        yVar.f7544g = false;
        yVar.f7545h = false;
        yVar.i = false;
        yVar.f7546j = false;
        yVar.f7547k = false;
        this.mState = yVar;
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new l();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new RunnableC0561b();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
        this.mScaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.f7491a = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new J(this));
        int[] iArr = C0507a.f4247a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i9, 0);
        C1596C.n(this, context, iArr, attributeSet, obtainStyledAttributes, i9);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(1, true);
        boolean z10 = obtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z10;
        if (z10) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(6), obtainStyledAttributes.getDrawable(7), (StateListDrawable) obtainStyledAttributes.getDrawable(4), obtainStyledAttributes.getDrawable(5));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i9, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i9, 0);
        C1596C.n(this, context, iArr2, attributeSet, obtainStyledAttributes2, i9);
        boolean z11 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
        setTag(com.luminary.mobile.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public boolean dispatchNestedPreScroll(int i9, int i10, int[] iArr, int[] iArr2, int i11) {
        return getScrollingChildHelper().c(i9, i10, iArr, iArr2, i11);
    }

    public boolean dispatchNestedScroll(int i9, int i10, int i11, int i12, int[] iArr, int i13) {
        return getScrollingChildHelper().e(i9, i10, i11, i12, iArr, i13, null);
    }

    public boolean hasNestedScrollingParent(int i9) {
        return getScrollingChildHelper().g(i9);
    }

    public void smoothScrollBy(int i9, int i10, Interpolator interpolator, int i11) {
        smoothScrollBy(i9, i10, interpolator, i11, false);
    }

    public boolean startNestedScroll(int i9, int i10) {
        return getScrollingChildHelper().h(i9, i10);
    }

    public void stopNestedScroll(int i9) {
        getScrollingChildHelper().i(i9);
    }

    public static class o extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public C f7506a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f7507b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f7508c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f7509d;

        public o(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7507b = new Rect();
            this.f7508c = true;
            this.f7509d = false;
        }

        public o(int i, int i9) {
            super(i, i9);
            this.f7507b = new Rect();
            this.f7508c = true;
            this.f7509d = false;
        }

        public o(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f7507b = new Rect();
            this.f7508c = true;
            this.f7509d = false;
        }

        public o(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7507b = new Rect();
            this.f7508c = true;
            this.f7509d = false;
        }

        public o(o oVar) {
            super((ViewGroup.LayoutParams) oVar);
            this.f7507b = new Rect();
            this.f7508c = true;
            this.f7509d = false;
        }
    }

    public void smoothScrollBy(int i9, int i10, Interpolator interpolator, int i11, boolean z10) {
        n nVar = this.mLayout;
        if (nVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!nVar.canScrollHorizontally()) {
            i9 = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i10 = 0;
        }
        if (i9 == 0 && i10 == 0) {
            return;
        }
        if (i11 != Integer.MIN_VALUE && i11 <= 0) {
            scrollBy(i9, i10);
            return;
        }
        if (z10) {
            int i12 = i9 != 0 ? 1 : 0;
            if (i10 != 0) {
                i12 |= 2;
            }
            startNestedScroll(i12, 1);
        }
        this.mViewFlinger.c(i9, i10, interpolator, i11);
    }

    public final void dispatchNestedScroll(int i9, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        getScrollingChildHelper().e(i9, i10, i11, i12, iArr, i13, iArr2);
    }

    public void addItemDecoration(m mVar) {
        addItemDecoration(mVar, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        n nVar = this.mLayout;
        if (nVar != null) {
            return nVar.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException(androidx.camera.core.impl.utils.a.h(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    public void onScrollStateChanged(int i9) {
    }

    public static abstract class s {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i9) {
        }
    }

    public void onScrolled(int i9, int i10) {
    }
}
