package androidx.lifecycle;

import androidx.lifecycle.C0558y;
import androidx.lifecycle.P;
import ca.InterfaceC0646l;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Transformations.kt */
/* loaded from: classes.dex */
public final class P {

    /* compiled from: Transformations.kt */
    public static final class a implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f7001a;

        public a(InterfaceC0646l interfaceC0646l) {
            this.f7001a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof A) || !(obj instanceof kotlin.jvm.internal.d)) {
                return false;
            }
            return kotlin.jvm.internal.f.b(this.f7001a, ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f7001a;
        }

        public final int hashCode() {
            return this.f7001a.hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f7001a.invoke(obj);
        }
    }

    public static final C0558y a(AbstractC0557x abstractC0557x, final InterfaceC0646l interfaceC0646l) {
        final C0558y c0558y = abstractC0557x.isInitialized() ? new C0558y(interfaceC0646l.invoke(abstractC0557x.getValue())) : new C0558y();
        c0558y.a(abstractC0557x, new a(new InterfaceC0646l<Object, O9.p>() { // from class: androidx.lifecycle.Transformations$map$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // ca.InterfaceC0646l
            public final O9.p invoke(Object obj) {
                c0558y.setValue(interfaceC0646l.invoke(obj));
                return O9.p.f3034a;
            }
        }));
        return c0558y;
    }

    public static final C0558y b(C0559z c0559z, final Q3.a aVar) {
        final C0558y c0558y;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (c0559z.isInitialized()) {
            AbstractC0557x abstractC0557x = (AbstractC0557x) aVar.invoke(c0559z.getValue());
            c0558y = (abstractC0557x == null || !abstractC0557x.isInitialized()) ? new C0558y() : new C0558y(abstractC0557x.getValue());
        } else {
            c0558y = new C0558y();
        }
        c0558y.a(c0559z, new a(new InterfaceC0646l<Object, O9.p>() { // from class: androidx.lifecycle.Transformations$switchMap$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r5v2, types: [T, androidx.lifecycle.x] */
            @Override // ca.InterfaceC0646l
            public final O9.p invoke(Object obj) {
                ?? r52 = (AbstractC0557x) aVar.invoke(obj);
                Ref$ObjectRef<AbstractC0557x<Object>> ref$ObjectRef2 = ref$ObjectRef;
                AbstractC0557x<?> abstractC0557x2 = ref$ObjectRef2.f23179a;
                if (abstractC0557x2 != r52) {
                    final C0558y<Object> c0558y2 = c0558y;
                    if (abstractC0557x2 != null) {
                        C0558y.a<?> c2 = c0558y2.f7115a.c(abstractC0557x2);
                        if (c2 != null) {
                            c2.f7116a.removeObserver(c2);
                        }
                    }
                    ref$ObjectRef2.f23179a = r52;
                    if (r52 != 0) {
                        c0558y2.a(r52, new P.a(new InterfaceC0646l<Object, O9.p>() { // from class: androidx.lifecycle.Transformations$switchMap$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // ca.InterfaceC0646l
                            public final O9.p invoke(Object obj2) {
                                c0558y2.setValue(obj2);
                                return O9.p.f3034a;
                            }
                        }));
                    }
                }
                return O9.p.f3034a;
            }
        }));
        return c0558y;
    }
}
