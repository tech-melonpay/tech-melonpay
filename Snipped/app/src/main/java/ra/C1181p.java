package ra;

import na.InterfaceC1078b;
import pa.e;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* compiled from: Primitives.kt */
/* renamed from: ra.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1181p implements InterfaceC1078b<Character> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1181p f26422a = new C1181p();

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f26423b = new e0("kotlin.Char", e.c.f25732a);

    @Override // na.InterfaceC1077a
    public final Object deserialize(InterfaceC1144d interfaceC1144d) {
        return Character.valueOf(interfaceC1144d.f());
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return f26423b;
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
        interfaceC1145e.q(((Character) obj).charValue());
    }
}
