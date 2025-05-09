package kotlinx.serialization.json.internal;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: JsonTreeReader.kt */
@V9.d(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", l = {24}, m = "readObject")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class JsonTreeReader$readObject$2 extends ContinuationImpl {

    /* renamed from: A, reason: collision with root package name */
    public int f23390A;

    /* renamed from: u, reason: collision with root package name */
    public O9.b f23391u;

    /* renamed from: v, reason: collision with root package name */
    public d f23392v;

    /* renamed from: w, reason: collision with root package name */
    public LinkedHashMap f23393w;

    /* renamed from: x, reason: collision with root package name */
    public String f23394x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f23395y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ d f23396z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readObject$2(d dVar, T9.a<? super JsonTreeReader$readObject$2> aVar) {
        super(aVar);
        this.f23396z = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23395y = obj;
        this.f23390A |= Integer.MIN_VALUE;
        return d.a(this.f23396z, null, this);
    }
}
