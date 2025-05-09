package com.sumsub.sns.internal.core.common;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.MobileSdk;
import com.sumsub.sns.core.SNSModule;
import com.sumsub.sns.core.data.listener.SNSActionResultHandler;
import com.sumsub.sns.core.data.listener.SNSCountryPicker;
import com.sumsub.sns.core.data.listener.SNSErrorHandler;
import com.sumsub.sns.core.data.listener.SNSEventHandler;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.data.listener.SNSInstructionsViewHandler;
import com.sumsub.sns.core.data.listener.SNSStateChangedHandler;
import com.sumsub.sns.core.data.listener.SNSUrlHandler;
import com.sumsub.sns.core.data.listener.TokenExpirationHandler;
import com.sumsub.sns.core.data.model.SNSDocumentDefinition;
import com.sumsub.sns.core.data.model.SNSInitConfig;
import com.sumsub.sns.core.data.model.SNSSDKState;
import com.sumsub.sns.core.data.model.SNSSupportItem;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e0 implements MobileSdk {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f15086g;

    /* renamed from: j, reason: collision with root package name */
    public static InterfaceC0635a<SNSInitConfig> f15088j;

    /* renamed from: k, reason: collision with root package name */
    public static InterfaceC0635a<? extends Map<String, String>> f15089k;

    /* renamed from: l, reason: collision with root package name */
    public static InterfaceC0635a<? extends TokenExpirationHandler> f15090l;

    /* renamed from: m, reason: collision with root package name */
    public static InterfaceC0635a<? extends SNSStateChangedHandler> f15091m;

    /* renamed from: n, reason: collision with root package name */
    public static InterfaceC0635a<? extends SNSErrorHandler> f15092n;

    /* renamed from: o, reason: collision with root package name */
    public static InterfaceC0635a<? extends SNSEventHandler> f15093o;

    /* renamed from: p, reason: collision with root package name */
    public static InterfaceC0635a<? extends SNSJsonCustomization> f15094p;

    /* renamed from: q, reason: collision with root package name */
    public static InterfaceC0635a<? extends SNSInstructionsViewHandler> f15095q;

    /* renamed from: r, reason: collision with root package name */
    public static InterfaceC0635a<? extends SNSActionResultHandler> f15096r;

    /* renamed from: s, reason: collision with root package name */
    public static InterfaceC0646l<? super String, ? extends SNSModule> f15097s;

    /* renamed from: t, reason: collision with root package name */
    public static InterfaceC0635a<? extends SNSIconHandler> f15098t;

    /* renamed from: u, reason: collision with root package name */
    public static InterfaceC0635a<? extends SNSCountryPicker> f15099u;

    /* renamed from: v, reason: collision with root package name */
    public static InterfaceC0635a<? extends List<SNSSupportItem>> f15100v;

    /* renamed from: w, reason: collision with root package name */
    public static InterfaceC0646l<? super List<SNSSupportItem>, O9.p> f15101w;

    /* renamed from: x, reason: collision with root package name */
    public static InterfaceC0635a<? extends Map<String, SNSDocumentDefinition>> f15102x;

    /* renamed from: y, reason: collision with root package name */
    public static InterfaceC0635a<Integer> f15103y;

    /* renamed from: z, reason: collision with root package name */
    public static InterfaceC0635a<? extends SNSUrlHandler> f15104z;

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f15081a = new e0();

    /* renamed from: c, reason: collision with root package name */
    public static String f15082c = "";

    /* renamed from: d, reason: collision with root package name */
    public static int f15083d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static String f15084e = "";

    /* renamed from: f, reason: collision with root package name */
    public static Locale f15085f = i.a();

    /* renamed from: h, reason: collision with root package name */
    public static SNSSDKState f15087h = SNSSDKState.Initial.INSTANCE;
    public static final String i = "1.32.0";

    /* renamed from: A, reason: collision with root package name */
    public static final b f15079A = new b();

    /* renamed from: B, reason: collision with root package name */
    public static final a f15080B = new a();

    public static final class a implements SNSCountryPicker {
        @Override // com.sumsub.sns.core.data.listener.SNSCountryPicker
        public void pickCountry(Context context, List<SNSCountryPicker.CountryItem> list, SNSCountryPicker.SNSCountryPickerCallBack sNSCountryPickerCallBack, String str, String str2) {
            Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, "MobileSdkInternal", "Attempt to call uninitialized MobileSdkInternal", null, 4, null);
        }
    }

    public static final class b implements SNSIconHandler {
        @Override // com.sumsub.sns.core.data.listener.SNSIconHandler
        public Drawable onResolveIcon(Context context, String str) {
            Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, "MobileSdkInternal", "Attempt to call uninitialized MobileSdkInternal", null, 4, null);
            return null;
        }
    }

    public void a(SNSSDKState sNSSDKState) {
        f15087h = sNSSDKState;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public SNSActionResultHandler getActionResultHandler() {
        InterfaceC0635a<? extends SNSActionResultHandler> interfaceC0635a = f15096r;
        if (interfaceC0635a != null) {
            return interfaceC0635a.invoke();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public Integer getAutoCloseOnApproveTimeout() {
        InterfaceC0635a<Integer> interfaceC0635a = f15103y;
        if (interfaceC0635a != null) {
            return interfaceC0635a.invoke();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public SNSInitConfig getConf() {
        InterfaceC0635a<SNSInitConfig> interfaceC0635a = f15088j;
        if (interfaceC0635a != null) {
            return interfaceC0635a.invoke();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public SNSCountryPicker getCountryPicker() {
        SNSCountryPicker invoke;
        InterfaceC0635a<? extends SNSCountryPicker> interfaceC0635a = f15099u;
        return (interfaceC0635a == null || (invoke = interfaceC0635a.invoke()) == null) ? f15080B : invoke;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public SNSJsonCustomization getCustomization() {
        InterfaceC0635a<? extends SNSJsonCustomization> interfaceC0635a = f15094p;
        if (interfaceC0635a != null) {
            return interfaceC0635a.invoke();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public SNSErrorHandler getErrorHandler() {
        InterfaceC0635a<? extends SNSErrorHandler> interfaceC0635a = f15092n;
        if (interfaceC0635a != null) {
            return interfaceC0635a.invoke();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public SNSEventHandler getEventHandler() {
        InterfaceC0635a<? extends SNSEventHandler> interfaceC0635a = f15093o;
        if (interfaceC0635a != null) {
            return interfaceC0635a.invoke();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public SNSIconHandler getIconHandler() {
        SNSIconHandler invoke;
        InterfaceC0635a<? extends SNSIconHandler> interfaceC0635a = f15098t;
        return (interfaceC0635a == null || (invoke = interfaceC0635a.invoke()) == null) ? f15079A : invoke;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public SNSInstructionsViewHandler getInstructionsViewHandler() {
        InterfaceC0635a<? extends SNSInstructionsViewHandler> interfaceC0635a = f15095q;
        if (interfaceC0635a != null) {
            return interfaceC0635a.invoke();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public Locale getLocale() {
        return f15085f;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public String getPackageName() {
        return f15084e;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public SNSModule getPluggedModule(String str) {
        InterfaceC0646l<? super String, ? extends SNSModule> interfaceC0646l = f15097s;
        if (interfaceC0646l != null) {
            return interfaceC0646l.invoke(str);
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public Map<String, SNSDocumentDefinition> getPreferredDocumentsDefinitions() {
        InterfaceC0635a<? extends Map<String, SNSDocumentDefinition>> interfaceC0635a = f15102x;
        if (interfaceC0635a != null) {
            return interfaceC0635a.invoke();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public Map<String, String> getSettings() {
        InterfaceC0635a<? extends Map<String, String>> interfaceC0635a = f15089k;
        if (interfaceC0635a != null) {
            return interfaceC0635a.invoke();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public SNSSDKState getState() {
        return f15087h;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public SNSStateChangedHandler getStateChangedHandler() {
        InterfaceC0635a<? extends SNSStateChangedHandler> interfaceC0635a = f15091m;
        if (interfaceC0635a != null) {
            return interfaceC0635a.invoke();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public List<SNSSupportItem> getSupportItems() {
        InterfaceC0635a<? extends List<SNSSupportItem>> interfaceC0635a = f15100v;
        if (interfaceC0635a != null) {
            return interfaceC0635a.invoke();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public TokenExpirationHandler getTokenExpirationHandler() {
        InterfaceC0635a<? extends TokenExpirationHandler> interfaceC0635a = f15090l;
        if (interfaceC0635a != null) {
            return interfaceC0635a.invoke();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public SNSUrlHandler getUrlHandler() {
        InterfaceC0635a<? extends SNSUrlHandler> interfaceC0635a = f15104z;
        if (interfaceC0635a != null) {
            return interfaceC0635a.invoke();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public String getVersion() {
        return i;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public int getVersionCode() {
        return f15083d;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public String getVersionName() {
        return f15082c;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public boolean isDebug() {
        return f15086g;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public boolean isModuleAvailable(String str) {
        return a(str);
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public void setSupportItems(List<SNSSupportItem> list) {
        InterfaceC0646l<? super List<SNSSupportItem>, O9.p> interfaceC0646l = f15101w;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke(list);
        }
    }

    public final boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void a(String str, String str2, int i9) {
        f15084e = str;
        f15082c = str2;
        f15083d = i9;
    }

    public final void a(boolean z10, Locale locale) {
        f15086g = z10;
        f15085f = locale;
    }

    public final void a(InterfaceC0635a<SNSInitConfig> interfaceC0635a, InterfaceC0635a<? extends Map<String, String>> interfaceC0635a2, InterfaceC0635a<? extends TokenExpirationHandler> interfaceC0635a3, InterfaceC0635a<? extends SNSStateChangedHandler> interfaceC0635a4, InterfaceC0635a<? extends SNSErrorHandler> interfaceC0635a5, InterfaceC0635a<? extends SNSEventHandler> interfaceC0635a6, InterfaceC0635a<? extends SNSJsonCustomization> interfaceC0635a7, InterfaceC0635a<? extends SNSInstructionsViewHandler> interfaceC0635a8, InterfaceC0635a<? extends SNSActionResultHandler> interfaceC0635a9, InterfaceC0646l<? super String, ? extends SNSModule> interfaceC0646l, InterfaceC0635a<? extends SNSIconHandler> interfaceC0635a10, InterfaceC0635a<? extends SNSCountryPicker> interfaceC0635a11, InterfaceC0635a<? extends Map<String, SNSDocumentDefinition>> interfaceC0635a12, InterfaceC0635a<Integer> interfaceC0635a13, InterfaceC0635a<? extends SNSUrlHandler> interfaceC0635a14) {
        f15088j = interfaceC0635a;
        f15089k = interfaceC0635a2;
        f15090l = interfaceC0635a3;
        f15091m = interfaceC0635a4;
        f15092n = interfaceC0635a5;
        f15093o = interfaceC0635a6;
        f15094p = interfaceC0635a7;
        f15095q = interfaceC0635a8;
        f15096r = interfaceC0635a9;
        f15097s = interfaceC0646l;
        f15098t = interfaceC0635a10;
        f15099u = interfaceC0635a11;
        f15102x = interfaceC0635a12;
        f15103y = interfaceC0635a13;
        f15104z = interfaceC0635a14;
    }

    public final void a(InterfaceC0635a<? extends List<SNSSupportItem>> interfaceC0635a, InterfaceC0646l<? super List<SNSSupportItem>, O9.p> interfaceC0646l) {
        f15100v = interfaceC0635a;
        f15101w = interfaceC0646l;
    }
}
