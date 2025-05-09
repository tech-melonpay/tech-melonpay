package m8;

import F8.o;
import O9.p;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import ca.InterfaceC0635a;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.luminary.business.presentation.ui.activity.splash.SplashActivity;
import com.luminary.mobile.R;
import t6.AbstractC1339g2;
import t6.AbstractC1448u2;
import v8.DialogC1549a;

/* compiled from: PasscodeDialog.kt */
/* loaded from: classes2.dex */
public final class b extends DialogC1549a {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f24014q = 0;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0635a f24015r;

    /* renamed from: s, reason: collision with root package name */
    public final F0.f f24016s;

    public b(SplashActivity splashActivity) {
        super(splashActivity);
        LayoutInflater from = LayoutInflater.from(splashActivity);
        int i = AbstractC1448u2.f29648o;
        DataBinderMapperImpl dataBinderMapperImpl = F0.d.f1140a;
        AbstractC1448u2 abstractC1448u2 = (AbstractC1448u2) F0.f.f(from, R.layout.dialog_version, null, false, null);
        this.f24016s = abstractC1448u2;
        setCancelable(false);
        setContentView(abstractC1448u2.f1148d);
        setCanceledOnTouchOutside(false);
    }

    @Override // com.google.android.material.bottomsheet.e, h.DialogC0783j, c.DialogC0616g, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        switch (this.f24014q) {
            case 0:
                super.onCreate(bundle);
                RequestBuilder<Drawable> load = Glide.with(getContext()).load("file:///android_asset/passcode.gif");
                AbstractC1339g2 abstractC1339g2 = (AbstractC1339g2) this.f24016s;
                load.into(abstractC1339g2.f29020p);
                final int i = 0;
                o.c(abstractC1339g2.f29018n, 500L, new InterfaceC0635a(this) { // from class: m8.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f24013b;

                    {
                        this.f24013b = this;
                    }

                    @Override // ca.InterfaceC0635a
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                this.f24013b.dismiss();
                                break;
                            default:
                                b bVar = this.f24013b;
                                bVar.dismiss();
                                bVar.f24015r.invoke();
                                break;
                        }
                        return p.f3034a;
                    }
                });
                final int i9 = 1;
                o.c(abstractC1339g2.f29019o, 500L, new InterfaceC0635a(this) { // from class: m8.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f24013b;

                    {
                        this.f24013b = this;
                    }

                    @Override // ca.InterfaceC0635a
                    public final Object invoke() {
                        switch (i9) {
                            case 0:
                                this.f24013b.dismiss();
                                break;
                            default:
                                b bVar = this.f24013b;
                                bVar.dismiss();
                                bVar.f24015r.invoke();
                                break;
                        }
                        return p.f3034a;
                    }
                });
                break;
            default:
                j().setState(3);
                super.onCreate(bundle);
                o.c(((AbstractC1448u2) this.f24016s).f29649n, 500L, new g8.g(this, 26));
                break;
        }
    }

    public b(Context context, e eVar) {
        super(context, R.style.MyBottomSheetDialogTheme);
        this.f24015r = eVar;
        LayoutInflater from = LayoutInflater.from(context);
        int i = AbstractC1339g2.f29017q;
        DataBinderMapperImpl dataBinderMapperImpl = F0.d.f1140a;
        AbstractC1339g2 abstractC1339g2 = (AbstractC1339g2) F0.f.f(from, R.layout.dialog_passcode, null, false, null);
        this.f24016s = abstractC1339g2;
        setContentView(abstractC1339g2.f1148d);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        j().setHideable(true);
    }
}
