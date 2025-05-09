package t;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;
import java.nio.BufferUnderflowException;

/* compiled from: Camera2CameraCaptureResult.java */
/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1253e implements CameraCaptureResult {

    /* renamed from: a, reason: collision with root package name */
    public final TagBundle f27204a;

    /* renamed from: b, reason: collision with root package name */
    public final CaptureResult f27205b;

    public C1253e(TagBundle tagBundle, CaptureResult captureResult) {
        this.f27204a = tagBundle;
        this.f27205b = captureResult;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final CameraCaptureMetaData.AeState getAeState() {
        Integer num = (Integer) this.f27205b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return CameraCaptureMetaData.AeState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return CameraCaptureMetaData.AeState.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return CameraCaptureMetaData.AeState.CONVERGED;
            }
            if (intValue == 3) {
                return CameraCaptureMetaData.AeState.LOCKED;
            }
            if (intValue == 4) {
                return CameraCaptureMetaData.AeState.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                Logger.e("C2CameraCaptureResult", "Undefined ae state: " + num);
                return CameraCaptureMetaData.AeState.UNKNOWN;
            }
        }
        return CameraCaptureMetaData.AeState.SEARCHING;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final CameraCaptureMetaData.AfMode getAfMode() {
        Integer num = (Integer) this.f27205b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return CameraCaptureMetaData.AfMode.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return CameraCaptureMetaData.AfMode.ON_MANUAL_AUTO;
            }
            if (intValue == 3 || intValue == 4) {
                return CameraCaptureMetaData.AfMode.ON_CONTINUOUS_AUTO;
            }
            if (intValue != 5) {
                Logger.e("C2CameraCaptureResult", "Undefined af mode: " + num);
                return CameraCaptureMetaData.AfMode.UNKNOWN;
            }
        }
        return CameraCaptureMetaData.AfMode.OFF;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final CameraCaptureMetaData.AfState getAfState() {
        Integer num = (Integer) this.f27205b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return CameraCaptureMetaData.AfState.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                Logger.e("C2CameraCaptureResult", "Undefined af state: " + num);
                break;
        }
        return CameraCaptureMetaData.AfState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final CameraCaptureMetaData.AwbState getAwbState() {
        Integer num = (Integer) this.f27205b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return CameraCaptureMetaData.AwbState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return CameraCaptureMetaData.AwbState.INACTIVE;
        }
        if (intValue == 1) {
            return CameraCaptureMetaData.AwbState.METERING;
        }
        if (intValue == 2) {
            return CameraCaptureMetaData.AwbState.CONVERGED;
        }
        if (intValue == 3) {
            return CameraCaptureMetaData.AwbState.LOCKED;
        }
        Logger.e("C2CameraCaptureResult", "Undefined awb state: " + num);
        return CameraCaptureMetaData.AwbState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final CaptureResult getCaptureResult() {
        return this.f27205b;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final CameraCaptureMetaData.FlashState getFlashState() {
        Integer num = (Integer) this.f27205b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return CameraCaptureMetaData.FlashState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return CameraCaptureMetaData.FlashState.NONE;
        }
        if (intValue == 2) {
            return CameraCaptureMetaData.FlashState.READY;
        }
        if (intValue == 3 || intValue == 4) {
            return CameraCaptureMetaData.FlashState.FIRED;
        }
        Logger.e("C2CameraCaptureResult", "Undefined flash state: " + num);
        return CameraCaptureMetaData.FlashState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final TagBundle getTagBundle() {
        return this.f27204a;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final long getTimestamp() {
        Long l10 = (Long) this.f27205b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l10 == null) {
            return -1L;
        }
        return l10.longValue();
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final void populateExifData(ExifData.Builder builder) {
        super.populateExifData(builder);
        CaptureResult.Key key = CaptureResult.SCALER_CROP_REGION;
        CaptureResult captureResult = this.f27205b;
        Rect rect = (Rect) captureResult.get(key);
        if (rect != null) {
            builder.setImageWidth(rect.width()).setImageHeight(rect.height());
        }
        try {
            Integer num = (Integer) captureResult.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                builder.setOrientationDegrees(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            Logger.w("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l10 = (Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l10 != null) {
            builder.setExposureTimeNanos(l10.longValue());
        }
        Float f10 = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
        if (f10 != null) {
            builder.setLensFNumber(f10.floatValue());
        }
        Integer num2 = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            if (((Integer) captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num2 = Integer.valueOf(num2.intValue() * ((int) (r2.intValue() / 100.0f)));
            }
            builder.setIso(num2.intValue());
        }
        Float f11 = (Float) captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f11 != null) {
            builder.setFocalLength(f11.floatValue());
        }
        Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            ExifData.WhiteBalanceMode whiteBalanceMode = ExifData.WhiteBalanceMode.AUTO;
            if (num3.intValue() == 0) {
                whiteBalanceMode = ExifData.WhiteBalanceMode.MANUAL;
            }
            builder.setWhiteBalanceMode(whiteBalanceMode);
        }
    }

    public C1253e(CaptureResult captureResult) {
        this(TagBundle.emptyBundle(), captureResult);
    }
}
