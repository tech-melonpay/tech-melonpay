package a6;

import java.util.List;
import s5.C1205a;

/* compiled from: GetAccountsUseCase.kt */
/* loaded from: classes.dex */
public final class d extends com.luminary.business.domain.functional.a<List<? extends C1205a>, String> {

    /* renamed from: a, reason: collision with root package name */
    public final L5.a f4455a;

    public d(L5.a aVar) {
        this.f4455a = aVar;
    }

    @Override // com.luminary.business.domain.functional.a
    public final Object b(String str, T9.a<? super J5.a<? extends J5.b, ? extends List<? extends C1205a>>> aVar) {
        return this.f4455a.a(str, aVar);
    }
}
