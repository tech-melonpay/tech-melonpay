package m6;

import kotlin.Pair;

/* compiled from: ValidateTFACodeUseCase.kt */
/* renamed from: m6.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1032D extends com.luminary.business.domain.functional.a<Object, Pair<? extends I5.r, ? extends String>> {

    /* renamed from: a, reason: collision with root package name */
    public final V5.a f23928a;

    public C1032D(V5.a aVar) {
        this.f23928a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends I5.r, ? extends String> pair, T9.a<? super J5.a<? extends J5.b, ? extends Object>> aVar) {
        Pair<? extends I5.r, ? extends String> pair2 = pair;
        String a10 = ((I5.r) pair2.f23089a).a();
        return this.f23928a.i(((I5.r) pair2.f23089a).b(), aVar, a10, (String) pair2.f23090b);
    }
}
