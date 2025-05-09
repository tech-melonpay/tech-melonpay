package com.squareup.picasso;

import P8.e;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.k;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: RequestCreator.java */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicInteger f13488c = new AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public final Picasso f13489a;

    /* renamed from: b, reason: collision with root package name */
    public final k.a f13490b;

    public l(Picasso picasso, Uri uri) {
        this.f13489a = picasso;
        k.a aVar = new k.a();
        aVar.f13482a = uri;
        aVar.f13483b = 0;
        aVar.f13486e = picasso.f13381k;
        this.f13490b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ImageView imageView) {
        long nanoTime = System.nanoTime();
        StringBuilder sb2 = o.f13496a;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
        if (imageView == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        k.a aVar = this.f13490b;
        if (aVar.f13482a == null && aVar.f13483b == 0) {
            this.f13489a.a(imageView);
            Paint paint = i.f13455h;
            imageView.setImageDrawable(null);
            if (imageView.getDrawable() instanceof Animatable) {
                ((Animatable) imageView.getDrawable()).start();
                return;
            }
            return;
        }
        int andIncrement = f13488c.getAndIncrement();
        k.a aVar2 = this.f13490b;
        if (aVar2.f13487f == null) {
            aVar2.f13487f = Picasso.Priority.f13390b;
        }
        k kVar = new k(aVar2.f13482a, aVar2.f13483b, aVar2.f13484c, aVar2.f13485d, aVar2.f13486e, aVar2.f13487f);
        kVar.f13465a = andIncrement;
        kVar.f13466b = nanoTime;
        boolean z10 = this.f13489a.f13383m;
        if (z10) {
            o.c("Main", "created", kVar.d(), kVar.toString());
        }
        Picasso.d dVar = this.f13489a.f13373b;
        k f10 = dVar.f(kVar);
        if (f10 == null) {
            throw new IllegalStateException("Request transformer " + dVar.getClass().getCanonicalName() + " returned null for " + kVar);
        }
        if (f10 != kVar) {
            f10.f13465a = andIncrement;
            f10.f13466b = nanoTime;
            if (z10) {
                o.c("Main", "changed", f10.b(), "into " + f10);
            }
        }
        StringBuilder sb3 = o.f13496a;
        Uri uri = f10.f13467c;
        if (uri != null) {
            String uri2 = uri.toString();
            sb3.ensureCapacity(uri2.length() + 50);
            sb3.append(uri2);
        } else {
            sb3.ensureCapacity(50);
            sb3.append(f10.f13468d);
        }
        sb3.append('\n');
        float f11 = f10.f13475l;
        if (f11 != 0.0f) {
            sb3.append("rotation:");
            sb3.append(f11);
            if (f10.f13478o) {
                sb3.append('@');
                sb3.append(f10.f13476m);
                sb3.append('x');
                sb3.append(f10.f13477n);
            }
            sb3.append('\n');
        }
        if (f10.a()) {
            sb3.append("resize:");
            sb3.append(f10.f13470f);
            sb3.append('x');
            sb3.append(f10.f13471g);
            sb3.append('\n');
        }
        if (f10.f13472h) {
            sb3.append("centerCrop:");
            sb3.append(f10.i);
            sb3.append('\n');
        } else if (f10.f13473j) {
            sb3.append("centerInside");
            sb3.append('\n');
        }
        List<P8.j> list = f10.f13469e;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb3.append(list.get(i).a());
                sb3.append('\n');
            }
        }
        String sb4 = sb3.toString();
        sb3.setLength(0);
        Picasso picasso = this.f13489a;
        e.a aVar3 = ((P8.e) picasso.f13377f).f3103a.get(sb4);
        Bitmap bitmap = aVar3 != null ? aVar3.f3104a : null;
        P8.h hVar = picasso.f13378g;
        if (bitmap != null) {
            hVar.f3115b.sendEmptyMessage(0);
        } else {
            hVar.f3115b.sendEmptyMessage(1);
        }
        if (bitmap == null) {
            Paint paint2 = i.f13455h;
            imageView.setImageDrawable(null);
            if (imageView.getDrawable() instanceof Animatable) {
                ((Animatable) imageView.getDrawable()).start();
            }
            this.f13489a.c(new h(this.f13489a, imageView, f10, sb4));
            return;
        }
        this.f13489a.a(imageView);
        Picasso picasso2 = this.f13489a;
        Context context = picasso2.f13375d;
        Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.MEMORY;
        boolean z11 = picasso2.f13382l;
        Paint paint3 = i.f13455h;
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new i(context, bitmap, drawable, loadedFrom, false, z11));
        if (this.f13489a.f13383m) {
            o.c("Main", "completed", f10.d(), "from " + loadedFrom);
        }
    }
}
