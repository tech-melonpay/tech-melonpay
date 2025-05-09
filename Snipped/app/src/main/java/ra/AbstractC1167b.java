package ra;

import ia.InterfaceC0835c;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.SerializationException;
import na.InterfaceC1077a;
import na.InterfaceC1078b;
import na.InterfaceC1081e;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* compiled from: AbstractPolymorphicSerializer.kt */
/* renamed from: ra.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1167b<T> implements InterfaceC1078b<T> {
    public InterfaceC1077a<T> a(InterfaceC1142b interfaceC1142b, String str) {
        return interfaceC1142b.a().d(c(), str);
    }

    public InterfaceC1081e<T> b(InterfaceC1145e interfaceC1145e, T t3) {
        return interfaceC1145e.a().e(c(), t3);
    }

    public abstract InterfaceC0835c<T> c();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // na.InterfaceC1077a
    public final T deserialize(InterfaceC1144d interfaceC1144d) {
        pa.f descriptor = getDescriptor();
        InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        T t3 = null;
        while (true) {
            int q10 = c2.q(getDescriptor());
            if (q10 == -1) {
                if (t3 != null) {
                    c2.b(descriptor);
                    return t3;
                }
                throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) ref$ObjectRef.f23179a)).toString());
            }
            if (q10 == 0) {
                ref$ObjectRef.f23179a = (T) c2.y(getDescriptor(), q10);
            } else {
                if (q10 != 1) {
                    StringBuilder sb2 = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) ref$ObjectRef.f23179a;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb2.append(str);
                    sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb2.append(q10);
                    throw new SerializationException(sb2.toString());
                }
                T t10 = ref$ObjectRef.f23179a;
                if (t10 == 0) {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                }
                ref$ObjectRef.f23179a = t10;
                t3 = (T) c2.C(getDescriptor(), q10, j3.e.r(this, c2, (String) t10), null);
            }
        }
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, T t3) {
        InterfaceC1081e<? super T> s10 = j3.e.s(this, interfaceC1145e, t3);
        pa.f descriptor = getDescriptor();
        InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
        c2.x(getDescriptor(), 0, s10.getDescriptor().a());
        c2.C(getDescriptor(), 1, s10, t3);
        c2.b(descriptor);
    }
}
