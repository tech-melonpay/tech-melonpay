package q6;

import com.luminary.business.domain.entity.templates.GetTemplatesDomain;
import java.util.List;

/* compiled from: GetTransferTemplatesUseCase.kt */
/* renamed from: q6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1134b extends com.luminary.business.domain.functional.a<List<? extends H5.b>, GetTemplatesDomain> {

    /* renamed from: a, reason: collision with root package name */
    public final Y5.a f25884a;

    public C1134b(Y5.a aVar) {
        this.f25884a = aVar;
    }

    @Override // com.luminary.business.domain.functional.a
    public final Object b(GetTemplatesDomain getTemplatesDomain, T9.a<? super J5.a<? extends J5.b, ? extends List<? extends H5.b>>> aVar) {
        return this.f25884a.c(getTemplatesDomain, aVar);
    }
}
