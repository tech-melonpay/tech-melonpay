package ia;

import ca.InterfaceC0646l;
import ia.InterfaceC0840h;

/* compiled from: KProperty.kt */
/* renamed from: ia.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0842j<T, V> extends InterfaceC0840h<V>, InterfaceC0646l<T, V> {

    /* compiled from: KProperty.kt */
    /* renamed from: ia.j$a */
    public interface a<T, V> extends InterfaceC0840h.a<V>, InterfaceC0646l<T, V> {
    }

    V get(T t3);

    Object getDelegate(T t3);

    /* renamed from: getGetter */
    a<T, V> mo95getGetter();
}
