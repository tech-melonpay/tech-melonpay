package f;

import android.content.Context;
import android.content.Intent;
import java.io.Serializable;

/* compiled from: ActivityResultContract.kt */
/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0728a<I, O> {

    /* compiled from: ActivityResultContract.kt */
    /* renamed from: f.a$a, reason: collision with other inner class name */
    public static final class C0395a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f20573a;

        /* JADX WARN: Multi-variable type inference failed */
        public C0395a(Serializable serializable) {
            this.f20573a = serializable;
        }
    }

    public abstract Intent createIntent(Context context, I i);

    public C0395a<O> getSynchronousResult(Context context, I i) {
        return null;
    }

    public abstract O parseResult(int i, Intent intent);
}
