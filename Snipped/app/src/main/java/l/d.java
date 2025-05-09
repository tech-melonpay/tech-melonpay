package L;

import androidx.camera.core.impl.Timebase;

/* compiled from: VideoTimebaseConverter.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final D9.b f2359a;

    /* renamed from: b, reason: collision with root package name */
    public long f2360b = -1;

    /* renamed from: c, reason: collision with root package name */
    public Timebase f2361c;

    /* compiled from: VideoTimebaseConverter.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2362a;

        static {
            int[] iArr = new int[Timebase.values().length];
            f2362a = iArr;
            try {
                iArr[Timebase.REALTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2362a[Timebase.UPTIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public d(D9.b bVar, Timebase timebase) {
        this.f2359a = bVar;
        this.f2361c = timebase;
    }
}
