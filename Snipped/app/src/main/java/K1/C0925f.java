package k1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.luminary.mobile.R;
import java.util.HashMap;
import k1.AbstractC0919C;
import k1.C0938t;
import k1.K;

/* compiled from: ChangeImageTransform.java */
/* renamed from: k1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0925f extends AbstractC0919C {

    /* renamed from: K, reason: collision with root package name */
    public static final String[] f22850K = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* renamed from: L, reason: collision with root package name */
    public static final a f22851L = new a();

    /* renamed from: M, reason: collision with root package name */
    public static final b f22852M = new b(Matrix.class, "animatedTransform");

    /* compiled from: ChangeImageTransform.java */
    /* renamed from: k1.f$a */
    public class a implements TypeEvaluator<Matrix> {
        @Override // android.animation.TypeEvaluator
        public final /* bridge */ /* synthetic */ Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* compiled from: ChangeImageTransform.java */
    /* renamed from: k1.f$b */
    public class b extends Property<ImageView, Matrix> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        public final void set(ImageView imageView, Matrix matrix) {
            C0937s.a(imageView, matrix);
        }
    }

    /* compiled from: ChangeImageTransform.java */
    /* renamed from: k1.f$c */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22853a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f22853a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22853a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ChangeImageTransform.java */
    /* renamed from: k1.f$d */
    public static class d extends AnimatorListenerAdapter implements AbstractC0919C.g {

        /* renamed from: a, reason: collision with root package name */
        public final ImageView f22854a;

        /* renamed from: b, reason: collision with root package name */
        public final Matrix f22855b;

        /* renamed from: c, reason: collision with root package name */
        public final Matrix f22856c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f22857d = true;

        public d(ImageView imageView, Matrix matrix, Matrix matrix2) {
            this.f22854a = imageView;
            this.f22855b = matrix;
            this.f22856c = matrix2;
        }

        @Override // k1.AbstractC0919C.g
        public final void c() {
            if (this.f22857d) {
                ImageView imageView = this.f22854a;
                imageView.setTag(R.id.transition_image_transform, this.f22855b);
                C0937s.a(imageView, this.f22856c);
            }
        }

        @Override // k1.AbstractC0919C.g
        public final void j() {
            ImageView imageView = this.f22854a;
            Matrix matrix = (Matrix) imageView.getTag(R.id.transition_image_transform);
            if (matrix != null) {
                C0937s.a(imageView, matrix);
                imageView.setTag(R.id.transition_image_transform, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z10) {
            this.f22857d = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            Matrix matrix = (Matrix) ((ObjectAnimator) animator).getAnimatedValue();
            ImageView imageView = this.f22854a;
            imageView.setTag(R.id.transition_image_transform, matrix);
            C0937s.a(imageView, this.f22856c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            ImageView imageView = this.f22854a;
            Matrix matrix = (Matrix) imageView.getTag(R.id.transition_image_transform);
            if (matrix != null) {
                C0937s.a(imageView, matrix);
                imageView.setTag(R.id.transition_image_transform, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z10) {
            this.f22857d = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f22857d = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.f22857d = false;
        }

        @Override // k1.AbstractC0919C.g
        public final void a(AbstractC0919C abstractC0919C) {
        }

        @Override // k1.AbstractC0919C.g
        public final void e(AbstractC0919C abstractC0919C) {
        }

        @Override // k1.AbstractC0919C.g
        public final void i(AbstractC0919C abstractC0919C) {
        }
    }

    public static void T(L l10, boolean z10) {
        Matrix matrix;
        View view = l10.f22762b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            HashMap hashMap = l10.f22761a;
            hashMap.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Matrix matrix2 = z10 ? (Matrix) imageView.getTag(R.id.transition_image_transform) : null;
            if (matrix2 == null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                    matrix2 = new Matrix(imageView.getImageMatrix());
                } else {
                    int i = c.f22853a[imageView.getScaleType().ordinal()];
                    if (i == 1) {
                        Drawable drawable2 = imageView.getDrawable();
                        matrix = new Matrix();
                        matrix.postScale(imageView.getWidth() / drawable2.getIntrinsicWidth(), imageView.getHeight() / drawable2.getIntrinsicHeight());
                    } else if (i != 2) {
                        matrix2 = new Matrix(imageView.getImageMatrix());
                    } else {
                        Drawable drawable3 = imageView.getDrawable();
                        int intrinsicWidth = drawable3.getIntrinsicWidth();
                        float width = imageView.getWidth();
                        float f10 = intrinsicWidth;
                        int intrinsicHeight = drawable3.getIntrinsicHeight();
                        float height = imageView.getHeight();
                        float f11 = intrinsicHeight;
                        float max = Math.max(width / f10, height / f11);
                        int round = Math.round((width - (f10 * max)) / 2.0f);
                        int round2 = Math.round((height - (f11 * max)) / 2.0f);
                        matrix = new Matrix();
                        matrix.postScale(max, max);
                        matrix.postTranslate(round, round2);
                    }
                    matrix2 = matrix;
                }
            }
            hashMap.put("android:changeImageTransform:matrix", matrix2);
        }
    }

    @Override // k1.AbstractC0919C
    public final boolean A() {
        return true;
    }

    @Override // k1.AbstractC0919C
    public final void g(L l10) {
        T(l10, false);
    }

    @Override // k1.AbstractC0919C
    public final void j(L l10) {
        T(l10, true);
    }

    @Override // k1.AbstractC0919C
    public final Animator n(ViewGroup viewGroup, L l10, L l11) {
        if (l10 != null && l11 != null) {
            HashMap hashMap = l10.f22761a;
            Rect rect = (Rect) hashMap.get("android:changeImageTransform:bounds");
            HashMap hashMap2 = l11.f22761a;
            Rect rect2 = (Rect) hashMap2.get("android:changeImageTransform:bounds");
            if (rect != null && rect2 != null) {
                Matrix matrix = (Matrix) hashMap.get("android:changeImageTransform:matrix");
                Matrix matrix2 = (Matrix) hashMap2.get("android:changeImageTransform:matrix");
                boolean z10 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
                if (rect.equals(rect2) && z10) {
                    return null;
                }
                ImageView imageView = (ImageView) l11.f22762b;
                Drawable drawable = imageView.getDrawable();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                b bVar = f22852M;
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    a aVar = f22851L;
                    C0938t.a aVar2 = C0938t.f22918a;
                    return ObjectAnimator.ofObject(imageView, bVar, aVar, aVar2, aVar2);
                }
                if (matrix == null) {
                    matrix = C0938t.f22918a;
                }
                if (matrix2 == null) {
                    matrix2 = C0938t.f22918a;
                }
                bVar.getClass();
                C0937s.a(imageView, matrix);
                ObjectAnimator ofObject = ObjectAnimator.ofObject(imageView, bVar, new K.b(), matrix, matrix2);
                d dVar = new d(imageView, matrix, matrix2);
                ofObject.addListener(dVar);
                ofObject.addPauseListener(dVar);
                a(dVar);
                return ofObject;
            }
        }
        return null;
    }

    @Override // k1.AbstractC0919C
    public final String[] w() {
        return f22850K;
    }
}
