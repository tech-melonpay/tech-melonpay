package b6;

import com.luminary.business.domain.entity.cards.VaultDomain;
import kotlin.Pair;
import t5.C1280a;

/* compiled from: CreateCardAndVaultUseCase.kt */
/* renamed from: b6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0595d extends com.luminary.business.domain.functional.a<VaultDomain, Pair<? extends String, ? extends C1280a>> {

    /* renamed from: a, reason: collision with root package name */
    public final M5.a f8346a;

    public C0595d(M5.a aVar) {
        this.f8346a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends C1280a> pair, T9.a<? super J5.a<? extends J5.b, ? extends VaultDomain>> aVar) {
        Pair<? extends String, ? extends C1280a> pair2 = pair;
        return this.f8346a.n((String) pair2.f23089a, (C1280a) pair2.f23090b, aVar);
    }
}
