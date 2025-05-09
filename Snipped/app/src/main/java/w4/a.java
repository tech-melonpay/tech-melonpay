package W4;

import c5.InterfaceC0625a;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.account.FeeDomain;
import java.util.List;
import s5.C1205a;

/* compiled from: AccountRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class a implements L5.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0625a f3812a;

    public a(InterfaceC0625a interfaceC0625a) {
        this.f3812a = interfaceC0625a;
    }

    @Override // L5.a
    public final Object a(String str, T9.a<? super J5.a<? extends J5.b, ? extends List<C1205a>>> aVar) {
        return this.f3812a.g();
    }

    @Override // L5.a
    public final Object b(String str, s5.g gVar, T9.a<? super J5.a<? extends J5.b, s5.f>> aVar) {
        return this.f3812a.h(str, gVar);
    }

    @Override // L5.a
    public final Object c(String str, String str2, s5.h hVar, T9.a<? super J5.a<? extends J5.b, BankAccountDomain>> aVar) {
        return this.f3812a.i(str, str2, hVar);
    }

    @Override // L5.a
    public final Object d(int i, T9.a<? super J5.a<? extends J5.b, ? extends List<FeeDomain>>> aVar) {
        return this.f3812a.e(i);
    }

    @Override // L5.a
    public final Object e(String str, T9.a<? super J5.a<? extends J5.b, ? extends List<BankAccountDomain>>> aVar) {
        return this.f3812a.d(str);
    }

    @Override // L5.a
    public final Object f(String str, T9.a<? super J5.a<? extends J5.b, s5.e>> aVar) {
        return this.f3812a.a(str);
    }

    @Override // L5.a
    public final Object g(String str, T9.a<? super J5.a<? extends J5.b, ? extends List<s5.d>>> aVar) {
        return this.f3812a.c();
    }

    @Override // L5.a
    public final Object h(T9.a<? super J5.a<? extends J5.b, ? extends List<u5.f>>> aVar) {
        return this.f3812a.b();
    }

    @Override // L5.a
    public final Object i(String str, String str2, T9.a<? super J5.a<? extends J5.b, BankAccountDomain>> aVar) {
        return this.f3812a.f(str, str2);
    }
}
