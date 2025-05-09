package m6;

import kotlin.Pair;

/* compiled from: AddTFAUseCase.kt */
/* renamed from: m6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1033a extends com.luminary.business.domain.functional.a<Object, Pair<? extends String, ? extends I5.a>> {

    /* renamed from: a, reason: collision with root package name */
    public final V5.a f23929a;

    public C1033a(V5.a aVar) {
        this.f23929a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends I5.a> pair, T9.a<? super J5.a<? extends J5.b, ? extends Object>> aVar) {
        Pair<? extends String, ? extends I5.a> pair2 = pair;
        return this.f23929a.a((String) pair2.f23089a, (I5.a) pair2.f23090b, aVar);
    }
}
