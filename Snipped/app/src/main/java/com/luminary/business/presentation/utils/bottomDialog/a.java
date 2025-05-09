package com.luminary.business.presentation.utils.bottomDialog;

import F0.d;
import F0.f;
import F8.o;
import J8.a;
import O9.p;
import android.content.Context;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import ca.InterfaceC0635a;
import com.luminary.mobile.R;
import t6.AbstractC1344h;
import v8.DialogC1549a;

/* compiled from: BottomDialogView.kt */
/* loaded from: classes2.dex */
public final class a extends DialogC1549a {

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC1344h f13312q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0635a<? extends Object> f13313r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC0635a<? extends Object> f13314s;

    /* compiled from: BottomDialogView.kt */
    /* renamed from: com.luminary.business.presentation.utils.bottomDialog.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0139a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13315a;

        static {
            int[] iArr = new int[BottomDialogType.values().length];
            try {
                iArr[BottomDialogType.error.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BottomDialogType.success.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BottomDialogType.questions.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13315a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        final int i = 0;
        LayoutInflater from = LayoutInflater.from(context);
        int i9 = AbstractC1344h.f29032u;
        DataBinderMapperImpl dataBinderMapperImpl = d.f1140a;
        AbstractC1344h abstractC1344h = (AbstractC1344h) f.f(from, R.layout.bottom_dialog, null, false, null);
        this.f13312q = abstractC1344h;
        setCancelable(false);
        setContentView(abstractC1344h.f1148d);
        setCanceledOnTouchOutside(false);
        o.c(abstractC1344h.f29035p, 500L, new InterfaceC0635a(this) { // from class: D8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.luminary.business.presentation.utils.bottomDialog.a f979b;

            {
                this.f979b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        com.luminary.business.presentation.utils.bottomDialog.a aVar = this.f979b;
                        InterfaceC0635a<? extends Object> interfaceC0635a = aVar.f13313r;
                        if (interfaceC0635a != null) {
                            interfaceC0635a.invoke();
                        }
                        aVar.dismiss();
                        break;
                    case 1:
                        com.luminary.business.presentation.utils.bottomDialog.a aVar2 = this.f979b;
                        InterfaceC0635a<? extends Object> interfaceC0635a2 = aVar2.f13313r;
                        if (interfaceC0635a2 != null) {
                            interfaceC0635a2.invoke();
                        }
                        aVar2.dismiss();
                        break;
                    case 2:
                        com.luminary.business.presentation.utils.bottomDialog.a aVar3 = this.f979b;
                        InterfaceC0635a<? extends Object> interfaceC0635a3 = aVar3.f13314s;
                        if (interfaceC0635a3 != null) {
                            interfaceC0635a3.invoke();
                        }
                        aVar3.dismiss();
                        break;
                    default:
                        com.luminary.business.presentation.utils.bottomDialog.a aVar4 = this.f979b;
                        InterfaceC0635a<? extends Object> interfaceC0635a4 = aVar4.f13314s;
                        if (interfaceC0635a4 != null) {
                            interfaceC0635a4.invoke();
                        }
                        aVar4.dismiss();
                        break;
                }
                return p.f3034a;
            }
        });
        final int i10 = 1;
        o.c(abstractC1344h.f29033n, 500L, new InterfaceC0635a(this) { // from class: D8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.luminary.business.presentation.utils.bottomDialog.a f979b;

            {
                this.f979b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        com.luminary.business.presentation.utils.bottomDialog.a aVar = this.f979b;
                        InterfaceC0635a<? extends Object> interfaceC0635a = aVar.f13313r;
                        if (interfaceC0635a != null) {
                            interfaceC0635a.invoke();
                        }
                        aVar.dismiss();
                        break;
                    case 1:
                        com.luminary.business.presentation.utils.bottomDialog.a aVar2 = this.f979b;
                        InterfaceC0635a<? extends Object> interfaceC0635a2 = aVar2.f13313r;
                        if (interfaceC0635a2 != null) {
                            interfaceC0635a2.invoke();
                        }
                        aVar2.dismiss();
                        break;
                    case 2:
                        com.luminary.business.presentation.utils.bottomDialog.a aVar3 = this.f979b;
                        InterfaceC0635a<? extends Object> interfaceC0635a3 = aVar3.f13314s;
                        if (interfaceC0635a3 != null) {
                            interfaceC0635a3.invoke();
                        }
                        aVar3.dismiss();
                        break;
                    default:
                        com.luminary.business.presentation.utils.bottomDialog.a aVar4 = this.f979b;
                        InterfaceC0635a<? extends Object> interfaceC0635a4 = aVar4.f13314s;
                        if (interfaceC0635a4 != null) {
                            interfaceC0635a4.invoke();
                        }
                        aVar4.dismiss();
                        break;
                }
                return p.f3034a;
            }
        });
        final int i11 = 2;
        o.c(abstractC1344h.f29034o, 500L, new InterfaceC0635a(this) { // from class: D8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.luminary.business.presentation.utils.bottomDialog.a f979b;

            {
                this.f979b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        com.luminary.business.presentation.utils.bottomDialog.a aVar = this.f979b;
                        InterfaceC0635a<? extends Object> interfaceC0635a = aVar.f13313r;
                        if (interfaceC0635a != null) {
                            interfaceC0635a.invoke();
                        }
                        aVar.dismiss();
                        break;
                    case 1:
                        com.luminary.business.presentation.utils.bottomDialog.a aVar2 = this.f979b;
                        InterfaceC0635a<? extends Object> interfaceC0635a2 = aVar2.f13313r;
                        if (interfaceC0635a2 != null) {
                            interfaceC0635a2.invoke();
                        }
                        aVar2.dismiss();
                        break;
                    case 2:
                        com.luminary.business.presentation.utils.bottomDialog.a aVar3 = this.f979b;
                        InterfaceC0635a<? extends Object> interfaceC0635a3 = aVar3.f13314s;
                        if (interfaceC0635a3 != null) {
                            interfaceC0635a3.invoke();
                        }
                        aVar3.dismiss();
                        break;
                    default:
                        com.luminary.business.presentation.utils.bottomDialog.a aVar4 = this.f979b;
                        InterfaceC0635a<? extends Object> interfaceC0635a4 = aVar4.f13314s;
                        if (interfaceC0635a4 != null) {
                            interfaceC0635a4.invoke();
                        }
                        aVar4.dismiss();
                        break;
                }
                return p.f3034a;
            }
        });
        final int i12 = 3;
        o.c(abstractC1344h.f29037r, 500L, new InterfaceC0635a(this) { // from class: D8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.luminary.business.presentation.utils.bottomDialog.a f979b;

            {
                this.f979b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        com.luminary.business.presentation.utils.bottomDialog.a aVar = this.f979b;
                        InterfaceC0635a<? extends Object> interfaceC0635a = aVar.f13313r;
                        if (interfaceC0635a != null) {
                            interfaceC0635a.invoke();
                        }
                        aVar.dismiss();
                        break;
                    case 1:
                        com.luminary.business.presentation.utils.bottomDialog.a aVar2 = this.f979b;
                        InterfaceC0635a<? extends Object> interfaceC0635a2 = aVar2.f13313r;
                        if (interfaceC0635a2 != null) {
                            interfaceC0635a2.invoke();
                        }
                        aVar2.dismiss();
                        break;
                    case 2:
                        com.luminary.business.presentation.utils.bottomDialog.a aVar3 = this.f979b;
                        InterfaceC0635a<? extends Object> interfaceC0635a3 = aVar3.f13314s;
                        if (interfaceC0635a3 != null) {
                            interfaceC0635a3.invoke();
                        }
                        aVar3.dismiss();
                        break;
                    default:
                        com.luminary.business.presentation.utils.bottomDialog.a aVar4 = this.f979b;
                        InterfaceC0635a<? extends Object> interfaceC0635a4 = aVar4.f13314s;
                        if (interfaceC0635a4 != null) {
                            interfaceC0635a4.invoke();
                        }
                        aVar4.dismiss();
                        break;
                }
                return p.f3034a;
            }
        });
    }

    @Override // c.DialogC0616g, J8.a.b
    public final void a() {
        dismiss();
    }

    @Override // v8.DialogC1549a, com.google.android.material.bottomsheet.e, android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a.C0028a.a().f2199d.add(this);
    }

    @Override // v8.DialogC1549a, com.google.android.material.bottomsheet.e, android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        a.C0028a.a().f2199d.remove(this);
        super.onDetachedFromWindow();
    }

    @Override // h.DialogC0783j, c.DialogC0616g, android.app.Dialog
    public final void onStop() {
        super.onStop();
    }

    @Override // v8.DialogC1549a, J8.a.b
    public final void b() {
    }
}
