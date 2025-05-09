package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import com.luminary.mobile.R;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter.java */
/* loaded from: classes.dex */
public final class d implements j, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f4731a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f4732b;

    /* renamed from: c, reason: collision with root package name */
    public f f4733c;

    /* renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f4734d;

    /* renamed from: e, reason: collision with root package name */
    public j.a f4735e;

    /* renamed from: f, reason: collision with root package name */
    public a f4736f;

    /* compiled from: ListMenuPresenter.java */
    public class a extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        public int f4737a = -1;

        public a() {
            b();
        }

        public final void b() {
            f fVar = d.this.f4733c;
            h hVar = fVar.f4766v;
            if (hVar != null) {
                fVar.i();
                ArrayList<h> arrayList = fVar.f4754j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == hVar) {
                        this.f4737a = i;
                        return;
                    }
                }
            }
            this.f4737a = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final h getItem(int i) {
            d dVar = d.this;
            f fVar = dVar.f4733c;
            fVar.i();
            ArrayList<h> arrayList = fVar.f4754j;
            dVar.getClass();
            int i9 = this.f4737a;
            if (i9 >= 0 && i >= i9) {
                i++;
            }
            return arrayList.get(i);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            d dVar = d.this;
            f fVar = dVar.f4733c;
            fVar.i();
            int size = fVar.f4754j.size();
            dVar.getClass();
            return this.f4737a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = d.this.f4732b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((k.a) view).d(getItem(i));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            b();
            super.notifyDataSetChanged();
        }
    }

    public d(Context context) {
        this.f4731a = context;
        this.f4732b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z10) {
        j.a aVar = this.f4735e;
        if (aVar != null) {
            aVar.c(fVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z10) {
        a aVar = this.f4736f;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(j.a aVar) {
        this.f4735e = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(Context context, f fVar) {
        if (this.f4731a != null) {
            this.f4731a = context;
            if (this.f4732b == null) {
                this.f4732b = LayoutInflater.from(context);
            }
        }
        this.f4733c = fVar;
        a aVar = this.f4736f;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f4734d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        g gVar = new g();
        gVar.f4769a = mVar;
        Context context = mVar.f4746a;
        b.a aVar = new b.a(context);
        d dVar = new d(aVar.getContext());
        gVar.f4771c = dVar;
        dVar.f4735e = gVar;
        mVar.b(dVar, context);
        d dVar2 = gVar.f4771c;
        if (dVar2.f4736f == null) {
            dVar2.f4736f = dVar2.new a();
        }
        aVar.setAdapter(dVar2.f4736f, gVar);
        View view = mVar.f4759o;
        if (view != null) {
            aVar.setCustomTitle(view);
        } else {
            aVar.setIcon(mVar.f4758n).setTitle(mVar.f4757m);
        }
        aVar.setOnKeyListener(gVar);
        androidx.appcompat.app.b create = aVar.create();
        gVar.f4770b = create;
        create.setOnDismissListener(gVar);
        WindowManager.LayoutParams attributes = gVar.f4770b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        gVar.f4770b.show();
        j.a aVar2 = this.f4735e;
        if (aVar2 == null) {
            return true;
        }
        aVar2.d(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        if (this.f4734d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f4734d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean m(h hVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j10) {
        this.f4733c.q(this.f4736f.getItem(i), this, 0);
    }
}
