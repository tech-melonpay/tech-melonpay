package Y8;

import Y8.f;
import Y8.m;
import io.noties.markwon.html.jsoup.parser.Token;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: MarkwonHtmlParserImpl.java */
/* loaded from: classes2.dex */
public final class h extends g {

    /* renamed from: g, reason: collision with root package name */
    public static final Set<String> f4142g = Collections.unmodifiableSet(new HashSet(Arrays.asList("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "i", "img", "input", "kbd", "label", "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));

    /* renamed from: h, reason: collision with root package name */
    public static final Set<String> f4143h = Collections.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));
    public static final Set<String> i = Collections.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", "video")));

    /* renamed from: a, reason: collision with root package name */
    public final U4.b f4144a;

    /* renamed from: b, reason: collision with root package name */
    public final m f4145b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4146c = new ArrayList(0);

    /* renamed from: d, reason: collision with root package name */
    public f.a f4147d = new f.a("", 0, Collections.emptyMap(), null);

    /* renamed from: e, reason: collision with root package name */
    public boolean f4148e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4149f;

    public h(U4.b bVar, m.a aVar) {
        this.f4144a = bVar;
        this.f4145b = aVar;
    }

    public static Map<String, String> a(Token.g gVar) {
        Z8.b bVar = gVar.f21703j;
        int i9 = bVar.f4238a;
        if (i9 <= 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(i9);
        int i10 = 0;
        while (true) {
            if (!(i10 < bVar.f4238a)) {
                return Collections.unmodifiableMap(hashMap);
            }
            String str = bVar.f4240c[i10];
            String str2 = bVar.f4239b[i10];
            if (str == null) {
                str = "";
            }
            Z8.a aVar = new Z8.a();
            if (str2 == null) {
                throw new IllegalArgumentException("Object must not be null");
            }
            aVar.f4234a = str2.trim();
            if (str2.length() == 0) {
                throw new IllegalArgumentException("String must not be empty");
            }
            aVar.f4235b = str;
            aVar.f4236c = bVar;
            i10++;
            hashMap.put(aVar.f4234a.toLowerCase(Locale.US), aVar.f4235b);
        }
    }
}
