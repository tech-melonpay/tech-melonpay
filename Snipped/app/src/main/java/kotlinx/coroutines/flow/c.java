package kotlinx.coroutines.flow;

import ca.InterfaceC0646l;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23235a;

    public /* synthetic */ c(int i) {
        this.f23235a = i;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        Object defaultKeySelector$lambda$0$FlowKt__DistinctKt;
        boolean onErrorReturn$lambda$0$FlowKt__MigrationKt;
        switch (this.f23235a) {
            case 0:
                defaultKeySelector$lambda$0$FlowKt__DistinctKt = FlowKt__DistinctKt.defaultKeySelector$lambda$0$FlowKt__DistinctKt(obj);
                return defaultKeySelector$lambda$0$FlowKt__DistinctKt;
            default:
                onErrorReturn$lambda$0$FlowKt__MigrationKt = FlowKt__MigrationKt.onErrorReturn$lambda$0$FlowKt__MigrationKt((Throwable) obj);
                return Boolean.valueOf(onErrorReturn$lambda$0$FlowKt__MigrationKt);
        }
    }
}
