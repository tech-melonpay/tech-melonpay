package L0;

import L0.b;
import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.sumsub.sns.internal.core.data.model.p;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import net.sf.scuba.smartcards.ISO7816;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.tls.CipherSuite;
import org.bouncycastle.tls.NamedGroup;
import org.bouncycastle.tls.SignatureScheme;
import org.jmrtd.PassportService;
import org.jmrtd.lds.CVCAFile;
import org.jmrtd.lds.iso19794.IrisImageInfo;

/* compiled from: ExifInterface.java */
/* loaded from: classes.dex */
public final class a {
    public static final SimpleDateFormat R;
    public static final e V;
    public static final e[][] W;
    public static final e[] X;
    public static final HashMap<Integer, e>[] Y;

    /* renamed from: Z, reason: collision with root package name */
    public static final HashMap<String, e>[] f2380Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final HashSet<String> f2381a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final HashMap<Integer, Integer> f2382b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final Charset f2383c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final byte[] f2384d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final byte[] f2385e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final Pattern f2386f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final Pattern f2387g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final Pattern f2388h0;

    /* renamed from: a, reason: collision with root package name */
    public String f2396a;

    /* renamed from: b, reason: collision with root package name */
    public FileDescriptor f2397b;

    /* renamed from: c, reason: collision with root package name */
    public AssetManager.AssetInputStream f2398c;

    /* renamed from: d, reason: collision with root package name */
    public int f2399d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap<String, d>[] f2400e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f2401f;

    /* renamed from: g, reason: collision with root package name */
    public ByteOrder f2402g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2403h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2404j;

    /* renamed from: k, reason: collision with root package name */
    public int f2405k;

    /* renamed from: l, reason: collision with root package name */
    public int f2406l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f2407m;

    /* renamed from: n, reason: collision with root package name */
    public int f2408n;

    /* renamed from: o, reason: collision with root package name */
    public int f2409o;

    /* renamed from: p, reason: collision with root package name */
    public int f2410p;

    /* renamed from: q, reason: collision with root package name */
    public int f2411q;

    /* renamed from: r, reason: collision with root package name */
    public int f2412r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2413s;

    /* renamed from: t, reason: collision with root package name */
    public static final boolean f2389t = Log.isLoggable("ExifInterface", 3);

    /* renamed from: u, reason: collision with root package name */
    public static final List<Integer> f2390u = Arrays.asList(1, 6, 3, 8);

    /* renamed from: v, reason: collision with root package name */
    public static final List<Integer> f2391v = Arrays.asList(2, 7, 4, 5);

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f2392w = {8, 8, 8};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f2393x = {8};

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f2394y = {-1, ISO7816.INS_LOAD_KEY_FILE, -1};

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f2395z = {102, 116, 121, ISO7816.INS_MANAGE_CHANNEL};

    /* renamed from: A, reason: collision with root package name */
    public static final byte[] f2363A = {109, 105, 102, 49};

    /* renamed from: B, reason: collision with root package name */
    public static final byte[] f2364B = {104, 101, 105, 99};

    /* renamed from: C, reason: collision with root package name */
    public static final byte[] f2365C = {79, 76, 89, 77, 80, 0};

    /* renamed from: D, reason: collision with root package name */
    public static final byte[] f2366D = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: E, reason: collision with root package name */
    public static final byte[] f2367E = {-119, 80, 78, 71, PassportService.SFI_DG13, 10, 26, 10};

    /* renamed from: F, reason: collision with root package name */
    public static final byte[] f2368F = {101, 88, 73, 102};

    /* renamed from: G, reason: collision with root package name */
    public static final byte[] f2369G = {73, 72, ISO7816.INS_REHABILITATE_CHV, 82};

    /* renamed from: H, reason: collision with root package name */
    public static final byte[] f2370H = {73, 69, 78, ISO7816.INS_REHABILITATE_CHV};

    /* renamed from: I, reason: collision with root package name */
    public static final byte[] f2371I = {82, 73, 70, 70};

    /* renamed from: J, reason: collision with root package name */
    public static final byte[] f2372J = {87, 69, CVCAFile.CAR_TAG, 80};

    /* renamed from: K, reason: collision with root package name */
    public static final byte[] f2373K = {69, 88, 73, 70};

    /* renamed from: L, reason: collision with root package name */
    public static final byte[] f2374L = {-99, 1, ISO7816.INS_PSO};

