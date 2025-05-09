package kotlinx.coroutines.channels;

import O9.m;
import O9.p;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import ca.InterfaceC0651q;
import ca.InterfaceC0652r;
import com.google.firebase.analytics.FirebaseAnalytics;
import ia.InterfaceC0837e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause1Impl;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.TrySelectDetailedResult;

/* compiled from: BufferedChannel.kt */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\bG\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0004\u0084\u0002\u0085\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\b\u0002\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b\u0013\u0010\rJ\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u000b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096@¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$H\u0004¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010(\u001a\u00020$H\u0000¢\u0006\u0004\b)\u0010'J%\u0010.\u001a\u00020\u00062\n\u0010,\u001a\u0006\u0012\u0002\b\u00030+2\b\u0010\u000b\u001a\u0004\u0018\u00010-H\u0014¢\u0006\u0004\b.\u0010/J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0096\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0006H\u0014¢\u0006\u0004\b3\u0010\u001bJ\u0019\u00106\u001a\u00020\u00122\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u00122\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b8\u00107J\r\u00108\u001a\u00020\u0006¢\u0006\u0004\b8\u0010\u001bJ\u001d\u00108\u001a\u00020\u00062\u000e\u00105\u001a\n\u0018\u000109j\u0004\u0018\u0001`:¢\u0006\u0004\b8\u0010;J\u0019\u0010=\u001a\u00020\u00122\b\u00105\u001a\u0004\u0018\u000104H\u0010¢\u0006\u0004\b<\u00107J!\u0010>\u001a\u00020\u00122\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020\u0012H\u0014¢\u0006\u0004\b>\u0010?J%\u0010A\u001a\u00020\u00062\u0014\u0010@\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000104\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020\u0012H\u0000¢\u0006\u0004\bC\u0010\u0018J\u000f\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010I\u001a\u00020EH\u0000¢\u0006\u0004\bH\u0010GJ\r\u0010J\u001a\u00020\u0006¢\u0006\u0004\bJ\u0010\u001bJ\u0018\u0010K\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0082@¢\u0006\u0004\bK\u0010\rJ6\u0010P\u001a\u00020\u00062\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000L2\u0006\u0010N\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010O\u001a\u00020$H\u0082@¢\u0006\u0004\bP\u0010QJ)\u0010S\u001a\u00020\u0006*\u00020R2\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000L2\u0006\u0010N\u001a\u00020\u0003H\u0002¢\u0006\u0004\bS\u0010TJ%\u0010W\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00060UH\u0002¢\u0006\u0004\bW\u0010XJ\u0092\u0001\u0010b\u001a\u00028\u0001\"\u0004\b\u0001\u0010Y2\u0006\u0010\u000b\u001a\u00028\u00002\b\u0010Z\u001a\u0004\u0018\u00010-2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00010[2\u001e\u0010^\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000L\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00010]2\f\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00010[2,\b\u0002\u0010a\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000L\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00028\u00010`H\u0082\b¢\u0006\u0004\bb\u0010cJZ\u0010d\u001a\u00020\u00062\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000L2\u0006\u0010N\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010O\u001a\u00020$2\u0006\u0010Z\u001a\u00020R2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00060[2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00060[H\u0082\b¢\u0006\u0004\bd\u0010eJG\u0010g\u001a\u00020\u00032\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000L2\u0006\u0010N\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010O\u001a\u00020$2\b\u0010Z\u001a\u0004\u0018\u00010-2\u0006\u0010f\u001a\u00020\u0012H\u0002¢\u0006\u0004\bg\u0010hJG\u0010i\u001a\u00020\u00032\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000L2\u0006\u0010N\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010O\u001a\u00020$2\b\u0010Z\u001a\u0004\u0018\u00010-2\u0006\u0010f\u001a\u00020\u0012H\u0002¢\u0006\u0004\bi\u0010hJ\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010j\u001a\u00020$H\u0003¢\u0006\u0004\b\u0019\u0010kJ\u0017\u0010m\u001a\u00020\u00122\u0006\u0010l\u001a\u00020$H\u0002¢\u0006\u0004\bm\u0010kJ\u001b\u0010n\u001a\u00020\u0012*\u00020-2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\bn\u0010oJ.\u0010q\u001a\u00028\u00002\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000L2\u0006\u0010N\u001a\u00020\u00032\u0006\u0010p\u001a\u00020$H\u0082@¢\u0006\u0004\bq\u0010rJ)\u0010s\u001a\u00020\u0006*\u00020R2\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000L2\u0006\u0010N\u001a\u00020\u0003H\u0002¢\u0006\u0004\bs\u0010TJ\u001d\u0010t\u001a\u00020\u00062\f\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000UH\u0002¢\u0006\u0004\bt\u0010uJ4\u0010w\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000L2\u0006\u0010N\u001a\u00020\u00032\u0006\u0010p\u001a\u00020$H\u0082@¢\u0006\u0004\bv\u0010rJ#\u0010x\u001a\u00020\u00062\u0012\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0UH\u0002¢\u0006\u0004\bx\u0010uJ\u0090\u0001\u0010{\u001a\u00028\u0001\"\u0004\b\u0001\u0010Y2\b\u0010Z\u001a\u0004\u0018\u00010-2\u0012\u0010y\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052$\u0010^\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000L\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00028\u00010z2\f\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00010[2&\b\u0002\u0010a\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000L\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00028\u00010zH\u0082\b¢\u0006\u0004\b{\u0010|JX\u0010}\u001a\u00020\u00062\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000L2\u0006\u0010N\u001a\u00020\u00032\u0006\u0010p\u001a\u00020$2\u0006\u0010Z\u001a\u00020R2\u0012\u0010y\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00060[H\u0082\b¢\u0006\u0004\b}\u0010~J:\u0010\u007f\u001a\u0004\u0018\u00010-2\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000L2\u0006\u0010N\u001a\u00020\u00032\u0006\u0010p\u001a\u00020$2\b\u0010Z\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J<\u0010\u0081\u0001\u001a\u0004\u0018\u00010-2\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000L2\u0006\u0010N\u001a\u00020\u00032\u0006\u0010p\u001a\u00020$2\b\u0010Z\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0080\u0001J,\u0010\u0082\u0001\u001a\u00020\u0012*\u00020-2\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000L2\u0006\u0010N\u001a\u00020\u0003H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0011\u0010\u0084\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0084\u0001\u0010\u001bJ1\u0010\u0086\u0001\u001a\u00020\u00122\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000L2\u0006\u0010N\u001a\u00020\u00032\u0007\u0010\u0085\u0001\u001a\u00020$H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J1\u0010\u0088\u0001\u001a\u00020\u00122\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000L2\u0006\u0010N\u001a\u00020\u00032\u0007\u0010\u0085\u0001\u001a\u00020$H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0087\u0001J\u001c\u0010\u008a\u0001\u001a\u00020\u00062\t\b\u0002\u0010\u0089\u0001\u001a\u00020$H\u0002¢\u0006\u0005\b\u008a\u0001\u0010'J&\u0010\u008b\u0001\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u00002\n\u0010,\u001a\u0006\u0012\u0002\b\u00030+H\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J*\u0010\u008f\u0001\u001a\u0004\u0018\u00010-2\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010-2\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J(\u0010\u0091\u0001\u001a\u00020\u00062\n\u0010,\u001a\u0006\u0012\u0002\b\u00030+2\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0005\b\u0091\u0001\u0010/J\u001e\u0010\u0092\u0001\u001a\u00020\u00062\n\u0010,\u001a\u0006\u0012\u0002\b\u00030+H\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J*\u0010\u0094\u0001\u001a\u0004\u0018\u00010-2\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010-2\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0090\u0001J*\u0010\u0095\u0001\u001a\u0004\u0018\u00010-2\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010-2\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u0090\u0001J*\u0010\u0096\u0001\u001a\u0004\u0018\u00010-2\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010-2\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0090\u0001J\u0011\u0010\u0097\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0097\u0001\u0010\u001bJ\u0011\u0010\u0098\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0098\u0001\u0010\u001bJ\u0011\u0010\u0099\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0099\u0001\u0010\u001bJ\u0011\u0010\u009a\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u009a\u0001\u0010\u001bJ\u0011\u0010\u009b\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u009b\u0001\u0010\u001bJ!\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000L2\u0007\u0010\u009c\u0001\u001a\u00020$H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u001a\u0010\u009f\u0001\u001a\u00020\u00062\u0007\u0010\u009c\u0001\u001a\u00020$H\u0002¢\u0006\u0005\b\u009f\u0001\u0010'J\u0018\u0010 \u0001\u001a\b\u0012\u0004\u0012\u00028\u00000LH\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001J!\u0010£\u0001\u001a\u00020$2\r\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000LH\u0002¢\u0006\u0006\b£\u0001\u0010¤\u0001J!\u0010¥\u0001\u001a\u00020\u00062\r\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000LH\u0002¢\u0006\u0006\b¥\u0001\u0010¦\u0001J*\u0010¨\u0001\u001a\u00020\u00062\r\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000L2\u0007\u0010§\u0001\u001a\u00020$H\u0002¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0016\u0010ª\u0001\u001a\u00020\u0006*\u00020RH\u0002¢\u0006\u0006\bª\u0001\u0010«\u0001J\u0016\u0010¬\u0001\u001a\u00020\u0006*\u00020RH\u0002¢\u0006\u0006\b¬\u0001\u0010«\u0001J\u001f\u0010®\u0001\u001a\u00020\u0006*\u00020R2\u0007\u0010\u00ad\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0006\b®\u0001\u0010¯\u0001J$\u0010²\u0001\u001a\u00020\u00122\u0007\u0010°\u0001\u001a\u00020$2\u0007\u0010±\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0006\b²\u0001\u0010³\u0001J0\u0010´\u0001\u001a\u00020\u00122\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000L2\u0006\u0010N\u001a\u00020\u00032\u0006\u0010(\u001a\u00020$H\u0002¢\u0006\u0006\b´\u0001\u0010\u0087\u0001J2\u0010·\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010L2\u0007\u0010µ\u0001\u001a\u00020$2\r\u0010¶\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000LH\u0002¢\u0006\u0006\b·\u0001\u0010¸\u0001J2\u0010¹\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010L2\u0007\u0010µ\u0001\u001a\u00020$2\r\u0010¶\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000LH\u0002¢\u0006\u0006\b¹\u0001\u0010¸\u0001J;\u0010»\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010L2\u0007\u0010µ\u0001\u001a\u00020$2\r\u0010¶\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000L2\u0007\u0010º\u0001\u001a\u00020$H\u0002¢\u0006\u0006\b»\u0001\u0010¼\u0001J*\u0010½\u0001\u001a\u00020\u00062\u0007\u0010µ\u0001\u001a\u00020$2\r\u0010¶\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000LH\u0002¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u001a\u0010À\u0001\u001a\u00020\u00062\u0007\u0010¿\u0001\u001a\u00020$H\u0002¢\u0006\u0005\bÀ\u0001\u0010'J\u001a\u0010Á\u0001\u001a\u00020\u00062\u0007\u0010¿\u0001\u001a\u00020$H\u0002¢\u0006\u0005\bÁ\u0001\u0010'JL\u0010Ä\u0001\u001a\"\u0012\u0004\u0012\u000204\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0005\u0012\u00030Ã\u0001\u0012\u0004\u0012\u00020\u00060Â\u0001*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0007H\u0002¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J2\u0010É\u0001\u001a\u00020\u00062\u0006\u00105\u001a\u0002042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\b\u0010Æ\u0001\u001a\u00030Ã\u0001H\u0002¢\u0006\u0006\bÇ\u0001\u0010È\u0001JO\u0010Ê\u0001\u001a\u001d\u0012\u0004\u0012\u000204\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0005\u0012\u00030Ã\u0001\u0012\u0004\u0012\u00020\u00060z*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001JF\u0010Ê\u0001\u001a\u001c\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030Ã\u0001\u0012\u0004\u0012\u00020\u00060Â\u0001*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0007H\u0002¢\u0006\u0006\bÊ\u0001\u0010Å\u0001J,\u0010Ì\u0001\u001a\u00020\u00062\u0006\u00105\u001a\u0002042\u0006\u0010\u000b\u001a\u00028\u00002\b\u0010Æ\u0001\u001a\u00030Ã\u0001H\u0002¢\u0006\u0006\bÌ\u0001\u0010È\u0001R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010Í\u0001R/\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00078\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\b\b\u0010Î\u0001Rb\u0010Ð\u0001\u001aF\u0012\b\u0012\u0006\u0012\u0002\b\u00030+\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u000204\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0005\u0012\u00030Ã\u0001\u0012\u0004\u0012\u00020\u00060z\u0018\u00010zj\u0005\u0018\u0001`Ï\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\bÐ\u0001\u0010Ñ\u0001\u0012\u0005\bÒ\u0001\u0010\u001bR\u0017\u0010§\u0001\u001a\u00020$8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÓ\u0001\u0010Ô\u0001R\u0017\u0010Ö\u0001\u001a\u00020$8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÕ\u0001\u0010Ô\u0001R1\u0010Û\u0001\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000×\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÚ\u0001\u0010\u001b\u001a\u0006\bØ\u0001\u0010Ù\u0001R%\u0010à\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000Ü\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bß\u0001\u0010\u001b\u001a\u0006\bÝ\u0001\u0010Þ\u0001R+\u0010ã\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0Ü\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bâ\u0001\u0010\u001b\u001a\u0006\bá\u0001\u0010Þ\u0001R'\u0010æ\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000Ü\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bå\u0001\u0010\u001b\u001a\u0006\bä\u0001\u0010Þ\u0001R\u0019\u0010é\u0001\u001a\u0004\u0018\u0001048DX\u0084\u0004¢\u0006\b\u001a\u0006\bç\u0001\u0010è\u0001R\u0017\u0010ë\u0001\u001a\u0002048DX\u0084\u0004¢\u0006\b\u001a\u0006\bê\u0001\u0010è\u0001R\u0016\u0010ì\u0001\u001a\u00020\u00128TX\u0094\u0004¢\u0006\u0007\u001a\u0005\bì\u0001\u0010\u0018R\u001d\u0010í\u0001\u001a\u00020\u00128VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bî\u0001\u0010\u001b\u001a\u0005\bí\u0001\u0010\u0018R\u001d\u0010±\u0001\u001a\u00020\u00128VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bï\u0001\u0010\u001b\u001a\u0005\b±\u0001\u0010\u0018R\u001d\u0010ð\u0001\u001a\u00020\u00128VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bñ\u0001\u0010\u001b\u001a\u0005\bð\u0001\u0010\u0018R\u0017\u0010ó\u0001\u001a\u00020$8BX\u0082\u0004¢\u0006\b\u001a\u0006\bò\u0001\u0010Ô\u0001R\u0016\u0010ô\u0001\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bô\u0001\u0010\u0018R\u0017\u0010ö\u0001\u001a\u0002048BX\u0082\u0004¢\u0006\b\u001a\u0006\bõ\u0001\u0010è\u0001R\u001a\u0010÷\u0001\u001a\u00020\u0012*\u00020$8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b÷\u0001\u0010kR\u001a\u0010ø\u0001\u001a\u00020\u0012*\u00020$8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bø\u0001\u0010kR\r\u0010ú\u0001\u001a\u00030ù\u00018\u0002X\u0082\u0004R\r\u0010û\u0001\u001a\u00030ù\u00018\u0002X\u0082\u0004R\r\u0010ü\u0001\u001a\u00030ù\u00018\u0002X\u0082\u0004R\r\u0010ý\u0001\u001a\u00030ù\u00018\u0002X\u0082\u0004R\u0019\u0010ÿ\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000L0þ\u00018\u0002X\u0082\u0004R\u0019\u0010\u0080\u0002\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000L0þ\u00018\u0002X\u0082\u0004R\u0019\u0010\u0081\u0002\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000L0þ\u00018\u0002X\u0082\u0004R\u0015\u0010\u0082\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010-0þ\u00018\u0002X\u0082\u0004R\u0015\u0010\u0083\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010-0þ\u00018\u0002X\u0082\u0004¨\u0006\u0086\u0002"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel;", "E", "Lkotlinx/coroutines/channels/Channel;", "", "capacity", "Lkotlin/Function1;", "LO9/p;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILca/l;)V", "element", "send", "(Ljava/lang/Object;LT9/a;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "", "sendBroadcast$kotlinx_coroutines_core", "sendBroadcast", "trySendDropOldest-JP2dKIU", "trySendDropOldest", "shouldSendSuspend$kotlinx_coroutines_core", "()Z", "shouldSendSuspend", "onReceiveEnqueued", "()V", "onReceiveDequeued", "receive", "(LT9/a;)Ljava/lang/Object;", "receiveCatching-JP2dKIU", "receiveCatching", "tryReceive-PtdJZtk", "()Ljava/lang/Object;", "tryReceive", "", "globalCellIndex", "dropFirstElementUntilTheSpecifiedCellIsInTheBuffer", "(J)V", "globalIndex", "waitExpandBufferCompletion$kotlinx_coroutines_core", "waitExpandBufferCompletion", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "", "registerSelectForSend", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", "Lkotlinx/coroutines/channels/ChannelIterator;", "iterator", "()Lkotlinx/coroutines/channels/ChannelIterator;", "onClosedIdempotent", "", "cause", "close", "(Ljava/lang/Throwable;)Z", "cancel", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "cancelImpl$kotlinx_coroutines_core", "cancelImpl", "closeOrCancelImpl", "(Ljava/lang/Throwable;Z)Z", "handler", "invokeOnClose", "(Lca/l;)V", "hasElements$kotlinx_coroutines_core", "hasElements", "", "toString", "()Ljava/lang/String;", "toStringDebug$kotlinx_coroutines_core", "toStringDebug", "checkSegmentStructureInvariants", "onClosedSend", "Lkotlinx/coroutines/channels/ChannelSegment;", "segment", FirebaseAnalytics.Param.INDEX, "s", "sendOnNoWaiterSuspend", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLT9/a;)Ljava/lang/Object;", "Lkotlinx/coroutines/Waiter;", "prepareSenderForSuspension", "(Lkotlinx/coroutines/Waiter;Lkotlinx/coroutines/channels/ChannelSegment;I)V", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "onClosedSendOnNoWaiterSuspend", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "R", "waiter", "Lkotlin/Function0;", "onRendezvousOrBuffered", "Lkotlin/Function2;", "onSuspend", "onClosed", "Lkotlin/Function4;", "onNoWaiterSuspend", "sendImpl", "(Ljava/lang/Object;Ljava/lang/Object;Lca/a;Lca/p;Lca/a;Lca/r;)Ljava/lang/Object;", "sendImplOnNoWaiter", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLkotlinx/coroutines/Waiter;Lca/a;Lca/a;)V", "closed", "updateCellSend", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLjava/lang/Object;Z)I", "updateCellSendSlow", "curSendersAndCloseStatus", "(J)Z", "curSenders", "bufferOrRendezvousSend", "tryResumeReceiver", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "r", "receiveOnNoWaiterSuspend", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLT9/a;)Ljava/lang/Object;", "prepareReceiverForSuspension", "onClosedReceiveOnNoWaiterSuspend", "(Lkotlinx/coroutines/CancellableContinuation;)V", "receiveCatchingOnNoWaiterSuspend-GKJJFZk", "receiveCatchingOnNoWaiterSuspend", "onClosedReceiveCatchingOnNoWaiterSuspend", "onElementRetrieved", "Lkotlin/Function3;", "receiveImpl", "(Ljava/lang/Object;Lca/l;Lca/q;Lca/a;Lca/q;)Ljava/lang/Object;", "receiveImplOnNoWaiter", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLkotlinx/coroutines/Waiter;Lca/l;Lca/a;)V", "updateCellReceive", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLjava/lang/Object;)Ljava/lang/Object;", "updateCellReceiveSlow", "tryResumeSender", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/ChannelSegment;I)Z", "expandBuffer", "b", "updateCellExpandBuffer", "(Lkotlinx/coroutines/channels/ChannelSegment;IJ)Z", "updateCellExpandBufferSlow", "nAttempts", "incCompletedExpandBufferAttempts", "onClosedSelectOnSend", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)V", "ignoredParam", "selectResult", "processResultSelectSend", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "registerSelectForReceive", "onClosedSelectOnReceive", "(Lkotlinx/coroutines/selects/SelectInstance;)V", "processResultSelectReceive", "processResultSelectReceiveOrNull", "processResultSelectReceiveCatching", "invokeCloseHandler", "markClosed", "markCancelled", "markCancellationStarted", "completeCloseOrCancel", "sendersCur", "completeClose", "(J)Lkotlinx/coroutines/channels/ChannelSegment;", "completeCancel", "closeLinkedList", "()Lkotlinx/coroutines/channels/ChannelSegment;", "lastSegment", "markAllEmptyCellsAsClosed", "(Lkotlinx/coroutines/channels/ChannelSegment;)J", "removeUnprocessedElements", "(Lkotlinx/coroutines/channels/ChannelSegment;)V", "sendersCounter", "cancelSuspendedReceiveRequests", "(Lkotlinx/coroutines/channels/ChannelSegment;J)V", "resumeReceiverOnClosedChannel", "(Lkotlinx/coroutines/Waiter;)V", "resumeSenderOnCancelledChannel", "receiver", "resumeWaiterOnClosedChannel", "(Lkotlinx/coroutines/Waiter;Z)V", "sendersAndCloseStatusCur", "isClosedForReceive", "isClosed", "(JZ)Z", "isCellNonEmpty", "id", "startFrom", "findSegmentSend", "(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", "findSegmentReceive", "currentBufferEndCounter", "findSegmentBufferEnd", "(JLkotlinx/coroutines/channels/ChannelSegment;J)Lkotlinx/coroutines/channels/ChannelSegment;", "moveSegmentBufferEndToSpecifiedOrLast", "(JLkotlinx/coroutines/channels/ChannelSegment;)V", "value", "updateSendersCounterIfLower", "updateReceiversCounterIfLower", "Lkotlin/reflect/KFunction3;", "Lkotlin/coroutines/d;", "bindCancellationFunResult", "(Lca/l;)Lia/e;", "context", "onCancellationChannelResultImplDoNotCall-5_sEAP8", "(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/d;)V", "onCancellationChannelResultImplDoNotCall", "bindCancellationFun", "(Lca/l;Ljava/lang/Object;)Lca/q;", "onCancellationImplDoNotCall", "I", "Lca/l;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onUndeliveredElementReceiveCancellationConstructor", "Lca/q;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "getSendersCounter$kotlinx_coroutines_core", "()J", "getReceiversCounter$kotlinx_coroutines_core", "receiversCounter", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend$annotations", "onSend", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive$annotations", "onReceive", "getOnReceiveCatching", "getOnReceiveCatching$annotations", "onReceiveCatching", "getOnReceiveOrNull", "getOnReceiveOrNull$annotations", "onReceiveOrNull", "getCloseCause", "()Ljava/lang/Throwable;", "closeCause", "getSendException", "sendException", "isConflatedDropOldest", "isClosedForSend", "isClosedForSend$annotations", "isClosedForReceive$annotations", "isEmpty", "isEmpty$annotations", "getBufferEndCounter", "bufferEndCounter", "isRendezvousOrUnlimited", "getReceiveException", "receiveException", "isClosedForSend0", "isClosedForReceive0", "Lkotlinx/atomicfu/AtomicLong;", "sendersAndCloseStatus", "receivers", "bufferEnd", "completedExpandBuffersAndPauseFlag", "Lkotlinx/atomicfu/AtomicRef;", "sendSegment", "receiveSegment", "bufferEndSegment", "_closeCause", "closeHandler", "SendBroadcast", "BufferedChannelIterator", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public class BufferedChannel<E> implements Channel<E> {
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private final int capacity;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final InterfaceC0646l<E, p> onUndeliveredElement;
    private final InterfaceC0651q<SelectInstance<?>, Object, Object, InterfaceC0651q<Throwable, Object, kotlin.coroutines.d, p>> onUndeliveredElementReceiveCancellationConstructor;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    private static final /* synthetic */ AtomicLongFieldUpdater sendersAndCloseStatus$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater receivers$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater bufferEnd$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater completedExpandBuffersAndPauseFlag$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater sendSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater receiveSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater bufferEndSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _closeCause$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater closeHandler$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler$volatile");

    /* compiled from: BufferedChannel.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000e\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005H\u0096B¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u00102\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0012R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator;", "Lkotlinx/coroutines/channels/ChannelIterator;", "Lkotlinx/coroutines/Waiter;", "<init>", "(Lkotlinx/coroutines/channels/BufferedChannel;)V", "", "onClosedHasNext", "()Z", "Lkotlinx/coroutines/channels/ChannelSegment;", "segment", "", FirebaseAnalytics.Param.INDEX, "", "r", "hasNextOnNoWaiterSuspend", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLT9/a;)Ljava/lang/Object;", "LO9/p;", "onClosedHasNextNoWaiterSuspend", "()V", "hasNext", "(LT9/a;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/Segment;", "invokeOnCancellation", "(Lkotlinx/coroutines/internal/Segment;I)V", "next", "()Ljava/lang/Object;", "element", "tryResumeHasNext", "(Ljava/lang/Object;)Z", "tryResumeHasNextOnClosedChannel", "", "receiveResult", "Ljava/lang/Object;", "Lkotlinx/coroutines/CancellableContinuationImpl;", "continuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
    public final class BufferedChannelIterator implements ChannelIterator<E>, Waiter {
        private CancellableContinuationImpl<? super Boolean> continuation;
        private Object receiveResult;

        public BufferedChannelIterator() {
            Symbol symbol;
            symbol = BufferedChannelKt.NO_RECEIVE_RESULT;
            this.receiveResult = symbol;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object hasNextOnNoWaiterSuspend(ChannelSegment<E> channelSegment, int i, long j10, T9.a<? super Boolean> aVar) {
            Symbol symbol;
            Symbol symbol2;
            Boolean bool;
            Symbol symbol3;
            Symbol symbol4;
            Symbol symbol5;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(U4.b.p(aVar));
            try {
                this.continuation = orCreateCancellableContinuation;
                Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i, j10, this);
                symbol = BufferedChannelKt.SUSPEND;
                if (updateCellReceive == symbol) {
                    bufferedChannel.prepareReceiverForSuspension(this, channelSegment, i);
                } else {
                    symbol2 = BufferedChannelKt.FAILED;
                    InterfaceC0651q interfaceC0651q = null;
                    if (updateCellReceive == symbol2) {
                        if (j10 < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                            channelSegment.cleanPrev();
                        }
                        ChannelSegment channelSegment2 = (ChannelSegment) BufferedChannel.getReceiveSegment$volatile$FU().get(bufferedChannel);
                        while (true) {
                            if (bufferedChannel.isClosedForReceive()) {
                                onClosedHasNextNoWaiterSuspend();
                                break;
                            }
                            long andIncrement = BufferedChannel.getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
                            int i9 = BufferedChannelKt.SEGMENT_SIZE;
                            long j11 = andIncrement / i9;
                            int i10 = (int) (andIncrement % i9);
                            if (channelSegment2.id != j11) {
                                ChannelSegment findSegmentReceive = bufferedChannel.findSegmentReceive(j11, channelSegment2);
                                if (findSegmentReceive != null) {
                                    channelSegment2 = findSegmentReceive;
                                }
                            }
                            Object updateCellReceive2 = bufferedChannel.updateCellReceive(channelSegment2, i10, andIncrement, this);
                            symbol3 = BufferedChannelKt.SUSPEND;
                            if (updateCellReceive2 == symbol3) {
                                bufferedChannel.prepareReceiverForSuspension(this, channelSegment2, i10);
                                break;
                            }
                            symbol4 = BufferedChannelKt.FAILED;
                            if (updateCellReceive2 != symbol4) {
                                symbol5 = BufferedChannelKt.SUSPEND_NO_WAITER;
                                if (updateCellReceive2 == symbol5) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                channelSegment2.cleanPrev();
                                this.receiveResult = updateCellReceive2;
                                this.continuation = null;
                                bool = Boolean.TRUE;
                                InterfaceC0646l<E, p> interfaceC0646l = bufferedChannel.onUndeliveredElement;
                                if (interfaceC0646l != null) {
                                    interfaceC0651q = bufferedChannel.bindCancellationFun(interfaceC0646l, updateCellReceive2);
                                }
                            } else if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment2.cleanPrev();
                            }
                        }
                    } else {
                        channelSegment.cleanPrev();
                        this.receiveResult = updateCellReceive;
                        this.continuation = null;
                        bool = Boolean.TRUE;
                        InterfaceC0646l<E, p> interfaceC0646l2 = bufferedChannel.onUndeliveredElement;
                        if (interfaceC0646l2 != null) {
                            interfaceC0651q = bufferedChannel.bindCancellationFun(interfaceC0646l2, updateCellReceive);
                        }
                    }
                    orCreateCancellableContinuation.resume((CancellableContinuationImpl) bool, (InterfaceC0651q<? super Throwable, ? super CancellableContinuationImpl, ? super kotlin.coroutines.d, p>) interfaceC0651q);
                }
                Object result = orCreateCancellableContinuation.getResult();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                return result;
            } catch (Throwable th) {
                orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                throw th;
            }
        }

        private final boolean onClosedHasNext() {
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                return false;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(closeCause);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onClosedHasNextNoWaiterSuspend() {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                cancellableContinuationImpl.resumeWith(Boolean.FALSE);
            } else {
                cancellableContinuationImpl.resumeWith(new Result.Failure(closeCause));
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public Object hasNext(T9.a<? super Boolean> aVar) {
            Symbol symbol;
            Symbol symbol2;
            Symbol symbol3;
            Symbol symbol4;
            Object obj = this.receiveResult;
            symbol = BufferedChannelKt.NO_RECEIVE_RESULT;
            boolean z10 = true;
            if (obj == symbol || this.receiveResult == BufferedChannelKt.getCHANNEL_CLOSED()) {
                BufferedChannel<E> bufferedChannel = BufferedChannel.this;
                ChannelSegment<E> channelSegment = (ChannelSegment) BufferedChannel.getReceiveSegment$volatile$FU().get(bufferedChannel);
                while (true) {
                    if (bufferedChannel.isClosedForReceive()) {
                        z10 = onClosedHasNext();
                        break;
                    }
                    long andIncrement = BufferedChannel.getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
                    int i = BufferedChannelKt.SEGMENT_SIZE;
                    long j10 = andIncrement / i;
                    int i9 = (int) (andIncrement % i);
                    if (channelSegment.id != j10) {
                        ChannelSegment<E> findSegmentReceive = bufferedChannel.findSegmentReceive(j10, channelSegment);
                        if (findSegmentReceive == null) {
                            continue;
                        } else {
                            channelSegment = findSegmentReceive;
                        }
                    }
                    Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i9, andIncrement, null);
                    symbol2 = BufferedChannelKt.SUSPEND;
                    if (updateCellReceive == symbol2) {
                        throw new IllegalStateException("unreachable".toString());
                    }
                    symbol3 = BufferedChannelKt.FAILED;
                    if (updateCellReceive != symbol3) {
                        symbol4 = BufferedChannelKt.SUSPEND_NO_WAITER;
                        if (updateCellReceive == symbol4) {
                            return hasNextOnNoWaiterSuspend(channelSegment, i9, andIncrement, aVar);
                        }
                        channelSegment.cleanPrev();
                        this.receiveResult = updateCellReceive;
                    } else if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                }
            }
            return Boolean.valueOf(z10);
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int index) {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            if (cancellableContinuationImpl != null) {
                cancellableContinuationImpl.invokeOnCancellation(segment, index);
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public /* synthetic */ Object next(T9.a aVar) {
            return ChannelIterator.DefaultImpls.next(this, aVar);
        }

        public final boolean tryResumeHasNext(E element) {
            boolean tryResume0;
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            this.continuation = null;
            this.receiveResult = element;
            Boolean bool = Boolean.TRUE;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            InterfaceC0646l<E, p> interfaceC0646l = bufferedChannel.onUndeliveredElement;
            tryResume0 = BufferedChannelKt.tryResume0(cancellableContinuationImpl, bool, interfaceC0646l != null ? bufferedChannel.bindCancellationFun(interfaceC0646l, element) : null);
            return tryResume0;
        }

        public final void tryResumeHasNextOnClosedChannel() {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                cancellableContinuationImpl.resumeWith(Boolean.FALSE);
            } else {
                cancellableContinuationImpl.resumeWith(new Result.Failure(closeCause));
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public E next() {
            Symbol symbol;
            Symbol symbol2;
            E e10 = (E) this.receiveResult;
            symbol = BufferedChannelKt.NO_RECEIVE_RESULT;
            if (e10 == symbol) {
                throw new IllegalStateException("`hasNext()` has not been invoked".toString());
            }
            symbol2 = BufferedChannelKt.NO_RECEIVE_RESULT;
            this.receiveResult = symbol2;
            if (e10 != BufferedChannelKt.getCHANNEL_CLOSED()) {
                return e10;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(BufferedChannel.this.getReceiveException());
        }
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$SendBroadcast;", "Lkotlinx/coroutines/Waiter;", "Lkotlinx/coroutines/CancellableContinuation;", "", "cont", "<init>", "(Lkotlinx/coroutines/CancellableContinuation;)V", "Lkotlinx/coroutines/internal/Segment;", "segment", "", FirebaseAnalytics.Param.INDEX, "LO9/p;", "invokeOnCancellation", "(Lkotlinx/coroutines/internal/Segment;I)V", "Lkotlinx/coroutines/CancellableContinuation;", "getCont", "()Lkotlinx/coroutines/CancellableContinuation;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
    public static final class SendBroadcast implements Waiter {
        private final /* synthetic */ CancellableContinuationImpl<Boolean> $$delegate_0;
        private final CancellableContinuation<Boolean> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public SendBroadcast(CancellableContinuation<? super Boolean> cancellableContinuation) {
            this.$$delegate_0 = (CancellableContinuationImpl) cancellableContinuation;
            this.cont = cancellableContinuation;
        }

        public final CancellableContinuation<Boolean> getCont() {
            return this.cont;
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int index) {
            this.$$delegate_0.invokeOnCancellation(segment, index);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BufferedChannel(int i, InterfaceC0646l<? super E, p> interfaceC0646l) {
        long initialBufferEnd;
        Symbol symbol;
        this.capacity = i;
        this.onUndeliveredElement = interfaceC0646l;
        if (i < 0) {
            throw new IllegalArgumentException(s3.b.i("Invalid channel capacity: ", i, ", should be >=0").toString());
        }
        initialBufferEnd = BufferedChannelKt.initialBufferEnd(i);
        this.bufferEnd$volatile = initialBufferEnd;
        this.completedExpandBuffersAndPauseFlag$volatile = getBufferEndCounter();
        ChannelSegment channelSegment = new ChannelSegment(0L, null, this, 3);
        this.sendSegment$volatile = channelSegment;
        this.receiveSegment$volatile = channelSegment;
        this.bufferEndSegment$volatile = isRendezvousOrUnlimited() ? BufferedChannelKt.NULL_SEGMENT : channelSegment;
        this.onUndeliveredElementReceiveCancellationConstructor = interfaceC0646l != 0 ? new InterfaceC0651q() { // from class: kotlinx.coroutines.channels.b
            @Override // ca.InterfaceC0651q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                InterfaceC0651q onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56;
                onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56 = BufferedChannel.onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56(BufferedChannel.this, (SelectInstance) obj, obj2, obj3);
                return onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56;
            }
        } : null;
        symbol = BufferedChannelKt.NO_CLOSE_CAUSE;
        this._closeCause$volatile = symbol;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0651q<Throwable, Object, kotlin.coroutines.d, p> bindCancellationFun(final InterfaceC0646l<? super E, p> interfaceC0646l, final E e10) {
        return new InterfaceC0651q() { // from class: kotlinx.coroutines.channels.c
            @Override // ca.InterfaceC0651q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                p bindCancellationFun$lambda$89;
                bindCancellationFun$lambda$89 = BufferedChannel.bindCancellationFun$lambda$89(InterfaceC0646l.this, e10, (Throwable) obj, obj2, (kotlin.coroutines.d) obj3);
                return bindCancellationFun$lambda$89;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p bindCancellationFun$lambda$89(InterfaceC0646l interfaceC0646l, Object obj, Throwable th, Object obj2, kotlin.coroutines.d dVar) {
        OnUndeliveredElementKt.callUndeliveredElement(interfaceC0646l, obj, dVar);
        return p.f3034a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0837e<p> bindCancellationFunResult(InterfaceC0646l<? super E, p> interfaceC0646l) {
        return new BufferedChannel$bindCancellationFunResult$1(this);
    }

    private final boolean bufferOrRendezvousSend(long curSenders) {
        return curSenders < getBufferEndCounter() || curSenders < getReceiversCounter$kotlinx_coroutines_core() + ((long) this.capacity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void cancelSuspendedReceiveRequests(ChannelSegment<E> lastSegment, long sendersCounter) {
        Symbol symbol;
        Object m159constructorimpl$default = InlineList.m159constructorimpl$default(null, 1, null);
        loop0: while (lastSegment != null) {
            for (int i = BufferedChannelKt.SEGMENT_SIZE - 1; -1 < i; i--) {
                if ((lastSegment.id * BufferedChannelKt.SEGMENT_SIZE) + i < sendersCounter) {
                    break loop0;
                }
                while (true) {
                    Object state$kotlinx_coroutines_core = lastSegment.getState$kotlinx_coroutines_core(i);
                    if (state$kotlinx_coroutines_core != null) {
                        symbol = BufferedChannelKt.IN_BUFFER;
                        if (state$kotlinx_coroutines_core != symbol) {
                            if (!(state$kotlinx_coroutines_core instanceof WaiterEB)) {
                                if (!(state$kotlinx_coroutines_core instanceof Waiter)) {
                                    break;
                                }
                                if (lastSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                    m159constructorimpl$default = InlineList.m164plusFjFbRPM(m159constructorimpl$default, state$kotlinx_coroutines_core);
                                    lastSegment.onCancelledRequest(i, true);
                                    break;
                                }
                            } else {
                                if (lastSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                    m159constructorimpl$default = InlineList.m164plusFjFbRPM(m159constructorimpl$default, ((WaiterEB) state$kotlinx_coroutines_core).waiter);
                                    lastSegment.onCancelledRequest(i, true);
                                    break;
                                }
                            }
                        }
                    }
                    if (lastSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                        lastSegment.onSlotCleaned();
                        break;
                    }
                }
            }
            lastSegment = (ChannelSegment) lastSegment.getPrev();
        }
        if (m159constructorimpl$default != null) {
            if (!(m159constructorimpl$default instanceof ArrayList)) {
                resumeReceiverOnClosedChannel((Waiter) m159constructorimpl$default);
                return;
            }
            ArrayList arrayList = (ArrayList) m159constructorimpl$default;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                resumeReceiverOnClosedChannel((Waiter) arrayList.get(size));
            }
        }
    }

    private final ChannelSegment<E> closeLinkedList() {
        Object obj = bufferEndSegment$volatile$FU.get(this);
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(this);
        if (channelSegment.id > ((ChannelSegment) obj).id) {
            obj = channelSegment;
        }
        ChannelSegment channelSegment2 = (ChannelSegment) receiveSegment$volatile$FU.get(this);
        if (channelSegment2.id > ((ChannelSegment) obj).id) {
            obj = channelSegment2;
        }
        return (ChannelSegment) ConcurrentLinkedListKt.close((ConcurrentLinkedListNode) obj);
    }

    private final void completeCancel(long sendersCur) {
        removeUnprocessedElements(completeClose(sendersCur));
    }

    private final ChannelSegment<E> completeClose(long sendersCur) {
        ChannelSegment<E> closeLinkedList = closeLinkedList();
        if (isConflatedDropOldest()) {
            long markAllEmptyCellsAsClosed = markAllEmptyCellsAsClosed(closeLinkedList);
            if (markAllEmptyCellsAsClosed != -1) {
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(markAllEmptyCellsAsClosed);
            }
        }
        cancelSuspendedReceiveRequests(closeLinkedList, sendersCur);
        return closeLinkedList;
    }

    private final void completeCloseOrCancel() {
        isClosedForSend();
    }

    private final void expandBuffer() {
        if (isRendezvousOrUnlimited()) {
            return;
        }
        ChannelSegment<E> channelSegment = (ChannelSegment) bufferEndSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = bufferEnd$volatile$FU.getAndIncrement(this);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j10 = andIncrement / i;
            if (getSendersCounter$kotlinx_coroutines_core() <= andIncrement) {
                if (channelSegment.id < j10 && channelSegment.getNext() != 0) {
                    moveSegmentBufferEndToSpecifiedOrLast(j10, channelSegment);
                }
                incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
                return;
            }
            if (channelSegment.id != j10) {
                ChannelSegment<E> findSegmentBufferEnd = findSegmentBufferEnd(j10, channelSegment, andIncrement);
                if (findSegmentBufferEnd == null) {
                    continue;
                } else {
                    channelSegment = findSegmentBufferEnd;
                }
            }
            if (updateCellExpandBuffer(channelSegment, (int) (andIncrement % i), andIncrement)) {
                incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
                return;
            }
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
        }
    }

    private final ChannelSegment<E> findSegmentBufferEnd(long id, ChannelSegment<E> startFrom, long currentBufferEndCounter) {
        Object findSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bufferEndSegment$volatile$FU;
        InterfaceC0650p interfaceC0650p = (InterfaceC0650p) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            findSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(startFrom, id, interfaceC0650p);
            if (!SegmentOrClosed.m176isClosedimpl(findSegmentInternal)) {
                Segment m174getSegmentimpl = SegmentOrClosed.m174getSegmentimpl(findSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= m174getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m174getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, segment, m174getSegmentimpl)) {
                        if (atomicReferenceFieldUpdater.get(this) != segment) {
                            if (m174getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                                m174getSegmentimpl.remove();
                            }
                        }
                    }
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (SegmentOrClosed.m176isClosedimpl(findSegmentInternal)) {
            completeCloseOrCancel();
            moveSegmentBufferEndToSpecifiedOrLast(id, startFrom);
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
            return null;
        }
        ChannelSegment<E> channelSegment = (ChannelSegment) SegmentOrClosed.m174getSegmentimpl(findSegmentInternal);
        if (channelSegment.id <= id) {
            return channelSegment;
        }
        long j10 = channelSegment.id;
        int i = BufferedChannelKt.SEGMENT_SIZE;
        if (bufferEnd$volatile$FU.compareAndSet(this, currentBufferEndCounter + 1, j10 * i)) {
            incCompletedExpandBufferAttempts((channelSegment.id * i) - currentBufferEndCounter);
            return null;
        }
        incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChannelSegment<E> findSegmentReceive(long id, ChannelSegment<E> startFrom) {
        Object findSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = receiveSegment$volatile$FU;
        InterfaceC0650p interfaceC0650p = (InterfaceC0650p) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            findSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(startFrom, id, interfaceC0650p);
            if (!SegmentOrClosed.m176isClosedimpl(findSegmentInternal)) {
                Segment m174getSegmentimpl = SegmentOrClosed.m174getSegmentimpl(findSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= m174getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m174getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, segment, m174getSegmentimpl)) {
                        if (atomicReferenceFieldUpdater.get(this) != segment) {
                            if (m174getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                                m174getSegmentimpl.remove();
                            }
                        }
                    }
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (SegmentOrClosed.m176isClosedimpl(findSegmentInternal)) {
            completeCloseOrCancel();
            if (startFrom.id * BufferedChannelKt.SEGMENT_SIZE >= getSendersCounter$kotlinx_coroutines_core()) {
                return null;
            }
            startFrom.cleanPrev();
            return null;
        }
        ChannelSegment<E> channelSegment = (ChannelSegment) SegmentOrClosed.m174getSegmentimpl(findSegmentInternal);
        if (!isRendezvousOrUnlimited() && id <= getBufferEndCounter() / BufferedChannelKt.SEGMENT_SIZE) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = bufferEndSegment$volatile$FU;
            while (true) {
                Segment segment2 = (Segment) atomicReferenceFieldUpdater2.get(this);
                if (segment2.id >= channelSegment.id || !channelSegment.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, segment2, channelSegment)) {
                    if (atomicReferenceFieldUpdater2.get(this) != segment2) {
                        if (channelSegment.decPointers$kotlinx_coroutines_core()) {
                            channelSegment.remove();
                        }
                    }
                }
                if (segment2.decPointers$kotlinx_coroutines_core()) {
                    segment2.remove();
                }
            }
        }
        long j10 = channelSegment.id;
        if (j10 <= id) {
            return channelSegment;
        }
        int i = BufferedChannelKt.SEGMENT_SIZE;
        updateReceiversCounterIfLower(j10 * i);
        if (channelSegment.id * i >= getSendersCounter$kotlinx_coroutines_core()) {
            return null;
        }
        channelSegment.cleanPrev();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChannelSegment<E> findSegmentSend(long id, ChannelSegment<E> startFrom) {
        Object findSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sendSegment$volatile$FU;
        InterfaceC0650p interfaceC0650p = (InterfaceC0650p) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            findSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(startFrom, id, interfaceC0650p);
            if (!SegmentOrClosed.m176isClosedimpl(findSegmentInternal)) {
                Segment m174getSegmentimpl = SegmentOrClosed.m174getSegmentimpl(findSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= m174getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m174getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, segment, m174getSegmentimpl)) {
                        if (atomicReferenceFieldUpdater.get(this) != segment) {
                            if (m174getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                                m174getSegmentimpl.remove();
                            }
                        }
                    }
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (SegmentOrClosed.m176isClosedimpl(findSegmentInternal)) {
            completeCloseOrCancel();
            if (startFrom.id * BufferedChannelKt.SEGMENT_SIZE >= getReceiversCounter$kotlinx_coroutines_core()) {
                return null;
            }
            startFrom.cleanPrev();
            return null;
        }
        ChannelSegment<E> channelSegment = (ChannelSegment) SegmentOrClosed.m174getSegmentimpl(findSegmentInternal);
        long j10 = channelSegment.id;
        if (j10 <= id) {
            return channelSegment;
        }
        int i = BufferedChannelKt.SEGMENT_SIZE;
        updateSendersCounterIfLower(j10 * i);
        if (channelSegment.id * i >= getReceiversCounter$kotlinx_coroutines_core()) {
            return null;
        }
        channelSegment.cleanPrev();
        return null;
    }

    private final /* synthetic */ Object getAndUpdate$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, InterfaceC0646l<Object, ? extends Object> interfaceC0646l) {
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(obj);
            Object invoke = interfaceC0646l.invoke(obj2);
            while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, invoke)) {
                if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                    break;
                }
            }
            return obj2;
        }
    }

    private final /* synthetic */ long getBufferEnd$volatile() {
        return this.bufferEnd$volatile;
    }

    private final long getBufferEndCounter() {
        return bufferEnd$volatile$FU.get(this);
    }

    private final /* synthetic */ Object getBufferEndSegment$volatile() {
        return this.bufferEndSegment$volatile;
    }

    private final /* synthetic */ Object getCloseHandler$volatile() {
        return this.closeHandler$volatile;
    }

    private final /* synthetic */ long getCompletedExpandBuffersAndPauseFlag$volatile() {
        return this.completedExpandBuffersAndPauseFlag$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable getReceiveException() {
        Throwable closeCause = getCloseCause();
        return closeCause == null ? new ClosedReceiveChannelException(ChannelsKt.DEFAULT_CLOSE_MESSAGE) : closeCause;
    }

    private final /* synthetic */ Object getReceiveSegment$volatile() {
        return this.receiveSegment$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater getReceiveSegment$volatile$FU() {
        return receiveSegment$volatile$FU;
    }

    private final /* synthetic */ long getReceivers$volatile() {
        return this.receivers$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater getReceivers$volatile$FU() {
        return receivers$volatile$FU;
    }

    private final /* synthetic */ Object getSendSegment$volatile() {
        return this.sendSegment$volatile;
    }

    private final /* synthetic */ long getSendersAndCloseStatus$volatile() {
        return this.sendersAndCloseStatus$volatile;
    }

    private final /* synthetic */ Object get_closeCause$volatile() {
        return this._closeCause$volatile;
    }

    private final void incCompletedExpandBufferAttempts(long nAttempts) {
        if ((completedExpandBuffersAndPauseFlag$volatile$FU.addAndGet(this, nAttempts) & 4611686018427387904L) != 0) {
            while ((completedExpandBuffersAndPauseFlag$volatile$FU.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static /* synthetic */ void incCompletedExpandBufferAttempts$default(BufferedChannel bufferedChannel, long j10, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i & 1) != 0) {
            j10 = 1;
        }
        bufferedChannel.incCompletedExpandBufferAttempts(j10);
    }

    private final void invokeCloseHandler() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = closeHandler$volatile$FU;
        loop0: while (true) {
            obj = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = obj == null ? BufferedChannelKt.CLOSE_HANDLER_CLOSED : BufferedChannelKt.CLOSE_HANDLER_INVOKED;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, symbol)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
        }
        if (obj == null) {
            return;
        }
        j.c(1, obj);
        ((InterfaceC0646l) obj).invoke(getCloseCause());
    }

    private final boolean isCellNonEmpty(ChannelSegment<E> segment, int index, long globalIndex) {
        Object state$kotlinx_coroutines_core;
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        Symbol symbol6;
        Symbol symbol7;
        do {
            state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
            if (state$kotlinx_coroutines_core != null) {
                symbol2 = BufferedChannelKt.IN_BUFFER;
                if (state$kotlinx_coroutines_core != symbol2) {
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
                        return true;
                    }
                    symbol3 = BufferedChannelKt.INTERRUPTED_SEND;
                    if (state$kotlinx_coroutines_core == symbol3 || state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                        return false;
                    }
                    symbol4 = BufferedChannelKt.DONE_RCV;
                    if (state$kotlinx_coroutines_core == symbol4) {
                        return false;
                    }
                    symbol5 = BufferedChannelKt.POISONED;
                    if (state$kotlinx_coroutines_core == symbol5) {
                        return false;
                    }
                    symbol6 = BufferedChannelKt.RESUMING_BY_EB;
                    if (state$kotlinx_coroutines_core == symbol6) {
                        return true;
                    }
                    symbol7 = BufferedChannelKt.RESUMING_BY_RCV;
                    return state$kotlinx_coroutines_core != symbol7 && globalIndex == getReceiversCounter$kotlinx_coroutines_core();
                }
            }
            symbol = BufferedChannelKt.POISONED;
        } while (!segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, symbol));
        expandBuffer();
        return false;
    }

    private final boolean isClosed(long sendersAndCloseStatusCur, boolean isClosedForReceive) {
        int i = (int) (sendersAndCloseStatusCur >> 60);
        if (i == 0 || i == 1) {
            return false;
        }
        if (i == 2) {
            completeClose(sendersAndCloseStatusCur & 1152921504606846975L);
            if (isClosedForReceive && hasElements$kotlinx_coroutines_core()) {
                return false;
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException(com.google.android.gms.measurement.internal.a.g(i, "unexpected close status: ").toString());
            }
            completeCancel(sendersAndCloseStatusCur & 1152921504606846975L);
        }
        return true;
    }

    private final boolean isClosedForReceive0(long j10) {
        return isClosed(j10, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isClosedForSend0(long j10) {
        return isClosed(j10, false);
    }

    private final boolean isRendezvousOrUnlimited() {
        long bufferEndCounter = getBufferEndCounter();
        return bufferEndCounter == 0 || bufferEndCounter == Long.MAX_VALUE;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, InterfaceC0646l<? super Long, p> interfaceC0646l) {
        while (true) {
            interfaceC0646l.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        r8 = (kotlinx.coroutines.channels.ChannelSegment) r8.getPrev();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long markAllEmptyCellsAsClosed(kotlinx.coroutines.channels.ChannelSegment<E> r8) {
        /*
            r7 = this;
        L0:
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.id
            int r5 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.getReceiversCounter$kotlinx_coroutines_core()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.getState$kotlinx_coroutines_core(r0)
            if (r1 == 0) goto L2c
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getIN_BUFFER$p()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            if (r1 != r2) goto L39
            return r3
        L2c:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r1 = r8.casState$kotlinx_coroutines_core(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.onSlotCleaned()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r8 = r8.getPrev()
            kotlinx.coroutines.channels.ChannelSegment r8 = (kotlinx.coroutines.channels.ChannelSegment) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.markAllEmptyCellsAsClosed(kotlinx.coroutines.channels.ChannelSegment):long");
    }

    private final void markCancellationStarted() {
        long j10;
        long constructSendersAndCloseStatus;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            } else {
                constructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j10, 1);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, constructSendersAndCloseStatus));
    }

    private final void markCancelled() {
        long j10;
        long constructSendersAndCloseStatus;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            constructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j10, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, constructSendersAndCloseStatus));
    }

    private final void markClosed() {
        long j10;
        long constructSendersAndCloseStatus;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i = (int) (j10 >> 60);
            if (i == 0) {
                constructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(j10 & 1152921504606846975L, 2);
            } else if (i != 1) {
                return;
            } else {
                constructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(j10 & 1152921504606846975L, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, constructSendersAndCloseStatus));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void moveSegmentBufferEndToSpecifiedOrLast(long r5, kotlinx.coroutines.channels.ChannelSegment<E> r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.id
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r7.getNext()
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.isRemoved()
            if (r5 == 0) goto L22
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r5 = r7.getNext()
            kotlinx.coroutines.channels.ChannelSegment r5 = (kotlinx.coroutines.channels.ChannelSegment) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = getBufferEndSegment$volatile$FU()
        L26:
            java.lang.Object r6 = r5.get(r4)
            kotlinx.coroutines.internal.Segment r6 = (kotlinx.coroutines.internal.Segment) r6
            long r0 = r6.id
            long r2 = r7.id
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L35
            goto L4b
        L35:
            boolean r0 = r7.tryIncPointers$kotlinx_coroutines_core()
            if (r0 != 0) goto L3c
            goto L11
        L3c:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4c
            boolean r5 = r6.decPointers$kotlinx_coroutines_core()
            if (r5 == 0) goto L4b
            r6.remove()
        L4b:
            return
        L4c:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3c
            boolean r6 = r7.decPointers$kotlinx_coroutines_core()
            if (r6 == 0) goto L26
            r7.remove()
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.moveSegmentBufferEndToSpecifiedOrLast(long, kotlinx.coroutines.channels.ChannelSegment):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCancellationChannelResultImplDoNotCall-5_sEAP8, reason: not valid java name */
    public final void m113onCancellationChannelResultImplDoNotCall5_sEAP8(Throwable cause, Object element, kotlin.coroutines.d context) {
        OnUndeliveredElementKt.callUndeliveredElement(this.onUndeliveredElement, ChannelResult.m129getOrNullimpl(element), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCancellationImplDoNotCall(Throwable cause, E element, kotlin.coroutines.d context) {
        OnUndeliveredElementKt.callUndeliveredElement(this.onUndeliveredElement, element, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedReceiveCatchingOnNoWaiterSuspend(CancellableContinuation<? super ChannelResult<? extends E>> cont) {
        cont.resumeWith(ChannelResult.m124boximpl(ChannelResult.INSTANCE.m137closedJP2dKIU(getCloseCause())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedReceiveOnNoWaiterSuspend(CancellableContinuation<? super E> cont) {
        cont.resumeWith(new Result.Failure(getReceiveException()));
    }

    private final void onClosedSelectOnReceive(SelectInstance<?> select) {
        select.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
    }

    private final void onClosedSelectOnSend(E element, SelectInstance<?> select) {
        InterfaceC0646l<E, p> interfaceC0646l = this.onUndeliveredElement;
        if (interfaceC0646l != null) {
            OnUndeliveredElementKt.callUndeliveredElement(interfaceC0646l, element, select.getContext());
        }
        select.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onClosedSend(E e10, T9.a<? super p> aVar) {
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(U4.b.p(aVar), 1);
        cancellableContinuationImpl.initCancellability();
        InterfaceC0646l<E, p> interfaceC0646l = this.onUndeliveredElement;
        if (interfaceC0646l == null || (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(interfaceC0646l, e10, null, 2, null)) == null) {
            cancellableContinuationImpl.resumeWith(new Result.Failure(getSendException()));
        } else {
            m.a(callUndeliveredElementCatchingException$default, getSendException());
            cancellableContinuationImpl.resumeWith(new Result.Failure(callUndeliveredElementCatchingException$default));
        }
        Object result = cancellableContinuationImpl.getResult();
        return result == CoroutineSingletons.f23158a ? result : p.f3034a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedSendOnNoWaiterSuspend(E element, CancellableContinuation<? super p> cont) {
        InterfaceC0646l<E, p> interfaceC0646l = this.onUndeliveredElement;
        if (interfaceC0646l != null) {
            OnUndeliveredElementKt.callUndeliveredElement(interfaceC0646l, element, cont.getContext());
        }
        cont.resumeWith(new Result.Failure(getSendException()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC0651q onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56(final BufferedChannel bufferedChannel, final SelectInstance selectInstance, Object obj, final Object obj2) {
        return new InterfaceC0651q(bufferedChannel) { // from class: kotlinx.coroutines.channels.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BufferedChannel f23225b;

            {
                this.f23225b = bufferedChannel;
            }

            @Override // ca.InterfaceC0651q
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                p onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55;
                onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55 = BufferedChannel.onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55(obj2, this.f23225b, selectInstance, (Throwable) obj3, obj4, (kotlin.coroutines.d) obj5);
                return onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55(Object obj, BufferedChannel bufferedChannel, SelectInstance selectInstance, Throwable th, Object obj2, kotlin.coroutines.d dVar) {
        if (obj != BufferedChannelKt.getCHANNEL_CLOSED()) {
            OnUndeliveredElementKt.callUndeliveredElement(bufferedChannel.onUndeliveredElement, obj, selectInstance.getContext());
        }
        return p.f3034a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareReceiverForSuspension(Waiter waiter, ChannelSegment<E> channelSegment, int i) {
        onReceiveEnqueued();
        waiter.invokeOnCancellation(channelSegment, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareSenderForSuspension(Waiter waiter, ChannelSegment<E> channelSegment, int i) {
        waiter.invokeOnCancellation(channelSegment, i + BufferedChannelKt.SEGMENT_SIZE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceive(Object ignoredParam, Object selectResult) {
        if (selectResult != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return selectResult;
        }
        throw getReceiveException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceiveCatching(Object ignoredParam, Object selectResult) {
        return ChannelResult.m124boximpl(selectResult == BufferedChannelKt.getCHANNEL_CLOSED() ? ChannelResult.INSTANCE.m137closedJP2dKIU(getCloseCause()) : ChannelResult.INSTANCE.m139successJP2dKIU(selectResult));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceiveOrNull(Object ignoredParam, Object selectResult) {
        if (selectResult != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return selectResult;
        }
        if (getCloseCause() == null) {
            return null;
        }
        throw getReceiveException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectSend(Object ignoredParam, Object selectResult) {
        if (selectResult != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return this;
        }
        throw getSendException();
    }

    public static /* synthetic */ <E> Object receive$suspendImpl(BufferedChannel<E> bufferedChannel, T9.a<? super E> aVar) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        ChannelSegment<E> channelSegment = (ChannelSegment) getReceiveSegment$volatile$FU().get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j10 = andIncrement / i;
            int i9 = (int) (andIncrement % i);
            if (channelSegment.id != j10) {
                ChannelSegment<E> findSegmentReceive = bufferedChannel.findSegmentReceive(j10, channelSegment);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            }
            Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i9, andIncrement, null);
            symbol = BufferedChannelKt.SUSPEND;
            if (updateCellReceive == symbol) {
                throw new IllegalStateException("unexpected".toString());
            }
            symbol2 = BufferedChannelKt.FAILED;
            if (updateCellReceive != symbol2) {
                symbol3 = BufferedChannelKt.SUSPEND_NO_WAITER;
                if (updateCellReceive == symbol3) {
                    return bufferedChannel.receiveOnNoWaiterSuspend(channelSegment, i9, andIncrement, aVar);
                }
                channelSegment.cleanPrev();
                return updateCellReceive;
            }
            if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
        }
        throw StackTraceRecoveryKt.recoverStackTrace(bufferedChannel.getReceiveException());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: receiveCatching-JP2dKIU$suspendImpl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <E> java.lang.Object m114receiveCatchingJP2dKIU$suspendImpl(kotlinx.coroutines.channels.BufferedChannel<E> r13, T9.a<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> r14) {
        /*
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            if (r0 == 0) goto L14
            r0 = r14
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            kotlin.b.b(r14)
            kotlinx.coroutines.channels.ChannelResult r14 = (kotlinx.coroutines.channels.ChannelResult) r14
            java.lang.Object r13 = r14.getHolder()
            goto Lb0
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L38:
            kotlin.b.b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = access$getReceiveSegment$volatile$FU()
            java.lang.Object r14 = r14.get(r13)
            kotlinx.coroutines.channels.ChannelSegment r14 = (kotlinx.coroutines.channels.ChannelSegment) r14
        L45:
            boolean r1 = r13.isClosedForReceive()
            if (r1 == 0) goto L56
            kotlinx.coroutines.channels.ChannelResult$Companion r14 = kotlinx.coroutines.channels.ChannelResult.INSTANCE
            java.lang.Throwable r13 = r13.getCloseCause()
            java.lang.Object r13 = r14.m137closedJP2dKIU(r13)
            goto Lb0
        L56:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getReceivers$volatile$FU()
            long r4 = r1.getAndIncrement(r13)
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.id
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L75
            kotlinx.coroutines.channels.ChannelSegment r1 = access$findSegmentReceive(r13, r7, r14)
            if (r1 != 0) goto L74
            goto L45
        L74:
            r14 = r1
        L75:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = access$updateCellReceive(r7, r8, r9, r10, r12)
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()
            if (r1 == r7) goto Lb1
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
            if (r1 != r7) goto L96
            long r7 = r13.getSendersCounter$kotlinx_coroutines_core()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L45
            r14.cleanPrev()
            goto L45
        L96:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()
            if (r1 != r7) goto La7
            r6.label = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.m115receiveCatchingOnNoWaiterSuspendGKJJFZk(r2, r3, r4, r6)
            if (r13 != r0) goto Lb0
            return r0
        La7:
            r14.cleanPrev()
            kotlinx.coroutines.channels.ChannelResult$Companion r13 = kotlinx.coroutines.channels.ChannelResult.INSTANCE
            java.lang.Object r13 = r13.m139successJP2dKIU(r1)
        Lb0:
            return r13
        Lb1:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m114receiveCatchingJP2dKIU$suspendImpl(kotlinx.coroutines.channels.BufferedChannel, T9.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: receiveCatchingOnNoWaiterSuspend-GKJJFZk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m115receiveCatchingOnNoWaiterSuspendGKJJFZk(kotlinx.coroutines.channels.ChannelSegment<E> r10, int r11, long r12, T9.a<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> r14) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m115receiveCatchingOnNoWaiterSuspendGKJJFZk(kotlinx.coroutines.channels.ChannelSegment, int, long, T9.a):java.lang.Object");
    }

    private final <R> R receiveImpl(Object waiter, InterfaceC0646l<? super E, ? extends R> onElementRetrieved, InterfaceC0651q<? super ChannelSegment<E>, ? super Integer, ? super Long, ? extends R> onSuspend, InterfaceC0635a<? extends R> onClosed, InterfaceC0651q<? super ChannelSegment<E>, ? super Integer, ? super Long, ? extends R> onNoWaiterSuspend) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        ChannelSegment channelSegment = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j10 = andIncrement / i;
            int i9 = (int) (andIncrement % i);
            if (channelSegment.id != j10) {
                ChannelSegment findSegmentReceive = findSegmentReceive(j10, channelSegment);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            }
            Symbol symbol4 = (Object) updateCellReceive(channelSegment, i9, andIncrement, waiter);
            symbol = BufferedChannelKt.SUSPEND;
            if (symbol4 == symbol) {
                Waiter waiter2 = waiter instanceof Waiter ? (Waiter) waiter : null;
                if (waiter2 != null) {
                    prepareReceiverForSuspension(waiter2, channelSegment, i9);
                }
                return onSuspend.invoke(channelSegment, Integer.valueOf(i9), Long.valueOf(andIncrement));
            }
            symbol2 = BufferedChannelKt.FAILED;
            if (symbol4 != symbol2) {
                symbol3 = BufferedChannelKt.SUSPEND_NO_WAITER;
                if (symbol4 == symbol3) {
                    return onNoWaiterSuspend.invoke(channelSegment, Integer.valueOf(i9), Long.valueOf(andIncrement));
                }
                channelSegment.cleanPrev();
                return onElementRetrieved.invoke(symbol4);
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
        }
        return onClosed.invoke();
    }

    public static /* synthetic */ Object receiveImpl$default(BufferedChannel bufferedChannel, Object obj, InterfaceC0646l interfaceC0646l, InterfaceC0651q interfaceC0651q, InterfaceC0635a interfaceC0635a, InterfaceC0651q interfaceC0651q2, int i, Object obj2) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: receiveImpl");
        }
        if ((i & 16) != 0) {
            interfaceC0651q2 = new InterfaceC0651q() { // from class: kotlinx.coroutines.channels.BufferedChannel$receiveImpl$1
                @Override // ca.InterfaceC0651q
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                    return invoke((ChannelSegment) obj3, ((Number) obj4).intValue(), ((Number) obj5).longValue());
                }

                public final Void invoke(ChannelSegment<E> channelSegment, int i9, long j10) {
                    throw new IllegalStateException("unexpected".toString());
                }
            };
        }
        ChannelSegment channelSegment = (ChannelSegment) getReceiveSegment$volatile$FU().get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
            int i9 = BufferedChannelKt.SEGMENT_SIZE;
            long j10 = andIncrement / i9;
            int i10 = (int) (andIncrement % i9);
            if (channelSegment.id != j10) {
                ChannelSegment findSegmentReceive = bufferedChannel.findSegmentReceive(j10, channelSegment);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            }
            Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i10, andIncrement, obj);
            symbol = BufferedChannelKt.SUSPEND;
            if (updateCellReceive == symbol) {
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    bufferedChannel.prepareReceiverForSuspension(waiter, channelSegment, i10);
                }
                return interfaceC0651q.invoke(channelSegment, Integer.valueOf(i10), Long.valueOf(andIncrement));
            }
            symbol2 = BufferedChannelKt.FAILED;
            if (updateCellReceive != symbol2) {
                symbol3 = BufferedChannelKt.SUSPEND_NO_WAITER;
                if (updateCellReceive == symbol3) {
                    return interfaceC0651q2.invoke(channelSegment, Integer.valueOf(i10), Long.valueOf(andIncrement));
                }
                channelSegment.cleanPrev();
                return interfaceC0646l.invoke(updateCellReceive);
            }
            if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
        }
        return interfaceC0635a.invoke();
    }

    private final void receiveImplOnNoWaiter(ChannelSegment<E> segment, int index, long r8, Waiter waiter, InterfaceC0646l<? super E, p> onElementRetrieved, InterfaceC0635a<p> onClosed) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        Symbol symbol6 = (Object) updateCellReceive(segment, index, r8, waiter);
        symbol = BufferedChannelKt.SUSPEND;
        if (symbol6 == symbol) {
            prepareReceiverForSuspension(waiter, segment, index);
            return;
        }
        symbol2 = BufferedChannelKt.FAILED;
        if (symbol6 != symbol2) {
            segment.cleanPrev();
            onElementRetrieved.invoke(symbol6);
            return;
        }
        if (r8 < getSendersCounter$kotlinx_coroutines_core()) {
            segment.cleanPrev();
        }
        ChannelSegment channelSegment = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j10 = andIncrement / i;
            int i9 = (int) (andIncrement % i);
            if (channelSegment.id != j10) {
                ChannelSegment findSegmentReceive = findSegmentReceive(j10, channelSegment);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            }
            Symbol symbol7 = (Object) updateCellReceive(channelSegment, i9, andIncrement, waiter);
            symbol3 = BufferedChannelKt.SUSPEND;
            if (symbol7 == symbol3) {
                if (!(waiter instanceof Waiter)) {
                    waiter = null;
                }
                if (waiter != null) {
                    prepareReceiverForSuspension(waiter, channelSegment, i9);
                }
                p pVar = p.f3034a;
                return;
            }
            symbol4 = BufferedChannelKt.FAILED;
            if (symbol7 != symbol4) {
                symbol5 = BufferedChannelKt.SUSPEND_NO_WAITER;
                if (symbol7 == symbol5) {
                    throw new IllegalStateException("unexpected".toString());
                }
                channelSegment.cleanPrev();
                onElementRetrieved.invoke(symbol7);
                return;
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
        }
        onClosed.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object receiveOnNoWaiterSuspend(ChannelSegment<E> channelSegment, int i, long j10, T9.a<? super E> aVar) {
        Symbol symbol;
        Symbol symbol2;
        InterfaceC0651q interfaceC0651q;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(U4.b.p(aVar));
        try {
            Object updateCellReceive = updateCellReceive(channelSegment, i, j10, orCreateCancellableContinuation);
            symbol = BufferedChannelKt.SUSPEND;
            if (updateCellReceive == symbol) {
                prepareReceiverForSuspension(orCreateCancellableContinuation, channelSegment, i);
            } else {
                symbol2 = BufferedChannelKt.FAILED;
                if (updateCellReceive == symbol2) {
                    if (j10 < getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    ChannelSegment channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
                    while (true) {
                        if (isClosedForReceive()) {
                            onClosedReceiveOnNoWaiterSuspend(orCreateCancellableContinuation);
                            break;
                        }
                        long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
                        int i9 = BufferedChannelKt.SEGMENT_SIZE;
                        long j11 = andIncrement / i9;
                        int i10 = (int) (andIncrement % i9);
                        if (channelSegment2.id != j11) {
                            ChannelSegment findSegmentReceive = findSegmentReceive(j11, channelSegment2);
                            if (findSegmentReceive != null) {
                                channelSegment2 = findSegmentReceive;
                            }
                        }
                        updateCellReceive = updateCellReceive(channelSegment2, i10, andIncrement, orCreateCancellableContinuation);
                        symbol3 = BufferedChannelKt.SUSPEND;
                        if (updateCellReceive == symbol3) {
                            CancellableContinuationImpl cancellableContinuationImpl = orCreateCancellableContinuation instanceof Waiter ? orCreateCancellableContinuation : null;
                            if (cancellableContinuationImpl != null) {
                                prepareReceiverForSuspension(cancellableContinuationImpl, channelSegment2, i10);
                            }
                        } else {
                            symbol4 = BufferedChannelKt.FAILED;
                            if (updateCellReceive != symbol4) {
                                symbol5 = BufferedChannelKt.SUSPEND_NO_WAITER;
                                if (updateCellReceive == symbol5) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                channelSegment2.cleanPrev();
                                InterfaceC0646l<E, p> interfaceC0646l = this.onUndeliveredElement;
                                interfaceC0651q = (InterfaceC0651q) (interfaceC0646l != null ? bindCancellationFun(interfaceC0646l) : null);
                            } else if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment2.cleanPrev();
                            }
                        }
                    }
                } else {
                    channelSegment.cleanPrev();
                    InterfaceC0646l<E, p> interfaceC0646l2 = this.onUndeliveredElement;
                    interfaceC0651q = (InterfaceC0651q) (interfaceC0646l2 != null ? bindCancellationFun(interfaceC0646l2) : null);
                }
                orCreateCancellableContinuation.resume((CancellableContinuationImpl) updateCellReceive, (InterfaceC0651q<? super Throwable, ? super CancellableContinuationImpl, ? super kotlin.coroutines.d, p>) interfaceC0651q);
            }
            Object result = orCreateCancellableContinuation.getResult();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            return result;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerSelectForReceive(SelectInstance<?> select, Object ignoredParam) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        ChannelSegment channelSegment = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j10 = andIncrement / i;
            int i9 = (int) (andIncrement % i);
            if (channelSegment.id != j10) {
                ChannelSegment findSegmentReceive = findSegmentReceive(j10, channelSegment);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            }
            Object updateCellReceive = updateCellReceive(channelSegment, i9, andIncrement, select);
            symbol = BufferedChannelKt.SUSPEND;
            if (updateCellReceive == symbol) {
                Waiter waiter = select instanceof Waiter ? (Waiter) select : null;
                if (waiter != null) {
                    prepareReceiverForSuspension(waiter, channelSegment, i9);
                    return;
                }
                return;
            }
            symbol2 = BufferedChannelKt.FAILED;
            if (updateCellReceive != symbol2) {
                symbol3 = BufferedChannelKt.SUSPEND_NO_WAITER;
                if (updateCellReceive == symbol3) {
                    throw new IllegalStateException("unexpected".toString());
                }
                channelSegment.cleanPrev();
                select.selectInRegistrationPhase(updateCellReceive);
                return;
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
        }
        onClosedSelectOnReceive(select);
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b3, code lost:
    
        r12 = (kotlinx.coroutines.channels.ChannelSegment) r12.getPrev();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void removeUnprocessedElements(kotlinx.coroutines.channels.ChannelSegment<E> r12) {
        /*
            r11 = this;
            ca.l<E, O9.p> r0 = r11.onUndeliveredElement
            r1 = 0
            r2 = 1
            java.lang.Object r3 = kotlinx.coroutines.internal.InlineList.m159constructorimpl$default(r1, r2, r1)
        L8:
            int r4 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb3
            long r6 = r12.id
            int r8 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L16:
            java.lang.Object r8 = r12.getState$kotlinx_coroutines_core(r4)
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            if (r8 == r9) goto Lbb
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            if (r8 != r9) goto L48
            long r9 = r11.getReceiversCounter$kotlinx_coroutines_core()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r8 = r12.casState$kotlinx_coroutines_core(r4, r8, r9)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L40
            java.lang.Object r5 = r12.getElement$kotlinx_coroutines_core(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r0, r5, r1)
        L40:
            r12.cleanElement$kotlinx_coroutines_core(r4)
            r12.onSlotCleaned()
            goto Laf
        L48:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getIN_BUFFER$p()
            if (r8 == r9) goto La2
            if (r8 != 0) goto L51
            goto La2
        L51:
            boolean r9 = r8 instanceof kotlinx.coroutines.Waiter
            if (r9 != 0) goto L6e
            boolean r9 = r8 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r9 == 0) goto L5a
            goto L6e
        L5a:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            if (r8 == r9) goto Lbb
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_RCV$p()
            if (r8 != r9) goto L67
            goto Lbb
        L67:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            if (r8 == r9) goto L16
            goto Laf
        L6e:
            long r9 = r11.getReceiversCounter$kotlinx_coroutines_core()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            boolean r9 = r8 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r9 == 0) goto L80
            r9 = r8
            kotlinx.coroutines.channels.WaiterEB r9 = (kotlinx.coroutines.channels.WaiterEB) r9
            kotlinx.coroutines.Waiter r9 = r9.waiter
            goto L83
        L80:
            r9 = r8
            kotlinx.coroutines.Waiter r9 = (kotlinx.coroutines.Waiter) r9
        L83:
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r8 = r12.casState$kotlinx_coroutines_core(r4, r8, r10)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L97
            java.lang.Object r5 = r12.getElement$kotlinx_coroutines_core(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r0, r5, r1)
        L97:
            java.lang.Object r3 = kotlinx.coroutines.internal.InlineList.m164plusFjFbRPM(r3, r9)
            r12.cleanElement$kotlinx_coroutines_core(r4)
            r12.onSlotCleaned()
            goto Laf
        La2:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r8 = r12.casState$kotlinx_coroutines_core(r4, r8, r9)
            if (r8 == 0) goto L16
            r12.onSlotCleaned()
        Laf:
            int r4 = r4 + (-1)
            goto Lb
        Lb3:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r12 = r12.getPrev()
            kotlinx.coroutines.channels.ChannelSegment r12 = (kotlinx.coroutines.channels.ChannelSegment) r12
            if (r12 != 0) goto L8
        Lbb:
            if (r3 == 0) goto Ldc
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto Lc7
            kotlinx.coroutines.Waiter r3 = (kotlinx.coroutines.Waiter) r3
            r11.resumeSenderOnCancelledChannel(r3)
            goto Ldc
        Lc7:
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        Lce:
            if (r5 >= r12) goto Ldc
            java.lang.Object r0 = r3.get(r12)
            kotlinx.coroutines.Waiter r0 = (kotlinx.coroutines.Waiter) r0
            r11.resumeSenderOnCancelledChannel(r0)
            int r12 = r12 + (-1)
            goto Lce
        Ldc:
            if (r1 != 0) goto Ldf
            return
        Ldf:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.removeUnprocessedElements(kotlinx.coroutines.channels.ChannelSegment):void");
    }

    private final void resumeReceiverOnClosedChannel(Waiter waiter) {
        resumeWaiterOnClosedChannel(waiter, true);
    }

    private final void resumeSenderOnCancelledChannel(Waiter waiter) {
        resumeWaiterOnClosedChannel(waiter, false);
    }

    private final void resumeWaiterOnClosedChannel(Waiter waiter, boolean z10) {
        if (waiter instanceof SendBroadcast) {
            ((SendBroadcast) waiter).getCont().resumeWith(Boolean.FALSE);
            return;
        }
        if (waiter instanceof CancellableContinuation) {
            ((T9.a) waiter).resumeWith(new Result.Failure(z10 ? getReceiveException() : getSendException()));
            return;
        }
        if (waiter instanceof ReceiveCatching) {
            ((ReceiveCatching) waiter).cont.resumeWith(ChannelResult.m124boximpl(ChannelResult.INSTANCE.m137closedJP2dKIU(getCloseCause())));
            return;
        }
        if (waiter instanceof BufferedChannelIterator) {
            ((BufferedChannelIterator) waiter).tryResumeHasNextOnClosedChannel();
        } else if (waiter instanceof SelectInstance) {
            ((SelectInstance) waiter).trySelect(this, BufferedChannelKt.getCHANNEL_CLOSED());
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + waiter).toString());
        }
    }

    public static <E> Object send$suspendImpl(BufferedChannel<E> bufferedChannel, E e10, T9.a<? super p> aVar) {
        ChannelSegment<E> channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(bufferedChannel);
            long j10 = 1152921504606846975L & andIncrement;
            boolean isClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j11 = j10 / i;
            int i9 = (int) (j10 % i);
            if (channelSegment.id != j11) {
                ChannelSegment<E> findSegmentSend = bufferedChannel.findSegmentSend(j11, channelSegment);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosedForSend0) {
                    Object onClosedSend = bufferedChannel.onClosedSend(e10, aVar);
                    if (onClosedSend == CoroutineSingletons.f23158a) {
                        return onClosedSend;
                    }
                }
            }
            int updateCellSend = bufferedChannel.updateCellSend(channelSegment, i9, e10, j10, null, isClosedForSend0);
            if (updateCellSend == 0) {
                channelSegment.cleanPrev();
                break;
            }
            if (updateCellSend == 1) {
                break;
            }
            if (updateCellSend != 2) {
                if (updateCellSend == 3) {
                    Object sendOnNoWaiterSuspend = bufferedChannel.sendOnNoWaiterSuspend(channelSegment, i9, e10, j10, aVar);
                    if (sendOnNoWaiterSuspend == CoroutineSingletons.f23158a) {
                        return sendOnNoWaiterSuspend;
                    }
                } else if (updateCellSend == 4) {
                    if (j10 < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    Object onClosedSend2 = bufferedChannel.onClosedSend(e10, aVar);
                    if (onClosedSend2 == CoroutineSingletons.f23158a) {
                        return onClosedSend2;
                    }
                } else if (updateCellSend == 5) {
                    channelSegment.cleanPrev();
                }
            } else if (isClosedForSend0) {
                channelSegment.onSlotCleaned();
                Object onClosedSend3 = bufferedChannel.onClosedSend(e10, aVar);
                if (onClosedSend3 == CoroutineSingletons.f23158a) {
                    return onClosedSend3;
                }
            }
        }
        return p.f3034a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
    
        r9.resumeWith(java.lang.Boolean.TRUE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <E> java.lang.Object sendBroadcast$suspendImpl(kotlinx.coroutines.channels.BufferedChannel<E> r16, E r17, T9.a<? super java.lang.Boolean> r18) {
        /*
            r8 = r16
            kotlinx.coroutines.CancellableContinuationImpl r9 = new kotlinx.coroutines.CancellableContinuationImpl
            T9.a r0 = U4.b.p(r18)
            r10 = 1
            r9.<init>(r0, r10)
            r9.initCancellability()
            ca.l<E, O9.p> r0 = r8.onUndeliveredElement
            if (r0 != 0) goto Lb3
            kotlinx.coroutines.channels.BufferedChannel$SendBroadcast r11 = new kotlinx.coroutines.channels.BufferedChannel$SendBroadcast
            r11.<init>(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = access$getSendSegment$volatile$FU()
            java.lang.Object r0 = r0.get(r8)
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
        L22:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getSendersAndCloseStatus$volatile$FU()
            long r1 = r1.getAndIncrement(r8)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r12 = r1 & r3
            boolean r14 = access$isClosedForSend0(r8, r1)
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r1
            long r2 = r12 / r2
            long r4 = (long) r1
            long r4 = r12 % r4
            int r15 = (int) r4
            long r4 = r0.id
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L55
            kotlinx.coroutines.channels.ChannelSegment r1 = access$findSegmentSend(r8, r2, r0)
            if (r1 != 0) goto L53
            if (r14 == 0) goto L22
        L4c:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.resumeWith(r0)
            goto Lac
        L53:
            r7 = r1
            goto L56
        L55:
            r7 = r0
        L56:
            r0 = r16
            r1 = r7
            r2 = r15
            r3 = r17
            r4 = r12
            r6 = r11
            r18 = r7
            r7 = r14
            int r0 = access$updateCellSend(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto La6
            if (r0 == r10) goto La0
            r1 = 2
            if (r0 == r1) goto L94
            r1 = 3
            if (r0 == r1) goto L88
            r1 = 4
            if (r0 == r1) goto L7c
            r1 = 5
            if (r0 == r1) goto L76
            goto L79
        L76:
            r18.cleanPrev()
        L79:
            r0 = r18
            goto L22
        L7c:
            long r0 = r16.getReceiversCounter$kotlinx_coroutines_core()
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 >= 0) goto L4c
            r18.cleanPrev()
            goto L4c
        L88:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L94:
            if (r14 == 0) goto L9a
            r18.onSlotCleaned()
            goto L4c
        L9a:
            r0 = r18
            access$prepareSenderForSuspension(r8, r11, r0, r15)
            goto Lac
        La0:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9.resumeWith(r0)
            goto Lac
        La6:
            r0 = r18
            r0.cleanPrev()
            goto La0
        Lac:
            java.lang.Object r0 = r9.getResult()
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            return r0
        Lb3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.sendBroadcast$suspendImpl(kotlinx.coroutines.channels.BufferedChannel, java.lang.Object, T9.a):java.lang.Object");
    }

    private final <R> R sendImpl(E element, Object waiter, InterfaceC0635a<? extends R> onRendezvousOrBuffered, InterfaceC0650p<? super ChannelSegment<E>, ? super Integer, ? extends R> onSuspend, InterfaceC0635a<? extends R> onClosed, InterfaceC0652r<? super ChannelSegment<E>, ? super Integer, ? super E, ? super Long, ? extends R> onNoWaiterSuspend) {
        ChannelSegment channelSegment;
        ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = isClosedForSend0(andIncrement);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j11 = j10 / i;
            int i9 = (int) (j10 % i);
            if (channelSegment2.id != j11) {
                ChannelSegment findSegmentSend = findSegmentSend(j11, channelSegment2);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosedForSend0) {
                    return onClosed.invoke();
                }
            } else {
                channelSegment = channelSegment2;
            }
            int updateCellSend = updateCellSend(channelSegment, i9, element, j10, waiter, isClosedForSend0);
            if (updateCellSend == 0) {
                channelSegment.cleanPrev();
                return onRendezvousOrBuffered.invoke();
            }
            if (updateCellSend == 1) {
                return onRendezvousOrBuffered.invoke();
            }
            if (updateCellSend == 2) {
                if (isClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return onClosed.invoke();
                }
                Waiter waiter2 = waiter instanceof Waiter ? (Waiter) waiter : null;
                if (waiter2 != null) {
                    prepareSenderForSuspension(waiter2, channelSegment, i9);
                }
                return onSuspend.invoke(channelSegment, Integer.valueOf(i9));
            }
            if (updateCellSend == 3) {
                return onNoWaiterSuspend.invoke(channelSegment, Integer.valueOf(i9), element, Long.valueOf(j10));
            }
            if (updateCellSend == 4) {
                if (j10 < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return onClosed.invoke();
            }
            if (updateCellSend == 5) {
                channelSegment.cleanPrev();
            }
            channelSegment2 = channelSegment;
        }
    }

    public static /* synthetic */ Object sendImpl$default(BufferedChannel bufferedChannel, Object obj, Object obj2, InterfaceC0635a interfaceC0635a, InterfaceC0650p interfaceC0650p, InterfaceC0635a interfaceC0635a2, InterfaceC0652r interfaceC0652r, int i, Object obj3) {
        ChannelSegment channelSegment;
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImpl");
        }
        InterfaceC0652r interfaceC0652r2 = (i & 32) != 0 ? new InterfaceC0652r() { // from class: kotlinx.coroutines.channels.BufferedChannel$sendImpl$1
            @Override // ca.InterfaceC0652r
            public /* bridge */ /* synthetic */ Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                return invoke((ChannelSegment<int>) obj4, ((Number) obj5).intValue(), (int) obj6, ((Number) obj7).longValue());
            }

            public final Void invoke(ChannelSegment<E> channelSegment2, int i9, E e10, long j10) {
                throw new IllegalStateException("unexpected".toString());
            }
        } : interfaceC0652r;
        ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(bufferedChannel);
            long j10 = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            int i9 = BufferedChannelKt.SEGMENT_SIZE;
            long j11 = j10 / i9;
            int i10 = (int) (j10 % i9);
            if (channelSegment2.id != j11) {
                ChannelSegment findSegmentSend = bufferedChannel.findSegmentSend(j11, channelSegment2);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosedForSend0) {
                    return interfaceC0635a2.invoke();
                }
            } else {
                channelSegment = channelSegment2;
            }
            int updateCellSend = bufferedChannel.updateCellSend(channelSegment, i10, obj, j10, obj2, isClosedForSend0);
            if (updateCellSend == 0) {
                channelSegment.cleanPrev();
                return interfaceC0635a.invoke();
            }
            if (updateCellSend == 1) {
                return interfaceC0635a.invoke();
            }
            if (updateCellSend == 2) {
                if (isClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return interfaceC0635a2.invoke();
                }
                Waiter waiter = obj2 instanceof Waiter ? (Waiter) obj2 : null;
                if (waiter != null) {
                    bufferedChannel.prepareSenderForSuspension(waiter, channelSegment, i10);
                }
                return interfaceC0650p.invoke(channelSegment, Integer.valueOf(i10));
            }
            if (updateCellSend == 3) {
                return interfaceC0652r2.invoke(channelSegment, Integer.valueOf(i10), obj, Long.valueOf(j10));
            }
            if (updateCellSend == 4) {
                if (j10 < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return interfaceC0635a2.invoke();
            }
            if (updateCellSend == 5) {
                channelSegment.cleanPrev();
            }
            channelSegment2 = channelSegment;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void sendImplOnNoWaiter(kotlinx.coroutines.channels.ChannelSegment<E> r20, int r21, E r22, long r23, kotlinx.coroutines.Waiter r25, ca.InterfaceC0635a<O9.p> r26, ca.InterfaceC0635a<O9.p> r27) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.sendImplOnNoWaiter(kotlinx.coroutines.channels.ChannelSegment, int, java.lang.Object, long, kotlinx.coroutines.Waiter, ca.a, ca.a):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object sendOnNoWaiterSuspend(kotlinx.coroutines.channels.ChannelSegment<E> r21, int r22, E r23, long r24, T9.a<? super O9.p> r26) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.sendOnNoWaiterSuspend(kotlinx.coroutines.channels.ChannelSegment, int, java.lang.Object, long, T9.a):java.lang.Object");
    }

    private final /* synthetic */ void setBufferEnd$volatile(long j10) {
        this.bufferEnd$volatile = j10;
    }

    private final /* synthetic */ void setBufferEndSegment$volatile(Object obj) {
        this.bufferEndSegment$volatile = obj;
    }

    private final /* synthetic */ void setCloseHandler$volatile(Object obj) {
        this.closeHandler$volatile = obj;
    }

    private final /* synthetic */ void setCompletedExpandBuffersAndPauseFlag$volatile(long j10) {
        this.completedExpandBuffersAndPauseFlag$volatile = j10;
    }

    private final /* synthetic */ void setReceiveSegment$volatile(Object obj) {
        this.receiveSegment$volatile = obj;
    }

    private final /* synthetic */ void setReceivers$volatile(long j10) {
        this.receivers$volatile = j10;
    }

    private final /* synthetic */ void setSendSegment$volatile(Object obj) {
        this.sendSegment$volatile = obj;
    }

    private final /* synthetic */ void setSendersAndCloseStatus$volatile(long j10) {
        this.sendersAndCloseStatus$volatile = j10;
    }

    private final /* synthetic */ void set_closeCause$volatile(Object obj) {
        this._closeCause$volatile = obj;
    }

    private final boolean shouldSendSuspend(long curSendersAndCloseStatus) {
        if (isClosedForSend0(curSendersAndCloseStatus)) {
            return false;
        }
        return !bufferOrRendezvousSend(curSendersAndCloseStatus & 1152921504606846975L);
    }

    private final boolean tryResumeReceiver(Object obj, E e10) {
        boolean tryResume0;
        boolean tryResume02;
        if (obj instanceof SelectInstance) {
            return ((SelectInstance) obj).trySelect(this, e10);
        }
        if (obj instanceof ReceiveCatching) {
            CancellableContinuationImpl<ChannelResult<? extends E>> cancellableContinuationImpl = ((ReceiveCatching) obj).cont;
            ChannelResult m124boximpl = ChannelResult.m124boximpl(ChannelResult.INSTANCE.m139successJP2dKIU(e10));
            InterfaceC0646l<E, p> interfaceC0646l = this.onUndeliveredElement;
            tryResume02 = BufferedChannelKt.tryResume0(cancellableContinuationImpl, m124boximpl, (InterfaceC0651q) (interfaceC0646l != null ? bindCancellationFunResult(interfaceC0646l) : null));
            return tryResume02;
        }
        if (obj instanceof BufferedChannelIterator) {
            return ((BufferedChannelIterator) obj).tryResumeHasNext(e10);
        }
        if (!(obj instanceof CancellableContinuation)) {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
        InterfaceC0646l<E, p> interfaceC0646l2 = this.onUndeliveredElement;
        tryResume0 = BufferedChannelKt.tryResume0(cancellableContinuation, e10, (InterfaceC0651q) (interfaceC0646l2 != null ? bindCancellationFun(interfaceC0646l2) : null));
        return tryResume0;
    }

    private final boolean tryResumeSender(Object obj, ChannelSegment<E> channelSegment, int i) {
        if (obj instanceof CancellableContinuation) {
            return BufferedChannelKt.tryResume0$default((CancellableContinuation) obj, p.f3034a, null, 2, null);
        }
        if (obj instanceof SelectInstance) {
            TrySelectDetailedResult trySelectDetailed = ((SelectImplementation) obj).trySelectDetailed(this, p.f3034a);
            if (trySelectDetailed == TrySelectDetailedResult.REREGISTER) {
                channelSegment.cleanElement$kotlinx_coroutines_core(i);
            }
            return trySelectDetailed == TrySelectDetailedResult.SUCCESSFUL;
        }
        if (obj instanceof SendBroadcast) {
            return BufferedChannelKt.tryResume0$default(((SendBroadcast) obj).getCont(), Boolean.TRUE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    private final /* synthetic */ void update$atomicfu(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, InterfaceC0646l<? super Long, Long> interfaceC0646l) {
        long j10;
        do {
            j10 = atomicLongFieldUpdater.get(obj);
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j10, interfaceC0646l.invoke(Long.valueOf(j10)).longValue()));
    }

    private final boolean updateCellExpandBuffer(ChannelSegment<E> segment, int index, long b9) {
        Symbol symbol;
        Symbol symbol2;
        Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
        if ((state$kotlinx_coroutines_core instanceof Waiter) && b9 >= receivers$volatile$FU.get(this)) {
            symbol = BufferedChannelKt.RESUMING_BY_EB;
            if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, symbol)) {
                if (tryResumeSender(state$kotlinx_coroutines_core, segment, index)) {
                    segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.BUFFERED);
                    return true;
                }
                symbol2 = BufferedChannelKt.INTERRUPTED_SEND;
                segment.setState$kotlinx_coroutines_core(index, symbol2);
                segment.onCancelledRequest(index, false);
                return false;
            }
        }
        return updateCellExpandBufferSlow(segment, index, b9);
    }

    private final boolean updateCellExpandBufferSlow(ChannelSegment<E> segment, int index, long b9) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        Symbol symbol6;
        Symbol symbol7;
        Symbol symbol8;
        while (true) {
            Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
            if (!(state$kotlinx_coroutines_core instanceof Waiter)) {
                symbol3 = BufferedChannelKt.INTERRUPTED_SEND;
                if (state$kotlinx_coroutines_core != symbol3) {
                    if (state$kotlinx_coroutines_core != null) {
                        if (state$kotlinx_coroutines_core != BufferedChannelKt.BUFFERED) {
                            symbol5 = BufferedChannelKt.POISONED;
                            if (state$kotlinx_coroutines_core == symbol5) {
                                break;
                            }
                            symbol6 = BufferedChannelKt.DONE_RCV;
                            if (state$kotlinx_coroutines_core == symbol6) {
                                break;
                            }
                            symbol7 = BufferedChannelKt.INTERRUPTED_RCV;
                            if (state$kotlinx_coroutines_core == symbol7 || state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                                return true;
                            }
                            symbol8 = BufferedChannelKt.RESUMING_BY_RCV;
                            if (state$kotlinx_coroutines_core != symbol8) {
                                throw new IllegalStateException(("Unexpected cell state: " + state$kotlinx_coroutines_core).toString());
                            }
                        } else {
                            return true;
                        }
                    } else {
                        symbol4 = BufferedChannelKt.IN_BUFFER;
                        if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, symbol4)) {
                            return true;
                        }
                    }
                } else {
                    return false;
                }
            } else if (b9 >= receivers$volatile$FU.get(this)) {
                symbol = BufferedChannelKt.RESUMING_BY_EB;
                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, symbol)) {
                    if (tryResumeSender(state$kotlinx_coroutines_core, segment, index)) {
                        segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.BUFFERED);
                        return true;
                    }
                    symbol2 = BufferedChannelKt.INTERRUPTED_SEND;
                    segment.setState$kotlinx_coroutines_core(index, symbol2);
                    segment.onCancelledRequest(index, false);
                    return false;
                }
            } else if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, new WaiterEB((Waiter) state$kotlinx_coroutines_core))) {
                return true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateCellReceive(ChannelSegment<E> segment, int index, long r8, Object waiter) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
        if (state$kotlinx_coroutines_core == null) {
            if (r8 >= (sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L)) {
                if (waiter == null) {
                    symbol3 = BufferedChannelKt.SUSPEND_NO_WAITER;
                    return symbol3;
                }
                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, waiter)) {
                    expandBuffer();
                    symbol2 = BufferedChannelKt.SUSPEND;
                    return symbol2;
                }
            }
        } else if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
            symbol = BufferedChannelKt.DONE_RCV;
            if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, symbol)) {
                expandBuffer();
                return segment.retrieveElement$kotlinx_coroutines_core(index);
            }
        }
        return updateCellReceiveSlow(segment, index, r8, waiter);
    }

    private final Object updateCellReceiveSlow(ChannelSegment<E> segment, int index, long r8, Object waiter) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        Symbol symbol6;
        Symbol symbol7;
        Symbol symbol8;
        Symbol symbol9;
        Symbol symbol10;
        Symbol symbol11;
        Symbol symbol12;
        Symbol symbol13;
        Symbol symbol14;
        Symbol symbol15;
        Symbol symbol16;
        while (true) {
            Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
            if (state$kotlinx_coroutines_core != null) {
                symbol5 = BufferedChannelKt.IN_BUFFER;
                if (state$kotlinx_coroutines_core != symbol5) {
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
                        symbol6 = BufferedChannelKt.DONE_RCV;
                        if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, symbol6)) {
                            expandBuffer();
                            return segment.retrieveElement$kotlinx_coroutines_core(index);
                        }
                    } else {
                        symbol7 = BufferedChannelKt.INTERRUPTED_SEND;
                        if (state$kotlinx_coroutines_core == symbol7) {
                            symbol8 = BufferedChannelKt.FAILED;
                            return symbol8;
                        }
                        symbol9 = BufferedChannelKt.POISONED;
                        if (state$kotlinx_coroutines_core == symbol9) {
                            symbol10 = BufferedChannelKt.FAILED;
                            return symbol10;
                        }
                        if (state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                            expandBuffer();
                            symbol11 = BufferedChannelKt.FAILED;
                            return symbol11;
                        }
                        symbol12 = BufferedChannelKt.RESUMING_BY_EB;
                        if (state$kotlinx_coroutines_core != symbol12) {
                            symbol13 = BufferedChannelKt.RESUMING_BY_RCV;
                            if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, symbol13)) {
                                boolean z10 = state$kotlinx_coroutines_core instanceof WaiterEB;
                                if (z10) {
                                    state$kotlinx_coroutines_core = ((WaiterEB) state$kotlinx_coroutines_core).waiter;
                                }
                                if (tryResumeSender(state$kotlinx_coroutines_core, segment, index)) {
                                    symbol16 = BufferedChannelKt.DONE_RCV;
                                    segment.setState$kotlinx_coroutines_core(index, symbol16);
                                    expandBuffer();
                                    return segment.retrieveElement$kotlinx_coroutines_core(index);
                                }
                                symbol14 = BufferedChannelKt.INTERRUPTED_SEND;
                                segment.setState$kotlinx_coroutines_core(index, symbol14);
                                segment.onCancelledRequest(index, false);
                                if (z10) {
                                    expandBuffer();
                                }
                                symbol15 = BufferedChannelKt.FAILED;
                                return symbol15;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (r8 < (sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L)) {
                symbol = BufferedChannelKt.POISONED;
                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, symbol)) {
                    expandBuffer();
                    symbol2 = BufferedChannelKt.FAILED;
                    return symbol2;
                }
            } else {
                if (waiter == null) {
                    symbol3 = BufferedChannelKt.SUSPEND_NO_WAITER;
                    return symbol3;
                }
                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, waiter)) {
                    expandBuffer();
                    symbol4 = BufferedChannelKt.SUSPEND;
                    return symbol4;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int updateCellSend(ChannelSegment<E> segment, int index, E element, long s10, Object waiter, boolean closed) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        segment.storeElement$kotlinx_coroutines_core(index, element);
        if (closed) {
            return updateCellSendSlow(segment, index, element, s10, waiter, closed);
        }
        Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
        if (state$kotlinx_coroutines_core == null) {
            if (bufferOrRendezvousSend(s10)) {
                if (segment.casState$kotlinx_coroutines_core(index, null, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else {
                if (waiter == null) {
                    return 3;
                }
                if (segment.casState$kotlinx_coroutines_core(index, null, waiter)) {
                    return 2;
                }
            }
        } else if (state$kotlinx_coroutines_core instanceof Waiter) {
            segment.cleanElement$kotlinx_coroutines_core(index);
            if (tryResumeReceiver(state$kotlinx_coroutines_core, element)) {
                symbol3 = BufferedChannelKt.DONE_RCV;
                segment.setState$kotlinx_coroutines_core(index, symbol3);
                onReceiveDequeued();
                return 0;
            }
            symbol = BufferedChannelKt.INTERRUPTED_RCV;
            Object andSetState$kotlinx_coroutines_core = segment.getAndSetState$kotlinx_coroutines_core(index, symbol);
            symbol2 = BufferedChannelKt.INTERRUPTED_RCV;
            if (andSetState$kotlinx_coroutines_core != symbol2) {
                segment.onCancelledRequest(index, true);
            }
            return 5;
        }
        return updateCellSendSlow(segment, index, element, s10, waiter, closed);
    }

    private final int updateCellSendSlow(ChannelSegment<E> segment, int index, E element, long s10, Object waiter, boolean closed) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        Symbol symbol6;
        Symbol symbol7;
        while (true) {
            Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
            if (state$kotlinx_coroutines_core != null) {
                symbol2 = BufferedChannelKt.IN_BUFFER;
                if (state$kotlinx_coroutines_core != symbol2) {
                    symbol3 = BufferedChannelKt.INTERRUPTED_RCV;
                    if (state$kotlinx_coroutines_core == symbol3) {
                        segment.cleanElement$kotlinx_coroutines_core(index);
                        return 5;
                    }
                    symbol4 = BufferedChannelKt.POISONED;
                    if (state$kotlinx_coroutines_core == symbol4) {
                        segment.cleanElement$kotlinx_coroutines_core(index);
                        return 5;
                    }
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                        segment.cleanElement$kotlinx_coroutines_core(index);
                        completeCloseOrCancel();
                        return 4;
                    }
                    segment.cleanElement$kotlinx_coroutines_core(index);
                    if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                        state$kotlinx_coroutines_core = ((WaiterEB) state$kotlinx_coroutines_core).waiter;
                    }
                    if (tryResumeReceiver(state$kotlinx_coroutines_core, element)) {
                        symbol7 = BufferedChannelKt.DONE_RCV;
                        segment.setState$kotlinx_coroutines_core(index, symbol7);
                        onReceiveDequeued();
                        return 0;
                    }
                    symbol5 = BufferedChannelKt.INTERRUPTED_RCV;
                    Object andSetState$kotlinx_coroutines_core = segment.getAndSetState$kotlinx_coroutines_core(index, symbol5);
                    symbol6 = BufferedChannelKt.INTERRUPTED_RCV;
                    if (andSetState$kotlinx_coroutines_core != symbol6) {
                        segment.onCancelledRequest(index, true);
                    }
                    return 5;
                }
                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else if (!bufferOrRendezvousSend(s10) || closed) {
                if (closed) {
                    symbol = BufferedChannelKt.INTERRUPTED_SEND;
                    if (segment.casState$kotlinx_coroutines_core(index, null, symbol)) {
                        segment.onCancelledRequest(index, false);
                        return 4;
                    }
                } else {
                    if (waiter == null) {
                        return 3;
                    }
                    if (segment.casState$kotlinx_coroutines_core(index, null, waiter)) {
                        return 2;
                    }
                }
            } else if (segment.casState$kotlinx_coroutines_core(index, null, BufferedChannelKt.BUFFERED)) {
                return 1;
            }
        }
    }

    private final void updateReceiversCounterIfLower(long value) {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = receivers$volatile$FU;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (j10 >= value) {
                return;
            }
        } while (!receivers$volatile$FU.compareAndSet(this, j10, value));
    }

    private final void updateSendersCounterIfLower(long value) {
        long j10;
        long constructSendersAndCloseStatus;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            long j11 = 1152921504606846975L & j10;
            if (j11 >= value) {
                return;
            } else {
                constructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(j11, (int) (j10 >> 60));
            }
        } while (!sendersAndCloseStatus$volatile$FU.compareAndSet(this, j10, constructSendersAndCloseStatus));
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final boolean cancel(Throwable cause) {
        return cancelImpl$kotlinx_coroutines_core(cause);
    }

    public boolean cancelImpl$kotlinx_coroutines_core(Throwable cause) {
        if (cause == null) {
            cause = new CancellationException("Channel was cancelled");
        }
        return closeOrCancelImpl(cause, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void checkSegmentStructureInvariants() {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        ChannelSegment channelSegment;
        ChannelSegment channelSegment2;
        if (isRendezvousOrUnlimited()) {
            Object obj = bufferEndSegment$volatile$FU.get(this);
            channelSegment2 = BufferedChannelKt.NULL_SEGMENT;
            if (obj != channelSegment2) {
                throw new IllegalStateException(("bufferEndSegment must be NULL_SEGMENT for rendezvous and unlimited channels; they do not manipulate it.\nChannel state: " + this).toString());
            }
        } else if (((ChannelSegment) receiveSegment$volatile$FU.get(this)).id > ((ChannelSegment) bufferEndSegment$volatile$FU.get(this)).id) {
            throw new IllegalStateException(("bufferEndSegment should not have lower id than receiveSegment.\nChannel state: " + this).toString());
        }
        List q10 = P9.m.q(receiveSegment$volatile$FU.get(this), sendSegment$volatile$FU.get(this), bufferEndSegment$volatile$FU.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : q10) {
            ChannelSegment channelSegment3 = (ChannelSegment) obj2;
            channelSegment = BufferedChannelKt.NULL_SEGMENT;
            if (channelSegment3 != channelSegment) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j10 = ((ChannelSegment) next).id;
            do {
                Object next2 = it.next();
                long j11 = ((ChannelSegment) next2).id;
                if (j10 > j11) {
                    next = next2;
                    j10 = j11;
                }
            } while (it.hasNext());
        }
        ChannelSegment channelSegment4 = (ChannelSegment) next;
        if (channelSegment4.getPrev() != 0) {
            throw new IllegalStateException(("All processed segments should be unreachable from the data structure, but the `prev` link of the leftmost segment is non-null.\nChannel state: " + this).toString());
        }
        while (channelSegment4.getNext() != 0) {
            if (((ChannelSegment) channelSegment4.getNext()).getPrev() != 0 && ((ChannelSegment) channelSegment4.getNext()).getPrev() != channelSegment4) {
                throw new IllegalStateException(("The `segment.next.prev === segment` invariant is violated.\nChannel state: " + this).toString());
            }
            int i = BufferedChannelKt.SEGMENT_SIZE;
            int i9 = 0;
            for (int i10 = 0; i10 < i; i10++) {
                Object state$kotlinx_coroutines_core = channelSegment4.getState$kotlinx_coroutines_core(i10);
                if (!kotlin.jvm.internal.f.b(state$kotlinx_coroutines_core, BufferedChannelKt.BUFFERED) && !(state$kotlinx_coroutines_core instanceof Waiter)) {
                    symbol = BufferedChannelKt.INTERRUPTED_RCV;
                    if (!kotlin.jvm.internal.f.b(state$kotlinx_coroutines_core, symbol)) {
                        symbol2 = BufferedChannelKt.INTERRUPTED_SEND;
                        if (!kotlin.jvm.internal.f.b(state$kotlinx_coroutines_core, symbol2) && !kotlin.jvm.internal.f.b(state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                            symbol3 = BufferedChannelKt.POISONED;
                            if (!kotlin.jvm.internal.f.b(state$kotlinx_coroutines_core, symbol3)) {
                                symbol4 = BufferedChannelKt.DONE_RCV;
                                if (!kotlin.jvm.internal.f.b(state$kotlinx_coroutines_core, symbol4)) {
                                    throw new IllegalStateException(("Unexpected segment cell state: " + state$kotlinx_coroutines_core + ".\nChannel state: " + this).toString());
                                }
                            }
                            if (channelSegment4.getElement$kotlinx_coroutines_core(i10) != null) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                        }
                    }
                    if (channelSegment4.getElement$kotlinx_coroutines_core(i10) != null) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    i9++;
                }
            }
            if (i9 == BufferedChannelKt.SEGMENT_SIZE && channelSegment4 != receiveSegment$volatile$FU.get(this) && channelSegment4 != sendSegment$volatile$FU.get(this) && channelSegment4 != bufferEndSegment$volatile$FU.get(this)) {
                throw new IllegalStateException(("Logically removed segment is reachable.\nChannel state: " + this).toString());
            }
            channelSegment4 = (ChannelSegment) channelSegment4.getNext();
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable cause) {
        return closeOrCancelImpl(cause, false);
    }

    public boolean closeOrCancelImpl(Throwable cause, boolean cancel) {
        Symbol symbol;
        boolean z10;
        if (cancel) {
            markCancellationStarted();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _closeCause$volatile$FU;
        symbol = BufferedChannelKt.NO_CLOSE_CAUSE;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, symbol, cause)) {
                z10 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != symbol) {
                z10 = false;
                break;
            }
        }
        if (cancel) {
            markCancelled();
        } else {
            markClosed();
        }
        completeCloseOrCancel();
        onClosedIdempotent();
        if (z10) {
            invokeCloseHandler();
        }
        return z10;
    }

    public final void dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(long globalCellIndex) {
        Symbol symbol;
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        ChannelSegment<E> channelSegment = (ChannelSegment) receiveSegment$volatile$FU.get(this);
        while (true) {
            long j10 = receivers$volatile$FU.get(this);
            if (globalCellIndex < Math.max(this.capacity + j10, getBufferEndCounter())) {
                return;
            }
            if (receivers$volatile$FU.compareAndSet(this, j10, j10 + 1)) {
                int i = BufferedChannelKt.SEGMENT_SIZE;
                long j11 = j10 / i;
                int i9 = (int) (j10 % i);
                if (channelSegment.id != j11) {
                    ChannelSegment<E> findSegmentReceive = findSegmentReceive(j11, channelSegment);
                    if (findSegmentReceive == null) {
                        continue;
                    } else {
                        channelSegment = findSegmentReceive;
                    }
                }
                Object updateCellReceive = updateCellReceive(channelSegment, i9, j10, null);
                symbol = BufferedChannelKt.FAILED;
                if (updateCellReceive != symbol) {
                    channelSegment.cleanPrev();
                    InterfaceC0646l<E, p> interfaceC0646l = this.onUndeliveredElement;
                    if (interfaceC0646l != null && (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(interfaceC0646l, updateCellReceive, null, 2, null)) != null) {
                        throw callUndeliveredElementCatchingException$default;
                    }
                } else if (j10 < getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
            }
        }
    }

    public final Throwable getCloseCause() {
        return (Throwable) _closeCause$volatile$FU.get(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceive() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.INSTANCE;
        j.c(3, bufferedChannel$onReceive$1);
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.INSTANCE;
        j.c(3, bufferedChannel$onReceive$2);
        return new SelectClause1Impl(this, bufferedChannel$onReceive$1, bufferedChannel$onReceive$2, this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<ChannelResult<E>> getOnReceiveCatching() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.INSTANCE;
        j.c(3, bufferedChannel$onReceiveCatching$1);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.INSTANCE;
        j.c(3, bufferedChannel$onReceiveCatching$2);
        return new SelectClause1Impl(this, bufferedChannel$onReceiveCatching$1, bufferedChannel$onReceiveCatching$2, this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceiveOrNull() {
        BufferedChannel$onReceiveOrNull$1 bufferedChannel$onReceiveOrNull$1 = BufferedChannel$onReceiveOrNull$1.INSTANCE;
        j.c(3, bufferedChannel$onReceiveOrNull$1);
        BufferedChannel$onReceiveOrNull$2 bufferedChannel$onReceiveOrNull$2 = BufferedChannel$onReceiveOrNull$2.INSTANCE;
        j.c(3, bufferedChannel$onReceiveOrNull$2);
        return new SelectClause1Impl(this, bufferedChannel$onReceiveOrNull$1, bufferedChannel$onReceiveOrNull$2, this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<E, BufferedChannel<E>> getOnSend() {
        BufferedChannel$onSend$1 bufferedChannel$onSend$1 = BufferedChannel$onSend$1.INSTANCE;
        j.c(3, bufferedChannel$onSend$1);
        BufferedChannel$onSend$2 bufferedChannel$onSend$2 = BufferedChannel$onSend$2.INSTANCE;
        j.c(3, bufferedChannel$onSend$2);
        return new SelectClause2Impl(this, bufferedChannel$onSend$1, bufferedChannel$onSend$2, null, 8, null);
    }

    public final long getReceiversCounter$kotlinx_coroutines_core() {
        return receivers$volatile$FU.get(this);
    }

    public final Throwable getSendException() {
        Throwable closeCause = getCloseCause();
        return closeCause == null ? new ClosedSendChannelException(ChannelsKt.DEFAULT_CLOSE_MESSAGE) : closeCause;
    }

    public final long getSendersCounter$kotlinx_coroutines_core() {
        return sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L;
    }

    public final boolean hasElements$kotlinx_coroutines_core() {
        while (true) {
            ChannelSegment<E> channelSegment = (ChannelSegment) receiveSegment$volatile$FU.get(this);
            long receiversCounter$kotlinx_coroutines_core = getReceiversCounter$kotlinx_coroutines_core();
            if (getSendersCounter$kotlinx_coroutines_core() <= receiversCounter$kotlinx_coroutines_core) {
                return false;
            }
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j10 = receiversCounter$kotlinx_coroutines_core / i;
            if (channelSegment.id == j10 || (channelSegment = findSegmentReceive(j10, channelSegment)) != null) {
                channelSegment.cleanPrev();
                if (isCellNonEmpty(channelSegment, (int) (receiversCounter$kotlinx_coroutines_core % i), receiversCounter$kotlinx_coroutines_core)) {
                    return true;
                }
                receivers$volatile$FU.compareAndSet(this, receiversCounter$kotlinx_coroutines_core, 1 + receiversCounter$kotlinx_coroutines_core);
            } else if (((ChannelSegment) receiveSegment$volatile$FU.get(this)).id < j10) {
                return false;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(InterfaceC0646l<? super Throwable, p> handler) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = closeHandler$volatile$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, handler)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = closeHandler$volatile$FU;
                while (true) {
                    Object obj = atomicReferenceFieldUpdater2.get(this);
                    symbol = BufferedChannelKt.CLOSE_HANDLER_CLOSED;
                    if (obj != symbol) {
                        symbol2 = BufferedChannelKt.CLOSE_HANDLER_INVOKED;
                        if (obj == symbol2) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = closeHandler$volatile$FU;
                    symbol3 = BufferedChannelKt.CLOSE_HANDLER_CLOSED;
                    symbol4 = BufferedChannelKt.CLOSE_HANDLER_INVOKED;
                    while (!atomicReferenceFieldUpdater3.compareAndSet(this, symbol3, symbol4)) {
                        if (atomicReferenceFieldUpdater3.get(this) != symbol3) {
                            break;
                        }
                    }
                    handler.invoke(getCloseCause());
                    return;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
        return isClosedForReceive0(sendersAndCloseStatus$volatile$FU.get(this));
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return isClosedForSend0(sendersAndCloseStatus$volatile$FU.get(this));
    }

    public boolean isConflatedDropOldest() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        if (isClosedForReceive() || hasElements$kotlinx_coroutines_core()) {
            return false;
        }
        return !isClosedForReceive();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public ChannelIterator<E> iterator() {
        return new BufferedChannelIterator();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean offer(E e10) {
        return Channel.DefaultImpls.offer(this, e10);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public E poll() {
        return (E) Channel.DefaultImpls.poll(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object receive(T9.a<? super E> aVar) {
        return receive$suspendImpl(this, aVar);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: receiveCatching-JP2dKIU, reason: not valid java name */
    public Object mo116receiveCatchingJP2dKIU(T9.a<? super ChannelResult<? extends E>> aVar) {
        return m114receiveCatchingJP2dKIU$suspendImpl(this, aVar);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object receiveOrNull(T9.a<? super E> aVar) {
        return Channel.DefaultImpls.receiveOrNull(this, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0086, code lost:
    
        r14.selectInRegistrationPhase(O9.p.f3034a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void registerSelectForSend(kotlinx.coroutines.selects.SelectInstance<?> r14, java.lang.Object r15) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = access$getSendSegment$volatile$FU()
            java.lang.Object r0 = r0.get(r13)
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
        La:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getSendersAndCloseStatus$volatile$FU()
            long r1 = r1.getAndIncrement(r13)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r3 = r3 & r1
            boolean r1 = access$isClosedForSend0(r13, r1)
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r5 = (long) r2
            long r5 = r3 / r5
            long r7 = (long) r2
            long r7 = r3 % r7
            int r2 = (int) r7
            long r7 = r0.id
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 == 0) goto L39
            kotlinx.coroutines.channels.ChannelSegment r5 = access$findSegmentSend(r13, r5, r0)
            if (r5 != 0) goto L38
            if (r1 == 0) goto La
        L33:
            r13.onClosedSelectOnSend(r15, r14)
            goto L90
        L38:
            r0 = r5
        L39:
            r5 = r13
            r6 = r0
            r7 = r2
            r8 = r15
            r9 = r3
            r11 = r14
            r12 = r1
            int r5 = access$updateCellSend(r5, r6, r7, r8, r9, r11, r12)
            if (r5 == 0) goto L8c
            r6 = 1
            if (r5 == r6) goto L86
            r6 = 2
            if (r5 == r6) goto L72
            r1 = 3
            if (r5 == r1) goto L66
            r1 = 4
            if (r5 == r1) goto L5a
            r1 = 5
            if (r5 == r1) goto L56
            goto La
        L56:
            r0.cleanPrev()
            goto La
        L5a:
            long r1 = r13.getReceiversCounter$kotlinx_coroutines_core()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L33
            r0.cleanPrev()
            goto L33
        L66:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "unexpected"
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        L72:
            if (r1 == 0) goto L78
            r0.onSlotCleaned()
            goto L33
        L78:
            boolean r15 = r14 instanceof kotlinx.coroutines.Waiter
            if (r15 == 0) goto L7f
            kotlinx.coroutines.Waiter r14 = (kotlinx.coroutines.Waiter) r14
            goto L80
        L7f:
            r14 = 0
        L80:
            if (r14 == 0) goto L90
            access$prepareSenderForSuspension(r13, r14, r0, r2)
            goto L90
        L86:
            O9.p r15 = O9.p.f3034a
            r14.selectInRegistrationPhase(r15)
            goto L90
        L8c:
            r0.cleanPrev()
            goto L86
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.registerSelectForSend(kotlinx.coroutines.selects.SelectInstance, java.lang.Object):void");
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(E e10, T9.a<? super p> aVar) {
        return send$suspendImpl(this, e10, aVar);
    }

    public Object sendBroadcast$kotlinx_coroutines_core(E e10, T9.a<? super Boolean> aVar) {
        return sendBroadcast$suspendImpl(this, e10, aVar);
    }

    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return shouldSendSuspend(sendersAndCloseStatus$volatile$FU.get(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ce, code lost:
    
        r3 = (kotlinx.coroutines.channels.ChannelSegment) r3.getNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01d5, code lost:
    
        if (r3 != null) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.toString():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toStringDebug$kotlinx_coroutines_core() {
        String valueOf;
        ChannelSegment channelSegment;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("S=" + getSendersCounter$kotlinx_coroutines_core() + ",R=" + getReceiversCounter$kotlinx_coroutines_core() + ",B=" + getBufferEndCounter() + ",B'=" + completedExpandBuffersAndPauseFlag$volatile$FU.get(this) + ",C=" + ((int) (sendersAndCloseStatus$volatile$FU.get(this) >> 60)) + ',');
        int i = (int) (sendersAndCloseStatus$volatile$FU.get(this) >> 60);
        if (i == 1) {
            sb2.append("CANCELLATION_STARTED,");
        } else if (i == 2) {
            sb2.append("CLOSED,");
        } else if (i == 3) {
            sb2.append("CANCELLED,");
        }
        sb2.append("SEND_SEGM=" + DebugStringsKt.getHexAddress(sendSegment$volatile$FU.get(this)) + ",RCV_SEGM=" + DebugStringsKt.getHexAddress(receiveSegment$volatile$FU.get(this)));
        if (!isRendezvousOrUnlimited()) {
            sb2.append(",EB_SEGM=" + DebugStringsKt.getHexAddress(bufferEndSegment$volatile$FU.get(this)));
        }
        sb2.append("  ");
        List q10 = P9.m.q(receiveSegment$volatile$FU.get(this), sendSegment$volatile$FU.get(this), bufferEndSegment$volatile$FU.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : q10) {
            ChannelSegment channelSegment2 = (ChannelSegment) obj;
            channelSegment = BufferedChannelKt.NULL_SEGMENT;
            if (channelSegment2 != channelSegment) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j10 = ((ChannelSegment) next).id;
            do {
                Object next2 = it.next();
                long j11 = ((ChannelSegment) next2).id;
                if (j10 > j11) {
                    next = next2;
                    j10 = j11;
                }
            } while (it.hasNext());
        }
        ChannelSegment channelSegment3 = (ChannelSegment) next;
        do {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(DebugStringsKt.getHexAddress(channelSegment3));
            sb3.append("=[");
            sb3.append(channelSegment3.isRemoved() ? "*" : "");
            sb3.append(channelSegment3.id);
            sb3.append(",prev=");
            ChannelSegment channelSegment4 = (ChannelSegment) channelSegment3.getPrev();
            sb3.append(channelSegment4 != null ? DebugStringsKt.getHexAddress(channelSegment4) : null);
            sb3.append(',');
            sb2.append(sb3.toString());
            int i9 = BufferedChannelKt.SEGMENT_SIZE;
            for (int i10 = 0; i10 < i9; i10++) {
                Object state$kotlinx_coroutines_core = channelSegment3.getState$kotlinx_coroutines_core(i10);
                Object element$kotlinx_coroutines_core = channelSegment3.getElement$kotlinx_coroutines_core(i10);
                if (state$kotlinx_coroutines_core instanceof CancellableContinuation) {
                    valueOf = "cont";
                } else if (state$kotlinx_coroutines_core instanceof SelectInstance) {
                    valueOf = "select";
                } else if (state$kotlinx_coroutines_core instanceof ReceiveCatching) {
                    valueOf = "receiveCatching";
                } else if (state$kotlinx_coroutines_core instanceof SendBroadcast) {
                    valueOf = "send(broadcast)";
                } else if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                    valueOf = "EB(" + state$kotlinx_coroutines_core + ')';
                } else {
                    valueOf = String.valueOf(state$kotlinx_coroutines_core);
                }
                sb2.append("[" + i10 + "]=(" + valueOf + ',' + element$kotlinx_coroutines_core + "),");
            }
            StringBuilder sb4 = new StringBuilder("next=");
            ChannelSegment channelSegment5 = (ChannelSegment) channelSegment3.getNext();
            sb4.append(channelSegment5 != null ? DebugStringsKt.getHexAddress(channelSegment5) : null);
            sb4.append("]  ");
            sb2.append(sb4.toString());
            channelSegment3 = (ChannelSegment) channelSegment3.getNext();
        } while (channelSegment3 != null);
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: tryReceive-PtdJZtk, reason: not valid java name */
    public Object mo117tryReceivePtdJZtk() {
        Object obj;
        ChannelSegment channelSegment;
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        long j10 = receivers$volatile$FU.get(this);
        long j11 = sendersAndCloseStatus$volatile$FU.get(this);
        if (isClosedForReceive0(j11)) {
            return ChannelResult.INSTANCE.m137closedJP2dKIU(getCloseCause());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return ChannelResult.INSTANCE.m138failurePtdJZtk();
        }
        obj = BufferedChannelKt.INTERRUPTED_RCV;
        ChannelSegment channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j12 = andIncrement / i;
            int i9 = (int) (andIncrement % i);
            if (channelSegment2.id != j12) {
                ChannelSegment findSegmentReceive = findSegmentReceive(j12, channelSegment2);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            Object updateCellReceive = updateCellReceive(channelSegment, i9, andIncrement, obj);
            symbol = BufferedChannelKt.SUSPEND;
            if (updateCellReceive == symbol) {
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    prepareReceiverForSuspension(waiter, channelSegment, i9);
                }
                waitExpandBufferCompletion$kotlinx_coroutines_core(andIncrement);
                channelSegment.onSlotCleaned();
                return ChannelResult.INSTANCE.m138failurePtdJZtk();
            }
            symbol2 = BufferedChannelKt.FAILED;
            if (updateCellReceive != symbol2) {
                symbol3 = BufferedChannelKt.SUSPEND_NO_WAITER;
                if (updateCellReceive == symbol3) {
                    throw new IllegalStateException("unexpected".toString());
                }
                channelSegment.cleanPrev();
                return ChannelResult.INSTANCE.m139successJP2dKIU(updateCellReceive);
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
            channelSegment2 = channelSegment;
        }
        return ChannelResult.INSTANCE.m137closedJP2dKIU(getCloseCause());
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m139successJP2dKIU(O9.p.f3034a);
     */
    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo110trySendJP2dKIU(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getSendersAndCloseStatus$volatile$FU()
            long r0 = r0.get(r14)
            boolean r0 = r14.shouldSendSuspend(r0)
            if (r0 == 0) goto L15
            kotlinx.coroutines.channels.ChannelResult$Companion r15 = kotlinx.coroutines.channels.ChannelResult.INSTANCE
            java.lang.Object r15 = r15.m138failurePtdJZtk()
            return r15
        L15:
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = access$getSendSegment$volatile$FU()
            java.lang.Object r0 = r0.get(r14)
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
        L23:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getSendersAndCloseStatus$volatile$FU()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = access$isClosedForSend0(r14, r1)
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.id
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L5b
            kotlinx.coroutines.channels.ChannelSegment r1 = access$findSegmentSend(r14, r2, r0)
            if (r1 != 0) goto L59
            if (r11 == 0) goto L23
        L4d:
            kotlinx.coroutines.channels.ChannelResult$Companion r15 = kotlinx.coroutines.channels.ChannelResult.INSTANCE
            java.lang.Throwable r0 = r14.getSendException()
            java.lang.Object r15 = r15.m137closedJP2dKIU(r0)
            goto Lc0
        L59:
            r13 = r1
            goto L5c
        L5b:
            r13 = r0
        L5c:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = access$updateCellSend(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lbc
            r1 = 1
            if (r0 == r1) goto Lb3
            r1 = 2
            if (r0 == r1) goto L96
            r1 = 3
            if (r0 == r1) goto L8a
            r1 = 4
            if (r0 == r1) goto L7e
            r1 = 5
            if (r0 == r1) goto L79
            goto L7c
        L79:
            r13.cleanPrev()
        L7c:
            r0 = r13
            goto L23
        L7e:
            long r0 = r14.getReceiversCounter$kotlinx_coroutines_core()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L4d
            r13.cleanPrev()
            goto L4d
        L8a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L96:
            if (r11 == 0) goto L9c
            r13.onSlotCleaned()
            goto L4d
        L9c:
            boolean r15 = r8 instanceof kotlinx.coroutines.Waiter
            if (r15 == 0) goto La3
            kotlinx.coroutines.Waiter r8 = (kotlinx.coroutines.Waiter) r8
            goto La4
        La3:
            r8 = 0
        La4:
            if (r8 == 0) goto La9
            access$prepareSenderForSuspension(r14, r8, r13, r12)
        La9:
            r13.onSlotCleaned()
            kotlinx.coroutines.channels.ChannelResult$Companion r15 = kotlinx.coroutines.channels.ChannelResult.INSTANCE
            java.lang.Object r15 = r15.m138failurePtdJZtk()
            goto Lc0
        Lb3:
            kotlinx.coroutines.channels.ChannelResult$Companion r15 = kotlinx.coroutines.channels.ChannelResult.INSTANCE
            O9.p r0 = O9.p.f3034a
            java.lang.Object r15 = r15.m139successJP2dKIU(r0)
            goto Lc0
        Lbc:
            r13.cleanPrev()
            goto Lb3
        Lc0:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.mo110trySendJP2dKIU(java.lang.Object):java.lang.Object");
    }

    /* renamed from: trySendDropOldest-JP2dKIU, reason: not valid java name */
    public final Object m118trySendDropOldestJP2dKIU(E element) {
        ChannelSegment channelSegment;
        Object obj = BufferedChannelKt.BUFFERED;
        ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = isClosedForSend0(andIncrement);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j11 = j10 / i;
            int i9 = (int) (j10 % i);
            if (channelSegment2.id != j11) {
                ChannelSegment findSegmentSend = findSegmentSend(j11, channelSegment2);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosedForSend0) {
                    return ChannelResult.INSTANCE.m137closedJP2dKIU(getSendException());
                }
            } else {
                channelSegment = channelSegment2;
            }
            int updateCellSend = updateCellSend(channelSegment, i9, element, j10, obj, isClosedForSend0);
            if (updateCellSend == 0) {
                channelSegment.cleanPrev();
                return ChannelResult.INSTANCE.m139successJP2dKIU(p.f3034a);
            }
            if (updateCellSend == 1) {
                return ChannelResult.INSTANCE.m139successJP2dKIU(p.f3034a);
            }
            if (updateCellSend == 2) {
                if (isClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return ChannelResult.INSTANCE.m137closedJP2dKIU(getSendException());
                }
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    prepareSenderForSuspension(waiter, channelSegment, i9);
                }
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer((channelSegment.id * i) + i9);
                return ChannelResult.INSTANCE.m139successJP2dKIU(p.f3034a);
            }
            if (updateCellSend == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (updateCellSend == 4) {
                if (j10 < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return ChannelResult.INSTANCE.m137closedJP2dKIU(getSendException());
            }
            if (updateCellSend == 5) {
                channelSegment.cleanPrev();
            }
            channelSegment2 = channelSegment;
        }
    }

    public final void waitExpandBufferCompletion$kotlinx_coroutines_core(long globalIndex) {
        int i;
        long j10;
        long constructEBCompletedAndPauseFlag;
        long constructEBCompletedAndPauseFlag2;
        long j11;
        long constructEBCompletedAndPauseFlag3;
        if (isRendezvousOrUnlimited()) {
            return;
        }
        while (getBufferEndCounter() <= globalIndex) {
        }
        i = BufferedChannelKt.EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS;
        for (int i9 = 0; i9 < i; i9++) {
            long bufferEndCounter = getBufferEndCounter();
            if (bufferEndCounter == (completedExpandBuffersAndPauseFlag$volatile$FU.get(this) & 4611686018427387903L) && bufferEndCounter == getBufferEndCounter()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = completedExpandBuffersAndPauseFlag$volatile$FU;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            constructEBCompletedAndPauseFlag = BufferedChannelKt.constructEBCompletedAndPauseFlag(j10 & 4611686018427387903L, true);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, constructEBCompletedAndPauseFlag));
        while (true) {
            long bufferEndCounter2 = getBufferEndCounter();
            long j12 = completedExpandBuffersAndPauseFlag$volatile$FU.get(this);
            long j13 = j12 & 4611686018427387903L;
            boolean z10 = (4611686018427387904L & j12) != 0;
            if (bufferEndCounter2 == j13 && bufferEndCounter2 == getBufferEndCounter()) {
                break;
            }
            if (!z10) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = completedExpandBuffersAndPauseFlag$volatile$FU;
                constructEBCompletedAndPauseFlag2 = BufferedChannelKt.constructEBCompletedAndPauseFlag(j13, true);
                atomicLongFieldUpdater2.compareAndSet(this, j12, constructEBCompletedAndPauseFlag2);
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater3 = completedExpandBuffersAndPauseFlag$volatile$FU;
        do {
            j11 = atomicLongFieldUpdater3.get(this);
            constructEBCompletedAndPauseFlag3 = BufferedChannelKt.constructEBCompletedAndPauseFlag(j11 & 4611686018427387903L, false);
        } while (!atomicLongFieldUpdater3.compareAndSet(this, j11, constructEBCompletedAndPauseFlag3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0837e<p> bindCancellationFun(InterfaceC0646l<? super E, p> interfaceC0646l) {
        return new BufferedChannel$bindCancellationFun$2(this);
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, InterfaceC0646l<Object, p> interfaceC0646l) {
        while (true) {
            interfaceC0646l.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel() {
        cancelImpl$kotlinx_coroutines_core(null);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel(CancellationException cause) {
        cancelImpl$kotlinx_coroutines_core(cause);
    }

    public static /* synthetic */ void getOnReceive$annotations() {
    }

    public static /* synthetic */ void getOnReceiveCatching$annotations() {
    }

    public static /* synthetic */ void getOnReceiveOrNull$annotations() {
    }

    public static /* synthetic */ void getOnSend$annotations() {
    }

    private static /* synthetic */ void getOnUndeliveredElementReceiveCancellationConstructor$annotations() {
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void isClosedForReceive$annotations() {
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void isClosedForSend$annotations() {
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void isEmpty$annotations() {
    }

    public void onClosedIdempotent() {
    }

    public void onReceiveDequeued() {
    }

    public void onReceiveEnqueued() {
    }

    public /* synthetic */ BufferedChannel(int i, InterfaceC0646l interfaceC0646l, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i9 & 2) != 0 ? null : interfaceC0646l);
    }
}
