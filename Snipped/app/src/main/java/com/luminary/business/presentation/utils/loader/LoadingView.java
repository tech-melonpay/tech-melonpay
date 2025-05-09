package com.luminary.business.presentation.utils.loader;

import android.R;
import android.app.Dialog;
import android.view.Window;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: LoadingView.kt */
/* loaded from: classes2.dex */
public final class LoadingView extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    public CoroutineScope f13337a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13338b;

    /* renamed from: c, reason: collision with root package name */
    public long f13339c;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.f13338b) {
            this.f13338b = false;
            super.dismiss();
        }
        if (!isShowing() || this.f13339c == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f13339c;
        this.f13339c = 0L;
        if (currentTimeMillis >= 500) {
            super.dismiss();
        } else {
            BuildersKt__Builders_commonKt.launch$default(this.f13337a, null, null, new LoadingView$dismiss$1(currentTimeMillis, this, null), 3, null);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoroutineScopeKt.cancel$default(this.f13337a, null, 1, null);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        CompletableJob Job$default;
        super.onStart();
        MainCoroutineDispatcher main = Dispatchers.getMain();
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.f13337a = CoroutineScopeKt.CoroutineScope(main.plus(Job$default));
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(2);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawableResource(R.color.transparent);
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        if (!isShowing()) {
            this.f13339c = System.currentTimeMillis();
        }
        super.show();
    }
}
