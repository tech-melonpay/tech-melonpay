package r5;

import C.v;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.jvm.internal.f;
import r5.C1150a;

/* compiled from: ErrorBodyResponse.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l3.b(Constants.IPC_BUNDLE_KEY_SEND_ERROR)
    private final boolean f26285a = true;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("error_code")
    private final Integer f26286b = null;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("error_key")
    private final String f26287c = "";

    /* renamed from: d, reason: collision with root package name */
    @l3.b(ProductAction.ACTION_DETAIL)
    private final String f26288d = "Token expired";

    /* renamed from: e, reason: collision with root package name */
    @l3.b("errors")
    private final List<C1150a.b> f26289e = null;

    public final Integer a() {
        return this.f26286b;
    }

    public final List<C1150a.b> b() {
        return this.f26289e;
    }

    public final String c() {
        return this.f26288d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f26285a == bVar.f26285a && f.b(this.f26286b, bVar.f26286b) && f.b(this.f26287c, bVar.f26287c) && f.b(this.f26288d, bVar.f26288d) && f.b(this.f26289e, bVar.f26289e);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f26285a) * 31;
        Integer num = this.f26286b;
        int c2 = v.c((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f26287c);
        String str = this.f26288d;
        int hashCode2 = (c2 + (str == null ? 0 : str.hashCode())) * 31;
        List<C1150a.b> list = this.f26289e;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        boolean z10 = this.f26285a;
        Integer num = this.f26286b;
        String str = this.f26287c;
        String str2 = this.f26288d;
        List<C1150a.b> list = this.f26289e;
        StringBuilder sb2 = new StringBuilder("ErrorBodyResponseSimple(error=");
        sb2.append(z10);
        sb2.append(", errorNumber=");
        sb2.append(num);
        sb2.append(", errorKey=");
        androidx.camera.core.impl.utils.a.u(sb2, str, ", message=", str2, ", errors=");
        sb2.append(list);
        sb2.append(")");
        return sb2.toString();
    }
}
