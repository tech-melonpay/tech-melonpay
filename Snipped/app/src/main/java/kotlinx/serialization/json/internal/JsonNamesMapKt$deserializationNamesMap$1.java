package kotlinx.serialization.json.internal;

import ca.InterfaceC0635a;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import pa.f;
import pa.g;
import sa.AbstractC1244a;
import sa.n;

/* compiled from: JsonNamesMap.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class JsonNamesMapKt$deserializationNamesMap$1 extends Lambda implements InterfaceC0635a<Map<String, ? extends Integer>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f23385l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC1244a f23386m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonNamesMapKt$deserializationNamesMap$1(f fVar, AbstractC1244a abstractC1244a) {
        super(0);
        this.f23385l = fVar;
        this.f23386m = abstractC1244a;
    }

    @Override // ca.InterfaceC0635a
    public final Map<String, ? extends Integer> invoke() {
        String[] names;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC1244a abstractC1244a = this.f23386m;
        boolean z10 = abstractC1244a.f27065a.f27100m;
        f fVar = this.f23385l;
        boolean z11 = z10 && kotlin.jvm.internal.f.b(fVar.e(), g.b.f25740a);
        b.d(fVar, abstractC1244a);
        int f10 = fVar.f();
        for (int i = 0; i < f10; i++) {
            List<Annotation> h9 = fVar.h(i);
            ArrayList arrayList = new ArrayList();
            for (Object obj : h9) {
                if (obj instanceof n) {
                    arrayList.add(obj);
                }
            }
            n nVar = (n) (arrayList.size() == 1 ? arrayList.get(0) : null);
            if (nVar != null && (names = nVar.names()) != null) {
                for (String str : names) {
                    if (z11) {
                        str = str.toLowerCase(Locale.ROOT);
                    }
                    b.a(linkedHashMap, fVar, str, i);
                }
            }
            String lowerCase = z11 ? fVar.g(i).toLowerCase(Locale.ROOT) : null;
            if (lowerCase != null) {
                b.a(linkedHashMap, fVar, lowerCase, i);
            }
        }
        return linkedHashMap.isEmpty() ? kotlin.collections.a.p() : linkedHashMap;
    }
}
