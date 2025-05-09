package i6;

import com.luminary.business.domain.entity.account.CardsDomain;
import kotlin.Triple;
import z5.C1645a;

/* compiled from: LimitsRestrictionUseCase.kt */
/* renamed from: i6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0824b extends com.luminary.business.domain.functional.a<CardsDomain, Triple<? extends String, ? extends Integer, ? extends C1645a>> {

    /* renamed from: a, reason: collision with root package name */
    public final M5.a f21481a;

    public C0824b(M5.a aVar) {
        this.f21481a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Triple<? extends String, ? extends Integer, ? extends C1645a> triple, T9.a<? super J5.a<? extends J5.b, ? extends CardsDomain>> aVar) {
        Triple<? extends String, ? extends Integer, ? extends C1645a> triple2 = triple;
        return this.f21481a.x((String) triple2.f23099a, ((Number) triple2.f23100b).intValue(), (C1645a) triple2.f23101c, aVar);
    }
}
