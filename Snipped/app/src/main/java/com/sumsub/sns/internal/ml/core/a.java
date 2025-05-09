package com.sumsub.sns.internal.ml.core;

import C.v;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import com.sumsub.sns.internal.core.common.i;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.k;
import okhttp3.p;
import va.h;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.sumsub.sns.internal.ml.core.a$a, reason: collision with other inner class name */
    public static final class C0272a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f17637a;

        /* renamed from: b, reason: collision with root package name */
        public final String f17638b;

        /* renamed from: c, reason: collision with root package name */
        public final String f17639c;

        public C0272a(Context context, String str, String str2) {
            super(null);
            this.f17637a = context;
            this.f17638b = str;
            this.f17639c = str2;
        }

        @Override // com.sumsub.sns.internal.ml.core.a
        public ByteBuffer a() {
            c.b(c.f17674a, this.f17639c, androidx.camera.core.impl.utils.a.n(new StringBuilder("Loading MlModel "), this.f17638b, " from assets"), null, 4, null);
            AssetFileDescriptor openFd = this.f17637a.getAssets().openFd(this.f17638b);
            return new FileInputStream(openFd.getFileDescriptor()).getChannel().map(FileChannel.MapMode.READ_ONLY, openFd.getStartOffset(), openFd.getDeclaredLength());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0272a)) {
                return false;
            }
            C0272a c0272a = (C0272a) obj;
            return kotlin.jvm.internal.f.b(this.f17637a, c0272a.f17637a) && kotlin.jvm.internal.f.b(this.f17638b, c0272a.f17638b) && kotlin.jvm.internal.f.b(this.f17639c, c0272a.f17639c);
        }

        public int hashCode() {
            return this.f17639c.hashCode() + v.c(this.f17637a.hashCode() * 31, 31, this.f17638b);
        }

        public String toString() {
            return i.a(this) + ": " + this.f17638b;
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f17640a;

        /* renamed from: b, reason: collision with root package name */
        public final h f17641b;

        /* renamed from: c, reason: collision with root package name */
        public final String f17642c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f17643d;

        /* renamed from: e, reason: collision with root package name */
        public final String f17644e;

        public b(Context context, h hVar, String str, boolean z10, String str2) {
            super(null);
            this.f17640a = context;
            this.f17641b = hVar;
            this.f17642c = str;
            this.f17643d = z10;
            this.f17644e = str2;
        }

        @Override // com.sumsub.sns.internal.ml.core.a
        public ByteBuffer a() {
            c cVar = c.f17674a;
            c.b(cVar, this.f17644e, "Loading model " + this.f17642c, null, 4, null);
            k.a aVar = new k.a();
            aVar.g(this.f17642c);
            if (!this.f17643d) {
                String cVar2 = okhttp3.c.f24467n.toString();
                if (cVar2.length() == 0) {
                    aVar.f24652c.f("Cache-Control");
                } else {
                    aVar.f24652c.g("Cache-Control", cVar2);
                }
            }
            p execute = this.f17641b.a(aVar.b()).execute();
            try {
                if (execute.j()) {
                    if (execute.i != null) {
                        c.b(cVar, this.f17644e, "Got MlModel from cache", null, 4, null);
                    } else {
                        c.b(cVar, this.f17644e, "Got MlModel from the server", null, 4, null);
                    }
                    byte[] d10 = execute.f24677g.d();
                    ByteBuffer put = ByteBuffer.allocateDirect(d10.length).put(d10);
                    U4.b.d(execute, null);
                    return put;
                }
                c.b(cVar, this.f17644e, "Failed to load model", null, 4, null);
                if (execute.f24674d == 404) {
                    c.b(cVar, this.f17644e, "Model file NOT found", null, 4, null);
                    throw new d();
                }
                throw new IOException("Unexpected code " + execute);
            } finally {
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.f.b(this.f17640a, bVar.f17640a) && kotlin.jvm.internal.f.b(this.f17641b, bVar.f17641b) && kotlin.jvm.internal.f.b(this.f17642c, bVar.f17642c) && this.f17643d == bVar.f17643d && kotlin.jvm.internal.f.b(this.f17644e, bVar.f17644e);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int c2 = v.c((this.f17641b.hashCode() + (this.f17640a.hashCode() * 31)) * 31, 31, this.f17642c);
            boolean z10 = this.f17643d;
            int i = z10;
            if (z10 != 0) {
                i = 1;
            }
            return this.f17644e.hashCode() + ((c2 + i) * 31);
        }

        public String toString() {
            return i.a(this) + ": " + this.f17642c;
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract ByteBuffer a();

    public a() {
    }
}
