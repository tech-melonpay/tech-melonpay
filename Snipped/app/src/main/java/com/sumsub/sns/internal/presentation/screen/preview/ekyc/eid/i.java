package com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class i extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final a f18221b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final IntentFilter f18222c = new IntentFilter("android.nfc.action.ADAPTER_STATE_CHANGED");

    /* renamed from: a, reason: collision with root package name */
    public final b f18223a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IntentFilter a() {
            return i.f18222c;
        }

        public a() {
        }
    }

    public interface b {
        void b();

        void d();
    }

    public i(b bVar) {
        this.f18223a = bVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (kotlin.jvm.internal.f.b(intent != null ? intent.getAction() : null, "android.nfc.action.ADAPTER_STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.nfc.extra.ADAPTER_STATE", 1);
            if (intExtra == 1) {
                this.f18223a.b();
                return;
            }
            if (intExtra == 2) {
                this.f18223a.d();
            } else if (intExtra == 3) {
                this.f18223a.d();
            } else {
                if (intExtra != 4) {
                    return;
                }
                this.f18223a.b();
            }
        }
    }
}
