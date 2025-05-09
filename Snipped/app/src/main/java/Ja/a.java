package Ja;

import C.N;
import Ka.d;
import Ka.p;
import Ka.z;
import P9.n;
import T2.f;
import T2.h;
import T2.l;
import U0.g;
import a4.y;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.Q;
import androidx.navigation.g;
import androidx.recyclerview.widget.u;
import ca.InterfaceC0646l;
import com.google.firebase.messaging.ServiceStarter;
import com.luminary.business.domain.entity.account.CardsDomain;
import com.luminary.business.domain.entity.cards.CardTransactionDomain;
import com.luminary.business.domain.entity.payments.Confirmation;
import com.luminary.business.domain.entity.payments.PaymentDomain;
import com.luminary.business.domain.entity.payments.QRCode;
import g4.C0765a;
import h4.o;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Logger;
import ka.C0969n;
import n4.C1069a;
import o4.C1089a;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.Primes;
import org.bouncycastle.tls.NamedGroup;
import org.jmrtd.PassportService;
import org.jmrtd.lds.iso19794.IrisImageInfo;
import p4.f;
import s4.b;
import s4.c;
import u5.i;
import u5.j;
import w5.C1572a;
import y0.C1596C;
import y0.E;

/* compiled from: utf8.kt */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static N f2210a;

    public static int A(char c2, int i, int i9, CharSequence charSequence) {
        while (i < i9) {
            if (charSequence.charAt(i) != c2) {
                return i;
            }
            i++;
        }
        return i9;
    }

    public static int B(CharSequence charSequence, int i, int i9) {
        while (i < i9) {
            char charAt = charSequence.charAt(i);
            if (charAt != '\t' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i9;
    }

    public static final d C(InputStream inputStream) {
        Logger logger = p.f2319a;
        return new d(1, inputStream, new z());
    }

    public static final CardsDomain D(h4.d dVar) {
        s4.d a10;
        b b9;
        Integer g10 = dVar.g();
        Integer b10 = dVar.b();
        Integer l10 = dVar.l();
        String i = dVar.i();
        String d10 = dVar.d();
        Boolean m2 = dVar.m();
        String a11 = dVar.a();
        String f10 = dVar.f();
        String k3 = dVar.k();
        String c2 = dVar.c();
        String e10 = dVar.e();
        String h9 = dVar.h();
        c j10 = dVar.j();
        D5.a aVar = null;
        D5.b bVar = (j10 == null || (b9 = j10.b()) == null) ? null : new D5.b(b9.b(), b9.e(), b9.c(), b9.d(), b9.a());
        c j11 = dVar.j();
        if (j11 != null && (a10 = j11.a()) != null) {
            aVar = new D5.a(a10.u(), a10.x(), a10.o(), a10.l(), a10.c0(), a10.f0(), a10.W(), a10.T(), a10.J(), a10.M(), a10.D(), a10.A(), a10.R(), a10.S(), a10.Q(), a10.P(), a10.r(), a10.Z(), a10.G(), a10.f(), a10.i(), a10.c(), a10.a(), a10.w(), a10.v(), a10.z(), a10.y(), a10.q(), a10.p(), a10.n(), a10.m(), a10.e0(), a10.d0(), a10.h0(), a10.g0(), a10.Y(), a10.X(), a10.V(), a10.U(), a10.L(), a10.K(), a10.O(), a10.N(), a10.F(), a10.E(), a10.C(), a10.B(), a10.t(), a10.a0(), a10.I(), a10.s(), a10.b0(), a10.H(), a10.h(), a10.g(), a10.k(), a10.j(), a10.e(), a10.d(), a10.b());
        }
        return new CardsDomain(g10, b10, l10, i, d10, m2, a11, f10, k3, c2, e10, h9, bVar, aVar);
    }

    public static final CardTransactionDomain E(C0765a c0765a) {
        String m2 = c0765a.m();
        String w2 = c0765a.w();
        Integer c2 = c0765a.c();
        String g10 = c0765a.g();
        String s10 = c0765a.s();
        Double a10 = c0765a.a();
        BigDecimal bigDecimal = a10 != null ? new BigDecimal(String.valueOf(a10.doubleValue())) : null;
        String e10 = c0765a.e();
        String f10 = c0765a.f();
        String k3 = c0765a.k();
        String h9 = c0765a.h();
        Double i = c0765a.i();
        BigDecimal bigDecimal2 = i != null ? new BigDecimal(String.valueOf(i.doubleValue())) : null;
        String j10 = c0765a.j();
        String v10 = c0765a.v();
        String u6 = c0765a.u();
        String t3 = c0765a.t();
        String d10 = c0765a.d();
        return new CardTransactionDomain(m2, w2, c2, g10, s10, bigDecimal, e10, f10, k3, h9, bigDecimal2, j10, v10, u6, t3, d10 != null ? U4.b.E(d10) : null, c0765a.l(), c0765a.o(), c0765a.q(), c0765a.r(), c0765a.p(), c0765a.n(), c0765a.b());
    }

    public static final Confirmation F(p4.b bVar) {
        String a10 = bVar.a();
        f b9 = bVar.b();
        return new Confirmation(a10, b9 != null ? new QRCode(b9.a(), b9.c(), b9.b()) : null);
    }

    public static final ArrayList G(List list) {
        List<i4.c> list2 = list;
        ArrayList arrayList = new ArrayList(n.u(list2, 10));
        for (i4.c cVar : list2) {
            arrayList.add(new u5.f(cVar.e(), cVar.g(), cVar.c(), cVar.i(), cVar.f(), cVar.d(), cVar.h(), cVar.b()));
        }
        return arrayList;
    }

    public static final C1572a H(l4.b bVar) {
        return new C1572a(bVar.e(), bVar.f(), bVar.k(), bVar.g(), bVar.h(), bVar.a(), bVar.c(), bVar.i(), bVar.d(), bVar.j(), bVar.b(), bVar.l());
    }

    public static final z5.b I(C1069a c1069a) {
        return new z5.b(c1069a.b(), c1069a.c(), c1069a.a());
    }

    public static final z5.c J(n4.b bVar) {
        String e10 = bVar.e();
        C1069a i = bVar.i();
        z5.b I10 = i != null ? I(i) : null;
        C1069a j10 = bVar.j();
        z5.b I11 = j10 != null ? I(j10) : null;
        C1069a g10 = bVar.g();
        z5.b I12 = g10 != null ? I(g10) : null;
        C1069a f10 = bVar.f();
        z5.b I13 = f10 != null ? I(f10) : null;
        C1069a h9 = bVar.h();
        z5.b I14 = h9 != null ? I(h9) : null;
        C1069a w2 = bVar.w();
        z5.b I15 = w2 != null ? I(w2) : null;
        C1069a x9 = bVar.x();
        z5.b I16 = x9 != null ? I(x9) : null;
        C1069a u6 = bVar.u();
        z5.b I17 = u6 != null ? I(u6) : null;
        C1069a t3 = bVar.t();
        z5.b I18 = t3 != null ? I(t3) : null;
        C1069a v10 = bVar.v();
        z5.b I19 = v10 != null ? I(v10) : null;
        C1069a n10 = bVar.n();
        z5.b I20 = n10 != null ? I(n10) : null;
        C1069a o10 = bVar.o();
        z5.b I21 = o10 != null ? I(o10) : null;
        C1069a l10 = bVar.l();
        z5.b I22 = l10 != null ? I(l10) : null;
        C1069a k3 = bVar.k();
        z5.b I23 = k3 != null ? I(k3) : null;
        C1069a m2 = bVar.m();
        return new z5.c(e10, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22, I23, m2 != null ? I(m2) : null, bVar.r(), bVar.s(), bVar.q(), bVar.p(), bVar.c(), bVar.d(), bVar.b(), bVar.a());
    }

    public static final A5.b K(C1089a c1089a) {
        Integer h9 = c1089a.h();
        Integer d10 = c1089a.d();
        String f10 = c1089a.f();
        String c2 = c1089a.c();
        String j10 = c1089a.j();
        Integer b9 = c1089a.b();
        String g10 = c1089a.g();
        String k3 = c1089a.k();
        String i = c1089a.i();
        String e10 = c1089a.e();
        Date E8 = e10 != null ? U4.b.E(e10) : null;
        String l10 = c1089a.l();
        return new A5.b(h9, d10, f10, c2, j10, b9, g10, k3, i, E8, l10 != null ? U4.b.E(l10) : null, c1089a.m());
    }

    public static final PaymentDomain L(p4.d dVar) {
        return new PaymentDomain(dVar.r(), dVar.I(), dVar.e(), dVar.c(), dVar.d(), dVar.j(), dVar.t(), dVar.b(), dVar.h(), dVar.i(), dVar.q(), dVar.k(), dVar.p(), dVar.m(), dVar.o(), dVar.l(), dVar.n(), dVar.G(), dVar.w(), dVar.F(), dVar.C(), dVar.E(), dVar.B(), dVar.z(), dVar.y(), dVar.A(), dVar.x(), dVar.D(), dVar.v(), dVar.g(), dVar.H(), dVar.s(), dVar.u(), F(dVar.f()));
    }

    public static final C5.a M(q4.a aVar) {
        ArrayList arrayList;
        Integer f10 = aVar.f();
        Boolean k3 = aVar.k();
        q4.b h9 = aVar.h();
        C5.b N10 = h9 != null ? N(h9) : null;
        q4.b e10 = aVar.e();
        C5.b N11 = e10 != null ? N(e10) : null;
        List<q4.b> c2 = aVar.c();
        if (c2 != null) {
            List<q4.b> list = c2;
            arrayList = new ArrayList(n.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(N((q4.b) it.next()));
            }
        } else {
            arrayList = null;
        }
        String g10 = aVar.g();
        String d10 = aVar.d();
        Date E8 = d10 != null ? U4.b.E(d10) : null;
        String i = aVar.i();
        Date E10 = i != null ? U4.b.E(i) : null;
        Boolean j10 = aVar.j();
        String b9 = aVar.b();
        return new C5.a(f10, k3, N10, N11, arrayList, g10, E8, E10, j10, b9 != null ? U4.b.E(b9) : null);
    }

    public static final C5.b N(q4.b bVar) {
        return new C5.b(bVar.f(), bVar.c(), bVar.b(), bVar.g(), bVar.h(), bVar.d(), bVar.e());
    }

    public static final o O(h4.p pVar) {
        return new o(pVar.i(), pVar.c(), pVar.g(), pVar.h(), pVar.l(), pVar.m(), pVar.f(), pVar.b(), pVar.d(), pVar.k(), pVar.n(), pVar.j(), null, pVar.e(), pVar.o());
    }

    public static final i P(i4.f fVar) {
        return new i(fVar.e(), fVar.a(), fVar.f(), fVar.g(), fVar.i(), fVar.c(), fVar.b(), fVar.d(), fVar.h(), fVar.j());
    }

    public static final y Q(j jVar) {
        return new y(jVar.f30319a, jVar.f30320b, jVar.f30321c, jVar.f30322d, jVar.f30323e, jVar.f30324f);
    }

    public static void R(String str) {
        Log.v("RootBeer", m() + String.valueOf(str));
    }

    public static final boolean a(Object[] objArr, int i, int i9, List list) {
        if (i9 != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!kotlin.jvm.internal.f.b(objArr[i + i10], list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final String b(Object[] objArr, int i, int i9, Collection collection) {
        StringBuilder sb2 = new StringBuilder((i9 * 3) + 2);
        sb2.append("[");
        for (int i10 = 0; i10 < i9; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i + i10];
            if (obj == collection) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public static Pair c(double d10, double d11) {
        if (H.f.f1368a.get(H.n.class) != null) {
            if (d10 < 0.0d) {
                d10 = ((d10 * 10000.0d) - 1.0d) / 10000.0d;
            }
            if (d11 < 0.0d) {
                d11 = ((d11 * 10000.0d) - 1.0d) / 10000.0d;
            }
        }
        return Pair.create(Double.valueOf(d10), Double.valueOf(d11));
    }

    public static final void d(SpannableStringBuilder spannableStringBuilder, int i, int i9, int i10, int i11) {
        int i12 = i9 + i;
        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i12, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), i, i12, 33);
        spannableStringBuilder.setSpan(new BackgroundColorSpan(i10), i, i12, 33);
    }

    public static a e(int i) {
        return i != 0 ? i != 1 ? new h() : new T2.d() : new h();
    }

    public static Q f(Class cls) {
        try {
            return (Q) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        }
    }

    public static final SpannableString g(String str, float f10) {
        int f02 = C0969n.f0(str, '.', 0, false, 6);
        if (f02 == -1) {
            return new SpannableString(str);
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new AbsoluteSizeSpan((int) f10), f02, str.length(), 18);
        return spannableString;
    }

    public static float h(float f10, float f11, float f12, float f13) {
        return (float) Math.hypot(f12 - f10, f13 - f11);
    }

    public static void i(Serializable serializable) {
        Log.e("RootBeer", m() + String.valueOf(serializable));
        Log.e("QLog", m() + String.valueOf(serializable));
    }

    public static String j(long j10) {
        if (j10 < 1000) {
            return j10 + " B";
        }
        double d10 = j10;
        double d11 = 1000;
        int log = (int) (Math.log(d10) / Math.log(d11));
        return String.format(Locale.US, "%.1f %sB", Arrays.copyOf(new Object[]{Double.valueOf(d10 / Math.pow(d11, log)), "kMGTPE".charAt(log - 1) + ""}, 2));
    }

    public static HashMap l() {
        HashMap hashMap = new HashMap(286);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        org.bouncycastle.asn1.a.y(arrayList, "BB", "BM", "BS", "CA");
        org.bouncycastle.asn1.a.y(arrayList, "DM", "DO", "GD", "GU");
        org.bouncycastle.asn1.a.y(arrayList, "JM", "KN", "KY", "LC");
        org.bouncycastle.asn1.a.y(arrayList, "MP", "MS", "PR", "SX");
        org.bouncycastle.asn1.a.y(arrayList, "TC", "TT", "VC", "VG");
        arrayList.add("VI");
        hashMap.put(1, arrayList);
        ArrayList arrayList2 = new ArrayList(2);
        arrayList2.add("RU");
        arrayList2.add("KZ");
        ArrayList r8 = org.bouncycastle.asn1.a.r(36, hashMap, org.bouncycastle.asn1.a.r(34, hashMap, org.bouncycastle.asn1.a.r(33, hashMap, org.bouncycastle.asn1.a.r(32, hashMap, org.bouncycastle.asn1.a.r(31, hashMap, org.bouncycastle.asn1.a.r(30, hashMap, org.bouncycastle.asn1.a.r(27, hashMap, org.bouncycastle.asn1.a.r(20, hashMap, org.bouncycastle.asn1.a.r(7, hashMap, arrayList2, 1, "EG"), 1, "ZA"), 1, "GR"), 1, "NL"), 1, "BE"), 1, "FR"), 1, "ES"), 1, "HU"), 2, "IT");
        r8.add("VA");
        hashMap.put(39, r8);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add("RO");
        ArrayList r10 = org.bouncycastle.asn1.a.r(43, hashMap, org.bouncycastle.asn1.a.r(41, hashMap, org.bouncycastle.asn1.a.r(40, hashMap, arrayList3, 1, "CH"), 1, "AT"), 4, "GB");
        r10.add("GG");
        r10.add("IM");
        r10.add("JE");
        hashMap.put(44, r10);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add("DK");
        ArrayList r11 = org.bouncycastle.asn1.a.r(46, hashMap, org.bouncycastle.asn1.a.r(45, hashMap, arrayList4, 1, "SE"), 2, "NO");
        r11.add("SJ");
        hashMap.put(47, r11);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("PL");
        ArrayList r12 = org.bouncycastle.asn1.a.r(60, hashMap, org.bouncycastle.asn1.a.r(58, hashMap, org.bouncycastle.asn1.a.r(57, hashMap, org.bouncycastle.asn1.a.r(56, hashMap, org.bouncycastle.asn1.a.r(55, hashMap, org.bouncycastle.asn1.a.r(54, hashMap, org.bouncycastle.asn1.a.r(53, hashMap, org.bouncycastle.asn1.a.r(52, hashMap, org.bouncycastle.asn1.a.r(51, hashMap, org.bouncycastle.asn1.a.r(49, hashMap, org.bouncycastle.asn1.a.r(48, hashMap, arrayList5, 1, "DE"), 1, "PE"), 1, "MX"), 1, "CU"), 1, "AR"), 1, "BR"), 1, "CL"), 1, "CO"), 1, "VE"), 1, "MY"), 3, "AU");
        r12.add("CC");
        r12.add("CX");
        hashMap.put(61, r12);
        ArrayList arrayList6 = new ArrayList(1);
        arrayList6.add("ID");
        ArrayList r13 = org.bouncycastle.asn1.a.r(Primes.SMALL_FACTOR_LIMIT, hashMap, org.bouncycastle.asn1.a.r(98, hashMap, org.bouncycastle.asn1.a.r(95, hashMap, org.bouncycastle.asn1.a.r(94, hashMap, org.bouncycastle.asn1.a.r(93, hashMap, org.bouncycastle.asn1.a.r(92, hashMap, org.bouncycastle.asn1.a.r(91, hashMap, org.bouncycastle.asn1.a.r(90, hashMap, org.bouncycastle.asn1.a.r(86, hashMap, org.bouncycastle.asn1.a.r(84, hashMap, org.bouncycastle.asn1.a.r(82, hashMap, org.bouncycastle.asn1.a.r(81, hashMap, org.bouncycastle.asn1.a.r(66, hashMap, org.bouncycastle.asn1.a.r(65, hashMap, org.bouncycastle.asn1.a.r(64, hashMap, org.bouncycastle.asn1.a.r(63, hashMap, org.bouncycastle.asn1.a.r(62, hashMap, arrayList6, 1, "PH"), 1, "NZ"), 1, "SG"), 1, "TH"), 1, "JP"), 1, "KR"), 1, "VN"), 1, "CN"), 1, "TR"), 1, "IN"), 1, "PK"), 1, "AF"), 1, "LK"), 1, "MM"), 1, "IR"), 1, "SS"), 2, "MA");
        r13.add("EH");
        hashMap.put(212, r13);
        ArrayList arrayList7 = new ArrayList(1);
        arrayList7.add("DZ");
        ArrayList r14 = org.bouncycastle.asn1.a.r(261, hashMap, org.bouncycastle.asn1.a.r(NamedGroup.ffdhe8192, hashMap, org.bouncycastle.asn1.a.r(NamedGroup.ffdhe4096, hashMap, org.bouncycastle.asn1.a.r(NamedGroup.ffdhe3072, hashMap, org.bouncycastle.asn1.a.r(256, hashMap, org.bouncycastle.asn1.a.r(255, hashMap, org.bouncycastle.asn1.a.r(IrisImageInfo.IMAGE_QUAL_UNDEF, hashMap, org.bouncycastle.asn1.a.r(253, hashMap, org.bouncycastle.asn1.a.r(252, hashMap, org.bouncycastle.asn1.a.r(251, hashMap, org.bouncycastle.asn1.a.r(u.d.DEFAULT_SWIPE_ANIMATION_DURATION, hashMap, org.bouncycastle.asn1.a.r(249, hashMap, org.bouncycastle.asn1.a.r(248, hashMap, org.bouncycastle.asn1.a.r(247, hashMap, org.bouncycastle.asn1.a.r(246, hashMap, org.bouncycastle.asn1.a.r(245, hashMap, org.bouncycastle.asn1.a.r(244, hashMap, org.bouncycastle.asn1.a.r(243, hashMap, org.bouncycastle.asn1.a.r(242, hashMap, org.bouncycastle.asn1.a.r(241, hashMap, org.bouncycastle.asn1.a.r(240, hashMap, org.bouncycastle.asn1.a.r(239, hashMap, org.bouncycastle.asn1.a.r(238, hashMap, org.bouncycastle.asn1.a.r(237, hashMap, org.bouncycastle.asn1.a.r(236, hashMap, org.bouncycastle.asn1.a.r(235, hashMap, org.bouncycastle.asn1.a.r(234, hashMap, org.bouncycastle.asn1.a.r(233, hashMap, org.bouncycastle.asn1.a.r(232, hashMap, org.bouncycastle.asn1.a.r(231, hashMap, org.bouncycastle.asn1.a.r(230, hashMap, org.bouncycastle.asn1.a.r(229, hashMap, org.bouncycastle.asn1.a.r(228, hashMap, org.bouncycastle.asn1.a.r(227, hashMap, org.bouncycastle.asn1.a.r(226, hashMap, org.bouncycastle.asn1.a.r(225, hashMap, org.bouncycastle.asn1.a.r(BERTags.FLAGS, hashMap, org.bouncycastle.asn1.a.r(PassportService.DEFAULT_MAX_BLOCKSIZE, hashMap, org.bouncycastle.asn1.a.r(222, hashMap, org.bouncycastle.asn1.a.r(221, hashMap, org.bouncycastle.asn1.a.r(220, hashMap, org.bouncycastle.asn1.a.r(218, hashMap, org.bouncycastle.asn1.a.r(216, hashMap, org.bouncycastle.asn1.a.r(213, hashMap, arrayList7, 1, "TN"), 1, "LY"), 1, "GM"), 1, "SN"), 1, "MR"), 1, "ML"), 1, "GN"), 1, "CI"), 1, "BF"), 1, "NE"), 1, "TG"), 1, "BJ"), 1, "MU"), 1, "LR"), 1, "SL"), 1, "GH"), 1, "NG"), 1, "TD"), 1, "CF"), 1, "CM"), 1, "CV"), 1, "ST"), 1, "GQ"), 1, "GA"), 1, "CG"), 1, "CD"), 1, "AO"), 1, "GW"), 1, "IO"), 1, "AC"), 1, "SC"), 1, "SD"), 1, "RW"), 1, "ET"), 1, "SO"), 1, "DJ"), 1, "KE"), 1, "TZ"), 1, "UG"), 1, "BI"), 1, "MZ"), 1, "ZM"), 1, "MG"), 2, "RE");
        r14.add("YT");
        hashMap.put(262, r14);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add("ZW");
        ArrayList r15 = org.bouncycastle.asn1.a.r(269, hashMap, org.bouncycastle.asn1.a.r(268, hashMap, org.bouncycastle.asn1.a.r(267, hashMap, org.bouncycastle.asn1.a.r(266, hashMap, org.bouncycastle.asn1.a.r(265, hashMap, org.bouncycastle.asn1.a.r(264, hashMap, org.bouncycastle.asn1.a.r(263, hashMap, arrayList8, 1, "NA"), 1, "MW"), 1, "LS"), 1, "BW"), 1, "SZ"), 1, "KM"), 2, "SH");
        r15.add("TA");
        hashMap.put(290, r15);
        ArrayList arrayList9 = new ArrayList(1);
        arrayList9.add("ER");
        ArrayList r16 = org.bouncycastle.asn1.a.r(357, hashMap, org.bouncycastle.asn1.a.r(356, hashMap, org.bouncycastle.asn1.a.r(355, hashMap, org.bouncycastle.asn1.a.r(354, hashMap, org.bouncycastle.asn1.a.r(353, hashMap, org.bouncycastle.asn1.a.r(352, hashMap, org.bouncycastle.asn1.a.r(351, hashMap, org.bouncycastle.asn1.a.r(350, hashMap, org.bouncycastle.asn1.a.r(299, hashMap, org.bouncycastle.asn1.a.r(298, hashMap, org.bouncycastle.asn1.a.r(297, hashMap, org.bouncycastle.asn1.a.r(291, hashMap, arrayList9, 1, "AW"), 1, "FO"), 1, "GL"), 1, "GI"), 1, "PT"), 1, "LU"), 1, "IE"), 1, "IS"), 1, "AL"), 1, "MT"), 1, "CY"), 2, "FI");
        r16.add("AX");
        hashMap.put(358, r16);
        ArrayList arrayList10 = new ArrayList(1);
        arrayList10.add("BG");
        ArrayList r17 = org.bouncycastle.asn1.a.r(509, hashMap, org.bouncycastle.asn1.a.r(508, hashMap, org.bouncycastle.asn1.a.r(507, hashMap, org.bouncycastle.asn1.a.r(506, hashMap, org.bouncycastle.asn1.a.r(505, hashMap, org.bouncycastle.asn1.a.r(504, hashMap, org.bouncycastle.asn1.a.r(503, hashMap, org.bouncycastle.asn1.a.r(502, hashMap, org.bouncycastle.asn1.a.r(501, hashMap, org.bouncycastle.asn1.a.r(ServiceStarter.ERROR_UNKNOWN, hashMap, org.bouncycastle.asn1.a.r(423, hashMap, org.bouncycastle.asn1.a.r(421, hashMap, org.bouncycastle.asn1.a.r(420, hashMap, org.bouncycastle.asn1.a.r(389, hashMap, org.bouncycastle.asn1.a.r(387, hashMap, org.bouncycastle.asn1.a.r(386, hashMap, org.bouncycastle.asn1.a.r(385, hashMap, org.bouncycastle.asn1.a.r(383, hashMap, org.bouncycastle.asn1.a.r(382, hashMap, org.bouncycastle.asn1.a.r(381, hashMap, org.bouncycastle.asn1.a.r(380, hashMap, org.bouncycastle.asn1.a.r(378, hashMap, org.bouncycastle.asn1.a.r(377, hashMap, org.bouncycastle.asn1.a.r(376, hashMap, org.bouncycastle.asn1.a.r(375, hashMap, org.bouncycastle.asn1.a.r(374, hashMap, org.bouncycastle.asn1.a.r(373, hashMap, org.bouncycastle.asn1.a.r(372, hashMap, org.bouncycastle.asn1.a.r(371, hashMap, org.bouncycastle.asn1.a.r(370, hashMap, org.bouncycastle.asn1.a.r(359, hashMap, arrayList10, 1, "LT"), 1, "LV"), 1, "EE"), 1, "MD"), 1, "AM"), 1, "BY"), 1, "AD"), 1, "MC"), 1, "SM"), 1, "UA"), 1, "RS"), 1, "ME"), 1, "XK"), 1, "HR"), 1, "SI"), 1, "BA"), 1, "MK"), 1, "CZ"), 1, "SK"), 1, "LI"), 1, "FK"), 1, "BZ"), 1, "GT"), 1, "SV"), 1, "HN"), 1, "NI"), 1, "CR"), 1, "PA"), 1, "PM"), 1, "HT"), 3, "GP");
        r17.add("BL");
        r17.add("MF");
        hashMap.put(590, r17);
        ArrayList arrayList11 = new ArrayList(1);
        arrayList11.add("BO");
        ArrayList r18 = org.bouncycastle.asn1.a.r(598, hashMap, org.bouncycastle.asn1.a.r(597, hashMap, org.bouncycastle.asn1.a.r(596, hashMap, org.bouncycastle.asn1.a.r(595, hashMap, org.bouncycastle.asn1.a.r(594, hashMap, org.bouncycastle.asn1.a.r(593, hashMap, org.bouncycastle.asn1.a.r(592, hashMap, org.bouncycastle.asn1.a.r(591, hashMap, arrayList11, 1, "GY"), 1, "EC"), 1, "GF"), 1, "PY"), 1, "MQ"), 1, "SR"), 1, "UY"), 2, "CW");
        r18.add("BQ");
        hashMap.put(599, r18);
        ArrayList arrayList12 = new ArrayList(1);
        arrayList12.add("TL");
        hashMap.put(998, org.bouncycastle.asn1.a.r(996, hashMap, org.bouncycastle.asn1.a.r(995, hashMap, org.bouncycastle.asn1.a.r(994, hashMap, org.bouncycastle.asn1.a.r(993, hashMap, org.bouncycastle.asn1.a.r(992, hashMap, org.bouncycastle.asn1.a.r(979, hashMap, org.bouncycastle.asn1.a.r(977, hashMap, org.bouncycastle.asn1.a.r(976, hashMap, org.bouncycastle.asn1.a.r(975, hashMap, org.bouncycastle.asn1.a.r(974, hashMap, org.bouncycastle.asn1.a.r(973, hashMap, org.bouncycastle.asn1.a.r(972, hashMap, org.bouncycastle.asn1.a.r(971, hashMap, org.bouncycastle.asn1.a.r(970, hashMap, org.bouncycastle.asn1.a.r(968, hashMap, org.bouncycastle.asn1.a.r(967, hashMap, org.bouncycastle.asn1.a.r(966, hashMap, org.bouncycastle.asn1.a.r(965, hashMap, org.bouncycastle.asn1.a.r(964, hashMap, org.bouncycastle.asn1.a.r(963, hashMap, org.bouncycastle.asn1.a.r(962, hashMap, org.bouncycastle.asn1.a.r(961, hashMap, org.bouncycastle.asn1.a.r(960, hashMap, org.bouncycastle.asn1.a.r(888, hashMap, org.bouncycastle.asn1.a.r(886, hashMap, org.bouncycastle.asn1.a.r(883, hashMap, org.bouncycastle.asn1.a.r(882, hashMap, org.bouncycastle.asn1.a.r(881, hashMap, org.bouncycastle.asn1.a.r(880, hashMap, org.bouncycastle.asn1.a.r(878, hashMap, org.bouncycastle.asn1.a.r(870, hashMap, org.bouncycastle.asn1.a.r(856, hashMap, org.bouncycastle.asn1.a.r(855, hashMap, org.bouncycastle.asn1.a.r(853, hashMap, org.bouncycastle.asn1.a.r(852, hashMap, org.bouncycastle.asn1.a.r(850, hashMap, org.bouncycastle.asn1.a.r(808, hashMap, org.bouncycastle.asn1.a.r(800, hashMap, org.bouncycastle.asn1.a.r(692, hashMap, org.bouncycastle.asn1.a.r(691, hashMap, org.bouncycastle.asn1.a.r(690, hashMap, org.bouncycastle.asn1.a.r(689, hashMap, org.bouncycastle.asn1.a.r(688, hashMap, org.bouncycastle.asn1.a.r(687, hashMap, org.bouncycastle.asn1.a.r(686, hashMap, org.bouncycastle.asn1.a.r(685, hashMap, org.bouncycastle.asn1.a.r(683, hashMap, org.bouncycastle.asn1.a.r(682, hashMap, org.bouncycastle.asn1.a.r(681, hashMap, org.bouncycastle.asn1.a.r(680, hashMap, org.bouncycastle.asn1.a.r(679, hashMap, org.bouncycastle.asn1.a.r(678, hashMap, org.bouncycastle.asn1.a.r(677, hashMap, org.bouncycastle.asn1.a.r(676, hashMap, org.bouncycastle.asn1.a.r(675, hashMap, org.bouncycastle.asn1.a.r(674, hashMap, org.bouncycastle.asn1.a.r(673, hashMap, org.bouncycastle.asn1.a.r(672, hashMap, org.bouncycastle.asn1.a.r(670, hashMap, arrayList12, 1, "NF"), 1, "BN"), 1, "NR"), 1, "PG"), 1, "TO"), 1, "SB"), 1, "VU"), 1, "FJ"), 1, "PW"), 1, "WF"), 1, "CK"), 1, "NU"), 1, "WS"), 1, "KI"), 1, "NC"), 1, "TV"), 1, "PF"), 1, "TK"), 1, "FM"), 1, "MH"), 1, "001"), 1, "001"), 1, "KP"), 1, "HK"), 1, "MO"), 1, "KH"), 1, "LA"), 1, "001"), 1, "001"), 1, "BD"), 1, "001"), 1, "001"), 1, "001"), 1, "TW"), 1, "001"), 1, "MV"), 1, "LB"), 1, "JO"), 1, "SY"), 1, "IQ"), 1, "KW"), 1, "SA"), 1, "YE"), 1, "OM"), 1, "PS"), 1, "AE"), 1, "IL"), 1, "BH"), 1, "QA"), 1, "BT"), 1, "MN"), 1, "NP"), 1, "001"), 1, "TJ"), 1, "TM"), 1, "AZ"), 1, "GE"), 1, "KG"), 1, "UZ"));
        return hashMap;
    }

    public static String m() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        int lineNumber = stackTrace[2].getLineNumber();
        return className.substring(className.lastIndexOf(46) + 1) + ": " + methodName + "() [" + lineNumber + "] - ";
    }

    public static boolean n(int i, CharSequence charSequence) {
        if (i >= charSequence.length()) {
            return false;
        }
        char charAt = charSequence.charAt(i);
        switch (charAt) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
                return true;
            default:
                switch (charAt) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                        return true;
                    default:
                        switch (charAt) {
                            case '[':
                            case '\\':
                            case ']':
                            case '^':
                            case '_':
                            case '`':
                                return true;
                            default:
                                switch (charAt) {
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public static final boolean o(Ka.f fVar) {
        try {
            Ka.f fVar2 = new Ka.f();
            long j10 = fVar.f2294b;
            fVar.p(fVar2, 0L, j10 > 64 ? 64L : j10);
            for (int i = 0; i < 16; i++) {
                if (fVar2.r()) {
                    return true;
                }
                int N10 = fVar2.N();
                if (Character.isISOControl(N10) && !Character.isWhitespace(N10)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static float p(float f10, float f11, float f12) {
        return (f12 * f11) + ((1.0f - f12) * f10);
    }

    public static final ArrayList q(Map map, InterfaceC0646l interfaceC0646l) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            g gVar = (g) entry.getValue();
            if (!(gVar != null ? Boolean.valueOf(gVar.f3598b) : null).booleanValue() && !gVar.f3599c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) interfaceC0646l.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final androidx.navigation.g r(InterfaceC0646l interfaceC0646l) {
        androidx.navigation.h hVar = new androidx.navigation.h();
        interfaceC0646l.invoke(hVar);
        boolean z10 = hVar.f7326b;
        g.a aVar = hVar.f7325a;
        aVar.getClass();
        boolean z11 = hVar.f7327c;
        aVar.getClass();
        int i = hVar.f7328d;
        boolean z12 = hVar.f7329e;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        return new androidx.navigation.g(z10, z11, i, false, z12, aVar.f7321a, aVar.f7322b, aVar.f7323c, aVar.f7324d);
    }

    public static final void s(Object[] objArr, int i, int i9) {
        while (i < i9) {
            objArr[i] = null;
            i++;
        }
    }

    public static int t(int i, CharSequence charSequence) {
        char charAt;
        if (i >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i) == '<') {
            while (true) {
                i++;
                if (i >= charSequence.length() || (charAt = charSequence.charAt(i)) == '\n' || charAt == '<') {
                    break;
                }
                if (charAt == '>') {
                    return i + 1;
                }
                if (charAt == '\\') {
                    int i9 = i + 1;
                    if (n(i9, charSequence)) {
                        i = i9;
                    }
                }
            }
            return -1;
        }
        int i10 = 0;
        int i11 = i;
        while (i11 < charSequence.length()) {
            char charAt2 = charSequence.charAt(i11);
            if (charAt2 != 0 && charAt2 != ' ') {
                if (charAt2 == '\\') {
                    int i12 = i11 + 1;
                    if (n(i12, charSequence)) {
                        i11 = i12;
                    }
                } else if (charAt2 == '(') {
                    i10++;
                    if (i10 > 32) {
                        return -1;
                    }
                } else if (charAt2 != ')') {
                    if (Character.isISOControl(charAt2)) {
                        if (i11 == i) {
                            return -1;
                        }
                    }
                } else if (i10 != 0) {
                    i10--;
                }
                i11++;
            } else if (i11 == i) {
                return -1;
            }
            return i11;
        }
        return charSequence.length();
    }

    public static int u(int i, CharSequence charSequence) {
        while (i < charSequence.length()) {
            switch (charSequence.charAt(i)) {
                case '[':
                    return -1;
                case '\\':
                    int i9 = i + 1;
                    if (!n(i9, charSequence)) {
                        break;
                    } else {
                        i = i9;
                        break;
                    }
                case ']':
                    return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static int v(CharSequence charSequence, int i, char c2) {
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            if (charAt == '\\') {
                int i9 = i + 1;
                if (n(i9, charSequence)) {
                    i = i9;
                    i++;
                }
            }
            if (charAt == c2) {
                return i;
            }
            if (c2 == ')' && charAt == '(') {
                return -1;
            }
            i++;
        }
        return charSequence.length();
    }

    public static void w(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof T2.f) {
            ((T2.f) background).n(f10);
        }
    }

    public static void x(View view) {
        Drawable background = view.getBackground();
        if (background instanceof T2.f) {
            y(view, (T2.f) background);
        }
    }

    public static void y(View view, T2.f fVar) {
        G2.a aVar = fVar.f3448a.f3472b;
        if (aVar == null || !aVar.f1309a) {
            return;
        }
        float f10 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            f10 += C1596C.d.e((View) parent);
        }
        f.b bVar = fVar.f3448a;
        if (bVar.f3482m != f10) {
            bVar.f3482m = f10;
            fVar.v();
        }
    }

    public static Ka.c z(File file) {
        Logger logger = p.f2319a;
        return new Ka.c(1, new FileOutputStream(file, false), new z());
    }

    public void k(l lVar, float f10, float f11) {
        throw null;
    }
}
