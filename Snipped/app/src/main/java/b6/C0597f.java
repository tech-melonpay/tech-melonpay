package b6;

import kotlin.Triple;

/* compiled from: CreateVirtualCardUseCase.kt */
/* renamed from: b6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0597f extends com.luminary.business.domain.functional.a<t5.j, Triple<? extends String, ? extends String, ? extends t5.c>> {

    /* renamed from: a, reason: collision with root package name */
    public final M5.a f8348a;

    public C0597f(M5.a aVar) {
        this.f8348a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Triple<? extends String, ? extends String, ? extends t5.c> triple, T9.a<? super J5.a<? extends J5.b, ? extends t5.j>> aVar) {
        Triple<? extends String, ? extends String, ? extends t5.c> triple2 = triple;
        return this.f8348a.c((String) triple2.f23099a, (String) triple2.f23100b, (t5.c) triple2.f23101c, aVar);
    }
}
