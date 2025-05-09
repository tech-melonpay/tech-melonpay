package c6;

import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import kotlin.Pair;

/* compiled from: AddAdditionalInfoUseCase.kt */
/* renamed from: c6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0626a extends com.luminary.business.domain.functional.a<CorporateDetailsDomain, Pair<? extends String, ? extends u5.c>> {

    /* renamed from: a, reason: collision with root package name */
    public final N5.a f8565a;

    public C0626a(N5.a aVar) {
        this.f8565a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends u5.c> pair, T9.a<? super J5.a<? extends J5.b, ? extends CorporateDetailsDomain>> aVar) {
        Pair<? extends String, ? extends u5.c> pair2 = pair;
        return this.f8565a.g((String) pair2.f23089a, (u5.c) pair2.f23090b, aVar);
    }
}
