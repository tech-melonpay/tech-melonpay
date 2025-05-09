package ra;

import java.util.Arrays;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: InlineClassDescriptor.kt */
/* renamed from: ra.D, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1165D extends PluginGeneratedSerialDescriptor {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f26348l;

    public C1165D(String str, InterfaceC1162A<?> interfaceC1162A) {
        super(str, interfaceC1162A, 1);
        this.f26348l = true;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1165D) {
            pa.f fVar = (pa.f) obj;
            if (kotlin.jvm.internal.f.b(this.f23335a, fVar.a())) {
                C1165D c1165d = (C1165D) obj;
                if (c1165d.f26348l && Arrays.equals((pa.f[]) this.f23343j.getValue(), (pa.f[]) c1165d.f23343j.getValue())) {
                    int f10 = fVar.f();
                    int i9 = this.f23337c;
                    if (i9 == f10) {
                        for (0; i < i9; i + 1) {
                            i = (kotlin.jvm.internal.f.b(i(i).a(), fVar.i(i).a()) && kotlin.jvm.internal.f.b(i(i).e(), fVar.i(i).e())) ? i + 1 : 0;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, pa.f
    public final boolean isInline() {
        return this.f26348l;
    }
}
