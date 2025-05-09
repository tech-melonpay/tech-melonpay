package com.sumsub.sns.internal.fingerprint.infoproviders;

import android.os.Build;
import ca.InterfaceC0635a;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import ka.C0969n;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class k implements j {

    public static final class a extends Lambda implements InterfaceC0635a<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f17325a = new a();

        public a() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Build.SUPPORTED_ABIS[0];
        }
    }

    public static final class b extends Lambda implements InterfaceC0635a<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f17326a = new b();

        public b() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(Runtime.getRuntime().availableProcessors());
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<Map<String, ? extends String>> {
        public c() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<String, String> invoke() {
            return k.this.d();
        }
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.j
    public String b() {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, a.f17325a, 1, null);
        if (a10 instanceof Result.Failure) {
            a10 = "";
        }
        return (String) a10;
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.j
    public int c() {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, b.f17326a, 1, null);
        if (a10 instanceof Result.Failure) {
            a10 = 0;
        }
        return ((Number) a10).intValue();
    }

    public final Map<String, String> d() {
        HashMap hashMap = new HashMap();
        Scanner scanner = new Scanner(new File("/proc/cpuinfo"));
        while (scanner.hasNextLine()) {
            List r02 = C0969n.r0(scanner.nextLine(), new String[]{": "});
            if (r02.size() > 1) {
                String str = (String) r02.get(0);
                int length = str.length() - 1;
                int i = 0;
                boolean z10 = false;
                while (i <= length) {
                    boolean z11 = kotlin.jvm.internal.f.c(str.charAt(!z10 ? i : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        }
                        length--;
                    } else if (z11) {
                        i++;
                    } else {
                        z10 = true;
                    }
                }
                String obj = str.subSequence(i, length + 1).toString();
                String str2 = (String) r02.get(1);
                int length2 = str2.length() - 1;
                int i9 = 0;
                boolean z12 = false;
                while (i9 <= length2) {
                    boolean z13 = kotlin.jvm.internal.f.c(str2.charAt(!z12 ? i9 : length2), 32) <= 0;
                    if (z12) {
                        if (!z13) {
                            break;
                        }
                        length2--;
                    } else if (z13) {
                        i9++;
                    } else {
                        z12 = true;
                    }
                }
                hashMap.put(obj, str2.subSequence(i9, length2 + 1).toString());
            }
        }
        return hashMap;
    }

    @Override // com.sumsub.sns.internal.fingerprint.infoproviders.j
    public Map<String, String> a() {
        Object a10 = com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a(0L, new c(), 1, null);
        Map p10 = kotlin.collections.a.p();
        if (a10 instanceof Result.Failure) {
            a10 = p10;
        }
        return (Map) a10;
    }
}
