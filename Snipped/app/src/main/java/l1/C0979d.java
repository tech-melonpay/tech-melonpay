package l1;

import N2.o;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.util.ArrayList;
import l1.f;
import m0.i;
import o0.C1085a;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: AnimatedVectorDrawableCompat.java */
/* renamed from: l1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0979d extends AbstractC0980e implements Animatable {

    /* renamed from: b, reason: collision with root package name */
    public final b f23468b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f23469c;

    /* renamed from: d, reason: collision with root package name */
    public o f23470d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<AbstractC0978c> f23471e;

    /* renamed from: f, reason: collision with root package name */
    public final a f23472f;

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* renamed from: l1.d$a */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            C0979d.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            C0979d.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C0979d.this.unscheduleSelf(runnable);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* renamed from: l1.d$b */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public f f23474a;

        /* renamed from: b, reason: collision with root package name */
        public AnimatorSet f23475b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList<Animator> f23476c;

        /* renamed from: d, reason: collision with root package name */
        public androidx.collection.a<Animator, String> f23477d;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public C0979d(Context context) {
        this.f23470d = null;
        this.f23471e = null;
        this.f23472f = new a();
        this.f23469c = context;
        this.f23468b = new b();
    }

    @Override // l1.AbstractC0980e, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.f23468b;
        bVar.f23474a.draw(canvas);
        if (bVar.f23475b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f23479a;
        return drawable != null ? drawable.getAlpha() : this.f23468b.f23474a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f23468b.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f23479a;
        return drawable != null ? drawable.getColorFilter() : this.f23468b.f23474a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f23479a != null) {
            return new c(this.f23479a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f23479a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f23468b.f23474a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f23479a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f23468b.f23474a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f23479a;
        return drawable != null ? drawable.getOpacity() : this.f23468b.f23474a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        b bVar;
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            bVar = this.f23468b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray e10 = i.e(resources, theme, attributeSet, C0976a.f23464e);
                    int resourceId = e10.getResourceId(0, 0);
                    if (resourceId != 0) {
                        f fVar = new f();
                        ThreadLocal<TypedValue> threadLocal = m0.f.f23858a;
                        fVar.f23479a = resources.getDrawable(resourceId, theme);
                        new f.h(fVar.f23479a.getConstantState());
                        fVar.f23485f = false;
                        fVar.setCallback(this.f23472f);
                        f fVar2 = bVar.f23474a;
                        if (fVar2 != null) {
                            fVar2.setCallback(null);
                        }
                        bVar.f23474a = fVar;
                    }
                    e10.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0976a.f23465f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f23469c;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(bVar.f23474a.f23481b.f23529b.f23527o.get(string));
                        if (bVar.f23476c == null) {
                            bVar.f23476c = new ArrayList<>();
                            bVar.f23477d = new androidx.collection.a<>();
                        }
                        bVar.f23476c.add(loadAnimator);
                        bVar.f23477d.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (bVar.f23475b == null) {
            bVar.f23475b = new AnimatorSet();
        }
        bVar.f23475b.playTogether(bVar.f23476c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f23479a;
        return drawable != null ? drawable.isAutoMirrored() : this.f23468b.f23474a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f23479a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f23468b.f23475b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f23479a;
        return drawable != null ? drawable.isStateful() : this.f23468b.f23474a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f23468b.f23474a.setBounds(rect);
        }
    }

    @Override // l1.AbstractC0980e, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f23479a;
        return drawable != null ? drawable.setLevel(i) : this.f23468b.f23474a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f23479a;
        return drawable != null ? drawable.setState(iArr) : this.f23468b.f23474a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f23468b.f23474a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f23468b.f23474a.setAutoMirrored(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f23468b.f23474a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            C1085a.a(drawable, i);
        } else {
            this.f23468b.f23474a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            C1085a.b(drawable, colorStateList);
        } else {
            this.f23468b.f23474a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            C1085a.c(drawable, mode);
        } else {
            this.f23468b.f23474a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f23468b.f23474a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.f23468b;
        if (bVar.f23475b.isStarted()) {
            return;
        }
        bVar.f23475b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f23479a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f23468b.f23475b.end();
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* renamed from: l1.d$c */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f23478a;

        public c(Drawable.ConstantState constantState) {
            this.f23478a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f23478a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f23478a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            C0979d c0979d = new C0979d();
            Drawable newDrawable = this.f23478a.newDrawable();
            c0979d.f23479a = newDrawable;
            newDrawable.setCallback(c0979d.f23472f);
            return c0979d;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            C0979d c0979d = new C0979d();
            Drawable newDrawable = this.f23478a.newDrawable(resources);
            c0979d.f23479a = newDrawable;
            newDrawable.setCallback(c0979d.f23472f);
            return c0979d;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0979d c0979d = new C0979d();
            Drawable newDrawable = this.f23478a.newDrawable(resources, theme);
            c0979d.f23479a = newDrawable;
            newDrawable.setCallback(c0979d.f23472f);
            return c0979d;
        }
    }

    public C0979d() {
        this(null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
