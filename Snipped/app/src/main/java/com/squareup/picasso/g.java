package com.squareup.picasso;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.m;

/* compiled from: FileRequestHandler.java */
/* loaded from: classes2.dex */
public final class g extends e {
    @Override // com.squareup.picasso.e, com.squareup.picasso.m
    public final boolean b(k kVar) {
        return "file".equals(kVar.f13467c.getScheme());
    }

    @Override // com.squareup.picasso.e, com.squareup.picasso.m
    public final m.a e(k kVar, int i) {
        return new m.a(null, Ja.a.C(this.f13439a.getContentResolver().openInputStream(kVar.f13467c)), Picasso.LoadedFrom.DISK, new L0.a(kVar.f13467c.getPath()).e(1, "Orientation"));
    }
}
