package m6;

import kotlin.Pair;

/* compiled from: UploadAvatarUseCase.kt */
/* renamed from: m6.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1029A extends com.luminary.business.domain.functional.a<I5.i, Pair<? extends String, ? extends String>> {

    /* renamed from: a, reason: collision with root package name */
    public final V5.a f23925a;

    public C1029A(V5.a aVar) {
        this.f23925a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Pair<? extends String, ? extends String> pair, T9.a<? super J5.a<? extends J5.b, ? extends I5.i>> aVar) {
        Pair<? extends String, ? extends String> pair2 = pair;
        return this.f23925a.r((String) pair2.f23089a, (String) pair2.f23090b, aVar);
    }
}
