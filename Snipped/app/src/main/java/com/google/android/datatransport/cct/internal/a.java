package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.sumsub.sentry.Device;
import i2.AbstractC0809a;
import i2.C0810b;
import i2.C0811c;
import i2.g;
import i2.h;
import i2.i;

/* compiled from: AutoBatchedLogRequestEncoder.java */
/* loaded from: classes.dex */
public final class a implements Configurator {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8913a = new a();

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: com.google.android.datatransport.cct.internal.a$a, reason: collision with other inner class name */
    public static final class C0101a implements ObjectEncoder<AbstractC0809a> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0101a f8914a = new C0101a();

        /* renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f8915b = FieldDescriptor.of("sdkVersion");

        /* renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f8916c = FieldDescriptor.of("model");

        /* renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f8917d = FieldDescriptor.of("hardware");

        /* renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f8918e = FieldDescriptor.of(Device.f13499a);

        /* renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f8919f = FieldDescriptor.of("product");

        /* renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f8920g = FieldDescriptor.of("osBuild");

        /* renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f8921h = FieldDescriptor.of("manufacturer");
        public static final FieldDescriptor i = FieldDescriptor.of("fingerprint");

        /* renamed from: j, reason: collision with root package name */
        public static final FieldDescriptor f8922j = FieldDescriptor.of("locale");

        /* renamed from: k, reason: collision with root package name */
        public static final FieldDescriptor f8923k = FieldDescriptor.of("country");

        /* renamed from: l, reason: collision with root package name */
        public static final FieldDescriptor f8924l = FieldDescriptor.of("mccMnc");

        /* renamed from: m, reason: collision with root package name */
        public static final FieldDescriptor f8925m = FieldDescriptor.of("applicationBuild");

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            AbstractC0809a abstractC0809a = (AbstractC0809a) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(f8915b, abstractC0809a.l());
            objectEncoderContext2.add(f8916c, abstractC0809a.i());
            objectEncoderContext2.add(f8917d, abstractC0809a.e());
            objectEncoderContext2.add(f8918e, abstractC0809a.c());
            objectEncoderContext2.add(f8919f, abstractC0809a.k());
            objectEncoderContext2.add(f8920g, abstractC0809a.j());
            objectEncoderContext2.add(f8921h, abstractC0809a.g());
            objectEncoderContext2.add(i, abstractC0809a.d());
            objectEncoderContext2.add(f8922j, abstractC0809a.f());
            objectEncoderContext2.add(f8923k, abstractC0809a.b());
            objectEncoderContext2.add(f8924l, abstractC0809a.h());
            objectEncoderContext2.add(f8925m, abstractC0809a.a());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    public static final class b implements ObjectEncoder<g> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f8926a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f8927b = FieldDescriptor.of("logRequest");

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f8927b, ((g) obj).a());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    public static final class c implements ObjectEncoder<ClientInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f8928a = new c();

        /* renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f8929b = FieldDescriptor.of("clientType");

        /* renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f8930c = FieldDescriptor.of("androidClientInfo");

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            ClientInfo clientInfo = (ClientInfo) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(f8929b, clientInfo.b());
            objectEncoderContext2.add(f8930c, clientInfo.a());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    public static final class d implements ObjectEncoder<h> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f8931a = new d();

        /* renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f8932b = FieldDescriptor.of("eventTimeMs");

        /* renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f8933c = FieldDescriptor.of("eventCode");

        /* renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f8934d = FieldDescriptor.of("eventUptimeMs");

        /* renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f8935e = FieldDescriptor.of("sourceExtension");

        /* renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f8936f = FieldDescriptor.of("sourceExtensionJsonProto3");

        /* renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f8937g = FieldDescriptor.of("timezoneOffsetSeconds");

        /* renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f8938h = FieldDescriptor.of("networkConnectionInfo");

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            h hVar = (h) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(f8932b, hVar.b());
            objectEncoderContext2.add(f8933c, hVar.a());
            objectEncoderContext2.add(f8934d, hVar.c());
            objectEncoderContext2.add(f8935e, hVar.e());
            objectEncoderContext2.add(f8936f, hVar.f());
            objectEncoderContext2.add(f8937g, hVar.g());
            objectEncoderContext2.add(f8938h, hVar.d());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    public static final class e implements ObjectEncoder<i> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f8939a = new e();

        /* renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f8940b = FieldDescriptor.of("requestTimeMs");

        /* renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f8941c = FieldDescriptor.of("requestUptimeMs");

        /* renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f8942d = FieldDescriptor.of("clientInfo");

        /* renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f8943e = FieldDescriptor.of("logSource");

        /* renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f8944f = FieldDescriptor.of("logSourceName");

        /* renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f8945g = FieldDescriptor.of("logEvent");

        /* renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f8946h = FieldDescriptor.of("qosTier");

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            i iVar = (i) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(f8940b, iVar.f());
            objectEncoderContext2.add(f8941c, iVar.g());
            objectEncoderContext2.add(f8942d, iVar.a());
            objectEncoderContext2.add(f8943e, iVar.c());
            objectEncoderContext2.add(f8944f, iVar.d());
            objectEncoderContext2.add(f8945g, iVar.b());
            objectEncoderContext2.add(f8946h, iVar.e());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    public static final class f implements ObjectEncoder<NetworkConnectionInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f8947a = new f();

        /* renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f8948b = FieldDescriptor.of("networkType");

        /* renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f8949c = FieldDescriptor.of("mobileSubtype");

        @Override // com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(f8948b, networkConnectionInfo.b());
            objectEncoderContext2.add(f8949c, networkConnectionInfo.a());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public final void configure(EncoderConfig<?> encoderConfig) {
        b bVar = b.f8926a;
        encoderConfig.registerEncoder(g.class, bVar);
        encoderConfig.registerEncoder(C0811c.class, bVar);
        e eVar = e.f8939a;
        encoderConfig.registerEncoder(i.class, eVar);
        encoderConfig.registerEncoder(i2.e.class, eVar);
        c cVar = c.f8928a;
        encoderConfig.registerEncoder(ClientInfo.class, cVar);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.b.class, cVar);
        C0101a c0101a = C0101a.f8914a;
        encoderConfig.registerEncoder(AbstractC0809a.class, c0101a);
        encoderConfig.registerEncoder(C0810b.class, c0101a);
        d dVar = d.f8931a;
        encoderConfig.registerEncoder(h.class, dVar);
        encoderConfig.registerEncoder(i2.d.class, dVar);
        f fVar = f.f8947a;
        encoderConfig.registerEncoder(NetworkConnectionInfo.class, fVar);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.c.class, fVar);
    }
}
