package W4;

import java.util.List;
import l5.InterfaceC0985a;

/* compiled from: PlanRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class j implements U5.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0985a f3821a;

    public j(InterfaceC0985a interfaceC0985a) {
        this.f3821a = interfaceC0985a;
    }

    @Override // U5.a
    public final Object a(String str, T9.a<? super J5.a<? extends J5.b, ? extends List<C5.a>>> aVar) {
        return this.f3821a.b(str);
    }

    @Override // U5.a
    public final Object b(String str, T9.a<? super J5.a<? extends J5.b, C5.a>> aVar) {
        return this.f3821a.a(str);
    }

    @Override // U5.a
    public final Object c(String str, String str2, T9.a<? super J5.a<? extends J5.b, C5.a>> aVar) {
        return this.f3821a.c(str, str2);
    }
}
