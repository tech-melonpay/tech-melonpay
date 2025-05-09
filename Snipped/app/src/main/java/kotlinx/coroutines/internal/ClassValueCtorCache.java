package kotlinx.coroutines.internal;

import ca.InterfaceC0646l;
import kotlin.Metadata;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: ExceptionsConstructor.kt */
@Metadata(d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u000b\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007j\u0002`\b2\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/internal/ClassValueCtorCache;", "Lkotlinx/coroutines/internal/CtorCache;", "<init>", "()V", "Ljava/lang/Class;", "", "key", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "get", "(Ljava/lang/Class;)Lca/l;", "kotlinx/coroutines/internal/ClassValueCtorCache$cache$1", "cache", "Lkotlinx/coroutines/internal/ClassValueCtorCache$cache$1;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
@IgnoreJRERequirement
/* loaded from: classes2.dex */
final class ClassValueCtorCache extends CtorCache {
    public static final ClassValueCtorCache INSTANCE = new ClassValueCtorCache();
    private static final ClassValueCtorCache$cache$1 cache = new ClassValue<InterfaceC0646l<? super Throwable, ? extends Throwable>>() { // from class: kotlinx.coroutines.internal.ClassValueCtorCache$cache$1
        @Override // java.lang.ClassValue
        /* renamed from: computeValue, reason: avoid collision after fix types in other method */
        public /* bridge */ /* synthetic */ InterfaceC0646l<? super Throwable, ? extends Throwable> computeValue2(Class cls) {
            return computeValue((Class<?>) cls);
        }

        @Override // java.lang.ClassValue
        public InterfaceC0646l<? super Throwable, ? extends Throwable> computeValue(Class<?> type) {
            InterfaceC0646l<? super Throwable, ? extends Throwable> createConstructor;
            createConstructor = ExceptionsConstructorKt.createConstructor(type);
            return createConstructor;
        }
    };

    private ClassValueCtorCache() {
    }

    @Override // kotlinx.coroutines.internal.CtorCache
    public InterfaceC0646l<Throwable, Throwable> get(Class<? extends Throwable> key) {
        Object obj;
        obj = cache.get(key);
        return (InterfaceC0646l) obj;
    }
}
