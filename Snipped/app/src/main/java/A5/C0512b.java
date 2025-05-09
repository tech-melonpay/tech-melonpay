package a5;

import C.N;
import O9.p;
import android.content.Context;
import androidx.fragment.app.ActivityC0533g;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.utils.kyc.KycStatus;
import com.sumsub.sns.core.SNSMobileSDK;
import com.sumsub.sns.core.data.listener.TokenExpirationHandler;
import java.util.Locale;

/* compiled from: SumSubManagerImpl.kt */
/* renamed from: a5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0512b implements I8.b {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0646l<? super KycStatus, p> f4450a;

    /* renamed from: b, reason: collision with root package name */
    public final a f4451b = new a();

    /* compiled from: SumSubManagerImpl.kt */
    /* renamed from: a5.b$a */
    public static final class a implements TokenExpirationHandler {
        @Override // com.sumsub.sns.core.data.listener.TokenExpirationHandler
        public final String onTokenExpired() {
            return null;
        }
    }

    public C0512b(Context context) {
    }

    @Override // I8.b
    public final void a(ActivityC0533g activityC0533g, String str, com.luminary.business.presentation.ui.fragments.auth.kyc.a aVar) {
        this.f4450a = aVar;
        new SNSMobileSDK.Builder(activityC0533g).withAccessToken(str, this.f4451b).withCompleteHandler(new N(this, 10)).withLocale(new Locale("en")).build().launch();
    }
}
