package x2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: BottomAppBar.java */
/* renamed from: x2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1586c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f30921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f30922b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f30923c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f30924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f30925e;

    public C1586c(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z10) {
        this.f30925e = bottomAppBar;
        this.f30922b = actionMenuView;
        this.f30923c = i;
        this.f30924d = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f30921a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f30921a) {
            return;
        }
        BottomAppBar bottomAppBar = this.f30925e;
        int i = bottomAppBar.f9136h0;
        boolean z10 = i != 0;
        if (i != 0) {
            bottomAppBar.f9136h0 = 0;
            bottomAppBar.getMenu().clear();
            bottomAppBar.m(i);
        }
        bottomAppBar.E(this.f30922b, this.f30923c, this.f30924d, z10);
    }
}
