package fa;

import java.util.Random;

/* compiled from: PlatformRandom.kt */
/* renamed from: fa.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0755b extends AbstractC0754a {

    /* renamed from: c, reason: collision with root package name */
    public final a f20721c = new a();

    /* compiled from: PlatformRandom.kt */
    /* renamed from: fa.b$a */
    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        public final Random initialValue() {
            return new Random();
        }
    }

    @Override // fa.AbstractC0754a
    public final Random d() {
        return this.f20721c.get();
    }
}
