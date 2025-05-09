package mb;

import androidx.recyclerview.widget.u;
import com.google.android.gms.common.ConnectionResult;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.tls.CipherSuite;
import org.bouncycastle.tls.NamedGroup;
import org.bouncycastle.tls.SignatureScheme;
import org.jmrtd.PassportService;
import org.jmrtd.lds.iso19794.IrisImageInfo;
import qrcode.internals.QRCodeRegion;
import qrcode.internals.QRCodeSquareType;

/* compiled from: QRCodeSetup.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int[][] f24037a = {new int[0], new int[]{6, 18}, new int[]{6, 22}, new int[]{6, 26}, new int[]{6, 30}, new int[]{6, 34}, new int[]{6, 22, 38}, new int[]{6, 24, 42}, new int[]{6, 26, 46}, new int[]{6, 28, 50}, new int[]{6, 30, 54}, new int[]{6, 32, 58}, new int[]{6, 34, 62}, new int[]{6, 26, 46, 66}, new int[]{6, 26, 48, 70}, new int[]{6, 26, 50, 74}, new int[]{6, 30, 54, 78}, new int[]{6, 30, 56, 82}, new int[]{6, 30, 58, 86}, new int[]{6, 34, 62, 90}, new int[]{6, 28, 50, 72, 94}, new int[]{6, 26, 50, 74, 98}, new int[]{6, 30, 54, 78, 102}, new int[]{6, 28, 54, 80, 106}, new int[]{6, 32, 58, 84, 110}, new int[]{6, 30, 58, 86, 114}, new int[]{6, 34, 62, 90, 118}, new int[]{6, 26, 50, 74, 98, 122}, new int[]{6, 30, 54, 78, 102, 126}, new int[]{6, 26, 52, 78, 104, 130}, new int[]{6, 30, 56, 82, 108, 134}, new int[]{6, 34, 60, 86, 112, 138}, new int[]{6, 30, 58, 86, 114, 142}, new int[]{6, 34, 62, 90, 118, 146}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256}};

    /* renamed from: b, reason: collision with root package name */
    public static final int[][][] f24038b = {new int[][]{new int[]{41, 25, 17, 10}, new int[]{34, 20, 14, 8}, new int[]{27, 16, 11, 7}, new int[]{17, 10, 7, 4}}, new int[][]{new int[]{77, 47, 32, 20}, new int[]{63, 38, 26, 16}, new int[]{48, 29, 20, 12}, new int[]{34, 20, 14, 8}}, new int[][]{new int[]{127, 77, 53, 32}, new int[]{101, 61, 42, 26}, new int[]{77, 47, 32, 20}, new int[]{58, 35, 24, 15}}, new int[][]{new int[]{CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256, 114, 78, 48}, new int[]{149, 90, 62, 38}, new int[]{111, 67, 46, 28}, new int[]{82, 50, 34, 21}}, new int[][]{new int[]{255, 154, 106, 65}, new int[]{202, 122, 84, 52}, new int[]{144, 87, 60, 37}, new int[]{106, 64, 44, 27}}, new int[][]{new int[]{322, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 134, 82}, new int[]{255, 154, 106, 65}, new int[]{CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256, 108, 74, 45}, new int[]{139, 84, 58, 36}}, new int[][]{new int[]{370, BERTags.FLAGS, 154, 95}, new int[]{293, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256, 122, 75}, new int[]{207, 125, 86, 53}, new int[]{154, 93, 64, 39}}, new int[][]{new int[]{461, 279, 192, 118}, new int[]{365, 221, 152, 93}, new int[]{NamedGroup.ffdhe6144, 157, 108, 66}, new int[]{202, 122, 84, 52}}, new int[][]{new int[]{552, 335, 230, 141}, new int[]{432, 262, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256, 111}, new int[]{312, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, 130, 80}, new int[]{235, 143, 98, 60}}, new int[][]{new int[]{652, 395, 271, 167}, new int[]{SignatureScheme.rsa_pkcs1_sha1, 311, 213, 131}, new int[]{364, 221, 151, 93}, new int[]{288, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 119, 74}}, new int[][]{new int[]{772, 468, 321, 198}, new int[]{604, 366, 251, 155}, new int[]{427, NamedGroup.ffdhe6144, CipherSuite.TLS_PSK_WITH_NULL_SHA384, 109}, new int[]{331, 200, 137, 85}}, new int[][]{new int[]{883, 535, 367, 226}, new int[]{691, 419, 287, CipherSuite.TLS_PSK_WITH_NULL_SHA384}, new int[]{489, 296, 203, 125}, new int[]{374, 227, 155, 96}}, new int[][]{new int[]{1022, 619, 425, 262}, new int[]{796, 483, 331, 204}, new int[]{580, 352, 241, 149}, new int[]{427, NamedGroup.ffdhe6144, CipherSuite.TLS_PSK_WITH_NULL_SHA384, 109}}, new int[][]{new int[]{1101, 667, 458, 282}, new int[]{871, 528, 362, PassportService.DEFAULT_MAX_BLOCKSIZE}, new int[]{621, 376, NamedGroup.ffdhe4096, 159}, new int[]{468, 283, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 120}}, new int[][]{new int[]{1250, 758, 520, 320}, new int[]{991, 600, 412, IrisImageInfo.IMAGE_QUAL_UNDEF}, new int[]{703, 426, 292, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256}, new int[]{530, 321, 220, 136}}, new int[][]{new int[]{1408, 854, 586, 361}, new int[]{1082, 656, 450, 277}, new int[]{775, 470, 322, 198}, new int[]{602, 365, u.d.DEFAULT_SWIPE_ANIMATION_DURATION, 154}}, new int[][]{new int[]{1548, 938, 644, 397}, new int[]{1212, 734, 504, 310}, new int[]{876, 531, 364, BERTags.FLAGS}, new int[]{674, 408, 280, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384}}, new int[][]{new int[]{1725, 1046, 718, 442}, new int[]{1346, 816, 560, 345}, new int[]{948, 574, 394, 243}, new int[]{746, 452, 310, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256}}, new int[][]{new int[]{1903, 1153, 792, 488}, new int[]{ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 909, 624, 384}, new int[]{1063, 644, 442, 272}, new int[]{813, 493, 338, 208}}, new int[][]{new int[]{2061, 1249, 858, 528}, new int[]{1600, 970, 666, 410}, new int[]{1159, 702, 482, 297}, new int[]{919, 557, 382, 235}}, new int[][]{new int[]{2232, 1352, 929, 572}, new int[]{1708, 1035, 711, 438}, new int[]{1224, 742, 509, 314}, new int[]{969, 587, 403, 248}}, new int[][]{new int[]{2409, 1460, 1003, 618}, new int[]{1872, 1134, 779, 480}, new int[]{1358, 823, 565, 348}, new int[]{1056, 640, 439, 270}}, new int[][]{new int[]{2620, 1588, 1091, 672}, new int[]{SignatureScheme.rsa_pss_pss_sha512, 1248, 857, 528}, new int[]{1468, 890, 611, 376}, new int[]{1108, 672, 461, 284}}, new int[][]{new int[]{2812, 1704, 1171, 721}, new int[]{2188, 1326, 911, 561}, new int[]{1588, 963, 661, 407}, new int[]{1228, 744, 511, 315}}, new int[][]{new int[]{3057, 1853, 1273, 784}, new int[]{2395, 1451, 997, 614}, new int[]{1718, 1041, 715, 440}, new int[]{1286, 779, 535, 330}}, new int[][]{new int[]{3283, 1990, 1367, 842}, new int[]{2544, 1542, 1059, 652}, new int[]{1804, 1094, 751, 462}, new int[]{1425, 864, 593, 365}}, new int[][]{new int[]{3517, 2132, 1465, 902}, new int[]{2701, 1637, 1125, 692}, new int[]{1933, 1172, 805, 496}, new int[]{1501, 910, 625, 385}}, new int[][]{new int[]{3669, 2223, 1528, 940}, new int[]{2857, 1732, 1190, 732}, new int[]{2085, 1263, 868, 534}, new int[]{1581, 958, 658, 405}}, new int[][]{new int[]{3909, 2369, 1628, 1002}, new int[]{3035, 1839, 1264, 778}, new int[]{2181, 1322, 908, 559}, new int[]{1677, 1016, 698, 430}}, new int[][]{new int[]{4158, 2520, 1732, 1066}, new int[]{3289, 1994, 1370, 843}, new int[]{2358, 1429, 982, 604}, new int[]{1782, 1080, 742, 457}}, new int[][]{new int[]{4417, 2677, 1840, 1132}, new int[]{3486, 2113, 1452, 894}, new int[]{2473, 1499, 1030, 634}, new int[]{1897, 1150, 790, 486}}, new int[][]{new int[]{4686, 2840, 1952, 1201}, new int[]{3693, 2238, 1538, 947}, new int[]{2670, 1618, 1112, 684}, new int[]{2022, 1226, 842, 518}}, new int[][]{new int[]{4965, 3009, 2068, 1273}, new int[]{3909, 2369, 1628, 1002}, new int[]{2805, 1700, 1168, 719}, new int[]{2157, 1307, 898, 553}}, new int[][]{new int[]{5253, 3183, 2188, 1347}, new int[]{4134, 2506, 1722, 1060}, new int[]{2949, 1787, 1228, 756}, new int[]{2301, 1394, 958, 590}}};

    public static void a(int i, int i9, boolean z10, d[][] dVarArr) {
        d[] dVarArr2 = dVarArr[i];
        d dVar = dVarArr2[i9];
        if (dVar != null) {
            dVar.f24039a = z10;
        } else {
            dVarArr2[i9] = new d(z10, i, i9, dVarArr.length, null, 0, 0, null, 112);
        }
    }

    public static void b(int i, int i9, d[][] dVarArr, int i10) {
        int i11;
        int i12;
        QRCodeRegion qRCodeRegion;
        int length = dVarArr.length;
        d dVar = new d(false, i, i9, length, new e(QRCodeSquareType.f26128a, QRCodeRegion.f26126k), i10, i10, null, 128);
        int i13 = -1;
        if (-1 > i10) {
            return;
        }
        int i14 = -1;
        while (true) {
            if (i13 <= i10) {
                int i15 = i13;
                while (true) {
                    int i16 = i14 + i;
                    if (i16 < 0 || i16 >= length || (i12 = i15 + i9) < 0 || i12 >= length) {
                        i11 = i15;
                    } else {
                        boolean z10 = (i15 >= 0 && i15 < i10 && (i14 == 0 || i14 == i10 + (-1))) || (i14 >= 0 && i14 < i10 && (i15 == 0 || i15 == i10 + (-1))) || (2 <= i14 && i14 < i10 + (-2) && 2 <= i15 && i15 <= i10 + (-3));
                        if (i14 == 0) {
                            qRCodeRegion = i15 == 0 ? QRCodeRegion.f26117a : i15 == i10 + (-1) ? QRCodeRegion.f26118b : i15 == i10 ? QRCodeRegion.f26125j : QRCodeRegion.f26119c;
                        } else {
                            int i17 = i10 - 1;
                            qRCodeRegion = i14 == i17 ? i15 == 0 ? QRCodeRegion.f26123g : i15 == i17 ? QRCodeRegion.f26124h : i15 == i10 ? QRCodeRegion.f26125j : QRCodeRegion.i : i14 == i10 ? QRCodeRegion.f26125j : i15 == 0 ? QRCodeRegion.f26120d : i15 == i17 ? QRCodeRegion.f26121e : i15 == i10 ? QRCodeRegion.f26125j : QRCodeRegion.f26122f;
                        }
                        i11 = i15;
                        dVarArr[i16][i12] = new d(z10, i16, i12, length, new e(QRCodeSquareType.f26128a, qRCodeRegion), 0, 0, dVar, 96);
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i15 = i11 + 1;
                    }
                }
            }
            if (i14 == i10) {
                return;
            }
            i14++;
            i13 = -1;
        }
    }
}
