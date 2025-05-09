package W4;

import com.luminary.business.domain.entity.templates.CheckRequisitesDomain;
import com.luminary.business.domain.entity.templates.CheckTemplatesRequestDomain;
import com.luminary.business.domain.entity.templates.GetTemplatesDomain;
import java.util.List;
import o5.InterfaceC1090a;

/* compiled from: TemplatesRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class m implements Y5.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1090a f3825a;

    public m(InterfaceC1090a interfaceC1090a) {
        this.f3825a = interfaceC1090a;
    }

    @Override // Y5.a
    public final Object a(Integer num, String str, String str2, T9.a<? super J5.a<? extends J5.b, CheckRequisitesDomain>> aVar) {
        return this.f3825a.b(num, str, str2);
    }

    @Override // Y5.a
    public final Object b(CheckTemplatesRequestDomain checkTemplatesRequestDomain, T9.a<? super J5.a<? extends J5.b, H5.b>> aVar) {
        return this.f3825a.c(checkTemplatesRequestDomain);
    }

    @Override // Y5.a
    public final Object c(GetTemplatesDomain getTemplatesDomain, T9.a<? super J5.a<? extends J5.b, ? extends List<H5.b>>> aVar) {
        return this.f3825a.a(getTemplatesDomain);
    }
}
