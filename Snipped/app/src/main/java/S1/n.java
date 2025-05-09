package S1;

import O9.p;
import androidx.recyclerview.widget.q;

/* compiled from: TransactionDiffCallback.kt */
/* loaded from: classes.dex */
public final class n extends q.e<com.chuckerteam.chucker.internal.data.entity.a> {

    /* renamed from: a, reason: collision with root package name */
    public static final n f3363a = new n();

    @Override // androidx.recyclerview.widget.q.e
    public final boolean areContentsTheSame(com.chuckerteam.chucker.internal.data.entity.a aVar, com.chuckerteam.chucker.internal.data.entity.a aVar2) {
        return kotlin.jvm.internal.f.b(aVar, aVar2);
    }

    @Override // androidx.recyclerview.widget.q.e
    public final boolean areItemsTheSame(com.chuckerteam.chucker.internal.data.entity.a aVar, com.chuckerteam.chucker.internal.data.entity.a aVar2) {
        return aVar.f8608a == aVar2.f8608a;
    }

    @Override // androidx.recyclerview.widget.q.e
    public final /* bridge */ /* synthetic */ Object getChangePayload(com.chuckerteam.chucker.internal.data.entity.a aVar, com.chuckerteam.chucker.internal.data.entity.a aVar2) {
        return p.f3034a;
    }
}
