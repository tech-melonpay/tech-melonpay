package s1;

import B1.p;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkInfo$State;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.HashSet;
import java.util.UUID;

/* compiled from: OneTimeWorkRequest.java */
/* renamed from: s1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1198h extends AbstractC1201k {
    public static C1198h a() {
        HashSet hashSet = new HashSet();
        UUID randomUUID = UUID.randomUUID();
        p pVar = new p(randomUUID.toString(), DiagnosticsWorker.class.getName());
        hashSet.add(DiagnosticsWorker.class.getName());
        pVar.f246d = OverwritingInputMerger.class.getName();
        C1198h c1198h = new C1198h();
        c1198h.f26517a = randomUUID;
        c1198h.f26518b = pVar;
        c1198h.f26519c = hashSet;
        C1192b c1192b = pVar.f251j;
        boolean z10 = c1192b.f26504h.f26505a.size() > 0 || c1192b.f26500d || c1192b.f26498b || c1192b.f26499c;
        if (pVar.f258q) {
            if (z10) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (pVar.f249g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        UUID randomUUID2 = UUID.randomUUID();
        p pVar2 = new p();
        pVar2.f244b = WorkInfo$State.f8102a;
        androidx.work.b bVar = androidx.work.b.f8127c;
        pVar2.f247e = bVar;
        pVar2.f248f = bVar;
        pVar2.f251j = C1192b.i;
        pVar2.f253l = BackoffPolicy.f8067a;
        pVar2.f254m = 30000L;
        pVar2.f257p = -1L;
        pVar2.f259r = OutOfQuotaPolicy.f8099a;
        pVar2.f243a = pVar.f243a;
        pVar2.f245c = pVar.f245c;
        pVar2.f244b = pVar.f244b;
        pVar2.f246d = pVar.f246d;
        pVar2.f247e = new androidx.work.b(pVar.f247e);
        pVar2.f248f = new androidx.work.b(pVar.f248f);
        pVar2.f249g = pVar.f249g;
        pVar2.f250h = pVar.f250h;
        pVar2.i = pVar.i;
        C1192b c1192b2 = pVar.f251j;
        C1192b c1192b3 = new C1192b();
        c1192b3.f26497a = NetworkType.f8092a;
        c1192b3.f26502f = -1L;
        c1192b3.f26503g = -1L;
        c1192b3.f26504h = new C1193c();
        c1192b3.f26498b = c1192b2.f26498b;
        c1192b3.f26499c = c1192b2.f26499c;
        c1192b3.f26497a = c1192b2.f26497a;
        c1192b3.f26500d = c1192b2.f26500d;
        c1192b3.f26501e = c1192b2.f26501e;
        c1192b3.f26504h = c1192b2.f26504h;
        pVar2.f251j = c1192b3;
        pVar2.f252k = pVar.f252k;
        pVar2.f253l = pVar.f253l;
        pVar2.f254m = pVar.f254m;
        pVar2.f255n = pVar.f255n;
        pVar2.f256o = pVar.f256o;
        pVar2.f257p = pVar.f257p;
        pVar2.f258q = pVar.f258q;
        pVar2.f259r = pVar.f259r;
        pVar2.f243a = randomUUID2.toString();
        return c1198h;
    }
}
