package Ka;

import P9.AbstractC0500b;
import java.util.ArrayList;
import java.util.RandomAccess;
import okio.ByteString;

/* compiled from: Options.kt */
/* loaded from: classes2.dex */
public final class q extends AbstractC0500b<ByteString> implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final ByteString[] f2320a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f2321b;

    /* compiled from: Options.kt */
    public static final class a {
        public static void a(long j10, f fVar, int i, ArrayList arrayList, int i9, int i10, ArrayList arrayList2) {
            int i11;
            int i12;
            int i13;
            int i14;
            f fVar2;
            int i15 = i;
            if (i9 >= i10) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i16 = i9; i16 < i10; i16++) {
                if (((ByteString) arrayList.get(i16)).d() < i15) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            ByteString byteString = (ByteString) arrayList.get(i9);
            ByteString byteString2 = (ByteString) arrayList.get(i10 - 1);
            int i17 = -1;
            if (i15 == byteString.d()) {
                int intValue = ((Number) arrayList2.get(i9)).intValue();
                int i18 = i9 + 1;
                ByteString byteString3 = (ByteString) arrayList.get(i18);
                i11 = i18;
                i12 = intValue;
                byteString = byteString3;
            } else {
                i11 = i9;
                i12 = -1;
            }
            if (byteString.g(i15) == byteString2.g(i15)) {
                int min = Math.min(byteString.d(), byteString2.d());
                int i19 = 0;
                for (int i20 = i15; i20 < min && byteString.g(i20) == byteString2.g(i20); i20++) {
                    i19++;
                }
                long j11 = 4;
                long j12 = (fVar.f2294b / j11) + j10 + 2 + i19 + 1;
                fVar.d0(-i19);
                fVar.d0(i12);
                int i21 = i19 + i15;
                while (i15 < i21) {
                    fVar.d0(byteString.g(i15) & 255);
                    i15++;
                }
                if (i11 + 1 == i10) {
                    if (i21 != ((ByteString) arrayList.get(i11)).d()) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    fVar.d0(((Number) arrayList2.get(i11)).intValue());
                    return;
                } else {
                    f fVar3 = new f();
                    fVar.d0(((int) ((fVar3.f2294b / j11) + j12)) * (-1));
                    a(j12, fVar3, i21, arrayList, i11, i10, arrayList2);
                    fVar.c0(fVar3);
                    return;
                }
            }
            int i22 = 1;
            for (int i23 = i11 + 1; i23 < i10; i23++) {
                if (((ByteString) arrayList.get(i23 - 1)).g(i15) != ((ByteString) arrayList.get(i23)).g(i15)) {
                    i22++;
                }
            }
            long j13 = 4;
            long j14 = (fVar.f2294b / j13) + j10 + 2 + (i22 * 2);
            fVar.d0(i22);
            fVar.d0(i12);
            for (int i24 = i11; i24 < i10; i24++) {
                int g10 = ((ByteString) arrayList.get(i24)).g(i15);
                if (i24 == i11 || g10 != ((ByteString) arrayList.get(i24 - 1)).g(i15)) {
                    fVar.d0(g10 & 255);
                }
            }
            f fVar4 = new f();
            int i25 = i11;
            while (i25 < i10) {
                byte g11 = ((ByteString) arrayList.get(i25)).g(i15);
                int i26 = i25 + 1;
                int i27 = i26;
                while (true) {
                    if (i27 >= i10) {
                        i13 = i10;
                        break;
                    } else {
                        if (g11 != ((ByteString) arrayList.get(i27)).g(i15)) {
                            i13 = i27;
                            break;
                        }
                        i27++;
                    }
                }
                if (i26 == i13 && i15 + 1 == ((ByteString) arrayList.get(i25)).d()) {
                    fVar.d0(((Number) arrayList2.get(i25)).intValue());
                    i14 = i13;
                    fVar2 = fVar4;
                } else {
                    fVar.d0(((int) ((fVar4.f2294b / j13) + j14)) * i17);
                    i14 = i13;
                    fVar2 = fVar4;
                    a(j14, fVar4, i15 + 1, arrayList, i25, i13, arrayList2);
                }
                fVar4 = fVar2;
                i25 = i14;
                i17 = -1;
            }
            fVar.c0(fVar4);
        }
    }

    public q(ByteString[] byteStringArr, int[] iArr) {
        this.f2320a = byteStringArr;
        this.f2321b = iArr;
    }

    @Override // P9.AbstractC0499a
    public final int a() {
        return this.f2320a.length;
    }

    @Override // P9.AbstractC0499a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return super.contains((ByteString) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f2320a[i];
    }

    @Override // P9.AbstractC0500b, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // P9.AbstractC0500b, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}
