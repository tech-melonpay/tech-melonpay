package com.luminary.business.presentation.ui.fragments.statements;

import C.v;
import F0.d;
import F8.o;
import O9.p;
import P9.m;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.databinding.DataBinderMapperImpl;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.mobile.R;
import g8.g;
import java.util.List;
import java.util.Locale;
import ka.C0967l;
import ka.C0969n;
import kotlin.jvm.internal.f;
import n8.e;
import s6.c0;
import s6.h0;
import s6.i0;
import s6.j0;
import s6.k0;
import s6.l0;
import t6.AbstractC1419q2;
import v8.DialogC1549a;

/* compiled from: StatementsSelectorDialog.kt */
/* loaded from: classes2.dex */
public final class StatementsSelectorDialog extends DialogC1549a {

    /* renamed from: q, reason: collision with root package name */
    public final DialogType f13036q;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC1419q2 f13037r;

    /* renamed from: s, reason: collision with root package name */
    public SelectorController f13038s;

    /* renamed from: t, reason: collision with root package name */
    public List<a> f13039t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0646l<? super String, p> f13040u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0646l<? super String, p> f13041v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC0646l<? super a, p> f13042w;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StatementsSelectorDialog.kt */
    public static final class DialogType {

        /* renamed from: a, reason: collision with root package name */
        public static final DialogType f13043a;

        /* renamed from: b, reason: collision with root package name */
        public static final DialogType f13044b;

        /* renamed from: c, reason: collision with root package name */
        public static final DialogType f13045c;

        /* renamed from: d, reason: collision with root package name */
        public static final DialogType f13046d;

        /* renamed from: e, reason: collision with root package name */
        public static final DialogType f13047e;

        /* renamed from: f, reason: collision with root package name */
        public static final DialogType f13048f;

        /* renamed from: g, reason: collision with root package name */
        public static final DialogType f13049g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ DialogType[] f13050h;

        static {
            DialogType dialogType = new DialogType("FILE", 0);
            f13043a = dialogType;
            DialogType dialogType2 = new DialogType("ACCOUNT", 1);
            DialogType dialogType3 = new DialogType("ACCOUNT_WITH_CURRENCY", 2);
            f13044b = dialogType3;
            DialogType dialogType4 = new DialogType("ACCOUNT_WITHOUT_CURRENCY", 3);
            f13045c = dialogType4;
            DialogType dialogType5 = new DialogType("CRYPTO", 4);
            f13046d = dialogType5;
            DialogType dialogType6 = new DialogType("CRYPTO_ACCOUNTS", 5);
            DialogType dialogType7 = new DialogType("WITHOUT_ICON", 6);
            f13047e = dialogType7;
            DialogType dialogType8 = new DialogType("VAULTS", 7);
            f13048f = dialogType8;
            DialogType dialogType9 = new DialogType("CARD", 8);
            f13049g = dialogType9;
            f13050h = new DialogType[]{dialogType, dialogType2, dialogType3, dialogType4, dialogType5, dialogType6, dialogType7, dialogType8, dialogType9};
        }

        public DialogType() {
            throw null;
        }

        public static DialogType valueOf(String str) {
            return (DialogType) Enum.valueOf(DialogType.class, str);
        }

        public static DialogType[] values() {
            return (DialogType[]) f13050h.clone();
        }
    }

    /* compiled from: StatementsSelectorDialog.kt */
    public static final class SelectorController extends Typed2EpoxyController<List<? extends a>, String> {
        private final Context context;
        private final InterfaceC0646l<String, p> onClick;
        private final InterfaceC0646l<String, p> onClickFullName;
        private final InterfaceC0646l<a, p> onSelectWithItem;
        private final DialogType type;

        /* compiled from: StatementsSelectorDialog.kt */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f13051a;

