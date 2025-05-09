package Qa;

/* compiled from: Block.java */
/* loaded from: classes3.dex */
public abstract class a extends r {
    @Override // Qa.r
    public final r c() {
        return (a) this.f3227a;
    }

    @Override // Qa.r
    public final void d(r rVar) {
        if (!(rVar instanceof a)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        this.f3227a = rVar;
    }
}
