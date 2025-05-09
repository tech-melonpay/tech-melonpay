package S1;

import ca.InterfaceC0646l;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f3340a;

    public /* synthetic */ e(boolean z10) {
        this.f3340a = z10;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        I1.a aVar = (I1.a) obj;
        if (this.f3340a) {
            return s3.b.l("<b> ", aVar.getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String(), ": </b>", aVar.getValue(), " <br />");
        }
        return aVar.getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String() + ": " + aVar.getValue() + "\n";
    }
}
