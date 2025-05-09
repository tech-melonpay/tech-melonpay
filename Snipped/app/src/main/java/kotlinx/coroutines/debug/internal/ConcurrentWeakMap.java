package kotlinx.coroutines.debug.internal;

import O9.p;
import P9.e;
import b5.C0588a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.analytics.FirebaseAnalytics;
import da.InterfaceC0701a;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;
import kotlinx.coroutines.internal.Symbol;

/* compiled from: ConcurrentWeakMap.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0003,-.B\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u00002\b\u0010\r\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\t2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ\u0019\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u000bJ\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u000bR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R&\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$0 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\"R\u000b\u0010(\u001a\u00020'8\u0002X\u0082\u0004R!\u0010+\u001a\u0018\u0012\u0014\u0012\u00120*R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000)8\u0002X\u0082\u0004¨\u0006/"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "", "K", "V", "LP9/e;", "", "weakRefQueue", "<init>", "(Z)V", "LO9/p;", "decrementSize", "()V", "key", "value", "putSynchronized", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/HashedWeakRef;", "w", "cleanWeakRef", "(Lkotlinx/coroutines/debug/internal/HashedWeakRef;)V", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", ProductAction.ACTION_REMOVE, "clear", "runWeakRefQueueCleaningLoopUntilInterrupted", "Ljava/lang/ref/ReferenceQueue;", "Ljava/lang/ref/ReferenceQueue;", "", "getSize", "()I", "size", "", "getKeys", "()Ljava/util/Set;", "keys", "", "getEntries", "entries", "Lkotlinx/atomicfu/AtomicInt;", "_size", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;", "core", "Core", "Entry", "KeyValueSet", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ConcurrentWeakMap<K, V> extends e<K, V> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _size$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(ConcurrentWeakMap.class, "_size$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater core$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(ConcurrentWeakMap.class, Object.class, "core$volatile");
    private volatile /* synthetic */ int _size$volatile;
    private volatile /* synthetic */ Object core$volatile;
    private final ReferenceQueue<K> weakRefQueue;

    /* compiled from: ConcurrentWeakMap.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0012\u001a\u0004\u0018\u00010\u00012\u0006\u0010\f\u001a\u00028\u00002\b\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u00120\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\t2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0010¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00020\u001d\"\u0004\b\u0002\u0010\u001a2\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u000b\u0010$\u001a\u00020#8\u0002X\u0082\u0004R\u0019\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00100%8\u0002X\u0082\u0004R\u0013\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%8\u0002X\u0082\u0004¨\u0006)"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;", "", "", "allocated", "<init>", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;I)V", "hash", FirebaseAnalytics.Param.INDEX, "(I)I", "LO9/p;", "removeCleanedAt", "(I)V", "key", "getImpl", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "Lkotlinx/coroutines/debug/internal/HashedWeakRef;", "weakKey0", "putImpl", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlinx/coroutines/debug/internal/HashedWeakRef;)Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "rehash", "()Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;", "weakRef", "cleanWeakRef", "(Lkotlinx/coroutines/debug/internal/HashedWeakRef;)V", "E", "Lkotlin/Function2;", "factory", "", "keyValueIterator", "(Lca/p;)Ljava/util/Iterator;", "I", "shift", "threshold", "Lkotlinx/atomicfu/AtomicInt;", "load", "Lkotlinx/atomicfu/AtomicArray;", "keys", "values", "KeyValueIterator", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
    public final class Core {
        private static final /* synthetic */ AtomicIntegerFieldUpdater load$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(Core.class, "load$volatile");
        private final int allocated;
        private final /* synthetic */ AtomicReferenceArray keys;
        private volatile /* synthetic */ int load$volatile;
        private final int shift;
        private final int threshold;
        private final /* synthetic */ AtomicReferenceArray values;

        /* compiled from: ConcurrentWeakMap.kt */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R&\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00028\u00018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core$KeyValueIterator;", "E", "", "Lkotlin/Function2;", "factory", "<init>", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;Lca/p;)V", "LO9/p;", "findNext", "()V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", ProductAction.ACTION_REMOVE, "()Ljava/lang/Void;", "Lca/p;", "", FirebaseAnalytics.Param.INDEX, "I", "key", "Ljava/lang/Object;", "value", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
        public final class KeyValueIterator<E> implements Iterator<E>, InterfaceC0701a {
            private final InterfaceC0650p<K, V, E> factory;
            private int index = -1;
            private K key;
            private V value;

            /* JADX WARN: Multi-variable type inference failed */
            public KeyValueIterator(InterfaceC0650p<? super K, ? super V, ? extends E> interfaceC0650p) {
                this.factory = interfaceC0650p;
                findNext();
            }

            private final void findNext() {
                K k3;
                while (true) {
                    int i = this.index + 1;
                    this.index = i;
                    if (i >= ((Core) Core.this).allocated) {
                        return;
                    }
                    HashedWeakRef hashedWeakRef = (HashedWeakRef) Core.this.getKeys().get(this.index);
                    if (hashedWeakRef != null && (k3 = (K) hashedWeakRef.get()) != null) {
                        this.key = k3;
                        Object obj = (V) Core.this.getValues().get(this.index);
                        if (obj instanceof Marked) {
                            obj = (V) ((Marked) obj).ref;
                        }
                        if (obj != null) {
                            this.value = (V) obj;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < ((Core) Core.this).allocated;
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.index >= ((Core) Core.this).allocated) {
                    throw new NoSuchElementException();
                }
                InterfaceC0650p<K, V, E> interfaceC0650p = this.factory;
                K k3 = this.key;
                if (k3 == false) {
                    k3 = (K) p.f3034a;
                }
                V v10 = this.value;
                if (v10 == false) {
                    v10 = (V) p.f3034a;
                }
                E e10 = (E) interfaceC0650p.invoke(k3, v10);
                findNext();
                return e10;
            }

            @Override // java.util.Iterator
            public Void remove() {
                ConcurrentWeakMapKt.noImpl();
                throw new KotlinNothingValueException();
            }
        }

        public Core(int i) {
            this.allocated = i;
            this.shift = Integer.numberOfLeadingZeros(i) + 1;
            this.threshold = (i * 2) / 3;
            this.keys = new AtomicReferenceArray(i);
            this.values = new AtomicReferenceArray(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final /* synthetic */ AtomicReferenceArray getKeys() {
            return this.keys;
        }

        private final /* synthetic */ int getLoad$volatile() {
            return this.load$volatile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final /* synthetic */ AtomicReferenceArray getValues() {
            return this.values;
        }

        private final int index(int hash) {
            return (hash * (-1640531527)) >>> this.shift;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object putImpl$default(Core core, Object obj, Object obj2, HashedWeakRef hashedWeakRef, int i, Object obj3) {
            if ((i & 4) != 0) {
                hashedWeakRef = null;
            }
            return core.putImpl(obj, obj2, hashedWeakRef);
        }

        private final void removeCleanedAt(int index) {
            while (true) {
                Object obj = getValues().get(index);
                if (obj == null || (obj instanceof Marked)) {
                    return;
                }
                AtomicReferenceArray values = getValues();
                while (!values.compareAndSet(index, obj, null)) {
                    if (values.get(index) != obj) {
                        break;
                    }
                }
                ConcurrentWeakMap.this.decrementSize();
                return;
            }
        }

        private final /* synthetic */ void setLoad$volatile(int i) {
            this.load$volatile = i;
        }

        private final /* synthetic */ void update$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, InterfaceC0646l<? super Integer, Integer> interfaceC0646l) {
            int i;
            do {
                i = atomicIntegerFieldUpdater.get(obj);
            } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i, interfaceC0646l.invoke(Integer.valueOf(i)).intValue()));
        }

        public final void cleanWeakRef(HashedWeakRef<?> weakRef) {
            int index = index(weakRef.hash);
            while (true) {
                HashedWeakRef<?> hashedWeakRef = (HashedWeakRef) getKeys().get(index);
                if (hashedWeakRef == null) {
                    return;
                }
                if (hashedWeakRef == weakRef) {
                    removeCleanedAt(index);
                    return;
                } else {
                    if (index == 0) {
                        index = this.allocated;
                    }
                    index--;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final V getImpl(K key) {
            int index = index(key.hashCode());
            while (true) {
                HashedWeakRef hashedWeakRef = (HashedWeakRef) getKeys().get(index);
                if (hashedWeakRef == null) {
                    return null;
                }
                T t3 = hashedWeakRef.get();
                if (f.b(key, t3)) {
                    V v10 = (V) getValues().get(index);
                    return v10 instanceof Marked ? (V) ((Marked) v10).ref : v10;
                }
                if (t3 == 0) {
                    removeCleanedAt(index);
                }
                if (index == 0) {
                    index = this.allocated;
                }
                index--;
            }
        }

        public final <E> Iterator<E> keyValueIterator(InterfaceC0650p<? super K, ? super V, ? extends E> factory) {
            return new KeyValueIterator(factory);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
        
            r3 = getValues().get(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
        
            if ((r3 instanceof kotlinx.coroutines.debug.internal.Marked) == false) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
        
            r4 = getValues();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
        
            if (r4.compareAndSet(r0, r3, r9) == false) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
        
            if (r4.get(r0) == r3) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
        
            r8 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.REHASH;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
        
            return r8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object putImpl(K r8, V r9, kotlinx.coroutines.debug.internal.HashedWeakRef<K> r10) {
            /*
                r7 = this;
                int r0 = r8.hashCode()
                int r0 = r7.index(r0)
                r1 = 0
            L9:
                java.util.concurrent.atomic.AtomicReferenceArray r2 = r7.getKeys()
                java.lang.Object r2 = r2.get(r0)
                kotlinx.coroutines.debug.internal.HashedWeakRef r2 = (kotlinx.coroutines.debug.internal.HashedWeakRef) r2
                if (r2 != 0) goto L58
                r3 = 0
                if (r9 != 0) goto L19
                return r3
            L19:
                if (r1 != 0) goto L35
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = getLoad$volatile$FU()
            L1f:
                int r1 = r2.get(r7)
                int r4 = r7.threshold
                if (r1 < r4) goto L2c
                kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$getREHASH$p()
                return r8
            L2c:
                int r4 = r1 + 1
                boolean r1 = r2.compareAndSet(r7, r1, r4)
                if (r1 == 0) goto L1f
                r1 = 1
            L35:
                r4 = r1
                if (r10 != 0) goto L43
                kotlinx.coroutines.debug.internal.HashedWeakRef r10 = new kotlinx.coroutines.debug.internal.HashedWeakRef
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V> r1 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.this
                java.lang.ref.ReferenceQueue r1 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.access$getWeakRefQueue$p(r1)
                r10.<init>(r8, r1)
            L43:
                r5 = r10
                java.util.concurrent.atomic.AtomicReferenceArray r6 = r7.getKeys()
            L48:
                boolean r10 = r6.compareAndSet(r0, r3, r5)
                if (r10 == 0) goto L4f
                goto L6b
            L4f:
                java.lang.Object r10 = r6.get(r0)
                if (r10 == 0) goto L48
                r1 = r4
                r10 = r5
                goto L9
            L58:
                java.lang.Object r2 = r2.get()
                boolean r3 = kotlin.jvm.internal.f.b(r8, r2)
                if (r3 == 0) goto L8e
                if (r1 == 0) goto L6b
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = getLoad$volatile$FU()
                r8.decrementAndGet(r7)
            L6b:
                java.util.concurrent.atomic.AtomicReferenceArray r8 = r7.getValues()
                java.lang.Object r3 = r8.get(r0)
                boolean r8 = r3 instanceof kotlinx.coroutines.debug.internal.Marked
                if (r8 == 0) goto L7c
                kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$getREHASH$p()
                return r8
            L7c:
                java.util.concurrent.atomic.AtomicReferenceArray r4 = r7.getValues()
            L80:
                boolean r8 = r4.compareAndSet(r0, r3, r9)
                if (r8 == 0) goto L87
                return r3
            L87:
                java.lang.Object r8 = r4.get(r0)
                if (r8 == r3) goto L80
                goto L6b
            L8e:
                if (r2 != 0) goto L93
                r7.removeCleanedAt(r0)
            L93:
                if (r0 != 0) goto L97
                int r0 = r7.allocated
            L97:
                int r0 = r0 + (-1)
                goto L9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.putImpl(java.lang.Object, java.lang.Object, kotlinx.coroutines.debug.internal.HashedWeakRef):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ConcurrentWeakMap<K, V>.Core rehash() {
            Object obj;
            Symbol symbol;
            Marked mark;
            while (true) {
                int size = ConcurrentWeakMap.this.size();
                if (size < 4) {
                    size = 4;
                }
                ConcurrentWeakMap<K, V>.Core core = (ConcurrentWeakMap<K, V>.Core) ConcurrentWeakMap.this.new Core(Integer.highestOneBit(size) * 4);
                int i = this.allocated;
                for (int i9 = 0; i9 < i; i9++) {
                    HashedWeakRef hashedWeakRef = (HashedWeakRef) getKeys().get(i9);
                    Object obj2 = hashedWeakRef != null ? hashedWeakRef.get() : null;
                    if (hashedWeakRef != null && obj2 == null) {
                        removeCleanedAt(i9);
                    }
                    while (true) {
                        obj = getValues().get(i9);
                        if (!(obj instanceof Marked)) {
                            AtomicReferenceArray values = getValues();
                            mark = ConcurrentWeakMapKt.mark(obj);
                            while (!values.compareAndSet(i9, obj, mark)) {
                                if (values.get(i9) != obj) {
                                    break;
                                }
                            }
                            break;
                        }
                        obj = ((Marked) obj).ref;
                        break;
                    }
                    if (obj2 != null && obj != null) {
                        Object putImpl = core.putImpl(obj2, obj, hashedWeakRef);
                        symbol = ConcurrentWeakMapKt.REHASH;
                        if (putImpl != symbol) {
                        }
                    }
                }
                return core;
            }
        }
    }

    /* compiled from: ConcurrentWeakMap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00028\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\f\u001a\u00028\u00032\u0006\u0010\r\u001a\u00028\u0003H\u0016¢\u0006\u0002\u0010\u000eR\u0016\u0010\u0004\u001a\u00028\u0002X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00028\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\t¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Entry;", "K", "V", "", "key", "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getKey", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getValue", "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Entry<K, V> implements Map.Entry<K, V>, InterfaceC0701a {
        private final K key;
        private final V value;

        public Entry(K k3, V v10) {
            this.key = k3;
            this.value = v10;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            ConcurrentWeakMapKt.noImpl();
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: ConcurrentWeakMap.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\f\u0010\rR&\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$KeyValueSet;", "E", "LP9/f;", "Lkotlin/Function2;", "factory", "<init>", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;Lca/p;)V", "element", "", ProductAction.ACTION_ADD, "(Ljava/lang/Object;)Z", "", "iterator", "()Ljava/util/Iterator;", "Lca/p;", "", "getSize", "()I", "size", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
    public final class KeyValueSet<E> extends P9.f<E> {
        private final InterfaceC0650p<K, V, E> factory;

        /* JADX WARN: Multi-variable type inference failed */
        public KeyValueSet(InterfaceC0650p<? super K, ? super V, ? extends E> interfaceC0650p) {
            this.factory = interfaceC0650p;
        }

        @Override // P9.f, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E element) {
            ConcurrentWeakMapKt.noImpl();
            throw new KotlinNothingValueException();
        }

        @Override // P9.f
        public int getSize() {
            return ConcurrentWeakMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return ((Core) ConcurrentWeakMap.getCore$volatile$FU().get(ConcurrentWeakMap.this)).keyValueIterator(this.factory);
        }
    }

    public ConcurrentWeakMap() {
        this(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map.Entry _get_entries_$lambda$1(Object obj, Object obj2) {
        return new Entry(obj, obj2);
    }

    private final void cleanWeakRef(HashedWeakRef<?> w2) {
        ((Core) core$volatile$FU.get(this)).cleanWeakRef(w2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void decrementSize() {
        _size$volatile$FU.decrementAndGet(this);
    }

    private final /* synthetic */ Object getCore$volatile() {
        return this.core$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater getCore$volatile$FU() {
        return core$volatile$FU;
    }

    private final /* synthetic */ int get_size$volatile() {
        return this._size$volatile;
    }

    private final synchronized V putSynchronized(K key, V value) {
        V v10;
        Symbol symbol;
        Core core = (Core) core$volatile$FU.get(this);
        while (true) {
            v10 = (V) Core.putImpl$default(core, key, value, null, 4, null);
            symbol = ConcurrentWeakMapKt.REHASH;
            if (v10 == symbol) {
                core = core.rehash();
                core$volatile$FU.set(this, core);
            }
        }
        return v10;
    }

    private final /* synthetic */ void setCore$volatile(Object obj) {
        this.core$volatile = obj;
    }

    private final /* synthetic */ void set_size$volatile(int i) {
        this._size$volatile = i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object key) {
        if (key == null) {
            return null;
        }
        return (V) ((Core) core$volatile$FU.get(this)).getImpl(key);
    }

    @Override // P9.e
    public Set<Map.Entry<K, V>> getEntries() {
        return new KeyValueSet(new C0588a(19));
    }

    @Override // P9.e
    public Set<K> getKeys() {
        return new KeyValueSet(new C0588a(18));
    }

    @Override // P9.e
    public int getSize() {
        return _size$volatile$FU.get(this);
    }

    @Override // P9.e, java.util.AbstractMap, java.util.Map
    public V put(K key, V value) {
        Symbol symbol;
        V v10 = (V) Core.putImpl$default((Core) core$volatile$FU.get(this), key, value, null, 4, null);
        symbol = ConcurrentWeakMapKt.REHASH;
        if (v10 == symbol) {
            v10 = putSynchronized(key, value);
        }
        if (v10 == null) {
            _size$volatile$FU.incrementAndGet(this);
        }
        return v10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object key) {
        Symbol symbol;
        if (key == 0) {
            return null;
        }
        V v10 = (V) Core.putImpl$default((Core) core$volatile$FU.get(this), key, null, null, 4, null);
        symbol = ConcurrentWeakMapKt.REHASH;
        if (v10 == symbol) {
            v10 = putSynchronized(key, null);
        }
        if (v10 != null) {
            _size$volatile$FU.decrementAndGet(this);
        }
        return v10;
    }

    public final void runWeakRefQueueCleaningLoopUntilInterrupted() {
        if (this.weakRefQueue == null) {
            throw new IllegalStateException("Must be created with weakRefQueue = true".toString());
        }
        while (true) {
            try {
                cleanWeakRef((HashedWeakRef) this.weakRefQueue.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public /* synthetic */ ConcurrentWeakMap(boolean z10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z10);
    }

    public ConcurrentWeakMap(boolean z10) {
        this.core$volatile = new Core(16);
        this.weakRefQueue = z10 ? new ReferenceQueue<>() : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _get_keys_$lambda$0(Object obj, Object obj2) {
        return obj;
    }
}
