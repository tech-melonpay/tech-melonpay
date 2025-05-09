package E7;

import O9.p;
import android.os.Build;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.fragments.invoices.invoice_details.InvoiceDetailsFragment;
import com.luminary.business.presentation.utils.filepiker.FilePickerContractor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InvoiceDetailsFragment f1072b;

    public /* synthetic */ b(InvoiceDetailsFragment invoiceDetailsFragment, int i) {
        this.f1071a = i;
        this.f1072b = invoiceDetailsFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        String str;
        switch (this.f1071a) {
            case 0:
                this.f1072b.f12303q0.a(FilePickerContractor.FileTypeEnum.PDF);
                break;
            case 1:
                this.f1072b.f12303q0.a(FilePickerContractor.FileTypeEnum.Image);
                break;
            case 2:
                int i = Build.VERSION.SDK_INT;
                InvoiceDetailsFragment invoiceDetailsFragment = this.f1072b;
                if (i < 29) {
                    invoiceDetailsFragment.s0.a("android.permission.WRITE_EXTERNAL_STORAGE");
                } else {
                    invoiceDetailsFragment.f12305t0.a("android.permission.CAMERA");
                }
                break;
            case 3:
                InvoiceDetailsFragment invoiceDetailsFragment2 = this.f1072b;
                F5.b value = invoiceDetailsFragment2.T0().f1093Y0.getValue();
                if (value != null && (str = value.f1188a) != null) {
                    h T02 = invoiceDetailsFragment2.T0();
                    T02.getClass();
                    e eVar = new e(T02, str, 1);
                    T02.f418J0 = eVar;
                    eVar.invoke();
                }
                invoiceDetailsFragment2.getParentFragmentManager().f0("invoice_detail", t0.c.a());
                break;
            case 4:
                InvoiceDetailsFragment invoiceDetailsFragment3 = this.f1072b;
                invoiceDetailsFragment3.V0();
                invoiceDetailsFragment3.getParentFragmentManager().f0("invoice_detail", t0.c.a());
                break;
            case 5:
                InvoiceDetailsFragment invoiceDetailsFragment4 = this.f1072b;
                String value2 = invoiceDetailsFragment4.T0().f1094Z0.getValue();
                if (value2 != null) {
                    invoiceDetailsFragment4.N0(value2, new B6.g(0));
                }
                break;
            default:
                InvoiceDetailsFragment invoiceDetailsFragment5 = this.f1072b;
                invoiceDetailsFragment5.V0();
                invoiceDetailsFragment5.getParentFragmentManager().f0("invoice_detail", t0.c.a());
                break;
        }
        return p.f3034a;
    }
}
