package ga;

import fa.AbstractC0754a;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: PlatformThreadLocalRandom.kt */
/* renamed from: ga.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0773a extends AbstractC0754a {
    @Override // kotlin.random.Random
    public final int c(int i, int i9) {
        return ThreadLocalRandom.current().nextInt(i, i9);
    }

    @Override // fa.AbstractC0754a
    public final Random d() {
        return ThreadLocalRandom.current();
    }
}
