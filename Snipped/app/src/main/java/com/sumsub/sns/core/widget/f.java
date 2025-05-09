package com.sumsub.sns.core.widget;

import H0.b;
import k1.AbstractC0919C;
import k1.J;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements b.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14382a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14383b;

    public /* synthetic */ f(Object obj, int i) {
        this.f14382a = i;
        this.f14383b = obj;
    }

    @Override // H0.b.q
    public final void a(H0.b bVar, boolean z10, float f10, float f11) {
        switch (this.f14382a) {
            case 0:
                SNSLivenessFaceView.m54radiusAnimation$lambda1$lambda0((SNSLivenessFaceView) this.f14383b, bVar, z10, f10, f11);
                break;
            case 1:
                SNSRotationZoomableImageView.m57rotationAnimation$lambda3$lambda2((SNSRotationZoomableImageView) this.f14383b, bVar, z10, f10, f11);
                break;
            case 2:
                SNSSegmentedToggleView.m58animator$lambda2$lambda1((SNSSegmentedToggleView) this.f14383b, bVar, z10, f10, f11);
                break;
            default:
                AbstractC0919C.f fVar = (AbstractC0919C.f) this.f14383b;
                if (!z10) {
                    com.google.android.gms.measurement.internal.a aVar = AbstractC0919C.h.f22732d;
                    AbstractC0919C abstractC0919C = fVar.f22730g;
                    if (f10 >= 1.0f) {
                        abstractC0919C.D(abstractC0919C, aVar, false);
                        break;
                    } else {
                        long j10 = abstractC0919C.f22690D;
                        AbstractC0919C U = ((J) abstractC0919C).U(0);
                        AbstractC0919C abstractC0919C2 = U.f22715x;
                        U.f22715x = null;
                        abstractC0919C.K(-1L, fVar.f22724a);
                        abstractC0919C.K(j10, -1L);
                        fVar.f22724a = j10;
                        Runnable runnable = fVar.f22729f;
                        if (runnable != null) {
                            runnable.run();
                        }
                        abstractC0919C.f22717z.clear();
                        if (abstractC0919C2 != null) {
                            abstractC0919C2.D(abstractC0919C2, aVar, true);
                            break;
                        }
                    }
                } else {
                    fVar.getClass();
                    break;
                }
                break;
        }
    }
}
