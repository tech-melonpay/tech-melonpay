package C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import pa.C1124b;

/* compiled from: QualitySelector.java */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final List<o> f573a;

    /* renamed from: b, reason: collision with root package name */
    public final C0493i f574b;

    public r(List list, C0487c c0487c) {
        C1124b.m((list.isEmpty() && c0487c == C0493i.f557a) ? false : true, "No preferred quality and fallback strategy.");
        this.f573a = Collections.unmodifiableList(new ArrayList(list));
        this.f574b = c0487c;
    }

    public static r a(List list, C0487c c0487c) {
        C1124b.p(list, "qualities cannot be null");
        C1124b.m(!list.isEmpty(), "qualities cannot be empty");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            C1124b.m(o.f567h.contains(oVar), "qualities contain invalid quality: " + oVar);
        }
        return new r(list, c0487c);
    }

    public final String toString() {
        return "QualitySelector{preferredQualities=" + this.f573a + ", fallbackStrategy=" + this.f574b + "}";
    }
}
