package com.google.android.gms.internal.gtm;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
public final class zzvr extends zzsj<String> implements RandomAccess, zzvs {
    public static final zzvs zza;
    private static final zzvr zzb;
    private final List<Object> zzc;

    static {
        zzvr zzvrVar = new zzvr(10);
        zzb = zzvrVar;
        zzvrVar.zzb();
        zza = zzvrVar;
    }

    public zzvr() {
        this(10);
    }

    private static String zzj(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zztd ? ((zztd) obj).zzr(zzvi.zza) : zzvi.zzh((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.gtm.zzsj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zza();
        this.zzc.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.gtm.zzsj, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        zza();
        if (collection instanceof zzvs) {
            collection = ((zzvs) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.gtm.zzsj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.gtm.zzsj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        Object remove = this.zzc.remove(i);
        ((AbstractList) this).modCount++;
        return zzj(remove);
    }

    @Override // com.google.android.gms.internal.gtm.zzsj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zza();
        return zzj(this.zzc.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.gtm.zzvh
    public final /* bridge */ /* synthetic */ zzvh zzd(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zzc);
        return new zzvr((ArrayList<Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.gtm.zzvs
    public final zzvs zze() {
        return zzc() ? new zzxt(this) : this;
    }

    @Override // com.google.android.gms.internal.gtm.zzvs
    public final Object zzf(int i) {
        return this.zzc.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zztd) {
            zztd zztdVar = (zztd) obj;
            String zzr = zztdVar.zzr(zzvi.zza);
            if (zztdVar.zzj()) {
                this.zzc.set(i, zzr);
            }
            return zzr;
        }
        byte[] bArr = (byte[]) obj;
        String zzh = zzvi.zzh(bArr);
        if (zzvi.zzj(bArr)) {
            this.zzc.set(i, zzh);
        }
        return zzh;
    }

    @Override // com.google.android.gms.internal.gtm.zzvs
    public final List<?> zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.gtm.zzvs
    public final void zzi(zztd zztdVar) {
        zza();
        this.zzc.add(zztdVar);
        ((AbstractList) this).modCount++;
    }

    public zzvr(int i) {
        this.zzc = new ArrayList(i);
    }

    private zzvr(ArrayList<Object> arrayList) {
        this.zzc = arrayList;
    }

    @Override // com.google.android.gms.internal.gtm.zzsj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
