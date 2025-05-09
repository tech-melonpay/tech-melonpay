package a8;

import O9.p;
import android.os.Build;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.entity.company.UploadFileUI;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.fragments.newcompany.upload.UploadAdditionalDocumentsFragment;
import com.luminary.business.presentation.utils.filepiker.FilePickerContractor;
import java.util.Date;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* renamed from: a8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0520a implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4471a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UploadAdditionalDocumentsFragment f4472b;

    public /* synthetic */ C0520a(UploadAdditionalDocumentsFragment uploadAdditionalDocumentsFragment, int i) {
        this.f4471a = i;
        this.f4472b = uploadAdditionalDocumentsFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f4471a) {
            case 0:
                this.f4472b.f12704p0.a(FilePickerContractor.FileTypeEnum.Image);
                break;
            case 1:
                int i = Build.VERSION.SDK_INT;
                UploadAdditionalDocumentsFragment uploadAdditionalDocumentsFragment = this.f4472b;
                if (i < 29) {
                    uploadAdditionalDocumentsFragment.f12708u0.a("android.permission.WRITE_EXTERNAL_STORAGE");
                } else {
                    uploadAdditionalDocumentsFragment.f12709v0.a("android.permission.CAMERA");
                }
                break;
            case 2:
                UploadAdditionalDocumentsFragment uploadAdditionalDocumentsFragment2 = this.f4472b;
                uploadAdditionalDocumentsFragment2.getClass();
                F8.e.a(uploadAdditionalDocumentsFragment2, null, new C0520a(uploadAdditionalDocumentsFragment2, 4), new C0520a(uploadAdditionalDocumentsFragment2, 0), new C0520a(uploadAdditionalDocumentsFragment2, 1));
                break;
            case 3:
                UploadAdditionalDocumentsFragment uploadAdditionalDocumentsFragment3 = this.f4472b;
                String str = uploadAdditionalDocumentsFragment3.f12706r0;
                if (str != null) {
                    String valueOf = String.valueOf(uploadAdditionalDocumentsFragment3.u0().f28183r.getText());
                    NewCompanyViewModel.UploadFileType uploadFileType = NewCompanyViewModel.UploadFileType.i;
                    String valueOf2 = String.valueOf(uploadAdditionalDocumentsFragment3.u0().f28179n.getText());
                    Date date = uploadAdditionalDocumentsFragment3.s0;
                    r1 = new UploadFileUI(str, valueOf, uploadFileType, valueOf2, date != null ? Long.valueOf(date.getTime()) : null, uploadAdditionalDocumentsFragment3.f12705q0, Boolean.FALSE);
                }
                uploadAdditionalDocumentsFragment3.getParentFragmentManager().f0("additional_document", t0.c.b(new Pair("document", r1)));
                uploadAdditionalDocumentsFragment3.requireActivity().getOnBackPressedDispatcher().d();
                break;
            default:
                this.f4472b.f12704p0.a(FilePickerContractor.FileTypeEnum.PDF);
                break;
        }
        return p.f3034a;
    }
}
