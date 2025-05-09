package k2;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MetadataBackendRegistry.java */
/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: a, reason: collision with root package name */
    public final a f22935a;

    /* renamed from: b, reason: collision with root package name */
    public final g f22936b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f22937c;

    /* compiled from: MetadataBackendRegistry.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f22938a;

        /* renamed from: b, reason: collision with root package name */
        public Map<String, String> f22939b = null;

        public a(Context context) {
            this.f22938a = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final k2.c a(java.lang.String r14) {
            /*
                Method dump skipped, instructions count: 269
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: k2.i.a.a(java.lang.String):k2.c");
        }
    }

    public i(Context context, g gVar) {
        a aVar = new a(context);
        this.f22937c = new HashMap();
        this.f22935a = aVar;
        this.f22936b = gVar;
    }

    @Override // k2.d
    public final synchronized j get(String str) {
        if (this.f22937c.containsKey(str)) {
            return (j) this.f22937c.get(str);
        }
        c a10 = this.f22935a.a(str);
        if (a10 == null) {
            return null;
        }
        g gVar = this.f22936b;
        j create = a10.create(new b(gVar.f22928a, gVar.f22929b, gVar.f22930c, str));
        this.f22937c.put(str, create);
        return create;
    }
}
