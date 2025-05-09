package O1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import l3.b;
import org.bouncycastle.cms.CMSAttributeTableGenerator;

/* compiled from: Params.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0014"}, d2 = {"LO1/a;", "", "", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.NAME, "b", "getValue", "value", "c", "getFileName", "fileName", "d", "getContentType", CMSAttributeTableGenerator.CONTENT_TYPE, "e", "getComment", "comment", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("value")
    private final String value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("fileName")
    private final String fileName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @b(CMSAttributeTableGenerator.CONTENT_TYPE)
    private final String contentType;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @b("comment")
    private final String comment;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.name, aVar.name) && f.b(this.value, aVar.value) && f.b(this.fileName, aVar.fileName) && f.b(this.contentType, aVar.contentType) && f.b(this.comment, aVar.comment);
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.value;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fileName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contentType;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.comment;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.value;
        String str3 = this.fileName;
        String str4 = this.contentType;
        String str5 = this.comment;
        StringBuilder p10 = s3.b.p("Params(name=", str, ", value=", str2, ", fileName=");
        androidx.camera.core.impl.utils.a.u(p10, str3, ", contentType=", str4, ", comment=");
        return androidx.camera.core.impl.utils.a.n(p10, str5, ")");
    }
}
