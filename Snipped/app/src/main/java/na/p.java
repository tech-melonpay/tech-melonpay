package Na;

import Qa.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* compiled from: StaggeredDelimiterProcessor.java */
/* loaded from: classes3.dex */
public final class p implements Ta.a {

    /* renamed from: a, reason: collision with root package name */
    public final char f2945a;

    /* renamed from: b, reason: collision with root package name */
    public int f2946b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedList<Ta.a> f2947c = new LinkedList<>();

    public p(char c2) {
        this.f2945a = c2;
    }

    @Override // Ta.a
    public final int a(f fVar, f fVar2) {
        Ta.a first;
        int i = fVar.f2881g;
        LinkedList<Ta.a> linkedList = this.f2947c;
        Iterator<Ta.a> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                first = linkedList.getFirst();
                break;
            }
            first = it.next();
            if (first.d() <= i) {
                break;
            }
        }
        return first.a(fVar, fVar2);
    }

    @Override // Ta.a
    public final void b(w wVar, w wVar2, int i) {
        Ta.a first;
        LinkedList<Ta.a> linkedList = this.f2947c;
        Iterator<Ta.a> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                first = linkedList.getFirst();
                break;
            } else {
                first = it.next();
                if (first.d() <= i) {
                    break;
                }
            }
        }
        first.b(wVar, wVar2, i);
    }

    @Override // Ta.a
    public final char c() {
        return this.f2945a;
    }

    @Override // Ta.a
    public final int d() {
        return this.f2946b;
    }

    @Override // Ta.a
    public final char e() {
        return this.f2945a;
    }

    public final void f(Ta.a aVar) {
        int d10 = aVar.d();
        LinkedList<Ta.a> linkedList = this.f2947c;
        ListIterator<Ta.a> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int d11 = listIterator.next().d();
            if (d10 > d11) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (d10 == d11) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f2945a + "' and minimum length " + d10);
            }
        }
        linkedList.add(aVar);
        this.f2946b = d10;
    }
}
