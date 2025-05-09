package e8;

import B5.i;
import B5.j;
import F8.e;
import O9.p;
import android.os.Build;
import b8.h;
import ca.InterfaceC0635a;
import com.luminary.business.domain.entity.ReceiverLegalType;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.business.presentation.ui.fragments.newpayment.paymentdetails.PaymentDetailsFragment;
import com.luminary.business.presentation.utils.filepiker.FilePickerContractor;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import ka.C0969n;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentDetailsFragment f20563b;

    public /* synthetic */ a(PaymentDetailsFragment paymentDetailsFragment, int i) {
        this.f20562a = i;
        this.f20563b = paymentDetailsFragment;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [b8.f] */
    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        String str;
        final String str2;
        final String str3;
        final String str4;
        final String str5;
        final String str6;
        final String str7;
        final String str8;
        final String str9;
        String str10;
        switch (this.f20562a) {
            case 0:
                PaymentDetailsFragment paymentDetailsFragment = this.f20563b;
                boolean z10 = !paymentDetailsFragment.U0().f20569b && paymentDetailsFragment.u0().f28747H.isChecked();
                final String valueOf = String.valueOf(paymentDetailsFragment.u0().f28744E.getText());
                final String str11 = paymentDetailsFragment.U0().f20568a.f11334e;
                Integer num = paymentDetailsFragment.U0().f20568a.f11342n;
                if (num != null && num.intValue() == 1) {
                    str = "INDIVIDUAL";
                } else {
                    Integer num2 = paymentDetailsFragment.U0().f20568a.f11342n;
                    str = (num2 != null && num2.intValue() == 0) ? "CORPORATE" : "";
                }
                PaymentUI paymentUI = paymentDetailsFragment.U0().f20568a;
                DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
                decimalFormat.applyPattern("#.##");
                decimalFormat.format(paymentUI.f11332c);
                int ordinal = paymentUI.f11331b.ordinal();
                if (ordinal == 0) {
                    final String str12 = paymentUI.f11343o;
                    if (str12 != null) {
                        final String str13 = paymentUI.f11337h;
                        final String str14 = paymentUI.f11336g;
                        if (str14 != null) {
                            final h V02 = paymentDetailsFragment.V0();
                            final String str15 = paymentUI.f11330a;
                            final BigDecimal bigDecimal = paymentUI.f11332c;
                            final String obj = z10 ? C0969n.u0(valueOf).toString() : "";
                            final String str16 = paymentDetailsFragment.f12806t0;
                            final String str17 = paymentDetailsFragment.f12807u0;
                            final boolean z11 = z10;
                            InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: b8.g
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    h hVar = h.this;
                                    int h9 = hVar.f8456T0.h();
                                    ReceiverLegalType[] receiverLegalTypeArr = ReceiverLegalType.f10693a;
                                    Boolean valueOf2 = Boolean.valueOf(z11);
                                    String str18 = obj;
                                    String str19 = str11;
                                    B5.e eVar = new B5.e(valueOf2, str15, str13, str12, str14, str18, str19, bigDecimal);
                                    hVar.l();
                                    Pair pair = new Pair(String.valueOf(h9), eVar);
                                    hVar.f8460X0.a(new c(hVar, str17, str16, 0), pair);
                                    return p.f3034a;
                                }
                            };
                            V02.N0 = interfaceC0635a;
                            interfaceC0635a.invoke();
                        }
                    }
                } else if (ordinal == 1) {
                    final String str18 = paymentUI.f11335f;
                    if (str18 != null && (str2 = paymentUI.f11333d) != null && (str3 = paymentUI.f11336g) != null) {
                        final h V03 = paymentDetailsFragment.V0();
                        final BigDecimal bigDecimal2 = paymentUI.f11332c;
                        final int i = 1;
                        final boolean z12 = z10;
                        final String str19 = str;
                        InterfaceC0635a<p> interfaceC0635a2 = new InterfaceC0635a() { // from class: b8.a
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                switch (i) {
                                    case 0:
                                        h hVar = V03;
                                        int h9 = hVar.f8456T0.h();
                                        B5.g gVar = new B5.g(Boolean.valueOf(z12), str18, str2, str3, valueOf, str11, str19, bigDecimal2);
                                        hVar.l();
                                        Pair pair = new Pair(String.valueOf(h9), gVar);
                                        hVar.f8459W0.a(new b(hVar, 5), pair);
                                        break;
                                    default:
                                        h hVar2 = V03;
                                        int h10 = hVar2.f8456T0.h();
                                        B5.f fVar = new B5.f(Boolean.valueOf(z12), str18, str2, str3, valueOf, str11, str19, bigDecimal2);
                                        hVar2.l();
                                        Pair pair2 = new Pair(String.valueOf(h10), fVar);
                                        hVar2.f8458V0.a(new b(hVar2, 1), pair2);
                                        break;
                                }
                                return p.f3034a;
                            }
                        };
                        V03.f420L0 = interfaceC0635a2;
                        interfaceC0635a2.invoke();
                    }
                } else if (ordinal == 2) {
                    final String str20 = paymentUI.f11338j;
                    if (str20 != null && (str4 = paymentUI.f11339k) != null && (str5 = paymentUI.f11336g) != null) {
                        final h V04 = paymentDetailsFragment.V0();
                        final BigDecimal bigDecimal3 = paymentUI.f11332c;
                        final int i9 = 0;
                        final boolean z13 = z10;
                        final String str21 = str;
                        InterfaceC0635a<p> interfaceC0635a3 = new InterfaceC0635a() { // from class: b8.a
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                switch (i9) {
                                    case 0:
                                        h hVar = V04;
                                        int h9 = hVar.f8456T0.h();
                                        B5.g gVar = new B5.g(Boolean.valueOf(z13), str20, str4, str5, valueOf, str11, str21, bigDecimal3);
                                        hVar.l();
                                        Pair pair = new Pair(String.valueOf(h9), gVar);
                                        hVar.f8459W0.a(new b(hVar, 5), pair);
                                        break;
                                    default:
                                        h hVar2 = V04;
                                        int h10 = hVar2.f8456T0.h();
                                        B5.f fVar = new B5.f(Boolean.valueOf(z13), str20, str4, str5, valueOf, str11, str21, bigDecimal3);
                                        hVar2.l();
                                        Pair pair2 = new Pair(String.valueOf(h10), fVar);
                                        hVar2.f8458V0.a(new b(hVar2, 1), pair2);
                                        break;
                                }
                                return p.f3034a;
                            }
                        };
                        V04.f421M0 = interfaceC0635a3;
                        interfaceC0635a3.invoke();
                    }
                } else if (ordinal == 3) {
                    final String str22 = paymentUI.f11338j;
                    if (str22 != null && (str6 = paymentUI.f11339k) != null && (str7 = paymentUI.f11334e) != null) {
                        Integer num3 = paymentUI.f11342n;
                        String str23 = (num3 != null && num3.intValue() == 0) ? "INDIVIDUAL" : (num3 != null && num3.intValue() == 1) ? "CORPORATE" : null;
                        if (str23 != null) {
                            final h V05 = paymentDetailsFragment.V0();
                            final String str24 = paymentUI.f11337h;
                            final BigDecimal bigDecimal4 = paymentUI.f11332c;
                            final String str25 = paymentUI.f11336g;
                            final String str26 = z10 ? valueOf : "";
                            final String str27 = paymentUI.f11348t;
                            final String str28 = paymentUI.f11349u;
                            final String str29 = paymentUI.f11350v;
                            final String str30 = paymentUI.f11351w;
                            final String str31 = paymentUI.f11352x;
                            final Boolean bool = paymentUI.f11353y;
                            final String str32 = paymentUI.f11354z;
                            final String str33 = paymentUI.f11329A;
                            final String str34 = str23;
                            final boolean z14 = z10;
                            InterfaceC0635a<p> interfaceC0635a4 = new InterfaceC0635a() { // from class: b8.e
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    h hVar = h.this;
                                    String valueOf2 = String.valueOf(hVar.f8456T0.h());
                                    i iVar = new i(str22, str6, str24.toUpperCase(Locale.ROOT), bigDecimal4, str25, str7, str34, z14, str26, str27, str28, str29, str30, str31, bool, str32, str33);
                                    hVar.l();
                                    Pair pair = new Pair(valueOf2, iVar);
                                    hVar.f8461Y0.a(new b(hVar, 4), pair);
                                    return p.f3034a;
                                }
                            };
                            V05.f424Q0 = interfaceC0635a4;
                            interfaceC0635a4.invoke();
                        }
                    }
                } else if (ordinal == 8 && (str8 = paymentUI.f11338j) != null && (str9 = paymentUI.f11339k) != null && (str10 = paymentUI.f11334e) != null) {
                    Integer num4 = paymentUI.f11342n;
                    final String str35 = (num4 != null && num4.intValue() == 0) ? "INDIVIDUAL" : (num4 != null && num4.intValue() == 1) ? "CORPORATE" : null;
                    if (str35 != null) {
                        final h V06 = paymentDetailsFragment.V0();
                        final String str36 = paymentUI.f11330a;
                        final String str37 = paymentUI.f11337h;
                        final BigDecimal bigDecimal5 = paymentUI.f11332c;
                        final String str38 = paymentUI.f11336g;
                        final String obj2 = C0969n.u0(str10).toString();
                        String obj3 = z10 ? C0969n.u0(valueOf).toString() : "";
                        final String str39 = paymentUI.f11348t;
                        final String str40 = paymentUI.f11349u;
                        final String str41 = paymentUI.f11350v;
                        final String str42 = paymentUI.f11351w;
                        final String str43 = paymentUI.f11352x;
                        final Boolean bool2 = paymentUI.f11353y;
                        final String str44 = paymentUI.f11354z;
                        final String str45 = paymentUI.f11329A;
                        final String str46 = paymentDetailsFragment.f12806t0;
                        final String str47 = paymentDetailsFragment.f12807u0;
                        final boolean z15 = z10;
                        final String str48 = obj3;
                        ?? r02 = new InterfaceC0635a() { // from class: b8.f
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                h hVar = h.this;
                                String valueOf2 = String.valueOf(hVar.f8456T0.h());
                                j jVar = new j(str36, str8, str9, str37.toUpperCase(Locale.ROOT), bigDecimal5, str38, obj2, str35, z15, str48, str39, str40, str41, str42, str43, bool2, str44, str45);
                                hVar.l();
                                Pair pair = new Pair(valueOf2, jVar);
                                hVar.f8462Z0.a(new c(hVar, str47, str46, 1), pair);
                                return p.f3034a;
                            }
                        };
                        V06.f8482u1 = r02;
                        r02.invoke();
                    }
                }
                break;
            case 1:
                PaymentDetailsFragment paymentDetailsFragment2 = this.f20563b;
                break;
            case 2:
                PaymentDetailsFragment paymentDetailsFragment3 = this.f20563b;
                break;
            case 3:
                this.f20563b.f12805r0.a(FilePickerContractor.FileTypeEnum.PDF);
                break;
            case 4:
                this.f20563b.f12805r0.a(FilePickerContractor.FileTypeEnum.Image);
                break;
            case 5:
                int i10 = Build.VERSION.SDK_INT;
                PaymentDetailsFragment paymentDetailsFragment4 = this.f20563b;
                if (i10 < 29) {
                    paymentDetailsFragment4.f12808v0.a("android.permission.WRITE_EXTERNAL_STORAGE");
                } else {
                    paymentDetailsFragment4.f12809w0.a("android.permission.CAMERA");
                }
                break;
            case 6:
                this.f20563b.u0().f28756o.callOnClick();
                break;
            default:
                PaymentDetailsFragment paymentDetailsFragment5 = this.f20563b;
                paymentDetailsFragment5.getClass();
                e.a(paymentDetailsFragment5, null, new a(paymentDetailsFragment5, 3), new a(paymentDetailsFragment5, 4), new a(paymentDetailsFragment5, 5));
                break;
        }
        return p.f3034a;
    }
}
