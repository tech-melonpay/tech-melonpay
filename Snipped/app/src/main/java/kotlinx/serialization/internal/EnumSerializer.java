package kotlinx.serialization.internal;

import O9.f;
import P9.l;
import ca.InterfaceC0635a;
import java.lang.Enum;
import java.util.Arrays;
import kotlinx.serialization.SerializationException;
import na.InterfaceC1078b;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* compiled from: Enums.kt */
/* loaded from: classes2.dex */
public final class EnumSerializer<T extends Enum<T>> implements InterfaceC1078b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T[] f23320a;

    /* renamed from: b, reason: collision with root package name */
    public final f f23321b;

    public EnumSerializer(final String str, T[] tArr) {
        this.f23320a = tArr;
        this.f23321b = kotlin.a.a(new InterfaceC0635a<pa.f>(this) { // from class: kotlinx.serialization.internal.EnumSerializer$descriptor$2

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ EnumSerializer<T> f23322l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f23322l = this;
            }

            @Override // ca.InterfaceC0635a
            public final pa.f invoke() {
                EnumSerializer<T> enumSerializer = this.f23322l;
                enumSerializer.getClass();
                Enum[] enumArr = enumSerializer.f23320a;
                EnumDescriptor enumDescriptor = new EnumDescriptor(str, enumArr.length);
                for (Enum r02 : enumArr) {
                    enumDescriptor.k(r02.name(), false);
                }
                return enumDescriptor;
            }
        });
    }

    @Override // na.InterfaceC1077a
    public final Object deserialize(InterfaceC1144d interfaceC1144d) {
        int i = interfaceC1144d.i(getDescriptor());
        T[] tArr = this.f23320a;
        if (i >= 0 && i < tArr.length) {
            return tArr[i];
        }
        throw new SerializationException(i + " is not among valid " + getDescriptor().a() + " enum values, values size is " + tArr.length);
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return (pa.f) this.f23321b.getValue();
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
        Enum r52 = (Enum) obj;
        T[] tArr = this.f23320a;
        int p10 = l.p(tArr, r52);
        if (p10 != -1) {
            interfaceC1145e.l(getDescriptor(), p10);
            return;
        }
        throw new SerializationException(r52 + " is not a valid enum " + getDescriptor().a() + ", must be one of " + Arrays.toString(tArr));
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
    }
}
