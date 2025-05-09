package com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid;

import O9.p;
import P9.l;
import android.app.Activity;
import ca.InterfaceC0646l;
import com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.a;
import de.authada.library.api.AuthadaAuthenticationLibrary;
import de.authada.library.api.AuthadaAuthenticationLibraryConfig;
import de.authada.library.api.Can;
import de.authada.library.api.analytics.AnalyticsCallback;
import de.authada.library.api.authentication.Authentication;
import de.authada.library.api.authentication.AuthenticationCallback;
import de.authada.library.api.authentication.Pin;
import de.authada.library.api.authentication.StartCallback;
import de.authada.library.api.pinChanger.PinChanger;
import de.authada.library.api.pinChanger.PinChangerCallback;
import de.authada.library.api.pinChanger.TPin;
import de.authada.library.api.unblock.Puk;
import de.authada.library.api.unblock.Unblocker;
import de.authada.library.api.unblock.UnblockerCallback;
import java.lang.ref.WeakReference;
import java.net.URL;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference<Activity> f18205a;

    /* renamed from: b, reason: collision with root package name */
    public Authentication f18206b;

    /* renamed from: c, reason: collision with root package name */
    public PinChanger f18207c;

    /* renamed from: d, reason: collision with root package name */
    public Unblocker f18208d;

    public static final class a implements AuthenticationCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.b f18209a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.b f18210b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Pin f18211c;

        public a(com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.b bVar, Pin pin) {
            this.f18210b = bVar;
            this.f18211c = pin;
            this.f18209a = bVar;
        }
    }

    public static final class b implements PinChangerCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f18212a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f18213b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TPin f18214c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Pin f18215d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Integer f18216e;

        public b(c cVar, TPin tPin, Pin pin, Integer num) {
            this.f18213b = cVar;
            this.f18214c = tPin;
            this.f18215d = pin;
            this.f18216e = num;
            this.f18212a = cVar;
        }
    }

    public d(Activity activity) {
        this.f18205a = new WeakReference<>(activity);
    }

    public final void a(com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.a aVar) {
        if (aVar instanceof a.g) {
            a.g gVar = (a.g) aVar;
            a(gVar.i(), gVar.j(), gVar.h(), gVar.f(), gVar.g());
            return;
        }
        if (aVar instanceof a.d) {
            a.d dVar = (a.d) aVar;
            a(dVar.h(), dVar.f(), dVar.e(), dVar.g());
            return;
        }
        if (aVar instanceof a.e) {
            a.e eVar = (a.e) aVar;
            a(eVar.l(), eVar.k(), eVar.h(), eVar.j(), eVar.g(), eVar.i());
            return;
        }
        if (aVar instanceof a.f) {
            a.f fVar = (a.f) aVar;
            a(fVar.f(), fVar.d(), fVar.e());
        } else if (aVar instanceof a.C0300a) {
            c();
        } else if (aVar instanceof a.b) {
            d();
        } else if (aVar instanceof a.c) {
            b();
        }
    }

    public final void b() {
        Authentication authentication = this.f18206b;
        if (authentication != null) {
            authentication.stop();
        }
        this.f18206b = null;
    }

    public final void c() {
        PinChanger pinChanger = this.f18207c;
        if (pinChanger != null) {
            pinChanger.stop();
        }
        this.f18207c = null;
    }

    public final void d() {
        Unblocker unblocker = this.f18208d;
        if (unblocker != null) {
            unblocker.stop();
        }
        this.f18208d = null;
    }

    public final void a() {
        b();
        c();
        d();
    }

    public final void a(String str, URL url, String str2, StartCallback startCallback, InterfaceC0646l<? super Throwable, p> interfaceC0646l) {
        a();
        try {
            Activity activity = this.f18205a.get();
            if (activity != null) {
                Authentication authenticate = AuthadaAuthenticationLibrary.INSTANCE.authenticate(AuthadaAuthenticationLibraryConfig.Companion.newInstance(url, str2, activity));
                this.f18206b = authenticate;
                if (authenticate != null) {
                    Authentication.DefaultImpls.start$default(authenticate, str, startCallback, (AnalyticsCallback) null, 4, (Object) null);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Activity is null".toString());
        } catch (Throwable th) {
            interfaceC0646l.invoke(th);
        }
    }

    public final void a(Pin pin, Can can, com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.b bVar, InterfaceC0646l<? super Throwable, p> interfaceC0646l) {
        int[] can2;
        if (this.f18206b == null) {
            interfaceC0646l.invoke(new h(l.q(pin.getPin()), (can == null || (can2 = can.getCan()) == null) ? null : l.q(can2)));
            return;
        }
        a aVar = new a(bVar, pin);
        if (can != null) {
            try {
                Authentication authentication = this.f18206b;
                if (authentication != null) {
                    authentication.setCan(can);
                }
            } catch (Throwable th) {
                interfaceC0646l.invoke(th);
                return;
            }
        }
        Authentication authentication2 = this.f18206b;
        if (authentication2 != null) {
            authentication2.pinAuthentication(pin, aVar);
        }
    }

    public final void a(TPin tPin, Pin pin, Can can, Integer num, c cVar, InterfaceC0646l<? super Throwable, p> interfaceC0646l) {
        PinChanger pinChanger;
        b bVar = new b(cVar, tPin, pin, num);
        try {
            Activity activity = this.f18205a.get();
            if (activity != null) {
                PinChanger pinChanger2 = AuthadaAuthenticationLibrary.INSTANCE.pinChanger();
                this.f18207c = pinChanger2;
                if (can != null && pinChanger2 != null) {
                    pinChanger2.setCan(can);
                }
                if (num != null && (pinChanger = this.f18207c) != null) {
                    pinChanger._useForTestingOnlySetSixthDigitOfOldPin(num.intValue());
                }
                PinChanger pinChanger3 = this.f18207c;
                if (pinChanger3 != null) {
                    pinChanger3.changeFiveDigitPin(tPin, pin, activity, bVar);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Activity is null".toString());
        } catch (Throwable th) {
            interfaceC0646l.invoke(th);
        }
    }

    public final void a(Puk puk, UnblockerCallback unblockerCallback, InterfaceC0646l<? super Throwable, p> interfaceC0646l) {
        try {
            Activity activity = this.f18205a.get();
            if (activity != null) {
                Unblocker unblocker = AuthadaAuthenticationLibrary.INSTANCE.unblocker();
                this.f18208d = unblocker;
                if (unblocker != null) {
                    unblocker.unblock(puk, activity, unblockerCallback);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Activity is null".toString());
        } catch (Throwable th) {
            interfaceC0646l.invoke(th);
        }
    }
}
