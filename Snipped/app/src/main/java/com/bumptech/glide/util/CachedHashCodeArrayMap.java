package com.bumptech.glide.util;

import androidx.collection.a;
import androidx.collection.g;

/* loaded from: classes.dex */
public final class CachedHashCodeArrayMap<K, V> extends a<K, V> {
    private int hashCode;

    @Override // androidx.collection.g, java.util.Map
    public void clear() {
        this.hashCode = 0;
        super.clear();
    }

    @Override // androidx.collection.g, java.util.Map
    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = super.hashCode();
        }
        return this.hashCode;
    }

    @Override // androidx.collection.g, java.util.Map
    public V put(K k3, V v10) {
        this.hashCode = 0;
        return (V) super.put(k3, v10);
    }

    @Override // androidx.collection.g
    public void putAll(g<? extends K, ? extends V> gVar) {
        this.hashCode = 0;
        super.putAll(gVar);
    }

    @Override // androidx.collection.g
    public V removeAt(int i) {
        this.hashCode = 0;
        return (V) super.removeAt(i);
    }

    @Override // androidx.collection.g
    public V setValueAt(int i, V v10) {
        this.hashCode = 0;
        return (V) super.setValueAt(i, v10);
    }
}
