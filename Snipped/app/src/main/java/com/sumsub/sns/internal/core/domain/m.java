package com.sumsub.sns.internal.core.domain;

import O9.p;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import ca.InterfaceC0646l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public interface m {

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final Bitmap f16418a;

        /* renamed from: com.sumsub.sns.internal.core.domain.m$a$a, reason: collision with other inner class name */
        public static final class C0239a extends a {

            /* renamed from: b, reason: collision with root package name */
            public final Throwable f16419b;

            public C0239a(Bitmap bitmap, Throwable th) {
                super(bitmap, null);
                this.f16419b = th;
            }

            public final Throwable b() {
                return this.f16419b;
            }
        }

        public static final class b extends a {

            /* renamed from: b, reason: collision with root package name */
            public final Size f16420b;

            /* renamed from: c, reason: collision with root package name */
            public final RectF f16421c;

            public b(Bitmap bitmap, Size size, RectF rectF) {
                super(bitmap, null);
                this.f16420b = size;
                this.f16421c = rectF;
            }

            public final RectF b() {
                return this.f16421c;
            }

            public final Size c() {
                return this.f16420b;
            }
        }

        public static final class c extends a {
            public c(Bitmap bitmap) {
                super(bitmap, null);
            }
        }

        public static final class d extends a {

            /* renamed from: b, reason: collision with root package name */
            public final RectF f16422b;

            public d(Bitmap bitmap, RectF rectF) {
                super(bitmap, null);
                this.f16422b = rectF;
            }

            public final RectF b() {
                return this.f16422b;
            }
        }

        public static final class e extends a {
            public e(Bitmap bitmap) {
                super(bitmap, null);
            }
        }

        public /* synthetic */ a(Bitmap bitmap, DefaultConstructorMarker defaultConstructorMarker) {
            this(bitmap);
        }

        public final Bitmap a() {
            return this.f16418a;
        }

        public a(Bitmap bitmap) {
            this.f16418a = bitmap;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f16423a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16424b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f16425c;

        public b(int i, int i9, byte[] bArr) {
            this.f16423a = i;
            this.f16424b = i9;
            this.f16425c = bArr;
        }

        public final byte[] b() {
            return this.f16425c;
        }
    }

    void a(Bitmap bitmap, RectF rectF, InterfaceC0646l<? super a, p> interfaceC0646l);

    String getName();

    void start();

    void stop();
}
