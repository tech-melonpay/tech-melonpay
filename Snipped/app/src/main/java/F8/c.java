package F8;

import com.luminary.business.domain.entity.account.CardsDomain;
import java.util.Locale;

/* compiled from: CardsDomainExt.kt */
/* loaded from: classes2.dex */
public final class c {
    public static final boolean a(CardsDomain cardsDomain) {
        String str = cardsDomain.i;
        return kotlin.jvm.internal.f.b(str != null ? str.toLowerCase(Locale.ROOT) : null, "blocked");
    }
}
