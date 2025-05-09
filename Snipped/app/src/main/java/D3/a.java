package D3;

import F3.b;
import G3.d;
import G3.e;
import G3.f;
import G3.g;
import G3.i;
import G3.j;
import G3.k;
import G3.l;
import G3.o;
import G3.p;
import G3.q;
import G3.r;
import G3.s;
import Z2.c;
import Z2.h;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.Image;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzao;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzap;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaq;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzar;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzas;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzat;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzau;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzav;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaw;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzax;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzay;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzaz;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzba;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbk;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbu;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcd;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzci;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public final class a extends zzbk {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f862f = {5, 7, 7, 7, 5, 5};

    /* renamed from: g, reason: collision with root package name */
    public static final double[][] f863g;

    /* renamed from: c, reason: collision with root package name */
    public final Context f864c;

    /* renamed from: d, reason: collision with root package name */
    public final RecognitionOptions f865d;

    /* renamed from: e, reason: collision with root package name */
    public BarhopperV3 f866e;

    static {
        double[] dArr = new double[2];
        // fill-array-data instruction
        dArr[0] = 0.5d;
        dArr[1] = 1.0d;
        f863g = new double[][]{new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, dArr, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};
    }

    public a(Context context, zzbc zzbcVar) {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        this.f865d = recognitionOptions;
        this.f864c = context;
        recognitionOptions.a(zzbcVar.zza());
        recognitionOptions.b(zzbcVar.zzb());
    }

    public static zzap b(o oVar, String str, String str2) {
        if (oVar == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        return new zzap(oVar.d(), oVar.zzd(), oVar.a(), oVar.b(), oVar.zzc(), oVar.c(), oVar.g(), matcher.find() ? matcher.group(1) : null);
    }

    public final G3.a c(ByteBuffer byteBuffer, zzbu zzbuVar) {
        BarhopperV3 barhopperV3 = (BarhopperV3) Preconditions.checkNotNull(this.f866e);
        boolean isDirect = ((ByteBuffer) Preconditions.checkNotNull(byteBuffer)).isDirect();
        RecognitionOptions recognitionOptions = this.f865d;
        if (isDirect) {
            return barhopperV3.i(zzbuVar.zzd(), zzbuVar.zza(), byteBuffer, recognitionOptions);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.j(zzbuVar.zzd(), zzbuVar.zza(), byteBuffer.array(), recognitionOptions);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.j(zzbuVar.zzd(), zzbuVar.zza(), bArr, recognitionOptions);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbl
    public final List zzb(IObjectWrapper iObjectWrapper, zzbu zzbuVar) {
        G3.a p10;
        Matrix matrix;
        zzat zzatVar;
        zzaw zzawVar;
        zzax zzaxVar;
        zzaz zzazVar;
        zzay zzayVar;
        zzau zzauVar;
        zzaq zzaqVar;
        int i;
        zzar zzarVar;
        zzas zzasVar;
        int i9;
        int i10;
        Point[] pointArr;
        int i11;
        int i12;
        zzaw[] zzawVarArr;
        zzat[] zzatVarArr;
        zzao[] zzaoVarArr;
        int zzb = zzbuVar.zzb();
        int i13 = -1;
        int i14 = 0;
        if (zzb != -1) {
            if (zzb != 17) {
                if (zzb == 35) {
                    p10 = c(((Image) Preconditions.checkNotNull((Image) ObjectWrapper.unwrap(iObjectWrapper))).getPlanes()[0].getBuffer(), zzbuVar);
                } else if (zzb != 842094169) {
                    throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(zzbuVar.zzb(), "Unsupported image format: "));
                }
            }
            p10 = c((ByteBuffer) ObjectWrapper.unwrap(iObjectWrapper), zzbuVar);
        } else {
            p10 = ((BarhopperV3) Preconditions.checkNotNull(this.f866e)).p((Bitmap) ObjectWrapper.unwrap(iObjectWrapper), this.f865d);
        }
        ArrayList arrayList = new ArrayList();
        b bVar = b.f1162a;
        int zzd = zzbuVar.zzd();
        int zza = zzbuVar.zza();
        int zzc = zzbuVar.zzc();
        bVar.getClass();
        if (zzc == 0) {
            matrix = null;
        } else {
            matrix = new Matrix();
            matrix.postTranslate((-zzd) / 2.0f, (-zza) / 2.0f);
            matrix.postRotate(zzc * 90);
            int i15 = zzc % 2;
            int i16 = i15 != 0 ? zza : zzd;
            if (i15 == 0) {
                zzd = zza;
            }
            matrix.postTranslate(i16 / 2.0f, zzd / 2.0f);
        }
        for (l lVar : p10.b()) {
            if (lVar.b() > 0 && matrix != null) {
                float[] fArr = new float[8];
                zzel n10 = lVar.n();
                int b9 = lVar.b();
                for (int i17 = i14; i17 < b9; i17++) {
                    int i18 = i17 + i17;
                    fArr[i18] = ((f) n10.get(i17)).a();
                    fArr[i18 + 1] = ((f) n10.get(i17)).b();
                }
                matrix.mapPoints(fArr);
                int zzc2 = zzbuVar.zzc();
                for (int i19 = i14; i19 < b9; i19++) {
                    k kVar = (k) lVar.zzG();
                    int i20 = i19 + i19;
                    e c2 = f.c();
                    c2.a((int) fArr[i20]);
                    c2.b((int) fArr[i20 + 1]);
                    kVar.a((i19 + zzc2) % b9, (f) c2.zzj());
                    lVar = (l) kVar.zzj();
                }
            }
            if (lVar.s()) {
                s g10 = lVar.g();
                zzatVar = new zzat(g10.b() + i13, g10.zzc(), g10.zze(), g10.zzd());
            } else {
                zzatVar = null;
            }
            if (lVar.u()) {
                zzci zzb2 = lVar.zzb();
                zzawVar = new zzaw(zzb2.zzd() + i13, zzb2.zzc());
            } else {
                zzawVar = null;
            }
            if (lVar.v()) {
                g i21 = lVar.i();
                zzaxVar = new zzax(i21.zzc(), i21.zzd());
            } else {
                zzaxVar = null;
            }
            if (lVar.x()) {
                j k3 = lVar.k();
                zzazVar = new zzaz(k3.zzd(), k3.zzc(), k3.b() + i13);
            } else {
                zzazVar = null;
            }
            if (lVar.w()) {
                i j10 = lVar.j();
                zzayVar = new zzay(j10.zzc(), j10.zzd());
            } else {
                zzayVar = null;
            }
            if (lVar.t()) {
                d h9 = lVar.h();
                zzauVar = new zzau(h9.a(), h9.b());
            } else {
                zzauVar = null;
            }
            if (lVar.p()) {
                p d10 = lVar.d();
                zzaqVar = new zzaq(d10.zzj(), d10.zze(), d10.zzf(), d10.zzh(), d10.zzi(), b(d10.b(), lVar.l().zzn() ? lVar.l().zzu() : null, "DTSTART:([0-9TZ]*)"), b(d10.a(), lVar.l().zzn() ? lVar.l().zzu() : null, "DTEND:([0-9TZ]*)"));
            } else {
                zzaqVar = null;
            }
            if (lVar.q()) {
                q e10 = lVar.e();
                zzcd zza2 = e10.zza();
                zzav zzavVar = zza2 != null ? new zzav(zza2.zzd(), zza2.zzi(), zza2.zzh(), zza2.zzc(), zza2.zzf(), zza2.zze(), zza2.zzj()) : null;
                String zzd2 = e10.zzd();
                String zze = e10.zze();
                zzel e11 = e10.e();
                if (e11.isEmpty()) {
                    zzawVarArr = null;
                } else {
                    zzaw[] zzawVarArr2 = new zzaw[e11.size()];
                    for (int i22 = i14; i22 < e11.size(); i22++) {
                        zzawVarArr2[i22] = new zzaw(((zzci) e11.get(i22)).zzd() + i13, ((zzci) e11.get(i22)).zzc());
                    }
                    zzawVarArr = zzawVarArr2;
                }
                zzel d11 = e10.d();
                if (d11.isEmpty()) {
                    zzatVarArr = null;
                } else {
                    zzat[] zzatVarArr2 = new zzat[d11.size()];
                    int i23 = i14;
                    while (i23 < d11.size()) {
                        zzatVarArr2[i23] = new zzat(((s) d11.get(i23)).b() + i13, ((s) d11.get(i23)).zzc(), ((s) d11.get(i23)).zze(), ((s) d11.get(i23)).zzd());
                        i23++;
                        i13 = -1;
                    }
                    zzatVarArr = zzatVarArr2;
                }
                String[] strArr = (String[]) e10.f().toArray(new String[0]);
                zzel c10 = e10.c();
                if (c10.isEmpty()) {
                    i = 0;
                    zzaoVarArr = null;
                } else {
                    zzao[] zzaoVarArr2 = new zzao[c10.size()];
                    for (int i24 = 0; i24 < c10.size(); i24++) {
                        zzaoVarArr2[i24] = new zzao(((zzcb) c10.get(i24)).zzc() - 1, (String[]) ((zzcb) c10.get(i24)).zzb().toArray(new String[0]));
                    }
                    i = 0;
                    zzaoVarArr = zzaoVarArr2;
                }
                zzarVar = new zzar(zzavVar, zzd2, zze, zzawVarArr, zzatVarArr, strArr, zzaoVarArr);
            } else {
                i = i14;
                zzarVar = null;
            }
            if (lVar.r()) {
                r f10 = lVar.f();
                zzasVar = new zzas(f10.zzi(), f10.c(), f10.i(), f10.g(), f10.d(), f10.zze(), f10.zzc(), f10.zzd(), f10.zzf(), f10.h(), f10.e(), f10.zzj(), f10.zzh(), f10.f());
            } else {
                zzasVar = null;
            }
            switch (lVar.y() - 1) {
                case 0:
                    i9 = i;
                    break;
                case 1:
                    i9 = 1;
                    break;
                case 2:
                    i9 = 2;
                    break;
                case 3:
                    i9 = 4;
                    break;
                case 4:
                    i9 = 8;
                    break;
                case 5:
                    i10 = 16;
                    i9 = i10;
                    break;
                case 6:
                    i10 = 32;
                    i9 = i10;
                    break;
                case 7:
                    i10 = 64;
                    i9 = i10;
                    break;
                case 8:
                    i10 = 128;
                    i9 = i10;
                    break;
                case 9:
                    i10 = 256;
                    i9 = i10;
                    break;
                case 10:
                    i10 = 512;
                    i9 = i10;
                    break;
                case 11:
                    i10 = 1024;
                    i9 = i10;
                    break;
                case 12:
                    i10 = 2048;
                    i9 = i10;
                    break;
                case 13:
                    i10 = 4096;
                    i9 = i10;
                    break;
                default:
                    i9 = -1;
                    break;
            }
            String m2 = lVar.m();
            String zzu = lVar.l().zzn() ? lVar.l().zzu() : null;
            byte[] zzx = lVar.l().zzx();
            zzel n11 = lVar.n();
            if (n11.isEmpty()) {
                pointArr = null;
            } else {
                Point[] pointArr2 = new Point[n11.size()];
                for (int i25 = i; i25 < n11.size(); i25++) {
                    pointArr2[i25] = new Point(((f) n11.get(i25)).a(), ((f) n11.get(i25)).b());
                }
                pointArr = pointArr2;
            }
            switch (lVar.a() - 1) {
                case 1:
                    i11 = 1;
                    continue;
                case 2:
                    i11 = 2;
                    continue;
                case 3:
                    i12 = 3;
                    break;
                case 4:
                    i11 = 4;
                    continue;
                case 5:
                    i12 = 5;
                    break;
                case 6:
                    i12 = 6;
                    break;
                case 7:
                    i12 = 7;
                    break;
                case 8:
                    i11 = 8;
                    continue;
                case 9:
                    i12 = 9;
                    break;
                case 10:
                    i12 = 10;
                    break;
                case 11:
                    i12 = 11;
                    break;
                case 12:
                    i12 = 12;
                    break;
                default:
                    i11 = i;
                    continue;
            }
            i11 = i12;
            arrayList.add(new zzba(i9, m2, zzu, zzx, pointArr, i11, zzatVar, zzawVar, zzaxVar, zzazVar, zzayVar, zzauVar, zzaqVar, zzarVar, zzasVar));
            i13 = -1;
            i14 = i;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbl
    public final void zzc() {
        Context context = this.f864c;
        if (this.f866e != null) {
            return;
        }
        this.f866e = new BarhopperV3();
        Z2.f a10 = Z2.g.a();
        Z2.d a11 = Z2.e.a();
        int i = 16;
        int i9 = 0;
        for (int i10 = 0; i10 < 6; i10++) {
            Z2.b a12 = c.a();
            a12.c(i);
            a12.d(i);
            for (int i11 = 0; i11 < f862f[i10]; i11++) {
                double[] dArr = f863g[i9];
                double d10 = dArr[0] * 320.0d;
                float sqrt = (float) Math.sqrt(dArr[1]);
                float f10 = (float) d10;
                a12.a(f10 / sqrt);
                a12.b(f10 * sqrt);
                i9++;
            }
            i += i;
            a11.a(a12);
        }
        a10.a(a11);
        try {
            InputStream open = context.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
            try {
                InputStream open2 = context.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
                try {
                    InputStream open3 = context.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                    try {
                        BarhopperV3 barhopperV3 = (BarhopperV3) Preconditions.checkNotNull(this.f866e);
                        h a13 = Z2.a.a();
                        a10.b(zzdb.zzs(open));
                        a13.a(a10);
                        Z2.i a14 = Z2.j.a();
                        a14.a(zzdb.zzs(open2));
                        a14.b(zzdb.zzs(open3));
                        a13.b(a14);
                        barhopperV3.d(a13.zzj());
                        if (open3 != null) {
                            open3.close();
                        }
                        if (open2 != null) {
                            open2.close();
                        }
                        if (open != null) {
                            open.close();
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e10) {
            throw new IllegalStateException("Failed to open Barcode models", e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbl
    public final void zzd() {
        BarhopperV3 barhopperV3 = this.f866e;
        if (barhopperV3 != null) {
            barhopperV3.close();
            this.f866e = null;
        }
    }
}
