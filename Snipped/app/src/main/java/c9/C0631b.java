package c9;

import Qa.i;
import Qa.n;
import Qa.v;
import U8.k;
import U8.r;
import U8.s;
import android.text.TextUtils;
import io.noties.markwon.core.CoreProps;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* compiled from: EmphasisHandler.java */
/* renamed from: c9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0631b extends f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8599a;

    @Override // Y8.l
    public final Collection b() {
        switch (this.f8599a) {
            case 0:
                return Arrays.asList("i", "em", "cite", "dfn");
            case 1:
                return Arrays.asList("h1", "h2", "h3", "h4", "h5", "h6");
            case 2:
                return Collections.singleton("a");
            case 3:
                return Arrays.asList("b", "strong");
            case 4:
                return Collections.singleton("sub");
            default:
                return Collections.singleton("sup");
        }
    }

    @Override // c9.f
    public final Object d(U8.g gVar, r rVar, Y8.e eVar) {
        int i;
        s a10;
        switch (this.f8599a) {
            case 0:
                s a11 = ((k) gVar.f3682e).a(Qa.f.class);
                if (a11 == null) {
                    return null;
                }
                return a11.a(gVar, rVar);
            case 1:
                s a12 = ((k) gVar.f3682e).a(i.class);
                if (a12 == null) {
                    return null;
                }
                try {
                    i = Integer.parseInt(eVar.name().substring(1));
                } catch (NumberFormatException e10) {
                    e10.printStackTrace();
                    i = 0;
                }
                if (i < 1 || i > 6) {
                    return null;
                }
                CoreProps.f21672d.b(rVar, Integer.valueOf(i));
                return a12.a(gVar, rVar);
            case 2:
                String str = eVar.d().get("href");
                if (TextUtils.isEmpty(str) || (a10 = ((k) gVar.f3682e).a(n.class)) == null) {
                    return null;
                }
                CoreProps.f21673e.b(rVar, str);
                return a10.a(gVar, rVar);
            case 3:
                s a13 = ((k) gVar.f3682e).a(v.class);
                if (a13 == null) {
                    return null;
                }
                return a13.a(gVar, rVar);
            case 4:
                return new X8.e(2);
            default:
                return new X8.e(3);
        }
    }
}
