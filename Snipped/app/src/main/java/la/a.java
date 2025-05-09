package La;

import Ka.f;
import ka.C0956a;

/* compiled from: Buffer.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f2500a = "0123456789abcdef".getBytes(C0956a.f23054b);

    public static final String a(f fVar, long j10) {
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (fVar.A(j11) == 13) {
                String H10 = fVar.H(j11, C0956a.f23054b);
                fVar.skip(2L);
                return H10;
            }
        }
        String H11 = fVar.H(j10, C0956a.f23054b);
        fVar.skip(1L);
        return H11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0053, code lost:
    
        if (r19 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0055, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0056, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int b(Ka.f r17, Ka.q r18, boolean r19) {
        /*
            r0 = r17
            Ka.u r0 = r0.f2293a
            r1 = -2
            r2 = -1
            if (r0 != 0) goto Ld
            if (r19 == 0) goto Lb
            goto Lc
        Lb:
            r1 = r2
        Lc:
            return r1
        Ld:
            int r3 = r0.f2336b
            int r4 = r0.f2337c
            r5 = 0
            byte[] r6 = r0.f2335a
            r8 = r0
            r9 = r2
            r7 = r5
        L17:
            int r10 = r7 + 1
            r11 = r18
            int[] r12 = r11.f2321b
            r13 = r12[r7]
            int r7 = r7 + 2
            r10 = r12[r10]
            if (r10 == r2) goto L26
            r9 = r10
        L26:
            if (r8 != 0) goto L29
            goto L53
        L29:
            r10 = 0
            if (r13 >= 0) goto L6d
            int r13 = r13 * (-1)
            int r14 = r13 + r7
        L30:
            int r13 = r3 + 1
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r15 = r7 + 1
            r7 = r12[r7]
            if (r3 == r7) goto L3d
            return r9
        L3d:
            if (r15 != r14) goto L41
            r3 = 1
            goto L42
        L41:
            r3 = r5
        L42:
            if (r13 != r4) goto L5d
            Ka.u r4 = r8.f2340f
            int r6 = r4.f2336b
            int r7 = r4.f2337c
            byte[] r8 = r4.f2335a
            if (r4 != r0) goto L57
            if (r3 == 0) goto L53
            r4 = r7
            r7 = r10
            goto L60
        L53:
            if (r19 == 0) goto L56
            return r1
        L56:
            return r9
        L57:
            r16 = r7
            r7 = r4
            r4 = r16
            goto L60
        L5d:
            r7 = r8
            r8 = r6
            r6 = r13
        L60:
            if (r3 == 0) goto L68
            r3 = r12[r15]
            r1 = r6
            r6 = r8
            r8 = r7
            goto L8e
        L68:
            r3 = r6
            r6 = r8
            r8 = r7
            r7 = r15
            goto L30
        L6d:
            int r14 = r3 + 1
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r15 = r7 + r13
        L75:
            if (r7 != r15) goto L78
            return r9
        L78:
            r1 = r12[r7]
            if (r3 != r1) goto L95
            int r7 = r7 + r13
            r3 = r12[r7]
            if (r14 != r4) goto L8d
            Ka.u r8 = r8.f2340f
            int r1 = r8.f2336b
            int r4 = r8.f2337c
            byte[] r6 = r8.f2335a
            if (r8 != r0) goto L8e
            r8 = r10
            goto L8e
        L8d:
            r1 = r14
        L8e:
            if (r3 < 0) goto L91
            return r3
        L91:
            int r7 = -r3
            r3 = r1
            r1 = -2
            goto L17
        L95:
            int r7 = r7 + 1
            r1 = -2
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: La.a.b(Ka.f, Ka.q, boolean):int");
    }
}
