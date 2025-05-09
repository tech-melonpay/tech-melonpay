package P9;

import android.view.View;
import android.view.ViewGroup;
import da.InterfaceC0701a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Iterators.kt */
/* loaded from: classes2.dex */
public final class v implements Iterator, InterfaceC0701a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3166a;

    /* renamed from: b, reason: collision with root package name */
    public int f3167b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3168c;

    public /* synthetic */ v(Object obj, int i) {
        this.f3166a = i;
        this.f3168c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3166a) {
            case 0:
                return ((Iterator) this.f3168c).hasNext();
            case 1:
                return this.f3167b < ((androidx.collection.h) this.f3168c).f();
            case 2:
                return this.f3167b < ((Object[]) this.f3168c).length;
            case 3:
                return this.f3167b > 0;
            default:
                return this.f3167b < ((ViewGroup) this.f3168c).getChildCount();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3166a) {
            case 0:
                int i = this.f3167b;
                this.f3167b = i + 1;
                if (i >= 0) {
                    return new u(i, ((Iterator) this.f3168c).next());
                }
                m.t();
                throw null;
            case 1:
                int i9 = this.f3167b;
                this.f3167b = i9 + 1;
                return ((androidx.collection.h) this.f3168c).g(i9);
            case 2:
                try {
                    Object[] objArr = (Object[]) this.f3168c;
                    int i10 = this.f3167b;
                    this.f3167b = i10 + 1;
                    return objArr[i10];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f3167b--;
                    throw new NoSuchElementException(e10.getMessage());
                }
            case 3:
                pa.f fVar = (pa.f) this.f3168c;
                int f10 = fVar.f();
                int i11 = this.f3167b;
                this.f3167b = i11 - 1;
                return fVar.g(f10 - i11);
            default:
                int i12 = this.f3167b;
                this.f3167b = i12 + 1;
                View childAt = ((ViewGroup) this.f3168c).getChildAt(i12);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3166a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                int i = this.f3167b - 1;
                this.f3167b = i;
                ((ViewGroup) this.f3168c).removeViewAt(i);
                return;
        }
    }

    public v(pa.f fVar) {
        this.f3166a = 3;
        this.f3168c = fVar;
        this.f3167b = fVar.f();
    }
}
