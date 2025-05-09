package com.luminary.business.presentation.ui.fragments.newcompany;

import B6.i;
import K5.a;
import O7.b;
import O7.c;
import O7.g;
import O7.j;
import O9.p;
import androidx.lifecycle.C0559z;
import c6.C0626a;
import c6.d;
import c6.e;
import c6.f;
import c6.h;
import c6.l;
import c6.m;
import c6.n;
import c6.o;
import ca.InterfaceC0635a;
import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import com.luminary.business.presentation.entity.company.CompanyDetailsUI;
import com.luminary.business.presentation.entity.company.CreateCompanyUI;
import com.luminary.business.presentation.entity.company.UploadFileUI;
import f6.C0746a;
import h6.C0798a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m6.C1047o;
import u5.e;
import w5.C1572a;

/* compiled from: NewCompanyViewModel.kt */
/* loaded from: classes2.dex */
public final class NewCompanyViewModel extends i {

    /* renamed from: A1, reason: collision with root package name */
    public b f12421A1;

    /* renamed from: B1, reason: collision with root package name */
    public b f12422B1;

    /* renamed from: C1, reason: collision with root package name */
    public g f12423C1;

    /* renamed from: D1, reason: collision with root package name */
    public b f12424D1;

    /* renamed from: E1, reason: collision with root package name */
    public c f12425E1;

    /* renamed from: F1, reason: collision with root package name */
    public c f12426F1;

    /* renamed from: G1, reason: collision with root package name */
    public j f12427G1;

    /* renamed from: H1, reason: collision with root package name */
    public final List<String> f12428H1;

    /* renamed from: T0, reason: collision with root package name */
    public final m f12429T0;

    /* renamed from: U0, reason: collision with root package name */
    public final f f12430U0;

    /* renamed from: V0, reason: collision with root package name */
    public final C0626a f12431V0;

    /* renamed from: W0, reason: collision with root package name */
    public final d f12432W0;

    /* renamed from: X0, reason: collision with root package name */
    public final h f12433X0;

    /* renamed from: Y0, reason: collision with root package name */
    public final n f12434Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public final o f12435Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final c6.j f12436a1;

    /* renamed from: b1, reason: collision with root package name */
    public final C1047o f12437b1;

    /* renamed from: c1, reason: collision with root package name */
    public final e f12438c1;

    /* renamed from: d1, reason: collision with root package name */
    public final c6.b f12439d1;

    /* renamed from: e1, reason: collision with root package name */
    public final l f12440e1;

    /* renamed from: f1, reason: collision with root package name */
    public final C0798a f12441f1;

    /* renamed from: g1, reason: collision with root package name */
    public final c6.c f12442g1;

    /* renamed from: h1, reason: collision with root package name */
    public final C0746a f12443h1;

    /* renamed from: i1, reason: collision with root package name */
    public final a f12444i1;

    /* renamed from: j1, reason: collision with root package name */
    public CreateCompanyUI f12445j1;

    /* renamed from: k1, reason: collision with root package name */
    public CompanyDetailsUI f12446k1;

    /* renamed from: l1, reason: collision with root package name */
    public final C0559z<List<u5.e>> f12447l1 = new C0559z<>();

    /* renamed from: m1, reason: collision with root package name */
    public final J8.d<p> f12448m1 = new J8.d<>();
    public final C0559z<CorporateDetailsDomain> n1;

    /* renamed from: o1, reason: collision with root package name */
    public final C0559z<CorporateDetailsDomain> f12449o1;

    /* renamed from: p1, reason: collision with root package name */
    public final J8.d<UploadFileType> f12450p1;

    /* renamed from: q1, reason: collision with root package name */
    public final C0559z<Boolean> f12451q1;

    /* renamed from: r1, reason: collision with root package name */
    public final C0559z<String> f12452r1;

    /* renamed from: s1, reason: collision with root package name */
    public final C0559z<List<u5.f>> f12453s1;

    /* renamed from: t1, reason: collision with root package name */
    public final J8.d<p> f12454t1;

    /* renamed from: u1, reason: collision with root package name */
    public final J8.d<p> f12455u1;

    /* renamed from: v1, reason: collision with root package name */
    public final C0559z<List<u5.i>> f12456v1;

    /* renamed from: w1, reason: collision with root package name */
    public final C0559z<List<String>> f12457w1;

    /* renamed from: x1, reason: collision with root package name */
    public final C0559z<List<C1572a>> f12458x1;

    /* renamed from: y1, reason: collision with root package name */
    public final C0559z<List<C1572a>> f12459y1;

    /* renamed from: z1, reason: collision with root package name */
    public b f12460z1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewCompanyViewModel.kt */
    public static final class UploadFileType {

        /* renamed from: a, reason: collision with root package name */
        public static final UploadFileType f12461a;

