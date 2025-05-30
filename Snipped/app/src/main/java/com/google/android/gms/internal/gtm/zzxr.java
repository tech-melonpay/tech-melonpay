package com.google.android.gms.internal.gtm;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzxr implements ListIterator<String> {
    final ListIterator<String> zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzxt zzc;

    public zzxr(zzxt zzxtVar, int i) {
        zzvs zzvsVar;
        this.zzc = zzxtVar;
        this.zzb = i;
        zzvsVar = zzxtVar.zza;
        this.zza = zzvsVar.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zza.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.zza.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zza.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ String previous() {
        return this.zza.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zza.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
