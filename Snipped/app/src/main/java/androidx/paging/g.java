package androidx.paging;

import androidx.paging.c;
import androidx.paging.f;
import java.util.List;
import p.InterfaceC1096a;

/* compiled from: WrapperPositionalDataSource.java */
/* loaded from: classes.dex */
public final class g<A, B> extends f<B> {

    /* renamed from: a, reason: collision with root package name */
    public final f<A> f7368a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1096a<List<A>, List<B>> f7369b;

    /* compiled from: WrapperPositionalDataSource.java */
    public class a extends f.b<A> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f.b f7370a;

        public a(f.b bVar) {
            this.f7370a = bVar;
        }

        @Override // androidx.paging.f.b
        public final void a(List<A> list, int i, int i9) {
            this.f7370a.a(c.convert(g.this.f7369b, list), i, i9);
        }
    }

    /* compiled from: WrapperPositionalDataSource.java */
    public class b extends f.e<A> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f.e f7372a;

        public b(f.e eVar) {
            this.f7372a = eVar;
        }

        @Override // androidx.paging.f.e
        public final void a(List<A> list) {
            this.f7372a.a(c.convert(g.this.f7369b, list));
        }
    }

    public g(f<A> fVar, InterfaceC1096a<List<A>, List<B>> interfaceC1096a) {
        this.f7368a = fVar;
        this.f7369b = interfaceC1096a;
    }

    @Override // androidx.paging.c
    public final void addInvalidatedCallback(c.b bVar) {
        this.f7368a.addInvalidatedCallback(bVar);
    }

    @Override // androidx.paging.c
    public final void invalidate() {
        this.f7368a.invalidate();
    }

    @Override // androidx.paging.c
    public final boolean isInvalid() {
        return this.f7368a.isInvalid();
    }

    @Override // androidx.paging.f
    public final void loadInitial(f.d dVar, f.b<B> bVar) {
        this.f7368a.loadInitial(dVar, new a(bVar));
    }

    @Override // androidx.paging.f
    public final void loadRange(f.g gVar, f.e<B> eVar) {
        this.f7368a.loadRange(gVar, new b(eVar));
    }

    @Override // androidx.paging.c
    public final void removeInvalidatedCallback(c.b bVar) {
        this.f7368a.removeInvalidatedCallback(bVar);
    }
}
