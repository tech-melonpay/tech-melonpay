package com.sumsub.sns.internal.nfc;

import O9.p;
import P9.l;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.os.Build;
import ca.InterfaceC0646l;
import h.ActivityC0775b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: g, reason: collision with root package name */
    public static final a f17777g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.nfc.a f17778a = new com.sumsub.sns.internal.nfc.a(this);

    /* renamed from: b, reason: collision with root package name */
    public Activity f17779b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17780c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17781d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17782e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0646l<? super IsoDep, p> f17783f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public final void a(ActivityC0775b activityC0775b, InterfaceC0646l<? super IsoDep, p> interfaceC0646l) {
        this.f17783f = interfaceC0646l;
        this.f17782e = true;
        this.f17778a.a(activityC0775b);
    }

    public final void b(Activity activity) {
        c cVar = c.f17776a;
        c.a(cVar, "NfcManager", "disableNfc", null, 4, null);
        if (!this.f17781d) {
            c.a(cVar, "NfcManager", "NFC already disabled, ignoring", null, 4, null);
            return;
        }
        try {
            NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(activity);
            if (defaultAdapter != null) {
                defaultAdapter.disableForegroundDispatch(activity);
                c.a(cVar, "NfcManager", "NFC disabled", null, 4, null);
            } else {
                c.a(cVar, "NfcManager", "NfcAdapter is null", null, 4, null);
            }
        } catch (Exception e10) {
            c.f17776a.a("NfcManager", "Failed to disable NFC", e10);
        }
    }

    @SuppressLint({"UnspecifiedImmutableFlag"})
    public final void c(Activity activity) {
        c cVar = c.f17776a;
        c.a(cVar, "NfcManager", "enableNfc", null, 4, null);
        if (this.f17781d) {
            c.a(cVar, "NfcManager", "NFC already enabled, ignoring", null, 4, null);
            return;
        }
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(activity);
        if (defaultAdapter == null) {
            c.a(cVar, "NfcManager", "NfcAdapter is null", null, 4, null);
            return;
        }
        Intent intent = new Intent(activity, activity.getClass());
        intent.setFlags(PKIFailureInfo.duplicateCertReq);
        try {
            defaultAdapter.enableForegroundDispatch(activity, Build.VERSION.SDK_INT >= 31 ? PendingIntent.getActivity(activity, 0, intent, 167772160) : PendingIntent.getActivity(activity, 0, intent, 134217728), null, new String[][]{new String[]{"android.nfc.tech.IsoDep"}});
            c.a(cVar, "NfcManager", "NFC enabled", null, 4, null);
        } catch (Exception e10) {
            c.f17776a.a("NfcManager", "Failed to enable NFC", e10);
        }
    }

    public final void d(Activity activity) {
        c.a(c.f17776a, "NfcManager", "onActivityPause", null, 4, null);
        this.f17779b = null;
        this.f17780c = false;
        a(activity);
    }

    public final void e(Activity activity) {
        c.a(c.f17776a, "NfcManager", "onActivityResume", null, 4, null);
        this.f17779b = activity;
        this.f17780c = true;
        a(activity);
    }

    public final void a() {
        this.f17783f = null;
        this.f17782e = false;
        this.f17778a.a();
    }

    public final void a(Intent intent) {
        String[] techList;
        if (this.f17782e) {
            if (kotlin.jvm.internal.f.b("android.nfc.action.TECH_DISCOVERED", intent != null ? intent.getAction() : null)) {
                c cVar = c.f17776a;
                c.a(cVar, "NfcManager", "onNewIntent:" + intent, null, 4, null);
                Tag tag = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG");
                if (tag == null || (techList = tag.getTechList()) == null || !l.n(techList, "android.nfc.tech.IsoDep")) {
                    return;
                }
                IsoDep isoDep = IsoDep.get(tag);
                c.a(cVar, "NfcManager", "Got IsoDep in onNewIntent", null, 4, null);
                InterfaceC0646l<? super IsoDep, p> interfaceC0646l = this.f17783f;
                if (interfaceC0646l != null) {
                    interfaceC0646l.invoke(isoDep);
                }
            }
        }
    }

    public final void a(Activity activity) {
        if (this.f17780c && this.f17782e) {
            c(activity);
            this.f17781d = true;
        } else {
            b(activity);
            this.f17781d = false;
        }
    }
}
