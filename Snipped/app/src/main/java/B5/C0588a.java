package b5;

import ca.InterfaceC0650p;
import com.google.gson.Strictness;
import com.google.gson.g;
import com.google.gson.i;
import com.google.gson.l;
import com.google.gson.reflect.TypeToken;
import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import kotlin.coroutines.d;
import kotlin.jvm.internal.h;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;
import kotlinx.coroutines.flow.internal.SafeCollector;
import n3.n;
import n3.p;
import n3.q;
import qb.f;
import qb.r;
import x4.C1589a;
import y4.InterfaceC1613a;
import z4.InterfaceC1644a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: b5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0588a implements InterfaceC0650p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8339a;

    public /* synthetic */ C0588a(int i) {
        this.f8339a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0650p
    public final Object invoke(Object obj, Object obj2) {
        boolean hasCopyableElements$lambda$0;
        kotlin.coroutines.d foldCopies$lambda$2;
        Object _get_keys_$lambda$0;
        Map.Entry _get_entries_$lambda$1;
        int collectContextSize$lambda$0;
        switch (this.f8339a) {
            case 0:
                return new rb.a((g) ((org.koin.core.scope.a) obj).a(null, null, h.a(g.class)));
            case 1:
                org.koin.core.scope.a aVar = (org.koin.core.scope.a) obj;
                r.b bVar = new r.b();
                bVar.b("https://api8d9t8.luminaryinc.com/luminaryapi/");
                bVar.f26079b = (va.h) aVar.a(null, new hb.a("proxy"), h.a(va.h.class));
                bVar.a((f.a) aVar.a(null, null, h.a(f.a.class)));
                return bVar.c();
            case 2:
                return (InterfaceC1644a) ((r) ((org.koin.core.scope.a) obj).a(null, new hb.a("proxy"), h.a(r.class))).b(InterfaceC1644a.class);
            case 3:
                return (J4.a) ((r) ((org.koin.core.scope.a) obj).a(null, new hb.a("proxy"), h.a(r.class))).b(J4.a.class);
            case 4:
                return (E4.a) ((r) ((org.koin.core.scope.a) obj).a(null, new hb.a("proxy"), h.a(r.class))).b(E4.a.class);
            case 5:
                return (I4.a) ((r) ((org.koin.core.scope.a) obj).a(null, new hb.a("proxy"), h.a(r.class))).b(I4.a.class);
            case 6:
                com.google.gson.h hVar = new com.google.gson.h();
                hVar.f10371p = Strictness.f10313a;
                C1589a c1589a = new C1589a();
                if (l.class.isAssignableFrom(Date.class)) {
                    throw new IllegalArgumentException("Cannot override built-in adapter for " + Date.class);
                }
                if (c1589a instanceof i) {
                    hVar.f10360d.put(Date.class, (i) c1589a);
                }
                ArrayList arrayList = hVar.f10361e;
                TypeToken<?> typeToken = TypeToken.get((Type) Date.class);
                arrayList.add(new n.b(c1589a, typeToken, typeToken.getType() == typeToken.getRawType()));
                if (c1589a instanceof com.google.gson.r) {
                    q qVar = p.f24177a;
                    arrayList.add(new q(TypeToken.get((Type) Date.class), (com.google.gson.r) c1589a, 0));
                }
                return hVar.a();
            case 7:
                return (InterfaceC1613a) ((r) ((org.koin.core.scope.a) obj).a(null, new hb.a("proxy"), h.a(r.class))).b(InterfaceC1613a.class);
            case 8:
                return (A4.a) ((r) ((org.koin.core.scope.a) obj).a(null, new hb.a("proxy"), h.a(r.class))).b(A4.a.class);
            case 9:
                return (F4.a) ((r) ((org.koin.core.scope.a) obj).a(null, new hb.a("proxy"), h.a(r.class))).b(F4.a.class);
            case 10:
                return (G4.a) ((r) ((org.koin.core.scope.a) obj).a(null, new hb.a("proxy"), h.a(r.class))).b(G4.a.class);
            case 11:
                return (H4.a) ((r) ((org.koin.core.scope.a) obj).a(null, new hb.a("proxy"), h.a(r.class))).b(H4.a.class);
            case 12:
                return (B4.a) ((r) ((org.koin.core.scope.a) obj).a(null, new hb.a("proxy"), h.a(r.class))).b(B4.a.class);
            case 13:
                return (C4.a) ((r) ((org.koin.core.scope.a) obj).a(null, new hb.a("proxy"), h.a(r.class))).b(C4.a.class);
            case 14:
                return (D4.a) ((r) ((org.koin.core.scope.a) obj).a(null, new hb.a("proxy"), h.a(r.class))).b(D4.a.class);
            case 15:
                CorporateDetailsDomain.StatusIdentification statusIdentification = (CorporateDetailsDomain.StatusIdentification) obj;
                Integer valueOf = statusIdentification != null ? Integer.valueOf(kotlin.jvm.internal.f.c(statusIdentification.ordinal(), ((CorporateDetailsDomain.StatusIdentification) obj2).ordinal())) : null;
                valueOf.intValue();
                return valueOf;
            case 16:
                hasCopyableElements$lambda$0 = CoroutineContextKt.hasCopyableElements$lambda$0(((Boolean) obj).booleanValue(), (d.b) obj2);
                return Boolean.valueOf(hasCopyableElements$lambda$0);
            case 17:
                foldCopies$lambda$2 = CoroutineContextKt.foldCopies$lambda$2((kotlin.coroutines.d) obj, (d.b) obj2);
                return foldCopies$lambda$2;
            case 18:
                _get_keys_$lambda$0 = ConcurrentWeakMap._get_keys_$lambda$0(obj, obj2);
                return _get_keys_$lambda$0;
            case 19:
                _get_entries_$lambda$1 = ConcurrentWeakMap._get_entries_$lambda$1(obj, obj2);
                return _get_entries_$lambda$1;
            default:
                collectContextSize$lambda$0 = SafeCollector.collectContextSize$lambda$0(((Integer) obj).intValue(), (d.b) obj2);
                return Integer.valueOf(collectContextSize$lambda$0);
        }
    }
}
