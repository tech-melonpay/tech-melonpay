package kotlinx.serialization.json;

import O9.f;
import ca.InterfaceC0635a;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import sa.o;

/* compiled from: JsonElement.kt */
@InterfaceC1080d(with = o.class)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlinx/serialization/json/JsonNull;", "Lkotlinx/serialization/json/JsonPrimitive;", "<init>", "()V", "Lna/b;", "serializer", "()Lna/b;", "", FirebaseAnalytics.Param.CONTENT, "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "", "isString", "()Z", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class JsonNull extends JsonPrimitive {
    public static final JsonNull INSTANCE = new JsonNull();
    private static final String content = "null";
    private static final /* synthetic */ f<InterfaceC1078b<Object>> $cachedSerializer$delegate = a.b(LazyThreadSafetyMode.f23086b, new InterfaceC0635a<InterfaceC1078b<Object>>() { // from class: kotlinx.serialization.json.JsonNull.1
        @Override // ca.InterfaceC0635a
        public final InterfaceC1078b<Object> invoke() {
            return o.f27110a;
        }
    });

    private JsonNull() {
        super(null);
    }

    private final /* synthetic */ InterfaceC1078b get$cachedSerializer() {
        return $cachedSerializer$delegate.getValue();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String getContent() {
        return content;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public boolean isString() {
        return false;
    }

    public final InterfaceC1078b<JsonNull> serializer() {
        return get$cachedSerializer();
    }
}
