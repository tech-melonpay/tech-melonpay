package u0;

import java.util.ArrayList;
import u0.C1505i;
import x0.InterfaceC1579a;

/* compiled from: FontRequestWorker.java */
/* renamed from: u0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1504h implements InterfaceC1579a<C1505i.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f30107a;

    public C1504h(String str) {
        this.f30107a = str;
    }

    @Override // x0.InterfaceC1579a
    public final void accept(C1505i.a aVar) {
        C1505i.a aVar2 = aVar;
        synchronized (C1505i.f30110c) {
            try {
                androidx.collection.g<String, ArrayList<InterfaceC1579a<C1505i.a>>> gVar = C1505i.f30111d;
                ArrayList<InterfaceC1579a<C1505i.a>> arrayList = gVar.get(this.f30107a);
                if (arrayList == null) {
                    return;
                }
                gVar.remove(this.f30107a);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).accept(aVar2);
                }
            } finally {
            }
        }
    }
}
