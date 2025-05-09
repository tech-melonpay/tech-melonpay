package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import java.util.Objects;
import m.C0997G;
import m.C1002d;
import m.C1015q;
import m.K;
import m.V;
import m.e0;

/* loaded from: classes.dex */
public final class AppCompatSpinner extends Spinner {

    @SuppressLint({"ResourceType"})
    public static final int[] i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C1002d f4935a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4936b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.appcompat.widget.a f4937c;

    /* renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f4938d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4939e;

    /* renamed from: f, reason: collision with root package name */
    public final f f4940f;

    /* renamed from: g, reason: collision with root package name */
    public int f4941g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f4942h;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public boolean f4943a;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.f4943a = parcel.readByte() != 0;
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f4943a ? (byte) 1 : (byte) 0);
        }
    }

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (!appCompatSpinner.getInternalPopup().b()) {
                appCompatSpinner.f4940f.n(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
            }
            ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    public static final class b {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    public class c implements f, DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public androidx.appcompat.app.b f4945a;

        /* renamed from: b, reason: collision with root package name */
        public ListAdapter f4946b;

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f4947c;

        public c() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final boolean b() {
            androidx.appcompat.app.b bVar = this.f4945a;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final int c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final void dismiss() {
            androidx.appcompat.app.b bVar = this.f4945a;
            if (bVar != null) {
                bVar.dismiss();
                this.f4945a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final void e(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final CharSequence f() {
            return this.f4947c;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final Drawable h() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final void i(CharSequence charSequence) {
            this.f4947c = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final void k(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final void l(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final void m(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final void n(int i, int i9) {
            if (this.f4946b == null) {
                return;
            }
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            b.a aVar = new b.a(appCompatSpinner.getPopupContext());
            CharSequence charSequence = this.f4947c;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            androidx.appcompat.app.b create = aVar.setSingleChoiceItems(this.f4946b, appCompatSpinner.getSelectedItemPosition(), this).create();
            this.f4945a = create;
            AlertController.RecycleListView recycleListView = create.f4657f.f4611g;
            recycleListView.setTextDirection(i);
            recycleListView.setTextAlignment(i9);
            this.f4945a.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final int o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            appCompatSpinner.setSelection(i);
            if (appCompatSpinner.getOnItemClickListener() != null) {
                appCompatSpinner.performItemClick(null, i, this.f4946b.getItemId(i));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final void p(ListAdapter listAdapter) {
            this.f4946b = listAdapter;
        }
    }

    public static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public SpinnerAdapter f4949a;

        /* renamed from: b, reason: collision with root package name */
        public ListAdapter f4950b;

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f4950b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f4949a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f4949a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f4949a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f4949a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f4949a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f4950b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f4949a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f4949a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public class e extends K implements f {

        /* renamed from: C, reason: collision with root package name */
        public CharSequence f4951C;

        /* renamed from: D, reason: collision with root package name */
        public ListAdapter f4952D;

        /* renamed from: E, reason: collision with root package name */
        public final Rect f4953E;

        /* renamed from: F, reason: collision with root package name */
        public int f4954F;

        public class a implements AdapterView.OnItemClickListener {
            public a() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j10) {
                e eVar = e.this;
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    AppCompatSpinner.this.performItemClick(view, i, eVar.f4952D.getItemId(i));
                }
                eVar.dismiss();
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                e eVar = e.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                eVar.getClass();
                if (!appCompatSpinner.isAttachedToWindow() || !appCompatSpinner.getGlobalVisibleRect(eVar.f4953E)) {
                    eVar.dismiss();
                } else {
                    eVar.s();
                    eVar.a();
                }
            }
        }

        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f4958a;

            public c(b bVar) {
                this.f4958a = bVar;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f4958a);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i, 0);
            this.f4953E = new Rect();
            this.f23655o = AppCompatSpinner.this;
            this.f23665y = true;
            this.f23666z.setFocusable(true);
            this.f23656p = new a();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final CharSequence f() {
            return this.f4951C;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final void i(CharSequence charSequence) {
            this.f4951C = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final void m(int i) {
            this.f4954F = i;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.f
        public final void n(int i, int i9) {
            ViewTreeObserver viewTreeObserver;
            C1015q c1015q = this.f23666z;
            boolean isShowing = c1015q.isShowing();
            s();
            this.f23666z.setInputMethodMode(2);
            a();
            C0997G c0997g = this.f23644c;
            c0997g.setChoiceMode(1);
            c0997g.setTextDirection(i);
            c0997g.setTextAlignment(i9);
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
            C0997G c0997g2 = this.f23644c;
            if (c1015q.isShowing() && c0997g2 != null) {
                c0997g2.setListSelectionHidden(false);
                c0997g2.setSelection(selectedItemPosition);
                if (c0997g2.getChoiceMode() != 0) {
                    c0997g2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (isShowing || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            this.f23666z.setOnDismissListener(new c(bVar));
        }

        @Override // m.K, androidx.appcompat.widget.AppCompatSpinner.f
        public final void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.f4952D = listAdapter;
        }

        public final void s() {
            int i;
            C1015q c1015q = this.f23666z;
            Drawable background = c1015q.getBackground();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (background != null) {
                background.getPadding(appCompatSpinner.f4942h);
                boolean z10 = e0.f23753a;
                int layoutDirection = appCompatSpinner.getLayoutDirection();
                Rect rect = appCompatSpinner.f4942h;
                i = layoutDirection == 1 ? rect.right : -rect.left;
            } else {
                Rect rect2 = appCompatSpinner.f4942h;
                rect2.right = 0;
                rect2.left = 0;
                i = 0;
            }
            int paddingLeft = appCompatSpinner.getPaddingLeft();
            int paddingRight = appCompatSpinner.getPaddingRight();
            int width = appCompatSpinner.getWidth();
            int i9 = appCompatSpinner.f4941g;
            if (i9 == -2) {
                int a10 = appCompatSpinner.a((SpinnerAdapter) this.f4952D, c1015q.getBackground());
                int i10 = appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = appCompatSpinner.f4942h;
                int i11 = (i10 - rect3.left) - rect3.right;
                if (a10 > i11) {
                    a10 = i11;
                }
                r(Math.max(a10, (width - paddingLeft) - paddingRight));
            } else if (i9 == -1) {
                r((width - paddingLeft) - paddingRight);
            } else {
                r(i9);
            }
            boolean z11 = e0.f23753a;
            this.f23647f = appCompatSpinner.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f23646e) - this.f4954F) + i : paddingLeft + this.f4954F + i;
        }
    }

    public interface f {
        boolean b();

        int c();

        void dismiss();

        void e(int i);

        CharSequence f();

        Drawable h();

        void i(CharSequence charSequence);

        void k(Drawable drawable);

        void l(int i);

        void m(int i);

        void n(int i, int i9);

        int o();

        void p(ListAdapter listAdapter);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        if (r6 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatSpinner(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            r11.<init>(r12, r13, r14)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r11.f4942h = r0
            android.content.Context r0 = r11.getContext()
            m.U.a(r11, r0)
            int[] r0 = g.C0756a.f20749v
            r1 = 0
            m.Z r2 = m.Z.f(r12, r13, r0, r14, r1)
            m.d r3 = new m.d
            r3.<init>(r11)
            r11.f4935a = r3
            r3 = 4
            android.content.res.TypedArray r4 = r2.f23728b
            int r3 = r4.getResourceId(r3, r1)
            if (r3 == 0) goto L30
            k.c r5 = new k.c
            r5.<init>(r12, r3)
            r11.f4936b = r5
            goto L32
        L30:
            r11.f4936b = r12
        L32:
            r3 = -1
            r5 = 0
            int[] r6 = androidx.appcompat.widget.AppCompatSpinner.i     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            android.content.res.TypedArray r6 = r12.obtainStyledAttributes(r13, r6, r14, r1)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            boolean r7 = r6.hasValue(r1)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L49
            if (r7 == 0) goto L4b
            int r3 = r6.getInt(r1, r1)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L49
            goto L4b
        L45:
            r12 = move-exception
            r5 = r6
            goto Lce
        L49:
            r7 = move-exception
            goto L54
        L4b:
            r6.recycle()
            goto L5e
        L4f:
            r12 = move-exception
            goto Lce
        L52:
            r7 = move-exception
            r6 = r5
        L54:
            java.lang.String r8 = "AppCompatSpinner"
            java.lang.String r9 = "Could not read android:spinnerMode"
            android.util.Log.i(r8, r9, r7)     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L5e
            goto L4b
        L5e:
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L96
            if (r3 == r7) goto L65
            goto La3
        L65:
            androidx.appcompat.widget.AppCompatSpinner$e r3 = new androidx.appcompat.widget.AppCompatSpinner$e
            android.content.Context r8 = r11.f4936b
            r3.<init>(r8, r13, r14)
            android.content.Context r8 = r11.f4936b
            m.Z r0 = m.Z.f(r8, r13, r0, r14, r1)
            android.content.res.TypedArray r8 = r0.f23728b
            r9 = 3
            r10 = -2
            int r8 = r8.getLayoutDimension(r9, r10)
            r11.f4941g = r8
            android.graphics.drawable.Drawable r8 = r0.b(r7)
            r3.k(r8)
            java.lang.String r6 = r4.getString(r6)
            r3.f4951C = r6
            r0.g()
            r11.f4940f = r3
            androidx.appcompat.widget.a r0 = new androidx.appcompat.widget.a
            r0.<init>(r11, r11, r3)
            r11.f4937c = r0
            goto La3
        L96:
            androidx.appcompat.widget.AppCompatSpinner$c r0 = new androidx.appcompat.widget.AppCompatSpinner$c
            r0.<init>()
            r11.f4940f = r0
            java.lang.String r3 = r4.getString(r6)
            r0.f4947c = r3
        La3:
            java.lang.CharSequence[] r0 = r4.getTextArray(r1)
            if (r0 == 0) goto Lba
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r12, r3, r0)
            r12 = 2131558852(0x7f0d01c4, float:1.8743032E38)
            r1.setDropDownViewResource(r12)
            r11.setAdapter(r1)
        Lba:
            r2.g()
            r11.f4939e = r7
            android.widget.SpinnerAdapter r12 = r11.f4938d
            if (r12 == 0) goto Lc8
            r11.setAdapter(r12)
            r11.f4938d = r5
        Lc8:
            m.d r12 = r11.f4935a
            r12.d(r13, r14)
            return
        Lce:
            if (r5 == 0) goto Ld3
            r5.recycle()
        Ld3:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i9 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i10 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i10 = Math.max(i10, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i10;
        }
        Rect rect = this.f4942h;
        drawable.getPadding(rect);
        return i10 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1002d c1002d = this.f4935a;
        if (c1002d != null) {
            c1002d.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        f fVar = this.f4940f;
        return fVar != null ? fVar.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        f fVar = this.f4940f;
        return fVar != null ? fVar.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f4940f != null ? this.f4941g : super.getDropDownWidth();
    }

    public final f getInternalPopup() {
        return this.f4940f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        f fVar = this.f4940f;
        return fVar != null ? fVar.h() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f4936b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        f fVar = this.f4940f;
        return fVar != null ? fVar.f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1002d c1002d = this.f4935a;
        if (c1002d != null) {
            return c1002d.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1002d c1002d = this.f4935a;
        if (c1002d != null) {
            return c1002d.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.f4940f;
        if (fVar == null || !fVar.b()) {
            return;
        }
        fVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (this.f4940f == null || View.MeasureSpec.getMode(i9) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i9)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f4943a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        f fVar = this.f4940f;
        savedState.f4943a = fVar != null && fVar.b();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        androidx.appcompat.widget.a aVar = this.f4937c;
        if (aVar == null || !aVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        f fVar = this.f4940f;
        if (fVar == null) {
            return super.performClick();
        }
        if (fVar.b()) {
            return true;
        }
        this.f4940f.n(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1002d c1002d = this.f4935a;
        if (c1002d != null) {
            c1002d.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        C1002d c1002d = this.f4935a;
        if (c1002d != null) {
            c1002d.f(i9);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i9) {
        f fVar = this.f4940f;
        if (fVar == null) {
            super.setDropDownHorizontalOffset(i9);
        } else {
            fVar.m(i9);
            fVar.e(i9);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i9) {
        f fVar = this.f4940f;
        if (fVar != null) {
            fVar.l(i9);
        } else {
            super.setDropDownVerticalOffset(i9);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i9) {
        if (this.f4940f != null) {
            this.f4941g = i9;
        } else {
            super.setDropDownWidth(i9);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        f fVar = this.f4940f;
        if (fVar != null) {
            fVar.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i9) {
        setPopupBackgroundDrawable(U4.b.j(getPopupContext(), i9));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        f fVar = this.f4940f;
        if (fVar != null) {
            fVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1002d c1002d = this.f4935a;
        if (c1002d != null) {
            c1002d.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1002d c1002d = this.f4935a;
        if (c1002d != null) {
            c1002d.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f4939e) {
            this.f4938d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        f fVar = this.f4940f;
        if (fVar != null) {
            Context context = this.f4936b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            d dVar = new d();
            dVar.f4949a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                dVar.f4950b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    b.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof V) {
                    V v10 = (V) spinnerAdapter;
                    if (v10.getDropDownViewTheme() == null) {
                        v10.a();
                    }
                }
            }
            fVar.p(dVar);
        }
    }
}
