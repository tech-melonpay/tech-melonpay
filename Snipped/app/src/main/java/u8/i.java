package U8;

import Ra.c;
import U8.g;
import U8.j;
import U8.l;
import V8.p;

/* compiled from: MarkwonPlugin.java */
/* loaded from: classes2.dex */
public interface i {

    /* compiled from: MarkwonPlugin.java */
    public interface a {
    }

    void afterRender(Qa.r rVar, l lVar);

    void beforeRender(Qa.r rVar);

    void configure(a aVar);

    void configureConfiguration(g.a aVar);

    void configureParser(c.a aVar);

    void configureSpansFactory(j.a aVar);

    void configureTheme(p.a aVar);

    void configureVisitor(l.b bVar);

    String processMarkdown(String str);
}
