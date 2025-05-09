package pa;

import C.v;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.Quirks;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.u;
import com.google.firebase.messaging.ServiceStarter;
import com.luminary.mobile.R;
import com.sumsub.sns.internal.core.data.model.p;
import ia.InterfaceC0835c;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ka.C0969n;
import kotlin.jvm.internal.h;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.Primes;
import org.bouncycastle.tls.NamedGroup;
import org.jmrtd.PassportService;
import org.jmrtd.lds.iso19794.IrisImageInfo;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.h0;
import sa.j;
import t.C1252d;
import t.C1253e;
import u.n;
import w.C1553a;
import w.C1554b;
import w.C1557e;
import w.C1558f;
import w.C1560h;
import w.C1561i;
import w.H;
import w.q;
import w.s;
import w.x;
import w.z;
import y0.F;

/* compiled from: ContextAware.kt */
/* renamed from: pa.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1124b implements F {
    public static HashMap A() {
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

    public static String B(Context context, int i) {
        if (context == null) {
            return "";
        }
        if (i == 1) {
            return context.getString(R.string.fingerprint_error_hw_not_available);
        }
        if (i != 7) {
            switch (i) {
                case 9:
                    break;
                case 10:
                    return context.getString(R.string.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(R.string.fingerprint_error_no_fingerprints);
                case 12:
                    return context.getString(R.string.fingerprint_error_hw_not_present);
                default:
                    Log.e("BiometricUtils", "Unknown error code: " + i);
                    return context.getString(R.string.default_error_msg);
            }
        }
        return context.getString(R.string.fingerprint_error_lockout);
    }

    public static final void C(ta.u uVar, String str) {
        uVar.l("Trailing comma before the end of JSON ".concat(str), uVar.f30025a - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static /* synthetic */ void D(ta.u uVar) {
        C(uVar, "object");
        throw null;
    }

    public static final CharSequence E(int i, CharSequence charSequence) {
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i9 = i - 30;
        int i10 = i + 30;
        String str = i9 <= 0 ? "" : ".....";
        String str2 = i10 >= charSequence.length() ? "" : ".....";
        StringBuilder s10 = v.s(str);
        if (i9 < 0) {
            i9 = 0;
        }
        int length2 = charSequence.length();
        if (i10 > length2) {
            i10 = length2;
        }
        s10.append(charSequence.subSequence(i9, i10).toString());
        s10.append(str2);
        return s10.toString();
    }

    public static final String F(String str) {
        int i = 0;
        int i9 = -1;
        if (!C0969n.Y(str, p.f15541a, false)) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = lowerCase.charAt(i10);
                    if (kotlin.jvm.internal.f.c(charAt, 31) <= 0 || kotlin.jvm.internal.f.c(charAt, 127) >= 0 || C0969n.f0(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress u6 = (str.startsWith("[") && str.endsWith("]")) ? u(1, str.length() - 1, str) : u(0, str.length(), str);
        if (u6 == null) {
            return null;
        }
        byte[] address = u6.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return u6.getHostAddress();
            }
            throw new AssertionError(v.o("Invalid IPv6 address: '", str, '\''));
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < address.length) {
            int i13 = i11;
            while (i13 < 16 && address[i13] == 0 && address[i13 + 1] == 0) {
                i13 += 2;
            }
            int i14 = i13 - i11;
            if (i14 > i12 && i14 >= 4) {
                i9 = i11;
                i12 = i14;
            }
            i11 = i13 + 2;
        }
        Ka.f fVar = new Ka.f();
        while (i < address.length) {
            if (i == i9) {
                fVar.W(58);
                i += i12;
                if (i == 16) {
                    fVar.W(58);
                }
            } else {
                if (i > 0) {
                    fVar.W(58);
                }
                byte b9 = address[i];
                byte[] bArr = wa.b.f30872a;
                fVar.a0(((b9 & 255) << 8) | (address[i + 1] & 255));
                i += 2;
            }
        }
        return fVar.M();
    }

    public static final String G(byte b9) {
        return b9 == 1 ? "quotation mark '\"'" : b9 == 2 ? "string escape sequence '\\'" : b9 == 4 ? "comma ','" : b9 == 5 ? "colon ':'" : b9 == 6 ? "start of the object '{'" : b9 == 7 ? "end of the object '}'" : b9 == 8 ? "start of the array '['" : b9 == 9 ? "end of the array ']'" : b9 == 10 ? "end of the input" : b9 == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }

    public static final String H(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) E(-1, str2));
    }

    public static final JsonEncodingException d(Number number, String str) {
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) E(-1, str)));
    }

    public static final JsonEncodingException e(f fVar) {
        return new JsonEncodingException("Value of type '" + fVar.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + fVar.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException f(int i, String str) {
        if (i >= 0) {
            str = "Unexpected JSON token at offset " + i + ": " + str;
        }
        return new JsonDecodingException(str);
    }

    public static final JsonDecodingException g(int i, String str, CharSequence charSequence) {
        StringBuilder r8 = androidx.camera.core.impl.utils.a.r(str, "\nJSON input: ");
        r8.append((Object) E(i, charSequence));
        return f(i, r8.toString());
    }

    public static final void h(InterfaceC1145e interfaceC1145e) {
        if ((interfaceC1145e instanceof j ? (j) interfaceC1145e : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + h.a(interfaceC1145e.getClass()));
    }

    public static final sa.g i(InterfaceC1144d interfaceC1144d) {
        sa.g gVar = interfaceC1144d instanceof sa.g ? (sa.g) interfaceC1144d : null;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + h.a(interfaceC1144d.getClass()));
    }

    public static void j(r rVar, StringBuilder sb2) {
        int lastIndexOf;
        if (rVar == null) {
            sb2.append("null");
            return;
        }
        String simpleName = rVar.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = rVar.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb2.append(simpleName);
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(rVar)));
    }

    public static final byte k(char c2) {
        if (c2 < '~') {
            return ta.e.f29983b[c2];
        }
        return (byte) 0;
    }

    public static void l(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void m(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void n(int i, int i9, int i10, String str) {
        if (i < i9) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i9 + ", " + i10 + "] (too low)");
        }
        if (i <= i10) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i9 + ", " + i10 + "] (too high)");
    }

    public static void o(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void q(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    public static float r(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    public static int s(int i, int i9, int i10) {
        return i < i9 ? i9 : i > i10 ? i10 : i;
    }

    public static CameraUnavailableException t(CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        int i = cameraAccessExceptionCompat.f5238a;
        int i9 = 1;
        if (i != 1) {
            i9 = 2;
            if (i != 2) {
                i9 = 3;
                if (i != 3) {
                    i9 = 4;
                    if (i != 4) {
                        i9 = 5;
                        if (i != 5) {
                            i9 = i != 10001 ? 0 : 6;
                        }
                    }
                }
            }
        }
        return new CameraUnavailableException(i9, cameraAccessExceptionCompat);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cf, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.net.InetAddress u(int r17, int r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.C1124b.u(int, int, java.lang.String):java.net.InetAddress");
    }

    public static int v(Context context, float f10) {
        return (int) TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics());
    }

    public static Quirks w(n nVar) {
        ArrayList arrayList = new ArrayList();
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        Integer num = (Integer) nVar.a(key);
        if (num != null && num.intValue() == 2) {
            arrayList.add(new C1553a(nVar));
        }
        HashSet hashSet = x.f30792a;
        String str = Build.DEVICE;
        Locale locale = Locale.US;
        if (hashSet.contains(str.toLowerCase(locale))) {
            arrayList.add(new x());
        }
        Integer num2 = (Integer) nVar.a(key);
        if (num2 != null && num2.intValue() == 2) {
            arrayList.add(new C1557e(nVar));
        }
        List<String> list = w.u.f30789a;
        String str2 = Build.MODEL;
        if (w.u.f30789a.contains(str2.toUpperCase(locale)) && ((Integer) nVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            arrayList.add(new w.u());
        }
        List<String> list2 = C1558f.f30773a;
        if (C1558f.f30773a.contains(str2.toUpperCase(locale)) && ((Integer) nVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            arrayList.add(new C1558f());
        }
        String str3 = Build.BRAND;
        if (("motorola".equalsIgnoreCase(str3) && "MotoG3".equalsIgnoreCase(str2)) || (("samsung".equalsIgnoreCase(str3) && "SM-G532F".equalsIgnoreCase(str2)) || ("samsung".equalsIgnoreCase(str3) && "SM-J700F".equalsIgnoreCase(str2)))) {
            arrayList.add(new H());
        }
        Iterator<String> it = q.f30784a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (Build.MODEL.toUpperCase(Locale.US).startsWith(it.next())) {
                if (((Integer) nVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    arrayList.add(new q());
                }
            }
        }
        if (Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) nVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            arrayList.add(new C1554b());
        }
        CameraCharacteristics.Key key2 = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        Integer num3 = (Integer) nVar.a(key2);
        if (num3 != null && num3.intValue() == 2) {
            arrayList.add(new C1561i());
        }
        Integer num4 = (Integer) nVar.a(key2);
        if (num4 != null && num4.intValue() == 2) {
            arrayList.add(new z());
        }
        Integer num5 = (Integer) nVar.a(key2);
        if (num5 != null && num5.intValue() == 2) {
            arrayList.add(new C1560h());
        }
        List<String> list3 = s.f30786a;
        String str4 = Build.MODEL;
        Locale locale2 = Locale.US;
        boolean z10 = s.f30787b.contains(str4.toLowerCase(locale2)) && ((Integer) nVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
        boolean contains = s.f30786a.contains(str4.toLowerCase(locale2));
        if (z10 || contains) {
            arrayList.add(new s());
        }
        List<String> list4 = w.v.f30790a;
        if (w.v.f30790a.contains(str4.toLowerCase(locale2)) && ((Integer) nVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            arrayList.add(new w.v());
        }
        List<String> list5 = w.r.f30785a;
        if (w.r.f30785a.contains(str4.toLowerCase(locale2)) && ((Integer) nVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            arrayList.add(new w.r());
        }
        return new Quirks(arrayList);
    }

    public static CaptureFailure x(CameraCaptureFailure cameraCaptureFailure) {
        if (cameraCaptureFailure instanceof C1252d) {
            return ((C1252d) cameraCaptureFailure).f27201a;
        }
        return null;
    }

    public static CaptureResult y(CameraCaptureResult cameraCaptureResult) {
        if (cameraCaptureResult instanceof C1253e) {
            return ((C1253e) cameraCaptureResult).f27205b;
        }
        return null;
    }

    public static final InterfaceC0835c z(f fVar) {
        if (fVar instanceof c) {
            return ((c) fVar).f25726b;
        }
        if (fVar instanceof h0) {
            return z(((h0) fVar).f26401a);
        }
        return null;
    }

    @Override // y0.F
    public void a() {
    }

    @Override // y0.F
    public void b() {
    }
}
