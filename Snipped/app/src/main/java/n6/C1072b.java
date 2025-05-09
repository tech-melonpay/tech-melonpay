package n6;

import java.util.List;

/* compiled from: GetDeviceListUseCase.kt */
/* renamed from: n6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1072b extends com.luminary.business.domain.functional.a<List<? extends E5.a>, String> {

    /* renamed from: a, reason: collision with root package name */
    public final W5.a f24244a;

    public C1072b(W5.a aVar) {
        this.f24244a = aVar;
    }

    @Override // com.luminary.business.domain.functional.a
    public final Object b(String str, T9.a<? super J5.a<? extends J5.b, ? extends List<? extends E5.a>>> aVar) {
        return this.f24244a.d(str, aVar);
    }
}
