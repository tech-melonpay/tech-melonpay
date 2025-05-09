package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import com.google.android.datatransport.Priority;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;
import g2.C0759a;
import g2.b;
import g2.c;
import g2.d;
import g2.e;
import g2.f;
import h2.C0794a;
import j2.C0893l;
import j2.o;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes.dex */
public final class zzmp implements zzmc {
    private Provider zza;
    private final Provider zzb;
    private final zzme zzc;

    public zzmp(Context context, zzme zzmeVar) {
        this.zzc = zzmeVar;
        C0794a c0794a = C0794a.f21026e;
        o.b(context);
        final C0893l c2 = o.a().c(c0794a);
        if (C0794a.f21025d.contains(new b("json"))) {
            this.zza = new Lazy(new Provider() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmm
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return f.this.a("FIREBASE_ML_SDK", new b("json"), new d() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmo
                        @Override // g2.d
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new Lazy(new Provider() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmn
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return f.this.a("FIREBASE_ML_SDK", new b("proto"), new d() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzml
                    @Override // g2.d
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    public static c zzb(zzme zzmeVar, zzmb zzmbVar) {
        return new C0759a(zzmbVar.zzd(zzmeVar.zza(), false), Priority.f8902b);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmc
    public final void zza(zzmb zzmbVar) {
        if (this.zzc.zza() != 0) {
            ((e) this.zzb.get()).a(zzb(this.zzc, zzmbVar));
            return;
        }
        Provider provider = this.zza;
        if (provider != null) {
            ((e) provider.get()).a(zzb(this.zzc, zzmbVar));
        }
    }
}
