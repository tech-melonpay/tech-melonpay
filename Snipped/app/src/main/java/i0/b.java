package I0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;

/* compiled from: EmojiCompatInitializer.java */
/* loaded from: classes.dex */
public final class b implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f1707a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer f1708b;

    public b(EmojiCompatInitializer emojiCompatInitializer, Lifecycle lifecycle) {
        this.f1708b = emojiCompatInitializer;
        this.f1707a = lifecycle;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(r rVar) {
        this.f1708b.getClass();
        (Build.VERSION.SDK_INT >= 28 ? a.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new EmojiCompatInitializer.c(), 500L);
        this.f1707a.c(this);
    }
}
