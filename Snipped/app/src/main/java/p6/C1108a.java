package p6;

import com.luminary.business.domain.entity.templates.CheckRequisitesDomain;
import kotlin.Triple;

/* compiled from: CheckRequisitesUseCase.kt */
/* renamed from: p6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1108a extends com.luminary.business.domain.functional.a<CheckRequisitesDomain, Triple<? extends Integer, ? extends String, ? extends String>> {

    /* renamed from: a, reason: collision with root package name */
    public final Y5.a f25688a;

    public C1108a(Y5.a aVar) {
        this.f25688a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.domain.functional.a
    public final Object b(Triple<? extends Integer, ? extends String, ? extends String> triple, T9.a<? super J5.a<? extends J5.b, ? extends CheckRequisitesDomain>> aVar) {
        Triple<? extends Integer, ? extends String, ? extends String> triple2 = triple;
        return this.f25688a.a((Integer) triple2.f23099a, (String) triple2.f23100b, (String) triple2.f23101c, aVar);
    }
}
