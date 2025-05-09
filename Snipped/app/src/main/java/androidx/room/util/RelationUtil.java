package androidx.room.util;

import O9.p;
import androidx.collection.a;
import androidx.collection.d;
import androidx.room.RoomDatabase;
import ca.InterfaceC0646l;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: RelationUtil.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ay\u0010\u000b\u001a\u00020\t\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00042\u0006\u0010\u0007\u001a\u00020\u00062.\u0010\n\u001a*\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0004\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f\u001aC\u0010\u000e\u001a\u00020\t\"\u0004\b\u0000\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\u000f\u001aY\u0010\u0011\u001a\u00020\t\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "K", "V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "map", "", "isRelationCollection", "Lkotlin/Function1;", "LO9/p;", "fetchBlock", "recursiveFetchHashMap", "(Ljava/util/HashMap;ZLca/l;)V", "Landroidx/collection/d;", "recursiveFetchLongSparseArray", "(Landroidx/collection/d;ZLca/l;)V", "Landroidx/collection/a;", "recursiveFetchArrayMap", "(Landroidx/collection/a;ZLca/l;)V", "room-runtime_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class RelationUtil {
    public static final <K, V> void recursiveFetchArrayMap(a<K, V> aVar, boolean z10, InterfaceC0646l<? super a<K, V>, p> interfaceC0646l) {
        a aVar2 = new a(RoomDatabase.MAX_BIND_PARAMETER_CNT);
        int size = aVar.size();
        int i = 0;
        int i9 = 0;
        while (i < size) {
            if (z10) {
                aVar2.put(aVar.keyAt(i), aVar.valueAt(i));
            } else {
                aVar2.put(aVar.keyAt(i), null);
            }
            i++;
            i9++;
            if (i9 == 999) {
                interfaceC0646l.invoke(aVar2);
                if (!z10) {
                    aVar.putAll((Map) aVar2);
                }
                aVar2.clear();
                i9 = 0;
            }
        }
        if (i9 > 0) {
            interfaceC0646l.invoke(aVar2);
            if (z10) {
                return;
            }
            aVar.putAll((Map) aVar2);
        }
    }

    public static final <K, V> void recursiveFetchHashMap(HashMap<K, V> hashMap, boolean z10, InterfaceC0646l<? super HashMap<K, V>, p> interfaceC0646l) {
        int i;
        HashMap hashMap2 = new HashMap(RoomDatabase.MAX_BIND_PARAMETER_CNT);
        loop0: while (true) {
            i = 0;
            for (K k3 : hashMap.keySet()) {
                if (z10) {
                    hashMap2.put(k3, hashMap.get(k3));
                } else {
                    hashMap2.put(k3, null);
                }
                i++;
                if (i == 999) {
                    interfaceC0646l.invoke(hashMap2);
                    if (!z10) {
                        hashMap.putAll(hashMap2);
                    }
                    hashMap2.clear();
                }
            }
            break loop0;
        }
        if (i > 0) {
            interfaceC0646l.invoke(hashMap2);
            if (z10) {
                return;
            }
            hashMap.putAll(hashMap2);
        }
    }

    public static final <V> void recursiveFetchLongSparseArray(d<V> dVar, boolean z10, InterfaceC0646l<? super d<V>, p> interfaceC0646l) {
        d<? extends V> dVar2 = new d<>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
        int size = dVar.size();
        int i = 0;
        int i9 = 0;
        while (i < size) {
            if (z10) {
                dVar2.put(dVar.keyAt(i), dVar.valueAt(i));
            } else {
                dVar2.put(dVar.keyAt(i), null);
            }
            i++;
            i9++;
            if (i9 == 999) {
                interfaceC0646l.invoke(dVar2);
                if (!z10) {
                    dVar.putAll(dVar2);
                }
                dVar2.clear();
                i9 = 0;
            }
        }
        if (i9 > 0) {
            interfaceC0646l.invoke(dVar2);
            if (z10) {
                return;
            }
            dVar.putAll(dVar2);
        }
    }
}
