package s3;

import android.hardware.camera2.TotalCaptureResult;
import android.view.View;
import androidx.camera.core.CameraControl;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.internal.utils.RingBuffer;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import antonkozyriatskyi.circularprogressindicator.CircularProgressIndicator;
import io.sentry.SentryOptions;
import io.sentry.Y;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import kotlin.text.Regex;
import t.r;
import u9.E;
import w9.e;
import y0.C1600d;
import y8.DialogC1631l;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements r.e.a, RingBuffer.OnRemoveCallback, Y.a, e, C1600d.b, C1600d.a, CircularProgressIndicator.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26523a;

    public /* synthetic */ b(int i) {
        this.f26523a = i;
    }

    public static SurfaceCombination f(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, SurfaceCombination surfaceCombination, ArrayList arrayList, SurfaceCombination surfaceCombination2) {
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombination2);
        return new SurfaceCombination();
    }

    public static SurfaceCombination g(ArrayList arrayList, SurfaceCombination surfaceCombination) {
        arrayList.add(surfaceCombination);
        return new SurfaceCombination();
    }

    public static Character h(char c2, HashMap hashMap, Character ch, char c10) {
        hashMap.put(ch, Character.valueOf(c2));
        return Character.valueOf(c10);
    }

    public static String i(String str, int i, String str2) {
        return str + i + str2;
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String l(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String m(StringBuilder sb2, int i, String str) {
        sb2.append(i);
        sb2.append(str);
        return sb2.toString();
    }

    public static String n(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static String o(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2.toString();
    }

    public static StringBuilder p(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static void q(char c2, HashMap hashMap, Character ch, char c10, Character ch2) {
        hashMap.put(Character.valueOf(c2), ch);
        hashMap.put(Character.valueOf(c10), ch2);
    }

    public static /* bridge */ /* synthetic */ void r(int i, int i9, int i10, Object obj) {
        throw null;
    }

    public static /* bridge */ /* synthetic */ void s(int i, int i9, Class cls) {
        throw null;
    }

    public static void t(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, SurfaceCombination surfaceCombination, SurfaceConfig.ConfigType configType2, SurfaceConfig.ConfigSize configSize2) {
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
    }

    public static /* bridge */ /* synthetic */ void u(Object obj) {
        throw null;
    }

    public static void v(String str, CallbackToFutureAdapter.a aVar) {
        aVar.c(new CameraControl.OperationCanceledException(str));
    }

    public static boolean w(String str, String str2) {
        return new Regex(str).b(str2);
    }

    @Override // t.r.e.a
    public boolean a(TotalCaptureResult totalCaptureResult) {
        switch (this.f26523a) {
            case 8:
                return r.a(totalCaptureResult, false);
            default:
                return r.a(totalCaptureResult, true);
        }
    }

    @Override // io.sentry.Y.a
    public void c(SentryOptions sentryOptions) {
        Date date = E.f30368a;
    }

    @Override // antonkozyriatskyi.circularprogressindicator.CircularProgressIndicator.b
    public String d(double d10) {
        int i = DialogC1631l.f31151v;
        return "";
    }

    @Override // w9.e
    public boolean e(View view) {
        return view.isClickable() && view.getVisibility() == 0;
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback
    public void onRemove(Object obj) {
        ((ImageProxy) obj).close();
    }
}
