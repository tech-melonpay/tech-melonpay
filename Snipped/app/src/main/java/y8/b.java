package Y8;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: CssInlineStyleParser.java */
/* loaded from: classes2.dex */
public abstract class b {

    /* compiled from: CssInlineStyleParser.java */
    public static class a extends b {

        /* compiled from: CssInlineStyleParser.java */
        /* renamed from: Y8.b$a$a, reason: collision with other inner class name */
        public static class C0051a implements Iterable<c> {

            /* renamed from: a, reason: collision with root package name */
            public final String f4122a;

            /* compiled from: CssInlineStyleParser.java */
            /* renamed from: Y8.b$a$a$a, reason: collision with other inner class name */
            public class C0052a implements Iterator<c> {

                /* renamed from: a, reason: collision with root package name */
                public final c f4123a = new c();

                /* renamed from: b, reason: collision with root package name */
                public final StringBuilder f4124b = new StringBuilder();

                /* renamed from: c, reason: collision with root package name */
                public final int f4125c;

                /* renamed from: d, reason: collision with root package name */
                public int f4126d;

                public C0052a() {
                    this.f4125c = C0051a.this.f4122a.length();
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    c cVar = this.f4123a;
                    cVar.f4128a = "";
                    cVar.f4129b = "";
                    StringBuilder sb2 = this.f4124b;
                    sb2.setLength(0);
                    int i = this.f4126d;
                    String str = null;
                    boolean z10 = false;
                    String str2 = null;
                    while (true) {
                        int i9 = this.f4125c;
                        if (i < i9) {
                            char charAt = C0051a.this.f4122a.charAt(i);
                            if (str == null) {
                                if (':' == charAt) {
                                    if (sb2.length() > 0) {
                                        str = sb2.toString().trim();
                                    }
                                    sb2.setLength(0);
                                } else if (';' == charAt) {
                                    sb2.setLength(0);
                                } else if (Character.isWhitespace(charAt)) {
                                    if (sb2.length() > 0) {
                                        z10 = true;
                                    }
                                } else if (z10) {
                                    sb2.setLength(0);
                                    sb2.append(charAt);
                                    z10 = false;
                                } else {
                                    sb2.append(charAt);
                                }
                            } else if (str2 != null) {
                                continue;
                            } else if (Character.isWhitespace(charAt)) {
                                if (sb2.length() > 0) {
                                    sb2.append(charAt);
                                }
                            } else if (';' == charAt) {
                                str2 = sb2.toString().trim();
                                sb2.setLength(0);
                                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                                    this.f4126d = i + 1;
                                    cVar.f4128a = str;
                                    cVar.f4129b = str2;
                                    break;
                                }
                            } else {
                                sb2.append(charAt);
                            }
                            i++;
                        } else if (str != null && sb2.length() > 0) {
                            String trim = sb2.toString().trim();
                            cVar.f4128a = str;
                            cVar.f4129b = trim;
                            this.f4126d = i9;
                        }
                    }
                    return (TextUtils.isEmpty(cVar.f4128a) || TextUtils.isEmpty(cVar.f4129b)) ? false : true;
                }

                @Override // java.util.Iterator
                public final c next() {
                    c cVar = this.f4123a;
                    String str = cVar.f4128a;
                    String str2 = cVar.f4129b;
                    if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                        throw new NoSuchElementException();
                    }
                    return cVar;
                }
            }

            public C0051a(String str) {
                this.f4122a = str;
            }

            @Override // java.lang.Iterable
            public final Iterator<c> iterator() {
                return new C0052a();
            }
        }
    }
}
