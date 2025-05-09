package ra;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import na.InterfaceC1078b;

/* compiled from: CollectionSerializers.kt */
/* renamed from: ra.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1169d extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26386b;

    /* renamed from: c, reason: collision with root package name */
    public final L f26387c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1169d(InterfaceC1078b interfaceC1078b, int i) {
        super(interfaceC1078b);
        this.f26386b = i;
        switch (i) {
            case 1:
                super(interfaceC1078b);
                this.f26387c = new C1168c(interfaceC1078b.getDescriptor(), 2);
                break;
            case 2:
                super(interfaceC1078b);
                this.f26387c = new C1168c(interfaceC1078b.getDescriptor(), 3);
                break;
            default:
                this.f26387c = new C1168c(interfaceC1078b.getDescriptor(), 1);
                break;
        }
    }

    @Override // ra.AbstractC1166a
    public final Object a() {
        switch (this.f26386b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // ra.AbstractC1166a
    public final int b(Object obj) {
        switch (this.f26386b) {
            case 0:
                return ((ArrayList) obj).size();
            case 1:
                return ((HashSet) obj).size();
            default:
                return ((LinkedHashSet) obj).size();
        }
    }

    @Override // ra.AbstractC1166a
    public final Iterator c(Object obj) {
        return ((Collection) obj).iterator();
    }

    @Override // ra.AbstractC1166a
    public final int d(Object obj) {
        return ((Collection) obj).size();
    }

    @Override // ra.AbstractC1166a
    public final Object g(Object obj) {
        switch (this.f26386b) {
            case 0:
                return new ArrayList((Collection) null);
            case 1:
                return new HashSet((Collection) null);
            default:
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        switch (this.f26386b) {
        }
        return (C1168c) this.f26387c;
    }

    @Override // ra.AbstractC1166a
    public final Object h(Object obj) {
        switch (this.f26386b) {
            case 0:
                return (ArrayList) obj;
            case 1:
                return (HashSet) obj;
            default:
                return (LinkedHashSet) obj;
        }
    }

    @Override // ra.r
    public final void i(int i, Object obj, Object obj2) {
        switch (this.f26386b) {
            case 0:
                ((ArrayList) obj).add(i, obj2);
                break;
            case 1:
                ((HashSet) obj).add(obj2);
                break;
            default:
                ((LinkedHashSet) obj).add(obj2);
                break;
        }
    }
}
