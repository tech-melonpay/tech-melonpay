package d6;

import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import java.util.List;

/* compiled from: GetCryptoAccountsUseCase.kt */
/* renamed from: d6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0689c extends com.luminary.business.domain.functional.a<List<? extends CryptoAccountDomain>, Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final O5.a f20440a;

    public C0689c(O5.a aVar) {
        this.f20440a = aVar;
    }

    @Override // com.luminary.business.domain.functional.a
    public final Object b(Integer num, T9.a<? super J5.a<? extends J5.b, ? extends List<? extends CryptoAccountDomain>>> aVar) {
        return this.f20440a.b(num.intValue(), aVar);
    }
}
