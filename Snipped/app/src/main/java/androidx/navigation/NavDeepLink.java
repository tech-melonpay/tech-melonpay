package androidx.navigation;

import O9.p;
import P9.m;
import P9.q;
import P9.s;
import U0.k;
import android.net.Uri;
import android.os.Bundle;
import androidx.camera.core.n;
import androidx.navigation.NavDeepLink;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ka.C0967l;
import ka.C0969n;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;

/* compiled from: NavDeepLink.kt */
/* loaded from: classes.dex */
public final class NavDeepLink {

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f7214q = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f7215r = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: a, reason: collision with root package name */
    public final String f7216a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7217b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7218c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7219d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7220e;

    /* renamed from: f, reason: collision with root package name */
    public final O9.f f7221f;

    /* renamed from: g, reason: collision with root package name */
    public final O9.f f7222g;

    /* renamed from: h, reason: collision with root package name */
    public final O9.f f7223h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final O9.f f7224j;

    /* renamed from: k, reason: collision with root package name */
    public final O9.f f7225k;

    /* renamed from: l, reason: collision with root package name */
    public final O9.f f7226l;

    /* renamed from: m, reason: collision with root package name */
    public final O9.f f7227m;

    /* renamed from: n, reason: collision with root package name */
    public final String f7228n;

    /* renamed from: o, reason: collision with root package name */
    public final O9.f f7229o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f7230p;

