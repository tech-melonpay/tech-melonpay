package G3;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class h implements zzeh {

    /* renamed from: b, reason: collision with root package name */
    public static final h f1314b = new h(0);

    /* renamed from: c, reason: collision with root package name */
    public static final h f1315c = new h(1);

    /* renamed from: d, reason: collision with root package name */
    public static final h f1316d = new h(2);

    /* renamed from: e, reason: collision with root package name */
    public static final h f1317e = new h(3);

    /* renamed from: f, reason: collision with root package name */
    public static final h f1318f = new h(4);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1319a;

    public /* synthetic */ h(int i) {
        this.f1319a = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final boolean zza(int i) {
        switch (this.f1319a) {
            case 0:
                if (i == 0 || i == 1 || i == 2) {
                }
                break;
            case 1:
                if (i == 0 || i == 1 || i == 2 || i == 3) {
                }
                break;
            case 2:
                if (m.a(i) != 0) {
                }
                break;
            case 3:
                if (m.b(i) != 0) {
                }
                break;
            default:
                if (i == 0 || i == 1 || i == 2) {
                }
                break;
        }
        return true;
    }
}
