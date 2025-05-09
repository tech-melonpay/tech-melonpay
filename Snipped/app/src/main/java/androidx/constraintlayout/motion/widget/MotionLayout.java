package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import e0.C0707a;
import e0.C0708b;
import e0.C0709c;
import f0.C0733a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import y0.n;

/* loaded from: classes.dex */
public final class MotionLayout extends ConstraintLayout implements n {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f6202u = 0;

    /* renamed from: a, reason: collision with root package name */
    public float f6203a;

    /* renamed from: b, reason: collision with root package name */
    public int f6204b;

    /* renamed from: c, reason: collision with root package name */
    public int f6205c;

    /* renamed from: d, reason: collision with root package name */
    public int f6206d;

    /* renamed from: e, reason: collision with root package name */
    public float f6207e;

    /* renamed from: f, reason: collision with root package name */
    public float f6208f;

    /* renamed from: g, reason: collision with root package name */
    public long f6209g;

    /* renamed from: h, reason: collision with root package name */
    public float f6210h;
    public c i;

    /* renamed from: j, reason: collision with root package name */
    public C0708b f6211j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6212k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList<C0709c> f6213l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList<C0709c> f6214m;

    /* renamed from: n, reason: collision with root package name */
    public CopyOnWriteArrayList<c> f6215n;

    /* renamed from: o, reason: collision with root package name */
    public int f6216o;

    /* renamed from: p, reason: collision with root package name */
    public float f6217p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6218q;

    /* renamed from: r, reason: collision with root package name */
    public b f6219r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6220s;

    /* renamed from: t, reason: collision with root package name */
    public TransitionState f6221t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TransitionState {

        /* renamed from: a, reason: collision with root package name */
        public static final TransitionState f6222a;

        /* renamed from: b, reason: collision with root package name */
        public static final TransitionState f6223b;

        /* renamed from: c, reason: collision with root package name */
        public static final TransitionState f6224c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ TransitionState[] f6225d;

        /* JADX INFO: Fake field, exist only in values array */
        TransitionState EF0;

        static {
            TransitionState transitionState = new TransitionState("UNDEFINED", 0);
            TransitionState transitionState2 = new TransitionState("SETUP", 1);
            f6222a = transitionState2;
            TransitionState transitionState3 = new TransitionState("MOVING", 2);
            f6223b = transitionState3;
            TransitionState transitionState4 = new TransitionState("FINISHED", 3);
            f6224c = transitionState4;
            f6225d = new TransitionState[]{transitionState, transitionState2, transitionState3, transitionState4};
        }

        public TransitionState() {
            throw null;
        }

        public static TransitionState valueOf(String str) {
            return (TransitionState) Enum.valueOf(TransitionState.class, str);
        }

        public static TransitionState[] values() {
            return (TransitionState[]) f6225d.clone();
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MotionLayout.this.f6219r.a();
        }
    }

    public class b {

        /* renamed from: a, reason: collision with root package name */
        public float f6227a = Float.NaN;

        /* renamed from: b, reason: collision with root package name */
        public float f6228b = Float.NaN;

        /* renamed from: c, reason: collision with root package name */
        public int f6229c = -1;

        /* renamed from: d, reason: collision with root package name */
        public int f6230d = -1;

        public b() {
        }

        public final void a() {
            int i = this.f6229c;
            MotionLayout motionLayout = MotionLayout.this;
            if (i != -1 || this.f6230d != -1) {
                if (i == -1) {
                    int i9 = this.f6230d;
                    if (motionLayout.isAttachedToWindow()) {
                        int i10 = motionLayout.f6205c;
                        if (i10 != i9 && motionLayout.f6204b != i9 && motionLayout.f6206d != i9) {
                            motionLayout.f6206d = i9;
                            if (i10 == -1) {
                                motionLayout.f6210h = 1.0f;
                                motionLayout.f6207e = 0.0f;
                                motionLayout.f6208f = 0.0f;
                                motionLayout.f6209g = motionLayout.getNanoTime();
                                motionLayout.getNanoTime();
                                throw null;
                            }
                            if (!motionLayout.isAttachedToWindow()) {
                                if (motionLayout.f6219r == null) {
                                    motionLayout.f6219r = motionLayout.new b();
                                }
                                b bVar = motionLayout.f6219r;
                                bVar.f6229c = i10;
                                bVar.f6230d = i9;
                            }
                            motionLayout.f6208f = 0.0f;
                        }
                    } else {
                        if (motionLayout.f6219r == null) {
                            motionLayout.f6219r = motionLayout.new b();
                        }
                        motionLayout.f6219r.f6230d = i9;
                    }
                } else {
                    int i11 = this.f6230d;
                    if (i11 == -1) {
                        motionLayout.d(i);
                    } else if (!motionLayout.isAttachedToWindow()) {
                        if (motionLayout.f6219r == null) {
                            motionLayout.f6219r = motionLayout.new b();
                        }
                        b bVar2 = motionLayout.f6219r;
                        bVar2.f6229c = i;
                        bVar2.f6230d = i11;
                    }
                }
                motionLayout.setState(TransitionState.f6222a);
            }
            if (Float.isNaN(this.f6228b)) {
                if (Float.isNaN(this.f6227a)) {
                    return;
                }
                motionLayout.setProgress(this.f6227a);
                return;
            }
            float f10 = this.f6227a;
            float f11 = this.f6228b;
            if (motionLayout.isAttachedToWindow()) {
                motionLayout.setProgress(f10);
                motionLayout.setState(TransitionState.f6223b);
                motionLayout.f6203a = f11;
            } else {
                if (motionLayout.f6219r == null) {
                    motionLayout.f6219r = motionLayout.new b();
                }
                b bVar3 = motionLayout.f6219r;
                bVar3.f6227a = f10;
                bVar3.f6228b = f11;
            }
            this.f6227a = Float.NaN;
            this.f6228b = Float.NaN;
            this.f6229c = -1;
            this.f6230d = -1;
        }
    }

