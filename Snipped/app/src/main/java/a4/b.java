package a4;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AddContractorsRequestRaw.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("contractors_outgoing")
    private final List<a> f4265a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("contractors_incoming")
    private final List<a> f4266b;

    /* compiled from: AddContractorsRequestRaw.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l3.b(AppMeasurementSdk.ConditionalUserProperty.NAME)
        private final String f4267a;

        /* renamed from: b, reason: collision with root package name */
        @l3.b("country_incorporation")
        private final String f4268b;

        /* renamed from: c, reason: collision with root package name */
        @l3.b("business_description")
        private final String f4269c;

        /* renamed from: d, reason: collision with root package name */
        @l3.b("info")
        private final String f4270d;

        public a(String str, String str2, String str3, String str4) {
            this.f4267a = str;
            this.f4268b = str2;
            this.f4269c = str3;
            this.f4270d = str4;
        }
    }

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.f4265a = arrayList;
        this.f4266b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.f.b(this.f4265a, bVar.f4265a) && kotlin.jvm.internal.f.b(this.f4266b, bVar.f4266b);
    }

    public final int hashCode() {
        List<a> list = this.f4265a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<a> list2 = this.f4266b;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "AddContractorsRequestRaw(contractorsOutgoing=" + this.f4265a + ", contractorsIncoming=" + this.f4266b + ")";
    }
}
