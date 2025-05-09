package o6;

import kotlin.Triple;

/* compiled from: DownloadInvoiceUseCase.kt */
/* loaded from: classes.dex */
public final class d extends com.luminary.business.domain.functional.a<String, Triple<? extends String, ? extends String, ? extends Boolean>> {

    /* renamed from: a, reason: collision with root package name */
    public final X5.a f24380a;

    public d(X5.a aVar) {
        this.f24380a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Triple<? extends String, ? extends String, ? extends Boolean> triple, T9.a<? super J5.a<? extends J5.b, ? extends String>> aVar) {
        Triple<? extends String, ? extends String, ? extends Boolean> triple2 = triple;
        return this.f24380a.b((String) triple2.f23099a, (String) triple2.f23100b, ((Boolean) triple2.f23101c).booleanValue(), aVar);
    }
}
