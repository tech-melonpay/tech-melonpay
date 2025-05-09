package E;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import pa.C1124b;

/* compiled from: DebugUtils.java */
/* loaded from: classes.dex */
public final class c {
    public static String a(String str, MediaCodec mediaCodec, MediaFormat mediaFormat) {
        StringBuilder sb2 = new StringBuilder();
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodec.getCodecInfo().getCapabilitiesForType(str);
            C1124b.l(capabilitiesForType != null);
            b(sb2, capabilitiesForType, mediaFormat);
        } catch (IllegalArgumentException unused) {
            sb2.append("[" + mediaCodec.getName() + "] does not support mime " + str);
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public static void b(StringBuilder sb2, MediaCodecInfo.CodecCapabilities codecCapabilities, MediaFormat mediaFormat) {
        int i;
        int i9;
        boolean z10;
        try {
            sb2.append("[CodecCaps] isFormatSupported = " + codecCapabilities.isFormatSupported(mediaFormat));
            sb2.append("\n");
        } catch (ClassCastException unused) {
            sb2.append("[CodecCaps] isFormatSupported=false");
            sb2.append("\n");
        }
        sb2.append("[CodecCaps] getDefaultFormat = " + codecCapabilities.getDefaultFormat());
        sb2.append("\n");
        int i10 = 0;
        if (codecCapabilities.profileLevels != null) {
            StringBuilder sb3 = new StringBuilder("[");
            ArrayList arrayList = new ArrayList();
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = codecCapabilities.profileLevels;
            int length = codecProfileLevelArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i11];
                arrayList.add(codecProfileLevel == null ? "null" : String.format("{level=%d, profile=%d}", Integer.valueOf(codecProfileLevel.level), Integer.valueOf(codecProfileLevel.profile)));
            }
            sb3.append(TextUtils.join(", ", arrayList));
            sb3.append("]");
            sb2.append("[CodecCaps] profileLevels = " + ((Object) sb3));
            sb2.append("\n");
        }
        if (codecCapabilities.colorFormats != null) {
            sb2.append("[CodecCaps] colorFormats = " + Arrays.toString(codecCapabilities.colorFormats));
            sb2.append("\n");
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities != null) {
            sb2.append("[VideoCaps] getBitrateRange = " + videoCapabilities.getBitrateRange());
            sb2.append("\n");
            sb2.append("[VideoCaps] getSupportedWidths = " + videoCapabilities.getSupportedWidths() + ", getWidthAlignment = " + videoCapabilities.getWidthAlignment());
            sb2.append("\n");
            sb2.append("[VideoCaps] getSupportedHeights = " + videoCapabilities.getSupportedHeights() + ", getHeightAlignment = " + videoCapabilities.getHeightAlignment());
            sb2.append("\n");
            boolean z11 = true;
            try {
                i = mediaFormat.getInteger("width");
                i9 = mediaFormat.getInteger("height");
                C1124b.l(i > 0 && i9 > 0);
                z10 = true;
            } catch (IllegalArgumentException | NullPointerException unused2) {
                sb2.append("[VideoCaps] mediaFormat does not contain valid width and height");
                sb2.append("\n");
                i = 0;
                i9 = 0;
                z10 = false;
            }
            if (z10) {
                try {
                    sb2.append("[VideoCaps] getSupportedHeightsFor " + i + " = " + videoCapabilities.getSupportedHeightsFor(i));
                    sb2.append("\n");
                } catch (IllegalArgumentException unused3) {
                    sb2.append("[VideoCaps] could not getSupportedHeightsFor " + i);
                    sb2.append("\n");
                }
                try {
                    sb2.append("[VideoCaps] getSupportedWidthsFor " + i9 + " = " + videoCapabilities.getSupportedWidthsFor(i9));
                    sb2.append("\n");
                } catch (IllegalArgumentException unused4) {
                    sb2.append("[VideoCaps] could not getSupportedWidthsFor " + i9);
                    sb2.append("\n");
                }
                StringBuilder q10 = androidx.camera.core.impl.utils.a.q(i, i9, "[VideoCaps] isSizeSupported for ", "x", " = ");
                q10.append(videoCapabilities.isSizeSupported(i, i9));
                sb2.append(q10.toString());
                sb2.append("\n");
            }
            sb2.append("[VideoCaps] getSupportedFrameRates = " + videoCapabilities.getSupportedFrameRates());
            sb2.append("\n");
            try {
                int integer = mediaFormat.getInteger("frame-rate");
                if (integer <= 0) {
                    z11 = false;
                }
                C1124b.l(z11);
                i10 = integer;
            } catch (IllegalArgumentException | NullPointerException unused5) {
                sb2.append("[VideoCaps] mediaFormat does not contain frame rate");
                sb2.append("\n");
            }
            if (z10) {
                StringBuilder q11 = androidx.camera.core.impl.utils.a.q(i, i9, "[VideoCaps] getSupportedFrameRatesFor ", "x", " = ");
                q11.append(videoCapabilities.getSupportedFrameRatesFor(i, i9));
                sb2.append(q11.toString());
                sb2.append("\n");
            }
            if (z10 && i10 > 0) {
                StringBuilder q12 = androidx.camera.core.impl.utils.a.q(i, i9, "[VideoCaps] areSizeAndRateSupported for ", "x", ", ");
                q12.append(i10);
                q12.append(" = ");
                q12.append(videoCapabilities.areSizeAndRateSupported(i, i9, i10));
                sb2.append(q12.toString());
                sb2.append("\n");
            }
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities != null) {
            sb2.append("[AudioCaps] getBitrateRange = " + audioCapabilities.getBitrateRange());
            sb2.append("\n");
            sb2.append("[AudioCaps] getMaxInputChannelCount = " + audioCapabilities.getMaxInputChannelCount());
            sb2.append("\n");
            if (Build.VERSION.SDK_INT >= 31) {
                sb2.append("[AudioCaps] getMinInputChannelCount = " + G.e.b(audioCapabilities));
                sb2.append("\n");
                sb2.append("[AudioCaps] getInputChannelCountRanges = " + Arrays.toString(G.e.a(audioCapabilities)));
                sb2.append("\n");
            }
            sb2.append("[AudioCaps] getSupportedSampleRateRanges = " + Arrays.toString(audioCapabilities.getSupportedSampleRateRanges()));
            sb2.append("\n");
            sb2.append("[AudioCaps] getSupportedSampleRates = " + Arrays.toString(audioCapabilities.getSupportedSampleRates()));
            sb2.append("\n");
            try {
                int integer2 = mediaFormat.getInteger("sample-rate");
                sb2.append("[AudioCaps] isSampleRateSupported for " + integer2 + " = " + audioCapabilities.isSampleRateSupported(integer2));
                sb2.append("\n");
            } catch (IllegalArgumentException | NullPointerException unused6) {
                sb2.append("[AudioCaps] mediaFormat does not contain sample rate");
                sb2.append("\n");
            }
        }
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = codecCapabilities.getEncoderCapabilities();
        if (encoderCapabilities != null) {
            sb2.append("[EncoderCaps] getComplexityRange = " + encoderCapabilities.getComplexityRange());
            sb2.append("\n");
            if (Build.VERSION.SDK_INT >= 28) {
                sb2.append("[EncoderCaps] getQualityRange = " + G.c.a(encoderCapabilities));
                sb2.append("\n");
            }
            try {
                sb2.append("[EncoderCaps] isBitrateModeSupported = " + encoderCapabilities.isBitrateModeSupported(mediaFormat.getInteger("bitrate-mode")));
                sb2.append("\n");
            } catch (IllegalArgumentException | NullPointerException unused7) {
                sb2.append("[EncoderCaps] mediaFormat does not contain bitrate mode");
                sb2.append("\n");
            }
        }
    }

    public static String c(long j10) {
        long millis = TimeUnit.MICROSECONDS.toMillis(j10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(millis);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(millis - timeUnit2.toMillis(hours));
        long millis2 = millis - timeUnit2.toMillis(hours);
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds(millis2 - timeUnit3.toMillis(minutes));
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((millis - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds)));
    }
}
