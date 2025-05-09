package W4;

import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import f5.InterfaceC0745a;
import java.util.List;

/* compiled from: CryptoAccountRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class d implements O5.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0745a f3815a;

    public d(InterfaceC0745a interfaceC0745a) {
        this.f3815a = interfaceC0745a;
    }

    @Override // O5.a
    public final Object a(int i, int i9, T9.a<? super J5.a<? extends J5.b, CryptoAccountDomain>> aVar) {
        return this.f3815a.a(i, i9);
    }

    @Override // O5.a
    public final Object b(int i, T9.a<? super J5.a<? extends J5.b, ? extends List<CryptoAccountDomain>>> aVar) {
        return this.f3815a.b(i);
    }

    @Override // O5.a
    public final Object c(int i, T9.a aVar, String str, String str2) {
        return this.f3815a.c(str, i, str2);
    }
}
