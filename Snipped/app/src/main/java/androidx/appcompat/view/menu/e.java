package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* compiled from: MenuAdapter.java */
/* loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final f f4739a;

    /* renamed from: b, reason: collision with root package name */
    public int f4740b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4741c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4742d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f4743e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4744f;

    public e(f fVar, LayoutInflater layoutInflater, boolean z10, int i) {
        this.f4742d = z10;
        this.f4743e = layoutInflater;
        this.f4739a = fVar;
        this.f4744f = i;
        b();
    }

    public final void b() {
        f fVar = this.f4739a;
        h hVar = fVar.f4766v;
        if (hVar != null) {
            fVar.i();
            ArrayList<h> arrayList = fVar.f4754j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == hVar) {
                    this.f4740b = i;
                    return;
                }
            }
        }
        this.f4740b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final h getItem(int i) {
        ArrayList<h> l10;
        boolean z10 = this.f4742d;
        f fVar = this.f4739a;
        if (z10) {
            fVar.i();
            l10 = fVar.f4754j;
        } else {
            l10 = fVar.l();
        }
        int i9 = this.f4740b;
        if (i9 >= 0 && i >= i9) {
            i++;
        }
        return l10.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<h> l10;
        boolean z10 = this.f4742d;
        f fVar = this.f4739a;
        if (z10) {
            fVar.i();
            l10 = fVar.f4754j;
        } else {
            l10 = fVar.l();
        }
        return this.f4740b < 0 ? l10.size() : l10.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z10 = false;
        if (view == null) {
            view = this.f4743e.inflate(this.f4744f, viewGroup, false);
        }
        int i9 = getItem(i).f4776b;
        int i10 = i - 1;
        int i11 = i10 >= 0 ? getItem(i10).f4776b : i9;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f4739a.m() && i9 != i11) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        k.a aVar = (k.a) view;
        if (this.f4741c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
