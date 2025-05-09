package Na;

import Na.h;
import Qa.t;
import java.util.regex.Pattern;

/* compiled from: HtmlBlockParser.java */
/* loaded from: classes3.dex */
public final class k extends Sa.a {

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern[][] f2906e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* renamed from: b, reason: collision with root package name */
    public final Pattern f2908b;

    /* renamed from: a, reason: collision with root package name */
    public final Qa.j f2907a = new Qa.j();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2909c = false;

    /* renamed from: d, reason: collision with root package name */
    public Na.a f2910d = new Na.a(0, (byte) 0);

    /* compiled from: HtmlBlockParser.java */
    public static class a extends Sa.b {
        @Override // Sa.d
        public final d a(Sa.e eVar, h.a aVar) {
            h hVar = (h) eVar;
            int i = hVar.f2890e;
            CharSequence charSequence = hVar.f2886a;
            if (hVar.f2892g >= 4 || charSequence.charAt(i) != '<') {
                return null;
            }
            for (int i9 = 1; i9 <= 7; i9++) {
                if (i9 != 7 || !(aVar.f2900a.f() instanceof t)) {
                    Pattern[] patternArr = k.f2906e[i9];
                    Pattern pattern = patternArr[0];
                    Pattern pattern2 = patternArr[1];
                    if (pattern.matcher(charSequence.subSequence(i, charSequence.length())).find()) {
                        d dVar = new d(new k(pattern2));
                        dVar.f2865b = hVar.f2887b;
                        return dVar;
                    }
                }
            }
            return null;
        }
    }

    public k(Pattern pattern) {
        this.f2908b = pattern;
    }

    @Override // Sa.a, Sa.c
    public final void c() {
        this.f2907a.f3216f = ((StringBuilder) this.f2910d.f2859c).toString();
        this.f2910d = null;
    }

    @Override // Sa.c
    public final b e(Sa.e eVar) {
        if (this.f2909c) {
            return null;
        }
        h hVar = (h) eVar;
        if (hVar.f2893h && this.f2908b == null) {
            return null;
        }
        return b.a(hVar.f2887b);
    }

    @Override // Sa.c
    public final Qa.a f() {
        return this.f2907a;
    }

    @Override // Sa.a, Sa.c
    public final void g(CharSequence charSequence) {
        Na.a aVar = this.f2910d;
        int i = aVar.f2858b;
        StringBuilder sb2 = (StringBuilder) aVar.f2859c;
        if (i != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        aVar.f2858b++;
        Pattern pattern = this.f2908b;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.f2909c = true;
    }
}
