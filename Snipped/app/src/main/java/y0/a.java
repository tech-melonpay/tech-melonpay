package Y0;

import Y0.b;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/* compiled from: ColorCutQuantizer.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0049a f4064f = new C0049a();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f4065a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f4066b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4067c;

    /* renamed from: d, reason: collision with root package name */
    public final b.InterfaceC0050b[] f4068d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f4069e = new float[3];

    /* compiled from: ColorCutQuantizer.java */
    /* renamed from: Y0.a$a, reason: collision with other inner class name */
    public static class C0049a implements Comparator<b> {
        @Override // java.util.Comparator
        public final int compare(b bVar, b bVar2) {
            return bVar2.b() - bVar.b();
        }
    }

    /* compiled from: ColorCutQuantizer.java */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f4070a;

        /* renamed from: b, reason: collision with root package name */
        public int f4071b;

        /* renamed from: c, reason: collision with root package name */
        public int f4072c;

        /* renamed from: d, reason: collision with root package name */
        public int f4073d;

        /* renamed from: e, reason: collision with root package name */
        public int f4074e;

        /* renamed from: f, reason: collision with root package name */
        public int f4075f;

        /* renamed from: g, reason: collision with root package name */
        public int f4076g;

        /* renamed from: h, reason: collision with root package name */
        public int f4077h;
        public int i;

        public b(int i, int i9) {
            this.f4070a = i;
            this.f4071b = i9;
            a();
        }

        public final void a() {
            a aVar = a.this;
            int[] iArr = aVar.f4065a;
            int i = Integer.MAX_VALUE;
            int i9 = Integer.MIN_VALUE;
            int i10 = Integer.MIN_VALUE;
            int i11 = Integer.MIN_VALUE;
            int i12 = 0;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MAX_VALUE;
            for (int i15 = this.f4070a; i15 <= this.f4071b; i15++) {
                int i16 = iArr[i15];
                i12 += aVar.f4066b[i16];
                int i17 = (i16 >> 10) & 31;
                int i18 = (i16 >> 5) & 31;
                int i19 = i16 & 31;
                if (i17 > i9) {
                    i9 = i17;
                }
                if (i17 < i) {
                    i = i17;
                }
                if (i18 > i10) {
                    i10 = i18;
                }
                if (i18 < i13) {
                    i13 = i18;
                }
                if (i19 > i11) {
                    i11 = i19;
                }
                if (i19 < i14) {
                    i14 = i19;
                }
            }
            this.f4073d = i;
            this.f4074e = i9;
            this.f4075f = i13;
            this.f4076g = i10;
            this.f4077h = i14;
            this.i = i11;
            this.f4072c = i12;
        }

        public final int b() {
            return ((this.i - this.f4077h) + 1) * ((this.f4076g - this.f4075f) + 1) * ((this.f4074e - this.f4073d) + 1);
        }
    }

    public a(int[] iArr, int i, b.InterfaceC0050b[] interfaceC0050bArr) {
        b bVar;
        this.f4068d = interfaceC0050bArr;
        int[] iArr2 = new int[32768];
        this.f4066b = iArr2;
        int i9 = 0;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            int b9 = b(Color.blue(i11), 8, 5) | (b(Color.red(i11), 8, 5) << 10) | (b(Color.green(i11), 8, 5) << 5);
            iArr[i10] = b9;
            iArr2[b9] = iArr2[b9] + 1;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 32768; i13++) {
            if (iArr2[i13] > 0) {
                int rgb = Color.rgb(b((i13 >> 10) & 31, 5, 8), b((i13 >> 5) & 31, 5, 8), b(i13 & 31, 5, 8));
                ThreadLocal<double[]> threadLocal = n0.a.f24064a;
                int red = Color.red(rgb);
                int green = Color.green(rgb);
                int blue = Color.blue(rgb);
                float[] fArr = this.f4069e;
                n0.a.a(red, green, blue, fArr);
                b.InterfaceC0050b[] interfaceC0050bArr2 = this.f4068d;
                if (interfaceC0050bArr2 != null && interfaceC0050bArr2.length > 0) {
                    int length = interfaceC0050bArr2.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= length) {
                            break;
                        }
                        if (!interfaceC0050bArr2[i14].a(fArr, rgb)) {
                            iArr2[i13] = 0;
                            break;
                        }
                        i14++;
                    }
                }
            }
            if (iArr2[i13] > 0) {
                i12++;
            }
        }
        int[] iArr3 = new int[i12];
        this.f4065a = iArr3;
        int i15 = 0;
        for (int i16 = 0; i16 < 32768; i16++) {
            if (iArr2[i16] > 0) {
                iArr3[i15] = i16;
                i15++;
            }
        }
        if (i12 <= i) {
            this.f4067c = new ArrayList();
            while (i9 < i12) {
                int i17 = iArr3[i9];
                this.f4067c.add(new b.c(Color.rgb(b((i17 >> 10) & 31, 5, 8), b((i17 >> 5) & 31, 5, 8), b(i17 & 31, 5, 8)), iArr2[i17]));
                i9++;
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i, f4064f);
        priorityQueue.offer(new b(0, this.f4065a.length - 1));
        while (priorityQueue.size() < i && (bVar = (b) priorityQueue.poll()) != null) {
            int i18 = bVar.f4071b;
            int i19 = bVar.f4070a;
            if ((i18 + 1) - i19 <= 1) {
                break;
            }
            if ((i18 + 1) - i19 <= 1) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int i20 = bVar.f4074e - bVar.f4073d;
            int i21 = bVar.f4076g - bVar.f4075f;
            int i22 = bVar.i - bVar.f4077h;
            int i23 = (i20 < i21 || i20 < i22) ? (i21 < i20 || i21 < i22) ? -1 : -2 : -3;
            a aVar = a.this;
            int[] iArr4 = aVar.f4065a;
            a(iArr4, i23, i19, i18);
            Arrays.sort(iArr4, i19, bVar.f4071b + 1);
            a(iArr4, i23, i19, bVar.f4071b);
            int i24 = bVar.f4072c / 2;
            int i25 = i9;
            int i26 = i19;
            while (true) {
                int i27 = bVar.f4071b;
                if (i26 <= i27) {
                    i25 += aVar.f4066b[iArr4[i26]];
                    if (i25 >= i24) {
                        i19 = Math.min(i27 - 1, i26);
                        break;
                    }
                    i26++;
                }
            }
            b bVar2 = aVar.new b(i19 + 1, bVar.f4071b);
            bVar.f4071b = i19;
            bVar.a();
            priorityQueue.offer(bVar2);
            priorityQueue.offer(bVar);
            i9 = 0;
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            b bVar3 = (b) it.next();
            a aVar2 = a.this;
            int[] iArr5 = aVar2.f4065a;
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            for (int i32 = bVar3.f4070a; i32 <= bVar3.f4071b; i32++) {
                int i33 = iArr5[i32];
                int i34 = aVar2.f4066b[i33];
                i29 += i34;
                i28 = (((i33 >> 10) & 31) * i34) + i28;
                i30 = (((i33 >> 5) & 31) * i34) + i30;
                i31 += i34 * (i33 & 31);
            }
            float f10 = i29;
            b.c cVar = new b.c(Color.rgb(b(Math.round(i28 / f10), 5, 8), b(Math.round(i30 / f10), 5, 8), b(Math.round(i31 / f10), 5, 8)), i29);
            float[] b10 = cVar.b();
            b.InterfaceC0050b[] interfaceC0050bArr3 = this.f4068d;
            if (interfaceC0050bArr3 != null && interfaceC0050bArr3.length > 0) {
                for (b.InterfaceC0050b interfaceC0050b : interfaceC0050bArr3) {
                    if (!interfaceC0050b.a(b10, cVar.f4083d)) {
                        break;
                    }
                }
            }
            arrayList.add(cVar);
        }
        this.f4067c = arrayList;
    }

    public static void a(int[] iArr, int i, int i9, int i10) {
        if (i == -2) {
            while (i9 <= i10) {
                int i11 = iArr[i9];
                iArr[i9] = (i11 & 31) | (((i11 >> 5) & 31) << 10) | (((i11 >> 10) & 31) << 5);
                i9++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i9 <= i10) {
            int i12 = iArr[i9];
            iArr[i9] = ((i12 >> 10) & 31) | ((i12 & 31) << 10) | (((i12 >> 5) & 31) << 5);
            i9++;
        }
    }

    public static int b(int i, int i9, int i10) {
        return (i10 > i9 ? i << (i10 - i9) : i >> (i9 - i10)) & ((1 << i10) - 1);
    }
}
