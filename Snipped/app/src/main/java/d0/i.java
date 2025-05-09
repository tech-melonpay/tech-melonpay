package d0;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;

/* compiled from: RunGroup.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public WidgetRun f20394a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<WidgetRun> f20395b;

    public static long a(DependencyNode dependencyNode, long j10) {
        WidgetRun widgetRun = dependencyNode.f6075d;
        if (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.b) {
            return j10;
        }
        ArrayList arrayList = dependencyNode.f6081k;
        int size = arrayList.size();
        long j11 = j10;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.f6075d != widgetRun) {
                    j11 = Math.min(j11, a(dependencyNode2, dependencyNode2.f6077f + j10));
                }
            }
        }
        if (dependencyNode != widgetRun.i) {
            return j11;
        }
        long j12 = widgetRun.j();
        long j13 = j10 - j12;
        return Math.min(Math.min(j11, a(widgetRun.f6098h, j13)), j13 - r9.f6077f);
    }

    public static long b(DependencyNode dependencyNode, long j10) {
        WidgetRun widgetRun = dependencyNode.f6075d;
        if (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.b) {
            return j10;
        }
        ArrayList arrayList = dependencyNode.f6081k;
        int size = arrayList.size();
        long j11 = j10;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.f6075d != widgetRun) {
                    j11 = Math.max(j11, b(dependencyNode2, dependencyNode2.f6077f + j10));
                }
            }
        }
        if (dependencyNode != widgetRun.f6098h) {
            return j11;
        }
        long j12 = widgetRun.j();
        long j13 = j10 + j12;
        return Math.max(Math.max(j11, b(widgetRun.i, j13)), j13 - r9.f6077f);
    }
}
