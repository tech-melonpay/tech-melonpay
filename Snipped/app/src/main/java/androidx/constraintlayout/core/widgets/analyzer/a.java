package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import java.util.Iterator;

/* compiled from: DimensionDependency.java */
/* loaded from: classes.dex */
public class a extends DependencyNode {

    /* renamed from: m, reason: collision with root package name */
    public int f6103m;

    public a(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof c) {
            this.f6076e = DependencyNode.Type.f6084b;
        } else {
            this.f6076e = DependencyNode.Type.f6085c;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.DependencyNode
    public final void d(int i) {
        if (this.f6080j) {
            return;
        }
        this.f6080j = true;
        this.f6078g = i;
        Iterator it = this.f6081k.iterator();
        while (it.hasNext()) {
            d0.d dVar = (d0.d) it.next();
            dVar.a(dVar);
        }
    }
}
