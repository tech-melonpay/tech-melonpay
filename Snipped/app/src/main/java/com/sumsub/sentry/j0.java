package com.sumsub.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import na.InterfaceC1078b;
import na.InterfaceC1080d;
import oa.C1095a;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.C1169d;
import ra.InterfaceC1162A;

@InterfaceC1080d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0013\u001eB+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00022\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0013\u0010\u0019J\u0019\u0010\u0013\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0013\u0010\u001cR\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006 "}, d2 = {"Lcom/sumsub/sentry/j0;", "", "", "", "inAppExcludes", "inAppIncludes", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen1", "Lra/i0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lra/i0;)V", "self", "Lqa/c;", "output", "Lpa/f;", "serialDesc", "LO9/p;", "a", "(Lcom/sumsub/sentry/j0;Lqa/c;Lpa/f;)V", "", "Ljava/lang/StackTraceElement;", "elements", "Lcom/sumsub/sentry/h0;", "([Ljava/lang/StackTraceElement;)Ljava/util/List;", "className", "", "(Ljava/lang/String;)Z", "Ljava/util/List;", "b", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class j0 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final List<String> inAppExcludes;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final List<String> inAppIncludes;

    public static final class a implements InterfaceC1162A<j0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13690a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ pa.f f13691b;

        static {
            a aVar = new a();
            f13690a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sentry.SentryStackTraceFactory", aVar, 2);
            pluginGeneratedSerialDescriptor.k("inAppExcludes", true);
            pluginGeneratedSerialDescriptor.k("inAppIncludes", true);
            f13691b = pluginGeneratedSerialDescriptor;
        }

        @Override // na.InterfaceC1077a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j0 deserialize(InterfaceC1144d interfaceC1144d) {
            pa.f descriptor = getDescriptor();
            InterfaceC1142b c2 = interfaceC1144d.c(descriptor);
            ra.i0 i0Var = null;
            boolean z10 = true;
            int i = 0;
            Object obj = null;
            Object obj2 = null;
            while (z10) {
                int q10 = c2.q(descriptor);
                if (q10 == -1) {
                    z10 = false;
                } else if (q10 == 0) {
                    obj = c2.D(descriptor, 0, new C1169d(ra.m0.f26414a, 0), obj);
                    i |= 1;
                } else {
                    if (q10 != 1) {
                        throw new UnknownFieldException(q10);
                    }
                    obj2 = c2.D(descriptor, 1, new C1169d(ra.m0.f26414a, 0), obj2);
                    i |= 2;
                }
            }
            c2.b(descriptor);
            return new j0(i, (List) obj, (List) obj2, i0Var);
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] childSerializers() {
            ra.m0 m0Var = ra.m0.f26414a;
            return new InterfaceC1078b[]{C1095a.a(new C1169d(m0Var, 0)), C1095a.a(new C1169d(m0Var, 0))};
        }

        @Override // na.InterfaceC1081e, na.InterfaceC1077a
        public pa.f getDescriptor() {
            return f13691b;
        }

        @Override // ra.InterfaceC1162A
        public InterfaceC1078b<?>[] typeParametersSerializers() {
            return ra.a0.f26382b;
        }

        @Override // na.InterfaceC1081e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC1145e interfaceC1145e, j0 j0Var) {
            pa.f descriptor = getDescriptor();
            InterfaceC1143c c2 = interfaceC1145e.c(descriptor);
            j0.a(j0Var, c2, descriptor);
            c2.b(descriptor);
        }
    }

    /* renamed from: com.sumsub.sentry.j0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1078b<j0> serializer() {
            return a.f13690a;
        }

        public Companion() {
        }
    }

    public j0() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static final void a(j0 self, InterfaceC1143c output, pa.f serialDesc) {
        if (output.D() || self.inAppExcludes != null) {
            output.e(serialDesc, 0, new C1169d(ra.m0.f26414a, 0), self.inAppExcludes);
        }
        if (!output.D() && self.inAppIncludes == null) {
            return;
        }
        output.e(serialDesc, 1, new C1169d(ra.m0.f26414a, 0), self.inAppIncludes);
    }

    public /* synthetic */ j0(int i, List list, List list2, ra.i0 i0Var) {
        if ((i & 1) == 0) {
            this.inAppExcludes = null;
        } else {
            this.inAppExcludes = list;
        }
        if ((i & 2) == 0) {
            this.inAppIncludes = null;
        } else {
            this.inAppIncludes = list2;
        }
    }

    public final List<h0> a(StackTraceElement[] elements) {
        if (elements != null) {
            if (!(elements.length == 0)) {
                ArrayList arrayList = new ArrayList();
                P9.v vVar = new P9.v(elements, 2);
                while (vVar.hasNext()) {
                    StackTraceElement stackTraceElement = (StackTraceElement) vVar.next();
                    String className = stackTraceElement.getClassName();
                    boolean a10 = a(className);
                    String methodName = stackTraceElement.getMethodName();
                    String fileName = stackTraceElement.getFileName();
                    int lineNumber = stackTraceElement.getLineNumber();
                    arrayList.add(new h0(null, null, null, null, fileName, methodName, className, lineNumber >= 0 ? Integer.valueOf(lineNumber) : null, null, null, null, Boolean.valueOf(a10), null, Boolean.valueOf(stackTraceElement.isNativeMethod()), null, null, null, null, null, 513807, null));
                }
                Collections.reverse(arrayList);
                return arrayList;
            }
        }
        return null;
    }

    public j0(List<String> list, List<String> list2) {
        this.inAppExcludes = list;
        this.inAppIncludes = list2;
    }

    public /* synthetic */ j0(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }

    public final boolean a(String className) {
        if (className == null || className.length() == 0) {
            return true;
        }
        List<String> list = this.inAppIncludes;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (className.startsWith(it.next())) {
                    return true;
                }
            }
        }
        List<String> list2 = this.inAppExcludes;
        if (list2 != null) {
            Iterator<String> it2 = list2.iterator();
            while (it2.hasNext() && !className.startsWith(it2.next())) {
            }
        }
        return false;
    }
}
