package sa;

import ka.C0967l;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.JsonDecodingException;
import ra.C1165D;
import ra.a0;
import ra.m0;
import ta.u;
import ta.v;

/* compiled from: JsonElement.kt */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final C1165D f27103a = a0.a("kotlinx.serialization.json.JsonUnquotedLiteral", m0.f26414a);

    public static final JsonPrimitive a(Number number) {
        return number == null ? JsonNull.INSTANCE : new l(number, false, null);
    }

    public static final JsonPrimitive b(String str) {
        return str == null ? JsonNull.INSTANCE : new l(str, true, null);
    }

    public static final Boolean c(JsonPrimitive jsonPrimitive) {
        String content = jsonPrimitive.getContent();
        String[] strArr = v.f30030a;
        if (C0967l.U(content, "true", true)) {
            return Boolean.TRUE;
        }
        if (C0967l.U(content, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final int d(JsonPrimitive jsonPrimitive) {
        try {
            long h9 = new u(jsonPrimitive.getContent()).h();
            if (-2147483648L <= h9 && h9 <= 2147483647L) {
                return (int) h9;
            }
            throw new NumberFormatException(jsonPrimitive.getContent() + " is not an Int");
        } catch (JsonDecodingException e10) {
            throw new NumberFormatException(e10.getMessage());
        }
    }
}
