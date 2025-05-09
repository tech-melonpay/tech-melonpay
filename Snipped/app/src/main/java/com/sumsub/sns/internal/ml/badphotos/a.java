package com.sumsub.sns.internal.ml.badphotos;

import android.content.Context;
import android.graphics.Bitmap;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.ml.core.a;
import com.sumsub.sns.internal.ml.core.e;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import va.h;

/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.internal.ml.core.b<Bitmap, com.sumsub.sns.internal.ml.badphotos.models.a> {

    /* renamed from: p, reason: collision with root package name */
    public static final b f17608p = new b(null);

    /* renamed from: r, reason: collision with root package name */
    public static final C0271a f17609r = new C0271a();

    /* renamed from: h, reason: collision with root package name */
    public final Context f17610h;
    public final h i;

    /* renamed from: j, reason: collision with root package name */
    public final String f17611j;

    /* renamed from: k, reason: collision with root package name */
    public final long f17612k;

    /* renamed from: l, reason: collision with root package name */
    public final String f17613l;

    /* renamed from: m, reason: collision with root package name */
    public final float[][][][] f17614m;

    /* renamed from: n, reason: collision with root package name */
    public final com.sumsub.sns.internal.ml.core.a f17615n;

    /* renamed from: o, reason: collision with root package name */
    public final String f17616o;

    /* renamed from: com.sumsub.sns.internal.ml.badphotos.a$a, reason: collision with other inner class name */
    public static final class C0271a implements e<Bitmap, com.sumsub.sns.internal.ml.badphotos.models.a> {
        @Override // com.sumsub.sns.internal.ml.core.e
        public Object a(Bitmap bitmap, T9.a<? super e.a<com.sumsub.sns.internal.ml.badphotos.models.a>> aVar) {
            return new e.a.c();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e<Bitmap, com.sumsub.sns.internal.ml.badphotos.models.a> a(Context context, h hVar, String str, boolean z10, DocumentType documentType) {
            e<Bitmap, com.sumsub.sns.internal.ml.badphotos.models.a> eVar;
            try {
                c a10 = c.f17617h.a();
                if (z10 && a10.i().contains(documentType.c())) {
                    eVar = new a(context, hVar, str + "resources/embeddedModels/" + a10.n(), a10.j(), a10.n(), a10.h());
                } else {
                    eVar = a.f17609r;
                }
                return eVar;
            } catch (Throwable th) {
                com.sumsub.sns.internal.log.b.b(com.sumsub.sns.internal.log.a.f17535a, "MlSolution.BadPhotosDetector", "Can't create instance. Using dummy detector.", th);
                return a.f17609r;
            }
        }

        public b() {
        }
    }

    public a(Context context, h hVar, String str, long j10, String str2, boolean z10) {
        super("MlSolution.BadPhotosDetector");
        this.f17610h = context;
        this.i = hVar;
        this.f17611j = str;
        this.f17612k = j10;
        this.f17613l = str2;
        this.f17614m = new float[][][][]{new float[][][]{new float[][]{new float[]{0.0f}}, new float[][]{new float[]{0.0f}}}};
        this.f17615n = new a.b(context, hVar, str, z10, "MlSolution.BadPhotosDetector");
        this.f17616o = "Unsatisfactory photos detector";
    }

    @Override // com.sumsub.sns.internal.ml.core.b
    public long c() {
        return this.f17612k;
    }

    @Override // com.sumsub.sns.internal.ml.core.b
    public com.sumsub.sns.internal.ml.core.a e() {
        return this.f17615n;
    }

    @Override // com.sumsub.sns.internal.ml.core.b
    public Map<Integer, Object> g() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.f17614m);
        return hashMap;
    }

    @Override // com.sumsub.sns.internal.ml.core.b
    public String h() {
        return this.f17616o;
    }

    @Override // com.sumsub.sns.internal.ml.core.b
    public Object[] a(Bitmap bitmap) {
        return new Object[]{((com.sumsub.sns.internal.ml.core.buffer.a) new com.sumsub.sns.internal.ml.core.pipeline.core.a(new com.sumsub.sns.internal.ml.core.pipeline.c(512, 512, true, false)).a((com.sumsub.sns.internal.ml.core.pipeline.core.b) new com.sumsub.sns.internal.ml.core.pipeline.a()).a((com.sumsub.sns.internal.ml.core.pipeline.core.b) new com.sumsub.sns.internal.ml.badphotos.pipeline.a(this.f17610h)).a((com.sumsub.sns.internal.ml.core.pipeline.core.a) bitmap)).a()};
    }

    @Override // com.sumsub.sns.internal.ml.core.b
    public com.sumsub.sns.internal.ml.badphotos.models.a a(Bitmap bitmap, long j10) {
        return new com.sumsub.sns.internal.ml.badphotos.models.a(this.f17613l, this.f17614m[0][0][0][0], j10);
    }
}
