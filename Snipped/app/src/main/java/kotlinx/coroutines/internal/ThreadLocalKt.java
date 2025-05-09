package kotlinx.coroutines.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* compiled from: ThreadLocal.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u0002H\u00010\u0002j\b\u0012\u0004\u0012\u0002H\u0001`\u0004\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\u0010\u0007*\u001e\b\u0000\u0010\u0000\u001a\u0004\b\u0000\u0010\u0001\"\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0002¨\u0006\b"}, d2 = {"CommonThreadLocal", "T", "Ljava/lang/ThreadLocal;", "commonThreadLocal", "Lkotlinx/coroutines/internal/CommonThreadLocal;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lkotlinx/coroutines/internal/Symbol;", "(Lkotlinx/coroutines/internal/Symbol;)Ljava/lang/ThreadLocal;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ThreadLocalKt {
    public static final <T> ThreadLocal<T> commonThreadLocal(Symbol symbol) {
        return new ThreadLocal<>();
    }

    public static /* synthetic */ void CommonThreadLocal$annotations() {
    }
}
