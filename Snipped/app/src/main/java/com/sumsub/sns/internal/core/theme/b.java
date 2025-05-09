package com.sumsub.sns.internal.core.theme;

import C.v;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f16758a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f16759b;

        public final Integer c() {
            return this.f16758a;
        }

        public final Integer d() {
            return this.f16759b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f16758a, aVar.f16758a) && kotlin.jvm.internal.f.b(this.f16759b, aVar.f16759b);
        }

        public int hashCode() {
            Integer num = this.f16758a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.f16759b;
            return hashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            return "Color(dark=" + this.f16758a + ", light=" + this.f16759b + ')';
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.theme.b$b, reason: collision with other inner class name */
    public static final class C0250b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final Float f16760a;

        public final Float b() {
            return this.f16760a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0250b) && kotlin.jvm.internal.f.b(this.f16760a, ((C0250b) obj).f16760a);
        }

        public int hashCode() {
            Float f10 = this.f16760a;
            if (f10 == null) {
                return 0;
            }
            return f10.hashCode();
        }

        public String toString() {
            return "Dimension(value=" + this.f16760a + ')';
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f16761a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f16762b;

        /* renamed from: c, reason: collision with root package name */
        public final String f16763c;

        /* renamed from: d, reason: collision with root package name */
        public Bitmap f16764d;

        public final void a(Bitmap bitmap) {
            this.f16764d = bitmap;
        }

        public final Bitmap e() {
            return this.f16764d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.f.b(this.f16761a, cVar.f16761a) && kotlin.jvm.internal.f.b(this.f16762b, cVar.f16762b) && kotlin.jvm.internal.f.b(this.f16763c, cVar.f16763c) && kotlin.jvm.internal.f.b(this.f16764d, cVar.f16764d);
        }

        public final String f() {
            return this.f16761a;
        }

        public final Integer h() {
            return this.f16762b;
        }

        public int hashCode() {
            String str = this.f16761a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f16762b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.f16763c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Bitmap bitmap = this.f16764d;
            return hashCode3 + (bitmap != null ? bitmap.hashCode() : 0);
        }

        public String toString() {
            return "Image(image=" + this.f16761a + ", scale=" + this.f16762b + ", rendering=" + this.f16763c + ", bitmap=" + this.f16764d + ')';
        }
    }

    public static final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        public final Map<String, c> f16765a;

        public final Map<String, c> b() {
            return this.f16765a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.f.b(this.f16765a, ((d) obj).f16765a);
        }

        public int hashCode() {
            return this.f16765a.hashCode();
        }

        public String toString() {
            return "ImageList(images=" + this.f16765a + ')';
        }
    }

    public static final class e extends b {

        /* renamed from: a, reason: collision with root package name */
        public final Float f16766a;

        /* renamed from: b, reason: collision with root package name */
        public final Float f16767b;

        public final Float c() {
            return this.f16767b;
        }

        public final Float d() {
            return this.f16766a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.f.b(this.f16766a, eVar.f16766a) && kotlin.jvm.internal.f.b(this.f16767b, eVar.f16767b);
        }

        public int hashCode() {
            Float f10 = this.f16766a;
            int hashCode = (f10 == null ? 0 : f10.hashCode()) * 31;
            Float f11 = this.f16767b;
            return hashCode + (f11 != null ? f11.hashCode() : 0);
        }

        public String toString() {
            return "Size(width=" + this.f16766a + ", height=" + this.f16767b + ')';
        }
    }

    public static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f16768a;

        public final String b() {
            return this.f16768a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && kotlin.jvm.internal.f.b(this.f16768a, ((f) obj).f16768a);
        }

        public int hashCode() {
            return this.f16768a.hashCode();
        }

        public String toString() {
            return v.q(new StringBuilder("Style(value="), this.f16768a, ')');
        }
    }

    public static final class g extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f16769a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16770b;

        /* renamed from: c, reason: collision with root package name */
        public final String f16771c;

        /* renamed from: d, reason: collision with root package name */
        public Typeface f16772d;

        public final void a(Typeface typeface) {
            this.f16772d = typeface;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return kotlin.jvm.internal.f.b(this.f16769a, gVar.f16769a) && this.f16770b == gVar.f16770b && kotlin.jvm.internal.f.b(this.f16771c, gVar.f16771c) && kotlin.jvm.internal.f.b(this.f16772d, gVar.f16772d);
        }

        public final String f() {
            return this.f16771c;
        }

        public final int g() {
            return this.f16770b;
        }

        public final Typeface h() {
            return this.f16772d;
        }

        public int hashCode() {
            int c2 = v.c(v.b(this.f16770b, this.f16769a.hashCode() * 31, 31), 31, this.f16771c);
            Typeface typeface = this.f16772d;
            return c2 + (typeface == null ? 0 : typeface.hashCode());
        }

        public String toString() {
            return "Typography(face=" + this.f16769a + ", size=" + this.f16770b + ", filename=" + this.f16771c + ", typeface=" + this.f16772d + ')';
        }
    }
}