    /* compiled from: NavDeepLink.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f7231a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f7232b = new ArrayList();
    }

    public NavDeepLink(String str, String str2, String str3) {
        List list;
        this.f7216a = str;
        this.f7217b = str2;
        this.f7218c = str3;
        ArrayList arrayList = new ArrayList();
        this.f7219d = arrayList;
        this.f7221f = kotlin.a.a(new InterfaceC0635a<Pattern>() { // from class: androidx.navigation.NavDeepLink$pathPattern$2
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Pattern invoke() {
                String str4 = NavDeepLink.this.f7220e;
                if (str4 != null) {
                    return Pattern.compile(str4, 2);
                }
                return null;
            }
        });
        this.f7222g = kotlin.a.a(new InterfaceC0635a<Boolean>() { // from class: androidx.navigation.NavDeepLink$isParameterizedQuery$2
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Boolean invoke() {
                String str4 = NavDeepLink.this.f7216a;
                return Boolean.valueOf((str4 == null || Uri.parse(str4).getQuery() == null) ? false : true);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f23087c;
        this.f7223h = kotlin.a.b(lazyThreadSafetyMode, new InterfaceC0635a<Map<String, a>>() { // from class: androidx.navigation.NavDeepLink$queryArgsMap$2
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Map<String, NavDeepLink.a> invoke() {
                NavDeepLink navDeepLink = NavDeepLink.this;
                navDeepLink.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) navDeepLink.f7222g.getValue()).booleanValue()) {
                    String str4 = navDeepLink.f7216a;
                    Uri parse = Uri.parse(str4);
                    for (String str5 : parse.getQueryParameterNames()) {
                        StringBuilder sb2 = new StringBuilder();
                        List<String> queryParameters = parse.getQueryParameters(str5);
                        if (queryParameters.size() > 1) {
                            throw new IllegalArgumentException(s3.b.l("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                        String str6 = (String) s.L(queryParameters);
                        if (str6 == null) {
                            navDeepLink.i = true;
                            str6 = str5;
                        }
                        Matcher matcher = NavDeepLink.f7215r.matcher(str6);
                        NavDeepLink.a aVar = new NavDeepLink.a();
                        int i = 0;
                        while (matcher.find()) {
                            aVar.f7232b.add(matcher.group(1));
                            sb2.append(Pattern.quote(str6.substring(i, matcher.start())));
                            sb2.append("(.+?)?");
                            i = matcher.end();
                        }
                        if (i < str6.length()) {
                            sb2.append(Pattern.quote(str6.substring(i)));
                        }
                        aVar.f7231a = C0967l.X(sb2.toString(), ".*", "\\E.*\\Q", false);
                        linkedHashMap.put(str5, aVar);
                    }
                }
                return linkedHashMap;
            }
        });
        this.f7224j = kotlin.a.b(lazyThreadSafetyMode, new InterfaceC0635a<Pair<? extends List<String>, ? extends String>>() { // from class: androidx.navigation.NavDeepLink$fragArgsAndRegex$2
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Pair<? extends List<String>, ? extends String> invoke() {
                String str4 = NavDeepLink.this.f7216a;
                if (str4 == null || Uri.parse(str4).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                String fragment = Uri.parse(str4).getFragment();
                StringBuilder sb2 = new StringBuilder();
                NavDeepLink.a(fragment, arrayList2, sb2);
                return new Pair<>(arrayList2, sb2.toString());
            }
        });
        this.f7225k = kotlin.a.b(lazyThreadSafetyMode, new InterfaceC0635a<List<String>>() { // from class: androidx.navigation.NavDeepLink$fragArgs$2
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final List<String> invoke() {
                List<String> list2;
                Pair pair = (Pair) NavDeepLink.this.f7224j.getValue();
                return (pair == null || (list2 = (List) pair.f23089a) == null) ? new ArrayList() : list2;
            }
        });
        this.f7226l = kotlin.a.b(lazyThreadSafetyMode, new InterfaceC0635a<String>() { // from class: androidx.navigation.NavDeepLink$fragRegex$2
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0635a
            public final String invoke() {
                Pair pair = (Pair) NavDeepLink.this.f7224j.getValue();
                if (pair != null) {
                    return (String) pair.f23090b;
                }
                return null;
            }
        });
        this.f7227m = kotlin.a.a(new InterfaceC0635a<Pattern>() { // from class: androidx.navigation.NavDeepLink$fragPattern$2
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Pattern invoke() {
                String str4 = (String) NavDeepLink.this.f7226l.getValue();
                if (str4 != null) {
                    return Pattern.compile(str4, 2);
                }
                return null;
            }
        });
        this.f7229o = kotlin.a.a(new InterfaceC0635a<Pattern>() { // from class: androidx.navigation.NavDeepLink$mimeTypePattern$2
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Pattern invoke() {
                String str4 = NavDeepLink.this.f7228n;
                if (str4 != null) {
                    return Pattern.compile(str4);
                }
                return null;
            }
        });
        if (str != null) {
            StringBuilder sb2 = new StringBuilder("^");
            if (!f7214q.matcher(str).find()) {
                sb2.append("http[s]?://");
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
            matcher.find();
            a(str.substring(0, matcher.start()), arrayList, sb2);
            this.f7230p = (C0969n.Y(sb2, ".*", false) || C0969n.Y(sb2, "([^/]+?)", false)) ? false : true;
            sb2.append("($|(\\?(.)*)|(\\#(.)*))");
            this.f7220e = C0967l.X(sb2.toString(), ".*", "\\E.*\\Q", false);
        }
        if (str3 == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
            throw new IllegalArgumentException(n.a("The given mimeType ", str3, " does not match to required \"type/subtype\" format").toString());
        }
        List d10 = new Regex("/").d(str3);
        if (!d10.isEmpty()) {
            ListIterator listIterator = d10.listIterator(d10.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    list = s.Y(d10, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        list = EmptyList.f23104a;
        this.f7228n = C0967l.X(s3.b.l("^(", (String) list.get(0), "|[*]+)/(", (String) list.get(1), "|[*]+)$"), "*|[*]", "[\\s\\S]", false);
    }

    public static void a(String str, List list, StringBuilder sb2) {
        Matcher matcher = f7215r.matcher(str);
        int i = 0;
        while (matcher.find()) {
            list.add(matcher.group(1));
            if (matcher.start() > i) {
                sb2.append(Pattern.quote(str.substring(i, matcher.start())));
            }
            sb2.append("([^/]*?|)");
            i = matcher.end();
        }
        if (i < str.length()) {
            sb2.append(Pattern.quote(str.substring(i)));
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = this.f7219d;
        Collection values = ((Map) this.f7223h.getValue()).values();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            q.x(arrayList2, ((a) it.next()).f7232b);
        }
        return s.U(s.U(arrayList, arrayList2), (List) this.f7225k.getValue());
    }

    public final Bundle c(Uri uri, LinkedHashMap linkedHashMap) {
        Pattern pattern = (Pattern) this.f7221f.getValue();
        Matcher matcher = pattern != null ? pattern.matcher(uri.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        final Bundle bundle = new Bundle();
        if (!d(matcher, bundle, linkedHashMap)) {
            return null;
        }
        if (((Boolean) this.f7222g.getValue()).booleanValue() && !e(uri, bundle, linkedHashMap)) {
            return null;
        }
        String fragment = uri.getFragment();
        Pattern pattern2 = (Pattern) this.f7227m.getValue();
        Matcher matcher2 = pattern2 != null ? pattern2.matcher(String.valueOf(fragment)) : null;
        if (matcher2 != null && matcher2.matches()) {
            List list = (List) this.f7225k.getValue();
            ArrayList arrayList = new ArrayList(P9.n.u(list, 10));
            int i = 0;
            for (Object obj : list) {
                int i9 = i + 1;
                if (i < 0) {
                    m.t();
                    throw null;
                }
                String str = (String) obj;
                String decode = Uri.decode(matcher2.group(i9));
                U0.g gVar = (U0.g) linkedHashMap.get(str);
                if (gVar != null) {
                    try {
                        k<Object> kVar = gVar.f3597a;
                        kVar.e(bundle, str, kVar.h(decode));
                    } catch (IllegalArgumentException unused) {
                    }
                } else {
                    bundle.putString(str, decode);
                }
                arrayList.add(p.f3034a);
                i = i9;
            }
        }
        if (!Ja.a.q(linkedHashMap, new InterfaceC0646l<String, Boolean>() { // from class: androidx.navigation.NavDeepLink$getMatchingArguments$missingRequiredArguments$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // ca.InterfaceC0646l
            public final Boolean invoke(String str2) {
                return Boolean.valueOf(!bundle.containsKey(str2));
            }
        }).isEmpty()) {
            return null;
        }
        return bundle;
    }

    public final boolean d(Matcher matcher, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.f7219d;
        ArrayList arrayList2 = new ArrayList(P9.n.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i9 = i + 1;
            if (i < 0) {
                m.t();
                throw null;
            }
            String str = (String) next;
            String decode = Uri.decode(matcher.group(i9));
            U0.g gVar = (U0.g) linkedHashMap.get(str);
            if (gVar != null) {
                try {
                    k<Object> kVar = gVar.f3597a;
                    kVar.e(bundle, str, kVar.h(decode));
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } else {
                bundle.putString(str, decode);
            }
            arrayList2.add(p.f3034a);
            i = i9;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        Object obj;
        boolean z10;
        String query;
        for (Map.Entry entry : ((Map) this.f7223h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            a aVar = (a) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.i && (query = uri.getQuery()) != null && !kotlin.jvm.internal.f.b(query, uri.toString())) {
                queryParameters = Collections.singletonList(query);
            }
            int i = 0;
            Bundle b9 = t0.c.b(new Pair[0]);
            Iterator it = aVar.f7232b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                U0.g gVar = (U0.g) linkedHashMap.get(str2);
                k<Object> kVar = gVar != null ? gVar.f3597a : null;
                if ((kVar instanceof U0.b) && !gVar.f3599c) {
                    kVar.e(b9, str2, ((U0.b) kVar).h());
                }
            }
            for (String str3 : queryParameters) {
                String str4 = aVar.f7231a;
                Matcher matcher = str4 != null ? Pattern.compile(str4, 32).matcher(str3) : null;
                if (matcher == null || !matcher.matches()) {
                    return i;
                }
                ArrayList arrayList = aVar.f7232b;
                ArrayList arrayList2 = new ArrayList(P9.n.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                int i9 = i;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        m.t();
                        throw null;
                    }
                    String str5 = (String) next;
                    String group = matcher.group(i10);
                    if (group == null) {
                        group = "";
                    }
                    U0.g gVar2 = (U0.g) linkedHashMap.get(str5);
                    try {
                        if (b9.containsKey(str5)) {
                            if (b9.containsKey(str5)) {
                                if (gVar2 != null) {
                                    k<Object> kVar2 = gVar2.f3597a;
                                    Object a10 = kVar2.a(str5, b9);
                                    if (!b9.containsKey(str5)) {
                                        throw new IllegalArgumentException("There is no previous value in this bundle.");
                                    }
                                    kVar2.e(b9, str5, kVar2.c(a10, group));
                                }
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            obj = Boolean.valueOf(z10);
                        } else {
                            if (gVar2 != null) {
                                k<Object> kVar3 = gVar2.f3597a;
                                kVar3.e(b9, str5, kVar3.h(group));
                            } else {
                                b9.putString(str5, group);
                            }
                            obj = p.f3034a;
                        }
                    } catch (IllegalArgumentException unused) {
                        obj = p.f3034a;
                    }
                    arrayList2.add(obj);
                    i9 = i10;
                    i = 0;
                }
            }
            bundle.putAll(b9);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof NavDeepLink)) {
            return false;
        }
        NavDeepLink navDeepLink = (NavDeepLink) obj;
        return kotlin.jvm.internal.f.b(this.f7216a, navDeepLink.f7216a) && kotlin.jvm.internal.f.b(this.f7217b, navDeepLink.f7217b) && kotlin.jvm.internal.f.b(this.f7218c, navDeepLink.f7218c);
    }

    public final int hashCode() {
        String str = this.f7216a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7217b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7218c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
