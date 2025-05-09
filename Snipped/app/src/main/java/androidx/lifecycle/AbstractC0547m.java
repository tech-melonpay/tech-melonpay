package androidx.lifecycle;

import ca.InterfaceC0650p;
import com.sumsub.sns.core.presentation.b;
import com.sumsub.sns.presentation.screen.preview.ekyc.eid.b;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Lifecycle.jvm.kt */
/* renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0547m implements CoroutineScope {
    public abstract Lifecycle a();

    public final void b(InterfaceC0650p interfaceC0650p) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new LifecycleCoroutineScope$launchWhenCreated$1(this, interfaceC0650p, null), 3, null);
    }

    public final void c(b.c cVar) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new LifecycleCoroutineScope$launchWhenResumed$1(this, cVar, null), 3, null);
    }

    public final void e(b.C0154b c0154b) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new LifecycleCoroutineScope$launchWhenStarted$1(this, c0154b, null), 3, null);
    }
}
