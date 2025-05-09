package androidx.emoji2.text;

import android.os.Build;
import androidx.emoji2.text.d;

/* compiled from: EmojiCompat.java */
/* loaded from: classes.dex */
public final class c extends d.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d.a f6546a;

    public c(d.a aVar) {
        this.f6546a = aVar;
    }

    @Override // androidx.emoji2.text.d.i
    public final void a(Throwable th) {
        this.f6546a.f6559a.d(th);
    }

    @Override // androidx.emoji2.text.d.i
    public final void b(h hVar) {
        d.a aVar = this.f6546a;
        aVar.f6558c = hVar;
        h hVar2 = aVar.f6558c;
        d dVar = aVar.f6559a;
        aVar.f6557b = new f(hVar2, dVar.f6555g, dVar.i, Build.VERSION.SDK_INT >= 34 ? I0.c.a() : I0.d.a());
        aVar.f6559a.e();
    }
}
