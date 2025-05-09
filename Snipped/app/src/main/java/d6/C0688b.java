package d6;

import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import kotlin.Pair;

/* compiled from: GetCryptoAccountUseCase.kt */
/* renamed from: d6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0688b extends com.luminary.business.domain.functional.a<CryptoAccountDomain, Pair<? extends Integer, ? extends Integer>> {

    /* renamed from: a, reason: collision with root package name */
    public final O5.a f20439a;

    public C0688b(O5.a aVar) {
        this.f20439a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends Integer, ? extends Integer> pair, T9.a<? super J5.a<? extends J5.b, ? extends CryptoAccountDomain>> aVar) {
        Pair<? extends Integer, ? extends Integer> pair2 = pair;
        return this.f20439a.a(((Number) pair2.f23089a).intValue(), ((Number) pair2.f23090b).intValue(), aVar);
    }
}
