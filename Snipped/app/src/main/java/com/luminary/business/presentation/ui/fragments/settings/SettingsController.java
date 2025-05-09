package com.luminary.business.presentation.ui.fragments.settings;

import B7.f;
import D9.b;
import I5.k;
import J7.a;
import O9.p;
import P9.m;
import android.content.Context;
import android.view.View;
import android.widget.Switch;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.Typed4EpoxyController;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import com.luminary.business.presentation.ui.fragments.settings.SettingsController;
import com.luminary.mobile.R;
import java.util.List;
import java.util.Locale;
import kotlin.Triple;
import s6.C1220i;
import s6.K;
import s6.X;
import s6.d0;
import s6.e0;
import s6.f0;
import s6.g0;
import v6.C1546a;

/* compiled from: SettingsController.kt */
/* loaded from: classes2.dex */
public final class SettingsController extends Typed4EpoxyController<Triple<? extends k, ? extends CorporateDetailsDomain, ? extends String>, CorporateDetailsDomain, List<? extends C1546a>, Integer> {
    private final Context context;
    private final InterfaceC0646l<String, p> onClick;
    private final InterfaceC0635a<p> onClickLogout;
    private final InterfaceC0635a<Object> onPhotoClick;
    private final InterfaceC0650p<Integer, Boolean, p> onSwitch;
    private final TabLayout.d tabChangeListener;

