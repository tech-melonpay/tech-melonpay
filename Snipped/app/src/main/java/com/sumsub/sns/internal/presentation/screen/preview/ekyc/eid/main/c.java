package com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main;

import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.a;
import com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.main.b;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f18366a = new c();

    public final b.a a(b.c cVar, a.i iVar, a.C0301a c0301a, boolean z10) {
        return z10 ? new b.a(cVar.a("sns_eid_error_wrongCan_title"), cVar.a("sns_eid_error_wrongCan_subtitle"), null, cVar.a("sns_eid_error_wrongCan_action"), SNSIconHandler.SNSEidIcons.CAN, iVar, c0301a, 4, null) : new b.a(cVar.a("sns_eid_canRequired_title"), cVar.a("sns_eid_canRequired_subtitle"), null, cVar.a("sns_eid_canRequired_action"), SNSIconHandler.SNSEidIcons.CAN, iVar, c0301a, 4, null);
    }

    public final b.f b(b.c cVar, a.C0301a c0301a) {
        return new b.f(true, cVar.a("sns_eid_pinChangeSuccess_title"), cVar.a("sns_eid_pinChangeSuccess_subtitle"), SNSIconHandler.SNSEidIcons.DONE.getImageName(), cVar.a("sns_eid_pinChangeSuccess_action_continue"), a.i.f.f18282a, c0301a);
    }

    public final b.d c(b.c cVar, a.C0301a c0301a) {
        return new b.d(cVar.a("sns_eid_pinSelection_title"), cVar.a("sns_eid_pinSelection_subtitle"), cVar.a("sns_eid_pinSelection_action_pinInfo"), cVar.a("sns_eid_pinSelection_action_proceedToIdent"), cVar.a("sns_eid_pinSelection_action_changeTransportPin"), a.i.f.f18282a, a.i.d.f18280a, a.i.l.f18290a, c0301a);
    }

    public final b.f d(b.c cVar, a.C0301a c0301a) {
        return new b.f(true, cVar.a("sns_eid_unlockSuccess_title"), cVar.a("sns_eid_unlockSuccess_subtitle"), SNSIconHandler.SNSEidIcons.DONE.getImageName(), cVar.a("sns_eid_unlockSuccess_action_continue"), a.i.m.f18291a, c0301a);
    }

    public final b.C0326b a(b.c cVar, a.C0301a c0301a) {
        return new b.C0326b(cVar.a("sns_eid_identInfo_title"), cVar.a("sns_eid_identInfo_subtitle"), cVar.a("sns_eid_identInfo_action_learnMore"), a.i.k.f18289a, cVar.a("sns_eid_identInfo_action_continue"), new a.i.C0311i(null), c0301a);
    }

    public final b.e a(b.c cVar, int i, String str, a.C0301a c0301a) {
        return new b.e(cVar.a("sns_eid_nfcScan_title"), cVar.a("sns_eid_nfcScan_subtitle"), str, Integer.valueOf(i), cVar.a("sns_alert_action_cancel"), a.i.c.f18279a, c0301a);
    }

    public final b.e a(b.c cVar, String str, a.C0301a c0301a) {
        return new b.e(cVar.a("sns_eid_nfcScan_title"), cVar.a("sns_eid_nfcScan_subtitle"), str, null, cVar.a("sns_alert_action_cancel"), a.i.C0302a.f18277a, c0301a);
    }

    public final b.e a(b.c cVar, CharSequence charSequence, a.C0301a c0301a) {
        return new b.e(cVar.a("sns_eid_nfcScan_title"), cVar.a("sns_eid_nfcScan_subtitle"), charSequence, null, cVar.a("sns_alert_action_cancel"), a.i.b.f18278a, c0301a);
    }
}
