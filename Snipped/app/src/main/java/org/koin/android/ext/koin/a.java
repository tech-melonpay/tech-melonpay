package org.koin.android.ext.koin;

import C.N;
import C.v;
import Fa.h;
import O9.p;
import P9.q;
import U4.b;
import android.app.Application;
import android.content.Context;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import ia.InterfaceC0835c;
import j3.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.logger.Level;

/* compiled from: KoinExt.kt */
/* loaded from: classes3.dex */
public final class a {
    public static final void a(org.koin.core.a aVar, final Context context) {
        h hVar = aVar.f25539a;
        N n10 = (N) hVar.f1301d;
        Level level = Level.f25555b;
        if (n10.j(level)) {
            ((Level) ((N) hVar.f1301d).f535b).compareTo(level);
        }
        if (context instanceof Application) {
            hVar.e(Collections.singletonList(e.w(new InterfaceC0646l<fb.a, p>() { // from class: org.koin.android.ext.koin.KoinExtKt$androidContext$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // ca.InterfaceC0646l
                public final p invoke(fb.a aVar2) {
                    fb.a aVar3 = aVar2;
                    final Context context2 = context;
                    BeanDefinition beanDefinition = new BeanDefinition(kotlin.jvm.internal.h.a(Application.class), null, new InterfaceC0650p<org.koin.core.scope.a, gb.a, Application>() { // from class: org.koin.android.ext.koin.KoinExtKt$androidContext$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // ca.InterfaceC0650p
                        public final Application invoke(org.koin.core.scope.a aVar4, gb.a aVar5) {
                            return (Application) context2;
                        }
                    }, Kind.f25548a, EmptyList.f23104a);
                    SingleInstanceFactory<?> v10 = v.v(beanDefinition, aVar3);
                    if (aVar3.f20722a) {
                        aVar3.b(v10);
                    }
                    Pair pair = new Pair(aVar3, v10);
                    InterfaceC0835c[] interfaceC0835cArr = {kotlin.jvm.internal.h.a(Context.class), kotlin.jvm.internal.h.a(Application.class)};
                    List<? extends InterfaceC0835c<?>> list = beanDefinition.f25546f;
                    ArrayList arrayList = new ArrayList(list.size() + 2);
                    arrayList.addAll(list);
                    q.w(arrayList, interfaceC0835cArr);
                    beanDefinition.f25546f = arrayList;
                    for (int i = 0; i < 2; i++) {
                        ((fb.a) pair.f23089a).f20725d.put(b.o(interfaceC0835cArr[i], beanDefinition.f25543c, beanDefinition.f25541a), v10);
                    }
                    return p.f3034a;
                }
            })), true);
        } else {
            hVar.e(Collections.singletonList(e.w(new InterfaceC0646l<fb.a, p>() { // from class: org.koin.android.ext.koin.KoinExtKt$androidContext$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // ca.InterfaceC0646l
                public final p invoke(fb.a aVar2) {
                    fb.a aVar3 = aVar2;
                    final Context context2 = context;
                    SingleInstanceFactory<?> v10 = v.v(new BeanDefinition(kotlin.jvm.internal.h.a(Context.class), null, new InterfaceC0650p<org.koin.core.scope.a, gb.a, Context>() { // from class: org.koin.android.ext.koin.KoinExtKt$androidContext$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // ca.InterfaceC0650p
                        public final Context invoke(org.koin.core.scope.a aVar4, gb.a aVar5) {
                            return context2;
                        }
                    }, Kind.f25548a, EmptyList.f23104a), aVar3);
                    if (aVar3.f20722a) {
                        aVar3.b(v10);
                    }
                    return p.f3034a;
                }
            })), true);
        }
    }
}
