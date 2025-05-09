package B2;

import a3.InterfaceFutureC0509a;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoEncoderSession;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.n;
import androidx.camera.view.c;
import androidx.core.widget.NestedScrollView;
import androidx.emoji2.text.d;
import androidx.emoji2.text.g;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.x;
import androidx.lifecycle.C0553t;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.room.InvalidationTracker;
import ca.InterfaceC0635a;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.luminary.business.presentation.ui.fragments.auth.register.RegisterFragment;
import com.luminary.business.presentation.ui.fragments.cards.topup.TopUpFragment;
import com.luminary.business.presentation.ui.fragments.hub.HubFragment;
import com.luminary.business.presentation.ui.fragments.invoices.InvoicesDateFragment;
import com.luminary.business.presentation.ui.fragments.newcard.cardtype.SelectCardTypeFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.selectcountry.SelectCountryFragment;
import j1.C0880a;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$ObjectRef;
import n0.k;
import u0.C1507k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f285b;

    public /* synthetic */ d(AudioSource.c cVar, boolean z10) {
        this.f284a = 6;
        this.f285b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f284a) {
            case 0:
                ((CarouselLayoutManager) this.f285b).s();
                return;
            case 1:
                Logger.d("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
                if (H.f.f1368a.get(H.e.class) != null) {
                    Recorder.p((androidx.camera.video.internal.encoder.a) this.f285b);
                    return;
                }
                return;
            case 2:
                ((n) this.f285b).notifyReset();
                return;
            case 3:
                ((VideoEncoderSession) this.f285b).f5558k.b(null);
                return;
            case 4:
                ((HubFragment) this.f285b).u0().f28794n.smoothScrollToPosition(0);
                return;
            case 5:
                ((InvoicesDateFragment) this.f285b).u0().f28961p.scrollToPosition(0);
                return;
            case 6:
                ((AudioSource.c) this.f285b).getClass();
                return;
            case 7:
                NestedScrollView nestedScrollView = (NestedScrollView) this.f285b;
                nestedScrollView.p(0, (nestedScrollView.getPaddingBottom() + nestedScrollView.getChildAt(nestedScrollView.getChildCount() - 1).getBottom()) - (nestedScrollView.getHeight() + nestedScrollView.getScrollY()), false);
                return;
            case 8:
                g.b bVar = (g.b) this.f285b;
                synchronized (bVar.f6585d) {
                    try {
                        if (bVar.f6589h == null) {
                            return;
                        }
                        try {
                            C1507k d10 = bVar.d();
                            int i = d10.f30120e;
                            if (i == 2) {
                                synchronized (bVar.f6585d) {
                                }
                            }
                            if (i != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                            }
                            try {
                                int i9 = t0.j.f27405a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                g.a aVar = bVar.f6584c;
                                Context context = bVar.f6582a;
                                aVar.getClass();
                                C1507k[] c1507kArr = {d10};
                                n0.j jVar = n0.e.f24073a;
                                C0880a.a("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface b9 = n0.e.f24073a.b(context, c1507kArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer e10 = k.e(bVar.f6582a, d10.f30116a);
                                    if (e10 == null || b9 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        androidx.emoji2.text.h hVar = new androidx.emoji2.text.h(b9, I0.d.b(e10));
                                        Trace.endSection();
                                        synchronized (bVar.f6585d) {
                                            try {
                                                d.i iVar = bVar.f6589h;
                                                if (iVar != null) {
                                                    iVar.b(hVar);
                                                }
                                            } finally {
                                            }
                                        }
                                        bVar.b();
                                        return;
                                    } finally {
                                        int i10 = t0.j.f27405a;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (bVar.f6585d) {
                                try {
                                    d.i iVar2 = bVar.f6589h;
                                    if (iVar2 != null) {
                                        iVar2.a(th2);
                                    }
                                    bVar.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 9:
                Log.e("registerToken", "result: " + ((String) this.f285b));
                return;
            case 10:
                SelectCardTypeFragment selectCardTypeFragment = (SelectCardTypeFragment) this.f285b;
                if (selectCardTypeFragment.f12400p0 == 0) {
                    selectCardTypeFragment.f12400p0 = 23561;
                }
                selectCardTypeFragment.u0().f27914o.smoothScrollToPosition(selectCardTypeFragment.f12400p0);
                return;
            case 11:
                ((M.b) ((c.a) this.f285b)).b();
                return;
            case 12:
                ((RegisterFragment) this.f285b).s0 = true;
                return;
            case 13:
                SideSheetBehavior.c cVar = (SideSheetBehavior.c) this.f285b;
                cVar.f9734b = false;
                SideSheetBehavior sideSheetBehavior = cVar.f9736d;
                E0.c cVar2 = sideSheetBehavior.f9715j;
                if (cVar2 != null && cVar2.f()) {
                    cVar.a(cVar.f9733a);
                    return;
                } else {
                    if (sideSheetBehavior.i == 2) {
                        sideSheetBehavior.setStateInternal(cVar.f9733a);
                        return;
                    }
                    return;
                }
            case 14:
                ((X2.d) this.f285b).t(true);
                return;
            case 15:
                X2.h hVar2 = (X2.h) this.f285b;
                boolean isPopupShowing = hVar2.f3969h.isPopupShowing();
                hVar2.t(isPopupShowing);
                hVar2.f3973m = isPopupShowing;
                return;
            case 16:
                ((TextInputLayout) this.f285b).lambda$onGlobalLayout$1();
                return;
            case 17:
                ((SelectCountryFragment) this.f285b).U0();
                return;
            case 18:
                TopUpFragment topUpFragment = (TopUpFragment) this.f285b;
                if (topUpFragment.isAdded()) {
                    topUpFragment.T0();
                    return;
                }
                return;
            case 19:
                ((CameraStateRegistry.OnOpenAvailableListener) this.f285b).onOpenAvailable();
                return;
            case 20:
                ((CameraStateRegistry.OnConfigureAvailableListener) this.f285b).onConfigureAvailable();
                return;
            case 21:
                ((InterfaceFutureC0509a) this.f285b).cancel(true);
                return;
            case 22:
                InterfaceC0635a interfaceC0635a = (InterfaceC0635a) ((Ref$ObjectRef) this.f285b).f23179a;
                if (interfaceC0635a != null) {
                    interfaceC0635a.invoke();
                    return;
                }
                return;
            case 23:
                x.c(4, (ArrayList) this.f285b);
                return;
            case 24:
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Transition for all operations has completed");
                }
                DefaultSpecialEffectsController.TransitionEffect transitionEffect = (DefaultSpecialEffectsController.TransitionEffect) this.f285b;
                Iterator<T> it = transitionEffect.f6629c.iterator();
                while (it.hasNext()) {
                    ((DefaultSpecialEffectsController.g) it.next()).f6670a.c(transitionEffect);
                }
                return;
            case 25:
                ((Fragment) this.f285b).lambda$performCreateView$0();
                return;
            case 26:
                Iterator<FragmentManager.n> it2 = ((FragmentManager) this.f285b).f6746o.iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                }
                return;
            case 27:
                ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) this.f285b;
                int i11 = processLifecycleOwner.f7008b;
                C0553t c0553t = processLifecycleOwner.f7012f;
                if (i11 == 0) {
                    processLifecycleOwner.f7009c = true;
                    c0553t.f(Lifecycle.Event.ON_PAUSE);
                }
                if (processLifecycleOwner.f7007a == 0 && processLifecycleOwner.f7009c) {
                    c0553t.f(Lifecycle.Event.ON_STOP);
                    processLifecycleOwner.f7010d = true;
                    return;
                }
                return;
            case 28:
                ((InvalidationTracker) this.f285b).onAutoCloseCallback();
                return;
            default:
                ComponentActivity.f fVar = (ComponentActivity.f) this.f285b;
                Runnable runnable = fVar.f4543b;
                if (runnable != null) {
                    runnable.run();
                    fVar.f4543b = null;
                    return;
                }
                return;
        }
    }

    public /* synthetic */ d(Object obj, int i) {
        this.f284a = i;
        this.f285b = obj;
    }
}
