package com.sumsub.sns.internal.ff;

import P9.n;
import P9.s;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import com.sumsub.sns.internal.ff.core.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: A, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16925A;

    /* renamed from: B, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16926B;

    /* renamed from: C, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16927C;

    /* renamed from: D, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16928D;

    /* renamed from: E, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16929E;

    /* renamed from: a, reason: collision with root package name */
    public static final a f16930a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final b f16931b;

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap<String, Pair<Boolean, String>> f16932c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16933d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16934e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16935f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16936g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16937h;
    public static final com.sumsub.sns.internal.ff.core.a i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16938j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16939k;

    /* renamed from: l, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16940l;

    /* renamed from: m, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16941m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16942n;

    /* renamed from: o, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16943o;

    /* renamed from: p, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16944p;

    /* renamed from: q, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16945q;

    /* renamed from: r, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16946r;

    /* renamed from: s, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16947s;

    /* renamed from: t, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16948t;

    /* renamed from: u, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16949u;

    /* renamed from: v, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16950v;

    /* renamed from: w, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16951w;

    /* renamed from: x, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16952x;

    /* renamed from: y, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16953y;

    /* renamed from: z, reason: collision with root package name */
    public static final com.sumsub.sns.internal.ff.core.a f16954z;

    static {
        b bVar = new b();
        f16931b = bVar;
        f16932c = new ConcurrentHashMap<>();
        f16933d = bVar.a("androidVideoIdentConfig", "Video ident config.\n\nPreferred video encoding codec used in VI.\nKey: 'codec'. Values: h264 or vp8", "{\"codec\":\"vp8\"}");
        f16934e = b.b(bVar, "videoIdentSkipNotificationPermission", "Disables notification permission request for Android 13 or later", null, 4, null);
        f16935f = bVar.a("androidFaceDetector", "Face detector config in liveness step.\n\nEnable or disable MLKit face detector.\nKey: 'mlkit'. Values: 'true' or 'false'.\n\nAddition delay between frames in liveness.\nKey: 'frameDelay'. Values: any reasonable integer.", "{\"mlkit\":\"true\", \"frameDelay\":500}");
        f16936g = b.b(bVar, "skipGeolocationForm", "Skip address confirmation form", null, 4, null);
        f16937h = b.b(bVar, "livenessFullscreenCamera", "Full-screen camera in liveness check (transparent status bar)", null, 4, null);
        i = b.b(bVar, "enableFaceDetectionDebug", "Draw a box around face during liveness", null, 4, null);
        f16938j = b.b(bVar, "enableFaceShowSettings", "Display a dialog asking for edit settings, in order to change the brightness to full during liveness to highlight the face", null, 4, null);
        f16939k = b.a(bVar, "makeCountryStateDropdownRequiredIfNeeded", "On the Applicant Data screen, set the State (StateOfBirth) field required if the corresponding field (Country or CountryOfBirth) is required and there is a list of states for the selected country", null, 4, null);
        f16940l = b.b(bVar, "stringResourcesKeys", "Show string key instead of empty value, or show only keys (value = key)", null, 4, null);
        f16941m = b.b(bVar, "showBadPhotosDebugInfo", "Show technical info on screen after analyzing photo quality)", null, 4, null);
        f16942n = b.a(bVar, "unsatisfactoryPhotosMobileToggle", "Enabling bad photos detection as a separate feature", null, 4, null);
        f16943o = bVar.a("unsatisfactoryPhotosMobileConfigV2", "Config for unsatisfactory photos detector in document capture.                ", "{\n  \"android\":{\n    \"model\":\"unsatisfactory_photos_v2.tflite\",\n    \"high_quality_threshold\":0.75,\n    \"low_quality_threshold\":0.2,\n    \"execution_timeout_ms\":3000,\n    \"allow_cache\":true,\n    \"max_blocked_attempts\": 1,\n    \"allowed_steps\":[\n      \"IDENTITY\",\n      \"IDENTITY2\",\n      \"IDENTITY3\",\n      \"IDENTITY4\"\n    ]\n  }\n}");
        f16944p = b.a(bVar, "seamlessDocaptureAndroidToggle", "Disable seamless android only. Just in case and for testing purposes", null, 4, null);
        f16945q = bVar.a("seamlessDocaptureMobileConfig", "For advanced seamlessDocapture configuration ....", "{\n    \"android\": {\n        \"videoBitrate\": 1500000,\n        \"maxRecordedDurationSec\": 60,\n        \"videoQuality\": \"HD\",\n        \"videoFallbackQuality\": \"SD\",\n        \"maxRecordedFileSizeMB\": 30\n    }\n}");
        f16946r = b.a(bVar, "documentAutocaptureMobileToggle", "Enabling autocapture as separate feature", null, 4, null);
        f16947s = bVar.a("documentAutocaptureMobileConfigV2", "Json configuration documentAutocapture ....", "{\n    \"android\": {\n        \"requiredFrameFillRatio\": 0.4,\n        \"requiredLargestSizeOffsetRatio\": 0.2,\n        \"frameAspectRatio\": 1.0,\n        \"autoCaptureModel\": {\n            \"name\": \"autocapture_v2.tflite\",\n            \"threshold\": 0.7,\n            \"allowCache\": true,\n            \"inputSize\": {\n                \"width\": 384,\n                \"height\": 640\n            },\n            \"outputSize\": 5040\n        }\n    }\n}");
        f16948t = b.a(bVar, "filterCountriesByDocumentsOnQuestionnaireStep", "Filter countries by allowed docs in the countrySelect field. Deprecated", null, 4, null);
        f16949u = b.a(bVar, "dontLimitCountriesOnAppDataStep", "Don't limit country field list on applicant data step", null, 4, null);
        f16950v = b.b(bVar, "ekycTestMasks", "Ekyc masks configuration", null, 4, null);
        f16951w = b.a(bVar, "msdkSkipAgreementSigning", "Don't show agreement selector screen if multiple agreements available, or skip signing the agreement on status screen if only one agreement available.", null, 4, null);
        f16952x = b.b(bVar, "agreementsCount", "Specify agreements count for the agreement selector screen. Random countries with random agreements will be generated.", null, 4, null);
        f16953y = bVar.b("testIpHeader", "value to pass X-Test-Ip over.", "85.214.132.117");
        f16954z = b.a(bVar, "msdkEnableVerificationExitPopup", "Show confirmation dialog on closing VideoIdent flow and close the SDK", null, 4, null);
        f16925A = bVar.a("overrideVerificationUrl", "Override base URL and access token to emulate verificationUrl and accessToken on msdkInit", "{\n    \"verificationUrl\": \"http://dev-in.sumsub.com/\",\n    \"accessToken\" : \"AAA\"\n}");
        f16926B = b.a(bVar, "androidAllowFaceScanFrameCalibration", "Enable fingerprint collection with FaceScan segment", null, 4, null);
        f16927C = b.a(bVar, "obligatoryNfcScan", "Hide Skip NFC button", null, 4, null);
        f16928D = b.a(bVar, "androidDisableAALCardUnblocking", "Disable eid card using PUK", null, 4, null);
        f16929E = b.b(bVar, "eidPinChangeTesting", "Allow to change 5-digit PIN to 6-digit PIN multiple times.\n\nIMPORTANT: under the hood this is a real 6-digit to 6-digit PIN changing! Be careful and try not to block the card by providing the wrong PIN!\n\nHow to use: on the first screen provide first 5 digits of the old 6-digit PIN, then on the second test screen provide the last digit of the old 6-digit PIN. On the third and fourth screens provide the new 6-digit PIN.", null, 4, null);
    }

    public final com.sumsub.sns.internal.ff.core.a A() {
        return f16943o;
    }

    public final com.sumsub.sns.internal.ff.core.a B() {
        return f16942n;
    }

    public final com.sumsub.sns.internal.ff.core.a C() {
        return f16933d;
    }

    public final com.sumsub.sns.internal.ff.core.a D() {
        return f16934e;
    }

    public final com.sumsub.sns.internal.ff.model.a E() {
        Collection<com.sumsub.sns.internal.ff.core.a> b9 = f16931b.b();
        ArrayList arrayList = new ArrayList(n.u(b9, 10));
        Iterator<T> it = b9.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.sumsub.sns.internal.ff.core.a) it.next()).e());
        }
        return new com.sumsub.sns.internal.ff.model.a(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F() {
        f16931b.c();
        Iterator<T> it = f16932c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            com.sumsub.sns.internal.ff.core.a a10 = f16931b.a((String) entry.getKey());
            if (a10 != null) {
                a10.b(((Boolean) ((Pair) entry.getValue()).f23089a).booleanValue(), (String) ((Pair) entry.getValue()).f23090b);
            }
        }
    }

    public final void a(String str, boolean z10, String str2) {
        f16932c.put(str, new Pair<>(Boolean.valueOf(z10), str2));
        com.sumsub.sns.internal.ff.core.a a10 = f16931b.a(str);
        if (a10 != null) {
            a10.b(z10, str2);
        }
    }

    public final com.sumsub.sns.internal.ff.core.a b() {
        return f16939k;
    }

    public final Map<String, Object> c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Collection<com.sumsub.sns.internal.ff.core.a> b9 = f16931b.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b9) {
            if (((com.sumsub.sns.internal.ff.core.a) obj).g()) {
                arrayList.add(obj);
            }
        }
        Collection<com.sumsub.sns.internal.ff.core.a> a10 = f16931b.a();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : a10) {
            if (((com.sumsub.sns.internal.ff.core.a) obj2).g()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList U = s.U(arrayList, arrayList2);
        ArrayList arrayList3 = new ArrayList(n.u(U, 10));
        Iterator it = U.iterator();
        while (it.hasNext()) {
            arrayList3.add(((com.sumsub.sns.internal.ff.core.a) it.next()).e());
        }
        if (!(!arrayList3.isEmpty())) {
            arrayList3 = null;
        }
        if (arrayList3 != null) {
            linkedHashMap.put("enabledFFs", arrayList3);
        }
        return linkedHashMap;
    }

    public final com.sumsub.sns.internal.ff.core.a d() {
        return f16926B;
    }

    public final com.sumsub.sns.internal.ff.core.a e() {
        return f16944p;
    }

    public final com.sumsub.sns.internal.ff.core.a f() {
        return f16947s;
    }

    public final com.sumsub.sns.internal.ff.core.a g() {
        return f16946r;
    }

    public final com.sumsub.sns.internal.ff.core.a h() {
        return f16949u;
    }

    public final com.sumsub.sns.internal.ff.core.a i() {
        return f16929E;
    }

    public final com.sumsub.sns.internal.ff.core.a k() {
        return f16950v;
    }

    public final com.sumsub.sns.internal.ff.core.a l() {
        return f16935f;
    }

    public final com.sumsub.sns.internal.ff.core.a m() {
        return f16948t;
    }

    public final com.sumsub.sns.internal.ff.core.a n() {
        return f16937h;
    }

    public final com.sumsub.sns.internal.ff.core.a o() {
        return i;
    }

    public final com.sumsub.sns.internal.ff.core.a p() {
        return f16938j;
    }

    public final b q() {
        return f16931b;
    }

    public final com.sumsub.sns.internal.ff.core.a r() {
        return f16954z;
    }

    public final com.sumsub.sns.internal.ff.core.a s() {
        return f16927C;
    }

    public final com.sumsub.sns.internal.ff.core.a t() {
        return f16925A;
    }

    public final com.sumsub.sns.internal.ff.core.a u() {
        return f16945q;
    }

    public final com.sumsub.sns.internal.ff.core.a v() {
        return f16941m;
    }

    public final com.sumsub.sns.internal.ff.core.a w() {
        return f16951w;
    }

    public final com.sumsub.sns.internal.ff.core.a x() {
        return f16936g;
    }

    public final com.sumsub.sns.internal.ff.core.a y() {
        return f16940l;
    }

    public final com.sumsub.sns.internal.ff.core.a z() {
        return f16953y;
    }

    public final void a(String str) {
        f16932c.remove(str);
        com.sumsub.sns.internal.ff.core.a a10 = f16931b.a(str);
        if (a10 != null) {
            a10.a();
        }
    }

    public final void a(b.C0233b c0233b) {
        f16931b.a(c0233b);
    }

    public final com.sumsub.sns.internal.ff.core.a a() {
        return f16952x;
    }
}
