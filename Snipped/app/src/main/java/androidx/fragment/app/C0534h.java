package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: FragmentAnim.java */
/* renamed from: androidx.fragment.app.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0534h {
    public static int a(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* compiled from: FragmentAnim.java */
    /* renamed from: androidx.fragment.app.h$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f6859a;

        /* renamed from: b, reason: collision with root package name */
        public final AnimatorSet f6860b;

        public a(Animation animation) {
            this.f6859a = animation;
            this.f6860b = null;
        }

        public a(Animator animator) {
            this.f6859a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f6860b = animatorSet;
            animatorSet.play(animator);
        }
    }

    /* compiled from: FragmentAnim.java */
    /* renamed from: androidx.fragment.app.h$b */
    public static class b extends AnimationSet implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final ViewGroup f6861a;

        /* renamed from: b, reason: collision with root package name */
        public final View f6862b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f6863c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f6864d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f6865e;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f6865e = true;
            this.f6861a = viewGroup;
            this.f6862b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j10, Transformation transformation) {
            this.f6865e = true;
            if (this.f6863c) {
                return !this.f6864d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f6863c = true;
                y0.s.a(this.f6861a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10 = this.f6863c;
            ViewGroup viewGroup = this.f6861a;
            if (z10 || !this.f6865e) {
                viewGroup.endViewTransition(this.f6862b);
                this.f6864d = true;
            } else {
                this.f6865e = false;
                viewGroup.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f6865e = true;
            if (this.f6863c) {
                return !this.f6864d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f6863c = true;
                y0.s.a(this.f6861a, this);
            }
            return true;
        }
    }
}
