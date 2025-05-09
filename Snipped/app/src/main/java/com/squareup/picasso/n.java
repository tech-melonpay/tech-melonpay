package com.squareup.picasso;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.m;
import java.io.FileNotFoundException;
import java.util.List;

/* compiled from: ResourceRequestHandler.java */
/* loaded from: classes2.dex */
public final class n extends m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13495a;

    public n(Context context) {
        this.f13495a = context;
    }

    @Override // com.squareup.picasso.m
    public final boolean b(k kVar) {
        if (kVar.f13468d != 0) {
            return true;
        }
        return "android.resource".equals(kVar.f13467c.getScheme());
    }

    @Override // com.squareup.picasso.m
    public final m.a e(k kVar, int i) {
        Resources resources;
        int parseInt;
        StringBuilder sb2 = o.f13496a;
        int i9 = kVar.f13468d;
        Context context = this.f13495a;
        Uri uri = kVar.f13467c;
        if (i9 != 0 || uri == null) {
            resources = context.getResources();
        } else {
            String authority = uri.getAuthority();
            if (authority == null) {
                throw new FileNotFoundException(com.google.android.gms.measurement.internal.a.h("No package provided: ", uri));
            }
            try {
                resources = context.getPackageManager().getResourcesForApplication(authority);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new FileNotFoundException(com.google.android.gms.measurement.internal.a.h("Unable to obtain resources for package: ", uri));
            }
        }
        int i10 = kVar.f13468d;
        if (i10 == 0 && uri != null) {
            String authority2 = uri.getAuthority();
            if (authority2 == null) {
                throw new FileNotFoundException(com.google.android.gms.measurement.internal.a.h("No package provided: ", uri));
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                throw new FileNotFoundException(com.google.android.gms.measurement.internal.a.h("No path segments: ", uri));
            }
            if (pathSegments.size() == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused2) {
                    throw new FileNotFoundException(com.google.android.gms.measurement.internal.a.h("Last path segment is not a resource ID: ", uri));
                }
            } else {
                if (pathSegments.size() != 2) {
                    throw new FileNotFoundException(com.google.android.gms.measurement.internal.a.h("More than two path segments: ", uri));
                }
                parseInt = resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
            }
            i10 = parseInt;
        }
        BitmapFactory.Options c2 = m.c(kVar);
        if (c2 != null && c2.inJustDecodeBounds) {
            BitmapFactory.decodeResource(resources, i10, c2);
            m.a(kVar.f13470f, kVar.f13471g, c2.outWidth, c2.outHeight, c2, kVar);
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i10, c2);
        Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.DISK;
        if (decodeResource != null) {
            return new m.a(decodeResource, null, loadedFrom, 0);
        }
        throw new NullPointerException("bitmap == null");
    }
}
