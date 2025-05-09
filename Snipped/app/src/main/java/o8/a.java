package o8;

import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.ui.fragments.statements.domain.StatementsType;
import java.util.Date;
import kotlin.jvm.internal.f;

/* compiled from: StatementsData.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final StatementsType f24394a;

    /* renamed from: b, reason: collision with root package name */
    public Date f24395b = null;

    /* renamed from: c, reason: collision with root package name */
    public Date f24396c = null;

    /* renamed from: d, reason: collision with root package name */
    public String f24397d = null;

    /* renamed from: e, reason: collision with root package name */
    public StatementsSelectorDialog.a f24398e = null;

    public a(StatementsType statementsType) {
        this.f24394a = statementsType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f24394a == aVar.f24394a && f.b(this.f24395b, aVar.f24395b) && f.b(this.f24396c, aVar.f24396c) && f.b(this.f24397d, aVar.f24397d) && f.b(this.f24398e, aVar.f24398e);
    }

    public final int hashCode() {
        int hashCode = this.f24394a.hashCode() * 31;
        Date date = this.f24395b;
        int hashCode2 = (hashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f24396c;
        int hashCode3 = (hashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str = this.f24397d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        StatementsSelectorDialog.a aVar = this.f24398e;
        return hashCode4 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "StatementsData(type=" + this.f24394a + ", fromDate=" + this.f24395b + ", toDate=" + this.f24396c + ", dynamicDate=" + this.f24397d + ", currentDialogModel=" + this.f24398e + ")";
    }
}
