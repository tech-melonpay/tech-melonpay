package androidx.camera.core.impl.utils;

import C.v;
import L0.a;
import android.location.Location;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.tls.CipherSuite;

/* loaded from: classes.dex */
public final class Exif {
    public static final long INVALID_TIMESTAMP = -1;
    private static final String KILOMETERS_PER_HOUR = "K";
    private static final String KNOTS = "N";
    private static final String MILES_PER_HOUR = "M";
    private static final String TAG = "Exif";
    private final L0.a mExifInterface;
    private boolean mRemoveTimestamp = false;
    private static final ThreadLocal<SimpleDateFormat> DATE_FORMAT = new ThreadLocal<SimpleDateFormat>() { // from class: androidx.camera.core.impl.utils.Exif.1
        @Override // java.lang.ThreadLocal
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    };
    private static final ThreadLocal<SimpleDateFormat> TIME_FORMAT = new ThreadLocal<SimpleDateFormat>() { // from class: androidx.camera.core.impl.utils.Exif.2
        @Override // java.lang.ThreadLocal
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    };
    private static final ThreadLocal<SimpleDateFormat> DATETIME_FORMAT = new ThreadLocal<SimpleDateFormat>() { // from class: androidx.camera.core.impl.utils.Exif.3
        @Override // java.lang.ThreadLocal
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    };
    private static final List<String> ALL_EXIF_TAGS = getAllExifTags();
    private static final List<String> DO_NOT_COPY_EXIF_TAGS = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    public static final class Speed {

        public static final class Converter {
            final double mMph;

            public Converter(double d10) {
                this.mMph = d10;
            }

            public double toMetersPerSecond() {
                return this.mMph / 2.23694d;
            }
        }

        private Speed() {
        }

        public static Converter fromKilometersPerHour(double d10) {
            return new Converter(d10 * 0.621371d);
        }

        public static Converter fromKnots(double d10) {
            return new Converter(d10 * 1.15078d);
        }

        public static Converter fromMilesPerHour(double d10) {
            return new Converter(d10);
        }
    }

    private Exif(L0.a aVar) {
        this.mExifInterface = aVar;
    }

    private void attachLastModifiedTimestamp() {
        long currentTimeMillis = System.currentTimeMillis();
        String convertToExifDateTime = convertToExifDateTime(currentTimeMillis);
        this.mExifInterface.H("DateTime", convertToExifDateTime);
        try {
            this.mExifInterface.H("SubSecTime", Long.toString(currentTimeMillis - convertFromExifDateTime(convertToExifDateTime).getTime()));
        } catch (ParseException unused) {
        }
    }

    private static Date convertFromExifDate(String str) {
        return DATE_FORMAT.get().parse(str);
    }

    private static Date convertFromExifDateTime(String str) {
        return DATETIME_FORMAT.get().parse(str);
    }

    private static Date convertFromExifTime(String str) {
        return TIME_FORMAT.get().parse(str);
    }

    private static String convertToExifDateTime(long j10) {
        return DATETIME_FORMAT.get().format(new Date(j10));
    }

    public static Exif createFromFile(File file) {
        return createFromFileString(file.toString());
    }

    public static Exif createFromFileString(String str) {
        return new Exif(new L0.a(str));
    }

    public static Exif createFromImageProxy(ImageProxy imageProxy) {
        ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
        buffer.rewind();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.get(bArr);
        return createFromInputStream(new ByteArrayInputStream(bArr));
    }

    public static Exif createFromInputStream(InputStream inputStream) {
        return new Exif(new L0.a(inputStream));
    }

    public static List<String> getAllExifTags() {
        return Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    }

    private long parseTimestamp(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return convertFromExifDate(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        }
        if (str != null) {
            return parseTimestamp(v.p(str, " ", str2));
        }
        try {
            return convertFromExifTime(str2).getTime();
        } catch (ParseException unused2) {
            return -1L;
        }
    }