    public interface c {
    }

    public final void a() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        CopyOnWriteArrayList<c> copyOnWriteArrayList2;
        if ((this.i == null && ((copyOnWriteArrayList2 = this.f6215n) == null || copyOnWriteArrayList2.isEmpty())) || this.f6217p == this.f6207e) {
            return;
        }
        if (this.f6216o != -1 && (copyOnWriteArrayList = this.f6215n) != null) {
            Iterator<c> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
        }
        this.f6216o = -1;
        this.f6217p = this.f6207e;
        CopyOnWriteArrayList<c> copyOnWriteArrayList3 = this.f6215n;
        if (copyOnWriteArrayList3 != null) {
            Iterator<c> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
            }
        }
    }

    public final void c() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if (!(this.i == null && ((copyOnWriteArrayList = this.f6215n) == null || copyOnWriteArrayList.isEmpty())) && this.f6216o == -1) {
            this.f6216o = this.f6205c;
            throw null;
        }
        if (this.i != null) {
            throw null;
        }
        CopyOnWriteArrayList<c> copyOnWriteArrayList2 = this.f6215n;
        if (copyOnWriteArrayList2 != null && !copyOnWriteArrayList2.isEmpty()) {
            throw null;
        }
    }

    public final void d(int i) {
        setState(TransitionState.f6222a);
        this.f6205c = i;
        this.f6204b = -1;
        this.f6206d = -1;
        C0733a c0733a = this.mConstraintLayoutSpec;
        if (c0733a != null) {
            float f10 = -1;
            int i9 = c0733a.f20576b;
            SparseArray<C0733a.C0396a> sparseArray = c0733a.f20578d;
            int i10 = 0;
            ConstraintLayout constraintLayout = c0733a.f20575a;
            if (i9 != i) {
                c0733a.f20576b = i;
                C0733a.C0396a c0396a = sparseArray.get(i);
                while (true) {
                    ArrayList<C0733a.b> arrayList = c0396a.f20581b;
                    if (i10 >= arrayList.size()) {
                        i10 = -1;
                        break;
                    } else if (arrayList.get(i10).a(f10, f10)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                ArrayList<C0733a.b> arrayList2 = c0396a.f20581b;
                androidx.constraintlayout.widget.b bVar = i10 == -1 ? c0396a.f20583d : arrayList2.get(i10).f20589f;
                if (i10 != -1) {
                    int i11 = arrayList2.get(i10).f20588e;
                }
                if (bVar == null) {
                    Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =-1.0, -1.0");
                    return;
                }
                c0733a.f20577c = i10;
                bVar.a(constraintLayout);
                constraintLayout.setConstraintSet(null);
                constraintLayout.requestLayout();
                return;
            }
            C0733a.C0396a valueAt = i == -1 ? sparseArray.valueAt(0) : sparseArray.get(i9);
            int i12 = c0733a.f20577c;
            if (i12 == -1 || !valueAt.f20581b.get(i12).a(f10, f10)) {
                while (true) {
                    ArrayList<C0733a.b> arrayList3 = valueAt.f20581b;
                    if (i10 >= arrayList3.size()) {
                        i10 = -1;
                        break;
                    } else if (arrayList3.get(i10).a(f10, f10)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (c0733a.f20577c == i10) {
                    return;
                }
                ArrayList<C0733a.b> arrayList4 = valueAt.f20581b;
                androidx.constraintlayout.widget.b bVar2 = i10 == -1 ? null : arrayList4.get(i10).f20589f;
                if (i10 != -1) {
                    int i13 = arrayList4.get(i10).f20588e;
                }
                if (bVar2 == null) {
                    return;
                }
                c0733a.f20577c = i10;
                bVar2.a(constraintLayout);
                constraintLayout.setConstraintSet(null);
                constraintLayout.requestLayout();
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int i;
        if (this.f6209g == -1) {
            this.f6209g = getNanoTime();
        }
        float f10 = this.f6208f;
        if (f10 > 0.0f && f10 < 1.0f) {
            this.f6205c = -1;
        }
        if (this.f6212k) {
            float signum = Math.signum(this.f6210h - f10);
            long nanoTime = getNanoTime();
            float f11 = (((nanoTime - this.f6209g) * signum) * 1.0E-9f) / 0.0f;
            float f12 = this.f6208f + f11;
            if ((signum > 0.0f && f12 >= this.f6210h) || (signum <= 0.0f && f12 <= this.f6210h)) {
                f12 = this.f6210h;
            }
            this.f6208f = f12;
            this.f6207e = f12;
            this.f6209g = nanoTime;
            this.f6203a = f11;
            if (Math.abs(f11) > 1.0E-5f) {
                setState(TransitionState.f6223b);
            }
            if ((signum > 0.0f && f12 >= this.f6210h) || (signum <= 0.0f && f12 <= this.f6210h)) {
                f12 = this.f6210h;
            }
            TransitionState transitionState = TransitionState.f6224c;
            if (f12 >= 1.0f || f12 <= 0.0f) {
                setState(transitionState);
            }
            int childCount = getChildCount();
            this.f6212k = false;
            getNanoTime();
            if (childCount > 0) {
                getChildAt(0);
                throw null;
            }
            boolean z11 = (signum > 0.0f && f12 >= this.f6210h) || (signum <= 0.0f && f12 <= this.f6210h);
            if (!this.f6212k && z11) {
                setState(transitionState);
            }
            boolean z12 = (!z11) | this.f6212k;
            this.f6212k = z12;
            if (f12 <= 0.0f && (i = this.f6204b) != -1 && this.f6205c != i) {
                this.f6205c = i;
                throw null;
            }
            if (f12 >= 1.0d) {
                int i9 = this.f6205c;
                int i10 = this.f6206d;
                if (i9 != i10) {
                    this.f6205c = i10;
                    throw null;
                }
            }
            if (z12) {
                invalidate();
            } else if ((signum > 0.0f && f12 == 1.0f) || (signum < 0.0f && f12 == 0.0f)) {
                setState(transitionState);
            }
            if (!this.f6212k && ((signum <= 0.0f || f12 != 1.0f) && signum < 0.0f)) {
                int i11 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
            }
        }
        float f13 = this.f6208f;
        if (f13 < 1.0f) {
            if (f13 <= 0.0f) {
                int i12 = this.f6205c;
                int i13 = this.f6204b;
                z10 = i12 != i13;
                this.f6205c = i13;
            }
            this.f6207e = this.f6208f;
            super.dispatchDraw(canvas);
        }
        int i14 = this.f6205c;
        int i15 = this.f6206d;
        z10 = i14 != i15;
        this.f6205c = i15;
        if (z10 && !this.f6218q) {
            super.requestLayout();
        }
        this.f6207e = this.f6208f;
        super.dispatchDraw(canvas);
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.f6205c;
    }

    public ArrayList<a.C0068a> getDefinedTransitions() {
        return null;
    }

    public C0708b getDesignTool() {
        if (this.f6211j == null) {
            this.f6211j = new C0708b();
        }
        return this.f6211j;
    }

    public int getEndState() {
        return this.f6206d;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f6208f;
    }

    public androidx.constraintlayout.motion.widget.a getScene() {
        return null;
    }

    public int getStartState() {
        return this.f6204b;
    }

    public float getTargetPosition() {
        return this.f6210h;
    }

    public Bundle getTransitionState() {
        if (this.f6219r == null) {
            this.f6219r = new b();
        }
        b bVar = this.f6219r;
        MotionLayout motionLayout = MotionLayout.this;
        bVar.f6230d = motionLayout.f6206d;
        bVar.f6229c = motionLayout.f6204b;
        bVar.f6228b = motionLayout.getVelocity();
        bVar.f6227a = motionLayout.getProgress();
        b bVar2 = this.f6219r;
        bVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", bVar2.f6227a);
        bundle.putFloat("motion.velocity", bVar2.f6228b);
        bundle.putInt("motion.StartState", bVar2.f6229c);
        bundle.putInt("motion.EndState", bVar2.f6230d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        return (long) 0.0f;
    }

    public float getVelocity() {
        return this.f6203a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        b bVar = this.f6219r;
        if (bVar != null) {
            if (this.f6220s) {
                post(new a());
            } else {
                bVar.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i9, int i10, int i11) {
        this.f6218q = true;
        try {
            super.onLayout(z10, i, i9, i10, i11);
        } finally {
            this.f6218q = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i9) {
        super.onMeasure(i, i9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // y0.m
    public final void onNestedScroll(View view, int i, int i9, int i10, int i11, int i12) {
    }

    @Override // y0.m
    public final void onNestedScrollAccepted(View view, View view2, int i, int i9) {
        getNanoTime();
    }

    @Override // y0.m
    public final boolean onStartNestedScroll(View view, View view2, int i, int i9) {
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof C0709c) {
            C0709c c0709c = (C0709c) view;
            if (this.f6215n == null) {
                this.f6215n = new CopyOnWriteArrayList<>();
            }
            this.f6215n.add(c0709c);
            if (c0709c.i) {
                if (this.f6213l == null) {
                    this.f6213l = new ArrayList<>();
                }
                this.f6213l.add(c0709c);
            }
            if (c0709c.f20496j) {
                if (this.f6214m == null) {
                    this.f6214m = new ArrayList<>();
                }
                this.f6214m.add(c0709c);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<C0709c> arrayList = this.f6213l;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<C0709c> arrayList2 = this.f6214m;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
    }

    public void setDebugMode(int i) {
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.f6220s = z10;
    }

    public void setInterpolatedProgress(float f10) {
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<C0709c> arrayList = this.f6214m;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f6214m.get(i).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<C0709c> arrayList = this.f6213l;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f6213l.get(i).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f6219r == null) {
                this.f6219r = new b();
            }
            this.f6219r.f6227a = f10;
            return;
        }
        TransitionState transitionState = TransitionState.f6224c;
        TransitionState transitionState2 = TransitionState.f6223b;
        if (f10 <= 0.0f) {
            if (this.f6208f == 1.0f && this.f6205c == this.f6206d) {
                setState(transitionState2);
            }
            this.f6205c = this.f6204b;
            if (this.f6208f == 0.0f) {
                setState(transitionState);
                return;
            }
            return;
        }
        if (f10 < 1.0f) {
            this.f6205c = -1;
            setState(transitionState2);
            return;
        }
        if (this.f6208f == 0.0f && this.f6205c == this.f6204b) {
            setState(transitionState2);
        }
        this.f6205c = this.f6206d;
        if (this.f6208f == 1.0f) {
            setState(transitionState);
        }
    }

    public void setScene(androidx.constraintlayout.motion.widget.a aVar) {
        isRtl();
        throw null;
    }

    public void setStartState(int i) {
        if (isAttachedToWindow()) {
            this.f6205c = i;
            return;
        }
        if (this.f6219r == null) {
            this.f6219r = new b();
        }
        b bVar = this.f6219r;
        bVar.f6229c = i;
        bVar.f6230d = i;
    }

    public void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.f6224c;
        if (transitionState == transitionState2 && this.f6205c == -1) {
            return;
        }
        TransitionState transitionState3 = this.f6221t;
        this.f6221t = transitionState;
        TransitionState transitionState4 = TransitionState.f6223b;
        if (transitionState3 == transitionState4 && transitionState == transitionState4) {
            a();
        }
        int ordinal = transitionState3.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 && transitionState == transitionState2) {
                c();
                return;
            }
            return;
        }
        if (transitionState == transitionState4) {
            a();
        }
        if (transitionState == transitionState2) {
            c();
        }
    }

    public void setTransition(int i) {
    }

    public void setTransitionDuration(int i) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(c cVar) {
        this.i = cVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f6219r == null) {
            this.f6219r = new b();
        }
        b bVar = this.f6219r;
        bVar.getClass();
        bVar.f6227a = bundle.getFloat("motion.progress");
        bVar.f6228b = bundle.getFloat("motion.velocity");
        bVar.f6229c = bundle.getInt("motion.StartState");
        bVar.f6230d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.f6219r.a();
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return C0707a.a(context, this.f6204b) + "->" + C0707a.a(context, this.f6206d) + " (pos:" + this.f6208f + " Dpos/Dt:" + this.f6203a;
    }

    @Override // y0.n
    public final void onNestedScroll(View view, int i, int i9, int i10, int i11, int i12, int[] iArr) {
        if (i == 0 && i9 == 0) {
            return;
        }
        iArr[0] = iArr[0] + i10;
        iArr[1] = iArr[1] + i11;
    }

    public void setTransition(a.C0068a c0068a) {
        throw null;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
    }

    public void setInteractionEnabled(boolean z10) {
    }

    @Override // y0.m
    public final void onStopNestedScroll(View view, int i) {
    }

    @Override // y0.m
    public final void onNestedPreScroll(View view, int i, int i9, int[] iArr, int i10) {
    }
}
