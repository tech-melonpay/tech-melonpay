package E3;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements ComponentFactory {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b f1045b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b f1046c = new b(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1047a;

    public /* synthetic */ b(int i) {
        this.f1047a = i;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f1047a) {
            case 0:
                return new d((A3.g) componentContainer.get(A3.g.class));
            default:
                return new c();
        }
    }
}
