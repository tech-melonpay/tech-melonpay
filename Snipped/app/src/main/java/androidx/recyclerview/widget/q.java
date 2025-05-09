package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: DiffUtil.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7697a = new a();

    /* compiled from: DiffUtil.java */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            return cVar.f7698a - cVar2.f7698a;
        }
    }

    /* compiled from: DiffUtil.java */
    public static abstract class b {
        public abstract boolean areContentsTheSame(int i, int i9);

        public abstract boolean areItemsTheSame(int i, int i9);

        public Object getChangePayload(int i, int i9) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* compiled from: DiffUtil.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f7698a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7699b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7700c;

        public c(int i, int i9, int i10) {
            this.f7698a = i;
            this.f7699b = i9;
            this.f7700c = i10;
        }
    }

    /* compiled from: DiffUtil.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final List<c> f7701a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f7702b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f7703c;

        /* renamed from: d, reason: collision with root package name */
        public final b f7704d;

        /* renamed from: e, reason: collision with root package name */
        public final int f7705e;

        /* renamed from: f, reason: collision with root package name */
        public final int f7706f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f7707g;

        public d(b bVar, ArrayList arrayList, int[] iArr, int[] iArr2) {
            int[] iArr3;
            int[] iArr4;
            b bVar2;
            int i;
            c cVar;
            int i9;
            this.f7701a = arrayList;
            this.f7702b = iArr;
            this.f7703c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f7704d = bVar;
            int oldListSize = bVar.getOldListSize();
            this.f7705e = oldListSize;
            int newListSize = bVar.getNewListSize();
            this.f7706f = newListSize;
            this.f7707g = true;
            c cVar2 = arrayList.isEmpty() ? null : (c) arrayList.get(0);
            if (cVar2 == null || cVar2.f7698a != 0 || cVar2.f7699b != 0) {
                arrayList.add(0, new c(0, 0, 0));
            }
            arrayList.add(new c(oldListSize, newListSize, 0));
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                iArr3 = this.f7703c;
                iArr4 = this.f7702b;
                bVar2 = this.f7704d;
                if (!hasNext) {
                    break;
                }
                c cVar3 = (c) it.next();
                for (int i10 = 0; i10 < cVar3.f7700c; i10++) {
                    int i11 = cVar3.f7698a + i10;
                    int i12 = cVar3.f7699b + i10;
                    int i13 = bVar2.areContentsTheSame(i11, i12) ? 1 : 2;
                    iArr4[i11] = (i12 << 4) | i13;
                    iArr3[i12] = (i11 << 4) | i13;
                }
            }
            if (this.f7707g) {
                Iterator it2 = arrayList.iterator();
                int i14 = 0;
                while (it2.hasNext()) {
                    c cVar4 = (c) it2.next();
                    while (true) {
                        i = cVar4.f7698a;
                        if (i14 < i) {
                            if (iArr4[i14] == 0) {
                                int size = arrayList.size();
                                int i15 = 0;
                                int i16 = 0;
                                while (true) {
                                    if (i15 < size) {
                                        cVar = (c) arrayList.get(i15);
                                        while (true) {
                                            i9 = cVar.f7699b;
                                            if (i16 < i9) {
                                                if (iArr3[i16] == 0 && bVar2.areItemsTheSame(i14, i16)) {
                                                    int i17 = bVar2.areContentsTheSame(i14, i16) ? 8 : 4;
                                                    iArr4[i14] = (i16 << 4) | i17;
                                                    iArr3[i16] = i17 | (i14 << 4);
                                                } else {
                                                    i16++;
                                                }
                                            }
                                        }
                                    }
                                    i16 = cVar.f7700c + i9;
                                    i15++;
                                }
                            }
                            i14++;
                        }
                    }
                    i14 = cVar4.f7700c + i;
                }
            }
        }

        public static f b(ArrayDeque arrayDeque, int i, boolean z10) {
            f fVar;
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                fVar = (f) it.next();
                if (fVar.f7708a == i && fVar.f7710c == z10) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                if (z10) {
                    fVar2.f7709b--;
                } else {
                    fVar2.f7709b++;
                }
            }
            return fVar;
        }

        public final void a(D d10) {
            int[] iArr;
            b bVar;
            int i;
            int i9;
            List<c> list;
            int i10;
            d dVar = this;
            C0568f c0568f = d10 instanceof C0568f ? (C0568f) d10 : new C0568f(d10);
            ArrayDeque arrayDeque = new ArrayDeque();
            List<c> list2 = dVar.f7701a;
            int size = list2.size() - 1;
            int i11 = dVar.f7705e;
            int i12 = dVar.f7706f;
            int i13 = i11;
            while (size >= 0) {
                c cVar = list2.get(size);
                int i14 = cVar.f7698a;
                int i15 = cVar.f7700c;
                int i16 = i14 + i15;
                int i17 = cVar.f7699b;
                int i18 = i17 + i15;
                while (true) {
                    iArr = dVar.f7702b;
                    bVar = dVar.f7704d;
                    i = 0;
                    if (i13 <= i16) {
                        break;
                    }
                    i13--;
                    int i19 = iArr[i13];
                    if ((i19 & 12) != 0) {
                        list = list2;
                        int i20 = i19 >> 4;
                        f b9 = b(arrayDeque, i20, false);
                        if (b9 != null) {
                            i10 = i12;
                            int i21 = (i11 - b9.f7709b) - 1;
                            c0568f.onMoved(i13, i21);
                            if ((i19 & 4) != 0) {
                                c0568f.onChanged(i21, 1, bVar.getChangePayload(i13, i20));
                            }
                        } else {
                            i10 = i12;
                            arrayDeque.add(new f(i13, (i11 - i13) - 1, true));
                        }
                    } else {
                        list = list2;
                        i10 = i12;
                        c0568f.onRemoved(i13, 1);
                        i11--;
                    }
                    list2 = list;
                    i12 = i10;
                }
                List<c> list3 = list2;
                while (i12 > i18) {
                    i12--;
                    int i22 = dVar.f7703c[i12];
                    if ((i22 & 12) != 0) {
                        int i23 = i22 >> 4;
                        f b10 = b(arrayDeque, i23, true);
                        if (b10 == null) {
                            arrayDeque.add(new f(i12, i11 - i13, false));
                            i9 = 0;
                        } else {
                            i9 = 0;
                            c0568f.onMoved((i11 - b10.f7709b) - 1, i13);
                            if ((i22 & 4) != 0) {
                                c0568f.onChanged(i13, 1, bVar.getChangePayload(i23, i12));
                            }
                        }
                    } else {
                        i9 = i;
                        c0568f.onInserted(i13, 1);
                        i11++;
                    }
                    dVar = this;
                    i = i9;
                }
                i13 = cVar.f7698a;
                int i24 = i13;
                int i25 = i17;
                while (i < i15) {
                    if ((iArr[i24] & 15) == 2) {
                        c0568f.onChanged(i24, 1, bVar.getChangePayload(i24, i25));
                    }
                    i24++;
                    i25++;
                    i++;
                }
                size--;
                dVar = this;
                i12 = i17;
                list2 = list3;
            }
            c0568f.a();
        }
    }

    /* compiled from: DiffUtil.java */
    public static abstract class e<T> {
        public abstract boolean areContentsTheSame(T t3, T t10);

        public abstract boolean areItemsTheSame(T t3, T t10);

        public Object getChangePayload(T t3, T t10) {
            return null;
        }
    }

    /* compiled from: DiffUtil.java */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f7708a;

        /* renamed from: b, reason: collision with root package name */
        public int f7709b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f7710c;

        public f(int i, int i9, boolean z10) {
            this.f7708a = i;
            this.f7709b = i9;
            this.f7710c = z10;
        }
    }

    /* compiled from: DiffUtil.java */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public int f7711a;

        /* renamed from: b, reason: collision with root package name */
        public int f7712b;

        /* renamed from: c, reason: collision with root package name */
        public int f7713c;

        /* renamed from: d, reason: collision with root package name */
        public int f7714d;

        public final int a() {
            return this.f7714d - this.f7713c;
        }

        public final int b() {
            return this.f7712b - this.f7711a;
        }
    }

    /* compiled from: DiffUtil.java */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public int f7715a;

        /* renamed from: b, reason: collision with root package name */
        public int f7716b;

        /* renamed from: c, reason: collision with root package name */
        public int f7717c;

        /* renamed from: d, reason: collision with root package name */
        public int f7718d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f7719e;

        public final int a() {
            return Math.min(this.f7717c - this.f7715a, this.f7718d - this.f7716b);
        }
    }

    public static d a(b bVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        g gVar;
        h hVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i;
        g gVar2;
        g gVar3;
        int i9;
        int i10;
        h hVar2;
        h hVar3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int oldListSize = bVar.getOldListSize();
        int newListSize = bVar.getNewListSize();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        g gVar4 = new g();
        int i17 = 0;
        gVar4.f7711a = 0;
        gVar4.f7712b = oldListSize;
        gVar4.f7713c = 0;
        gVar4.f7714d = newListSize;
        arrayList6.add(gVar4);
        int i18 = oldListSize + newListSize;
        int i19 = 1;
        int i20 = (((i18 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i20];
        int i21 = i20 / 2;
        int[] iArr2 = new int[i20];
        ArrayList arrayList7 = new ArrayList();
        while (!arrayList6.isEmpty()) {
            g gVar5 = (g) arrayList6.remove(arrayList6.size() - i19);
            if (gVar5.b() >= i19 && gVar5.a() >= i19) {
                int a10 = ((gVar5.a() + gVar5.b()) + i19) / 2;
                int i22 = i19 + i21;
                iArr[i22] = gVar5.f7711a;
                iArr2[i22] = gVar5.f7712b;
                int i23 = i17;
                while (i23 < a10) {
                    int i24 = Math.abs(gVar5.b() - gVar5.a()) % 2 == i19 ? i19 : i17;
                    int b9 = gVar5.b() - gVar5.a();
                    int i25 = -i23;
                    int i26 = i25;
                    while (true) {
                        if (i26 > i23) {
                            arrayList = arrayList6;
                            i9 = i17;
                            arrayList2 = arrayList7;
                            i10 = a10;
                            hVar2 = null;
                            break;
                        }
                        if (i26 == i25 || (i26 != i23 && iArr[i26 + 1 + i21] > iArr[(i26 - 1) + i21])) {
                            i14 = iArr[i26 + 1 + i21];
                            i15 = i14;
                        } else {
                            i14 = iArr[(i26 - 1) + i21];
                            i15 = i14 + 1;
                        }
                        i10 = a10;
                        arrayList = arrayList6;
                        int i27 = ((i15 - gVar5.f7711a) + gVar5.f7713c) - i26;
                        int i28 = (i23 == 0 || i15 != i14) ? i27 : i27 - 1;
                        arrayList2 = arrayList7;
                        while (i15 < gVar5.f7712b && i27 < gVar5.f7714d && bVar.areItemsTheSame(i15, i27)) {
                            i15++;
                            i27++;
                        }
                        iArr[i26 + i21] = i15;
                        if (i24 != 0) {
                            int i29 = b9 - i26;
                            i16 = i24;
                            if (i29 >= i25 + 1 && i29 <= i23 - 1 && iArr2[i29 + i21] <= i15) {
                                hVar2 = new h();
                                hVar2.f7715a = i14;
                                hVar2.f7716b = i28;
                                hVar2.f7717c = i15;
                                hVar2.f7718d = i27;
                                i9 = 0;
                                hVar2.f7719e = false;
                                break;
                            }
                        } else {
                            i16 = i24;
                        }
                        i26 += 2;
                        i17 = 0;
                        a10 = i10;
                        arrayList6 = arrayList;
                        arrayList7 = arrayList2;
                        i24 = i16;
                    }
                    if (hVar2 != null) {
                        hVar = hVar2;
                        gVar = gVar5;
                        break;
                    }
                    int i30 = (gVar5.b() - gVar5.a()) % 2 == 0 ? 1 : i9;
                    int b10 = gVar5.b() - gVar5.a();
                    int i31 = i25;
                    while (true) {
                        if (i31 > i23) {
                            gVar = gVar5;
                            hVar3 = null;
                            break;
                        }
                        if (i31 == i25 || (i31 != i23 && iArr2[i31 + 1 + i21] < iArr2[(i31 - 1) + i21])) {
                            i11 = iArr2[i31 + 1 + i21];
                            i12 = i11;
                        } else {
                            i11 = iArr2[(i31 - 1) + i21];
                            i12 = i11 - 1;
                        }
                        int i32 = gVar5.f7714d - ((gVar5.f7712b - i12) - i31);
                        int i33 = (i23 == 0 || i12 != i11) ? i32 : i32 + 1;
                        while (i12 > gVar5.f7711a && i32 > gVar5.f7713c) {
                            gVar = gVar5;
                            if (!bVar.areItemsTheSame(i12 - 1, i32 - 1)) {
                                break;
                            }
                            i12--;
                            i32--;
                            gVar5 = gVar;
                        }
                        gVar = gVar5;
                        iArr2[i31 + i21] = i12;
                        if (i30 != 0 && (i13 = b10 - i31) >= i25 && i13 <= i23 && iArr[i13 + i21] >= i12) {
                            hVar3 = new h();
                            hVar3.f7715a = i12;
                            hVar3.f7716b = i32;
                            hVar3.f7717c = i11;
                            hVar3.f7718d = i33;
                            hVar3.f7719e = true;
                            break;
                        }
                        i31 += 2;
                        gVar5 = gVar;
                    }
                    if (hVar3 != null) {
                        hVar = hVar3;
                        break;
                    }
                    i23++;
                    a10 = i10;
                    arrayList6 = arrayList;
                    arrayList7 = arrayList2;
                    gVar5 = gVar;
                    i19 = 1;
                    i17 = 0;
                }
            }
            arrayList = arrayList6;
            arrayList2 = arrayList7;
            gVar = gVar5;
            hVar = null;
            if (hVar != null) {
                if (hVar.a() > 0) {
                    int i34 = hVar.f7718d;
                    int i35 = hVar.f7716b;
                    int i36 = i34 - i35;
                    int i37 = hVar.f7717c;
                    int i38 = hVar.f7715a;
                    int i39 = i37 - i38;
                    arrayList5.add(i36 != i39 ? hVar.f7719e ? new c(i38, i35, hVar.a()) : i36 > i39 ? new c(i38, i35 + 1, hVar.a()) : new c(i38 + 1, i35, hVar.a()) : new c(i38, i35, i39));
                }
                if (arrayList2.isEmpty()) {
                    gVar2 = new g();
                    arrayList4 = arrayList2;
                    gVar3 = gVar;
                    i = 1;
                } else {
                    i = 1;
                    arrayList4 = arrayList2;
                    gVar2 = (g) arrayList4.remove(arrayList2.size() - 1);
                    gVar3 = gVar;
                }
                gVar2.f7711a = gVar3.f7711a;
                gVar2.f7713c = gVar3.f7713c;
                gVar2.f7712b = hVar.f7715a;
                gVar2.f7714d = hVar.f7716b;
                arrayList3 = arrayList;
                arrayList3.add(gVar2);
                gVar3.f7712b = gVar3.f7712b;
                gVar3.f7714d = gVar3.f7714d;
                gVar3.f7711a = hVar.f7717c;
                gVar3.f7713c = hVar.f7718d;
                arrayList3.add(gVar3);
            } else {
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                i = 1;
                arrayList4.add(gVar);
            }
            i19 = i;
            arrayList6 = arrayList3;
            arrayList7 = arrayList4;
            i17 = 0;
        }
        Collections.sort(arrayList5, f7697a);
        return new d(bVar, arrayList5, iArr, iArr2);
    }
}
