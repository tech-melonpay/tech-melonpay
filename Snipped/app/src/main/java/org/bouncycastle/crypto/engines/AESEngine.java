package org.bouncycastle.crypto.engines;

import androidx.recyclerview.widget.u;
import java.lang.reflect.Array;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StatelessProcessing;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.tls.CipherSuite;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import org.jmrtd.PassportService;
import org.jmrtd.lds.CVCAFile;

/* loaded from: classes2.dex */
public class AESEngine implements BlockCipher, StatelessProcessing {
    private static final int BLOCK_SIZE = 16;

    /* renamed from: m1, reason: collision with root package name */
    private static final int f24927m1 = -2139062144;
    private static final int m2 = 2139062143;

    /* renamed from: m3, reason: collision with root package name */
    private static final int f24928m3 = 27;

    /* renamed from: m4, reason: collision with root package name */
    private static final int f24929m4 = -1061109568;

    /* renamed from: m5, reason: collision with root package name */
    private static final int f24930m5 = 1061109567;
    private int ROUNDS;
    private int[][] WorkingKey = null;
    private boolean forEncryption;

    /* renamed from: s, reason: collision with root package name */
    private byte[] f24931s;
    private static final byte[] S = {99, 124, 119, 123, -14, 107, ISOFileInfo.FCI_BYTE, -59, ISO7816.INS_DECREASE, 1, 103, 43, -2, -41, ISOFileInfo.AB, 118, ISO7816.INS_GET_DATA, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, ISO7816.INS_GET_RESPONSE, -73, -3, -109, 38, 54, 63, -9, -52, ISO7816.INS_DECREASE_STAMPED, ISOFileInfo.f24319A5, -27, -15, 113, ISO7816.INS_LOAD_KEY_FILE, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, ISOFileInfo.DATA_BYTES1, ISO7816.INS_APPEND_RECORD, -21, 39, -78, 117, 9, ISOFileInfo.FILE_IDENTIFIER, ISO7816.INS_UNBLOCK_CHV, 26, 27, 110, 90, ISOFileInfo.f24316A0, 82, 59, ISO7816.INS_UPDATE_BINARY, ISO7816.INS_READ_RECORD2, 41, -29, 47, -124, 83, -47, 0, -19, ISO7816.INS_VERIFY, -4, ISO7816.INS_READ_BINARY2, 91, 106, -53, -66, 57, 74, 76, 88, -49, ISO7816.INS_WRITE_BINARY, -17, -86, -5, 67, 77, 51, ISOFileInfo.PROP_INFO, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, ISO7816.INS_READ_RECORD_STAMPED, ISO7816.INS_PUT_DATA, 33, 16, -1, -13, ISO7816.INS_WRITE_RECORD, -51, PassportService.SFI_DG12, 19, -20, 95, -105, ISO7816.INS_REHABILITATE_CHV, 23, -60, -89, 126, 61, ISOFileInfo.FMD_BYTE, 93, 25, 115, 96, ISOFileInfo.DATA_BYTES2, 79, ISO7816.INS_UPDATE_RECORD, ISO7816.INS_MSE, ISO7816.INS_PSO, -112, -120, 70, -18, -72, 20, -34, 94, PassportService.SFI_DG11, -37, ISO7816.INS_CREATE_FILE, ISO7816.INS_INCREASE, 58, 10, 73, 6, ISO7816.INS_CHANGE_CHV, 92, ISO7816.INS_ENVELOPE, -45, -84, ISOFileInfo.FCP_BYTE, -111, -107, ISO7816.INS_DELETE_FILE, 121, -25, -56, 55, 109, ISOFileInfo.ENV_TEMP_EF, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, ISO7816.INS_READ_BINARY_STAMPED, -58, -24, -35, 116, 31, 75, -67, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.LCS_BYTE, ISO7816.INS_MANAGE_CHANNEL, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, ISOFileInfo.CHANNEL_SECURITY, -108, -101, PassportService.SFI_COM, ISOFileInfo.FCI_EXT, -23, -50, 85, 40, -33, ISOFileInfo.SECURITY_ATTR_COMPACT, ISOFileInfo.f24317A1, -119, PassportService.SFI_DG13, -65, -26, CVCAFile.CAR_TAG, 104, 65, -103, 45, PassportService.SFI_DG15, ISO7816.INS_READ_BINARY, 84, -69, 22};
    private static final byte[] Si = {82, 9, 106, -43, ISO7816.INS_DECREASE, 54, ISOFileInfo.f24319A5, 56, -65, 64, -93, -98, ISOFileInfo.DATA_BYTES2, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, ISOFileInfo.FCI_EXT, ISO7816.INS_DECREASE_STAMPED, ISOFileInfo.CHANNEL_SECURITY, 67, ISO7816.INS_REHABILITATE_CHV, -60, -34, -23, -53, 84, 123, -108, ISO7816.INS_INCREASE, -90, ISO7816.INS_ENVELOPE, 35, 61, -18, 76, -107, PassportService.SFI_DG11, CVCAFile.CAR_TAG, -6, -61, 78, 8, 46, ISOFileInfo.f24317A1, 102, 40, -39, ISO7816.INS_CHANGE_CHV, -78, 118, 91, -94, 73, 109, ISOFileInfo.SECURITY_ATTR_EXP, -47, 37, 114, -8, -10, ISOFileInfo.FMD_BYTE, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, ISO7816.INS_READ_RECORD_STAMPED, -110, 108, ISO7816.INS_MANAGE_CHANNEL, 72, 80, -3, -19, -71, ISO7816.INS_PUT_DATA, 94, 21, 70, 87, -89, ISOFileInfo.ENV_TEMP_EF, -99, -124, -112, ISO7816.INS_LOAD_KEY_FILE, ISOFileInfo.AB, 0, ISOFileInfo.SECURITY_ATTR_COMPACT, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, ISO7816.INS_DELETE_FILE, 88, 5, -72, ISO7816.INS_READ_RECORD2, 69, 6, ISO7816.INS_WRITE_BINARY, ISO7816.INS_UNBLOCK_CHV, PassportService.SFI_COM, -113, ISO7816.INS_GET_DATA, 63, PassportService.SFI_DG15, 2, -63, -81, -67, 3, 1, 19, ISOFileInfo.LCS_BYTE, 107, 58, -111, 17, 65, 79, 103, ISO7816.INS_UPDATE_RECORD, -22, -105, -14, -49, -50, -16, ISO7816.INS_READ_BINARY_STAMPED, -26, 115, -106, -84, 116, ISO7816.INS_MSE, -25, -83, 53, ISOFileInfo.PROP_INFO, ISO7816.INS_APPEND_RECORD, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, ISOFileInfo.FCI_BYTE, -73, ISOFileInfo.FCP_BYTE, 14, -86, 24, -66, 27, -4, 86, 62, 75, -58, ISO7816.INS_WRITE_RECORD, 121, ISO7816.INS_VERIFY, -102, -37, ISO7816.INS_GET_RESPONSE, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, ISO7816.INS_READ_BINARY2, 18, 16, 89, 39, ISOFileInfo.DATA_BYTES1, -20, 95, 96, 81, Byte.MAX_VALUE, -87, 25, -75, 74, PassportService.SFI_DG13, 45, -27, 122, -97, -109, -55, -100, -17, ISOFileInfo.f24316A0, ISO7816.INS_CREATE_FILE, 59, 77, -82, ISO7816.INS_PSO, -11, ISO7816.INS_READ_BINARY, -56, -21, -69, 60, ISOFileInfo.FILE_IDENTIFIER, 83, -103, 97, 23, 43, 4, 126, -70, 119, ISO7816.INS_UPDATE_BINARY, 38, -31, 105, 20, 99, 85, 33, PassportService.SFI_DG12, 125};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 125, u.d.DEFAULT_SWIPE_ANIMATION_DURATION, 239, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 145};

    /* renamed from: T0, reason: collision with root package name */
    private static final int[] f24926T0 = {-1520213050, -2072216328, -1720223762, -1921287178, 234025727, -1117033514, -1318096930, 1422247313, 1345335392, 50397442, -1452841010, 2099981142, 436141799, 1658312629, -424957107, -1703512340, 1170918031, -1652391393, 1086966153, -2021818886, 368769775, -346465870, -918075506, 200339707, -324162239, 1742001331, -39673249, -357585083, -1080255453, -140204973, -1770884380, 1539358875, -1028147339, 486407649, -1366060227, 1780885068, 1513502316, 1094664062, 49805301, 1338821763, 1546925160, -190470831, 887481809, 150073849, -1821281822, 1943591083, 1395732834, 1058346282, 201589768, 1388824469, 1696801606, 1589887901, 672667696, -1583966665, 251987210, -1248159185, 151455502, 907153956, -1686077413, 1038279391, 652995533, 1764173646, -843926913, -1619692054, 453576978, -1635548387, 1949051992, 773462580, 756751158, -1301385508, -296068428, -73359269, -162377052, 1295727478, 1641469623, -827083907, 2066295122, 1055122397, 1898917726, -1752923117, -179088474, 1758581177, 0, 753790401, 1612718144, 536673507, -927878791, -312779850, -1100322092, 1187761037, -641810841, 1262041458, -565556588, -733197160, -396863312, 1255133061, 1808847035, 720367557, -441800113, 385612781, -985447546, -682799718, 1429418854, -1803188975, -817543798, 284817897, 100794884, -2122350594, -263171936, 1144798328, -1163944155, -475486133, -212774494, -22830243, -1069531008, -1970303227, -1382903233, -1130521311, 1211644016, 83228145, -541279133, -1044990345, 1977277103, 1663115586, 806359072, 452984805, 250868733, 1842533055, 1288555905, 336333848, 890442534, 804056259, -513843266, -1567123659, -867941240, 957814574, 1472513171, -223893675, -2105639172, 1195195770, -1402706744, -413311558, 723065138, -1787595802, -1604296512, -1736343271, -783331426, 2145180835, 1713513028, 2116692564, -1416589253, -2088204277, -901364084, 703524551, -742868885, 1007948840, 2044649127, -497131844, 487262998, 1994120109, 1004593371, 1446130276, 1312438900, 503974420, -615954030, 168166924, 1814307912, -463709000, 1573044895, 1859376061, -273896381, -1503501628, -1466855111, -1533700815, 937747667, -1954973198, 854058965, 1137232011, 1496790894, -1217565222, -1936880383, 1691735473, -766620004, -525751991, -1267962664, -95005012, 133494003, 636152527, -1352309302, -1904575756, -374428089, 403179536, -709182865, -2005370640, 1864705354, 1915629148, 605822008, -240736681, -944458637, 1371981463, 602466507, 2094914977, -1670089496, 555687742, -582268010, -591544991, -2037675251, -2054518257, -1871679264, 1111375484, -994724495, -1436129588, -666351472, 84083462, 32962295, 302911004, -1553899070, 1597322602, -111716434, -793134743, -1853454825, 1489093017, 656219450, -1180787161, 954327513, 335083755, -1281845205, 856756514, -1150719534, 1893325225, -1987146233, -1483434957, -1231316179, 572399164, -1836611819, 552200649, 1238290055, -11184726, 2015897680, 2061492133, -1886614525, -123625127, -2138470135, 386731290, -624967835, 837215959, -968736124, -1201116976, -1019133566, -1332111063, 1999449434, 286199582, -877612933, -61582168, -692339859, 974525996};
    private static final int[] Tinv0 = {1353184337, 1399144830, -1012656358, -1772214470, -882136261, -247096033, -1420232020, -1828461749, 1442459680, -160598355, -1854485368, 625738485, -52959921, -674551099, -2143013594, -1885117771, 1230680542, 1729870373, -1743852987, -507445667, 41234371, 317738113, -1550367091, -956705941, -413167869, -1784901099, -344298049, -631680363, 763608788, -752782248, 694804553, 1154009486, 1787413109, 2021232372, 1799248025, -579749593, -1236278850, 397248752, 1722556617, -1271214467, 407560035, -2110711067, 1613975959, 1165972322, -529046351, -2068943941, 480281086, -1809118983, 1483229296, 436028815, -2022908268, -1208452270, 601060267, -503166094, 1468997603, 715871590, 120122290, 63092015, -1703164538, -1526188077, -226023376, -1297760477, -1167457534, 1552029421, 723308426, -1833666137, -252573709, -1578997426, -839591323, -708967162, 526529745, -1963022652, -1655493068, -1604979806, 853641733, 1978398372, 971801355, -1427152832, 111112542, 1360031421, -108388034, 1023860118, -1375387939, 1186850381, -1249028975, 90031217, 1876166148, -15380384, 620468249, -1746289194, -868007799, 2006899047, -1119688528, -2004121337, 945494503, -605108103, 1191869601, -384875908, -920746760, 0, -2088337399, 1223502642, -1401941730, 1316117100, -67170563, 1446544655, 517320253, 658058550, 1691946762, 564550760, -783000677, 976107044, -1318647284, 266819475, -761860428, -1634624741, 1338359936, -1574904735, 1766553434, 370807324, 179999714, -450191168, 1138762300, 488053522, 185403662, -1379431438, -1180125651, -928440812, -2061897385, 1275557295, -1143105042, -44007517, -1624899081, -1124765092, -985962940, 880737115, 1982415755, -590994485, 1761406390, 1676797112, -891538985, 277177154, 1076008723, 538035844, 2099530373, -130171950, 288553390, 1839278535, 1261411869, -214912292, -330136051, -790380169, 1813426987, -1715900247, -95906799, 577038663, -997393240, 440397984, -668172970, -275762398, -951170681, -1043253031, -22885748, 906744984, -813566554, 685669029, 646887386, -1530942145, -459458004, 227702864, -1681105046, 1648787028, -1038905866, -390539120, 1593260334, -173030526, -1098883681, 2090061929, -1456614033, -1290656305, 999926984, -1484974064, 1852021992, 2075868123, 158869197, -199730834, 28809964, -1466282109, 1701746150, 2129067946, 147831841, -420997649, -644094022, -835293366, -737566742, -696471511, -1347247055, 824393514, 815048134, -1067015627, 935087732, -1496677636, -1328508704, 366520115, 1251476721, -136647615, 240176511, 804688151, -1915335306, 1303441219, 1414376140, -553347356, -474623586, 461924940, -1205916479, 2136040774, 82468509, 1563790337, 1937016826, 776014843, 1511876531, 1389550482, 861278441, 323475053, -1939744870, 2047648055, -1911228327, -1992551445, -299390514, 902390199, -303751967, 1018251130, 1507840668, 1064563285, 2043548696, -1086863501, -355600557, 1537932639, 342834655, -2032450440, -2114736182, 1053059257, 741614648, 1598071746, 1925389590, 203809468, -1958134744, 1100287487, 1895934009, -558691320, -1662733096, -1866377628, 1636092795, 1890988757, 1952214088, 1113045200};

    private static int FFmulX(int i) {
        return (((i & f24927m1) >>> 7) * 27) ^ ((m2 & i) << 1);
    }

    private static int FFmulX2(int i) {
        int i9 = (f24930m5 & i) << 2;
        int i10 = i & f24929m4;
        int i11 = i10 ^ (i10 >>> 1);
        return (i11 >>> 5) ^ (i9 ^ (i11 >>> 2));
    }

    private void decryptBlock(byte[] bArr, int i, byte[] bArr2, int i9, int[][] iArr) {
        int littleEndianToInt = Pack.littleEndianToInt(bArr, i);
        int littleEndianToInt2 = Pack.littleEndianToInt(bArr, i + 4);
        int littleEndianToInt3 = Pack.littleEndianToInt(bArr, i + 8);
        int littleEndianToInt4 = Pack.littleEndianToInt(bArr, i + 12);
        int i10 = this.ROUNDS;
        int[] iArr2 = iArr[i10];
        char c2 = 0;
        int i11 = littleEndianToInt ^ iArr2[0];
        int i12 = littleEndianToInt2 ^ iArr2[1];
        int i13 = littleEndianToInt3 ^ iArr2[2];
        int i14 = i10 - 1;
        int i15 = littleEndianToInt4 ^ iArr2[3];
        for (int i16 = 1; i14 > i16; i16 = 1) {
            int[] iArr3 = Tinv0;
            int shift = (((shift(iArr3[(i15 >> 8) & 255], 24) ^ iArr3[i11 & 255]) ^ shift(iArr3[(i13 >> 16) & 255], 16)) ^ shift(iArr3[(i12 >> 24) & 255], 8)) ^ iArr[i14][c2];
            int shift2 = (((shift(iArr3[(i11 >> 8) & 255], 24) ^ iArr3[i12 & 255]) ^ shift(iArr3[(i15 >> 16) & 255], 16)) ^ shift(iArr3[(i13 >> 24) & 255], 8)) ^ iArr[i14][i16];
            int shift3 = (((shift(iArr3[(i12 >> 8) & 255], 24) ^ iArr3[i13 & 255]) ^ shift(iArr3[(i11 >> 16) & 255], 16)) ^ shift(iArr3[(i15 >> 24) & 255], 8)) ^ iArr[i14][2];
            int shift4 = ((iArr3[i15 & 255] ^ shift(iArr3[(i13 >> 8) & 255], 24)) ^ shift(iArr3[(i12 >> 16) & 255], 16)) ^ shift(iArr3[(i11 >> 24) & 255], 8);
            int i17 = i14 - 1;
            int i18 = shift4 ^ iArr[i14][3];
            int shift5 = (((iArr3[shift & 255] ^ shift(iArr3[(i18 >> 8) & 255], 24)) ^ shift(iArr3[(shift3 >> 16) & 255], 16)) ^ shift(iArr3[(shift2 >> 24) & 255], 8)) ^ iArr[i17][0];
            int shift6 = (((iArr3[shift2 & 255] ^ shift(iArr3[(shift >> 8) & 255], 24)) ^ shift(iArr3[(i18 >> 16) & 255], 16)) ^ shift(iArr3[(shift3 >> 24) & 255], 8)) ^ iArr[i17][1];
            int shift7 = (((iArr3[shift3 & 255] ^ shift(iArr3[(shift2 >> 8) & 255], 24)) ^ shift(iArr3[(shift >> 16) & 255], 16)) ^ shift(iArr3[(i18 >> 24) & 255], 8)) ^ iArr[i17][2];
            i14 -= 2;
            i15 = (((iArr3[i18 & 255] ^ shift(iArr3[(shift3 >> 8) & 255], 24)) ^ shift(iArr3[(shift2 >> 16) & 255], 16)) ^ shift(iArr3[(shift >> 24) & 255], 8)) ^ iArr[i17][3];
            i11 = shift5;
            i12 = shift6;
            i13 = shift7;
            c2 = 0;
        }
        int[] iArr4 = Tinv0;
        int shift8 = (((iArr4[i11 & 255] ^ shift(iArr4[(i15 >> 8) & 255], 24)) ^ shift(iArr4[(i13 >> 16) & 255], 16)) ^ shift(iArr4[(i12 >> 24) & 255], 8)) ^ iArr[i14][0];
        int shift9 = (((iArr4[i12 & 255] ^ shift(iArr4[(i11 >> 8) & 255], 24)) ^ shift(iArr4[(i15 >> 16) & 255], 16)) ^ shift(iArr4[(i13 >> 24) & 255], 8)) ^ iArr[i14][1];
        int shift10 = (((iArr4[i13 & 255] ^ shift(iArr4[(i12 >> 8) & 255], 24)) ^ shift(iArr4[(i11 >> 16) & 255], 16)) ^ shift(iArr4[(i15 >> 24) & 255], 8)) ^ iArr[i14][2];
        int shift11 = (((iArr4[i15 & 255] ^ shift(iArr4[(i13 >> 8) & 255], 24)) ^ shift(iArr4[(i12 >> 16) & 255], 16)) ^ shift(iArr4[(i11 >> 24) & 255], 8)) ^ iArr[i14][3];
        byte[] bArr3 = Si;
        int i19 = bArr3[shift8 & 255] & 255;
        byte[] bArr4 = this.f24931s;
        int i20 = ((i19 ^ ((bArr4[(shift11 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(shift10 >> 16) & 255] & 255) << 16)) ^ (bArr3[(shift9 >> 24) & 255] << 24);
        int[] iArr5 = iArr[0];
        int i21 = i20 ^ iArr5[0];
        int i22 = ((((bArr4[shift9 & 255] & 255) ^ ((bArr4[(shift8 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(shift11 >> 16) & 255] & 255) << 16)) ^ (bArr4[(shift10 >> 24) & 255] << 24)) ^ iArr5[1];
        int i23 = ((((bArr4[shift10 & 255] & 255) ^ ((bArr3[(shift9 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(shift8 >> 16) & 255] & 255) << 16)) ^ (bArr4[(shift11 >> 24) & 255] << 24)) ^ iArr5[2];
        int i24 = ((((bArr3[shift11 & 255] & 255) ^ ((bArr4[(shift10 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(shift9 >> 16) & 255] & 255) << 16)) ^ (bArr4[(shift8 >> 24) & 255] << 24)) ^ iArr5[3];
        Pack.intToLittleEndian(i21, bArr2, i9);
        Pack.intToLittleEndian(i22, bArr2, i9 + 4);
        Pack.intToLittleEndian(i23, bArr2, i9 + 8);
        Pack.intToLittleEndian(i24, bArr2, i9 + 12);
    }

    private void encryptBlock(byte[] bArr, int i, byte[] bArr2, int i9, int[][] iArr) {
        int littleEndianToInt = Pack.littleEndianToInt(bArr, i);
        int littleEndianToInt2 = Pack.littleEndianToInt(bArr, i + 4);
        int littleEndianToInt3 = Pack.littleEndianToInt(bArr, i + 8);
        int littleEndianToInt4 = Pack.littleEndianToInt(bArr, i + 12);
        char c2 = 0;
        int[] iArr2 = iArr[0];
        int i10 = littleEndianToInt ^ iArr2[0];
        int i11 = littleEndianToInt2 ^ iArr2[1];
        int i12 = littleEndianToInt3 ^ iArr2[2];
        int i13 = littleEndianToInt4 ^ iArr2[3];
        int i14 = 1;
        for (int i15 = 1; i14 < this.ROUNDS - i15; i15 = 1) {
            int[] iArr3 = f24926T0;
            int shift = (((shift(iArr3[(i11 >> 8) & 255], 24) ^ iArr3[i10 & 255]) ^ shift(iArr3[(i12 >> 16) & 255], 16)) ^ shift(iArr3[(i13 >> 24) & 255], 8)) ^ iArr[i14][c2];
            int shift2 = (((shift(iArr3[(i12 >> 8) & 255], 24) ^ iArr3[i11 & 255]) ^ shift(iArr3[(i13 >> 16) & 255], 16)) ^ shift(iArr3[(i10 >> 24) & 255], 8)) ^ iArr[i14][i15];
            int shift3 = (((shift(iArr3[(i13 >> 8) & 255], 24) ^ iArr3[i12 & 255]) ^ shift(iArr3[(i10 >> 16) & 255], 16)) ^ shift(iArr3[(i11 >> 24) & 255], 8)) ^ iArr[i14][2];
            int shift4 = ((iArr3[i13 & 255] ^ shift(iArr3[(i10 >> 8) & 255], 24)) ^ shift(iArr3[(i11 >> 16) & 255], 16)) ^ shift(iArr3[(i12 >> 24) & 255], 8);
            int i16 = i14 + 1;
            int i17 = shift4 ^ iArr[i14][3];
            int shift5 = (((iArr3[shift & 255] ^ shift(iArr3[(shift2 >> 8) & 255], 24)) ^ shift(iArr3[(shift3 >> 16) & 255], 16)) ^ shift(iArr3[(i17 >> 24) & 255], 8)) ^ iArr[i16][0];
            int shift6 = (((iArr3[shift2 & 255] ^ shift(iArr3[(shift3 >> 8) & 255], 24)) ^ shift(iArr3[(i17 >> 16) & 255], 16)) ^ shift(iArr3[(shift >> 24) & 255], 8)) ^ iArr[i16][1];
            int shift7 = (((iArr3[shift3 & 255] ^ shift(iArr3[(i17 >> 8) & 255], 24)) ^ shift(iArr3[(shift >> 16) & 255], 16)) ^ shift(iArr3[(shift2 >> 24) & 255], 8)) ^ iArr[i16][2];
            i14 += 2;
            i13 = (((iArr3[i17 & 255] ^ shift(iArr3[(shift >> 8) & 255], 24)) ^ shift(iArr3[(shift2 >> 16) & 255], 16)) ^ shift(iArr3[(shift3 >> 24) & 255], 8)) ^ iArr[i16][3];
            i10 = shift5;
            i11 = shift6;
            i12 = shift7;
            c2 = 0;
        }
        int[] iArr4 = f24926T0;
        int shift8 = (((iArr4[i10 & 255] ^ shift(iArr4[(i11 >> 8) & 255], 24)) ^ shift(iArr4[(i12 >> 16) & 255], 16)) ^ shift(iArr4[(i13 >> 24) & 255], 8)) ^ iArr[i14][0];
        int shift9 = (((iArr4[i11 & 255] ^ shift(iArr4[(i12 >> 8) & 255], 24)) ^ shift(iArr4[(i13 >> 16) & 255], 16)) ^ shift(iArr4[(i10 >> 24) & 255], 8)) ^ iArr[i14][1];
        int shift10 = (((iArr4[i12 & 255] ^ shift(iArr4[(i13 >> 8) & 255], 24)) ^ shift(iArr4[(i10 >> 16) & 255], 16)) ^ shift(iArr4[(i11 >> 24) & 255], 8)) ^ iArr[i14][2];
        int shift11 = (((iArr4[i13 & 255] ^ shift(iArr4[(i10 >> 8) & 255], 24)) ^ shift(iArr4[(i11 >> 16) & 255], 16)) ^ shift(iArr4[(i12 >> 24) & 255], 8)) ^ iArr[i14][3];
        byte[] bArr3 = S;
        int i18 = (bArr3[shift8 & 255] & 255) ^ ((bArr3[(shift9 >> 8) & 255] & 255) << 8);
        byte[] bArr4 = this.f24931s;
        int i19 = (i18 ^ ((bArr4[(shift10 >> 16) & 255] & 255) << 16)) ^ (bArr4[(shift11 >> 24) & 255] << 24);
        int[] iArr5 = iArr[i14 + 1];
        int i20 = i19 ^ iArr5[0];
        int i21 = ((((bArr4[shift9 & 255] & 255) ^ ((bArr3[(shift10 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(shift11 >> 16) & 255] & 255) << 16)) ^ (bArr4[(shift8 >> 24) & 255] << 24)) ^ iArr5[1];
        int i22 = ((((bArr4[shift10 & 255] & 255) ^ ((bArr3[(shift11 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(shift8 >> 16) & 255] & 255) << 16)) ^ (bArr3[(shift9 >> 24) & 255] << 24)) ^ iArr5[2];
        int i23 = ((((bArr4[shift11 & 255] & 255) ^ ((bArr4[(shift8 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(shift9 >> 16) & 255] & 255) << 16)) ^ (bArr3[(shift10 >> 24) & 255] << 24)) ^ iArr5[3];
        Pack.intToLittleEndian(i20, bArr2, i9);
        Pack.intToLittleEndian(i21, bArr2, i9 + 4);
        Pack.intToLittleEndian(i22, bArr2, i9 + 8);
        Pack.intToLittleEndian(i23, bArr2, i9 + 12);
    }

    private int[][] generateWorkingKey(byte[] bArr, boolean z10) {
        int length = bArr.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i = length >>> 2;
        this.ROUNDS = i + 6;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i + 7, 4);
        int i9 = 8;
        char c2 = 3;
        if (i == 4) {
            int littleEndianToInt = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = littleEndianToInt;
            int littleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = littleEndianToInt2;
            int littleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = littleEndianToInt3;
            int littleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = littleEndianToInt4;
            for (int i10 = 1; i10 <= 10; i10++) {
                littleEndianToInt ^= subWord(shift(littleEndianToInt4, 8)) ^ rcon[i10 - 1];
                int[] iArr2 = iArr[i10];
                iArr2[0] = littleEndianToInt;
                littleEndianToInt2 ^= littleEndianToInt;
                iArr2[1] = littleEndianToInt2;
                littleEndianToInt3 ^= littleEndianToInt2;
                iArr2[2] = littleEndianToInt3;
                littleEndianToInt4 ^= littleEndianToInt3;
                iArr2[3] = littleEndianToInt4;
            }
        } else if (i == 6) {
            int littleEndianToInt5 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = littleEndianToInt5;
            int littleEndianToInt6 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = littleEndianToInt6;
            int littleEndianToInt7 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = littleEndianToInt7;
            int littleEndianToInt8 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = littleEndianToInt8;
            int littleEndianToInt9 = Pack.littleEndianToInt(bArr, 16);
            int littleEndianToInt10 = Pack.littleEndianToInt(bArr, 20);
            int i11 = 1;
            int i12 = 1;
            while (true) {
                int[] iArr3 = iArr[i11];
                iArr3[0] = littleEndianToInt9;
                iArr3[1] = littleEndianToInt10;
                int subWord = littleEndianToInt5 ^ (subWord(shift(littleEndianToInt10, 8)) ^ i12);
                int[] iArr4 = iArr[i11];
                iArr4[2] = subWord;
                int i13 = littleEndianToInt6 ^ subWord;
                iArr4[3] = i13;
                int i14 = littleEndianToInt7 ^ i13;
                int[] iArr5 = iArr[i11 + 1];
                iArr5[0] = i14;
                int i15 = littleEndianToInt8 ^ i14;
                iArr5[1] = i15;
                int i16 = littleEndianToInt9 ^ i15;
                iArr5[2] = i16;
                int i17 = littleEndianToInt10 ^ i16;
                iArr5[3] = i17;
                int subWord2 = subWord(shift(i17, 8)) ^ (i12 << 1);
                i12 <<= 2;
                littleEndianToInt5 = subWord ^ subWord2;
                int[] iArr6 = iArr[i11 + 2];
                iArr6[0] = littleEndianToInt5;
                littleEndianToInt6 = i13 ^ littleEndianToInt5;
                iArr6[1] = littleEndianToInt6;
                littleEndianToInt7 = i14 ^ littleEndianToInt6;
                iArr6[2] = littleEndianToInt7;
                littleEndianToInt8 = i15 ^ littleEndianToInt7;
                iArr6[3] = littleEndianToInt8;
                i11 += 3;
                if (i11 >= 13) {
                    break;
                }
                littleEndianToInt9 = i16 ^ littleEndianToInt8;
                littleEndianToInt10 = i17 ^ littleEndianToInt9;
            }
        } else {
            if (i != 8) {
                throw new IllegalStateException("Should never get here");
            }
            int littleEndianToInt11 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = littleEndianToInt11;
            int littleEndianToInt12 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = littleEndianToInt12;
            int littleEndianToInt13 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = littleEndianToInt13;
            int littleEndianToInt14 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = littleEndianToInt14;
            int littleEndianToInt15 = Pack.littleEndianToInt(bArr, 16);
            iArr[1][0] = littleEndianToInt15;
            int littleEndianToInt16 = Pack.littleEndianToInt(bArr, 20);
            iArr[1][1] = littleEndianToInt16;
            int littleEndianToInt17 = Pack.littleEndianToInt(bArr, 24);
            iArr[1][2] = littleEndianToInt17;
            int littleEndianToInt18 = Pack.littleEndianToInt(bArr, 28);
            iArr[1][3] = littleEndianToInt18;
            int i18 = 2;
            int i19 = 1;
            while (true) {
                int subWord3 = subWord(shift(littleEndianToInt18, i9)) ^ i19;
                i19 <<= 1;
                littleEndianToInt11 ^= subWord3;
                int[] iArr7 = iArr[i18];
                iArr7[0] = littleEndianToInt11;
                littleEndianToInt12 ^= littleEndianToInt11;
                iArr7[1] = littleEndianToInt12;
                littleEndianToInt13 ^= littleEndianToInt12;
                iArr7[2] = littleEndianToInt13;
                littleEndianToInt14 ^= littleEndianToInt13;
                iArr7[c2] = littleEndianToInt14;
                int i20 = i18 + 1;
                if (i20 >= 15) {
                    break;
                }
                littleEndianToInt15 ^= subWord(littleEndianToInt14);
                int[] iArr8 = iArr[i20];
                iArr8[0] = littleEndianToInt15;
                littleEndianToInt16 ^= littleEndianToInt15;
                iArr8[1] = littleEndianToInt16;
                littleEndianToInt17 ^= littleEndianToInt16;
                iArr8[2] = littleEndianToInt17;
                littleEndianToInt18 ^= littleEndianToInt17;
                iArr8[3] = littleEndianToInt18;
                i18 += 2;
                i9 = 8;
                c2 = 3;
            }
        }
        if (!z10) {
            for (int i21 = 1; i21 < this.ROUNDS; i21++) {
                for (int i22 = 0; i22 < 4; i22++) {
                    int[] iArr9 = iArr[i21];
                    iArr9[i22] = inv_mcol(iArr9[i22]);
                }
            }
        }
        return iArr;
    }

    private static int inv_mcol(int i) {
        int shift = shift(i, 8) ^ i;
        int FFmulX = i ^ FFmulX(shift);
        int FFmulX2 = shift ^ FFmulX2(FFmulX);
        return FFmulX ^ (FFmulX2 ^ shift(FFmulX2, 16));
    }

    private static int shift(int i, int i9) {
        return (i << (-i9)) | (i >>> i9);
    }

    private static int subWord(int i) {
        byte[] bArr = S;
        return (bArr[(i >> 24) & 255] << 24) | (bArr[i & 255] & 255) | ((bArr[(i >> 8) & 255] & 255) << 8) | ((bArr[(i >> 16) & 255] & 255) << 16);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "AES";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.h("invalid parameter passed to AES init - ", cipherParameters));
        }
        this.WorkingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey(), z10);
        this.forEncryption = z10;
        if (z10) {
            this.f24931s = Arrays.clone(S);
        } else {
            this.f24931s = Arrays.clone(Si);
        }
    }

    @Override // org.bouncycastle.crypto.StatelessProcessing
    public BlockCipher newInstance() {
        return new AESEngine();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        int[][] iArr = this.WorkingKey;
        if (iArr == null) {
            throw new IllegalStateException("AES engine not initialised");
        }
        if (i > bArr.length - 16) {
            throw new DataLengthException("input buffer too short");
        }
        if (i9 > bArr2.length - 16) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.forEncryption) {
            encryptBlock(bArr, i, bArr2, i9, iArr);
        } else {
            decryptBlock(bArr, i, bArr2, i9, iArr);
        }
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
