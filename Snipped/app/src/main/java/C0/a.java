package C0;

import C0.b;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* compiled from: CursorAdapter.java */
/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f592a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f593b;

    /* renamed from: c, reason: collision with root package name */
    public Cursor f594c;

    /* renamed from: d, reason: collision with root package name */
    public int f595d;

    /* renamed from: e, reason: collision with root package name */
    public C0006a f596e;

    /* renamed from: f, reason: collision with root package name */
    public b f597f;

    /* renamed from: g, reason: collision with root package name */
    public C0.b f598g;

    /* compiled from: CursorAdapter.java */
    /* renamed from: C0.a$a, reason: collision with other inner class name */
    public class C0006a extends ContentObserver {
        public C0006a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z10) {
            Cursor cursor;
            a aVar = a.this;
            if (!aVar.f593b || (cursor = aVar.f594c) == null || cursor.isClosed()) {
                return;
            }
            aVar.f592a = aVar.f594c.requery();
        }
    }

    /* compiled from: CursorAdapter.java */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            a aVar = a.this;
            aVar.f592a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            a aVar = a.this;
            aVar.f592a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public abstract void b(View view, Cursor cursor);

    public void c(Cursor cursor) {
        Cursor cursor2 = this.f594c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0006a c0006a = this.f596e;
                if (c0006a != null) {
                    cursor2.unregisterContentObserver(c0006a);
                }
                b bVar = this.f597f;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f594c = cursor;
            if (cursor != null) {
                C0006a c0006a2 = this.f596e;
                if (c0006a2 != null) {
                    cursor.registerContentObserver(c0006a2);
                }
                b bVar2 = this.f597f;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f595d = cursor.getColumnIndexOrThrow("_id");
                this.f592a = true;
                notifyDataSetChanged();
            } else {
                this.f595d = -1;
                this.f592a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String d(Cursor cursor);

    public abstract View e(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f592a || (cursor = this.f594c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f592a) {
            return null;
        }
        this.f594c.moveToPosition(i);
        if (view == null) {
            c cVar = (c) this;
            view = cVar.f603j.inflate(cVar.i, viewGroup, false);
        }
        b(view, this.f594c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f598g == null) {
            C0.b bVar = new C0.b();
            bVar.f601a = this;
            this.f598g = bVar;
        }
        return this.f598g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f592a || (cursor = this.f594c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f594c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f592a && (cursor = this.f594c) != null && cursor.moveToPosition(i)) {
            return this.f594c.getLong(this.f595d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f592a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f594c.moveToPosition(i)) {
            throw new IllegalStateException(com.google.android.gms.measurement.internal.a.g(i, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = e(viewGroup);
        }
        b(view, this.f594c);
        return view;
    }
}
