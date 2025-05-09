package b6;

import com.luminary.business.domain.entity.account.CardsDomain;
import kotlin.Pair;

/* compiled from: FreezCardUseCase.kt */
/* renamed from: b6.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0600i extends com.luminary.business.domain.functional.a<CardsDomain, Pair<? extends String, ? extends String>> {

    /* renamed from: a, reason: collision with root package name */
    public final M5.a f8351a;

    public C0600i(M5.a aVar) {
        this.f8351a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends String> pair, T9.a<? super J5.a<? extends J5.b, ? extends CardsDomain>> aVar) {
        Pair<? extends String, ? extends String> pair2 = pair;
        return this.f8351a.e((String) pair2.f23089a, (String) pair2.f23090b, aVar);
    }
}
