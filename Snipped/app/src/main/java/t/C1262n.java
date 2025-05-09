package t;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraState;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ExposureState;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.Logger;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.internal.ImmutableZoomState;
import androidx.lifecycle.AbstractC0557x;
import androidx.lifecycle.C0558y;
import androidx.lifecycle.C0559z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import pa.C1124b;
import t.p0;
import u.C;

/* compiled from: Camera2CameraInfoImpl.java */
/* renamed from: t.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1262n implements CameraInfoInternal {

    /* renamed from: a, reason: collision with root package name */
    public final String f27304a;

    /* renamed from: b, reason: collision with root package name */
    public final u.n f27305b;

    /* renamed from: c, reason: collision with root package name */
    public final z.d f27306c;

    /* renamed from: e, reason: collision with root package name */
    public C1257i f27308e;

    /* renamed from: h, reason: collision with root package name */
    public final a<CameraState> f27311h;

    /* renamed from: j, reason: collision with root package name */
    public final Quirks f27312j;

    /* renamed from: k, reason: collision with root package name */
    public final C1270w f27313k;

    /* renamed from: l, reason: collision with root package name */
    public final u.v f27314l;

    /* renamed from: d, reason: collision with root package name */
    public final Object f27307d = new Object();

    /* renamed from: f, reason: collision with root package name */
    public a<Integer> f27309f = null;

    /* renamed from: g, reason: collision with root package name */
    public a<ZoomState> f27310g = null;
    public ArrayList i = null;

    /* compiled from: Camera2CameraInfoImpl.java */
    /* renamed from: t.n$a */
    public static class a<T> extends C0558y<T> {

        /* renamed from: b, reason: collision with root package name */
        public AbstractC0557x<T> f27315b;

        /* renamed from: c, reason: collision with root package name */
        public final T f27316c;

        public a(T t3) {
            this.f27316c = t3;
        }

        @Override // androidx.lifecycle.C0558y
        public final <S> void a(AbstractC0557x<S> abstractC0557x, androidx.lifecycle.A<? super S> a10) {
            throw new UnsupportedOperationException();
        }

        public final void b(C0559z c0559z) {
            C0558y.a<?> c2;
            AbstractC0557x<T> abstractC0557x = this.f27315b;
            if (abstractC0557x != null && (c2 = this.f7115a.c(abstractC0557x)) != null) {
                c2.f7116a.removeObserver(c2);
            }
            this.f27315b = c0559z;
            super.a(c0559z, new U1.b(this, 5));
        }

        @Override // androidx.lifecycle.AbstractC0557x
        public final T getValue() {
            AbstractC0557x<T> abstractC0557x = this.f27315b;
            return abstractC0557x == null ? this.f27316c : abstractC0557x.getValue();
        }
    }

    public C1262n(String str, u.v vVar) {
        str.getClass();
        this.f27304a = str;
        this.f27314l = vVar;
        u.n b9 = vVar.b(str);
        this.f27305b = b9;
        this.f27306c = new z.d(this);
        this.f27312j = C1124b.w(b9);
        this.f27313k = new C1270w(str);
        this.f27311h = new a<>(CameraState.create(CameraState.Type.CLOSED));
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final void addSessionCaptureCallback(Executor executor, CameraCaptureCallback cameraCaptureCallback) {
        synchronized (this.f27307d) {
            try {
                C1257i c1257i = this.f27308e;
                if (c1257i != null) {
                    c1257i.f27245b.execute(new C.y(c1257i, executor, cameraCaptureCallback, 19));
                } else {
                    if (this.i == null) {
                        this.i = new ArrayList();
                    }
                    this.i.add(new Pair(cameraCaptureCallback, executor));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(C1257i c1257i) {
        synchronized (this.f27307d) {
            try {
                this.f27308e = c1257i;
                a<ZoomState> aVar = this.f27310g;
                if (aVar != null) {
                    aVar.b(c1257i.f27251h.f27327d);
                }
                a<Integer> aVar2 = this.f27309f;
                if (aVar2 != null) {
                    aVar2.b(this.f27308e.i.f27298b);
                }
                ArrayList arrayList = this.i;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        C1257i c1257i2 = this.f27308e;
                        Executor executor = (Executor) pair.second;
                        CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) pair.first;
                        c1257i2.getClass();
                        c1257i2.f27245b.execute(new C.y(c1257i2, executor, cameraCaptureCallback, 19));
                    }
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Integer num = (Integer) this.f27305b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        int intValue = num.intValue();
        Logger.i("Camera2CameraInfo", "Device Level: " + (intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 4 ? com.google.android.gms.measurement.internal.a.g(intValue, "Unknown value: ") : "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL" : "INFO_SUPPORTED_HARDWARE_LEVEL_3" : "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY" : "INFO_SUPPORTED_HARDWARE_LEVEL_FULL" : "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED"));
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final String getCameraId() {
        return this.f27304a;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Quirks getCameraQuirks() {
        return this.f27312j;
    }

    @Override // androidx.camera.core.CameraInfo
    public final AbstractC0557x<CameraState> getCameraState() {
        return this.f27311h;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final EncoderProfilesProvider getEncoderProfilesProvider() {
        return this.f27313k;
    }

    @Override // androidx.camera.core.CameraInfo
    public final ExposureState getExposureState() {
        synchronized (this.f27307d) {
            try {
                C1257i c1257i = this.f27308e;
                if (c1257i == null) {
                    return new P(this.f27305b);
                }
                return c1257i.f27252j.f27145b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public final String getImplementationType() {
        Integer num = (Integer) this.f27305b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue() == 2 ? CameraInfo.IMPLEMENTATION_TYPE_CAMERA2_LEGACY : CameraInfo.IMPLEMENTATION_TYPE_CAMERA2;
    }

    @Override // androidx.camera.core.CameraInfo
    public final float getIntrinsicZoomRatio() {
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        u.n nVar = this.f27305b;
        if (((Integer) nVar.a(key)) == null) {
            return 1.0f;
        }
        try {
            C1124b.p((float[]) nVar.a(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS), "The focal lengths can not be empty.");
            return Y.b(this.f27314l, r0.intValue()) / Y.a(r3[0], Y.c(nVar));
        } catch (Exception e10) {
            Logger.e("Camera2CameraInfo", "The camera is unable to provide necessary information to resolve its intrinsic zoom ratio with error: " + e10);
            return 1.0f;
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public final int getLensFacing() {
        Integer num = (Integer) this.f27305b.a(CameraCharacteristics.LENS_FACING);
        C1124b.m(num != null, "Unable to get the lens facing of the camera.");
        int intValue = num.intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue == 1) {
            return 1;
        }
        if (intValue == 2) {
            return 2;
        }
        throw new IllegalArgumentException(s3.b.i("The given lens facing integer: ", intValue, " can not be recognized."));
    }

    @Override // androidx.camera.core.CameraInfo
    public final int getSensorRotationDegrees(int i) {
        Integer num = (Integer) this.f27305b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return CameraOrientationUtil.getRelativeImageRotation(CameraOrientationUtil.surfaceRotationToDegrees(i), num.intValue(), 1 == getLensFacing());
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Set<DynamicRange> getSupportedDynamicRanges() {
        return v.b.a(this.f27305b).f30487a.getSupportedDynamicRanges();
    }

    @Override // androidx.camera.core.CameraInfo
    public final Set<Range<Integer>> getSupportedFrameRateRanges() {
        Range[] rangeArr = (Range[]) this.f27305b.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        return rangeArr != null ? new HashSet(Arrays.asList(rangeArr)) : Collections.emptySet();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final List<Size> getSupportedHighResolutions(int i) {
        u.A b9 = this.f27305b.b();
        HashMap hashMap = b9.f30035d;
        Size[] sizeArr = null;
        if (!hashMap.containsKey(Integer.valueOf(i))) {
            Size[] a10 = C.a.a(b9.f30032a.f30036a, i);
            if (a10 != null && a10.length > 0) {
                a10 = b9.f30033b.k(a10, i);
            }
            hashMap.put(Integer.valueOf(i), a10);
            if (a10 != null) {
                sizeArr = (Size[]) a10.clone();
            }
        } else if (((Size[]) hashMap.get(Integer.valueOf(i))) != null) {
            sizeArr = (Size[]) ((Size[]) hashMap.get(Integer.valueOf(i))).clone();
        }
        return sizeArr != null ? Arrays.asList(sizeArr) : Collections.emptyList();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final List<Size> getSupportedResolutions(int i) {
        Size[] a10 = this.f27305b.b().a(i);
        return a10 != null ? Arrays.asList(a10) : Collections.emptyList();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Timebase getTimebase() {
        Integer num = (Integer) this.f27305b.a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        num.getClass();
        return num.intValue() != 1 ? Timebase.UPTIME : Timebase.REALTIME;
    }

    @Override // androidx.camera.core.CameraInfo
    public final AbstractC0557x<Integer> getTorchState() {
        synchronized (this.f27307d) {
            try {
                C1257i c1257i = this.f27308e;
                if (c1257i == null) {
                    if (this.f27309f == null) {
                        this.f27309f = new a<>(0);
                    }
                    return this.f27309f;
                }
                a<Integer> aVar = this.f27309f;
                if (aVar != null) {
                    return aVar;
                }
                return c1257i.i.f27298b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public final AbstractC0557x<ZoomState> getZoomState() {
        synchronized (this.f27307d) {
            try {
                C1257i c1257i = this.f27308e;
                if (c1257i != null) {
                    a<ZoomState> aVar = this.f27310g;
                    if (aVar != null) {
                        return aVar;
                    }
                    return c1257i.f27251h.f27327d;
                }
                if (this.f27310g == null) {
                    p0.b a10 = p0.a(this.f27305b);
                    q0 q0Var = new q0(a10.c(), a10.d());
                    q0Var.b(1.0f);
                    this.f27310g = new a<>(ImmutableZoomState.create(q0Var));
                }
                return this.f27310g;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public final boolean hasFlashUnit() {
        u.n nVar = this.f27305b;
        Objects.requireNonNull(nVar);
        return x.d.a(new com.sumsub.sns.geo.presentation.d(nVar, 19));
    }

    @Override // androidx.camera.core.CameraInfo
    public final boolean isFocusMeteringSupported(FocusMeteringAction focusMeteringAction) {
        synchronized (this.f27307d) {
            try {
                C1257i c1257i = this.f27308e;
                if (c1257i == null) {
                    return false;
                }
                return c1257i.f27250g.d(focusMeteringAction);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public final boolean isPrivateReprocessingSupported() {
        int[] iArr = (int[]) this.f27305b.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr == null) {
            return false;
        }
        for (int i : iArr) {
            if (i == 4) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.CameraInfo
    public final boolean isZslSupported() {
        return isPrivateReprocessingSupported() && w.k.f30775a.get(w.I.class) == null;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final void removeSessionCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
        synchronized (this.f27307d) {
            try {
                C1257i c1257i = this.f27308e;
                if (c1257i != null) {
                    c1257i.f27245b.execute(new com.sumsub.sns.camera.photo.presentation.document.c(6, c1257i, cameraCaptureCallback));
                    return;
                }
                ArrayList arrayList = this.i;
                if (arrayList == null) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).first == cameraCaptureCallback) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public final int getSensorRotationDegrees() {
        return getSensorRotationDegrees(0);
    }
}
