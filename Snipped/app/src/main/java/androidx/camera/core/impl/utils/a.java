package androidx.camera.core.impl.utils;

import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import antonkozyriatskyi.circularprogressindicator.CircularProgressIndicator;
import com.google.android.gms.internal.gtm.zzto;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzje;
import com.google.android.gms.internal.mlkit_common.zzbk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdg;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj;
import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.measurement.internal.zzfv;
import com.google.firebase.encoders.FieldDescriptor;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Preview.SurfaceProvider, CircularProgressIndicator.b {
    public static int A(int i, int i9, int i10, int i11) {
        return zzje.zzA(i) + i9 + i10 + i11;
    }

    public static FieldDescriptor B(int i, FieldDescriptor.Builder builder) {
        zzae zzaeVar = new zzae();
        zzaeVar.zza(i);
        return builder.withProperty(zzaeVar.zzb()).build();
    }

    public static int C(int i, int i9, int i10, int i11) {
        return zzdj.zzy(i) + i9 + i10 + i11;
    }

    public static int a(int i, int i9, int i10) {
        return zzto.zzD(i) + i9 + i10;
    }

    public static int b(int i, int i9, int i10, int i11) {
        return ((i * i9) / i10) + i11;
    }

    public static FieldDescriptor c(int i, FieldDescriptor.Builder builder) {
        zzbk zzbkVar = new zzbk();
        zzbkVar.zza(i);
        return builder.withProperty(zzbkVar.zzb()).build();
    }

    public static Object e(zzbl zzblVar, int i, List list, int i9) {
        zzh.zzh(zzblVar.name(), i, list);
        return list.get(i9);
    }

    public static String f(int i, String str, int i9, String str2, int i10) {
        StringBuilder sb2 = new StringBuilder(i);
        sb2.append(str);
        sb2.append(i9);
        sb2.append(str2);
        sb2.append(i10);
        return sb2.toString();
    }

    public static String g(int i, StringBuilder sb2) {
        sb2.append(Integer.toHexString(i));
        return sb2.toString();
    }

    public static String h(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.exceptionLabel());
        return sb2.toString();
    }

    public static String i(Class cls, StringBuilder sb2) {
        sb2.append(cls.getCanonicalName());
        return sb2.toString();
    }

    public static String j(Object obj, String str) {
        return str + obj;
    }

    public static String k(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String l(String str, Class cls, String str2) {
        return str + cls + str2;
    }

    public static String m(StringBuilder sb2, int i, char c2) {
        sb2.append(i);
        sb2.append(c2);
        return sb2.toString();
    }

    public static String n(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String o(StringBuilder sb2, boolean z10, char c2) {
        sb2.append(z10);
        sb2.append(c2);
        return sb2.toString();
    }

    public static String p(GeneralSecurityException generalSecurityException, StringBuilder sb2) {
        sb2.append(generalSecurityException.getMessage());
        return sb2.toString();
    }

    public static StringBuilder q(int i, int i9, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i);
        sb2.append(str2);
        sb2.append(i9);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder r(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static void s(int i, HashMap hashMap, String str, int i9, String str2) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i9));
    }

    public static void t(zzfv zzfvVar, String str) {
        zzfvVar.zzay().zzd().zza(str);
    }

    public static void u(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static int v(int i, int i9, int i10) {
        return zzje.zzA(i) + i9 + i10;
    }

    public static int w(int i, int i9, int i10, int i11) {
        return zzto.zzD(i) + i9 + i10 + i11;
    }

    public static FieldDescriptor x(int i, FieldDescriptor.Builder builder) {
        zzdg zzdgVar = new zzdg();
        zzdgVar.zza(i);
        return builder.withProperty(zzdgVar.zzb()).build();
    }

    public static void y(zzfv zzfvVar, String str) {
        zzfvVar.zzay().zzk().zza(str);
    }

    public static int z(int i, int i9, int i10) {
        return zzdj.zzy(i) + i9 + i10;
    }

    @Override // antonkozyriatskyi.circularprogressindicator.CircularProgressIndicator.b
    public String d(double d10) {
        return "";
    }

    @Override // androidx.camera.core.Preview.SurfaceProvider
    public void onSurfaceRequested(SurfaceRequest surfaceRequest) {
        CameraUseCaseAdapter.lambda$createExtraPreview$1(surfaceRequest);
    }
}
