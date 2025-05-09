package y8;

import F8.o;
import O9.p;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.mobile.R;
import t6.AbstractC1315d2;
import v8.DialogC1549a;

/* compiled from: TextInputDialog.kt */
/* renamed from: y8.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogC1630k extends DialogC1549a {

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC1315d2 f31148q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0646l<? super String, p> f31149r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC0635a<? extends Object> f31150s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC1630k(Context context) {
        super(context);
        final int i = 1;
        final int i9 = 0;
        LayoutInflater from = LayoutInflater.from(context);
        int i10 = AbstractC1315d2.f28919r;
        DataBinderMapperImpl dataBinderMapperImpl = F0.d.f1140a;
        AbstractC1315d2 abstractC1315d2 = (AbstractC1315d2) F0.f.f(from, R.layout.dialog_input_text, null, false, null);
        this.f31148q = abstractC1315d2;
        setCancelable(false);
        setContentView(abstractC1315d2.f1148d);
        setCanceledOnTouchOutside(false);
        j().setHideable(true);
        o.c(abstractC1315d2.f28920n, 500L, new InterfaceC0635a(this) { // from class: y8.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DialogC1630k f31147b;

            {
                this.f31147b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        DialogC1630k dialogC1630k = this.f31147b;
                        InterfaceC0646l<? super String, p> interfaceC0646l = dialogC1630k.f31149r;
                        if (interfaceC0646l != null) {
                            interfaceC0646l.invoke(String.valueOf(dialogC1630k.f31148q.f28923q.getText()));
                        }
                        break;
                    default:
                        DialogC1630k dialogC1630k2 = this.f31147b;
                        InterfaceC0635a<? extends Object> interfaceC0635a = dialogC1630k2.f31150s;
                        if (interfaceC0635a != null) {
                            interfaceC0635a.invoke();
                        }
                        dialogC1630k2.dismiss();
                        break;
                }
                return p.f3034a;
            }
        });
        o.c(abstractC1315d2.f28921o, 500L, new InterfaceC0635a(this) { // from class: y8.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DialogC1630k f31147b;

            {
                this.f31147b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        DialogC1630k dialogC1630k = this.f31147b;
                        InterfaceC0646l<? super String, p> interfaceC0646l = dialogC1630k.f31149r;
                        if (interfaceC0646l != null) {
                            interfaceC0646l.invoke(String.valueOf(dialogC1630k.f31148q.f28923q.getText()));
                        }
                        break;
                    default:
                        DialogC1630k dialogC1630k2 = this.f31147b;
                        InterfaceC0635a<? extends Object> interfaceC0635a = dialogC1630k2.f31150s;
                        if (interfaceC0635a != null) {
                            interfaceC0635a.invoke();
                        }
                        dialogC1630k2.dismiss();
                        break;
                }
                return p.f3034a;
            }
        });
        abstractC1315d2.f28922p.setOnClickListener(new J7.b(this, 26));
    }

    @Override // com.google.android.material.bottomsheet.e, h.DialogC0783j, c.DialogC0616g, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j().setState(3);
    }
}