    public void attachLocation(Location location) {
        L0.a aVar = this.mExifInterface;
        aVar.getClass();
        if (location == null) {
            return;
        }
        aVar.H("GPSProcessingMethod", location.getProvider());
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        if (latitude < -90.0d || latitude > 90.0d || Double.isNaN(latitude)) {
            throw new IllegalArgumentException("Latitude value " + latitude + " is not valid.");
        }
        if (longitude < -180.0d || longitude > 180.0d || Double.isNaN(longitude)) {
            throw new IllegalArgumentException("Longitude value " + longitude + " is not valid.");
        }
        aVar.H("GPSLatitudeRef", latitude >= 0.0d ? KNOTS : "S");
        aVar.H("GPSLatitude", L0.a.b(Math.abs(latitude)));
        aVar.H("GPSLongitudeRef", longitude >= 0.0d ? "E" : "W");
        aVar.H("GPSLongitude", L0.a.b(Math.abs(longitude)));
        double altitude = location.getAltitude();
        String str = altitude >= 0.0d ? "0" : "1";
        aVar.H("GPSAltitude", new a.f(Math.abs(altitude)).toString());
        aVar.H("GPSAltitudeRef", str);
        aVar.H("GPSSpeedRef", KILOMETERS_PER_HOUR);
        aVar.H("GPSSpeed", new a.f((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] split = L0.a.R.format(new Date(location.getTime())).split("\\s+", -1);
        aVar.H("GPSDateStamp", split[0]);
        aVar.H("GPSTimeStamp", split[1]);
    }

    public void attachTimestamp() {
        long currentTimeMillis = System.currentTimeMillis();
        String convertToExifDateTime = convertToExifDateTime(currentTimeMillis);
        this.mExifInterface.H("DateTimeOriginal", convertToExifDateTime);
        this.mExifInterface.H("DateTimeDigitized", convertToExifDateTime);
        try {
            String l10 = Long.toString(currentTimeMillis - convertFromExifDateTime(convertToExifDateTime).getTime());
            this.mExifInterface.H("SubSecTimeOriginal", l10);
            this.mExifInterface.H("SubSecTimeDigitized", l10);
        } catch (ParseException unused) {
        }
        this.mRemoveTimestamp = false;
    }

    public void copyToCroppedImage(Exif exif) {
        ArrayList arrayList = new ArrayList(ALL_EXIF_TAGS);
        arrayList.removeAll(DO_NOT_COPY_EXIF_TAGS);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String d10 = this.mExifInterface.d(str);
            String d11 = exif.mExifInterface.d(str);
            if (d10 != null && !d10.equals(d11)) {
                exif.mExifInterface.H(str, d10);
            }
        }
    }

    public void flipHorizontally() {
        int i;
        switch (getOrientation()) {
            case 2:
                i = 1;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 7;
                break;
            default:
                i = 2;
                break;
        }
        this.mExifInterface.H("Orientation", String.valueOf(i));
    }

    public void flipVertically() {
        int i;
        switch (getOrientation()) {
            case 2:
                i = 3;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 1;
                break;
            case 5:
                i = 8;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 5;
                break;
            default:
                i = 4;
                break;
        }
        this.mExifInterface.H("Orientation", String.valueOf(i));
    }

    public String getDescription() {
        return this.mExifInterface.d("ImageDescription");
    }

    public L0.a getExifInterface() {
        return this.mExifInterface;
    }

    public int getHeight() {
        return this.mExifInterface.e(0, "ImageLength");
    }

    public long getLastModifiedTimestamp() {
        long parseTimestamp = parseTimestamp(this.mExifInterface.d("DateTime"));
        if (parseTimestamp == -1) {
            return -1L;
        }
        String d10 = this.mExifInterface.d("SubSecTime");
        if (d10 == null) {
            return parseTimestamp;
        }
        try {
            long parseLong = Long.parseLong(d10);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return parseTimestamp + parseLong;
        } catch (NumberFormatException unused) {
            return parseTimestamp;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0108, code lost:
    
        if (r13.equals(androidx.camera.core.impl.utils.Exif.MILES_PER_HOUR) != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.location.Location getLocation() {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.Exif.getLocation():android.location.Location");
    }

    public int getOrientation() {
        return this.mExifInterface.e(0, "Orientation");
    }

    public int getRotation() {
        switch (getOrientation()) {
            case 3:
            case 4:
                return CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public long getTimestamp() {
        long parseTimestamp = parseTimestamp(this.mExifInterface.d("DateTimeOriginal"));
        if (parseTimestamp == -1) {
            return -1L;
        }
        String d10 = this.mExifInterface.d("SubSecTimeOriginal");
        if (d10 == null) {
            return parseTimestamp;
        }
        try {
            long parseLong = Long.parseLong(d10);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return parseTimestamp + parseLong;
        } catch (NumberFormatException unused) {
            return parseTimestamp;
        }
    }

    public int getWidth() {
        return this.mExifInterface.e(0, "ImageWidth");
    }

    public boolean isFlippedHorizontally() {
        return getOrientation() == 2;
    }

    public boolean isFlippedVertically() {
        int orientation = getOrientation();
        return orientation == 4 || orientation == 5 || orientation == 7;
    }

    public void removeLocation() {
        this.mExifInterface.H("GPSProcessingMethod", null);
        this.mExifInterface.H("GPSLatitude", null);
        this.mExifInterface.H("GPSLatitudeRef", null);
        this.mExifInterface.H("GPSLongitude", null);
        this.mExifInterface.H("GPSLongitudeRef", null);
        this.mExifInterface.H("GPSAltitude", null);
        this.mExifInterface.H("GPSAltitudeRef", null);
        this.mExifInterface.H("GPSSpeed", null);
        this.mExifInterface.H("GPSSpeedRef", null);
        this.mExifInterface.H("GPSDateStamp", null);
        this.mExifInterface.H("GPSTimeStamp", null);
    }

    public void removeTimestamp() {
        this.mExifInterface.H("DateTime", null);
        this.mExifInterface.H("DateTimeOriginal", null);
        this.mExifInterface.H("DateTimeDigitized", null);
        this.mExifInterface.H("SubSecTime", null);
        this.mExifInterface.H("SubSecTimeOriginal", null);
        this.mExifInterface.H("SubSecTimeDigitized", null);
        this.mRemoveTimestamp = true;
    }

    public void rotate(int i) {
        if (i % 90 != 0) {
            String str = TAG;
            Locale locale = Locale.US;
            Logger.w(str, "Can only rotate in right angles (eg. 0, 90, 180, 270). " + i + " is unsupported.");
            this.mExifInterface.H("Orientation", String.valueOf(0));
            return;
        }
        int i9 = i % 360;
        int orientation = getOrientation();
        while (i9 < 0) {
            i9 += 90;
            switch (orientation) {
                case 2:
                    orientation = 5;
                    break;
                case 3:
                case 8:
                    orientation = 6;
                    break;
                case 4:
                    orientation = 7;
                    break;
                case 5:
                    orientation = 4;
                    break;
                case 6:
                    orientation = 1;
                    break;
                case 7:
                    orientation = 2;
                    break;
                default:
                    orientation = 8;
                    break;
            }
        }
        while (i9 > 0) {
            i9 -= 90;
            switch (orientation) {
                case 2:
                    orientation = 7;
                    break;
                case 3:
                    orientation = 8;
                    break;
                case 4:
                    orientation = 5;
                    break;
                case 5:
                    orientation = 2;
                    break;
                case 6:
                    orientation = 3;
                    break;
                case 7:
                    orientation = 4;
                    break;
                case 8:
                    orientation = 1;
                    break;
                default:
                    orientation = 6;
                    break;
            }
        }
        this.mExifInterface.H("Orientation", String.valueOf(orientation));
    }

    public void save() {
        if (!this.mRemoveTimestamp) {
            attachLastModifiedTimestamp();
        }
        this.mExifInterface.D();
    }

    public void setDescription(String str) {
        this.mExifInterface.H("ImageDescription", str);
    }

    public void setOrientation(int i) {
        this.mExifInterface.H("Orientation", String.valueOf(i));
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(getWidth()), Integer.valueOf(getHeight()), Integer.valueOf(getRotation()), Boolean.valueOf(isFlippedVertically()), Boolean.valueOf(isFlippedHorizontally()), getLocation(), Long.valueOf(getTimestamp()), getDescription());
    }

    private long parseTimestamp(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return convertFromExifDateTime(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }
}
