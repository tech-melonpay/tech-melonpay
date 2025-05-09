package a8;

import O9.p;
import P9.m;
import android.os.Build;
import android.os.Bundle;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.entity.company.CompanyDetailsUI;
import com.luminary.business.presentation.entity.company.UploadFileUI;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.fragments.newcompany.upload.UploadDocumentsFragment;
import com.luminary.business.presentation.utils.filepiker.FilePickerContractor;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* renamed from: a8.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0524e implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UploadDocumentsFragment f4480b;

    public /* synthetic */ C0524e(UploadDocumentsFragment uploadDocumentsFragment, int i) {
        this.f4479a = i;
        this.f4480b = uploadDocumentsFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        CompanyDetailsUI companyDetailsUI;
        CompanyDetailsUI.CompanyUI companyUI;
        Integer num;
        UploadFileUI uploadFileUI;
        UploadFileUI uploadFileUI2;
        CompanyDetailsUI companyDetailsUI2;
        CompanyDetailsUI.CompanyUI companyUI2;
        Integer num2;
        String num3;
        switch (this.f4479a) {
            case 0:
                UploadDocumentsFragment uploadDocumentsFragment = this.f4480b;
                uploadDocumentsFragment.X0(uploadDocumentsFragment.getString(R.string.certified_corporate_documents_title), uploadDocumentsFragment.getString(R.string.certified_certificate_of_incorporation_or_equivalent));
                return p.f3034a;
            case 1:
                UploadDocumentsFragment uploadDocumentsFragment2 = this.f4480b;
                uploadDocumentsFragment2.X0(uploadDocumentsFragment2.getString(R.string.certified_corporate_documents_title), uploadDocumentsFragment2.getString(R.string.certified_certificate_of_incorporation_or_equivalent));
                return p.f3034a;
            case 2:
                UploadDocumentsFragment uploadDocumentsFragment3 = this.f4480b;
                uploadDocumentsFragment3.X0(uploadDocumentsFragment3.getString(R.string.certified_corporate_documents_title), uploadDocumentsFragment3.getString(R.string.certified_articles_of_association_or_jurisdictional_equivalent));
                return p.f3034a;
            case 3:
                UploadDocumentsFragment uploadDocumentsFragment4 = this.f4480b;
                uploadDocumentsFragment4.X0(uploadDocumentsFragment4.getString(R.string.certified_corporate_documents_title), uploadDocumentsFragment4.getString(R.string.certified_articles_of_association_or_jurisdictional_equivalent));
                return p.f3034a;
            case 4:
                UploadDocumentsFragment uploadDocumentsFragment5 = this.f4480b;
                uploadDocumentsFragment5.X0(uploadDocumentsFragment5.getString(R.string.company_proof_of_address), uploadDocumentsFragment5.getString(R.string.company_proof_of_address_description));
                return p.f3034a;
            case 5:
                UploadDocumentsFragment uploadDocumentsFragment6 = this.f4480b;
                uploadDocumentsFragment6.X0(uploadDocumentsFragment6.getString(R.string.company_proof_of_address), uploadDocumentsFragment6.getString(R.string.company_proof_of_address_description));
                return p.f3034a;
            case 6:
                NewCompanyViewModel.UploadFileType uploadFileType = NewCompanyViewModel.UploadFileType.f12462b;
                UploadDocumentsFragment uploadDocumentsFragment7 = this.f4480b;
                uploadDocumentsFragment7.f12726r0 = uploadFileType;
                uploadDocumentsFragment7.W0();
                return p.f3034a;
            case 7:
                NewCompanyViewModel.UploadFileType uploadFileType2 = NewCompanyViewModel.UploadFileType.f12463c;
                UploadDocumentsFragment uploadDocumentsFragment8 = this.f4480b;
                uploadDocumentsFragment8.f12726r0 = uploadFileType2;
                uploadDocumentsFragment8.W0();
                return p.f3034a;
            case 8:
                NewCompanyViewModel.UploadFileType uploadFileType3 = NewCompanyViewModel.UploadFileType.f12464d;
                UploadDocumentsFragment uploadDocumentsFragment9 = this.f4480b;
                uploadDocumentsFragment9.f12726r0 = uploadFileType3;
                uploadDocumentsFragment9.W0();
                return p.f3034a;
            case 9:
                NewCompanyViewModel.UploadFileType uploadFileType4 = NewCompanyViewModel.UploadFileType.f12461a;
                UploadDocumentsFragment uploadDocumentsFragment10 = this.f4480b;
                uploadDocumentsFragment10.f12726r0 = uploadFileType4;
                uploadDocumentsFragment10.W0();
                return p.f3034a;
            case 10:
                NewCompanyViewModel.UploadFileType uploadFileType5 = NewCompanyViewModel.UploadFileType.f12465e;
                UploadDocumentsFragment uploadDocumentsFragment11 = this.f4480b;
                uploadDocumentsFragment11.f12726r0 = uploadFileType5;
                uploadDocumentsFragment11.W0();
                return p.f3034a;
            case 11:
                UploadDocumentsFragment uploadDocumentsFragment12 = this.f4480b;
                com.luminary.business.presentation.ui.fragments.newcompany.upload.a aVar = uploadDocumentsFragment12.f12725q0;
                if (aVar != null && (companyDetailsUI = aVar.f12739a) != null && (companyUI = companyDetailsUI.f11192a) != null && (num = companyUI.f11218a) != null) {
                    int intValue = num.intValue();
                    UploadFileUI uploadFileUI3 = uploadDocumentsFragment12.s0;
                    if (uploadFileUI3 != null && (uploadFileUI = uploadDocumentsFragment12.f12727t0) != null && (uploadFileUI2 = uploadDocumentsFragment12.f12730w0) != null) {
                        ArrayList<UploadFileUI> arrayList = uploadDocumentsFragment12.f12733z0;
                        arrayList.clear();
                        ArrayList n10 = m.n(uploadFileUI3, uploadFileUI, uploadFileUI2);
                        UploadFileUI uploadFileUI4 = uploadDocumentsFragment12.f12728u0;
                        if (uploadFileUI4 != null) {
                            n10.add(uploadFileUI4);
                        }
                        UploadFileUI uploadFileUI5 = uploadDocumentsFragment12.f12729v0;
                        if (uploadFileUI5 != null) {
                            n10.add(uploadFileUI5);
                        }
                        arrayList.addAll(n10);
                        NewCompanyViewModel T02 = uploadDocumentsFragment12.T0();
                        String valueOf = String.valueOf(intValue);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : n10) {
                            if (!kotlin.jvm.internal.f.b(((UploadFileUI) obj).f11321g, Boolean.TRUE)) {
                                arrayList2.add(obj);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            T02.f12450p1.setValue(null);
                        }
                        Iterator it = arrayList2.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i9 = i + 1;
                            if (i < 0) {
                                m.t();
                                throw null;
                            }
                            T02.l0(valueOf, (UploadFileUI) next, new A7.c(7, arrayList2, T02));
                            i = i9;
                        }
                    }
                }
                return p.f3034a;
            case 12:
                UploadDocumentsFragment uploadDocumentsFragment13 = this.f4480b;
                com.luminary.business.presentation.ui.fragments.newcompany.upload.a aVar2 = uploadDocumentsFragment13.f12725q0;
                if (aVar2 != null && (companyDetailsUI2 = aVar2.f12739a) != null && (companyUI2 = companyDetailsUI2.f11192a) != null && (num2 = companyUI2.f11218a) != null && (num3 = num2.toString()) != null) {
                    NavController g10 = U4.b.g(uploadDocumentsFragment13);
                    g10.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("companyId", num3);
                    g10.i(R.id.action_uploadDocumentsFragment_to_uploadAdditionalDocumentsFragment, bundle);
                }
                return p.f3034a;
            case 13:
                this.f4480b.f12724p0.a(FilePickerContractor.FileTypeEnum.PDF);
                return p.f3034a;
            case 14:
                this.f4480b.f12724p0.a(FilePickerContractor.FileTypeEnum.Image);
                return p.f3034a;
            case 15:
                int i10 = Build.VERSION.SDK_INT;
                UploadDocumentsFragment uploadDocumentsFragment14 = this.f4480b;
                if (i10 < 29) {
                    uploadDocumentsFragment14.f12719C0.a("android.permission.WRITE_EXTERNAL_STORAGE");
                } else {
                    uploadDocumentsFragment14.f12720D0.a("android.permission.CAMERA");
                }
                return p.f3034a;
            default:
                androidx.appcompat.app.b bVar = this.f4480b.f12731x0;
                if (bVar != null) {
                    bVar.dismiss();
                }
                return p.f3034a;
        }
    }
}
