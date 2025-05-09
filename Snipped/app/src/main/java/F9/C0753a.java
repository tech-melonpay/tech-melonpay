package f9;

import Qa.n;
import U8.i;
import U8.k;
import U8.l;
import U8.p;
import U8.q;
import U8.r;
import U8.s;
import U8.t;
import V8.o;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import com.bumptech.glide.load.Key;
import io.noties.markwon.core.CoreProps;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import w0.C1563b;

/* compiled from: LinkifyPlugin.java */
/* renamed from: f9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0753a extends U8.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f20717a = 7;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20718b = false;

    /* compiled from: LinkifyPlugin.java */
    /* renamed from: f9.a$a, reason: collision with other inner class name */
    public class C0400a {
        public C0400a() {
        }

        public final void a(i iVar) {
            o oVar = (o) iVar;
            C0753a c0753a = C0753a.this;
            boolean z10 = c0753a.f20718b;
            int i = c0753a.f20717a;
            oVar.f3752a.add(z10 ? new b(i) : new c(i));
        }
    }

    /* compiled from: LinkifyPlugin.java */
    /* renamed from: f9.a$b */
    public static class b extends c {
        @Override // f9.C0753a.c
        public final boolean b(SpannableStringBuilder spannableStringBuilder, int i) {
            int i9;
            int i10;
            int i11;
            int indexOf;
            if (Build.VERSION.SDK_INT >= 28) {
                return Linkify.addLinks(spannableStringBuilder, i);
            }
            if (i != 0) {
                Object[] objArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                for (int length = objArr.length - 1; length >= 0; length--) {
                    spannableStringBuilder.removeSpan(objArr[length]);
                }
                if ((i & 4) != 0) {
                    Linkify.addLinks(spannableStringBuilder, 4);
                }
                ArrayList arrayList = new ArrayList();
                if ((i & 1) != 0) {
                    C1563b.b(arrayList, spannableStringBuilder, x0.c.f30905a, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter);
                }
                if ((i & 2) != 0) {
                    C1563b.b(arrayList, spannableStringBuilder, x0.c.f30906b, new String[]{"mailto:"}, null);
                }
                if ((i & 8) != 0) {
                    String obj = spannableStringBuilder.toString();
                    int i12 = 0;
                    while (true) {
                        try {
                            String a10 = C1563b.a(obj);
                            if (a10 == null || (indexOf = obj.indexOf(a10)) < 0) {
                                break;
                            }
                            C1563b.a aVar = new C1563b.a();
                            int length2 = a10.length() + indexOf;
                            aVar.f30808c = indexOf + i12;
                            i12 += length2;
                            aVar.f30809d = i12;
                            obj = obj.substring(length2);
                            try {
                                aVar.f30807b = "geo:0,0?q=" + URLEncoder.encode(a10, Key.STRING_CHARSET_NAME);
                                arrayList.add(aVar);
                            } catch (UnsupportedEncodingException unused) {
                            }
                        } catch (UnsupportedOperationException unused2) {
                        }
                    }
                }
                for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                    C1563b.a aVar2 = new C1563b.a();
                    aVar2.f30806a = uRLSpan;
                    aVar2.f30808c = spannableStringBuilder.getSpanStart(uRLSpan);
                    aVar2.f30809d = spannableStringBuilder.getSpanEnd(uRLSpan);
                    arrayList.add(aVar2);
                }
                Collections.sort(arrayList, C1563b.f30805a);
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size - 1) {
                    C1563b.a aVar3 = (C1563b.a) arrayList.get(i13);
                    int i14 = i13 + 1;
                    C1563b.a aVar4 = (C1563b.a) arrayList.get(i14);
                    int i15 = aVar3.f30808c;
                    int i16 = aVar4.f30808c;
                    if (i15 <= i16 && (i9 = aVar3.f30809d) > i16) {
                        int i17 = aVar4.f30809d;
                        int i18 = (i17 > i9 && (i10 = i9 - i15) <= (i11 = i17 - i16)) ? i10 < i11 ? i13 : -1 : i14;
                        if (i18 != -1) {
                            Object obj2 = ((C1563b.a) arrayList.get(i18)).f30806a;
                            if (obj2 != null) {
                                spannableStringBuilder.removeSpan(obj2);
                            }
                            arrayList.remove(i18);
                            size--;
                        }
                    }
                    i13 = i14;
                }
                if (arrayList.size() != 0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C1563b.a aVar5 = (C1563b.a) it.next();
                        if (aVar5.f30806a == null) {
                            spannableStringBuilder.setSpan(new URLSpan(aVar5.f30807b), aVar5.f30808c, aVar5.f30809d, 33);
                        }
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: LinkifyPlugin.java */
    /* renamed from: f9.a$c */
    public static class c implements o.a {

        /* renamed from: a, reason: collision with root package name */
        public final int f20720a;

        public c(int i) {
            this.f20720a = i;
        }

        @Override // V8.o.a
        public final void a(l lVar, String str, int i) {
            U8.o oVar = (U8.o) lVar;
            s a10 = ((k) oVar.f3698a.f3682e).a(n.class);
            if (a10 == null) {
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            if (b(spannableStringBuilder, this.f20720a)) {
                URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                if (uRLSpanArr == null || uRLSpanArr.length <= 0) {
                    return;
                }
                for (URLSpan uRLSpan : uRLSpanArr) {
                    p<String> pVar = CoreProps.f21673e;
                    String url = uRLSpan.getURL();
                    r rVar = oVar.f3699b;
                    pVar.b(rVar, url);
                    t.d(oVar.f3700c, a10.a(oVar.f3698a, rVar), spannableStringBuilder.getSpanStart(uRLSpan) + i, spannableStringBuilder.getSpanEnd(uRLSpan) + i);
                }
            }
        }

        public boolean b(SpannableStringBuilder spannableStringBuilder, int i) {
            return Linkify.addLinks(spannableStringBuilder, i);
        }
    }

    @Override // U8.a, U8.i
    public final void configure(i.a aVar) {
        ((q) aVar).c(new C0400a());
    }
}
