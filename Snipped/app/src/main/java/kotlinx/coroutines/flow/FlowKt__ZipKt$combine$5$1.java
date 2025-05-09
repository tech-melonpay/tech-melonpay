package kotlinx.coroutines.flow;

import ca.InterfaceC0635a;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import org.bouncycastle.tls.CipherSuite;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Zip.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = CipherSuite.TLS_PSK_WITH_NULL_SHA256)
/* loaded from: classes2.dex */
public final class FlowKt__ZipKt$combine$5$1<T> implements InterfaceC0635a<T[]> {
    final /* synthetic */ Flow<T>[] $flows;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combine$5$1(Flow<? extends T>[] flowArr) {
        this.$flows = flowArr;
    }

    @Override // ca.InterfaceC0635a
    public final T[] invoke() {
        int length = this.$flows.length;
        f.e();
        throw null;
    }
}