    /* JADX WARN: Multi-variable type inference failed */
    public SettingsController(Context context, TabLayout.d dVar, InterfaceC0646l<? super String, p> interfaceC0646l, InterfaceC0635a<p> interfaceC0635a, InterfaceC0650p<? super Integer, ? super Boolean, p> interfaceC0650p, InterfaceC0635a<? extends Object> interfaceC0635a2) {
        this.context = context;
        this.tabChangeListener = dVar;
        this.onClick = interfaceC0646l;
        this.onClickLogout = interfaceC0635a;
        this.onSwitch = interfaceC0650p;
        this.onPhotoClick = interfaceC0635a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$11$lambda$9$lambda$8(SettingsController settingsController, View view) {
        InterfaceC0635a<Object> interfaceC0635a = settingsController.onPhotoClick;
        if (interfaceC0635a != null) {
            interfaceC0635a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$15$lambda$14$lambda$12(C1546a c1546a, SettingsController settingsController, View view) {
        if (c1546a.f30658f) {
            settingsController.onClick.invoke(c1546a.f30653a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$15$lambda$14$lambda$13(SettingsController settingsController, View view) {
        InterfaceC0650p<Integer, Boolean, p> interfaceC0650p = settingsController.onSwitch;
        if (interfaceC0650p != null) {
            interfaceC0650p.invoke(2, Boolean.valueOf(((Switch) view).isChecked()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$17$lambda$16(SettingsController settingsController, View view) {
        settingsController.onClickLogout.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$2$lambda$1$lambda$0(SettingsController settingsController, int i, g0 g0Var, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i9) {
        TabLayout tabLayout = (TabLayout) dataBindingHolder.getDataBinding().f1148d.findViewById(R.id.tab_home);
        tabLayout.a(settingsController.tabChangeListener);
        TabLayout.g h9 = tabLayout.h(i);
        if (h9 != null) {
            h9.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$7$lambda$6$lambda$4$lambda$3(SettingsController settingsController, View view) {
        InterfaceC0635a<Object> interfaceC0635a = settingsController.onPhotoClick;
        if (interfaceC0635a != null) {
            interfaceC0635a.invoke();
        }
    }

    @Override // com.airbnb.epoxy.Typed4EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(Triple<? extends k, ? extends CorporateDetailsDomain, ? extends String> triple, CorporateDetailsDomain corporateDetailsDomain, List<? extends C1546a> list, Integer num) {
        buildModels2((Triple<k, CorporateDetailsDomain, String>) triple, corporateDetailsDomain, (List<C1546a>) list, num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [m8.c] */
    /* JADX WARN: Type inference failed for: r11v2, types: [m8.c] */
    /* JADX WARN: Type inference failed for: r12v6, types: [m8.c] */
    /* JADX WARN: Type inference failed for: r1v3, types: [m8.c] */
    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(Triple<k, CorporateDetailsDomain, String> triple, CorporateDetailsDomain corporateDetailsDomain, List<C1546a> list, Integer num) {
        CorporateDetailsDomain.a aVar;
        if (num != null) {
            int intValue = num.intValue();
            g0 g0Var = new g0();
            g0Var.a();
            g0Var.b(new a(intValue, 5, this));
            add(g0Var);
        }
        if (num != null && num.intValue() == 0) {
            if (triple != null) {
                k kVar = triple.f23099a;
                d0 d0Var = new d0();
                d0Var.b();
                d0Var.d(b.K(kVar));
                String str = kVar.i;
                String upperCase = str != null ? String.valueOf(str.charAt(0)).toUpperCase(Locale.ROOT) : "";
                String str2 = kVar.f1830j;
                d0Var.h(upperCase.concat(str2 != null ? String.valueOf(str2.charAt(0)).toUpperCase(Locale.ROOT) : ""));
                CorporateDetailsDomain.a aVar2 = triple.f23100b.f10804a;
                d0Var.a(aVar2 != null ? aVar2.f10937z : null);
                String str3 = kVar.W;
                d0Var.f(str3);
                d0Var.c(Boolean.valueOf(str3 != null));
                d0Var.g(triple.f23101c);
                final int i = 0;
                d0Var.e(new View.OnClickListener(this) { // from class: m8.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ SettingsController f24018b;

                    {
                        this.f24018b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i) {
                            case 0:
                                SettingsController.buildModels$lambda$7$lambda$6$lambda$4$lambda$3(this.f24018b, view);
                                break;
                            case 1:
                                SettingsController.buildModels$lambda$11$lambda$9$lambda$8(this.f24018b, view);
                                break;
                            case 2:
                                SettingsController.buildModels$lambda$15$lambda$14$lambda$13(this.f24018b, view);
                                break;
                            default:
                                SettingsController.buildModels$lambda$17$lambda$16(this.f24018b, view);
                                break;
                        }
                    }
                });
                add(d0Var);
                X x9 = new X();
                x9.b();
                x9.a(this.context.getString(R.string.personal_details));
                x9.d(this.context.getString(R.string.full_name));
                x9.h(b.K(kVar));
                x9.e(this.context.getString(R.string.email));
                x9.i(kVar.f1817c);
                x9.f(this.context.getString(R.string.phone_number));
                x9.j("+" + kVar.f1821e + kVar.f1823f);
                x9.g(this.context.getString(R.string.address));
                x9.k(b.s(kVar));
                x9.c();
                add(x9);
                return;
            }
            return;
        }
        if (num != null && num.intValue() == 1) {
            if (corporateDetailsDomain == null || (aVar = corporateDetailsDomain.f10804a) == null) {
                return;
            }
            e0 e0Var = new e0();
            e0Var.b();
            String str4 = aVar.f10937z;
            e0Var.d(str4);
            e0Var.g(b.U(str4));
            String str5 = aVar.f10861A;
            e0Var.a(str5);
            String str6 = aVar.W;
            e0Var.f(str6);
            e0Var.c(Boolean.valueOf(str6 != null));
            final int i9 = 1;
            e0Var.e(new View.OnClickListener(this) { // from class: m8.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SettingsController f24018b;

                {
                    this.f24018b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i9) {
                        case 0:
                            SettingsController.buildModels$lambda$7$lambda$6$lambda$4$lambda$3(this.f24018b, view);
                            break;
                        case 1:
                            SettingsController.buildModels$lambda$11$lambda$9$lambda$8(this.f24018b, view);
                            break;
                        case 2:
                            SettingsController.buildModels$lambda$15$lambda$14$lambda$13(this.f24018b, view);
                            break;
                        default:
                            SettingsController.buildModels$lambda$17$lambda$16(this.f24018b, view);
                            break;
                    }
                }
            });
            add(e0Var);
            C1220i c1220i = new C1220i();
            c1220i.b();
            c1220i.a(this.context.getString(R.string.company_details));
            c1220i.d(this.context.getString(R.string.company_name));
            c1220i.i(str4);
            c1220i.e(this.context.getString(R.string.company_number));
            c1220i.j(str5);
            c1220i.f(this.context.getString(R.string.email));
            c1220i.k(aVar.f10893c);
            c1220i.g(this.context.getString(R.string.phone_number));
            c1220i.l("+" + aVar.f10897e + aVar.f10899f);
            c1220i.h(this.context.getString(R.string.address));
            c1220i.m(aVar.a());
            c1220i.c();
            add(c1220i);
            return;
        }
        if (num != null && num.intValue() == 2) {
            if (list != null) {
                int i10 = 0;
                for (Object obj : list) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        m.t();
                        throw null;
                    }
                    C1546a c1546a = (C1546a) obj;
                    f0 f0Var = new f0();
                    f0Var.e("settings_" + c1546a.f30653a);
                    f0Var.h(c1546a.f30653a);
                    String str7 = c1546a.f30654b;
                    f0Var.a(str7);
                    f0Var.c(Boolean.valueOf(!(str7 == null || str7.length() == 0)));
                    f0Var.b(Boolean.valueOf(c1546a.f30655c));
                    f0Var.d(Boolean.valueOf(c1546a.f30656d));
                    f0Var.f(c1546a.f30657e);
                    f0Var.g(Boolean.valueOf(c1546a.f30658f));
                    f0Var.i(new f(26, c1546a, this));
                    final int i12 = 2;
                    f0Var.j(new View.OnClickListener(this) { // from class: m8.c

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ SettingsController f24018b;

                        {
                            this.f24018b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    SettingsController.buildModels$lambda$7$lambda$6$lambda$4$lambda$3(this.f24018b, view);
                                    break;
                                case 1:
                                    SettingsController.buildModels$lambda$11$lambda$9$lambda$8(this.f24018b, view);
                                    break;
                                case 2:
                                    SettingsController.buildModels$lambda$15$lambda$14$lambda$13(this.f24018b, view);
                                    break;
                                default:
                                    SettingsController.buildModels$lambda$17$lambda$16(this.f24018b, view);
                                    break;
                            }
                        }
                    });
                    add(f0Var);
                    i10 = i11;
                }
            }
            K k3 = new K();
            k3.a();
            final int i13 = 3;
            k3.b(new View.OnClickListener(this) { // from class: m8.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SettingsController f24018b;

                {
                    this.f24018b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            SettingsController.buildModels$lambda$7$lambda$6$lambda$4$lambda$3(this.f24018b, view);
                            break;
                        case 1:
                            SettingsController.buildModels$lambda$11$lambda$9$lambda$8(this.f24018b, view);
                            break;
                        case 2:
                            SettingsController.buildModels$lambda$15$lambda$14$lambda$13(this.f24018b, view);
                            break;
                        default:
                            SettingsController.buildModels$lambda$17$lambda$16(this.f24018b, view);
                            break;
                    }
                }
            });
            add(k3);
        }
    }
}
