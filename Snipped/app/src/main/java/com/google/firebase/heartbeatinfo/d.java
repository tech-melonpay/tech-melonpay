package com.google.firebase.heartbeatinfo;

import ca.InterfaceC0635a;
import com.sumsub.sns.internal.ml.core.b;
import io.sentry.InterfaceC0862u;
import io.sentry.Session;
import io.sentry.Z;
import io.sentry.g0;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10296a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10297b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10298c;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.f10296a = i;
        this.f10297b = obj;
        this.f10298c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Void lambda$storeHeartBeatInfo$3;
        ByteArrayOutputStream byteArrayOutputStream;
        BufferedWriter bufferedWriter;
        switch (this.f10296a) {
            case 0:
                lambda$storeHeartBeatInfo$3 = ((DefaultHeartBeatInfo) this.f10297b).lambda$storeHeartBeatInfo$3((String) this.f10298c);
                return lambda$storeHeartBeatInfo$3;
            case 1:
                return com.sumsub.sns.internal.fingerprint.tools.threading.safe.c.a((AtomicReference) this.f10297b, (InterfaceC0635a) this.f10298c);
            case 2:
                return b.i.a((com.sumsub.sns.internal.ml.core.b) this.f10297b, this.f10298c);
            case 3:
                InterfaceC0862u interfaceC0862u = (InterfaceC0862u) this.f10297b;
                C9.b bVar = (C9.b) this.f10298c;
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, g0.f22003d));
                    try {
                        interfaceC0862u.m(bVar, bufferedWriter2);
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        bufferedWriter2.close();
                        byteArrayOutputStream2.close();
                        return byteArray;
                    } finally {
                        try {
                            bufferedWriter2.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                } finally {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            case 4:
                InterfaceC0862u interfaceC0862u2 = (InterfaceC0862u) this.f10297b;
                Session session = (Session) this.f10298c;
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, g0.f22003d));
                    try {
                        interfaceC0862u2.m(session, bufferedWriter);
                        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray2;
                    } finally {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                } finally {
                }
            default:
                InterfaceC0862u interfaceC0862u3 = (InterfaceC0862u) this.f10297b;
                Z z10 = (Z) this.f10298c;
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, g0.f22003d));
                    try {
                        interfaceC0862u3.m(z10, bufferedWriter);
                        byte[] byteArray3 = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray3;
                    } finally {
                    }
                } finally {
                }
        }
    }
}
