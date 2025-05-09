package b6;

import com.luminary.business.domain.entity.account.CardsDomain;
import java.util.List;
import kotlin.Triple;

/* compiled from: GetCardsUseCase.kt */
/* loaded from: classes.dex */
public final class k extends com.luminary.business.domain.functional.a<List<? extends CardsDomain>, Triple<? extends String, ? extends Integer, ? extends Boolean>> {

    /* renamed from: a, reason: collision with root package name */
    public final M5.a f8353a;

    public k(M5.a aVar) {
        this.f8353a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Triple<? extends String, ? extends Integer, ? extends Boolean> triple, T9.a<? super J5.a<? extends J5.b, ? extends List<? extends CardsDomain>>> aVar) {
        Triple<? extends String, ? extends Integer, ? extends Boolean> triple2 = triple;
        return this.f8353a.g((String) triple2.f23099a, (Integer) triple2.f23100b, (Boolean) triple2.f23101c, aVar);
    }
}
