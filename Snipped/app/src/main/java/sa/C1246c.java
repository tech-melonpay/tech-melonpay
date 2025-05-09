package sa;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.b;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import na.InterfaceC1078b;
import pa.C1124b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.C1168c;
import ra.C1169d;

/* compiled from: JsonElementSerializers.kt */
/* renamed from: sa.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1246c implements InterfaceC1078b<JsonArray> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1246c f27069a = new C1246c();

    /* renamed from: b, reason: collision with root package name */
    public static final a f27070b = a.f27071b;

    /* compiled from: JsonElementSerializers.kt */
    /* renamed from: sa.c$a */
    public static final class a implements pa.f {

        /* renamed from: b, reason: collision with root package name */
        public static final a f27071b = new a();

        /* renamed from: c, reason: collision with root package name */
        public static final String f27072c = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1168c f27073a = new C1168c(JsonElementSerializer.f23368a.getDescriptor(), 1);

        @Override // pa.f
        public final String a() {
            return f27072c;
        }

        @Override // pa.f
        public final boolean c() {
            this.f27073a.getClass();
            return false;
        }

        @Override // pa.f
        public final int d(String str) {
            return this.f27073a.d(str);
        }

        @Override // pa.f
        public final pa.g e() {
            this.f27073a.getClass();
            return b.C0424b.f23310a;
        }

        @Override // pa.f
        public final int f() {
            return this.f27073a.f26360b;
        }

        @Override // pa.f
        public final String g(int i) {
            this.f27073a.getClass();
            return String.valueOf(i);
        }

        @Override // pa.f
        public final List<Annotation> getAnnotations() {
            this.f27073a.getClass();
            return EmptyList.f23104a;
        }

        @Override // pa.f
        public final List<Annotation> h(int i) {
            return this.f27073a.h(i);
        }

        @Override // pa.f
        public final pa.f i(int i) {
            return this.f27073a.i(i);
        }

        @Override // pa.f
        public final boolean isInline() {
            this.f27073a.getClass();
            return false;
        }

        @Override // pa.f
        public final boolean j(int i) {
            this.f27073a.j(i);
            return false;
        }
    }

    @Override // na.InterfaceC1077a
    public final Object deserialize(InterfaceC1144d interfaceC1144d) {
        C1124b.i(interfaceC1144d);
        return new JsonArray((List) new C1169d(JsonElementSerializer.f23368a, 0).e(interfaceC1144d));
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return f27070b;
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
        JsonArray jsonArray = (JsonArray) obj;
        C1124b.h(interfaceC1145e);
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.f23368a;
        C1168c c1168c = new C1168c(jsonElementSerializer.getDescriptor(), 1);
        int size = jsonArray.size();
        InterfaceC1143c u6 = interfaceC1145e.u(c1168c);
        Iterator<JsonElement> it = jsonArray.iterator();
        for (int i = 0; i < size; i++) {
            u6.C(c1168c, i, jsonElementSerializer, it.next());
        }
        u6.b(c1168c);
    }
}
