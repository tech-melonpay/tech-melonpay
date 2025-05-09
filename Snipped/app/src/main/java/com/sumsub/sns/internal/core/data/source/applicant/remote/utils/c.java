package com.sumsub.sns.internal.core.data.source.applicant.remote.utils;

import Ka.d;
import Ka.h;
import U4.b;
import com.sumsub.sns.internal.core.data.model.IdentitySide;
import com.sumsub.sns.internal.core.data.model.remote.k;
import com.sumsub.sns.internal.core.data.model.remote.l;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.i;
import okhttp3.j;
import okhttp3.l;
import okhttp3.o;
import org.json.JSONObject;
import qb.q;

/* loaded from: classes2.dex */
public final class c {

    public static final class a extends o {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f16070a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InputStream f16071b;

        public a(i iVar, InputStream inputStream) {
            this.f16070a = iVar;
            this.f16071b = inputStream;
        }

        @Override // okhttp3.o
        public long contentLength() {
            return this.f16071b.available();
        }

        @Override // okhttp3.o
        public i contentType() {
            return this.f16070a;
        }

        @Override // okhttp3.o
        public void writeTo(h hVar) {
            d C10 = Ja.a.C(this.f16071b);
            try {
                hVar.c0(C10);
                b.d(C10, null);
            } finally {
            }
        }
    }

    public static final j.c a(File file, o oVar) {
        String name = file.getName();
        if (oVar == null) {
            o.a aVar = o.Companion;
            Pattern pattern = i.f24542d;
            i b9 = i.a.b("multipart/form-data");
            aVar.getClass();
            oVar = new l(b9, file);
        }
        return j.c.a.a(name, oVar);
    }

    public static final j.c a(InputStream inputStream) {
        String str = System.currentTimeMillis() + "_file.jpg";
        Pattern pattern = i.f24542d;
        return j.c.a.a(str, a(inputStream, i.a.b("multipart/form-data")));
    }

    public static final o a(String str, String str2, IdentitySide identitySide) {
        String value;
        if (str2 == null) {
            str2 = "FILE_ATTACHMENT";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("country", str);
        jSONObject.put("idDocType", str2);
        if (identitySide != null && (value = identitySide.getValue()) != null) {
            jSONObject.put("idDocSubType", value);
        }
        o.a aVar = o.Companion;
        String jSONObject2 = jSONObject.toString();
        Pattern pattern = i.f24542d;
        i b9 = i.a.b("multipart/form-data");
        aVar.getClass();
        return o.a.a(b9, jSONObject2);
    }

    public static final o a(InputStream inputStream, i iVar) {
        return new a(iVar, inputStream);
    }

    public static final k a(q<com.sumsub.sns.internal.core.data.model.remote.l> qVar) {
        k kVar;
        com.sumsub.sns.internal.core.data.model.remote.l lVar = qVar.f26066b;
        if (lVar != null) {
            Long e10 = lVar.e();
            String l10 = e10 != null ? e10.toString() : null;
            l.c c2 = lVar.c();
            kVar = new k(c2 != null ? c2.b() : null, (String) null, (IdentitySide) null, (List) null, (List) null, (List) null, l10, 62, (DefaultConstructorMarker) null);
        } else {
            kVar = null;
        }
        String a10 = qVar.f26065a.f24676f.a("X-Image-Id");
        if (a10 == null) {
            return kVar;
        }
        k a11 = kVar != null ? k.a(kVar, null, null, null, null, null, null, a10, 63, null) : null;
        return a11 == null ? kVar : a11;
    }
}
