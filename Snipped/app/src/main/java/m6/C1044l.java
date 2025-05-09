package m6;

import com.luminary.business.domain.Quintuple;
import java.util.List;

/* compiled from: GetStatisticsUseCase.kt */
/* renamed from: m6.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1044l extends com.luminary.business.domain.functional.a<List<? extends I5.p>, Quintuple<? extends Integer, ? extends String, ? extends String, ? extends String, ? extends Integer>> {

    /* renamed from: a, reason: collision with root package name */
    public final V5.a f23941a;

    public C1044l(V5.a aVar) {
        this.f23941a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Quintuple<? extends Integer, ? extends String, ? extends String, ? extends String, ? extends Integer> quintuple, T9.a<? super J5.a<? extends J5.b, ? extends List<? extends I5.p>>> aVar) {
        Quintuple<? extends Integer, ? extends String, ? extends String, ? extends String, ? extends Integer> quintuple2 = quintuple;
        return this.f23941a.y(((Number) quintuple2.f10687a).intValue(), (String) quintuple2.f10688b, (String) quintuple2.f10689c, (String) quintuple2.f10690d, ((Number) quintuple2.f10691e).intValue(), aVar);
    }
}
