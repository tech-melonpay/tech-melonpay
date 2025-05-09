package com.sumsub.sentry;

import com.bumptech.glide.load.Key;
import com.sumsub.log.logger.Logger;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import sa.AbstractC1244a;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f13714a = new m();

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1244a f13715b = com.sumsub.sns.internal.core.common.x.a(false, 1, null);

    public final void a(v vVar, OutputStream outputStream) {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), Key.STRING_CHARSET_NAME));
        try {
            w a10 = vVar.a();
            AbstractC1244a abstractC1244a = f13715b;
            bufferedWriter.write(abstractC1244a.b(j3.e.B(abstractC1244a.f27066b, kotlin.jvm.internal.h.d(w.class)), a10));
            bufferedWriter.write("\n");
            for (x xVar : vVar.b()) {
                try {
                    y b9 = xVar.b();
                    AbstractC1244a abstractC1244a2 = f13715b;
                    bufferedWriter.write(abstractC1244a2.b(j3.e.B(abstractC1244a2.f27066b, kotlin.jvm.internal.h.d(y.class)), b9));
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(xVar.a());
                    bufferedWriter.write("\n");
                } catch (Exception e10) {
                    Logger.e$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(f13714a), "Failed to serialize item: " + xVar + '\n' + e10, null, 4, null);
                }
            }
        } finally {
            bufferedWriter.flush();
        }
    }
}
