package com.squareup.picasso;

import P8.h;
import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.m;
import java.io.IOException;
import okhttp3.c;
import okhttp3.k;
import okhttp3.p;

/* loaded from: classes2.dex */
public final class NetworkRequestHandler extends m {

    /* renamed from: a, reason: collision with root package name */
    public final P8.c f13367a;

    /* renamed from: b, reason: collision with root package name */
    public final P8.h f13368b;

    public static class ContentLengthException extends IOException {
    }

    public static final class ResponseException extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f13369a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13370b;

        public ResponseException(int i) {
            super(com.google.android.gms.measurement.internal.a.g(i, "HTTP "));
            this.f13369a = i;
            this.f13370b = 0;
        }
    }

    public NetworkRequestHandler(P8.c cVar, P8.h hVar) {
        this.f13367a = cVar;
        this.f13368b = hVar;
    }

    @Override // com.squareup.picasso.m
    public final boolean b(k kVar) {
        String scheme = kVar.f13467c.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    @Override // com.squareup.picasso.m
    public final int d() {
        return 2;
    }

    @Override // com.squareup.picasso.m
    public final m.a e(k kVar, int i) {
        okhttp3.c cVar;
        if (i == 0) {
            cVar = null;
        } else if ((i & 4) != 0) {
            cVar = okhttp3.c.f24468o;
        } else {
            c.a aVar = new c.a();
            if ((i & 1) != 0) {
                aVar.f24481a = true;
            }
            if ((i & 2) != 0) {
                aVar.f24482b = true;
            }
            cVar = aVar.a();
        }
        k.a aVar2 = new k.a();
        aVar2.g(kVar.f13467c.toString());
        if (cVar != null) {
            String cVar2 = cVar.toString();
            if (cVar2.length() == 0) {
                aVar2.f24652c.f("Cache-Control");
            } else {
                aVar2.f24652c.g("Cache-Control", cVar2);
            }
        }
        p execute = ((P8.g) this.f13367a).f3113a.a(aVar2.b()).execute();
        boolean j10 = execute.j();
        va.i iVar = execute.f24677g;
        if (!j10) {
            iVar.close();
            throw new ResponseException(execute.f24674d);
        }
        Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.DISK;
        Picasso.LoadedFrom loadedFrom2 = Picasso.LoadedFrom.NETWORK;
        Picasso.LoadedFrom loadedFrom3 = execute.i == null ? loadedFrom2 : loadedFrom;
        if (loadedFrom3 == loadedFrom && iVar.i() == 0) {
            iVar.close();
            throw new ContentLengthException("Received response with 0 content-length header.");
        }
        if (loadedFrom3 == loadedFrom2 && iVar.i() > 0) {
            long i9 = iVar.i();
            h.a aVar3 = this.f13368b.f3115b;
            aVar3.sendMessage(aVar3.obtainMessage(4, Long.valueOf(i9)));
        }
        return new m.a(iVar.p(), loadedFrom3);
    }

    @Override // com.squareup.picasso.m
    public final boolean f(NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }
}
