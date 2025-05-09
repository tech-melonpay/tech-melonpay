package fa;

import kotlin.random.Random;

/* compiled from: PlatformRandom.kt */
/* renamed from: fa.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0754a extends Random {
    @Override // kotlin.random.Random
    public final int a(int i) {
        return ((-i) >> 31) & (d().nextInt() >>> (32 - i));
    }

    @Override // kotlin.random.Random
    public final int b() {
        return d().nextInt();
    }

    public abstract java.util.Random d();

    public final int e(int i) {
        return d().nextInt(i);
    }
}
