package com.sumsub.sns.core.widget;

import H0.b;
import O9.p;
import P9.m;
import P9.v;
import T2.i;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.GestureDetectorCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u2.C1514c;

@Metadata(d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012*\u0001C\u0018\u0000 Y2\u00020\u00012\u00020\u0002:\u0002YZB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0016\u001a\u00020\u00152\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001bJ\u0017\u0010\"\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0018H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0018H\u0016¢\u0006\u0004\b$\u0010\u001bJ1\u0010)\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010\u00182\u0006\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\fH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0018H\u0016¢\u0006\u0004\b+\u0010#J1\u0010.\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010\u00182\u0006\u0010&\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\fH\u0016¢\u0006\u0004\b.\u0010*R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00106R\u0016\u0010?\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00106R\u0016\u0010@\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00106R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR$\u0010J\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010P\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u00106\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010X\u001a\u00020\u00072\u0006\u0010U\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010R\"\u0004\bW\u0010T¨\u0006["}, d2 = {"Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView;", "Landroid/widget/LinearLayout;", "Landroid/view/GestureDetector$OnGestureListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "x", "", "performTapSelection", "(F)Z", "", "", FirebaseAnalytics.Param.ITEMS, "selectedIndex", "LO9/p;", "setItems", "(Ljava/util/List;I)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "e", "onDown", "onShowPress", "(Landroid/view/MotionEvent;)V", "onSingleTapUp", "e1", "e2", "distanceX", "distanceY", "onScroll", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "onLongPress", "velocityX", "velocityY", "onFling", "LT2/i;", "shapeAppearance", "LT2/i;", "LT2/f;", "selectedItemBackground", "LT2/f;", "textAppearance", "I", "Landroidx/core/view/GestureDetectorCompat;", "gestureDetector", "Landroidx/core/view/GestureDetectorCompat;", "selected", "F", "isScrolling", "Z", "saveCurrentSelected", "textColor", "selectedTextColor", "segments", "Ljava/util/List;", "com/sumsub/sns/core/widget/SNSSegmentedToggleView$selectedPropertyHolder$1", "selectedPropertyHolder", "Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$selectedPropertyHolder$1;", "LH0/e;", "animator", "LH0/e;", "Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$OnItemSelected;", "onItemSelected", "Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$OnItemSelected;", "getOnItemSelected", "()Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$OnItemSelected;", "setOnItemSelected", "(Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$OnItemSelected;)V", "itemPadding", "getItemPadding", "()I", "setItemPadding", "(I)V", "value", "getSelectedItem", "setSelectedItem", "selectedItem", "Companion", "OnItemSelected", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSSegmentedToggleView extends LinearLayout implements GestureDetector.OnGestureListener {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final int[] STATE_SELECTED = {R.attr.state_selected};
    private final H0.e animator;
    private final GestureDetectorCompat gestureDetector;
    private boolean isScrolling;
    private int itemPadding;
    private OnItemSelected onItemSelected;
    private int saveCurrentSelected;
    private List<String> segments;
    private float selected;
    private final T2.f selectedItemBackground;
    private final SNSSegmentedToggleView$selectedPropertyHolder$1 selectedPropertyHolder;
    private int selectedTextColor;
    private final i shapeAppearance;
    private int textAppearance;
    private int textColor;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$Companion;", "", "()V", "ANIMATION_MULTIPLIER", "", "STATE_SELECTED", "", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSSegmentedToggleView$OnItemSelected;", "", "", FirebaseAnalytics.Param.INDEX, "LO9/p;", "onSelected", "(I)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public interface OnItemSelected {
        void onSelected(int index);
    }

    public SNSSegmentedToggleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: animator$lambda-2$lambda-1, reason: not valid java name */
    public static final void m58animator$lambda2$lambda1(SNSSegmentedToggleView sNSSegmentedToggleView, H0.b bVar, boolean z10, float f10, float f11) {
        sNSSegmentedToggleView.performClick();
        OnItemSelected onItemSelected = sNSSegmentedToggleView.onItemSelected;
        if (onItemSelected != null) {
            onItemSelected.onSelected(sNSSegmentedToggleView.getSelectedItem());
        }
        v vVar = new v(sNSSegmentedToggleView, 4);
        int i = 0;
        while (vVar.hasNext()) {
            Object next = vVar.next();
            int i9 = i + 1;
            if (i < 0) {
                m.t();
                throw null;
            }
            View view = (View) next;
            TextView textView = view instanceof TextView ? (TextView) view : null;
            if (textView != null) {
                textView.setTextColor(i == sNSSegmentedToggleView.getSelectedItem() ? sNSSegmentedToggleView.selectedTextColor : sNSSegmentedToggleView.textColor);
            }
            i = i9;
        }
    }

    private final boolean performTapSelection(float x9) {
        v vVar = new v(this, 4);
        int i = 0;
        while (vVar.hasNext()) {
            Object next = vVar.next();
            int i9 = i + 1;
            if (i < 0) {
                m.t();
                throw null;
            }
            View view = (View) next;
            if (view.getLeft() < x9 && view.getRight() > x9 && getSelectedItem() != i) {
                this.animator.e(i * 1000.0f);
                return true;
            }
            i = i9;
        }
        return false;
    }

    public final int getItemPadding() {
        return this.itemPadding;
    }

    public final OnItemSelected getOnItemSelected() {
        return this.onItemSelected;
    }

    public final int getSelectedItem() {
        return (int) this.selected;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e10) {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        TextView textView;
        super.onDraw(canvas);
        if (getSelectedItem() <= -1 || getSelectedItem() >= getChildCount()) {
            return;
        }
        int i = (int) this.selected;
        Integer valueOf = Integer.valueOf(i);
        if (i >= getChildCount()) {
            valueOf = null;
        }
        View childAt = valueOf != null ? getChildAt(valueOf.intValue()) : null;
        int ceil = (int) Math.ceil(this.selected);
        Integer valueOf2 = Integer.valueOf(ceil);
        if (ceil >= getChildCount()) {
            valueOf2 = null;
        }
        View childAt2 = valueOf2 != null ? getChildAt(valueOf2.intValue()) : null;
        float f10 = this.selected % 1;
        if (childAt == null || childAt2 == null || kotlin.jvm.internal.f.b(childAt, childAt2)) {
            textView = childAt instanceof TextView ? (TextView) childAt : null;
            if (textView != null) {
                textView.setTextColor(this.selectedTextColor);
            }
            int i9 = 0;
            int left = childAt != null ? childAt.getLeft() : childAt2 != null ? childAt2.getLeft() : 0;
            if (childAt != null) {
                i9 = childAt.getRight();
            } else if (childAt2 != null) {
                i9 = childAt2.getRight();
            }
            this.selectedItemBackground.setBounds(left, getPaddingTop(), i9, getHeight() - getPaddingBottom());
        } else {
            this.selectedItemBackground.setBounds((int) (((childAt2.getLeft() - childAt.getLeft()) * f10) + childAt.getLeft()), getPaddingTop(), (int) (((childAt2.getRight() - childAt.getRight()) * f10) + childAt.getRight()), getHeight() - getPaddingBottom());
            TextView textView2 = childAt instanceof TextView ? (TextView) childAt : null;
            if (textView2 != null) {
                textView2.setTextColor(C1514c.a(f10, Integer.valueOf(this.selectedTextColor), Integer.valueOf(this.textColor)).intValue());
            }
            textView = childAt2 instanceof TextView ? (TextView) childAt2 : null;
            if (textView != null) {
                textView.setTextColor(C1514c.a(f10, Integer.valueOf(this.textColor), Integer.valueOf(this.selectedTextColor)).intValue());
            }
        }
        canvas.save();
        this.selectedItemBackground.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent e12, MotionEvent e22, float velocityX, float velocityY) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent e12, MotionEvent e22, float distanceX, float distanceY) {
        View childAt;
        if (!this.isScrolling) {
            this.saveCurrentSelected = getSelectedItem();
            this.isScrolling = true;
        }
        if (e12 == null) {
            return false;
        }
        float x9 = e22.getX() - e12.getX();
        int i = this.saveCurrentSelected;
        if (i == 0 && x9 < 0.0f) {
            return false;
        }
        if ((i == getChildCount() - 1 && x9 > 0.0f) || (childAt = getChildAt(this.saveCurrentSelected)) == null || e12.getX() < childAt.getLeft() || e12.getX() > childAt.getRight()) {
            return false;
        }
        this.selected = ha.h.R(this.saveCurrentSelected + ((x9 / ((getWidth() - getPaddingStart()) - getPaddingEnd())) * getChildCount()), 0.0f, getChildCount() - 1);
        postInvalidateOnAnimation();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e10) {
        return performTapSelection(e10.getX());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == 1 && this.isScrolling) {
            this.isScrolling = false;
            this.selected = U4.b.C(this.selected);
            this.animator.e(getSelectedItem() * 1000.0f);
            ViewParent parent = getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.requestDisallowInterceptTouchEvent(false);
            }
        }
        if (this.gestureDetector.f6499a.onTouchEvent(event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    public final void setItemPadding(int i) {
        this.itemPadding = i;
    }

    public final void setItems(List<String> items, int selectedIndex) {
        if (items.equals(this.segments)) {
            return;
        }
        removeAllViews();
        ViewGroup.LayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        setGravity(16);
        int i = 0;
        for (Object obj : items) {
            int i9 = i + 1;
            if (i < 0) {
                m.t();
                throw null;
            }
            SNSTextView sNSTextView = new SNSTextView(getContext(), null, 0, 0, null, null, 62, null);
            sNSTextView.setText((String) obj);
            sNSTextView.setTextAppearance(this.textAppearance);
            sNSTextView.setTextColor(this.textColor);
            int i10 = this.itemPadding;
            sNSTextView.setPadding(i10, 0, i10, 0);
            addView(sNSTextView, marginLayoutParams);
            i = i9;
        }
        this.animator.f1396g = m.p(items) * 1000.0f;
        this.selected = selectedIndex;
    }

    public final void setOnItemSelected(OnItemSelected onItemSelected) {
        this.onItemSelected = onItemSelected;
    }

    public final void setSelectedItem(int i) {
        if (i == ((int) this.selected) || i < 0 || i >= getChildCount()) {
            return;
        }
        this.animator.e(i * 1000.0f);
    }

    public /* synthetic */ SNSSegmentedToggleView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_SNSSegmentedToggleViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSSegmentedToggleView : i9);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [H0.c, com.sumsub.sns.core.widget.SNSSegmentedToggleView$selectedPropertyHolder$1] */
    public SNSSegmentedToggleView(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i, i9);
        Float a10;
        i a11 = i.b(context, attributeSet, i, i9).a();
        this.shapeAppearance = a11;
        T2.f fVar = new T2.f(a11);
        this.selectedItemBackground = fVar;
        this.textAppearance = -1;
        this.textColor = -1;
        this.selectedTextColor = -16776961;
        ?? r42 = new H0.c<SNSSegmentedToggleView>() { // from class: com.sumsub.sns.core.widget.SNSSegmentedToggleView$selectedPropertyHolder$1
            {
                super("selectedItem");
            }

            @Override // H0.c
            public float getValue(SNSSegmentedToggleView view) {
                float f10;
                f10 = SNSSegmentedToggleView.this.selected;
                return f10 * 1000.0f;
            }

            @Override // H0.c
            public void setValue(SNSSegmentedToggleView view, float value) {
                SNSSegmentedToggleView.this.selected = value / 1000.0f;
                SNSSegmentedToggleView.this.postInvalidateOnAnimation();
            }
        };
        this.selectedPropertyHolder = r42;
        H0.e eVar = new H0.e(this, r42, 0.0f);
        eVar.f1405s.a(1.0f);
        eVar.f1405s.b(1500.0f);
        eVar.f1397h = 0.0f;
        f fVar2 = new f(this, 2);
        ArrayList<b.q> arrayList = eVar.f1399k;
        if (!arrayList.contains(fVar2)) {
            arrayList.add(fVar2);
        }
        this.animator = eVar;
        setOrientation(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSSegmentedToggleView, i, i9);
        T2.f fVar3 = new T2.f(a11);
        fVar3.s(obtainStyledAttributes.getDimension(R$styleable.SNSSegmentedToggleView_boxStrokeWidth, com.sumsub.sns.core.common.b.a(1)));
        fVar3.r(obtainStyledAttributes.getColorStateList(R$styleable.SNSSegmentedToggleView_boxStrokeColor));
        fVar3.o(obtainStyledAttributes.getColorStateList(R$styleable.SNSSegmentedToggleView_boxBackgroundColor));
        setBackground(fVar3);
        fVar.o(obtainStyledAttributes.getColorStateList(R$styleable.SNSSegmentedToggleView_sns_itemBackgroundColor));
        this.itemPadding = obtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSSegmentedToggleView_sns_itemPadding, 0);
        this.textAppearance = obtainStyledAttributes.getResourceId(R$styleable.SNSSegmentedToggleView_android_textAppearance, -1);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(R$styleable.SNSSegmentedToggleView_sns_textColor);
        int defaultColor = colorStateList != null ? colorStateList.getDefaultColor() : -1;
        this.textColor = defaultColor;
        this.selectedTextColor = colorStateList != null ? colorStateList.getColorForState(STATE_SELECTED, defaultColor) : -16776961;
        p pVar = p.f3034a;
        obtainStyledAttributes.recycle();
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        Integer a12 = aVar.a(this, SNSColorElement.CAMERA_CONTENT);
        if (a12 != null) {
            int intValue = a12.intValue();
            this.textColor = intValue;
            fVar.o(ColorStateList.valueOf(intValue));
        }
        Integer a13 = aVar.a(this, SNSColorElement.CONTENT_LINK);
        if (a13 != null) {
            this.selectedTextColor = a13.intValue();
        }
        Integer a14 = aVar.a(this, SNSColorElement.CAMERA_BACKGROUND_OVERLAY);
        if (a14 != null) {
            int intValue2 = a14.intValue();
            Drawable background = getBackground();
            T2.f fVar4 = background instanceof T2.f ? (T2.f) background : null;
            if (fVar4 != null) {
                fVar4.o(ColorStateList.valueOf(intValue2));
            }
        }
        com.sumsub.sns.internal.core.theme.d a15 = aVar.a();
        if (a15 != null && (a10 = aVar.a(a15, SNSMetricElement.SEGMENTED_CONTROL_CORNER_RADIUS)) != null) {
            float floatValue = a10.floatValue();
            Drawable background2 = getBackground();
            T2.f fVar5 = background2 instanceof T2.f ? (T2.f) background2 : null;
            if (fVar5 != null) {
                fVar5.m(floatValue);
            }
            fVar.m(floatValue);
        }
        this.gestureDetector = new GestureDetectorCompat(context, this);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent e10) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent e10) {
    }
}
