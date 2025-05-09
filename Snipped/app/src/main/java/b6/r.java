package b6;

import java.util.List;
import kotlin.Pair;

/* compiled from: GetTransactionsByCards.kt */
/* loaded from: classes.dex */
public final class r extends com.luminary.business.domain.functional.a<List<? extends F5.b>, Pair<? extends String, ? extends String>> {

    /* renamed from: a, reason: collision with root package name */
    public final M5.a f8360a;

    public r(M5.a aVar) {
        this.f8360a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends String> pair, T9.a<? super J5.a<? extends J5.b, ? extends List<? extends F5.b>>> aVar) {
        Pair<? extends String, ? extends String> pair2 = pair;
        return this.f8360a.h((String) pair2.f23089a, (String) pair2.f23090b, aVar);
    }
}
