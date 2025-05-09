package com.google.firebase.components;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ComponentFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10278a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10279b;

    public /* synthetic */ a(Object obj, int i) {
        this.f10278a = i;
        this.f10279b = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        Object lambda$intoSet$2;
        Object lambda$of$0;
        Object lambda$of$1;
        switch (this.f10278a) {
            case 0:
                lambda$intoSet$2 = Component.lambda$intoSet$2(this.f10279b, componentContainer);
                return lambda$intoSet$2;
            case 1:
                lambda$of$0 = Component.lambda$of$0(this.f10279b, componentContainer);
                return lambda$of$0;
            default:
                lambda$of$1 = Component.lambda$of$1(this.f10279b, componentContainer);
                return lambda$of$1;
        }
    }
}
