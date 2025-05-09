package b6;

import com.luminary.business.domain.entity.cards.VaultDomain;
import java.util.List;

/* compiled from: GetVaultsUseCase.kt */
/* loaded from: classes.dex */
public final class s extends com.luminary.business.domain.functional.a<List<? extends VaultDomain>, String> {

    /* renamed from: a, reason: collision with root package name */
    public final M5.a f8361a;

    public s(M5.a aVar) {
        this.f8361a = aVar;
    }

    @Override // com.luminary.business.domain.functional.a
    public final Object b(String str, T9.a<? super J5.a<? extends J5.b, ? extends List<? extends VaultDomain>>> aVar) {
        return this.f8361a.r(str, aVar);
    }
}
