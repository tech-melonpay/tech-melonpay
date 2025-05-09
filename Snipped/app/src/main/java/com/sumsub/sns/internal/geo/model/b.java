package com.sumsub.sns.internal.geo.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import pa.f;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.C1185u;
import ra.C1190z;
import ra.InterfaceC1162A;
import ra.a0;
import ra.i0;

@InterfaceC1080d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 !2\u00020\u0001:\u0002\u0014\u001bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001c\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u001e\u0012\u0004\b \u0010\u001a\u001a\u0004\b\u0014\u0010\u001f¨\u0006\""}, d2 = {"Lcom/sumsub/sns/internal/geo/model/b;", "", "", "latitude", "longitude", "", "accuracy", "<init>", "(DDF)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(IDDFLra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/geo/model/b;Lqa/c;Lpa/f;)V", "D", "c", "()D", "getLatitude$annotations", "()V", "b", "e", "getLongitude$annotations", "F", "()F", "getAccuracy$annotations", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final double latitude;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final double longitude;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float accuracy;

    public static final class a implements InterfaceC1162A<b> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f17399a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ f f17400b;

        static {
            a aVar = new a();
            f17399a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.internal.geo.model.Location", aVar, 3);
            pluginGeneratedSerialDescriptor.k("lat", false);
            pluginGeneratedSerialDescriptor.k("lon", false);
            pluginGeneratedSerialDescriptor.k("accuracy", false);
            f17400b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b deserialize(InterfaceC1144d interfaceC1144d) {
            f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            int i = 0;
            double d10 = 0.0d;
            double d11 = 0.0d;
            float f10 = 0.0f;
            boolean z10 = true;
            while (z10) {
                int q10 = c2.q(descriptor);
                if (q10 == -1) {
                    z10 = false;
                } else if (q10 == 0) {
                    d10 = c2.s(descriptor, 0);
                    i |= 1;
                } else if (q10 == 1) {
                    d11 = c2.s(descriptor, 1);
                    i |= 2;
                } else {
                    if (q10 != 2) {
                        throw new UnknownFieldException(q10);
                    }
                    f10 = c2.j(descriptor, 2);
                    i |= 4;
                }
            }
            c2.b(descriptor);
            return new b(i, d10, d11, f10, null);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            C1185u c1185u = C1185u.f26437a;
            return new InterfaceC1078b[]{c1185u, c1185u, C1190z.f26457a};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public f getDescriptor() {
            return f17400b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, b bVar) {
            f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            b.a(bVar, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sns.internal.geo.model.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<b> serializer() {
            return a.f17399a;
        }

        public Companion() {
        }
    }

    public b(double d10, double d11, float f10) {
        this.latitude = d10;
        this.longitude = d11;
        this.accuracy = f10;
    }

    public static final void a(b self, InterfaceC1143c output, f serialDesc) {
        output.j(serialDesc, 0, self.latitude);
        output.j(serialDesc, 1, self.longitude);
        output.n(serialDesc, 2, self.accuracy);
    }

    /* renamed from: c, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: e, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* renamed from: a, reason: from getter */
    public final float getAccuracy() {
        return this.accuracy;
    }

    public /* synthetic */ b(int i, double d10, double d11, float f10, i0 i0Var) {
        if (7 != (i & 7)) {
            a0.h(i, 7, a.f17399a.getDescriptor());
            throw null;
        }
        this.latitude = d10;
        this.longitude = d11;
        this.accuracy = f10;
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void f() {
    }
}
