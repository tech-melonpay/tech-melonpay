package okhttp3.internal.cache;

import O9.p;
import ca.InterfaceC0646l;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import wa.b;

/* compiled from: DiskLruCache.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/IOException;", "it", "LO9/p;", "invoke", "(Ljava/io/IOException;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends Lambda implements InterfaceC0646l<IOException, p> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DiskLruCache f24589l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.f24589l = diskLruCache;
    }

    @Override // ca.InterfaceC0646l
    public final p invoke(IOException iOException) {
        byte[] bArr = b.f30872a;
        this.f24589l.f24561k = true;
        return p.f3034a;
    }
}
