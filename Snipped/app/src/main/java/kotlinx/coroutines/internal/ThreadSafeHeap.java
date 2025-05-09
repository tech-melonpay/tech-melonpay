package kotlinx.coroutines.internal;

import O9.p;
import ca.InterfaceC0646l;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* compiled from: ThreadSafeHeap.kt */
@InternalCoroutinesApi
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082\u0010¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ&\u0010\u001c\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u0014H\u0086\b¢\u0006\u0004\b\u001c\u0010\u0018J\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ.\u0010!\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00028\u00002\u0014\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00150\u0014H\u0086\b¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00028\u0000¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b%\u0010\u001aJ\u0017\u0010'\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\bH\u0001¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0001¢\u0006\u0004\b)\u0010\u001fR \u0010*\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R$\u00100\u001a\u00020\b2\u0006\u0010,\u001a\u00020\b8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\fR\u0011\u00101\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b1\u00102R\u000b\u00104\u001a\u0002038\u0002X\u0082\u0004¨\u00065"}, d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "", "i", "LO9/p;", "siftUpFrom", "(I)V", "siftDownFrom", "", "realloc", "()[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "j", "swap", "(II)V", "Lkotlin/Function1;", "", "predicate", "find", "(Lca/l;)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "peek", "()Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "removeFirstOrNull", "removeFirstIf", "node", "addLast", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)V", "cond", "addLastIf", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;Lca/l;)Z", ProductAction.ACTION_REMOVE, "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)Z", "firstImpl", FirebaseAnalytics.Param.INDEX, "removeAtImpl", "(I)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "addImpl", "a", "[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "value", "getSize", "()I", "setSize", "size", "isEmpty", "()Z", "Lkotlinx/atomicfu/AtomicInt;", "_size", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public class ThreadSafeHeap<T extends ThreadSafeHeapNode & Comparable<? super T>> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _size$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(ThreadSafeHeap.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    private T[] a;

    private final /* synthetic */ int get_size$volatile() {
        return this._size$volatile;
    }

    private final T[] realloc() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new ThreadSafeHeapNode[4];
            this.a = tArr2;
            return tArr2;
        }
        if (getSize() < tArr.length) {
            return tArr;
        }
        T[] tArr3 = (T[]) ((ThreadSafeHeapNode[]) Arrays.copyOf(tArr, getSize() * 2));
        this.a = tArr3;
        return tArr3;
    }

    private final void setSize(int i) {
        _size$volatile$FU.set(this, i);
    }

    private final /* synthetic */ void set_size$volatile(int i) {
        this._size$volatile = i;
    }

    private final void siftDownFrom(int i) {
        while (true) {
            int i9 = i * 2;
            int i10 = i9 + 1;
            if (i10 >= getSize()) {
                return;
            }
            T[] tArr = this.a;
            int i11 = i9 + 2;
            if (i11 >= getSize() || ((Comparable) tArr[i11]).compareTo(tArr[i10]) >= 0) {
                i11 = i10;
            }
            if (((Comparable) tArr[i]).compareTo(tArr[i11]) <= 0) {
                return;
            }
            swap(i, i11);
            i = i11;
        }
    }

    private final void siftUpFrom(int i) {
        while (i > 0) {
            T[] tArr = this.a;
            int i9 = (i - 1) / 2;
            if (((Comparable) tArr[i9]).compareTo(tArr[i]) <= 0) {
                return;
            }
            swap(i, i9);
            i = i9;
        }
    }

    private final void swap(int i, int j10) {
        T[] tArr = this.a;
        T t3 = tArr[j10];
        T t10 = tArr[i];
        tArr[i] = t3;
        tArr[j10] = t10;
        t3.setIndex(i);
        t10.setIndex(j10);
    }

    public final void addImpl(T node) {
        node.setHeap(this);
        T[] realloc = realloc();
        int size = getSize();
        setSize(size + 1);
        realloc[size] = node;
        node.setIndex(size);
        siftUpFrom(size);
    }

    public final void addLast(T node) {
        synchronized (this) {
            addImpl(node);
            p pVar = p.f3034a;
        }
    }

    public final boolean addLastIf(T node, InterfaceC0646l<? super T, Boolean> cond) {
        boolean z10;
        synchronized (this) {
            if (cond.invoke(firstImpl()).booleanValue()) {
                addImpl(node);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final T find(InterfaceC0646l<? super T, Boolean> predicate) {
        T t3;
        synchronized (this) {
            try {
                int size = getSize();
                int i = 0;
                while (true) {
                    t3 = null;
                    if (i >= size) {
                        break;
                    }
                    T[] tArr = this.a;
                    if (tArr != null) {
                        t3 = (Object) tArr[i];
                    }
                    if (predicate.invoke(t3).booleanValue()) {
                        break;
                    }
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t3;
    }

    public final T firstImpl() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int getSize() {
        return _size$volatile$FU.get(this);
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final T peek() {
        T firstImpl;
        synchronized (this) {
            firstImpl = firstImpl();
        }
        return firstImpl;
    }

    public final boolean remove(T node) {
        boolean z10;
        synchronized (this) {
            if (node.getHeap() == null) {
                z10 = false;
            } else {
                removeAtImpl(node.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    public final T removeAtImpl(int index) {
        T[] tArr = this.a;
        setSize(getSize() - 1);
        if (index < getSize()) {
            swap(index, getSize());
            int i = (index - 1) / 2;
            if (index <= 0 || ((Comparable) tArr[index]).compareTo(tArr[i]) >= 0) {
                siftDownFrom(index);
            } else {
                swap(index, i);
                siftUpFrom(i);
            }
        }
        T t3 = tArr[getSize()];
        t3.setHeap(null);
        t3.setIndex(-1);
        tArr[getSize()] = null;
        return t3;
    }

    public final T removeFirstIf(InterfaceC0646l<? super T, Boolean> predicate) {
        synchronized (this) {
            T firstImpl = firstImpl();
            if (firstImpl == null) {
                return null;
            }
            return predicate.invoke(firstImpl).booleanValue() ? removeAtImpl(0) : null;
        }
    }

    public final T removeFirstOrNull() {
        T removeAtImpl;
        synchronized (this) {
            removeAtImpl = getSize() > 0 ? removeAtImpl(0) : null;
        }
        return removeAtImpl;
    }
}
