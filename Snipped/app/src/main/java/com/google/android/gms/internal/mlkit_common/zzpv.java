package com.google.android.gms.internal.mlkit_common;

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

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final class zzpv implements zzpf {
    private Provider zza;
    private final Provider zzb;
    private final zzph zzc;

    public zzpv(Context context, zzph zzphVar) {
        this.zzc = zzphVar;
        C0794a c0794a = C0794a.f21026e;
        o.b(context);
        final C0893l c2 = o.a().c(c0794a);
        if (C0794a.f21025d.contains(new b("json"))) {
            this.zza = new Lazy(new Provider() { // from class: com.google.android.gms.internal.mlkit_common.zzps
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return f.this.a("FIREBASE_ML_SDK", new b("json"), new d() { // from class: com.google.android.gms.internal.mlkit_common.zzpu
                        @Override // g2.d
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new Lazy(new Provider() { // from class: com.google.android.gms.internal.mlkit_common.zzpt
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return f.this.a("FIREBASE_ML_SDK", new b("proto"), new d() { // from class: com.google.android.gms.internal.mlkit_common.zzpr
                    @Override // g2.d
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    public static c zzb(zzph zzphVar, zzpe zzpeVar) {
        return new C0759a(zzpeVar.zze(zzphVar.zza(), false), Priority.f8902b);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpf
    public final void zza(zzpe zzpeVar) {
        if (this.zzc.zza() != 0) {
            ((e) this.zzb.get()).a(zzb(this.zzc, zzpeVar));
            return;
        }
        Provider provider = this.zza;
        if (provider != null) {
            ((e) provider.get()).a(zzb(this.zzc, zzpeVar));
        }
    }
}