        /* renamed from: b, reason: collision with root package name */
        public static final UploadFileType f12462b;

        /* renamed from: c, reason: collision with root package name */
        public static final UploadFileType f12463c;

        /* renamed from: d, reason: collision with root package name */
        public static final UploadFileType f12464d;

        /* renamed from: e, reason: collision with root package name */
        public static final UploadFileType f12465e;

        /* renamed from: f, reason: collision with root package name */
        public static final UploadFileType f12466f;

        /* renamed from: g, reason: collision with root package name */
        public static final UploadFileType f12467g;

        /* renamed from: h, reason: collision with root package name */
        public static final UploadFileType f12468h;
        public static final UploadFileType i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ UploadFileType[] f12469j;

        /* JADX INFO: Fake field, exist only in values array */
        UploadFileType EF0;

        static {
            UploadFileType uploadFileType = new UploadFileType("CERTIFICATE_INCORPORATION", 0);
            UploadFileType uploadFileType2 = new UploadFileType("MEMORANDUM_OF_ARTICLES", 1);
            UploadFileType uploadFileType3 = new UploadFileType("ANNUAL_RETURN", 2);
            UploadFileType uploadFileType4 = new UploadFileType("STATUTORY_REPORT", 3);
            UploadFileType uploadFileType5 = new UploadFileType("PROOF_OF_ADDRESS", 4);
            f12461a = uploadFileType5;
            UploadFileType uploadFileType6 = new UploadFileType("RESIDENCE_PERMIT", 5);
            UploadFileType uploadFileType7 = new UploadFileType("INCORPORATION_CERT", 6);
            f12462b = uploadFileType7;
            UploadFileType uploadFileType8 = new UploadFileType("INCORPORATION_ARTICLES", 7);
            f12463c = uploadFileType8;
            UploadFileType uploadFileType9 = new UploadFileType("FINANCIAL_STATEMENT", 8);
            f12464d = uploadFileType9;
            UploadFileType uploadFileType10 = new UploadFileType("STATE_REGISTRY", 9);
            f12465e = uploadFileType10;
            UploadFileType uploadFileType11 = new UploadFileType("CURRICULUM_VITAE", 10);
            f12466f = uploadFileType11;
            UploadFileType uploadFileType12 = new UploadFileType("UBO_CV", 11);
            f12467g = uploadFileType12;
            UploadFileType uploadFileType13 = new UploadFileType("UTILITY_BILL", 12);
            f12468h = uploadFileType13;
            UploadFileType uploadFileType14 = new UploadFileType("CUSTOM", 13);
            i = uploadFileType14;
            f12469j = new UploadFileType[]{uploadFileType, uploadFileType2, uploadFileType3, uploadFileType4, uploadFileType5, uploadFileType6, uploadFileType7, uploadFileType8, uploadFileType9, uploadFileType10, uploadFileType11, uploadFileType12, uploadFileType13, uploadFileType14};
        }

        public UploadFileType() {
            throw null;
        }

        public static UploadFileType valueOf(String str) {
            return (UploadFileType) Enum.valueOf(UploadFileType.class, str);
        }

        public static UploadFileType[] values() {
            return (UploadFileType[]) f12469j.clone();
        }
    }

    public NewCompanyViewModel(m mVar, f fVar, C0626a c0626a, d dVar, h hVar, n nVar, o oVar, c6.j jVar, C1047o c1047o, e eVar, c6.b bVar, l lVar, C0798a c0798a, c6.c cVar, C0746a c0746a, a aVar) {
        this.f12429T0 = mVar;
        this.f12430U0 = fVar;
        this.f12431V0 = c0626a;
        this.f12432W0 = dVar;
        this.f12433X0 = hVar;
        this.f12434Y0 = nVar;
        this.f12435Z0 = oVar;
        this.f12436a1 = jVar;
        this.f12437b1 = c1047o;
        this.f12438c1 = eVar;
        this.f12439d1 = bVar;
        this.f12440e1 = lVar;
        this.f12441f1 = c0798a;
        this.f12442g1 = cVar;
        this.f12443h1 = c0746a;
        this.f12444i1 = aVar;
        new C0559z();
        this.n1 = new C0559z<>();
        this.f12449o1 = new C0559z<>();
        this.f12450p1 = new J8.d<>();
        this.f12451q1 = new C0559z<>();
        this.f12452r1 = new C0559z<>();
        this.f12453s1 = new C0559z<>();
        this.f12454t1 = new J8.d<>();
        this.f12455u1 = new J8.d<>();
        this.f12456v1 = new C0559z<>();
        this.f12457w1 = new C0559z<>();
        this.f12458x1 = new C0559z<>();
        this.f12459y1 = new C0559z<>();
        this.f12428H1 = P9.m.q("Airlines air carriers", "Financial institutions", "Electronics stores", "Charitable and social service organizations fundraising", "Game currency", "Auto store", "Home supply store", "Money transfer member financial institution", "Childrens and infants goods", "General merchandise stores", "Utilities", "Books periodicals newspapers", "Digital goods", "Educational services", "Electronic goods", "Health and beauty", "Vouchers", "Clothes shoes and accessories", "Loans fines debts redemption", "Computer software", "Saas", "Food stores", "Entertainment lottos quizes", "Advertising services", "Telecommunication services", "Social networks", "Travel agencies", "Computer network services", "Hosting", "Other services");
    }

