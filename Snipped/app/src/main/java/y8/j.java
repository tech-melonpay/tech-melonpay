package Y8;

import Y8.e;
import Y8.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: MarkwonHtmlRendererImpl.java */
/* loaded from: classes2.dex */
public final class j extends Ha.c {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, l> f4152a;

    /* compiled from: MarkwonHtmlRendererImpl.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f4153a = new HashMap(2);

        /* renamed from: b, reason: collision with root package name */
        public boolean f4154b;

        public final void a(l lVar) {
            for (String str : lVar.b()) {
                HashMap hashMap = this.f4153a;
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, lVar);
                }
            }
        }
    }

    public j(Map map) {
        this.f4152a = map;
    }

    @Override // Ha.c
    public final void K(U8.l lVar, h hVar) {
        l L7;
        l L8;
        ArrayList arrayList = hVar.f4146c;
        if (arrayList.size() > 0) {
            for (e.b bVar : Collections.unmodifiableList(arrayList)) {
                if (bVar.isClosed() && (L8 = L(bVar.name())) != null) {
                    L8.a(lVar, this, bVar);
                }
            }
            arrayList.clear();
        } else {
            for (e.b bVar2 : Collections.emptyList()) {
                if (bVar2.isClosed() && (L7 = L(bVar2.name())) != null) {
                    L7.a(lVar, this, bVar2);
                }
            }
        }
        i iVar = new i(this, lVar);
        f.a aVar = hVar.f4147d;
        while (true) {
            f.a aVar2 = aVar.f4140e;
            if (aVar2 == null) {
                break;
            } else {
                aVar = aVar2;
            }
        }
        List<e.a> e10 = aVar.e();
        if (e10.size() > 0) {
            iVar.a(e10);
        } else {
            iVar.a(Collections.emptyList());
        }
        hVar.f4147d = new f.a("", 0, Collections.emptyMap(), null);
        hVar.f4146c.clear();
        hVar.f4147d = new f.a("", 0, Collections.emptyMap(), null);
    }

    @Override // Ha.c
    public final l L(String str) {
        return this.f4152a.get(str);
    }
}
