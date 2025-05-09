package i6;

import kotlin.Triple;
import z5.d;

/* compiled from: UpdateLimitUseCase.kt */
/* renamed from: i6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0825c extends com.luminary.business.domain.functional.a<z5.c, Triple<? extends String, ? extends Integer, ? extends d>> {

    /* renamed from: a, reason: collision with root package name */
    public final M5.a f21482a;

    public C0825c(M5.a aVar) {
        this.f21482a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Triple<? extends String, ? extends Integer, ? extends d> triple, T9.a<? super J5.a<? extends J5.b, ? extends z5.c>> aVar) {
        Triple<? extends String, ? extends Integer, ? extends d> triple2 = triple;
        return this.f21482a.u((String) triple2.f23099a, ((Number) triple2.f23100b).intValue(), (d) triple2.f23101c, aVar);
    }
}
