package androidx.constraintlayout.core.widgets.analyzer;

import com.sumsub.sns.internal.core.data.model.p;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class DependencyNode implements d0.d {

    /* renamed from: d, reason: collision with root package name */
    public final WidgetRun f6075d;

    /* renamed from: f, reason: collision with root package name */
    public int f6077f;

    /* renamed from: g, reason: collision with root package name */
    public int f6078g;

    /* renamed from: a, reason: collision with root package name */
    public WidgetRun f6072a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6073b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6074c = false;

    /* renamed from: e, reason: collision with root package name */
    public Type f6076e = Type.f6083a;

    /* renamed from: h, reason: collision with root package name */
    public int f6079h = 1;
    public a i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6080j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f6081k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f6082l = new ArrayList();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {

        /* renamed from: a, reason: collision with root package name */
        public static final Type f6083a;

        /* renamed from: b, reason: collision with root package name */
        public static final Type f6084b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f6085c;

        /* renamed from: d, reason: collision with root package name */
        public static final Type f6086d;

        /* renamed from: e, reason: collision with root package name */
        public static final Type f6087e;

        /* renamed from: f, reason: collision with root package name */
        public static final Type f6088f;

        /* renamed from: g, reason: collision with root package name */
        public static final Type f6089g;

        /* renamed from: h, reason: collision with root package name */
        public static final Type f6090h;
        public static final /* synthetic */ Type[] i;

        static {
            Type type = new Type("UNKNOWN", 0);
            f6083a = type;
            Type type2 = new Type("HORIZONTAL_DIMENSION", 1);
            f6084b = type2;
            Type type3 = new Type("VERTICAL_DIMENSION", 2);
            f6085c = type3;
            Type type4 = new Type("LEFT", 3);
            f6086d = type4;
            Type type5 = new Type("RIGHT", 4);
            f6087e = type5;
            Type type6 = new Type("TOP", 5);
            f6088f = type6;
            Type type7 = new Type("BOTTOM", 6);
            f6089g = type7;
            Type type8 = new Type("BASELINE", 7);
            f6090h = type8;
            i = new Type[]{type, type2, type3, type4, type5, type6, type7, type8};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) i.clone();
        }
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.f6075d = widgetRun;
    }

    @Override // d0.d
    public final void a(d0.d dVar) {
        ArrayList arrayList = this.f6082l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((DependencyNode) it.next()).f6080j) {
                return;
            }
        }
        this.f6074c = true;
        WidgetRun widgetRun = this.f6072a;
        if (widgetRun != null) {
            widgetRun.a(this);
        }
        if (this.f6073b) {
            this.f6075d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        DependencyNode dependencyNode = null;
        int i = 0;
        while (it2.hasNext()) {
            DependencyNode dependencyNode2 = (DependencyNode) it2.next();
            if (!(dependencyNode2 instanceof a)) {
                i++;
                dependencyNode = dependencyNode2;
            }
        }
        if (dependencyNode != null && i == 1 && dependencyNode.f6080j) {
            a aVar = this.i;
            if (aVar != null) {
                if (!aVar.f6080j) {
                    return;
                } else {
                    this.f6077f = this.f6079h * aVar.f6078g;
                }
            }
            d(dependencyNode.f6078g + this.f6077f);
        }
        WidgetRun widgetRun2 = this.f6072a;
        if (widgetRun2 != null) {
            widgetRun2.a(this);
        }
    }

    public final void b(d0.d dVar) {
        this.f6081k.add(dVar);
        if (this.f6080j) {
            dVar.a(dVar);
        }
    }

    public final void c() {
        this.f6082l.clear();
        this.f6081k.clear();
        this.f6080j = false;
        this.f6078g = 0;
        this.f6074c = false;
        this.f6073b = false;
    }

    public void d(int i) {
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

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f6075d.f6092b.f6040k0);
        sb2.append(p.f15541a);
        sb2.append(this.f6076e);
        sb2.append("(");
        sb2.append(this.f6080j ? Integer.valueOf(this.f6078g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f6082l.size());
        sb2.append(":d=");
        sb2.append(this.f6081k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
