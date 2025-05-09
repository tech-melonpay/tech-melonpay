package androidx.camera.video.internal.encoder;

import J.t;
import android.view.Surface;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.p;
import java.util.concurrent.Executor;

/* compiled from: Encoder.java */
/* loaded from: classes.dex */
public interface a {

    /* compiled from: Encoder.java */
    /* renamed from: androidx.camera.video.internal.encoder.a$a, reason: collision with other inner class name */
    public interface InterfaceC0065a extends b, BufferProvider<t> {
    }

    /* compiled from: Encoder.java */
    public interface b {
    }

    /* compiled from: Encoder.java */
    public interface c extends b {

        /* compiled from: Encoder.java */
        /* renamed from: androidx.camera.video.internal.encoder.a$c$a, reason: collision with other inner class name */
        public interface InterfaceC0066a {
            void a(Surface surface);
        }

        void a(Executor executor, p pVar);
    }
}
