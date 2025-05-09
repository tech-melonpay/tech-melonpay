package B9;

import android.util.Size;
import com.luminary.business.domain.entity.cryptowallet.CryptowalletDomain;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list.CryptoListController;
import java.io.File;
import java.util.Comparator;
import w0.C1563b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f462a;

    public /* synthetic */ a(int i) {
        this.f462a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int buildModels$lambda$5;
        switch (this.f462a) {
            case 0:
                return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
            case 1:
                return com.sumsub.sns.internal.ml.facedetector.utils.b.a((com.sumsub.sns.internal.ml.facedetector.models.c) obj, (com.sumsub.sns.internal.ml.facedetector.models.c) obj2);
            case 2:
                return com.sumsub.sns.internal.ml.facedetector.utils.b.b((com.sumsub.sns.internal.ml.facedetector.models.c) obj, (com.sumsub.sns.internal.ml.facedetector.models.c) obj2);
            case 3:
                buildModels$lambda$5 = CryptoListController.buildModels$lambda$5((CryptowalletDomain.WalletStatus) obj, (CryptowalletDomain.WalletStatus) obj2);
                return buildModels$lambda$5;
            case 4:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
            case 5:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b9 = bArr[i];
                    byte b10 = bArr2[i];
                    if (b9 != b10) {
                        return b9 - b10;
                    }
                }
                return 0;
            default:
                C1563b.a aVar = (C1563b.a) obj;
                C1563b.a aVar2 = (C1563b.a) obj2;
                int i9 = aVar.f30808c;
                int i10 = aVar2.f30808c;
                if (i9 < i10) {
                    return -1;
                }
                if (i9 > i10) {
                    return 1;
                }
                return Integer.compare(aVar2.f30809d, aVar.f30809d);
        }
    }
}
