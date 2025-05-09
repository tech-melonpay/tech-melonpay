package androidx.emoji2.text;

import androidx.emoji2.text.d;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: EmojiCompatInitializer.java */
/* loaded from: classes.dex */
public final class e extends d.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d.i f6565a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f6566b;

    public e(d.i iVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f6565a = iVar;
        this.f6566b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.d.i
    public final void a(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f6566b;
        try {
            this.f6565a.a(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // androidx.emoji2.text.d.i
    public final void b(h hVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f6566b;
        try {
            this.f6565a.b(hVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
