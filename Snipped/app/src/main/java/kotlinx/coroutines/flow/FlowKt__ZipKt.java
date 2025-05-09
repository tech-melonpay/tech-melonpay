package kotlinx.coroutines.flow;

import O9.p;
import ca.InterfaceC0635a;
import ca.InterfaceC0650p;
import ca.InterfaceC0651q;
import ca.InterfaceC0652r;
import ca.s;
import ca.t;
import ca.u;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.bouncycastle.tls.NamedGroup;

/* compiled from: Zip.kt */
@Metadata(d1 = {"\u0000`\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0005\u001ai\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032(\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001ak\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032(\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005¢\u0006\u0004\b\u000b\u0010\n\u001aw\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u000326\b\u0001\u0010\b\u001a0\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001ay\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000326\b\u0001\u0010\b\u001a0\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\r¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u0087\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0013\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u000320\b\u0001\u0010\b\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\r¢\u0006\u0004\b\u000b\u0010\u0015\u001a\u0093\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0013\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032<\b\u0001\u0010\b\u001a6\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0016¢\u0006\u0004\b\u0012\u0010\u0017\u001a\u009f\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0013\"\u0004\b\u0003\u0010\u0018\"\u0004\b\u0004\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00030\u000324\u0010\b\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0016¢\u0006\u0004\b\u000b\u0010\u001a\u001a\u00ad\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0013\"\u0004\b\u0003\u0010\u0018\"\u0004\b\u0004\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00030\u00032B\b\u0001\u0010\b\u001a<\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001b¢\u0006\u0004\b\u0012\u0010\u001c\u001a¹\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0013\"\u0004\b\u0003\u0010\u0018\"\u0004\b\u0004\u0010\u001d\"\u0004\b\u0005\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032:\u0010\b\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001b¢\u0006\u0004\b\u000b\u0010\u001f\u001aÇ\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0013\"\u0004\b\u0003\u0010\u0018\"\u0004\b\u0004\u0010\u001d\"\u0004\b\u0005\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032H\b\u0001\u0010\b\u001aB\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070 ¢\u0006\u0004\b\u0012\u0010!\u001ap\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010\"\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010$\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030#\"\b\u0012\u0004\u0012\u00028\u00000\u00032*\b\u0004\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070%H\u0086\b¢\u0006\u0004\b\u000b\u0010&\u001a|\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010\"\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010$\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030#\"\b\u0012\u0004\u0012\u00028\u00000\u000326\b\u0005\u0010\b\u001a0\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0086\b¢\u0006\u0004\b\u0012\u0010'\u001ap\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010\"\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010$\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030#\"\b\u0012\u0004\u0012\u00028\u00000\u00032*\b\u0004\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070%H\u0082\b¢\u0006\u0004\b(\u0010&\u001a|\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010\"\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010$\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030#\"\b\u0012\u0004\u0012\u00028\u00000\u000326\b\u0005\u0010\b\u001a0\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0082\b¢\u0006\u0004\b*\u0010'\u001a#\u0010/\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010#0,\"\u0004\b\u0000\u0010\"H\u0002¢\u0006\u0004\b-\u0010.\u001ad\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010\"\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003002*\b\u0004\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070%H\u0086\b¢\u0006\u0004\b\u000b\u00101\u001ap\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010\"\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030026\b\u0005\u0010\b\u001a0\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0086\b¢\u0006\u0004\b\u0012\u00102\u001ag\u00104\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032(\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005¢\u0006\u0004\b4\u0010\n¨\u00065"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/flow/Flow;", "flow", "Lkotlin/Function3;", "LT9/a;", "", "transform", "flowCombine", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lca/q;)Lkotlinx/coroutines/flow/Flow;", "combine", "flow2", "Lkotlin/Function4;", "Lkotlinx/coroutines/flow/FlowCollector;", "LO9/p;", "flowCombineTransform", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lca/r;)Lkotlinx/coroutines/flow/Flow;", "combineTransform", "T3", "flow3", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lca/r;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function5;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lca/s;)Lkotlinx/coroutines/flow/Flow;", "T4", "flow4", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lca/s;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function6;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lca/t;)Lkotlinx/coroutines/flow/Flow;", "T5", "flow5", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lca/t;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function7;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lca/u;)Lkotlinx/coroutines/flow/Flow;", "T", "", "flows", "Lkotlin/Function2;", "([Lkotlinx/coroutines/flow/Flow;Lca/p;)Lkotlinx/coroutines/flow/Flow;", "([Lkotlinx/coroutines/flow/Flow;Lca/q;)Lkotlinx/coroutines/flow/Flow;", "combineUnsafe$FlowKt__ZipKt", "combineUnsafe", "combineTransformUnsafe$FlowKt__ZipKt", "combineTransformUnsafe", "Lkotlin/Function0;", "nullArrayFactory$FlowKt__ZipKt", "()Lca/a;", "nullArrayFactory", "", "(Ljava/lang/Iterable;Lca/p;)Lkotlinx/coroutines/flow/Flow;", "(Ljava/lang/Iterable;Lca/q;)Lkotlinx/coroutines/flow/Flow;", "other", "zip", "kotlinx-coroutines-core"}, k = 5, mv = {2, 0, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
final /* synthetic */ class FlowKt__ZipKt {
    public static final <T1, T2, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, InterfaceC0651q<? super T1, ? super T2, ? super T9.a<? super R>, ? extends Object> interfaceC0651q) {
        return FlowKt.flowCombine(flow, flow2, interfaceC0651q);
    }

    public static final <T1, T2, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, InterfaceC0652r<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super T9.a<? super p>, ? extends Object> interfaceC0652r) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2(new Flow[]{flow, flow2}, null, interfaceC0652r));
    }

    private static final <T, R> Flow<R> combineTransformUnsafe$FlowKt__ZipKt(Flow<? extends T>[] flowArr, InterfaceC0651q<? super FlowCollector<? super R>, ? super T[], ? super T9.a<? super p>, ? extends Object> interfaceC0651q) {
        f.e();
        throw null;
    }

    private static final <T, R> Flow<R> combineUnsafe$FlowKt__ZipKt(Flow<? extends T>[] flowArr, InterfaceC0650p<? super T[], ? super T9.a<? super R>, ? extends Object> interfaceC0650p) {
        f.e();
        throw null;
    }

    public static final <T1, T2, R> Flow<R> flowCombine(final Flow<? extends T1> flow, final Flow<? extends T2> flow2, final InterfaceC0651q<? super T1, ? super T2, ? super T9.a<? super R>, ? extends Object> interfaceC0651q) {
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super R> flowCollector, T9.a<? super p> aVar) {
                InterfaceC0635a interfaceC0635a;
                Flow[] flowArr = {Flow.this, flow2};
                interfaceC0635a = new InterfaceC0635a() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // ca.InterfaceC0635a
                    public final Void invoke() {
                        return null;
                    }
                };
                Object combineInternal = CombineKt.combineInternal(flowCollector, flowArr, interfaceC0635a, new FlowKt__ZipKt$combine$1$1(interfaceC0651q, null), aVar);
                return combineInternal == CoroutineSingletons.f23158a ? combineInternal : p.f3034a;
            }
        };
    }

    public static final <T1, T2, R> Flow<R> flowCombineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, InterfaceC0652r<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super T9.a<? super p>, ? extends Object> interfaceC0652r) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1(new Flow[]{flow, flow2}, null, interfaceC0652r));
    }

    public static final <T1, T2, R> Flow<R> zip(Flow<? extends T1> flow, Flow<? extends T2> flow2, InterfaceC0651q<? super T1, ? super T2, ? super T9.a<? super R>, ? extends Object> interfaceC0651q) {
        return CombineKt.zipImpl(flow, flow2, interfaceC0651q);
    }

    public static final <T1, T2, T3, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, final InterfaceC0652r<? super T1, ? super T2, ? super T3, ? super T9.a<? super R>, ? extends Object> interfaceC0652r) {
        final Flow[] flowArr = {flow, flow2, flow3};
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1

            /* compiled from: Zip.kt */
            @V9.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", l = {NamedGroup.ffdhe6144, NamedGroup.ffdhe4096}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1"}, k = 3, mv = {2, 0, 0})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC0651q<FlowCollector<? super R>, Object[], T9.a<? super p>, Object> {
                final /* synthetic */ InterfaceC0652r $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(T9.a aVar, InterfaceC0652r interfaceC0652r) {
                    super(3, aVar);
                    this.$transform$inlined = interfaceC0652r;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    FlowCollector flowCollector;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                    int i = this.label;
                    if (i == 0) {
                        kotlin.b.b(obj);
                        flowCollector = (FlowCollector) this.L$0;
                        Object[] objArr = (Object[]) this.L$1;
                        InterfaceC0652r interfaceC0652r = this.$transform$inlined;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        this.L$0 = flowCollector;
                        this.label = 1;
                        obj = interfaceC0652r.invoke(obj2, obj3, obj4, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.b.b(obj);
                            return p.f3034a;
                        }
                        flowCollector = (FlowCollector) this.L$0;
                        kotlin.b.b(obj);
                    }
                    this.L$0 = null;
                    this.label = 2;
                    if (flowCollector.emit(obj, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return p.f3034a;
                }

                @Override // ca.InterfaceC0651q
                public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, T9.a<? super p> aVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(aVar, this.$transform$inlined);
                    anonymousClass2.L$0 = flowCollector;
                    anonymousClass2.L$1 = objArr;
                    return anonymousClass2.invokeSuspend(p.f3034a);
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, T9.a aVar) {
                InterfaceC0635a interfaceC0635a;
                Flow[] flowArr2 = flowArr;
                interfaceC0635a = new InterfaceC0635a() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // ca.InterfaceC0635a
                    public final Void invoke() {
                        return null;
                    }
                };
                Object combineInternal = CombineKt.combineInternal(flowCollector, flowArr2, interfaceC0635a, new AnonymousClass2(null, interfaceC0652r), aVar);
                return combineInternal == CoroutineSingletons.f23158a ? combineInternal : p.f3034a;
            }
        };
    }

    public static final <T1, T2, T3, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, s<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super T9.a<? super p>, ? extends Object> sVar) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3(new Flow[]{flow, flow2, flow3}, null, sVar));
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, final s<? super T1, ? super T2, ? super T3, ? super T4, ? super T9.a<? super R>, ? extends Object> sVar) {
        final Flow[] flowArr = {flow, flow2, flow3, flow4};
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2

            /* compiled from: Zip.kt */
            @V9.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", l = {NamedGroup.ffdhe6144, NamedGroup.ffdhe4096}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1"}, k = 3, mv = {2, 0, 0})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC0651q<FlowCollector<? super R>, Object[], T9.a<? super p>, Object> {
                final /* synthetic */ s $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(T9.a aVar, s sVar) {
                    super(3, aVar);
                    this.$transform$inlined = sVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    FlowCollector flowCollector;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                    int i = this.label;
                    if (i == 0) {
                        kotlin.b.b(obj);
                        flowCollector = (FlowCollector) this.L$0;
                        Object[] objArr = (Object[]) this.L$1;
                        s sVar = this.$transform$inlined;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        Object obj5 = objArr[3];
                        this.L$0 = flowCollector;
                        this.label = 1;
                        obj = sVar.invoke(obj2, obj3, obj4, obj5, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.b.b(obj);
                            return p.f3034a;
                        }
                        flowCollector = (FlowCollector) this.L$0;
                        kotlin.b.b(obj);
                    }
                    this.L$0 = null;
                    this.label = 2;
                    if (flowCollector.emit(obj, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return p.f3034a;
                }

                @Override // ca.InterfaceC0651q
                public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, T9.a<? super p> aVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(aVar, this.$transform$inlined);
                    anonymousClass2.L$0 = flowCollector;
                    anonymousClass2.L$1 = objArr;
                    return anonymousClass2.invokeSuspend(p.f3034a);
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, T9.a aVar) {
                InterfaceC0635a interfaceC0635a;
                Flow[] flowArr2 = flowArr;
                interfaceC0635a = new InterfaceC0635a() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // ca.InterfaceC0635a
                    public final Void invoke() {
                        return null;
                    }
                };
                Object combineInternal = CombineKt.combineInternal(flowCollector, flowArr2, interfaceC0635a, new AnonymousClass2(null, sVar), aVar);
                return combineInternal == CoroutineSingletons.f23158a ? combineInternal : p.f3034a;
            }
        };
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, t<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T9.a<? super p>, ? extends Object> tVar) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4(new Flow[]{flow, flow2, flow3, flow4}, null, tVar));
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, final t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T9.a<? super R>, ? extends Object> tVar) {
        final Flow[] flowArr = {flow, flow2, flow3, flow4, flow5};
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3

            /* compiled from: Zip.kt */
            @V9.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", l = {NamedGroup.ffdhe6144, NamedGroup.ffdhe4096}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1"}, k = 3, mv = {2, 0, 0})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC0651q<FlowCollector<? super R>, Object[], T9.a<? super p>, Object> {
                final /* synthetic */ t $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(T9.a aVar, t tVar) {
                    super(3, aVar);
                    this.$transform$inlined = tVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    FlowCollector flowCollector;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                    int i = this.label;
                    if (i == 0) {
                        kotlin.b.b(obj);
                        flowCollector = (FlowCollector) this.L$0;
                        Object[] objArr = (Object[]) this.L$1;
                        t tVar = this.$transform$inlined;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        Object obj5 = objArr[3];
                        Object obj6 = objArr[4];
                        this.L$0 = flowCollector;
                        this.label = 1;
                        obj = tVar.invoke(obj2, obj3, obj4, obj5, obj6, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.b.b(obj);
                            return p.f3034a;
                        }
                        flowCollector = (FlowCollector) this.L$0;
                        kotlin.b.b(obj);
                    }
                    this.L$0 = null;
                    this.label = 2;
                    if (flowCollector.emit(obj, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return p.f3034a;
                }

                @Override // ca.InterfaceC0651q
                public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, T9.a<? super p> aVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(aVar, this.$transform$inlined);
                    anonymousClass2.L$0 = flowCollector;
                    anonymousClass2.L$1 = objArr;
                    return anonymousClass2.invokeSuspend(p.f3034a);
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, T9.a aVar) {
                InterfaceC0635a interfaceC0635a;
                Flow[] flowArr2 = flowArr;
                interfaceC0635a = new InterfaceC0635a() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // ca.InterfaceC0635a
                    public final Void invoke() {
                        return null;
                    }
                };
                Object combineInternal = CombineKt.combineInternal(flowCollector, flowArr2, interfaceC0635a, new AnonymousClass2(null, tVar), aVar);
                return combineInternal == CoroutineSingletons.f23158a ? combineInternal : p.f3034a;
            }
        };
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, u<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T9.a<? super p>, ? extends Object> uVar) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5(new Flow[]{flow, flow2, flow3, flow4, flow5}, null, uVar));
    }

    public static final <T, R> Flow<R> combine(Flow<? extends T>[] flowArr, InterfaceC0650p<? super T[], ? super T9.a<? super R>, ? extends Object> interfaceC0650p) {
        f.e();
        throw null;
    }

    public static final <T, R> Flow<R> combine(Iterable<? extends Flow<? extends T>> iterable, InterfaceC0650p<? super T[], ? super T9.a<? super R>, ? extends Object> interfaceC0650p) {
        f.e();
        throw null;
    }

    public static final <T, R> Flow<R> combineTransform(Flow<? extends T>[] flowArr, InterfaceC0651q<? super FlowCollector<? super R>, ? super T[], ? super T9.a<? super p>, ? extends Object> interfaceC0651q) {
        f.e();
        throw null;
    }

    public static final <T, R> Flow<R> combineTransform(Iterable<? extends Flow<? extends T>> iterable, InterfaceC0651q<? super FlowCollector<? super R>, ? super T[], ? super T9.a<? super p>, ? extends Object> interfaceC0651q) {
        f.e();
        throw null;
    }
}
