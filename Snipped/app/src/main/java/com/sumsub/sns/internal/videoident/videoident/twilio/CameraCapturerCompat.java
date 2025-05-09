package com.sumsub.sns.internal.videoident.videoident.twilio;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import com.twilio.video.Camera2Capturer;
import com.twilio.video.CameraCapturer;
import com.twilio.video.VideoCapturer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import tvi.webrtc.Camera1Enumerator;
import tvi.webrtc.Camera2Enumerator;

/* loaded from: classes2.dex */
public class CameraCapturerCompat implements VideoCapturer {

    /* renamed from: a, reason: collision with root package name */
    public CameraCapturer f19635a;

    /* renamed from: b, reason: collision with root package name */
    public Camera2Capturer f19636b;

    /* renamed from: c, reason: collision with root package name */
    public VideoCapturer f19637c;

    /* renamed from: h, reason: collision with root package name */
    public CameraManager f19642h;

    /* renamed from: d, reason: collision with root package name */
    public final Map<Source, String> f19638d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, Source> f19639e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final Map<Source, String> f19640f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Map<String, Source> f19641g = new HashMap();
    public CameraCapturer.Listener i = new a();

    public enum Source {
        FRONT_CAMERA,
        BACK_CAMERA
    }

    public class a implements CameraCapturer.Listener {
        public a() {
        }
    }

    public boolean a(Context context, Source source) {
        if (!a(context)) {
            b();
            String a10 = a(this.f19638d, source);
            if (a10 == null) {
                return false;
            }
            CameraCapturer cameraCapturer = new CameraCapturer(context, a10, this.i);
            this.f19635a = cameraCapturer;
            this.f19637c = cameraCapturer;
            this.f19636b = null;
            return true;
        }
        this.f19642h = (CameraManager) context.getSystemService("camera");
        b(context);
        String a11 = a(this.f19640f, source);
        if (a11 == null) {
            return false;
        }
        Camera2Capturer camera2Capturer = new Camera2Capturer(context, a11);
        this.f19636b = camera2Capturer;
        this.f19637c = camera2Capturer;
        this.f19635a = null;
        return true;
    }

    public final void b(Context context) {
        Camera2Enumerator camera2Enumerator = new Camera2Enumerator(context);
        for (String str : camera2Enumerator.getDeviceNames()) {
            if (a(str)) {
                if (camera2Enumerator.isFrontFacing(str)) {
                    Map<Source, String> map = this.f19640f;
                    Source source = Source.FRONT_CAMERA;
                    map.put(source, str);
                    this.f19641g.put(str, source);
                }
                if (camera2Enumerator.isBackFacing(str)) {
                    Map<Source, String> map2 = this.f19640f;
                    Source source2 = Source.BACK_CAMERA;
                    map2.put(source2, str);
                    this.f19641g.put(str, source2);
                }
            }
        }
    }

    public Source c() {
        Source a10 = a();
        Map<String, Source> map = d() ? this.f19639e : this.f19641g;
        Map<Source, String> map2 = d() ? this.f19638d : this.f19640f;
        Source source = Source.FRONT_CAMERA;
        String str = source == a10 ? map2.get(Source.BACK_CAMERA) : map2.get(source);
        if (str != null) {
            if (d()) {
                this.f19635a.switchCamera(str);
            } else {
                this.f19636b.switchCamera(str);
            }
        }
        return map.get(str);
    }

    public final boolean d() {
        return this.f19635a != null;
    }

    public final boolean e() {
        return this.f19636b != null;
    }

    public final void b() {
        Camera1Enumerator camera1Enumerator = new Camera1Enumerator();
        for (String str : camera1Enumerator.getDeviceNames()) {
            if (camera1Enumerator.isFrontFacing(str)) {
                Map<Source, String> map = this.f19638d;
                Source source = Source.FRONT_CAMERA;
                map.put(source, str);
                this.f19639e.put(str, source);
            }
            if (camera1Enumerator.isBackFacing(str)) {
                Map<Source, String> map2 = this.f19638d;
                Source source2 = Source.BACK_CAMERA;
                map2.put(source2, str);
                this.f19639e.put(str, source2);
            }
        }
    }

    public final boolean a(Context context) {
        return Camera2Capturer.isSupported(context);
    }

    public final String a(Map<Source, String> map, Source source) {
        String str = map.get(source);
        if (str != null) {
            return str;
        }
        if (map.isEmpty()) {
            return null;
        }
        return (String) new LinkedList(map.values()).getFirst();
    }

    public Source a() {
        if (d()) {
            return this.f19639e.get(this.f19635a.getCameraId());
        }
        if (e()) {
            return this.f19641g.get(this.f19636b.getCameraId());
        }
        return null;
    }

    public final boolean a(String str) {
        try {
            CameraCharacteristics cameraCharacteristics = this.f19642h.getCameraCharacteristics(str);
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            boolean isOutputSupportedFor = streamConfigurationMap != null ? streamConfigurationMap.isOutputSupportedFor(34) : false;
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT);
            return isOutputSupportedFor && !(Build.VERSION.SDK_INT >= 29 && num != null && (num.intValue() == 5 || num.intValue() == 6));
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
