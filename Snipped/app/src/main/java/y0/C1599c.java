package y0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import pa.C1124b;

/* compiled from: ContentInfoCompat.java */
/* renamed from: y0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1599c {

    /* renamed from: a, reason: collision with root package name */
    public final e f31050a;

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: y0.c$a */
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo.Builder f31051a;

        public a(ClipData clipData, int i) {
            this.f31051a = H.c.g(clipData, i);
        }

        @Override // y0.C1599c.b
        public final void a(Uri uri) {
            this.f31051a.setLinkUri(uri);
        }

        @Override // y0.C1599c.b
        public final void b(int i) {
            this.f31051a.setFlags(i);
        }

        @Override // y0.C1599c.b
        public final C1599c build() {
            ContentInfo build;
            build = this.f31051a.build();
            return new C1599c(new d(build));
        }

        @Override // y0.C1599c.b
        public final void setExtras(Bundle bundle) {
            this.f31051a.setExtras(bundle);
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: y0.c$b */
    public interface b {
        void a(Uri uri);

        void b(int i);

        C1599c build();

        void setExtras(Bundle bundle);
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: y0.c$c, reason: collision with other inner class name */
    public static final class C0482c implements b {

        /* renamed from: a, reason: collision with root package name */
        public ClipData f31052a;

        /* renamed from: b, reason: collision with root package name */
        public int f31053b;

        /* renamed from: c, reason: collision with root package name */
        public int f31054c;

        /* renamed from: d, reason: collision with root package name */
        public Uri f31055d;

        /* renamed from: e, reason: collision with root package name */
        public Bundle f31056e;

        @Override // y0.C1599c.b
        public final void a(Uri uri) {
            this.f31055d = uri;
        }

        @Override // y0.C1599c.b
        public final void b(int i) {
            this.f31054c = i;
        }

        @Override // y0.C1599c.b
        public final C1599c build() {
            return new C1599c(new f(this));
        }

        @Override // y0.C1599c.b
        public final void setExtras(Bundle bundle) {
            this.f31056e = bundle;
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: y0.c$d */
    public static final class d implements e {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo f31057a;

        public d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f31057a = H.c.i(contentInfo);
        }

        @Override // y0.C1599c.e
        public final ClipData a() {
            ClipData clip;
            clip = this.f31057a.getClip();
            return clip;
        }

        @Override // y0.C1599c.e
        public final int b() {
            int flags;
            flags = this.f31057a.getFlags();
            return flags;
        }

        @Override // y0.C1599c.e
        public final ContentInfo c() {
            return this.f31057a;
        }

        @Override // y0.C1599c.e
        public final int d() {
            int source;
            source = this.f31057a.getSource();
            return source;
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.f31057a + "}";
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: y0.c$e */
    public interface e {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: y0.c$f */
    public static final class f implements e {

        /* renamed from: a, reason: collision with root package name */
        public final ClipData f31058a;

        /* renamed from: b, reason: collision with root package name */
        public final int f31059b;

        /* renamed from: c, reason: collision with root package name */
        public final int f31060c;

        /* renamed from: d, reason: collision with root package name */
        public final Uri f31061d;

        /* renamed from: e, reason: collision with root package name */
        public final Bundle f31062e;

        public f(C0482c c0482c) {
            ClipData clipData = c0482c.f31052a;
            clipData.getClass();
            this.f31058a = clipData;
            int i = c0482c.f31053b;
            C1124b.n(i, 0, 5, "source");
            this.f31059b = i;
            int i9 = c0482c.f31054c;
            if ((i9 & 1) == i9) {
                this.f31060c = i9;
                this.f31061d = c0482c.f31055d;
                this.f31062e = c0482c.f31056e;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i9) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }

        @Override // y0.C1599c.e
        public final ClipData a() {
            return this.f31058a;
        }

        @Override // y0.C1599c.e
        public final int b() {
            return this.f31060c;
        }

        @Override // y0.C1599c.e
        public final ContentInfo c() {
            return null;
        }

        @Override // y0.C1599c.e
        public final int d() {
            return this.f31059b;
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
            sb2.append(this.f31058a.getDescription());
            sb2.append(", source=");
            int i = this.f31059b;
            sb2.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
            sb2.append(", flags=");
            int i9 = this.f31060c;
            sb2.append((i9 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i9));
            Uri uri = this.f31061d;
            if (uri == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb2.append(str);
            return androidx.camera.core.impl.utils.a.n(sb2, this.f31062e != null ? ", hasExtras" : "", "}");
        }
    }

    public C1599c(e eVar) {
        this.f31050a = eVar;
    }

    public final String toString() {
        return this.f31050a.toString();
    }
}
