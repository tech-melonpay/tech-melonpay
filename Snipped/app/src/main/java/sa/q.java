package sa;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.b;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;
import na.InterfaceC1078b;
import pa.C1124b;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.C1163B;
import ra.K;
import ra.m0;

/* compiled from: JsonElementSerializers.kt */
/* loaded from: classes2.dex */
public final class q implements InterfaceC1078b<JsonObject> {

    /* renamed from: a, reason: collision with root package name */
    public static final q f27113a = new q();

    /* renamed from: b, reason: collision with root package name */
    public static final a f27114b = a.f27115b;

    /* compiled from: JsonElementSerializers.kt */
    public static final class a implements pa.f {

        /* renamed from: b, reason: collision with root package name */
        public static final a f27115b = new a();

        /* renamed from: c, reason: collision with root package name */
        public static final String f27116c = "kotlinx.serialization.json.JsonObject";

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1163B f27117a;

        public a() {
            m0 m0Var = m0.f26414a;
            this.f27117a = new C1163B("kotlin.collections.LinkedHashMap", m0.f26415b, JsonElementSerializer.f23368a.getDescriptor());
        }

        @Override // pa.f
        public final String a() {
            return f27116c;
        }

        @Override // pa.f
        public final boolean c() {
            this.f27117a.getClass();
            return false;
        }

        @Override // pa.f
        public final int d(String str) {
            return this.f27117a.d(str);
        }

        @Override // pa.f
        public final pa.g e() {
            this.f27117a.getClass();
            return b.c.f23311a;
        }

        @Override // pa.f
        public final int f() {
            return this.f27117a.f26369d;
        }

        @Override // pa.f
        public final String g(int i) {
            this.f27117a.getClass();
            return String.valueOf(i);
        }

        @Override // pa.f
        public final List<Annotation> getAnnotations() {
            this.f27117a.getClass();
            return EmptyList.f23104a;
        }

        @Override // pa.f
        public final List<Annotation> h(int i) {
            return this.f27117a.h(i);
        }

        @Override // pa.f
        public final pa.f i(int i) {
            return this.f27117a.i(i);
        }

        @Override // pa.f
        public final boolean isInline() {
            this.f27117a.getClass();
            return false;
        }

        @Override // pa.f
        public final boolean j(int i) {
            this.f27117a.j(i);
            return false;
        }
    }

    @Override // na.InterfaceC1077a
    public final Object deserialize(InterfaceC1144d interfaceC1144d) {
        C1124b.i(interfaceC1144d);
        return new JsonObject((Map) new K(m0.f26414a, JsonElementSerializer.f23368a).e(interfaceC1144d));
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return f27114b;
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
        C1124b.h(interfaceC1145e);
        new K(m0.f26414a, JsonElementSerializer.f23368a).serialize(interfaceC1145e, (JsonObject) obj);
    }
}
