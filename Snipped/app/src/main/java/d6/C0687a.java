package d6;

import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import kotlin.Triple;

/* compiled from: CreateCryptoAccountUseCase.kt */
/* renamed from: d6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0687a extends com.luminary.business.domain.functional.a<CryptoAccountDomain, Triple<? extends Integer, ? extends String, ? extends String>> {

    /* renamed from: a, reason: collision with root package name */
    public final O5.a f20438a;

    public C0687a(O5.a aVar) {
        this.f20438a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Triple<? extends Integer, ? extends String, ? extends String> triple, T9.a<? super J5.a<? extends J5.b, ? extends CryptoAccountDomain>> aVar) {
        Triple<? extends Integer, ? extends String, ? extends String> triple2 = triple;
        return this.f20438a.c(((Number) triple2.f23099a).intValue(), aVar, (String) triple2.f23100b, (String) triple2.f23101c);
    }
}
