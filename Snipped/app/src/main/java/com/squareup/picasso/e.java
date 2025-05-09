package com.squareup.picasso;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.m;

/* compiled from: ContentStreamRequestHandler.java */
/* loaded from: classes2.dex */
public class e extends m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13439a;

    public e(Context context) {
        this.f13439a = context;
    }

    @Override // com.squareup.picasso.m
    public boolean b(k kVar) {
        return FirebaseAnalytics.Param.CONTENT.equals(kVar.f13467c.getScheme());
    }

    @Override // com.squareup.picasso.m
    public m.a e(k kVar, int i) {
        return new m.a(Ja.a.C(this.f13439a.getContentResolver().openInputStream(kVar.f13467c)), Picasso.LoadedFrom.DISK);
    }
}
