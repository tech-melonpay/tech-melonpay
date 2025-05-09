package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;

/* compiled from: FragmentLayoutInflaterFactory.java */
/* loaded from: classes.dex */
public final class m implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final FragmentManager f6872a;

    public m(FragmentManager fragmentManager) {
        this.f6872a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        t h9;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        FragmentManager fragmentManager = this.f6872a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, fragmentManager);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, M0.a.f2520a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                if (Fragment.class.isAssignableFrom(k.b(context.getClassLoader(), attributeValue))) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment F10 = resourceId != -1 ? fragmentManager.F(resourceId) : null;
                    if (F10 == null && string != null) {
                        F10 = fragmentManager.G(string);
                    }
                    if (F10 == null && id != -1) {
                        F10 = fragmentManager.F(id);
                    }
                    if (F10 == null) {
                        k L7 = fragmentManager.L();
                        context.getClassLoader();
                        F10 = L7.a(attributeValue);
                        F10.mFromLayout = true;
                        F10.mFragmentId = resourceId != 0 ? resourceId : id;
                        F10.mContainerId = id;
                        F10.mTag = string;
                        F10.mInLayout = true;
                        F10.mFragmentManager = fragmentManager;
                        l<?> lVar = fragmentManager.f6755x;
                        F10.mHost = lVar;
                        F10.onInflate(lVar.f6869b, attributeSet, F10.mSavedFragmentState);
                        h9 = fragmentManager.a(F10);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "Fragment " + F10 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (F10.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        F10.mInLayout = true;
                        F10.mFragmentManager = fragmentManager;
                        l<?> lVar2 = fragmentManager.f6755x;
                        F10.mHost = lVar2;
                        F10.onInflate(lVar2.f6869b, attributeSet, F10.mSavedFragmentState);
                        h9 = fragmentManager.h(F10);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "Retained Fragment " + F10 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    FragmentStrictMode.a aVar = FragmentStrictMode.f6888a;
                    FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(F10, "Attempting to use <fragment> tag to add fragment " + F10 + " to container " + viewGroup);
                    FragmentStrictMode.c(fragmentTagUsageViolation);
                    FragmentStrictMode.a a10 = FragmentStrictMode.a(F10);
                    if (a10.f6899a.contains(FragmentStrictMode.Flag.f6892d) && FragmentStrictMode.e(a10, F10.getClass(), FragmentTagUsageViolation.class)) {
                        FragmentStrictMode.b(a10, fragmentTagUsageViolation);
                    }
                    F10.mContainer = viewGroup;
                    h9.k();
                    h9.j();
                    View view2 = F10.mView;
                    if (view2 == null) {
                        throw new IllegalStateException(androidx.camera.core.n.a("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (F10.mView.getTag() == null) {
                        F10.mView.setTag(string);
                    }
                    F10.mView.addOnAttachStateChangeListener(new a(h9));
                    return F10.mView;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        return null;
    }

    /* compiled from: FragmentLayoutInflaterFactory.java */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f6873a;

        public a(t tVar) {
            this.f6873a = tVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            t tVar = this.f6873a;
            Fragment fragment = tVar.f6904c;
            tVar.k();
            SpecialEffectsController.i((ViewGroup) fragment.mView.getParent(), m.this.f6872a).h();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
