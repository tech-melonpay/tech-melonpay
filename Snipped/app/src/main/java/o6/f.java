package o6;

import kotlin.Triple;

/* compiled from: DownloadStatementForTransactionUseCase.kt */
/* loaded from: classes.dex */
public final class f extends com.luminary.business.domain.functional.a<String, Triple<? extends String, ? extends String, ? extends String>> {

    /* renamed from: a, reason: collision with root package name */
    public final X5.a f24382a;

    public f(X5.a aVar) {
        this.f24382a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Triple<? extends String, ? extends String, ? extends String> triple, T9.a<? super J5.a<? extends J5.b, ? extends String>> aVar) {
        Triple<? extends String, ? extends String, ? extends String> triple2 = triple;
        return this.f24382a.c((String) triple2.f23099a, (String) triple2.f23100b, (String) triple2.f23101c, aVar);
    }
}
