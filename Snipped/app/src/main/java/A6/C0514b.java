package a6;

import com.luminary.business.domain.entity.account.BankAccountDomain;
import kotlin.Triple;

/* compiled from: EditAccountUseCase.kt */
/* renamed from: a6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0514b extends com.luminary.business.domain.functional.a<BankAccountDomain, Triple<? extends String, ? extends String, ? extends s5.h>> {

    /* renamed from: a, reason: collision with root package name */
    public final L5.a f4453a;

    public C0514b(L5.a aVar) {
        this.f4453a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Triple<? extends String, ? extends String, ? extends s5.h> triple, T9.a<? super J5.a<? extends J5.b, ? extends BankAccountDomain>> aVar) {
        Triple<? extends String, ? extends String, ? extends s5.h> triple2 = triple;
        return this.f4453a.c((String) triple2.f23099a, (String) triple2.f23100b, (s5.h) triple2.f23101c, aVar);
    }
}
