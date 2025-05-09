package com.luminary.business.presentation.ui.fragments.cards;

import O9.p;
import android.content.Context;
import android.view.View;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.TypedEpoxyController;
import com.luminary.business.domain.entity.cards.VaultDomain;
import java.util.List;

/* compiled from: CardsController.kt */
/* loaded from: classes2.dex */
public final class CardsController extends TypedEpoxyController<List<? extends VaultDomain>> {
    private final Context context;
    private InterfaceC0646l<? super Integer, p> onTopUpClick;
    private InterfaceC0646l<? super Integer, p> onVaultClick;

    public CardsController(Context context, InterfaceC0646l<? super Integer, p> interfaceC0646l, InterfaceC0646l<? super Integer, p> interfaceC0646l2) {
        this.context = context;
        this.onVaultClick = interfaceC0646l;
        this.onTopUpClick = interfaceC0646l2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$3$lambda$2$lambda$0(CardsController cardsController, VaultDomain vaultDomain, View view) {
        InterfaceC0646l<? super Integer, p> interfaceC0646l = cardsController.onTopUpClick;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke(Integer.valueOf(vaultDomain.f10778a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$3$lambda$2$lambda$1(CardsController cardsController, VaultDomain vaultDomain, View view) {
        InterfaceC0646l<? super Integer, p> interfaceC0646l = cardsController.onVaultClick;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke(Integer.valueOf(vaultDomain.f10778a));
        }
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends VaultDomain> list) {
        buildModels2((List<VaultDomain>) list);
    }

    public final InterfaceC0646l<Integer, p> getOnTopUpClick() {
        return this.onTopUpClick;
    }

    public final InterfaceC0646l<Integer, p> getOnVaultClick() {
        return this.onVaultClick;
    }

    public final void setOnTopUpClick(InterfaceC0646l<? super Integer, p> interfaceC0646l) {
        this.onTopUpClick = interfaceC0646l;
    }

    public final void setOnVaultClick(InterfaceC0646l<? super Integer, p> interfaceC0646l) {
        this.onVaultClick = interfaceC0646l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Type inference failed for: r4v6, types: [T6.a] */
    /* JADX WARN: Type inference failed for: r4v7, types: [T6.a] */
    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void buildModels2(java.util.List<com.luminary.business.domain.entity.cards.VaultDomain> r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = 1
            r2 = 0
            if (r22 == 0) goto La4
            r3 = r22
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
            r4 = r2
        Lf:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto La4
            java.lang.Object r5 = r3.next()
            int r6 = r4 + 1
            r7 = 0
            if (r4 < 0) goto La0
            com.luminary.business.domain.entity.cards.VaultDomain r5 = (com.luminary.business.domain.entity.cards.VaultDomain) r5
            java.lang.String r4 = r5.f10784g
            java.lang.String r8 = "0"
            boolean r4 = kotlin.jvm.internal.f.b(r4, r8)
            java.lang.String r8 = r5.f10784g
            if (r4 != 0) goto L46
            java.lang.String r4 = r5.f10785h
            boolean r9 = kotlin.jvm.internal.f.b(r8, r4)
            if (r9 != 0) goto L46
            android.content.Context r9 = r0.context
            java.lang.String r4 = D9.b.c(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r10 = 2132017328(0x7f1400b0, float:1.9672931E38)
            java.lang.String r4 = r9.getString(r10, r4)
            goto L47
        L46:
            r4 = r7
        L47:
            s6.k r9 = new s6.k
            r9.<init>()
            int r10 = r5.f10778a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Number[] r11 = new java.lang.Number[r1]
            r11[r2] = r10
            r9.c(r11)
            java.lang.String r10 = r5.f10781d
            r9.d(r10)
            if (r8 == 0) goto L66
            java.lang.String r10 = D9.b.v(r8)
            r12 = r10
            goto L67
        L66:
            r12 = r7
        L67:
            if (r8 == 0) goto L6f
            java.lang.String r7 = r5.f10782e
            java.lang.String r7 = D9.b.u(r8, r7)
        L6f:
            r13 = r7
            r18 = 0
            r19 = 0
            java.lang.String r11 = ""
            java.lang.String r14 = r5.f10782e
            r15 = 20
            r16 = 15
            r17 = 0
            r20 = 384(0x180, float:5.38E-43)
            android.text.SpannedString r7 = D9.b.v0(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r9.a(r7)
            r9.b(r4)
            T6.a r4 = new T6.a
            r4.<init>(r0)
            r9.e(r4)
            T6.a r4 = new T6.a
            r4.<init>(r0)
            r9.f(r4)
            r0.add(r9)
            r4 = r6
            goto Lf
        La0:
            P9.m.t()
            throw r7
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.presentation.ui.fragments.cards.CardsController.buildModels2(java.util.List):void");
    }
}
