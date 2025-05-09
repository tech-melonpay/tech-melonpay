package com.sumsub.sns.internal.core.data.model;

import com.sumsub.sns.internal.core.common.z0;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import java.util.Arrays;
import java.util.List;
import ka.C0969n;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class q {

    /* renamed from: c, reason: collision with root package name */
    public static final a f15559c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f15560a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15561b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final q a(String str) {
            switch (str.hashCode()) {
                case -1895130188:
                    if (str.equals("ID_CARD")) {
                        return c.f15563f;
                    }
                    break;
                case -1852691096:
                    if (str.equals(DocumentType.f15247c)) {
                        return g.f15567f;
                    }
                    break;
                case -1656620757:
                    if (str.equals("DRIVERS")) {
                        return b.f15562f;
                    }
                    break;
                case -790387854:
                    if (str.equals("INSURANCE_CERTIFICATE")) {
                        return d.f15564f;
                    }
                    break;
                case 2634817:
                    if (str.equals("VISA")) {
                        return j.f15569f;
                    }
                    break;
                case 79048533:
                    if (str.equals("SNILS")) {
                        return h.f15568f;
                    }
                    break;
                case 1305942932:
                    if (str.equals("RESIDENCE_PERMIT")) {
                        return f.f15566f;
                    }
                    break;
                case 1999404050:
                    if (str.equals("PASSPORT")) {
                        return e.f15565f;
                    }
                    break;
            }
            return new i(str, z0.a((List<String>) C0969n.q0(str, new char[]{'_'})));
        }

        public a() {
        }
    }

    public static final class b extends q {

        /* renamed from: f, reason: collision with root package name */
        public static final b f15562f = new b();

        public b() {
            super("DRIVERS", "drivers", null);
        }
    }

    public static final class c extends q {

        /* renamed from: f, reason: collision with root package name */
        public static final c f15563f = new c();

        public c() {
            super("ID_CARD", "idCard", null);
        }
    }

    public static final class d extends q {

        /* renamed from: f, reason: collision with root package name */
        public static final d f15564f = new d();

        public d() {
            super("INSURANCE_CERTIFICATE", "insuranceCertificate", null);
        }
    }

    public static final class e extends q {

        /* renamed from: f, reason: collision with root package name */
        public static final e f15565f = new e();

        public e() {
            super("PASSPORT", "passport", null);
        }
    }

    public static final class f extends q {

        /* renamed from: f, reason: collision with root package name */
        public static final f f15566f = new f();

        public f() {
            super("RESIDENCE_PERMIT", "residencePermit", null);
        }
    }

    public static final class g extends q {

        /* renamed from: f, reason: collision with root package name */
        public static final g f15567f = new g();

        public g() {
            super(DocumentType.f15247c, "selfie", null);
        }
    }

    public static final class h extends q {

        /* renamed from: f, reason: collision with root package name */
        public static final h f15568f = new h();

        public h() {
            super("SNILS", "snils", null);
        }
    }

    public static final class i extends q {
        public i(String str, String str2) {
            super(str, str2, null);
        }
    }

    public static final class j extends q {

        /* renamed from: f, reason: collision with root package name */
        public static final j f15569f = new j();

        public j() {
            super("VISA", "visa", null);
        }
    }

    public /* synthetic */ q(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public final String a() {
        return this.f15561b;
    }

    public final String b() {
        return this.f15560a;
    }

    public q(String str, String str2) {
        this.f15560a = str;
        this.f15561b = str2;
    }

    public static /* synthetic */ CharSequence a(q qVar, b.c cVar, CharSequence charSequence, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTitle");
        }
        if ((i9 & 2) != 0) {
            charSequence = null;
        }
        return qVar.a(cVar, charSequence);
    }

    public final CharSequence a(b.c cVar, CharSequence charSequence) {
        String a10 = cVar.a(String.format("sns_iddoc_type_%s", Arrays.copyOf(new Object[]{this.f15560a}, 1)));
        return a10 != null ? a10 : charSequence == null ? this.f15560a : charSequence;
    }
}
