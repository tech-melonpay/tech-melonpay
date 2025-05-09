package com.airbnb.epoxy;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;

/* compiled from: ModelGroupHolder.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/airbnb/epoxy/ViewStubData;", "", "Landroid/view/ViewGroup;", "viewGroup", "Landroid/view/ViewStub;", "viewStub", "", "position", "<init>", "(Landroid/view/ViewGroup;Landroid/view/ViewStub;I)V", "LO9/p;", "removeCurrentView", "()V", "Landroid/view/View;", Promotion.ACTION_VIEW, "", "useStubLayoutParams", "setView", "(Landroid/view/View;Z)V", "resetStub", "Landroid/view/ViewGroup;", "getViewGroup", "()Landroid/view/ViewGroup;", "Landroid/view/ViewStub;", "getViewStub", "()Landroid/view/ViewStub;", "I", "getPosition", "()I", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ViewStubData {
    private final int position;
    private final ViewGroup viewGroup;
    private final ViewStub viewStub;

    public ViewStubData(ViewGroup viewGroup, ViewStub viewStub, int i) {
        this.viewGroup = viewGroup;
        this.viewStub = viewStub;
        this.position = i;
    }

    private final void removeCurrentView() {
        View childAt = this.viewGroup.getChildAt(this.position);
        if (childAt != null) {
            this.viewGroup.removeView(childAt);
        } else {
            throw new IllegalStateException("No view exists at position " + this.position);
        }
    }

    public final int getPosition() {
        return this.position;
    }

    public final ViewGroup getViewGroup() {
        return this.viewGroup;
    }

    public final ViewStub getViewStub() {
        return this.viewStub;
    }

    public final void resetStub() {
        removeCurrentView();
        this.viewGroup.addView(this.viewStub, this.position);
    }

    public final void setView(View view, boolean useStubLayoutParams) {
        removeCurrentView();
        int inflatedId = this.viewStub.getInflatedId();
        if (inflatedId != -1) {
            view.setId(inflatedId);
        }
        if (useStubLayoutParams) {
            this.viewGroup.addView(view, this.position, this.viewStub.getLayoutParams());
        } else {
            this.viewGroup.addView(view, this.position);
        }
    }
}
