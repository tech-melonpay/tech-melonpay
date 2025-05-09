package Y5;

import J5.b;
import com.luminary.business.domain.entity.templates.CheckRequisitesDomain;
import com.luminary.business.domain.entity.templates.CheckTemplatesRequestDomain;
import com.luminary.business.domain.entity.templates.GetTemplatesDomain;
import java.util.List;

/* compiled from: TemplatesRepository.kt */
/* loaded from: classes.dex */
public interface a {
    Object a(Integer num, String str, String str2, T9.a<? super J5.a<? extends b, CheckRequisitesDomain>> aVar);

    Object b(CheckTemplatesRequestDomain checkTemplatesRequestDomain, T9.a<? super J5.a<? extends b, H5.b>> aVar);

    Object c(GetTemplatesDomain getTemplatesDomain, T9.a<? super J5.a<? extends b, ? extends List<H5.b>>> aVar);
}
