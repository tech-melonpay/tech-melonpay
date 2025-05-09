package androidx.constraintlayout.widget;

import a0.C0505a;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.f;
import c0.C0620a;
import c0.C0621b;
import d0.C0681b;
import f0.AbstractC0734b;
import f0.C0733a;
import f0.C0736d;
import f0.C0737e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.bouncycastle.tls.NamedGroup;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static C0737e sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<androidx.constraintlayout.widget.a> mConstraintHelpers;
    protected C0733a mConstraintLayoutSpec;
    private androidx.constraintlayout.widget.b mConstraintSet;
    private int mConstraintSetId;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected androidx.constraintlayout.core.widgets.d mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    b mMeasurer;
    private int mMinHeight;
    private int mMinWidth;
    private ArrayList<c> mModifiers;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<ConstraintWidget> mTempMapIdToWidget;

    public class b implements C0681b.InterfaceC0389b {

        /* renamed from: a, reason: collision with root package name */
        public final ConstraintLayout f6311a;

        /* renamed from: b, reason: collision with root package name */
        public int f6312b;

        /* renamed from: c, reason: collision with root package name */
        public int f6313c;

        /* renamed from: d, reason: collision with root package name */
        public int f6314d;

        /* renamed from: e, reason: collision with root package name */
        public int f6315e;

        /* renamed from: f, reason: collision with root package name */
        public int f6316f;

        /* renamed from: g, reason: collision with root package name */
        public int f6317g;

        public b(ConstraintLayout constraintLayout) {
            this.f6311a = constraintLayout;
        }

        public static boolean a(int i, int i9, int i10) {
            if (i == i9) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            return View.MeasureSpec.getMode(i9) == 1073741824 && (mode == Integer.MIN_VALUE || mode == 0) && i10 == View.MeasureSpec.getSize(i9);
        }

        /* JADX WARN: Code restructure failed: missing block: B:166:0x00f5, code lost:
        
            if (r10 == 2) goto L79;
         */
        /* JADX WARN: Removed duplicated region for block: B:151:0x01b1  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x01ac  */
        /* JADX WARN: Removed duplicated region for block: B:184:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x01df A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x01e0  */
        @android.annotation.SuppressLint({"WrongCall"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(androidx.constraintlayout.core.widgets.ConstraintWidget r19, d0.C0681b.a r20) {
            /*
                Method dump skipped, instructions count: 735
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.b(androidx.constraintlayout.core.widgets.ConstraintWidget, d0.b$a):void");
        }
    }

    public interface c {
        boolean a();
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.d();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = NamedGroup.ffdhe3072;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new b(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, 0, 0);
    }

    public static /* synthetic */ C0505a access$000(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        return null;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static C0737e getSharedValues() {
        if (sSharedValues == null) {
            C0737e c0737e = new C0737e();
            new SparseIntArray();
            new HashMap();
            sSharedValues = c0737e;
        }
        return sSharedValues;
    }

    private ConstraintWidget getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).f6300q0;
    }

    private void init(AttributeSet attributeSet, int i, int i9) {
        androidx.constraintlayout.core.widgets.d dVar = this.mLayoutWidget;
        dVar.f6036i0 = this;
        b bVar = this.mMeasurer;
        dVar.f6139w0 = bVar;
        dVar.f6137u0.f20390f = bVar;
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0736d.f20591b, i, i9);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 16) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == 17) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == 14) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == 15) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == 113) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
                        this.mConstraintSet = bVar2;
                        bVar2.f(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        androidx.constraintlayout.core.widgets.d dVar2 = this.mLayoutWidget;
        dVar2.f6128F0 = this.mOptimizationLevel;
        androidx.constraintlayout.core.c.f5965q = dVar2.W(512);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ConstraintWidget viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.C();
            }
        }
        if (isInEditMode) {
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).f6040k0 = resourceName;
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt2 = getChildAt(i10);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof androidx.constraintlayout.widget.c)) {
                    this.mConstraintSet = ((androidx.constraintlayout.widget.c) childAt2).getConstraintSet();
                }
            }
        }
        androidx.constraintlayout.widget.b bVar = this.mConstraintSet;
        if (bVar != null) {
            bVar.a(this);
        }
        this.mLayoutWidget.s0.clear();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                androidx.constraintlayout.widget.a aVar = this.mConstraintHelpers.get(i11);
                if (aVar.isInEditMode()) {
                    aVar.setIds(aVar.f6324e);
                }
                C0620a c0620a = aVar.f6323d;
                if (c0620a != null) {
                    c0620a.f8508t0 = 0;
                    Arrays.fill(c0620a.s0, (Object) null);
                    for (int i12 = 0; i12 < aVar.f6321b; i12++) {
                        int i13 = aVar.f6320a[i12];
                        View viewById = getViewById(i13);
                        if (viewById == null) {
                            Integer valueOf = Integer.valueOf(i13);
                            HashMap<Integer, String> hashMap = aVar.f6327h;
                            String str = hashMap.get(valueOf);
                            int g10 = aVar.g(this, str);
                            if (g10 != 0) {
                                aVar.f6320a[i12] = g10;
                                hashMap.put(Integer.valueOf(g10), str);
                                viewById = getViewById(g10);
                            }
                        }
                        if (viewById != null) {
                            C0620a c0620a2 = aVar.f6323d;
                            ConstraintWidget viewWidget2 = getViewWidget(viewById);
                            c0620a2.getClass();
                            if (viewWidget2 != c0620a2 && viewWidget2 != null) {
                                int i14 = c0620a2.f8508t0 + 1;
                                ConstraintWidget[] constraintWidgetArr = c0620a2.s0;
                                if (i14 > constraintWidgetArr.length) {
                                    c0620a2.s0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
                                }
                                ConstraintWidget[] constraintWidgetArr2 = c0620a2.s0;
                                int i15 = c0620a2.f8508t0;
                                constraintWidgetArr2[i15] = viewWidget2;
                                c0620a2.f8508t0 = i15 + 1;
                            }
                        }
                    }
                    aVar.f6323d.S();
                }
            }
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt3 = getChildAt(i16);
            if (childAt3 instanceof d) {
                d dVar = (d) childAt3;
                if (dVar.f6449a == -1 && !dVar.isInEditMode()) {
                    dVar.setVisibility(dVar.f6451c);
                }
                View findViewById = findViewById(dVar.f6449a);
                dVar.f6450b = findViewById;
                if (findViewById != null) {
                    ((a) findViewById.getLayoutParams()).f6279f0 = true;
                    dVar.f6450b.setVisibility(0);
                    dVar.setVisibility(0);
                }
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt5 = getChildAt(i18);
            ConstraintWidget viewWidget3 = getViewWidget(childAt5);
            if (viewWidget3 != null) {
                a aVar2 = (a) childAt5.getLayoutParams();
                androidx.constraintlayout.core.widgets.d dVar2 = this.mLayoutWidget;
                dVar2.s0.add(viewWidget3);
                ConstraintWidget constraintWidget = viewWidget3.W;
                if (constraintWidget != null) {
                    ((C0621b) constraintWidget).s0.remove(viewWidget3);
                    viewWidget3.C();
                }
                viewWidget3.W = dVar2;
                applyConstraintsFromLayoutParams(isInEditMode, childAt5, viewWidget3, aVar2, this.mTempMapIdToWidget);
            }
        }
    }

    private void setWidgetBaseline(ConstraintWidget constraintWidget, a aVar, SparseArray<ConstraintWidget> sparseArray, int i, ConstraintAnchor.Type type) {
        View view = this.mChildrenByIds.get(i);
        ConstraintWidget constraintWidget2 = sparseArray.get(i);
        if (constraintWidget2 == null || view == null || !(view.getLayoutParams() instanceof a)) {
            return;
        }
        aVar.f6273c0 = true;
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.f5998e;
        if (type == type2) {
            a aVar2 = (a) view.getLayoutParams();
            aVar2.f6273c0 = true;
            aVar2.f6300q0.f6007F = true;
        }
        constraintWidget.i(type2).b(constraintWidget2.i(type), aVar.f6253D, aVar.f6252C, true);
        constraintWidget.f6007F = true;
        constraintWidget.i(ConstraintAnchor.Type.f5995b).j();
        constraintWidget.i(ConstraintAnchor.Type.f5997d).j();
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (getChildAt(i).isLayoutRequested()) {
                z10 = true;
                break;
            }
            i++;
        }
        if (z10) {
            setChildrenConstraints();
        }
        return z10;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x02ea -> B:80:0x02eb). Please report as a decompilation issue!!! */
    public void applyConstraintsFromLayoutParams(boolean z10, View view, ConstraintWidget constraintWidget, a aVar, SparseArray<ConstraintWidget> sparseArray) {
        ConstraintAnchor.Type type;
        ConstraintAnchor.Type type2;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        float f10;
        int i;
        int i9;
        float f11;
        int i10;
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        float f12;
        aVar.a();
        constraintWidget.f6038j0 = view.getVisibility();
        if (aVar.f6279f0) {
            constraintWidget.f6008G = true;
            constraintWidget.f6038j0 = 8;
        }
        constraintWidget.f6036i0 = view;
        if (view instanceof androidx.constraintlayout.widget.a) {
            ((androidx.constraintlayout.widget.a) view).i(constraintWidget, this.mLayoutWidget.f6140x0);
        }
        int i11 = -1;
        if (aVar.f6275d0) {
            f fVar = (f) constraintWidget;
            int i12 = aVar.f6294n0;
            int i13 = aVar.f6296o0;
            float f13 = aVar.f6298p0;
            if (f13 != -1.0f) {
                if (f13 > -1.0f) {
                    fVar.s0 = f13;
                    fVar.f6184t0 = -1;
                    fVar.f6185u0 = -1;
                    return;
                }
                return;
            }
            if (i12 != -1) {
                if (i12 > -1) {
                    fVar.s0 = -1.0f;
                    fVar.f6184t0 = i12;
                    fVar.f6185u0 = -1;
                    return;
                }
                return;
            }
            if (i13 == -1 || i13 <= -1) {
                return;
            }
            fVar.s0 = -1.0f;
            fVar.f6184t0 = -1;
            fVar.f6185u0 = i13;
            return;
        }
        int i14 = aVar.f6281g0;
        int i15 = aVar.f6283h0;
        int i16 = aVar.f6284i0;
        int i17 = aVar.f6286j0;
        int i18 = aVar.f6288k0;
        int i19 = aVar.f6290l0;
        float f14 = aVar.f6292m0;
        int i20 = aVar.f6297p;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.f5996c;
        ConstraintAnchor.Type type6 = ConstraintAnchor.Type.f5994a;
        ConstraintAnchor.Type type7 = ConstraintAnchor.Type.f5997d;
        ConstraintAnchor.Type type8 = ConstraintAnchor.Type.f5995b;
        if (i20 != -1) {
            ConstraintWidget constraintWidget6 = sparseArray.get(i20);
            if (constraintWidget6 != null) {
                float f15 = aVar.f6301r;
                int i21 = aVar.f6299q;
                ConstraintAnchor.Type type9 = ConstraintAnchor.Type.f5999f;
                type3 = type6;
                type4 = type5;
                f12 = 0.0f;
                constraintWidget.v(type9, constraintWidget6, type9, i21, 0);
                constraintWidget.f6006E = f15;
            } else {
                type3 = type6;
                type4 = type5;
                f12 = 0.0f;
            }
            f10 = f12;
            type2 = type4;
            type = type3;
        } else {
            if (i14 != -1) {
                ConstraintWidget constraintWidget7 = sparseArray.get(i14);
                if (constraintWidget7 != null) {
                    type = type6;
                    type2 = type5;
                    constraintWidget.v(type6, constraintWidget7, type6, ((ViewGroup.MarginLayoutParams) aVar).leftMargin, i18);
                } else {
                    type = type6;
                    type2 = type5;
                }
            } else {
                type = type6;
                type2 = type5;
                if (i15 != -1 && (constraintWidget2 = sparseArray.get(i15)) != null) {
                    constraintWidget.v(type, constraintWidget2, type2, ((ViewGroup.MarginLayoutParams) aVar).leftMargin, i18);
                }
            }
            if (i16 != -1) {
                ConstraintWidget constraintWidget8 = sparseArray.get(i16);
                if (constraintWidget8 != null) {
                    constraintWidget.v(type2, constraintWidget8, type, ((ViewGroup.MarginLayoutParams) aVar).rightMargin, i19);
                }
            } else if (i17 != -1 && (constraintWidget3 = sparseArray.get(i17)) != null) {
                constraintWidget.v(type2, constraintWidget3, type2, ((ViewGroup.MarginLayoutParams) aVar).rightMargin, i19);
            }
            int i22 = aVar.i;
            if (i22 != -1) {
                ConstraintWidget constraintWidget9 = sparseArray.get(i22);
                if (constraintWidget9 != null) {
                    constraintWidget.v(type8, constraintWidget9, type8, ((ViewGroup.MarginLayoutParams) aVar).topMargin, aVar.f6307x);
                }
            } else {
                int i23 = aVar.f6285j;
                if (i23 != -1 && (constraintWidget4 = sparseArray.get(i23)) != null) {
                    constraintWidget.v(type8, constraintWidget4, type7, ((ViewGroup.MarginLayoutParams) aVar).topMargin, aVar.f6307x);
                }
            }
            int i24 = aVar.f6287k;
            if (i24 != -1) {
                ConstraintWidget constraintWidget10 = sparseArray.get(i24);
                if (constraintWidget10 != null) {
                    constraintWidget.v(type7, constraintWidget10, type8, ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, aVar.f6309z);
                }
            } else {
                int i25 = aVar.f6289l;
                if (i25 != -1 && (constraintWidget5 = sparseArray.get(i25)) != null) {
                    constraintWidget.v(type7, constraintWidget5, type7, ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, aVar.f6309z);
                }
            }
            int i26 = aVar.f6291m;
            if (i26 != -1) {
                setWidgetBaseline(constraintWidget, aVar, sparseArray, i26, ConstraintAnchor.Type.f5998e);
            } else {
                int i27 = aVar.f6293n;
                if (i27 != -1) {
                    setWidgetBaseline(constraintWidget, aVar, sparseArray, i27, type8);
                } else {
                    int i28 = aVar.f6295o;
                    if (i28 != -1) {
                        setWidgetBaseline(constraintWidget, aVar, sparseArray, i28, type7);
                    }
                }
            }
            f10 = 0.0f;
            if (f14 >= 0.0f) {
                constraintWidget.f6033g0 = f14;
            }
            float f16 = aVar.f6255F;
            if (f16 >= 0.0f) {
                constraintWidget.f6035h0 = f16;
            }
        }
        if (z10 && ((i10 = aVar.T) != -1 || aVar.U != -1)) {
            int i29 = aVar.U;
            constraintWidget.f6023b0 = i10;
            constraintWidget.f6025c0 = i29;
        }
        boolean z11 = aVar.f6269a0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f6064b;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f6063a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f6066d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f6065c;
        if (z11) {
            constraintWidget.M(dimensionBehaviour2);
            constraintWidget.O(((ViewGroup.MarginLayoutParams) aVar).width);
            if (((ViewGroup.MarginLayoutParams) aVar).width == -2) {
                constraintWidget.M(dimensionBehaviour);
            }
        } else if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
            if (aVar.W) {
                constraintWidget.M(dimensionBehaviour4);
            } else {
                constraintWidget.M(dimensionBehaviour3);
            }
            constraintWidget.i(type).f5992g = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            constraintWidget.i(type2).f5992g = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
        } else {
            constraintWidget.M(dimensionBehaviour4);
            constraintWidget.O(0);
        }
        if (aVar.f6271b0) {
            constraintWidget.N(dimensionBehaviour2);
            constraintWidget.L(((ViewGroup.MarginLayoutParams) aVar).height);
            if (((ViewGroup.MarginLayoutParams) aVar).height == -2) {
                constraintWidget.N(dimensionBehaviour);
            }
        } else if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
            if (aVar.X) {
                constraintWidget.N(dimensionBehaviour4);
            } else {
                constraintWidget.N(dimensionBehaviour3);
            }
            constraintWidget.i(type8).f5992g = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            constraintWidget.i(type7).f5992g = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
        } else {
            constraintWidget.N(dimensionBehaviour4);
            constraintWidget.L(0);
        }
        String str = aVar.f6256G;
        if (str == null || str.length() == 0) {
            constraintWidget.f6019Z = f10;
        } else {
            int length = str.length();
            int indexOf = str.indexOf(44);
            if (indexOf <= 0 || indexOf >= length - 1) {
                i = 1;
                i9 = 0;
            } else {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i11 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i = 1;
                    i11 = 1;
                    i9 = indexOf + i;
                }
                i = 1;
                i9 = indexOf + i;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - i) {
                String substring2 = str.substring(i9);
                if (substring2.length() > 0) {
                    f11 = Float.parseFloat(substring2);
                }
                f11 = f10;
            } else {
                String substring3 = str.substring(i9, indexOf2);
                String substring4 = str.substring(indexOf2 + i);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    float parseFloat = Float.parseFloat(substring3);
                    float parseFloat2 = Float.parseFloat(substring4);
                    if (parseFloat > f10 && parseFloat2 > f10) {
                        f11 = i11 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                    }
                }
                f11 = f10;
            }
            if (f11 > f10) {
                constraintWidget.f6019Z = f11;
                constraintWidget.f6021a0 = i11;
            }
        }
        float f17 = aVar.f6257H;
        float[] fArr = constraintWidget.f6046n0;
        fArr[0] = f17;
        fArr[1] = aVar.f6258I;
        constraintWidget.f6042l0 = aVar.f6259J;
        constraintWidget.f6044m0 = aVar.f6260K;
        int i30 = aVar.f6267Z;
        if (i30 >= 0 && i30 <= 3) {
            constraintWidget.f6053r = i30;
        }
        int i31 = aVar.f6261L;
        int i32 = aVar.f6263N;
        int i33 = aVar.f6265P;
        float f18 = aVar.R;
        constraintWidget.f6055s = i31;
        constraintWidget.f6058v = i32;
        if (i33 == Integer.MAX_VALUE) {
            i33 = 0;
        }
        constraintWidget.f6059w = i33;
        constraintWidget.f6060x = f18;
        if (f18 > f10 && f18 < 1.0f && i31 == 0) {
            constraintWidget.f6055s = 2;
        }
        int i34 = aVar.f6262M;
        int i35 = aVar.f6264O;
        int i36 = aVar.f6266Q;
        float f19 = aVar.S;
        constraintWidget.f6056t = i34;
        constraintWidget.f6061y = i35;
        constraintWidget.f6062z = i36 != Integer.MAX_VALUE ? i36 : 0;
        constraintWidget.f6002A = f19;
        if (f19 <= f10 || f19 >= 1.0f || i34 != 0) {
            return;
        }
        constraintWidget.f6056t = 2;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.a> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i10 = (int) ((parseInt / 1080.0f) * width);
                        int i11 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i10;
                        float f11 = i11;
                        float f12 = i10 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float parseInt4 = i11 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, parseInt4, paint);
                        canvas.drawLine(f12, parseInt4, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f12, f11, paint);
                    }
                }
            }
        }
    }

    public boolean dynamicUpdateConstraints(int i, int i9) {
        boolean z10 = false;
        if (this.mModifiers == null) {
            return false;
        }
        View.MeasureSpec.getSize(i);
        View.MeasureSpec.getSize(i9);
        Iterator<c> it = this.mModifiers.iterator();
        while (it.hasNext()) {
            c next = it.next();
            Iterator<ConstraintWidget> it2 = this.mLayoutWidget.s0.iterator();
            while (it2.hasNext()) {
                View view = (View) it2.next().f6036i0;
                view.getId();
                z10 |= next.a();
            }
        }
        return z10;
    }

    @Override // android.view.View
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.mDesignIds;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.f6128F0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb2 = new StringBuilder();
        if (this.mLayoutWidget.f6039k == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.mLayoutWidget.f6039k = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.mLayoutWidget.f6039k = "parent";
            }
        }
        androidx.constraintlayout.core.widgets.d dVar = this.mLayoutWidget;
        if (dVar.f6040k0 == null) {
            dVar.f6040k0 = dVar.f6039k;
            Log.v("ConstraintLayout", " setDebugName " + this.mLayoutWidget.f6040k0);
        }
        Iterator<ConstraintWidget> it = this.mLayoutWidget.s0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            View view = (View) next.f6036i0;
            if (view != null) {
                if (next.f6039k == null && (id = view.getId()) != -1) {
                    next.f6039k = getContext().getResources().getResourceEntryName(id);
                }
                if (next.f6040k0 == null) {
                    next.f6040k0 = next.f6039k;
                    Log.v("ConstraintLayout", " setDebugName " + next.f6040k0);
                }
            }
        }
        this.mLayoutWidget.n(sb2);
        return sb2.toString();
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof a) {
            return ((a) view.getLayoutParams()).f6300q0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof a) {
            return ((a) view.getLayoutParams()).f6300q0;
        }
        return null;
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i, int i9, int i10, int i11) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            a aVar = (a) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = aVar.f6300q0;
            if ((childAt.getVisibility() != 8 || aVar.f6275d0 || aVar.f6277e0 || isInEditMode) && !aVar.f6279f0) {
                int r8 = constraintWidget.r();
                int s10 = constraintWidget.s();
                int q10 = constraintWidget.q() + r8;
                int k3 = constraintWidget.k() + s10;
                childAt.layout(r8, s10, q10, k3);
                if ((childAt instanceof d) && (content = ((d) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(r8, s10, q10, k3);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                this.mConstraintHelpers.get(i13).j();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i9) {
        boolean dynamicUpdateConstraints = this.mDirtyHierarchy | dynamicUpdateConstraints(i, i9);
        this.mDirtyHierarchy = dynamicUpdateConstraints;
        if (!dynamicUpdateConstraints) {
            int childCount = getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                if (getChildAt(i10).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
                i10++;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i9;
        this.mLayoutWidget.f6140x0 = isRtl();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                androidx.constraintlayout.core.widgets.d dVar = this.mLayoutWidget;
                dVar.f6136t0.c(dVar);
            }
        }
        this.mLayoutWidget.f6141y0.getClass();
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i9);
        int q10 = this.mLayoutWidget.q();
        int k3 = this.mLayoutWidget.k();
        androidx.constraintlayout.core.widgets.d dVar2 = this.mLayoutWidget;
        resolveMeasuredDimension(i, i9, q10, k3, dVar2.f6129G0, dVar2.f6130H0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof f)) {
            a aVar = (a) view.getLayoutParams();
            f fVar = new f();
            aVar.f6300q0 = fVar;
            aVar.f6275d0 = true;
            fVar.S(aVar.V);
        }
        if (view instanceof androidx.constraintlayout.widget.a) {
            androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) view;
            aVar2.k();
            ((a) view.getLayoutParams()).f6277e0 = true;
            if (!this.mConstraintHelpers.contains(aVar2)) {
                this.mConstraintHelpers.add(aVar2);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        ConstraintWidget viewWidget = getViewWidget(view);
        this.mLayoutWidget.s0.remove(viewWidget);
        viewWidget.C();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new C0733a(getContext(), this, i);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i, int i9, int i10, int i11, boolean z10, boolean z11) {
        b bVar = this.mMeasurer;
        int i12 = bVar.f6315e;
        int resolveSizeAndState = View.resolveSizeAndState(i10 + bVar.f6314d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i11 + i12, i9, 0) & 16777215;
        int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.mMaxHeight, resolveSizeAndState2);
        if (z10) {
            min |= 16777216;
        }
        if (z11) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x042b, code lost:
    
        if (r12 != r13) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0431, code lost:
    
        if (r8.f6019Z <= 0.0f) goto L236;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0119  */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void resolveSystem(androidx.constraintlayout.core.widgets.d r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 1678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.resolveSystem(androidx.constraintlayout.core.widgets.d, int, int, int):void");
    }

    public void setConstraintSet(androidx.constraintlayout.widget.b bVar) {
        this.mConstraintSet = bVar;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.mDesignIds.put(str, num);
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC0734b abstractC0734b) {
        C0733a c0733a = this.mConstraintLayoutSpec;
        if (c0733a != null) {
            c0733a.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        androidx.constraintlayout.core.widgets.d dVar = this.mLayoutWidget;
        dVar.f6128F0 = i;
        androidx.constraintlayout.core.c.f5965q = dVar.W(512);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSelfDimensionBehaviour(androidx.constraintlayout.core.widgets.d r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            androidx.constraintlayout.widget.ConstraintLayout$b r0 = r8.mMeasurer
            int r1 = r0.f6315e
            int r0 = r0.f6314d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.f6063a
            int r3 = r8.getChildCount()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.f6064b
            r5 = 0
            r6 = 1073741824(0x40000000, float:2.0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r7) goto L31
            if (r10 == 0) goto L25
            if (r10 == r6) goto L1c
            r10 = r2
        L1a:
            r11 = r5
            goto L3a
        L1c:
            int r10 = r8.mMaxWidth
            int r10 = r10 - r0
            int r11 = java.lang.Math.min(r10, r11)
            r10 = r2
            goto L3a
        L25:
            if (r3 != 0) goto L2f
            int r10 = r8.mMinWidth
            int r11 = java.lang.Math.max(r5, r10)
        L2d:
            r10 = r4
            goto L3a
        L2f:
            r10 = r4
            goto L1a
        L31:
            if (r3 != 0) goto L2d
            int r10 = r8.mMinWidth
            int r11 = java.lang.Math.max(r5, r10)
            goto L2d
        L3a:
            if (r12 == r7) goto L56
            if (r12 == 0) goto L4a
            if (r12 == r6) goto L42
        L40:
            r13 = r5
            goto L5f
        L42:
            int r12 = r8.mMaxHeight
            int r12 = r12 - r1
            int r13 = java.lang.Math.min(r12, r13)
            goto L5f
        L4a:
            if (r3 != 0) goto L54
            int r12 = r8.mMinHeight
            int r13 = java.lang.Math.max(r5, r12)
        L52:
            r2 = r4
            goto L5f
        L54:
            r2 = r4
            goto L40
        L56:
            if (r3 != 0) goto L52
            int r12 = r8.mMinHeight
            int r13 = java.lang.Math.max(r5, r12)
            goto L52
        L5f:
            int r12 = r9.q()
            r3 = 1
            if (r11 != r12) goto L6c
            int r12 = r9.k()
            if (r13 == r12) goto L70
        L6c:
            d0.e r12 = r9.f6137u0
            r12.f20387c = r3
        L70:
            r9.f6023b0 = r5
            r9.f6025c0 = r5
            int r12 = r8.mMaxWidth
            int r12 = r12 - r0
            int[] r4 = r9.f6005D
            r4[r5] = r12
            int r12 = r8.mMaxHeight
            int r12 = r12 - r1
            r4[r3] = r12
            r9.f6029e0 = r5
            r9.f6031f0 = r5
            r9.M(r10)
            r9.O(r11)
            r9.N(r2)
            r9.L(r13)
            int r10 = r8.mMinWidth
            int r10 = r10 - r0
            if (r10 >= 0) goto L98
            r9.f6029e0 = r5
            goto L9a
        L98:
            r9.f6029e0 = r10
        L9a:
            int r10 = r8.mMinHeight
            int r10 = r10 - r1
            if (r10 >= 0) goto La2
            r9.f6031f0 = r5
            goto La4
        La2:
            r9.f6031f0 = r10
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.setSelfDimensionBehaviour(androidx.constraintlayout.core.widgets.d, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public a generateDefaultLayoutParams() {
        return new a(-2);
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.d();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = NamedGroup.ffdhe3072;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new b(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i, i9);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.d();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = NamedGroup.ffdhe3072;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new b(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, i9);
    }

    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: A, reason: collision with root package name */
        public int f6250A;

        /* renamed from: B, reason: collision with root package name */
        public int f6251B;

        /* renamed from: C, reason: collision with root package name */
        public final int f6252C;

        /* renamed from: D, reason: collision with root package name */
        public final int f6253D;

        /* renamed from: E, reason: collision with root package name */
        public float f6254E;

        /* renamed from: F, reason: collision with root package name */
        public float f6255F;

        /* renamed from: G, reason: collision with root package name */
        public String f6256G;

        /* renamed from: H, reason: collision with root package name */
        public float f6257H;

        /* renamed from: I, reason: collision with root package name */
        public float f6258I;

        /* renamed from: J, reason: collision with root package name */
        public int f6259J;

        /* renamed from: K, reason: collision with root package name */
        public int f6260K;

        /* renamed from: L, reason: collision with root package name */
        public int f6261L;

        /* renamed from: M, reason: collision with root package name */
        public int f6262M;

        /* renamed from: N, reason: collision with root package name */
        public int f6263N;

        /* renamed from: O, reason: collision with root package name */
        public int f6264O;

        /* renamed from: P, reason: collision with root package name */
        public int f6265P;

        /* renamed from: Q, reason: collision with root package name */
        public int f6266Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;

        /* renamed from: Z, reason: collision with root package name */
        public int f6267Z;

        /* renamed from: a, reason: collision with root package name */
        public int f6268a;

        /* renamed from: a0, reason: collision with root package name */
        public boolean f6269a0;

        /* renamed from: b, reason: collision with root package name */
        public int f6270b;

        /* renamed from: b0, reason: collision with root package name */
        public boolean f6271b0;

        /* renamed from: c, reason: collision with root package name */
        public float f6272c;

        /* renamed from: c0, reason: collision with root package name */
        public boolean f6273c0;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f6274d;

        /* renamed from: d0, reason: collision with root package name */
        public boolean f6275d0;

        /* renamed from: e, reason: collision with root package name */
        public int f6276e;

        /* renamed from: e0, reason: collision with root package name */
        public boolean f6277e0;

        /* renamed from: f, reason: collision with root package name */
        public int f6278f;

        /* renamed from: f0, reason: collision with root package name */
        public boolean f6279f0;

        /* renamed from: g, reason: collision with root package name */
        public int f6280g;

        /* renamed from: g0, reason: collision with root package name */
        public int f6281g0;

        /* renamed from: h, reason: collision with root package name */
        public int f6282h;

        /* renamed from: h0, reason: collision with root package name */
        public int f6283h0;
        public int i;

        /* renamed from: i0, reason: collision with root package name */
        public int f6284i0;

        /* renamed from: j, reason: collision with root package name */
        public int f6285j;

        /* renamed from: j0, reason: collision with root package name */
        public int f6286j0;

        /* renamed from: k, reason: collision with root package name */
        public int f6287k;

        /* renamed from: k0, reason: collision with root package name */
        public int f6288k0;

        /* renamed from: l, reason: collision with root package name */
        public int f6289l;

        /* renamed from: l0, reason: collision with root package name */
        public int f6290l0;

        /* renamed from: m, reason: collision with root package name */
        public int f6291m;

        /* renamed from: m0, reason: collision with root package name */
        public float f6292m0;

        /* renamed from: n, reason: collision with root package name */
        public int f6293n;

        /* renamed from: n0, reason: collision with root package name */
        public int f6294n0;

        /* renamed from: o, reason: collision with root package name */
        public int f6295o;

        /* renamed from: o0, reason: collision with root package name */
        public int f6296o0;

        /* renamed from: p, reason: collision with root package name */
        public int f6297p;

        /* renamed from: p0, reason: collision with root package name */
        public float f6298p0;

        /* renamed from: q, reason: collision with root package name */
        public int f6299q;

        /* renamed from: q0, reason: collision with root package name */
        public ConstraintWidget f6300q0;

        /* renamed from: r, reason: collision with root package name */
        public float f6301r;

        /* renamed from: s, reason: collision with root package name */
        public int f6302s;

        /* renamed from: t, reason: collision with root package name */
        public int f6303t;

        /* renamed from: u, reason: collision with root package name */
        public int f6304u;

        /* renamed from: v, reason: collision with root package name */
        public int f6305v;

        /* renamed from: w, reason: collision with root package name */
        public final int f6306w;

        /* renamed from: x, reason: collision with root package name */
        public int f6307x;

        /* renamed from: y, reason: collision with root package name */
        public final int f6308y;

        /* renamed from: z, reason: collision with root package name */
        public int f6309z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a, reason: collision with other inner class name */
        public static class C0069a {

            /* renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f6310a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f6310a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        @SuppressLint({"ClassVerificationFailure"})
        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6268a = -1;
            this.f6270b = -1;
            this.f6272c = -1.0f;
            this.f6274d = true;
            this.f6276e = -1;
            this.f6278f = -1;
            this.f6280g = -1;
            this.f6282h = -1;
            this.i = -1;
            this.f6285j = -1;
            this.f6287k = -1;
            this.f6289l = -1;
            this.f6291m = -1;
            this.f6293n = -1;
            this.f6295o = -1;
            this.f6297p = -1;
            this.f6299q = 0;
            this.f6301r = 0.0f;
            this.f6302s = -1;
            this.f6303t = -1;
            this.f6304u = -1;
            this.f6305v = -1;
            this.f6306w = Integer.MIN_VALUE;
            this.f6307x = Integer.MIN_VALUE;
            this.f6308y = Integer.MIN_VALUE;
            this.f6309z = Integer.MIN_VALUE;
            this.f6250A = Integer.MIN_VALUE;
            this.f6251B = Integer.MIN_VALUE;
            this.f6252C = Integer.MIN_VALUE;
            this.f6253D = 0;
            this.f6254E = 0.5f;
            this.f6255F = 0.5f;
            this.f6256G = null;
            this.f6257H = -1.0f;
            this.f6258I = -1.0f;
            this.f6259J = 0;
            this.f6260K = 0;
            this.f6261L = 0;
            this.f6262M = 0;
            this.f6263N = 0;
            this.f6264O = 0;
            this.f6265P = 0;
            this.f6266Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.f6267Z = 0;
            this.f6269a0 = true;
            this.f6271b0 = true;
            this.f6273c0 = false;
            this.f6275d0 = false;
            this.f6277e0 = false;
            this.f6279f0 = false;
            this.f6281g0 = -1;
            this.f6283h0 = -1;
            this.f6284i0 = -1;
            this.f6286j0 = -1;
            this.f6288k0 = Integer.MIN_VALUE;
            this.f6290l0 = Integer.MIN_VALUE;
            this.f6292m0 = 0.5f;
            this.f6300q0 = new ConstraintWidget();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof a) {
                a aVar = (a) layoutParams;
                this.f6268a = aVar.f6268a;
                this.f6270b = aVar.f6270b;
                this.f6272c = aVar.f6272c;
                this.f6274d = aVar.f6274d;
                this.f6276e = aVar.f6276e;
                this.f6278f = aVar.f6278f;
                this.f6280g = aVar.f6280g;
                this.f6282h = aVar.f6282h;
                this.i = aVar.i;
                this.f6285j = aVar.f6285j;
                this.f6287k = aVar.f6287k;
                this.f6289l = aVar.f6289l;
                this.f6291m = aVar.f6291m;
                this.f6293n = aVar.f6293n;
                this.f6295o = aVar.f6295o;
                this.f6297p = aVar.f6297p;
                this.f6299q = aVar.f6299q;
                this.f6301r = aVar.f6301r;
                this.f6302s = aVar.f6302s;
                this.f6303t = aVar.f6303t;
                this.f6304u = aVar.f6304u;
                this.f6305v = aVar.f6305v;
                this.f6306w = aVar.f6306w;
                this.f6307x = aVar.f6307x;
                this.f6308y = aVar.f6308y;
                this.f6309z = aVar.f6309z;
                this.f6250A = aVar.f6250A;
                this.f6251B = aVar.f6251B;
                this.f6252C = aVar.f6252C;
                this.f6253D = aVar.f6253D;
                this.f6254E = aVar.f6254E;
                this.f6255F = aVar.f6255F;
                this.f6256G = aVar.f6256G;
                this.f6257H = aVar.f6257H;
                this.f6258I = aVar.f6258I;
                this.f6259J = aVar.f6259J;
                this.f6260K = aVar.f6260K;
                this.W = aVar.W;
                this.X = aVar.X;
                this.f6261L = aVar.f6261L;
                this.f6262M = aVar.f6262M;
                this.f6263N = aVar.f6263N;
                this.f6265P = aVar.f6265P;
                this.f6264O = aVar.f6264O;
                this.f6266Q = aVar.f6266Q;
                this.R = aVar.R;
                this.S = aVar.S;
                this.T = aVar.T;
                this.U = aVar.U;
                this.V = aVar.V;
                this.f6269a0 = aVar.f6269a0;
                this.f6271b0 = aVar.f6271b0;
                this.f6273c0 = aVar.f6273c0;
                this.f6275d0 = aVar.f6275d0;
                this.f6281g0 = aVar.f6281g0;
                this.f6283h0 = aVar.f6283h0;
                this.f6284i0 = aVar.f6284i0;
                this.f6286j0 = aVar.f6286j0;
                this.f6288k0 = aVar.f6288k0;
                this.f6290l0 = aVar.f6290l0;
                this.f6292m0 = aVar.f6292m0;
                this.Y = aVar.Y;
                this.f6267Z = aVar.f6267Z;
                this.f6300q0 = aVar.f6300q0;
            }
        }

        public final void a() {
            this.f6275d0 = false;
            this.f6269a0 = true;
            this.f6271b0 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.W) {
                this.f6269a0 = false;
                if (this.f6261L == 0) {
                    this.f6261L = 1;
                }
            }
            int i9 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i9 == -2 && this.X) {
                this.f6271b0 = false;
                if (this.f6262M == 0) {
                    this.f6262M = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f6269a0 = false;
                if (i == 0 && this.f6261L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.W = true;
                }
            }
            if (i9 == 0 || i9 == -1) {
                this.f6271b0 = false;
                if (i9 == 0 && this.f6262M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.X = true;
                }
            }
            if (this.f6272c == -1.0f && this.f6268a == -1 && this.f6270b == -1) {
                return;
            }
            this.f6275d0 = true;
            this.f6269a0 = true;
            this.f6271b0 = true;
            if (!(this.f6300q0 instanceof f)) {
                this.f6300q0 = new f();
            }
            ((f) this.f6300q0).S(this.V);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6268a = -1;
            this.f6270b = -1;
            this.f6272c = -1.0f;
            this.f6274d = true;
            this.f6276e = -1;
            this.f6278f = -1;
            this.f6280g = -1;
            this.f6282h = -1;
            this.i = -1;
            this.f6285j = -1;
            this.f6287k = -1;
            this.f6289l = -1;
            this.f6291m = -1;
            this.f6293n = -1;
            this.f6295o = -1;
            this.f6297p = -1;
            this.f6299q = 0;
            this.f6301r = 0.0f;
            this.f6302s = -1;
            this.f6303t = -1;
            this.f6304u = -1;
            this.f6305v = -1;
            this.f6306w = Integer.MIN_VALUE;
            this.f6307x = Integer.MIN_VALUE;
            this.f6308y = Integer.MIN_VALUE;
            this.f6309z = Integer.MIN_VALUE;
            this.f6250A = Integer.MIN_VALUE;
            this.f6251B = Integer.MIN_VALUE;
            this.f6252C = Integer.MIN_VALUE;
            this.f6253D = 0;
            this.f6254E = 0.5f;
            this.f6255F = 0.5f;
            this.f6256G = null;
            this.f6257H = -1.0f;
            this.f6258I = -1.0f;
            this.f6259J = 0;
            this.f6260K = 0;
            this.f6261L = 0;
            this.f6262M = 0;
            this.f6263N = 0;
            this.f6264O = 0;
            this.f6265P = 0;
            this.f6266Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.f6267Z = 0;
            this.f6269a0 = true;
            this.f6271b0 = true;
            this.f6273c0 = false;
            this.f6275d0 = false;
            this.f6277e0 = false;
            this.f6279f0 = false;
            this.f6281g0 = -1;
            this.f6283h0 = -1;
            this.f6284i0 = -1;
            this.f6286j0 = -1;
            this.f6288k0 = Integer.MIN_VALUE;
            this.f6290l0 = Integer.MIN_VALUE;
            this.f6292m0 = 0.5f;
            this.f6300q0 = new ConstraintWidget();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0736d.f20591b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i9 = C0069a.f6310a.get(index);
                switch (i9) {
                    case 1:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f6297p);
                        this.f6297p = resourceId;
                        if (resourceId == -1) {
                            this.f6297p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f6299q = obtainStyledAttributes.getDimensionPixelSize(index, this.f6299q);
                        break;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f6301r) % 360.0f;
                        this.f6301r = f10;
                        if (f10 < 0.0f) {
                            this.f6301r = (360.0f - f10) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f6268a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f6268a);
                        break;
                    case 6:
                        this.f6270b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f6270b);
                        break;
                    case 7:
                        this.f6272c = obtainStyledAttributes.getFloat(index, this.f6272c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f6276e);
                        this.f6276e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f6276e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f6278f);
                        this.f6278f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f6278f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f6280g);
                        this.f6280g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f6280g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f6282h);
                        this.f6282h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f6282h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId6;
                        if (resourceId6 == -1) {
                            this.i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f6285j);
                        this.f6285j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f6285j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f6287k);
                        this.f6287k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f6287k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f6289l);
                        this.f6289l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f6289l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f6291m);
                        this.f6291m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f6291m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f6302s);
                        this.f6302s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f6302s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f6303t);
                        this.f6303t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f6303t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f6304u);
                        this.f6304u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f6304u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f6305v);
                        this.f6305v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f6305v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f6306w = obtainStyledAttributes.getDimensionPixelSize(index, this.f6306w);
                        break;
                    case 22:
                        this.f6307x = obtainStyledAttributes.getDimensionPixelSize(index, this.f6307x);
                        break;
                    case 23:
                        this.f6308y = obtainStyledAttributes.getDimensionPixelSize(index, this.f6308y);
                        break;
                    case 24:
                        this.f6309z = obtainStyledAttributes.getDimensionPixelSize(index, this.f6309z);
                        break;
                    case 25:
                        this.f6250A = obtainStyledAttributes.getDimensionPixelSize(index, this.f6250A);
                        break;
                    case 26:
                        this.f6251B = obtainStyledAttributes.getDimensionPixelSize(index, this.f6251B);
                        break;
                    case 27:
                        this.W = obtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 28:
                        this.X = obtainStyledAttributes.getBoolean(index, this.X);
                        break;
                    case 29:
                        this.f6254E = obtainStyledAttributes.getFloat(index, this.f6254E);
                        break;
                    case 30:
                        this.f6255F = obtainStyledAttributes.getFloat(index, this.f6255F);
                        break;
                    case 31:
                        int i10 = obtainStyledAttributes.getInt(index, 0);
                        this.f6261L = i10;
                        if (i10 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i11 = obtainStyledAttributes.getInt(index, 0);
                        this.f6262M = i11;
                        if (i11 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.f6263N = obtainStyledAttributes.getDimensionPixelSize(index, this.f6263N);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f6263N) == -2) {
                                this.f6263N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f6265P = obtainStyledAttributes.getDimensionPixelSize(index, this.f6265P);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f6265P) == -2) {
                                this.f6265P = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.R));
                        this.f6261L = 2;
                        break;
                    case 36:
                        try {
                            this.f6264O = obtainStyledAttributes.getDimensionPixelSize(index, this.f6264O);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f6264O) == -2) {
                                this.f6264O = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f6266Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f6266Q);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f6266Q) == -2) {
                                this.f6266Q = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.S));
                        this.f6262M = 2;
                        break;
                    default:
                        switch (i9) {
                            case 44:
                                androidx.constraintlayout.widget.b.i(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f6257H = obtainStyledAttributes.getFloat(index, this.f6257H);
                                break;
                            case 46:
                                this.f6258I = obtainStyledAttributes.getFloat(index, this.f6258I);
                                break;
                            case 47:
                                this.f6259J = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f6260K = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                break;
                            case 50:
                                this.U = obtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                break;
                            case 51:
                                this.Y = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f6293n);
                                this.f6293n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f6293n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f6295o);
                                this.f6295o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f6295o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.f6253D = obtainStyledAttributes.getDimensionPixelSize(index, this.f6253D);
                                break;
                            case 55:
                                this.f6252C = obtainStyledAttributes.getDimensionPixelSize(index, this.f6252C);
                                break;
                            default:
                                switch (i9) {
                                    case 64:
                                        androidx.constraintlayout.widget.b.h(this, obtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        androidx.constraintlayout.widget.b.h(this, obtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.f6267Z = obtainStyledAttributes.getInt(index, this.f6267Z);
                                        break;
                                    case 67:
                                        this.f6274d = obtainStyledAttributes.getBoolean(index, this.f6274d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public a(int i) {
            super(i, -2);
            this.f6268a = -1;
            this.f6270b = -1;
            this.f6272c = -1.0f;
            this.f6274d = true;
            this.f6276e = -1;
            this.f6278f = -1;
            this.f6280g = -1;
            this.f6282h = -1;
            this.i = -1;
            this.f6285j = -1;
            this.f6287k = -1;
            this.f6289l = -1;
            this.f6291m = -1;
            this.f6293n = -1;
            this.f6295o = -1;
            this.f6297p = -1;
            this.f6299q = 0;
            this.f6301r = 0.0f;
            this.f6302s = -1;
            this.f6303t = -1;
            this.f6304u = -1;
            this.f6305v = -1;
            this.f6306w = Integer.MIN_VALUE;
            this.f6307x = Integer.MIN_VALUE;
            this.f6308y = Integer.MIN_VALUE;
            this.f6309z = Integer.MIN_VALUE;
            this.f6250A = Integer.MIN_VALUE;
            this.f6251B = Integer.MIN_VALUE;
            this.f6252C = Integer.MIN_VALUE;
            this.f6253D = 0;
            this.f6254E = 0.5f;
            this.f6255F = 0.5f;
            this.f6256G = null;
            this.f6257H = -1.0f;
            this.f6258I = -1.0f;
            this.f6259J = 0;
            this.f6260K = 0;
            this.f6261L = 0;
            this.f6262M = 0;
            this.f6263N = 0;
            this.f6264O = 0;
            this.f6265P = 0;
            this.f6266Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.f6267Z = 0;
            this.f6269a0 = true;
            this.f6271b0 = true;
            this.f6273c0 = false;
            this.f6275d0 = false;
            this.f6277e0 = false;
            this.f6279f0 = false;
            this.f6281g0 = -1;
            this.f6283h0 = -1;
            this.f6284i0 = -1;
            this.f6286j0 = -1;
            this.f6288k0 = Integer.MIN_VALUE;
            this.f6290l0 = Integer.MIN_VALUE;
            this.f6292m0 = 0.5f;
            this.f6300q0 = new ConstraintWidget();
        }
    }
}
