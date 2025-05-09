package androidx.recyclerview.widget;

import a0.C0506b;
import androidx.recyclerview.widget.E;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.ArrayList;

/* compiled from: AdapterHelper.java */
/* renamed from: androidx.recyclerview.widget.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0563a implements E.a {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0082a f7605d;

    /* renamed from: a, reason: collision with root package name */
    public final C0506b f7602a = new C0506b(30);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f7603b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<b> f7604c = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    public int f7607f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final E f7606e = new E(this);

    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    public interface InterfaceC0082a {
    }

    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f7608a;

        /* renamed from: b, reason: collision with root package name */
        public int f7609b;

        /* renamed from: c, reason: collision with root package name */
        public Object f7610c;

        /* renamed from: d, reason: collision with root package name */
        public int f7611d;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.f7608a;
            if (i != bVar.f7608a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f7611d - this.f7609b) == 1 && this.f7611d == bVar.f7609b && this.f7609b == bVar.f7611d) {
                return true;
            }
            if (this.f7611d != bVar.f7611d || this.f7609b != bVar.f7609b) {
                return false;
            }
            Object obj2 = this.f7610c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f7610c)) {
                    return false;
                }
            } else if (bVar.f7610c != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f7608a * 31) + this.f7609b) * 31) + this.f7611d;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append("[");
            int i = this.f7608a;
            sb2.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : ProductAction.ACTION_ADD);
            sb2.append(",s:");
            sb2.append(this.f7609b);
            sb2.append("c:");
            sb2.append(this.f7611d);
            sb2.append(",p:");
            sb2.append(this.f7610c);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public C0563a(RecyclerView.f fVar) {
        this.f7605d = fVar;
    }

    public final boolean a(int i) {
        ArrayList<b> arrayList = this.f7604c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            b bVar = arrayList.get(i9);
            int i10 = bVar.f7608a;
            if (i10 == 8) {
                if (f(bVar.f7611d, i9 + 1) == i) {
                    return true;
                }
            } else if (i10 == 1) {
                int i11 = bVar.f7609b;
                int i12 = bVar.f7611d + i11;
                while (i11 < i12) {
                    if (f(i11, i9 + 1) == i) {
                        return true;
                    }
                    i11++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList<b> arrayList = this.f7604c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((RecyclerView.f) this.f7605d).a(arrayList.get(i));
        }
        l(arrayList);
        this.f7607f = 0;
    }

    public final void c() {
        b();
        ArrayList<b> arrayList = this.f7603b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b bVar = arrayList.get(i);
            int i9 = bVar.f7608a;
            InterfaceC0082a interfaceC0082a = this.f7605d;
            if (i9 == 1) {
                RecyclerView.f fVar = (RecyclerView.f) interfaceC0082a;
                fVar.a(bVar);
                int i10 = bVar.f7609b;
                int i11 = bVar.f7611d;
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.offsetPositionRecordsForInsert(i10, i11);
                recyclerView.mItemsAddedOrRemoved = true;
            } else if (i9 == 2) {
                RecyclerView.f fVar2 = (RecyclerView.f) interfaceC0082a;
                fVar2.a(bVar);
                int i12 = bVar.f7609b;
                int i13 = bVar.f7611d;
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.offsetPositionRecordsForRemove(i12, i13, true);
                recyclerView2.mItemsAddedOrRemoved = true;
                recyclerView2.mState.f7540c += i13;
            } else if (i9 == 4) {
                RecyclerView.f fVar3 = (RecyclerView.f) interfaceC0082a;
                fVar3.a(bVar);
                int i14 = bVar.f7609b;
                int i15 = bVar.f7611d;
                Object obj = bVar.f7610c;
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.viewRangeUpdate(i14, i15, obj);
                recyclerView3.mItemsChanged = true;
            } else if (i9 == 8) {
                RecyclerView.f fVar4 = (RecyclerView.f) interfaceC0082a;
                fVar4.a(bVar);
                int i16 = bVar.f7609b;
                int i17 = bVar.f7611d;
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.offsetPositionRecordsForMove(i16, i17);
                recyclerView4.mItemsAddedOrRemoved = true;
            }
        }
        l(arrayList);
        this.f7607f = 0;
    }

    public final void d(b bVar) {
        int i;
        int i9 = bVar.f7608a;
        if (i9 == 1 || i9 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m2 = m(bVar.f7609b, i9);
        int i10 = bVar.f7609b;
        int i11 = bVar.f7608a;
        if (i11 == 2) {
            i = 0;
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i = 1;
        }
        int i12 = 1;
        for (int i13 = 1; i13 < bVar.f7611d; i13++) {
            int m9 = m((i * i13) + bVar.f7609b, bVar.f7608a);
            int i14 = bVar.f7608a;
            if (i14 == 2 ? m9 != m2 : !(i14 == 4 && m9 == m2 + 1)) {
                b h9 = h(i14, m2, i12, bVar.f7610c);
                e(h9, i10);
                h9.f7610c = null;
                this.f7602a.release(h9);
                if (bVar.f7608a == 4) {
                    i10 += i12;
                }
                i12 = 1;
                m2 = m9;
            } else {
                i12++;
            }
        }
        Object obj = bVar.f7610c;
        bVar.f7610c = null;
        this.f7602a.release(bVar);
        if (i12 > 0) {
            b h10 = h(bVar.f7608a, m2, i12, obj);
            e(h10, i10);
            h10.f7610c = null;
            this.f7602a.release(h10);
        }
    }

    public final void e(b bVar, int i) {
        RecyclerView.f fVar = (RecyclerView.f) this.f7605d;
        fVar.a(bVar);
        int i9 = bVar.f7608a;
        if (i9 == 2) {
            int i10 = bVar.f7611d;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForRemove(i, i10, true);
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f7540c += i10;
            return;
        }
        if (i9 != 4) {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i11 = bVar.f7611d;
        Object obj = bVar.f7610c;
        RecyclerView recyclerView2 = RecyclerView.this;
        recyclerView2.viewRangeUpdate(i, i11, obj);
        recyclerView2.mItemsChanged = true;
    }

    public final int f(int i, int i9) {
        ArrayList<b> arrayList = this.f7604c;
        int size = arrayList.size();
        while (i9 < size) {
            b bVar = arrayList.get(i9);
            int i10 = bVar.f7608a;
            if (i10 == 8) {
                int i11 = bVar.f7609b;
                if (i11 == i) {
                    i = bVar.f7611d;
                } else {
                    if (i11 < i) {
                        i--;
                    }
                    if (bVar.f7611d <= i) {
                        i++;
                    }
                }
            } else {
                int i12 = bVar.f7609b;
                if (i12 > i) {
                    continue;
                } else if (i10 == 2) {
                    int i13 = bVar.f7611d;
                    if (i < i12 + i13) {
                        return -1;
                    }
                    i -= i13;
                } else if (i10 == 1) {
                    i += bVar.f7611d;
                }
            }
            i9++;
        }
        return i;
    }

    public final boolean g() {
        return this.f7603b.size() > 0;
    }

    public final b h(int i, int i9, int i10, Object obj) {
        b bVar = (b) this.f7602a.acquire();
        if (bVar != null) {
            bVar.f7608a = i;
            bVar.f7609b = i9;
            bVar.f7611d = i10;
            bVar.f7610c = obj;
            return bVar;
        }
        b bVar2 = new b();
        bVar2.f7608a = i;
        bVar2.f7609b = i9;
        bVar2.f7611d = i10;
        bVar2.f7610c = obj;
        return bVar2;
    }

    public final void i(b bVar) {
        this.f7604c.add(bVar);
        int i = bVar.f7608a;
        InterfaceC0082a interfaceC0082a = this.f7605d;
        if (i == 1) {
            int i9 = bVar.f7609b;
            int i10 = bVar.f7611d;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForInsert(i9, i10);
            recyclerView.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 2) {
            int i11 = bVar.f7609b;
            int i12 = bVar.f7611d;
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.offsetPositionRecordsForRemove(i11, i12, false);
            recyclerView2.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 4) {
            int i13 = bVar.f7609b;
            int i14 = bVar.f7611d;
            Object obj = bVar.f7610c;
            RecyclerView recyclerView3 = RecyclerView.this;
            recyclerView3.viewRangeUpdate(i13, i14, obj);
            recyclerView3.mItemsChanged = true;
            return;
        }
        if (i != 8) {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
        int i15 = bVar.f7609b;
        int i16 = bVar.f7611d;
        RecyclerView recyclerView4 = RecyclerView.this;
        recyclerView4.offsetPositionRecordsForMove(i15, i16);
        recyclerView4.mItemsAddedOrRemoved = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0124 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0563a.j():void");
    }

    public final void k(b bVar) {
        bVar.f7610c = null;
        this.f7602a.release(bVar);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            k((b) arrayList.get(i));
        }
        arrayList.clear();
    }

    public final int m(int i, int i9) {
        int i10;
        int i11;
        ArrayList<b> arrayList = this.f7604c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b bVar = arrayList.get(size);
            int i12 = bVar.f7608a;
            if (i12 == 8) {
                int i13 = bVar.f7609b;
                int i14 = bVar.f7611d;
                if (i13 < i14) {
                    i11 = i13;
                    i10 = i14;
                } else {
                    i10 = i13;
                    i11 = i14;
                }
                if (i < i11 || i > i10) {
                    if (i < i13) {
                        if (i9 == 1) {
                            bVar.f7609b = i13 + 1;
                            bVar.f7611d = i14 + 1;
                        } else if (i9 == 2) {
                            bVar.f7609b = i13 - 1;
                            bVar.f7611d = i14 - 1;
                        }
                    }
                } else if (i11 == i13) {
                    if (i9 == 1) {
                        bVar.f7611d = i14 + 1;
                    } else if (i9 == 2) {
                        bVar.f7611d = i14 - 1;
                    }
                    i++;
                } else {
                    if (i9 == 1) {
                        bVar.f7609b = i13 + 1;
                    } else if (i9 == 2) {
                        bVar.f7609b = i13 - 1;
                    }
                    i--;
                }
            } else {
                int i15 = bVar.f7609b;
                if (i15 <= i) {
                    if (i12 == 1) {
                        i -= bVar.f7611d;
                    } else if (i12 == 2) {
                        i += bVar.f7611d;
                    }
                } else if (i9 == 1) {
                    bVar.f7609b = i15 + 1;
                } else if (i9 == 2) {
                    bVar.f7609b = i15 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            b bVar2 = arrayList.get(size2);
            if (bVar2.f7608a == 8) {
                int i16 = bVar2.f7611d;
                if (i16 == bVar2.f7609b || i16 < 0) {
                    arrayList.remove(size2);
                    k(bVar2);
                }
            } else if (bVar2.f7611d <= 0) {
                arrayList.remove(size2);
                k(bVar2);
            }
        }
        return i;
    }
}
