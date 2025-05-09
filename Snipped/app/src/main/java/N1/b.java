package N1;

import C.v;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.f;

/* compiled from: QueryString.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\u000e"}, d2 = {"LN1/b;", "", "", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.NAME, "b", "getValue", "value", "c", "getComment", "comment", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l3.b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l3.b("value")
    private final String value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l3.b("comment")
    private final String comment = null;

    public b(String str, String str2) {
        this.name = str;
        this.value = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f.b(this.name, bVar.name) && f.b(this.value, bVar.value) && f.b(this.comment, bVar.comment);
    }

    public final int hashCode() {
        int c2 = v.c(this.name.hashCode() * 31, 31, this.value);
        String str = this.comment;
        return c2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.value;
        return androidx.camera.core.impl.utils.a.n(s3.b.p("QueryString(name=", str, ", value=", str2, ", comment="), this.comment, ")");
    }
}
