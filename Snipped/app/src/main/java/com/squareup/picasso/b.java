package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.m;

/* compiled from: AssetRequestHandler.java */
/* loaded from: classes2.dex */
public final class b extends m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13407a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13408b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public AssetManager f13409c;

    public b(Context context) {
        this.f13407a = context;
    }

    @Override // com.squareup.picasso.m
    public final boolean b(k kVar) {
        Uri uri = kVar.f13467c;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // com.squareup.picasso.m
    public final m.a e(k kVar, int i) {
        if (this.f13409c == null) {
            synchronized (this.f13408b) {
                try {
                    if (this.f13409c == null) {
                        this.f13409c = this.f13407a.getAssets();
                    }
                } finally {
                }
            }
        }
        return new m.a(Ja.a.C(this.f13409c.open(kVar.f13467c.toString().substring(22))), Picasso.LoadedFrom.DISK);
    }
}
