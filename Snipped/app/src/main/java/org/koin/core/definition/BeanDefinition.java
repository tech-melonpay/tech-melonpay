package org.koin.core.definition;

import ca.InterfaceC0650p;
import hb.a;
import ia.InterfaceC0835c;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.b;
import kotlin.jvm.internal.f;

/* compiled from: BeanDefinition.kt */
/* loaded from: classes3.dex */
public final class BeanDefinition<T> {

    /* renamed from: a, reason: collision with root package name */
    public final a f25541a = ib.a.f21519c;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0835c<?> f25542b;

    /* renamed from: c, reason: collision with root package name */
    public final a f25543c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0650p<org.koin.core.scope.a, gb.a, T> f25544d;

    /* renamed from: e, reason: collision with root package name */
    public final Kind f25545e;

    /* renamed from: f, reason: collision with root package name */
    public List<? extends InterfaceC0835c<?>> f25546f;

    public BeanDefinition(b bVar, a aVar, InterfaceC0650p interfaceC0650p, Kind kind, EmptyList emptyList) {
        this.f25542b = bVar;
        this.f25543c = aVar;
        this.f25544d = interfaceC0650p;
        this.f25545e = kind;
        this.f25546f = emptyList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
        }
        BeanDefinition beanDefinition = (BeanDefinition) obj;
        return f.b(this.f25542b, beanDefinition.f25542b) && f.b(this.f25543c, beanDefinition.f25543c) && f.b(this.f25541a, beanDefinition.f25541a);
    }

    public final int hashCode() {
        a aVar = this.f25543c;
        return this.f25541a.hashCode() + ((this.f25542b.hashCode() + ((aVar != null ? aVar.hashCode() : 0) * 31)) * 31);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0033, code lost:
    
        if (r2 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r11 = this;
            org.koin.core.definition.Kind r0 = r11.f25545e
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "'"
            r1.<init>(r2)
            ia.c<?> r2 = r11.f25542b
            java.lang.String r2 = kb.a.a(r2)
            r1.append(r2)
            r2 = 39
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            hb.a r2 = r11.f25543c
            java.lang.String r3 = ""
            if (r2 == 0) goto L35
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = ",qualifier:"
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            if (r2 != 0) goto L36
        L35:
            r2 = r3
        L36:
            hb.a r4 = ib.a.f21519c
            hb.a r5 = r11.f25541a
            boolean r4 = kotlin.jvm.internal.f.b(r5, r4)
            if (r4 == 0) goto L42
            r4 = r3
            goto L50
        L42:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = ",scope:"
            r4.<init>(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
        L50:
            java.util.List<? extends ia.c<?>> r5 = r11.f25546f
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ 1
            if (r5 == 0) goto L73
            java.util.List<? extends ia.c<?>> r3 = r11.f25546f
            r5 = r3
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            org.koin.core.definition.BeanDefinition$toString$defOtherTypes$typesAsString$1 r9 = new ca.InterfaceC0646l<ia.InterfaceC0835c<?>, java.lang.CharSequence>() { // from class: org.koin.core.definition.BeanDefinition$toString$defOtherTypes$typesAsString$1
                static {
                    /*
                        org.koin.core.definition.BeanDefinition$toString$defOtherTypes$typesAsString$1 r0 = new org.koin.core.definition.BeanDefinition$toString$defOtherTypes$typesAsString$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:org.koin.core.definition.BeanDefinition$toString$defOtherTypes$typesAsString$1) org.koin.core.definition.BeanDefinition$toString$defOtherTypes$typesAsString$1.l org.koin.core.definition.BeanDefinition$toString$defOtherTypes$typesAsString$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: org.koin.core.definition.BeanDefinition$toString$defOtherTypes$typesAsString$1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: org.koin.core.definition.BeanDefinition$toString$defOtherTypes$typesAsString$1.<init>():void");
                }

                @Override // ca.InterfaceC0646l
                public final java.lang.CharSequence invoke(ia.InterfaceC0835c<?> r1) {
                    /*
                        r0 = this;
                        ia.c r1 = (ia.InterfaceC0835c) r1
                        java.lang.String r1 = kb.a.a(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: org.koin.core.definition.BeanDefinition$toString$defOtherTypes$typesAsString$1.invoke(java.lang.Object):java.lang.Object");
                }
            }
            r7 = 0
            r8 = 0
            java.lang.String r6 = ","
            r10 = 30
            java.lang.String r3 = P9.s.P(r5, r6, r7, r8, r9, r10)
            java.lang.String r5 = ",binds:"
            java.lang.String r3 = s3.b.j(r5, r3)
        L73:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "["
            r5.<init>(r6)
            r5.append(r0)
            r0 = 58
            r5.append(r0)
            r5.append(r1)
            r5.append(r2)
            r5.append(r4)
            r5.append(r3)
            r0 = 93
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.core.definition.BeanDefinition.toString():java.lang.String");
    }
}
