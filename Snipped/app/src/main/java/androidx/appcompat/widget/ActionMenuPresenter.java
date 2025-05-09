package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import com.luminary.mobile.R;
import java.util.ArrayList;
import l.AbstractC0974d;
import m.I;
import m.c0;
import y0.AbstractC1598b;

/* loaded from: classes.dex */
public final class ActionMenuPresenter extends androidx.appcompat.view.menu.a {

    /* renamed from: j, reason: collision with root package name */
    public d f4890j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f4891k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4892l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4893m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4894n;

    /* renamed from: o, reason: collision with root package name */
    public int f4895o;

    /* renamed from: p, reason: collision with root package name */
    public int f4896p;

    /* renamed from: q, reason: collision with root package name */
    public int f4897q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4898r;

    /* renamed from: s, reason: collision with root package name */
    public final SparseBooleanArray f4899s;

    /* renamed from: t, reason: collision with root package name */
    public e f4900t;

    /* renamed from: u, reason: collision with root package name */
    public a f4901u;

    /* renamed from: v, reason: collision with root package name */
    public c f4902v;

    /* renamed from: w, reason: collision with root package name */
    public b f4903w;

    /* renamed from: x, reason: collision with root package name */
    public final f f4904x;

    /* renamed from: y, reason: collision with root package name */
    public int f4905y;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f4906a;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.f4906a = parcel.readInt();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4906a);
        }
    }

    public class a extends i {
        public a(Context context, m mVar, View view) {
            super(R.attr.actionOverflowMenuStyle, 0, context, view, mVar, false);
            if (!mVar.f4834A.f()) {
                View view2 = ActionMenuPresenter.this.f4890j;
                this.f4806f = view2 == null ? (View) ActionMenuPresenter.this.f4695h : view2;
            }
            f fVar = ActionMenuPresenter.this.f4904x;
            this.i = fVar;
            AbstractC0974d abstractC0974d = this.f4809j;
            if (abstractC0974d != null) {
                abstractC0974d.f(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f4901u = null;
            actionMenuPresenter.f4905y = 0;
            super.c();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final e f4909a;

        public c(e eVar) {
            this.f4909a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f.a aVar;
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            androidx.appcompat.view.menu.f fVar = actionMenuPresenter.f4690c;
            if (fVar != null && (aVar = fVar.f4750e) != null) {
                aVar.b(fVar);
            }
            View view = (View) actionMenuPresenter.f4695h;
            if (view != null && view.getWindowToken() != null) {
                e eVar = this.f4909a;
                if (!eVar.b()) {
                    if (eVar.f4806f != null) {
                        eVar.d(0, 0, false, false);
                    }
                }
                actionMenuPresenter.f4900t = eVar;
            }
            actionMenuPresenter.f4902v = null;
        }
    }

    public class d extends AppCompatImageView implements ActionMenuView.a {

        public class a extends I {
            public a(View view) {
                super(view);
            }

            @Override // m.I
            public final l.f b() {
                e eVar = ActionMenuPresenter.this.f4900t;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // m.I
            public final boolean c() {
                ActionMenuPresenter.this.n();
                return true;
            }

            @Override // m.I
            public final boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f4902v != null) {
                    return false;
                }
                actionMenuPresenter.b();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            c0.a(this, getContentDescription());
            setOnTouchListener(new a(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean b() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.n();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i, int i9, int i10, int i11) {
            boolean frame = super.setFrame(i, i9, i10, i11);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public class e extends i {
        public e(Context context, androidx.appcompat.view.menu.f fVar, d dVar) {
            super(R.attr.actionOverflowMenuStyle, 0, context, dVar, fVar, true);
            this.f4807g = 8388613;
            f fVar2 = ActionMenuPresenter.this.f4904x;
            this.i = fVar2;
            AbstractC0974d abstractC0974d = this.f4809j;
            if (abstractC0974d != null) {
                abstractC0974d.f(fVar2);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            androidx.appcompat.view.menu.f fVar = actionMenuPresenter.f4690c;
            if (fVar != null) {
                fVar.c(true);
            }
            actionMenuPresenter.f4900t = null;
            super.c();
        }
    }

    public class f implements j.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            if (fVar instanceof m) {
                ((m) fVar).f4835z.k().c(false);
            }
            j.a aVar = ActionMenuPresenter.this.f4692e;
            if (aVar != null) {
                aVar.c(fVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (fVar == actionMenuPresenter.f4690c) {
                return false;
            }
            actionMenuPresenter.f4905y = ((m) fVar).f4834A.f4775a;
            j.a aVar = actionMenuPresenter.f4692e;
            if (aVar != null) {
                return aVar.d(fVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        this.f4688a = context;
        this.f4691d = LayoutInflater.from(context);
        this.f4693f = R.layout.abc_action_menu_layout;
        this.f4694g = R.layout.abc_action_menu_item_layout;
        this.f4899s = new SparseBooleanArray();
        this.f4904x = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.appcompat.view.menu.k$a] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(h hVar, View view, ViewGroup viewGroup) {
        View actionView = hVar.getActionView();
        if (actionView == null || hVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof k.a ? (k.a) view : (k.a) this.f4691d.inflate(this.f4694g, viewGroup, false);
            actionMenuItemView.d(hVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f4695h);
            if (this.f4903w == null) {
                this.f4903w = new b();
            }
            actionMenuItemView2.setPopupCallback(this.f4903w);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(hVar.f4774C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof ActionMenuView.c)) {
            actionView.setLayoutParams(ActionMenuView.m(layoutParams));
        }
        return actionView;
    }

    public final boolean b() {
        Object obj;
        c cVar = this.f4902v;
        if (cVar != null && (obj = this.f4695h) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f4902v = null;
            return true;
        }
        e eVar = this.f4900t;
        if (eVar == null) {
            return false;
        }
        if (eVar.b()) {
            eVar.f4809j.dismiss();
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
        b();
        a aVar = this.f4901u;
        if (aVar != null && aVar.b()) {
            aVar.f4809j.dismiss();
        }
        j.a aVar2 = this.f4692e;
        if (aVar2 != null) {
            aVar2.c(fVar, z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z10) {
        int size;
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f4695h;
        ArrayList<h> arrayList = null;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.f fVar = this.f4690c;
            if (fVar != null) {
                fVar.i();
                ArrayList<h> l10 = this.f4690c.l();
                int size2 = l10.size();
                i = 0;
                for (int i9 = 0; i9 < size2; i9++) {
                    h hVar = l10.get(i9);
                    if (hVar.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        h itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                        View a10 = a(hVar, childAt, viewGroup);
                        if (hVar != itemData) {
                            a10.setPressed(false);
                            a10.jumpDrawablesToCurrentState();
                        }
                        if (a10 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a10.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a10);
                            }
                            ((ViewGroup) this.f4695h).addView(a10, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f4890j) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f4695h).requestLayout();
        androidx.appcompat.view.menu.f fVar2 = this.f4690c;
        if (fVar2 != null) {
            fVar2.i();
            ArrayList<h> arrayList2 = fVar2.i;
            int size3 = arrayList2.size();
            for (int i10 = 0; i10 < size3; i10++) {
                AbstractC1598b abstractC1598b = arrayList2.get(i10).f4772A;
            }
        }
        androidx.appcompat.view.menu.f fVar3 = this.f4690c;
        if (fVar3 != null) {
            fVar3.i();
            arrayList = fVar3.f4754j;
        }
        if (!this.f4893m || arrayList == null || ((size = arrayList.size()) != 1 ? size <= 0 : !(!arrayList.get(0).f4774C))) {
            d dVar = this.f4890j;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f4695h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f4890j);
                }
            }
        } else {
            if (this.f4890j == null) {
                this.f4890j = new d(this.f4688a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f4890j.getParent();
            if (viewGroup3 != this.f4695h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f4890j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f4695h;
                d dVar2 = this.f4890j;
                actionMenuView.getClass();
                ActionMenuView.c l11 = ActionMenuView.l();
                l11.f4927a = true;
                actionMenuView.addView(dVar2, l11);
            }
        }
        ((ActionMenuView) this.f4695h).setOverflowReserved(this.f4893m);
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        int i;
        ArrayList<h> arrayList;
        int i9;
        boolean z10;
        androidx.appcompat.view.menu.f fVar = this.f4690c;
        if (fVar != null) {
            arrayList = fVar.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i10 = this.f4897q;
        int i11 = this.f4896p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f4695h;
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i9 = 2;
            z10 = true;
            if (i12 >= i) {
                break;
            }
            h hVar = arrayList.get(i12);
            int i15 = hVar.f4798y;
            if ((i15 & 2) == 2) {
                i13++;
            } else if ((i15 & 1) == 1) {
                i14++;
            } else {
                z11 = true;
            }
            if (this.f4898r && hVar.f4774C) {
                i10 = 0;
            }
            i12++;
        }
        if (this.f4893m && (z11 || i14 + i13 > i10)) {
            i10--;
        }
        int i16 = i10 - i13;
        SparseBooleanArray sparseBooleanArray = this.f4899s;
        sparseBooleanArray.clear();
        int i17 = 0;
        int i18 = 0;
        while (i17 < i) {
            h hVar2 = arrayList.get(i17);
            int i19 = hVar2.f4798y;
            boolean z12 = (i19 & 2) == i9 ? z10 : false;
            int i20 = hVar2.f4776b;
            if (z12) {
                View a10 = a(hVar2, null, viewGroup);
                a10.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a10.getMeasuredWidth();
                i11 -= measuredWidth;
                if (i18 == 0) {
                    i18 = measuredWidth;
                }
                if (i20 != 0) {
                    sparseBooleanArray.put(i20, z10);
                }
                hVar2.h(z10);
            } else if ((i19 & 1) == z10) {
                boolean z13 = sparseBooleanArray.get(i20);
                boolean z14 = ((i16 > 0 || z13) && i11 > 0) ? z10 : false;
                if (z14) {
                    View a11 = a(hVar2, null, viewGroup);
                    a11.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a11.getMeasuredWidth();
                    i11 -= measuredWidth2;
                    if (i18 == 0) {
                        i18 = measuredWidth2;
                    }
                    z14 &= i11 + i18 > 0;
                }
                if (z14 && i20 != 0) {
                    sparseBooleanArray.put(i20, true);
                } else if (z13) {
                    sparseBooleanArray.put(i20, false);
                    for (int i21 = 0; i21 < i17; i21++) {
                        h hVar3 = arrayList.get(i21);
                        if (hVar3.f4776b == i20) {
                            if (hVar3.f()) {
                                i16++;
                            }
                            hVar3.h(false);
                        }
                    }
                }
                if (z14) {
                    i16--;
                }
                hVar2.h(z14);
            } else {
                hVar2.h(false);
                i17++;
                i9 = 2;
                z10 = true;
            }
            i17++;
            i9 = 2;
            z10 = true;
        }
        return z10;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(Context context, androidx.appcompat.view.menu.f fVar) {
        this.f4689b = context;
        LayoutInflater.from(context);
        this.f4690c = fVar;
        Resources resources = context.getResources();
        if (!this.f4894n) {
            this.f4893m = true;
        }
        int i = 2;
        this.f4895o = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i9 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i9 > 600 || ((i9 > 960 && i10 > 720) || (i9 > 720 && i10 > 960))) {
            i = 5;
        } else if (i9 >= 500 || ((i9 > 640 && i10 > 480) || (i9 > 480 && i10 > 640))) {
            i = 4;
        } else if (i9 >= 360) {
            i = 3;
        }
        this.f4897q = i;
        int i11 = this.f4895o;
        if (this.f4893m) {
            if (this.f4890j == null) {
                d dVar = new d(this.f4688a);
                this.f4890j = dVar;
                if (this.f4892l) {
                    dVar.setImageDrawable(this.f4891k);
                    this.f4891k = null;
                    this.f4892l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f4890j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i11 -= this.f4890j.getMeasuredWidth();
        } else {
            this.f4890j = null;
        }
        this.f4896p = i11;
        float f10 = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).f4906a) > 0 && (findItem = this.f4690c.findItem(i)) != null) {
            k((m) findItem.getSubMenu());
        }
    }

    public final boolean j() {
        e eVar = this.f4900t;
        return eVar != null && eVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public final boolean k(m mVar) {
        boolean z10;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        m mVar2 = mVar;
        while (true) {
            androidx.appcompat.view.menu.f fVar = mVar2.f4835z;
            if (fVar == this.f4690c) {
                break;
            }
            mVar2 = (m) fVar;
        }
        ViewGroup viewGroup = (ViewGroup) this.f4695h;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == mVar2.f4834A) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        this.f4905y = mVar.f4834A.f4775a;
        int size = mVar.f4751f.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                z10 = false;
                break;
            }
            MenuItem item = mVar.getItem(i9);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i9++;
        }
        a aVar = new a(this.f4689b, mVar, view);
        this.f4901u = aVar;
        aVar.f4808h = z10;
        AbstractC0974d abstractC0974d = aVar.f4809j;
        if (abstractC0974d != null) {
            abstractC0974d.q(z10);
        }
        a aVar2 = this.f4901u;
        if (!aVar2.b()) {
            if (aVar2.f4806f == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            aVar2.d(0, 0, false, false);
        }
        j.a aVar3 = this.f4692e;
        if (aVar3 != null) {
            aVar3.d(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        SavedState savedState = new SavedState();
        savedState.f4906a = this.f4905y;
        return savedState;
    }

    public final boolean n() {
        androidx.appcompat.view.menu.f fVar;
        if (!this.f4893m || j() || (fVar = this.f4690c) == null || this.f4695h == null || this.f4902v != null) {
            return false;
        }
        fVar.i();
        if (fVar.f4754j.isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f4689b, this.f4690c, this.f4890j));
        this.f4902v = cVar;
        ((View) this.f4695h).post(cVar);
        return true;
    }
}
