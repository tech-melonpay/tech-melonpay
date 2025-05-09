package kotlinx.coroutines;

import b5.C0588a;
import ca.InterfaceC0635a;
import ka.C0968m;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.internal.ThreadContextKt;

/* compiled from: CoroutineContext.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\r\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a6\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0080\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a:\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0080\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a/\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b*\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001a\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b*\u00020\u001eH\u0080\u0010¢\u0006\u0004\b\u001f\u0010 \"\u0014\u0010\"\u001a\u00020!8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#\"\u001a\u0010&\u001a\u0004\u0018\u00010!*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/d;", "context", "newCoroutineContext", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "addedContext", "(Lkotlin/coroutines/d;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "", "hasCopyableElements", "(Lkotlin/coroutines/d;)Z", "originalContext", "appendContext", "isNewCoroutine", "foldCopies", "(Lkotlin/coroutines/d;Lkotlin/coroutines/d;Z)Lkotlin/coroutines/d;", "T", "", "countOrElement", "Lkotlin/Function0;", "block", "withCoroutineContext", "(Lkotlin/coroutines/d;Ljava/lang/Object;Lca/a;)Ljava/lang/Object;", "LT9/a;", "continuation", "withContinuationContext", "(LT9/a;Ljava/lang/Object;Lca/a;)Ljava/lang/Object;", "oldValue", "Lkotlinx/coroutines/UndispatchedCoroutine;", "updateUndispatchedCompletion", "(LT9/a;Lkotlin/coroutines/d;Ljava/lang/Object;)Lkotlinx/coroutines/UndispatchedCoroutine;", "LV9/c;", "undispatchedCompletion", "(LV9/c;)Lkotlinx/coroutines/UndispatchedCoroutine;", "", "DEBUG_THREAD_NAME_SEPARATOR", "Ljava/lang/String;", "getCoroutineName", "(Lkotlin/coroutines/d;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class CoroutineContextKt {
    private static final String DEBUG_THREAD_NAME_SEPARATOR = " @";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    private static final d foldCopies(d dVar, d dVar2, boolean z10) {
        boolean hasCopyableElements = hasCopyableElements(dVar);
        boolean hasCopyableElements2 = hasCopyableElements(dVar2);
        if (!hasCopyableElements && !hasCopyableElements2) {
            return dVar.plus(dVar2);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f23179a = dVar2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f23155a;
        d dVar3 = (d) dVar.fold(emptyCoroutineContext, new C0968m(z10, 2, ref$ObjectRef));
        if (hasCopyableElements2) {
            ref$ObjectRef.f23179a = ((d) ref$ObjectRef.f23179a).fold(emptyCoroutineContext, new C0588a(17));
        }
        return dVar3.plus((d) ref$ObjectRef.f23179a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, kotlin.coroutines.d] */
    public static final d foldCopies$lambda$1(Ref$ObjectRef ref$ObjectRef, boolean z10, d dVar, d.b bVar) {
        if (!(bVar instanceof CopyableThreadContextElement)) {
            return dVar.plus(bVar);
        }
        d.b bVar2 = ((d) ref$ObjectRef.f23179a).get(bVar.getKey());
        if (bVar2 == null) {
            return dVar.plus(z10 ? ((CopyableThreadContextElement) bVar).copyForChild() : (CopyableThreadContextElement) bVar);
        }
        ref$ObjectRef.f23179a = ((d) ref$ObjectRef.f23179a).minusKey(bVar.getKey());
        return dVar.plus(((CopyableThreadContextElement) bVar).mergeForChild(bVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d foldCopies$lambda$2(d dVar, d.b bVar) {
        return bVar instanceof CopyableThreadContextElement ? dVar.plus(((CopyableThreadContextElement) bVar).copyForChild()) : dVar.plus(bVar);
    }

    public static final String getCoroutineName(d dVar) {
        return null;
    }

    private static final boolean hasCopyableElements(d dVar) {
        return ((Boolean) dVar.fold(Boolean.FALSE, new C0588a(16))).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasCopyableElements$lambda$0(boolean z10, d.b bVar) {
        return z10 || (bVar instanceof CopyableThreadContextElement);
    }

    @ExperimentalCoroutinesApi
    public static final d newCoroutineContext(CoroutineScope coroutineScope, d dVar) {
        d foldCopies = foldCopies(coroutineScope.getCoroutineContext(), dVar, true);
        return (foldCopies == Dispatchers.getDefault() || foldCopies.get(c.a.f23157a) != null) ? foldCopies : foldCopies.plus(Dispatchers.getDefault());
    }

    public static final UndispatchedCoroutine<?> undispatchedCompletion(V9.c cVar) {
        while (!(cVar instanceof DispatchedCoroutine) && (cVar = cVar.getCallerFrame()) != null) {
            if (cVar instanceof UndispatchedCoroutine) {
                return (UndispatchedCoroutine) cVar;
            }
        }
        return null;
    }

    public static final UndispatchedCoroutine<?> updateUndispatchedCompletion(T9.a<?> aVar, d dVar, Object obj) {
        if (!(aVar instanceof V9.c) || dVar.get(UndispatchedMarker.INSTANCE) == null) {
            return null;
        }
        UndispatchedCoroutine<?> undispatchedCompletion = undispatchedCompletion((V9.c) aVar);
        if (undispatchedCompletion != null) {
            undispatchedCompletion.saveThreadContext(dVar, obj);
        }
        return undispatchedCompletion;
    }

    public static final <T> T withContinuationContext(T9.a<?> aVar, Object obj, InterfaceC0635a<? extends T> interfaceC0635a) {
        d context = aVar.getContext();
        Object updateThreadContext = ThreadContextKt.updateThreadContext(context, obj);
        UndispatchedCoroutine<?> updateUndispatchedCompletion = updateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? updateUndispatchedCompletion(aVar, context, updateThreadContext) : null;
        try {
            return interfaceC0635a.invoke();
        } finally {
            if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(context, updateThreadContext);
            }
        }
    }

    public static final <T> T withCoroutineContext(d dVar, Object obj, InterfaceC0635a<? extends T> interfaceC0635a) {
        Object updateThreadContext = ThreadContextKt.updateThreadContext(dVar, obj);
        try {
            return interfaceC0635a.invoke();
        } finally {
            ThreadContextKt.restoreThreadContext(dVar, updateThreadContext);
        }
    }

    @InternalCoroutinesApi
    public static final d newCoroutineContext(d dVar, d dVar2) {
        return !hasCopyableElements(dVar2) ? dVar.plus(dVar2) : foldCopies(dVar, dVar2, false);
    }
}
