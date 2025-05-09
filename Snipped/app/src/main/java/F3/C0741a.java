package f3;

import B1.f;
import android.content.Context;
import android.util.Log;
import androidx.camera.core.n;
import b3.InterfaceC0586a;
import b3.e;
import b3.g;
import b3.h;
import b3.q;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.a;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import i3.t;
import i3.x;
import i3.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* compiled from: AndroidKeysetManager.java */
/* renamed from: f3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0741a {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f20622c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0586a f20623a;

    /* renamed from: b, reason: collision with root package name */
    public final h f20624b;

    /* compiled from: AndroidKeysetManager.java */
    /* renamed from: f3.a$a, reason: collision with other inner class name */
    public static final class C0397a {

        /* renamed from: a, reason: collision with root package name */
        public f f20625a = null;

        /* renamed from: b, reason: collision with root package name */
        public d f20626b = null;

        /* renamed from: c, reason: collision with root package name */
        public String f20627c = null;

        /* renamed from: d, reason: collision with root package name */
        public C0742b f20628d = null;

        /* renamed from: e, reason: collision with root package name */
        public e f20629e = null;

        /* renamed from: f, reason: collision with root package name */
        public h f20630f;

        public final synchronized C0741a a() {
            try {
                if (this.f20627c != null) {
                    this.f20628d = c();
                }
                this.f20630f = b();
            } catch (Throwable th) {
                throw th;
            }
            return new C0741a(this);
        }

        public final h b() {
            try {
                C0742b c0742b = this.f20628d;
                if (c0742b != null) {
                    try {
                        g b9 = g.b(this.f20625a, c0742b);
                        GeneratedMessageLite.MethodToInvoke methodToInvoke = GeneratedMessageLite.MethodToInvoke.f10112e;
                        com.google.crypto.tink.proto.a aVar = b9.f8297a;
                        GeneratedMessageLite.a aVar2 = (GeneratedMessageLite.a) aVar.k(methodToInvoke);
                        aVar2.i();
                        GeneratedMessageLite.a.j(aVar2.f10116b, aVar);
                        return new h((a.C0107a) aVar2);
                    } catch (InvalidProtocolBufferException | GeneralSecurityException e10) {
                        Log.w("a", "cannot decrypt keyset: ", e10);
                    }
                }
                com.google.crypto.tink.proto.a A10 = com.google.crypto.tink.proto.a.A(this.f20625a.s(), C0666m.a());
                if (A10.w() <= 0) {
                    throw new GeneralSecurityException("empty keyset");
                }
                GeneratedMessageLite.a aVar3 = (GeneratedMessageLite.a) A10.k(GeneratedMessageLite.MethodToInvoke.f10112e);
                aVar3.i();
                GeneratedMessageLite.a.j(aVar3.f10116b, A10);
                return new h((a.C0107a) aVar3);
            } catch (FileNotFoundException e11) {
                Log.w("a", "keyset not found, will generate a new one", e11);
                if (this.f20629e == null) {
                    throw new GeneralSecurityException("cannot read or generate keyset");
                }
                a.C0107a z10 = com.google.crypto.tink.proto.a.z();
                h hVar = new h(z10);
                e eVar = this.f20629e;
                synchronized (hVar) {
                    x xVar = eVar.f8291a;
                    synchronized (hVar) {
                        a.b c2 = hVar.c(xVar);
                        z10.i();
                        com.google.crypto.tink.proto.a.u((com.google.crypto.tink.proto.a) z10.f10116b, c2);
                        int x9 = q.a(hVar.a().f8297a).v().x();
                        synchronized (hVar) {
                            for (int i = 0; i < ((com.google.crypto.tink.proto.a) hVar.f8298a.f10116b).w(); i++) {
                                a.b v10 = ((com.google.crypto.tink.proto.a) hVar.f8298a.f10116b).v(i);
                                if (v10.y() == x9) {
                                    if (!v10.A().equals(KeyStatusType.ENABLED)) {
                                        throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + x9);
                                    }
                                    a.C0107a c0107a = hVar.f8298a;
                                    c0107a.i();
                                    com.google.crypto.tink.proto.a.t((com.google.crypto.tink.proto.a) c0107a.f10116b, x9);
                                    if (this.f20628d != null) {
                                        g a10 = hVar.a();
                                        d dVar = this.f20626b;
                                        C0742b c0742b2 = this.f20628d;
                                        com.google.crypto.tink.proto.a aVar4 = a10.f8297a;
                                        byte[] a11 = c0742b2.a(aVar4.toByteArray(), new byte[0]);
                                        try {
                                            if (!com.google.crypto.tink.proto.a.A(c0742b2.decrypt(a11, new byte[0]), C0666m.a()).equals(aVar4)) {
                                                throw new GeneralSecurityException("cannot encrypt keyset");
                                            }
                                            t.a w2 = t.w();
                                            ByteString c10 = ByteString.c(0, a11.length, a11);
                                            w2.i();
                                            t.t((t) w2.f10116b, c10);
                                            z a12 = q.a(aVar4);
                                            w2.i();
                                            t.u((t) w2.f10116b, a12);
                                            t g10 = w2.g();
                                            dVar.getClass();
                                            if (!dVar.f20635a.putString(dVar.f20636b, j3.e.n(g10.toByteArray())).commit()) {
                                                throw new IOException("Failed to write to SharedPreferences");
                                            }
                                        } catch (InvalidProtocolBufferException unused) {
                                            throw new GeneralSecurityException("invalid keyset, corrupted key material");
                                        }
                                    } else {
                                        g a13 = hVar.a();
                                        d dVar2 = this.f20626b;
                                        com.google.crypto.tink.proto.a aVar5 = a13.f8297a;
                                        dVar2.getClass();
                                        if (!dVar2.f20635a.putString(dVar2.f20636b, j3.e.n(aVar5.toByteArray())).commit()) {
                                            throw new IOException("Failed to write to SharedPreferences");
                                        }
                                    }
                                    return hVar;
                                }
                            }
                            throw new GeneralSecurityException("key not found: " + x9);
                        }
                    }
                }
            }
        }

        public final C0742b c() {
            C0743c c0743c = new C0743c();
            boolean d10 = c0743c.d(this.f20627c);
            if (!d10) {
                try {
                    C0743c.c(this.f20627c);
                } catch (GeneralSecurityException | ProviderException e10) {
                    Log.w("a", "cannot use Android Keystore, it'll be disabled", e10);
                    return null;
                }
            }
            try {
                return c0743c.b(this.f20627c);
            } catch (GeneralSecurityException | ProviderException e11) {
                if (d10) {
                    throw new KeyStoreException(n.a("the master key ", this.f20627c, " exists but is unusable"), e11);
                }
                Log.w("a", "cannot use Android Keystore, it'll be disabled", e11);
                return null;
            }
        }

        public final void d(Context context, String str) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            this.f20625a = new f(context, str);
            this.f20626b = new d(context, str);
        }
    }

    public C0741a(C0397a c0397a) {
        d dVar = c0397a.f20626b;
        C0742b c0742b = c0397a.f20628d;
        this.f20624b = c0397a.f20630f;
    }
}
