package kotlinx.serialization.internal;

import C.v;
import O9.f;
import O9.p;
import P9.j;
import P9.s;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.b;
import pa.C1123a;
import pa.g;
import ra.a0;

/* compiled from: Enums.kt */
/* loaded from: classes2.dex */
public final class EnumDescriptor extends PluginGeneratedSerialDescriptor {

    /* renamed from: l, reason: collision with root package name */
    public final g.b f23315l;

    /* renamed from: m, reason: collision with root package name */
    public final f f23316m;

    public EnumDescriptor(final String str, final int i) {
        super(str, null, i);
        this.f23315l = g.b.f25740a;
        this.f23316m = kotlin.a.a(new InterfaceC0635a<pa.f[]>() { // from class: kotlinx.serialization.internal.EnumDescriptor$elementDescriptors$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final pa.f[] invoke() {
                SerialDescriptorImpl c2;
                int i9 = i;
                pa.f[] fVarArr = new pa.f[i9];
                for (int i10 = 0; i10 < i9; i10++) {
                    c2 = kotlinx.serialization.descriptors.a.c(str + '.' + this.f23339e[i10], b.d.f23312a, new pa.f[0], new InterfaceC0646l<C1123a, p>() { // from class: kotlinx.serialization.descriptors.SerialDescriptorsKt$buildSerialDescriptor$1
                        @Override // ca.InterfaceC0646l
                        public final /* bridge */ /* synthetic */ p invoke(C1123a c1123a3) {
                            return p.f3034a;
                        }
                    });
                    fVarArr[i10] = c2;
                }
                return fVarArr;
            }
        });
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, pa.f
    public final g e() {
        return this.f23315l;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof pa.f)) {
            return false;
        }
        pa.f fVar = (pa.f) obj;
        if (fVar.e() != g.b.f25740a) {
            return false;
        }
        return kotlin.jvm.internal.f.b(this.f23335a, fVar.a()) && kotlin.jvm.internal.f.b(a0.b(this), a0.b(fVar));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        int hashCode = this.f23335a.hashCode();
        Iterator it = new j(this, 3).iterator();
        int i = 1;
        while (it.hasNext()) {
            int i9 = i * 31;
            String str = (String) it.next();
            i = i9 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, pa.f
    public final pa.f i(int i) {
        return ((pa.f[]) this.f23316m.getValue())[i];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final String toString() {
        return s.P(new j(this, 3), ", ", v.q(new StringBuilder(), this.f23335a, '('), ")", null, 56);
    }
}
