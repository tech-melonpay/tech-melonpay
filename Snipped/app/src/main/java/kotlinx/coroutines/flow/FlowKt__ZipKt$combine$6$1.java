package kotlinx.coroutines.flow;

import ca.InterfaceC0635a;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import org.bouncycastle.tls.CipherSuite;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Zip.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = CipherSuite.TLS_PSK_WITH_NULL_SHA256)
/* loaded from: classes2.dex */
public final class FlowKt__ZipKt$combine$6$1<T> implements InterfaceC0635a<T[]> {
    final /* synthetic */ Flow<T>[] $flowArray;

    public FlowKt__ZipKt$combine$6$1(Flow<T>[] flowArr) {
        this.$flowArray = flowArr;
    }

    @Override // ca.InterfaceC0635a
    public final T[] invoke() {
        int length = this.$flowArray.length;
        f.e();
        throw null;
    }
}
