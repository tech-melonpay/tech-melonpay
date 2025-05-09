package com.luminary.business.presentation.ui.fragments.createnewaccount;

import O9.p;
import android.content.Context;
import android.view.View;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.TypedEpoxyController;
import com.luminary.business.presentation.ui.fragments.createnewaccount.CreateNewAccountController;
import com.luminary.mobile.R;
import kotlin.jvm.internal.f;
import s6.Q;

/* compiled from: CreateNewAccountController.kt */
/* loaded from: classes2.dex */
public final class CreateNewAccountController extends TypedEpoxyController<String> {
    private final Context context;
    private final InterfaceC0646l<String, p> onAccountClick;

    /* JADX WARN: Multi-variable type inference failed */
    public CreateNewAccountController(Context context, InterfaceC0646l<? super String, p> interfaceC0646l) {
        this.context = context;
        this.onAccountClick = interfaceC0646l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$1$lambda$0(CreateNewAccountController createNewAccountController, View view) {
        InterfaceC0646l<String, p> interfaceC0646l = createNewAccountController.onAccountClick;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke("gbp");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$3$lambda$2(CreateNewAccountController createNewAccountController, View view) {
        InterfaceC0646l<String, p> interfaceC0646l = createNewAccountController.onAccountClick;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke("eur");
        }
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(String str) {
        Q q10 = new Q();
        q10.a("gbp");
        String string = this.context.getString(R.string.gbp);
        q10.onMutation();
        q10.f26718a = string;
        String string2 = this.context.getString(R.string.british_pound);
        q10.onMutation();
        q10.f26720c = string2;
        Integer valueOf = Integer.valueOf(R.drawable.ic_gb);
        q10.onMutation();
        q10.f26721d = valueOf;
        Boolean valueOf2 = Boolean.valueOf(f.b(str, "gbp"));
        q10.onMutation();
        q10.f26719b = valueOf2;
        final int i = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: f7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateNewAccountController f20705b;

            {
                this.f20705b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        CreateNewAccountController.buildModels$lambda$1$lambda$0(this.f20705b, view);
                        break;
                    default:
                        CreateNewAccountController.buildModels$lambda$3$lambda$2(this.f20705b, view);
                        break;
                }
            }
        };
        q10.onMutation();
        q10.f26722e = onClickListener;
        add(q10);
        Q q11 = new Q();
        q11.a("eur");
        String string3 = this.context.getString(R.string.eur);
        q11.onMutation();
        q11.f26718a = string3;
        String string4 = this.context.getString(R.string.euro);
        q11.onMutation();
        q11.f26720c = string4;
        Integer valueOf3 = Integer.valueOf(R.drawable.ic_euro);
        q11.onMutation();
        q11.f26721d = valueOf3;
        Boolean valueOf4 = Boolean.valueOf(f.b(str, "eur"));
        q11.onMutation();
        q11.f26719b = valueOf4;
        final int i9 = 1;
        View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: f7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateNewAccountController f20705b;

            {
                this.f20705b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        CreateNewAccountController.buildModels$lambda$1$lambda$0(this.f20705b, view);
                        break;
                    default:
                        CreateNewAccountController.buildModels$lambda$3$lambda$2(this.f20705b, view);
                        break;
                }
            }
        };
        q11.onMutation();
        q11.f26722e = onClickListener2;
        add(q11);
    }
}
