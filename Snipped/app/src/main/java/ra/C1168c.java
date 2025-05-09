package ra;

/* compiled from: CollectionDescriptors.kt */
/* renamed from: ra.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1168c extends L {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26384c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1168c(pa.f fVar, int i) {
        super(fVar);
        this.f26384c = i;
    }

    @Override // pa.f
    public final String a() {
        switch (this.f26384c) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