    /* renamed from: M, reason: collision with root package name */
    public static final byte[] f2375M = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: N, reason: collision with root package name */
    public static final byte[] f2376N = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: O, reason: collision with root package name */
    public static final byte[] f2377O = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: P, reason: collision with root package name */
    public static final byte[] f2378P = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: Q, reason: collision with root package name */
    public static final byte[] f2379Q = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] S = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] T = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] U = {65, 83, 67, 73, 73, 0, 0, 0};

    /* compiled from: ExifInterface.java */
    public static class c extends FilterOutputStream {

        /* renamed from: a, reason: collision with root package name */
        public final OutputStream f2421a;

        /* renamed from: b, reason: collision with root package name */
        public ByteOrder f2422b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f2421a = outputStream;
            this.f2422b = byteOrder;
        }

        public final void d(int i) {
            this.f2421a.write(i);
        }

        public final void i(int i) {
            ByteOrder byteOrder = this.f2422b;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            OutputStream outputStream = this.f2421a;
            if (byteOrder == byteOrder2) {
                outputStream.write(i & 255);
                outputStream.write((i >>> 8) & 255);
                outputStream.write((i >>> 16) & 255);
                outputStream.write((i >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                outputStream.write((i >>> 24) & 255);
                outputStream.write((i >>> 16) & 255);
                outputStream.write((i >>> 8) & 255);
                outputStream.write(i & 255);
            }
        }

        public final void j(short s10) {
            ByteOrder byteOrder = this.f2422b;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            OutputStream outputStream = this.f2421a;
            if (byteOrder == byteOrder2) {
                outputStream.write(s10 & 255);
                outputStream.write((s10 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                outputStream.write((s10 >>> 8) & 255);
                outputStream.write(s10 & 255);
            }
        }

        public final void p(long j10) {
            if (j10 > BodyPartID.bodyIdMax) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
            }
            i((int) j10);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) {
            this.f2421a.write(bArr);
        }

        public final void y(int i) {
            if (i > 65535) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
            }
            j((short) i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i, int i9) {
            this.f2421a.write(bArr, i, i9);
        }
    }

    /* compiled from: ExifInterface.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f2423a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2424b;

        /* renamed from: c, reason: collision with root package name */
        public final long f2425c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f2426d;

        public d(int i, int i9, byte[] bArr) {
            this(i, i9, -1L, bArr);
        }

        public static d a(String str) {
            byte[] bytes = str.concat("\u0000").getBytes(a.f2383c0);
            return new d(2, bytes.length, bytes);
        }

        public static d b(long j10, ByteOrder byteOrder) {
            return c(new long[]{j10}, byteOrder);
        }

        public static d c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.T[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j10 : jArr) {
                wrap.putInt((int) j10);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.T[5] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f2431a);
                wrap.putInt((int) fVar.f2432b);
            }
            return new d(5, fVarArr.length, wrap.array());
        }

        public static d e(int i, ByteOrder byteOrder) {
            return f(new int[]{i}, byteOrder);
        }

        public static d f(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.T[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public final double g(ByteOrder byteOrder) {
            Object j10 = j(byteOrder);
            if (j10 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (j10 instanceof String) {
                return Double.parseDouble((String) j10);
            }
            if (j10 instanceof long[]) {
                if (((long[]) j10).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (j10 instanceof int[]) {
                if (((int[]) j10).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (j10 instanceof double[]) {
                double[] dArr = (double[]) j10;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(j10 instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) j10;
            if (fVarArr.length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            f fVar = fVarArr[0];
            return fVar.f2431a / fVar.f2432b;
        }

        public final int h(ByteOrder byteOrder) {
            Object j10 = j(byteOrder);
            if (j10 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (j10 instanceof String) {
                return Integer.parseInt((String) j10);
            }
            if (j10 instanceof long[]) {
                long[] jArr = (long[]) j10;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(j10 instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) j10;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public final String i(ByteOrder byteOrder) {
            Object j10 = j(byteOrder);
            if (j10 == null) {
                return null;
            }
            if (j10 instanceof String) {
                return (String) j10;
            }
            StringBuilder sb2 = new StringBuilder();
            int i = 0;
            if (j10 instanceof long[]) {
                long[] jArr = (long[]) j10;
                while (i < jArr.length) {
                    sb2.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (j10 instanceof int[]) {
                int[] iArr = (int[]) j10;
                while (i < iArr.length) {
                    sb2.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (j10 instanceof double[]) {
                double[] dArr = (double[]) j10;
                while (i < dArr.length) {
                    sb2.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(j10 instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) j10;
            while (i < fVarArr.length) {
                sb2.append(fVarArr[i].f2431a);
                sb2.append('/');
                sb2.append(fVarArr[i].f2432b);
                i++;
                if (i != fVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:89|(2:91|(2:92|(2:94|(2:97|98)(1:96))(2:99|100)))|101|(2:103|(6:112|113|114|115|116|117)(3:105|(2:107|108)(2:110|111)|109))|121|114|115|116|117) */
        /* JADX WARN: Code restructure failed: missing block: B:119:0x0128, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:120:0x0129, code lost:
        
            android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
         */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x0032: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:51), block:B:158:0x0032 */
        /* JADX WARN: Removed duplicated region for block: B:161:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v24, types: [java.io.Serializable, long[]] */
        /* JADX WARN: Type inference failed for: r15v25, types: [L0.a$f[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v28, types: [L0.a$f[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.io.Serializable j(java.nio.ByteOrder r15) {
            /*
                Method dump skipped, instructions count: 406
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: L0.a.d.j(java.nio.ByteOrder):java.io.Serializable");
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("(");
            sb2.append(a.S[this.f2423a]);
            sb2.append(", data length:");
            return s3.b.m(sb2, this.f2426d.length, ")");
        }

        public d(int i, int i9, long j10, byte[] bArr) {
            this.f2423a = i;
            this.f2424b = i9;
            this.f2425c = j10;
            this.f2426d = bArr;
        }
    }

    /* compiled from: ExifInterface.java */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final long f2431a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2432b;

        public f(double d10) {
            this((long) (d10 * 10000.0d), 10000L);
        }

        public final String toString() {
            return this.f2431a + "/" + this.f2432b;
        }

        public f(long j10, long j11) {
            if (j11 == 0) {
                this.f2431a = 0L;
                this.f2432b = 1L;
            } else {
                this.f2431a = j10;
                this.f2432b = j11;
            }
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", IrisImageInfo.IMAGE_QUAL_UNDEF, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", NamedGroup.ffdhe3072, 3, 4), new e("BitsPerSample", NamedGroup.ffdhe4096, 3), new e("Compression", NamedGroup.ffdhe6144, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", SignatureScheme.rsa_pkcs1_sha1, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        e[] eVarArr5 = {new e("NewSubfileType", IrisImageInfo.IMAGE_QUAL_UNDEF, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", NamedGroup.ffdhe3072, 3, 4), new e("BitsPerSample", NamedGroup.ffdhe4096, 3), new e("Compression", NamedGroup.ffdhe6144, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", SignatureScheme.rsa_pkcs1_sha1, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        V = new e("StripOffsets", 273, 3);
        W = new e[][]{eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, new e[]{new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)}, new e[]{new e("PreviewImageStart", NamedGroup.ffdhe3072, 4), new e("PreviewImageLength", NamedGroup.ffdhe4096, 4)}, new e[]{new e("AspectFrame", 4371, 3)}, new e[]{new e("ColorSpace", 55, 3)}};
        X = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        Y = new HashMap[10];
        f2380Z = new HashMap[10];
        f2381a0 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f2382b0 = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        f2383c0 = forName;
        f2384d0 = "Exif\u0000\u0000".getBytes(forName);
        f2385e0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        R = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            e[][] eVarArr6 = W;
            if (i >= eVarArr6.length) {
                HashMap<Integer, Integer> hashMap = f2382b0;
                e[] eVarArr7 = X;
                hashMap.put(Integer.valueOf(eVarArr7[0].f2427a), 5);
                hashMap.put(Integer.valueOf(eVarArr7[1].f2427a), 1);
                hashMap.put(Integer.valueOf(eVarArr7[2].f2427a), 2);
                hashMap.put(Integer.valueOf(eVarArr7[3].f2427a), 3);
                hashMap.put(Integer.valueOf(eVarArr7[4].f2427a), 7);
                hashMap.put(Integer.valueOf(eVarArr7[5].f2427a), 8);
                Pattern.compile(".*[1-9].*");
                f2386f0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f2387g0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f2388h0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            Y[i] = new HashMap<>();
            f2380Z[i] = new HashMap<>();
            for (e eVar : eVarArr6[i]) {
                Y[i].put(Integer.valueOf(eVar.f2427a), eVar);
                f2380Z[i].put(eVar.f2428b, eVar);
            }
            i++;
        }
    }

    public a(File file) {
        e[][] eVarArr = W;
        this.f2400e = new HashMap[eVarArr.length];
        this.f2401f = new HashSet(eVarArr.length);
        this.f2402g = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        t(file.getAbsolutePath());
    }

    public static String b(double d10) {
        long j10 = (long) d10;
        double d11 = d10 - j10;
        long j11 = (long) (d11 * 60.0d);
        return j10 + "/1," + j11 + "/1," + Math.round((d11 - (j11 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    public static double c(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            double parseDouble2 = Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim());
            String[] split4 = split[2].split("/", -1);
            double parseDouble3 = ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d) + (parseDouble2 / 60.0d) + parseDouble;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return parseDouble3;
            }
            return -parseDouble3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static Pair<Integer, Integer> r(String str) {
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair<Integer, Integer> r8 = r(split[0]);
            if (((Integer) r8.first).intValue() == 2) {
                return r8;
            }
            for (int i = 1; i < split.length; i++) {
                Pair<Integer, Integer> r10 = r(split[i]);
                int intValue = (((Integer) r10.first).equals(r8.first) || ((Integer) r10.second).equals(r8.first)) ? ((Integer) r8.first).intValue() : -1;
                int intValue2 = (((Integer) r8.second).intValue() == -1 || !(((Integer) r10.first).equals(r8.second) || ((Integer) r10.second).equals(r8.second))) ? -1 : ((Integer) r8.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (intValue == -1) {
                    r8 = new Pair<>(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    r8 = new Pair<>(Integer.valueOf(intValue), -1);
                }
            }
            return r8;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long parseLong = Long.parseLong(str);
                    return (parseLong < 0 || parseLong > 65535) ? parseLong < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            } catch (NumberFormatException unused2) {
                return new Pair<>(2, -1);
            }
        }
        String[] split2 = str.split("/", -1);
        if (split2.length == 2) {
            try {
                long parseDouble = (long) Double.parseDouble(split2[0]);
                long parseDouble2 = (long) Double.parseDouble(split2[1]);
                if (parseDouble >= 0 && parseDouble2 >= 0) {
                    if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    public static ByteOrder y(b bVar) {
        short readShort = bVar.readShort();
        boolean z10 = f2389t;
        if (readShort == 18761) {
            if (z10) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort != 19789) {
            throw new IOException(androidx.camera.core.impl.utils.a.g(readShort, new StringBuilder("Invalid byte order: ")));
        }
        if (z10) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0294  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(L0.a.g r29, int r30) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.a.A(L0.a$g, int):void");
    }

    public final void B(String str) {
        for (int i = 0; i < W.length; i++) {
            this.f2400e[i].remove(str);
        }
    }

    public final void C(String str, int i, String str2) {
        HashMap<String, d>[] hashMapArr = this.f2400e;
        if (hashMapArr[i].isEmpty() || hashMapArr[i].get(str) == null) {
            return;
        }
        HashMap<String, d> hashMap = hashMapArr[i];
        hashMap.put(str2, hashMap.get(str));
        hashMapArr[i].remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00fa A[Catch: all -> 0x010a, Exception -> 0x010d, TryCatch #19 {Exception -> 0x010d, all -> 0x010a, blocks: (B:66:0x00f6, B:68:0x00fa, B:70:0x0118, B:74:0x0110), top: B:65:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0110 A[Catch: all -> 0x010a, Exception -> 0x010d, TryCatch #19 {Exception -> 0x010d, all -> 0x010a, blocks: (B:66:0x00f6, B:68:0x00fa, B:70:0x0118, B:74:0x0110), top: B:65:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D() {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.a.D():void");
    }

    public final void E(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        if (f2389t) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        b bVar = new b(bufferedInputStream);
        c cVar = new c(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.d(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.d(-40);
        String d10 = d("Xmp");
        HashMap<String, d>[] hashMapArr = this.f2400e;
        d remove = (d10 == null || !this.f2413s) ? null : hashMapArr[0].remove("Xmp");
        cVar.d(-1);
        cVar.d(-31);
        M(cVar);
        if (remove != null) {
            hashMapArr[0].put("Xmp", remove);
        }
        byte[] bArr = new byte[4096];
        while (bVar.readByte() == -1) {
            byte readByte = bVar.readByte();
            if (readByte == -39 || readByte == -38) {
                cVar.d(-1);
                cVar.d(readByte);
                L0.b.d(bVar, cVar);
                return;
            }
            if (readByte != -31) {
                cVar.d(-1);
                cVar.d(readByte);
                int readUnsignedShort = bVar.readUnsignedShort();
                cVar.y(readUnsignedShort);
                int i = readUnsignedShort - 2;
                if (i < 0) {
                    throw new IOException("Invalid length");
                }
                while (i > 0) {
                    int read = bVar.read(bArr, 0, Math.min(i, 4096));
                    if (read >= 0) {
                        cVar.write(bArr, 0, read);
                        i -= read;
                    }
                }
            } else {
                int readUnsignedShort2 = bVar.readUnsignedShort();
                int i9 = readUnsignedShort2 - 2;
                if (i9 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i9 >= 6) {
                    bVar.readFully(bArr2);
                    if (Arrays.equals(bArr2, f2384d0)) {
                        bVar.d(readUnsignedShort2 - 8);
                    }
                }
                cVar.d(-1);
                cVar.d(readByte);
                cVar.y(readUnsignedShort2);
                if (i9 >= 6) {
                    i9 = readUnsignedShort2 - 8;
                    cVar.write(bArr2);
                }
                while (i9 > 0) {
                    int read2 = bVar.read(bArr, 0, Math.min(i9, 4096));
                    if (read2 >= 0) {
                        cVar.write(bArr, 0, read2);
                        i9 -= read2;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    public final void F(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (f2389t) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        b bVar = new b(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(bufferedOutputStream, byteOrder);
        L0.b.c(bVar, cVar, f2367E.length);
        if (this.f2409o == 0) {
            int readInt = bVar.readInt();
            cVar.i(readInt);
            L0.b.c(bVar, cVar, readInt + 8);
        } else {
            L0.b.c(bVar, cVar, (r2 - r7.length) - 8);
            bVar.d(bVar.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            M(cVar2);
            byte[] byteArray = ((ByteArrayOutputStream) cVar2.f2421a).toByteArray();
            cVar.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            cVar.i((int) crc32.getValue());
            L0.b.a(byteArrayOutputStream);
            L0.b.d(bVar, cVar);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            L0.b.a(byteArrayOutputStream2);
            throw th;
        }
    }

    public final void G(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        int i;
        int i9;
        boolean z10;
        int i10;
        c cVar;
        byte[] bArr;
        byte[] bArr2;
        if (f2389t) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(bufferedInputStream, byteOrder);
        c cVar2 = new c(bufferedOutputStream, byteOrder);
        byte[] bArr3 = f2371I;
        L0.b.c(bVar, cVar2, bArr3.length);
        byte[] bArr4 = f2372J;
        bVar.d(bArr4.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    c cVar3 = new c(byteArrayOutputStream2, byteOrder);
                    int i11 = this.f2409o;
                    if (i11 != 0) {
                        L0.b.c(bVar, cVar3, (i11 - ((bArr3.length + 4) + bArr4.length)) - 8);
                        bVar.d(4);
                        int readInt = bVar.readInt();
                        if (readInt % 2 != 0) {
                            readInt++;
                        }
                        bVar.d(readInt);
                        M(cVar3);
                    } else {
                        byte[] bArr5 = new byte[4];
                        bVar.readFully(bArr5);
                        byte[] bArr6 = f2375M;
                        boolean equals = Arrays.equals(bArr5, bArr6);
                        byte[] bArr7 = f2377O;
                        byte[] bArr8 = f2376N;
                        if (equals) {
                            int readInt2 = bVar.readInt();
                            byte[] bArr9 = new byte[readInt2 % 2 == 1 ? readInt2 + 1 : readInt2];
                            bVar.readFully(bArr9);
                            byte b9 = (byte) (8 | bArr9[0]);
                            bArr9[0] = b9;
                            boolean z11 = ((b9 >> 1) & 1) == 1;
                            cVar3.write(bArr6);
                            cVar3.i(readInt2);
                            cVar3.write(bArr9);
                            if (z11) {
                                byte[] bArr10 = f2378P;
                                do {
                                    bArr2 = new byte[4];
                                    bVar.readFully(bArr2);
                                    int readInt3 = bVar.readInt();
                                    cVar3.write(bArr2);
                                    cVar3.i(readInt3);
                                    if (readInt3 % 2 == 1) {
                                        readInt3++;
                                    }
                                    L0.b.c(bVar, cVar3, readInt3);
                                } while (!Arrays.equals(bArr2, bArr10));
                                while (true) {
                                    byte[] bArr11 = new byte[4];
                                    try {
                                        bVar.readFully(bArr11);
                                        if (!Arrays.equals(bArr11, f2379Q)) {
                                            break;
                                        }
                                        int readInt4 = bVar.readInt();
                                        cVar3.write(bArr11);
                                        cVar3.i(readInt4);
                                        if (readInt4 % 2 == 1) {
                                            readInt4++;
                                        }
                                        L0.b.c(bVar, cVar3, readInt4);
                                    } catch (EOFException unused) {
                                    }
                                }
                                M(cVar3);
                            } else {
                                while (true) {
                                    byte[] bArr12 = new byte[4];
                                    bVar.readFully(bArr12);
                                    int readInt5 = bVar.readInt();
                                    cVar3.write(bArr12);
                                    cVar3.i(readInt5);
                                    if (readInt5 % 2 == 1) {
                                        readInt5++;
                                    }
                                    L0.b.c(bVar, cVar3, readInt5);
                                    if (Arrays.equals(bArr12, bArr7) || (bArr8 != null && Arrays.equals(bArr12, bArr8))) {
                                        break;
                                    }
                                }
                                M(cVar3);
                            }
                        } else if (Arrays.equals(bArr5, bArr7) || Arrays.equals(bArr5, bArr8)) {
                            int readInt6 = bVar.readInt();
                            int i12 = readInt6 % 2 == 1 ? readInt6 + 1 : readInt6;
                            byte[] bArr13 = new byte[3];
                            boolean equals2 = Arrays.equals(bArr5, bArr7);
                            byte[] bArr14 = f2374L;
                            if (equals2) {
                                bVar.readFully(bArr13);
                                byte[] bArr15 = new byte[3];
                                bVar.readFully(bArr15);
                                if (!Arrays.equals(bArr14, bArr15)) {
                                    throw new IOException("Error checking VP8 signature");
                                }
                                i = bVar.readInt();
                                i12 -= 10;
                                i9 = (i << 18) >> 18;
                                i10 = (i << 2) >> 18;
                                z10 = false;
                            } else if (!Arrays.equals(bArr5, bArr8)) {
                                i = 0;
                                i9 = 0;
                                z10 = false;
                                i10 = 0;
                            } else {
                                if (bVar.readByte() != 47) {
                                    throw new IOException("Error checking VP8L signature");
                                }
                                i = bVar.readInt();
                                z10 = true;
                                i9 = (i & 16383) + 1;
                                i10 = ((i & 268419072) >>> 14) + 1;
                                if ((i & 268435456) == 0) {
                                    z10 = false;
                                }
                                i12 -= 5;
                            }
                            cVar3.write(bArr6);
                            cVar3.i(10);
                            byte[] bArr16 = new byte[10];
                            if (z10) {
                                cVar = cVar2;
                                bArr16[0] = (byte) (bArr16[0] | 16);
                            } else {
                                cVar = cVar2;
                            }
                            bArr = bArr4;
                            bArr16[0] = (byte) (bArr16[0] | 8);
                            int i13 = i9 - 1;
                            int i14 = i10 - 1;
                            bArr16[4] = (byte) i13;
                            bArr16[5] = (byte) (i13 >> 8);
                            bArr16[6] = (byte) (i13 >> 16);
                            bArr16[7] = (byte) i14;
                            bArr16[8] = (byte) (i14 >> 8);
                            bArr16[9] = (byte) (i14 >> 16);
                            cVar3.write(bArr16);
                            cVar3.write(bArr5);
                            cVar3.i(readInt6);
                            if (Arrays.equals(bArr5, bArr7)) {
                                cVar3.write(bArr13);
                                cVar3.write(bArr14);
                                cVar3.i(i);
                            } else if (Arrays.equals(bArr5, bArr8)) {
                                cVar3.write(47);
                                cVar3.i(i);
                            }
                            L0.b.c(bVar, cVar3, i12);
                            M(cVar3);
                            L0.b.d(bVar, cVar3);
                            byte[] bArr17 = bArr;
                            c cVar4 = cVar;
                            cVar4.i(byteArrayOutputStream2.size() + bArr17.length);
                            cVar4.write(bArr17);
                            byteArrayOutputStream2.writeTo(cVar4);
                            L0.b.a(byteArrayOutputStream2);
                        }
                    }
                    cVar = cVar2;
                    bArr = bArr4;
                    L0.b.d(bVar, cVar3);
                    byte[] bArr172 = bArr;
                    c cVar42 = cVar;
                    cVar42.i(byteArrayOutputStream2.size() + bArr172.length);
                    cVar42.write(bArr172);
                    byteArrayOutputStream2.writeTo(cVar42);
                    L0.b.a(byteArrayOutputStream2);
                } catch (Exception e10) {
                    e = e10;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    L0.b.a(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public final void H(String str, String str2) {
        e eVar;
        String str3;
        boolean z10;
        int i;
        int i9;
        d dVar;
        String str4 = str;
        String str5 = str2;
        int i10 = 0;
        int i11 = 1;
        String str6 = "ExifInterface";
        if (("DateTime".equals(str4) || "DateTimeOriginal".equals(str4) || "DateTimeDigitized".equals(str4)) && str5 != null) {
            boolean find = f2387g0.matcher(str5).find();
            boolean find2 = f2388h0.matcher(str5).find();
            if (str2.length() != 19 || (!find && !find2)) {
                Log.w("ExifInterface", "Invalid value for " + str4 + " : " + str5);
                return;
            }
            if (find2) {
                str5 = str5.replaceAll("-", p.f15541a);
            }
        }
        boolean equals = "ISOSpeedRatings".equals(str4);
        boolean z11 = f2389t;
        if (equals) {
            if (z11) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str4 = "PhotographicSensitivity";
        }
        int i12 = 2;
        if (str5 != null && f2381a0.contains(str4)) {
            if (str4.equals("GPSTimeStamp")) {
                Matcher matcher = f2386f0.matcher(str5);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + str5);
                    return;
                }
                str5 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    str5 = new f(Double.parseDouble(str5)).toString();
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + str5);
                    return;
                }
            }
        }
        int i13 = 0;
        while (i13 < W.length) {
            if ((i13 != 4 || this.f2403h) && (eVar = f2380Z[i13].get(str4)) != null) {
                HashMap<String, d>[] hashMapArr = this.f2400e;
                if (str5 == null) {
                    hashMapArr[i13].remove(str4);
                } else {
                    Pair<Integer, Integer> r8 = r(str5);
                    int intValue = ((Integer) r8.first).intValue();
                    int i14 = -1;
                    int i15 = eVar.f2429c;
                    if (i15 != intValue && i15 != ((Integer) r8.second).intValue()) {
                        int i16 = eVar.f2430d;
                        if (i16 != -1 && (i16 == ((Integer) r8.first).intValue() || i16 == ((Integer) r8.second).intValue())) {
                            i15 = i16;
                        } else if (i15 != i11 && i15 != 7 && i15 != i12) {
                            if (z11) {
                                StringBuilder m2 = com.google.android.gms.measurement.internal.a.m("Given tag (", str4, ") value didn't match with one of expected formats: ");
                                String[] strArr = S;
                                m2.append(strArr[i15]);
                                m2.append(i16 == -1 ? "" : ", " + strArr[i16]);
                                m2.append(" (guess: ");
                                m2.append(strArr[((Integer) r8.first).intValue()]);
                                m2.append(((Integer) r8.second).intValue() != -1 ? ", " + strArr[((Integer) r8.second).intValue()] : "");
                                m2.append(")");
                                Log.d(str6, m2.toString());
                            }
                        }
                    }
                    int[] iArr = T;
                    switch (i15) {
                        case 1:
                            str3 = str6;
                            z10 = z11;
                            HashMap<String, d> hashMap = hashMapArr[i13];
                            i = 1;
                            if (str5.length() == 1) {
                                i9 = 0;
                                if (str5.charAt(0) >= '0' && str5.charAt(0) <= '1') {
                                    dVar = new d(1, 1, new byte[]{(byte) (str5.charAt(0) - '0')});
                                    hashMap.put(str4, dVar);
                                    break;
                                }
                            } else {
                                i9 = 0;
                            }
                            byte[] bytes = str5.getBytes(f2383c0);
                            dVar = new d(1, bytes.length, bytes);
                            hashMap.put(str4, dVar);
                            break;
                        case 2:
                        case 7:
                            str3 = str6;
                            z10 = z11;
                            hashMapArr[i13].put(str4, d.a(str5));
                            i9 = 0;
                            i = 1;
                            break;
                        case 3:
                            str3 = str6;
                            z10 = z11;
                            String[] split = str5.split(",", -1);
                            int[] iArr2 = new int[split.length];
                            for (int i17 = 0; i17 < split.length; i17++) {
                                iArr2[i17] = Integer.parseInt(split[i17]);
                            }
                            hashMapArr[i13].put(str4, d.f(iArr2, this.f2402g));
                            i9 = 0;
                            i = 1;
                            break;
                        case 4:
                            str3 = str6;
                            z10 = z11;
                            String[] split2 = str5.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i18 = 0; i18 < split2.length; i18++) {
                                jArr[i18] = Long.parseLong(split2[i18]);
                            }
                            hashMapArr[i13].put(str4, d.c(jArr, this.f2402g));
                            i9 = 0;
                            i = 1;
                            break;
                        case 5:
                            str3 = str6;
                            z10 = z11;
                            int i19 = -1;
                            String[] split3 = str5.split(",", -1);
                            f[] fVarArr = new f[split3.length];
                            int i20 = 0;
                            while (i20 < split3.length) {
                                String[] split4 = split3[i20].split("/", i19);
                                fVarArr[i20] = new f((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                                i20++;
                                i19 = -1;
                            }
                            hashMapArr[i13].put(str4, d.d(fVarArr, this.f2402g));
                            i9 = 0;
                            i = 1;
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (z11) {
                                Log.d(str6, "Data format isn't one of expected formats: " + i15);
                                break;
                            }
                            break;
                        case 9:
                            str3 = str6;
                            z10 = z11;
                            String[] split5 = str5.split(",", -1);
                            int length = split5.length;
                            int[] iArr3 = new int[length];
                            for (int i21 = 0; i21 < split5.length; i21++) {
                                iArr3[i21] = Integer.parseInt(split5[i21]);
                            }
                            HashMap<String, d> hashMap2 = hashMapArr[i13];
                            ByteOrder byteOrder = this.f2402g;
                            ByteBuffer wrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                            wrap.order(byteOrder);
                            for (int i22 = 0; i22 < length; i22++) {
                                wrap.putInt(iArr3[i22]);
                            }
                            hashMap2.put(str4, new d(9, length, wrap.array()));
                            i9 = 0;
                            i = 1;
                            break;
                        case 10:
                            String[] split6 = str5.split(",", -1);
                            int length2 = split6.length;
                            f[] fVarArr2 = new f[length2];
                            int i23 = i10;
                            while (i23 < split6.length) {
                                String[] split7 = split6[i23].split("/", i14);
                                fVarArr2[i23] = new f((long) Double.parseDouble(split7[i10]), (long) Double.parseDouble(split7[1]));
                                i23++;
                                str6 = str6;
                                z11 = z11;
                                i10 = 0;
                                i14 = -1;
                            }
                            str3 = str6;
                            z10 = z11;
                            HashMap<String, d> hashMap3 = hashMapArr[i13];
                            ByteOrder byteOrder2 = this.f2402g;
                            ByteBuffer wrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                            wrap2.order(byteOrder2);
                            for (int i24 = 0; i24 < length2; i24++) {
                                f fVar = fVarArr2[i24];
                                wrap2.putInt((int) fVar.f2431a);
                                wrap2.putInt((int) fVar.f2432b);
                            }
                            hashMap3.put(str4, new d(10, length2, wrap2.array()));
                            i9 = 0;
                            i = 1;
                            break;
                        case 12:
                            String[] split8 = str5.split(",", -1);
                            int length3 = split8.length;
                            double[] dArr = new double[length3];
                            for (int i25 = i10; i25 < split8.length; i25 += i11) {
                                dArr[i25] = Double.parseDouble(split8[i25]);
                            }
                            HashMap<String, d> hashMap4 = hashMapArr[i13];
                            ByteOrder byteOrder3 = this.f2402g;
                            ByteBuffer wrap3 = ByteBuffer.wrap(new byte[iArr[12] * length3]);
                            wrap3.order(byteOrder3);
                            for (int i26 = i10; i26 < length3; i26 += i11) {
                                wrap3.putDouble(dArr[i26]);
                            }
                            hashMap4.put(str4, new d(12, length3, wrap3.array()));
                            break;
                    }
                    i13 += i;
                    i10 = i9;
                    i11 = i;
                    str6 = str3;
                    z11 = z10;
                    i12 = 2;
                }
            }
            i = i11;
            str3 = str6;
            z10 = z11;
            i9 = i10;
            i13 += i;
            i10 = i9;
            i11 = i;
            str6 = str3;
            z11 = z10;
            i12 = 2;
        }
    }

    public final void I(b bVar) {
        String str;
        d dVar;
        int h9;
        HashMap<String, d> hashMap = this.f2400e[4];
        d dVar2 = hashMap.get("Compression");
        if (dVar2 == null) {
            this.f2408n = 6;
            s(bVar, hashMap);
            return;
        }
        int h10 = dVar2.h(this.f2402g);
        this.f2408n = h10;
        int i = 1;
        if (h10 != 1) {
            if (h10 == 6) {
                s(bVar, hashMap);
                return;
            } else if (h10 != 7) {
                return;
            }
        }
        d dVar3 = hashMap.get("BitsPerSample");
        String str2 = "ExifInterface";
        if (dVar3 != null) {
            int[] iArr = (int[]) dVar3.j(this.f2402g);
            int[] iArr2 = f2392w;
            if (Arrays.equals(iArr2, iArr) || (this.f2399d == 3 && (dVar = hashMap.get("PhotometricInterpretation")) != null && (((h9 = dVar.h(this.f2402g)) == 1 && Arrays.equals(iArr, f2393x)) || (h9 == 6 && Arrays.equals(iArr, iArr2))))) {
                d dVar4 = hashMap.get("StripOffsets");
                d dVar5 = hashMap.get("StripByteCounts");
                if (dVar4 == null || dVar5 == null) {
                    return;
                }
                long[] b9 = L0.b.b(dVar4.j(this.f2402g));
                long[] b10 = L0.b.b(dVar5.j(this.f2402g));
                if (b9 == null || b9.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (b10 == null || b10.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (b9.length != b10.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j10 = 0;
                for (long j11 : b10) {
                    j10 += j11;
                }
                int i9 = (int) j10;
                byte[] bArr = new byte[i9];
                this.f2404j = true;
                this.i = true;
                this.f2403h = true;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < b9.length) {
                    int i13 = (int) b9[i10];
                    int i14 = (int) b10[i10];
                    if (i10 < b9.length - i) {
                        str = str2;
                        if (i13 + i14 != b9[i10 + 1]) {
                            this.f2404j = false;
                        }
                    } else {
                        str = str2;
                    }
                    int i15 = i13 - i11;
                    if (i15 < 0) {
                        Log.d(str, "Invalid strip offset value");
                        return;
                    }
                    String str3 = str;
                    try {
                        bVar.d(i15);
                        int i16 = i11 + i15;
                        byte[] bArr2 = new byte[i14];
                        try {
                            bVar.readFully(bArr2);
                            i11 = i16 + i14;
                            System.arraycopy(bArr2, 0, bArr, i12, i14);
                            i12 += i14;
                            i10++;
                            str2 = str3;
                            i = 1;
                        } catch (EOFException unused) {
                            Log.d(str3, "Failed to read " + i14 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d(str3, "Failed to skip " + i15 + " bytes.");
                        return;
                    }
                }
                this.f2407m = bArr;
                if (this.f2404j) {
                    this.f2405k = (int) b9[0];
                    this.f2406l = i9;
                    return;
                }
                return;
            }
        }
        if (f2389t) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void J(int i, int i9) {
        HashMap<String, d>[] hashMapArr = this.f2400e;
        boolean isEmpty = hashMapArr[i].isEmpty();
        boolean z10 = f2389t;
        if (isEmpty || hashMapArr[i9].isEmpty()) {
            if (z10) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = hashMapArr[i].get("ImageLength");
        d dVar2 = hashMapArr[i].get("ImageWidth");
        d dVar3 = hashMapArr[i9].get("ImageLength");
        d dVar4 = hashMapArr[i9].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (z10) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (z10) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int h9 = dVar.h(this.f2402g);
        int h10 = dVar2.h(this.f2402g);
        int h11 = dVar3.h(this.f2402g);
        int h12 = dVar4.h(this.f2402g);
        if (h9 >= h11 || h10 >= h12) {
            return;
        }
        HashMap<String, d> hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i9];
        hashMapArr[i9] = hashMap;
    }

    public final void K(g gVar, int i) {
        d e10;
        d e11;
        HashMap<String, d>[] hashMapArr = this.f2400e;
        d dVar = hashMapArr[i].get("DefaultCropSize");
        d dVar2 = hashMapArr[i].get("SensorTopBorder");
        d dVar3 = hashMapArr[i].get("SensorLeftBorder");
        d dVar4 = hashMapArr[i].get("SensorBottomBorder");
        d dVar5 = hashMapArr[i].get("SensorRightBorder");
        if (dVar != null) {
            if (dVar.f2423a == 5) {
                f[] fVarArr = (f[]) dVar.j(this.f2402g);
                if (fVarArr == null || fVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                    return;
                } else {
                    e10 = d.d(new f[]{fVarArr[0]}, this.f2402g);
                    e11 = d.d(new f[]{fVarArr[1]}, this.f2402g);
                }
            } else {
                int[] iArr = (int[]) dVar.j(this.f2402g);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                e10 = d.e(iArr[0], this.f2402g);
                e11 = d.e(iArr[1], this.f2402g);
            }
            hashMapArr[i].put("ImageWidth", e10);
            hashMapArr[i].put("ImageLength", e11);
            return;
        }
        if (dVar2 != null && dVar3 != null && dVar4 != null && dVar5 != null) {
            int h9 = dVar2.h(this.f2402g);
            int h10 = dVar4.h(this.f2402g);
            int h11 = dVar5.h(this.f2402g);
            int h12 = dVar3.h(this.f2402g);
            if (h10 <= h9 || h11 <= h12) {
                return;
            }
            d e12 = d.e(h10 - h9, this.f2402g);
            d e13 = d.e(h11 - h12, this.f2402g);
            hashMapArr[i].put("ImageLength", e12);
            hashMapArr[i].put("ImageWidth", e13);
            return;
        }
        d dVar6 = hashMapArr[i].get("ImageLength");
        d dVar7 = hashMapArr[i].get("ImageWidth");
        if (dVar6 == null || dVar7 == null) {
            d dVar8 = hashMapArr[i].get("JPEGInterchangeFormat");
            d dVar9 = hashMapArr[i].get("JPEGInterchangeFormatLength");
            if (dVar8 == null || dVar9 == null) {
                return;
            }
            int h13 = dVar8.h(this.f2402g);
            int h14 = dVar8.h(this.f2402g);
            gVar.i(h13);
            byte[] bArr = new byte[h14];
            gVar.readFully(bArr);
            h(new b(bArr), h13, i);
        }
    }

    public final void L() {
        J(0, 5);
        J(0, 4);
        J(5, 4);
        HashMap<String, d>[] hashMapArr = this.f2400e;
        d dVar = hashMapArr[1].get("PixelXDimension");
        d dVar2 = hashMapArr[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            hashMapArr[0].put("ImageWidth", dVar);
            hashMapArr[0].put("ImageLength", dVar2);
        }
        if (hashMapArr[4].isEmpty() && u(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!u(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        C("ThumbnailOrientation", 0, "Orientation");
        C("ThumbnailImageLength", 0, "ImageLength");
        C("ThumbnailImageWidth", 0, "ImageWidth");
        C("ThumbnailOrientation", 5, "Orientation");
        C("ThumbnailImageLength", 5, "ImageLength");
        C("ThumbnailImageWidth", 5, "ImageWidth");
        C("Orientation", 4, "ThumbnailOrientation");
        C("ImageLength", 4, "ThumbnailImageLength");
        C("ImageWidth", 4, "ThumbnailImageWidth");
    }

    public final void M(c cVar) {
        HashMap<String, d>[] hashMapArr;
        int[] iArr;
        Object[] objArr;
        e[][] eVarArr = W;
        int[] iArr2 = new int[eVarArr.length];
        int[] iArr3 = new int[eVarArr.length];
        e[] eVarArr2 = X;
        for (e eVar : eVarArr2) {
            B(eVar.f2428b);
        }
        if (this.f2403h) {
            if (this.i) {
                B("StripOffsets");
                B("StripByteCounts");
            } else {
                B("JPEGInterchangeFormat");
                B("JPEGInterchangeFormatLength");
            }
        }
        int i = 0;
        while (true) {
            int length = eVarArr.length;
            hashMapArr = this.f2400e;
            if (i >= length) {
                break;
            }
            Object[] array = hashMapArr[i].entrySet().toArray();
            int length2 = array.length;
            int i9 = 0;
            while (i9 < length2) {
                Map.Entry entry = (Map.Entry) array[i9];
                if (entry.getValue() == null) {
                    objArr = array;
                    hashMapArr[i].remove(entry.getKey());
                } else {
                    objArr = array;
                }
                i9++;
                array = objArr;
            }
            i++;
        }
        if (!hashMapArr[1].isEmpty()) {
            hashMapArr[0].put(eVarArr2[1].f2428b, d.b(0L, this.f2402g));
        }
        if (!hashMapArr[2].isEmpty()) {
            hashMapArr[0].put(eVarArr2[2].f2428b, d.b(0L, this.f2402g));
        }
        if (!hashMapArr[3].isEmpty()) {
            hashMapArr[1].put(eVarArr2[3].f2428b, d.b(0L, this.f2402g));
        }
        if (this.f2403h) {
            if (this.i) {
                hashMapArr[4].put("StripOffsets", d.e(0, this.f2402g));
                hashMapArr[4].put("StripByteCounts", d.e(this.f2406l, this.f2402g));
            } else {
                hashMapArr[4].put("JPEGInterchangeFormat", d.b(0L, this.f2402g));
                hashMapArr[4].put("JPEGInterchangeFormatLength", d.b(this.f2406l, this.f2402g));
            }
        }
        int i10 = 0;
        while (true) {
            int length3 = eVarArr.length;
            iArr = T;
            if (i10 >= length3) {
                break;
            }
            Iterator<Map.Entry<String, d>> it = hashMapArr[i10].entrySet().iterator();
            int i11 = 0;
            while (it.hasNext()) {
                d value = it.next().getValue();
                value.getClass();
                int i12 = iArr[value.f2423a] * value.f2424b;
                if (i12 > 4) {
                    i11 += i12;
                }
            }
            iArr3[i10] = iArr3[i10] + i11;
            i10++;
        }
        int i13 = 8;
        for (int i14 = 0; i14 < eVarArr.length; i14++) {
            if (!hashMapArr[i14].isEmpty()) {
                iArr2[i14] = i13;
                i13 = (hashMapArr[i14].size() * 12) + 6 + iArr3[i14] + i13;
            }
        }
        if (this.f2403h) {
            if (this.i) {
                hashMapArr[4].put("StripOffsets", d.e(i13, this.f2402g));
            } else {
                hashMapArr[4].put("JPEGInterchangeFormat", d.b(i13, this.f2402g));
            }
            this.f2405k = i13;
            i13 += this.f2406l;
        }
        if (this.f2399d == 4) {
            i13 += 8;
        }
        if (f2389t) {
            for (int i15 = 0; i15 < eVarArr.length; i15++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i15), Integer.valueOf(iArr2[i15]), Integer.valueOf(hashMapArr[i15].size()), Integer.valueOf(iArr3[i15]), Integer.valueOf(i13)));
            }
        }
        if (!hashMapArr[1].isEmpty()) {
            hashMapArr[0].put(eVarArr2[1].f2428b, d.b(iArr2[1], this.f2402g));
        }
        if (!hashMapArr[2].isEmpty()) {
            hashMapArr[0].put(eVarArr2[2].f2428b, d.b(iArr2[2], this.f2402g));
        }
        if (!hashMapArr[3].isEmpty()) {
            hashMapArr[1].put(eVarArr2[3].f2428b, d.b(iArr2[3], this.f2402g));
        }
        int i16 = this.f2399d;
        if (i16 == 4) {
            if (i13 > 65535) {
                throw new IllegalStateException(s3.b.i("Size of exif data (", i13, " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
            }
            cVar.y(i13);
            cVar.write(f2384d0);
        } else if (i16 == 13) {
            cVar.i(i13);
            cVar.write(f2368F);
        } else if (i16 == 14) {
            cVar.write(f2373K);
            cVar.i(i13);
        }
        cVar.j(this.f2402g == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.f2422b = this.f2402g;
        cVar.y(42);
        cVar.p(8L);
        for (int i17 = 0; i17 < eVarArr.length; i17++) {
            if (!hashMapArr[i17].isEmpty()) {
                cVar.y(hashMapArr[i17].size());
                int size = (hashMapArr[i17].size() * 12) + iArr2[i17] + 2 + 4;
                for (Map.Entry<String, d> entry2 : hashMapArr[i17].entrySet()) {
                    int i18 = f2380Z[i17].get(entry2.getKey()).f2427a;
                    d value2 = entry2.getValue();
                    value2.getClass();
                    int i19 = value2.f2423a;
                    int i20 = iArr[i19];
                    int i21 = value2.f2424b;
                    int i22 = i20 * i21;
                    cVar.y(i18);
                    cVar.y(i19);
                    cVar.i(i21);
                    if (i22 > 4) {
                        cVar.p(size);
                        size += i22;
                    } else {
                        cVar.write(value2.f2426d);
                        if (i22 < 4) {
                            while (i22 < 4) {
                                cVar.d(0);
                                i22++;
                            }
                        }
                    }
                }
                if (i17 != 0 || hashMapArr[4].isEmpty()) {
                    cVar.p(0L);
                } else {
                    cVar.p(iArr2[4]);
                }
                Iterator<Map.Entry<String, d>> it2 = hashMapArr[i17].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f2426d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f2403h) {
            cVar.write(p());
        }
        if (this.f2399d == 14 && i13 % 2 == 1) {
            cVar.d(0);
        }
        cVar.f2422b = ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String d10 = d("DateTimeOriginal");
        HashMap<String, d>[] hashMapArr = this.f2400e;
        if (d10 != null && d("DateTime") == null) {
            hashMapArr[0].put("DateTime", d.a(d10));
        }
        if (d("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", d.b(0L, this.f2402g));
        }
        if (d("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", d.b(0L, this.f2402g));
        }
        if (d("Orientation") == null) {
            hashMapArr[0].put("Orientation", d.b(0L, this.f2402g));
        }
        if (d("LightSource") == null) {
            hashMapArr[1].put("LightSource", d.b(0L, this.f2402g));
        }
    }

    public final String d(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d f10 = f(str);
        if (f10 != null) {
            if (!f2381a0.contains(str)) {
                return f10.i(this.f2402g);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = f10.f2423a;
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                f[] fVarArr = (f[]) f10.j(this.f2402g);
                if (fVarArr == null || fVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                    return null;
                }
                f fVar = fVarArr[0];
                Integer valueOf = Integer.valueOf((int) (fVar.f2431a / fVar.f2432b));
                f fVar2 = fVarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (fVar2.f2431a / fVar2.f2432b));
                f fVar3 = fVarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (fVar3.f2431a / fVar3.f2432b)));
            }
            try {
                return Double.toString(f10.g(this.f2402g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int e(int i, String str) {
        d f10 = f(str);
        if (f10 == null) {
            return i;
        }
        try {
            return f10.h(this.f2402g);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public final d f(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f2389t) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < W.length; i++) {
            d dVar = this.f2400e[i].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    public final void g(g gVar) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                b.C0033b.a(mediaMetadataRetriever, new C0032a(gVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap<String, d>[] hashMapArr = this.f2400e;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", d.e(Integer.parseInt(str), this.f2402g));
                }
                if (str2 != null) {
                    hashMapArr[0].put("ImageLength", d.e(Integer.parseInt(str2), this.f2402g));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    hashMapArr[0].put("Orientation", d.e(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f2402g));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.i(parseInt2);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i = parseInt2 + 6;
                    int i9 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f2384d0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i9];
                    gVar.readFully(bArr2);
                    this.f2409o = i;
                    z(0, bArr2);
                }
                if (f2389t) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x018c, code lost:
    
        r23.f2418c = r22.f2402g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0190, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x009d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x00a0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x00a3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0179 A[LOOP:0: B:9:0x0033->B:32:0x0179, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(L0.a.b r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.a.h(L0.a$b, int, int):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:(2:15|16)|(3:17|18|(6:99|(2:101|(1:103))(1:137)|104|(1:106)|107|(1:109)(3:110|(7:114|115|116|(3:118|(1:120)(2:129|(1:131))|(3:123|124|125))(1:132)|127|111|112)|135)))|20|(2:21|22)|(6:23|24|25|(1:85)(1:29)|30|(1:32))|34|35|36|37|38|(1:40)(1:71)|41|(1:43)|44|(2:45|(2:47|(4:50|51|(2:52|(2:54|(1:57)(1:56))(3:59|60|(2:61|(2:63|(1:66)(1:65))(2:67|68))))|58)(1:49))(2:69|70))) */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x00bb, code lost:
    
        if (r8 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0118, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0125, code lost:
    
        if (r6 != null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0127, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0115, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0116, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x011f, code lost:
    
        if (r6 != null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0121, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0124, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x011d, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x011a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x011b, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010c  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.a.i(java.io.BufferedInputStream):int");
    }

    public final void j(g gVar) {
        int i;
        int i9;
        m(gVar);
        HashMap<String, d>[] hashMapArr = this.f2400e;
        d dVar = hashMapArr[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f2426d);
            gVar2.f2418c = this.f2402g;
            byte[] bArr = f2365C;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.i(0L);
            byte[] bArr3 = f2366D;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.i(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.i(12L);
            }
            A(gVar2, 6);
            d dVar2 = hashMapArr[7].get("PreviewImageStart");
            d dVar3 = hashMapArr[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", dVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = hashMapArr[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.j(this.f2402g);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i10 = iArr[2];
                int i11 = iArr[0];
                if (i10 <= i11 || (i = iArr[3]) <= (i9 = iArr[1])) {
                    return;
                }
                int i12 = (i10 - i11) + 1;
                int i13 = (i - i9) + 1;
                if (i12 < i13) {
                    int i14 = i12 + i13;
                    i13 = i14 - i13;
                    i12 = i14 - i13;
                }
                d e10 = d.e(i12, this.f2402g);
                d e11 = d.e(i13, this.f2402g);
                hashMapArr[0].put("ImageWidth", e10);
                hashMapArr[0].put("ImageLength", e11);
            }
        }
    }

    public final void k(b bVar) {
        if (f2389t) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f2418c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f2367E;
        bVar.d(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i = length + 8;
                if (i == 16 && !Arrays.equals(bArr2, f2369G)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f2370H)) {
                    return;
                }
                if (Arrays.equals(bArr2, f2368F)) {
                    byte[] bArr3 = new byte[readInt];
                    bVar.readFully(bArr3);
                    int readInt2 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f2409o = i;
                        z(0, bArr3);
                        L();
                        I(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i9 = readInt + 4;
                bVar.d(i9);
                length = i + i9;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void l(b bVar) {
        boolean z10 = f2389t;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.d(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i9 = ByteBuffer.wrap(bArr2).getInt();
        int i10 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i9];
        bVar.d(i - bVar.f2417b);
        bVar.readFully(bArr4);
        h(new b(bArr4), i, 5);
        bVar.d(i10 - bVar.f2417b);
        bVar.f2418c = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i11 = 0; i11 < readInt; i11++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == V.f2427a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d e10 = d.e(readShort, this.f2402g);
                d e11 = d.e(readShort2, this.f2402g);
                HashMap<String, d>[] hashMapArr = this.f2400e;
                hashMapArr[0].put("ImageLength", e10);
                hashMapArr[0].put("ImageWidth", e11);
                if (z10) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.d(readUnsignedShort2);
        }
    }

    public final void m(g gVar) {
        w(gVar);
        A(gVar, 0);
        K(gVar, 0);
        K(gVar, 5);
        K(gVar, 4);
        L();
        if (this.f2399d == 8) {
            HashMap<String, d>[] hashMapArr = this.f2400e;
            d dVar = hashMapArr[1].get("MakerNote");
            if (dVar != null) {
                g gVar2 = new g(dVar.f2426d);
                gVar2.f2418c = this.f2402g;
                gVar2.d(6);
                A(gVar2, 9);
                d dVar2 = hashMapArr[9].get("ColorSpace");
                if (dVar2 != null) {
                    hashMapArr[1].put("ColorSpace", dVar2);
                }
            }
        }
    }

    public final int n() {
        switch (e(1, "Orientation")) {
            case 3:
            case 4:
                return CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void o(g gVar) {
        if (f2389t) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        m(gVar);
        HashMap<String, d>[] hashMapArr = this.f2400e;
        d dVar = hashMapArr[0].get("JpgFromRaw");
        if (dVar != null) {
            h(new b(dVar.f2426d), (int) dVar.f2425c, 5);
        }
        d dVar2 = hashMapArr[0].get("ISO");
        d dVar3 = hashMapArr[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", dVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] p() {
        /*
            r10 = this;
            java.lang.String r0 = "Error closing fd."
            java.lang.String r1 = "ExifInterfaceUtils"
            java.lang.String r2 = "ExifInterface"
            boolean r3 = r10.f2403h
            r4 = 0
            if (r3 != 0) goto Lc
            return r4
        Lc:
            byte[] r3 = r10.f2407m
            if (r3 == 0) goto L11
            return r3
        L11:
            android.content.res.AssetManager$AssetInputStream r3 = r10.f2398c     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            if (r3 == 0) goto L33
            boolean r5 = r3.markSupported()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L25
            if (r5 == 0) goto L2a
            r3.reset()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L25
        L1e:
            r5 = r4
            goto L5c
        L20:
            r2 = move-exception
            r5 = r4
        L22:
            r4 = r3
            goto L9c
        L25:
            r5 = move-exception
            r6 = r5
            r5 = r4
            goto L8a
        L2a:
            java.lang.String r5 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r2, r5)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L25
            L0.b.a(r3)
            return r4
        L33:
            java.lang.String r3 = r10.f2396a     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            if (r3 == 0) goto L47
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            java.lang.String r5 = r10.f2396a     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            goto L1e
        L3f:
            r2 = move-exception
            r5 = r4
            goto L9c
        L42:
            r5 = move-exception
            r3 = r4
            r6 = r5
            r5 = r3
            goto L8a
        L47:
            java.io.FileDescriptor r3 = r10.f2397b     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            java.io.FileDescriptor r3 = L0.b.a.b(r3)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            int r5 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
            r6 = 0
            L0.b.a.c(r3, r6, r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
            r9 = r5
            r5 = r3
            r3 = r9
        L5c:
            L0.a$b r6 = new L0.a$b     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            int r7 = r10.f2405k     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            int r8 = r10.f2409o     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            int r7 = r7 + r8
            r6.d(r7)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            int r7 = r10.f2406l     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r6.readFully(r7)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r10.f2407m = r7     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            L0.b.a(r3)
            if (r5 == 0) goto L7e
            L0.b.a.a(r5)     // Catch: java.lang.Exception -> L7b
            goto L7e
        L7b:
            android.util.Log.e(r1, r0)
        L7e:
            return r7
        L7f:
            r2 = move-exception
            goto L22
        L81:
            r6 = move-exception
            goto L8a
        L83:
            r2 = move-exception
            r5 = r3
            goto L9c
        L86:
            r5 = move-exception
            r6 = r5
            r5 = r3
            r3 = r4
        L8a:
            java.lang.String r7 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r2, r7, r6)     // Catch: java.lang.Throwable -> L7f
            L0.b.a(r3)
            if (r5 == 0) goto L9b
            L0.b.a.a(r5)     // Catch: java.lang.Exception -> L98
            goto L9b
        L98:
            android.util.Log.e(r1, r0)
        L9b:
            return r4
        L9c:
            L0.b.a(r4)
            if (r5 == 0) goto La8
            L0.b.a.a(r5)     // Catch: java.lang.Exception -> La5
            goto La8
        La5:
            android.util.Log.e(r1, r0)
        La8:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.a.p():byte[]");
    }

    public final void q(b bVar) {
        if (f2389t) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f2418c = ByteOrder.LITTLE_ENDIAN;
        bVar.d(f2371I.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f2372J;
        bVar.d(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i = length + 8;
                if (Arrays.equals(f2373K, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    this.f2409o = i;
                    z(0, bArr3);
                    I(new b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.d(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void s(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int h9 = dVar.h(this.f2402g);
        int h10 = dVar2.h(this.f2402g);
        if (this.f2399d == 7) {
            h9 += this.f2410p;
        }
        if (h9 > 0 && h10 > 0) {
            this.f2403h = true;
            if (this.f2396a == null && this.f2398c == null && this.f2397b == null) {
                byte[] bArr = new byte[h10];
                bVar.d(h9);
                bVar.readFully(bArr);
                this.f2407m = bArr;
            }
            this.f2405k = h9;
            this.f2406l = h10;
        }
        if (f2389t) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + h9 + ", length: " + h10);
        }
    }

    public final void t(String str) {
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f2398c = null;
        this.f2396a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                try {
                    b.a.c(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.f2397b = fileInputStream2.getFD();
                } catch (Exception unused) {
                    if (f2389t) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    this.f2397b = null;
                }
                v(fileInputStream2);
                L0.b.a(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                L0.b.a(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean u(HashMap hashMap) {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.h(this.f2402g) <= 512 && dVar2.h(this.f2402g) <= 512;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091 A[Catch: all -> 0x0017, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:5:0x0006, B:7:0x000b, B:9:0x0020, B:15:0x003d, B:17:0x0048, B:18:0x005e, B:27:0x004f, B:30:0x0057, B:31:0x005b, B:32:0x0068, B:34:0x0071, B:36:0x0077, B:38:0x007d, B:40:0x0083, B:50:0x0091), top: B:4:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(java.io.InputStream r8) {
        /*
            r7 = this;
            boolean r0 = L0.a.f2389t
            if (r8 == 0) goto La9
            r1 = 0
            r2 = r1
        L6:
            L0.a$e[][] r3 = L0.a.W     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            int r3 = r3.length     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            if (r2 >= r3) goto L20
            java.util.HashMap<java.lang.String, L0.a$d>[] r3 = r7.f2400e     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r4.<init>()     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r3[r2] = r4     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            int r2 = r2 + 1
            goto L6
        L17:
            r8 = move-exception
            goto L99
        L1a:
            r8 = move-exception
            goto L8f
        L1d:
            r8 = move-exception
            goto L8f
        L20:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r3 = 5000(0x1388, float:7.006E-42)
            r2.<init>(r8, r3)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            int r8 = r7.i(r2)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r7.f2399d = r8     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r3 = 14
            r4 = 13
            r5 = 9
            r6 = 4
            if (r8 == r6) goto L68
            if (r8 == r5) goto L68
            if (r8 == r4) goto L68
            if (r8 != r3) goto L3d
            goto L68
        L3d:
            L0.a$g r8 = new L0.a$g     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            int r1 = r7.f2399d     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r2 = 12
            if (r1 != r2) goto L4c
            r7.g(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L5e
        L4c:
            r2 = 7
            if (r1 != r2) goto L53
            r7.j(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L5e
        L53:
            r2 = 10
            if (r1 != r2) goto L5b
            r7.o(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L5e
        L5b:
            r7.m(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
        L5e:
            int r1 = r7.f2409o     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r8.i(r1)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r7.I(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L86
        L68:
            L0.a$b r8 = new L0.a$b     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            int r2 = r7.f2399d     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            if (r2 != r6) goto L75
            r7.h(r8, r1, r1)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L86
        L75:
            if (r2 != r4) goto L7b
            r7.k(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L86
        L7b:
            if (r2 != r5) goto L81
            r7.l(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L86
        L81:
            if (r2 != r3) goto L86
            r7.q(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
        L86:
            r7.a()
            if (r0 == 0) goto La8
        L8b:
            r7.x()
            goto La8
        L8f:
            if (r0 == 0) goto La2
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r8)     // Catch: java.lang.Throwable -> L17
            goto La2
        L99:
            r7.a()
            if (r0 == 0) goto La1
            r7.x()
        La1:
            throw r8
        La2:
            r7.a()
            if (r0 == 0) goto La8
            goto L8b
        La8:
            return
        La9:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r0 = "inputstream shouldn't be null"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.a.v(java.io.InputStream):void");
    }

    public final void w(b bVar) {
        ByteOrder y10 = y(bVar);
        this.f2402g = y10;
        bVar.f2418c = y10;
        int readUnsignedShort = bVar.readUnsignedShort();
        int i = this.f2399d;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            throw new IOException(androidx.camera.core.impl.utils.a.g(readUnsignedShort, new StringBuilder("Invalid start code: ")));
        }
        int readInt = bVar.readInt();
        if (readInt < 8) {
            throw new IOException(com.google.android.gms.measurement.internal.a.g(readInt, "Invalid first Ifd offset: "));
        }
        int i9 = readInt - 8;
        if (i9 > 0) {
            bVar.d(i9);
        }
    }

    public final void x() {
        int i = 0;
        while (true) {
            HashMap<String, d>[] hashMapArr = this.f2400e;
            if (i >= hashMapArr.length) {
                return;
            }
            StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("The size of tag group[", i, "]: ");
            l10.append(hashMapArr[i].size());
            Log.d("ExifInterface", l10.toString());
            for (Map.Entry<String, d> entry : hashMapArr[i].entrySet()) {
                d value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.i(this.f2402g) + "'");
            }
            i++;
        }
    }

    public final void z(int i, byte[] bArr) {
        g gVar = new g(bArr);
        w(gVar);
        A(gVar, i);
    }

    /* compiled from: ExifInterface.java */
    public static class b extends InputStream implements DataInput {

        /* renamed from: a, reason: collision with root package name */
        public final DataInputStream f2416a;

        /* renamed from: b, reason: collision with root package name */
        public int f2417b;

        /* renamed from: c, reason: collision with root package name */
        public ByteOrder f2418c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f2419d;

        /* renamed from: e, reason: collision with root package name */
        public final int f2420e;

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f2420e = bArr.length;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f2416a.available();
        }

        public final void d(int i) {
            int i9 = 0;
            while (i9 < i) {
                DataInputStream dataInputStream = this.f2416a;
                int i10 = i - i9;
                int skip = (int) dataInputStream.skip(i10);
                if (skip <= 0) {
                    if (this.f2419d == null) {
                        this.f2419d = new byte[8192];
                    }
                    skip = dataInputStream.read(this.f2419d, 0, Math.min(8192, i10));
                    if (skip == -1) {
                        throw new EOFException(s3.b.i("Reached EOF while skipping ", i, " bytes."));
                    }
                }
                i9 += skip;
            }
            this.f2417b += i9;
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public final int read() {
            this.f2417b++;
            return this.f2416a.read();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() {
            this.f2417b++;
            return this.f2416a.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() {
            this.f2417b++;
            int read = this.f2416a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() {
            this.f2417b += 2;
            return this.f2416a.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i, int i9) {
            this.f2417b += i9;
            this.f2416a.readFully(bArr, i, i9);
        }

        @Override // java.io.DataInput
        public final int readInt() {
            this.f2417b += 4;
            DataInputStream dataInputStream = this.f2416a;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            int read3 = dataInputStream.read();
            int read4 = dataInputStream.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f2418c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f2418c);
        }

        @Override // java.io.DataInput
        public final String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() {
            this.f2417b += 8;
            DataInputStream dataInputStream = this.f2416a;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            int read3 = dataInputStream.read();
            int read4 = dataInputStream.read();
            int read5 = dataInputStream.read();
            int read6 = dataInputStream.read();
            int read7 = dataInputStream.read();
            int read8 = dataInputStream.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f2418c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f2418c);
        }

        @Override // java.io.DataInput
        public final short readShort() {
            this.f2417b += 2;
            DataInputStream dataInputStream = this.f2416a;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f2418c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f2418c);
        }

        @Override // java.io.DataInput
        public final String readUTF() {
            this.f2417b += 2;
            return this.f2416a.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() {
            this.f2417b++;
            return this.f2416a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() {
            this.f2417b += 2;
            DataInputStream dataInputStream = this.f2416a;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f2418c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f2418c);
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i9) {
            int read = this.f2416a.read(bArr, i, i9);
            this.f2417b += read;
            return read;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) {
            this.f2417b += bArr.length;
            this.f2416a.readFully(bArr);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f2416a = dataInputStream;
            dataInputStream.mark(0);
            this.f2417b = 0;
            this.f2418c = byteOrder;
            this.f2420e = inputStream instanceof b ? ((b) inputStream).f2420e : -1;
        }
    }

    /* compiled from: ExifInterface.java */
    public static class g extends b {
        public g(byte[] bArr) {
            super(bArr);
            this.f2416a.mark(Integer.MAX_VALUE);
        }

        public final void i(long j10) {
            int i = this.f2417b;
            if (i > j10) {
                this.f2417b = 0;
                this.f2416a.reset();
            } else {
                j10 -= i;
            }
            d((int) j10);
        }

        public g(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f2416a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* compiled from: ExifInterface.java */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f2427a;

        /* renamed from: b, reason: collision with root package name */
        public final String f2428b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2429c;

        /* renamed from: d, reason: collision with root package name */
        public final int f2430d;

        public e(String str, int i, int i9) {
            this.f2428b = str;
            this.f2427a = i;
            this.f2429c = i9;
            this.f2430d = -1;
        }

        public e(String str, int i, int i9, int i10) {
            this.f2428b = str;
            this.f2427a = i;
            this.f2429c = i9;
            this.f2430d = i10;
        }
    }

    public a(String str) {
        e[][] eVarArr = W;
        this.f2400e = new HashMap[eVarArr.length];
        this.f2401f = new HashSet(eVarArr.length);
        this.f2402g = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            t(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public a(InputStream inputStream) {
        e[][] eVarArr = W;
        this.f2400e = new HashMap[eVarArr.length];
        this.f2401f = new HashSet(eVarArr.length);
        this.f2402g = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f2396a = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f2398c = (AssetManager.AssetInputStream) inputStream;
                this.f2397b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    try {
                        b.a.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                        this.f2398c = null;
                        this.f2397b = fileInputStream.getFD();
                    } catch (Exception unused) {
                        if (f2389t) {
                            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                        }
                    }
                }
                this.f2398c = null;
                this.f2397b = null;
            }
            v(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    /* compiled from: ExifInterface.java */
    /* renamed from: L0.a$a, reason: collision with other inner class name */
    public class C0032a extends MediaDataSource {

        /* renamed from: a, reason: collision with root package name */
        public long f2414a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f2415b;

        public C0032a(g gVar) {
            this.f2415b = gVar;
        }

        @Override // android.media.MediaDataSource
        public final long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public final int readAt(long j10, byte[] bArr, int i, int i9) {
            if (i9 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f2414a;
                g gVar = this.f2415b;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + gVar.f2416a.available()) {
                        return -1;
                    }
                    gVar.i(j10);
                    this.f2414a = j10;
                }
                if (i9 > gVar.f2416a.available()) {
                    i9 = gVar.f2416a.available();
                }
                int read = gVar.read(bArr, i, i9);
                if (read >= 0) {
                    this.f2414a += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f2414a = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}
