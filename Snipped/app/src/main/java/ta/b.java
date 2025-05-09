package ta;

import kotlinx.serialization.json.internal.AbstractJsonTreeEncoder;
import qa.AbstractC1141a;

/* compiled from: TreeJsonEncoder.kt */
/* loaded from: classes2.dex */
public final class b extends AbstractC1141a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29976a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractJsonTreeEncoder f29977b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29978c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f29979d;

    public b(AbstractJsonTreeEncoder abstractJsonTreeEncoder, String str) {
        this.f29977b = abstractJsonTreeEncoder;
        this.f29978c = str;
        this.f29979d = abstractJsonTreeEncoder.f23378b.f27066b;
    }

    @Override // qa.AbstractC1141a, qa.InterfaceC1145e
    public void B(long j10) {
        switch (this.f29976a) {
            case 1:
                I(Long.toUnsignedString(j10));
                break;
            default:
                super.B(j10);
                break;
        }
    }

    @Override // qa.AbstractC1141a, qa.InterfaceC1145e
    public void F(String str) {
        switch (this.f29976a) {
            case 0:
                this.f29977b.W(this.f29978c, new sa.l(str, false, (pa.f) this.f29979d));
                break;
            default:
                super.F(str);
                break;
        }
    }

    public void I(String str) {
        this.f29977b.W(this.f29978c, new sa.l(str, false, null));
    }

    @Override // qa.InterfaceC1145e
    public final Y8.a a() {
        switch (this.f29976a) {
            case 0:
                return this.f29977b.f23378b.f27066b;
            default:
                return (Y8.a) this.f29979d;
        }
    }

    @Override // qa.AbstractC1141a, qa.InterfaceC1145e
    public void h(short s10) {
        switch (this.f29976a) {
            case 1:
                I(String.valueOf(s10 & 65535));
                break;
            default:
                super.h(s10);
                break;
        }
    }

    @Override // qa.AbstractC1141a, qa.InterfaceC1145e
    public void i(byte b9) {
        switch (this.f29976a) {
            case 1:
                I(String.valueOf(b9 & 255));
                break;
            default:
                super.i(b9);
                break;
        }
    }

    @Override // qa.AbstractC1141a, qa.InterfaceC1145e
    public void y(int i) {
        switch (this.f29976a) {
            case 1:
                I(Integer.toUnsignedString(i));
                break;
            default:
                super.y(i);
                break;
        }
    }

    public b(AbstractJsonTreeEncoder abstractJsonTreeEncoder, String str, pa.f fVar) {
        this.f29977b = abstractJsonTreeEncoder;
        this.f29978c = str;
        this.f29979d = fVar;
    }
}
