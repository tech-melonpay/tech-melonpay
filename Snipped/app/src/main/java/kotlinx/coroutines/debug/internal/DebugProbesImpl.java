package kotlinx.coroutines.debug.internal;

import B6.g;
import C.v;
import O9.p;
import P9.k;
import P9.n;
import P9.q;
import P9.s;
import P9.z;
import T9.a;
import U4.b;
import V9.c;
import a.C0504b;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import ja.e;
import ja.m;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import ka.C0963h;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineId;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* compiled from: DebugProbesImpl.kt */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u009a\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00162\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0016¢\u0006\u0004\b!\u0010\"J\u001b\u0010'\u001a\u00020\u00042\n\u0010$\u001a\u0006\u0012\u0002\b\u00030#H\u0000¢\u0006\u0004\b%\u0010&J\u001b\u0010)\u001a\u00020\u00042\n\u0010$\u001a\u0006\u0012\u0002\b\u00030#H\u0000¢\u0006\u0004\b(\u0010&J)\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000#\"\u0004\b\u0000\u0010*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0000¢\u0006\u0004\b,\u0010-J\u001d\u00101\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0004H\u0002¢\u0006\u0004\b3\u0010\u0003J\u000f\u00104\u001a\u00020\u0004H\u0002¢\u0006\u0004\b4\u0010\u0003J;\u0010<\u001a\u00020\u0004*\u00020\t2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u000206052\n\u0010:\u001a\u000608j\u0002`92\u0006\u0010;\u001a\u00020\u000bH\u0002¢\u0006\u0004\b<\u0010=J@\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\b\b\u0000\u0010>*\u00020\u00012\u001e\b\u0004\u0010B\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030@\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00028\u00000?H\u0082\b¢\u0006\u0004\bC\u0010DJ\u0013\u0010E\u001a\u00020\u000b*\u00020\u0001H\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u000200*\u0006\u0012\u0002\b\u00030@H\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\bI\u0010\u001eJ%\u0010K\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0016H\u0002¢\u0006\u0004\bK\u0010LJ5\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00162\u0006\u0010M\u001a\u00020\u000b2\b\u0010O\u001a\u0004\u0018\u00010N2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0016H\u0002¢\u0006\u0004\bP\u0010QJ?\u0010V\u001a\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020R0U2\u0006\u0010S\u001a\u00020R2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0016H\u0002¢\u0006\u0004\bV\u0010WJ3\u0010Y\u001a\u00020R2\u0006\u0010X\u001a\u00020R2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0016H\u0002¢\u0006\u0004\bY\u0010ZJ#\u0010[\u001a\u00020\u00042\n\u0010$\u001a\u0006\u0012\u0002\b\u00030#2\u0006\u0010M\u001a\u00020\u000bH\u0002¢\u0006\u0004\b[\u0010\\J\u001f\u0010^\u001a\u00020\u00042\u0006\u0010$\u001a\u00020]2\u0006\u0010M\u001a\u00020\u000bH\u0002¢\u0006\u0004\b^\u0010_J\u0016\u0010`\u001a\u0004\u0018\u00010]*\u00020]H\u0082\u0010¢\u0006\u0004\b`\u0010aJ/\u0010[\u001a\u00020\u00042\n\u0010b\u001a\u0006\u0012\u0002\b\u00030@2\n\u0010$\u001a\u0006\u0012\u0002\b\u00030#2\u0006\u0010M\u001a\u00020\u000bH\u0002¢\u0006\u0004\b[\u0010cJ\u001d\u0010b\u001a\b\u0012\u0002\b\u0003\u0018\u00010@*\u0006\u0012\u0002\b\u00030#H\u0002¢\u0006\u0004\bb\u0010dJ\u001a\u0010b\u001a\b\u0012\u0002\b\u0003\u0018\u00010@*\u00020]H\u0082\u0010¢\u0006\u0004\bb\u0010eJ\u0019\u0010g\u001a\u00020f*\b\u0012\u0004\u0012\u00020\u001f0\u0016H\u0002¢\u0006\u0004\bg\u0010hJ3\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000#\"\u0004\b\u0000\u0010*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000#2\b\u0010$\u001a\u0004\u0018\u00010fH\u0002¢\u0006\u0004\bi\u0010jJ\u001b\u0010k\u001a\u00020\u00042\n\u0010b\u001a\u0006\u0012\u0002\b\u00030@H\u0002¢\u0006\u0004\bk\u0010lJ'\u0010o\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0016\"\b\b\u0000\u0010**\u00020m2\u0006\u0010n\u001a\u00028\u0000H\u0002¢\u0006\u0004\bo\u0010pR\u0014\u0010q\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010v\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR$\u0010y\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030@\u0012\u0004\u0012\u0002000x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR#\u0010{\u001a\u0002008\u0000@\u0000X\u0080\u000e¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R'\u0010\u0081\u0001\u001a\u0002008\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u0081\u0001\u0010|\u001a\u0005\b\u0082\u0001\u0010~\"\u0006\b\u0083\u0001\u0010\u0080\u0001R'\u0010\u0084\u0001\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0084\u0001\u0010|\u001a\u0005\b\u0085\u0001\u0010~\"\u0006\b\u0086\u0001\u0010\u0080\u0001R%\u0010\u0087\u0001\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0004\u0018\u00010/8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\"\u0010\u0089\u0001\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u0002060x8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010zR\u0013\u0010\u008b\u0001\u001a\u0002008G¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010~R\"\u0010\u008f\u0001\u001a\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030@0\u008c\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\"\u0010\u0093\u0001\u001a\u00020\u000b*\u00020\t8BX\u0082\u0004¢\u0006\u000f\u0012\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0005\b\u0090\u0001\u0010\rR\u001b\u0010\u0094\u0001\u001a\u000200*\u00020\u001f8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\r\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004R\r\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¨\u0006\u009b\u0001"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl;", "", "<init>", "()V", "LO9/p;", "install$kotlinx_coroutines_core", "install", "uninstall$kotlinx_coroutines_core", "uninstall", "Lkotlinx/coroutines/Job;", "job", "", "hierarchyToString$kotlinx_coroutines_core", "(Lkotlinx/coroutines/Job;)Ljava/lang/String;", "hierarchyToString", "", "dumpCoroutinesInfoAsJsonAndReferences", "()[Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;", "info", "enhanceStackTraceWithThreadDumpAsJson", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;)Ljava/lang/String;", "", "dumpCoroutinesInfo", "()Ljava/util/List;", "Lkotlinx/coroutines/debug/internal/DebuggerInfo;", "dumpDebuggerInfo", "Ljava/io/PrintStream;", "out", "dumpCoroutines", "(Ljava/io/PrintStream;)V", "Ljava/lang/StackTraceElement;", "coroutineTrace", "enhanceStackTraceWithThreadDump", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;Ljava/util/List;)Ljava/util/List;", "LT9/a;", "frame", "probeCoroutineResumed$kotlinx_coroutines_core", "(LT9/a;)V", "probeCoroutineResumed", "probeCoroutineSuspended$kotlinx_coroutines_core", "probeCoroutineSuspended", "T", "completion", "probeCoroutineCreated$kotlinx_coroutines_core", "(LT9/a;)LT9/a;", "probeCoroutineCreated", "Lkotlin/Function1;", "", "getDynamicAttach", "()Lca/l;", "startWeakRefCleanerThread", "stopWeakRefCleanerThread", "", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "map", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "indent", "build", "(Lkotlinx/coroutines/Job;Ljava/util/Map;Ljava/lang/StringBuilder;Ljava/lang/String;)V", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "Lkotlin/coroutines/d;", "create", "dumpCoroutinesInfoImpl", "(Lca/p;)Ljava/util/List;", "toStringRepr", "(Ljava/lang/Object;)Ljava/lang/String;", "isFinished", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;)Z", "dumpCoroutinesSynchronized", "frames", "printStackTrace", "(Ljava/io/PrintStream;Ljava/util/List;)V", "state", "Ljava/lang/Thread;", "thread", "enhanceStackTraceWithThreadDumpImpl", "(Ljava/lang/String;Ljava/lang/Thread;Ljava/util/List;)Ljava/util/List;", "", "indexOfResumeWith", "actualTrace", "Lkotlin/Pair;", "findContinuationStartIndex", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lkotlin/Pair;", "frameIndex", "findIndexOfFrame", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", "updateState", "(LT9/a;Ljava/lang/String;)V", "LV9/c;", "updateRunningState", "(LV9/c;Ljava/lang/String;)V", "realCaller", "(LV9/c;)LV9/c;", "owner", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;LT9/a;Ljava/lang/String;)V", "(LT9/a;)Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "(LV9/c;)Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "toStackTraceFrame", "(Ljava/util/List;)Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "createOwner", "(LT9/a;Lkotlinx/coroutines/debug/internal/StackTraceFrame;)LT9/a;", "probeCoroutineCompleted", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;)V", "", "throwable", "sanitizeStackTrace", "(Ljava/lang/Throwable;)Ljava/util/List;", "ARTIFICIAL_FRAME", "Ljava/lang/StackTraceElement;", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;", "weakRefCleanerThread", "Ljava/lang/Thread;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "capturedCoroutinesMap", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "sanitizeStackTraces", "Z", "getSanitizeStackTraces$kotlinx_coroutines_core", "()Z", "setSanitizeStackTraces$kotlinx_coroutines_core", "(Z)V", "enableCreationStackTraces", "getEnableCreationStackTraces$kotlinx_coroutines_core", "setEnableCreationStackTraces$kotlinx_coroutines_core", "ignoreCoroutinesWithEmptyContext", "getIgnoreCoroutinesWithEmptyContext", "setIgnoreCoroutinesWithEmptyContext", "dynamicAttach", "Lca/l;", "callerInfoCache", "isInstalled$kotlinx_coroutines_debug", "isInstalled", "", "getCapturedCoroutines", "()Ljava/util/Set;", "capturedCoroutines", "getDebugString", "getDebugString$annotations", "(Lkotlinx/coroutines/Job;)V", "debugString", "isInternalMethod", "(Ljava/lang/StackTraceElement;)Z", "Lkotlinx/atomicfu/AtomicInt;", "installations", "Lkotlinx/atomicfu/AtomicLong;", "sequenceNumber", "CoroutineOwner", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class DebugProbesImpl {
    private static final StackTraceElement ARTIFICIAL_FRAME;
    public static final DebugProbesImpl INSTANCE;
    private static final ConcurrentWeakMap<c, DebugCoroutineInfoImpl> callerInfoCache;
    private static final ConcurrentWeakMap<CoroutineOwner<?>, Boolean> capturedCoroutinesMap;
    private static final SimpleDateFormat dateFormat;
    private static final /* synthetic */ DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private debugProbesImpl$VolatileWrapper$atomicfu$private;
    private static final InterfaceC0646l<Boolean, p> dynamicAttach;
    private static boolean enableCreationStackTraces;
    private static boolean ignoreCoroutinesWithEmptyContext;
    private static boolean sanitizeStackTraces;
    private static Thread weakRefCleanerThread;

    /* compiled from: DebugProbesImpl.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u000b\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0005¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "T", "LT9/a;", "LV9/c;", "delegate", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "info", "<init>", "(LT9/a;Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;)V", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", "result", "LO9/p;", "resumeWith", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "LT9/a;", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "getFrame", "()Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "frame", "getCallerFrame", "()LV9/c;", "callerFrame", "Lkotlin/coroutines/d;", "context", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
    public static final class CoroutineOwner<T> implements a<T>, c {
        public final a<T> delegate;
        public final DebugCoroutineInfoImpl info;

        /* JADX WARN: Multi-variable type inference failed */
        public CoroutineOwner(a<? super T> aVar, DebugCoroutineInfoImpl debugCoroutineInfoImpl) {
            this.delegate = aVar;
            this.info = debugCoroutineInfoImpl;
        }

        private final StackTraceFrame getFrame() {
            return this.info.getCreationStackBottom();
        }

        @Override // V9.c
        public c getCallerFrame() {
            StackTraceFrame frame = getFrame();
            if (frame != null) {
                return frame.getCallerFrame();
            }
            return null;
        }

        @Override // T9.a
        public d getContext() {
            return this.delegate.getContext();
        }

        @Override // V9.c
        public StackTraceElement getStackTraceElement() {
            StackTraceFrame frame = getFrame();
            if (frame != null) {
                return frame.getStackTraceElement();
            }
            return null;
        }

        @Override // T9.a
        public void resumeWith(Object result) {
            DebugProbesImpl.INSTANCE.probeCoroutineCompleted(this);
            this.delegate.resumeWith(result);
        }

        public String toString() {
            return this.delegate.toString();
        }
    }

    static {
        DebugProbesImpl debugProbesImpl = new DebugProbesImpl();
        INSTANCE = debugProbesImpl;
        ARTIFICIAL_FRAME = b.c(C0504b.class.getSimpleName(), new Exception());
        dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        capturedCoroutinesMap = new ConcurrentWeakMap<>(false, 1, null);
        sanitizeStackTraces = true;
        ignoreCoroutinesWithEmptyContext = true;
        dynamicAttach = debugProbesImpl.getDynamicAttach();
        callerInfoCache = new ConcurrentWeakMap<>(true);
        debugProbesImpl$VolatileWrapper$atomicfu$private = new DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private(null);
    }

    private DebugProbesImpl() {
    }

    private final void build(Job job, Map<Job, DebugCoroutineInfoImpl> map, StringBuilder sb2, String str) {
        DebugCoroutineInfoImpl debugCoroutineInfoImpl = map.get(job);
        if (debugCoroutineInfoImpl != null) {
            StackTraceElement stackTraceElement = (StackTraceElement) s.L(debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core());
            String str2 = debugCoroutineInfoImpl.get_state();
            StringBuilder s10 = v.s(str);
            androidx.camera.core.impl.utils.a.u(s10, getDebugString(job), ", continuation is ", str2, " at line ");
            s10.append(stackTraceElement);
            s10.append('\n');
            sb2.append(s10.toString());
            str = str + '\t';
        } else if (!(job instanceof ScopeCoroutine)) {
            StringBuilder s11 = v.s(str);
            s11.append(getDebugString(job));
            s11.append('\n');
            sb2.append(s11.toString());
            str = str + '\t';
        }
        Iterator<Job> it = job.getChildren().iterator();
        while (it.hasNext()) {
            build(it.next(), map, sb2, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> a<T> createOwner(a<? super T> completion, StackTraceFrame frame) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        if (!isInstalled$kotlinx_coroutines_debug()) {
            return completion;
        }
        d context = completion.getContext();
        atomicLongFieldUpdater = DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.sequenceNumber$volatile$FU;
        CoroutineOwner<?> coroutineOwner = new CoroutineOwner<>(completion, new DebugCoroutineInfoImpl(context, frame, atomicLongFieldUpdater.incrementAndGet(debugProbesImpl$VolatileWrapper$atomicfu$private)));
        ConcurrentWeakMap<CoroutineOwner<?>, Boolean> concurrentWeakMap = capturedCoroutinesMap;
        concurrentWeakMap.put(coroutineOwner, Boolean.TRUE);
        if (!isInstalled$kotlinx_coroutines_debug()) {
            concurrentWeakMap.clear();
        }
        return coroutineOwner;
    }

    private final <R> List<R> dumpCoroutinesInfoImpl(final InterfaceC0650p<? super CoroutineOwner<?>, ? super d, ? extends R> create) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            return kotlin.sequences.a.k(kotlin.sequences.a.j(new m(new k(getCapturedCoroutines(), 1), new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new InterfaceC0646l<CoroutineOwner<?>, R>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$3
                @Override // ca.InterfaceC0646l
                public final R invoke(DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
                    boolean isFinished;
                    d context;
                    isFinished = DebugProbesImpl.INSTANCE.isFinished(coroutineOwner);
                    if (isFinished || (context = coroutineOwner.info.getContext()) == null) {
                        return null;
                    }
                    return create.invoke(coroutineOwner, context);
                }
            }));
        }
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    private final void dumpCoroutinesSynchronized(PrintStream out) {
        String str;
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Debug probes are not installed".toString());
        }
        out.print("Coroutines dump " + dateFormat.format(Long.valueOf(System.currentTimeMillis())));
        e g10 = kotlin.sequences.a.g(new k(getCapturedCoroutines(), 1), new Z3.a(17));
        Comparator comparator = new Comparator() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t3, T t10) {
                return R9.a.a(Long.valueOf(((DebugProbesImpl.CoroutineOwner) t3).info.sequenceNumber), Long.valueOf(((DebugProbesImpl.CoroutineOwner) t10).info.sequenceNumber));
            }
        };
        ArrayList arrayList = new ArrayList();
        Iterator it = g10.iterator();
        while (true) {
            e.a aVar = (e.a) it;
            if (!aVar.hasNext()) {
                break;
            } else {
                arrayList.add(aVar.next());
            }
        }
        q.D(arrayList, comparator);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            CoroutineOwner coroutineOwner = (CoroutineOwner) it2.next();
            DebugCoroutineInfoImpl debugCoroutineInfoImpl = coroutineOwner.info;
            List<StackTraceElement> lastObservedStackTrace$kotlinx_coroutines_core = debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core();
            DebugProbesImpl debugProbesImpl = INSTANCE;
            List<StackTraceElement> enhanceStackTraceWithThreadDumpImpl = debugProbesImpl.enhanceStackTraceWithThreadDumpImpl(debugCoroutineInfoImpl.get_state(), debugCoroutineInfoImpl.lastObservedThread, lastObservedStackTrace$kotlinx_coroutines_core);
            if (f.b(debugCoroutineInfoImpl.get_state(), DebugCoroutineInfoImplKt.RUNNING) && enhanceStackTraceWithThreadDumpImpl == lastObservedStackTrace$kotlinx_coroutines_core) {
                str = debugCoroutineInfoImpl.get_state() + " (Last suspension stacktrace, not an actual stacktrace)";
            } else {
                str = debugCoroutineInfoImpl.get_state();
            }
            out.print("\n\nCoroutine " + coroutineOwner.delegate + ", state: " + str);
            if (lastObservedStackTrace$kotlinx_coroutines_core.isEmpty()) {
                out.print("\n\tat " + ARTIFICIAL_FRAME);
                debugProbesImpl.printStackTrace(out, debugCoroutineInfoImpl.getCreationStackTrace());
            } else {
                debugProbesImpl.printStackTrace(out, enhanceStackTraceWithThreadDumpImpl);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dumpCoroutinesSynchronized$lambda$14(CoroutineOwner coroutineOwner) {
        return !INSTANCE.isFinished(coroutineOwner);
    }

    private final List<StackTraceElement> enhanceStackTraceWithThreadDumpImpl(String state, Thread thread, List<StackTraceElement> coroutineTrace) {
        Object failure;
        if (!f.b(state, DebugCoroutineInfoImplKt.RUNNING) || thread == null) {
            return coroutineTrace;
        }
        try {
            failure = thread.getStackTrace();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) failure;
        if (stackTraceElementArr == null) {
            return coroutineTrace;
        }
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            if (f.b(stackTraceElement.getClassName(), "kotlin.coroutines.jvm.internal.BaseContinuationImpl") && f.b(stackTraceElement.getMethodName(), "resumeWith") && f.b(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                break;
            }
            i++;
        }
        Pair<Integer, Integer> findContinuationStartIndex = findContinuationStartIndex(i, stackTraceElementArr, coroutineTrace);
        int intValue = findContinuationStartIndex.f23089a.intValue();
        int intValue2 = findContinuationStartIndex.f23090b.intValue();
        if (intValue == -1) {
            return coroutineTrace;
        }
        ArrayList arrayList = new ArrayList((((coroutineTrace.size() + i) - intValue) - 1) - intValue2);
        int i9 = i - intValue2;
        for (int i10 = 0; i10 < i9; i10++) {
            arrayList.add(stackTraceElementArr[i10]);
        }
        int size = coroutineTrace.size();
        for (int i11 = intValue + 1; i11 < size; i11++) {
            arrayList.add(coroutineTrace.get(i11));
        }
        return arrayList;
    }

    private final Pair<Integer, Integer> findContinuationStartIndex(int indexOfResumeWith, StackTraceElement[] actualTrace, List<StackTraceElement> coroutineTrace) {
        for (int i = 0; i < 3; i++) {
            int findIndexOfFrame = INSTANCE.findIndexOfFrame((indexOfResumeWith - 1) - i, actualTrace, coroutineTrace);
            if (findIndexOfFrame != -1) {
                return new Pair<>(Integer.valueOf(findIndexOfFrame), Integer.valueOf(i));
            }
        }
        return new Pair<>(-1, 0);
    }

    private final int findIndexOfFrame(int frameIndex, StackTraceElement[] actualTrace, List<StackTraceElement> coroutineTrace) {
        StackTraceElement stackTraceElement = (frameIndex < 0 || frameIndex >= actualTrace.length) ? null : actualTrace[frameIndex];
        if (stackTraceElement == null) {
            return -1;
        }
        int i = 0;
        for (StackTraceElement stackTraceElement2 : coroutineTrace) {
            if (f.b(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && f.b(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && f.b(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private final Set<CoroutineOwner<?>> getCapturedCoroutines() {
        return capturedCoroutinesMap.keySet();
    }

    private final String getDebugString(Job job) {
        return job instanceof JobSupport ? ((JobSupport) job).toDebugString() : job.toString();
    }

    private final InterfaceC0646l<Boolean, p> getDynamicAttach() {
        Object failure;
        try {
            Object newInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(null);
            j.c(1, newInstance);
            failure = (InterfaceC0646l) newInstance;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (InterfaceC0646l) (failure instanceof Result.Failure ? null : failure);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFinished(CoroutineOwner<?> coroutineOwner) {
        Job job;
        d context = coroutineOwner.info.getContext();
        if (context == null || (job = (Job) context.get(Job.INSTANCE)) == null || !job.isCompleted()) {
            return false;
        }
        capturedCoroutinesMap.remove(coroutineOwner);
        return true;
    }

    private final boolean isInternalMethod(StackTraceElement stackTraceElement) {
        return stackTraceElement.getClassName().startsWith("kotlinx.coroutines");
    }

    private final CoroutineOwner<?> owner(a<?> aVar) {
        c cVar = aVar instanceof c ? (c) aVar : null;
        if (cVar != null) {
            return owner(cVar);
        }
        return null;
    }

    private final void printStackTrace(PrintStream out, List<StackTraceElement> frames) {
        Iterator<T> it = frames.iterator();
        while (it.hasNext()) {
            out.print("\n\tat " + ((StackTraceElement) it.next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void probeCoroutineCompleted(CoroutineOwner<?> owner) {
        c realCaller;
        capturedCoroutinesMap.remove(owner);
        c lastObservedFrame$kotlinx_coroutines_core = owner.info.getLastObservedFrame$kotlinx_coroutines_core();
        if (lastObservedFrame$kotlinx_coroutines_core == null || (realCaller = realCaller(lastObservedFrame$kotlinx_coroutines_core)) == null) {
            return;
        }
        callerInfoCache.remove(realCaller);
    }

    private final c realCaller(c cVar) {
        do {
            cVar = cVar.getCallerFrame();
            if (cVar == null) {
                return null;
            }
        } while (cVar.getStackTraceElement() == null);
        return cVar;
    }

    private final <T extends Throwable> List<StackTraceElement> sanitizeStackTrace(T throwable) {
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i9 = length2 - 1;
                if (f.b(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i = length2;
                    break;
                }
                if (i9 < 0) {
                    break;
                }
                length2 = i9;
            }
        }
        int i10 = i + 1;
        if (!sanitizeStackTraces) {
            int i11 = length - i10;
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList.add(stackTrace[i12 + i10]);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i10) + 1);
        while (i10 < length) {
            if (isInternalMethod(stackTrace[i10])) {
                arrayList2.add(stackTrace[i10]);
                int i13 = i10 + 1;
                while (i13 < length && isInternalMethod(stackTrace[i13])) {
                    i13++;
                }
                int i14 = i13 - 1;
                int i15 = i14;
                while (i15 > i10 && stackTrace[i15].getFileName() == null) {
                    i15--;
                }
                if (i15 > i10 && i15 < i14) {
                    arrayList2.add(stackTrace[i15]);
                }
                arrayList2.add(stackTrace[i14]);
                i10 = i13;
            } else {
                arrayList2.add(stackTrace[i10]);
                i10++;
            }
        }
        return arrayList2;
    }

    private final void startWeakRefCleanerThread() {
        S9.a aVar = new S9.a(new g(14));
        aVar.setDaemon(true);
        aVar.setName("Coroutines Debugger Cleaner");
        aVar.start();
        weakRefCleanerThread = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p startWeakRefCleanerThread$lambda$2() {
        callerInfoCache.runWeakRefQueueCleaningLoopUntilInterrupted();
        return p.f3034a;
    }

    private final void stopWeakRefCleanerThread() {
        Thread thread = weakRefCleanerThread;
        if (thread == null) {
            return;
        }
        weakRefCleanerThread = null;
        thread.interrupt();
        thread.join();
    }

    private final StackTraceFrame toStackTraceFrame(List<StackTraceElement> list) {
        StackTraceFrame stackTraceFrame = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                stackTraceFrame = new StackTraceFrame(stackTraceFrame, listIterator.previous());
            }
        }
        return new StackTraceFrame(stackTraceFrame, ARTIFICIAL_FRAME);
    }

    private final String toStringRepr(Object obj) {
        String repr;
        repr = DebugProbesImplKt.repr(obj.toString());
        return repr;
    }

    private final void updateRunningState(c frame, String state) {
        boolean z10;
        if (isInstalled$kotlinx_coroutines_debug()) {
            ConcurrentWeakMap<c, DebugCoroutineInfoImpl> concurrentWeakMap = callerInfoCache;
            DebugCoroutineInfoImpl remove = concurrentWeakMap.remove(frame);
            if (remove != null) {
                z10 = false;
            } else {
                CoroutineOwner<?> owner = owner(frame);
                if (owner == null || (remove = owner.info) == null) {
                    return;
                }
                c lastObservedFrame$kotlinx_coroutines_core = remove.getLastObservedFrame$kotlinx_coroutines_core();
                c realCaller = lastObservedFrame$kotlinx_coroutines_core != null ? realCaller(lastObservedFrame$kotlinx_coroutines_core) : null;
                if (realCaller != null) {
                    concurrentWeakMap.remove(realCaller);
                }
                z10 = true;
            }
            remove.updateState$kotlinx_coroutines_core(state, (a) frame, z10);
            c realCaller2 = realCaller(frame);
            if (realCaller2 == null) {
                return;
            }
            concurrentWeakMap.put(realCaller2, remove);
        }
    }

    private final void updateState(a<?> frame, String state) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            if (ignoreCoroutinesWithEmptyContext && frame.getContext() == EmptyCoroutineContext.f23155a) {
                return;
            }
            if (f.b(state, DebugCoroutineInfoImplKt.RUNNING)) {
                c cVar = frame instanceof c ? (c) frame : null;
                if (cVar == null) {
                    return;
                }
                updateRunningState(cVar, state);
                return;
            }
            CoroutineOwner<?> owner = owner(frame);
            if (owner == null) {
                return;
            }
            updateState(owner, frame, state);
        }
    }

    public final void dumpCoroutines(PrintStream out) {
        synchronized (out) {
            INSTANCE.dumpCoroutinesSynchronized(out);
            p pVar = p.f3034a;
        }
    }

    public final List<DebugCoroutineInfo> dumpCoroutinesInfo() {
        if (isInstalled$kotlinx_coroutines_debug()) {
            return kotlin.sequences.a.k(kotlin.sequences.a.j(new m(new k(getCapturedCoroutines(), 1), new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new InterfaceC0646l<CoroutineOwner<?>, DebugCoroutineInfo>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1
                @Override // ca.InterfaceC0646l
                public final DebugCoroutineInfo invoke(DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
                    boolean isFinished;
                    d context;
                    isFinished = DebugProbesImpl.INSTANCE.isFinished(coroutineOwner);
                    if (isFinished || (context = coroutineOwner.info.getContext()) == null) {
                        return null;
                    }
                    return new DebugCoroutineInfo(coroutineOwner.info, context);
                }
            }));
        }
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    public final Object[] dumpCoroutinesInfoAsJsonAndReferences() {
        String name;
        List<DebugCoroutineInfo> dumpCoroutinesInfo = dumpCoroutinesInfo();
        int size = dumpCoroutinesInfo.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (DebugCoroutineInfo debugCoroutineInfo : dumpCoroutinesInfo) {
            d context = debugCoroutineInfo.getContext();
            CoroutineName coroutineName = (CoroutineName) context.get(CoroutineName.INSTANCE);
            Long l10 = null;
            String stringRepr = (coroutineName == null || (name = coroutineName.getName()) == null) ? null : toStringRepr(name);
            CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) context.get(CoroutineDispatcher.INSTANCE);
            String stringRepr2 = coroutineDispatcher != null ? toStringRepr(coroutineDispatcher) : null;
            StringBuilder m2 = com.google.android.gms.measurement.internal.a.m("\n                {\n                    \"name\": ", stringRepr, ",\n                    \"id\": ");
            CoroutineId coroutineId = (CoroutineId) context.get(CoroutineId.INSTANCE);
            if (coroutineId != null) {
                l10 = Long.valueOf(coroutineId.getId());
            }
            m2.append(l10);
            m2.append(",\n                    \"dispatcher\": ");
            m2.append(stringRepr2);
            m2.append(",\n                    \"sequenceNumber\": ");
            m2.append(debugCoroutineInfo.getSequenceNumber());
            m2.append(",\n                    \"state\": \"");
            m2.append(debugCoroutineInfo.getState());
            m2.append("\"\n                } \n                ");
            arrayList3.add(C0963h.N(m2.toString()));
            arrayList2.add(debugCoroutineInfo.getLastObservedFrame());
            arrayList.add(debugCoroutineInfo.getLastObservedThread());
        }
        return new Object[]{v.q(new StringBuilder("["), s.P(arrayList3, null, null, null, null, 63), ']'), arrayList.toArray(new Thread[0]), arrayList2.toArray(new c[0]), dumpCoroutinesInfo.toArray(new DebugCoroutineInfo[0])};
    }

    public final List<DebuggerInfo> dumpDebuggerInfo() {
        if (isInstalled$kotlinx_coroutines_debug()) {
            return kotlin.sequences.a.k(kotlin.sequences.a.j(new m(new k(getCapturedCoroutines(), 1), new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new InterfaceC0646l<CoroutineOwner<?>, DebuggerInfo>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1
                @Override // ca.InterfaceC0646l
                public final DebuggerInfo invoke(DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
                    boolean isFinished;
                    d context;
                    isFinished = DebugProbesImpl.INSTANCE.isFinished(coroutineOwner);
                    if (isFinished || (context = coroutineOwner.info.getContext()) == null) {
                        return null;
                    }
                    return new DebuggerInfo(coroutineOwner.info, context);
                }
            }));
        }
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    public final List<StackTraceElement> enhanceStackTraceWithThreadDump(DebugCoroutineInfo info, List<StackTraceElement> coroutineTrace) {
        return enhanceStackTraceWithThreadDumpImpl(info.getState(), info.getLastObservedThread(), coroutineTrace);
    }

    public final String enhanceStackTraceWithThreadDumpAsJson(DebugCoroutineInfo info) {
        List<StackTraceElement> enhanceStackTraceWithThreadDump = enhanceStackTraceWithThreadDump(info, info.lastObservedStackTrace());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : enhanceStackTraceWithThreadDump) {
            StringBuilder sb2 = new StringBuilder("\n                {\n                    \"declaringClass\": \"");
            sb2.append(stackTraceElement.getClassName());
            sb2.append("\",\n                    \"methodName\": \"");
            sb2.append(stackTraceElement.getMethodName());
            sb2.append("\",\n                    \"fileName\": ");
            String fileName = stackTraceElement.getFileName();
            sb2.append(fileName != null ? toStringRepr(fileName) : null);
            sb2.append(",\n                    \"lineNumber\": ");
            sb2.append(stackTraceElement.getLineNumber());
            sb2.append("\n                }\n                ");
            arrayList.add(C0963h.N(sb2.toString()));
        }
        return v.q(new StringBuilder("["), s.P(arrayList, null, null, null, null, 63), ']');
    }

    public final boolean getEnableCreationStackTraces$kotlinx_coroutines_core() {
        return enableCreationStackTraces;
    }

    public final boolean getIgnoreCoroutinesWithEmptyContext() {
        return ignoreCoroutinesWithEmptyContext;
    }

    public final boolean getSanitizeStackTraces$kotlinx_coroutines_core() {
        return sanitizeStackTraces;
    }

    public final String hierarchyToString$kotlinx_coroutines_core(Job job) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Debug probes are not installed".toString());
        }
        Set<CoroutineOwner<?>> capturedCoroutines = getCapturedCoroutines();
        ArrayList<CoroutineOwner> arrayList = new ArrayList();
        for (Object obj : capturedCoroutines) {
            if (((CoroutineOwner) obj).delegate.getContext().get(Job.INSTANCE) != null) {
                arrayList.add(obj);
            }
        }
        int n10 = z.n(n.u(arrayList, 10));
        if (n10 < 16) {
            n10 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(n10);
        for (CoroutineOwner coroutineOwner : arrayList) {
            linkedHashMap.put(JobKt.getJob(coroutineOwner.delegate.getContext()), coroutineOwner.info);
        }
        StringBuilder sb2 = new StringBuilder();
        INSTANCE.build(job, linkedHashMap, sb2, "");
        return sb2.toString();
    }

    public final void install$kotlinx_coroutines_core() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        InterfaceC0646l<Boolean, p> interfaceC0646l;
        atomicIntegerFieldUpdater = DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.installations$volatile$FU;
        if (atomicIntegerFieldUpdater.incrementAndGet(debugProbesImpl$VolatileWrapper$atomicfu$private) > 1) {
            return;
        }
        startWeakRefCleanerThread();
        if (AgentInstallationType.INSTANCE.isInstalledStatically$kotlinx_coroutines_core() || (interfaceC0646l = dynamicAttach) == null) {
            return;
        }
        interfaceC0646l.invoke(Boolean.TRUE);
    }

    public final boolean isInstalled$kotlinx_coroutines_debug() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        atomicIntegerFieldUpdater = DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.installations$volatile$FU;
        return atomicIntegerFieldUpdater.get(debugProbesImpl$VolatileWrapper$atomicfu$private) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> a<T> probeCoroutineCreated$kotlinx_coroutines_core(a<? super T> completion) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            return completion;
        }
        if (ignoreCoroutinesWithEmptyContext && completion.getContext() == EmptyCoroutineContext.f23155a) {
            return completion;
        }
        if (owner(completion) != null) {
            return completion;
        }
        return createOwner(completion, enableCreationStackTraces ? toStackTraceFrame(sanitizeStackTrace(new Exception())) : null);
    }

    public final void probeCoroutineResumed$kotlinx_coroutines_core(a<?> frame) {
        updateState(frame, DebugCoroutineInfoImplKt.RUNNING);
    }

    public final void probeCoroutineSuspended$kotlinx_coroutines_core(a<?> frame) {
        updateState(frame, DebugCoroutineInfoImplKt.SUSPENDED);
    }

    public final void setEnableCreationStackTraces$kotlinx_coroutines_core(boolean z10) {
        enableCreationStackTraces = z10;
    }

    public final void setIgnoreCoroutinesWithEmptyContext(boolean z10) {
        ignoreCoroutinesWithEmptyContext = z10;
    }

    public final void setSanitizeStackTraces$kotlinx_coroutines_core(boolean z10) {
        sanitizeStackTraces = z10;
    }

    public final void uninstall$kotlinx_coroutines_core() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        InterfaceC0646l<Boolean, p> interfaceC0646l;
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Agent was not installed".toString());
        }
        atomicIntegerFieldUpdater = DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.installations$volatile$FU;
        if (atomicIntegerFieldUpdater.decrementAndGet(debugProbesImpl$VolatileWrapper$atomicfu$private) != 0) {
            return;
        }
        stopWeakRefCleanerThread();
        capturedCoroutinesMap.clear();
        callerInfoCache.clear();
        if (AgentInstallationType.INSTANCE.isInstalledStatically$kotlinx_coroutines_core() || (interfaceC0646l = dynamicAttach) == null) {
            return;
        }
        interfaceC0646l.invoke(Boolean.FALSE);
    }

    private final CoroutineOwner<?> owner(c cVar) {
        while (!(cVar instanceof CoroutineOwner)) {
            cVar = cVar.getCallerFrame();
            if (cVar == null) {
                return null;
            }
        }
        return (CoroutineOwner) cVar;
    }

    private final void updateState(CoroutineOwner<?> owner, a<?> frame, String state) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            owner.info.updateState$kotlinx_coroutines_core(state, frame, true);
        }
    }

    private static /* synthetic */ void getDebugString$annotations(Job job) {
    }
}
