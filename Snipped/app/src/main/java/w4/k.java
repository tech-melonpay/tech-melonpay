package W4;

import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import java.util.List;
import m5.InterfaceC1028a;

/* compiled from: SignerRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class k implements W5.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1028a f3822a;

    public k(InterfaceC1028a interfaceC1028a) {
        this.f3822a = interfaceC1028a;
    }

    @Override // W5.a
    public final Object a(String str, int i, int i9, T9.a<? super J5.a<? extends J5.b, CryptoExchangeDomain>> aVar) {
        return this.f3822a.d(i, i9, str);
    }

    @Override // W5.a
    public final Object b(String str, T9.a<? super J5.a<? extends J5.b, E5.b>> aVar) {
        return this.f3822a.b(str);
    }

    @Override // W5.a
    public final Object c(T9.a<? super J5.a<? extends J5.b, String>> aVar) {
        return this.f3822a.c();
    }

    @Override // W5.a
    public final Object d(String str, T9.a<? super J5.a<? extends J5.b, ? extends List<E5.a>>> aVar) {
        return this.f3822a.a(str);
    }
}
