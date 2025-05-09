package androidx.camera.video;

import android.util.Range;
import androidx.camera.video.b;

/* compiled from: AudioSpec.java */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Range<Integer> f5571a = new Range<>(0, Integer.MAX_VALUE);

    /* renamed from: b, reason: collision with root package name */
    public static final Range<Integer> f5572b = new Range<>(0, Integer.MAX_VALUE);

    /* compiled from: AudioSpec.java */
    /* renamed from: androidx.camera.video.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0064a {
    }

    static {
        b.a a10 = a();
        a10.f5582e = 0;
        a10.a();
    }

    public static b.a a() {
        b.a aVar = new b.a();
        aVar.f5579b = -1;
        aVar.f5580c = -1;
        aVar.f5582e = -1;
        Range<Integer> range = f5571a;
        if (range == null) {
            throw new NullPointerException("Null bitrate");
        }
        aVar.f5578a = range;
        Range<Integer> range2 = f5572b;
        if (range2 == null) {
            throw new NullPointerException("Null sampleRate");
        }
        aVar.f5581d = range2;
        return aVar;
    }

    public abstract Range<Integer> b();

    public abstract int c();

    public abstract Range<Integer> d();

    public abstract int e();

    public abstract int f();
}
