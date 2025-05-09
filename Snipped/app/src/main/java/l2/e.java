package L2;

import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import c.C0611b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Objects;

/* compiled from: MaterialBackOrchestrator.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final a f2475a;

    /* renamed from: b, reason: collision with root package name */
    public final L2.b f2476b;

    /* renamed from: c, reason: collision with root package name */
    public final View f2477c;

    /* compiled from: MaterialBackOrchestrator.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public OnBackInvokedCallback f2478a;

        public OnBackInvokedCallback a(L2.b bVar) {
            Objects.requireNonNull(bVar);
            return new d(bVar, 0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:
        
            r3 = r3.findOnBackInvokedDispatcher();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void b(L2.b r2, android.view.View r3, boolean r4) {
            /*
                r1 = this;
                android.window.OnBackInvokedCallback r0 = r1.f2478a
                if (r0 == 0) goto L5
                return
            L5:
                android.window.OnBackInvokedDispatcher r3 = L2.c.k(r3)
                if (r3 != 0) goto Lc
                return
            Lc:
                android.window.OnBackInvokedCallback r2 = r1.a(r2)
                r1.f2478a = r2
                if (r4 == 0) goto L18
                r4 = 1000000(0xf4240, float:1.401298E-39)
                goto L19
            L18:
                r4 = 0
            L19:
                L2.c.s(r3, r4, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: L2.e.a.b(L2.b, android.view.View, boolean):void");
        }

        public void c(View view) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (findOnBackInvokedDispatcher == null) {
                return;
            }
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f2478a);
            this.f2478a = null;
        }
    }

    /* compiled from: MaterialBackOrchestrator.java */
    public static class b extends a {

        /* compiled from: MaterialBackOrchestrator.java */
        public class a implements OnBackAnimationCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ L2.b f2479a;

            public a(L2.b bVar) {
                this.f2479a = bVar;
            }

            public final void onBackCancelled() {
                if (b.this.f2478a != null) {
                    this.f2479a.cancelBackProgress();
                }
            }

            public final void onBackInvoked() {
                this.f2479a.handleBackInvoked();
            }

            public final void onBackProgressed(BackEvent backEvent) {
                if (b.this.f2478a != null) {
                    this.f2479a.updateBackProgress(new C0611b(backEvent));
                }
            }

            public final void onBackStarted(BackEvent backEvent) {
                if (b.this.f2478a != null) {
                    this.f2479a.startBackProgress(new C0611b(backEvent));
                }
            }
        }

        @Override // L2.e.a
        public final OnBackInvokedCallback a(L2.b bVar) {
            return new a(bVar);
        }
    }

    public e(BottomSheetBehavior bottomSheetBehavior, FrameLayout frameLayout) {
        int i = Build.VERSION.SDK_INT;
        this.f2475a = i >= 34 ? new b() : i >= 33 ? new a() : null;
        this.f2476b = bottomSheetBehavior;
        this.f2477c = frameLayout;
    }
}
