package X3;

import W3.b;
import com.google.gson.g;
import com.luminary.business.domain.entity.templates.CheckTemplatesRequestDomain;
import com.luminary.business.domain.entity.templates.GetTemplatesDomain;
import o5.InterfaceC1090a;

/* compiled from: TemplatesRemoteDataSource.kt */
/* loaded from: classes.dex */
public final class a implements InterfaceC1090a {

    /* renamed from: a, reason: collision with root package name */
    public final I4.a f4023a;

    /* renamed from: b, reason: collision with root package name */
    public final g f4024b;

    public a(I4.a aVar, g gVar) {
        this.f4023a = aVar;
        this.f4024b = gVar;
    }

    @Override // o5.InterfaceC1090a
    public final J5.a a(GetTemplatesDomain getTemplatesDomain) {
        GetTemplatesDomain.PaymentMethod paymentMethod;
        String str = null;
        String valueOf = String.valueOf(getTemplatesDomain != null ? getTemplatesDomain.f11142a : null);
        String str2 = getTemplatesDomain != null ? getTemplatesDomain.f11143b : null;
        if (getTemplatesDomain != null && (paymentMethod = getTemplatesDomain.f11144c) != null) {
            str = paymentMethod.name();
        }
        return X4.a.a(this.f4023a.i(valueOf, 1000, str2, str), this.f4024b, true, new b(6));
    }

    @Override // o5.InterfaceC1090a
    public final J5.a b(Integer num, String str, String str2) {
        return X4.a.a(this.f4023a.h(String.valueOf(num), str, str2), this.f4024b, true, new b(5));
    }

    @Override // o5.InterfaceC1090a
    public final J5.a c(CheckTemplatesRequestDomain checkTemplatesRequestDomain) {
        return X4.a.a(this.f4023a.c(checkTemplatesRequestDomain.f11137a, checkTemplatesRequestDomain.f11138b, checkTemplatesRequestDomain.f11139c, checkTemplatesRequestDomain.f11140d, checkTemplatesRequestDomain.f11141e), this.f4024b, true, new b(4));
    }
}
