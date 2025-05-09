package i2;

import com.google.firebase.encoders.annotations.Encodable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AutoValue_BatchedLogRequest.java */
/* renamed from: i2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0811c extends g {

    /* renamed from: a, reason: collision with root package name */
    public final List<i> f21295a;

    public C0811c(ArrayList arrayList) {
        this.f21295a = arrayList;
    }

    @Override // i2.g
    @Encodable.Field(name = "logRequest")
    public final List<i> a() {
        return this.f21295a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f21295a.equals(((g) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f21295a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f21295a + "}";
    }
}
