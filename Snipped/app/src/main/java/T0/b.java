package T0;

import R0.a;
import R0.e;
import androidx.collection.h;
import androidx.lifecycle.A;
import androidx.lifecycle.C0559z;
import androidx.lifecycle.Q;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.r;
import java.io.PrintWriter;
import pa.C1124b;

/* compiled from: LoaderManagerImpl.java */
/* loaded from: classes.dex */
public final class b extends T0.a {

    /* renamed from: a, reason: collision with root package name */
    public final r f3435a;

    /* renamed from: b, reason: collision with root package name */
    public final C0043b f3436b;

    /* compiled from: LoaderManagerImpl.java */
    public static class a<D> extends C0559z<D> {
        @Override // androidx.lifecycle.AbstractC0557x
        public final void onActive() {
            throw null;
        }

        @Override // androidx.lifecycle.AbstractC0557x
        public final void onInactive() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.AbstractC0557x
        public final void removeObserver(A<? super D> a10) {
            super.removeObserver(a10);
        }

        @Override // androidx.lifecycle.C0559z, androidx.lifecycle.AbstractC0557x
        public final void setValue(D d10) {
            super.setValue(d10);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #0 : ");
            C1124b.j(null, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: T0.b$b, reason: collision with other inner class name */
    public static class C0043b extends Q {

        /* renamed from: p, reason: collision with root package name */
        public static final a f3437p = new a();

        /* renamed from: k, reason: collision with root package name */
        public final h<a> f3438k = new h<>();

        /* compiled from: LoaderManagerImpl.java */
        /* renamed from: T0.b$b$a */
        public static class a implements T {
            @Override // androidx.lifecycle.T
            public final <T extends Q> T create(Class<T> cls) {
                return new C0043b();
            }
        }

        @Override // androidx.lifecycle.Q
        public final void onCleared() {
            super.onCleared();
            h<a> hVar = this.f3438k;
            if (hVar.f() > 0) {
                hVar.g(0).getClass();
                throw null;
            }
            int i = hVar.f5902d;
            Object[] objArr = hVar.f5901c;
            for (int i9 = 0; i9 < i; i9++) {
                objArr[i9] = null;
            }
            hVar.f5902d = 0;
            hVar.f5899a = false;
        }
    }

    public b(r rVar, W w2) {
        this.f3435a = rVar;
        e eVar = new e(w2, C0043b.f3437p, a.C0040a.f3236b);
        kotlin.jvm.internal.b a10 = kotlin.jvm.internal.h.a(C0043b.class);
        String b9 = a10.b();
        if (b9 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
        this.f3436b = (C0043b) eVar.a(a10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b9));
    }

    @Deprecated
    public final void a(String str, PrintWriter printWriter) {
        h<a> hVar = this.f3436b.f3438k;
        if (hVar.f() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (hVar.f() <= 0) {
                return;
            }
            a g10 = hVar.g(0);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(hVar.d(0));
            printWriter.print(": ");
            printWriter.println(g10.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            throw null;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        C1124b.j(this.f3435a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
