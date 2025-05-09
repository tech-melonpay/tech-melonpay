package e;

import f.AbstractC0728a;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: ActivityResultRegistry.kt */
/* renamed from: e.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0706e extends AbstractC0704c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.result.a f20493b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20494c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0728a f20495d;

    public /* synthetic */ C0706e(androidx.activity.result.a aVar, String str, AbstractC0728a abstractC0728a, int i) {
        this.f20492a = i;
        this.f20493b = aVar;
        this.f20494c = str;
        this.f20495d = abstractC0728a;
    }

    @Override // e.AbstractC0704c
    public final void a(Object obj) {
        switch (this.f20492a) {
            case 0:
                androidx.activity.result.a aVar = this.f20493b;
                LinkedHashMap linkedHashMap = aVar.f4583b;
                String str = this.f20494c;
                Object obj2 = linkedHashMap.get(str);
                AbstractC0728a abstractC0728a = this.f20495d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC0728a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int intValue = ((Number) obj2).intValue();
                ArrayList arrayList = aVar.f4585d;
                arrayList.add(str);
                try {
                    aVar.b(intValue, abstractC0728a, obj);
                    return;
                } catch (Exception e10) {
                    arrayList.remove(str);
                    throw e10;
                }
            default:
                androidx.activity.result.a aVar2 = this.f20493b;
                LinkedHashMap linkedHashMap2 = aVar2.f4583b;
                String str2 = this.f20494c;
                Object obj3 = linkedHashMap2.get(str2);
                AbstractC0728a abstractC0728a2 = this.f20495d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC0728a2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int intValue2 = ((Number) obj3).intValue();
                ArrayList arrayList2 = aVar2.f4585d;
                arrayList2.add(str2);
                try {
                    aVar2.b(intValue2, abstractC0728a2, obj);
                    return;
                } catch (Exception e11) {
                    arrayList2.remove(str2);
                    throw e11;
                }
        }
    }

    @Override // e.AbstractC0704c
    public final void b() {
        switch (this.f20492a) {
            case 0:
                this.f20493b.f(this.f20494c);
                break;
            default:
                this.f20493b.f(this.f20494c);
                break;
        }
    }
}
