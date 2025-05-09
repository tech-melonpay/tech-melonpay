package com.sumsub.sns.internal.ml.core.pipeline.core;

/* loaded from: classes2.dex */
public final class a<Input, Output> {

    /* renamed from: a, reason: collision with root package name */
    public final b<Input, Output> f17689a;

    /* JADX INFO: Add missing generic type declarations: [NewOutput] */
    /* renamed from: com.sumsub.sns.internal.ml.core.pipeline.core.a$a, reason: collision with other inner class name */
    public static final class C0278a<NewOutput> implements b<Input, NewOutput> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b<Output, NewOutput> f17690a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a<Input, Output> f17691b;

        public C0278a(b<Output, NewOutput> bVar, a<Input, Output> aVar) {
            this.f17690a = bVar;
            this.f17691b = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.sumsub.sns.internal.ml.core.pipeline.core.b
        public NewOutput a(Input input) {
            return (NewOutput) this.f17690a.a(this.f17691b.f17689a.a(input));
        }
    }

    public a(b<Input, Output> bVar) {
        this.f17689a = bVar;
    }

    public final <NewOutput> a<Input, NewOutput> a(b<Output, NewOutput> bVar) {
        return new a<>(new C0278a(bVar, this));
    }

    public final Output a(Input input) {
        return this.f17689a.a(input);
    }
}
