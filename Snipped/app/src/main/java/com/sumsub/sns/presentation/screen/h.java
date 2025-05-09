package com.sumsub.sns.presentation.screen;

import O9.p;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.core.presentation.base.a.l;
import com.sumsub.sns.internal.core.common.k0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/sumsub/sns/presentation/screen/h;", "Lcom/sumsub/sns/core/presentation/base/a$l;", "S", "Lcom/sumsub/sns/core/presentation/base/a;", "VM", "Lcom/sumsub/sns/core/presentation/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "LO9/p;", "onViewModelPrepared", "(Landroid/os/Bundle;)V", "", FirebaseAnalytics.Param.SUCCESS, "Landroid/os/Parcelable;", "payload", "a", "(ZLandroid/os/Parcelable;)V", "Lcom/sumsub/sns/internal/core/domain/model/c;", "introParams", "(Lcom/sumsub/sns/internal/core/domain/model/c;Landroid/os/Parcelable;)LO9/p;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class h<S extends a.l, VM extends com.sumsub.sns.core.presentation.base.a<S>> extends com.sumsub.sns.core.presentation.b<S, VM> {
    public void a(boolean success, Parcelable payload) {
    }

    @Override // com.sumsub.sns.core.presentation.b
    public void onViewModelPrepared(Bundle savedInstanceState) {
        super.onViewModelPrepared(savedInstanceState);
        requireActivity().getSupportFragmentManager().g0("instructions_request_key", this, new com.sumsub.sns.geo.presentation.d(this, 4));
    }

    public static final void a(h hVar, String str, Bundle bundle) {
        hVar.a(com.sumsub.sns.core.presentation.b.INSTANCE.b(bundle), bundle.getParcelable("payload"));
    }

    public final p a(com.sumsub.sns.internal.core.domain.model.c introParams, Parcelable payload) {
        k0 appListener = getAppListener();
        if (appListener == null) {
            return null;
        }
        appListener.a(introParams, payload);
        return p.f3034a;
    }
}
