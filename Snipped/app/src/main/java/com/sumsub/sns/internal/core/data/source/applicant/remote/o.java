package com.sumsub.sns.internal.core.data.source.applicant.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.C1190z;
import ra.InterfaceC1162A;

@InterfaceC1080d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002\u0013\u0016B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0015R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u0015R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\"\u0012\u0004\b)\u0010%\u001a\u0004\b(\u0010\u0015¨\u0006+"}, d2 = {"Lcom/sumsub/sns/internal/core/data/source/applicant/remote/o;", "", "", "lat", "lon", "accuracy", "<init>", "(FFF)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(IFFFLra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/source/applicant/remote/o;Lqa/c;Lpa/f;)V", "()F", "b", "c", "(FFF)Lcom/sumsub/sns/internal/core/data/source/applicant/remote/o;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "f", "getLat$annotations", "()V", "h", "getLon$annotations", "d", "getAccuracy$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class o {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float lat;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float lon;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float accuracy;

    public static final class a implements InterfaceC1162A<o> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16044a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f16045b;

        static {
            a aVar = new a();
            f16044a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.core.data.source.applicant.remote.Location", aVar, 3);
            pluginGeneratedSerialDescriptor.k("lat", false);
            pluginGeneratedSerialDescriptor.k("lon", false);
            pluginGeneratedSerialDescriptor.k("accuracy", false);
            f16045b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            int i = 0;
            float f10 = 0.0f;
            float f11 = 0.0f;
            float f12 = 0.0f;
            boolean z10 = true;
            while (z10) {
                int q10 = c2.q(descriptor);
                if (q10 == -1) {
                    z10 = false;
                } else if (q10 == 0) {
                    f10 = c2.j(descriptor, 0);
                    i |= 1;
                } else if (q10 == 1) {
                    f11 = c2.j(descriptor, 1);
                    i |= 2;
                } else {
                    if (q10 != 2) {
                        throw new UnknownFieldException(q10);
                    }
                    f12 = c2.j(descriptor, 2);
                    i |= 4;
                }
            }
            c2.b(descriptor);
            return new o(i, f10, f11, f12, null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            C1190z c1190z = C1190z.f26457a;
            return new InterfaceC1078b[]{c1190z, c1190z, c1190z};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f16045b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, o oVar) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            o.a(oVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.source.applicant.remote.o$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<o> serializer() {
            return a.f16044a;
        }

        public Companion() {
        }
    }

    public o(float f10, float f11, float f12) {
        this.lat = f10;
        this.lon = f11;
        this.accuracy = f12;
    }

    /* renamed from: a, reason: from getter */
    public final float getLat() {
        return this.lat;
    }

    /* renamed from: b, reason: from getter */
    public final float getLon() {
        return this.lon;
    }

    /* renamed from: c, reason: from getter */
    public final float getAccuracy() {
        return this.accuracy;
    }

    public final float d() {
        return this.accuracy;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof o)) {
            return false;
        }
        o oVar = (o) other;
        return kotlin.jvm.internal.f.b(Float.valueOf(this.lat), Float.valueOf(oVar.lat)) && kotlin.jvm.internal.f.b(Float.valueOf(this.lon), Float.valueOf(oVar.lon)) && kotlin.jvm.internal.f.b(Float.valueOf(this.accuracy), Float.valueOf(oVar.accuracy));
    }

    public final float f() {
        return this.lat;
    }

    public final float h() {
        return this.lon;
    }

    public int hashCode() {
        return Float.hashCode(this.accuracy) + C.v.a(Float.hashCode(this.lat) * 31, this.lon, 31);
    }

    public String toString() {
        return "Location(lat=" + this.lat + ", lon=" + this.lon + ", accuracy=" + this.accuracy + ')';
    }

    public final o a(float lat, float lon, float accuracy) {
        return new o(lat, lon, accuracy);
    }

    public static /* synthetic */ o a(o oVar, float f10, float f11, float f12, int i, Object obj) {
        if ((i & 1) != 0) {
            f10 = oVar.lat;
        }
        if ((i & 2) != 0) {
            f11 = oVar.lon;
        }
        if ((i & 4) != 0) {
            f12 = oVar.accuracy;
        }
        return oVar.a(f10, f11, f12);
    }

    public static final void a(o self, InterfaceC1143c output, pa.f serialDesc) {
        output.n(serialDesc, 0, self.lat);
        output.n(serialDesc, 1, self.lon);
        output.n(serialDesc, 2, self.accuracy);
    }

    public /* synthetic */ o(int i, float f10, float f11, float f12, ra.i0 i0Var) {
        if (7 != (i & 7)) {
            ra.a0.h(i, 7, a.f16044a.getDescriptor());
            throw null;
        }
        this.lat = f10;
        this.lon = f11;
        this.accuracy = f12;
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void i() {
    }
}
