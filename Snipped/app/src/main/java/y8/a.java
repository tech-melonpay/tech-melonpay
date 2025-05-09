package Y8;

import U8.t;
import ia.InterfaceC0835c;
import java.io.IOException;
import java.util.List;
import na.InterfaceC1077a;
import na.InterfaceC1078b;
import na.InterfaceC1081e;
import r3.C1149a;
import ta.q;

/* compiled from: AppendableUtils.java */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C1149a.C0464a f4121a;

    public static void a(t tVar, char c2) {
        try {
            tVar.append(c2);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public abstract void b(q qVar);

    public abstract InterfaceC1078b c(InterfaceC0835c interfaceC0835c, List list);

    public abstract InterfaceC1077a d(InterfaceC0835c interfaceC0835c, String str);

    public abstract InterfaceC1081e e(InterfaceC0835c interfaceC0835c, Object obj);
}
