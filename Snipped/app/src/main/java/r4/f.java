package r4;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.messaging.Constants;

/* compiled from: ResetPasswordByCodeRaw.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @l3.b(ProductAction.ACTION_DETAIL)
    private final String f26258a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private final String f26259b;

    public final String a() {
        return this.f26259b;
    }

    public final String b() {
        return this.f26258a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.f.b(this.f26258a, fVar.f26258a) && kotlin.jvm.internal.f.b(this.f26259b, fVar.f26259b);
    }

    public final int hashCode() {
        String str = this.f26258a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26259b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return s3.b.l("ResetPasswordByCodeRaw(detail=", this.f26258a, ", data=", this.f26259b, ")");
    }
}