    public final void h0() {
        this.f12453s1.postValue(this.f12444i1.f());
    }

    public final String i0(String str) {
        Object obj;
        List<u5.f> value = this.f12453s1.getValue();
        if (value == null) {
            return null;
        }
        Iterator<T> it = value.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.f.b(((u5.f) obj).f30276c, str)) {
                break;
            }
        }
        u5.f fVar = (u5.f) obj;
        if (fVar != null) {
            return fVar.f30277d;
        }
        return null;
    }

    public final float j0() {
        List<CorporateDetailsDomain.b> list;
        CorporateDetailsDomain value = this.n1.getValue();
        ArrayList arrayList = null;
        if (value != null && (list = value.f10805b) != null) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                CorporateDetailsDomain.a aVar = ((CorporateDetailsDomain.b) obj).f10950e;
                if (hashSet.add(aVar != null ? aVar.f10893c : null)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        float f10 = 0.0f;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            float f11 = 0.0f;
            while (it.hasNext()) {
                Float f12 = ((CorporateDetailsDomain.b) it.next()).f10948c;
                f11 += f12 != null ? f12.floatValue() : 0.0f;
            }
            f10 = f11;
        }
        return 100 - f10;
    }

    public final void k0(String str) {
        Object obj;
        List<u5.e> value = this.f12447l1.getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (kotlin.jvm.internal.f.b(((u5.e) obj).f30264j, str)) {
                        break;
                    }
                }
            }
            u5.e eVar = (u5.e) obj;
            if (eVar != null) {
                CreateCompanyUI createCompanyUI = this.f12445j1;
                (createCompanyUI != null ? createCompanyUI : null).f11273g = eVar.f30264j;
                (createCompanyUI != null ? createCompanyUI : null).f11274h = eVar.f30260e;
                CreateCompanyUI createCompanyUI2 = createCompanyUI != null ? createCompanyUI : null;
                e.a aVar = eVar.f30265k;
                createCompanyUI2.f11283r = aVar != null ? aVar.f30271f : null;
                (createCompanyUI != null ? createCompanyUI : null).f11280o = aVar != null ? aVar.f30267b : null;
                (createCompanyUI != null ? createCompanyUI : null).f11282q = aVar != null ? aVar.f30272g : null;
                (createCompanyUI != null ? createCompanyUI : null).f11284s = aVar != null ? aVar.f30270e : null;
                if (createCompanyUI == null) {
                    createCompanyUI = null;
                }
                createCompanyUI.f11285t = aVar != null ? aVar.f30269d : null;
                this.f12448m1.setValue(null);
            }
        }
    }

    public final void l0(String str, final UploadFileUI uploadFileUI, final InterfaceC0635a<? extends Object> interfaceC0635a) {
        final int i = 0;
        InterfaceC0635a interfaceC0635a2 = new InterfaceC0635a() { // from class: O7.f
            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        uploadFileUI.f11321g = Boolean.TRUE;
                        InterfaceC0635a interfaceC0635a3 = interfaceC0635a;
                        if (interfaceC0635a3 != null) {
                            return interfaceC0635a3.invoke();
                        }
                        return null;
                    default:
                        uploadFileUI.f11321g = Boolean.FALSE;
                        InterfaceC0635a interfaceC0635a4 = interfaceC0635a;
                        if (interfaceC0635a4 != null) {
                            return interfaceC0635a4.invoke();
                        }
                        return null;
                }
            }
        };
        final int i9 = 1;
        E6.c cVar = new E6.c(this, str, uploadFileUI, new InterfaceC0635a() { // from class: O7.f
            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        uploadFileUI.f11321g = Boolean.TRUE;
                        InterfaceC0635a interfaceC0635a3 = interfaceC0635a;
                        if (interfaceC0635a3 != null) {
                            return interfaceC0635a3.invoke();
                        }
                        return null;
                    default:
                        uploadFileUI.f11321g = Boolean.FALSE;
                        InterfaceC0635a interfaceC0635a4 = interfaceC0635a;
                        if (interfaceC0635a4 != null) {
                            return interfaceC0635a4.invoke();
                        }
                        return null;
                }
            }
        }, interfaceC0635a2, 2);
        this.f424Q0 = cVar;
        cVar.invoke();
    }
}
