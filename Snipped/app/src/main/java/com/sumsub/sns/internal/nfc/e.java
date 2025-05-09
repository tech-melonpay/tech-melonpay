package com.sumsub.sns.internal.nfc;

import O9.p;
import android.nfc.TagLostException;
import android.nfc.tech.IsoDep;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ka.C0969n;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.DelayKt;
import net.sf.scuba.smartcards.CardFileInputStream;
import org.bouncycastle.tls.CipherSuite;
import org.jmrtd.BACKeySpec;
import org.jmrtd.PassportService;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final b f17784d = new b(null);

    /* renamed from: h, reason: collision with root package name */
    public static final Map<Short, String> f17785h;
    public static final Map<String, Short> i;

    /* renamed from: a, reason: collision with root package name */
    public final IsoDep f17786a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f17787b;

    /* renamed from: c, reason: collision with root package name */
    public final com.sumsub.sns.internal.nfc.b f17788c;

    public static final class a implements BACKeySpec {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f17789a;

        public a(byte[] bArr) {
            this.f17789a = Arrays.copyOf(bArr, 16);
        }

        @Override // org.jmrtd.AccessKeySpec
        public String getAlgorithm() {
            return "BAC";
        }

        @Override // org.jmrtd.BACKeySpec
        public String getDateOfBirth() {
            return "";
        }

        @Override // org.jmrtd.BACKeySpec
        public String getDateOfExpiry() {
            return "";
        }

        @Override // org.jmrtd.BACKeySpec
        public String getDocumentNumber() {
            return "";
        }

        @Override // org.jmrtd.AccessKeySpec
        public byte[] getKey() {
            return this.f17789a;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Short> a(String str) {
            ArrayList arrayList = new ArrayList();
            Iterator it = C0969n.r0(str, new String[]{","}).iterator();
            while (it.hasNext()) {
                Short sh = (Short) e.i.get((String) it.next());
                if (sh != null) {
                    arrayList.add(Short.valueOf(sh.shortValue()));
                }
            }
            return arrayList;
        }

        public b() {
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.nfc.NfcReader", f = "NfcReader.kt", l = {44, 50, 52, 56, 60, 61, 69}, m = "read")
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f17790a;

        /* renamed from: b, reason: collision with root package name */
        public Object f17791b;

        /* renamed from: c, reason: collision with root package name */
        public Object f17792c;

        /* renamed from: d, reason: collision with root package name */
        public int f17793d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f17794e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f17795f;

        /* renamed from: h, reason: collision with root package name */
        public int f17797h;

        public c(T9.a<? super c> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f17795f = obj;
            this.f17797h |= Integer.MIN_VALUE;
            return e.this.a((InterfaceC0646l<? super Integer, p>) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.nfc.NfcReader", f = "NfcReader.kt", l = {209}, m = "readFile")
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public short f17798a;

        /* renamed from: b, reason: collision with root package name */
        public Object f17799b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f17800c;

        /* renamed from: e, reason: collision with root package name */
        public int f17802e;

        public d(T9.a<? super d> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f17800c = obj;
            this.f17802e |= Integer.MIN_VALUE;
            return e.this.a((PassportService) null, (short) 0, (String) null, 0, 0, (T9.a<? super byte[]>) this);
        }
    }

    /* renamed from: com.sumsub.sns.internal.nfc.e$e, reason: collision with other inner class name */
    public static final class C0284e extends Lambda implements InterfaceC0635a<byte[]> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PassportService f17803a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ short f17804b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0284e(PassportService passportService, short s10) {
            super(0);
            this.f17803a = passportService;
            this.f17804b = s10;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final byte[] invoke() {
            CardFileInputStream inputStream = this.f17803a.getInputStream(this.f17804b, PassportService.DEFAULT_MAX_BLOCKSIZE);
            try {
                byte[] bArr = new byte[inputStream.getLength()];
                DataInputStream dataInputStream = new DataInputStream(inputStream);
                try {
                    dataInputStream.readFully(bArr);
                    p pVar = p.f3034a;
                    U4.b.d(dataInputStream, null);
                    U4.b.d(inputStream, null);
                    return bArr;
                } finally {
                }
            } finally {
            }
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.nfc.NfcReader", f = "NfcReader.kt", l = {CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, 198}, m = "readFiles")
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f17805a;

        /* renamed from: b, reason: collision with root package name */
        public Object f17806b;

        /* renamed from: c, reason: collision with root package name */
        public Object f17807c;

        /* renamed from: d, reason: collision with root package name */
        public Object f17808d;

        /* renamed from: e, reason: collision with root package name */
        public Object f17809e;

        /* renamed from: f, reason: collision with root package name */
        public Object f17810f;

        /* renamed from: g, reason: collision with root package name */
        public Object f17811g;

        /* renamed from: h, reason: collision with root package name */
        public int f17812h;
        public /* synthetic */ Object i;

        /* renamed from: k, reason: collision with root package name */
        public int f17814k;

        public f(T9.a<? super f> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.f17814k |= Integer.MIN_VALUE;
            return e.this.a((PassportService) null, 0, (InterfaceC0646l<? super Integer, p>) null, (List<Short>) null, (List<byte[]>) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.nfc.NfcReader", f = "NfcReader.kt", l = {153}, m = "tryBac")
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f17815a;

        /* renamed from: b, reason: collision with root package name */
        public Object f17816b;

        /* renamed from: c, reason: collision with root package name */
        public int f17817c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f17818d;

        /* renamed from: f, reason: collision with root package name */
        public int f17820f;

        public g(T9.a<? super g> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f17818d = obj;
            this.f17820f |= Integer.MIN_VALUE;
            return e.this.a((PassportService) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.nfc.NfcReader", f = "NfcReader.kt", l = {114}, m = "tryPace")
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f17821a;

        /* renamed from: b, reason: collision with root package name */
        public Object f17822b;

        /* renamed from: c, reason: collision with root package name */
        public int f17823c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f17824d;

        /* renamed from: f, reason: collision with root package name */
        public int f17826f;

        public h(T9.a<? super h> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f17824d = obj;
            this.f17826f |= Integer.MIN_VALUE;
            return e.this.b(null, this);
        }
    }

    static {
        Map<Short, String> s10 = kotlin.collections.a.s(new Pair(Short.valueOf(PassportService.EF_COM), "COM"), new Pair((short) 285, "SOD"), new Pair(Short.valueOf(PassportService.EF_DG1), "DG1"), new Pair(Short.valueOf(PassportService.EF_DG2), "DG2"), new Pair(Short.valueOf(PassportService.EF_DG3), "DG3"), new Pair(Short.valueOf(PassportService.EF_DG4), "DG4"), new Pair(Short.valueOf(PassportService.EF_DG5), "DG5"), new Pair(Short.valueOf(PassportService.EF_DG6), "DG6"), new Pair(Short.valueOf(PassportService.EF_DG7), "DG7"), new Pair(Short.valueOf(PassportService.EF_DG8), "DG8"), new Pair(Short.valueOf(PassportService.EF_DG9), "DG9"), new Pair(Short.valueOf(PassportService.EF_DG10), "DG10"), new Pair(Short.valueOf(PassportService.EF_DG11), "DG11"), new Pair(Short.valueOf(PassportService.EF_DG12), "DG12"), new Pair(Short.valueOf(PassportService.EF_DG13), "DG13"), new Pair(Short.valueOf(PassportService.EF_DG14), "DG14"), new Pair(Short.valueOf(PassportService.EF_DG15), "DG15"), new Pair(Short.valueOf(PassportService.EF_DG16), "DG16"));
        f17785h = s10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Short, String> entry : s10.entrySet()) {
            linkedHashMap.put(entry.getValue(), entry.getKey());
        }
        i = linkedHashMap;
    }

    public e(IsoDep isoDep, byte[] bArr, com.sumsub.sns.internal.nfc.b bVar) {
        this.f17786a = isoDep;
        this.f17787b = bArr;
        this.f17788c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4 A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:12:0x0030, B:13:0x006b, B:14:0x009e, B:16:0x00a4, B:19:0x00da), top: B:11:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(org.jmrtd.PassportService r13, T9.a<? super java.lang.Boolean> r14) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.nfc.e.b(org.jmrtd.PassportService, T9.a):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a8 A[Catch: NoClassDefFoundError -> 0x0045, all -> 0x0214, TRY_ENTER, TRY_LEAVE, TryCatch #0 {NoClassDefFoundError -> 0x0045, blocks: (B:15:0x003d, B:16:0x01e4, B:19:0x01ec, B:21:0x0201, B:31:0x0056, B:35:0x01a8, B:39:0x0217, B:44:0x0068, B:46:0x0186, B:50:0x007d, B:52:0x0176, B:57:0x0090, B:61:0x015c, B:74:0x00a7, B:75:0x0138, B:76:0x0147, B:84:0x00bc, B:86:0x011b, B:88:0x0123, B:95:0x00c8), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0217 A[Catch: NoClassDefFoundError -> 0x0045, all -> 0x0214, TRY_ENTER, TRY_LEAVE, TryCatch #0 {NoClassDefFoundError -> 0x0045, blocks: (B:15:0x003d, B:16:0x01e4, B:19:0x01ec, B:21:0x0201, B:31:0x0056, B:35:0x01a8, B:39:0x0217, B:44:0x0068, B:46:0x0186, B:50:0x007d, B:52:0x0176, B:57:0x0090, B:61:0x015c, B:74:0x00a7, B:75:0x0138, B:76:0x0147, B:84:0x00bc, B:86:0x011b, B:88:0x0123, B:95:0x00c8), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0176 A[Catch: NoClassDefFoundError -> 0x0045, all -> 0x01a4, TRY_ENTER, TryCatch #0 {NoClassDefFoundError -> 0x0045, blocks: (B:15:0x003d, B:16:0x01e4, B:19:0x01ec, B:21:0x0201, B:31:0x0056, B:35:0x01a8, B:39:0x0217, B:44:0x0068, B:46:0x0186, B:50:0x007d, B:52:0x0176, B:57:0x0090, B:61:0x015c, B:74:0x00a7, B:75:0x0138, B:76:0x0147, B:84:0x00bc, B:86:0x011b, B:88:0x0123, B:95:0x00c8), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0170 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0158 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0123 A[Catch: NoClassDefFoundError -> 0x0045, all -> 0x00c1, TryCatch #0 {NoClassDefFoundError -> 0x0045, blocks: (B:15:0x003d, B:16:0x01e4, B:19:0x01ec, B:21:0x0201, B:31:0x0056, B:35:0x01a8, B:39:0x0217, B:44:0x0068, B:46:0x0186, B:50:0x007d, B:52:0x0176, B:57:0x0090, B:61:0x015c, B:74:0x00a7, B:75:0x0138, B:76:0x0147, B:84:0x00bc, B:86:0x011b, B:88:0x0123, B:95:0x00c8), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ca.InterfaceC0646l<? super java.lang.Integer, O9.p> r20, T9.a<? super com.sumsub.sns.internal.nfc.NfcResult> r21) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.nfc.e.a(ca.l, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(org.jmrtd.PassportService r13, T9.a<? super java.lang.Boolean> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.sumsub.sns.internal.nfc.e.g
            if (r0 == 0) goto L14
            r0 = r14
            com.sumsub.sns.internal.nfc.e$g r0 = (com.sumsub.sns.internal.nfc.e.g) r0
            int r1 = r0.f17820f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f17820f = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.sumsub.sns.internal.nfc.e$g r0 = new com.sumsub.sns.internal.nfc.e$g
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.f17818d
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r1 = r7.f17820f
            r10 = 0
            r11 = 1
            if (r1 == 0) goto L3f
            if (r1 != r11) goto L37
            int r13 = r7.f17817c
            java.lang.Object r0 = r7.f17816b
            org.jmrtd.PassportService r0 = (org.jmrtd.PassportService) r0
            java.lang.Object r1 = r7.f17815a
            com.sumsub.sns.internal.nfc.e r1 = (com.sumsub.sns.internal.nfc.e) r1
            kotlin.b.b(r14)     // Catch: java.lang.Exception -> L34
            goto L74
        L34:
            r14 = r13
            r13 = r0
            goto L6a
        L37:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3f:
            kotlin.b.b(r14)
            com.sumsub.sns.internal.nfc.c r1 = com.sumsub.sns.internal.nfc.c.f17776a
            r5 = 4
            r6 = 0
            java.lang.String r2 = "NfcReader"
            java.lang.String r3 = "Trying BAC"
            r4 = 0
            com.sumsub.sns.internal.nfc.c.a(r1, r2, r3, r4, r5, r6)
            java.lang.String r4 = "EF_COM"
            r7.f17815a = r12     // Catch: java.lang.Exception -> L68
            r7.f17816b = r13     // Catch: java.lang.Exception -> L68
            r7.f17817c = r10     // Catch: java.lang.Exception -> L68
            r7.f17820f = r11     // Catch: java.lang.Exception -> L68
            r3 = 286(0x11e, float:4.01E-43)
            r5 = 0
            r6 = 0
            r8 = 12
            r9 = 0
            r1 = r12
            r2 = r13
            java.lang.Object r13 = a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L68
            if (r13 != r0) goto L74
            return r0
        L68:
            r1 = r12
            r14 = r10
        L6a:
            com.sumsub.sns.internal.nfc.e$a r0 = new com.sumsub.sns.internal.nfc.e$a     // Catch: java.lang.Exception -> L76
            byte[] r1 = r1.f17787b     // Catch: java.lang.Exception -> L76
            r0.<init>(r1)     // Catch: java.lang.Exception -> L76
            r13.doBAC(r0)     // Catch: java.lang.Exception -> L76
        L74:
            r14 = r11
            goto L80
        L76:
            r13 = move-exception
            com.sumsub.sns.internal.nfc.c r0 = com.sumsub.sns.internal.nfc.c.f17776a
            java.lang.String r1 = "NfcReader"
            java.lang.String r2 = "Failed to do BAC"
            r0.a(r1, r2, r13)
        L80:
            com.sumsub.sns.internal.nfc.c r0 = com.sumsub.sns.internal.nfc.c.f17776a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "bacSucceeded = "
            r13.<init>(r1)
            if (r14 == 0) goto L8d
            r1 = r11
            goto L8e
        L8d:
            r1 = r10
        L8e:
            r13.append(r1)
            java.lang.String r2 = r13.toString()
            r4 = 4
            r5 = 0
            java.lang.String r1 = "NfcReader"
            r3 = 0
            com.sumsub.sns.internal.nfc.c.a(r0, r1, r2, r3, r4, r5)
            if (r14 == 0) goto La0
            r10 = r11
        La0:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r10)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.nfc.e.a(org.jmrtd.PassportService, T9.a):java.lang.Object");
    }

    public final boolean a(Throwable th) {
        if (th == null) {
            return false;
        }
        if (th instanceof TagLostException) {
            return true;
        }
        return a(th.getCause());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:14|(1:16)(1:45)|17|18|(1:20)|21|22|23|24|(1:26)(5:28|29|30|31|(1:33)(4:34|11|12|(2:46|47)(0)))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0162, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x016f, code lost:
    
        r12 = r5;
        r13 = r6;
        r15 = r16;
        r10 = r18;
        r11 = r19;
        r14 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0164, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0165, code lost:
    
        r18 = r10;
        r19 = r11;
        r5 = r12;
        r6 = r13;
        r20 = r14;
        r16 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x01bf -> B:11:0x01c3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(org.jmrtd.PassportService r23, int r24, ca.InterfaceC0646l<? super java.lang.Integer, O9.p> r25, java.util.List<java.lang.Short> r26, java.util.List<byte[]> r27, T9.a<? super O9.p> r28) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.nfc.e.a(org.jmrtd.PassportService, int, ca.l, java.util.List, java.util.List, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(org.jmrtd.PassportService r5, short r6, java.lang.String r7, int r8, int r9, T9.a<? super byte[]> r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof com.sumsub.sns.internal.nfc.e.d
            if (r0 == 0) goto L13
            r0 = r10
            com.sumsub.sns.internal.nfc.e$d r0 = (com.sumsub.sns.internal.nfc.e.d) r0
            int r1 = r0.f17802e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17802e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.nfc.e$d r0 = new com.sumsub.sns.internal.nfc.e$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f17800c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f17802e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            short r6 = r0.f17798a
            java.lang.Object r5 = r0.f17799b
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            kotlin.b.b(r10)     // Catch: java.lang.Exception -> L2e
            goto L4e
        L2e:
            r5 = move-exception
            goto L51
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            kotlin.b.b(r10)
            com.sumsub.sns.internal.nfc.e$e r10 = new com.sumsub.sns.internal.nfc.e$e     // Catch: java.lang.Exception -> L2e
            short r2 = (short) r6     // Catch: java.lang.Exception -> L2e
            r10.<init>(r5, r2)     // Catch: java.lang.Exception -> L2e
            r0.f17799b = r7     // Catch: java.lang.Exception -> L2e
            r0.f17798a = r6     // Catch: java.lang.Exception -> L2e
            r0.f17802e = r3     // Catch: java.lang.Exception -> L2e
            java.lang.Object r10 = com.sumsub.sns.internal.nfc.f.a(r8, r9, r10, r0)     // Catch: java.lang.Exception -> L2e
            if (r10 != r1) goto L4e
            return r1
        L4e:
            byte[] r10 = (byte[]) r10     // Catch: java.lang.Exception -> L2e
            return r10
        L51:
            com.sumsub.sns.internal.nfc.c r8 = com.sumsub.sns.internal.nfc.c.f17776a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Failed to read file "
            r9.<init>(r10)
            r9.append(r7)
            java.lang.String r7 = " ("
            r9.append(r7)
            r9.append(r6)
            java.lang.String r6 = ") "
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            java.lang.String r7 = "NfcReader"
            r8.a(r7, r6, r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.nfc.e.a(org.jmrtd.PassportService, short, java.lang.String, int, int, T9.a):java.lang.Object");
    }

    public static /* synthetic */ Object a(e eVar, PassportService passportService, short s10, String str, int i9, int i10, T9.a aVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i9 = 1;
        }
        int i12 = i9;
        if ((i11 & 8) != 0) {
            i10 = 300;
        }
        return eVar.a(passportService, s10, str, i12, i10, (T9.a<? super byte[]>) aVar);
    }

    public final Object a(T9.a<? super p> aVar) {
        Object delay = DelayKt.delay(50L, aVar);
        return delay == CoroutineSingletons.f23158a ? delay : p.f3034a;
    }
}
