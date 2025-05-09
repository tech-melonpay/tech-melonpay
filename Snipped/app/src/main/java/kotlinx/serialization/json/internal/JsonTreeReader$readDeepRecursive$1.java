package kotlinx.serialization.json.internal;

import O9.p;
import ca.InterfaceC0651q;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlinx.serialization.json.JsonElement;
import ta.u;

/* compiled from: JsonTreeReader.kt */
@V9.d(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {115}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LO9/b;", "LO9/p;", "Lkotlinx/serialization/json/JsonElement;", "it", "<anonymous>", "(Lkotlin/DeepRecursiveScope;V)Lkotlinx/serialization/json/JsonElement;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
final class JsonTreeReader$readDeepRecursive$1 extends RestrictedSuspendLambda implements InterfaceC0651q<O9.b<p, JsonElement>, p, T9.a<? super JsonElement>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public int f23387u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ O9.b f23388v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f23389w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readDeepRecursive$1(d dVar, T9.a<? super JsonTreeReader$readDeepRecursive$1> aVar) {
        super(3, aVar);
        this.f23389w = dVar;
    }

    @Override // ca.InterfaceC0651q
    public final Object invoke(O9.b<p, JsonElement> bVar, p pVar, T9.a<? super JsonElement> aVar) {
        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this.f23389w, aVar);
        jsonTreeReader$readDeepRecursive$1.f23388v = bVar;
        return jsonTreeReader$readDeepRecursive$1.invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.f23387u;
        if (i == 0) {
            kotlin.b.b(obj);
            O9.b bVar = this.f23388v;
            d dVar = this.f23389w;
            byte r8 = dVar.f23412a.r();
            if (r8 == 1) {
                return dVar.d(true);
            }
            if (r8 == 0) {
                return dVar.d(false);
            }
            if (r8 != 6) {
                if (r8 == 8) {
                    return dVar.c();
                }
                u.m(dVar.f23412a, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f23387u = 1;
            obj = d.a(dVar, bVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return (JsonElement) obj;
    }
}
