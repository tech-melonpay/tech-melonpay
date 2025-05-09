package o1;

import android.database.DataSetObservable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PagerAdapter.java */
/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1086a {

    /* renamed from: a, reason: collision with root package name */
    public final DataSetObservable f24339a = new DataSetObservable();

    public void a(int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public abstract int c();

    public CharSequence d(int i) {
        return null;
    }

    public Object e(ViewGroup viewGroup, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public abstract boolean f(View view, Object obj);

    public Parcelable h() {
        return null;
    }

    public void b() {
    }

    public void i(Object obj) {
    }

    public void j(ViewGroup viewGroup) {
    }

    public void g(Parcelable parcelable, ClassLoader classLoader) {
    }
}
