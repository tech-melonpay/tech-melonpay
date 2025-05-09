package b6;

import com.luminary.business.domain.entity.cards.CardTransactionDomain;
import java.util.List;
import kotlin.Triple;

/* compiled from: GetTransactionForCardUseCase.kt */
/* loaded from: classes.dex */
public final class p extends com.luminary.business.domain.functional.a<List<? extends CardTransactionDomain>, Triple<? extends String, ? extends Integer, ? extends Integer>> {

    /* renamed from: a, reason: collision with root package name */
    public final M5.a f8358a;

    public p(M5.a aVar) {
        this.f8358a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Triple<? extends String, ? extends Integer, ? extends Integer> triple, T9.a<? super J5.a<? extends J5.b, ? extends List<? extends CardTransactionDomain>>> aVar) {
        Triple<? extends String, ? extends Integer, ? extends Integer> triple2 = triple;
        return this.f8358a.t((String) triple2.f23099a, ((Number) triple2.f23100b).intValue(), ((Number) triple2.f23101c).intValue(), aVar);
    }
}
