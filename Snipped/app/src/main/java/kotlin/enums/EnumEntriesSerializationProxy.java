package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;

/* compiled from: EnumEntriesSerializationProxy.kt */
/* loaded from: classes2.dex */
public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Class<E> f23173a;

    public EnumEntriesSerializationProxy(E[] eArr) {
        this.f23173a = (Class<E>) eArr.getClass().getComponentType();
    }

    private final Object readResolve() {
        return new EnumEntriesList(this.f23173a.getEnumConstants());
    }
}