            static {
                int[] iArr = new int[DialogType.values().length];
                try {
                    DialogType dialogType = DialogType.f13043a;
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    DialogType dialogType2 = DialogType.f13043a;
                    iArr[4] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    DialogType dialogType3 = DialogType.f13043a;
                    iArr[5] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    DialogType dialogType4 = DialogType.f13043a;
                    iArr[2] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    DialogType dialogType5 = DialogType.f13043a;
                    iArr[3] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    DialogType dialogType6 = DialogType.f13043a;
                    iArr[7] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    DialogType dialogType7 = DialogType.f13043a;
                    iArr[8] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    DialogType dialogType8 = DialogType.f13043a;
                    iArr[0] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                f13051a = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SelectorController(DialogType dialogType, InterfaceC0646l<? super String, p> interfaceC0646l, InterfaceC0646l<? super String, p> interfaceC0646l2, InterfaceC0646l<? super a, p> interfaceC0646l3, Context context) {
            this.type = dialogType;
            this.onClick = interfaceC0646l;
            this.onClickFullName = interfaceC0646l2;
            this.onSelectWithItem = interfaceC0646l3;
            this.context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void buildModels$lambda$18$lambda$11$lambda$10(SelectorController selectorController, a aVar, View view) {
            InterfaceC0646l<a, p> interfaceC0646l = selectorController.onSelectWithItem;
            if (interfaceC0646l != null) {
                interfaceC0646l.invoke(aVar);
            }
            InterfaceC0646l<String, p> interfaceC0646l2 = selectorController.onClick;
            if (interfaceC0646l2 != null) {
                interfaceC0646l2.invoke(aVar.f13052a);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void buildModels$lambda$18$lambda$13$lambda$12(a aVar, SelectorController selectorController, View view) {
            if (aVar.i) {
                InterfaceC0646l<a, p> interfaceC0646l = selectorController.onSelectWithItem;
                if (interfaceC0646l != null) {
                    interfaceC0646l.invoke(aVar);
                }
                InterfaceC0646l<String, p> interfaceC0646l2 = selectorController.onClick;
                if (interfaceC0646l2 != null) {
                    interfaceC0646l2.invoke(aVar.f13052a);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void buildModels$lambda$18$lambda$15$lambda$14(SelectorController selectorController, a aVar, View view) {
            InterfaceC0646l<a, p> interfaceC0646l = selectorController.onSelectWithItem;
            if (interfaceC0646l != null) {
                interfaceC0646l.invoke(aVar);
            }
            InterfaceC0646l<String, p> interfaceC0646l2 = selectorController.onClick;
            if (interfaceC0646l2 != null) {
                interfaceC0646l2.invoke(aVar.f13052a);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void buildModels$lambda$18$lambda$17$lambda$16(a aVar, SelectorController selectorController, View view) {
            if (aVar.i) {
                InterfaceC0646l<a, p> interfaceC0646l = selectorController.onSelectWithItem;
                if (interfaceC0646l != null) {
                    interfaceC0646l.invoke(aVar);
                }
                InterfaceC0646l<String, p> interfaceC0646l2 = selectorController.onClick;
                if (interfaceC0646l2 != null) {
                    interfaceC0646l2.invoke(aVar.f13052a);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void buildModels$lambda$18$lambda$3$lambda$2(SelectorController selectorController, a aVar, View view) {
            InterfaceC0646l<a, p> interfaceC0646l = selectorController.onSelectWithItem;
            if (interfaceC0646l != null) {
                interfaceC0646l.invoke(aVar);
            }
            InterfaceC0646l<String, p> interfaceC0646l2 = selectorController.onClick;
            if (interfaceC0646l2 != null) {
                interfaceC0646l2.invoke(aVar.f13052a);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void buildModels$lambda$18$lambda$5$lambda$4(SelectorController selectorController, a aVar, View view) {
            InterfaceC0646l<a, p> interfaceC0646l = selectorController.onSelectWithItem;
            if (interfaceC0646l != null) {
                interfaceC0646l.invoke(aVar);
            }
            InterfaceC0646l<String, p> interfaceC0646l2 = selectorController.onClick;
            if (interfaceC0646l2 != null) {
                interfaceC0646l2.invoke(aVar.f13052a);
            }
            InterfaceC0646l<String, p> interfaceC0646l3 = selectorController.onClickFullName;
            if (interfaceC0646l3 != null) {
                interfaceC0646l3.invoke(aVar.f13053b);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void buildModels$lambda$18$lambda$7$lambda$6(SelectorController selectorController, a aVar, View view) {
            InterfaceC0646l<a, p> interfaceC0646l = selectorController.onSelectWithItem;
            if (interfaceC0646l != null) {
                interfaceC0646l.invoke(aVar);
            }
            InterfaceC0646l<String, p> interfaceC0646l2 = selectorController.onClick;
            if (interfaceC0646l2 != null) {
                String str = aVar.f13053b;
                int g02 = C0969n.g0(str, " ", 0, false, 6);
                if (g02 != -1) {
                    str = str.substring(0, g02);
                }
                interfaceC0646l2.invoke(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void buildModels$lambda$18$lambda$9$lambda$8(a aVar, SelectorController selectorController, View view) {
            if (aVar.i) {
                InterfaceC0646l<a, p> interfaceC0646l = selectorController.onSelectWithItem;
                if (interfaceC0646l != null) {
                    interfaceC0646l.invoke(aVar);
                }
                InterfaceC0646l<String, p> interfaceC0646l2 = selectorController.onClick;
                if (interfaceC0646l2 != null) {
                    interfaceC0646l2.invoke(aVar.f13052a);
                }
            }
        }

        private final Integer getIconAccount(String str) {
            if (K3.a.c(str)) {
                if (str != null) {
                    return D9.b.M(this.context, str);
                }
                return null;
            }
            String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : null;
            if (lowerCase == null) {
                return null;
            }
            switch (lowerCase.hashCode()) {
                case 96414:
                    if (lowerCase.equals("ada")) {
                        return Integer.valueOf(R.drawable.ic_ada);
                    }
                    return null;
                case 97873:
                    if (lowerCase.equals("btc")) {
                        return Integer.valueOf(R.drawable.ic_btc);
                    }
                    return null;
                case 99212:
                    if (lowerCase.equals("dai")) {
                        return Integer.valueOf(R.drawable.ic_dai);
                    }
                    return null;
                case 100761:
                    if (lowerCase.equals("eth")) {
                        return Integer.valueOf(R.drawable.ic_eth);
                    }
                    return null;
                case 114064:
                    if (lowerCase.equals("sol")) {
                        return Integer.valueOf(R.drawable.ic_sol);
                    }
                    return null;
                case 115130:
                    if (lowerCase.equals("trx")) {
                        return Integer.valueOf(R.drawable.ic_tron);
                    }
                    return null;
                case 118966:
                    if (lowerCase.equals("xrp")) {
                        return Integer.valueOf(R.drawable.ic_xrp);
                    }
                    return null;
                case 119038:
                    if (lowerCase.equals("xtz")) {
                        return Integer.valueOf(R.drawable.ic_tezos);
                    }
                    return null;
                case 3599261:
                    if (lowerCase.equals("usdc")) {
                        return Integer.valueOf(R.drawable.ic_usdc);
                    }
                    return null;
                case 3599278:
                    if (lowerCase.equals("usdt")) {
                        return Integer.valueOf(R.drawable.ic_usdt);
                    }
                    return null;
                case 103668346:
                    if (lowerCase.equals("matic")) {
                        return Integer.valueOf(R.drawable.ic_matic);
                    }
                    return null;
                default:
                    return null;
            }
        }

        private final Integer getIconFile(String str) {
            if (f.b(str, "PDF")) {
                return Integer.valueOf(R.drawable.ic_pdf);
            }
            if (f.b(str, "XLS")) {
                return Integer.valueOf(R.drawable.ic_xls);
            }
            return null;
        }

        private final Integer iconByType(String str) {
            DialogType dialogType = this.type;
            int i = dialogType == null ? -1 : a.f13051a[dialogType.ordinal()];
            return i != 6 ? i != 7 ? i != 8 ? getIconAccount(str) : getIconFile(str) : Integer.valueOf(R.drawable.ic_visa_card) : Integer.valueOf(R.drawable.ic_visa_card);
        }

        @Override // com.airbnb.epoxy.Typed2EpoxyController
        public /* bridge */ /* synthetic */ void buildModels(List<? extends a> list, String str) {
            buildModels2((List<a>) list, str);
        }

        /* renamed from: buildModels, reason: avoid collision after fix types in other method */
        public void buildModels2(List<a> list, String str) {
            String r02;
            List<a> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                l0 l0Var = new l0();
                l0Var.b();
                if (str != null) {
                    l0Var.a(str);
                }
                add(l0Var);
                return;
            }
            int i = 0;
            for (Object obj : list) {
                int i9 = i + 1;
                if (i < 0) {
                    m.t();
                    throw null;
                }
                a aVar = (a) obj;
                Integer iconByType = iconByType(aVar.f13054c);
                DialogType dialogType = this.type;
                int i10 = dialogType == null ? -1 : a.f13051a[dialogType.ordinal()];
                boolean z10 = aVar.i;
                String str2 = aVar.f13053b;
                String str3 = aVar.f13052a;
                switch (i10) {
                    case 1:
                        h0 h0Var = new h0();
                        h0Var.b("statements_selector_account" + i);
                        h0Var.a(iconByType);
                        h0Var.c(str3);
                        h0Var.e(str2);
                        h0Var.d(new n8.f(this, aVar, 0));
                        add(h0Var);
                        break;
                    case 2:
                        i0 i0Var = new i0();
                        i0Var.a("statements_selector_account" + i);
                        i0Var.onMutation();
                        i0Var.f26897a = iconByType;
                        i0Var.onMutation();
                        i0Var.f26898b = str3;
                        i0Var.onMutation();
                        i0Var.f26899c = str2;
                        Boolean valueOf = Boolean.valueOf(z10);
                        i0Var.onMutation();
                        i0Var.f26902f = valueOf;
                        SpannedString v02 = D9.b.v0("", aVar.f13055d, aVar.f13056e, aVar.f13058g, 15, 10, false, false, false, 384);
                        i0Var.onMutation();
                        i0Var.f26900d = v02;
                        n8.f fVar = new n8.f(this, aVar, 1);
                        i0Var.onMutation();
                        i0Var.f26901e = fVar;
                        add(i0Var);
                        break;
                    case 3:
                        c0 c0Var = new c0();
                        c0Var.b("statements_selector_account" + i);
                        c0Var.a(iconByType);
                        c0Var.c(aVar.f13057f);
                        c0Var.e(str2);
                        c0Var.d(new n8.f(this, aVar, 2));
                        add(c0Var);
                        break;
                    case 4:
                        i0 i0Var2 = new i0();
                        i0Var2.a("statements_selector_account" + i);
                        i0Var2.onMutation();
                        i0Var2.f26897a = iconByType;
                        i0Var2.onMutation();
                        i0Var2.f26898b = str3;
                        i0Var2.onMutation();
                        i0Var2.f26899c = str2;
                        Boolean valueOf2 = Boolean.valueOf(z10);
                        i0Var2.onMutation();
                        i0Var2.f26902f = valueOf2;
                        String str4 = aVar.f13055d;
                        SpannedString v03 = D9.b.v0((str4 == null || (r02 = D9.b.r0(str4)) == null || Integer.parseInt(r02) >= 0) ? "" : "-", str4 != null ? C0967l.X(str4, "-", "", false) : null, aVar.f13056e, aVar.f13058g, 15, 10, false, true, false, 256);
                        i0Var2.onMutation();
                        i0Var2.f26900d = v03;
                        n8.f fVar2 = new n8.f(aVar, this, 3);
                        i0Var2.onMutation();
                        i0Var2.f26901e = fVar2;
                        add(i0Var2);
                        break;
                    case 5:
                        i0 i0Var3 = new i0();
                        i0Var3.a("statements_selector_account" + i);
                        i0Var3.onMutation();
                        i0Var3.f26897a = iconByType;
                        i0Var3.onMutation();
                        i0Var3.f26898b = str3;
                        i0Var3.onMutation();
                        i0Var3.f26899c = str2;
                        Boolean valueOf3 = Boolean.valueOf(z10);
                        i0Var3.onMutation();
                        i0Var3.f26902f = valueOf3;
                        SpannedString spannedString = new SpannedString("");
                        i0Var3.onMutation();
                        i0Var3.f26900d = spannedString;
                        n8.f fVar3 = new n8.f(this, aVar, 4);
                        i0Var3.onMutation();
                        i0Var3.f26901e = fVar3;
                        add(i0Var3);
                        break;
                    case 6:
                        j0 j0Var = new j0();
                        j0Var.b("statements_selector_vault_" + i);
                        j0Var.c();
                        j0Var.onMutation();
                        j0Var.f26905b = str3;
                        Boolean valueOf4 = Boolean.valueOf(z10);
                        j0Var.onMutation();
                        j0Var.f26907d = valueOf4;
                        n8.f fVar4 = new n8.f(aVar, this, 5);
                        j0Var.onMutation();
                        j0Var.f26906c = fVar4;
                        add(j0Var);
                        break;
                    case 7:
                        k0 k0Var = new k0();
                        k0Var.b("statements_selector_card_" + i);
                        k0Var.c();
                        k0Var.a(iconByType);
                        k0Var.d(str3);
                        k0Var.f(str2);
                        k0Var.e(new n8.f(this, aVar, 6));
                        add(k0Var);
                        break;
                    default:
                        j0 j0Var2 = new j0();
                        j0Var2.b("statements_selector_" + i);
                        j0Var2.a(iconByType);
                        j0Var2.onMutation();
                        j0Var2.f26905b = str3;
                        Boolean valueOf5 = Boolean.valueOf(z10);
                        j0Var2.onMutation();
                        j0Var2.f26907d = valueOf5;
                        n8.f fVar5 = new n8.f(aVar, this, 7);
                        j0Var2.onMutation();
                        j0Var2.f26906c = fVar5;
                        add(j0Var2);
                        break;
                }
                i = i9;
            }
        }
    }

    /* compiled from: StatementsSelectorDialog.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f13052a;

        /* renamed from: b, reason: collision with root package name */
        public final String f13053b;

        /* renamed from: c, reason: collision with root package name */
        public final String f13054c;

        /* renamed from: d, reason: collision with root package name */
        public final String f13055d;

        /* renamed from: e, reason: collision with root package name */
        public final String f13056e;

        /* renamed from: f, reason: collision with root package name */
        public final SpannedString f13057f;

        /* renamed from: g, reason: collision with root package name */
        public final String f13058g;

        /* renamed from: h, reason: collision with root package name */
        public final Integer f13059h;
        public final boolean i;

        public a(String str, String str2, String str3, String str4, String str5, SpannedString spannedString, String str6, Integer num, boolean z10, int i) {
            str4 = (i & 8) != 0 ? null : str4;
            str5 = (i & 16) != 0 ? null : str5;
            spannedString = (i & 32) != 0 ? null : spannedString;
            str6 = (i & 64) != 0 ? null : str6;
            num = (i & 128) != 0 ? null : num;
            z10 = (i & 256) != 0 ? true : z10;
            this.f13052a = str;
            this.f13053b = str2;
            this.f13054c = str3;
            this.f13055d = str4;
            this.f13056e = str5;
            this.f13057f = spannedString;
            this.f13058g = str6;
            this.f13059h = num;
            this.i = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return f.b(this.f13052a, aVar.f13052a) && f.b(this.f13053b, aVar.f13053b) && f.b(this.f13054c, aVar.f13054c) && f.b(this.f13055d, aVar.f13055d) && f.b(this.f13056e, aVar.f13056e) && f.b(this.f13057f, aVar.f13057f) && f.b(this.f13058g, aVar.f13058g) && f.b(this.f13059h, aVar.f13059h) && this.i == aVar.i;
        }

        public final int hashCode() {
            int c2 = v.c(v.c(this.f13052a.hashCode() * 31, 31, this.f13053b), 31, this.f13054c);
            String str = this.f13055d;
            int hashCode = (c2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f13056e;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            SpannedString spannedString = this.f13057f;
            int hashCode3 = (hashCode2 + (spannedString == null ? 0 : spannedString.hashCode())) * 31;
            String str3 = this.f13058g;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.f13059h;
            return Boolean.hashCode(this.i) + ((hashCode4 + (num != null ? num.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DialogModel(text=");
            sb2.append(this.f13052a);
            sb2.append(", subText=");
            sb2.append(this.f13053b);
            sb2.append(", image=");
            sb2.append(this.f13054c);
            sb2.append(", amount=");
            sb2.append(this.f13055d);
            sb2.append(", amountD=");
            sb2.append(this.f13056e);
            sb2.append(", spanned=");
            sb2.append((Object) this.f13057f);
            sb2.append(", currencyName=");
            sb2.append(this.f13058g);
            sb2.append(", id=");
            sb2.append(this.f13059h);
            sb2.append(", isActive=");
            return com.google.android.gms.measurement.internal.a.k(sb2, this.i, ")");
        }
    }

    public StatementsSelectorDialog(Context context, DialogType dialogType) {
        super(context, R.style.MyBottomSheetDialogTheme);
        this.f13036q = dialogType;
        LayoutInflater from = LayoutInflater.from(context);
        int i = AbstractC1419q2.f29505q;
        DataBinderMapperImpl dataBinderMapperImpl = d.f1140a;
        AbstractC1419q2 abstractC1419q2 = (AbstractC1419q2) F0.f.f(from, R.layout.dialog_statements_selector, null, false, null);
        this.f13037r = abstractC1419q2;
        setContentView(abstractC1419q2.f1148d);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        j().setHideable(true);
        o.c(abstractC1419q2.f29506n, 500L, new g(this, 12));
    }

    public static void l(StatementsSelectorDialog statementsSelectorDialog, List list) {
        statementsSelectorDialog.f13039t = list;
        SelectorController selectorController = statementsSelectorDialog.f13038s;
        if (selectorController != null) {
            selectorController.setData(list, null);
        }
    }

    public final void m(String str) {
        this.f13037r.f29508p.setText(str);
    }

    @Override // com.google.android.material.bottomsheet.e, h.DialogC0783j, c.DialogC0616g, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i = 0;
        InterfaceC0646l interfaceC0646l = new InterfaceC0646l(this) { // from class: n8.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StatementsSelectorDialog f24294b;

            {
                this.f24294b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        String str = (String) obj;
                        StatementsSelectorDialog statementsSelectorDialog = this.f24294b;
                        InterfaceC0646l<? super String, p> interfaceC0646l2 = statementsSelectorDialog.f13040u;
                        if (interfaceC0646l2 != null) {
                            interfaceC0646l2.invoke(str);
                        }
                        statementsSelectorDialog.dismiss();
                        break;
                    case 1:
                        String str2 = (String) obj;
                        StatementsSelectorDialog statementsSelectorDialog2 = this.f24294b;
                        InterfaceC0646l<? super String, p> interfaceC0646l3 = statementsSelectorDialog2.f13041v;
                        if (interfaceC0646l3 != null) {
                            interfaceC0646l3.invoke(str2);
                        }
                        statementsSelectorDialog2.dismiss();
                        break;
                    default:
                        StatementsSelectorDialog.a aVar = (StatementsSelectorDialog.a) obj;
                        InterfaceC0646l<? super StatementsSelectorDialog.a, p> interfaceC0646l4 = this.f24294b.f13042w;
                        if (interfaceC0646l4 != null) {
                            interfaceC0646l4.invoke(aVar);
                        }
                        break;
                }
                return p.f3034a;
            }
        };
        final int i9 = 1;
        InterfaceC0646l interfaceC0646l2 = new InterfaceC0646l(this) { // from class: n8.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StatementsSelectorDialog f24294b;

            {
                this.f24294b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        String str = (String) obj;
                        StatementsSelectorDialog statementsSelectorDialog = this.f24294b;
                        InterfaceC0646l<? super String, p> interfaceC0646l22 = statementsSelectorDialog.f13040u;
                        if (interfaceC0646l22 != null) {
                            interfaceC0646l22.invoke(str);
                        }
                        statementsSelectorDialog.dismiss();
                        break;
                    case 1:
                        String str2 = (String) obj;
                        StatementsSelectorDialog statementsSelectorDialog2 = this.f24294b;
                        InterfaceC0646l<? super String, p> interfaceC0646l3 = statementsSelectorDialog2.f13041v;
                        if (interfaceC0646l3 != null) {
                            interfaceC0646l3.invoke(str2);
                        }
                        statementsSelectorDialog2.dismiss();
                        break;
                    default:
                        StatementsSelectorDialog.a aVar = (StatementsSelectorDialog.a) obj;
                        InterfaceC0646l<? super StatementsSelectorDialog.a, p> interfaceC0646l4 = this.f24294b.f13042w;
                        if (interfaceC0646l4 != null) {
                            interfaceC0646l4.invoke(aVar);
                        }
                        break;
                }
                return p.f3034a;
            }
        };
        final int i10 = 2;
        SelectorController selectorController = new SelectorController(this.f13036q, interfaceC0646l, interfaceC0646l2, new InterfaceC0646l(this) { // from class: n8.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StatementsSelectorDialog f24294b;

            {
                this.f24294b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        String str = (String) obj;
                        StatementsSelectorDialog statementsSelectorDialog = this.f24294b;
                        InterfaceC0646l<? super String, p> interfaceC0646l22 = statementsSelectorDialog.f13040u;
                        if (interfaceC0646l22 != null) {
                            interfaceC0646l22.invoke(str);
                        }
                        statementsSelectorDialog.dismiss();
                        break;
                    case 1:
                        String str2 = (String) obj;
                        StatementsSelectorDialog statementsSelectorDialog2 = this.f24294b;
                        InterfaceC0646l<? super String, p> interfaceC0646l3 = statementsSelectorDialog2.f13041v;
                        if (interfaceC0646l3 != null) {
                            interfaceC0646l3.invoke(str2);
                        }
                        statementsSelectorDialog2.dismiss();
                        break;
                    default:
                        StatementsSelectorDialog.a aVar = (StatementsSelectorDialog.a) obj;
                        InterfaceC0646l<? super StatementsSelectorDialog.a, p> interfaceC0646l4 = this.f24294b.f13042w;
                        if (interfaceC0646l4 != null) {
                            interfaceC0646l4.invoke(aVar);
                        }
                        break;
                }
                return p.f3034a;
            }
        }, getContext());
        this.f13038s = selectorController;
        AbstractC1419q2 abstractC1419q2 = this.f13037r;
        abstractC1419q2.f29507o.setAdapter(selectorController.getAdapter());
        View view = abstractC1419q2.f1148d;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new e(view, this, 0));
        }
    }
}
