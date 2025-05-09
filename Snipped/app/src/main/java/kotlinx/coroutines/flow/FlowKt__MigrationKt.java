package kotlinx.coroutines.flow;

import O9.p;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import ca.InterfaceC0651q;
import ca.InterfaceC0652r;
import ca.s;
import ca.t;
import kotlin.Metadata;

/* compiled from: Migration.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\b\u001a-\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\n\u0010\b\u001a3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aC\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0007¢\u0006\u0004\b\u0010\u0010\u0016\u001ag\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00122\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0007¢\u0006\u0004\b\u0010\u0010\u0019\u001aU\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00042(\u0010\u001b\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001aE\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a+\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004H\u0007¢\u0006\u0004\b!\u0010\"\u001a+\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004H\u0007¢\u0006\u0004\b#\u0010\"\u001aK\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001e\u0010$\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u001eH\u0007¢\u0006\u0004\b%\u0010 \u001a-\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b(\u0010)\u001aC\u0010+\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\"\u0010*\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0007¢\u0006\u0004\b+\u0010\u0016\u001a_\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010,\u001a\u00028\u00012*\b\u0001\u0010.\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140-H\u0007¢\u0006\u0004\b/\u00100\u001a-\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000b\u001a\u00028\u0000H\u0007¢\u0006\u0004\b1\u00102\u001aC\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000b\u001a\u00028\u00002\u0014\b\u0002\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u0002030\u001eH\u0007¢\u0006\u0004\b1\u00105\u001a-\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u00106\u001a\u00028\u0000H\u0007¢\u0006\u0004\b7\u00102\u001a3\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b7\u0010\r\u001a-\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u00106\u001a\u00028\u0000H\u0007¢\u0006\u0004\b9\u00102\u001a3\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b9\u0010\r\u001ai\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b\u0000\u0010:\"\u0004\b\u0001\u0010;\"\u0004\b\u0002\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042(\u0010<\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140-H\u0007¢\u0006\u0004\b=\u0010>\u001a\u0083\u0001\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00030\u0004\"\u0004\b\u0000\u0010:\"\u0004\b\u0001\u0010;\"\u0004\b\u0002\u0010?\"\u0004\b\u0003\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042.\u0010<\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140AH\u0007¢\u0006\u0004\b=\u0010B\u001a\u009d\u0001\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00040\u0004\"\u0004\b\u0000\u0010:\"\u0004\b\u0001\u0010;\"\u0004\b\u0002\u0010?\"\u0004\b\u0003\u0010C\"\u0004\b\u0004\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\f\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00030\u000424\u0010<\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140EH\u0007¢\u0006\u0004\b=\u0010F\u001a·\u0001\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00050\u0004\"\u0004\b\u0000\u0010:\"\u0004\b\u0001\u0010;\"\u0004\b\u0002\u0010?\"\u0004\b\u0003\u0010C\"\u0004\b\u0004\u0010G\"\u0004\b\u0005\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\f\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00030\u00042\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00040\u00042:\u0010<\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140IH\u0007¢\u0006\u0004\b=\u0010J\u001a-\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010L\u001a\u00020KH\u0007¢\u0006\u0004\bM\u0010N\u001a-\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010L\u001a\u00020KH\u0007¢\u0006\u0004\bO\u0010N\u001aU\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00042(\u0010<\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0007¢\u0006\u0004\bP\u0010\u001d\u001aO\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042(\u0010.\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140-H\u0007¢\u0006\u0004\bQ\u0010R\u001a%\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\bS\u0010\"\u001a-\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010T\u001a\u00020&H\u0007¢\u0006\u0004\bS\u0010)\u001a%\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\bU\u0010\"\u001a-\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010T\u001a\u00020&H\u0007¢\u0006\u0004\bU\u0010)\u001a%\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\bV\u0010\"¨\u0006W"}, d2 = {"", "noImpl", "()Ljava/lang/Void;", "T", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/coroutines/d;", "context", "observeOn", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/d;)Lkotlinx/coroutines/flow/Flow;", "publishOn", "subscribeOn", "fallback", "onErrorResume", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "onErrorResumeNext", "LO9/p;", "subscribe", "(Lkotlinx/coroutines/flow/Flow;)V", "Lkotlin/Function2;", "LT9/a;", "", "onEach", "(Lkotlinx/coroutines/flow/Flow;Lca/p;)V", "", "onError", "(Lkotlinx/coroutines/flow/Flow;Lca/p;Lca/p;)V", "R", "mapper", "flatMap", "(Lkotlinx/coroutines/flow/Flow;Lca/p;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function1;", "concatMap", "(Lkotlinx/coroutines/flow/Flow;Lca/l;)Lkotlinx/coroutines/flow/Flow;", "merge", "(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "flatten", "transformer", "compose", "", "count", "skip", "(Lkotlinx/coroutines/flow/Flow;I)Lkotlinx/coroutines/flow/Flow;", "action", "forEach", "initial", "Lkotlin/Function3;", "operation", "scanFold", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lca/q;)Lkotlinx/coroutines/flow/Flow;", "onErrorReturn", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "", "predicate", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lca/l;)Lkotlinx/coroutines/flow/Flow;", "value", "startWith", "other", "concatWith", "T1", "T2", "transform", "combineLatest", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lca/q;)Lkotlinx/coroutines/flow/Flow;", "T3", "other2", "Lkotlin/Function4;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lca/r;)Lkotlinx/coroutines/flow/Flow;", "T4", "other3", "Lkotlin/Function5;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lca/s;)Lkotlinx/coroutines/flow/Flow;", "T5", "other4", "Lkotlin/Function6;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lca/t;)Lkotlinx/coroutines/flow/Flow;", "", "timeMillis", "delayFlow", "(Lkotlinx/coroutines/flow/Flow;J)Lkotlinx/coroutines/flow/Flow;", "delayEach", "switchMap", "scanReduce", "(Lkotlinx/coroutines/flow/Flow;Lca/q;)Lkotlinx/coroutines/flow/Flow;", "publish", "bufferSize", "replay", "cache", "kotlinx-coroutines-core"}, k = 5, mv = {2, 0, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
final /* synthetic */ class FlowKt__MigrationKt {
    public static final <T> Flow<T> cache(Flow<? extends T> flow) {
        throw e.a();
    }

    public static final <T1, T2, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, InterfaceC0651q<? super T1, ? super T2, ? super T9.a<? super R>, ? extends Object> interfaceC0651q) {
        return FlowKt.combine(flow, flow2, interfaceC0651q);
    }

    public static final <T, R> Flow<R> compose(Flow<? extends T> flow, InterfaceC0646l<? super Flow<? extends T>, ? extends Flow<? extends R>> interfaceC0646l) {
        throw e.a();
    }

    public static final <T, R> Flow<R> concatMap(Flow<? extends T> flow, InterfaceC0646l<? super T, ? extends Flow<? extends R>> interfaceC0646l) {
        throw e.a();
    }

    public static final <T> Flow<T> concatWith(Flow<? extends T> flow, T t3) {
        throw e.a();
    }

    public static final <T> Flow<T> delayEach(Flow<? extends T> flow, long j10) {
        return FlowKt.onEach(flow, new FlowKt__MigrationKt$delayEach$1(j10, null));
    }

    public static final <T> Flow<T> delayFlow(Flow<? extends T> flow, long j10) {
        return FlowKt.onStart(flow, new FlowKt__MigrationKt$delayFlow$1(j10, null));
    }

    public static final <T, R> Flow<R> flatMap(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super Flow<? extends R>>, ? extends Object> interfaceC0650p) {
        throw e.a();
    }

    public static final <T> Flow<T> flatten(Flow<? extends Flow<? extends T>> flow) {
        throw e.a();
    }

    public static final <T> void forEach(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        throw e.a();
    }

    public static final <T> Flow<T> merge(Flow<? extends Flow<? extends T>> flow) {
        throw e.a();
    }

    public static final Void noImpl() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    public static final <T> Flow<T> observeOn(Flow<? extends T> flow, kotlin.coroutines.d dVar) {
        throw e.a();
    }

    public static final <T> Flow<T> onErrorResume(Flow<? extends T> flow, Flow<? extends T> flow2) {
        throw e.a();
    }

    public static final <T> Flow<T> onErrorResumeNext(Flow<? extends T> flow, Flow<? extends T> flow2) {
        throw e.a();
    }

    public static final <T> Flow<T> onErrorReturn(Flow<? extends T> flow, T t3) {
        throw e.a();
    }

    public static /* synthetic */ Flow onErrorReturn$default(Flow flow, Object obj, InterfaceC0646l interfaceC0646l, int i, Object obj2) {
        if ((i & 2) != 0) {
            interfaceC0646l = new c(1);
        }
        return FlowKt.onErrorReturn(flow, obj, interfaceC0646l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onErrorReturn$lambda$0$FlowKt__MigrationKt(Throwable th) {
        return true;
    }

    public static final <T> Flow<T> publish(Flow<? extends T> flow) {
        throw e.a();
    }

    public static final <T> Flow<T> publishOn(Flow<? extends T> flow, kotlin.coroutines.d dVar) {
        throw e.a();
    }

    public static final <T> Flow<T> replay(Flow<? extends T> flow) {
        throw e.a();
    }

    public static final <T, R> Flow<R> scanFold(Flow<? extends T> flow, R r8, InterfaceC0651q<? super R, ? super T, ? super T9.a<? super R>, ? extends Object> interfaceC0651q) {
        throw e.a();
    }

    public static final <T> Flow<T> scanReduce(Flow<? extends T> flow, InterfaceC0651q<? super T, ? super T, ? super T9.a<? super T>, ? extends Object> interfaceC0651q) {
        return FlowKt.runningReduce(flow, interfaceC0651q);
    }

    public static final <T> Flow<T> skip(Flow<? extends T> flow, int i) {
        throw e.a();
    }

    public static final <T> Flow<T> startWith(Flow<? extends T> flow, T t3) {
        throw e.a();
    }

    public static final <T> void subscribe(Flow<? extends T> flow) {
        throw e.a();
    }

    public static final <T> Flow<T> subscribeOn(Flow<? extends T> flow, kotlin.coroutines.d dVar) {
        throw e.a();
    }

    public static final <T, R> Flow<R> switchMap(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super Flow<? extends R>>, ? extends Object> interfaceC0650p) {
        return FlowKt.transformLatest(flow, new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(interfaceC0650p, null));
    }

    public static final <T1, T2, T3, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, InterfaceC0652r<? super T1, ? super T2, ? super T3, ? super T9.a<? super R>, ? extends Object> interfaceC0652r) {
        return FlowKt.combine(flow, flow2, flow3, interfaceC0652r);
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, s<? super T1, ? super T2, ? super T3, ? super T4, ? super T9.a<? super R>, ? extends Object> sVar) {
        return FlowKt.combine(flow, flow2, flow3, flow4, sVar);
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T9.a<? super R>, ? extends Object> tVar) {
        return FlowKt.combine(flow, flow2, flow3, flow4, flow5, tVar);
    }

    public static final <T> Flow<T> concatWith(Flow<? extends T> flow, Flow<? extends T> flow2) {
        throw e.a();
    }

    public static final <T> Flow<T> onErrorReturn(Flow<? extends T> flow, T t3, InterfaceC0646l<? super Throwable, Boolean> interfaceC0646l) {
        return FlowKt.m142catch(flow, new FlowKt__MigrationKt$onErrorReturn$2(interfaceC0646l, t3, null));
    }

    public static final <T> Flow<T> publish(Flow<? extends T> flow, int i) {
        throw e.a();
    }

    public static final <T> Flow<T> replay(Flow<? extends T> flow, int i) {
        throw e.a();
    }

    public static final <T> Flow<T> startWith(Flow<? extends T> flow, Flow<? extends T> flow2) {
        throw e.a();
    }

    public static final <T> void subscribe(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        throw e.a();
    }

    public static final <T> void subscribe(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super p>, ? extends Object> interfaceC0650p, InterfaceC0650p<? super Throwable, ? super T9.a<? super p>, ? extends Object> interfaceC0650p2) {
        throw e.a();
    }
}
