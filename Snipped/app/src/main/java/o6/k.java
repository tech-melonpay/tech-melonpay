package o6;

import com.luminary.business.domain.Quadruple;

/* compiled from: UploadInvoiceUseCase.kt */
/* loaded from: classes.dex */
public final class k extends com.luminary.business.domain.functional.a<F5.b, Quadruple<? extends String, ? extends String, ? extends String, ? extends String>> {

    /* renamed from: a, reason: collision with root package name */
    public final X5.a f24387a;

    public k(X5.a aVar) {
        this.f24387a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Quadruple<? extends String, ? extends String, ? extends String, ? extends String> quadruple, T9.a<? super J5.a<? extends J5.b, ? extends F5.b>> aVar) {
        Quadruple<? extends String, ? extends String, ? extends String, ? extends String> quadruple2 = quadruple;
        return this.f24387a.f((String) quadruple2.f10683a, (String) quadruple2.f10684b, (String) quadruple2.f10685c, (String) quadruple2.f10686d, aVar);
    }
}
