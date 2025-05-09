package kotlinx.serialization.json.internal;

import O9.p;
import ca.InterfaceC0651q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.j;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import pa.C1124b;
import sa.f;
import sa.l;
import ta.u;

/* compiled from: JsonTreeReader.kt */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final u f23412a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23413b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23414c;

    /* renamed from: d, reason: collision with root package name */
    public int f23415d;

    public d(f fVar, u uVar) {
        this.f23412a = uVar;
        this.f23413b = fVar.f27091c;
        this.f23414c = fVar.f27101n;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(kotlinx.serialization.json.internal.d r11, O9.b r12, T9.a r13) {
        /*
            r11.getClass()
            boolean r0 = r13 instanceof kotlinx.serialization.json.internal.JsonTreeReader$readObject$2
            if (r0 == 0) goto L16
            r0 = r13
            kotlinx.serialization.json.internal.JsonTreeReader$readObject$2 r0 = (kotlinx.serialization.json.internal.JsonTreeReader$readObject$2) r0
            int r1 = r0.f23390A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f23390A = r1
            goto L1b
        L16:
            kotlinx.serialization.json.internal.JsonTreeReader$readObject$2 r0 = new kotlinx.serialization.json.internal.JsonTreeReader$readObject$2
            r0.<init>(r11, r13)
        L1b:
            java.lang.Object r13 = r0.f23395y
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f23390A
            r3 = 0
            r4 = 6
            r5 = 0
            r6 = 7
            r7 = 4
            r8 = 1
            if (r2 == 0) goto L5c
            if (r2 != r8) goto L54
            java.lang.String r11 = r0.f23394x
            java.util.LinkedHashMap r12 = r0.f23393w
            kotlinx.serialization.json.internal.d r2 = r0.f23392v
            O9.b r9 = r0.f23391u
            kotlin.b.b(r13)
            kotlinx.serialization.json.JsonElement r13 = (kotlinx.serialization.json.JsonElement) r13
            r12.put(r11, r13)
            ta.u r11 = r2.f23412a
            byte r11 = r11.e()
            if (r11 == r7) goto L4e
            if (r11 != r6) goto L46
            goto L9d
        L46:
            ta.u r11 = r2.f23412a
            java.lang.String r12 = "Expected end of the object or comma"
            ta.u.m(r11, r12, r3, r5, r4)
            throw r5
        L4e:
            r13 = r12
            r12 = r9
            r10 = r2
            r2 = r11
            r11 = r10
            goto L70
        L54:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L5c:
            kotlin.b.b(r13)
            ta.u r13 = r11.f23412a
            byte r2 = r13.f(r4)
            byte r9 = r13.r()
            if (r9 == r7) goto Lb9
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
        L70:
            ta.u r3 = r11.f23412a
            boolean r9 = r3.b()
            if (r9 == 0) goto L99
            boolean r2 = r11.f23413b
            if (r2 == 0) goto L81
            java.lang.String r2 = r3.j()
            goto L85
        L81:
            java.lang.String r2 = r3.i()
        L85:
            r4 = 5
            r3.f(r4)
            O9.p r3 = O9.p.f3034a
            r0.f23391u = r12
            r0.f23392v = r11
            r0.f23393w = r13
            r0.f23394x = r2
            r0.f23390A = r8
            r12.a(r3, r0)
            goto Lb8
        L99:
            r12 = r13
            r10 = r2
            r2 = r11
            r11 = r10
        L9d:
            ta.u r13 = r2.f23412a
            if (r11 != r4) goto La5
            r13.f(r6)
            goto Lb3
        La5:
            if (r11 != r7) goto Lb3
            boolean r11 = r2.f23414c
            if (r11 == 0) goto Laf
            r13.f(r6)
            goto Lb3
        Laf:
            pa.C1124b.D(r13)
            throw r5
        Lb3:
            kotlinx.serialization.json.JsonObject r1 = new kotlinx.serialization.json.JsonObject
            r1.<init>(r12)
        Lb8:
            return r1
        Lb9:
            java.lang.String r11 = "Unexpected leading comma"
            ta.u.m(r13, r11, r3, r5, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.d.a(kotlinx.serialization.json.internal.d, O9.b, T9.a):java.lang.Object");
    }

    public final JsonElement b() {
        JsonElement jsonObject;
        Object obj;
        Object invoke;
        u uVar = this.f23412a;
        byte r8 = uVar.r();
        if (r8 == 1) {
            return d(true);
        }
        if (r8 == 0) {
            return d(false);
        }
        if (r8 != 6) {
            if (r8 == 8) {
                return c();
            }
            u.m(uVar, "Cannot read Json element because of unexpected ".concat(C1124b.G(r8)), 0, null, 6);
            throw null;
        }
        int i = this.f23415d + 1;
        this.f23415d = i;
        if (i == 200) {
            JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this, null);
            p pVar = p.f3034a;
            CoroutineSingletons coroutineSingletons = O9.a.f3007a;
            O9.c cVar = new O9.c();
            cVar.f3008a = jsonTreeReader$readDeepRecursive$1;
            cVar.f3009b = pVar;
            cVar.f3010c = cVar;
            CoroutineSingletons coroutineSingletons2 = O9.a.f3007a;
            cVar.f3011d = coroutineSingletons2;
            while (true) {
                obj = cVar.f3011d;
                T9.a<Object> aVar = cVar.f3010c;
                if (aVar == null) {
                    break;
                }
                if (kotlin.jvm.internal.f.b(coroutineSingletons2, obj)) {
                    try {
                        InterfaceC0651q<? super O9.b<?, ?>, Object, ? super T9.a<Object>, ? extends Object> interfaceC0651q = cVar.f3008a;
                        Object obj2 = cVar.f3009b;
                        if (interfaceC0651q instanceof BaseContinuationImpl) {
                            j.c(3, interfaceC0651q);
                            invoke = interfaceC0651q.invoke(cVar, obj2, aVar);
                        } else {
                            kotlin.coroutines.d context = aVar.getContext();
                            BaseContinuationImpl intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1 = context == EmptyCoroutineContext.f23155a ? new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1(aVar) : new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2(aVar, context);
                            j.c(3, interfaceC0651q);
                            invoke = interfaceC0651q.invoke(cVar, obj2, intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1);
                        }
                        if (invoke != CoroutineSingletons.f23158a) {
                            aVar.resumeWith(invoke);
                        }
                    } catch (Throwable th) {
                        aVar.resumeWith(new Result.Failure(th));
                    }
                } else {
                    cVar.f3011d = coroutineSingletons2;
                    aVar.resumeWith(obj);
                }
            }
            kotlin.b.b(obj);
            jsonObject = (JsonElement) obj;
        } else {
            byte f10 = uVar.f((byte) 6);
            if (uVar.r() == 4) {
                u.m(uVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!uVar.b()) {
                    break;
                }
                String j10 = this.f23413b ? uVar.j() : uVar.i();
                uVar.f((byte) 5);
                linkedHashMap.put(j10, b());
                f10 = uVar.e();
                if (f10 != 4) {
                    if (f10 != 7) {
                        u.m(uVar, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (f10 == 6) {
                uVar.f((byte) 7);
            } else if (f10 == 4) {
                if (!this.f23414c) {
                    C1124b.D(uVar);
                    throw null;
                }
                uVar.f((byte) 7);
            }
            jsonObject = new JsonObject(linkedHashMap);
        }
        this.f23415d--;
        return jsonObject;
    }

    public final JsonArray c() {
        u uVar = this.f23412a;
        byte e10 = uVar.e();
        if (uVar.r() == 4) {
            u.m(uVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (uVar.b()) {
            arrayList.add(b());
            e10 = uVar.e();
            if (e10 != 4) {
                boolean z10 = e10 == 9;
                int i = uVar.f30025a;
                if (!z10) {
                    u.m(uVar, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (e10 == 8) {
            uVar.f((byte) 9);
        } else if (e10 == 4) {
            if (!this.f23414c) {
                C1124b.C(uVar, "array");
                throw null;
            }
            uVar.f((byte) 9);
        }
        return new JsonArray(arrayList);
    }

    public final JsonPrimitive d(boolean z10) {
        boolean z11 = this.f23413b;
        u uVar = this.f23412a;
        String j10 = (z11 || !z10) ? uVar.j() : uVar.i();
        return (z10 || !kotlin.jvm.internal.f.b(j10, "null")) ? new l(j10, z10, null) : JsonNull.INSTANCE;
    }
}
